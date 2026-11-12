package defpackage;

import android.content.Context;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = UserLabelServiceApi.class)
@Singleton
public class fme implements UserLabelServiceApi {
    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void registerCallback(int i) {
        if (i == 1) {
            flt.k().n();
            return;
        }
        if (i == 2) {
            flz.b().d();
            return;
        }
        if (i == 3) {
            fls.a().d();
        } else if (i == 4) {
            flq.b().h();
        } else {
            if (i != 5) {
                return;
            }
            fma.d().c();
        }
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void unRegisterCallback(int i) {
        if (i == 1) {
            flt.k().m();
            return;
        }
        if (i == 2) {
            flz.b().e();
            return;
        }
        if (i == 3) {
            fls.a().b();
        } else if (i == 4) {
            flq.b().f();
        } else {
            if (i != 5) {
                return;
            }
            fma.d().b();
        }
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void subscribeTrackDataChanged(Context context) {
        fmf.b(context);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void unSubscribeTrackData(Context context) {
        fmf.a(context);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void initLabel(String str, String str2, String str3) {
        fmc.a(BaseApplication.getContext()).e(str, str2, str3);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void initDailySleepLabel(gxd gxdVar) {
        if (gxdVar == null) {
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        fmc.a(BaseApplication.getContext()).e("health_daily_sleep_problem", fmi.e("health_daily_sleep_problem", gxdVar.j()), accountInfo);
        fmc.a(BaseApplication.getContext()).e("health_daily_sleep_target_problem", fmi.c("health_daily_sleep_target_problem", gxdVar.a()), accountInfo);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void initMonthlySleepLabel(gxh gxhVar) {
        if (gxhVar == null) {
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        fmc.a(BaseApplication.getContext()).e("health_sleep_rhythm_type", fmi.e("health_sleep_rhythm_type", gxhVar.m()), accountInfo);
        fmc.a(BaseApplication.getContext()).e("health_monthly_sleep_problem", fmi.e("health_monthly_sleep_problem", gxhVar.h()), accountInfo);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void destroyOdmf() {
        fmb.b().c();
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void saveThirtyDaysTrackDataToOdmf(Context context) {
        fmf.d(context);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void saveTrackDataToOdmf(String str) {
        fmb.b().b(str);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void saveBindingDeviceToOdmf(String str) {
        fmb.b().e(str);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public List<String> getAllLabels(String str) {
        return fmc.a(BaseApplication.getContext()).a(str);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public List<String> getLabels(List<String> list, String str) {
        return fmc.a(BaseApplication.getContext()).c(list, str);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void clickRecord(int i, String str) {
        fll.c().c(i, str);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public boolean isContainsHealthLabel(List<String> list) {
        return fmc.a(BaseApplication.getContext()).a(list);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public boolean isContainsOtherLabel(List<String> list) {
        return fmc.a(BaseApplication.getContext()).d(list);
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void getPengineAllLabels(Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fme.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LogUtil.a("UserLabelServiceImpl", "getPengineAllLabels old sdk map ", fmb.b().d().toString());
                } catch (SecurityException e) {
                    LogUtil.e("UserLabelServiceImpl", "getPengineAllLabels exception ", ExceptionUtils.c(e));
                }
                fmb.b().d(new BaseResponseCallback<HashMap<String, String>>() { // from class: fme.5.2
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onResponse(int i, HashMap<String, String> map) {
                        if (map != null) {
                            LogUtil.a("UserLabelServiceImpl", "errorCode:", Integer.valueOf(i), "new sdk map:", map.toString());
                        }
                    }
                });
            }
        });
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void uploadSportEvent() {
        fmb.b().g();
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void uploadBindingDevice() {
        fmb.b().e();
    }

    @Override // com.huawei.health.userlabelmgr.api.UserLabelServiceApi
    public void uploadSleepData() {
        fmb.b().a();
    }
}
