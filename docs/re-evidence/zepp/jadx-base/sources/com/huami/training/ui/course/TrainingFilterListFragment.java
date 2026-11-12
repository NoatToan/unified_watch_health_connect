package com.huami.training.ui.course;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.decoration.VerticalLinearSpacingDecoration;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.ui.course.TrainingFilterListFragment;
import com.huami.training.ui.widget.CustomSmartRefreshLayout;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.FilterInfo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TrainingVo;
import com.loc.z;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R)\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b.\u00109¨\u0006>"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterListFragment;", "Landroidx/fragment/app/Fragment;", "", "m", z.j, hl.k, "", "f", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "isVisibleToUser", "setUserVisibleHint", "newOrder", "changedFilterOrder", "Lcom/huami/training/navigation/NavigationController;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "b", "h", "()Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "uiDelegate", "Lcom/huami/training/ui/course/TrainingFilterViewModel;", "c", "i", "()Lcom/huami/training/ui/course/TrainingFilterViewModel;", "viewModel", "Lcom/huami/training/vo/FilterInfo;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/vo/FilterInfo;", "filterInfo", "e", "Ljava/lang/String;", "currentOrder", "", LogUtil.I, "supportOrderSize", "Z", "hasObserved", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "adapter", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterListFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String i = "filter_info";

    @NotNull
    private static final String j = "filter_order_size";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiDelegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private FilterInfo filterInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String currentOrder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int supportOrderSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterListFragment$Companion;", "", "Lcom/huami/training/vo/FilterInfo;", "filterInfo", "", "supportOrderSize", "Lcom/huami/training/ui/course/TrainingFilterListFragment;", "create", "", "EXTRA_FILTER_INFO", "Ljava/lang/String;", "EXTRA_FILTER_ORDER_SIZE", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrainingFilterListFragment create(@NotNull FilterInfo filterInfo, int supportOrderSize) {
            TrainingFilterListFragment trainingFilterListFragment = new TrainingFilterListFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(TrainingFilterListFragment.i, filterInfo);
            bundle.putInt(TrainingFilterListFragment.j, supportOrderSize);
            trainingFilterListFragment.setArguments(bundle);
            return trainingFilterListFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PagingListAdapter<TrainingVo, RecyclerView.ViewHolder>> {

        /* JADX INFO: renamed from: com.huami.training.ui.course.TrainingFilterListFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0627a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ TrainingFilterListFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0627a(TrainingFilterListFragment trainingFilterListFragment) {
                super(0);
                this.a = trainingFilterListFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.i().retry();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PagingListAdapter<TrainingVo, RecyclerView.ViewHolder> getA() {
            return TrainingFilterListFragment.this.h().getListAdapter(TrainingFilterListFragment.this.f(), new C0627a(TrainingFilterListFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/training/vo/TrainingVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Integer, TrainingVo, Unit> {
        public b() {
            super(2);
        }

        public final void a(int i, @NotNull TrainingVo trainingVo) {
            Context context = TrainingFilterListFragment.this.getContext();
            if (context != null) {
                TrainingFilterListFragment.this.g().navigateToTrainingDetail(context, trainingVo.getId(), trainingVo.getTrainingType());
            }
            AnalyticsHelper.INSTANCE.countAllCourseListItemClicked(String.valueOf(trainingVo.getId()), i, TrainingFilterListFragment.this.f());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, TrainingVo trainingVo) {
            a(num.intValue(), trainingVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingFilterListFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.course.TrainingFilterListFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.uiDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingFilterListDelegate>() { // from class: com.huami.training.ui.course.TrainingFilterListFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.course.TrainingFilterListDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TrainingFilterListDelegate getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(TrainingFilterListDelegate.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingFilterViewModel>() { // from class: com.huami.training.ui.course.TrainingFilterListFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.course.TrainingFilterViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TrainingFilterViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(TrainingFilterViewModel.class), objArr4, objArr5);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final PagingListAdapter<TrainingVo, RecyclerView.ViewHolder> e() {
        return (PagingListAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f() {
        String filterMode;
        FilterInfo filterInfo = this.filterInfo;
        return (filterInfo == null || filterInfo == null || (filterMode = filterInfo.getFilterMode()) == null) ? "" : filterMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController g() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingFilterListDelegate h() {
        return (TrainingFilterListDelegate) this.uiDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingFilterViewModel i() {
        return (TrainingFilterViewModel) this.viewModel.getValue();
    }

    private final void j() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.filter_rcv));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(e());
        recyclerView.addItemDecoration(new VerticalLinearSpacingDecoration((int) ViewExKt.dpToPx(recyclerView, h().getItemHorizontalMargin()), (int) ViewExKt.dpToPx(recyclerView, h().getItemSpacing()), (int) ViewExKt.dpToPx(recyclerView, 20.0f), (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, 16, null));
        e().setOnItemClickListener(new b());
    }

    private final void k() {
        View view = getView();
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.smart_refresh));
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: iv7
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                TrainingFilterListFragment.l(this.a, refreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TrainingFilterListFragment trainingFilterListFragment, RefreshLayout refreshLayout) {
        trainingFilterListFragment.i().refresh();
    }

    private final void m() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        TrainingFilterViewModel trainingFilterViewModelI = i();
        FilterInfo filterInfo = this.filterInfo;
        if (filterInfo != null) {
            trainingFilterViewModelI.setFilterInfo(filterInfo);
        }
        trainingFilterViewModelI.getPagedList().observe(this, new Observer() { // from class: fv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFilterListFragment.n(this.a, (PagedList) obj);
            }
        });
        trainingFilterViewModelI.getRefreshState().observe(this, new Observer() { // from class: hv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFilterListFragment.o(this.a, (Resource) obj);
            }
        });
        trainingFilterViewModelI.getNetworkState().observe(this, new Observer() { // from class: gv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFilterListFragment.p(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TrainingFilterListFragment trainingFilterListFragment, PagedList pagedList) {
        trainingFilterListFragment.e().submitList(pagedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TrainingFilterListFragment trainingFilterListFragment, Resource resource) {
        if (resource != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i2 == 1) {
                View view = trainingFilterListFragment.getView();
                ((CustomSmartRefreshLayout) (view != null ? view.findViewById(R.id.smart_refresh) : null)).startRefreshingAnim();
            } else if (i2 == 2) {
                View view2 = trainingFilterListFragment.getView();
                ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.smart_refresh) : null)).finishRefresh(true);
            } else {
                if (i2 != 3) {
                    return;
                }
                View view3 = trainingFilterListFragment.getView();
                ((CustomSmartRefreshLayout) (view3 != null ? view3.findViewById(R.id.smart_refresh) : null)).finishRefresh(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TrainingFilterListFragment trainingFilterListFragment, Resource resource) {
        trainingFilterListFragment.e().setNetworkState(resource);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void changedFilterOrder(@NotNull String newOrder) {
        String str = this.currentOrder;
        Objects.requireNonNull(str);
        if (Intrinsics.areEqual(newOrder, str) && this.supportOrderSize == 1) {
            i().refresh();
            return;
        }
        FilterInfo filterInfo = this.filterInfo;
        if (filterInfo != null) {
            String str2 = this.currentOrder;
            Objects.requireNonNull(str2);
            if (!Intrinsics.areEqual(newOrder, str2)) {
                i().setFilterInfo(new FilterInfo(filterInfo.getText(), filterInfo.getFilterMode(), newOrder));
                e().submitList(null);
            }
        }
        this.currentOrder = newOrder;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(i);
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.training.vo.FilterInfo");
        FilterInfo filterInfo = (FilterInfo) serializable;
        this.filterInfo = filterInfo;
        String order = filterInfo.getOrder();
        if (order == null) {
            order = TrainingFilterListActivity.FILTER_MODE_ORDER_DESC;
        }
        this.currentOrder = order;
        Bundle arguments2 = getArguments();
        this.supportOrderSize = arguments2 == null ? 0 : arguments2.getInt(j);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_training_filter_list, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        j();
        k();
        if (getUserVisibleHint()) {
            m();
            AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
            FilterInfo filterInfo = this.filterInfo;
            String text = filterInfo == null ? null : filterInfo.getText();
            FilterInfo filterInfo2 = this.filterInfo;
            analyticsHelper.countCourseTabItemVisit(text, filterInfo2 != null ? filterInfo2.getFilterMode() : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        m();
        AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
        FilterInfo filterInfo = this.filterInfo;
        String text = filterInfo == null ? null : filterInfo.getText();
        FilterInfo filterInfo2 = this.filterInfo;
        analyticsHelper.countCourseTabItemVisit(text, filterInfo2 != null ? filterInfo2.getFilterMode() : null);
    }
}
