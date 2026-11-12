package com.huami.pai.ui.detail;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.algorithm.Coefficient;
import com.huami.pai.algorithm.FitnessAgeAlgorithm;
import com.huami.tools.log.HMLog;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR)\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\b\u0010\"R\u0019\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/pai/ui/detail/FitnessAgePredictor;", "", "", "pai", "days", "", "predicateFitnessAge", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "scope", "b", LogUtil.I, "age", "", "c", "Z", "isMale", "", GoogleApiAvailabilityLight.a, "F", "bmi", "e", "rhr", "f", "vo2", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "_fitnessAge", "", "Lcom/huami/pai/algorithm/Coefficient;", "h", "Lkotlin/Lazy;", "()Ljava/util/Map;", "coeffs", "Landroidx/lifecycle/LiveData;", "getFitnessAge", "()Landroidx/lifecycle/LiveData;", "fitnessAge", "<init>", "(Lkotlinx/coroutines/CoroutineScope;IZFIF)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitnessAgePredictor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int age;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float bmi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int rhr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float vo2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _fitnessAge;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy coeffs;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/pai/algorithm/Coefficient;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Map<Integer, ? extends Coefficient>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Integer, ? extends Coefficient> invoke() {
            return FitnessAgeAlgorithm.INSTANCE.getCoefficients();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgePredictor$predicateFitnessAge$1", f = "FitnessAgePredicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FitnessAgePredictor.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessAgePredictor.this._fitnessAge.postValue(Boxing.boxInt(FitnessAgeAlgorithm.INSTANCE.calculate(FitnessAgePredictor.this.a(), FitnessAgePredictor.this.age, FitnessAgePredictor.this.isMale, FitnessAgePredictor.this.rhr, FitnessAgePredictor.this.bmi, FitnessAgePredictor.this.vo2, this.c, this.d)));
            return Unit.INSTANCE;
        }
    }

    public FitnessAgePredictor(@NotNull CoroutineScope coroutineScope, int i, boolean z, float f, int i2, float f2) {
        this.scope = coroutineScope;
        this.age = i;
        this.isMale = z;
        this.bmi = f;
        this.rhr = i2;
        this.vo2 = f2;
        HMLog.v("FitnessAgePredictor", "age: " + i + ", isMale: " + z + ", bmi: " + f + ", rhr: " + i2 + ", vo2max: " + f2, new Object[0]);
        this._fitnessAge = new MutableLiveData<>();
        this.coeffs = LazyKt__LazyJVMKt.lazy(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, Coefficient> a() {
        return (Map) this.coeffs.getValue();
    }

    @NotNull
    public final LiveData<Integer> getFitnessAge() {
        return this._fitnessAge;
    }

    public final void predicateFitnessAge(int pai, int days) {
        e.f(this.scope, Dispatchers.getDefault(), null, new b(pai, days, null), 2, null);
    }
}
