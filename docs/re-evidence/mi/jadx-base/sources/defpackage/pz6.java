package defpackage;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes6.dex */
public class pz6 {
    public static String a(int i) {
        return c(AppUtil.getApp(), i, 0);
    }

    public static String b(Context context, int i) {
        return c(context, i, 0);
    }

    public static String c(Context context, int i, int i2) {
        return d(context, i, i2, 2);
    }

    public static String d(Context context, int i, int i2, int i3) {
        float fE = i >= 1000 ? xr5.e(i3, (i * 1.0f) / 1000.0f) : 0.0f;
        if (i2 == 1) {
            return i >= 1000 ? context.getResources().getQuantityString(oyi.common_share_unit_kilometer_desc, xr5.j(fE), xr5.g(i3, fE)) : context.getResources().getQuantityString(oyi.common_share_unit_meter_desc, i, Integer.toString(i));
        }
        if (i2 != 2) {
            return i >= 1000 ? context.getResources().getQuantityString(oyi.common_unit_kilometer_desc_new, xr5.j(fE), xr5.g(i3, fE)) : context.getResources().getQuantityString(oyi.common_unit_meter_desc_new, i, Integer.toString(i));
        }
        return i >= 1000 ? context.getResources().getQuantityString(oyi.common_min_unit_meter_desc, xr5.j(fE), xr5.g(i3, fE)) : context.getResources().getQuantityString(oyi.common_min_unit_meter_desc, i, Integer.toString(i));
    }

    public static String e(int i) {
        if (i >= 1000) {
            return xr5.g(2, (i * 1.0f) / 1000.0f);
        }
        return i + "";
    }

    public static String f(int i, int i2) {
        if (i >= 1000) {
            return xr5.g(i2, (i * 1.0f) / 1000.0f);
        }
        return i + "";
    }

    public static String g(int i) {
        Application app = AppUtil.getApp();
        if (i < 1000) {
            return app.getResources().getQuantityString(oyi.n, i);
        }
        return app.getResources().getQuantityString(oyi.l, xr5.j(xr5.e(2, (i * 1.0f) / 1000.0f)));
    }

    public static String h(int i, boolean z) {
        Application app = AppUtil.getApp();
        if (i < 1000) {
            return z ? app.getResources().getQuantityString(oyi.f, i) : app.getResources().getQuantityString(oyi.n, i);
        }
        float fE = xr5.e(2, (i * 1.0f) / 1000.0f);
        return z ? app.getResources().getQuantityString(oyi.e, xr5.j(fE)) : app.getResources().getQuantityString(oyi.l, xr5.j(fE));
    }

    public static String i(int i) {
        Application app = AppUtil.getApp();
        if (i < 1000) {
            return app.getResources().getQuantityString(oyi.o, i);
        }
        return app.getResources().getQuantityString(oyi.m, xr5.j(xr5.e(2, (i * 1.0f) / 1000.0f)));
    }
}
