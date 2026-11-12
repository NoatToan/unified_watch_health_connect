package com.xiaomi.fitness.migration.hearing.headset;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.iw3;
import defpackage.ow3;
import defpackage.slb;
import defpackage.xlb;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {xlb.class}, version = 1)
public abstract class HealthHeadSetDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HealthHeadSetDatabase f12421a;

    public static HealthHeadSetDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthHeadSetDatabase) Room.databaseBuilder(context, HealthHeadSetDatabase.class, "health_head_set").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(448661932).getBytes()).a("2021-5-26".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            FitnessLogUtils.e("DB_Trans", "create health headset database fail", e);
            return null;
        }
    }

    public static HealthHeadSetDatabase i(Context context) {
        HealthHeadSetDatabase healthHeadSetDatabase = f12421a;
        if (healthHeadSetDatabase != null) {
            return healthHeadSetDatabase;
        }
        synchronized (HealthHeadSetDatabase.class) {
            try {
                HealthHeadSetDatabase healthHeadSetDatabase2 = f12421a;
                if (healthHeadSetDatabase2 != null) {
                    return healthHeadSetDatabase2;
                }
                HealthHeadSetDatabase healthHeadSetDatabaseG = g(UIUtils.getSafeContext(context));
                f12421a = healthHeadSetDatabaseG;
                return healthHeadSetDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract slb h();
}
