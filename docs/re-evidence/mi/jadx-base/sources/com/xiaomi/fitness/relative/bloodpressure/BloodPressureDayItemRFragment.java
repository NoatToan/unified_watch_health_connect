package com.xiaomi.fitness.relative.bloodpressure;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodpressure.ui.UnderstandBloodPressureFragment;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.bloodpressure.BloodPressureDayItemRFragment;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.gbc;
import defpackage.hz2;
import defpackage.jui;
import defpackage.s3a;
import defpackage.sz6;
import defpackage.uz6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB\u0007¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/relative/bloodpressure/BloodPressureDayItemRFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "Ls3a;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDistributeCard", "refreshDetailCard", "initView", "initUnderstandCard", "initDistributeCard", "initDetailCard", "initViewBinding", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "mBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "containerView", "Landroid/view/View;", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "mDetailCard", "Landroidx/recyclerview/widget/RecyclerView;", "mDetailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lgbc;", "mHourDetailAdapter", "Lgbc;", "mDistributeRecyclerView", "Lsz6;", "mDistributeAdapter", "Lsz6;", "", "Luz6;", "mDistributeData", "Ljava/util/List;", "understandCard", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodPressureDayItemRFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayItemRFragment.kt\ncom/xiaomi/fitness/relative/bloodpressure/BloodPressureDayItemRFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
public final class BloodPressureDayItemRFragment extends Hilt_BloodPressureDayItemRFragment<BasicRelativeDataViewModel, s3a> {

    @NotNull
    public static final String TAG = "BloodPressureDay";

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private DailyBloodPressureReport mBloodPressureReport;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private View mDetailCard;

    @Nullable
    private RecyclerView mDetailRecyclerView;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private gbc mHourDetailAdapter;
    private long relativeUid = -1;

    @Nullable
    private View understandCard;

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
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        RecyclerView recyclerView = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.mHourDetailAdapter = new gbc();
        RecyclerView recyclerView2 = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mHourDetailAdapter);
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.bloodpressure.BloodPressureDayItemRFragment.initDistributeCard.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                sz6 sz6Var = BloodPressureDayItemRFragment.this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                return sz6Var.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDistributeData, 7);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView4 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: nz2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodPressureDayItemRFragment.initUnderstandCard$lambda$1(this.f28582a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$1(BloodPressureDayItemRFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandBloodPressureFragment.class, null);
    }

    private final void initView() {
        initDetailCard();
        initDistributeCard();
        initUnderstandCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((s3a) getMBinding()).A;
        this.dataTitleView = ((s3a) getMBinding()).C;
        this.mDetailCard = ((s3a) getMBinding()).B;
        this.mDetailRecyclerView = ((s3a) getMBinding()).F;
        this.mDistributeRecyclerView = ((s3a) getMBinding()).G;
    }

    private final void refreshDetailCard() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport != null) {
            Intrinsics.checkNotNull(dailyBloodPressureReport);
            if (!ArrayUtils.isEmpty(dailyBloodPressureReport.getSinglePressureRecords())) {
                View view = this.mDetailCard;
                if (view != null) {
                    ViewExtKt.setVisible(view, true);
                }
                TextView textView = this.dataTitleView;
                if (textView != null) {
                    ViewExtKt.setVisible(textView, false);
                }
                gbc gbcVar = this.mHourDetailAdapter;
                Intrinsics.checkNotNull(gbcVar);
                DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
                Intrinsics.checkNotNull(dailyBloodPressureReport2);
                gbcVar.k(dailyBloodPressureReport2.getSinglePressureRecords());
                return;
            }
        }
        TextView textView2 = this.dataTitleView;
        if (textView2 != null) {
            ViewExtKt.setVisible(textView2, true);
        }
        View view2 = this.mDetailCard;
        if (view2 != null) {
            ViewExtKt.setVisible(view2, false);
        }
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
                    TextView textView = this.dataTitleView;
                    if (textView != null) {
                        ViewExtKt.setVisible(textView, true);
                    }
                    RecyclerView recyclerView = this.mDistributeRecyclerView;
                    Intrinsics.checkNotNull(recyclerView);
                    recyclerView.setVisibility(8);
                    return;
                }
                DistributeDataUtil.setPositionOfList(listA);
                RecyclerView recyclerView2 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                TextView textView2 = this.dataTitleView;
                if (textView2 != null) {
                    ViewExtKt.setVisible(textView2, false);
                }
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
        TextView textView3 = this.dataTitleView;
        if (textView3 != null) {
            ViewExtKt.setVisible(textView3, true);
        }
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        ViewExtKt.setVisible(recyclerView3, false);
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Logger.i("BloodPressureDay", "refresh BloodPressureReport .. " + (dailyBloodPressureReport != null ? dailyBloodPressureReport.toString() : null));
        refreshDetailCard();
        refreshDistributeCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        this.mBloodPressureReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureDay", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        ((BasicRelativeDataViewModel) getMViewModel()).triggerFetchFitnessReport(IBloodPressureRepository.class, "days", jChangZeroOfTheDay, 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new Observer() { // from class: mz2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayItemRFragment.requestData$lambda$0(this.f27361a, (CloudDataResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$0(BloodPressureDayItemRFragment this$0, CloudDataResult cloudDataResult) {
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

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.B;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
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

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
