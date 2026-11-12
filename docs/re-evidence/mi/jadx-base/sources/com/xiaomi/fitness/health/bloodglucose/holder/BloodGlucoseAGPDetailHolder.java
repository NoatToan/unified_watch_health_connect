package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fit.fitness.export.data.aggregation.AGPItem;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseAGPDetailHolder;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ni4;
import defpackage.pni;
import defpackage.rtr;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.vx2;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010E\u001a\u00020\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0016R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0016R\u0018\u00109\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseAGPDetailHolder;", "", "Landroid/content/Context;", "context", "", "initBloodGlucoseLevel", "(Landroid/content/Context;)V", "initChartView", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "data", "", "startTime", "refreshBarChart", "(Landroid/content/Context;Ljava/util/Map;J)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "report", "bindData", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;)V", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvx2;", "Lsf2;", "mLineChartAdapter", "Lvx2;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "agpChartGuideView", "Landroid/widget/TextView;", "agpNoDataView", "Landroid/widget/TextView;", "agpNoDataDividerView", "tvTitleDec", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifeCycle", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "mViewModel", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "mBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivExpandView", "Landroidx/appcompat/widget/AppCompatImageView;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseAGPDetailHolder {

    @NotNull
    private View agpChartGuideView;

    @NotNull
    private View agpNoDataDividerView;

    @NotNull
    private TextView agpNoDataView;
    private DataTitleView dataTitleView;

    @Nullable
    private AppCompatImageView ivExpandView;

    @NotNull
    private final ViewModelStoreOwner lifeCycle;

    @Nullable
    private vfe lineChartAttrs;

    @NotNull
    private final LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private BloodSugarGMIAndAGPResult mBloodSugarReport;

    @Nullable
    private List<MaxMinEntry> mChartEntries;
    private final Context mContext;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private vx2<sf2> mLineChartAdapter;

    @NotNull
    private final View mRootView;

    @Nullable
    private BloodGlucoseViewModel mViewModel;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private TextView tvTitleDec;

    /* JADX WARN: Multi-variable type inference failed */
    public BloodGlucoseAGPDetailHolder(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(eri.y0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        Context context = viewFindViewById.getContext();
        this.mContext = context;
        View viewFindViewById2 = itemView.findViewById(eri.Vg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.lineChartRecyclerView = (LineChartRecyclerView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(eri.t);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.agpChartGuideView = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(eri.w0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.agpNoDataView = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(eri.x0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.agpNoDataDividerView = viewFindViewById5;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) context;
        this.lifeCycle = viewModelStoreOwner;
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider(viewModelStoreOwner).get(BloodGlucoseViewModel.class);
        this.mViewModel = bloodGlucoseViewModel;
        if (bloodGlucoseViewModel != null) {
            bloodGlucoseViewModel.getBloodSugarRemindSettingFromLocal();
        }
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        initBloodGlucoseLevel(context2);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById.findViewById(eri.Q8);
        this.ivExpandView = appCompatImageView;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: xv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodGlucoseAGPDetailHolder._init_$lambda$0(this.f39498a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BloodGlucoseAGPDetailHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.mContext, (Class<?>) BloodGlucoseAGPLand.class);
        Bundle bundle = new Bundle();
        BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult = this$0.mBloodSugarReport;
        intent.putExtra("mBloodSugarReport", bloodSugarGMIAndAGPResult != null ? bloodSugarGMIAndAGPResult.getEndTime() : 0L);
        ni4.n(this$0.mContext, intent, bundle);
    }

    private final void initBloodGlucoseLevel(final Context context) {
        TextView textView = (TextView) this.mRootView.findViewById(eri.Kn);
        View viewFindViewById = this.mRootView.findViewById(eri.t7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.tvTitleDec = (TextView) this.mRootView.findViewById(eri.lj);
        View viewFindViewById2 = this.mRootView.findViewById(eri.D7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        ((ImageView) viewFindViewById).setImageDrawable(context.getDrawable(pni.J));
        textView.setText(c0j.c0);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: wv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseAGPDetailHolder.initBloodGlucoseLevel$lambda$1(context, view);
            }
        });
        initChartView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBloodGlucoseLevel$lambda$1(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "$context");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), context.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initChartView(Context context) {
        this.lineChartAttrs = (vfe) this.lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new xqr());
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, true);
        this.mItemDecoration = bloodGlucoseLineChartItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setXAxisDrawBloodGlucoseDetail(true);
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        vx2<sf2> vx2Var = new vx2<>(context, this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, null);
        this.mLineChartAdapter = vx2Var;
        this.lineChartRecyclerView.setAdapter(vx2Var);
        this.lineChartRecyclerView.setLayoutManager(speedRatioLayoutManager);
        this.lineChartRecyclerView.setNestedScrollingEnabled(false);
    }

    private final void refreshBarChart(Context context, Map<Integer, AGPItem> data, long startTime) {
        int i;
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateAGPDetailEntries = bloodGlucoseDataUtil.createAGPDetailEntries(context, vfeVar, data, startTime);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateAGPDetailEntries);
        }
        float f = 15.0f;
        if (HealthUtil.getTheMaxNumber(listCreateAGPDetailEntries) < 15.0f) {
            i = 5;
        } else {
            f = 25.0f;
            i = 7;
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(i);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = i;
        int size = listCreateAGPDetailEntries.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setYAxis(this.mYAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        bloodGlucoseLineChartItemDecoration2.setXAxis(this.mXAxis);
        vx2<sf2> vx2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var);
        vx2Var.setYAxis(this.mYAxis);
        vx2<sf2> vx2Var2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var2);
        vx2Var2.setXAxis(this.mXAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        BloodGlucoseViewModel bloodGlucoseViewModel = this.mViewModel;
        float highSettingValue = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.getHighSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel2 = this.mViewModel;
        bloodGlucoseLineChartItemDecoration3.setAGPAreaValue(highSettingValue, bloodGlucoseViewModel2 != null ? bloodGlucoseViewModel2.getLowSettingValue() : 3.9f);
        vx2<sf2> vx2Var3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var3);
        vx2Var3.notifyDataSetChanged();
    }

    public final void bindData(@NotNull Context context, @Nullable BloodSugarGMIAndAGPResult report) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBloodSugarReport = report;
        if ((report != null ? report.getAgpResult() : null) == null) {
            this.agpChartGuideView.setVisibility(8);
            this.lineChartRecyclerView.setVisibility(8);
            AppCompatImageView appCompatImageView = this.ivExpandView;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            this.agpNoDataView.setVisibility(0);
            this.agpNoDataDividerView.setVisibility(0);
            return;
        }
        TextView textView = this.tvTitleDec;
        if (textView != null) {
            textView.setText(context.getString(c0j.d0, TimeDateUtil.getDateMMddFormat(report.getStartTime()), TimeDateUtil.getDateMMddFormat(report.getEndTime())));
        }
        TextView textView2 = this.tvTitleDec;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        refreshBarChart(context, report.getAgpResult(), report.getStartTime());
        this.agpChartGuideView.setVisibility(0);
        this.lineChartRecyclerView.setVisibility(0);
        this.agpNoDataView.setVisibility(8);
        this.agpNoDataDividerView.setVisibility(8);
        AppCompatImageView appCompatImageView2 = this.ivExpandView;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
        }
        this.mRootView.requestLayout();
    }
}
