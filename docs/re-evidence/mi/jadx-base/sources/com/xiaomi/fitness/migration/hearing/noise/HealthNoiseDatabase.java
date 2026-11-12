package com.xiaomi.fitness.migration.hearing.noise;

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
import defpackage.tvg;
import defpackage.yvg;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {yvg.class}, version = 1)
public abstract class HealthNoiseDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HealthNoiseDatabase f12424a;

    public static HealthNoiseDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthNoiseDatabase) Room.databaseBuilder(context, HealthNoiseDatabase.class, "health_noise").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(448661932).getBytes()).a("2021-5-26".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            FitnessLogUtils.e("DB_Trans", "create health noise database fail", e);
            return null;
        }
    }

    public static HealthNoiseDatabase h(Context context) {
        HealthNoiseDatabase healthNoiseDatabase = f12424a;
        if (healthNoiseDatabase != null) {
            return healthNoiseDatabase;
        }
        synchronized (HealthNoiseDatabase.class) {
            try {
                HealthNoiseDatabase healthNoiseDatabase2 = f12424a;
                if (healthNoiseDatabase2 != null) {
                    return healthNoiseDatabase2;
                }
                HealthNoiseDatabase healthNoiseDatabaseG = g(UIUtils.getSafeContext(context));
                f12424a = healthNoiseDatabaseG;
                return healthNoiseDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract tvg i();
}
