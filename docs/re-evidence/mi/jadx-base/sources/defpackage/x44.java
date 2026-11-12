package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes6.dex */
public class x44 {
    public static int a(int i) {
        try {
            return AppUtil.getApp().getResources().getColor(i);
        } catch (Exception e) {
            Logger.e("ColorUtil", "getResourcesColor error, " + e.getMessage());
            return 16777215;
        }
    }
}
