package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.miui.tsmclient.util.DoorCardConstants;
import com.xiaomi.onetrack.util.ab;
import com.xiaomi.onetrack.util.n;
import com.xiaomi.onetrack.util.p;
import com.xiaomi.passport.ui.utils.OsHelper;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f13961a = "b";

    public enum a {
        asus("ASUS"),
        huawei("HUAWEI"),
        lenovo("LENOVO"),
        motolora("MOTOLORA"),
        meizu("MEIZU"),
        oppo(OsHelper.ROM_OPPO),
        samsung("SAMSUNG"),
        numbia("NUBIA"),
        vivo(OsHelper.ROM_VIVO),
        xiaomi(DoorCardConstants.PARTNER_ID),
        redmi("REDMI"),
        blackshark("BLACKSHARK"),
        oneplus("ONEPLUS"),
        zte("ZTE"),
        freemeos("FERRMEOS"),
        ssui("SSUI");

        public final String q;

        a(String str) {
            this.q = str;
        }

        public static a b(String str) {
            for (a aVar : values()) {
                if (aVar.q.equals(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    private static String c() {
        return Build.MANUFACTURER.toUpperCase();
    }

    public String a(Context context) {
        try {
            return a(context, c());
        } catch (Exception e) {
            p.a(f13961a, e.getMessage());
            return "";
        }
    }

    public boolean b() {
        String strA = ab.a("ro.ssui.product");
        return (TextUtils.isEmpty(strA) || strA.equalsIgnoreCase("unknown")) ? false : true;
    }

    public String a(Context context, String str) throws Exception {
        a aVarB = a.b(str);
        if (a()) {
            aVarB = a.freemeos;
        }
        if (b()) {
            aVarB = a.ssui;
        }
        if (aVarB != null) {
            switch (c.f13966a[aVarB.ordinal()]) {
                case 1:
                    return new com.xiaomi.onetrack.util.oaid.helpers.a().a(context);
                case 2:
                    return new d().a(context);
                case 3:
                case 4:
                    return new e().a(context);
                case 5:
                    return new f().a(context);
                case 6:
                    return new j().a(context);
                case 7:
                    return new k().a(context);
                case 8:
                    return new h().a(context);
                case 9:
                    return new l().a(context);
                case 10:
                case 11:
                case 12:
                    return n.b(context);
                case 13:
                    return new i().a(context);
                case 14:
                case 15:
                case 16:
                    return new m().a(context);
                default:
                    return "";
            }
        }
        throw new Exception(String.format("undefined oaid method of manufacturer %s", str));
    }

    public boolean a() {
        String strA = ab.a("ro.build.freeme.label");
        return !TextUtils.isEmpty(strA) && strA.equalsIgnoreCase("FREEMEOS");
    }
}
