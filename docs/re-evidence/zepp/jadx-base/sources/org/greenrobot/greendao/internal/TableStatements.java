package org.greenrobot.greendao.internal;

import androidx.exifinterface.media.ExifInterface;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

/* JADX INFO: loaded from: classes23.dex */
public class TableStatements {
    private final Database a;
    private final String b;
    private final String[] c;
    private final String[] d;
    private DatabaseStatement e;
    private DatabaseStatement f;
    private DatabaseStatement g;
    private DatabaseStatement h;
    private DatabaseStatement i;
    private volatile String j;
    private volatile String k;
    private volatile String l;
    private volatile String m;

    public TableStatements(Database database, String str, String[] strArr, String[] strArr2) {
        this.a = database;
        this.b = str;
        this.c = strArr;
        this.d = strArr2;
    }

    public DatabaseStatement getCountStatement() {
        if (this.i == null) {
            this.i = this.a.compileStatement(SqlUtils.createSqlCount(this.b));
        }
        return this.i;
    }

    public DatabaseStatement getDeleteStatement() {
        if (this.h == null) {
            DatabaseStatement databaseStatementCompileStatement = this.a.compileStatement(SqlUtils.createSqlDelete(this.b, this.d));
            synchronized (this) {
                if (this.h == null) {
                    this.h = databaseStatementCompileStatement;
                }
            }
            if (this.h != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.h;
    }

    public DatabaseStatement getInsertOrReplaceStatement() {
        if (this.f == null) {
            DatabaseStatement databaseStatementCompileStatement = this.a.compileStatement(SqlUtils.createSqlInsert("INSERT OR REPLACE INTO ", this.b, this.c));
            synchronized (this) {
                if (this.f == null) {
                    this.f = databaseStatementCompileStatement;
                }
            }
            if (this.f != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.f;
    }

    public DatabaseStatement getInsertStatement() {
        if (this.e == null) {
            DatabaseStatement databaseStatementCompileStatement = this.a.compileStatement(SqlUtils.createSqlInsert("INSERT INTO ", this.b, this.c));
            synchronized (this) {
                if (this.e == null) {
                    this.e = databaseStatementCompileStatement;
                }
            }
            if (this.e != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.e;
    }

    public String getSelectAll() {
        if (this.j == null) {
            this.j = SqlUtils.createSqlSelect(this.b, ExifInterface.GPS_DIRECTION_TRUE, this.c, false);
        }
        return this.j;
    }

    public String getSelectByKey() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder(getSelectAll());
            sb.append("WHERE ");
            SqlUtils.appendColumnsEqValue(sb, ExifInterface.GPS_DIRECTION_TRUE, this.d);
            this.k = sb.toString();
        }
        return this.k;
    }

    public String getSelectByRowId() {
        if (this.l == null) {
            this.l = getSelectAll() + "WHERE ROWID=?";
        }
        return this.l;
    }

    public String getSelectKeys() {
        if (this.m == null) {
            this.m = SqlUtils.createSqlSelect(this.b, ExifInterface.GPS_DIRECTION_TRUE, this.d, false);
        }
        return this.m;
    }

    public DatabaseStatement getUpdateStatement() {
        if (this.g == null) {
            DatabaseStatement databaseStatementCompileStatement = this.a.compileStatement(SqlUtils.createSqlUpdate(this.b, this.c, this.d));
            synchronized (this) {
                if (this.g == null) {
                    this.g = databaseStatementCompileStatement;
                }
            }
            if (this.g != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.g;
    }
}
