package com.huami.wallet.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.entity.ConsumeRecord;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.BusCardConsumeListAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.fragment.BusCardConsumeListFragment;
import com.huami.wallet.ui.helper.EmptyViewHelper;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.wallet.ui.viewmodel.TradeRecordViewModel;
import java.util.Collection;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardConsumeListFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/wallet/ui/adapter/BusCardConsumeListAdapter;", "c", "Lcom/huami/wallet/ui/adapter/BusCardConsumeListAdapter;", "mAdapter", "Lcom/huami/wallet/ui/fragment/BusCardConsumeListFragment$ViewHolder;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/fragment/BusCardConsumeListFragment$ViewHolder;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "e", "Lkotlin/Lazy;", "()Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "mViewModel", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "mEmptyViewHelper", "g", "Landroid/view/View;", RootDescription.ROOT_ELEMENT, "", "i", "()Z", "isVisibleToUserAndViewCreated", "<init>", "()V", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardConsumeListFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BusCardConsumeListAdapter mAdapter;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardConsumeListFragment$ViewHolder;", "", "Landroid/view/View;", "headerView", "", "parseHeaderView", "headerDivider", "Landroid/view/View;", "getHeaderDivider", "()Landroid/view/View;", "setHeaderDivider", "(Landroid/view/View;)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
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
    public BusCardConsumeListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardConsumeListFragment$special$$inlined$sharedViewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TradeRecordViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardConsumeListFragment$special$$inlined$sharedViewModel$default$2
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        DividerDecoration dividerDecoration = new DividerDecoration(ListUtils.getMiddleDividerStyle(getContext()).setIgnorePosition(0));
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(dividerDecoration);
        }
        BusCardConsumeListAdapter busCardConsumeListAdapter = new BusCardConsumeListAdapter();
        this.mAdapter = busCardConsumeListAdapter;
        busCardConsumeListAdapter.bindToRecyclerView(this.mRecyclerView);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wl_header_spacing, (ViewGroup) this.mRecyclerView, false);
        BusCardConsumeListAdapter busCardConsumeListAdapter2 = this.mAdapter;
        if (busCardConsumeListAdapter2 != null) {
            busCardConsumeListAdapter2.setHeaderView(viewInflate);
        }
        ViewHolder viewHolder = this.mViewHolder;
        if (viewHolder != null) {
            viewHolder.parseHeaderView(viewInflate);
        }
        ViewHolder viewHolder2 = this.mViewHolder;
        if (viewHolder2 != null) {
            viewHolder2.getHeaderDivider().setVisibility(8);
        }
        this.mEmptyViewHelper = new EmptyViewHelper(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BusCardConsumeListFragment busCardConsumeListFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        T t = resource.data;
        boolean z = t != 0 && (((Collection) t).isEmpty() ^ true);
        ViewHolder viewHolder = busCardConsumeListFragment.mViewHolder;
        if (viewHolder != null) {
            viewHolder.getHeaderDivider().setVisibility(z ? 0 : 8);
        }
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            BusCardConsumeListAdapter busCardConsumeListAdapter = busCardConsumeListFragment.mAdapter;
            if (busCardConsumeListAdapter != null) {
                busCardConsumeListAdapter.setNewData((List) resource.data);
            }
            if (z) {
                busCardConsumeListFragment.mEmptyViewHelper.removeEmptyView();
                return;
            } else {
                busCardConsumeListFragment.mEmptyViewHelper.showEmptyView();
                return;
            }
        }
        if (status == Status.ERROR) {
            BusCardConsumeListAdapter busCardConsumeListAdapter2 = busCardConsumeListFragment.mAdapter;
            if (busCardConsumeListAdapter2 != null) {
                busCardConsumeListAdapter2.setNewData(null);
            }
            EmptyViewHelper emptyViewHelper = busCardConsumeListFragment.mEmptyViewHelper;
            if (emptyViewHelper == null) {
                return;
            }
            emptyViewHelper.showFailView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BusCardConsumeListFragment busCardConsumeListFragment, Resource resource) {
        if (resource == null || resource.status == Status.LOADING) {
            return;
        }
        busCardConsumeListFragment.e().loadBusCardConsumeRecords();
    }

    private final boolean i() {
        return getUserVisibleHint() && getView() != null;
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        MutableLiveData<Resource<List<ConsumeRecord>>> mutableLiveData = e().consumeRecordsLiveData;
        if (mutableLiveData != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: p90
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    BusCardConsumeListFragment.g(this.a, (Resource) obj);
                }
            });
        }
        MutableLiveData<Resource<Boolean>> mutableLiveData2 = e().consumeRecordsUploadLiveData;
        if (mutableLiveData2 == null) {
            return;
        }
        mutableLiveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: o90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardConsumeListFragment.h(this.a, (Resource) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (i()) {
            e().uploadConsumeRecords();
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
}
