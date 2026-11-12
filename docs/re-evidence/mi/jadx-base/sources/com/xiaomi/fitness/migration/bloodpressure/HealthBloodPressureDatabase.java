package com.xiaomi.fitness.migration.bloodpressure;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.az2;
import defpackage.iw3;
import defpackage.ow3;
import defpackage.wz2;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {wz2.class}, version = 1)
public abstract class HealthBloodPressureDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HealthBloodPressureDatabase f12406a;

    public static HealthBloodPressureDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthBloodPressureDatabase) Room.databaseBuilder(context, HealthBloodPressureDatabase.class, "health_blood_pressure").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(420062535).getBytes()).a("2020-6-10".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health blood pressure database fail", e);
        }
    }

    public static HealthBloodPressureDatabase i(Context context) {
        HealthBloodPressureDatabase healthBloodPressureDatabase = f12406a;
        if (healthBloodPressureDatabase != null) {
            return healthBloodPressureDatabase;
        }
        synchronized (HealthBloodPressureDatabase.class) {
            try {
                HealthBloodPressureDatabase healthBloodPressureDatabase2 = f12406a;
                if (healthBloodPressureDatabase2 != null) {
                    return healthBloodPressureDatabase2;
                }
                HealthBloodPressureDatabase healthBloodPressureDatabaseG = g(UIUtils.getSafeContext(context));
                f12406a = healthBloodPressureDatabaseG;
                return healthBloodPressureDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract az2 h();
}
