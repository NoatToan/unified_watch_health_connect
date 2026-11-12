package com.xiaomi.fitness.route.track.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.track.TrackListFragmentOperator;
import com.xiaomi.fitness.route.track.view.TrackCollectListFragment;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.bvi;
import defpackage.czk;
import defpackage.mv1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b.\u0010\u001aJ\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ+\u0010!\u001a\u00020\u00072\u001a\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001eH\u0016¢\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u00020\u00072$\u0010 \u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00070#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u001aJ\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u001aR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCollectListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM;", "Lczk;", "Lcom/xiaomi/fitness/route/track/TrackListFragmentOperator;", "", "loadMore", "", "getData", "(Z)V", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "pair", "onDataOk", "(Lkotlin/Pair;)V", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeInfo", "onClick", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "setListener", "onEndViewClick", "onStartViewClick", "Lkotlin/Function2;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStartViewRefreshListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function3;", "setEndViewRefreshListener", "(Lkotlin/jvm/functions/Function3;)V", "requestEndView", "resetMainAdapter", "Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter;", "adapter", "Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter;", "", "list", "Ljava/util/List;", "<init>", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrackCollectListFragment extends Hilt_TrackCollectListFragment<MyTrackLibraryVM, czk> implements TrackListFragmentOperator {

    @Nullable
    private TrackCollectListAdapter adapter;

    @NotNull
    private List<RouteInfo> list;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackCollectListFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<RouteInfo, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, TrackCollectListFragment.class, "onClick", "onClick(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(RouteInfo routeInfo) {
            invoke2(routeInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RouteInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TrackCollectListFragment) this.receiver).onClick(p0);
        }
    }

    public TrackCollectListFragment() {
        super(bvi.o, mv1.c);
        this.list = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getData(boolean loadMore) {
        ((MyTrackLibraryVM) getMViewModel()).getCollectList(loadMore);
    }

    public static /* synthetic */ void getData$default(TrackCollectListFragment trackCollectListFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        trackCollectListFragment.getData(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick(RouteInfo routeInfo) {
        IRunningRouteApi instance = RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        instance.goToRouteDetailActivity(contextRequireContext, routeInfo.getId(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOk(Pair<RouteCollectResponse, Boolean> pair) {
        View noDataInclude = ((czk) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(noDataInclude, "noDataInclude");
        ViewExtKt.gone(noDataInclude);
        MoreRecyclerView recyclerView = ((czk) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.visible(recyclerView);
        RouteCollectResponse first = pair.getFirst();
        if (!pair.getSecond().booleanValue()) {
            this.list.clear();
        }
        if (this.list.size() + first.getRoutes().size() >= first.getTotalCount()) {
            MoreRecyclerView.setStatus$default(((czk) getMBinding()).B, Status.DONE, false, 2, null);
        } else {
            MoreRecyclerView.setStatus$default(((czk) getMBinding()).B, Status.MORE, false, 2, null);
        }
        this.list.addAll(pair.getFirst().getRoutes());
        TrackCollectListAdapter trackCollectListAdapter = this.adapter;
        if (trackCollectListAdapter != null) {
            trackCollectListAdapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) this.list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$0(TrackCollectListFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (stateData.g()) {
            MoreRecyclerView recyclerView = ((czk) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.gone(recyclerView);
            View noDataInclude = ((czk) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(noDataInclude, "noDataInclude");
            ViewExtKt.visible(noDataInclude);
        } else if (stateData.h() || stateData.j()) {
            MoreRecyclerView.setStatus$default(((czk) this$0.getMBinding()).B, Status.FAIL, false, 2, null);
        } else if (stateData.k()) {
            T data = stateData.f11668a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            this$0.onDataOk((Pair) data);
        } else if (stateData.i()) {
            MoreRecyclerView.setStatus$default(((czk) this$0.getMBinding()).B, Status.LOADING, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onEndViewClick() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getData$default(this, false, 1, null);
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onStartViewClick() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        resetMainAdapter();
        setActionBarDisplayable(false);
        this.adapter = new TrackCollectListAdapter(new AnonymousClass1(this));
        ((czk) getMBinding()).B.setAdapter(this.adapter);
        ((czk) getMBinding()).B.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(7), false, false, 2, null));
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void requestEndView() {
    }

    public final void resetMainAdapter() {
        Map<Integer, TrackListFragmentOperator> fragmentMaps;
        if (getMActivity() instanceof MyTrackLibraryActivity) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity");
            TrackListFragmentAdapter fragmentAdapter = ((MyTrackLibraryActivity) mActivity).getFragmentAdapter();
            if (fragmentAdapter == null || (fragmentMaps = fragmentAdapter.getFragmentMaps()) == null) {
                return;
            }
            fragmentMaps.put(1, this);
        }
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setEndViewRefreshListener(@NotNull Function3<? super View, ? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((MyTrackLibraryVM) getMViewModel()).getCollectData().observe(getViewLifecycleOwner(), new TrackCollectListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wkp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackCollectListFragment.setListener$lambda$0(this.f38073a, (StateData) obj);
            }
        }));
        ((czk) getMBinding()).B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.route.track.view.TrackCollectListFragment.setListener.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                TrackCollectListFragment.this.getData(true);
            }
        });
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setStartViewRefreshListener(@NotNull Function2<? super View, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
