package com.huami.device.feature.health.ui.bloodpressure;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity;
import com.huami.device.feature.health.ui.bloodpressure.model.BloodPressureMeasureStatus;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/BloodPressureCorrectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "m", "", SOAP.XMLNS, "t", hl.k, "y", "u", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onReturnClick", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "l", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureCorrectActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            BloodPressureCorrectActivity.this.k();
            BloodPressureCorrectActivity.super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final BloodPressureCorrectViewModel l() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    private final void m() {
        l().init();
        BloodPressureCorrectViewModel.setCorrectStatus$default(l(), BloodPressureCorrectStatus.PREPARE.INSTANCE, null, 2, null);
        l().getNeedReturn().observe(this, new Observer() { // from class: f00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureCorrectActivity.n(this.a, (Boolean) obj);
            }
        });
        l().getDeviceConnectStatus().observe(this, new Observer() { // from class: e00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureCorrectActivity.o(this.a, (Boolean) obj);
            }
        });
        l().getCorrectMeasureStatus().observe(this, new Observer() { // from class: c00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureCorrectActivity.q(this.a, (BloodPressureMeasureStatus) obj);
            }
        });
        l().getBtCmdResult().observe(this, new Observer() { // from class: d00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureCorrectActivity.r(this.a, (Boolean) obj);
            }
        });
        l().startSendHeartBeat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BloodPressureCorrectActivity bloodPressureCorrectActivity, Boolean bool) {
        if (bool.booleanValue()) {
            bloodPressureCorrectActivity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final BloodPressureCorrectActivity bloodPressureCorrectActivity, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        boolean zS = bloodPressureCorrectActivity.s();
        new AlertDialogFragment.Builder(bloodPressureCorrectActivity).setTitle(zS ? R.string.blood_pressure_device_disconnect : R.string.blood_pressure_bluetooth_disable).setMessage(zS ? R.string.blood_pressure_device_disconnect_msg_new : R.string.blood_pressure_bluetooth_disable_msg_new).setNeutralButton(R.string.btn_ok, new DialogInterface.OnClickListener() { // from class: b00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectActivity.p(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(bloodPressureCorrectActivity.getSupportFragmentManager(), "correct fail").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BloodPressureCorrectActivity bloodPressureCorrectActivity, DialogInterface dialogInterface, int i) {
        bloodPressureCorrectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BloodPressureCorrectActivity bloodPressureCorrectActivity, BloodPressureMeasureStatus bloodPressureMeasureStatus) {
        if (Intrinsics.areEqual(bloodPressureMeasureStatus, BloodPressureMeasureStatus.REMEASURE.INSTANCE)) {
            bloodPressureCorrectActivity.y();
        } else if (Intrinsics.areEqual(bloodPressureMeasureStatus, BloodPressureMeasureStatus.FAIL.INSTANCE)) {
            bloodPressureCorrectActivity.u();
        } else if (Intrinsics.areEqual(bloodPressureMeasureStatus, BloodPressureMeasureStatus.VALUE_INVALID.INSTANCE)) {
            bloodPressureCorrectActivity.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BloodPressureCorrectActivity bloodPressureCorrectActivity, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        Toast.makeText(bloodPressureCorrectActivity, R.string.blood_pressure_bt_cmd_fail, 0).show();
    }

    private final boolean s() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private final void t() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        LoadingDialog loadingDialog2 = null;
        if (loadingDialog != null) {
            if (!loadingDialog.isShowing()) {
                loadingDialog = null;
            }
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            loadingDialog2 = loadingDialogShowDialog;
        }
        this.mLoadingDialog = loadingDialog2;
    }

    private final void u() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.blood_pressure_correct_fail).setMessage(R.string.blood_pressure_measure_fail_msg).setNeutralButton(R.string.btn_ok, new DialogInterface.OnClickListener() { // from class: zz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectActivity.v(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "device not connect").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BloodPressureCorrectActivity bloodPressureCorrectActivity, DialogInterface dialogInterface, int i) {
        bloodPressureCorrectActivity.onBackPressed();
    }

    private final void w() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.blood_pressure_re_measure).setMessage(R.string.blood_pressure_re_measure_msg_one).setNeutralButton(R.string.btn_re_measure_simple, new DialogInterface.OnClickListener() { // from class: a00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectActivity.x(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "device not connect").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BloodPressureCorrectActivity bloodPressureCorrectActivity, DialogInterface dialogInterface, int i) {
        bloodPressureCorrectActivity.l().checkDeviceConnect();
    }

    private final void y() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.blood_pressure_re_measure).setMessage(R.string.blood_pressure_re_measure_msg_two).setNeutralButton(R.string.btn_re_measure_simple, new DialogInterface.OnClickListener() { // from class: yz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectActivity.z(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "device not connect").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BloodPressureCorrectActivity bloodPressureCorrectActivity, DialogInterface dialogInterface, int i) {
        if (bloodPressureCorrectActivity.l().checkDeviceConnect()) {
            bloodPressureCorrectActivity.l().remeasure(true);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        t();
        l().setCorrectStatus(BloodPressureCorrectStatus.FINISH.INSTANCE, new a());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_pressure_correct);
        m();
    }

    public final void onReturnClick(@NotNull View view) {
        onBackPressed();
    }
}
