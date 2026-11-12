package com.huami.assistant.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.ScheduleListFragment;
import com.huami.assistant.ui.v2.adapter.ScheduleAdapter;
import com.huami.assistant.ui.v2.model.ScheduleDataItem;
import com.huami.assistant.ui.v2.viewmodel.ScheduleListViewModel;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/assistant/ui/v2/ScheduleListFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "initViewModel", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/assistant/ui/v2/viewmodel/ScheduleListViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/assistant/ui/v2/viewmodel/ScheduleListViewModel;", "mListViewModel", "Lcom/huami/assistant/ui/v2/adapter/ScheduleAdapter;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/assistant/ui/v2/adapter/ScheduleAdapter;", "mAdapter", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleListFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ScheduleListViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.assistant.ui.v2.ScheduleListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/adapter/ScheduleAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ScheduleAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleAdapter getA() {
            return new ScheduleAdapter();
        }
    }

    private final ScheduleAdapter d() {
        return (ScheduleAdapter) this.mAdapter.getValue();
    }

    private final ScheduleListViewModel e() {
        return (ScheduleListViewModel) this.mListViewModel.getValue();
    }

    private final void f() {
        View view = getView();
        ((SmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refresh_layout))).setEnableLoadmore(false);
        View view2 = getView();
        ((SmartRefreshLayout) (view2 == null ? null : view2.findViewById(R.id.refresh_layout))).setEnableRefresh(false);
        View view3 = getView();
        ((SmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.refresh_layout))).setOnRefreshListener(new OnRefreshListener() { // from class: ui6
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                ScheduleListFragment.g(this.a, refreshLayout);
            }
        });
        View view4 = getView();
        ((RecyclerView) (view4 == null ? null : view4.findViewById(R.id.schedule_list))).setLayoutManager(new LinearLayoutManager(requireContext()));
        d().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ti6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view5, int i) {
                ScheduleListFragment.h(this.a, baseQuickAdapter, view5, i);
            }
        });
        View view5 = getView();
        ((RecyclerView) (view5 == null ? null : view5.findViewById(R.id.schedule_list))).setAdapter(d());
        View view6 = getView();
        ((RecyclerView) (view6 != null ? view6.findViewById(R.id.schedule_list) : null)).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.assistant.ui.v2.ScheduleListFragment$initAdapter$3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                View view7 = this.a.getView();
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) (view7 == null ? null : view7.findViewById(R.id.schedule_list))).getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                ScheduleActivity.Companion companion = ScheduleActivity.INSTANCE;
                companion.setLIST_POSITION(linearLayoutManager.findFirstVisibleItemPosition());
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(companion.getLIST_POSITION());
                companion.setLIST_OFFSET(viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getTop());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ScheduleListFragment scheduleListFragment, RefreshLayout refreshLayout) {
        scheduleListFragment.e().setLoadStartDayIndex(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ScheduleListFragment scheduleListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object obj = baseQuickAdapter.getData().get(i);
        if (obj instanceof ScheduleDataItem) {
            Bundle bundle = new Bundle();
            bundle.putSerializable(AddFragment.ARGS_SCHEDULE, ((ScheduleDataItem) obj).getSchedule());
            FragmentKt.findNavController(scheduleListFragment).navigate(R.id.action_to_add, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ScheduleListFragment scheduleListFragment, List list) {
        if (list != null && (list.isEmpty() ^ true)) {
            View view = scheduleListFragment.getView();
            ((LinearLayout) (view == null ? null : view.findViewById(R.id.layout_dynamic_empty))).setVisibility(8);
            View view2 = scheduleListFragment.getView();
            ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.schedule_list))).setVisibility(0);
            scheduleListFragment.d().setNewData(list);
            View view3 = scheduleListFragment.getView();
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) (view3 == null ? null : view3.findViewById(R.id.schedule_list))).getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                ScheduleActivity.Companion companion = ScheduleActivity.INSTANCE;
                linearLayoutManager.scrollToPositionWithOffset(companion.getLIST_POSITION(), companion.getLIST_OFFSET());
            }
        } else {
            View view4 = scheduleListFragment.getView();
            ((LinearLayout) (view4 == null ? null : view4.findViewById(R.id.layout_dynamic_empty))).setVisibility(0);
            View view5 = scheduleListFragment.getView();
            ((RecyclerView) (view5 == null ? null : view5.findViewById(R.id.schedule_list))).setVisibility(8);
            ScheduleActivity.Companion companion2 = ScheduleActivity.INSTANCE;
            companion2.setLIST_POSITION(0);
            companion2.setLIST_OFFSET(0);
        }
        View view6 = scheduleListFragment.getView();
        ((SmartRefreshLayout) (view6 != null ? view6.findViewById(R.id.refresh_layout) : null)).finishRefresh();
    }

    private final void initViewModel() {
        e().getAllData().observe(getViewLifecycleOwner(), new Observer() { // from class: si6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ScheduleListFragment.i(this.a, (List) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule_list, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        f();
        initViewModel();
    }
}
