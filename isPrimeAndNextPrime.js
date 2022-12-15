const x=110

function checkIsPrime(no){
    if(no<=1){
        return false;
    }
    
    if(no==2 || no==3 ){
       return true;
    }
    
    if(no%2==0 || no%3==0){
        return false;
    }
    
    for(var i=5;i*i<=no;i=i+6){
        if(no%i==0 || no%(i+2)==0){
            return  false;
           
        }
    }
    return true;
}

var final=checkIsPrime(x);
console.log(x,final);

var X=x;
final=false;

while(final!=true){
    X++;
    final=checkIsPrime(X);
}
console.log("Next prime is ",X)
console.log("difference is", (X-x))
