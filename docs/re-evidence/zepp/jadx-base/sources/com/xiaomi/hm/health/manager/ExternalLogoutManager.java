package com.xiaomi.hm.health.manager;

import com.huami.account.bean.LogoutSyncTask;
import com.huami.phn.logic.PHNDataUploadAndCleanLogic;
import com.huami.watch.companion.account.AccountLogoutHelper;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.manager.ExternalLogoutManager;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.resprate.RespRateUseCaseUtils;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class ExternalLogoutManager {
    public static void clearAllWeightInfos() {
        WeightGoalManager.getInstance().cleanAllInfosLocal();
        UserInfoManager.getManager().cleanAllInfosLocal();
        WeightInfoManager.getManager().cleanAllInfosLocal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g() {
        return Boolean.valueOf(HMSportWebAPI.uploadDateDatas(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean h() {
        return Boolean.valueOf(HMSportWebAPI.uploadManualData(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i() {
        return Boolean.valueOf(HRDataManager.getInstance().syncToServerInSyncWay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean j() {
        return Boolean.valueOf(TrainingHistoryHelper.getInstance().syncAllUnSyncedTrainingHistoryRecordInSyncWay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean k() {
        return Boolean.valueOf(AccountLogoutHelper.getHelper().onSyncData(BraceletApp.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean l() {
        return Boolean.valueOf(HmEarbudWebApi.INSTANCE.updateDateDatas(true));
    }

    public static List<LogoutSyncTask> syncDataWhenLogout() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LogoutSyncTask("200312000", "上传体重数据", new Function0() { // from class: ay1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(HMWeightUtils.syncToServer());
            }
        }));
        arrayList.add(new LogoutSyncTask("200312001", "上传活动数据", new Function0() { // from class: ky1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.g();
            }
        }));
        arrayList.add(new LogoutSyncTask("200312002", "上传手动添加数据", new Function0() { // from class: ly1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.h();
            }
        }));
        arrayList.add(new LogoutSyncTask("200312003", "上传心率数据", new Function0() { // from class: iy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.i();
            }
        }));
        arrayList.add(new LogoutSyncTask("200312006", "上传训练历史记录", new Function0() { // from class: jy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.j();
            }
        }));
        arrayList.add(new LogoutSyncTask("200312007", "上传跑步数据", new Function0() { // from class: cy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(RunningManager.syncGPSSportWhenLogout());
            }
        }));
        arrayList.add(new LogoutSyncTask("200312009", "上传UserProperty数据", new Function0() { // from class: dy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(HMPropertyUtil.syncPropertisToServerWhenLogout());
            }
        }));
        arrayList.add(new LogoutSyncTask("200312010", "上传手助数据", new Function0() { // from class: hy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.k();
            }
        }));
        arrayList.add(new LogoutSyncTask("200312011", "上传耳机数据", new Function0() { // from class: my1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExternalLogoutManager.l();
            }
        }));
        final StressUseCaseUtils stressUseCaseUtils = StressUseCaseUtils.INSTANCE;
        Objects.requireNonNull(stressUseCaseUtils);
        arrayList.add(new LogoutSyncTask("200312012", "上传压力数据", new Function0() { // from class: gy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(stressUseCaseUtils.uploadDataToServerBySync());
            }
        }));
        arrayList.add(new LogoutSyncTask("200312013", "上传血氧数据", new Function0() { // from class: by1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(Spo2Proxy.uploadData());
            }
        }));
        final AtrialFibUseCaseUtils atrialFibUseCaseUtils = AtrialFibUseCaseUtils.INSTANCE;
        Objects.requireNonNull(atrialFibUseCaseUtils);
        arrayList.add(new LogoutSyncTask("200312014", "上传房颤PPG数据", new Function0() { // from class: ey1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(atrialFibUseCaseUtils.uploadDataToServerBySync());
            }
        }));
        final RespRateUseCaseUtils respRateUseCaseUtils = RespRateUseCaseUtils.INSTANCE;
        Objects.requireNonNull(respRateUseCaseUtils);
        arrayList.add(new LogoutSyncTask("200312015", "上传呼吸率数据", new Function0() { // from class: fy1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(respRateUseCaseUtils.uploadRepRateData());
            }
        }));
        final PHNDataUploadAndCleanLogic pHNDataUploadAndCleanLogic = PHNDataUploadAndCleanLogic.INSTANCE;
        Objects.requireNonNull(pHNDataUploadAndCleanLogic);
        arrayList.add(new LogoutSyncTask("200312016", "上传PHN运动教练相关数据", new Function0() { // from class: zx1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return Boolean.valueOf(pHNDataUploadAndCleanLogic.uploadUnSyncedPHNData());
            }
        }));
        return arrayList;
    }
}
