package ch.qos.logback.classic.db;

import am.j;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;
import fb1.c;

/* JADX INFO: loaded from: classes7.dex */
public class SQLBuilder {
    public static String buildCreateExceptionTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb3.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        c.t(dBNameResolver, columnName, sb3, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.I;
        c.t(dBNameResolver, columnName2, sb3, " SMALLINT NOT NULL, ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb3.append(" VARCHAR(254) NOT NULL, PRIMARY KEY (");
        sb3.append(dBNameResolver.getColumnName(columnName));
        sb3.append(", ");
        sb3.append(dBNameResolver.getColumnName(columnName2));
        sb3.append("), FOREIGN KEY (");
        c.t(dBNameResolver, columnName, sb3, ") REFERENCES ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb3.append(" (");
        sb3.append(dBNameResolver.getColumnName(columnName));
        sb3.append(") )");
        return sb3.toString();
    }

    public static String buildCreateLoggingEventTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb3.append(" (");
        c.t(dBNameResolver, ColumnName.TIMESTMP, sb3, " BIGINT NOT NULL, ");
        c.t(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb3, " TEXT NOT NULL, ");
        c.t(dBNameResolver, ColumnName.LOGGER_NAME, sb3, " VARCHAR(254) NOT NULL, ");
        c.t(dBNameResolver, ColumnName.LEVEL_STRING, sb3, " VARCHAR(254) NOT NULL, ");
        c.t(dBNameResolver, ColumnName.THREAD_NAME, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.REFERENCE_FLAG, sb3, " SMALLINT, ");
        c.t(dBNameResolver, ColumnName.ARG0, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.ARG1, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.ARG2, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.ARG3, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.CALLER_FILENAME, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.CALLER_CLASS, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.CALLER_METHOD, sb3, " VARCHAR(254), ");
        c.t(dBNameResolver, ColumnName.CALLER_LINE, sb3, " CHAR(4), ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.EVENT_ID));
        sb3.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT)");
        return sb3.toString();
    }

    public static String buildCreatePropertyTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb3.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        c.t(dBNameResolver, columnName, sb3, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.MAPPED_KEY;
        c.t(dBNameResolver, columnName2, sb3, " VARCHAR(254) NOT NULL, ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb3.append(" VARCHAR(254) NOT NULL, PRIMARY KEY (");
        sb3.append(dBNameResolver.getColumnName(columnName));
        sb3.append(", ");
        sb3.append(dBNameResolver.getColumnName(columnName2));
        sb3.append("), FOREIGN KEY (");
        c.t(dBNameResolver, columnName, sb3, ") REFERENCES ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb3.append(" (");
        sb3.append(dBNameResolver.getColumnName(columnName));
        sb3.append(") )");
        return sb3.toString();
    }

    public static String buildDeleteExpiredLogsSQL(DBNameResolver dBNameResolver, long j8) {
        StringBuilder sb3 = new StringBuilder("DELETE FROM ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb3.append(" WHERE ");
        c.t(dBNameResolver, ColumnName.TIMESTMP, sb3, " <= ");
        return j.i(j8, ";", sb3);
    }

    public static String buildInsertExceptionSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("INSERT INTO ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb3.append(" (");
        c.t(dBNameResolver, ColumnName.EVENT_ID, sb3, ", ");
        c.t(dBNameResolver, ColumnName.I, sb3, ", ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb3.append(") VALUES (?, ?, ?)");
        return sb3.toString();
    }

    public static String buildInsertPropertiesSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("INSERT INTO ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb3.append(" (");
        c.t(dBNameResolver, ColumnName.EVENT_ID, sb3, ", ");
        c.t(dBNameResolver, ColumnName.MAPPED_KEY, sb3, ", ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb3.append(") VALUES (?, ?, ?)");
        return sb3.toString();
    }

    public static String buildInsertSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb3 = new StringBuilder("INSERT INTO ");
        sb3.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb3.append(" (");
        c.t(dBNameResolver, ColumnName.TIMESTMP, sb3, ", ");
        c.t(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb3, ", ");
        c.t(dBNameResolver, ColumnName.LOGGER_NAME, sb3, ", ");
        c.t(dBNameResolver, ColumnName.LEVEL_STRING, sb3, ", ");
        c.t(dBNameResolver, ColumnName.THREAD_NAME, sb3, ", ");
        c.t(dBNameResolver, ColumnName.REFERENCE_FLAG, sb3, ", ");
        c.t(dBNameResolver, ColumnName.ARG0, sb3, ", ");
        c.t(dBNameResolver, ColumnName.ARG1, sb3, ", ");
        c.t(dBNameResolver, ColumnName.ARG2, sb3, ", ");
        c.t(dBNameResolver, ColumnName.ARG3, sb3, ", ");
        c.t(dBNameResolver, ColumnName.CALLER_FILENAME, sb3, ", ");
        c.t(dBNameResolver, ColumnName.CALLER_CLASS, sb3, ", ");
        c.t(dBNameResolver, ColumnName.CALLER_METHOD, sb3, ", ");
        sb3.append(dBNameResolver.getColumnName(ColumnName.CALLER_LINE));
        sb3.append(") VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        return sb3.toString();
    }
}
