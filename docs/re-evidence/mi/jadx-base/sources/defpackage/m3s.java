package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.passport.sim.SIMInfo;

/* JADX INFO: loaded from: classes11.dex */
public class m3s extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25727a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f25728b = new Object();
    public static final String[] c = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", SIMInfo.SIM_INFO_TYPE_IMSI, "TEXT"};

    public m3s(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f25727a);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i = 0;
        while (true) {
            String[] strArr = c;
            if (i >= strArr.length - 1) {
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
                return;
            }
            if (i != 0) {
                sb.append(",");
            }
            sb.append(strArr[i]);
            sb.append(" ");
            sb.append(strArr[i + 1]);
            i += 2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f25728b) {
            try {
                a(sQLiteDatabase);
            } catch (SQLException e) {
                x9s.s(e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
