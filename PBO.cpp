#include<iostream>
#include<iomanip>
using namespace std;
int main(){ 

char c;
do{
	system("cls");
	cout<<"+-------------------------------------+"<<endl;
	cout<<"+ Nama : Muhammad Dhiwa Rahma Fathani +"<<endl;
	cout<<"+ NIM  : 2200018250                   +"<<endl;
	cout<<"+ KELAS: F                            +"<<endl;
	cout<<"+-------------------------------------+"<<endl<<endl;
int baris, kolom, a,b;

	cout<<"CEK GANJIL GENAP "<<endl;
	cout<<"masukan bilangan: "; cin>> b;
	if (b % 2 == 0) {
   	   // Output
      cout << "Bilangan genap: " << b << endl;
   		 } else {
   	   // Output
    	  cout << "Bilangan ganjil: " << b << endl;
    	}
cout<< endl<<"ARRAY SATU "<<endl;
 	cout<<"masukan bilangan: "; cin>> a;
 	int arr1[a];
  	for (int i = 0; i < a; i++) {
    	// Input
    	cout<<"input array ["<<i<<"] : ";
    	cin >> arr1[i];
  		}
   		cout <<"[ ";
  		for (int i = 0; i < a; i++) {

    	cout <<arr1[i]<<" ";
  		}
  		cout <<" ]"<<endl;
//int array [baris] [kolom];
cout<< endl<<"ARRAY MULTI DIMENSI "<<endl;
	cout<<"masukan baris: "; cin>> baris;
	cout<<"masukan kolom: "; cin>> kolom;
		int array1 [baris] [kolom];
		cout<<endl<<"INPUT ARRAY 1"<<endl;
		for (int i=0;i<baris;i++) {
		for (int j=0;j<kolom;j++){
		cout<<"input array ["<<i<<"]["<<j<<"] : ";
		cin>>array1[i][j];
		}
		}
		cout<<endl<<"HASIL DARI INPUT 1"<<endl;
		for (int i=0;i<baris;i++) {
		for (int j=0;j<kolom;j++){
		cout<<setw(4)<<array1[i][j];
		}
		cout<<endl;
		}
		cout<<"INGIN mengulangi lagi(Y/N): "; cin>> c;
		}
while( c =='Y'| c =='y');{
	cout<<endl;
	cout<<"Terimakasih "<<endl;
}

}
