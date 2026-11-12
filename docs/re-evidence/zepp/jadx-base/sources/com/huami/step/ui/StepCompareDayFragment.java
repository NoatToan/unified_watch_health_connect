package com.huami.step.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.ChartUtil;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.R;
import com.huami.step.adapter.StepTimeLineAdapter;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.ui.StepCompareDayFragment;
import com.huami.step.viewmodel.StepStageViewModel;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/step/ui/StepCompareDayFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ListView;", "listView", z.j, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/step/viewmodel/StepStageViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/step/viewmodel/StepStageViewModel;", "stageViewModel", "Lcom/huami/step/adapter/StepTimeLineAdapter;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/step/adapter/StepTimeLineAdapter;", "mAdapter", "", "c", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepCompareDayFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy stageViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/step/ui/StepCompareDayFragment$Companion;", "", "", "userId", "Lcom/huami/step/ui/StepCompareDayFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepCompareDayFragment newInstance(@NotNull String userId) {
            StepCompareDayFragment stepCompareDayFragment = new StepCompareDayFragment();
            Bundle bundle = new Bundle();
            bundle.putString(Constant.USER_ID, userId);
            Unit unit = Unit.INSTANCE;
            stepCompareDayFragment.setArguments(bundle);
            return stepCompareDayFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/step/adapter/StepTimeLineAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<StepTimeLineAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StepTimeLineAdapter invoke() {
            return new StepTimeLineAdapter(StepCompareDayFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String string;
            Bundle arguments = StepCompareDayFragment.this.getArguments();
            return (arguments == null || (string = arguments.getString(Constant.USER_ID)) == null) ? "" : string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepCompareDayFragment() {
        super(R.layout.step_fragment_chart_info_day);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepCompareDayFragment$special$$inlined$sharedViewModel$default$1
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
        this.stageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepStageViewModel>() { // from class: com.huami.step.ui.StepCompareDayFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepStageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StepStageViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StepStageViewModel.class), function0, objArr);
            }
        });
        this.mAdapter = LazyKt__LazyJVMKt.lazy(new a());
        this.userId = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final StepTimeLineAdapter d() {
        return (StepTimeLineAdapter) this.mAdapter.getValue();
    }

    private final StepStageViewModel e() {
        return (StepStageViewModel) this.stageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(StepCompareDayFragment stepCompareDayFragment, View view) {
        stepCompareDayFragment.d().updateAllDate();
        Context appContext = KoinExtKt.getAppContext();
        View view2 = stepCompareDayFragment.getView();
        stepCompareDayFragment.j(appContext, (ListView) (view2 == null ? null : view2.findViewById(R.id.list_view)));
        View view3 = stepCompareDayFragment.getView();
        ((RelativeLayout) (view3 != null ? view3.findViewById(R.id.check_all_rl) : null)).setVisibility(8);
    }

    private final void g() {
        e().setUserId(getUserId());
        e().getStageVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: jg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StepCompareDayFragment.h(this.a, (Integer) obj);
            }
        });
        e().getStageData().observe(getViewLifecycleOwner(), new Observer() { // from class: kg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StepCompareDayFragment.i(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StepCompareDayFragment stepCompareDayFragment, Integer num) {
        View view = stepCompareDayFragment.getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.step_stage_content))).setVisibility(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(StepCompareDayFragment stepCompareDayFragment, List list) {
        if (list == null || !(!list.isEmpty())) {
            View view = stepCompareDayFragment.getView();
            ((LinearLayout) (view != null ? view.findViewById(R.id.step_stage_content) : null)).setVisibility(8);
            return;
        }
        if (list.size() <= 4) {
            View view2 = stepCompareDayFragment.getView();
            ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.check_all_rl))).setVisibility(8);
        } else {
            View view3 = stepCompareDayFragment.getView();
            ((RelativeLayout) (view3 == null ? null : view3.findViewById(R.id.check_all_rl))).setVisibility(0);
        }
        stepCompareDayFragment.d().update(list);
        Context appContext = KoinExtKt.getAppContext();
        View view4 = stepCompareDayFragment.getView();
        stepCompareDayFragment.j(appContext, (ListView) (view4 != null ? view4.findViewById(R.id.list_view) : null));
    }

    private final void initView() {
        View view = getView();
        ((ListView) (view == null ? null : view.findViewById(R.id.list_view))).setAdapter((ListAdapter) d());
        View view2 = getView();
        ((RelativeLayout) (view2 != null ? view2.findViewById(R.id.check_all_rl) : null)).setOnClickListener(new View.OnClickListener() { // from class: ig7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StepCompareDayFragment.f(this.a, view3);
            }
        });
    }

    private final void j(Context context, ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        View view = adapter.getView(0, null, listView);
        view.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = (int) ((view.getMeasuredHeight() - ChartUtil.dp2px(context, 1.0f)) * adapter.getCount());
        listView.setLayoutParams(layoutParams);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        g();
    }
}
