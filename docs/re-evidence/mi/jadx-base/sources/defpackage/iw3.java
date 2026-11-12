package defpackage;

import android.content.Context;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class iw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f22158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f22159b = {"health_blood_pressure", "health_exercise", "health_menstruate", "health_sleep", "health_stand", "health_weight", "sleep_db"};

    public static void a(Context context) {
        if (ow3.f().j() && !f22158a) {
            synchronized (iw3.class) {
                try {
                    if (f22158a) {
                        return;
                    }
                    for (String str : f22159b) {
                        context.deleteDatabase(str);
                        FitnessLogUtils.i("CipherDatabaseHelper", "del " + str);
                    }
                    f22158a = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
