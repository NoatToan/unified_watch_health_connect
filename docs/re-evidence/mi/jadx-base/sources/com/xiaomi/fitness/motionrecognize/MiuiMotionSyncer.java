package com.xiaomi.fitness.motionrecognize;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.motion.recognition.SceneType;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.motionrecognize.MiuiMotionSyncer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0012\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/motionrecognize/MiuiMotionSyncer;", "", "<init>", "()V", "TAG", "", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getUserInfoMgr", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr$delegate", "Lkotlin/Lazy;", "recorder", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getRecorder", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recorder$delegate", "onReceiverMotionResult", "", "motionList", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "computeActiveStageAndMHIntensity", "convertToActiveStageItem", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "sceneResult", "isMale", "", "height", "", "weight", "checkValid", "item", "convertToActiveStageType", "", "sceneType", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiuiMotionSyncer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiMotionSyncer.kt\ncom/xiaomi/fitness/motionrecognize/MiuiMotionSyncer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,119:1\n1863#2,2:120\n37#3:122\n36#3,3:123\n*S KotlinDebug\n*F\n+ 1 MiuiMotionSyncer.kt\ncom/xiaomi/fitness/motionrecognize/MiuiMotionSyncer\n*L\n51#1:120,2\n66#1:122\n66#1:123,3\n*E\n"})
public final class MiuiMotionSyncer {

    @NotNull
    private final String TAG = "MiuiMotionSyncer";

    /* JADX INFO: renamed from: userInfoMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiMotionSyncer.userInfoMgr_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiMotionSyncer.recorder_delegate$lambda$1();
        }
    });

    public MiuiMotionSyncer() {
        FitnessLogUtils.d("MiuiMotionSyncer", "MiuiMotionSyncer inited");
    }

    private final boolean checkValid(ActiveStageItem item) {
        Integer steps;
        int type = item.getType();
        if (type != 1) {
            if ((type == 2 || type == 3) && ((steps = item.getSteps()) == null || steps.intValue() <= 0)) {
                return false;
            }
        } else if (item.getDistance() <= 0) {
            return false;
        }
        return true;
    }

    private final void computeActiveStageAndMHIntensity(List<SceneResult> motionList) {
        List<SceneResult> list = motionList;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "no motion");
            return;
        }
        FitnessLogUtils.i(this.TAG, "motion size = " + motionList.size());
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getUserInfoMgr(), false, 1, null);
        boolean zEquals = StringsKt__StringsJVMKt.equals(userProfile$default.getSexOrDefault(), "male", false);
        ArrayList arrayList = new ArrayList();
        for (SceneResult sceneResult : motionList) {
            FitnessLogUtils.i(this.TAG, "src motion result = " + sceneResult);
            ActiveStageItem activeStageItemConvertToActiveStageItem = convertToActiveStageItem(sceneResult, zEquals, userProfile$default.getHeight(), userProfile$default.getWeight());
            if (checkValid(activeStageItemConvertToActiveStageItem)) {
                arrayList.add(activeStageItemConvertToActiveStageItem);
            }
            FitnessLogUtils.i(this.TAG, "dest activeStageItem = " + activeStageItemConvertToActiveStageItem);
        }
        if (!arrayList.isEmpty()) {
            String currentPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
            FitnessDataRecorder recorder = getRecorder();
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            ActiveStageItem[] activeStageItemArr = (ActiveStageItem[]) arrayList.toArray(new ActiveStageItem[0]);
            recorder.recordActiveStage(currentPhoneSid, currentTZOffsetInSec, (ActiveStageItem[]) Arrays.copyOf(activeStageItemArr, activeStageItemArr.length));
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "miui_function_motion", null, 4, null);
        }
    }

    private final ActiveStageItem convertToActiveStageItem(SceneResult sceneResult, boolean isMale, float height, float weight) {
        int iConvertToActiveStageType = convertToActiveStageType(sceneResult.getActType());
        MiuiMotionCalculator miuiMotionCalculator = MiuiMotionCalculator.INSTANCE;
        long j = 1000;
        return new ActiveStageItem(sceneResult.getStart() / j, sceneResult.getEnd() / j, iConvertToActiveStageType, Integer.valueOf(sceneResult.getStepCount()), MathKt__MathJVMKt.roundToInt(miuiMotionCalculator.getDistance(sceneResult.getActType(), sceneResult.getStepCount(), sceneResult.getDuration(), height, isMale)), MathKt__MathJVMKt.roundToInt(miuiMotionCalculator.getCalories(sceneResult.getActType(), sceneResult.getStepCount(), sceneResult.getDuration(), height, isMale, weight)));
    }

    private final int convertToActiveStageType(@SceneType int sceneType) {
        if (sceneType == 1) {
            return 1;
        }
        if (sceneType == 2) {
            return 2;
        }
        if (sceneType != 3) {
            return sceneType != 4 ? 0 : 3;
        }
        return 4;
    }

    private final FitnessDataRecorder getRecorder() {
        return (FitnessDataRecorder) this.recorder.getValue();
    }

    private final UserInfoManager getUserInfoMgr() {
        return (UserInfoManager) this.userInfoMgr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceiverMotionResult$lambda$2(MiuiMotionSyncer this$0, List motionList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(motionList, "$motionList");
        this$0.computeActiveStageAndMHIntensity(motionList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder recorder_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoManager userInfoMgr_delegate$lambda$0() {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    }

    public final void onReceiverMotionResult(@NotNull final List<SceneResult> motionList) {
        Intrinsics.checkNotNullParameter(motionList, "motionList");
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt == null || !RegionExtKt.isRegionSelected(regionExtKt)) {
            FitnessLogUtils.i(this.TAG, "receive scene motion result, but has no region");
        } else {
            ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: i6g
                @Override // java.lang.Runnable
                public final void run() {
                    MiuiMotionSyncer.onReceiverMotionResult$lambda$2(this.f20833a, motionList);
                }
            });
        }
    }
}
