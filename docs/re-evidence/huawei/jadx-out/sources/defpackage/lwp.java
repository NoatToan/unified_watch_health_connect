package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.up.utils.Constants;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40975a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lwp f40976b;

    private lwp() {
    }

    public static lwp a() {
        lwp lwpVar;
        synchronized (f40975a) {
            if (f40976b == null) {
                f40976b = new lwp();
            }
            lwpVar = f40976b;
        }
        return lwpVar;
    }

    public void b(Context context, HealthFeedbackParams healthFeedbackParams, HealthFeedbackCallback healthFeedbackCallback) {
        ltp ltpVar = new ltp();
        ltpVar.d(context.getPackageName());
        ltpVar.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        ltpVar.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        ltpVar.j("at");
        String strK = CommonUtil.k(BaseApplication.getContext());
        if (TextUtils.isEmpty(strK)) {
            strK = "000000000000000";
        }
        ltpVar.a(strK);
        String deviceType = SharedPreferenceUtil.getInstance(context).getDeviceType();
        ltpVar.e(Integer.valueOf(deviceType != null ? CommonUtil.n(context, deviceType) : 0));
        ltpVar.h(LoginInit.getInstance(context).getAccountInfo(1000));
        ltpVar.c(Agent.OS_NAME);
        ltpVar.b(Integer.valueOf(Constants.HEALTH_APP_LOGIN_CHANNEL));
        ltr.b().gotoFeedback(context, ltpVar, healthFeedbackParams, healthFeedbackCallback);
    }
}
