package com.xiaomi.fitness.health.sleep.deprecated;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.deprecated.SleepAllRecordsFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepSegmentReportDetailFragment;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.aub;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/deprecated/SleepAllRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Laub;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/health/sleep/deprecated/SleepAllRecordsItemAdapter;", "sleepAllRecordAdapter", "Lcom/xiaomi/fitness/health/sleep/deprecated/SleepAllRecordsItemAdapter;", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAllRecordsFragment extends Hilt_SleepAllRecordsFragment<SleepViewModel, aub> {

    @NotNull
    public static final String PARAM_RECORD = "sleep";
    public static final int REQ_CODE_DETAIL_FRAGMENT = 0;
    public static final int RESULT_CODE_REFRESH = 2;

    @NotNull
    public static final String TAG = "SleepAllRecordsFragment";
    public RecyclerView recyclerView;
    private SleepAllRecordsItemAdapter sleepAllRecordAdapter;
    private TextView tvNoData;

    public SleepAllRecordsFragment() {
        super(jui.r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepAllRecordsFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter = this$0.sleepAllRecordAdapter;
        TextView textView = null;
        if (sleepAllRecordsItemAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAllRecordsItemAdapter = null;
        }
        boolean z = sleepAllRecordsItemAdapter.getItemCount() == 0;
        ViewExtKt.setVisible(this$0.getRecyclerView(), !z);
        TextView textView2 = this$0.tvNoData;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
        } else {
            textView = textView2;
        }
        ViewExtKt.setVisible(textView, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(Ref.IntRef count, SleepAllRecordsFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(count, "$count");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = count.element + 1;
        count.element = i;
        Logger.d(TAG, "queryAllRecordsLiveData count=" + i);
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter = this$0.sleepAllRecordAdapter;
        if (sleepAllRecordsItemAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAllRecordsItemAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        sleepAllRecordsItemAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == 2) {
            SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter = this.sleepAllRecordAdapter;
            if (sleepAllRecordsItemAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
                sleepAllRecordsItemAdapter = null;
            }
            sleepAllRecordsItemAdapter.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.tvNoData = (TextView) view.findViewById(eri.Ol);
        setRecyclerView((RecyclerView) view.findViewById(eri.pd));
        setTitle(c0j.h5);
        this.sleepAllRecordAdapter = new SleepAllRecordsItemAdapter();
        SleepAllRecordsItemAdapter.OnItemClickListener onItemClickListener = new SleepAllRecordsItemAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.sleep.deprecated.SleepAllRecordsFragment$onViewCreated$onClickListener$1
            @Override // com.xiaomi.fitness.health.sleep.deprecated.SleepAllRecordsItemAdapter.OnItemClickListener
            public void onClick(SleepSegmentReport sleepSegmentReportItem) {
                Intrinsics.checkNotNullParameter(sleepSegmentReportItem, "sleepSegmentReportItem");
                SleepAllRecordsFragment sleepAllRecordsFragment = this.this$0;
                Bundle bundle = new Bundle();
                bundle.putSerializable("sleep", sleepSegmentReportItem);
                BaseFragmentExKt.gotoPageForResult(sleepAllRecordsFragment, (Class<?>) SleepSegmentReportDetailFragment.class, bundle, 0);
            }
        };
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter = this.sleepAllRecordAdapter;
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter2 = null;
        if (sleepAllRecordsItemAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAllRecordsItemAdapter = null;
        }
        sleepAllRecordsItemAdapter.setOnItemClickListener(onItemClickListener);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = getRecyclerView();
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter3 = this.sleepAllRecordAdapter;
        if (sleepAllRecordsItemAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAllRecordsItemAdapter3 = null;
        }
        recyclerView.setAdapter(sleepAllRecordsItemAdapter3);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: mfm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepAllRecordsFragment.onViewCreated$lambda$0(this.f26114a, (CombinedLoadStates) obj);
            }
        };
        SleepAllRecordsItemAdapter sleepAllRecordsItemAdapter4 = this.sleepAllRecordAdapter;
        if (sleepAllRecordsItemAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
        } else {
            sleepAllRecordsItemAdapter2 = sleepAllRecordsItemAdapter4;
        }
        sleepAllRecordsItemAdapter2.addLoadStateListener(function1);
        final Ref.IntRef intRef = new Ref.IntRef();
        ((SleepViewModel) getMViewModel()).queryAllRecordsLiveData().observe(getViewLifecycleOwner(), new SleepAllRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nfm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepAllRecordsFragment.onViewCreated$lambda$1(intRef, this, (PagingData) obj);
            }
        }));
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }
}
