package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.homepage.viewholder.BloodGlucoseLineChartRender;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.util.BloodGlucoseHomeDataUtil;
import com.xiaomi.fitness.v2.HealthAdapterV2;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;
import defpackage.c0j;
import defpackage.dn5;
import defpackage.iji;
import defpackage.km5;
import defpackage.kp5;
import defpackage.nf2;
import defpackage.pni;
import defpackage.qxi;
import defpackage.s7e;
import defpackage.ul5;
import defpackage.wfe;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/BloodGlucoseChartViewHolder;", "Lnf2;", "Lkm5;", "dataModel", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "record", "", "showBloodGlucoseRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;)V", "showBloodGlucoseFingerRecord", "", "bloodSugarLevel", "getLevelBarLevelFromBloodSugarLevel", "(I)I", "showEmpty", "(Lkm5;)V", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "list", "setXAxisTimeView", "(Ljava/util/List;)V", "bindData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "cardTitleView", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Landroid/view/View;", "emptySpace", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "lineChart", "Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "Landroidx/appcompat/widget/AppCompatImageView;", "emptyIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "talkback", "Ljava/lang/StringBuilder;", "Ls7e;", "binding", "<init>", "(Landroid/content/Context;Ls7e;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseChartViewHolder extends nf2 {

    @NotNull
    public static final String TAG = "BloodGlucoseChartViewHolder";

    @NotNull
    private final HomeCardCommonTitleView cardTitleView;

    @NotNull
    private final Context context;

    @NotNull
    private final AppCompatImageView emptyIv;

    @NotNull
    private final View emptySpace;

    @NotNull
    private final LevelBarView levelBarView;

    @NotNull
    private final DataCubicLineChart lineChart;

    @NotNull
    private final StringBuilder talkback;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseChartViewHolder(@NotNull Context context, @NotNull s7e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        HomeCardCommonTitleView cardTitleView = binding.A;
        Intrinsics.checkNotNullExpressionValue(cardTitleView, "cardTitleView");
        this.cardTitleView = cardTitleView;
        XAxisView xAxisView = binding.F;
        Intrinsics.checkNotNullExpressionValue(xAxisView, "xAxisView");
        this.xAxisView = xAxisView;
        View emptySpace = binding.B;
        Intrinsics.checkNotNullExpressionValue(emptySpace, "emptySpace");
        this.emptySpace = emptySpace;
        DataCubicLineChart lineChart = binding.E;
        Intrinsics.checkNotNullExpressionValue(lineChart, "lineChart");
        this.lineChart = lineChart;
        AppCompatImageView ivEmpty = binding.C;
        Intrinsics.checkNotNullExpressionValue(ivEmpty, "ivEmpty");
        this.emptyIv = ivEmpty;
        LevelBarView levelBarView = binding.D;
        Intrinsics.checkNotNullExpressionValue(levelBarView, "levelBarView");
        this.levelBarView = levelBarView;
        this.talkback = new StringBuilder();
        setBaseCharView(lineChart);
        lineChart.getMLineChartAttr().o = 4.0f;
    }

    private final int getLevelBarLevelFromBloodSugarLevel(int bloodSugarLevel) {
        if (bloodSugarLevel == 1) {
            return 2;
        }
        if (bloodSugarLevel == 2) {
            return 3;
        }
        if (bloodSugarLevel != 3) {
            return bloodSugarLevel != 4 ? 0 : 4;
        }
        return 1;
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

    private final void showBloodGlucoseFingerRecord(km5 dataModel, DailyBloodSugarReport record) {
        List<RecyclerBarEntry> listCreateDayFingerBloodGlucoseHome = BloodGlucoseHomeDataUtil.INSTANCE.createDayFingerBloodGlucoseHome(record, record.getTime());
        BloodSugarItem latestFingerItem = record.getLatestFingerItem();
        float fBloodSugar = latestFingerItem != null ? latestFingerItem.bloodSugar() : -1.0f;
        BloodSugarItem latestFingerItem2 = record.getLatestFingerItem();
        int targetLevel$default = latestFingerItem2 != null ? BloodSugarItem.getTargetLevel$default(latestFingerItem2, null, 1, null) : 0;
        Logger.d(TAG, "showBloodGlucoseFingerRecord item=" + record.getLatestFingerItem() + " lastItemLevel=" + targetLevel$default);
        if (fBloodSugar < 0.0f || listCreateDayFingerBloodGlucoseHome.isEmpty() || 1 > targetLevel$default || targetLevel$default >= 6) {
            showEmpty(dataModel);
            return;
        }
        HomeCardCommonTitleView homeCardCommonTitleView = this.cardTitleView;
        int i = (int) fBloodSugar;
        String quantityString = ResourceExtKt.getQuantityString(this.context, qxi.e, i, String.valueOf(fBloodSugar));
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
        BloodSugarItem latestFingerItem3 = record.getLatestFingerItem();
        homeCardCommonTitleView.showValueAndDesc(quantityString, dateMMddFormat + " " + TimeDateUtil.getDateStr(latestFingerItem3 != null ? latestFingerItem3.getTime() : dataModel.f23978a, TimeUtils.FORMAT_H_M));
        String quantityString2 = ResourceExtKt.getQuantityString(this.context, qxi.X, i, String.valueOf(fBloodSugar));
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        sbClear.append(", ");
        sbClear.append(quantityString2);
        this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.k0));
        this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.j0));
        ViewExtKt.setVisible(this.levelBarView, true);
        ViewExtKt.setVisible(this.lineChart, false);
        ViewExtKt.setVisible(this.emptyIv, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.M));
        arrayList.add(new LevelBarView.LevelItem(iji.O));
        arrayList.add(new LevelBarView.LevelItem(iji.P));
        arrayList.add(new LevelBarView.LevelItem(iji.N));
        arrayList.add(new LevelBarView.LevelItem(iji.L));
        this.levelBarView.setLevels(arrayList);
        this.levelBarView.setLevel(getLevelBarLevelFromBloodSugarLevel(targetLevel$default));
    }

    private final void showBloodGlucoseRecord(km5 dataModel, DailyBloodSugarReport record) {
        List<MaxMinEntry> listCreateDayBloodGlucoseHome = BloodGlucoseHomeDataUtil.INSTANCE.createDayBloodGlucoseHome(record);
        BloodSugarItem latestItem = record.getLatestItem();
        float fBloodSugar = latestItem != null ? latestItem.bloodSugar() : -1.0f;
        if (fBloodSugar < 0.0f || listCreateDayBloodGlucoseHome.isEmpty()) {
            showBloodGlucoseFingerRecord(dataModel, record);
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
        int i = (int) fBloodSugar;
        String quantityString = ResourceExtKt.getQuantityString(this.context, qxi.e, i, String.valueOf(fBloodSugar));
        if (fBloodSugar == 2.0f) {
            quantityString = this.context.getResources().getQuantityString(qxi.c, i, String.valueOf(fBloodSugar));
        } else if (fBloodSugar == 25.0f) {
            quantityString = this.context.getResources().getQuantityString(qxi.f31939b, i, String.valueOf(fBloodSugar));
        }
        String string = ResourceExtKt.getString(c0j.h);
        BloodSugarItem latestItem2 = record.getLatestItem();
        Intrinsics.checkNotNull(latestItem2);
        String date = TimeUtils.formatDate(string, Long.valueOf(latestItem2.getTime() * ((long) 1000)));
        this.cardTitleView.showValueAndDesc(quantityString, date);
        ViewExtKt.setVisible(this.levelBarView, false);
        ViewExtKt.setVisible(this.lineChart, true);
        ViewExtKt.setVisible(this.emptyIv, false);
        if (record.getLatestItem() != null) {
            BloodSugarItem latestItem3 = record.getLatestItem();
            Intrinsics.checkNotNull(latestItem3);
            if (latestItem3.getTrend() > 0) {
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.g), Integer.valueOf(pni.h), Integer.valueOf(pni.e), Integer.valueOf(pni.d), Integer.valueOf(pni.f)});
                BloodSugarItem latestItem4 = record.getLatestItem();
                Intrinsics.checkNotNull(latestItem4);
                this.cardTitleView.updateExpandImg(((Number) listListOf.get(latestItem4.getTrend() - 1)).intValue());
            }
        }
        DataCubicLineChart dataCubicLineChart = this.lineChart;
        dataCubicLineChart.setRenderer(new BloodGlucoseLineChartRender(dataCubicLineChart, dataCubicLineChart.getAnimator(), this.lineChart.getViewPortHandler()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object obj = this.context;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider((ViewModelStoreOwner) obj).get(BloodGlucoseViewModel.class);
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
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(this.context.getString(c0j.b0));
        sbClear.append(", ");
        sbClear.append(date);
        sbClear.append(", ");
        sbClear.append(quantityString);
    }

    private final void showEmpty(km5 dataModel) {
        ViewExtKt.setVisible(this.emptySpace, true);
        ViewExtKt.setVisible(this.levelBarView, false);
        ViewExtKt.setVisible(this.lineChart, false);
        ViewExtKt.setVisible(this.emptyIv, true);
        String string = ResourceExtKt.getString(c0j.L0);
        HomeCardCommonTitleView.showEmpty$default(this.cardTitleView, string, null, 2, null);
        this.lineChart.getMLineChartAttr().h = 1;
        this.lineChart.bindData(new ArrayList(), new wfe(iji.b3, pni.Q3, iji.n2));
        ViewExtKt.setVisible(this.levelBarView, false);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.Iq, ResourceExtKt.getString(c0j.b0)));
        sbClear.append(", ");
        sbClear.append(string);
    }

    public final void bindData(@NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        kp5 kp5VarA = ul5.c().a(dataModel.f23979b);
        this.cardTitleView.updateCardBgAndTitle(kp5VarA.c, kp5VarA.f24128b);
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !(dailyBasicReport instanceof DailyBloodSugarReport)) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
        } else {
            ViewExtKt.setVisible(this.emptySpace, false);
            showBloodGlucoseRecord(dataModel, (DailyBloodSugarReport) dailyBasicReport);
        }
        Logger.d(HealthAdapterV2.TAG, "talkback content:" + ((Object) this.talkback));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }
}
