package com.xiaomi.hm.health.training.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.function.Function;
import com.xiaomi.hm.health.training.entity.FilterItems;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.adapter.ActionOrYogaTrainingListAdapter;
import com.xiaomi.hm.health.training.ui.adapter.FilterOptionListAdapter;
import com.xiaomi.hm.health.training.ui.decoration.DividerDecoration;
import com.xiaomi.hm.health.training.ui.decoration.SpacingDecoration;
import com.xiaomi.hm.health.training.ui.viewmodel.ActionOrYogaTrainingListViewModel;
import com.xiaomi.hm.health.training.ui.widget.CustomSmartRefreshLayout;
import com.xiaomi.hm.health.training.ui.widget.CustomSpinnerTab;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class ActionTrainingListFragment extends Fragment {
    private static final int h = 4;
    private static final long i = 200;

    @Inject
    public ViewModelProvider.Factory a;

    @Inject
    public NavigationController b;
    private ActionOrYogaTrainingListViewModel c;
    private g d;
    private ActionOrYogaTrainingListAdapter e;
    private boolean f = false;
    private FilterOptionListAdapter g;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ActionTrainingListFragment.this.d.g.setVisibility(0);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ActionTrainingListFragment.this.d.f.setVisibility(0);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionTrainingListFragment.this.d.g.setVisibility(8);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionTrainingListFragment.this.d.f.setVisibility(8);
        }
    }

    public class e extends SimpleMultiPurposeListener {
        public e() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
        public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
            if (refreshState == RefreshState.RefreshFinish && refreshState2 == RefreshState.None) {
                ActionTrainingListFragment.this.d.d.setOnMultiPurposeListener((OnMultiPurposeListener) null);
                ActionTrainingListFragment.this.d.d.setReboundDuration(250);
                ActionTrainingListFragment.this.d.d.autoRefresh(0);
            }
        }
    }

    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class g {
        public CustomSpinnerTab a;
        public CustomSpinnerTab b;
        public CustomSpinnerTab c;
        public CustomSmartRefreshLayout d;
        public RecyclerView e;
        public View f;
        public View g;
        public RecyclerView h;

        public g(View view) {
            this.a = (CustomSpinnerTab) view.findViewById(R.id.difficulty_button);
            this.b = (CustomSpinnerTab) view.findViewById(R.id.body_part_button);
            this.c = (CustomSpinnerTab) view.findViewById(R.id.instrument_button);
            this.d = (CustomSmartRefreshLayout) view.findViewById(R.id.refresh_layout);
            this.e = (RecyclerView) view.findViewById(R.id.training_list);
            this.f = view.findViewById(R.id.mask_layer);
            this.g = view.findViewById(R.id.options_list_container);
            this.h = (RecyclerView) view.findViewById(R.id.options_list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        final List<String> instrumentNameList = this.c.getInstrumentNameList();
        M(this.d.c, instrumentNameList, this.c.getSelectedInstrument().getValue(), new Function() { // from class: x5
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return this.a.z(instrumentNameList, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C(List list, Integer num) {
        return Boolean.valueOf(this.c.setSelectedDifficulty((FilterItems.Difficulty) list.get(num.intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        final List<FilterItems.Difficulty> difficultyList = this.c.getDifficultyList();
        M(this.d.a, this.c.getDifficultyNameList(), this.c.getSelectedDifficultyName(), new Function() { // from class: v5
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return this.a.C(difficultyList, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean E(List list, Integer num) {
        return Boolean.valueOf(this.c.setSelectedBodypart((String) list.get(num.intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.c.retry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ActionOrYogaTrainingListAdapter actionOrYogaTrainingListAdapter, View view, int i2, ActionOrYogaTraining actionOrYogaTraining) {
        this.b.navigateToActionOrYogaTrainingDetail(view.getContext(), actionOrYogaTraining.id);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_COURSES_CONTENT_C).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(actionOrYogaTraining.id)).addExtra("Position", String.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str) {
        if (str != null) {
            this.d.c.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(String str) {
        if (str != null) {
            this.d.b.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(FilterItems.Difficulty difficulty) {
        if (difficulty != null) {
            this.d.a.setText(difficulty.name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Function function, BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        q();
        if (((Boolean) function.apply(Integer.valueOf(i2))).booleanValue()) {
            N();
        }
    }

    private void L() {
        if (this.f) {
            return;
        }
        LiveData<PagedList<ActionOrYogaTraining>> pagedList = this.c.getPagedList();
        final ActionOrYogaTrainingListAdapter actionOrYogaTrainingListAdapter = this.e;
        Objects.requireNonNull(actionOrYogaTrainingListAdapter);
        pagedList.observe(this, new Observer() { // from class: d6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                actionOrYogaTrainingListAdapter.submitList((PagedList) obj);
            }
        });
        this.f = true;
        this.d.d.autoRefresh(200);
    }

    private void M(@NonNull CustomSpinnerTab customSpinnerTab, @NonNull List<String> list, @Nullable String str, @NonNull final Function<Integer, Boolean> function) {
        if (customSpinnerTab.isSelected()) {
            q();
            return;
        }
        CustomSpinnerTab customSpinnerTab2 = this.d.a;
        customSpinnerTab2.setSelected(customSpinnerTab == customSpinnerTab2);
        CustomSpinnerTab customSpinnerTab3 = this.d.b;
        customSpinnerTab3.setSelected(customSpinnerTab == customSpinnerTab3);
        CustomSpinnerTab customSpinnerTab4 = this.d.c;
        customSpinnerTab4.setSelected(customSpinnerTab == customSpinnerTab4);
        O(list, str, new BaseQuickAdapter.OnItemClickListener() { // from class: t5
            @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                this.a.K(function, baseQuickAdapter, view, i2);
            }
        });
    }

    private void N() {
        if (this.d.d.getState() == RefreshState.None) {
            this.d.d.autoRefresh(0);
            return;
        }
        this.d.d.setReboundDuration(0);
        this.d.d.finishRefresh(0);
        this.d.d.setOnMultiPurposeListener((OnMultiPurposeListener) new e());
    }

    private void O(List<String> list, String str, BaseQuickAdapter.OnItemClickListener onItemClickListener) {
        this.g.setNewData(list);
        this.g.setOnItemClickListener(onItemClickListener);
        this.g.setItemSelected(str);
        this.d.g.setPivotY(0.0f);
        this.d.g.animate().scaleY(1.0f).setDuration(200L).setListener(new a());
        this.d.f.animate().alpha(1.0f).setDuration(200L).setListener(new b());
        int size = list.size();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.tr_training_filter_option_item_height);
        int i2 = size <= 4 ? dimensionPixelOffset * size : (int) (dimensionPixelOffset * 4.5f);
        ViewGroup.LayoutParams layoutParams = this.d.g.getLayoutParams();
        layoutParams.height = i2;
        this.d.g.setLayoutParams(layoutParams);
    }

    private void initViewModel() {
        ActionOrYogaTrainingListViewModel actionOrYogaTrainingListViewModel = (ActionOrYogaTrainingListViewModel) ViewModelProviders.of(this, this.a).get(ActionOrYogaTrainingListViewModel.class);
        this.c = actionOrYogaTrainingListViewModel;
        actionOrYogaTrainingListViewModel.getSelectedInstrument().observe(this, new Observer() { // from class: i6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.H((String) obj);
            }
        });
        this.c.getSelectedBodypart().observe(this, new Observer() { // from class: h6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.I((String) obj);
            }
        });
        this.c.getSelectedDifficulty().observe(this, new Observer() { // from class: g6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.J((FilterItems.Difficulty) obj);
            }
        });
    }

    private void q() {
        this.d.g.animate().scaleY(0.0f).setDuration(200L).setListener(new c());
        this.d.f.animate().alpha(0.0f).setDuration(200L).setListener(new d());
        this.d.a.setSelected(false);
        this.d.b.setSelected(false);
        this.d.c.setSelected(false);
    }

    private void r() {
        if (getContext() == null) {
            return;
        }
        this.d.h.addItemDecoration(new DividerDecoration(ContextCompat.getColor(getContext(), R.color.black20), getResources().getDimensionPixelSize(R.dimen.divider), getResources().getDimensionPixelOffset(R.dimen.common_item_padding)));
        this.d.h.setLayoutManager(new LinearLayoutManager(getContext()));
        FilterOptionListAdapter filterOptionListAdapter = new FilterOptionListAdapter();
        this.g = filterOptionListAdapter;
        this.d.h.setAdapter(filterOptionListAdapter);
    }

    private void s() {
        this.d.d.setEnableRefresh(true);
        this.d.d.setEnableLoadmore(false);
        this.d.d.setOnRefreshListener(new OnRefreshListener() { // from class: u5
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                this.a.w(refreshLayout);
            }
        });
        this.d.d.autoRefresh(200);
        this.c.getRefreshState().observe(this, new Observer() { // from class: f6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x((Resource) obj);
            }
        });
    }

    private void t() {
        this.d.a.setText(getString(R.string.not_limit_difficulity));
        this.d.b.setText(getString(R.string.not_limit_body_part));
        this.d.c.setText(getString(R.string.not_limit_instrument));
        this.d.a.setOnClickListener(new View.OnClickListener() { // from class: s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.D(view);
            }
        });
        this.d.b.setOnClickListener(new View.OnClickListener() { // from class: a6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        });
        this.d.c.setOnClickListener(new View.OnClickListener() { // from class: b6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        this.d.f.setOnClickListener(new View.OnClickListener() { // from class: c6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.B(view);
            }
        });
    }

    private void u() {
        this.d.e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.d.e.addItemDecoration(new SpacingDecoration(0, (int) ViewUtils.dp2px(this.d.e.getContext(), 8.0f), false));
        ActionOrYogaTrainingListAdapter actionOrYogaTrainingListAdapter = new ActionOrYogaTrainingListAdapter(new Runnable() { // from class: z5
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F();
            }
        });
        this.e = actionOrYogaTrainingListAdapter;
        this.d.e.setAdapter(actionOrYogaTrainingListAdapter);
        this.d.e.setHasFixedSize(true);
        this.e.setOnItemClickListener(new ActionOrYogaTrainingListAdapter.OnItemClickListener() { // from class: y5
            @Override // com.xiaomi.hm.health.training.ui.adapter.ActionOrYogaTrainingListAdapter.OnItemClickListener
            public final void onItemClick(ActionOrYogaTrainingListAdapter actionOrYogaTrainingListAdapter2, View view, int i2, ActionOrYogaTraining actionOrYogaTraining) {
                this.a.G(actionOrYogaTrainingListAdapter2, view, i2, actionOrYogaTraining);
            }
        });
        LiveData<Resource<Void>> networkState = this.c.getNetworkState();
        final ActionOrYogaTrainingListAdapter actionOrYogaTrainingListAdapter2 = this.e;
        Objects.requireNonNull(actionOrYogaTrainingListAdapter2);
        networkState.observe(this, new Observer() { // from class: e6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                actionOrYogaTrainingListAdapter2.setNetworkState((Resource) obj);
            }
        });
    }

    private void v() {
        this.a = TrainingInjection.get().getViewModelFactory();
        this.b = TrainingInjection.get().getNavigationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(RefreshLayout refreshLayout) {
        this.c.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Resource resource) {
        if (resource != null) {
            int i2 = f.a[resource.getStatus().ordinal()];
            if (i2 == 1) {
                this.d.d.startRefreshingAnim();
            } else if (i2 == 2) {
                this.d.d.finishRefresh(true);
            } else {
                if (i2 != 3) {
                    return;
                }
                this.d.d.finishRefresh(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        final List<String> bodyPartNameList = this.c.getBodyPartNameList();
        M(this.d.b, bodyPartNameList, this.c.getSelectedBodypart().getValue(), new Function() { // from class: w5
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return this.a.E(bodyPartNameList, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean z(List list, Integer num) {
        return Boolean.valueOf(this.c.setSelectedInstrument((String) list.get(num.intValue())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUserVisibleHint()) {
            L();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        v();
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.tr_fragment_action_training_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d = new g(view);
        u();
        s();
        r();
        t();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_COURSES_V));
            if (getView() != null) {
                L();
            }
        }
    }
}
