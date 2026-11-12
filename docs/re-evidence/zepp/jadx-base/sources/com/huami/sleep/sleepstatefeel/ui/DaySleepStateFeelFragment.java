package com.huami.sleep.sleepstatefeel.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment;
import com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.view.NestRecyclerView;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\u000f\u001a\u00020\u0002R\u001c\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001e¨\u0006&"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/DaySleepStateFeelFragment;", "Landroidx/fragment/app/Fragment;", "", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "initView", "", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Lcom/huami/sleep/sleepstatefeel/viewmodel/SleepStateFeelViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/sleep/sleepstatefeel/viewmodel/SleepStateFeelViewModel;", "viewModel", "Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter;", "g", "()Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter;", "mStateAdapter", GoogleApiAvailabilityLight.a, "f", "mFeelAdapter", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepStateFeelFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_DATE = "dateKey";

    @NotNull
    public static final String KEY_USER_ID = "userId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepBehaviourFeelFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStateAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFeelAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/DaySleepStateFeelFragment$Companion;", "", "", "userId", "date", "Lcom/huami/sleep/sleepstatefeel/ui/DaySleepStateFeelFragment;", "newInstance", "KEY_DATE", "Ljava/lang/String;", "KEY_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DaySleepStateFeelFragment newInstance(@NotNull String userId, @NotNull String date) {
            DaySleepStateFeelFragment daySleepStateFeelFragment = new DaySleepStateFeelFragment();
            Bundle bundle = new Bundle();
            bundle.putString("dateKey", date);
            bundle.putString("userId", userId);
            daySleepStateFeelFragment.setArguments(bundle);
            return daySleepStateFeelFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "observe 睡前状态： " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SleepBehFeelAdapter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepBehFeelAdapter invoke() {
            return new SleepBehFeelAdapter(DaySleepStateFeelFragment.this.getViewModel().getMSleepSleepData());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SleepBehFeelAdapter> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepBehFeelAdapter invoke() {
            return new SleepBehFeelAdapter(DaySleepStateFeelFragment.this.getViewModel().getMSleepBehaviourData());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DaySleepStateFeelFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepStateFeelViewModel>() { // from class: com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepStateFeelViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepStateFeelViewModel.class), function0, objArr);
            }
        });
        this.mStateAdapter = LazyKt__LazyJVMKt.lazy(new c());
        this.mFeelAdapter = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void c() {
        String string;
        String string2;
        SleepStateFeelViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string2 = arguments.getString("userId")) != null) {
            str = string2;
        }
        viewModel.setUserId(str);
        viewModel.getEventSleepFeelingChange().observe(getViewLifecycleOwner(), new Observer() { // from class: g41
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DaySleepStateFeelFragment.d(this.a, (String) obj);
            }
        });
        viewModel.getEventSleepStateChange().observe(getViewLifecycleOwner(), new Observer() { // from class: h41
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DaySleepStateFeelFragment.e(this.a, (ArrayList) obj);
            }
        });
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("dateKey")) == null) {
            return;
        }
        viewModel.getDateLiveData().setValue(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DaySleepStateFeelFragment daySleepStateFeelFragment, String str) {
        daySleepStateFeelFragment.f().updateFeeling(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DaySleepStateFeelFragment daySleepStateFeelFragment, ArrayList arrayList) {
        HMLog.info(daySleepStateFeelFragment.getMTag(), new a(arrayList));
        daySleepStateFeelFragment.g().updateState(arrayList);
    }

    private final SleepBehFeelAdapter f() {
        return (SleepBehFeelAdapter) this.mFeelAdapter.getValue();
    }

    private final SleepBehFeelAdapter g() {
        return (SleepBehFeelAdapter) this.mStateAdapter.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @NotNull
    public final SleepStateFeelViewModel getViewModel() {
        return (SleepStateFeelViewModel) this.viewModel.getValue();
    }

    public final void initView() {
        View view = getView();
        ((NestRecyclerView) (view == null ? null : view.findViewById(R.id.stateListView))).setAdapter(g());
        View view2 = getView();
        ((NestRecyclerView) (view2 == null ? null : view2.findViewById(R.id.feelListView))).setAdapter(f());
        View view3 = getView();
        ((NestRecyclerView) (view3 == null ? null : view3.findViewById(R.id.stateListView))).setIntercept(true);
        View view4 = getView();
        ((NestRecyclerView) (view4 == null ? null : view4.findViewById(R.id.feelListView))).setIntercept(true);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 0);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.slp_divider));
        View view5 = getView();
        ((NestRecyclerView) (view5 == null ? null : view5.findViewById(R.id.stateListView))).addItemDecoration(dividerItemDecoration);
        View view6 = getView();
        ((NestRecyclerView) (view6 != null ? view6.findViewById(R.id.feelListView) : null)).addItemDecoration(dividerItemDecoration);
        f().setListener(new SleepBehFeelAdapter.OnItemClickListener() { // from class: com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment.initView.1
            @Override // com.huami.sleep.sleepstatefeel.ui.SleepBehFeelAdapter.OnItemClickListener
            public void onSelected(@NotNull ArrayList<String> selectedList) {
                SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_MOOD_CLICK);
                DaySleepStateFeelFragment.this.getViewModel().saveSelectFeeling(selectedList.size() == 0 ? "0" : selectedList.get(0));
            }
        });
        g().setListener(new SleepBehFeelAdapter.OnItemClickListener() { // from class: com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment.initView.2

            /* JADX INFO: renamed from: com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment$initView$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ArrayList<String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ArrayList<String> arrayList) {
                    super(0);
                    this.a = arrayList;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "睡前状态： " + this.a;
                }
            }

            @Override // com.huami.sleep.sleepstatefeel.ui.SleepBehFeelAdapter.OnItemClickListener
            public void onSelected(@NotNull ArrayList<String> selectedList) {
                HMLog.info(DaySleepStateFeelFragment.this.getMTag(), new a(selectedList));
                SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_STATUS_CLICK);
                DaySleepStateFeelFragment.this.getViewModel().saveSelectState(selectedList);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_state_feel_layout, container, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c();
    }
}
