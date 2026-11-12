package com.xiaomi.fitness.relative.bloodpressure;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodpressure.ui.UnderstandBloodPressureFragment;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.bloodpressure.BloodPressureBaseRelativeFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.a52;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hz2;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.qpo;
import defpackage.r02;
import defpackage.s02;
import defpackage.sz6;
import defpackage.uz6;
import defpackage.vnq;
import defpackage.vqr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 q*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001qB\u0007¢\u0006\u0004\bp\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010ER$\u0010U\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ER$\u0010]\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010&\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0014\u0010o\u001a\u0002058$X¤\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/xiaomi/fitness/relative/bloodpressure/BloodPressureBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDistributeCard", "refreshDetailCard", "initView", "initUnderstandCard", "initDistributeCard", "updateRecyclerDistributeLayoutManager", "updateRecyclerDetailLayoutManager", "initDetailCard", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "mBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Ls02;", "mItemDecoration", "Ls02;", "Lvnq;", "La52;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "", "mDisplayNumber", "I", "Lr02;", "mBarChartAttrs", "Lr02;", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mBarChartEntries", "Ljava/util/List;", "Lq02;", "mBarChartAdapter", "Lq02;", "Landroidx/recyclerview/widget/RecyclerView;", "mDetailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMDetailRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDetailRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "mDistributeRecyclerView", "getMDistributeRecyclerView", "setMDistributeRecyclerView", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDistributeData", "understandCard", "getUnderstandCard", "setUnderstandCard", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "getEmptyTitleStr", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BloodPressureBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "BloodPressureWm";

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private q02<RecyclerBarEntry> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private List<RecyclerBarEntry> mBarChartEntries;

    @Nullable
    private DailyBloodPressureReport mBloodPressureReport;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private RecyclerView mDetailRecyclerView;
    private int mDisplayNumber;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<a52> mYAxis;
    private long relativeUid = -1;

    @Nullable
    private View understandCard;

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getViewTag() {
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition != 0) {
            return fragmentPosition != 1 ? "months" : "weeks";
        }
        return "days";
    }

    private final void initBundle() {
        LocalDate localDateMinusDays;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            int i = arguments.getInt("offset", 0);
            int fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateMinusDays = fragmentPosition != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(i)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(i));
            } else {
                localDateMinusDays = LocalDate.now().minusDays(i);
            }
            this.mCurrentLocalDate = localDateMinusDays;
        }
        if (this.mCurrentLocalDate == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, getString(c0j.K6), pni.H1);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDistributeData, 7);
        updateRecyclerDistributeLayoutManager();
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: ty2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodPressureBaseRelativeFragment.initUnderstandCard$lambda$1(this.f35174a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$1(BloodPressureBaseRelativeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandBloodPressureFragment.class, null);
    }

    private final void initView() {
        initDetailCard();
        initDistributeCard();
        initUnderstandCard();
    }

    private final void refreshDetailCard() {
        if (this.mBloodPressureReport == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
            }
            RecyclerView recyclerView = this.mDetailRecyclerView;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.mDetailRecyclerView;
        if (recyclerView2 != null) {
            ViewExtKt.setVisible(recyclerView2, true);
        }
        Context contextRequireContext = requireContext();
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport);
        List<qpo> listC = hz2.c(contextRequireContext, dailyBloodPressureReport);
        Intrinsics.checkNotNullExpressionValue(listC, "createSummaryViewModelList(...)");
        List<qpo> list = listC;
        if (ArrayUtils.isEmpty(list)) {
            TextView textView2 = this.dataTitleView;
            if (textView2 != null) {
                ViewExtKt.setVisible(textView2, true);
            }
            RecyclerView recyclerView3 = this.mDetailRecyclerView;
            if (recyclerView3 != null) {
                ViewExtKt.setVisible(recyclerView3, false);
                return;
            }
            return;
        }
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<qpo> list3 = this.mDataListDetail;
        Intrinsics.checkNotNull(list3);
        list3.addAll(list);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyBloodPressureReport2.getTag()));
        TextView textView3 = this.dataTitleView;
        if (textView3 != null) {
            ViewExtKt.setVisible(textView3, false);
        }
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshDistributeCard() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport != null) {
            Intrinsics.checkNotNull(dailyBloodPressureReport);
            if (!ArrayUtils.isEmpty(dailyBloodPressureReport.getSinglePressureRecords())) {
                FragmentActivity mActivity = getMActivity();
                DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
                Intrinsics.checkNotNull(dailyBloodPressureReport2);
                List<BloodPressureItem> singlePressureRecords = dailyBloodPressureReport2.getSinglePressureRecords();
                Intrinsics.checkNotNull(singlePressureRecords);
                List<uz6> listA = hz2.a(mActivity, singlePressureRecords);
                if (listA == null || listA.size() <= 0) {
                    RecyclerView recyclerView = this.mDistributeRecyclerView;
                    Intrinsics.checkNotNull(recyclerView);
                    ViewExtKt.setVisible(recyclerView, false);
                    return;
                }
                RecyclerView recyclerView2 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                ViewExtKt.setVisible(recyclerView2, true);
                DistributeDataUtil.setPositionOfList(listA);
                List<uz6> list = this.mDistributeData;
                Intrinsics.checkNotNull(list);
                list.clear();
                List<uz6> list2 = this.mDistributeData;
                Intrinsics.checkNotNull(list2);
                list2.addAll(listA);
                sz6 sz6Var = this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                sz6Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        ViewExtKt.setVisible(recyclerView3, false);
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Logger.i("BloodPressureWm", "refresh BloodPressureReport .. " + (dailyBloodPressureReport != null ? dailyBloodPressureReport.toString() : null));
        refreshDetailCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        this.mBloodPressureReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureWm", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        getMViewModel().triggerFetchFitnessReport(IBloodPressureRepository.class, getViewTag(), jChangZeroOfTheDay, 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new Observer() { // from class: uy2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureBaseRelativeFragment.requestData$lambda$0(this.f36267a, (CloudDataResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$0(BloodPressureBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.mBloodPressureReport = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailyBloodPressureReport) {
                this$0.mBloodPressureReport = (DailyBloodPressureReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.mDetailRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    private final void updateRecyclerDistributeLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.mDistributeRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        sz6 sz6Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, sz6Var));
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final TextView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getMDetailRecyclerView() {
        return this.mDetailRecyclerView;
    }

    @Nullable
    public final RecyclerView getMDistributeRecyclerView() {
        return this.mDistributeRecyclerView;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
        updateRecyclerDistributeLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setMDetailRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDetailRecyclerView = recyclerView;
    }

    public final void setMDistributeRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDistributeRecyclerView = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
