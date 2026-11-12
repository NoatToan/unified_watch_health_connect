package com.xiaomi.fitness.motion.recognition.collection;

import android.content.Context;
import android.hardware.SensorEvent;
import android.os.Handler;
import com.mi.health.scenerecognition.collection.SceneCollector;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.SceneRepository;
import com.xiaomi.fitness.motion.recognition.collection.SceneCollectManager;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionScheduler;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.jrd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 *2\u00020\u0001:\u0002*+B\t\b\u0002¢\u0006\u0004\b)\u0010\u0016J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "Ljrd;", "Landroid/content/Context;", "context", "", "timestamp", "Landroid/hardware/SensorEvent;", "event", "", "writeSensorData", "(Landroid/content/Context;JLandroid/hardware/SensorEvent;)V", "", "getDataType", "(Landroid/hardware/SensorEvent;)I", "writeHarEvent", "", "getPressure", "(Landroid/content/Context;Landroid/hardware/SensorEvent;)F", "writePressureEvent", StatConstants.PARAM_START, "(Landroid/content/Context;)V", "forceFlushHarSensor", "()V", BroadcastsKt.SILENT_PUSHING_STOP, "Lcom/mi/health/scenerecognition/collection/SceneCollector;", "mCollector", "Lcom/mi/health/scenerecognition/collection/SceneCollector;", "Lcom/xiaomi/fitness/motion/recognition/SceneRepository;", "mSceneRepository", "Lcom/xiaomi/fitness/motion/recognition/SceneRepository;", "", "value", "isStart", "Z", "()Z", "startTimeMills", "J", "lastSceneType", "I", "lastPressure", "F", "<init>", "Companion", "ClassHolder", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SceneCollectManager implements jrd {
    private static final int DATA_TYPE_HAR = 0;
    private static final int DATA_TYPE_PRESSURE = 1;
    private boolean isStart;
    private float lastPressure;
    private int lastSceneType;

    @NotNull
    private final SceneCollector mCollector;

    @NotNull
    private final SceneRepository mSceneRepository;
    private long startTimeMills;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SceneCollectManager instance = ClassHolder.INSTANCE.getHolder();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager$ClassHolder;", "", "<init>", "()V", "holder", "Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "getHolder", "()Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClassHolder {

        @NotNull
        public static final ClassHolder INSTANCE = new ClassHolder();

        @NotNull
        private static final SceneCollectManager holder = new SceneCollectManager(null);

        private ClassHolder() {
        }

        @NotNull
        public final SceneCollectManager getHolder() {
            return holder;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager$Companion;", "", "<init>", "()V", "DATA_TYPE_HAR", "", "DATA_TYPE_PRESSURE", "instance", "Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "getInstance", "()Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SceneCollectManager getInstance() {
            return SceneCollectManager.instance;
        }
    }

    public /* synthetic */ SceneCollectManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int getDataType(SensorEvent event) {
        float[] fArr = event.values;
        if (fArr.length >= 4) {
            return (int) fArr[2];
        }
        return 0;
    }

    private final float getPressure(Context context, SensorEvent event) {
        if (HarSensorHelper.INSTANCE.supportPressureSensor(context)) {
            float[] fArr = event.values;
            if (fArr.length >= 4) {
                return fArr[3];
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start$lambda$0(SceneCollectManager this$0, Context context, long j, SensorEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.writeSensorData(context, j, event);
        if (event.sensor.getType() == 33171070 && j - this$0.startTimeMills >= SceneRecogConfiguration.INSTANCE.getSCHEDULE_UPDATE_DURATION()) {
            SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
            sceneRecognitionScheduler.onHandleAction(context, sceneRecognitionScheduler.getACTION_SCHEDULE_UPDATE_DURATION());
            this$0.startTimeMills = j;
        }
        return Unit.INSTANCE;
    }

    private final void writeHarEvent(Context context, long timestamp, SensorEvent event) {
        float[] fArr = event.values;
        int i = (int) fArr[0];
        float f = fArr[1];
        int i2 = this.lastSceneType;
        StringBuilder sb = new StringBuilder();
        sb.append("writeHarEvent: ");
        sb.append(i2);
        sb.append(">>");
        sb.append(i);
        if (this.lastSceneType != i) {
            SceneEvent sceneEvent = new SceneEvent();
            sceneEvent.setSceneTime(timestamp);
            sceneEvent.setSceneType(i);
            sceneEvent.setSceneAccuracy(f);
            sceneEvent.setScenePressure(getPressure(context, event));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("writeHarEvent: ");
            sb2.append(sceneEvent);
            this.mSceneRepository.insert(sceneEvent);
            this.lastSceneType = i;
        }
    }

    private final void writePressureEvent(Context context, long timestamp, SensorEvent event) {
        float pressure = getPressure(context, event);
        if (pressure <= 0.0f || this.lastPressure == pressure) {
            return;
        }
        ScenePressureEvent scenePressureEvent = new ScenePressureEvent();
        scenePressureEvent.setTime(timestamp);
        scenePressureEvent.setPressure(pressure);
        this.mSceneRepository.insertPressure(scenePressureEvent);
        this.lastPressure = pressure;
    }

    private final void writeSensorData(final Context context, final long timestamp, final SensorEvent event) {
        getJobHandler(new Handler.Callback[0]).newJob().post(new Runnable() { // from class: gel
            @Override // java.lang.Runnable
            public final void run() {
                SceneCollectManager.writeSensorData$lambda$1(this.f18896a, event, context, timestamp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeSensorData$lambda$1(SceneCollectManager this$0, SensorEvent event, Context context, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(context, "$context");
        int dataType = this$0.getDataType(event);
        SceneUtils.INSTANCE.sceneRecoTrace("writeSensorData:type=" + dataType);
        if (dataType == 0) {
            this$0.writeHarEvent(context, j, event);
        } else {
            if (dataType != 1) {
                return;
            }
            this$0.writePressureEvent(context, j, event);
        }
    }

    public final void forceFlushHarSensor() {
        this.mCollector.forceFlushHarSensor();
    }

    @Override // defpackage.jrd
    public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return super.getJobHandler(callbackArr);
    }

    /* JADX INFO: renamed from: isStart, reason: from getter */
    public final boolean getIsStart() {
        return this.isStart;
    }

    public final void start(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isStart = true;
        this.startTimeMills = System.currentTimeMillis();
        this.mCollector.start(context, new Function2() { // from class: fel
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SceneCollectManager.start$lambda$0(this.f17709a, context, ((Long) obj).longValue(), (SensorEvent) obj2);
            }
        });
    }

    public final void stop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isStart = false;
        forceFlushHarSensor();
        this.mCollector.stop(context);
    }

    private SceneCollectManager() {
        this.mCollector = new SceneCollector();
        this.mSceneRepository = SceneRepository.INSTANCE.getInstance();
        this.startTimeMills = -1L;
        this.lastSceneType = -1;
    }
}
