package com.xiaomi.fitness.motion.recognition;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.motion.recognition.SceneRepository;
import com.xiaomi.fitness.motion.recognition.db.SceneEventDao;
import com.xiaomi.fitness.motion.recognition.db.SceneRecogDb;
import com.xiaomi.fitness.motion.recognition.db.SceneResultDao;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J!\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u000f\"\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J!\u0010\u001d\u001a\u00020\r2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u000f\"\u00020\u001fH\u0016¢\u0006\u0002\u0010 J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130%2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneRepository;", "Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mSceneRecogDb", "Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb;", "getMSceneRecogDb", "()Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb;", "mSceneRecogDb$delegate", "Lkotlin/Lazy;", "insert", "", "sceneResults", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;)V", "querySceneEvents", "", "startTime", "", "endTime", "insertPressure", "pressureEvents", "Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;)V", "queryScenePressureEvents", "deleteScenePressureEvents", "insertResult", "activityEntities", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;)V", "queryResults", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllNoCompleteResults", "queryPossibleResults", "Landroidx/lifecycle/LiveData;", "deleteResult", "actType", "", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneRepository implements ISceneRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SceneRepository> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: wel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SceneRepository.instance_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mSceneRecogDb$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSceneRecogDb = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SceneRepository.mSceneRecogDb_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/motion/recognition/SceneRepository;", "getInstance", "()Lcom/xiaomi/fitness/motion/recognition/SceneRepository;", "instance$delegate", "Lkotlin/Lazy;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SceneRepository getInstance() {
            return (SceneRepository) SceneRepository.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.motion.recognition.SceneRepository$insert$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.motion.recognition.SceneRepository$insert$1", f = "SceneRepository.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SceneEvent[] $sceneResults;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SceneEvent[] sceneEventArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sceneResults = sceneEventArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SceneRepository.this.new AnonymousClass1(this.$sceneResults, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SceneEventDao sceneEventDao = SceneRepository.this.getMSceneRecogDb().getSceneEventDao();
                SceneEvent[] sceneEventArr = this.$sceneResults;
                Object[] objArrCopyOf = Arrays.copyOf(sceneEventArr, sceneEventArr.length);
                this.label = 1;
                if (sceneEventDao.insert(objArrCopyOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.motion.recognition.SceneRepository$insertResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.motion.recognition.SceneRepository$insertResult$1", f = "SceneRepository.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SceneResult[] $activityEntities;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26521(SceneResult[] sceneResultArr, Continuation<? super C26521> continuation) {
            super(2, continuation);
            this.$activityEntities = sceneResultArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SceneRepository.this.new C26521(this.$activityEntities, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SceneResultDao sceneResultDao = SceneRepository.this.getMSceneRecogDb().getSceneResultDao();
                SceneResult[] sceneResultArr = this.$activityEntities;
                Object[] objArrCopyOf = Arrays.copyOf(sceneResultArr, sceneResultArr.length);
                this.label = 1;
                if (sceneResultDao.insert(objArrCopyOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SceneRepository(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SceneRecogDb getMSceneRecogDb() {
        return (SceneRecogDb) this.mSceneRecogDb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneRepository instance_delegate$lambda$1() {
        return new SceneRepository(ApplicationExtKt.getApplication());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneRecogDb mSceneRecogDb_delegate$lambda$0() {
        return SceneRecogDb.INSTANCE.getInstance();
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    public void deleteResult(long startTime, int actType) {
        getMSceneRecogDb().getSceneResultDao().delete(startTime, actType);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    public void deleteScenePressureEvents(long startTime, long endTime) {
        getMSceneRecogDb().getSceneEventDao().deleteScenePressureEvents(startTime, endTime);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    public void insert(@NotNull SceneEvent... sceneResults) {
        Intrinsics.checkNotNullParameter(sceneResults, "sceneResults");
        AnyExtKt.io$default(null, new AnonymousClass1(sceneResults, null), 1, null);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    public void insertPressure(@NotNull ScenePressureEvent... pressureEvents) {
        Intrinsics.checkNotNullParameter(pressureEvents, "pressureEvents");
        getMSceneRecogDb().getSceneEventDao().insertPressure((ScenePressureEvent[]) Arrays.copyOf(pressureEvents, pressureEvents.length));
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    public void insertResult(@NotNull SceneResult... activityEntities) {
        Intrinsics.checkNotNullParameter(activityEntities, "activityEntities");
        AnyExtKt.io$default(null, new C26521(activityEntities, null), 1, null);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    @NotNull
    public List<SceneResult> queryAllNoCompleteResults(long startTime, long endTime) {
        return getMSceneRecogDb().getSceneResultDao().queryAllNoCompleteResults(startTime, endTime);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    @NotNull
    public LiveData<List<SceneResult>> queryPossibleResults(long startTime, long endTime) {
        return getMSceneRecogDb().getSceneResultDao().queryPossibleResults(startTime, endTime);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    @Nullable
    public Object queryResults(long j, long j2, @NotNull Continuation<? super List<SceneResult>> continuation) {
        return getMSceneRecogDb().getSceneResultDao().list(j, j2, continuation);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    @NotNull
    public List<SceneEvent> querySceneEvents(long startTime, long endTime) {
        return getMSceneRecogDb().getSceneEventDao().querySceneEvents(startTime, endTime);
    }

    @Override // com.xiaomi.fitness.motion.recognition.ISceneRepository
    @NotNull
    public List<ScenePressureEvent> queryScenePressureEvents(long startTime, long endTime) {
        return getMSceneRecogDb().getSceneEventDao().queryScenePressureEvents(startTime, endTime);
    }
}
