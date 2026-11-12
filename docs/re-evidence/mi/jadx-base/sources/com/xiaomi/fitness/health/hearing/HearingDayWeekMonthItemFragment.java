package com.xiaomi.fitness.health.hearing;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.gson.Gson;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.DayHearingHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.HearingHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.hearing.HearingDayWeekMonthItemFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.ViewUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.f4c;
import defpackage.hak;
import defpackage.onq;
import defpackage.qxi;
import defpackage.r02;
import defpackage.u9g;
import defpackage.v9g;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 a*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001aB\u0007¢\u0006\u0004\b`\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\bR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010D\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001c\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\u001c\u001a\u0004\bV\u0010\u001e\"\u0004\bW\u0010 R\u0014\u0010[\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8$X¤\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/HearingDayWeekMonthItemFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewIfNeed", "refreshBarChart", "initBarChart", "Lonq;", "createHighLightFormatter", "()Lonq;", "initView", "initBundle", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewBinding", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getMBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setMBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lu9g;", "mBarChartAdapter", "Lu9g;", "", "Lcom/xiaomi/fitness/chart/entrys/MultiBarEntry;", "mBarEntries", "Ljava/util/List;", "Lv9g;", "mItemDecoration", "Lv9g;", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "valueFormatter", "Lonq;", "Lr02;", "mBarChartAttrs", "Lr02;", "volumeCard", "getVolumeCard", "setVolumeCard", "Landroid/widget/TextView;", "tvVolumeCountTextView", "Landroid/widget/TextView;", "getTvVolumeCountTextView", "()Landroid/widget/TextView;", "setTvVolumeCountTextView", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "mHearingReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "getMHearingReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "setMHearingReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;)V", "understandCard", "getUnderstandCard", "setUnderstandCard", "", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class HearingDayWeekMonthItemFragment<VM extends BasicDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String KEY_HEARING_REPORT = "key_noise_item_list_json";

    @NotNull
    public static final String KEY_START_TIME_OF_THE_DAY = "key_start_time_of_the_day";

    @NotNull
    public static final String TAG = "MiHealth:hearing";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private u9g mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @Nullable
    private List<MultiBarEntry> mBarEntries;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyHearingReport mHearingReport;

    @Nullable
    private v9g mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private TextView tvVolumeCountTextView;

    @Nullable
    private View understandCard;

    @Nullable
    private onq valueFormatter;

    @Nullable
    private View volumeCard;

    private final onq createHighLightFormatter() {
        return getFragmentPosition() == 0 ? new DayHearingHighLightMarkValueFormatter(requireContext()) : new HearingHighLightMarkValueFormatter(requireContext());
    }

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        ViewUtil viewUtil = ViewUtil.INSTANCE;
        Intrinsics.checkNotNull(r02Var);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        viewUtil.adaptChartHighLightTextSize(r02Var, contextRequireContext);
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext2, getFragmentPosition());
        this.mBarEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = vnq.o(this.mBarChartAttrs, 60.0f);
        r02 r02Var2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var2);
        vqr vqrVar = new vqr(r02Var2, r02Var2.c, this.valueFormatter);
        this.mXAxis = vqrVar;
        this.mItemDecoration = new v9g(this.mYAxis, vqrVar, this.mBarChartAttrs);
        onq onqVarCreateHighLightFormatter = createHighLightFormatter();
        v9g v9gVar = this.mItemDecoration;
        Intrinsics.checkNotNull(v9gVar);
        v9gVar.setHighLightValueFormatter(onqVarCreateHighLightFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        v9g v9gVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(v9gVar2);
        barChartRecyclerView2.addItemDecoration(v9gVar2);
        this.mBarChartAdapter = new u9g(getActivity(), this.mBarEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, onqVarCreateHighLightFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mBarChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.hearing.HearingDayWeekMonthItemFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ HearingDayWeekMonthItemFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void initBundle() {
        int fragmentPosition;
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int fragmentPosition2 = getFragmentPosition();
            if (fragmentPosition2 != 0) {
                localDateNow = fragmentPosition2 != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            } else {
                localDateNow = LocalDate.now().minusDays(iIntValue);
            }
            if (localDateNow == null) {
                fragmentPosition = getFragmentPosition();
                if (fragmentPosition != 0) {
                    localDateNow = LocalDate.now();
                } else if (fragmentPosition != 1) {
                    localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else {
            fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateNow = LocalDate.now();
            } else if (fragmentPosition != 1) {
                localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
            } else {
                localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
            }
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initView() {
        initBarChart();
        if (getFragmentPosition() == 0) {
            View view = this.volumeCard;
            if (view != null) {
                ViewExtKt.setVisible(view, true);
            }
            View view2 = this.volumeCard;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: i4c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        HearingDayWeekMonthItemFragment.initView$lambda$1(this.f20768a, view3);
                    }
                });
            }
        } else {
            View view3 = this.volumeCard;
            if (view3 != null) {
                ViewExtKt.setVisible(view3, false);
            }
        }
        View view4 = this.understandCard;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener() { // from class: j4c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    HearingDayWeekMonthItemFragment.initView$lambda$2(this.f22404a, view5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(HearingDayWeekMonthItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString(KEY_HEARING_REPORT, new Gson().toJson(this$0.mHearingReport));
        LocalDate localDate = this$0.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        bundle.putLong(KEY_START_TIME_OF_THE_DAY, TimeDateUtil.changZeroOfTheDay(localDate));
        BaseFragmentExKt.gotoPage(this$0, HearingEnvironmentalNoiseFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(HearingDayWeekMonthItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandHearingFragment.class, null);
    }

    private final void refreshBarChart() {
        DataTitleView dataTitleView;
        DailyHearingReport dailyHearingReport = this.mHearingReport;
        r02 r02Var = this.mBarChartAttrs;
        int fragmentPosition = getFragmentPosition();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        List<MultiBarEntry> listE = f4c.e(dailyHearingReport, r02Var, fragmentPosition, localDate);
        Intrinsics.checkNotNullExpressionValue(listE, "getMultiBarChartEntries(...)");
        List<MultiBarEntry> list = this.mBarEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MultiBarEntry> list2 = this.mBarEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listE);
        float theMaxNumber = HealthUtil.getTheMaxNumber(this.mBarEntries);
        if (theMaxNumber <= 60.0f) {
            theMaxNumber = 60.0f;
        }
        vnq<?> vnqVar = this.mYAxis;
        vnq<?> vnqVarR = vnqVar != null ? vnqVar.r(vnqVar, theMaxNumber, 0.0f, 10) : null;
        this.mYAxis = vnqVarR;
        v9g v9gVar = this.mItemDecoration;
        if (v9gVar != null) {
            v9gVar.setYAxis(vnqVarR);
        }
        u9g u9gVar = this.mBarChartAdapter;
        if (u9gVar != null) {
            u9gVar.setYAxis(this.mYAxis);
        }
        u9g u9gVar2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(u9gVar2);
        u9gVar2.notifyDataSetChanged();
        DailyHearingReport dailyHearingReport2 = this.mHearingReport;
        if (dailyHearingReport2 == null) {
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(dailyHearingReport2);
        int totalDuration = dailyHearingReport2.getTotalDuration() / 60;
        DailyHearingReport dailyHearingReport3 = this.mHearingReport;
        Intrinsics.checkNotNull(dailyHearingReport3);
        int highDuration = dailyHearingReport3.getHighDuration() / 60;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(contextRequireContext, totalDuration);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        String string = requireContext().getString(c0j.K8, hMFormatInMinutes, TimeDateUtil.getHMFormatInMinutes(contextRequireContext2, highDuration));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (getContext() != null && (dataTitleView = this.dataTitleView) != null) {
            ViewUtil viewUtil = ViewUtil.INSTANCE;
            Intrinsics.checkNotNull(dataTitleView);
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            viewUtil.adaptChartCommonDataTitleView(dataTitleView, contextRequireContext3);
        }
        DataTitleView dataTitleView3 = this.dataTitleView;
        if (dataTitleView3 != null) {
            dataTitleView3.b(requireContext(), string, hMFormatInMinutes, "", Typeface.create(requireContext().getString(c0j.fq), 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    private final void refreshViewIfNeed() {
        int size;
        DailyHearingReport dailyHearingReport = this.mHearingReport;
        Logger.i(TAG, "refreshViewIfNeed HearingReport .. " + (dailyHearingReport != null ? dailyHearingReport.toString() : null));
        refreshBarChart();
        DailyHearingReport dailyHearingReport2 = this.mHearingReport;
        if (dailyHearingReport2 != null) {
            Intrinsics.checkNotNull(dailyHearingReport2);
            if (dailyHearingReport2.getNoiseList() != null) {
                DailyHearingReport dailyHearingReport3 = this.mHearingReport;
                Intrinsics.checkNotNull(dailyHearingReport3);
                List<NoiseItem> noiseList = dailyHearingReport3.getNoiseList();
                Intrinsics.checkNotNull(noiseList);
                size = noiseList.size();
            } else {
                size = 0;
            }
        } else {
            size = 0;
        }
        TextView textView = this.tvVolumeCountTextView;
        if (textView != null) {
            textView.setText(getResources().getQuantityString(qxi.V, size, Integer.valueOf(size)));
        }
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IHearingRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new HearingDayWeekMonthItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h4c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HearingDayWeekMonthItemFragment.requestData$lambda$0(this.f19677a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(HearingDayWeekMonthItemFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mHearingReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyHearingReport) {
                this$0.mHearingReport = (DailyHearingReport) dailyBasicReport;
            }
        }
        this$0.refreshViewIfNeed();
        return Unit.INSTANCE;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final BarChartRecyclerView getMBarChartRecyclerView() {
        return this.mBarChartRecyclerView;
    }

    @Nullable
    public final DailyHearingReport getMHearingReport() {
        return this.mHearingReport;
    }

    @Nullable
    public final TextView getTvVolumeCountTextView() {
        return this.tvVolumeCountTextView;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Nullable
    public final View getVolumeCard() {
        return this.volumeCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i(TAG, "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setMBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.mBarChartRecyclerView = barChartRecyclerView;
    }

    public final void setMHearingReport(@Nullable DailyHearingReport dailyHearingReport) {
        this.mHearingReport = dailyHearingReport;
    }

    public final void setTvVolumeCountTextView(@Nullable TextView textView) {
        this.tvVolumeCountTextView = textView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }

    public final void setVolumeCard(@Nullable View view) {
        this.volumeCard = view;
    }
}
