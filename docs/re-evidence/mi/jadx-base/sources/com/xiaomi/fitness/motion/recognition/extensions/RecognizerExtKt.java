package com.xiaomi.fitness.motion.recognition.extensions;

import com.xiaomi.fitness.instance.InstanceExtKt;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer$Companion;", "getInstance", "(Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer$Companion;)Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "instance$delegate", "Lkotlin/Lazy;", "motion-recognition_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecognizerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kjj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecognizerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final MotionRecognizer getInstance(@NotNull MotionRecognizer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (MotionRecognizer) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionRecognizer instance_delegate$lambda$0() {
        MotionRecognizer motionRecognizer = (MotionRecognizer) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(MotionRecognizer.class));
        return motionRecognizer == null ? new NotSupportRecognizer() : motionRecognizer;
    }
}
