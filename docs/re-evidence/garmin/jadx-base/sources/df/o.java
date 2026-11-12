package df;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class o {
    static {
        ue.u.b("PackageManagerHelper");
    }

    private o() {
    }

    public static void a(Context context, Class<?> cls, boolean z14) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z15 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z15 = true;
            }
            if (z14 != z15) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z14 ? 1 : 2, 1);
                ue.u.a().getClass();
            } else {
                ue.u uVarA = ue.u.a();
                "Skipping component enablement for ".concat(cls.getName());
                uVarA.getClass();
            }
        } catch (Exception unused) {
            ue.u.a().getClass();
        }
    }
}
