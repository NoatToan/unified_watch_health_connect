package com.xiaomi.hm.health.device.reset;

import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.reset.DialogResource;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.device.view.VerifyCodeView;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class HMResetDeviceActivity extends BaseTitleActivity {
    public static final String KEY_FROM_SETTING = "from_setting";
    private static final String P = "HMResetDeviceActivity";
    private static final int Q = 1;
    private RelativeLayout A;
    private HMLoadingView B;
    private ImageView C;
    private RelativeLayout D;
    private VerifyCodeView E;
    private RelativeLayout F;
    private TextView G;
    private TextView H;
    private TextView I;
    private AlertDialogFragment J;
    private LoadingDialog K;
    private BluetoothDevice L;
    private boolean M;
    private final Lazy<DeviceManagerApi> N = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> O = KoinJavaComponent.inject(DeviceXNavigator.class);
    private ResetDeviceViewModel x;
    private TextView y;
    private TextView z;

    public class a implements VerifyCodeView.EmptyCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.device.view.VerifyCodeView.EmptyCallback
        public void onEmpty() {
            HMResetDeviceActivity.this.I.setEnabled(false);
        }

        @Override // com.xiaomi.hm.health.device.view.VerifyCodeView.EmptyCallback
        public void onNotEmpty() {
            HMResetDeviceActivity.this.I.setEnabled(true);
        }
    }

    private void A() {
        this.y = (TextView) findViewById(R.id.device_reset_title);
        this.z = (TextView) findViewById(R.id.device_reset_sub);
        this.A = (RelativeLayout) findViewById(R.id.device_reset_connect);
        this.B = (HMLoadingView) findViewById(R.id.loading_view);
        this.C = (ImageView) findViewById(R.id.vibrate_img);
        this.D = (RelativeLayout) findViewById(R.id.device_reset_input);
        this.E = (VerifyCodeView) findViewById(R.id.input_number);
        this.F = (RelativeLayout) findViewById(R.id.device_reset_ble);
        TextView textView = (TextView) findViewById(R.id.center_btn);
        this.G = textView;
        int i = R.string.cancel;
        textView.setText(i);
        this.G.setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.left_btn);
        this.H = textView2;
        textView2.setText(i);
        this.H.setVisibility(4);
        TextView textView3 = (TextView) findViewById(R.id.right_btn);
        this.I = textView3;
        textView3.setText(R.string.confirm);
        this.I.setVisibility(4);
        this.E.setCallback(new a());
        this.G.setOnClickListener(new View.OnClickListener() { // from class: wd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.F(view);
            }
        });
        this.H.setOnClickListener(new View.OnClickListener() { // from class: xd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.G(view);
            }
        });
        this.I.setOnClickListener(new View.OnClickListener() { // from class: vd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(String str) {
        this.y.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        this.z.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Integer num) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            this.A.setVisibility(0);
            this.C.setVisibility(4);
            this.D.setVisibility(8);
            this.E.clear();
            this.F.setVisibility(8);
            this.G.setVisibility(0);
            this.H.setVisibility(4);
            this.I.setVisibility(4);
            this.B.startLoading();
            return;
        }
        if (iIntValue == 1) {
            this.C.setVisibility(0);
            this.B.stopLoading();
            return;
        }
        if (iIntValue == 2) {
            this.A.setVisibility(8);
            this.D.setVisibility(0);
            this.G.setVisibility(4);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            this.I.setEnabled(false);
            this.I.setText(R.string.confirm);
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        this.A.setVisibility(8);
        this.D.setVisibility(8);
        this.F.setVisibility(0);
        this.G.setVisibility(4);
        this.H.setVisibility(0);
        this.I.setVisibility(0);
        this.I.setEnabled(true);
        this.I.setText(R.string.open);
        this.B.stopLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void E(DialogResource dialogResource) {
        if (dialogResource != null) {
            switch (dialogResource.status) {
                case 16:
                    w();
                    DialogContent dialogContent = (DialogContent) dialogResource.data;
                    O(dialogContent.getTitle(), dialogContent.getLeft());
                    break;
                case 17:
                    this.B.stopLoading();
                    w();
                    DialogContent dialogContent2 = (DialogContent) dialogResource.data;
                    P(dialogContent2.getTitle(), dialogContent2.getLeft(), dialogContent2.getRight());
                    break;
                case 18:
                    N(((DialogContent) dialogResource.data).getTitle());
                    break;
                case 19:
                    Q(((DialogContent) dialogResource.data).getTitle());
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        if (!this.N.getValue().isBluetoothEnable()) {
            M();
        } else {
            if (TextUtils.isEmpty(this.E.getContent())) {
                return;
            }
            this.x.y(Integer.parseInt(this.E.getContent()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(DialogInterface dialogInterface, int i) {
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(DialogInterface dialogInterface, int i) {
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(DialogInterface dialogInterface, int i) {
        this.x.X(this.L);
    }

    private void L() {
        this.O.getValue().startUnifySelectDeviceActivity(this);
    }

    private void M() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private void N(@StringRes int i) {
        LoadingDialog loadingDialog = this.K;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.K = loadingDialogShowDialog;
            loadingDialogShowDialog.setMessage(getResources().getString(i));
            this.K.setCancelable(false);
        }
    }

    private void O(@StringRes int i, @StringRes int i2) {
        AlertDialogFragment alertDialogFragment = this.J;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setMessage(i).setCancelable(false).setNeutralButton(i2, new DialogInterface.OnClickListener() { // from class: ud3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.a.I(dialogInterface, i3);
                }
            }).create();
            this.J = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    private void P(@StringRes int i, @StringRes int i2, @StringRes int i3) {
        AlertDialogFragment alertDialogFragment = this.J;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setMessage(i).setCancelable(false).setNegativeButton(i2, new DialogInterface.OnClickListener() { // from class: sd3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    this.a.J(dialogInterface, i4);
                }
            }).setPositiveButton(i3, new DialogInterface.OnClickListener() { // from class: td3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    this.a.K(dialogInterface, i4);
                }
            }).create();
            this.J = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    private void Q(@StringRes int i) {
        IconToast.showError(this, i);
    }

    private void w() {
        LoadingDialog loadingDialog = this.K;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.K.dismiss();
        this.K = null;
    }

    private void x() {
        if (!this.M) {
            L();
        }
        finish();
    }

    private void y() {
        Intent intent = getIntent();
        if (intent != null) {
            this.L = (BluetoothDevice) intent.getParcelableExtra("bind_device");
            this.M = intent.getBooleanExtra(KEY_FROM_SETTING, false);
            this.x.Z(this.L);
        }
    }

    private void z() {
        ResetDeviceViewModel resetDeviceViewModel = (ResetDeviceViewModel) ViewModelProviders.of(this).get(ResetDeviceViewModel.class);
        this.x = resetDeviceViewModel;
        resetDeviceViewModel.getTitle().observe(this, new Observer() { // from class: be3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.B((String) obj);
            }
        });
        this.x.getSubTitle().observe(this, new Observer() { // from class: ae3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.C((String) obj);
            }
        });
        this.x.getPosition().observe(this, new Observer() { // from class: zd3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.D((Integer) obj);
            }
        });
        this.x.getStatus().observe(this, new Observer() { // from class: yd3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.E((DialogResource) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.x.X(this.L);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_device);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s36), true);
        A();
        z();
        y();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w();
        this.B.stopLoading();
        this.x.a0();
    }
}
