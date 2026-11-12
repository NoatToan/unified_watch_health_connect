package com.xiaomi.hm.health.device.capturedevice;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.huami.account.api.HMAccountWebAPI;
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
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.event.EventWebViewExit;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.amazfit_watch.HMSelectWatchActivityNew;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import defpackage.no2;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HMCaptureDeviceBaseActivity extends BaseTitleActivity implements SurfaceHolder.Callback, CaptureActivityHandler.ICaputureListener {
    public static final String KEY_DESIRED_ZOOM = "desired_zoom";
    public static final String KEY_ZXING_BLOCK_SIZE_POWER = "zxing_block_size_power";
    private static final String O = "HMCaptureDeviceBaseActivity";
    private boolean A;
    private Collection<BarcodeFormat> D;
    private Map<DecodeHintType, ?> E;
    private String F;
    private InactivityTimer G;
    private BeepManager H;
    private AmbientLightManager I;
    public TextView noQrCodeOnDeviceTv;
    public TextView tipsTv;
    public TextView titleTv;
    private CameraManager x;
    private CaptureActivityHandler y;
    private ViewfinderView z;
    private int B = -1;
    private int C = -1;
    private TextView J = null;
    private SurfaceView K = null;
    private final Lazy<DeviceUtilsApi> L = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<WebViewService> M = KoinJavaComponent.inject(WebViewService.class);
    private final Lazy<DeviceXNavigator> N = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HMCaptureDeviceBaseActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMCaptureDeviceBaseActivity.this.y.sendEmptyMessage(65537);
        }
    }

    private void A() {
        Rect framingRect = this.x.getFramingRect();
        if (framingRect == null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.noQrCodeOnDeviceTv.getLayoutParams();
            layoutParams.addRule(12);
            this.noQrCodeOnDeviceTv.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.noQrCodeOnDeviceTv.getLayoutParams();
            layoutParams2.topMargin = framingRect.bottom + ((int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()));
            this.noQrCodeOnDeviceTv.setLayoutParams(layoutParams2);
        }
    }

    private void B() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.parental_authorization_title).setMessage(getString(R.string.parental_authorization_content)).setNegativeButton(R.string.parental_authorization_back, new DialogInterface.OnClickListener() { // from class: ip2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.x(dialogInterface, i);
            }
        }).setPositiveButton(R.string.gdpr_status_button2, new DialogInterface.OnClickListener() { // from class: jp2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.y(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void C(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HMLog.w("CaptureDevice", "address or sn is empty", new Object[0]);
        } else {
            this.N.getValue().startBindActivityUseSnAndAddress(this, str, str2);
        }
    }

    private void D() {
        Intent intent = new Intent(this, (Class<?>) HMSelectWatchActivityNew.class);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        startActivity(intent);
    }

    private void r(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.x.isOpen()) {
            HMLog.d(O, "initCamera() while already open -- late SurfaceView callback?", new Object[0]);
            return;
        }
        try {
            this.x.openDriver(surfaceHolder);
            if (this.y == null) {
                this.y = new CaptureActivityHandler(this, this.D, this.E, this.F, this.x, this.C, this.z);
            }
        } catch (IOException e) {
            HMLog.d(O, "IOException:" + e.getMessage(), new Object[0]);
        } catch (RuntimeException e2) {
            HMLog.d(O, "Unexpected error initializing camera : " + e2.toString(), new Object[0]);
            this.L.getValue().showPermissionDenieDialog(this, getString(R.string.permission_cam));
        }
    }

    private void s() {
        this.titleTv = (TextView) findViewById(R.id.capture_title);
        String titleString = getTitleString();
        if (TextUtils.isEmpty(titleString)) {
            titleString = "";
        }
        this.titleTv.setText(titleString);
        this.tipsTv = (TextView) findViewById(R.id.capture_tips);
        String tipString = getTipString();
        if (TextUtils.isEmpty(tipString)) {
            tipString = "";
        }
        this.tipsTv.setText(tipString);
        this.noQrCodeOnDeviceTv = (TextView) findViewById(R.id.tv_no_qr_code);
        String noQrCodeString = getNoQrCodeString();
        this.noQrCodeOnDeviceTv.setText(TextUtils.isEmpty(noQrCodeString) ? "" : noQrCodeString);
        this.noQrCodeOnDeviceTv.setOnClickListener(new View.OnClickListener() { // from class: kp2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
    }

    private void t(HMDeviceSource hMDeviceSource, final Result result) {
        if (HMPersonInfo.getInstance().getUserInfo().getAge() < 14 && hMDeviceSource == HMDeviceSource.MILI_FALCON_DISNEY) {
            Observable.fromCallable(no2.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: mp2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.v(result, (Boolean) obj);
                }
            }, new Action1() { // from class: lp2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.w((Throwable) obj);
                }
            });
            return;
        }
        HMLog.i(O, "Does not meet the authorization conditions of falcon version", new Object[0]);
        handleCaptureResult(result);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        onNoQRCodeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Result result, Boolean bool) {
        HMLog.i(O, "Parental authorization status:state->" + bool, new Object[0]);
        if (bool.booleanValue()) {
            B();
        } else {
            handleCaptureResult(result);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Throwable th) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        D();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(DialogInterface dialogInterface, int i) {
        WebItem webItem = new WebItem(HMServerDef.getUrl(HMAccountWebAPI.URL_MINOR_AUTHORIZATION_IMPROPER));
        webItem.isShouldNotifyFinish = true;
        webItem.isShouldPreVerify = true;
        this.M.getValue().launch(webItem);
        dialogInterface.dismiss();
    }

    private void z() {
        this.z.setVisibility(0);
    }

    public abstract boolean checkCaptureResult(Result result);

    public String getInvalidQrInfo() {
        return getString(R.string.bind_shoes_invalid_qr_help, new Object[]{getString(R.string.chip_device_name)});
    }

    public String getNoQrCodeString() {
        return getString(R.string.no_qr_code_on_watch);
    }

    public String getTipString() {
        return getString(R.string.bind_shoes_capture_tips, new Object[]{getString(R.string.chip_device_name)});
    }

    public String getTitleString() {
        return getString(R.string.bind_shoes_capture_title);
    }

    public abstract void handleCaptureResult(Result result);

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
        HMLog.d(O, "handleSuccess:" + result, new Object[0]);
        if (!checkCaptureResult(result)) {
            Analytics.event(this, StatEvent.BIND_CHIP_ERROR, StatEvent.BIND_CHIP_CODE_ERROR);
            showInvalidQrUI(getInvalidQrInfo());
            return;
        }
        DeviceQRInfo deviceQRInfo = CaptureQRResultKt.getDeviceQRInfo(result.getText());
        if (deviceQRInfo != null) {
            t(HMDeviceSource.fromPnP(deviceQRInfo.getPnpNum(), deviceQRInfo.getPnpVersion()), result);
        } else {
            finish();
        }
    }

    public void init(Bundle bundle) {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_capture_device_base);
        setStyle(BaseTitleActivity.STYLE.NONE);
        init(bundle);
        TextView textView = (TextView) findViewById(R.id.capture_quit);
        this.J = textView;
        textView.setOnClickListener(new a());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.capture_find_view);
        this.z = viewfinderView;
        viewfinderView.setLabel("");
        this.K = (SurfaceView) findViewById(R.id.capture_preview_view);
        s();
        this.B = getIntent().getIntExtra("desired_zoom", -1);
        this.C = getIntent().getIntExtra("zxing_block_size_power", -1);
        this.A = false;
        this.G = new InactivityTimer(this);
        this.H = new BeepManager(this);
        this.I = new AmbientLightManager(this);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.G.shutdown();
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventWebViewExit eventWebViewExit) {
        D();
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onNoQRCodeClick() {
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
        z();
        SurfaceHolder holder = this.K.getHolder();
        if (this.A) {
            r(holder);
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

    public void showInvalidQrUI(String str) {
        new AlertDialogFragment.Builder(this).setMessage(str).setCancelable(false).setNeutralButton(R.string.bind_i_know, new b()).show(getSupportFragmentManager());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            HMLog.d(O, "*** WARNING *** surfaceCreated() gave us a null surface!", new Object[0]);
        }
        if (this.A) {
            return;
        }
        this.A = true;
        r(surfaceHolder);
        A();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A = false;
        this.x.stopPreview();
        this.x.closeDriver();
    }
}
