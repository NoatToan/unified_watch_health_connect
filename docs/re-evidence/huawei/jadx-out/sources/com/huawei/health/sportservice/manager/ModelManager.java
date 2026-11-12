package com.huawei.health.sportservice.manager;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.Display;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper;
import com.huawei.pluginsport.airopeskipping.OnJumpRopeListenerWrapper;
import defpackage.has;
import defpackage.ppq;
import defpackage.pps;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.MODEL_MANAGER)
public class ModelManager implements ManagerComponent {
    private static final int CROSS_JUMP_EXAM_TYPE = 4;
    private static final int INIT_MODEL_FAIL = 1;
    private static final int INIT_MODEL_SUCCESS = 0;
    private static final int LONG_JUMP_EXAM_TYPE = 3;
    private static final int PREPARE_STAGE = 0;
    private static final int SPORT_STAGE = 1;
    private static final int STAND_FLEXION_EXAM_TYPE = 1;
    private static final String STAND_FLEXION_MODEL_EXCEPTION = "StandFlexionModelManagerException";
    private static final int SUPINE_LEG_RAISE_EXAM_TYPE = 2;
    private static final String TAG = "SportService_ModelManager";
    private has mAiRopeModelInfo;
    private has mLastAiRopeModelInfo;
    private int mSportType;
    private boolean mHasInitAiModel = false;
    private int mInitModelStatus = 1;
    private Context mContext = BaseApplication.b();

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        this.mSportType = BaseSportManager.getInstance().getSportType();
        if (SportParamsType.AI_ROPE_PARAS.equals(sportParamsType) && (obj instanceof has)) {
            updateAiRopeModelInfo(obj);
            return;
        }
        if (SportParamsType.AI_ROPE_INPUT_IMAGE.equals(sportParamsType) && (obj instanceof Image)) {
            setImage((Image) obj);
            return;
        }
        if (SportParamsType.AI_ROPE_SOURCE_LISTENER.equals(sportParamsType) && (obj instanceof OnJumpRopeListenerWrapper)) {
            setAiRopeListener((OnJumpRopeListenerWrapper) obj);
        }
        if (SportParamsType.AI_SPORT_EXAM_SOURCE_LISTENER.equals(sportParamsType) && (obj instanceof OnSportCodeListenerWrapper)) {
            setStandFlexionListener((OnSportCodeListenerWrapper) obj);
        }
    }

    private void updateAiRopeModelInfo(Object obj) {
        has hasVar = this.mAiRopeModelInfo;
        if (hasVar != null && hasVar.equals(obj)) {
            LogUtil.a(TAG, "mAiRopeModelInfo is not null or no change");
            return;
        }
        this.mAiRopeModelInfo = (has) obj;
        if (this.mHasInitAiModel) {
            setModelInfo();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.AI_ROPE_PARAS.equals(sportParamsType) || SportParamsType.AI_ROPE_INPUT_IMAGE.equals(sportParamsType) || SportParamsType.AI_ROPE_SOURCE_LISTENER.equals(sportParamsType) || SportParamsType.AI_SPORT_EXAM_SOURCE_LISTENER.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.sportservice.manager.ModelManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1185xd8d9d06e();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-ModelManager, reason: not valid java name */
    /* synthetic */ void m1185xd8d9d06e() {
        BaseSportManager.getInstance().setIsAlreadyInit(false);
        if (isAiForwardFlexSportType()) {
            initStandFlexionProxy();
        } else {
            initAiRopeProxy();
        }
    }

    private void initAiRopeProxy() {
        try {
            has hasVar = this.mAiRopeModelInfo;
            if (hasVar == null || hasVar.b() == 0 || this.mAiRopeModelInfo.c() == 0) {
                this.mInitModelStatus = pps.e().initModel(this.mContext, 1080, 2160);
            } else {
                this.mInitModelStatus = pps.e().initModel(this.mContext, this.mAiRopeModelInfo.b(), this.mAiRopeModelInfo.c());
                pps.e().setStage(0);
                this.mHasInitAiModel = true;
                setModelInfoAfterInit();
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onPreSport");
            ReleaseLogUtil.a(TAG, "onPreSport() error: ", LogAnonymous.b(e));
        }
        BaseSportManager.getInstance().setIsAlreadyInit(this.mInitModelStatus == 0);
    }

    private void initStandFlexionProxy() {
        try {
            has hasVar = this.mAiRopeModelInfo;
            if (hasVar == null || hasVar.b() == 0 || this.mAiRopeModelInfo.c() == 0) {
                ppq.c().setExamType(getExamType());
                this.mInitModelStatus = ppq.c().initModel(this.mContext, 1080, 2160);
            } else {
                ppq.c().setExamType(getExamType());
                this.mInitModelStatus = ppq.c().initModel(this.mContext, this.mAiRopeModelInfo.b(), this.mAiRopeModelInfo.c());
                ppq.c().setExamStage(0);
                this.mHasInitAiModel = true;
                setSurfaceRotation();
                setModelInfo();
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onPreSport");
            ReleaseLogUtil.a(TAG, "onPreSport() error: ", LogAnonymous.b(e));
        }
        ReleaseLogUtil.d(TAG, "initProxy() mInitModelStatus: ", Boolean.valueOf(this.mInitModelStatus == 0));
        BaseSportManager.getInstance().setIsAlreadyInit(this.mInitModelStatus == 0);
    }

    private void setSurfaceRotation() {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j(TAG, "setSurfaceRotation activity == null");
            return;
        }
        Display defaultDisplay = activityJ.getWindowManager().getDefaultDisplay();
        if (defaultDisplay == null) {
            LogUtil.j(TAG, "setSurfaceRotation display == null");
        } else {
            int rotation = defaultDisplay.getRotation();
            ReleaseLogUtil.d(TAG, "setSurfaceRotation result:", Integer.valueOf(ppq.c().setSurfaceRotation(rotation)), "rotation:", Integer.valueOf(rotation));
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        try {
            if (isAiForwardFlexSportType()) {
                ppq.c().setExamStage(1);
            } else {
                pps.e().setStage(1);
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onStartSport");
            ReleaseLogUtil.a(TAG, "onStartSport() error: ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        try {
            if (isAiForwardFlexSportType()) {
                ppq.c().setExamStage(1);
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onResumeSport");
            ReleaseLogUtil.a(TAG, "onResumeSport() error: ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        try {
            if (isAiForwardFlexSportType()) {
                ppq.c().setExamStage(0);
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onPauseSport");
            ReleaseLogUtil.a(TAG, "onPauseSport() error: ", LogAnonymous.b(e));
        }
    }

    private void setImage(Image image) {
        try {
            if (isAiForwardFlexSportType()) {
                ppq.c().setImage(image);
            } else {
                pps.e().setImage(image);
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "setImage");
            ReleaseLogUtil.a(TAG, "setImage() error: ", LogAnonymous.b(e));
        }
    }

    private boolean isAiForwardFlexSportType() {
        return SportSupportUtil.e(this.mSportType);
    }

    private void setModelInfoAfterInit() {
        has hasVar = this.mLastAiRopeModelInfo;
        if (hasVar != null && hasVar.equals(this.mAiRopeModelInfo)) {
            LogUtil.a(TAG, "mLastAiRopeModelInfo equals mAiRopeModelInfo");
        } else {
            setModelInfo();
        }
    }

    private int setModelInfo() {
        has hasVar = this.mAiRopeModelInfo;
        if (hasVar == null) {
            LogUtil.a(TAG, "mAiRopeModelInfo == null");
            return 1;
        }
        try {
            this.mLastAiRopeModelInfo = hasVar;
            if (isAiForwardFlexSportType()) {
                return ppq.c().setModelInfo(this.mAiRopeModelInfo.b(), this.mAiRopeModelInfo.c(), this.mAiRopeModelInfo.a());
            }
            return pps.e().setModelInfo(this.mAiRopeModelInfo.b(), this.mAiRopeModelInfo.c(), this.mAiRopeModelInfo.a());
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "setModelInfo");
            ReleaseLogUtil.a(TAG, "setModelInfo() error: ", LogAnonymous.b(e));
            this.mLastAiRopeModelInfo = null;
            return 1;
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        try {
            unloadModel();
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onStopSport");
            ReleaseLogUtil.a(TAG, "onStopSport() error: ", LogAnonymous.b(e));
        }
    }

    private void unloadModel() {
        if (isAiForwardFlexSportType()) {
            ppq.c().unloadModel();
        } else {
            pps.e().unloadModel();
        }
    }

    public void setAiRopeListener(OnJumpRopeListenerWrapper onJumpRopeListenerWrapper) {
        if (onJumpRopeListenerWrapper != null) {
            try {
                pps.e().setRopeListener(onJumpRopeListenerWrapper);
            } catch (Exception | UnsatisfiedLinkError e) {
                uploadErrorMessage(e, "setAiRopeListener");
                ReleaseLogUtil.a(TAG, "setAiRopeListener() error: ", LogAnonymous.b(e));
            }
        }
    }

    public void setStandFlexionListener(OnSportCodeListenerWrapper onSportCodeListenerWrapper) {
        if (onSportCodeListenerWrapper != null) {
            try {
                ppq.c().setSportCodeListener(onSportCodeListenerWrapper);
            } catch (Exception | UnsatisfiedLinkError e) {
                uploadErrorMessage(e, "setStandFlexionListener");
                ReleaseLogUtil.a(TAG, "setStandFlexionListener error: ", LogAnonymous.b(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        LogUtil.a(TAG, "destroy()");
        try {
            unloadModel();
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "destroy");
            ReleaseLogUtil.a(TAG, "destroy() error: ", LogAnonymous.b(e));
        }
    }

    private void uploadErrorMessage(Throwable th, String str) {
        String strD = DfxUtils.d(Thread.currentThread(), th);
        if (isAiForwardFlexSportType()) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(STAND_FLEXION_MODEL_EXCEPTION, str + "_" + strD);
            return;
        }
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("AIRopeModelManagerException", str + "_" + strD);
    }

    private int getExamType() {
        LogUtil.a(TAG, "getExamType(), sportType", Integer.valueOf(this.mSportType));
        switch (this.mSportType) {
            case 400001:
                return 2;
            case 400002:
                return 3;
            case 400003:
                return 4;
            default:
                return 1;
        }
    }
}
