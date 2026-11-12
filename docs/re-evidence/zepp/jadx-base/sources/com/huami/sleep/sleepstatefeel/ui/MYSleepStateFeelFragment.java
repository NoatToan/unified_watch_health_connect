package com.huami.sleep.sleepstatefeel.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.sleepstatefeel.ui.MYSleepStateFeelFragment;
import com.huami.sleep.sleepstatefeel.viewmodel.MonthStateFeelViewModel;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001c\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/MYSleepStateFeelFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Lcom/huami/sleep/sleepstatefeel/ui/StateFeelRatioAdapter;", "b", "Lcom/huami/sleep/sleepstatefeel/ui/StateFeelRatioAdapter;", "mStateAdapter", "mFeelAdapter", "Lcom/huami/sleep/sleepstatefeel/viewmodel/MonthStateFeelViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "f", "()Lcom/huami/sleep/sleepstatefeel/viewmodel/MonthStateFeelViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class MYSleepStateFeelFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "start_time";

    @NotNull
    private static final String f = "end_time";

    @NotNull
    private static final String g = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepBehaviourFeelFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final StateFeelRatioAdapter mStateAdapter = new StateFeelRatioAdapter(new ArrayList());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StateFeelRatioAdapter mFeelAdapter = new StateFeelRatioAdapter(new ArrayList());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/MYSleepStateFeelFragment$Companion;", "", "", "userId", "", "startTime", "endTime", "Lcom/huami/sleep/sleepstatefeel/ui/MYSleepStateFeelFragment;", "getInstance", "KEY_END_TIME", "Ljava/lang/String;", "KEY_START_TIME", "KEY_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MYSleepStateFeelFragment getInstance(@NotNull String userId, long startTime, long endTime) {
            MYSleepStateFeelFragment mYSleepStateFeelFragment = new MYSleepStateFeelFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("start_time", startTime);
            bundle.putLong("end_time", endTime);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            mYSleepStateFeelFragment.setArguments(bundle);
            return mYSleepStateFeelFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MYSleepStateFeelFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepstatefeel.ui.MYSleepStateFeelFragment$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MonthStateFeelViewModel>() { // from class: com.huami.sleep.sleepstatefeel.ui.MYSleepStateFeelFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepstatefeel.viewmodel.MonthStateFeelViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MonthStateFeelViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MonthStateFeelViewModel.class), function0, objArr);
            }
        });
    }

    private final void c() {
        MonthStateFeelViewModel monthStateFeelViewModelF = f();
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong("start_time");
            long j2 = arguments.getLong("end_time");
            String string = arguments.getString("user_id");
            if (string == null) {
                string = "";
            }
            monthStateFeelViewModelF.init(j, j2, string);
        }
        monthStateFeelViewModelF.getAllSleepFeeling().observe(getViewLifecycleOwner(), new Observer() { // from class: au4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MYSleepStateFeelFragment.d(this.a, (ArrayList) obj);
            }
        });
        monthStateFeelViewModelF.getAllSleepState().observe(getViewLifecycleOwner(), new Observer() { // from class: bu4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MYSleepStateFeelFragment.e(this.a, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MYSleepStateFeelFragment mYSleepStateFeelFragment, ArrayList arrayList) {
        mYSleepStateFeelFragment.mFeelAdapter.updateData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MYSleepStateFeelFragment mYSleepStateFeelFragment, ArrayList arrayList) {
        mYSleepStateFeelFragment.mStateAdapter.updateData(arrayList);
    }

    private final MonthStateFeelViewModel f() {
        return (MonthStateFeelViewModel) this.mViewModel.getValue();
    }

    private final void initView() {
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.stateListView))).setAdapter(this.mStateAdapter);
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.feelListView) : null)).setAdapter(this.mFeelAdapter);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.slp_fragment_month_state_feel_layout, container, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        c();
    }
}
