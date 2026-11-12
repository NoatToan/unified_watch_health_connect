package com.huami.sleepassistant.lib.ui.breathe.begins;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0016R\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b,\u0010\u0016R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsModel;", "Landroidx/lifecycle/ViewModel;", "", "totalTime", "", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "e", "b", "startCountdown", "finishCountdown", "startStressCountDown", "pauseStressCountDown", "restartStressCountDown", "finishStressCountDown", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "countDownJob", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getStartFirstInitViewLiveData", "()Landroidx/lifecycle/MutableLiveData;", "startFirstInitViewLiveData", "getShowBubbleViewLiveData", "showBubbleViewLiveData", GoogleApiAvailabilityLight.a, "getResetViewLiveData", "resetViewLiveData", "", "getCountDownLiveData", "countDownLiveData", "f", "getBubbleChangeLiveData", "bubbleChangeLiveData", "g", "getClearBubbleLiveData", "clearBubbleLiveData", "h", "countDownStressJob", "i", "getDoneLiveData", "doneLiveData", z.j, "getProgressChangeLiveData", "progressChangeLiveData", "", hl.k, "J", "startTrainedTime", "l", LogUtil.I, "alreadyTrainedTime", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingBeginsModel extends ViewModel {
    public static final int TIME_EXPIRATION = 8000;
    public static final int TIME_HOLD_YOUR_BREATH = 7000;
    public static final int TIME_INHALE = 4000;
    public static final int TIME_STRESS_BREATHE = 4000;
    public static final int TIME_STRESS_EXHALE = 2;
    public static final int TIME_STRESS_INHALE = 1;
    private static final long m = 500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Job countDownJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job countDownStressJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long startTrainedTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int alreadyTrainedTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> startFirstInitViewLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> showBubbleViewLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> resetViewLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> countDownLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> bubbleChangeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> clearBubbleLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> doneLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> progressChangeLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel", f = "TrainingBeginsModel.kt", i = {0, 0}, l = {107}, m = "bubbleChange", n = {"this", "count"}, s = {"L$0", "I$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return TrainingBeginsModel.this.a(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel", f = "TrainingBeginsModel.kt", i = {0, 0, 0, 1, 1}, l = {133, 144}, m = "bubbleChangeWithRestart", n = {"this", "count", "alreadyCount", "this", "count"}, s = {"L$0", "I$0", "I$1", "L$0", "I$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return TrainingBeginsModel.this.b(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$restartStressCountDown$1", f = "TrainingBeginsModel.kt", i = {0}, l = {160, 161}, m = "invokeSuspend", n = {"async2"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ int d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$restartStressCountDown$1$async1$1", f = "TrainingBeginsModel.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TrainingBeginsModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TrainingBeginsModel trainingBeginsModel, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = trainingBeginsModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TrainingBeginsModel trainingBeginsModel = this.b;
                    int i2 = this.c;
                    this.a = 1;
                    if (trainingBeginsModel.b(i2, this) == coroutine_suspended) {
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
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$restartStressCountDown$1$async2$1", f = "TrainingBeginsModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TrainingBeginsModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TrainingBeginsModel trainingBeginsModel, int i, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = trainingBeginsModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TrainingBeginsModel trainingBeginsModel = this.b;
                    int i2 = this.c;
                    this.a = 1;
                    if (trainingBeginsModel.e(i2, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = TrainingBeginsModel.this.new c(this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferred;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                TrainingBeginsModel.this.getDoneLiveData().setValue(Boxing.boxInt(this.d / 8));
                TrainingBeginsModel.this.alreadyTrainedTime = 0;
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            Deferred deferredB = kotlinx.coroutines.e.b(coroutineScope, null, null, new a(TrainingBeginsModel.this, this.d, null), 3, null);
            Deferred deferredB2 = kotlinx.coroutines.e.b(coroutineScope, null, null, new b(TrainingBeginsModel.this, this.d, null), 3, null);
            this.b = deferredB2;
            this.a = 1;
            if (deferredB.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredB2;
            this.b = null;
            this.a = 2;
            if (deferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            TrainingBeginsModel.this.getDoneLiveData().setValue(Boxing.boxInt(this.d / 8));
            TrainingBeginsModel.this.alreadyTrainedTime = 0;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$startCountdown$1", f = "TrainingBeginsModel.kt", i = {}, l = {48, 54, 56, 58, 60}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TrainingBeginsModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050 A[PHI: r1 r12
          0x0050: PHI (r1v2 com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$d) = 
          (r1v1 com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$d)
          (r1v3 com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$d)
         binds: [B:16:0x004b, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r12v2 int) = (r12v1 int), (r12v7 int) binds: [B:16:0x004b, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x006d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0070  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00e8 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:21:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e6 -> B:35:0x00e9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$startStressCountDown$1", f = "TrainingBeginsModel.kt", i = {0, 1}, l = {78, 83, 84}, m = "invokeSuspend", n = {"$this$launch", "async2"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        private /* synthetic */ Object c;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$startStressCountDown$1$async1$1", f = "TrainingBeginsModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TrainingBeginsModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TrainingBeginsModel trainingBeginsModel, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = trainingBeginsModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TrainingBeginsModel trainingBeginsModel = this.b;
                    int i2 = this.c;
                    this.a = 1;
                    if (trainingBeginsModel.a(i2, this) == coroutine_suspended) {
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
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$startStressCountDown$1$async2$1", f = "TrainingBeginsModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TrainingBeginsModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TrainingBeginsModel trainingBeginsModel, int i, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = trainingBeginsModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TrainingBeginsModel trainingBeginsModel = this.b;
                    int i2 = this.c;
                    this.a = 1;
                    if (trainingBeginsModel.c(i2, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = TrainingBeginsModel.this.new e(this.e, continuation);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x005f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0060  */
        /* JADX WARN: Code duplicated, block: B:18:0x0064  */
        /* JADX WARN: Code duplicated, block: B:20:0x0097 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0098  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:17:0x0062). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.ResultKt.throwOnFailure(r14)
                r14 = r13
                goto La5
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r1 = r13.c
                kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
                kotlin.ResultKt.throwOnFailure(r14)
                r14 = r13
                goto L9a
            L2a:
                int r1 = r13.a
                java.lang.Object r6 = r13.c
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.ResultKt.throwOnFailure(r14)
                r14 = r1
                r12 = r6
                r1 = r13
                goto L62
            L37:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.c
                kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                r1 = r13
                r6 = r14
                r14 = 2
            L41:
                int r7 = r14 + (-1)
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r8 = com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.this
                androidx.lifecycle.MutableLiveData r8 = r8.getCountDownLiveData()
                int r14 = r14 + r4
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r8.setValue(r14)
                r8 = 1000(0x3e8, double:4.94E-321)
                r1.c = r6
                r1.a = r7
                r1.b = r4
                java.lang.Object r14 = kotlinx.coroutines.DelayKt.delay(r8, r1)
                if (r14 != r0) goto L60
                return r0
            L60:
                r12 = r6
                r14 = r7
            L62:
                if (r14 >= 0) goto Lb9
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r14 = com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.this
                androidx.lifecycle.MutableLiveData r14 = r14.getShowBubbleViewLiveData()
                r14.setValue(r5)
                r7 = 0
                r8 = 0
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$e$a r9 = new com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$e$a
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r14 = com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.this
                int r4 = r1.e
                r9.<init>(r14, r4, r5)
                r10 = 3
                r11 = 0
                r6 = r12
                kotlinx.coroutines.Deferred r14 = kotlinx.coroutines.BuildersKt.async$default(r6, r7, r8, r9, r10, r11)
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$e$b r9 = new com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$e$b
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r4 = com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.this
                int r6 = r1.e
                r9.<init>(r4, r6, r5)
                r6 = r12
                kotlinx.coroutines.Deferred r4 = kotlinx.coroutines.BuildersKt.async$default(r6, r7, r8, r9, r10, r11)
                r1.c = r4
                r1.b = r3
                java.lang.Object r14 = r14.await(r1)
                if (r14 != r0) goto L98
                return r0
            L98:
                r14 = r1
                r1 = r4
            L9a:
                r14.c = r5
                r14.b = r2
                java.lang.Object r1 = r1.await(r14)
                if (r1 != r0) goto La5
                return r0
            La5:
                com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r0 = com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.this
                androidx.lifecycle.MutableLiveData r0 = r0.getDoneLiveData()
                int r14 = r14.e
                int r14 = r14 / 8
                java.lang.Integer r14 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r14)
                r0.setValue(r14)
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
            Lb9:
                r6 = r12
                goto L41
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel", f = "TrainingBeginsModel.kt", i = {0, 0, 0}, l = {92}, m = "updateProgress", n = {"this", TypedValues.CycleType.S_WAVE_PERIOD, "i"}, s = {"L$0", "I$0", "I$2"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return TrainingBeginsModel.this.c(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel", f = "TrainingBeginsModel.kt", i = {0, 0, 1, 1, 1}, l = {115, 122}, m = "updateProgressWithRestart", n = {"this", TypedValues.CycleType.S_WAVE_PERIOD, "this", TypedValues.CycleType.S_WAVE_PERIOD, "i"}, s = {"L$0", "I$0", "L$0", "I$0", "I$2"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return TrainingBeginsModel.this.e(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r9 >= r2) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006e -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, Continuation<? super Unit> continuation) {
        a aVar;
        int i2;
        TrainingBeginsModel trainingBeginsModel;
        int i3;
        int i4;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i5 = aVar.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f = i5 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = aVar.f;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            this.startTrainedTime = System.currentTimeMillis();
            int i7 = i / 4;
            i2 = 0;
            if (i7 > 0) {
                trainingBeginsModel = this;
                i3 = i7;
                i4 = i2 + 1;
                trainingBeginsModel.getBubbleChangeLiveData().setValue(i2 % 2 == 0 ? Boxing.boxInt(1) : Boxing.boxInt(2));
                aVar.a = trainingBeginsModel;
                aVar.b = i3;
                aVar.c = i4;
                aVar.f = 1;
                if (DelayKt.delay(4000L, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = i4;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = aVar.c;
            i3 = aVar.b;
            trainingBeginsModel = (TrainingBeginsModel) aVar.a;
            ResultKt.throwOnFailure(obj);
            i2 = i4;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r10 < r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r11 = r10 + 1;
        r6 = r5.getBubbleChangeLiveData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if ((r10 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r6.setValue(r10);
        r0.a = r5;
        r0.b = r2;
        r0.c = r11;
        r0.f = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(4000, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10 >= r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, Continuation<? super Unit> continuation) {
        b bVar;
        int i2;
        int i3;
        TrainingBeginsModel trainingBeginsModel;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i4 = bVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.f = i4 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = bVar.f;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            this.startTrainedTime = System.currentTimeMillis();
            i2 = i / 4;
            int i6 = this.alreadyTrainedTime;
            if (i6 % 4 != 0) {
                int i7 = (i6 / 4) + 1;
                bVar.a = this;
                bVar.b = i2;
                bVar.c = i7;
                bVar.f = 1;
                if (DelayKt.delay(((long) (4 - (i6 % 4))) * 1000, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                trainingBeginsModel = this;
                i3 = i7;
            } else {
                i3 = i6 / 4;
                trainingBeginsModel = this;
            }
        } else if (i5 == 1) {
            i3 = bVar.c;
            i2 = bVar.b;
            trainingBeginsModel = (TrainingBeginsModel) bVar.a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = bVar.c;
            i2 = bVar.b;
            trainingBeginsModel = (TrainingBeginsModel) bVar.a;
            ResultKt.throwOnFailure(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(int r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.f
            if (r0 == 0) goto L13
            r0 = r11
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$f r0 = (com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.f) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$f r0 = new com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.g
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r10 = r0.d
            int r2 = r0.c
            int r5 = r0.b
            java.lang.Object r6 = r0.a
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r6 = (com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5a
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.ResultKt.throwOnFailure(r11)
            int r10 = r10 / r3
            r6 = r9
            r5 = r10
            r10 = 1
        L44:
            int r2 = r10 + 1
            int r11 = r5 * 1000
            long r7 = (long) r11
            r0.a = r6
            r0.b = r5
            r0.c = r2
            r0.d = r10
            r0.g = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r7, r0)
            if (r11 != r1) goto L5a
            return r1
        L5a:
            androidx.lifecycle.MutableLiveData r11 = r6.getProgressChangeLiveData()
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r11.setValue(r10)
            if (r2 <= r3) goto L6a
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L6a:
            r10 = r2
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.c(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0099 -> B:29:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(int r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.g
            if (r0 == 0) goto L13
            r0 = r12
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$g r0 = (com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.g) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$g r0 = new com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel$g
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.g
            r3 = 10
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            int r11 = r0.d
            int r2 = r0.c
            int r5 = r0.b
            java.lang.Object r6 = r0.a
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r6 = (com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel) r6
            kotlin.ResultKt.throwOnFailure(r12)
            goto L9c
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            int r11 = r0.b
            java.lang.Object r2 = r0.a
            com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel r2 = (com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L6a
        L4a:
            kotlin.ResultKt.throwOnFailure(r12)
            int r11 = r11 / r3
            int r12 = r10.alreadyTrainedTime
            int r2 = r12 % r11
            if (r2 == 0) goto L7e
            int r12 = r12 % r11
            int r12 = r11 - r12
            long r6 = (long) r12
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r0.a = r10
            r0.b = r11
            r0.g = r5
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            r2 = r10
        L6a:
            androidx.lifecycle.MutableLiveData r12 = r2.getProgressChangeLiveData()
            int r6 = r2.alreadyTrainedTime
            int r6 = r6 / r11
            int r6 = r6 + r5
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            r12.setValue(r5)
            int r12 = r2.alreadyTrainedTime
            int r12 = r12 / r11
            int r12 = r12 + r4
            goto L81
        L7e:
            int r12 = r12 / r11
            int r12 = r12 + r5
            r2 = r10
        L81:
            if (r12 > r3) goto Lac
            r5 = r11
            r11 = r12
            r6 = r2
        L86:
            int r2 = r11 + 1
            int r12 = r5 * 1000
            long r7 = (long) r12
            r0.a = r6
            r0.b = r5
            r0.c = r2
            r0.d = r11
            r0.g = r4
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r7, r0)
            if (r12 != r1) goto L9c
            return r1
        L9c:
            androidx.lifecycle.MutableLiveData r12 = r6.getProgressChangeLiveData()
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            r12.setValue(r11)
            if (r2 <= r3) goto Laa
            goto Lac
        Laa:
            r11 = r2
            goto L86
        Lac:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel.e(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void finishCountdown() {
        Job job = this.countDownJob;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    public final void finishStressCountDown() {
        Job job = this.countDownStressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.startTrainedTime = 0L;
        this.alreadyTrainedTime = 0;
    }

    @NotNull
    public final MutableLiveData<Integer> getBubbleChangeLiveData() {
        return this.bubbleChangeLiveData;
    }

    @NotNull
    public final MutableLiveData<Unit> getClearBubbleLiveData() {
        return this.clearBubbleLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getCountDownLiveData() {
        return this.countDownLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getDoneLiveData() {
        return this.doneLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgressChangeLiveData() {
        return this.progressChangeLiveData;
    }

    @NotNull
    public final MutableLiveData<Unit> getResetViewLiveData() {
        return this.resetViewLiveData;
    }

    @NotNull
    public final MutableLiveData<Unit> getShowBubbleViewLiveData() {
        return this.showBubbleViewLiveData;
    }

    @NotNull
    public final MutableLiveData<Unit> getStartFirstInitViewLiveData() {
        return this.startFirstInitViewLiveData;
    }

    public final void pauseStressCountDown() {
        Job job = this.countDownStressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.alreadyTrainedTime += new BigDecimal(String.valueOf((System.currentTimeMillis() - this.startTrainedTime) / 1000.0d)).setScale(0, 4).intValue();
    }

    public final void restartStressCountDown(int totalTime) {
        int i = this.alreadyTrainedTime;
        boolean z = false;
        if (1 <= i && i < totalTime) {
            z = true;
        }
        if (z) {
            Job job = this.countDownStressJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.countDownStressJob = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new c(totalTime, null), 2, null);
        }
    }

    public final void startCountdown() {
        this.startFirstInitViewLiveData.setValue(null);
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new d(null), 2, null);
    }

    public final void startStressCountDown(int totalTime) {
        Job job = this.countDownStressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownStressJob = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new e(totalTime, null), 2, null);
    }
}
