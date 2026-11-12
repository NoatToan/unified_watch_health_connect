package defpackage;

import android.text.TextUtils;
import com.huawei.health.ecologydevice.manager.ResourceManager;

/* JADX INFO: loaded from: classes7.dex */
public class ect {
    public static boolean c(elh elhVar) {
        return elhVar != null && elhVar.v().c() == 8;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c(ResourceManager.c().d(str));
    }
}
