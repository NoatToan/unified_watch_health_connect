package com.xiaomi.fitness.motion.recognition.convert;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.motion.recognition.pressure.AirPressure;
import com.xiaomi.fitness.motion.recognition.pressure.PressureSegment;
import com.xiaomi.har.entity.ActivityEntity;
import defpackage.o7i;
import defpackage.wtl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0007J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\r\u0010\u0007J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\u0010\u0010\u0007J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/convert/BeanUtils;", "", "", "Lcom/xiaomi/fitness/motion/recognition/pressure/AirPressure;", "list", "Lo7i;", "convertPressureEntityList", "(Ljava/util/List;)Ljava/util/List;", "entityList", "convertPressureList", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;", "data", "Lwtl;", "convertToHarSensorEvent", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "Lcom/xiaomi/har/entity/ActivityEntity;", "convertToHarActivityEntity", "", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "isPossible", "convertSceneResult", "(Ljava/util/List;ZZ)Ljava/util/List;", "Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;", "convertToPressureEntity", "pressures", "", "convertToHarAltitudes", "(Ljava/util/List;)[F", "<init>", "()V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBeanUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeanUtils.kt\ncom/xiaomi/fitness/motion/recognition/convert/BeanUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1557#2:126\n1628#2,3:127\n*S KotlinDebug\n*F\n+ 1 BeanUtils.kt\ncom/xiaomi/fitness/motion/recognition/convert/BeanUtils\n*L\n16#1:126\n16#1:127,3\n*E\n"})
public final class BeanUtils {

    @NotNull
    public static final BeanUtils INSTANCE = new BeanUtils();

    private BeanUtils() {
    }

    private final List<o7i> convertPressureEntityList(List<AirPressure> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AirPressure airPressure : list) {
                arrayList.add(new o7i(airPressure.getTime(), airPressure.getPressure(), airPressure.getAltitude()));
            }
        }
        return arrayList;
    }

    private final List<AirPressure> convertPressureList(List<? extends o7i> entityList) {
        ArrayList arrayList = new ArrayList();
        for (o7i o7iVar : entityList) {
            arrayList.add(new AirPressure(o7iVar.c(), o7iVar.b(), o7iVar.a()));
        }
        return arrayList;
    }

    @NotNull
    public final List<SceneResult> convertSceneResult(@NotNull List<? extends ActivityEntity> data, boolean isComplete, boolean isPossible) {
        Intrinsics.checkNotNullParameter(data, "data");
        LinkedList linkedList = new LinkedList();
        for (ActivityEntity activityEntity : data) {
            SceneResult sceneResult = new SceneResult();
            sceneResult.setComplete(isComplete);
            sceneResult.setActType(activityEntity.getActType().intValue());
            sceneResult.setStart(activityEntity.getStart().longValue());
            sceneResult.setEnd(activityEntity.getEnd());
            sceneResult.setStepCount(activityEntity.getStepCount());
            sceneResult.setContinued(activityEntity.getContinued().longValue());
            sceneResult.setStepEntities(activityEntity.getStepEntities());
            sceneResult.setPossible(isPossible);
            PressureSegment pressureSegment = new PressureSegment();
            pressureSegment.setAltitudeDiff(activityEntity.getUpHeight());
            pressureSegment.setTotalUpAltitude(activityEntity.getTotalUpAltitude());
            pressureSegment.setTotalDownAltitude(activityEntity.getTotalDownAltitude());
            pressureSegment.setPressureStart(activityEntity.getPressureStart());
            pressureSegment.setPressureEnd(activityEntity.getPressureEnd());
            pressureSegment.setPressureDiff(activityEntity.getPressureDiff());
            List<o7i> pressures = activityEntity.getPressures();
            Intrinsics.checkNotNullExpressionValue(pressures, "getPressures(...)");
            pressureSegment.setPressures(convertPressureList(pressures));
            sceneResult.setPressureSegment(pressureSegment);
            linkedList.add(sceneResult);
        }
        return linkedList;
    }

    @NotNull
    public final List<ActivityEntity> convertToHarActivityEntity(@NotNull List<SceneResult> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LinkedList linkedList = new LinkedList();
        for (SceneResult sceneResult : data) {
            PressureSegment pressureSegment = sceneResult.getPressureSegment();
            linkedList.add(pressureSegment != null ? new ActivityEntity(sceneResult.getActType(), sceneResult.getContinued(), sceneResult.getStart(), sceneResult.getEnd(), sceneResult.getStepCount(), pressureSegment.getPressureDiff(), pressureSegment.getPressureStart(), pressureSegment.getPressureEnd(), convertPressureEntityList(pressureSegment.getPressures())) : new ActivityEntity(sceneResult.getActType(), sceneResult.getContinued(), sceneResult.getStart(), sceneResult.getEnd(), sceneResult.getStepCount()));
        }
        return linkedList;
    }

    @NotNull
    public final float[] convertToHarAltitudes(@NotNull List<? extends o7i> pressures) {
        Intrinsics.checkNotNullParameter(pressures, "pressures");
        float[] fArr = new float[pressures.size()];
        float fA = pressures.get(0).a();
        int size = pressures.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = pressures.get(i).a() - fA;
        }
        return fArr;
    }

    @NotNull
    public final List<wtl> convertToHarSensorEvent(@NotNull List<SceneEvent> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<SceneEvent> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SceneEvent sceneEvent : list) {
            arrayList.add(new wtl(sceneEvent.getSceneTime(), sceneEvent.getSceneType(), sceneEvent.getSceneAccuracy(), sceneEvent.getScenePressure()));
        }
        return arrayList;
    }

    @NotNull
    public final List<o7i> convertToPressureEntity(@NotNull List<ScenePressureEvent> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LinkedList linkedList = new LinkedList();
        for (ScenePressureEvent scenePressureEvent : data) {
            o7i o7iVar = new o7i();
            o7iVar.f(scenePressureEvent.getTime());
            o7iVar.e(scenePressureEvent.getPressure());
            linkedList.add(o7iVar);
        }
        return linkedList;
    }
}
