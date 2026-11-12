package defpackage;

import android.app.Application;
import com.xiaomi.fitness.common.ManualItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.util.StressDataUtil;

/* JADX INFO: loaded from: classes10.dex */
public class c4f {
    public static int a(int i, ManualItem manualItem) {
        if (i == 4 || i == 7 || i == 13) {
            return manualItem.value;
        }
        return 0;
    }

    public static String b(int i, int i2) {
        Application application = ApplicationExtKt.getApplication();
        if (i2 != 4) {
            return i2 != 7 ? "" : StressDataUtil.getStressTypeNameAsValue(i);
        }
        return application.getString(c0j.V6);
    }
}
