package com.xiaomi.fitness.relative.weight;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.weight.WeightDayItemRFragment;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.jui;
import defpackage.ozb;
import defpackage.rna;
import defpackage.uzb;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/relative/weight/WeightDayItemRFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "Lrna;", "", "initView", "()V", "initViewHolder", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "refreshReport", "(Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;)V", "refreshBottomView", "refreshCardHolder", "refreshDataTitleView", "initBundle", "refreshDownloadView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Landroid/widget/TextView;", "noDataTitleView", "Landroid/widget/TextView;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "weightReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "latestWeightRecord", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "selectWeightItem", "preDayWeightItem", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "Lcom/xiaomi/fitness/relative/weight/WeightBodyCompositionRHolder;", "weightBodyCompositionHolder", "Lcom/xiaomi/fitness/relative/weight/WeightBodyCompositionRHolder;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class WeightDayItemRFragment extends Hilt_WeightDayItemRFragment<BasicRelativeDataViewModel, rna> {

    @NotNull
    public static final String TAG = "MiHealth:WeightDay";

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private WeightItem latestWeightRecord;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private TextView noDataTitleView;

    @Nullable
    private WeightItem preDayWeightItem;
    private long relativeUid = -1;

    @Nullable
    private WeightItem selectWeightItem;
    private WeightBodyCompositionRHolder weightBodyCompositionHolder;

    @Nullable
    private DailyWeightReport weightReport;

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.weight.WeightDayItemRFragment$requestData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CloudDataResult<List<? extends DailyBasicReport>>, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, WeightDayItemRFragment.class, "refreshReport", "refreshReport(Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(CloudDataResult<List<? extends DailyBasicReport>> cloudDataResult) {
            invoke2((CloudDataResult<List<DailyBasicReport>>) cloudDataResult);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CloudDataResult<List<DailyBasicReport>> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((WeightDayItemRFragment) this.receiver).refreshReport(p0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    private final void initBundle() {
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("key_relative_uid")) : null;
        Intrinsics.checkNotNull(lValueOf);
        this.relativeUid = lValueOf.longValue();
        if (numValueOf != null) {
            localDateNow = LocalDate.now().minusDays(numValueOf.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.mCurrentLocalDate = localDateNow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        this.dataTitleView = ((rna) getMBinding()).C;
        this.noDataTitleView = ((rna) getMBinding()).A;
        initViewHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewHolder() {
        uzb layoutWeightDayDetail = ((rna) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(layoutWeightDayDetail, "layoutWeightDayDetail");
        ozb healthLayoutWeightBodyComposition = layoutWeightDayDetail.A;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightBodyComposition, "healthLayoutWeightBodyComposition");
        this.weightBodyCompositionHolder = new WeightBodyCompositionRHolder(this, healthLayoutWeightBodyComposition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBottomView() {
        TextView tvStatement = ((rna) getMBinding()).D.I;
        Intrinsics.checkNotNullExpressionValue(tvStatement, "tvStatement");
        ViewExtKt.setVisible(tvStatement, false);
    }

    private final void refreshCardHolder() {
        WeightBodyCompositionRHolder weightBodyCompositionRHolder = this.weightBodyCompositionHolder;
        if (weightBodyCompositionRHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyCompositionHolder");
            weightBodyCompositionRHolder = null;
        }
        weightBodyCompositionRHolder.bindData(this.selectWeightItem);
    }

    private final void refreshDataTitleView() {
        String str;
        if (this.latestWeightRecord == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView);
            dataTitleView.c(getString(c0j.L6));
            DataTitleView dataTitleView2 = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView2);
            ViewExtKt.setVisible(dataTitleView2, false);
            TextView textView = this.noDataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        TextView textView2 = this.noDataTitleView;
        if (textView2 != null) {
            ViewExtKt.setVisible(textView2, false);
        }
        DailyWeightReport dailyWeightReport = this.weightReport;
        WeightItem preDayWeightItem = dailyWeightReport != null ? dailyWeightReport.getPreDayWeightItem() : null;
        WeightItem weightItem = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem);
        if (TimeDateUtil.isToday(TimeDateUtil.timestampToLocalDate(weightItem.getTime()))) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            String string = getString(c0j.v5);
            WeightItem weightItem2 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem2);
            str = String.format(locale, "%s %s", Arrays.copyOf(new Object[]{string, TimeDateUtil.getDateStr(weightItem2.getTime(), TimeUtils.FORMAT_H_M)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            WeightItem weightItem3 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem3);
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(weightItem3.getTime() * ((long) 1000));
            WeightItem weightItem4 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem4);
            str = dateYYYYMMddLocalFormat + " " + TimeDateUtil.getDateStr(weightItem4.getTime(), TimeUtils.FORMAT_H_M);
        }
        if (preDayWeightItem == null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale2 = Locale.getDefault();
            WeightItem weightItem5 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem5);
            String str2 = String.format(locale2, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(weightItem5.getWeight())}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            DataTitleView dataTitleView3 = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView3);
            dataTitleView3.a(requireContext(), getString(c0j.u4, str2), str2, str);
            return;
        }
        long time = preDayWeightItem.getTime();
        preDayWeightItem.getWeight();
        WeightItem weightItem6 = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem6);
        float weight = weightItem6.getWeight();
        WeightItem weightItem7 = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem7);
        Math.abs(Days.daysBetween(TimeDateUtil.timestampToLocalDate(weightItem7.getTime()), TimeDateUtil.timestampToLocalDate(time)).getDays());
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(weight)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        DataTitleView dataTitleView4 = this.dataTitleView;
        Intrinsics.checkNotNull(dataTitleView4);
        dataTitleView4.a(requireContext(), getString(c0j.u4, str3), str3, str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshDownloadView() {
        boolean z;
        Logger.i("MiHealth:WeightDay", "refreshDownloadView selectWeightItem : " + this.selectWeightItem);
        WeightItem weightItem = this.selectWeightItem;
        if (weightItem == null) {
            z = false;
        } else {
            if (Intrinsics.areEqual("xiaomiwear_app_manually", weightItem != null ? weightItem.getSid() : null)) {
                z = false;
            } else {
                WeightItem weightItem2 = this.selectWeightItem;
                Intrinsics.checkNotNull(weightItem2);
                if (weightItem2.getBmp() != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        TextView tvDownload = ((rna) getMBinding()).D.H;
        Intrinsics.checkNotNullExpressionValue(tvDownload, "tvDownload");
        ViewExtKt.setVisible(tvDownload, z);
        if (z) {
            ((rna) getMBinding()).D.H.setOnClickListener(new View.OnClickListener() { // from class: lfr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightDayItemRFragment.refreshDownloadView$lambda$2(this.f25020a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshDownloadView$lambda$2(WeightDayItemRFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Application application = ApplicationExtKt.getApplication();
        Context applicationContext = ApplicationExtKt.getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        WeightItem weightItem = this$0.selectWeightItem;
        Intrinsics.checkNotNull(weightItem);
        ElectronicScaleManagerExtKt.launchToDataReportActivity(application, applicationContext, weightItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    public final void refreshReport(CloudDataResult<List<DailyBasicReport>> result) {
        TextView textView;
        WeightItem weightItem;
        if (result.getData() == null || ArrayUtils.isEmpty(result.getData())) {
            this.weightReport = null;
            if (result.isOutSharedData() && (textView = this.noDataTitleView) != null) {
                textView.setText(getString(c0j.I4));
            }
        } else {
            List<DailyBasicReport> data = result.getData();
            Intrinsics.checkNotNull(data);
            for (DailyBasicReport dailyBasicReport : data) {
                if (dailyBasicReport instanceof DailyWeightReport) {
                    this.weightReport = (DailyWeightReport) dailyBasicReport;
                }
            }
        }
        DailyWeightReport dailyWeightReport = this.weightReport;
        if (dailyWeightReport == null) {
            weightItem = null;
        } else if ((dailyWeightReport != null ? dailyWeightReport.getWeightRecordList() : null) == null) {
            weightItem = null;
        } else {
            DailyWeightReport dailyWeightReport2 = this.weightReport;
            Intrinsics.checkNotNull(dailyWeightReport2);
            List<WeightItem> weightRecordList = dailyWeightReport2.getWeightRecordList();
            Intrinsics.checkNotNull(weightRecordList);
            weightItem = weightRecordList.get(0);
        }
        this.latestWeightRecord = weightItem;
        this.selectWeightItem = weightItem;
        DailyWeightReport dailyWeightReport3 = this.weightReport;
        this.preDayWeightItem = dailyWeightReport3 != null ? dailyWeightReport3.getPreDayWeightItem() : null;
        DailyWeightReport dailyWeightReport4 = this.weightReport;
        Logger.i("MiHealth:WeightDay", "refreshReport,weight report is " + (dailyWeightReport4 != null ? dailyWeightReport4.toString() : null));
        refreshDataTitleView();
        refreshCardHolder();
        refreshBottomView();
        refreshDownloadView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        BasicRelativeDataViewModel basicRelativeDataViewModel = (BasicRelativeDataViewModel) getMViewModel();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        basicRelativeDataViewModel.triggerFetchFitnessReport(IWeightRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new WeightDayItemRFragment$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.x2;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((rna) getMBinding()).B.requestLayout();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i("MiHealth:WeightDay", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initView();
        requestData();
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }
}
