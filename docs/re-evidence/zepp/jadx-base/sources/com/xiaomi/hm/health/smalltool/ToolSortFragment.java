package com.xiaomi.hm.health.smalltool;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionInflater;
import androidx.view.OnBackPressedCallback;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.databinding.FragmentSmallToolSortBinding;
import com.xiaomi.hm.health.smalltool.ToolSortFragment;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.util.ToolAnalytics;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolSortFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onDestroy", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "toolViewModel", "Lcom/xiaomi/hm/health/databinding/FragmentSmallToolSortBinding;", "Lcom/xiaomi/hm/health/databinding/FragmentSmallToolSortBinding;", "binding", "Lcom/xiaomi/hm/health/smalltool/ToolSortAdapter;", "c", "Lcom/xiaomi/hm/health/smalltool/ToolSortAdapter;", "adapter", "<init>", "()V", "MyHandler", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolSortFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy toolViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ToolViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentSmallToolSortBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ToolSortAdapter adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolSortFragment$MyHandler;", "", "Lcom/xiaomi/hm/health/smalltool/ToolSortAdapter;", "adapter", "", "a", "Landroid/view/View;", "v", "onBackClick", "onEditClick", "onCancelClick", "onFinishClick", "<init>", "(Lcom/xiaomi/hm/health/smalltool/ToolSortFragment;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class MyHandler {
        public MyHandler() {
        }

        @SuppressLint({"NotifyDataSetChanged"})
        private final void a(ToolSortAdapter adapter) {
            int i = adapter.getIsEditing() ? 0 : 8;
            int i2 = adapter.getIsEditing() ? 8 : 0;
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding);
            fragmentSmallToolSortBinding.btnBack.setVisibility(i2);
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding2 = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding2);
            fragmentSmallToolSortBinding2.btnEdit.setVisibility(i2);
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding3 = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding3);
            fragmentSmallToolSortBinding3.btnCancel.setVisibility(i);
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding4 = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding4);
            fragmentSmallToolSortBinding4.btnFinish.setVisibility(i);
            adapter.notifyDataSetChanged();
        }

        public final void onBackClick(@NotNull View v) {
            Log.d("SmallTool-SortFragment", "OnClick: Back", new Object[0]);
            FragmentActivity activity = ToolSortFragment.this.getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
        }

        public final void onCancelClick(@NotNull View v) {
            Log.d("SmallTool-SortFragment", "OnClick: Cancel", new Object[0]);
            ToolSortAdapter toolSortAdapter = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter);
            toolSortAdapter.setEditing(false);
            List<Tool> value = ToolSortFragment.this.b().getSupportTools().getValue();
            List<Tool> value2 = ToolSortFragment.this.b().getMyTools().getValue();
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding);
            ToolBinding.setItemsWithoutNotify(fragmentSmallToolSortBinding.recyclerView, value, value2);
            ToolSortAdapter toolSortAdapter2 = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter2);
            a(toolSortAdapter2);
        }

        public final void onEditClick(@NotNull View v) {
            Log.d("SmallTool-SortFragment", "OnClick: Edit", new Object[0]);
            ToolSortAdapter toolSortAdapter = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter);
            toolSortAdapter.setEditing(true);
            ToolSortAdapter toolSortAdapter2 = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter2);
            a(toolSortAdapter2);
            ToolAnalytics.recordEvent(ToolAnalytics.EventId.TOOLS_SEQUENCE_C);
        }

        public final void onFinishClick(@NotNull View v) {
            Log.d("SmallTool-SortFragment", "OnClick: Finish", new Object[0]);
            ToolSortAdapter toolSortAdapter = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter);
            toolSortAdapter.setEditing(false);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            List<Tool> value = ToolSortFragment.this.b().getMyTools().getValue();
            if (value != null) {
                ToolSortAdapter toolSortAdapter2 = ToolSortFragment.this.adapter;
                Objects.requireNonNull(toolSortAdapter2);
                DiffUtil.calculateDiff(new ToolDiffCallback(value, toolSortAdapter2.getMyItems())).dispatchUpdatesTo(new ListUpdateCallback() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$MyHandler$onFinishClick$1$1
                    @Override // androidx.recyclerview.widget.ListUpdateCallback
                    public void onChanged(int position, int count, @Nullable Object payload) {
                        Log.d("SmallTool-SortFragment", "Diff OnChanged!!", new Object[0]);
                    }

                    @Override // androidx.recyclerview.widget.ListUpdateCallback
                    public void onInserted(int position, int count) {
                        Log.d("SmallTool-SortFragment", "Diff OnInserted!!", new Object[0]);
                        booleanRef.element = true;
                    }

                    @Override // androidx.recyclerview.widget.ListUpdateCallback
                    public void onMoved(int fromPosition, int toPosition) {
                        Log.d("SmallTool-SortFragment", "Diff OnMoved!!", new Object[0]);
                        booleanRef.element = true;
                    }

                    @Override // androidx.recyclerview.widget.ListUpdateCallback
                    public void onRemoved(int position, int count) {
                        Log.d("SmallTool-SortFragment", "Diff OnRemoved!!", new Object[0]);
                        booleanRef.element = true;
                    }
                });
            }
            if (booleanRef.element) {
                Log.d("SmallTool-SortFragment", "MyTools Changed!!", new Object[0]);
                List<Tool> value2 = ToolSortFragment.this.b().getSupportTools().getValue();
                if (value2 != null) {
                    ToolSortFragment toolSortFragment = ToolSortFragment.this;
                    value2.clear();
                    ToolSortAdapter toolSortAdapter3 = toolSortFragment.adapter;
                    Objects.requireNonNull(toolSortAdapter3);
                    value2.addAll(toolSortAdapter3.getItems());
                }
                List<Tool> value3 = ToolSortFragment.this.b().getMyTools().getValue();
                if (value3 != null) {
                    ToolSortFragment toolSortFragment2 = ToolSortFragment.this;
                    value3.clear();
                    ToolSortAdapter toolSortAdapter4 = toolSortFragment2.adapter;
                    Objects.requireNonNull(toolSortAdapter4);
                    value3.addAll(toolSortAdapter4.getMyItems());
                }
                ToolSortFragment.this.b().saveMyTools();
                RxBus.get().post(new ToolUpdateEvent());
            }
            List<Tool> value4 = ToolSortFragment.this.b().getSupportTools().getValue();
            List<Tool> value5 = ToolSortFragment.this.b().getMyTools().getValue();
            FragmentSmallToolSortBinding fragmentSmallToolSortBinding = ToolSortFragment.this.binding;
            Objects.requireNonNull(fragmentSmallToolSortBinding);
            ToolBinding.setItemsWithoutNotify(fragmentSmallToolSortBinding.recyclerView, value4, value5);
            ToolSortAdapter toolSortAdapter5 = ToolSortFragment.this.adapter;
            Objects.requireNonNull(toolSortAdapter5);
            a(toolSortAdapter5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToolViewModel b() {
        return (ToolViewModel) this.toolViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List list) {
        Log.d("SmallTool-SortFragment", "On MyTools Changed: " + ArraysUtil.toString((List<?>) list), new Object[0]);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b().getMyTools().observe(getViewLifecycleOwner(), new Observer() { // from class: kr7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ToolSortFragment.c((List) obj);
            }
        });
        b().loadToolsCache();
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment.onActivityCreated.2
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                ToolSortAdapter toolSortAdapter = ToolSortFragment.this.adapter;
                Objects.requireNonNull(toolSortAdapter);
                if (toolSortAdapter.getIsEditing()) {
                    FragmentSmallToolSortBinding fragmentSmallToolSortBinding = ToolSortFragment.this.binding;
                    Objects.requireNonNull(fragmentSmallToolSortBinding);
                    MyHandler handler = fragmentSmallToolSortBinding.getHandler();
                    if (handler == null) {
                        return;
                    }
                    FragmentSmallToolSortBinding fragmentSmallToolSortBinding2 = ToolSortFragment.this.binding;
                    Objects.requireNonNull(fragmentSmallToolSortBinding2);
                    handler.onCancelClick(fragmentSmallToolSortBinding2.btnBack);
                    return;
                }
                setEnabled(false);
                FragmentSmallToolSortBinding fragmentSmallToolSortBinding3 = ToolSortFragment.this.binding;
                Objects.requireNonNull(fragmentSmallToolSortBinding3);
                MyHandler handler2 = fragmentSmallToolSortBinding3.getHandler();
                if (handler2 == null) {
                    return;
                }
                FragmentSmallToolSortBinding fragmentSmallToolSortBinding4 = ToolSortFragment.this.binding;
                Objects.requireNonNull(fragmentSmallToolSortBinding4);
                handler2.onBackClick(fragmentSmallToolSortBinding4.btnBack);
            }
        });
        ToolSortAdapter toolSortAdapter = new ToolSortAdapter(b());
        toolSortAdapter.setHasStableIds(true);
        Unit unit = Unit.INSTANCE;
        this.adapter = toolSortAdapter;
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding);
        RecyclerView recyclerView = fragmentSmallToolSortBinding.recyclerView;
        Objects.requireNonNull(toolSortAdapter);
        recyclerView.setAdapter(toolSortAdapter);
        int i = I18nUtil.isZh(requireContext()) ? 4 : 2;
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding2 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding2);
        RecyclerView recyclerView2 = fragmentSmallToolSortBinding2.recyclerView;
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$onActivityCreated$4$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                FragmentSmallToolSortBinding fragmentSmallToolSortBinding3 = this.a.binding;
                Objects.requireNonNull(fragmentSmallToolSortBinding3);
                RecyclerView.Adapter adapter = fragmentSmallToolSortBinding3.recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getItemViewType(position));
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    return gridLayoutManager2.getSpanCount();
                }
                return 1;
            }
        });
        recyclerView2.setLayoutManager(gridLayoutManager);
        final ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$onActivityCreated$touchHelper$1
            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public int getMovementFlags(@NotNull RecyclerView recyclerView3, @NotNull RecyclerView.ViewHolder viewHolder) {
                int iMakeMovementFlags = ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                if (viewHolder.getItemViewType() != 1) {
                    return iMakeMovementFlags;
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            /* JADX INFO: renamed from: isItemViewSwipeEnabled */
            public boolean getIsEnableSwipe() {
                return false;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            /* JADX INFO: renamed from: isLongPressDragEnabled */
            public boolean getIsEnableDrag() {
                return false;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(@NotNull RecyclerView recyclerView3, @NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
                ToolSortAdapter toolSortAdapter2 = this.a.adapter;
                Objects.requireNonNull(toolSortAdapter2);
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) toolSortAdapter2.getMyItems());
                ToolSortFragment toolSortFragment = this.a;
                if (source.getItemViewType() == 1 || target.getItemViewType() == 1) {
                    return false;
                }
                int adapterPosition = source.getAdapterPosition();
                int i2 = adapterPosition > mutableList.size() ? adapterPosition - 2 : adapterPosition - 1;
                int adapterPosition2 = target.getAdapterPosition();
                int i3 = adapterPosition2 > mutableList.size() ? adapterPosition2 - 2 : adapterPosition2 - 1;
                if (i2 >= mutableList.size() && i3 >= mutableList.size()) {
                    return false;
                }
                ToolSortAdapter toolSortAdapter3 = toolSortFragment.adapter;
                Objects.requireNonNull(toolSortAdapter3);
                List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) toolSortAdapter3.getItems());
                Log.d("SmallTool-SortFragment", "Move: " + ((Tool) mutableList2.get(i2)) + ":" + i2 + " => " + ((Tool) mutableList2.get(i3)) + ":" + i3, new Object[0]);
                mutableList2.add(i3, (Tool) mutableList2.remove(i2));
                List listSubList = mutableList2.subList(0, mutableList.size());
                mutableList.clear();
                mutableList.addAll(listSubList);
                ToolBinding.setItemsWithoutNotify(recyclerView3, mutableList2, mutableList);
                RecyclerView.Adapter adapter = recyclerView3.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
            }
        });
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding3 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding3);
        itemTouchHelper.attachToRecyclerView(fragmentSmallToolSortBinding3.recyclerView);
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding4 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding4);
        fragmentSmallToolSortBinding4.recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment.onActivityCreated.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(@NotNull RecyclerView rv, @NotNull MotionEvent e) {
                View viewFindChildViewUnder;
                ToolSortAdapter toolSortAdapter2 = ToolSortFragment.this.adapter;
                Objects.requireNonNull(toolSortAdapter2);
                if (!toolSortAdapter2.getIsEditing() || e.getActionMasked() != 0 || (viewFindChildViewUnder = rv.findChildViewUnder(e.getX(), e.getY())) == null) {
                    return false;
                }
                ItemTouchHelper itemTouchHelper2 = itemTouchHelper;
                RecyclerView.ViewHolder childViewHolder = rv.getChildViewHolder(viewFindChildViewUnder);
                if (childViewHolder == null) {
                    return false;
                }
                itemTouchHelper2.startDrag(childViewHolder);
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(@NotNull RecyclerView rv, @NotNull MotionEvent e) {
            }
        });
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding5 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding5);
        final RecyclerView recyclerView3 = fragmentSmallToolSortBinding5.recyclerView;
        recyclerView3.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.xiaomi.hm.health.smalltool.ToolSortFragment$onActivityCreated$6$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                recyclerView3.getViewTreeObserver().removeOnPreDrawListener(this);
                FragmentActivity activity = this.getActivity();
                if (activity == null) {
                    return true;
                }
                activity.startPostponedEnterTransition();
                return true;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("SmallTool-SortFragment", "OnConfigurationChanged!!", new Object[0]);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.recreate();
        }
        b().loadTools();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.move));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.postponeEnterTransition();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSmallToolSortBinding fragmentSmallToolSortBindingInflate = FragmentSmallToolSortBinding.inflate(inflater, container, false);
        this.binding = fragmentSmallToolSortBindingInflate;
        Objects.requireNonNull(fragmentSmallToolSortBindingInflate);
        fragmentSmallToolSortBindingInflate.setViewmodel(b());
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding);
        fragmentSmallToolSortBinding.setHandler(new MyHandler());
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding2 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding2);
        fragmentSmallToolSortBinding2.setLifecycleOwner(getViewLifecycleOwner());
        b().setCurrentPage(1);
        FragmentSmallToolSortBinding fragmentSmallToolSortBinding3 = this.binding;
        Objects.requireNonNull(fragmentSmallToolSortBinding3);
        return fragmentSmallToolSortBinding3.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        b().setCurrentPage(0);
        super.onDestroy();
    }
}
