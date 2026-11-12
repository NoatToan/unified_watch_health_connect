package com.xiaomi.hm.health.healthdata.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.AddHealthDataActivity;
import com.xiaomi.hm.health.healthdata.ui.view.TimePickerDialog;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.eventbus.EventAddDataSuccess;
import com.xiaomi.hm.health.healthdata.utils.DigitsTextWatcher;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import de.greenrobot.event.EventBus;
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
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/AddHealthDataActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "observeData", "z", "y", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", LogUtil.D, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "ev", "dispatchTouchEvent", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/AddHealthDataViewModel;", "x", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/AddHealthDataViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "w", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "saveLoadingDialog", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "dataType", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.I, "moreArrowRes", "B", "intInputType", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AddHealthDataActivity extends BaseTitleActivity {

    @NotNull
    private static final String C = "HealthData-AddHealthData";

    @NotNull
    public static final String DATA_TYPE = "dataType";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int moreArrowRes;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int intInputType;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveLoadingDialog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private DataType dataType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            AddHealthDataActivity.this.x().inputDbp(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "text", "", "selection", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<String, Integer, Unit> {
        public b() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
            AddHealthDataActivity addHealthDataActivity = AddHealthDataActivity.this;
            int i2 = R.id.editText;
            ((EditText) addHealthDataActivity.findViewById(i2)).setText(str);
            ((EditText) AddHealthDataActivity.this.findViewById(i2)).setSelection(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
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
            DataType dataType = AddHealthDataActivity.this.dataType;
            Objects.requireNonNull(dataType);
            if (dataType == HealthDataType.BLOOD_PRESSURE) {
                AddHealthDataActivity.this.x().inputSbp(str);
            } else {
                AddHealthDataActivity.this.x().setData(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "text", "", "selection", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<String, Integer, Unit> {
        public d() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
            AddHealthDataActivity addHealthDataActivity = AddHealthDataActivity.this;
            int i2 = R.id.editText;
            ((EditText) addHealthDataActivity.findViewById(i2)).setText(str);
            ((EditText) AddHealthDataActivity.this.findViewById(i2)).setSelection(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<LoadingDialog> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            LoadingDialog loadingDialog = new LoadingDialog(AddHealthDataActivity.this);
            loadingDialog.setMessage(AddHealthDataActivity.this.getString(com.huami.watch.hmwatchmanager.R.string.saving));
            return loadingDialog;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddHealthDataActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.AddHealthDataActivity$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AddHealthDataViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.AddHealthDataActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AddHealthDataViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(AddHealthDataViewModel.class), function0, objArr);
            }
        });
        this.saveLoadingDialog = LazyKt__LazyJVMKt.lazy(new e());
        this.moreArrowRes = -1;
        this.intInputType = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AddHealthDataActivity addHealthDataActivity, View view) {
        addHealthDataActivity.x().setTimePickerMode(TimePickerDialog.Mode.DATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(AddHealthDataActivity addHealthDataActivity, View view) {
        addHealthDataActivity.x().setTimePickerMode(TimePickerDialog.Mode.TIME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AddHealthDataActivity addHealthDataActivity, View view) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            addHealthDataActivity.x().postData();
        } else {
            CustomToast.showShort(addHealthDataActivity, com.huami.watch.hmwatchmanager.R.string.no_network_connection);
        }
    }

    private final boolean D(View v, MotionEvent event) {
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
    public static final void E(AddHealthDataActivity addHealthDataActivity, Resource resource) {
        if (resource.getStatus() == Status.LOADING) {
            addHealthDataActivity.w().show();
            return;
        }
        if (resource.getStatus() != Status.SUCCESS) {
            addHealthDataActivity.w().setFailed(addHealthDataActivity.getString(com.huami.watch.hmwatchmanager.R.string.save_failed));
            return;
        }
        addHealthDataActivity.w().hide();
        Long value = addHealthDataActivity.x().getCurrentTimeMillis().getValue();
        if (value != null) {
            EventBus.getDefault().post(new EventAddDataSuccess(value.longValue()));
        }
        addHealthDataActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(AddHealthDataActivity addHealthDataActivity, final AddHealthDataViewModel addHealthDataViewModel, TimePickerDialog.Mode mode) {
        TimePickerDialog timePickerDialog = new TimePickerDialog();
        timePickerDialog.setMode(mode);
        FragmentManager supportFragmentManager = addHealthDataActivity.getSupportFragmentManager();
        Long value = addHealthDataViewModel.getCurrentTimeMillis().getValue();
        if (value == null) {
            value = Long.valueOf(System.currentTimeMillis());
        }
        timePickerDialog.show(supportFragmentManager, value.longValue(), new TimePickerDialog.TimeSelectListener() { // from class: w8
            @Override // com.xiaomi.hm.health.healthdata.ui.view.TimePickerDialog.TimeSelectListener
            public final void onTimeSelect(long j) {
                AddHealthDataActivity.G(addHealthDataViewModel, j);
            }
        }, C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(AddHealthDataViewModel addHealthDataViewModel, long j) {
        addHealthDataViewModel.setCurrentTime(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(AddHealthDataActivity addHealthDataActivity, String str) {
        ((TypefaceTextView) addHealthDataActivity.findViewById(R.id.date)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(AddHealthDataActivity addHealthDataActivity, String str) {
        ((TypefaceTextView) addHealthDataActivity.findViewById(R.id.time)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(AddHealthDataActivity addHealthDataActivity, String str) {
        DataType dataType = addHealthDataActivity.dataType;
        Objects.requireNonNull(dataType);
        if (dataType != HealthDataType.BLOOD_PRESSURE) {
            ((TypefaceTextView) addHealthDataActivity.findViewById(R.id.data_text)).setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(AddHealthDataActivity addHealthDataActivity, String str) {
        ((EditText) addHealthDataActivity.findViewById(R.id.editText)).setHint(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(AddHealthDataActivity addHealthDataActivity, Boolean bool) {
        ((Button) addHealthDataActivity.findViewById(R.id.save)).setEnabled(bool.booleanValue());
    }

    private final void initView() {
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(com.huami.watch.hmwatchmanager.R.string.health_data_add), null, 2, null);
        this.moreArrowRes = com.huami.watch.hmwatchmanager.R.drawable.ic_arrow_forward_16;
        ((TypefaceTextView) findViewById(R.id.date)).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.moreArrowRes, 0);
        ((TypefaceTextView) findViewById(R.id.time)).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.moreArrowRes, 0);
        ((EditText) findViewById(R.id.editText)).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.moreArrowRes, 0);
        ((ConstraintLayout) findViewById(R.id.date_item)).setOnClickListener(new View.OnClickListener() { // from class: x8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddHealthDataActivity.A(this.a, view);
            }
        });
        ((ConstraintLayout) findViewById(R.id.time_item)).setOnClickListener(new View.OnClickListener() { // from class: v8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddHealthDataActivity.B(this.a, view);
            }
        });
        z();
        ((Button) findViewById(R.id.save)).setOnClickListener(new View.OnClickListener() { // from class: y8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddHealthDataActivity.C(this.a, view);
            }
        });
        DataType dataType = this.dataType;
        Objects.requireNonNull(dataType);
        if (dataType == HealthDataType.BLOOD_PRESSURE) {
            y();
        }
    }

    private final void observeData() {
        final AddHealthDataViewModel addHealthDataViewModelX = x();
        DataType dataType = this.dataType;
        Objects.requireNonNull(dataType);
        addHealthDataViewModelX.setDataType(dataType);
        addHealthDataViewModelX.getDateValue().observe(this, new Observer() { // from class: d9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.H(this.a, (String) obj);
            }
        });
        addHealthDataViewModelX.getTimeValue().observe(this, new Observer() { // from class: c9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.I(this.a, (String) obj);
            }
        });
        addHealthDataViewModelX.getDataName().observe(this, new Observer() { // from class: e9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.J(this.a, (String) obj);
            }
        });
        addHealthDataViewModelX.getDataUnit().observe(this, new Observer() { // from class: b9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.K(this.a, (String) obj);
            }
        });
        addHealthDataViewModelX.getEnableSave().observe(this, new Observer() { // from class: a9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.L(this.a, (Boolean) obj);
            }
        });
        addHealthDataViewModelX.getInsertResultLiveData().observe(this, new Observer() { // from class: z8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.E(this.a, (Resource) obj);
            }
        });
        addHealthDataViewModelX.getTimePickerTrigger().observe(this, new Observer() { // from class: f9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataActivity.F(this.a, addHealthDataViewModelX, (TimePickerDialog.Mode) obj);
            }
        });
    }

    private final LoadingDialog w() {
        return (LoadingDialog) this.saveLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddHealthDataViewModel x() {
        return (AddHealthDataViewModel) this.viewModel.getValue();
    }

    private final void y() {
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.extra_data_item), true);
        ((TypefaceTextView) findViewById(R.id.data_text)).setText(getString(com.huami.watch.hmwatchmanager.R.string.card_sbp));
        ((TypefaceTextView) findViewById(R.id.extra_data_text)).setText(getString(com.huami.watch.hmwatchmanager.R.string.card_dbp));
        int i = R.id.extra_editText;
        ((EditText) findViewById(i)).setHint(getString(com.huami.watch.hmwatchmanager.R.string.unit_bp));
        ((EditText) findViewById(i)).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.moreArrowRes, 0);
        EditText editText = (EditText) findViewById(i);
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        DataType dataType = this.dataType;
        Objects.requireNonNull(dataType);
        editText.addTextChangedListener(new DigitsTextWatcher(new a(), new b(), healthDataUtils.getHealthDataDigits(dataType)));
    }

    private final void z() {
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        DataType dataType = this.dataType;
        Objects.requireNonNull(dataType);
        if (healthDataUtils.checkDataIsInt(dataType)) {
            ((EditText) findViewById(R.id.editText)).setInputType(this.intInputType);
            ((EditText) findViewById(R.id.extra_editText)).setInputType(this.intInputType);
        }
        EditText editText = (EditText) findViewById(R.id.editText);
        DataType dataType2 = this.dataType;
        Objects.requireNonNull(dataType2);
        editText.addTextChangedListener(new DigitsTextWatcher(new c(), new d(), healthDataUtils.getHealthDataDigits(dataType2)));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        View currentFocus;
        if (ev.getAction() == 0 && (currentFocus = getCurrentFocus()) != null && D(currentFocus, ev)) {
            Object systemService = getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(com.huami.watch.hmwatchmanager.R.layout.activity_add_health_data);
        String stringExtra = getIntent().getStringExtra("dataType");
        if (stringExtra != null) {
            this.dataType = DataType.INSTANCE.find(stringExtra);
        }
        initView();
        observeData();
    }
}
