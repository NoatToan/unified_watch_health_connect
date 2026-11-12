package com.huami.bloodpressure_ui.add;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.bloodpressure_ui.BloodPressureActivityKt;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.add.BloodPressureAddActivity;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.base.BaseActivity;
import com.huami.bloodpressure_ui.databinding.ActivityBloodPressureAddBinding;
import com.huami.bloodpressure_ui.ext.ContextExKt;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.bloodpressure_ui.view.DigitsTextWatcher;
import com.huami.bloodpressure_ui.view.TimePickerDialog;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.util.net.NetUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
@Route({BloodPressureAddActivity.ROUTE_BLOODPRESSUREADD})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/bloodpressure_ui/add/BloodPressureAddActivity;", "Lcom/huami/bloodpressure_ui/base/BaseActivity;", "", "observeData", "initView", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "m", "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "ev", "dispatchTouchEvent", "Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureAddBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureAddBinding;", "binding", "Lcom/huami/bloodpressure_ui/add/BloodPressureAddViewModel;", "b", "Lkotlin/Lazy;", z.j, "()Lcom/huami/bloodpressure_ui/add/BloodPressureAddViewModel;", "model", "", "c", LogUtil.I, "intInputType", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, hl.k, "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "saveLoadingDialog", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureAddActivity extends BaseActivity {

    @NotNull
    public static final String ROUTE_BLOODPRESSUREADD = "bloodpressure/BloodPressureAddActivity";
    public static final /* synthetic */ KProperty<Object>[] e;
    private static final String f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new BloodPressureAddActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityBloodPressureAddBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int intInputType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BloodPressureAddActivity.this.j().setTimePickerMode(TimePickerDialog.Mode.DATE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BloodPressureAddActivity.this.j().setTimePickerMode(TimePickerDialog.Mode.TIME);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            BloodPressureAddActivity.this.j().inputSbp(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "text", "", "selection", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<String, Integer, Unit> {
        public d() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
            BloodPressureAddActivity.this.i().editText.setText(str);
            BloodPressureAddActivity.this.i().editText.setSelection(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<String, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            BloodPressureAddActivity.this.j().inputDbp(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "text", "", "selection", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<String, Integer, Unit> {
        public f() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
            BloodPressureAddActivity.this.i().extraEditText.setText(str);
            BloodPressureAddActivity.this.i().extraEditText.setSelection(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_SAVE_C()));
            if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                BloodPressureAddActivity.this.j().postData();
            } else {
                IconToast.showError(BloodPressureAddActivity.this, R.string.no_network_connection);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<LoadingDialog> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            LoadingDialog loadingDialog = new LoadingDialog(BloodPressureAddActivity.this);
            loadingDialog.setMessage(BloodPressureAddActivity.this.getString(R.string.blood_pressure_saving));
            return loadingDialog;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureAddActivity.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureAddBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
        f = BloodPressureAddActivity.class.getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureAddActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.add.BloodPressureAddActivity$special$$inlined$viewModel$default$1
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
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureAddViewModel>() { // from class: com.huami.bloodpressure_ui.add.BloodPressureAddActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.add.BloodPressureAddViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureAddViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureAddViewModel.class), function0, objArr);
            }
        });
        this.intInputType = 2;
        this.saveLoadingDialog = LazyKt__LazyJVMKt.lazy(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityBloodPressureAddBinding i() {
        return (ActivityBloodPressureAddBinding) this.binding.getValue(this, e[0]);
    }

    private final void initTitle() {
        RainbowTitleBar rainbowTitleBar = i().containerTitlebar.tvTitlebar;
        rainbowTitleBar.setTitle(R.string.blood_pressure_add_data);
        rainbowTitleBar.setTitleTextColor(ContextExKt.color(rainbowTitleBar.getContext(), R.color.s1));
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: mz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureAddActivity.l(this.a, view);
            }
        });
    }

    private final void initView() {
        ViewExKt.setOnDebounceClickListener(i().dateItem, new a());
        ViewExKt.setOnDebounceClickListener(i().timeItem, new b());
        i().editText.setInputType(this.intInputType);
        i().editText.addTextChangedListener(new DigitsTextWatcher(new c(), new d(), 0));
        i().extraEditText.setInputType(this.intInputType);
        i().extraEditText.addTextChangedListener(new DigitsTextWatcher(new e(), new f(), 0));
        ViewExKt.setOnDebounceClickListener(i().save, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodPressureAddViewModel j() {
        return (BloodPressureAddViewModel) this.model.getValue();
    }

    private final LoadingDialog k() {
        return (LoadingDialog) this.saveLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureAddActivity bloodPressureAddActivity, View view) {
        bloodPressureAddActivity.finish();
    }

    private final boolean m(View v, MotionEvent event) {
        if (!(v instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        v.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        EditText editText = (EditText) v;
        return event.getX() <= ((float) i) || event.getX() >= ((float) (editText.getWidth() + i)) || event.getY() <= ((float) i2) || event.getY() >= ((float) (editText.getHeight() + i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BloodPressureAddActivity bloodPressureAddActivity, final BloodPressureAddViewModel bloodPressureAddViewModel, TimePickerDialog.Mode mode) {
        TimePickerDialog timePickerDialog = new TimePickerDialog();
        timePickerDialog.setMode(mode);
        FragmentManager supportFragmentManager = bloodPressureAddActivity.getSupportFragmentManager();
        Long value = bloodPressureAddViewModel.getCurrentTimeMillis().getValue();
        if (value == null) {
            value = Long.valueOf(System.currentTimeMillis());
        }
        timePickerDialog.show(supportFragmentManager, value.longValue(), new TimePickerDialog.TimeSelectListener() { // from class: rz
            @Override // com.huami.bloodpressure_ui.view.TimePickerDialog.TimeSelectListener
            public final void onTimeSelect(long j) {
                BloodPressureAddActivity.o(bloodPressureAddViewModel, j);
            }
        }, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BloodPressureAddViewModel bloodPressureAddViewModel, long j) {
        bloodPressureAddViewModel.setCurrentTime(j);
    }

    private final void observeData() {
        j().setCurrentTime(System.currentTimeMillis());
        final BloodPressureAddViewModel bloodPressureAddViewModelJ = j();
        bloodPressureAddViewModelJ.getTimePickerTrigger().observe(this, new Observer() { // from class: qz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureAddActivity.n(this.a, bloodPressureAddViewModelJ, (TimePickerDialog.Mode) obj);
            }
        });
        bloodPressureAddViewModelJ.getEnableSave().observe(this, new Observer() { // from class: oz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureAddActivity.p(this.a, (Boolean) obj);
            }
        });
        bloodPressureAddViewModelJ.getCurrentTimeMillis().observe(this, new Observer() { // from class: pz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureAddActivity.q(this.a, (Long) obj);
            }
        });
        bloodPressureAddViewModelJ.getInsertResultLiveData().observe(this, new Observer() { // from class: nz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureAddActivity.r(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BloodPressureAddActivity bloodPressureAddActivity, Boolean bool) {
        bloodPressureAddActivity.i().save.setEnabled(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BloodPressureAddActivity bloodPressureAddActivity, Long l) {
        bloodPressureAddActivity.i().date.setText(TimeUtils.formatDate((Context) bloodPressureAddActivity, new Date(l.longValue()), true));
        bloodPressureAddActivity.i().time.setText(TimeUtils.formatDate("HH:mm", l.longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BloodPressureAddActivity bloodPressureAddActivity, Resource resource) {
        if (resource.getStatus() == Status.LOADING) {
            bloodPressureAddActivity.k().show();
            return;
        }
        if (resource.getStatus() != Status.SUCCESS) {
            bloodPressureAddActivity.k().setFailed(bloodPressureAddActivity.getString(R.string.blood_pressure_save_failed));
            return;
        }
        bloodPressureAddActivity.k().hide();
        bloodPressureAddActivity.finish();
        Long l = (Long) resource.getData();
        if (l == null) {
            return;
        }
        BloodPressureActivityKt.navigateToBloodPressure(bloodPressureAddActivity, l.longValue());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        View currentFocus;
        if (ev.getAction() == 0 && (currentFocus = getCurrentFocus()) != null && m(currentFocus, ev)) {
            Object systemService = getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.huami.bloodpressure_ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        initTitle();
        initView();
        observeData();
    }
}
