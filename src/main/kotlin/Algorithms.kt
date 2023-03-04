class Algorithms {
    //Given an array of ints, return true if the array is length 1 or more, and the first element and the
    // last element are equal.
    fun isfirstAndLastElementEqual(arr: Array<Int>):Boolean{
        var arrLength = arr.size;
        var first_element = arr[0];
        var last_element = arr[arrLength - 1];

        if(arrLength >= 1 && first_element == last_element) return true;

        return false
    }

    //Given an array of ints, return true if 6 appears as either the first or last element in the array.
    // The array will be length 1 or more.
    fun is6FirstorLastElement(arr: Array<Int>):Boolean{
        var arrLength = arr.size;
        var first_element = arr[0];
        var last_element = arr[arrLength - 1];

        if(arrLength >= 1 && (first_element == 6 || last_element == 6)) return true;

        return false
    }

    //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the
    // same last element. Both arrays will be length 1 or more.
    fun isFirstElementsorLastElementsEqual(arr1: Array<Int>, arr2: Array<Int>):Boolean{
        var arr1Length = arr1.size;
        var arr2Length = arr2.size;
        var arr1firstElement = arr1[0];
        var arr2firstElement = arr2[0]
        var arr1lastElement = arr1[arr1Length - 1];
        var arr2lastElement = arr2[arr2Length - 1];

        if(arr1Length >= 1 && arr2Length >= 1){
            if(arr1firstElement == arr2firstElement || arr1lastElement == arr2lastElement) return true
        }

        return false
    }

    //Given an array of ints length 3, return the sum of all the elements.
    fun sumOfAllElements(arr: Array<Int>):Int{
        var sum:Int = 0

        for(i in arr){
            sum += i
        }

        return  sum
    }

    //Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    fun rotateArrayLeft(arr: Array<Int>): String {
        var arrofint = mutableListOf<Int>();
        for(i in 1 until arr.size){
            arrofint.add(arr[i]);
        }
        arrofint.add(arr[0])
        return arrofint.toString();
    }


    //Given an array of ints length 3, return a new array with the elements in reverse order,
    // so {1, 2, 3} becomes {3, 2, 1}.
    fun reverseArray(arr: Array<Int>): String {
        var arrofint = mutableListOf<Int>();
        for(i in arr.size - 1 downTo  0){
            arrofint.add(arr[i]);
        }
        return arrofint.toString();
    }


    //Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    // and set all the other elements to be that value. Return the changed array.
    fun changeArrayElementsToMaxNumber(arr: Array<Int>): String {
        var firstelement = arr[0];
        var lastelement = arr[arr.size - 1];
        var arrofint = mutableListOf<Int>();
        for(element in arr){
            if(firstelement > lastelement) arrofint.add(firstelement) else arrofint.add(lastelement);
        }
        return arrofint.toString()
    }

    //Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
    // just sum up the elements that exist, returning 0 if the array is length 0.
    fun sumOfFirstAndLastElement(arr: Array<Int>): Int {
        if(arr.size == 1) return arr[0]

        var firstEl = arr[0];
        var secondEl = arr[1]


        return firstEl + secondEl
    }

    //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    fun middleElementsOfArray(arr1: Array<Int>, arr2: Array<Int>): String {
        var middle1 = (arr1.size + 1)/2;
        var middle2 = (arr2.size + 1)/2;

        var newarr = arrayOf(arr1[middle1 - 1], arr2[middle2 - 1])


        return newarr.contentToString();
    }

    //Given an array of ints, return a new array length 2 containing the first and last elements
    // from the original array. The original array will be length 1 or more.
    fun returnFirstAndLastElementofArr(arr: Array<Int>):String{
        var arrLength = arr.size;
        if(arrLength == 1) return "${arr[0]}"

        var firstelement = arr[0];
        var lastelement = arr[arrLength - 1];

        var newarr = arrayOf(firstelement, lastelement)

        return newarr.contentToString();
    }

    //Given an int array length 2, return true if it contains a 2 or a 3
    fun isContaining2or3(arr: Array<Int>):Boolean{
        if(arr.contains(2) || arr.contains(3)) return true

        return false
    }

    //Given an int array length 2, return true if it does not contain a 2 or 3.

    fun isNotContaining2or3(arr: Array<Int>):Boolean{
        if(!arr.contains(2) || !arr.contains(3)) return true

        return false
    }
}