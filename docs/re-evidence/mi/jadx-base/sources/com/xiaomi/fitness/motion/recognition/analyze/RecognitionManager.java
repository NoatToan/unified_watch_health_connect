package com.xiaomi.fitness.motion.recognition.analyze;

import android.content.Context;
import android.os.Handler;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.motion.recognition.ISceneRepository;
import com.xiaomi.fitness.motion.recognition.MotionRecognizerInternal;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.SceneRepository;
import com.xiaomi.fitness.motion.recognition.StepUtilImpl;
import com.xiaomi.fitness.motion.recognition.analyze.RecognitionManager;
import com.xiaomi.fitness.motion.recognition.convert.BeanUtils;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.motion.recognition.extensions.SensorExtKt;
import com.xiaomi.fitness.motion.recognition.stat.SceneRecognitionStatHelper;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import com.xiaomi.har.entity.ActivityEntity;
import defpackage.elb;
import defpackage.i71;
import defpackage.jrd;
import defpackage.o7i;
import defpackage.wtl;
import defpackage.zg0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager;", "Ljrd;", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "sceneResultList", "Landroid/content/Context;", "context", "", "insertExerciseRecord", "(Ljava/util/List;Landroid/content/Context;)V", "", "startTime", "endTime", "startAnalyze", "(Landroid/content/Context;JJ)V", "", "hasJob", "Z", "<init>", "()V", "Companion", "AnalyzeRunnable", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecognitionManager implements jrd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long MAX_DELAY = TimeUnit.SECONDS.toMillis(30);

    @NotNull
    private static final Lazy<RecognitionManager> instance$delegate = LazyKt__LazyJVMKt.lazy(RecognitionManager.class, new Function0() { // from class: ajj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecognitionManager.instance_delegate$lambda$2();
        }
    });
    private volatile boolean hasJob;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager$Companion;", "", "<init>", "()V", "MAX_DELAY", "", "instance", "Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager;", "getInstance", "()Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager;", "instance$delegate", "Lkotlin/Lazy;", "startAnalyzeByStep", "", "context", "Landroid/content/Context;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RecognitionManager getInstance() {
            return (RecognitionManager) RecognitionManager.instance$delegate.getValue();
        }

        public final void startAnalyzeByStep(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SceneRecogConfiguration sceneRecogConfiguration = SceneRecogConfiguration.INSTANCE;
            getInstance().startAnalyze(context, Math.max(sceneRecogConfiguration.getLastSceneRecognizeEnd(), SceneRecogConfiguration.getLastMotorPerceptionStop() - sceneRecogConfiguration.getOFFSET_OF_STOP_TIME_FOR_ANALYZE()), System.currentTimeMillis());
        }
    }

    private RecognitionManager() {
    }

    private final void insertExerciseRecord(List<SceneResult> sceneResultList, Context context) {
        SensorExtKt.getInstance(MotionRecognizerInternal.INSTANCE).notifyResultListener(sceneResultList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecognitionManager instance_delegate$lambda$2() {
        return new RecognitionManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnalyze$lambda$1(final RecognitionManager this$0, final Context context, long j, final long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.hasJob = false;
        new AnalyzeRunnable(context, j, j2, new Function1() { // from class: bjj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecognitionManager.startAnalyze$lambda$1$lambda$0(this.f4288a, context, j2, (List) obj);
            }
        }).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startAnalyze$lambda$1$lambda$0(RecognitionManager this$0, Context context, long j, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.insertExerciseRecord(list, context);
        SceneAnalyzeStateDispatch.INSTANCE.markAnalyzeState(context, 2, j + 1);
        return Unit.INSTANCE;
    }

    @Override // defpackage.jrd
    public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return super.getJobHandler(callbackArr);
    }

    public final void startAnalyze(@NotNull final Context context, final long startTime, final long endTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        SceneUtils.INSTANCE.sceneRecoTrace("start analyze from " + startTime + " to " + endTime);
        if (this.hasJob || !SceneRecogConfiguration.INSTANCE.getAnalyzeEnable()) {
            return;
        }
        this.hasJob = true;
        getJobHandler(new Handler.Callback[0]).newJob().postDelayed(new Runnable() { // from class: cjj
            @Override // java.lang.Runnable
            public final void run() {
                RecognitionManager.startAnalyze$lambda$1(this.f5407a, context, startTime, endTime);
            }
        }, MAX_DELAY);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R(\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager$AnalyzeRunnable;", "Ljava/lang/Runnable;", "Li71;", "analyzeBySceneRecognition", "()Li71;", "analyzeBySteps", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "unCompleteResults", "", "updateUnSceneCompleteResult", "(Ljava/util/List;)V", "deleteUnusedPressureData", "()V", "run", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "startTime", "J", "endTime", "Lkotlin/Function1;", "callback", "Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;", "mSceneRepository", "Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;", "getMSceneRepository", "()Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;", "setMSceneRepository", "(Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;)V", "pressureDeleteEndTime", "<init>", "(Landroid/content/Context;JJLkotlin/jvm/functions/Function1;)V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecognitionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionManager.kt\ncom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager$AnalyzeRunnable\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n37#2:221\n36#2,3:222\n*S KotlinDebug\n*F\n+ 1 RecognitionManager.kt\ncom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager$AnalyzeRunnable\n*L\n84#1:221\n84#1:222,3\n*E\n"})
    public static final class AnalyzeRunnable implements Runnable {

        @NotNull
        private final Function1<List<SceneResult>, Unit> callback;

        @NotNull
        private final Context context;
        private final long endTime;

        @NotNull
        private ISceneRepository mSceneRepository;
        private long pressureDeleteEndTime;
        private final long startTime;

        /* JADX WARN: Multi-variable type inference failed */
        public AnalyzeRunnable(@NotNull Context context, long j, long j2, @NotNull Function1<? super List<SceneResult>, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.startTime = j;
            this.endTime = j2;
            this.callback = callback;
            this.mSceneRepository = SceneRepository.INSTANCE.getInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(List list) {
            return Unit.INSTANCE;
        }

        private final i71 analyzeBySceneRecognition() {
            zg0 zg0Var = new zg0();
            zg0Var.b(new StepUtilImpl());
            SceneAnalyzeStateDispatch sceneAnalyzeStateDispatch = SceneAnalyzeStateDispatch.INSTANCE;
            long sceneEventQueryStartTime = sceneAnalyzeStateDispatch.getSceneEventQueryStartTime(this.context, this.startTime);
            List<SceneEvent> listQuerySceneEvents = this.mSceneRepository.querySceneEvents(sceneEventQueryStartTime, this.endTime);
            Logger.e("AnalyzeRunnable", "analyzeBySceneRecognition: " + CollectionsKt___CollectionsKt.joinToString$default(listQuerySceneEvents, null, null, null, 0, null, null, 63, null));
            BeanUtils beanUtils = BeanUtils.INSTANCE;
            List<wtl> listConvertToHarSensorEvent = beanUtils.convertToHarSensorEvent(listQuerySceneEvents);
            long lastUnCompleteMinStartTime = SceneRecogConfiguration.INSTANCE.getLastUnCompleteMinStartTime(System.currentTimeMillis());
            List<ActivityEntity> listConvertToHarActivityEntity = beanUtils.convertToHarActivityEntity(this.mSceneRepository.queryAllNoCompleteResults(lastUnCompleteMinStartTime, this.startTime));
            List<o7i> listConvertToPressureEntity = HarSensorHelper.INSTANCE.supportPressureSensor(this.context) ? beanUtils.convertToPressureEntity(this.mSceneRepository.queryScenePressureEvents(sceneEventQueryStartTime, this.endTime)) : CollectionsKt__CollectionsKt.emptyList();
            i71 i71VarA = zg0Var.a(listConvertToHarSensorEvent, listConvertToHarActivityEntity, this.startTime, this.endTime, listConvertToPressureEntity);
            Logger.e("AnalyzeRunnable", "analyzeBySceneRecognition: " + i71VarA);
            if (!listQuerySceneEvents.isEmpty()) {
                sceneAnalyzeStateDispatch.markAnalyzeState(this.context, 1, ((SceneEvent) CollectionsKt___CollectionsKt.last((List) listQuerySceneEvents)).getSceneTime());
            }
            this.pressureDeleteEndTime = RangesKt___RangesKt.coerceAtMost(this.startTime, RangesKt___RangesKt.coerceAtMost(sceneEventQueryStartTime, lastUnCompleteMinStartTime)) - TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS();
            SceneUtils.INSTANCE.sceneRecoTrace("sceneRecogManager analyze startTime: " + sceneEventQueryStartTime + "  endTime: " + this.endTime + "  sensorEvent size: " + listConvertToHarSensorEvent.size() + "  unCompleteActivities size: " + listConvertToHarActivityEntity.size() + "  pressureList size: " + listConvertToPressureEntity.size());
            SceneRecognitionStatHelper.INSTANCE.trackSceneRecognitionResult(i71VarA, SceneRecognitionStatHelper.SCENE_RECOGNITION_TYPE);
            return i71VarA;
        }

        private final i71 analyzeBySteps() {
            elb elbVar = new elb();
            elbVar.d(new StepUtilImpl());
            SceneUtils.INSTANCE.sceneRecoTrace("analyzeBySteps startTime: " + this.startTime + "  endTime: " + this.endTime);
            i71 i71VarC = elbVar.c(this.startTime, this.endTime, BeanUtils.INSTANCE.convertToHarActivityEntity(this.mSceneRepository.queryAllNoCompleteResults(SceneRecogConfiguration.INSTANCE.getLastUnCompleteMinStartTime(this.startTime), this.startTime)));
            SceneRecognitionStatHelper.INSTANCE.trackSceneRecognitionResult(i71VarC, "step");
            return i71VarC;
        }

        private final void deleteUnusedPressureData() {
            ExecutorHelper.runInBackground(new Runnable() { // from class: ejj
                @Override // java.lang.Runnable
                public final void run() {
                    RecognitionManager.AnalyzeRunnable.deleteUnusedPressureData$lambda$1(this.f16712a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void deleteUnusedPressureData$lambda$1(AnalyzeRunnable this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mSceneRepository.deleteScenePressureEvents(0L, this$0.pressureDeleteEndTime);
        }

        private final void updateUnSceneCompleteResult(List<SceneResult> unCompleteResults) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!unCompleteResults.isEmpty()) {
                int size = unCompleteResults.size();
                long end = jCurrentTimeMillis;
                for (int i = 0; i < size; i++) {
                    SceneResult sceneResult = unCompleteResults.get(i);
                    if (sceneResult.getStart() < jCurrentTimeMillis) {
                        jCurrentTimeMillis = sceneResult.getStart();
                    }
                    if (sceneResult.getEnd() < end) {
                        end = sceneResult.getEnd();
                    }
                }
            }
            SceneRecogConfiguration.INSTANCE.setLastUnCompleteMinStartTime(jCurrentTimeMillis);
        }

        @NotNull
        public final ISceneRepository getMSceneRepository() {
            return this.mSceneRepository;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<SceneResult> listConvertSceneResult;
            i71 i71VarAnalyzeBySteps = (!HarSensorHelper.INSTANCE.supportSceneRecognition(this.context) || SceneRecognitionStatHelper.INSTANCE.isFirstStart()) ? analyzeBySteps() : analyzeBySceneRecognition();
            Logger.e("AnalyzeRunnable", "run: " + i71VarAnalyzeBySteps);
            if (i71VarAnalyzeBySteps != null) {
                BeanUtils beanUtils = BeanUtils.INSTANCE;
                List<ActivityEntity> listC = i71VarAnalyzeBySteps.c();
                Intrinsics.checkNotNullExpressionValue(listC, "getDisplayAndHighConfidenceActs(...)");
                listConvertSceneResult = beanUtils.convertSceneResult(listC, true, false);
                List<ActivityEntity> listE = i71VarAnalyzeBySteps.e();
                Intrinsics.checkNotNullExpressionValue(listE, "getUnCompleteActs(...)");
                List<SceneResult> listConvertSceneResult2 = beanUtils.convertSceneResult(listE, false, false);
                List<ActivityEntity> listD = i71VarAnalyzeBySteps.d();
                Intrinsics.checkNotNullExpressionValue(listD, "getDisplayAndLowConfidenceActs(...)");
                List<SceneResult> listConvertSceneResult3 = beanUtils.convertSceneResult(listD, true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(listConvertSceneResult);
                arrayList.addAll(listConvertSceneResult2);
                arrayList.addAll(listConvertSceneResult3);
                ISceneRepository iSceneRepository = this.mSceneRepository;
                SceneResult[] sceneResultArr = (SceneResult[]) arrayList.toArray(new SceneResult[0]);
                iSceneRepository.insertResult((SceneResult[]) Arrays.copyOf(sceneResultArr, sceneResultArr.length));
                arrayList.clear();
                updateUnSceneCompleteResult(listConvertSceneResult2);
            } else {
                listConvertSceneResult = null;
            }
            this.callback.invoke2(listConvertSceneResult);
            deleteUnusedPressureData();
        }

        public final void setMSceneRepository(@NotNull ISceneRepository iSceneRepository) {
            Intrinsics.checkNotNullParameter(iSceneRepository, "<set-?>");
            this.mSceneRepository = iSceneRepository;
        }

        public /* synthetic */ AnalyzeRunnable(Context context, long j, long j2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, j, j2, (i & 8) != 0 ? new Function1() { // from class: djj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RecognitionManager.AnalyzeRunnable._init_$lambda$0((List) obj);
                }
            } : function1);
        }
    }
}
