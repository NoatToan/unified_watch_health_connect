package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.zxing.AmbientLightManager;
import com.huami.android.zxing.BeepManager;
import com.huami.android.zxing.CaptureActivityHandler;
import com.huami.android.zxing.DecodeFormatManager;
import com.huami.android.zxing.DecodeHintManager;
import com.huami.android.zxing.InactivityTimer;
import com.huami.android.zxing.Intents;
import com.huami.android.zxing.ViewfinderView;
import com.huami.android.zxing.camera.CameraManager;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMCaptureShoesActivity extends BaseTitleActivity implements SurfaceHolder.Callback, CaptureActivityHandler.ICaputureListener {
    public static final String KEY_DESIRED_ZOOM = "desired_zoom";
    public static final String KEY_ZXING_BLOCK_SIZE_POWER = "zxing_block_size_power";
    private static final String N = "HMCaptureShoesActivity";
    private boolean A;
    private Collection<BarcodeFormat> D;
    private Map<DecodeHintType, ?> E;
    private String F;
    private InactivityTimer G;
    private BeepManager H;
    private AmbientLightManager I;
    private CameraManager x;
    private CaptureActivityHandler y;
    private ViewfinderView z;
    private int B = -1;
    private int C = -1;
    private TextView J = null;
    private SurfaceView K = null;
    private final Lazy<DeviceUtilsApi> L = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> M = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HMCaptureShoesActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMCaptureShoesActivity.this.y.sendEmptyMessage(65537);
        }
    }

    private void m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.x.isOpen()) {
            HMLog.d(N, "initCamera() while already open -- late SurfaceView callback?", new Object[0]);
            return;
        }
        try {
            this.x.openDriver(surfaceHolder);
            if (this.y == null) {
                this.y = new CaptureActivityHandler(this, this.D, this.E, this.F, this.x, this.C, this.z);
            }
        } catch (IOException e) {
            HMLog.d(N, "IOException:" + e.getMessage(), new Object[0]);
        } catch (RuntimeException e2) {
            HMLog.d(N, "Unexpected error initializing camera : " + e2.toString(), new Object[0]);
            this.L.getValue().showPermissionDenieDialog(this, getString(R.string.permission_cam));
        }
    }

    private void n() {
        this.z.setVisibility(0);
    }

    private void o() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.bind_shoes_invalid_qr_help, new Object[]{getString(R.string.chip_device_name)})).setCancelable(false).setNeutralButton(R.string.bind_i_know, new b()).show(getSupportFragmentManager());
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleFailed() {
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleReturn() {
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleSuccess(Result result) {
        this.G.onActivity();
        this.H.playBeepSoundAndVibrate();
        HMLog.d(N, "handleSuccess:" + result, new Object[0]);
        HMShoesQRHelper.QRResult qr = HMShoesQRHelper.parseQR(result.getText());
        if (qr == null) {
            Analytics.event(this, StatEvent.BIND_CHIP_ERROR, StatEvent.BIND_CHIP_CODE_ERROR);
            o();
        } else {
            this.M.getValue().startBindActivityUseSnAndAddress(this, qr.getMacAddress(), qr.getSN());
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_capture_shoes);
        setStyle(BaseTitleActivity.STYLE.NONE);
        TextView textView = (TextView) findViewById(R.id.capture_quit);
        this.J = textView;
        textView.setOnClickListener(new a());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.capture_find_view);
        this.z = viewfinderView;
        viewfinderView.setLabel("");
        this.K = (SurfaceView) findViewById(R.id.capture_preview_view);
        ((TextView) findViewById(R.id.bind_shoes_capture_tips)).setText(getString(R.string.bind_shoes_capture_tips, new Object[]{getString(R.string.chip_device_name)}));
        this.B = getIntent().getIntExtra("desired_zoom", -1);
        this.C = getIntent().getIntExtra("zxing_block_size_power", -1);
        this.A = false;
        this.G = new InactivityTimer(this);
        this.H = new BeepManager(this);
        this.I = new AmbientLightManager(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.G.shutdown();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        CaptureActivityHandler captureActivityHandler = this.y;
        if (captureActivityHandler != null) {
            captureActivityHandler.quitSynchronously();
            this.y = null;
        }
        this.G.onPause();
        this.I.stop();
        this.H.close();
        this.x.closeDriver();
        if (!this.A) {
            this.K.getHolder().removeCallback(this);
        }
        super.onPause();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int intExtra;
        super.onResume();
        CameraManager cameraManager = new CameraManager(getApplication());
        this.x = cameraManager;
        cameraManager.setDesiredZoom(this.B);
        this.z.setCameraManager(this.x);
        n();
        SurfaceHolder holder = this.K.getHolder();
        if (this.A) {
            m(holder);
        } else {
            holder.addCallback(this);
        }
        this.H.updatePrefs();
        this.I.start(this.x);
        this.G.onResume();
        Intent intent = getIntent();
        this.D = null;
        this.F = null;
        if (intent != null) {
            this.D = DecodeFormatManager.parseDecodeFormats(intent);
            this.E = DecodeHintManager.parseDecodeHints(intent);
            if (intent.hasExtra(Intents.Scan.WIDTH) && intent.hasExtra(Intents.Scan.HEIGHT)) {
                int intExtra2 = intent.getIntExtra(Intents.Scan.WIDTH, 0);
                int intExtra3 = intent.getIntExtra(Intents.Scan.HEIGHT, 0);
                if (intExtra2 > 0 && intExtra3 > 0) {
                    this.x.setManualFramingRect(intExtra2, intExtra3);
                }
            }
            if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                this.x.setManualCameraId(intExtra);
            }
            this.F = intent.getStringExtra("CHARACTER_SET");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            HMLog.d(N, "*** WARNING *** surfaceCreated() gave us a null surface!", new Object[0]);
        }
        if (this.A) {
            return;
        }
        this.A = true;
        m(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A = false;
        this.x.stopPreview();
        this.x.closeDriver();
    }
}
