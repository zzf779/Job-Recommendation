package db_mysql;

public class MySQLDBUtil {
	
	private static final String INSTANCE = "zifan-instance.cuqs3l5shg0m.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "Zifan_database";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "Value!779";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
