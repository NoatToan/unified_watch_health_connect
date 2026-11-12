package com.xiaomi.fitness.migration.menstruation;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.aqf;
import defpackage.bqf;
import defpackage.iw3;
import defpackage.ow3;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {aqf.class}, version = 1)
public abstract class HealthMenstruationDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HealthMenstruationDatabase f12430a;

    public static class a extends RoomDatabase.Callback {
        @Override // androidx.room.RoomDatabase.Callback
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            super.onOpen(supportSQLiteDatabase);
            supportSQLiteDatabase.execSQL("UPDATE record_menstruate SET deleted = 1 WHERE status = 2");
        }

        public a() {
        }
    }

    public static HealthMenstruationDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthMenstruationDatabase) Room.databaseBuilder(context, HealthMenstruationDatabase.class, "health_menstruate").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(2082319842).getBytes()).a("2019-12-30".getBytes()))).addCallback(new a()).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health menstruation database fail", e);
        }
    }

    public static HealthMenstruationDatabase h(Context context) {
        HealthMenstruationDatabase healthMenstruationDatabase = f12430a;
        if (healthMenstruationDatabase != null) {
            return healthMenstruationDatabase;
        }
        synchronized (HealthMenstruationDatabase.class) {
            try {
                HealthMenstruationDatabase healthMenstruationDatabase2 = f12430a;
                if (healthMenstruationDatabase2 != null) {
                    return healthMenstruationDatabase2;
                }
                HealthMenstruationDatabase healthMenstruationDatabaseG = g(UIUtils.getSafeContext(context));
                f12430a = healthMenstruationDatabaseG;
                return healthMenstruationDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract bqf i();
}
