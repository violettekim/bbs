package mmms.member.db;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {

		}

	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {

		}

	}

}