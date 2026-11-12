package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.ig;
import com.xiaomi.push.ja;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class o7s {
    public static void b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j = sharedPreferences.getLong("last_sync_info", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jA = vas.d(context).a(ig.SyncInfoFrequency.a(), 1209600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        } else if (Math.abs(jCurrentTimeMillis - j) > jA) {
            d(context, true);
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        }
    }

    public static void c(Context context, ja jaVar) {
        x9s.o("need to update local info with: " + jaVar.m763a());
        String str = jaVar.m763a().get("accept_time");
        if (str != null) {
            b.M(context);
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length == 2) {
                b.d(context, strArrSplit[0], strArrSplit[1]);
                if ("00:00".equals(strArrSplit[0]) && "00:00".equals(strArrSplit[1])) {
                    bas.c(context).j(true);
                } else {
                    bas.c(context).j(false);
                }
            }
        }
        String str2 = jaVar.m763a().get("aliases");
        if (str2 != null) {
            b.Q(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(",")) {
                    b.f(context, str3);
                }
            }
        }
        String str4 = jaVar.m763a().get("topics");
        if (str4 != null) {
            b.R(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(",")) {
                    b.i(context, str5);
                }
            }
        }
        String str6 = jaVar.m763a().get("user_accounts");
        if (str6 != null) {
            b.P(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(",")) {
                b.e(context, str7);
            }
        }
    }

    public static void d(Context context, boolean z) {
        k5s.a(context).g(new u7s(context, z));
    }

    public static String f(List<String> list) {
        String strB = qcs.b(g(list));
        return (TextUtils.isEmpty(strB) || strB.length() <= 4) ? "" : strB.substring(0, 4).toLowerCase();
    }

    public static String g(List<String> list) {
        String str = "";
        if (m4s.a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + ",";
            }
            str = str + str2;
        }
        return str;
    }
}
