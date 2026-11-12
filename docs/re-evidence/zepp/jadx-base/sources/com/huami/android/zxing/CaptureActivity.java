package com.huami.android.zxing;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.huami.android.picture.GalleryPickerActivity;
import com.huami.android.qrcode.R;
import com.huami.android.zxing.camera.CameraManager;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureActivity extends AppCompatActivity implements SurfaceHolder.Callback, View.OnClickListener, CaptureActivityHandler.ICaputureListener, EasyPermissions.PermissionCallbacks {
    public static final int FRIEND_MOUDLE_CALL_TYPE = 0;
    public static final String KEY_CALL_TYPE = "call_type";
    public static final String KEY_DESIRED_ZOOM = "desired_zoom";
    public static final String KEY_HIDE_ALBUM_BUTTON = "hide_album_button";
    public static final String KEY_HIDE_CLOSE_BUTTON = "hide_close_button";
    public static final String KEY_SCAN_PROMPT = "scan_prompt";
    public static final String KEY_SCAN_TITLE = "scan_title";
    public static final String KEY_SHOW_BACK_BUTTON = "show_back_button";
    public static final String KEY_ZXING_BLOCK_SIZE_POWER = "zxing_block_size_power";
    public static final String OUTPUT_SCAN_RESULT = "scan_result";
    public static final String OUTPUT_SCAN_RESULT_TEXT = "scan_result_text";
    public static final String OUTPUT_SCAN_RESULT_TIME = "scan_result_time";
    public static final String REQUEST_KEY_PHOTO = "zxing_capture_activity_photo";
    public static final int REQUEST_PERMISSION = 100;
    public static final int REQUEST_PHOTO_PERMISSION = 101;
    private static final String w = CaptureActivity.class.getSimpleName();
    private static final int x = 1;
    private CameraManager a;
    private CaptureActivityHandler b;
    private File c;
    private ViewfinderView d;
    private boolean e;
    private Collection<BarcodeFormat> h;
    private Map<DecodeHintType, ?> i;
    private String j;
    private InactivityTimer k;
    private BeepManager l;
    private AmbientLightManager m;
    private View n;
    private View o;
    private boolean s;
    private boolean t;
    private View u;
    private TextView v;
    private int f = -1;
    private int g = -1;
    private boolean p = true;
    private String q = null;
    private String r = null;

    private void c(File file) {
        CaptureActivityHandler captureActivityHandler = this.b;
        if (captureActivityHandler == null) {
            this.c = file;
            return;
        }
        if (file != null) {
            this.c = file;
        }
        File file2 = this.c;
        if (file2 != null) {
            this.b.sendMessage(Message.obtain(captureActivityHandler, 65544, file2));
        }
        this.c = null;
    }

    public static Intent createIntent4Friend(Context context) {
        Intent intent = new Intent(context, (Class<?>) CaptureActivity.class);
        intent.putExtra(KEY_CALL_TYPE, 0);
        return intent;
    }

    private void d(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.a.isOpen()) {
            Log.w(w, "initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try {
            this.a.openDriver(surfaceHolder);
            if (this.b == null) {
                this.b = new CaptureActivityHandler(this, this.h, this.i, this.j, this.a, this.g, this.d);
            }
            c(null);
        } catch (IOException e) {
            Log.w(w, e);
            showAlert();
        } catch (RuntimeException e2) {
            Log.w(w, "Unexpected error initializing camera", e2);
            showAlert();
            setResult(100);
            finish();
        }
    }

    private void e() {
        this.d.setVisibility(0);
    }

    private void showAlert() {
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleFailed() {
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleReturn() {
    }

    @Override // com.huami.android.zxing.CaptureActivityHandler.ICaputureListener
    public void handleSuccess(Result result) {
        this.k.onActivity();
        this.l.playBeepSoundAndVibrate();
        Intent intent = new Intent();
        intent.putExtra(OUTPUT_SCAN_RESULT, result.getRawBytes());
        intent.putExtra(OUTPUT_SCAN_RESULT_TEXT, result.getText());
        intent.putExtra(OUTPUT_SCAN_RESULT_TIME, result.getTimestamp());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            c(new File(intent.getStringExtra("cn.com.smartdevices.bracelet.extra.DATA")));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.close_button || id == R.id.back_button) {
            finish();
        } else if (id == R.id.album_button) {
            EasyPermissions.requestPermissions(this, getString(R.string.qrcode_photo_permission_text), 101, REQUEST_KEY_PHOTO, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(512);
        }
        setContentView(R.layout.activity_capture);
        String stringExtra = getIntent().getStringExtra(KEY_SCAN_PROMPT);
        this.q = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            ((ViewfinderView) findViewById(R.id.scan_view)).setLabel(this.q);
        }
        this.v = (TextView) findViewById(R.id.title);
        String stringExtra2 = getIntent().getStringExtra(KEY_SCAN_TITLE);
        this.r = stringExtra2;
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.v.setText(this.r);
            this.v.setVisibility(0);
        }
        View viewFindViewById = findViewById(R.id.album_button);
        this.o = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        boolean booleanExtra = getIntent().getBooleanExtra(KEY_HIDE_ALBUM_BUTTON, false);
        this.p = booleanExtra;
        if (booleanExtra) {
            this.o.setVisibility(8);
        }
        View viewFindViewById2 = findViewById(R.id.close_button);
        this.n = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        boolean booleanExtra2 = getIntent().getBooleanExtra(KEY_HIDE_CLOSE_BUTTON, false);
        this.s = booleanExtra2;
        if (booleanExtra2) {
            this.n.setVisibility(8);
        }
        this.u = findViewById(R.id.back_button);
        boolean booleanExtra3 = getIntent().getBooleanExtra(KEY_SHOW_BACK_BUTTON, false);
        this.t = booleanExtra3;
        if (booleanExtra3) {
            this.u.setVisibility(0);
            this.u.setOnClickListener(this);
        }
        this.f = getIntent().getIntExtra("desired_zoom", -1);
        this.g = getIntent().getIntExtra("zxing_block_size_power", -1);
        this.e = false;
        this.k = new InactivityTimer(this);
        this.l = new BeepManager(this);
        this.m = new AmbientLightManager(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.k.shutdown();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(0);
            finish();
            return true;
        }
        if (i != 27 && i != 80) {
            if (i != 24) {
                if (i != 25) {
                    return super.onKeyDown(i, keyEvent);
                }
                this.a.setTorch(false);
                return true;
            }
            this.a.setTorch(true);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        CaptureActivityHandler captureActivityHandler = this.b;
        if (captureActivityHandler != null) {
            captureActivityHandler.quitSynchronously();
            this.b = null;
        }
        this.k.onPause();
        this.m.stop();
        this.l.close();
        this.a.closeDriver();
        if (!this.e) {
            ((SurfaceView) findViewById(R.id.preview_view)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int i, @NonNull List<String> list) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, list)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.qrcode_photo_permission_text)).setRequestKey(REQUEST_KEY_PHOTO).create().show(getSupportFragmentManager(), "");
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int i, @NonNull List<String> list) {
        startActivityForResult(new Intent(this, (Class<?>) GalleryPickerActivity.class), 1);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        EasyPermissions.onRequestPermissionsResult(REQUEST_KEY_PHOTO, i, strArr, iArr, this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f = bundle.getInt("desired_zoom");
        this.g = bundle.getInt("zxing_block_size_power");
        this.p = bundle.getBoolean(KEY_HIDE_ALBUM_BUTTON);
        this.s = bundle.getBoolean(KEY_HIDE_CLOSE_BUTTON);
        this.t = bundle.getBoolean(KEY_SHOW_BACK_BUTTON);
        this.q = bundle.getString(KEY_SCAN_PROMPT);
        this.r = bundle.getString(KEY_SCAN_TITLE);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int intExtra;
        super.onResume();
        CameraManager cameraManager = new CameraManager(getApplication());
        this.a = cameraManager;
        cameraManager.setDesiredZoom(this.f);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.scan_view);
        this.d = viewfinderView;
        viewfinderView.setCameraManager(this.a);
        e();
        SurfaceHolder holder = ((SurfaceView) findViewById(R.id.preview_view)).getHolder();
        if (this.e) {
            d(holder);
        } else {
            holder.addCallback(this);
        }
        this.l.updatePrefs();
        this.m.start(this.a);
        this.k.onResume();
        Intent intent = getIntent();
        this.h = null;
        this.j = null;
        if (intent != null) {
            this.h = DecodeFormatManager.parseDecodeFormats(intent);
            this.i = DecodeHintManager.parseDecodeHints(intent);
            if (intent.hasExtra(Intents.Scan.WIDTH) && intent.hasExtra(Intents.Scan.HEIGHT)) {
                int intExtra2 = intent.getIntExtra(Intents.Scan.WIDTH, 0);
                int intExtra3 = intent.getIntExtra(Intents.Scan.HEIGHT, 0);
                if (intExtra2 > 0 && intExtra3 > 0) {
                    this.a.setManualFramingRect(intExtra2, intExtra3);
                }
            }
            if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                this.a.setManualCameraId(intExtra);
            }
            this.j = intent.getStringExtra("CHARACTER_SET");
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("desired_zoom", this.f);
        bundle.putInt("zxing_block_size_power", this.g);
        bundle.putBoolean(KEY_HIDE_ALBUM_BUTTON, this.p);
        bundle.putBoolean(KEY_HIDE_CLOSE_BUTTON, this.s);
        bundle.putBoolean(KEY_SHOW_BACK_BUTTON, this.t);
        bundle.putString(KEY_SCAN_PROMPT, this.q);
        bundle.putString(KEY_SCAN_TITLE, this.r);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            Log.e(w, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (this.e) {
            return;
        }
        this.e = true;
        d(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.e = false;
        this.a.stopPreview();
        this.a.closeDriver();
    }
}
