package com.xiaomi.fitness.motion.recognition;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionScheduler;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J3\u0010\u0019\u001a\u00020\b2)\u0010\u001a\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\u0018\u0010$\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016R$\u0010\u0004\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR$\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u001e\u001a\u00020\u001f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/MotionRecognizerImpl;", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizerInternal;", "<init>", "()V", "mListener", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "", "isSupport", "", "()Z", "value", "isEnable", "setEnable", "(Z)V", StatConstants.PARAM_START, "getStart", "setStart", "initialize", "context", "Landroid/content/Context;", "sleepTime", "", "wakeupTime", "setOnRecognizeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "result", "stepProvider", "Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "getStepProvider", "()Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "setStepProvider", "(Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;)V", "notifyResultListener", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionRecognizerImpl implements MotionRecognizerInternal {

    @Nullable
    private Function1<? super List<SceneResult>, Unit> mListener;
    public SceneStepProvider stepProvider;

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean getStart() {
        return SceneRecogConfiguration.INSTANCE.getAnalyzeEnable();
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizerInternal
    @NotNull
    public SceneStepProvider getStepProvider() {
        SceneStepProvider sceneStepProvider = this.stepProvider;
        if (sceneStepProvider != null) {
            return sceneStepProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stepProvider");
        return null;
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void initialize(@NotNull Context context, long sleepTime, long wakeupTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        SceneRecognitionScheduler.INSTANCE.initializeScheduler(context, sleepTime, wakeupTime);
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean isEnable() {
        return isSupport() && SceneRecogConfiguration.INSTANCE.getAiMotorPerceptionEnable();
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean isSupport() {
        return RomUtils.INSTANCE.isMiui() && HarSensorHelper.INSTANCE.supportSceneRecognition(ApplicationExtKt.getApplication());
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizerInternal
    public void notifyResultListener(@Nullable List<SceneResult> result) {
        Function1<? super List<SceneResult>, Unit> function1 = this.mListener;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setEnable(boolean z) {
        SceneRecogConfiguration.INSTANCE.setAiMotorPerceptionEnable(ApplicationExtKt.getApplication(), z);
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setOnRecognizeListener(@NotNull Function1<? super List<SceneResult>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setStart(boolean z) {
        AnyExtKt.main$default(null, new MotionRecognizerImpl$start$1(z, null), 1, null);
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizerInternal
    public void setStepProvider(@NotNull SceneStepProvider sceneStepProvider) {
        Intrinsics.checkNotNullParameter(sceneStepProvider, "<set-?>");
        this.stepProvider = sceneStepProvider;
    }
}
