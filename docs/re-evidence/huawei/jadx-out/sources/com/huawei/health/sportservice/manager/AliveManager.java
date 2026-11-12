package com.huawei.health.sportservice.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.service.KeepForegroundNoLocationService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.def;
import defpackage.det;
import defpackage.hau;
import defpackage.ivm;
import defpackage.jaj;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.ALIVE_MANAGER)
public class AliveManager implements ManagerComponent {
    private static final String TAG = "SportService_AliveManager";
    private Context mContext;
    private def mHelper;
    private SportLaunchParams mSportLaunchParams;
    private ivm mTrackAlive;
    private boolean mIsSportStarted = false;
    private boolean mIsCancel = false;
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown() {
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        this.mContext = BaseApplication.b();
        this.mHelper = new def(BaseSportManager.getInstance().getSportType());
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (obj instanceof SportLaunchParams) {
            LogUtil.a(TAG, "setParas paramsType:", sportParamsType, " paraData:", obj);
            SportLaunchParams sportLaunchParams = (SportLaunchParams) obj;
            this.mSportLaunchParams = sportLaunchParams;
            if (this.mIsSportStarted && sportLaunchParams.isNeedRestart()) {
                det.e(this.mSportLaunchParams);
                registerTime();
            }
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        this.mTrackAlive = ivm.e();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        apply();
        dealStartFlag(true);
        this.mIsSportStarted = true;
        ivm ivmVar = this.mTrackAlive;
        if (ivmVar != null) {
            ivmVar.c(this.mContext);
        }
        SportLaunchParams sportLaunchParams = this.mSportLaunchParams;
        if (sportLaunchParams != null && sportLaunchParams.isNeedRestart()) {
            det.e(this.mSportLaunchParams);
            registerTime();
        }
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.sportservice.manager.AliveManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1175x4c708e2b();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onStartSport$0$com-huawei-health-sportservice-manager-AliveManager, reason: not valid java name */
    /* synthetic */ void m1175x4c708e2b() {
        handleKeepForeground(false);
    }

    private void handleKeepForeground(boolean z) {
        if (!CommonUtil.bo()) {
            LogUtil.e(TAG, "no need to startKeepForegroundService");
            return;
        }
        if (this.mContext == null) {
            LogUtil.e(TAG, "startKeepForegroundService failed. context is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClass(this.mContext, KeepForegroundNoLocationService.class);
            intent.putExtra(BleConstants.SPORT_TYPE, BaseSportManager.getInstance().getSportType());
            intent.putExtra("isStop", z);
            intent.putExtra("id", TAG);
            intent.putExtra("stringKey", R.string.IDS_indoor_recording_sport_data);
            intent.putExtra("isFromTreadmill", true);
            if (BaseSportManager.getInstance().getDataSource() == 100) {
                intent.putExtra("isNeedControlAction", true);
                intent.putExtra("isSportFromWear", true);
            }
            intent.putExtra("NOTIFICATION_TYPE", 1);
            if (z) {
                this.mContext.stopService(intent);
                return;
            }
            if (Build.VERSION.SDK_INT < 31 || BaseApplication.h()) {
                this.mContext.startService(intent);
            } else {
                jaj.b(BaseSportManager.getInstance().getSportType(), true);
            }
            LogUtil.a(TAG, "startForegroundService");
        } catch (Throwable th) {
            ReleaseLogUtil.a(TAG, ExceptionUtils.c(th));
        }
    }

    private void registerTime() {
        SportDataNotify sportDataNotify = new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.AliveManager$$ExternalSyntheticLambda1
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1176x949adf0b(list, map);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(ComponentName.ALIVE_MANAGER);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, sportDataNotify);
    }

    /* JADX INFO: renamed from: lambda$registerTime$1$com-huawei-health-sportservice-manager-AliveManager, reason: not valid java name */
    /* synthetic */ void m1176x949adf0b(List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION") && (map.get("TIME_ONE_SECOND_DURATION") instanceof Long)) {
            ivm ivmVar = this.mTrackAlive;
            if (ivmVar != null) {
                ivmVar.d();
            }
            apply();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        ivm ivmVar = this.mTrackAlive;
        if (ivmVar != null) {
            ivmVar.c(this.mContext);
        }
        apply();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        ivm ivmVar = this.mTrackAlive;
        if (ivmVar != null) {
            ivmVar.b(this.mContext);
        }
        unapply();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        ivm ivmVar = this.mTrackAlive;
        if (ivmVar != null) {
            ivmVar.b(this.mContext);
        }
        this.mIsSportStarted = false;
        handleKeepForeground(true);
        this.mIsCancel = true;
        det.b();
        dealStartFlag(false);
        unapply();
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        ivm ivmVar = this.mTrackAlive;
        if (ivmVar != null && ivmVar.c()) {
            this.mTrackAlive.a(false);
            ivm.e(this.mContext);
        }
        if (!this.mIsCancel) {
            handleKeepForeground(true);
        }
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
        dealStartFlag(false);
    }

    private void dealStartFlag(boolean z) {
        KeyValDbManager.d(BaseApplication.b()).b("already_sport", String.valueOf(z));
    }

    private void apply() {
        if (this.mHelper == null) {
            this.mHelper = new def(BaseSportManager.getInstance().getSportType());
        }
        this.mHelper.a();
    }

    private void unapply() {
        if (this.mHelper == null) {
            this.mHelper = new def(BaseSportManager.getInstance().getSportType());
        }
        this.mHelper.c();
    }
}
