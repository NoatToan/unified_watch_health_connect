package com.xiaomi.fitness.health.ecg;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.EcgChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.ecg.EcgLandScapeActivity;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import defpackage.c0j;
import defpackage.hak;
import defpackage.jui;
import defpackage.mt5;
import defpackage.ni0;
import defpackage.onq;
import defpackage.qxi;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001OB\u0007¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0013R\u0014\u0010M\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0013¨\u0006P"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgLandScapeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lni0;", "", "initData", "()V", "", Constants.KEY_RECHARGE_VALUES, "", "distance", "", "Lcom/xiaomi/fitness/chart/entrys/EcgEntry;", "createEntryList", "([FI)Ljava/util/List;", "bindBarChartList", "([FI)V", "setListener", "computeDisplayNumber", "()I", "reSizeYAxis", "displayNumber", "setXAxis", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMedicalItemReport", "timeInSec", "sparsePoints", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "bindReport", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IILandroidx/lifecycle/LifecycleCoroutineScope;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvfe;", "mBarChartAttrs", "Lvfe;", "Lufe;", "mBarChartAdapter", "Lufe;", "", "mEntries", "Ljava/util/List;", "getMEntries", "()Ljava/util/List;", "setMEntries", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/EcgChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/EcgChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "I", "", "currentTimestamp", "J", "getCurrentTimestamp", "()J", "setCurrentTimestamp", "(J)V", "ecgMeasureReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgLandScapeActivity extends BaseBindingActivity<EcgViewModel, ni0> {

    @NotNull
    public static final String TAG = "EcgLandScapeActivity";
    private long currentTimestamp;
    private int displayNumber;

    @Nullable
    private EcgMedicalItemReport ecgMeasureReport;
    private ufe<EcgEntry> mBarChartAdapter;
    private vfe mBarChartAttrs;

    @NotNull
    private List<EcgEntry> mEntries = new ArrayList();
    private EcgChartItemDecoration mItemDecoration;
    private vqr mXAxis;
    private rtr mYAxis;
    private LineChartRecyclerView recyclerView;
    private onq valueFormatter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgLandScapeActivity$bindReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgLandScapeActivity$bindReport$1", f = "EcgLandScapeActivity.kt", i = {}, l = {129, 130}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcgMedicalItemReport $ecgMedicalItemReport;
        final /* synthetic */ int $sparsePoints;
        final /* synthetic */ int $timeInSec;
        int label;
        final /* synthetic */ EcgLandScapeActivity this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgLandScapeActivity$bindReport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgLandScapeActivity$bindReport$1$1", f = "EcgLandScapeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ float[] $floatArray;
            final /* synthetic */ int $sparsePoints;
            int label;
            final /* synthetic */ EcgLandScapeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05911(float[] fArr, EcgLandScapeActivity ecgLandScapeActivity, int i, Continuation<? super C05911> continuation) {
                super(2, continuation);
                this.$floatArray = fArr;
                this.this$0 = ecgLandScapeActivity;
                this.$sparsePoints = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05911(this.$floatArray, this.this$0, this.$sparsePoints, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                float[] fArr = this.$floatArray;
                if (fArr != null) {
                    this.this$0.bindBarChartList(fArr, 20 / this.$sparsePoints);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, EcgLandScapeActivity ecgLandScapeActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ecgMedicalItemReport = ecgMedicalItemReport;
            this.$timeInSec = i;
            this.$sparsePoints = i2;
            this.this$0 = ecgLandScapeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ecgMedicalItemReport, this.$timeInSec, this.$sparsePoints, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            EcgMedicalItemReport ecgMedicalItemReport = this.$ecgMedicalItemReport;
            int i2 = this.$timeInSec;
            int i3 = this.$sparsePoints;
            this.label = 1;
            obj = ecgMedicalItemReport.getRecordData(i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C05911 c05911 = new C05911((float[]) obj, this.this$0, this.$sparsePoints, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c05911, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBarChartList(float[] values, int distance) {
        this.mEntries.clear();
        this.mEntries.addAll(createEntryList(values, distance));
        ufe<EcgEntry> ufeVar = this.mBarChartAdapter;
        LineChartRecyclerView lineChartRecyclerView = null;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            ufeVar = null;
        }
        ufeVar.notifyDataSetChanged();
        LineChartRecyclerView lineChartRecyclerView2 = this.recyclerView;
        if (lineChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            lineChartRecyclerView = lineChartRecyclerView2;
        }
        lineChartRecyclerView.scrollToPosition(0);
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
        Logger.d("EcgLand", "values: " + values);
        LocalDate localDatePlusDays = LocalDate.now().plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays) - (((long) length) * TimeDateUtil.TIME_HOUR);
        this.currentTimestamp = jChangZeroOfTheDay;
        List<EcgEntry> listA = ta7.a(jChangZeroOfTheDay, length, this.mEntries.size(), values, distance, true);
        Intrinsics.checkNotNullExpressionValue(listA, "createEcgEntries(...)");
        return listA;
    }

    private final void initData() {
        String strValueOf;
        Integer avgHr;
        Integer avgHr2;
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        lineChartRecyclerView.post(new Runnable() { // from class: pb7
            @Override // java.lang.Runnable
            public final void run() {
                EcgLandScapeActivity.initData$lambda$1(this.f30195a);
            }
        });
        EcgMedicalItemReport ecgMedicalItemReport = this.ecgMeasureReport;
        if (ecgMedicalItemReport == null || (avgHr2 = ecgMedicalItemReport.getAvgHr()) == null || avgHr2.intValue() <= 0) {
            strValueOf = "--";
        } else {
            EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
            strValueOf = String.valueOf(ecgMedicalItemReport2 != null ? ecgMedicalItemReport2.getAvgHr() : null);
        }
        TextView textView = getMBinding().C;
        Resources resources = getResources();
        int i = qxi.c0;
        EcgMedicalItemReport ecgMedicalItemReport3 = this.ecgMeasureReport;
        textView.setText(resources.getQuantityString(i, (ecgMedicalItemReport3 == null || (avgHr = ecgMedicalItemReport3.getAvgHr()) == null) ? 0 : avgHr.intValue(), strValueOf));
        EcgMedicalItemReport ecgMedicalItemReport4 = this.ecgMeasureReport;
        if (ecgMedicalItemReport4 != null) {
            setTitle(TimeUtils.formatDate(getString(c0j.h), Long.valueOf(ecgMedicalItemReport4.getMeasureTime() * ((long) 1000))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(EcgLandScapeActivity this$0) {
        LineChartRecyclerView lineChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.displayNumber = this$0.computeDisplayNumber();
        this$0.valueFormatter = new yqr();
        vfe vfeVar2 = this$0.mBarChartAttrs;
        LineChartRecyclerView lineChartRecyclerView2 = null;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar2 = null;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this$0, vfeVar2);
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
        this$0.mBarChartAdapter = new ufe<>(this$0, list, lineChartRecyclerView, vqrVar, vfeVar, mt5Var);
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
        Logger.d(TAG, "displayNumber: " + this$0.displayNumber);
        this$0.setXAxis(this$0.displayNumber);
        this$0.reSizeYAxis();
        EcgMedicalItemReport ecgMedicalItemReport = this$0.ecgMeasureReport;
        if (ecgMedicalItemReport != null) {
            this$0.bindReport(ecgMedicalItemReport, ecgMedicalItemReport.getMeasureDuration(), 1, LifecycleOwnerKt.getLifecycleScope(this$0));
        }
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
        LineChartRecyclerView lineChartRecyclerView = this.recyclerView;
        LineChartRecyclerView lineChartRecyclerView2 = null;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        hak hakVar = new hak(this, lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.ecg.EcgLandScapeActivity$setListener$mItemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    if (!recyclerView.canScrollHorizontally(-1) && this.isRightScrollInner) {
                        Logger.d(EcgLandScapeActivity.TAG, " can't Scroll left !");
                    } else {
                        if (recyclerView.canScrollHorizontally(1)) {
                            return;
                        }
                        Logger.d(EcgLandScapeActivity.TAG, " can't Scroll right !");
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

    public final void bindReport(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int timeInSec, int sparsePoints, @Nullable LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(ecgMedicalItemReport, "ecgMedicalItemReport");
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(ecgMedicalItemReport, timeInSec, sparsePoints, this, null), 2, null);
        }
    }

    public final long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.c;
    }

    @NotNull
    public final List<EcgEntry> getMEntries() {
        return this.mEntries;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c0j.na);
        this.ecgMeasureReport = (EcgMedicalItemReport) getIntent().getSerializableExtra(EcgConstantsKt.PARAM_REPORT);
        LineChartRecyclerView lineChartRecyclerView = getMBinding().B;
        this.recyclerView = lineChartRecyclerView;
        if (lineChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            lineChartRecyclerView = null;
        }
        this.mBarChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded()) {
            setRequestedOrientation(0);
        }
        initData();
        setListener();
    }

    public final void setCurrentTimestamp(long j) {
        this.currentTimestamp = j;
    }

    public final void setMEntries(@NotNull List<EcgEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mEntries = list;
    }
}
