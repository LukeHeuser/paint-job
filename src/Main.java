public class Main {
    public static void main(String[] args) {
        // test cases
        System.out.println(getBucketCount(10.5,3,4.1,2));
        System.out.println(getBucketCount(25,7,16.5,3));
        System.out.println(getBucketCount(9,8,5.6,1));
        System.out.println(getBucketCount(7.86,2.8,9.8,2));
        System.out.println(getBucketCount(3,3,8.5,0));
        System.out.println(getBucketCount(3,3,8.5,0));
        System.out.println(getBucketCount(57,72,27,1));

        System.out.println(getBucketCount(16,3,4.1));
        System.out.println(getBucketCount(195,24,30.5));
        System.out.println(getBucketCount(17,9.5,60));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double remainingArea = area - (extraBuckets * areaPerBucket);

        return getBucketCount(remainingArea,areaPerBucket); // calls the getBucketCount method
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return getBucketCount(area,areaPerBucket); // calls the getBucketCount method
    }

    public static int getBucketCount(double area, double areaPerBucket) { // Calculates amount of buckets needed
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int)Math.ceil(area / areaPerBucket); // Casts double data into an integer.

    }

}
