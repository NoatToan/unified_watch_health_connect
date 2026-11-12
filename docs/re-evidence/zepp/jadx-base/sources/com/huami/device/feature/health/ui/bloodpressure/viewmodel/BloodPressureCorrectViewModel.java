package com.huami.device.feature.health.ui.bloodpressure.viewmodel;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectProgress;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus;
import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import com.huami.device.feature.health.device.init.BloodPressureInit;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.ui.bloodpressure.model.BloodPressureCorrectPageStatus;
import com.huami.device.feature.health.ui.bloodpressure.model.BloodPressureMeasureStatus;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u000f\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003J\u0010\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012J\u0006\u0010\u0015\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0016J&\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u00020\u0003H\u0014J\u0006\u0010\"\u001a\u00020\u0016R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b*\u0010+R(\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050.0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010/R\u001f\u00104\u001a\u0004\u0018\u0001018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b$\u00103R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0005058\u0006@\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:R\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0005058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010:R\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020A058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\bB\u0010:R\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0016058\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\bD\u0010:R\u001f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0016058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\bF\u0010:R\u001f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0016058\u0006@\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010:R\u001d\u0010N\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010%\u001a\u0004\b<\u0010MR\u001d\u0010R\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010%\u001a\u0004\b7\u0010Q¨\u0006X"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "i", "", "times", "h", z.j, "g", PointCategory.INIT, "startSendHeartBeat", "seconds", "startRest", "startMeasure", "checkMeasureTime", "systolic", "diastolic", "Lkotlin/Function0;", "onResultAdd", "addMeasureResult", "navigateToWatchCorrect", "", "addTimes", "remeasure", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "status", "Lkotlin/Function1;", "callback", "setCorrectStatus", "watchCorrect", "reQueryWatchStatus", "stopQueryWatchCorrectStatus", "onCleared", "checkDeviceConnect", "Lcom/huami/device/feature/health/device/HealthDevice;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/device/feature/health/device/HealthDevice;", "mDevice", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/IBPFlagUpdater;", "c", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/IBPFlagUpdater;", "mFlagUpdater", "", "Lkotlin/Pair;", "Ljava/util/List;", "mMeasureValues", "Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "mApi", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "e", "Landroidx/lifecycle/MutableLiveData;", "getCorrectMeasureStatus", "()Landroidx/lifecycle/MutableLiveData;", "correctMeasureStatus", "f", "getRestRemainSeconds", "restRemainSeconds", "getMeasureTimes", "measureTimes", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "getCorrectStatus", "correctStatus", "getNeedReturn", "needReturn", "getDeviceConnectStatus", "deviceConnectStatus", hl.k, "getBtCmdResult", "btCmdResult", "Landroid/os/HandlerThread;", "l", "()Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/Handler;", "m", "()Landroid/os/Handler;", "mHandler", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureCorrectViewModel extends AndroidViewModel implements KoinComponent {
    public static final long NEED_RETURN_TIME = 1800000;

    @NotNull
    private static final String n = "BloodPressureCorrectViewModel";
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;
    private static final long s = 1000;
    private static final long t = 10000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFlagUpdater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Pair<Integer, Integer>> mMeasureValues;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureMeasureStatus> correctMeasureStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> restRemainSeconds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> measureTimes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureCorrectPageStatus> correctStatus;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> needReturn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deviceConnectStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> btCmdResult;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandlerThread;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$addMeasureResult$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {164, 166}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Pair<Integer, Integer> c;
        public final /* synthetic */ Pair<Integer, Integer> d;
        public final /* synthetic */ Function0<Unit> e;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$addMeasureResult$1$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0345a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0345a(Function0<Unit> function0, Continuation<? super C0345a> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0345a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0345a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = pair;
            this.d = pair2;
            this.e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0074  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x008f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            MainCoroutineDispatcher main;
            C0345a c0345a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BloodPressureCorrectViewModel.this.navigateToWatchCorrect();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IBloodPressureApi iBloodPressureApiA = BloodPressureCorrectViewModel.this.a();
            if (iBloodPressureApiA != null) {
                int iIntValue = (this.c.getSecond().intValue() + this.d.getSecond().intValue()) / 2;
                int iIntValue2 = (this.c.getFirst().intValue() + this.d.getFirst().intValue()) / 2;
                this.a = 1;
                obj = iBloodPressureApiA.correct(iIntValue, iIntValue2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (z) {
                main = Dispatchers.getMain();
                c0345a = new C0345a(this.e, null);
                this.a = 2;
                if (BuildersKt.withContext(main, c0345a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BloodPressureCorrectViewModel.this.navigateToWatchCorrect();
            } else {
                BloodPressureCorrectViewModel.this.getBtCmdResult().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
            z = ((Boolean) obj).booleanValue();
            if (z) {
                main = Dispatchers.getMain();
                c0345a = new C0345a(this.e, null);
                this.a = 2;
                if (BuildersKt.withContext(main, c0345a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BloodPressureCorrectViewModel.this.navigateToWatchCorrect();
            } else {
                BloodPressureCorrectViewModel.this.getBtCmdResult().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$addMeasureResult$2", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new b(continuation);
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
                this.a = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BloodPressureCorrectViewModel.this.getCorrectMeasureStatus().postValue(BloodPressureMeasureStatus.FAIL.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$addMeasureResult$3", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BloodPressureCorrectViewModel.this.getCorrectMeasureStatus().postValue(BloodPressureMeasureStatus.REMEASURE.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start check measure time";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$init$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBPFlagUpdater iBPFlagUpdaterC = BloodPressureCorrectViewModel.this.c();
                this.a = 1;
                if (iBPFlagUpdaterC.updateFlags(this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<IBloodPressureApi> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBloodPressureApi invoke() {
            BloodPressureInit bloodPressureInit;
            BloodPressureSetting serviceForce = HealthFunc.BLOOD_PRESSURE.INSTANCE.getServiceForce();
            if (serviceForce == null || (bloodPressureInit = serviceForce.getBloodPressureInit()) == null) {
                return null;
            }
            return bloodPressureInit.getBloodPressureApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/HandlerThread;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<HandlerThread> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("blood pressure");
            handlerThread.start();
            return handlerThread;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$navigateToWatchCorrect$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "remove check measure time";
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BloodPressureCorrectViewModel.this.getCorrectMeasureStatus().postValue(BloodPressureMeasureStatus.SUCCESS.INSTANCE);
            HMLog.info(BloodPressureCorrectViewModel.n, a.a);
            BloodPressureCorrectViewModel.this.e().removeMessages(3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$queryWatchCorrectStatus$1", f = "BloodPressureCorrectViewModel.kt", i = {0}, l = {250}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = BloodPressureCorrectViewModel.this.new i(continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BloodPressureCorrectViewModel bloodPressureCorrectViewModel;
            Object objBoxBoolean;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Object obj2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                IBloodPressureApi iBloodPressureApiA = BloodPressureCorrectViewModel.this.a();
                if (iBloodPressureApiA != null) {
                    this.b = coroutineScope;
                    this.a = 1;
                    obj = iBloodPressureApiA.queryCorrectProgress(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (obj2 == null) {
                    bloodPressureCorrectViewModel = BloodPressureCorrectViewModel.this;
                    if (bloodPressureCorrectViewModel.checkDeviceConnect()) {
                        bloodPressureCorrectViewModel.e().sendEmptyMessageDelayed(2, 1000L);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureCorrectProgress bloodPressureCorrectProgress = (BloodPressureCorrectProgress) obj;
            if (bloodPressureCorrectProgress != null) {
                BloodPressureCorrectViewModel bloodPressureCorrectViewModel2 = BloodPressureCorrectViewModel.this;
                if (bloodPressureCorrectProgress.isSuccess()) {
                    bloodPressureCorrectViewModel2.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Success.INSTANCE);
                    BloodPressureSetting serviceForce = HealthFunc.BLOOD_PRESSURE.INSTANCE.getServiceForce();
                    if (serviceForce != null) {
                        serviceForce.setData(System.currentTimeMillis() / ((long) 1000));
                    }
                    bloodPressureCorrectViewModel2.e().removeMessages(2);
                    objBoxBoolean = Unit.INSTANCE;
                } else if (bloodPressureCorrectProgress.isFail()) {
                    bloodPressureCorrectViewModel2.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Fail.INSTANCE);
                    bloodPressureCorrectViewModel2.e().removeMessages(2);
                    objBoxBoolean = Unit.INSTANCE;
                } else if (bloodPressureCorrectProgress.isCancel()) {
                    bloodPressureCorrectViewModel2.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.CANCEL.INSTANCE);
                    bloodPressureCorrectViewModel2.e().removeMessages(2);
                    objBoxBoolean = Unit.INSTANCE;
                } else if (bloodPressureCorrectProgress.isCorrecting()) {
                    bloodPressureCorrectViewModel2.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Ing.INSTANCE);
                    objBoxBoolean = Boxing.boxBoolean(bloodPressureCorrectViewModel2.e().sendEmptyMessageDelayed(2, 1000L));
                } else {
                    bloodPressureCorrectViewModel2.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Start.INSTANCE);
                    objBoxBoolean = Boxing.boxBoolean(bloodPressureCorrectViewModel2.e().sendEmptyMessageDelayed(2, 1000L));
                }
                obj2 = objBoxBoolean;
            }
            if (obj2 == null) {
                bloodPressureCorrectViewModel = BloodPressureCorrectViewModel.this;
                if (bloodPressureCorrectViewModel.checkDeviceConnect()) {
                    bloodPressureCorrectViewModel.e().sendEmptyMessageDelayed(2, 1000L);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$reQueryWatchStatus$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureCorrectViewModel.this.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Start.INSTANCE);
            BloodPressureCorrectViewModel.this.e().removeMessages(2);
            BloodPressureCorrectViewModel.this.e().sendEmptyMessageDelayed(2, 1000L);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$sendHeartBeatToDevice$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodPressureApi iBloodPressureApiA = BloodPressureCorrectViewModel.this.a();
                if (iBloodPressureApiA != null) {
                    this.a = 1;
                    obj = iBloodPressureApiA.sendCorrectHeartBeat(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                BloodPressureCorrectViewModel.this.e().sendEmptyMessageDelayed(4, 10000L);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureCorrectViewModel.this.e().sendEmptyMessageDelayed(4, 10000L);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$setCorrectStatus$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {217, 218}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BloodPressureCorrectStatus c;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$setCorrectStatus$1$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<Boolean, Unit> b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = z;
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
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function1 = this.b;
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(this.c));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(BloodPressureCorrectStatus bloodPressureCorrectStatus, Function1<? super Boolean, Unit> function1, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = bloodPressureCorrectStatus;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new l(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0059 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineContext coroutineContext;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IBloodPressureApi iBloodPressureApiA = BloodPressureCorrectViewModel.this.a();
            if (iBloodPressureApiA != null) {
                BloodPressureCorrectStatus bloodPressureCorrectStatus = this.c;
                this.a = 1;
                obj = iBloodPressureApiA.setCorrectStatus(bloodPressureCorrectStatus, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            coroutineContext = ViewModelKt.getViewModelScope(BloodPressureCorrectViewModel.this).getCoroutineContext();
            aVar = new a(this.d, z, null);
            this.a = 2;
            if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            if (((Boolean) obj).booleanValue()) {
                z = true;
            }
            coroutineContext = ViewModelKt.getViewModelScope(BloodPressureCorrectViewModel.this).getCoroutineContext();
            aVar = new a(this.d, z, null);
            this.a = 2;
            if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$watchCorrect$1", f = "BloodPressureCorrectViewModel.kt", i = {}, l = {FTPCodes.DATA_CONNECTION_CLOSING}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureCorrectViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:17:0x003a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0052  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodPressureApi iBloodPressureApiA = BloodPressureCorrectViewModel.this.a();
                if (iBloodPressureApiA != null) {
                    BloodPressureCorrectStatus.CORRECTING correcting = BloodPressureCorrectStatus.CORRECTING.INSTANCE;
                    this.a = 1;
                    obj = iBloodPressureApiA.setCorrectStatus(correcting, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (z) {
                    BloodPressureCorrectViewModel.this.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Start.INSTANCE);
                    BloodPressureCorrectViewModel.this.e().sendEmptyMessageDelayed(2, 1000L);
                } else {
                    BloodPressureCorrectViewModel.this.getBtCmdResult().postValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            z = ((Boolean) obj).booleanValue();
            if (z) {
                BloodPressureCorrectViewModel.this.getCorrectStatus().postValue(BloodPressureCorrectPageStatus.Start.INSTANCE);
                BloodPressureCorrectViewModel.this.e().sendEmptyMessageDelayed(2, 1000L);
            } else {
                BloodPressureCorrectViewModel.this.getBtCmdResult().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureCorrectViewModel(@NotNull Application application) {
        super(application);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.mDevice = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<HealthDevice>() { // from class: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.device.feature.health.device.HealthDevice, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthDevice invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HealthDevice.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = null == true ? 1 : 0;
        final Object[] objArr3 = null == true ? 1 : 0;
        this.mFlagUpdater = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IBPFlagUpdater>() { // from class: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.device.feature.health.ui.bloodpressure.viewmodel.IBPFlagUpdater, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IBPFlagUpdater invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IBPFlagUpdater.class), objArr2, objArr3);
            }
        });
        this.mMeasureValues = new ArrayList();
        this.mApi = LazyKt__LazyJVMKt.lazy(f.a);
        this.correctMeasureStatus = new MutableLiveData<>(BloodPressureMeasureStatus.REST.INSTANCE);
        this.restRemainSeconds = new MutableLiveData<>();
        this.measureTimes = new MutableLiveData<>(1);
        this.correctStatus = new MutableLiveData<>(BloodPressureCorrectPageStatus.Tip.INSTANCE);
        this.needReturn = new MutableLiveData<>(Boolean.FALSE);
        this.deviceConnectStatus = new MutableLiveData<>();
        this.btCmdResult = new MutableLiveData<>(Boolean.TRUE);
        this.mHandlerThread = LazyKt__LazyJVMKt.lazy(g.a);
        this.mHandler = LazyKt__LazyJVMKt.lazy(new Function0<BloodPressureCorrectViewModel$mHandler$2.AnonymousClass1>() { // from class: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$mHandler$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$mHandler$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                Looper looper = this.a.f().getLooper();
                final BloodPressureCorrectViewModel bloodPressureCorrectViewModel = this.a;
                return new Handler(looper) { // from class: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$mHandler$2.1

                    /* JADX INFO: renamed from: com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel$mHandler$2$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "on check measure time, 30m over time";
                        }
                    }

                    @Override // android.os.Handler
                    public void dispatchMessage(@NotNull Message msg) {
                        super.dispatchMessage(msg);
                        int i2 = msg.what;
                        if (i2 == 1) {
                            int i3 = msg.arg1;
                            bloodPressureCorrectViewModel.getRestRemainSeconds().postValue(Integer.valueOf(i3));
                            if (i3 > 0) {
                                Message message = new Message();
                                message.what = 1;
                                message.arg1 = i3 - 1;
                                bloodPressureCorrectViewModel.e().sendMessageDelayed(message, 1000L);
                                return;
                            }
                            return;
                        }
                        if (i2 == 2) {
                            bloodPressureCorrectViewModel.g();
                            return;
                        }
                        if (i2 == 3) {
                            HMLog.info("BloodPressureCorrectViewModel", a.a);
                            bloodPressureCorrectViewModel.getNeedReturn().postValue(Boolean.TRUE);
                        } else {
                            if (i2 != 4) {
                                return;
                            }
                            bloodPressureCorrectViewModel.i();
                        }
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBloodPressureApi a() {
        return (IBloodPressureApi) this.mApi.getValue();
    }

    private final HealthDevice b() {
        return (HealthDevice) this.mDevice.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBPFlagUpdater c() {
        return (IBPFlagUpdater) this.mFlagUpdater.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler e() {
        return (Handler) this.mHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandlerThread f() {
        return (HandlerThread) this.mHandlerThread.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new i(null), 2, null);
    }

    private final void h(int times) {
        Message message = new Message();
        message.what = 1;
        message.arg1 = times;
        e().sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new k(null), 2, null);
    }

    private final void j() {
        e().removeMessages(1);
        this.restRemainSeconds.postValue(0);
    }

    public static /* synthetic */ void remeasure$default(BloodPressureCorrectViewModel bloodPressureCorrectViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        bloodPressureCorrectViewModel.remeasure(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCorrectStatus$default(BloodPressureCorrectViewModel bloodPressureCorrectViewModel, BloodPressureCorrectStatus bloodPressureCorrectStatus, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        bloodPressureCorrectViewModel.setCorrectStatus(bloodPressureCorrectStatus, function1);
    }

    public static /* synthetic */ void startRest$default(BloodPressureCorrectViewModel bloodPressureCorrectViewModel, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 60;
        }
        bloodPressureCorrectViewModel.startRest(i2);
    }

    public final void addMeasureResult(int systolic, int diastolic, @NotNull Function0<Unit> onResultAdd) {
        if (!b().isConnect()) {
            this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.DISCONNECT.INSTANCE);
            onResultAdd.invoke();
            return;
        }
        IntRange systolic_range = BloodPressureExtKt.getSYSTOLIC_RANGE();
        boolean z = false;
        if (systolic <= systolic_range.getLast() && systolic_range.getFirst() <= systolic) {
            IntRange diastolic_range = BloodPressureExtKt.getDIASTOLIC_RANGE();
            if ((diastolic <= diastolic_range.getLast() && diastolic_range.getFirst() <= diastolic) && systolic > diastolic) {
                this.mMeasureValues.add(new Pair<>(Integer.valueOf(systolic), Integer.valueOf(diastolic)));
                int size = this.mMeasureValues.size();
                if (size < 3) {
                    MutableLiveData<Integer> mutableLiveData = this.measureTimes;
                    Integer value = mutableLiveData.getValue();
                    if (value == null) {
                        value = 1;
                    }
                    mutableLiveData.postValue(Integer.valueOf(value.intValue() + 1));
                    this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.REST.INSTANCE);
                    e().removeMessages(1);
                    h(60);
                    onResultAdd.invoke();
                    return;
                }
                Pair pair = (Pair) CollectionsKt.last((List) this.mMeasureValues);
                Pair<Integer, Integer> pair2 = this.mMeasureValues.get(size - 2);
                if (Math.abs(((Number) pair.getFirst()).intValue() - pair2.getFirst().intValue()) <= 5 && Math.abs(((Number) pair.getSecond()).intValue() - pair2.getSecond().intValue()) <= 5) {
                    z = true;
                }
                if (z) {
                    kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(pair, pair2, onResultAdd, null), 2, null);
                    return;
                } else if (size >= 5) {
                    kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
                    onResultAdd.invoke();
                    return;
                } else {
                    kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
                    onResultAdd.invoke();
                    return;
                }
            }
        }
        this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.VALUE_INVALID.INSTANCE);
        onResultAdd.invoke();
    }

    public final boolean checkDeviceConnect() {
        if (b().isConnect()) {
            this.deviceConnectStatus.postValue(Boolean.TRUE);
            return true;
        }
        this.deviceConnectStatus.postValue(Boolean.FALSE);
        return false;
    }

    public final void checkMeasureTime() {
        HMLog.info(n, d.a);
        e().sendEmptyMessageDelayed(3, NEED_RETURN_TIME);
    }

    @NotNull
    public final MutableLiveData<Boolean> getBtCmdResult() {
        return this.btCmdResult;
    }

    @NotNull
    public final MutableLiveData<BloodPressureMeasureStatus> getCorrectMeasureStatus() {
        return this.correctMeasureStatus;
    }

    @NotNull
    public final MutableLiveData<BloodPressureCorrectPageStatus> getCorrectStatus() {
        return this.correctStatus;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceConnectStatus() {
        return this.deviceConnectStatus;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Integer> getMeasureTimes() {
        return this.measureTimes;
    }

    @NotNull
    public final MutableLiveData<Boolean> getNeedReturn() {
        return this.needReturn;
    }

    @NotNull
    public final MutableLiveData<Integer> getRestRemainSeconds() {
        return this.restRemainSeconds;
    }

    public final void init() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void navigateToWatchCorrect() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        e().removeMessages(3);
        e().removeMessages(4);
    }

    public final void reQueryWatchStatus() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new j(null), 2, null);
    }

    public final void remeasure(boolean addTimes) {
        if (addTimes) {
            MutableLiveData<Integer> mutableLiveData = this.measureTimes;
            Integer value = mutableLiveData.getValue();
            if (value == null) {
                value = 1;
            }
            mutableLiveData.postValue(Integer.valueOf(value.intValue() + 1));
        }
        this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.REST.INSTANCE);
        e().removeMessages(1);
        h(60);
    }

    public final void setCorrectStatus(@NotNull BloodPressureCorrectStatus status, @Nullable Function1<? super Boolean, Unit> callback) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new l(status, callback, null), 2, null);
    }

    public final void startMeasure() {
        j();
        this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.MEASURE.INSTANCE);
    }

    public final void startRest(int seconds) {
        this.correctMeasureStatus.postValue(BloodPressureMeasureStatus.REST.INSTANCE);
        e().removeMessages(1);
        h(seconds);
    }

    public final void startSendHeartBeat() {
        e().sendEmptyMessage(4);
    }

    public final void stopQueryWatchCorrectStatus() {
        e().removeMessages(2);
    }

    public final void watchCorrect() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new m(null), 2, null);
    }
}
