package com.huawei.health.routeradapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.MainActivity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homewear21.home.WearHomeActivity;
import defpackage.ecu;
import defpackage.fua;
import defpackage.hcb;
import defpackage.iov;
import defpackage.ive;
import defpackage.pjo;
import defpackage.qst;
import defpackage.tbd;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HonorCardPretreatmentService implements PretreatmentService {
    private boolean d;

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        boolean zIsSportServiceRunning;
        this.d = false;
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.c("HonorCardPretreatmentService", "uri == null");
            return false;
        }
        LogUtil.c("HonorCardPretreatmentService", uriO.toString());
        e(context);
        b(context);
        if (this.d) {
            return false;
        }
        int iD = hcb.a().d();
        boolean z = true;
        boolean z2 = iD == 2 || iD == 5;
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi != null) {
            zIsSportServiceRunning = sportDataOutputApi.isSportServiceRunning();
            if (!zIsSportServiceRunning || !sportDataOutputApi.isDeviceMirrorLink()) {
                z = false;
            }
        } else {
            z = false;
            zIsSportServiceRunning = false;
        }
        LogUtil.b("HonorCardPretreatmentService", "PluginSportTrack.getInstance().isSportingStatus()", Boolean.valueOf(ive.c().r()));
        LogUtil.b("HonorCardPretreatmentService", "PluginSportTrack.getInstance().isSupportAutoTrackStatus()", Boolean.valueOf(ive.c().t()));
        if (ive.c().r() && ive.c().t()) {
            ive.c().z();
            ((Activity) context).finish();
            return false;
        }
        if (ive.c().r() || z) {
            iov.d(context, new Intent(context, (Class<?>) TrackMainMapActivity.class));
        } else if (z2) {
            AppRouter.c("/PluginFitnessAdvice/CoachActivity").b(context);
        }
        if (ive.c().a(context)) {
            tbd.e(context);
            return false;
        }
        if (!z2 && !zIsSportServiceRunning) {
            c(context, uriO.getQueryParameter("type"));
        }
        return false;
    }

    private void c(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setPackage(BaseApplication.getAppPackage());
        str.hashCode();
        if (str.equals("HONOR_CARD_DEVICE")) {
            if (qst.c()) {
                b(context, intent);
            } else {
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HonorCardPretreatmentService");
                boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
                if (CollectionUtils.a(deviceList) || !isLogined) {
                    b(context, intent);
                } else {
                    intent.setClass(context, WearHomeActivity.class);
                }
            }
        } else {
            intent.setClass(context, MainActivity.class);
        }
        iov.d(context, intent);
    }

    private void b(Context context, Intent intent) {
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        intent.setClass(context, MainActivity.class);
    }

    private void b(Context context) {
        ReleaseLogUtil.c("R_HonorCardPretreatmentService", "handleDetectionDialog start");
        if (!fua.c(context)) {
            LogUtil.b("HonorCardPretreatmentService", "handleDetectionDialog not supported");
            return;
        }
        pjo pjoVarB = pjo.b();
        if (!pjoVarB.isPluginAvaiable()) {
            ReleaseLogUtil.d("R_HonorCardPretreatmentService", "showDetectionDialog is Unavailable");
        } else {
            d(context, pjoVarB);
        }
    }

    private void d(final Context context, final pjo pjoVar) {
        pjoVar.sleepRecordStatus(new IBaseResponseCallback() { // from class: gvg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f36079c.a(context, pjoVar, i, obj);
            }
        });
    }

    public /* synthetic */ void a(Context context, pjo pjoVar, int i, Object obj) {
        ReleaseLogUtil.c("R_HonorCardPretreatmentService", "sleepRecordStatus: ", Integer.valueOf(i));
        if (context == null) {
            return;
        }
        if (i == 3) {
            pjoVar.c(context, true, "4");
            this.d = true;
        } else {
            pjoVar.disconnect();
        }
    }

    private void e(Context context) {
        if (c(context) <= System.currentTimeMillis()) {
            LogUtil.b("HonorCardPretreatmentService", "showEfficientRest rest is over");
            return;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "sp_key_briefs_is_resting");
        try {
            if (TextUtils.isEmpty(strE) || !Boolean.parseBoolean(strE)) {
                return;
            }
            AppRouter.c("/PluginSleepBriefs/EfficientRestActivity").b(context);
            this.d = true;
        } catch (NumberFormatException e) {
            LogUtil.d("HonorCardPretreatmentService", "showEfficientRest exception : ", e.getMessage());
        }
    }

    private long c(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "sp_key_briefs_over_time");
        if (TextUtils.isEmpty(strE)) {
            return 0L;
        }
        return CommonUtils.i(strE);
    }
}
