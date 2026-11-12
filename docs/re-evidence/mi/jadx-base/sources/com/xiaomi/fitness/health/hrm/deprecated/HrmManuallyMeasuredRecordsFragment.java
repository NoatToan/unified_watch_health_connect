package com.xiaomi.fitness.health.hrm.deprecated;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.hrm.HrmRecordDetailFragment;
import com.xiaomi.fitness.health.hrm.HrmViewModel;
import com.xiaomi.fitness.health.hrm.deprecated.HrmManuallyMeasuredRecordsFragment;
import defpackage.jui;
import defpackage.k8a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lk8a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "Lmiuix/recyclerview/widget/RecyclerView;", "recyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Lmiuix/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Lmiuix/recyclerview/widget/RecyclerView;)V", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "getTvNoData", "()Landroid/widget/TextView;", "setTvNoData", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter;", "adapter", "Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrmManuallyMeasuredRecordsFragment extends Hilt_HrmManuallyMeasuredRecordsFragment<HrmViewModel, k8a> {
    public static final int REQ_CODE_DETAIL_FRAGMENT = 100;
    public static final int RESULT_CODE_REFRESH = 0;

    @NotNull
    public static final String TAG = "HrmManuallyMeasuredRecordsFragment";

    @Nullable
    private HrmManuallyMeasuredRecordsAdapter adapter;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private TextView tvNoData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(HrmManuallyMeasuredRecordsFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter = this$0.adapter;
        Intrinsics.checkNotNull(hrmManuallyMeasuredRecordsAdapter);
        boolean z = hrmManuallyMeasuredRecordsAdapter.getItemCount() == 0;
        RecyclerView recyclerView = this$0.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        ViewExtKt.setVisible(recyclerView, !z);
        TextView textView = this$0.tvNoData;
        Intrinsics.checkNotNull(textView);
        ViewExtKt.setVisible(textView, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(HrmManuallyMeasuredRecordsFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter = this$0.adapter;
        Intrinsics.checkNotNull(hrmManuallyMeasuredRecordsAdapter);
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        hrmManuallyMeasuredRecordsAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    @Nullable
    public final HrmManuallyMeasuredRecordsAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.q0;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final TextView getTvNoData() {
        return this.tvNoData;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter = this.adapter;
        if (hrmManuallyMeasuredRecordsAdapter != null) {
            hrmManuallyMeasuredRecordsAdapter.refresh();
        }
        Logger.d(TAG, "onResume adapter refreshed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        this.recyclerView = ((k8a) getMBinding()).C;
        this.tvNoData = ((k8a) getMBinding()).D;
        this.adapter = new HrmManuallyMeasuredRecordsAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.adapter);
        HrmManuallyMeasuredRecordsAdapter.OnItemClickListener onItemClickListener = new HrmManuallyMeasuredRecordsAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.hrm.deprecated.HrmManuallyMeasuredRecordsFragment$onViewCreated$onItemClickListener$1
            @Override // com.xiaomi.fitness.health.hrm.deprecated.HrmManuallyMeasuredRecordsAdapter.OnItemClickListener
            public void onClick(HrItem record) {
                Intrinsics.checkNotNullParameter(record, "record");
                HrmManuallyMeasuredRecordsFragment hrmManuallyMeasuredRecordsFragment = this.this$0;
                Bundle bundle = new Bundle();
                Logger.d(HrmManuallyMeasuredRecordsFragment.TAG, "onClick HrItem " + record);
                bundle.putSerializable("record", record);
                bundle.putInt("hr_record_type", 0);
                BaseFragmentExKt.gotoPageForResult(hrmManuallyMeasuredRecordsFragment, (Class<?>) HrmRecordDetailFragment.class, bundle, 100);
            }
        };
        HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter = this.adapter;
        if (hrmManuallyMeasuredRecordsAdapter != null) {
            hrmManuallyMeasuredRecordsAdapter.setOnItemClickListener(onItemClickListener);
        }
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: hec
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HrmManuallyMeasuredRecordsFragment.onViewCreated$lambda$0(this.f19974a, (CombinedLoadStates) obj);
            }
        };
        HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter2 = this.adapter;
        Intrinsics.checkNotNull(hrmManuallyMeasuredRecordsAdapter2);
        hrmManuallyMeasuredRecordsAdapter2.addLoadStateListener(function1);
        ((HrmViewModel) getMViewModel()).queryAllManuallyAddedHrRecords().observe(getViewLifecycleOwner(), new HrmManuallyMeasuredRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iec
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HrmManuallyMeasuredRecordsFragment.onViewCreated$lambda$1(this.f21051a, (PagingData) obj);
            }
        }));
    }

    public final void setAdapter(@Nullable HrmManuallyMeasuredRecordsAdapter hrmManuallyMeasuredRecordsAdapter) {
        this.adapter = hrmManuallyMeasuredRecordsAdapter;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setTvNoData(@Nullable TextView textView) {
        this.tvNoData = textView;
    }
}
