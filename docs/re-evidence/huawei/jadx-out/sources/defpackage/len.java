package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.Sha256;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class len {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f39988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ler f39990c;
    private long d;
    private long e;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(3);
        f39988a = concurrentHashMap;
        concurrentHashMap.put("cn.xuexi.android", 0);
        concurrentHashMap.put("com.xunmeng.pinduoduo", 0);
        concurrentHashMap.put("com.eg.android.AlipayGphone", 0);
    }

    public len() {
        this.d = System.currentTimeMillis();
    }

    public len(Context context, ler lerVar) {
        this();
        this.f39989b = context;
        this.f39990c = lerVar;
    }

    public ler e() {
        return this.f39990c;
    }

    public void a() {
        ler lerVar;
        Context context = this.f39989b;
        if (context != null && (lerVar = this.f39990c) != null) {
            d(context, lerVar);
        } else {
            LogUtil.j("HiHealthKitDotUtil", "report error");
        }
    }

    public void d(List<Integer> list, List<Integer> list2) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.f39990c.e(String.valueOf(it.next().intValue()));
            d(this.f39989b, this.f39990c);
        }
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            this.f39990c.e(4);
            this.f39990c.e(String.valueOf(iIntValue));
            d(this.f39989b, this.f39990c);
        }
    }

    public void d(final Context context, final ler lerVar) {
        if (context == null) {
            LogUtil.j("HiHealthKitDotUtil", "apiEventReport:context is null");
            return;
        }
        if (!AuthorizationUtils.c(context)) {
            LogUtil.j("HiHealthKitDotUtil", "apiEventReport:not agree privacy");
            return;
        }
        String strC = lerVar.c();
        if (!TextUtils.isEmpty(strC) && strC.startsWith("dkplugin")) {
            LogUtil.a("HiHealthKitDotUtil", "twin app, change packageName");
            lerVar.a("dkplugin");
        }
        lsy.a(new Runnable() { // from class: les
            @Override // java.lang.Runnable
            public final void run() {
                this.f39996c.e(lerVar, context);
            }
        });
    }

    /* synthetic */ void e(ler lerVar, Context context) {
        boolean zO = Utils.o();
        lerVar.d(let.a(lerVar.c(), zO));
        e(context, lerVar, zO);
        c(lerVar);
        if (e(lerVar)) {
            e(context, lerVar, OperationKey.HEALTH_SDK_EXTENDED_HEALTH_KIT_88010001.value());
        }
    }

    private void c(ler lerVar) {
        int i = 1;
        if (b(lerVar)) {
            Map<String, Integer> map = f39988a;
            int iIntValue = map.get(lerVar.c()).intValue() + 1;
            map.put(lerVar.c(), Integer.valueOf(iIntValue <= 10 ? iIntValue : 1));
            i = iIntValue;
        }
        lerVar.c(i);
    }

    private boolean b(ler lerVar) {
        return lerVar.c() != null && f39988a.containsKey(lerVar.c()) && String.valueOf(40002).equals(lerVar.b()) && "execQuery".equals(lerVar.a()) && lerVar.f() == 0;
    }

    private boolean e(ler lerVar) {
        return !b(lerVar) || f39988a.get(lerVar.c()).intValue() >= 10;
    }

    private void e(Context context, ler lerVar, boolean z) {
        LogUtil.a("HiHealthKitDotUtil", "tickBiWhenInvoke");
        this.e = System.currentTimeMillis();
        String strValue = AnalyticsValue.HI_HEALTH_KIT_API_INVOKE_2150100.value();
        if (z) {
            strValue = "60000";
        }
        HashMap map = new HashMap(16);
        if (!TextUtils.isEmpty(lerVar.d()) && lerVar.d().matches("^[0-9]*$")) {
            map.put("appId", lerVar.d());
        } else {
            map.put("package", lerVar.c());
        }
        if (!TextUtils.isEmpty(lerVar.b())) {
            map.put("dataType", lerVar.b());
        }
        map.put("version", lerVar.i());
        map.put("service", "hiHealthKit");
        map.put("apiName", lerVar.a());
        map.put("result", String.valueOf(lerVar.f()));
        map.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(this.e - this.d));
        lmf.d().c(context, strValue, map, 0);
    }

    private void e(Context context, ler lerVar, String str) {
        String strB;
        LogUtil.a("HiHealthKitDotUtil", "setOpAnalyticsEvent");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("package", lerVar.c());
        linkedHashMap.put("version", lerVar.i());
        linkedHashMap.put("appVersion", CommonUtil.a(context));
        if (!TextUtils.isEmpty(lerVar.d())) {
            strB = lerVar.d();
        } else if (!TextUtils.isEmpty(HiScopeUtil.b(context, lerVar.c()))) {
            strB = HiScopeUtil.b(context, lerVar.c());
        } else {
            LogUtil.a("HiHealthKitDotUtil", "appId is null");
            strB = null;
        }
        linkedHashMap.put("appId", strB);
        linkedHashMap.put("service", "HealthCore");
        linkedHashMap.put("apiName", lerVar.a());
        linkedHashMap.put("result", String.valueOf(lerVar.f()));
        linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(this.e - this.d));
        linkedHashMap.put("callTime", String.valueOf(this.d));
        linkedHashMap.put(r3.y, d(CommonUtil.o(context)));
        linkedHashMap.put("udid", Sha256.d(CommonUtil.k(context), "SHA-256"));
        linkedHashMap.put("country", CommonUtil.e());
        linkedHashMap.put("dataType", lerVar.b());
        linkedHashMap.put("count", String.valueOf(lerVar.e()));
        OpAnalyticsUtil.getInstance().setEvent2nd(str, linkedHashMap);
    }

    private String d(int i) {
        if (i == 1) {
            return "wifi";
        }
        if (i == 2) {
            return "2G";
        }
        if (i == 3) {
            return "3G";
        }
        if (i == 4) {
            return "4G";
        }
        if (i == 5) {
            return "5G";
        }
        return "unknown";
    }

    public void e(Context context, ler lerVar) {
        LogUtil.a("HiHealthKitDotUtil", "callWearKit");
        if (context == null) {
            LogUtil.e("HiHealthKitDotUtil", "callWearKit context null");
            return;
        }
        if (!AuthorizationUtils.c(context)) {
            LogUtil.j("HiHealthKitDotUtil", "callWearKit:not agree privacy");
            return;
        }
        this.e = System.currentTimeMillis();
        HashMap map = new HashMap(16);
        map.put("package", lerVar.c());
        map.put("version", lerVar.i());
        map.put("service", "wearKit");
        map.put("apiName", lerVar.a());
        map.put("result", String.valueOf(lerVar.f()));
        map.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(this.e - this.d));
        lmf.d().c(context, AnalyticsValue.WEAR_KIT_API_INVOKE_2150101.value(), map, 0);
        lerVar.c(1);
        e(context, lerVar, OperationKey.HEALTH_SDK_WEAR_KIT_88010002.value());
    }
}
