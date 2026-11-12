package com.xiaomi.fitness.health.ecg.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.EcgChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;
import defpackage.eri;
import defpackage.hak;
import defpackage.jui;
import defpackage.mt5;
import defpackage.n4j;
import defpackage.onq;
import defpackage.rtr;
import defpackage.ta7;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yqr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0019\u0012\u0006\u0010Y\u001a\u00020X\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bZ\u0010[J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006]"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/view/EcgCombineView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "initData", "()V", "setListener", "", "computeDisplayNumber", "()I", "reSizeYAxis", "", Constants.KEY_RECHARGE_VALUES, "distance", "", "Lcom/xiaomi/fitness/chart/entrys/EcgEntry;", "createEntryList", "([FI)Ljava/util/List;", "displayNumber", "setXAxis", "(I)V", "onFinishInflate", "bindBarChartList", "([FI)V", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMedicalItemReport", "timeInSec", "sparsePoints", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "bindReport", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IILandroidx/lifecycle/LifecycleCoroutineScope;)V", "Landroid/util/AttributeSet;", "attrs", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "setAttrs", "(Landroid/util/AttributeSet;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvfe;", "mBarChartAttrs", "Lvfe;", "Lufe;", "mBarChartAdapter", "Lufe;", "", "mEntries", "Ljava/util/List;", "getMEntries", "()Ljava/util/List;", "setMEntries", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/EcgChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/EcgChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "I", "", "currentTimestamp", "J", "getCurrentTimestamp", "()J", "setCurrentTimestamp", "(J)V", "", "ratioSpeed", "D", "getRatioSpeed", "()D", "setRatioSpeed", "(D)V", "", "firstFlag", "Z", "getFirstFlag", "()Z", "setFirstFlag", "(Z)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgCombineView extends LinearLayoutCompat {

    @NotNull
    public static final String TAG = "EcgCombineView";

    @Nullable
    private AttributeSet attrs;
    private long currentTimestamp;
    private int displayNumber;
    private boolean firstFlag;
    private ufe<EcgEntry> mBarChartAdapter;
    private vfe mBarChartAttrs;

    @NotNull
    private List<EcgEntry> mEntries;
    private EcgChartItemDecoration mItemDecoration;
    private vqr mXAxis;
    private rtr mYAxis;
    private double ratioSpeed;
    private LineChartRecyclerView recyclerView;
    private onq valueFormatter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.view.EcgCombineView$bindReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.view.EcgCombineView$bindReport$1", f = "EcgCombineView.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcgMedicalItemReport $ecgMedicalItemReport;
        final /* synthetic */ int $sparsePoints;
        final /* synthetic */ int $timeInSec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EcgCombineView this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.view.EcgCombineView$bindReport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.view.EcgCombineView$bindReport$1$1", f = "EcgCombineView.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<float[]> $floatArrayDeffer;
            final /* synthetic */ int $sparsePoints;
            int label;
            final /* synthetic */ EcgCombineView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05961(Deferred<float[]> deferred, EcgCombineView ecgCombineView, int i, Continuation<? super C05961> continuation) {
                super(2, continuation);
                this.$floatArrayDeffer = deferred;
                this.this$0 = ecgCombineView;
                this.$sparsePoints = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05961(this.$floatArrayDeffer, this.this$0, this.$sparsePoints, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<float[]> deferred = this.$floatArrayDeffer;
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    this.this$0.bindBarChartList(fArr, 20 / this.$sparsePoints);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, EcgCombineView ecgCombineView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ecgMedicalItemReport = ecgMedicalItemReport;
            this.$timeInSec = i;
            this.$sparsePoints = i2;
            this.this$0 = ecgCombineView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ecgMedicalItemReport, this.$timeInSec, this.$sparsePoints, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new EcgCombineView$bindReport$1$floatArrayDeffer$1(this.$ecgMedicalItemReport, this.$timeInSec, this.$sparsePoints, null), 3, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C05961 c05961 = new C05961(deferredAsync$default, this.this$0, this.$sparsePoints, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c05961, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgCombineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.attrs = attributeSet;
        this.mEntries = new ArrayList();
        this.ratioSpeed = 1.0d;
        LayoutInflater.from(context).inflate(jui.O8, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.attrs, n4j.i1);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.ratioSpeed = typedArrayObtainStyledAttributes.getFloat(n4j.k1, 1.0f);
        this.firstFlag = typedArrayObtainStyledAttributes.getBoolean(n4j.j1, false);
    }

    private final int computeDisplayNumber() {
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        LineChartRecyclerView lineChartRecyclerView2 = null;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        float fA = lineChartRecyclerView.a() / 6.0f;
        LineChartRecyclerView lineChartRecyclerView3 = this.recyclerView;
        if (lineChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            lineChartRecyclerView2 = lineChartRecyclerView3;
        }
        return (int) ((lineChartRecyclerView2.c() / fA) * 5);
    }

    private final List<EcgEntry> createEntryList(float[] values, int distance) {
        int length = values.length / distance;
        LocalDate localDatePlusDays = LocalDate.now().plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays) - (((long) length) * TimeDateUtil.TIME_HOUR);
        this.currentTimestamp = jChangZeroOfTheDay;
        List<EcgEntry> listA = ta7.a(jChangZeroOfTheDay, length, this.mEntries.size(), values, distance, this.firstFlag);
        Intrinsics.checkNotNullExpressionValue(listA, "createEcgEntries(...)");
        return listA;
    }

    private final void initData() {
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        lineChartRecyclerView.post(new Runnable() { // from class: sa7
            @Override // java.lang.Runnable
            public final void run() {
                EcgCombineView.initData$lambda$0(this.f33452a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$0(EcgCombineView this$0) {
        LineChartRecyclerView lineChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.displayNumber = this$0.computeDisplayNumber();
        this$0.valueFormatter = new yqr();
        Context context = this$0.getContext();
        vfe vfeVar2 = this$0.mBarChartAttrs;
        LineChartRecyclerView lineChartRecyclerView2 = null;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar2 = null;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, vfeVar2);
        speedRatioLayoutManager.l(this$0.ratioSpeed);
        vfe vfeVar3 = this$0.mBarChartAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar3 = null;
        }
        this$0.mYAxis = new rtr(vfeVar3);
        vfe vfeVar4 = this$0.mBarChartAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar4 = null;
        }
        int i = this$0.displayNumber;
        onq onqVar = this$0.valueFormatter;
        if (onqVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueFormatter");
            onqVar = null;
        }
        this$0.mXAxis = new vqr(vfeVar4, i, onqVar);
        rtr rtrVar = this$0.mYAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar = null;
        }
        vqr vqrVar2 = this$0.mXAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
            vqrVar2 = null;
        }
        vfe vfeVar5 = this$0.mBarChartAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar5 = null;
        }
        this$0.mItemDecoration = new EcgChartItemDecoration(rtrVar, vqrVar2, vfeVar5);
        LineChartRecyclerView lineChartRecyclerView3 = this$0.recyclerView;
        if (lineChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView3 = null;
        }
        EcgChartItemDecoration ecgChartItemDecoration = this$0.mItemDecoration;
        if (ecgChartItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
            ecgChartItemDecoration = null;
        }
        lineChartRecyclerView3.addItemDecoration(ecgChartItemDecoration);
        mt5 mt5Var = new mt5(0);
        Context context2 = this$0.getContext();
        List<EcgEntry> list = this$0.mEntries;
        LineChartRecyclerView lineChartRecyclerView4 = this$0.recyclerView;
        if (lineChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        } else {
            lineChartRecyclerView = lineChartRecyclerView4;
        }
        vqr vqrVar3 = this$0.mXAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar3;
        }
        vfe vfeVar6 = this$0.mBarChartAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this$0.mBarChartAdapter = new ufe<>(context2, list, lineChartRecyclerView, vqrVar, vfeVar, mt5Var);
        LineChartRecyclerView lineChartRecyclerView5 = this$0.recyclerView;
        if (lineChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView5 = null;
        }
        ufe<EcgEntry> ufeVar = this$0.mBarChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar = null;
        }
        lineChartRecyclerView5.setAdapter(ufeVar);
        LineChartRecyclerView lineChartRecyclerView6 = this$0.recyclerView;
        if (lineChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            lineChartRecyclerView2 = lineChartRecyclerView6;
        }
        lineChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        this$0.setXAxis(this$0.displayNumber);
        this$0.reSizeYAxis();
    }

    private final void reSizeYAxis() {
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        rtr rtrVar = null;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        lineChartRecyclerView.scrollToPosition(0);
        rtr rtrVar2 = this.mYAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar2 = null;
        }
        rtr rtrVar3 = this.mYAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar3 = null;
        }
        rtr rtrVarH = rtrVar2.h(rtrVar3);
        Intrinsics.checkNotNullExpressionValue(rtrVarH, "resetEcgYAxis(...)");
        ufe<EcgEntry> ufeVar = this.mBarChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar = null;
        }
        ufeVar.notifyDataSetChanged();
        this.mYAxis = rtrVarH;
        EcgChartItemDecoration ecgChartItemDecoration = this.mItemDecoration;
        if (ecgChartItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
            ecgChartItemDecoration = null;
        }
        rtr rtrVar4 = this.mYAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar4 = null;
        }
        ecgChartItemDecoration.setYAxis(rtrVar4);
        ufe<EcgEntry> ufeVar2 = this.mBarChartAdapter;
        if (ufeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar2 = null;
        }
        rtr rtrVar5 = this.mYAxis;
        if (rtrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
        } else {
            rtrVar = rtrVar5;
        }
        ufeVar2.setYAxis(rtrVar);
    }

    private final void setListener() {
        Context context = getContext();
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        LineChartRecyclerView lineChartRecyclerView2 = null;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        hak hakVar = new hak(context, lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.ecg.view.EcgCombineView$setListener$mItemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    if (!recyclerView.canScrollHorizontally(-1) && this.isRightScrollInner) {
                        Logger.d(EcgCombineView.TAG, " can't Scroll left !");
                    } else {
                        if (recyclerView.canScrollHorizontally(1)) {
                            return;
                        }
                        Logger.d(EcgCombineView.TAG, " can't Scroll right !");
                    }
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                this.isRightScrollInner = dx < 0;
            }
        });
        LineChartRecyclerView lineChartRecyclerView3 = this.recyclerView;
        if (lineChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            lineChartRecyclerView2 = lineChartRecyclerView3;
        }
        lineChartRecyclerView2.addOnItemTouchListener(hakVar);
    }

    private final void setXAxis(int displayNumber) {
        vfe vfeVar = this.mBarChartAttrs;
        vqr vqrVar = null;
        if (vfeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar = null;
        }
        this.mXAxis = new vqr(vfeVar, displayNumber);
        ufe<EcgEntry> ufeVar = this.mBarChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar = null;
        }
        vqr vqrVar2 = this.mXAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
        } else {
            vqrVar = vqrVar2;
        }
        ufeVar.setXAxis(vqrVar);
    }

    public final void bindBarChartList(@NotNull float[] values, int distance) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.mEntries.clear();
        this.mEntries.addAll(createEntryList(values, distance));
        ufe<EcgEntry> ufeVar = this.mBarChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar = null;
        }
        ufeVar.notifyDataSetChanged();
    }

    public final void bindReport(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int timeInSec, int sparsePoints, @Nullable LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(ecgMedicalItemReport, "ecgMedicalItemReport");
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(ecgMedicalItemReport, timeInSec, sparsePoints, this, null), 2, null);
        }
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public final boolean getFirstFlag() {
        return this.firstFlag;
    }

    @NotNull
    public final List<EcgEntry> getMEntries() {
        return this.mEntries;
    }

    public final double getRatioSpeed() {
        return this.ratioSpeed;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LineChartRecyclerView lineChartRecyclerView = (LineChartRecyclerView) findViewById(eri.Ea);
        this.recyclerView = lineChartRecyclerView;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        this.mBarChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        initData();
        setListener();
    }

    public final void setAttrs(@Nullable AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    public final void setCurrentTimestamp(long j) {
        this.currentTimestamp = j;
    }

    public final void setFirstFlag(boolean z) {
        this.firstFlag = z;
    }

    public final void setMEntries(@NotNull List<EcgEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mEntries = list;
    }

    public final void setRatioSpeed(double d) {
        this.ratioSpeed = d;
    }
}
