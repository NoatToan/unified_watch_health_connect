package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ehh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16647a = ppe.i("PackageManagerHelper");

    public static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static boolean b(int i, boolean z) {
        if (i == 0) {
            return z;
        }
        return i == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z) {
        try {
            if (z == b(a(context, cls.getName()), false)) {
                ppe.e().a(f16647a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            ppe ppeVarE = ppe.e();
            String str = f16647a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            ppeVarE.a(str, sb.toString());
        } catch (Exception e) {
            ppe ppeVarE2 = ppe.e();
            String str2 = f16647a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            ppeVarE2.b(str2, sb2.toString(), e);
        }
    }
}
