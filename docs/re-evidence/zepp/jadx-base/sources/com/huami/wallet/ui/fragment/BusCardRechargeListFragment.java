package com.huami.wallet.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.BusCardRechargeListAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.fragment.BusCardRechargeListFragment;
import com.huami.wallet.ui.helper.EmptyViewHelper;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.wallet.ui.viewmodel.TradeRecordViewModel;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00108B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardRechargeListFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "", "isVisibleToUser", "setUserVisibleHint", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/wallet/ui/adapter/BusCardRechargeListAdapter;", "c", "Lcom/huami/wallet/ui/adapter/BusCardRechargeListAdapter;", "mAdapter", "Lcom/huami/wallet/ui/fragment/BusCardRechargeListFragment$ViewHolder;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/fragment/BusCardRechargeListFragment$ViewHolder;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "e", "Lkotlin/Lazy;", "()Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "mViewModel", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "mEmptyViewHelper", "g", "Landroid/view/View;", RootDescription.ROOT_ELEMENT, "i", "()Z", "isVisibleToUserAndViewCreated", "<init>", "()V", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardRechargeListFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BusCardRechargeListAdapter mAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ViewHolder mViewHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private EmptyViewHelper mEmptyViewHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View root;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardRechargeListFragment$ViewHolder;", "", "Landroid/view/View;", "headerView", "", "parseHeaderView", "headerDivider", "Landroid/view/View;", "getHeaderDivider", "()Landroid/view/View;", "setHeaderDivider", "(Landroid/view/View;)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {
        public View headerDivider;

        @NotNull
        public final View getHeaderDivider() {
            View view = this.headerDivider;
            Objects.requireNonNull(view);
            return view;
        }

        public final void parseHeaderView(@NotNull View headerView) {
            setHeaderDivider(headerView.findViewById(R.id.header_divider));
        }

        public final void setHeaderDivider(@NotNull View view) {
            this.headerDivider = view;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusCardRechargeListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardRechargeListFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TradeRecordViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardRechargeListFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.TradeRecordViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TradeRecordViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TradeRecordViewModel.class), function0, objArr);
            }
        });
    }

    private final TradeRecordViewModel e() {
        return (TradeRecordViewModel) this.mViewModel.getValue();
    }

    private final void f() {
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mRecyclerView.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(getContext()).setIgnorePosition(0)));
        BusCardRechargeListAdapter busCardRechargeListAdapter = new BusCardRechargeListAdapter();
        this.mAdapter = busCardRechargeListAdapter;
        busCardRechargeListAdapter.bindToRecyclerView(this.mRecyclerView);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wl_header_spacing, (ViewGroup) this.mRecyclerView, false);
        this.mAdapter.setHeaderView(viewInflate);
        this.mViewHolder.parseHeaderView(viewInflate);
        this.mViewHolder.getHeaderDivider().setVisibility(8);
        this.mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: md0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                BusCardRechargeListFragment.g(this.a, baseQuickAdapter, view, i);
            }
        });
        this.mEmptyViewHelper = new EmptyViewHelper(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BusCardRechargeListFragment busCardRechargeListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        busCardRechargeListFragment.e().attemptToEnterRechargeDetail(busCardRechargeListFragment.mAdapter.getItem(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public static final void h(BusCardRechargeListFragment busCardRechargeListFragment, Resource resource) {
        boolean z;
        if (resource == null) {
            return;
        }
        T t = resource.data;
        if (t != 0) {
            List list = (List) t;
            z = (list == null ? null : Boolean.valueOf(list.isEmpty() ^ true)).booleanValue();
        }
        busCardRechargeListFragment.mViewHolder.getHeaderDivider().setVisibility(z ? 0 : 8);
        Status status = resource.status;
        if (status != Status.SUCCESS) {
            if (status == Status.ERROR) {
                BusCardRechargeListAdapter busCardRechargeListAdapter = busCardRechargeListFragment.mAdapter;
                if (busCardRechargeListAdapter != null) {
                    busCardRechargeListAdapter.setNewData(null);
                }
                EmptyViewHelper emptyViewHelper = busCardRechargeListFragment.mEmptyViewHelper;
                if (emptyViewHelper == null) {
                    return;
                }
                emptyViewHelper.showFailView();
                return;
            }
            return;
        }
        busCardRechargeListFragment.mAdapter.setNewData((List) resource.data);
        if (z) {
            EmptyViewHelper emptyViewHelper2 = busCardRechargeListFragment.mEmptyViewHelper;
            if (emptyViewHelper2 == null) {
                return;
            }
            emptyViewHelper2.removeEmptyView();
            return;
        }
        EmptyViewHelper emptyViewHelper3 = busCardRechargeListFragment.mEmptyViewHelper;
        if (emptyViewHelper3 == null) {
            return;
        }
        emptyViewHelper3.showEmptyView();
    }

    private final boolean i() {
        return getUserVisibleHint() && getView() != null;
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        e().rechargeRecordsLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: ld0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardRechargeListFragment.h(this.a, (Resource) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (i()) {
            e().loadBusCardRechargeRecords();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.wl_fragment_list, container, false);
        this.root = viewInflate;
        Objects.requireNonNull(viewInflate);
        this.mRecyclerView = (RecyclerView) viewInflate.findViewById(R.id.wl_ls_rv);
        View view = this.root;
        Objects.requireNonNull(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new ViewHolder();
        f();
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (i()) {
            e().loadBusCardRechargeRecords();
        }
    }
}
