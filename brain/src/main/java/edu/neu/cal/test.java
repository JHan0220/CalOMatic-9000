/*
 * @Author: Jiang Han
 * @Date: 2023-11-21 22:28:40
 * @Description: 一个可被随意修改的测试类也是主类
 */
package edu.neu.cal;

import edu.neu.cal.Connector.DBAccess;

public class test {
    public static void main(String[] args) {
        DBAccess myAccess = new DBAccess();
        myAccess.connectToDatabase();
        System.out.println(myAccess.readUsersData("name"));
        myAccess.close();
        // 注意，access 类应该只做数据库连接，查询数据应该由DAO层的类去完成，这里仅做演示和方便使用
    }
}
