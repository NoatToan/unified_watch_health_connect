package com.xiaomi.fitness.migration.weight.v2;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.bfr;
import defpackage.iaq;
import defpackage.ow3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({iaq.class})
@Database(entities = {WeightItemV2.class}, version = 1)
public abstract class WeightDataDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeightDataDatabase f12449a;

    public static WeightDataDatabase g(Context context) {
        synchronized (WeightDataDatabase.class) {
            try {
                if (!context.getDatabasePath("measure_data").exists()) {
                    return null;
                }
                Context safeContext = UIUtils.getSafeContext(context);
                try {
                    WeightDataDatabase weightDataDatabaseH = h(safeContext);
                    weightDataDatabaseH.getOpenHelper().getReadableDatabase();
                    return weightDataDatabaseH;
                } catch (Exception e) {
                    safeContext.deleteDatabase("measure_data");
                    FitnessLogUtils.e("WeightDataDatabase", "get open db fail, create new: %s", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static WeightDataDatabase h(Context context) {
        try {
            String strValueOf = String.valueOf(1116227125);
            Charset charset = StandardCharsets.UTF_8;
            return (WeightDataDatabase) Room.databaseBuilder(UIUtils.getSafeContext(context), WeightDataDatabase.class, "measure_data").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().b(strValueOf.getBytes(charset)).a("passphrase_2019110".getBytes(charset)))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create weightinfo db fail", e);
        }
    }

    public static WeightDataDatabase i(Context context) {
        WeightDataDatabase weightDataDatabase = f12449a;
        if (weightDataDatabase != null) {
            return weightDataDatabase;
        }
        synchronized (WeightDataDatabase.class) {
            try {
                WeightDataDatabase weightDataDatabase2 = f12449a;
                if (weightDataDatabase2 != null) {
                    return weightDataDatabase2;
                }
                WeightDataDatabase weightDataDatabaseG = g(context);
                f12449a = weightDataDatabaseG;
                return weightDataDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract bfr j();
}
