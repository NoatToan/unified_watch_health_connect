package defpackage;

import android.os.Build;
import com.huawei.health.awarenessdonate.AwarenessDonateApi;
import com.huawei.health.awarenessdonate.AwarenessDonateImpl;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class vft {
    public static void b() {
        if (!e()) {
            LogUtil.b("CeliaSuggestUtil", "skip donate force, not target user");
            return;
        }
        long jD = SharedPreferenceManager.d(AwarenessDonateImpl.AWARENESS_FEATURE_MODULE_ID, "diet_force_donate_time", -1L);
        if (jD > 0) {
            LogUtil.b("CeliaSuggestUtil", "skip donate force, already donated in: " + jD);
        } else {
            LogUtil.b("CeliaSuggestUtil", "donate force...");
            c(d());
            SharedPreferenceManager.c(AwarenessDonateImpl.AWARENESS_FEATURE_MODULE_ID, "diet_force_donate_time", System.currentTimeMillis());
        }
    }

    public static void c() {
        LogUtil.b("CeliaSuggestUtil", "donate after using diet diary...");
        c(a());
    }

    private static List<ddt.b> d() {
        ArrayList arrayList = new ArrayList();
        long jA = a(7, 30);
        long jA2 = a(8, 30);
        long jA3 = a(11, 30);
        long jA4 = a(13, 0);
        long jA5 = a(17, 30);
        long jA6 = a(19, 0);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            ArrayList arrayList2 = arrayList;
            long j = ((long) i) * 86400000;
            int i3 = i;
            long j2 = jA6;
            long j3 = jA;
            ddt.b bVar = new ddt.b(jA + j, jA2 + j);
            ddt.b bVar2 = new ddt.b(jA3 + j, jA4 + j);
            ddt.b bVar3 = new ddt.b(jA5 + j, j2 + j);
            arrayList2.add(bVar);
            arrayList2.add(bVar2);
            arrayList2.add(bVar3);
            i = i3 + 1;
            arrayList = arrayList2;
            jA6 = j2;
            jA = j3;
            jA2 = jA2;
        }
        return arrayList;
    }

    private static long a(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    private static void c(List<ddt.b> list) {
        if (list == null || list.size() < 1) {
            LogUtil.e("CeliaSuggestUtil", "donate skipped, period is empty");
            return;
        }
        ddt ddtVarA = new ddt.d().g("featurePrediction").f(UUID.randomUUID().toString()).e(Build.MODEL).a("phone").d(Build.BRAND + " " + Build.MODEL).e(0).n(TimeZone.getDefault().getDisplayName(false, 0)).d(System.currentTimeMillis()).e(list.get(0).b()).a(list.get(list.size() - 1).d()).c(FaCardAgdsApi.FA_CARD_PACKAGE_NAME).l(FaCardAgdsApi.DIET_FA_CARD).b("com.huawei.ohos.healthservice.diet.DietDiaryMiniFormAbility").h("diet_diary_mini").i("1*2").j("dietaryDiary").e(list).a();
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.b("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi.isSupportDonate()) {
            LogUtil.b("CeliaSuggestUtil", "donate efficient rest");
            awarenessDonateApi.donateFeature(ddtVarA);
        }
    }

    private static List<ddt.b> a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 7; i++) {
            long j = ((long) i) * 86400000;
            arrayList.add(new ddt.b((jCurrentTimeMillis - 1800000) + j, j + 1800000 + jCurrentTimeMillis2));
        }
        return arrayList;
    }

    private static boolean e() {
        if (!"1".equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005))) {
            LogUtil.b("CeliaSuggestUtil", "isTargetUser false, gender not support");
            return false;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006);
        if (accountInfo == null) {
            LogUtil.e("CeliaSuggestUtil", "isTargetUser false, birthday is empty");
            return false;
        }
        try {
            Date date = new SimpleDateFormat("yyyyMMdd").parse(accountInfo);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar2.setTime(date);
            if (calendar2.after(calendar)) {
                LogUtil.e("CeliaSuggestUtil", "isTargetUser false, birthday not valid");
                return false;
            }
            int i = calendar.get(1) - calendar2.get(1);
            if (calendar.get(6) < calendar2.get(6)) {
                i--;
            }
            return i >= 18 && i <= 44;
        } catch (ParseException unused) {
            LogUtil.e("CeliaSuggestUtil", "isTargetUser false, birthday parse failed");
            return false;
        }
    }
}
