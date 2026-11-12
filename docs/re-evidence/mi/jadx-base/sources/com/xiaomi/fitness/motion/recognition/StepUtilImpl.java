package com.xiaomi.fitness.motion.recognition;

import com.xiaomi.fitness.motion.recognition.StepUtilImpl;
import com.xiaomi.fitness.motion.recognition.extensions.SensorExtKt;
import com.xiaomi.har.entity.ActivityEntity;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import defpackage.deo;
import defpackage.hfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/StepUtilImpl;", "Lhfo;", "", "p0", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "", "Ldeo;", "getStepsCount", "(JJ)Ljava/util/List;", "Lcom/xiaomi/har/entity/ActivityEntity;", "getActsByTime", "Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "provider$delegate", "Lkotlin/Lazy;", "getProvider", "()Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "provider", "<init>", "()V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSceneStepProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneStepProvider.kt\ncom/xiaomi/fitness/motion/recognition/StepUtilImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n1557#2:32\n1628#2,3:33\n*S KotlinDebug\n*F\n+ 1 SceneStepProvider.kt\ncom/xiaomi/fitness/motion/recognition/StepUtilImpl\n*L\n15#1:28\n15#1:29,3\n21#1:32\n21#1:33,3\n*E\n"})
public final class StepUtilImpl implements hfo {

    /* JADX INFO: renamed from: provider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy provider = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ifo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StepUtilImpl.provider_delegate$lambda$0();
        }
    });

    private final SceneStepProvider getProvider() {
        return (SceneStepProvider) this.provider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneStepProvider provider_delegate$lambda$0() {
        return SensorExtKt.getInstance(MotionRecognizerInternal.INSTANCE).getStepProvider();
    }

    @Override // defpackage.hfo
    public /* bridge */ /* synthetic */ List getActsByTime(Long l, Long l2) {
        return getActsByTime(l.longValue(), l2.longValue());
    }

    @Override // defpackage.hfo
    public /* bridge */ /* synthetic */ List getStepsCount(Long l, Long l2) {
        return getStepsCount(l.longValue(), l2.longValue());
    }

    @NotNull
    public List<ActivityEntity> getActsByTime(long p0, long p1) {
        List<Step> actsByTime = getProvider().getActsByTime(p0, p1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(actsByTime, 10));
        for (Step step : actsByTime) {
            ActivityEntity activityEntity = new ActivityEntity(0, step.getStart(), step.getEnd());
            activityEntity.setStepCount(step.getSteps());
            arrayList.add(activityEntity);
        }
        return arrayList;
    }

    @NotNull
    public List<deo> getStepsCount(long p0, long p1) {
        List<Step> stepCount = getProvider().getStepCount(p0, p1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stepCount, 10));
        for (Step step : stepCount) {
            arrayList.add(new deo(step.getStart(), step.getEnd(), step.getActType(), step.getSteps()));
        }
        return arrayList;
    }
}
