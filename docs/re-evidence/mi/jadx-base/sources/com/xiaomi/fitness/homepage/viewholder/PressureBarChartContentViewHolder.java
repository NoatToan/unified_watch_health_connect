package com.xiaomi.fitness.homepage.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.StressEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.StressDataUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.km5;
import defpackage.l2c;
import defpackage.m7e;
import defpackage.nf2;
import defpackage.of1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\bR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/PressureBarChartContentViewHolder;", "Lnf2;", "Landroid/content/Context;", "context", "Lkm5;", "dataModel", "", "setBarchartAttr", "(Landroid/content/Context;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "showEmpty", "(Lkm5;)V", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChart", "bindEmptyEntries", "(Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "record", "showStressRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)V", "initView", "()V", "bindData", "Landroid/widget/ImageView;", "imgType", "Landroid/widget/ImageView;", "getImgType", "()Landroid/widget/ImageView;", "setImgType", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "txtSportContent", "Landroid/widget/TextView;", "getTxtSportContent", "()Landroid/widget/TextView;", "setTxtSportContent", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "", "displayNumber_24", "I", "Lm7e;", "mBinding", "Lm7e;", "Ljava/lang/StringBuffer;", "talkback", "Ljava/lang/StringBuffer;", "latestStressRecord", "Ljava/lang/Integer;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPressureBarChartContentViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureBarChartContentViewHolder.kt\ncom/xiaomi/fitness/homepage/viewholder/PressureBarChartContentViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,159:1\n54#2,3:160\n24#2:163\n57#2,6:164\n63#2,2:171\n57#3:170\n*S KotlinDebug\n*F\n+ 1 PressureBarChartContentViewHolder.kt\ncom/xiaomi/fitness/homepage/viewholder/PressureBarChartContentViewHolder\n*L\n140#1:160,3\n140#1:163\n140#1:164,6\n140#1:171,2\n140#1:170\n*E\n"})
public final class PressureBarChartContentViewHolder extends nf2 {
    private CustomBarChart<RecyclerBarEntry> barChart;
    private int displayNumber_24;
    public ImageView imgType;

    @Nullable
    private Integer latestStressRecord;

    @NotNull
    private m7e mBinding;

    @Nullable
    private StringBuffer talkback;
    public TextView txtSportContent;
    private XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressureBarChartContentViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.mBinding = m7e.A0(itemView);
        initView();
    }

    private final void bindEmptyEntries(CustomBarChart<RecyclerBarEntry> barChart, km5 dataModel) {
        if (dataModel.f23979b == 7) {
            barChart.e(StressDataUtil.INSTANCE.createDayEntriesHome(new DailyStressReport(dataModel.f23978a, "days", "default_did"), this.displayNumber_24), 100.0f, 0.0f);
        }
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return report instanceof DailyStressReport;
    }

    private final void setBarchartAttr(Context context, km5 dataModel) {
        if (dataModel.f23979b == 7) {
            CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
            CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
            if (customBarChart == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
                customBarChart = null;
            }
            customBarChart.c(context, iji.n3, iji.o3);
            CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
            if (customBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart2 = customBarChart3;
            }
            customBarChart2.setBarChartType(6);
        }
    }

    private final void showEmpty(km5 dataModel) {
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(false);
        }
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.getAttribute().h = 1;
        String strB = l2c.b(dataModel.f23979b);
        getTxtSportContent().setText(c0j.kq);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        bindEmptyEntries(customBarChart2, dataModel);
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Iq, strB));
        }
        this.mBinding.G.setText(ResourceExtKt.getString(c0j.v7));
        TextView pressureStatusText = this.mBinding.F;
        Intrinsics.checkNotNullExpressionValue(pressureStatusText, "pressureStatusText");
        ViewExtKt.gone(pressureStatusText);
        ImageView pressureStatusIcon = this.mBinding.E;
        Intrinsics.checkNotNullExpressionValue(pressureStatusIcon, "pressureStatusIcon");
        ViewExtKt.gone(pressureStatusIcon);
    }

    private final void showRecord(Context context, km5 dataModel, DailyBasicReport report) {
        Intrinsics.checkNotNull(report, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport");
        showStressRecord(context, dataModel, (DailyStressReport) report);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    private final void showStressRecord(Context context, km5 dataModel, DailyStressReport record) {
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        List<SegmentBarEntry> listCreateDayEntriesHome = stressDataUtil.createDayEntriesHome(record, this.displayNumber_24);
        if (stressDataUtil.getValidEntry(listCreateDayEntriesHome) <= 0) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.e(listCreateDayEntriesHome, 100.0f, 0.0f);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        String strB = l2c.b(7);
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
        stringBuffer.append(", ");
        if (record.getLatestStressRecord() != null) {
            StressItem latestStressRecord = record.getLatestStressRecord();
            int i = c0j.zl;
            Intrinsics.checkNotNull(latestStressRecord);
            strB = ResourceExtKt.getString(i, String.valueOf(latestStressRecord.getStress()));
            StringBuffer stringBuffer2 = this.talkback;
            if (stringBuffer2 != null) {
                stringBuffer2.append(strB);
            }
            TextView textView = this.mBinding.F;
            StressItem latestStressRecord2 = record.getLatestStressRecord();
            Intrinsics.checkNotNull(latestStressRecord2);
            textView.setText(StressDataUtil.getStressTypeNameAsValue(latestStressRecord2.getStress()));
            Integer num = this.latestStressRecord;
            if (num != null) {
                StressItem latestStressRecord3 = record.getLatestStressRecord();
                Intrinsics.checkNotNull(latestStressRecord3);
                int stress = latestStressRecord3.getStress();
                if (num == null || num.intValue() != stress) {
                    StressEntry.Companion companion = StressEntry.INSTANCE;
                    StressItem latestStressRecord4 = record.getLatestStressRecord();
                    Intrinsics.checkNotNull(latestStressRecord4);
                    int stressTypeFace = companion.getStressTypeFace(latestStressRecord4.getStress(), stressDataUtil.getDeviceType());
                    ImageView pressureStatusIcon = this.mBinding.E;
                    Intrinsics.checkNotNullExpressionValue(pressureStatusIcon, "pressureStatusIcon");
                    Coil.imageLoader(pressureStatusIcon.getContext()).enqueue(new ImageRequest.Builder(pressureStatusIcon.getContext()).data(of1.b(context, stressTypeFace)).target(pressureStatusIcon).build());
                }
            } else {
                StressEntry.Companion companion2 = StressEntry.INSTANCE;
                StressItem latestStressRecord5 = record.getLatestStressRecord();
                Intrinsics.checkNotNull(latestStressRecord5);
                int stressTypeFace2 = companion2.getStressTypeFace(latestStressRecord5.getStress(), stressDataUtil.getDeviceType());
                ImageView pressureStatusIcon2 = this.mBinding.E;
                Intrinsics.checkNotNullExpressionValue(pressureStatusIcon2, "pressureStatusIcon");
                Coil.imageLoader(pressureStatusIcon2.getContext()).enqueue(new ImageRequest.Builder(pressureStatusIcon2.getContext()).data(of1.b(context, stressTypeFace2)).target(pressureStatusIcon2).build());
            }
            StressItem latestStressRecord6 = record.getLatestStressRecord();
            Intrinsics.checkNotNull(latestStressRecord6);
            this.latestStressRecord = Integer.valueOf(latestStressRecord6.getStress());
            TextView pressureStatusText = this.mBinding.F;
            Intrinsics.checkNotNullExpressionValue(pressureStatusText, "pressureStatusText");
            ExtUtilKt.visible(pressureStatusText);
            ImageView pressureStatusIcon3 = this.mBinding.E;
            Intrinsics.checkNotNullExpressionValue(pressureStatusIcon3, "pressureStatusIcon");
            ExtUtilKt.visible(pressureStatusIcon3);
        }
        this.mBinding.G.setText(strB);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        dataModel.f23978a = record.getTime();
        dataModel.d = record.getSid();
    }

    public final void bindData(@NotNull Context context, @NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(context, dataModel);
        getImgType().setImageResource(l2c.a(dataModel.f23979b));
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
        } else {
            showRecord(context, dataModel, dailyBasicReport);
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
    }

    @NotNull
    public final ImageView getImgType() {
        ImageView imageView = this.imgType;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgType");
        return null;
    }

    @NotNull
    public final TextView getTxtSportContent() {
        TextView textView = this.txtSportContent;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtSportContent");
        return null;
    }

    public final void initView() {
        setImgType(this.mBinding.D);
        setTxtSportContent(this.mBinding.H);
        m7e m7eVar = this.mBinding;
        CustomBarChart<RecyclerBarEntry> customBarChart = m7eVar.C;
        this.barChart = customBarChart;
        this.xAxisView = m7eVar.B;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        setBaseCharView(customBarChart);
        this.displayNumber_24 = 24;
    }

    public final void setImgType(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgType = imageView;
    }

    public final void setTxtSportContent(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtSportContent = textView;
    }
}
