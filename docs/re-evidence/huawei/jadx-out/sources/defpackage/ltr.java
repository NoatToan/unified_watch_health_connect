package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthCrowdTestApi;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwcrowdtestapi.HealthSendLogCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ltr implements HealthCrowdTestApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40819b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ltr f40820c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCrowdTestApi f40821a;
    private HealthCrowdTestApi d;

    public ltr() {
        try {
            Object objNewInstance = Class.forName("com.huawei.healthcrowdtest.HealthCrowdTest").newInstance();
            if (objNewInstance instanceof HealthCrowdTestApi) {
                this.f40821a = (HealthCrowdTestApi) objNewInstance;
            }
            Object objNewInstance2 = Class.forName("com.huawei.healthcrowdtest.HealthHonorCrowdTest").newInstance();
            if (objNewInstance2 instanceof HealthCrowdTestApi) {
                this.d = (HealthCrowdTestApi) objNewInstance2;
            }
            LogUtil.a("HealthCrowdTestProxy", "init HealthCrowdTest ok");
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HealthCrowdTestProxy", "ClassNotFoundException");
        } catch (Exception unused2) {
            LogUtil.e("HealthCrowdTestProxy", "Exception");
        }
    }

    public static ltr b() {
        ltr ltrVar;
        synchronized (f40819b) {
            if (f40820c == null) {
                f40820c = new ltr();
            }
            ltrVar = f40820c;
        }
        return ltrVar;
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void init(Context context) {
        LogUtil.a("HealthCrowdTestProxy", "init");
        if (context == null) {
            LogUtil.j("HealthCrowdTestProxy", "init context is null");
            if (this.f40821a != null) {
                LogUtil.j("HealthCrowdTestProxy", "init context is null, mHealthCrowdTestApi.init(BaseApplication.getAppContext()");
                this.f40821a.init(BaseApplication.b());
            }
            if (this.d != null) {
                LogUtil.j("HealthCrowdTestProxy", "init context is null, mHonorHealthCrowdTestApi.init(BaseApplication.getAppContext()");
                this.d.init(BaseApplication.b());
                return;
            }
            return;
        }
        HealthCrowdTestApi healthCrowdTestApi = this.f40821a;
        if (healthCrowdTestApi != null) {
            healthCrowdTestApi.init(context.getApplicationContext());
        }
        HealthCrowdTestApi healthCrowdTestApi2 = this.d;
        if (healthCrowdTestApi2 != null) {
            healthCrowdTestApi2.init(context.getApplicationContext());
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void gotoFeedback(Context context, ltp ltpVar, HealthFeedbackParams healthFeedbackParams, HealthFeedbackCallback healthFeedbackCallback) {
        if (healthFeedbackParams != null && healthFeedbackParams.isHonorDevice()) {
            if (this.d != null) {
                LogUtil.a("HealthCrowdTestProxy", "gotoFeedback mHonorHealthCrowdTestApi.gotoFeedback");
                this.d.gotoFeedback(context, ltpVar, healthFeedbackParams, healthFeedbackCallback);
                return;
            }
            return;
        }
        if (this.f40821a != null) {
            LogUtil.a("HealthCrowdTestProxy", "gotoFeedback mHealthCrowdTestApi.gotoFeedback");
            this.f40821a.gotoFeedback(context, ltpVar, healthFeedbackParams, healthFeedbackCallback);
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void uninit(Context context) {
        LogUtil.a("HealthCrowdTestProxy", "uninit");
        if (context == null) {
            LogUtil.j("HealthCrowdTestProxy", "uninit context is null");
            return;
        }
        HealthCrowdTestApi healthCrowdTestApi = this.f40821a;
        if (healthCrowdTestApi != null) {
            healthCrowdTestApi.uninit(context.getApplicationContext());
        }
        HealthCrowdTestApi healthCrowdTestApi2 = this.d;
        if (healthCrowdTestApi2 != null) {
            healthCrowdTestApi2.uninit(context.getApplicationContext());
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void sendLog(Context context, HealthFeedbackParams healthFeedbackParams, String str, boolean z, boolean z2, HealthSendLogCallback healthSendLogCallback) {
        if (str != null && str.contains("-HONOR")) {
            if (this.d != null) {
                LogUtil.a("HealthCrowdTestProxy", "sendLog mHonorHealthCrowdTestApi.sendLog");
                this.d.sendLog(context, healthFeedbackParams, str, z, z2, healthSendLogCallback);
                return;
            }
            return;
        }
        if (this.f40821a != null) {
            LogUtil.a("HealthCrowdTestProxy", "sendLog mHealthCrowdTestApi.sendLog ");
            this.f40821a.sendLog(context, healthFeedbackParams, str, z, z2, healthSendLogCallback);
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void checkLogUploadStatus(Context context) {
        HealthCrowdTestApi healthCrowdTestApi = this.f40821a;
        if (healthCrowdTestApi != null) {
            healthCrowdTestApi.checkLogUploadStatus(context);
        }
        HealthCrowdTestApi healthCrowdTestApi2 = this.d;
        if (healthCrowdTestApi2 != null) {
            healthCrowdTestApi2.checkLogUploadStatus(context);
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void logout() {
        LogUtil.a("HealthCrowdTestProxy", "logout");
        HealthCrowdTestApi healthCrowdTestApi = this.f40821a;
        if (healthCrowdTestApi != null) {
            healthCrowdTestApi.logout();
        }
        HealthCrowdTestApi healthCrowdTestApi2 = this.d;
        if (healthCrowdTestApi2 != null) {
            healthCrowdTestApi2.logout();
        }
    }

    @Override // com.huawei.hwcrowdtestapi.HealthCrowdTestApi
    public void setProductType(int i) {
        LogUtil.a("HealthCrowdTestProxy", "setProductType");
        HealthCrowdTestApi healthCrowdTestApi = this.f40821a;
        if (healthCrowdTestApi != null) {
            healthCrowdTestApi.setProductType(i);
        }
        HealthCrowdTestApi healthCrowdTestApi2 = this.d;
        if (healthCrowdTestApi2 != null) {
            healthCrowdTestApi2.setProductType(i);
        }
    }
}
