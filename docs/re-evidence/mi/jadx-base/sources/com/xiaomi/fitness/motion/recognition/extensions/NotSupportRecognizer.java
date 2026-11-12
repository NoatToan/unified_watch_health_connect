package com.xiaomi.fitness.motion.recognition.extensions;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J3\u0010\u0015\u001a\u00020\u000f2)\u0010\u0016\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/extensions/NotSupportRecognizer;", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "<init>", "()V", "isSupport", "", "()Z", "value", "isEnable", "setEnable", "(Z)V", StatConstants.PARAM_START, "getStart", "setStart", "initialize", "", "context", "Landroid/content/Context;", "sleepTime", "", "wakeupTime", "setOnRecognizeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "Lkotlin/ParameterName;", "name", "result", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotSupportRecognizer implements MotionRecognizer {
    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean getStart() {
        return false;
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void initialize(@NotNull Context context, long sleepTime, long wakeupTime) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean isEnable() {
        return false;
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public boolean isSupport() {
        return false;
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setEnable(boolean z) {
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setOnRecognizeListener(@NotNull Function1<? super List<SceneResult>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.motion.recognition.MotionRecognizer
    public void setStart(boolean z) {
    }
}
