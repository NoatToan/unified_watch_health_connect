package com.xiaomi.fitness.migration.weight.v1;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import defpackage.iaq;
import defpackage.vuf;
import defpackage.xwf;
import defpackage.yeq;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({iaq.class})
@Database(entities = {xwf.class, vuf.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserDatabase f12446a;

    public static UserDatabase g(Context context) {
        return (UserDatabase) Room.databaseBuilder(UIUtils.getSafeContext(context), UserDatabase.class, SceneRecogBroadcastReceiver.FROM_USER).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
    }

    public static UserDatabase h(Context context) {
        UserDatabase userDatabase = f12446a;
        if (userDatabase != null) {
            return userDatabase;
        }
        synchronized (UserDatabase.class) {
            try {
                UserDatabase userDatabase2 = f12446a;
                if (userDatabase2 != null) {
                    return userDatabase2;
                }
                UserDatabase userDatabaseG = g(context);
                f12446a = userDatabaseG;
                return userDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract yeq i();
}
