#include <iostream>
#include "Mother.h"
#include "Daughter.h"
using namespace std;

Mother::Mother()
{
    cout << "This is the mother constructor" << endl;
}

Mother::~Mother()
{
    cout << "This is the mother destructor" << endl;
}
