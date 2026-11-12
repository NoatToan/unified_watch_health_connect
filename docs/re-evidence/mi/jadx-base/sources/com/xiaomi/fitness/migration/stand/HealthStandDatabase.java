package com.xiaomi.fitness.migration.stand;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.iao;
import defpackage.iw3;
import defpackage.jao;
import defpackage.ow3;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {iao.class}, version = 1)
public abstract class HealthStandDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HealthStandDatabase f12440a;

    public static HealthStandDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthStandDatabase) Room.databaseBuilder(context, HealthStandDatabase.class, "health_stand").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(131700346).getBytes()).a("2020-04-13".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health stand database fail", e);
        }
    }

    public static HealthStandDatabase h(Context context) {
        HealthStandDatabase healthStandDatabase = f12440a;
        if (healthStandDatabase != null) {
            return healthStandDatabase;
        }
        synchronized (HealthStandDatabase.class) {
            try {
                HealthStandDatabase healthStandDatabase2 = f12440a;
                if (healthStandDatabase2 != null) {
                    return healthStandDatabase2;
                }
                HealthStandDatabase healthStandDatabaseG = g(UIUtils.getSafeContext(context));
                f12440a = healthStandDatabaseG;
                return healthStandDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract jao i();
}
