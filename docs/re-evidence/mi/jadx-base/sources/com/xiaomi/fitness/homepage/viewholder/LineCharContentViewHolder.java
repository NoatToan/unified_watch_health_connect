package com.xiaomi.fitness.homepage.viewholder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEcgReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.util.BloodGlucoseHomeDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.dn5;
import defpackage.eri;
import defpackage.ffr;
import defpackage.iji;
import defpackage.km5;
import defpackage.l2c;
import defpackage.na8;
import defpackage.nf2;
import defpackage.pni;
import defpackage.qxi;
import defpackage.wfe;
import defpackage.x44;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\u00020\u0001:\u0001LB\u0019\u0012\u0006\u0010I\u001a\u00020H\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\bJ\u0010KJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\bR\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/LineCharContentViewHolder;", "Lnf2;", "Landroid/content/Context;", "context", "Lkm5;", "dataModel", "", "setBarchartAttr", "(Landroid/content/Context;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "validReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "record", "showEcgReport", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "showWeightRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "showEnergyRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "showBloodGlucoseRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;)V", "showBloodGlucoseFingerRecord", "showEmpty", "(Lkm5;)V", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "barChart", "bindEmptyEntries", "(Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;Lkm5;)V", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "list", "setXAxisView", "(Ljava/util/List;)V", "setXAxisTimeView", "setEcgHomeXAxisView", "()V", "bindData", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroid/widget/ImageView;", "imgType", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "txtDataTypeName", "Landroid/widget/TextView;", "txtSportContent", "imgTypeTitle", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "", "displayNumber", "I", "lineChart", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Ljava/lang/StringBuffer;", "talkback", "Ljava/lang/StringBuffer;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LineCharContentViewHolder extends nf2 {
    public static final int ECG_MEDICAL_HOME_CARD_DISPLAY_NUMBER = 300;

    @NotNull
    public static final String TAG = "LineCharContentViewHolder";

    @NotNull
    private final CustomBarChart<RecyclerBarEntry> barChart;

    @Nullable
    private final LifecycleCoroutineScope coroutineScope;
    private int displayNumber;

    @NotNull
    private final ImageView imgType;

    @NotNull
    private final ImageView imgTypeTitle;

    @NotNull
    private final DataCubicLineChart lineChart;

    @Nullable
    private StringBuffer talkback;

    @NotNull
    private final TextView txtDataTypeName;

    @NotNull
    private final TextView txtSportContent;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.viewholder.LineCharContentViewHolder$showEcgReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.viewholder.LineCharContentViewHolder", f = "LineCharContentViewHolder.kt", i = {0, 0, 0}, l = {148}, m = "showEcgReport", n = {"this", "dataModel", "record"}, s = {"L$0", "L$1", "L$2"})
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
            return LineCharContentViewHolder.this.showEcgReport(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.viewholder.LineCharContentViewHolder$showRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.viewholder.LineCharContentViewHolder$showRecord$1", f = "LineCharContentViewHolder.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ km5 $dataModel;
        final /* synthetic */ DailyBasicReport $report;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25821(Context context, km5 km5Var, DailyBasicReport dailyBasicReport, Continuation<? super C25821> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$dataModel = km5Var;
            this.$report = dailyBasicReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LineCharContentViewHolder.this.new C25821(this.$context, this.$dataModel, this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LineCharContentViewHolder lineCharContentViewHolder = LineCharContentViewHolder.this;
                Context context = this.$context;
                km5 km5Var = this.$dataModel;
                DailyEcgReport dailyEcgReport = (DailyEcgReport) this.$report;
                this.label = 1;
                if (lineCharContentViewHolder.showEcgReport(context, km5Var, dailyEcgReport, this) == coroutine_suspended) {
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
            return ((C25821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineCharContentViewHolder(@NotNull View itemView, @Nullable LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.coroutineScope = lifecycleCoroutineScope;
        this.displayNumber = 24;
        this.imgType = (ImageView) itemView.findViewById(eri.O7);
        this.imgTypeTitle = (ImageView) itemView.findViewById(eri.P7);
        this.txtDataTypeName = (TextView) itemView.findViewById(eri.ao);
        this.txtSportContent = (TextView) itemView.findViewById(eri.Cn);
        DataCubicLineChart dataCubicLineChart = (DataCubicLineChart) itemView.findViewById(eri.Ca);
        this.lineChart = dataCubicLineChart;
        this.barChart = (CustomBarChart) itemView.findViewById(eri.f0);
        setBaseCharView(dataCubicLineChart);
        this.xAxisView = (XAxisView) itemView.findViewById(eri.c);
    }

    private final void bindEmptyEntries(DataCubicLineChart barChart, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 8) {
            barChart.bindData(na8.b(new DailyEnergyReport(dataModel.f23978a, "days", "default_did"), this.displayNumber), new wfe(iji.s, pni.u, iji.t));
            return;
        }
        if (i == 10000) {
            List<MaxMinEntry> listD = ffr.d(new DailyWeightReport(dataModel.f23978a, "days"), this.displayNumber);
            barChart.bindData(listD, new wfe(iji.s, pni.u, iji.t));
            Intrinsics.checkNotNull(listD);
            setXAxisView(listD);
            return;
        }
        if (i == 402) {
            barChart.bindData(new ArrayList(), new wfe(iji.b3, pni.Q3, iji.A3));
        } else {
            if (i != 403) {
                return;
            }
            barChart.bindData(new ArrayList(), new wfe(iji.b3, pni.Q3, iji.A3));
        }
    }

    private final void setBarchartAttr(Context context, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 8) {
            this.displayNumber = 24;
            return;
        }
        if (i == 10000) {
            this.displayNumber = 7;
            return;
        }
        if (i == 402) {
            this.displayNumber = 300;
        } else {
            if (i != 403) {
                return;
            }
            this.displayNumber = 36;
            this.barChart.b(4, 1.0f, 11, 0.9f);
        }
    }

    private final void setEcgHomeXAxisView() {
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.U1, 0, 0);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.U1, 3, 3);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        this.xAxisView.setTxtXAxis1(quantityString);
        this.xAxisView.setTxtXAxis3(quantityString2);
    }

    private final void setXAxisTimeView(List<? extends MaxMinEntry> list) {
        if (list.isEmpty()) {
            return;
        }
        long j = list.get(0).timestamp;
        long j2 = list.get(list.size() - 1).timestamp;
        this.xAxisView.setTxtXAxis1(TimeDateUtil.getDateHHmm24Format(j));
        this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateHHmm24Format(j2));
    }

    private final void setXAxisView(List<? extends MaxMinEntry> list) {
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

    @SuppressLint({"SetTextI18n"})
    private final void showBloodGlucoseFingerRecord(Context context, km5 dataModel, DailyBloodSugarReport record) {
        List<RecyclerBarEntry> listCreateDayFingerBloodGlucoseHome = BloodGlucoseHomeDataUtil.INSTANCE.createDayFingerBloodGlucoseHome(record, record.getTime());
        BloodSugarItem latestFingerItem = record.getLatestFingerItem();
        float fBloodSugar = latestFingerItem != null ? latestFingerItem.bloodSugar() : -1.0f;
        this.talkback = new StringBuffer();
        if (fBloodSugar < 0.0f || listCreateDayFingerBloodGlucoseHome.isEmpty()) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        this.barChart.getAttribute().h = 0;
        this.txtDataTypeName.setText(ResourceExtKt.getQuantityString(context, qxi.X, (int) fBloodSugar, String.valueOf(fBloodSugar)));
        TextView textView = this.txtSportContent;
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
        BloodSugarItem latestFingerItem2 = record.getLatestFingerItem();
        textView.setText(dateMMddFormat + " " + TimeDateUtil.getDateStr(latestFingerItem2 != null ? latestFingerItem2.getTime() : dataModel.f23978a, TimeUtils.FORMAT_H_M));
        this.barChart.setEntryData(listCreateDayFingerBloodGlucoseHome);
        this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.k0));
        this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.j0));
        this.barChart.setVisibility(0);
        this.lineChart.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    private final void showBloodGlucoseRecord(Context context, km5 dataModel, DailyBloodSugarReport record) {
        List<MaxMinEntry> listCreateDayBloodGlucoseHome = BloodGlucoseHomeDataUtil.INSTANCE.createDayBloodGlucoseHome(record);
        BloodSugarItem latestItem = record.getLatestItem();
        float fBloodSugar = latestItem != null ? latestItem.bloodSugar() : -1.0f;
        this.talkback = new StringBuffer();
        if (fBloodSugar < 0.0f || listCreateDayBloodGlucoseHome.isEmpty()) {
            showBloodGlucoseFingerRecord(context, dataModel, record);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        int i = (int) fBloodSugar;
        String quantityString = ResourceExtKt.getQuantityString(context, qxi.X, i, String.valueOf(fBloodSugar));
        if (fBloodSugar == 2.0f) {
            quantityString = context.getResources().getQuantityString(qxi.c, i, String.valueOf(fBloodSugar));
        } else if (fBloodSugar == 25.0f) {
            quantityString = context.getResources().getQuantityString(qxi.f31939b, i, String.valueOf(fBloodSugar));
        }
        this.txtDataTypeName.setText(quantityString);
        TextView textView = this.txtSportContent;
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
        BloodSugarItem latestItem2 = record.getLatestItem();
        Intrinsics.checkNotNull(latestItem2);
        textView.setText(dateMMddFormat + " " + TimeDateUtil.getDateHHmmFormat(latestItem2.getTime()));
        if (record.getLatestItem() != null) {
            BloodSugarItem latestItem3 = record.getLatestItem();
            Intrinsics.checkNotNull(latestItem3);
            if (latestItem3.getTrend() > 0) {
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.g), Integer.valueOf(pni.h), Integer.valueOf(pni.e), Integer.valueOf(pni.d), Integer.valueOf(pni.f)});
                this.imgTypeTitle.setVisibility(0);
                BloodSugarItem latestItem4 = record.getLatestItem();
                Intrinsics.checkNotNull(latestItem4);
                this.imgTypeTitle.setBackgroundResource(((Number) listListOf.get(latestItem4.getTrend() - 1)).intValue());
            }
        }
        DataCubicLineChart dataCubicLineChart = this.lineChart;
        dataCubicLineChart.setRenderer(new BloodGlucoseLineChartRender(dataCubicLineChart, dataCubicLineChart.getAnimator(), this.lineChart.getViewPortHandler()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider((ViewModelStoreOwner) context).get(BloodGlucoseViewModel.class);
        bloodGlucoseViewModel.getBloodSugarRemindSettingFromLocal();
        ListExtKt.add(arrayList2, Float.valueOf(3.0f));
        ListExtKt.add(arrayList2, Float.valueOf(bloodGlucoseViewModel.getLowSettingValue()));
        ListExtKt.add(arrayList2, Float.valueOf(bloodGlucoseViewModel.getHighSettingValue()));
        ListExtKt.add(arrayList2, Float.valueOf(13.9f));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.L)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.N)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.P)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.O)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.M)));
        this.lineChart.bindData(listCreateDayBloodGlucoseHome, (wfe) null);
        setXAxisTimeView(listCreateDayBloodGlucoseHome);
        dn5 renderer = this.lineChart.getRenderer();
        Intrinsics.checkNotNull(renderer, "null cannot be cast to non-null type com.xiaomi.fitness.homepage.viewholder.BloodGlucoseLineChartRender");
        ((BloodGlucoseLineChartRender) renderer).setHeartLine(true, arrayList2, arrayList);
        this.lineChart.getMLineChartAttr().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
            stringBuffer.append(", ");
        }
        this.barChart.setVisibility(8);
        this.lineChart.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showEcgReport(Context context, km5 km5Var, DailyEcgReport dailyEcgReport, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        LineCharContentViewHolder lineCharContentViewHolder;
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
            LineCharContentViewHolder$showEcgReport$barEntries$1 lineCharContentViewHolder$showEcgReport$barEntries$1 = new LineCharContentViewHolder$showEcgReport$barEntries$1(dailyEcgReport, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = km5Var;
            anonymousClass1.L$2 = dailyEcgReport;
            anonymousClass1.label = 1;
            objWithContext = BuildersKt.withContext(io2, lineCharContentViewHolder$showEcgReport$barEntries$1, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            lineCharContentViewHolder = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dailyEcgReport = (DailyEcgReport) anonymousClass1.L$2;
            km5Var = (km5) anonymousClass1.L$1;
            lineCharContentViewHolder = (LineCharContentViewHolder) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        List list = (List) objWithContext;
        EcgMedicalItemReport latestItem = dailyEcgReport.getLatestItem();
        Logger.d(TAG, "showEcgReport latestRecord=" + (latestItem != null ? latestItem : AbstractJsonLexerKt.NULL));
        wfe wfeVar = new wfe(iji.b3, pni.Q3, iji.A3);
        int iIntValue = (latestItem == null || (avgHr = latestItem.getAvgHr()) == null) ? 0 : avgHr.intValue();
        if (latestItem != null) {
            Logger.d(TAG, "avgHr=" + iIntValue);
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.c0, iIntValue, iIntValue > 0 ? String.valueOf(iIntValue) : "--");
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String string = ResourceExtKt.getString(c0j.O7, TimeDateUtil.getDateMMddFormat(latestItem.getTimestamp()), quantityString);
            lineCharContentViewHolder.txtDataTypeName.setText(ResourceExtKt.getString(c0j.na));
            lineCharContentViewHolder.txtSportContent.setText(string);
            lineCharContentViewHolder.lineChart.bindData(list, wfeVar);
            lineCharContentViewHolder.lineChart.setEcgMaxAndMin();
            lineCharContentViewHolder.lineChart.getMLineChartAttr().h = 0;
            StringBuffer stringBuffer = new StringBuffer();
            lineCharContentViewHolder.talkback = stringBuffer;
            stringBuffer.append(ResourceExtKt.getString(c0j.na));
            stringBuffer.append(", ");
            StringBuffer stringBuffer2 = lineCharContentViewHolder.talkback;
            if (stringBuffer2 != null) {
                stringBuffer2.append(string);
            }
            OnLoadDataListener onLoadDataListener = lineCharContentViewHolder.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
        } else {
            lineCharContentViewHolder.showEmpty(km5Var);
        }
        return Unit.INSTANCE;
    }

    private final void showEmpty(km5 dataModel) {
        this.txtDataTypeName.setText(l2c.b(dataModel.f23979b));
        int i = dataModel.f23979b;
        if (i == 402) {
            this.txtSportContent.setText(ResourceExtKt.getString(c0j.Na));
        } else if (i == 403) {
            this.txtSportContent.setText(ResourceExtKt.getString(c0j.L0));
        } else {
            this.txtSportContent.setText(ResourceExtKt.getString(c0j.common_data_empty));
        }
        this.lineChart.getMLineChartAttr().h = 1;
        bindEmptyEntries(this.lineChart, dataModel);
        this.barChart.setVisibility(8);
        this.lineChart.setVisibility(0);
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Iq, ResourceExtKt.getString(c0j.x7)));
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(false);
        }
    }

    private final void showEnergyRecord(Context context, km5 dataModel, DailyEnergyReport record) {
        List<MaxMinEntry> listB = na8.b(record, this.displayNumber);
        int iG = na8.g(listB);
        this.talkback = new StringBuffer();
        if (iG <= 0) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        wfe wfeVar = new wfe(iji.s, pni.u, iji.t);
        this.txtDataTypeName.setText(ResourceExtKt.getString(c0j.M6, xr5.h(iG)));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        this.lineChart.bindData(listB, wfeVar);
        this.lineChart.getMLineChartAttr().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.M6, xr5.h(iG)));
        }
    }

    private final void showRecord(Context context, km5 dataModel, DailyBasicReport report) {
        if (report instanceof DailyWeightReport) {
            showWeightRecord(context, dataModel, (DailyWeightReport) report);
            return;
        }
        if (report instanceof DailyEnergyReport) {
            showEnergyRecord(context, dataModel, (DailyEnergyReport) report);
            return;
        }
        if (!(report instanceof DailyEcgReport)) {
            if (report instanceof DailyBloodSugarReport) {
                showBloodGlucoseRecord(context, dataModel, (DailyBloodSugarReport) report);
            }
        } else {
            LifecycleCoroutineScope lifecycleCoroutineScope = this.coroutineScope;
            if (lifecycleCoroutineScope != null) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new C25821(context, dataModel, report, null), 3, null);
            }
        }
    }

    private final void showWeightRecord(Context context, km5 dataModel, DailyWeightReport record) {
        List<MaxMinEntry> listD = ffr.d(record, this.displayNumber);
        float fH = ffr.h(listD);
        if (fH <= 0.0f) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        wfe wfeVar = new wfe(iji.s, pni.u, iji.t);
        TextView textView = this.txtDataTypeName;
        Resources resources = context.getResources();
        int i = qxi.J1;
        int iJ = xr5.j(fH);
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        textView.setText(resources.getQuantityString(i, iJ, weightEvaluationHelper.formatFloatValue(2, fH)));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        this.lineChart.bindData(listD, wfeVar);
        this.lineChart.getMLineChartAttr().h = 0;
        Intrinsics.checkNotNull(listD);
        setXAxisView(listD);
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(context.getResources().getQuantityString(qxi.J1, xr5.j(fH), weightEvaluationHelper.formatFloatValue(2, fH)));
        }
    }

    private final boolean validReport(DailyBasicReport report) {
        return (report instanceof DailyWeightReport) || (report instanceof DailyEnergyReport) || (report instanceof DailyEcgReport) || (report instanceof DailyBloodSugarReport);
    }

    public final void bindData(@NotNull Context context, @NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(context, dataModel);
        this.imgType.setImageResource(HealthUtil.getSportTypeImageHomePage(dataModel.f23979b));
        DailyBasicReport dailyBasicReport = dataModel.h;
        this.talkback = new StringBuffer();
        if (dailyBasicReport == null || !validReport(dailyBasicReport)) {
            showEmpty(dataModel);
        } else {
            showRecord(context, dataModel, dailyBasicReport);
        }
        if (dataModel.f23979b == 402) {
            setEcgHomeXAxisView();
            this.lineChart.getMLineChartAttr().o = 1.67f;
        } else {
            this.lineChart.getMLineChartAttr().o = 2.0f;
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
    }

    @Nullable
    public final LifecycleCoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }
}
