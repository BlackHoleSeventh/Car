import java.util.Scanner;

public class Car {
    int price;
    int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public static void main(String[] args) {

        KeChe k = new KeChe();
        HuoChe h = new HuoChe();
        k.setPrice(200);
        k.setRen(20);
        h.setDun(7);
        h.setPrice(300);
        k.message();
        h.message();
        System.out.println("两类车共5辆");
        System.out.println("请按格式输入租车数量，例：客车数，货车数");
        String s;
        Scanner sc = new Scanner(System.in);
        while (true) {
            s = sc.nextLine();
            Integer ke, huo;
            try {
                ke = Integer.parseInt(s.split(",")[0]);
                huo = Integer.parseInt(s.split(",")[1]);
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入");
                continue;
            }
            //   System.out.println(ke);
            //   System.out.println(huo);

            if (ke + huo > 5) {
                System.out.println("数量超出现有车数，请重新输入");
            } else {
                System.out.println("请按格式输入租车天数，例：客车天数，货车天数");
                while (true) {
                    String ss = sc.nextLine();
                    Integer keday, huoday;
                    try {
                        keday = Integer.parseInt(ss.split(",")[0]);
                        huoday = Integer.parseInt(ss.split(",")[1]);
                    } catch (Exception e) {
                        System.out.println("输入错误，请重新输入");
                        continue;
                    }
                    //  System.out.println(keday);
                    //  System.out.println(huoday);

                    System.out.println("客车数：" + ke + " 天数： " + keday + " 单价：" + k.getPrice());
                    System.out.println("货车数：" + huo + " 天数： " + huoday + " 单价：" + h.getPrice());

                    int zong = keday * ke * k.getPrice() + huoday * huo * h.getPrice();
                    System.out.println("总金额为：" + zong + "元");
                    break;

                }
                break;
            }
        }

    }
}

class KeChe extends Car {
    int ren;


    public int getRen() {
        return ren;
    }


    public void setRen(int ren) {
        this.ren = ren;
    }


    protected void message() {

        System.out.println("客车" + price + "元/天，" + "载" + ren + "人");
    }
}

class HuoChe extends Car {
    int dun;

    public int getDun() {
        return dun;
    }

    public void setDun(int dun) {
        this.dun = dun;
    }


    protected void message() {
        System.out.println("货车" + price + "元/天，" + "载" + dun + "吨货");
    }
}