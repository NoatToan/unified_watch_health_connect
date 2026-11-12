package com.huawei.health.sportservice.manager.aitrain;

import android.content.Context;
import android.media.Image;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.pluginfitnesssport.OnCheckStandListenerWrapper;
import com.huawei.pluginfitnesssport.OnTrainSkeletonListenerWrapper;
import defpackage.has;
import defpackage.pel;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.MODEL_MANAGER)
public class AiTrainModelManager implements ManagerComponent {
    private static final int INIT_MODEL_FAIL = 1;
    private static final int INIT_MODEL_SUCCESS = 0;
    private static final String TAG = "SportService_AiTrainModelManager";
    private has mAiModelInfo;
    private has mLastAiModelInfo;
    private boolean mHasInitAiModel = false;
    private int mInitModelStatus = 1;
    private Context mContext = BaseApplication.b();

    static /* synthetic */ void lambda$setModelInfo$3(int i, Object obj) {
    }

    static /* synthetic */ void lambda$unloadModel$4(int i, Boolean bool) {
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (SportParamsType.AI_ROPE_PARAS.equals(sportParamsType) && (obj instanceof has)) {
            updateAiRopeModelInfo(obj);
            return;
        }
        if (SportParamsType.AI_ROPE_INPUT_IMAGE.equals(sportParamsType) && (obj instanceof Image)) {
            setImage((Image) obj);
            return;
        }
        if (SportParamsType.AI_TRAIN_TEMPLATE_DATA.equals(sportParamsType) && (obj instanceof String)) {
            LogUtil.a(TAG, "setAiTrainTemplate");
            setAiTrainTemplateAndType((String) obj);
        }
        if (SportParamsType.PRE_STATUS_SOURCE_LISTENER.equals(sportParamsType) && (obj instanceof OnCheckStandListenerWrapper)) {
            LogUtil.a(TAG, "setAiTrainListener, OnCheckStandListenerWrapper, paraData ", obj);
            setPreTrainListener((OnCheckStandListenerWrapper) obj);
        }
        if (SportParamsType.AI_TRAIN_SOURCE_LISTENER.equals(sportParamsType) && (obj instanceof OnTrainSkeletonListenerWrapper)) {
            LogUtil.a(TAG, "setAiTrainListener");
            setAiTrainingListener((OnTrainSkeletonListenerWrapper) obj);
        }
    }

    private void updateAiRopeModelInfo(Object obj) {
        has hasVar = this.mAiModelInfo;
        if (hasVar != null && hasVar.equals(obj)) {
            LogUtil.a(TAG, "mAiModelInfo is not null or not change");
            return;
        }
        this.mAiModelInfo = (has) obj;
        if (this.mHasInitAiModel) {
            setModelInfo();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.AI_ROPE_PARAS.equals(sportParamsType) || SportParamsType.AI_ROPE_INPUT_IMAGE.equals(sportParamsType) || SportParamsType.AI_TRAIN_SOURCE_LISTENER.equals(sportParamsType) || SportParamsType.AI_TRAIN_TEMPLATE_DATA.equals(sportParamsType) || SportParamsType.PRE_STATUS_SOURCE_LISTENER.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1202x5bbc2f4d();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-aitrain-AiTrainModelManager, reason: not valid java name */
    /* synthetic */ void m1202x5bbc2f4d() {
        BaseSportManager.getInstance().setIsAlreadyInit(false);
        initAiTrainProxy();
    }

    private void initAiTrainProxy() {
        try {
            has hasVar = this.mAiModelInfo;
            if (hasVar == null || hasVar.b() == 0 || this.mAiModelInfo.c() == 0) {
                pel.e().c(this.mContext, 1080, 2160, new BaseResponseCallback() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager$$ExternalSyntheticLambda0
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f$0.m1200x97aeb2fe(i, obj);
                    }
                });
            } else {
                pel.e().c(this.mContext, this.mAiModelInfo.b(), this.mAiModelInfo.c(), new BaseResponseCallback() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager$$ExternalSyntheticLambda1
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f$0.m1201x341caf5d(i, obj);
                    }
                });
                this.mHasInitAiModel = true;
                setModelInfoAfterInit();
            }
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "onPreSport");
            ReleaseLogUtil.a(TAG, "onPreSport() error: ", LogAnonymous.b(e));
        }
        this.mInitModelStatus = 0;
        BaseSportManager.getInstance().setIsAlreadyInit(this.mInitModelStatus == 0);
    }

    /* JADX INFO: renamed from: lambda$initAiTrainProxy$1$com-huawei-health-sportservice-manager-aitrain-AiTrainModelManager, reason: not valid java name */
    /* synthetic */ void m1200x97aeb2fe(int i, Object obj) {
        this.mInitModelStatus = i;
    }

    /* JADX INFO: renamed from: lambda$initAiTrainProxy$2$com-huawei-health-sportservice-manager-aitrain-AiTrainModelManager, reason: not valid java name */
    /* synthetic */ void m1201x341caf5d(int i, Object obj) {
        this.mInitModelStatus = i;
    }

    public void setImage(Image image) {
        try {
            pel.e().a(image);
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "setImage");
            ReleaseLogUtil.a(TAG, "setImage() error: ", LogAnonymous.b(e));
        }
    }

    private void setModelInfoAfterInit() {
        has hasVar = this.mLastAiModelInfo;
        if (hasVar != null && hasVar.equals(this.mAiModelInfo)) {
            LogUtil.a(TAG, "mLastAiModelInfo equals mAiModelInfo");
        } else {
            setModelInfo();
        }
    }

    private int setModelInfo() {
        has hasVar = this.mAiModelInfo;
        if (hasVar == null) {
            LogUtil.a(TAG, "mAiModelInfo == null");
            return 1;
        }
        try {
            this.mLastAiModelInfo = hasVar;
            pel.e().c(this.mAiModelInfo.b(), this.mAiModelInfo.c(), this.mAiModelInfo.a(), new BaseResponseCallback() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager$$ExternalSyntheticLambda4
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    AiTrainModelManager.lambda$setModelInfo$3(i, obj);
                }
            });
            return 0;
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "setModelInfo");
            ReleaseLogUtil.a(TAG, "setModelInfo() error: ", LogAnonymous.b(e));
            this.mLastAiModelInfo = null;
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
        pel.e().b(new BaseResponseCallback() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager$$ExternalSyntheticLambda2
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                AiTrainModelManager.lambda$unloadModel$4(i, (Boolean) obj);
            }
        });
    }

    private void setPreTrainListener(OnCheckStandListenerWrapper onCheckStandListenerWrapper) {
        if (onCheckStandListenerWrapper != null) {
            try {
                pel.e().b(onCheckStandListenerWrapper);
                LogUtil.a(TAG, "setAiTrainListener");
            } catch (Exception | UnsatisfiedLinkError e) {
                uploadErrorMessage(e, "setAiTrainListener");
                ReleaseLogUtil.a(TAG, "setAiTrainListener error: ", LogAnonymous.b(e));
            }
        }
    }

    private void setAiTrainingListener(OnTrainSkeletonListenerWrapper onTrainSkeletonListenerWrapper) {
        if (onTrainSkeletonListenerWrapper != null) {
            try {
                pel.e().b((OnCheckStandListenerWrapper) null);
                pel.e().d(onTrainSkeletonListenerWrapper);
            } catch (Exception | UnsatisfiedLinkError e) {
                uploadErrorMessage(e, "setAiTrainListener");
                ReleaseLogUtil.a(TAG, "setAiTrainListener error: ", LogAnonymous.b(e));
            }
        }
    }

    private void setAiTrainTemplateAndType(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                LogUtil.a(TAG, "setAiTrainTemplateAndType");
                pel.e().b(str, new BaseResponseCallback<Integer>() { // from class: com.huawei.health.sportservice.manager.aitrain.AiTrainModelManager.1
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public void onResponse(int i, Integer num) {
                        LogUtil.a(AiTrainModelManager.TAG, "errorCode ", Integer.valueOf(i), " data ", num);
                    }
                });
            }
            pel.e().a(1);
        } catch (Exception | UnsatisfiedLinkError e) {
            uploadErrorMessage(e, "setAiTrainTemplateAndType");
            ReleaseLogUtil.a(TAG, "setAiTrainTemplateAndType error: ", LogAnonymous.b(e));
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
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("AITrainModelManagerException", str + "_" + strD);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a(TAG, "onResumeSport()");
        pel.e().d();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a(TAG, "onPauseSport()");
        pel.e().a();
    }
}
