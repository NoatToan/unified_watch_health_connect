package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.recycler.HistoricalRoutesAdapter;
import com.xiaomi.fitness.sport.view.route.RunningRouteHistoryActivity;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteHistoryViewModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.xn0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/RunningRouteHistoryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteHistoryViewModel;", "Lxn0;", "", "initRecycler", "()V", "requestHistoryRoutes", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter;", "adapter", "Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningRouteHistoryActivity extends Hilt_RunningRouteHistoryActivity<RunningRouteHistoryViewModel, xn0> {
    private HistoricalRoutesAdapter adapter;

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecycler() {
        this.adapter = new HistoricalRoutesAdapter(new androidx.recyclerview.widget.h.f<RouteInfo>() { // from class: com.xiaomi.fitness.sport.view.route.RunningRouteHistoryActivity.initRecycler.1
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(RouteInfo oldItem, RouteInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId() && oldItem.getCreateTimestamp() == newItem.getCreateTimestamp() && Intrinsics.areEqual(oldItem.getName(), newItem.getName()) && Intrinsics.areEqual(oldItem.getFile(), newItem.getFile());
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(RouteInfo oldItem, RouteInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        final RecyclerView recyclerView = ((xn0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        HistoricalRoutesAdapter historicalRoutesAdapter = this.adapter;
        HistoricalRoutesAdapter historicalRoutesAdapter2 = null;
        if (historicalRoutesAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            historicalRoutesAdapter = null;
        }
        recyclerView.setAdapter(historicalRoutesAdapter);
        HistoricalRoutesAdapter historicalRoutesAdapter3 = this.adapter;
        if (historicalRoutesAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            historicalRoutesAdapter2 = historicalRoutesAdapter3;
        }
        historicalRoutesAdapter2.addLoadStateListener(new Function1() { // from class: h3l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RunningRouteHistoryActivity.initRecycler$lambda$1(this.f19653a, recyclerView, (CombinedLoadStates) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRecycler$lambda$1(RunningRouteHistoryActivity this$0, RecyclerView historyRecycler, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(historyRecycler, "$historyRecycler");
        Intrinsics.checkNotNullParameter(it, "it");
        HistoricalRoutesAdapter historicalRoutesAdapter = this$0.adapter;
        if (historicalRoutesAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            historicalRoutesAdapter = null;
        }
        boolean z = historicalRoutesAdapter.getItemCount() == 0;
        ViewExtKt.setVisible(historyRecycler, !z);
        AppCompatTextView tvNoData = ((xn0) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(tvNoData, "tvNoData");
        ViewExtKt.setVisible(tvNoData, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(RunningRouteHistoryActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestHistoryRoutes();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestHistoryRoutes() {
        ((RunningRouteHistoryViewModel) getMViewModel()).getHistoricalRoutesPagingDataLiveData().observe(this, new RunningRouteHistoryActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i3l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RunningRouteHistoryActivity.requestHistoryRoutes$lambda$2(this.f20744a, (PagingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestHistoryRoutes$lambda$2(RunningRouteHistoryActivity this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HistoricalRoutesAdapter historicalRoutesAdapter = this$0.adapter;
        if (historicalRoutesAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            historicalRoutesAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        historicalRoutesAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sport.view.route.Hilt_RunningRouteHistoryActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c1j.M3);
        initRecycler();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AppCompatTextView tvNoNetwork = ((xn0) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(tvNoNetwork, "tvNoNetwork");
        RelativeLayout networkContent = ((xn0) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(networkContent, "networkContent");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(tvNoNetwork, networkContent, null, new Function0() { // from class: g3l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteHistoryActivity.onResume$lambda$0(this.f18552a);
            }
        }, 4, null);
    }
}
