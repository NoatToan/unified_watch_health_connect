package com.huami.sleep.napsleep.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.R;
import com.huami.sleep.baseui.SleepBaseRecyclerAdapter;
import com.huami.sleep.baseui.SleepViewHolder;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepStageInfoView;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.napsleep.ui.NapSleepDayFragment;
import com.huami.sleep.napsleep.view.SleepDayChartView;
import com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel;
import com.huami.sleep.napsleep.vo.NapSleepRecordItem;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.view.UnitTextView;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0002%\u0014B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment;", "Landroidx/fragment/app/Fragment;", "", "loadData", "o", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "sleep", "B", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/sleep/napsleep/viewmodel/NapSleepDayViewModel;", "a", "Lkotlin/Lazy;", "m", "()Lcom/huami/sleep/napsleep/viewmodel/NapSleepDayViewModel;", "viewModel", "Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment$a;", "b", "l", "()Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment$a;", "recordAdapter", "Lcom/huami/sleep/util/ViewSlideWrapper;", "c", GoogleApiAvailabilityLight.b, "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NapSleepDayFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "extra_date";

    @NotNull
    private static final String e = "user_id";

    @NotNull
    private static final String f = "NapSleepDayFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy recordAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment$Companion;", "", "", "date", "userId", "Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment;", "getInstance", "EXTRA_DATE", "Ljava/lang/String;", "EXTRA_USER_ID", "TAG", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NapSleepDayFragment getInstance(@NotNull String date, @NotNull String userId) {
            NapSleepDayFragment napSleepDayFragment = new NapSleepDayFragment();
            Bundle bundle = new Bundle();
            bundle.putString(NapSleepDayFragment.d, date);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            napSleepDayFragment.setArguments(bundle);
            return napSleepDayFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"com/huami/sleep/napsleep/ui/NapSleepDayFragment$a", "Lcom/huami/sleep/baseui/SleepBaseRecyclerAdapter;", "Lcom/huami/sleep/napsleep/vo/NapSleepRecordItem;", "Lcom/huami/sleep/baseui/SleepViewHolder;", "holder", "item", "", "position", "", "a", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends SleepBaseRecyclerAdapter<NapSleepRecordItem> {
        public a() {
            super(R.layout.item_nap_sleep_record);
        }

        @Override // com.huami.sleep.baseui.SleepBaseRecyclerAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull SleepViewHolder holder, @Nullable NapSleepRecordItem item, int position) {
            if (item == null) {
                return;
            }
            ((TextView) holder.getView(R.id.time)).setText(item.getStartDateStr() + " - " + item.getEndDateStr());
            ((TextView) holder.getView(R.id.duration)).setText(TimeShowUtilsKt.getDurationText$default(item.getDuration(), holder.itemView.getContext(), false, 2, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "date:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "index", "", "centerX", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Integer, Float, Unit> {
        public final /* synthetic */ NapSleepDayViewModel a;
        public final /* synthetic */ NapSleepDayFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NapSleepDayViewModel napSleepDayViewModel, NapSleepDayFragment napSleepDayFragment) {
            super(2);
            this.a = napSleepDayViewModel;
            this.b = napSleepDayFragment;
        }

        public final void a(int i, float f) {
            this.a.touchDown(i);
            this.b.n().slide(f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Float f) {
            a(num.intValue(), f.floatValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ NapSleepDayViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NapSleepDayViewModel napSleepDayViewModel) {
            super(0);
            this.b = napSleepDayViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NapSleepDayFragment.this.n().reset();
            View view = NapSleepDayFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.duration);
            String[] strArrM3389getSleepDuration = this.b.m3389getSleepDuration();
            ((UnitTextView) viewFindViewById).setValues((String[]) Arrays.copyOf(strArrM3389getSleepDuration, strArrM3389getSleepDuration.length));
            View view2 = NapSleepDayFragment.this.getView();
            ((TextView) (view2 == null ? null : view2.findViewById(R.id.sleepType))).setText(NapSleepDayFragment.this.getString(R.string.sporadic_sleep));
            View view3 = NapSleepDayFragment.this.getView();
            ((TextView) (view3 == null ? null : view3.findViewById(R.id.date))).setText(this.b.getDateFormatStr());
            View view4 = NapSleepDayFragment.this.getView();
            ((LinearLayout) (view4 == null ? null : view4.findViewById(R.id.selectInfoLL))).setBackground(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/napsleep/ui/NapSleepDayFragment$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<a> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a getA() {
            return new a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<ViewSlideWrapper> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper getA() {
            View view = NapSleepDayFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.selectInfoLL), ViewUtils.dp2px(NapSleepDayFragment.this.getContext(), 8.0f), NapSleepDayFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(NapSleepDayFragment.this.getContext(), 15.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NapSleepDayFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.napsleep.ui.NapSleepDayFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NapSleepDayViewModel>() { // from class: com.huami.sleep.napsleep.ui.NapSleepDayFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NapSleepDayViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(NapSleepDayViewModel.class), function0, objArr);
            }
        });
        this.recordAdapter = LazyKt__LazyJVMKt.lazy(e.a);
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(NapSleepDayFragment napSleepDayFragment, StageSleep stageSleep) {
        if (stageSleep == null) {
            return;
        }
        napSleepDayFragment.B(stageSleep);
    }

    private final void B(StageSleep sleep) {
        String string;
        int i = sleep.mode;
        if (i == 3) {
            string = getString(R.string.sleep_subview_no_wear);
        } else if (i == 4) {
            string = getString(R.string.sleep_sign_light_sleep);
        } else if (i == 5) {
            string = getString(R.string.sleep_sign_deep_sleep);
        } else if (i != 7) {
            string = i != 8 ? "" : getString(R.string.sleep_subview_rem_sleep);
        } else {
            string = getString(R.string.sleep_subview_awake_sleep);
        }
        if (string.length() == 0) {
            return;
        }
        View view = getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.selectInfoLL))).setBackgroundResource(R.drawable.slp_info_rect_tip_bg);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.sleepType))).setText(string);
        String str = TimeUtils.formatTime(getContext(), sleep.start) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatTime(getContext(), sleep.stop);
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.date))).setText(str);
        View view4 = getView();
        View viewFindViewById = view4 != null ? view4.findViewById(R.id.duration) : null;
        String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default((sleep.stop - sleep.start) + 1, requireContext(), false, false, 6, null);
        ((UnitTextView) viewFindViewById).setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
    }

    private final a l() {
        return (a) this.recordAdapter.getValue();
    }

    private final void loadData() {
        String string;
        String string2;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(d)) == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string2 = arguments2.getString("user_id")) != null) {
            str = string2;
        }
        HMLog.verbose(f, new b(string));
        NapSleepDayViewModel napSleepDayViewModelM = m();
        napSleepDayViewModelM.setDate(string);
        napSleepDayViewModelM.setUserId(str);
        KoinExtKt.getSleepDataManager().startAnalysis(str, string);
        KoinExtKt.getSleepDayPageChangeListener().onNapSelected(string);
    }

    private final NapSleepDayViewModel m() {
        return (NapSleepDayViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper n() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void o() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.rcv_record));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        recyclerView.setAdapter(l());
    }

    private final void p() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final NapSleepDayViewModel napSleepDayViewModelM = m();
        napSleepDayViewModelM.getDateValue().observe(viewLifecycleOwner, new Observer() { // from class: ec5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.w(this.a, (String) obj);
            }
        });
        napSleepDayViewModelM.getSleepDuration().observe(viewLifecycleOwner, new Observer() { // from class: ic5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.x(this.a, (String[]) obj);
            }
        });
        napSleepDayViewModelM.getHasNapData().observe(viewLifecycleOwner, new Observer() { // from class: bc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.y(this.a, (Boolean) obj);
            }
        });
        napSleepDayViewModelM.getSleepChartData().observe(viewLifecycleOwner, new Observer() { // from class: zb5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.z(this.a, napSleepDayViewModelM, (ChartDataList) obj);
            }
        });
        napSleepDayViewModelM.getTouchDownDuration().observe(viewLifecycleOwner, new Observer() { // from class: ac5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.A(this.a, (StageSleep) obj);
            }
        });
        napSleepDayViewModelM.getStartDateString().observe(viewLifecycleOwner, new Observer() { // from class: fc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.q(this.a, (String) obj);
            }
        });
        napSleepDayViewModelM.getEndDateString().observe(viewLifecycleOwner, new Observer() { // from class: dc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.r(this.a, (String) obj);
            }
        });
        napSleepDayViewModelM.getSleepDurationParam().observe(viewLifecycleOwner, new Observer() { // from class: yb5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.s(this.a, (SleepStageDurationInfo) obj);
            }
        });
        napSleepDayViewModelM.getSleepRecord().observe(viewLifecycleOwner, new Observer() { // from class: hc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.t(this.a, (List) obj);
            }
        });
        napSleepDayViewModelM.getDeepRation().observe(viewLifecycleOwner, new Observer() { // from class: gc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.u(this.a, (String) obj);
            }
        });
        napSleepDayViewModelM.getLightRation().observe(viewLifecycleOwner, new Observer() { // from class: cc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NapSleepDayFragment.v(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(NapSleepDayFragment napSleepDayFragment, String str) {
        View view = napSleepDayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.start_date))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(NapSleepDayFragment napSleepDayFragment, String str) {
        View view = napSleepDayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.end_date))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(NapSleepDayFragment napSleepDayFragment, SleepStageDurationInfo sleepStageDurationInfo) {
        View view = napSleepDayFragment.getView();
        ((SleepStageInfoView) (view == null ? null : view.findViewById(R.id.sleep_duration))).update(sleepStageDurationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(NapSleepDayFragment napSleepDayFragment, List list) {
        napSleepDayFragment.l().update(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(NapSleepDayFragment napSleepDayFragment, String str) {
        View view = napSleepDayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.nap_deep_ratio))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(NapSleepDayFragment napSleepDayFragment, String str) {
        View view = napSleepDayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.nap_light_ratio))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(NapSleepDayFragment napSleepDayFragment, String str) {
        View view = napSleepDayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.date))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(NapSleepDayFragment napSleepDayFragment, String[] strArr) {
        View view = napSleepDayFragment.getView();
        ((UnitTextView) (view == null ? null : view.findViewById(R.id.duration))).setValues((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(NapSleepDayFragment napSleepDayFragment, Boolean bool) {
        View view = napSleepDayFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.line), bool.booleanValue());
        View view2 = napSleepDayFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.sleep_duration), bool.booleanValue());
        View view3 = napSleepDayFragment.getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(R.id.rationLL) : null, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(NapSleepDayFragment napSleepDayFragment, NapSleepDayViewModel napSleepDayViewModel, ChartDataList chartDataList) {
        if (chartDataList == null) {
            return;
        }
        View view = napSleepDayFragment.getView();
        ((SleepDayChartView) (view == null ? null : view.findViewById(R.id.day_chart))).refreshChart(chartDataList, new c(napSleepDayViewModel, napSleepDayFragment), napSleepDayFragment.new d(napSleepDayViewModel));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nap_sleep_day, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        o();
        p();
        loadData();
    }
}
