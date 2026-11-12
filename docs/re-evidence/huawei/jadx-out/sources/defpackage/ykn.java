package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.repository.AuthInfoRepositoryImpl;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ykn extends SQLiteOpenHelper {
    private static Context d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f53591b;
    private HandlerThread e;

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ykn f53593c = new ykn(ykn.d);
    }

    private ykn(Context context) {
        super(context, "WearEngine.db", (SQLiteDatabase.CursorFactory) null, 102);
        HandlerThread handlerThread = new HandlerThread("WearEngineSqLiteOpenHelperThread");
        this.e = handlerThread;
        handlerThread.start();
        Looper looper = this.e.getLooper();
        if (looper != null) {
            this.f53591b = new Handler(looper);
        }
    }

    public static ykn d(Context context) {
        if (context == null) {
            return b.f53593c;
        }
        d = context.getApplicationContext();
        return b.f53593c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        yit.a("WearEngineSqLiteOpenHelper", "onCreate DataBase");
        if (sQLiteDatabase == null) {
            yit.b("WearEngineSqLiteOpenHelper", "onCreate db is null");
            return;
        }
        sQLiteDatabase.execSQL(ykk.d());
        sQLiteDatabase.execSQL(yki.e());
        sQLiteDatabase.execSQL(yko.d());
        sQLiteDatabase.execSQL(ykp.d());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        yit.a("WearEngineSqLiteOpenHelper", "onUpgrade DataBase oldVersion=" + i + " newVersion=" + i2);
        if (i2 <= 101) {
            return;
        }
        b(sQLiteDatabase);
    }

    private void b(final SQLiteDatabase sQLiteDatabase) {
        Runnable runnable = new Runnable() { // from class: ykn.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ykn.this.a(sQLiteDatabase);
                } catch (Exception unused) {
                    yit.b("WearEngineSqLiteOpenHelper", "onUpgrade Exception");
                }
            }
        };
        Handler handler = this.f53591b;
        if (handler != null) {
            handler.postDelayed(runnable, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase) {
        yit.a("WearEngineSqLiteOpenHelper", "updateAuthInfo entry");
        if (sQLiteDatabase == null) {
            yit.c("WearEngineSqLiteOpenHelper", "updateAuthInfo db == null");
            return;
        }
        List<AuthInfo> authInfo = AuthInfoRepositoryImpl.parseAuthInfo(d, sQLiteDatabase.query("tb_wear_engine_auth_info", ykk.c(), null, null, null, null, null));
        if (authInfo.isEmpty()) {
            yit.c("WearEngineSqLiteOpenHelper", "updateAuthInfo authInfoList isEmpty");
            return;
        }
        for (AuthInfo authInfo2 : authInfo) {
            ContentValues contentValuesBuildAuthInfoContentValues = AuthInfoRepositoryImpl.buildAuthInfoContentValues(authInfo2);
            if (contentValuesBuildAuthInfoContentValues != null) {
                sQLiteDatabase.update("tb_wear_engine_auth_info", contentValuesBuildAuthInfoContentValues, "key =? ", new String[]{authInfo2.getKey()});
            }
        }
    }
}
