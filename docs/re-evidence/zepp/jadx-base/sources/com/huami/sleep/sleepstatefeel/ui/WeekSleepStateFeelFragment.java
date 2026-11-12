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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleep.R;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.sleepstatefeel.ui.WeekSleepStateFeelFragment;
import com.huami.sleep.sleepstatefeel.view.SleepStateFeelChart;
import com.huami.sleep.sleepstatefeel.viewmodel.WeekSleepStateFeelViewModel;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001c\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/WeekSleepStateFeelFragment;", "Landroidx/fragment/app/Fragment;", "", "c", "", "", "g", "()[Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Lcom/huami/sleep/sleepstatefeel/viewmodel/WeekSleepStateFeelViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/sleep/sleepstatefeel/viewmodel/WeekSleepStateFeelViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class WeekSleepStateFeelFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_END_TIME = "end_time";

    @NotNull
    public static final String KEY_START_TIME = "start_time";

    @NotNull
    public static final String KEY_USER_ID = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepBehaviourFeelFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/WeekSleepStateFeelFragment$Companion;", "", "", "userId", "", "time", "Lcom/huami/sleep/sleepstatefeel/ui/WeekSleepStateFeelFragment;", "getInstance", "KEY_END_TIME", "Ljava/lang/String;", "KEY_START_TIME", "KEY_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeekSleepStateFeelFragment getInstance(@NotNull String userId, long time) {
            WeekSleepStateFeelFragment weekSleepStateFeelFragment = new WeekSleepStateFeelFragment();
            Bundle bundle = new Bundle();
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            bundle.putLong("start_time", sleepTimeUtil.getFirstDayOfWeekTime(time));
            bundle.putLong("end_time", sleepTimeUtil.getLastDayOfWeekTime(time));
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            weekSleepStateFeelFragment.setArguments(bundle);
            return weekSleepStateFeelFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeekSleepStateFeelFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepstatefeel.ui.WeekSleepStateFeelFragment$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeekSleepStateFeelViewModel>() { // from class: com.huami.sleep.sleepstatefeel.ui.WeekSleepStateFeelFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepstatefeel.viewmodel.WeekSleepStateFeelViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WeekSleepStateFeelViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WeekSleepStateFeelViewModel.class), function0, objArr);
            }
        });
    }

    private final void c() {
        WeekSleepStateFeelViewModel weekSleepStateFeelViewModelF = f();
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong("start_time");
            long j2 = arguments.getLong("end_time");
            String string = arguments.getString("user_id");
            if (string == null) {
                string = "";
            }
            weekSleepStateFeelViewModelF.init(j, j2, string);
        }
        weekSleepStateFeelViewModelF.getAllSleepFeeling().observe(getViewLifecycleOwner(), new Observer() { // from class: vq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekSleepStateFeelFragment.d(this.a, (ArrayList) obj);
            }
        });
        weekSleepStateFeelViewModelF.getAllSleepState().observe(getViewLifecycleOwner(), new Observer() { // from class: wq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekSleepStateFeelFragment.e(this.a, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WeekSleepStateFeelFragment weekSleepStateFeelFragment, ArrayList arrayList) {
        HMLog.i(weekSleepStateFeelFragment.getMTag(), arrayList, new Object[0]);
        View view = weekSleepStateFeelFragment.getView();
        ((SleepStateFeelChart) (view == null ? null : view.findViewById(R.id.sleepFeelView))).setData(arrayList, DataConstant.TYPE_SLEEP_FEEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WeekSleepStateFeelFragment weekSleepStateFeelFragment, ArrayList arrayList) {
        HMLog.i(weekSleepStateFeelFragment.getMTag(), arrayList, new Object[0]);
        View view = weekSleepStateFeelFragment.getView();
        ((SleepStateFeelChart) (view == null ? null : view.findViewById(R.id.sleepStateView))).setData(arrayList, DataConstant.TYPE_SLEEP_STATE);
    }

    private final WeekSleepStateFeelViewModel f() {
        return (WeekSleepStateFeelViewModel) this.mViewModel.getValue();
    }

    private final String[] g() {
        boolean zStartsWith$default = m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
        Object[] stringArray = requireContext().getResources().getStringArray(R.array.sleep_weeks);
        if (zStartsWith$default) {
            List mutableList = ArraysKt___ArraysKt.toMutableList(stringArray);
            mutableList.add(0, ArraysKt.last(stringArray));
            CollectionsKt___CollectionsKt.dropLast(mutableList, 1);
            Unit unit = Unit.INSTANCE;
            stringArray = mutableList.toArray(new String[0]);
            Objects.requireNonNull(stringArray, "null cannot be cast to non-null type kotlin.Array<T>");
        }
        return (String[]) stringArray;
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
        View viewInflate = inflater.inflate(R.layout.fragment_week_state_feel_layout, container, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c();
        View view2 = getView();
        ((SleepStateFeelChart) (view2 == null ? null : view2.findViewById(R.id.sleepFeelView))).setXAxis(g());
        View view3 = getView();
        ((SleepStateFeelChart) (view3 != null ? view3.findViewById(R.id.sleepStateView) : null)).setXAxis(g());
    }
}
