package com.xiaomi.fitness.route.track.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.location.AMapLocationClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.track.TrackDataManager;
import com.xiaomi.fitness.route.track.TrackListFragmentOperator;
import com.xiaomi.fitness.route.track.view.TrackCreateListFragment;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import defpackage.av6;
import defpackage.bvi;
import defpackage.doi;
import defpackage.ezk;
import defpackage.mv1;
import defpackage.x0j;
import defpackage.yxi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001BB\u0007¢\u0006\u0004\bA\u0010\u0011J#\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0014¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0011J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0011J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\t2\u001a\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0'H\u0016¢\u0006\u0004\b)\u0010*J5\u0010,\u001a\u00020\t2$\u0010(\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0011J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u0011R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R,\u0010:\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R6\u0010<\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00101R\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCreateListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM;", "Lezk;", "Lcom/xiaomi/fitness/route/track/TrackListFragmentOperator;", "", "createByUser", "", "nextKey", "", "getData", "(ZLjava/lang/String;)V", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "data", "onDataOk", "(Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;)V", "refreshSelectList", "()V", "", "delNum", "showDelDialog", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", LifecycleConstantKt.ON_DESTROY, "Landroid/content/Intent;", "receivedIntent", "setIntent", "(Landroid/content/Intent;)V", "setListener", "onEndViewClick", "onStartViewClick", "onBackPressed", "()Z", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStartViewRefreshListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function3;", "setEndViewRefreshListener", "(Lkotlin/jvm/functions/Function3;)V", "requestEndView", "resetMainAdapter", "mIsFromDeviceLib", "Z", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "routeList", "Ljava/util/List;", "deleteRouteIds", "Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter;", "adapter", "Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter;", "startViewRefreshListener", "Lkotlin/jvm/functions/Function2;", "endViewRefreshListener", "Lkotlin/jvm/functions/Function3;", "aiOpen", "endViewId", "Ljava/lang/Integer;", "<init>", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrackCreateListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackCreateListFragment.kt\ncom/xiaomi/fitness/route/track/view/TrackCreateListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n1755#2,3:307\n1863#2,2:310\n1863#2,2:312\n774#2:314\n865#2,2:315\n1863#2,2:317\n774#2:319\n865#2,2:320\n1863#2,2:322\n774#2:324\n865#2,2:325\n1863#2,2:327\n*S KotlinDebug\n*F\n+ 1 TrackCreateListFragment.kt\ncom/xiaomi/fitness/route/track/view/TrackCreateListFragment\n*L\n181#1:307,3\n238#1:310,2\n250#1:312,2\n100#1:314\n100#1:315,2\n101#1:317,2\n134#1:319\n134#1:320,2\n135#1:322,2\n136#1:324\n136#1:325,2\n136#1:327,2\n*E\n"})
public final class TrackCreateListFragment extends Hilt_TrackCreateListFragment<MyTrackLibraryVM, ezk> implements TrackListFragmentOperator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int pageState;

    @Nullable
    private TrackCreateListAdapter adapter;
    private boolean aiOpen;

    @NotNull
    private final List<String> deleteRouteIds;

    @Nullable
    private Integer endViewId;

    @Nullable
    private Function3<? super View, ? super Integer, ? super Integer, Unit> endViewRefreshListener;
    private boolean mIsFromDeviceLib;

    @NotNull
    private final List<Route> routeList;

    @Nullable
    private Function2<? super View, ? super Integer, Unit> startViewRefreshListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCreateListFragment$Companion;", "", "<init>", "()V", "pageState", "", "getPageState", "()I", "setPageState", "(I)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPageState() {
            return TrackCreateListFragment.pageState;
        }

        public final void setPageState(int i) {
            TrackCreateListFragment.pageState = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackCreateListFragment$onDataOk$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackCreateListFragment$onDataOk$1", f = "TrackCreateListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackCreateListFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrackCreateListFragment.this.refreshSelectList();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackCreateListFragment$setListener$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/route/track/view/TrackCreateListFragment$setListener$2", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;", "loadMore", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 implements MoreRecyclerView.LoadListener {
        public AnonymousClass2() {
        }

        @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
        public void loadMore() {
            MyTrackLibraryVM.getTrackList$default(TrackCreateListFragment.access$getMViewModel(TrackCreateListFragment.this), false, 0, null, true, new Function0() { // from class: ilp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, 7, null);
        }
    }

    public TrackCreateListFragment() {
        super(bvi.p, mv1.c);
        this.routeList = new ArrayList();
        this.deleteRouteIds = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MyTrackLibraryVM access$getMViewModel(TrackCreateListFragment trackCreateListFragment) {
        return (MyTrackLibraryVM) trackCreateListFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getData(boolean createByUser, String nextKey) {
        MyTrackLibraryVM.getTrackList$default((MyTrackLibraryVM) getMViewModel(), false, 0, nextKey, createByUser, new Function0() { // from class: blp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackCreateListFragment.getData$lambda$2(this.f4349a);
            }
        }, 3, null);
    }

    public static /* synthetic */ void getData$default(TrackCreateListFragment trackCreateListFragment, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        trackCreateListFragment.getData(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getData$lambda$2(TrackCreateListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView.setStatus$default(((ezk) this$0.getMBinding()).C, ((MyTrackLibraryVM) this$0.getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOk(MyTrackLibraryVM.RouteData data) {
        List<Route> feeds = data.getFeeds();
        FitnessLogUtils.i(BaseFragment.TAG, "viewStates: onDataOK: " + (feeds != null ? Integer.valueOf(feeds.size()) : null));
        dismissDialog();
        showContent();
        View noDataInclude = ((ezk) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(noDataInclude, "noDataInclude");
        ViewExtKt.gone(noDataInclude);
        MoreRecyclerView.setStatus$default(((ezk) getMBinding()).C, ((MyTrackLibraryVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        if (data.getFirstPage()) {
            this.routeList.clear();
        }
        List<Route> list = this.routeList;
        List<Route> feeds2 = data.getFeeds();
        Intrinsics.checkNotNull(feeds2);
        list.addAll(feeds2);
        TrackCreateListAdapter trackCreateListAdapter = this.adapter;
        if (trackCreateListAdapter != null) {
            trackCreateListAdapter.setData(this.routeList);
        }
        if (((MyTrackLibraryVM) getMViewModel()).getIsFirstPageData() || pageState != 3) {
            return;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(TrackCreateListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshSelectList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TrackCreateListFragment this$0, Unit unit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        getData$default(this$0, false, "", 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSelectList() {
        List<Route> list = this.routeList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.isDelSelected() == null || Intrinsics.areEqual(route.isDelSelected(), Boolean.FALSE)) {
                    pageState = 1;
                    Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
                    if (function3 != null) {
                        function3.invoke(null, Integer.valueOf(doi.c), Integer.valueOf(x0j.W));
                    }
                    this.endViewId = Integer.valueOf(doi.c);
                    return;
                }
            }
        }
        pageState = 3;
        Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
        if (function4 != null) {
            function4.invoke(null, Integer.valueOf(doi.d), Integer.valueOf(x0j.X));
        }
        this.endViewId = Integer.valueOf(doi.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$12(TrackCreateListFragment this$0, FailRoutes failRoutes) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<String> failRoutes2 = failRoutes.getFailRoutes();
        if (failRoutes2 == null || !failRoutes2.isEmpty()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, x0j.m);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, x0j.l);
            }
        }
        List<Route> list = this$0.routeList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Route route = (Route) obj;
            List<String> failRoutes3 = failRoutes.getFailRoutes();
            if (failRoutes3 != null && failRoutes3.contains(route.getRoute_id())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this$0.deleteRouteIds.remove(((Route) it.next()).getRoute_id());
        }
        List<Route> list2 = this$0.routeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (this$0.deleteRouteIds.contains(((Route) obj2).getRoute_id())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this$0.routeList.remove((Route) it2.next());
        }
        TrackCreateListAdapter trackCreateListAdapter = this$0.adapter;
        if (trackCreateListAdapter != null) {
            trackCreateListAdapter.setData(this$0.routeList);
        }
        if (this$0.routeList.isEmpty()) {
            View noDataInclude = ((ezk) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(noDataInclude, "noDataInclude");
            ViewExtKt.visible(noDataInclude);
            this$0.onStartViewClick();
        } else {
            View noDataInclude2 = ((ezk) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(noDataInclude2, "noDataInclude");
            ViewExtKt.gone(noDataInclude2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$15(TrackCreateListFragment this$0, RunningRouteSupportCityBean runningRouteSupportCityBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (runningRouteSupportCityBean != null) {
            this$0.aiOpen = runningRouteSupportCityBean.getAiOpen();
            TextView createBtn = ((ezk) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(createBtn, "createBtn");
            ViewExtKt.setVisible(createBtn, this$0.aiOpen);
        } else {
            FitnessLogUtils.i(BaseFragment.TAG, "running route support city return null");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(TrackCreateListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = pageState;
        if (i == 0) {
            IRunningRouteApi instance = RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE);
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            instance.gotoCreateRunningRouteActivity(contextRequireContext);
            return;
        }
        if (i == 1 || i == 3) {
            this$0.deleteRouteIds.clear();
            List<Route> list = this$0.routeList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Boolean boolIsDelSelected = ((Route) obj).isDelSelected();
                if (boolIsDelSelected != null && boolIsDelSelected.booleanValue()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this$0.deleteRouteIds.add(((Route) it.next()).getRoute_id());
            }
            int size = this$0.deleteRouteIds.size();
            if (size != 0) {
                this$0.showDelDialog(size);
                return;
            }
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, x0j.E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$7(TrackCreateListFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (stateData.g()) {
            MoreRecyclerView.setStatus$default(((ezk) this$0.getMBinding()).C, Status.DONE, false, 2, null);
        } else if (stateData.h() || stateData.j()) {
            MoreRecyclerView.setStatus$default(((ezk) this$0.getMBinding()).C, Status.FAIL, false, 2, null);
        } else if (stateData.k()) {
            T data = stateData.f11668a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            this$0.onDataOk((MyTrackLibraryVM.RouteData) data);
        } else if (stateData.i()) {
            MoreRecyclerView.setStatus$default(((ezk) this$0.getMBinding()).C, Status.LOADING, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void showDelDialog(int delNum) {
        CommonDialog commonDialogCreate = new CommonDialog.c("Track").setDialogTitle(x0j.n).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getQuantityString(yxi.f40669a, delNum, Integer.valueOf(delNum)))).setNegativeText(x0j.f38547a).setPositiveText(x0j.f38548b).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.route.track.view.TrackCreateListFragment.showDelDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (NetUtil.INSTANCE.getNetWorkState(AppUtil.getApp()) == -1) {
                        Context context = TrackCreateListFragment.this.getContext();
                        if (context != null) {
                            ToastExtKt.toastShort(context, x0j.common_network_error_retry_later);
                            return;
                        }
                        return;
                    }
                    MyTrackLibraryVM myTrackLibraryVMAccess$getMViewModel = TrackCreateListFragment.access$getMViewModel(TrackCreateListFragment.this);
                    List listDistinct = CollectionsKt___CollectionsKt.distinct(TrackCreateListFragment.this.deleteRouteIds);
                    Intrinsics.checkNotNull(listDistinct, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    myTrackLibraryVMAccess$getMViewModel.deleteTrackRoute(TypeIntrinsics.asMutableList(listDistinct));
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        onStartViewClick();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pageState = 0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TrackDataManager.INSTANCE.getRouteListNotifyLiveData().removeObservers(requireActivity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onEndViewClick() {
        int i = pageState == 1 ? 3 : 1;
        pageState = i;
        if (i == 1) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
            if (function3 != null) {
                function3.invoke(null, Integer.valueOf(doi.c), Integer.valueOf(x0j.W));
            }
            this.endViewId = Integer.valueOf(doi.c);
            Function2<? super View, ? super Integer, Unit> function2 = this.startViewRefreshListener;
            if (function2 != null) {
                function2.invoke(null, Integer.valueOf(doi.f15742a));
            }
            Iterator<T> it = this.routeList.iterator();
            while (it.hasNext()) {
                ((Route) it.next()).setDelSelected(Boolean.FALSE);
            }
            TextView createBtn = ((ezk) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(createBtn, "createBtn");
            ViewExtKt.setVisible(createBtn, true);
            ((ezk) getMBinding()).A.setText(getString(x0j.I));
        } else if (i != 3) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
            if (function4 != null) {
                function4.invoke(null, Integer.valueOf(doi.f15743b), Integer.valueOf(x0j.n));
            }
            this.endViewId = Integer.valueOf(doi.f15743b);
            TextView createBtn2 = ((ezk) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(createBtn2, "createBtn");
            ViewExtKt.setVisible(createBtn2, this.aiOpen);
            ((ezk) getMBinding()).A.setText(getString(x0j.S));
        } else {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function5 = this.endViewRefreshListener;
            if (function5 != null) {
                function5.invoke(null, Integer.valueOf(doi.d), Integer.valueOf(x0j.X));
            }
            this.endViewId = Integer.valueOf(doi.d);
            TextView createBtn3 = ((ezk) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(createBtn3, "createBtn");
            ViewExtKt.setVisible(createBtn3, true);
            ((ezk) getMBinding()).A.setText(getString(x0j.I));
            Iterator<T> it2 = this.routeList.iterator();
            while (it2.hasNext()) {
                ((Route) it2.next()).setDelSelected(Boolean.TRUE);
            }
        }
        TrackCreateListAdapter trackCreateListAdapter = this.adapter;
        if (trackCreateListAdapter != null) {
            trackCreateListAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onStartViewClick() {
        int i = pageState;
        if (i == 0 || i == 2) {
            finish();
            return;
        }
        Function2<? super View, ? super Integer, Unit> function2 = this.startViewRefreshListener;
        if (function2 != null) {
            function2.invoke(null, Integer.valueOf(doi.f15744k));
        }
        Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
        if (function3 != null) {
            function3.invoke(null, Integer.valueOf(doi.f15743b), Integer.valueOf(x0j.n));
        }
        this.endViewId = Integer.valueOf(doi.f15743b);
        ((ezk) getMBinding()).A.setText(getString(x0j.S));
        TextView createBtn = ((ezk) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(createBtn, "createBtn");
        ViewExtKt.setVisible(createBtn, this.aiOpen);
        pageState = 0;
        TrackCreateListAdapter trackCreateListAdapter = this.adapter;
        if (trackCreateListAdapter != null) {
            trackCreateListAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        resetMainAdapter();
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        setActionBarDisplayable(false);
        this.endViewId = Integer.valueOf(doi.f15743b);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.adapter = new TrackCreateListAdapter(contextRequireContext);
        ((ezk) getMBinding()).C.setAdapter(this.adapter);
        ((ezk) getMBinding()).C.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(7), false, false, 2, null));
        TrackCreateListAdapter trackCreateListAdapter = this.adapter;
        if (trackCreateListAdapter != null) {
            trackCreateListAdapter.setRefreshSelectList(new Function0() { // from class: clp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TrackCreateListFragment.onViewCreated$lambda$0(this.f5468a);
                }
            });
        }
        requestEndView();
        getData$default(this, false, "", 1, null);
        TrackDataManager.INSTANCE.getRouteListNotifyLiveData().observe(requireActivity(), new TrackCreateListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dlp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackCreateListFragment.onViewCreated$lambda$1(this.f15670a, (Unit) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void requestEndView() {
        if (this.mIsFromDeviceLib) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
            if (function3 != null) {
                function3.invoke(null, null, null);
                return;
            }
            return;
        }
        Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
        if (function4 != null) {
            function4.invoke(null, this.endViewId, null);
        }
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
            fragmentMaps.put(0, this);
        }
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setEndViewRefreshListener(@NotNull Function3<? super View, ? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.endViewRefreshListener = listener;
    }

    public final void setIntent(@Nullable Intent receivedIntent) {
        this.mIsFromDeviceLib = receivedIntent != null ? receivedIntent.getBooleanExtra(MyTrackLibraryActivity.isFromDeviceLib, false) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ezk) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: elp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackCreateListFragment.setListener$lambda$6(this.f16787a, view);
            }
        });
        ((ezk) getMBinding()).C.setLoadListener(new AnonymousClass2());
        ((MyTrackLibraryVM) getMViewModel()).getViewStates().observe(getViewLifecycleOwner(), new TrackCreateListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: flp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackCreateListFragment.setListener$lambda$7(this.f17904a, (StateData) obj);
            }
        }));
        ((MyTrackLibraryVM) getMViewModel()).getFailRoutes().observe(getViewLifecycleOwner(), new TrackCreateListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: glp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackCreateListFragment.setListener$lambda$12(this.f19120a, (FailRoutes) obj);
            }
        }));
        boolean zSupportCity = RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE).supportCity();
        this.aiOpen = zSupportCity;
        Logger.i(BaseFragment.TAG, "track create list ai route support:" + zSupportCity);
        if (!this.aiOpen) {
            ((MyTrackLibraryVM) getMViewModel()).checkSupportCity().observe(this, new TrackCreateListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hlp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TrackCreateListFragment.setListener$lambda$15(this.f20220a, (RunningRouteSupportCityBean) obj);
                }
            }));
            return;
        }
        TextView createBtn = ((ezk) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(createBtn, "createBtn");
        ViewExtKt.setVisible(createBtn, true);
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setStartViewRefreshListener(@NotNull Function2<? super View, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.startViewRefreshListener = listener;
    }
}
