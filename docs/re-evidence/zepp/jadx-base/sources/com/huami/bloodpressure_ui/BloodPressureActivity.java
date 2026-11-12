package com.huami.bloodpressure_ui;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bloodpressure.service.IBloodPressureExpireService;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.BloodPressureActivity;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.base.BaseActivity;
import com.huami.bloodpressure_ui.databinding.ActivityBloodPressureBinding;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.bloodpressure_ui.tab.BloodPressurePagerFragment;
import com.huami.bloodpressure_ui.tab.BloodPressureTabFragment;
import com.huami.bloodpressure_ui.tab.BloodPressureTabViewModel;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.helper.ActivityTrackHelper;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Route({"bloodpressure/BloodPressureActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0007J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0003H\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00101\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00107\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001d\u0010@\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b>\u0010?R\u001d\u0010D\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/huami/bloodpressure_ui/BloodPressureActivity;", "Lcom/huami/bloodpressure_ui/base/BaseActivity;", "Landroidx/lifecycle/LifecycleObserver;", "", DTransferConstants.SEARCH_KEY, "", "deviceId", "y", "", "w", com.google.android.exoplayer2.text.ttml.b.r, "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResumeFunc", "Landroid/content/Intent;", "intent", "onNewIntent", "onResume", "onPause", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "a", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "tracker", "Lcom/huami/bloodpressure_ui/tab/BloodPressurePagerFragment;", "b", "Lcom/huami/bloodpressure_ui/tab/BloodPressurePagerFragment;", "yearFragment", "c", "monthFragment", GoogleApiAvailabilityLight.a, "weekFragment", "e", "dayFragment", "", "f", "J", "showTimeStamp", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "g", "Landroid/util/SparseArray;", "frgArray", "Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureBinding;", "h", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", hl.k, "()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureBinding;", "binding", "Lcom/huami/bloodpressure_ui/tab/BloodPressureTabViewModel;", "i", "Lkotlin/Lazy;", "o", "()Lcom/huami/bloodpressure_ui/tab/BloodPressureTabViewModel;", "tabViewModel", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", z.j, "l", "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "dataViewModel", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", GoogleApiAvailabilityLight.b, "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", "Lcom/huami/bloodpressure/service/IBloodPressureExpireService;", "m", "()Lcom/huami/bloodpressure/service/IBloodPressureExpireService;", "mExpireService", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureActivity extends BaseActivity implements LifecycleObserver {

    @NotNull
    public static final String ROUTE_BLOODPRESSURE = "bloodpressure/BloodPressureActivity";
    public static final /* synthetic */ KProperty<Object>[] m;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BloodPressurePagerFragment yearFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private BloodPressurePagerFragment monthFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private BloodPressurePagerFragment weekFragment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private BloodPressurePagerFragment dayFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long showTimeStamp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SparseArray<Fragment> frgArray;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabViewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataViewModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mExpireService;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ActivityTrackHelper tracker = new ActivityTrackHelper(c.a);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new BloodPressureActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityBloodPressureBinding.class)));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure/service/IBloodPressureExpireService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IBloodPressureExpireService> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBloodPressureExpireService invoke() {
            return (IBloodPressureExpireService) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureExpireService.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<IBPResearchConfig> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig invoke() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Long, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            BloodPressureAnalyticsExKt.record(new CalculationEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_V(), j));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[5];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureActivity.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureBinding;"));
        m = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.BloodPressureActivity$special$$inlined$viewModel$default$1
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
        this.tabViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureTabViewModel>() { // from class: com.huami.bloodpressure_ui.BloodPressureActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.tab.BloodPressureTabViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureTabViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureTabViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.BloodPressureActivity$special$$inlined$viewModel$default$3
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.dataViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.BloodPressureActivity$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.BloodPressureViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(BloodPressureViewModel.class), function1, objArr3);
            }
        });
        this.mResearchConfig = LazyKt__LazyJVMKt.lazy(b.a);
        this.mExpireService = LazyKt__LazyJVMKt.lazy(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(BloodPressureActivity bloodPressureActivity, DialogInterface dialogInterface, int i) {
        bloodPressureActivity.m().gotoBloodPressureHandleExpire(bloodPressureActivity);
    }

    private final void initTitle() {
        RainbowTitleBar rainbowTitleBar = k().containerTitlebar.tvTitlebar;
        rainbowTitleBar.setTitle(n().researchEnable() ? R.string.blood_pressure_research : R.string.blood_pressure);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: gz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureActivity.v(this.a, view);
            }
        });
    }

    private final ActivityBloodPressureBinding k() {
        return (ActivityBloodPressureBinding) this.binding.getValue(this, m[0]);
    }

    private final BloodPressureViewModel l() {
        return (BloodPressureViewModel) this.dataViewModel.getValue();
    }

    private final IBloodPressureExpireService m() {
        return (IBloodPressureExpireService) this.mExpireService.getValue();
    }

    private final IBPResearchConfig n() {
        return (IBPResearchConfig) this.mResearchConfig.getValue();
    }

    private final BloodPressureTabViewModel o() {
        return (BloodPressureTabViewModel) this.tabViewModel.getValue();
    }

    private final void p() {
        BloodPressurePagerFragment.Companion companion = BloodPressurePagerFragment.INSTANCE;
        TimeMode timeMode = TimeMode.DAY;
        this.dayFragment = companion.newInstance(timeMode);
        TimeMode timeMode2 = TimeMode.WEEK;
        this.weekFragment = companion.newInstance(timeMode2);
        TimeMode timeMode3 = TimeMode.MONTH;
        this.monthFragment = companion.newInstance(timeMode3);
        TimeMode timeMode4 = TimeMode.YEAR;
        this.yearFragment = companion.newInstance(timeMode4);
        SparseArray<Fragment> sparseArray = new SparseArray<>();
        sparseArray.put(timeMode.ordinal(), this.dayFragment);
        int iOrdinal = timeMode2.ordinal();
        BloodPressurePagerFragment bloodPressurePagerFragment = this.weekFragment;
        Objects.requireNonNull(bloodPressurePagerFragment);
        sparseArray.put(iOrdinal, bloodPressurePagerFragment);
        int iOrdinal2 = timeMode3.ordinal();
        BloodPressurePagerFragment bloodPressurePagerFragment2 = this.monthFragment;
        Objects.requireNonNull(bloodPressurePagerFragment2);
        sparseArray.put(iOrdinal2, bloodPressurePagerFragment2);
        int iOrdinal3 = timeMode4.ordinal();
        BloodPressurePagerFragment bloodPressurePagerFragment3 = this.yearFragment;
        Objects.requireNonNull(bloodPressurePagerFragment3);
        sparseArray.put(iOrdinal3, bloodPressurePagerFragment3);
        Unit unit = Unit.INSTANCE;
        this.frgArray = sparseArray;
        Objects.requireNonNull(sparseArray);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            getSupportFragmentManager().beginTransaction().add(R.id.container_content, sparseArray.valueAt(i)).commitNow();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container_tab, new BloodPressureTabFragment()).commitNow();
    }

    private final void q() {
        l().getLastDataTimeStamp().observe(this, new Observer() { // from class: jz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureActivity.r(this.a, (Long) obj);
            }
        });
        l().getCurrentDayTimeStamp().observe(this, new Observer() { // from class: kz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureActivity.s(this.a, (Long) obj);
            }
        });
        l().getCurrentMonthTimeStamp().observe(this, new Observer() { // from class: iz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureActivity.t(this.a, (Long) obj);
            }
        });
        l().getMDialogSharedFlow().observe(this, new Observer() { // from class: lz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureActivity.u(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BloodPressureActivity bloodPressureActivity, Long l) {
        if (l == null) {
            return;
        }
        long jLongValue = l.longValue();
        BloodPressurePagerFragment bloodPressurePagerFragment = bloodPressureActivity.dayFragment;
        if (bloodPressurePagerFragment != null) {
            bloodPressurePagerFragment.refreshPosition(jLongValue);
        }
        BloodPressurePagerFragment bloodPressurePagerFragment2 = bloodPressureActivity.weekFragment;
        Objects.requireNonNull(bloodPressurePagerFragment2);
        bloodPressurePagerFragment2.refreshPosition(jLongValue);
        BloodPressurePagerFragment bloodPressurePagerFragment3 = bloodPressureActivity.monthFragment;
        Objects.requireNonNull(bloodPressurePagerFragment3);
        bloodPressurePagerFragment3.refreshPosition(jLongValue);
        BloodPressurePagerFragment bloodPressurePagerFragment4 = bloodPressureActivity.yearFragment;
        Objects.requireNonNull(bloodPressurePagerFragment4);
        bloodPressurePagerFragment4.refreshPosition(jLongValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BloodPressureActivity bloodPressureActivity, Long l) {
        BloodPressurePagerFragment bloodPressurePagerFragment = bloodPressureActivity.dayFragment;
        if (bloodPressurePagerFragment != null) {
            bloodPressurePagerFragment.refreshPosition(l.longValue());
        }
        bloodPressureActivity.o().setTimeMode(TimeMode.DAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BloodPressureActivity bloodPressureActivity, Long l) {
        BloodPressurePagerFragment bloodPressurePagerFragment = bloodPressureActivity.monthFragment;
        Objects.requireNonNull(bloodPressurePagerFragment);
        bloodPressurePagerFragment.refreshPosition(l.longValue());
        bloodPressureActivity.o().setTimeMode(TimeMode.MONTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BloodPressureActivity bloodPressureActivity, String str) {
        bloodPressureActivity.y(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BloodPressureActivity bloodPressureActivity, View view) {
        bloodPressureActivity.finish();
    }

    private final boolean w() {
        return Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BloodPressureActivity bloodPressureActivity, TimeMode timeMode) {
        SparseArray<Fragment> sparseArray = bloodPressureActivity.frgArray;
        Objects.requireNonNull(sparseArray);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            Fragment fragmentValueAt = sparseArray.valueAt(i);
            if (timeMode.ordinal() == iKeyAt) {
                bloodPressureActivity.getSupportFragmentManager().beginTransaction().show(fragmentValueAt).commit();
            } else {
                bloodPressureActivity.getSupportFragmentManager().beginTransaction().hide(fragmentValueAt).commit();
            }
        }
    }

    private final void y(final String deviceId) {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.blood_pressure_research).setMessage(R.string.blood_pressure_expire_hint).setNegativeButton(R.string.blood_pressure_no_more, new DialogInterface.OnClickListener() { // from class: fz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureActivity.z(this.a, deviceId, dialogInterface, i);
            }
        }).setPositiveButton(R.string.blood_pressure_goto_adjust, new DialogInterface.OnClickListener() { // from class: ez
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureActivity.A(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BloodPressureActivity bloodPressureActivity, String str, DialogInterface dialogInterface, int i) {
        bloodPressureActivity.l().setDialogNoMore(str);
    }

    @Override // com.huami.bloodpressure_ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(k().getRoot());
        initTitle();
        p();
        this.showTimeStamp = getIntent().getLongExtra(BloodPressureActivityKt.getKEY_BLOOD_PRESSURE_TIMESTAMP(), System.currentTimeMillis());
        o().getCurrentTimeMode().observe(this, new Observer() { // from class: hz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureActivity.x(this.a, (TimeMode) obj);
            }
        });
        ViewExKt.setGone(k().tvJpHint, !w());
        l().loadLastData();
        q();
        getLifecycle().addObserver(this);
        l().loadExpireDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            this.showTimeStamp = intent.getLongExtra(BloodPressureActivityKt.getKEY_BLOOD_PRESSURE_TIMESTAMP(), System.currentTimeMillis());
        }
        o().setTimeMode(TimeMode.DAY);
        BloodPressurePagerFragment bloodPressurePagerFragment = this.dayFragment;
        if (bloodPressurePagerFragment != null) {
            bloodPressurePagerFragment.refreshPosition(this.showTimeStamp);
        }
        BloodPressurePagerFragment bloodPressurePagerFragment2 = this.weekFragment;
        Objects.requireNonNull(bloodPressurePagerFragment2);
        bloodPressurePagerFragment2.refreshPosition(this.showTimeStamp);
        BloodPressurePagerFragment bloodPressurePagerFragment3 = this.monthFragment;
        Objects.requireNonNull(bloodPressurePagerFragment3);
        bloodPressurePagerFragment3.refreshPosition(this.showTimeStamp);
        BloodPressurePagerFragment bloodPressurePagerFragment4 = this.yearFragment;
        Objects.requireNonNull(bloodPressurePagerFragment4);
        bloodPressurePagerFragment4.refreshPosition(this.showTimeStamp);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.tracker.onActivityPaused();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.tracker.onActivityResumed();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResumeFunc() {
        l().loadResearch();
    }
}
