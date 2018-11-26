public class Run extends ScreenCap {

    public static void main(String[] args) throws Exception {


        String uri [] = {"http://www.excellus.com","http://www.univerahealthcare.com/wps/portal/uv/"};

        for (i=0;i<uri.length;i++){


            long start= System.currentTimeMillis();
            runApp(uri,"firefox");
            captureScreen();
            Thread.sleep(4000);
            ScreenCap.capture();
            Thread.sleep(2000);
            quit("firefox");

            long end = System.currentTimeMillis();
            System.out.println(end - start);


        }



    }



}
