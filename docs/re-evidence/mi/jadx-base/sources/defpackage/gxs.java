package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.mipush.sdk.ac;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.push.ix;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class gxs {
    public static int a() {
        Integer num = (Integer) zbs.f("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String b(Context context, d dVar) {
        return c(context, dVar, false);
    }

    public static synchronized String c(Context context, d dVar, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        if (z) {
            String string = sharedPreferences.getString("syncingToken", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String strD = d(dVar);
        if (TextUtils.isEmpty(strD)) {
            return "";
        }
        return sharedPreferences.getString(strD, "");
    }

    public static String d(d dVar) {
        int i = x0t.f38559a[dVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    public static HashMap<String, String> e(Context context, d dVar) {
        HashMap<String, String> map = new HashMap<>();
        int i = x0t.f38559a[dVar.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e) {
                x9s.D(e.toString());
            }
            string = new det.a(":", "~").a(CommonConstants.KEY_BRAND, ac.HUAWEI.name()).a("token", c(context, dVar, true)).a("package_name", context.getPackageName()).a(g.d, Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt("com.huawei.hms.client.appid") : -1)).toString();
        } else if (i == 2) {
            det.a aVarA = new det.a(":", "~").a(CommonConstants.KEY_BRAND, ac.FCM.name()).a("token", c(context, dVar, false)).a("package_name", context.getPackageName());
            int iA = a();
            if (iA != 0) {
                aVarA.a("version", Integer.valueOf(iA));
            } else {
                aVarA.a("version", 50708);
            }
            string = aVarA.toString();
        } else if (i == 3) {
            string = new det.a(":", "~").a(CommonConstants.KEY_BRAND, ac.OPPO.name()).a("token", c(context, dVar, true)).a("package_name", context.getPackageName()).toString();
        } else if (i == 4) {
            det.a aVarA2 = new det.a(":", "~").a(CommonConstants.KEY_BRAND, ac.VIVO.name()).a("token", c(context, dVar, true)).a("package_name", context.getPackageName());
            int iA2 = a();
            if (iA2 != 0) {
                aVarA2.a("version", Integer.valueOf(iA2));
            }
            string = aVarA2.toString();
        }
        map.put("RegInfo", string);
        return map;
    }

    public static void f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strD = d(d.ASSEMBLE_PUSH_HUAWEI);
        String strD2 = d(d.ASSEMBLE_PUSH_FCM);
        if (TextUtils.isEmpty(sharedPreferences.getString(strD, "")) || !TextUtils.isEmpty(sharedPreferences.getString(strD2, ""))) {
            return;
        }
        d6s.c(context).p(2, strD);
    }

    public static boolean g(Context context, d dVar) {
        if (z2t.b(dVar) != null) {
            return vas.d(context).m(z2t.b(dVar).a(), true);
        }
        return false;
    }

    public static boolean h(d dVar) {
        return dVar == d.ASSEMBLE_PUSH_FTOS || dVar == d.ASSEMBLE_PUSH_FCM;
    }

    public static boolean i(ix ixVar, d dVar) {
        if (ixVar == null || ixVar.m747a() == null || ixVar.m747a().m714a() == null) {
            return false;
        }
        return (dVar == d.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(ixVar.m747a().m714a().get("assemble_push_type"));
    }

    public static byte[] j(Context context, ix ixVar, d dVar) {
        if (i(ixVar, dVar)) {
            return mcs.c(b(context, dVar));
        }
        return null;
    }

    public static String k(d dVar) {
        return d(dVar) + "_version";
    }

    public static void l(Context context) {
        pns.e(context).a();
    }

    public static void m(Context context, d dVar, String str) {
        k5s.a(context).g(new kzs(str, context, dVar));
    }

    public static void n(Context context) {
        pns.e(context).b();
    }

    public static synchronized void p(Context context, d dVar, String str) {
        String strD = d(dVar);
        if (TextUtils.isEmpty(strD)) {
            x9s.o("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(strD, str).putString("last_check_token", bas.c(context).q());
        if (h(dVar)) {
            editorEdit.putInt(k(dVar), a());
        }
        editorEdit.putString("syncingToken", "");
        dct.a(editorEdit);
        x9s.o("ASSEMBLE_PUSH : update sp file success!  " + str);
    }
}
