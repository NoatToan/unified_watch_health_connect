package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEcgReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.HealthAdapterV2;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;
import defpackage.c0j;
import defpackage.ffr;
import defpackage.iji;
import defpackage.km5;
import defpackage.kp5;
import defpackage.l2c;
import defpackage.na8;
import defpackage.nf2;
import defpackage.pni;
import defpackage.qxi;
import defpackage.u7e;
import defpackage.ul5;
import defpackage.wfe;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001DB!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\bB\u0010CJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0006R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/LineCharContentViewHolderV2;", "Lnf2;", "Lkm5;", "dataModel", "", "setBarchartAttr", "(Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "validReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "record", "showEcgReport", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "showWeightRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "showEnergyRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;)V", "showEmpty", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "barChart", "bindEmptyEntries", "(Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;Lkm5;)V", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "list", "setMdXAxisView", "(Ljava/util/List;)V", "setDefaultXAxisView", "()V", "setEcgHomeXAxisView", "bindData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "cardTitleView", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Landroid/view/View;", "emptySpace", "Landroid/view/View;", "lineChart", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "", "displayNumber", "I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "talkback", "Ljava/lang/StringBuilder;", "Lu7e;", "binding", "<init>", "(Landroid/content/Context;Lu7e;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LineCharContentViewHolderV2 extends nf2 {
    public static final int ECG_MEDICAL_HOME_CARD_DISPLAY_NUMBER = 300;

    @NotNull
    public static final String TAG = "LineCharContentViewHolderV2";

    @NotNull
    private final HomeCardCommonTitleView cardTitleView;

    @NotNull
    private final Context context;

    @Nullable
    private final LifecycleCoroutineScope coroutineScope;
    private int displayNumber;

    @NotNull
    private final View emptySpace;

    @NotNull
    private final DataCubicLineChart lineChart;

    @NotNull
    private final StringBuilder talkback;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.v2.holder.LineCharContentViewHolderV2$showEcgReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.v2.holder.LineCharContentViewHolderV2", f = "LineCharContentViewHolderV2.kt", i = {0, 0, 0}, l = {123}, m = "showEcgReport", n = {"this", "dataModel", "record"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LineCharContentViewHolderV2.this.showEcgReport(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.v2.holder.LineCharContentViewHolderV2$showRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.v2.holder.LineCharContentViewHolderV2$showRecord$1", f = "LineCharContentViewHolderV2.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ km5 $dataModel;
        final /* synthetic */ DailyBasicReport $report;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33211(km5 km5Var, DailyBasicReport dailyBasicReport, Continuation<? super C33211> continuation) {
            super(2, continuation);
            this.$dataModel = km5Var;
            this.$report = dailyBasicReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LineCharContentViewHolderV2.this.new C33211(this.$dataModel, this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LineCharContentViewHolderV2 lineCharContentViewHolderV2 = LineCharContentViewHolderV2.this;
                km5 km5Var = this.$dataModel;
                DailyEcgReport dailyEcgReport = (DailyEcgReport) this.$report;
                this.label = 1;
                if (lineCharContentViewHolderV2.showEcgReport(km5Var, dailyEcgReport, this) == coroutine_suspended) {
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
            return ((C33211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineCharContentViewHolderV2(@NotNull Context context, @NotNull u7e binding, @Nullable LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        this.coroutineScope = lifecycleCoroutineScope;
        HomeCardCommonTitleView cardTitleView = binding.A;
        Intrinsics.checkNotNullExpressionValue(cardTitleView, "cardTitleView");
        this.cardTitleView = cardTitleView;
        XAxisView xAxisView = binding.D;
        Intrinsics.checkNotNullExpressionValue(xAxisView, "xAxisView");
        this.xAxisView = xAxisView;
        View emptySpace = binding.B;
        Intrinsics.checkNotNullExpressionValue(emptySpace, "emptySpace");
        this.emptySpace = emptySpace;
        DataCubicLineChart lineChart = binding.C;
        Intrinsics.checkNotNullExpressionValue(lineChart, "lineChart");
        this.lineChart = lineChart;
        this.displayNumber = 24;
        this.talkback = new StringBuilder();
        setBaseCharView(lineChart);
    }

    private final void bindEmptyEntries(DataCubicLineChart barChart, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 8) {
            barChart.bindData(na8.b(new DailyEnergyReport(dataModel.f23978a, "days", "default_did"), this.displayNumber), new wfe(iji.s, pni.u, iji.t));
            return;
        }
        if (i == 402) {
            barChart.bindData(new ArrayList(), new wfe(iji.b3, pni.Q3, iji.A3));
        } else {
            if (i != 10000) {
                return;
            }
            List<MaxMinEntry> listD = ffr.d(new DailyWeightReport(dataModel.f23978a, "days"), this.displayNumber);
            barChart.bindData(listD, new wfe(iji.s, pni.u, iji.t));
            Intrinsics.checkNotNull(listD);
            setMdXAxisView(listD);
        }
    }

    private final void setBarchartAttr(km5 dataModel) {
        this.lineChart.getMLineChartAttr().o = 2.0f;
        int i = dataModel.f23979b;
        if (i == 8) {
            this.displayNumber = 24;
            setDefaultXAxisView();
        } else if (i != 402) {
            if (i != 10000) {
                return;
            }
            this.displayNumber = 7;
        } else {
            this.displayNumber = 300;
            setEcgHomeXAxisView();
            this.lineChart.getMLineChartAttr().o = 1.67f;
        }
    }

    private final void setDefaultXAxisView() {
        this.xAxisView.setTxtXAxis1(this.context.getString(c0j.f));
        this.xAxisView.setTxtXAxis3(this.context.getString(c0j.g));
    }

    private final void setEcgHomeXAxisView() {
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.U1, 0, 0);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.U1, 3, 3);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        this.xAxisView.setTxtXAxis1(quantityString);
        this.xAxisView.setTxtXAxis3(quantityString2);
    }

    private final void setMdXAxisView(List<? extends MaxMinEntry> list) {
        if (list.isEmpty()) {
            return;
        }
        LocalDate localDate = list.get(0).localDate;
        LocalDate localDate2 = list.get(list.size() - 1).localDate;
        if (localDate != null) {
            this.xAxisView.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDate));
        }
        if (localDate2 != null) {
            this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDate2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showEcgReport(km5 km5Var, DailyEcgReport dailyEcgReport, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        LineCharContentViewHolderV2 lineCharContentViewHolderV2;
        String quantityString;
        Integer avgHr;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            LineCharContentViewHolderV2$showEcgReport$barEntries$1 lineCharContentViewHolderV2$showEcgReport$barEntries$1 = new LineCharContentViewHolderV2$showEcgReport$barEntries$1(dailyEcgReport, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = km5Var;
            anonymousClass1.L$2 = dailyEcgReport;
            anonymousClass1.label = 1;
            objWithContext = BuildersKt.withContext(io2, lineCharContentViewHolderV2$showEcgReport$barEntries$1, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            lineCharContentViewHolderV2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dailyEcgReport = (DailyEcgReport) anonymousClass1.L$2;
            km5Var = (km5) anonymousClass1.L$1;
            lineCharContentViewHolderV2 = (LineCharContentViewHolderV2) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        List list = (List) objWithContext;
        EcgMedicalItemReport latestItem = dailyEcgReport.getLatestItem();
        Logger.d(TAG, "showEcgReport latestRecord=" + (latestItem != null ? latestItem : AbstractJsonLexerKt.NULL));
        wfe wfeVar = new wfe(iji.b3, pni.Q3, iji.A3);
        int iIntValue = (latestItem == null || (avgHr = latestItem.getAvgHr()) == null) ? 0 : avgHr.intValue();
        if (latestItem != null) {
            if (iIntValue <= 0) {
                quantityString = "--";
            } else {
                quantityString = lineCharContentViewHolderV2.context.getResources().getQuantityString(qxi.common_unit_heart_rate_desc, iIntValue, Boxing.boxInt(iIntValue));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            }
            String date = TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Boxing.boxLong(latestItem.getTimestamp() * ((long) 1000)));
            lineCharContentViewHolderV2.cardTitleView.showValueAndDesc(quantityString, date);
            lineCharContentViewHolderV2.lineChart.bindData(list, wfeVar);
            lineCharContentViewHolderV2.lineChart.setEcgMaxAndMin();
            lineCharContentViewHolderV2.lineChart.getMLineChartAttr().h = 0;
            StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(lineCharContentViewHolderV2.talkback);
            sbClear.append(ResourceExtKt.getString(c0j.na));
            sbClear.append(", ");
            sbClear.append(date);
            sbClear.append(", ");
            sbClear.append(quantityString);
            OnLoadDataListener onLoadDataListener = lineCharContentViewHolderV2.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
        } else {
            lineCharContentViewHolderV2.showEmpty(km5Var);
            OnLoadDataListener onLoadDataListener2 = lineCharContentViewHolderV2.onLoadDataListener;
            if (onLoadDataListener2 != null) {
                onLoadDataListener2.onLoadData(false);
            }
        }
        return Unit.INSTANCE;
    }

    private final void showEmpty(km5 dataModel) {
        String string;
        ViewExtKt.setVisible(this.emptySpace, true);
        int i = dataModel.f23979b;
        if (i == 8) {
            HomeCardCommonTitleView homeCardCommonTitleView = this.cardTitleView;
            String string2 = this.context.getString(c0j.Zb);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            HomeCardCommonTitleView.showEmpty$default(homeCardCommonTitleView, string2, null, 2, null);
            string = this.context.getString(c0j.Zb);
        } else if (i == 402) {
            HomeCardCommonTitleView homeCardCommonTitleView2 = this.cardTitleView;
            String string3 = this.context.getString(c0j.Qb);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            HomeCardCommonTitleView.showEmpty$default(homeCardCommonTitleView2, string3, null, 2, null);
            string = this.context.getString(c0j.Qb);
        } else if (i != 10000) {
            HomeCardCommonTitleView.showEmpty$default(this.cardTitleView, ResourceExtKt.getString(c0j.common_data_empty), null, 2, null);
            string = "";
        } else {
            HomeCardCommonTitleView homeCardCommonTitleView3 = this.cardTitleView;
            String string4 = this.context.getString(c0j.Wb);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            HomeCardCommonTitleView.showEmpty$default(homeCardCommonTitleView3, string4, null, 2, null);
            string = this.context.getString(c0j.Wb);
        }
        Intrinsics.checkNotNull(string);
        this.lineChart.getMLineChartAttr().h = 1;
        bindEmptyEntries(this.lineChart, dataModel);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.Iq, l2c.b(i)));
        sbClear.append(", ");
        sbClear.append(string);
    }

    private final void showEnergyRecord(km5 dataModel, DailyEnergyReport record) {
        List<MaxMinEntry> listB = na8.b(record, this.displayNumber);
        int iG = na8.g(listB);
        if (iG <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
                return;
            }
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        wfe wfeVar = new wfe(iji.s, pni.u, iji.t);
        this.cardTitleView.showValueAndDesc(ResourceExtKt.getString(c0j.N6, xr5.h(iG)), TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        this.lineChart.bindData(listB, wfeVar);
        this.lineChart.getMLineChartAttr().h = 0;
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.M6, xr5.h(iG)));
    }

    private final void showRecord(km5 dataModel, DailyBasicReport report) {
        LifecycleCoroutineScope lifecycleCoroutineScope;
        if (report instanceof DailyWeightReport) {
            showWeightRecord(dataModel, (DailyWeightReport) report);
            return;
        }
        if (report instanceof DailyEnergyReport) {
            showEnergyRecord(dataModel, (DailyEnergyReport) report);
        } else {
            if (!(report instanceof DailyEcgReport) || (lifecycleCoroutineScope = this.coroutineScope) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new C33211(dataModel, report, null), 3, null);
        }
    }

    private final void showWeightRecord(km5 dataModel, DailyWeightReport record) {
        List<MaxMinEntry> listD = ffr.d(record, this.displayNumber);
        List<WeightItem> weightRecordList = record.getWeightRecordList();
        WeightItem weightItem = weightRecordList != null ? (WeightItem) CollectionsKt___CollectionsKt.lastOrNull((List) weightRecordList) : null;
        float weight = weightItem != null ? weightItem.getWeight() : 0.0f;
        if (weight <= 0.0f) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
                return;
            }
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        wfe wfeVar = new wfe(iji.s, pni.u, iji.t);
        String string = this.context.getResources().getString(c0j.o4, Float.valueOf(weight));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = ResourceExtKt.getString(c0j.h);
        Intrinsics.checkNotNull(weightItem);
        String date = TimeUtils.formatDate(string2, Long.valueOf(weightItem.getTime() * ((long) 1000)));
        this.cardTitleView.showValueAndDesc(string, date);
        this.lineChart.bindData(listD, wfeVar);
        this.lineChart.getMLineChartAttr().h = 0;
        Intrinsics.checkNotNull(listD);
        setMdXAxisView(listD);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(date);
        sbClear.append(", ");
        sbClear.append(this.context.getResources().getQuantityString(qxi.J1, xr5.j(weight), WeightEvaluationHelper.INSTANCE.formatFloatValue(2, weight)));
    }

    private final boolean validReport(DailyBasicReport report) {
        return (report instanceof DailyWeightReport) || (report instanceof DailyEnergyReport) || (report instanceof DailyEcgReport);
    }

    public final void bindData(@NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(dataModel);
        kp5 kp5VarA = ul5.c().a(dataModel.f23979b);
        this.cardTitleView.updateCardBgAndTitle(kp5VarA.c, kp5VarA.f24128b);
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !validReport(dailyBasicReport)) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
        } else {
            ViewExtKt.setVisible(this.emptySpace, false);
            showRecord(dataModel, dailyBasicReport);
        }
        Logger.d(HealthAdapterV2.TAG, "talkback content:" + ((Object) this.talkback));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }

    @Nullable
    public final LifecycleCoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }
}
