package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.api.ResourceManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
public class fma {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fma f34232b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34233a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<HealthDevice.HealthDeviceKind> f34234c;
    private UpdateUserLabel d;
    private String i;

    private fma() {
        Context context = BaseApplication.getContext();
        this.f34233a = context;
        this.i = LoginInit.getInstance(context).getAccountInfo(1011);
    }

    public static fma d() {
        fma fmaVar;
        synchronized (e) {
            if (f34232b == null) {
                f34232b = new fma();
            }
            fmaVar = f34232b;
        }
        return fmaVar;
    }

    public void c() {
        LogUtil.a("ThirdPartyDeviceLabelHelper", "registerCallback");
        this.d = new UpdateUserLabel() { // from class: fma.2
            @Override // com.huawei.health.userlabelmgr.model.UpdateUserLabel
            public void onUpdate() {
                fma.this.e();
            }
        };
        fmc.a(this.f34233a).e(this.d);
    }

    public void b() {
        LogUtil.a("ThirdPartyDeviceLabelHelper", "unRegisterCallback");
        if (this.d != null) {
            fmc.a(this.f34233a).d(this.d);
        }
    }

    public void e() {
        this.f34234c = new ArrayList<>(10);
        this.f34234c.addAll(((ResourceManagerApi) Services.b("EcologyDevice", ResourceManagerApi.class)).getProductKinds(dmg.a().getBondedProductsForDeviceOnly(HealthDevice.HealthDeviceKind.HDK_UNKNOWN)));
        LogUtil.a("ThirdPartyDeviceLabelHelper", "generateThirdPartyDeviceLabels() mUserDeviceList = ", Integer.valueOf(this.f34234c.size()));
        h();
        a();
        f();
    }

    private void f() {
        String strE = SharedPreferenceManager.e(this.f34233a, "BIND_WEIGHT", "bind_weight_time");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(strE)) {
            fmc.a(this.f34233a).e("health_sport_device_time_third_party", "", this.i);
            return;
        }
        try {
            jCurrentTimeMillis = Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("ThirdPartyDeviceLabelHelper", "numberFormatException");
        }
        e(jCurrentTimeMillis);
    }

    private void h() {
        ArrayList<HealthDevice.HealthDeviceKind> arrayList = this.f34234c;
        if (arrayList == null || arrayList.size() == 0) {
            fmc.a(this.f34233a).e("health_sport_device_type_third_party", "SportDeviceModel_0", this.i);
        } else {
            fmc.a(this.f34233a).e("health_sport_device_type_third_party", "SportDeviceModel_1", this.i);
        }
    }

    private void a() {
        ArrayList<HealthDevice.HealthDeviceKind> arrayList = this.f34234c;
        if (arrayList == null) {
            LogUtil.a("ThirdPartyDeviceLabelHelper", "generateThirdPartyDeviceModelNumberLabel mUserDeviceList is null");
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (HealthDevice.HealthDeviceKind healthDeviceKind : arrayList) {
            LogUtil.a("ThirdPartyDeviceLabelHelper", "generateThirdPartyDeviceModelNumberLabel kind = ", healthDeviceKind);
            int i = AnonymousClass1.f34235a[healthDeviceKind.ordinal()];
            if (i == 1) {
                z = true;
            } else if (i == 2) {
                z2 = true;
            } else if (i == 3) {
                z3 = true;
            } else if (i == 4) {
                z4 = true;
            } else if (i != 5) {
                LogUtil.a("ThirdPartyDeviceLabelHelper", "generateThirdPartyDeviceModelNumberLabel classification is unKnow");
            } else {
                z5 = true;
            }
        }
        fmc.a(this.f34233a).e("health_sport_device_up_third_party", e(z, z2, z3, z4, z5), this.i);
    }

    /* JADX INFO: renamed from: fma$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34235a;

        static {
            int[] iArr = new int[HealthDevice.HealthDeviceKind.values().length];
            f34235a = iArr;
            try {
                iArr[HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34235a[HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34235a[HealthDevice.HealthDeviceKind.HDK_HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34235a[HealthDevice.HealthDeviceKind.HDK_WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34235a[HealthDevice.HealthDeviceKind.HDK_ECG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private String e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder(16);
        if (z) {
            sb.append("SportDeviceType_13");
        } else {
            sb.append("SportDeviceType_12");
        }
        if (z2) {
            sb.append(",SportDeviceType_15");
        } else {
            sb.append(",SportDeviceType_14");
        }
        if (z3) {
            sb.append(",SportDeviceType_17");
        } else {
            sb.append(",SportDeviceType_16");
        }
        if (z4) {
            sb.append(",SportDeviceType_1");
        } else {
            sb.append(",SportDeviceType_0");
        }
        if (z5) {
            sb.append(",SportDeviceType_11");
        } else {
            sb.append(",SportDeviceType_10");
        }
        LogUtil.a("ThirdPartyDeviceLabelHelper", "getDeviceTypeNumLabelValue() labelValue:", sb.toString());
        return sb.toString();
    }

    private void e(long j) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis <= 2592000000L) {
            str = "SportDeviceTime_0";
        } else if (jCurrentTimeMillis > 2592000000L && jCurrentTimeMillis <= 7776000000L) {
            str = "SportDeviceTime_1";
        } else if (jCurrentTimeMillis > 7776000000L && jCurrentTimeMillis <= 10368000000L) {
            str = "SportDeviceTime_2";
        } else {
            str = "SportDeviceTime_3";
        }
        LogUtil.d("ThirdPartyDeviceLabelHelper", "calculateWeightActiveLabel:", str);
        fmc.a(this.f34233a).e("health_sport_device_time_third_party", str, this.i);
    }
}
