package com.huawei.profile.datamanager;

import android.content.Context;
import androidx.media3.common.C;
import com.huawei.profile.utils.SensitiveUtil;
import com.huawei.profile.utils.logger.DsLog;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes15.dex */
public class DatabaseFactory {
    private static final String PROFILE_PACKAGE_NAME = "com.huawei.profile";
    private static final String TAG = "DatabaseFactory";
    private static final int WAIT_LOCK_TIME = 3000;
    private static final Lock DATABASE_LOCK = new ReentrantLock();
    private static AbstractDatabase database = null;

    public interface DatabaseCallback<T> {
        void accept(T t);
    }

    private DatabaseFactory() {
    }

    public static AbstractDatabase generateDb(Context context) {
        return generateDb(context, null);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0087: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:35:0x0087 */
    public static AbstractDatabase generateDb(Context context, DatabaseCallback<AbstractDatabase> databaseCallback) throws Throwable {
        boolean z;
        boolean zTryLock;
        boolean z2 = false;
        try {
            if (context == null) {
                DsLog.et(TAG, "generateDb failed context is null.", new Object[0]);
                return new FalseDatabase();
            }
            try {
                Lock lock = DATABASE_LOCK;
                zTryLock = lock.tryLock(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
                try {
                    if (!zTryLock) {
                        DsLog.wt(TAG, "get db lock timeout", new Object[0]);
                        if (zTryLock) {
                            lock.unlock();
                        }
                        return new FalseDatabase();
                    }
                    AbstractDatabase abstractDatabase = database;
                    if (abstractDatabase != null) {
                        if (zTryLock) {
                            lock.unlock();
                        }
                        return abstractDatabase;
                    }
                    if (isProfileApk(context)) {
                        database = generateDbByName(context, "com.huawei.profile.datamanager.ProfileSQLiteDatabase");
                    } else {
                        database = generateDbByName(context, "com.huawei.profile.datamanager.SQLiteDatabaseSdk");
                    }
                    if (databaseCallback != null) {
                        databaseCallback.accept(database);
                    }
                    AbstractDatabase abstractDatabase2 = database;
                    if (zTryLock) {
                        lock.unlock();
                    }
                    return abstractDatabase2;
                } catch (IllegalMonitorStateException | InterruptedException unused) {
                    DsLog.et(TAG, " thread was interrupted: " + Thread.currentThread().getName(), new Object[0]);
                    if (zTryLock) {
                        DATABASE_LOCK.unlock();
                    }
                }
            } catch (IllegalMonitorStateException | InterruptedException unused2) {
                zTryLock = false;
            } catch (Throwable th) {
                th = th;
                if (z2) {
                    DATABASE_LOCK.unlock();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
        }
    }

    private static boolean isProfileApk(Context context) {
        if (!"com.huawei.profile".equals(context.getPackageName())) {
            return false;
        }
        DsLog.it(TAG, "package name is profile, profile may installed", new Object[0]);
        return true;
    }

    private static AbstractDatabase generateDbByName(Context context, String str) {
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(Context.class).newInstance(context);
            if (objNewInstance instanceof AbstractDatabase) {
                return (AbstractDatabase) objNewInstance;
            }
        } catch (ClassNotFoundException e) {
            DsLog.et(TAG, " ClassNotFoundException: " + SensitiveUtil.getMessage(e), new Object[0]);
        } catch (IllegalAccessException e2) {
            DsLog.et(TAG, " IllegalAccessException: " + SensitiveUtil.getMessage(e2), new Object[0]);
        } catch (IllegalArgumentException e3) {
            DsLog.et(TAG, " IllegalArgumentException: " + SensitiveUtil.getMessage(e3), new Object[0]);
        } catch (InstantiationException e4) {
            DsLog.et(TAG, " InstantiationException: " + SensitiveUtil.getMessage(e4), new Object[0]);
        } catch (NoSuchMethodException e5) {
            DsLog.et(TAG, " NoSuchMethodException: " + SensitiveUtil.getMessage(e5), new Object[0]);
        } catch (InvocationTargetException e6) {
            DsLog.et(TAG, " InvocationTargetException: " + SensitiveUtil.getMessage(e6), new Object[0]);
        }
        return new FalseDatabase();
    }
}
