package com.huami.lib.qrcode;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DisplayOrientedMeteringPointFactory;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.zxing.Result;
import com.huami.lib.qrcode.gallery.QRCodeGalleryActivity;
import com.huami.lib.qrcode.view.ScannerView;
import defpackage.l56;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"RestrictedApi"})
public class QRCodeActivity extends AppCompatActivity {
    public static final double RATIO_16_9_VALUE = 1.7777777777777777d;
    public static final double RATIO_4_3_VALUE = 1.3333333333333333d;
    public static final int REQUEST_CODE = 49374;
    public static final int REQUEST_PERMISSION_CODE_CAMERA = 10;
    public static final String SCAN_RESULT = "SCAN_RESULT";
    public static final String SCAN_RESULT_BYTES = "SCAN_RESULT_BYTES";
    public static final String SCAN_RESULT_FORMAT = "SCAN_RESULT_FORMAT";
    public static final String SCAN_RESULT_SOURCE = "SCAN_RESULT_SOURCE";
    private static final String g = "QRCodeActivity";
    private boolean a;
    private PreviewView b;
    private Camera c;
    private ProcessCameraProvider d;
    private final ExecutorService e = Executors.newSingleThreadExecutor();
    private final ActivityResultLauncher<Intent> f = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: k56
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.a.n((ActivityResult) obj);
        }
    });

    public class b implements ImageAnalysis.Analyzer {
        private final AtomicBoolean a;

        private b() {
            this.a = new AtomicBoolean(true);
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public void analyze(@NonNull ImageProxy imageProxy) {
            Result resultA;
            int format = imageProxy.getFormat();
            if (format != 35 && format != 39 && format != 40) {
                Log.e(QRCodeActivity.g, String.format("Expected YUV format, got %d instead", Integer.valueOf(format)));
                imageProxy.close();
                return;
            }
            try {
                if (this.a.get() && (resultA = com.huami.lib.qrcode.a.a(imageProxy)) != null && !TextUtils.isEmpty(resultA.getText())) {
                    this.a.set(false);
                    QRCodeActivity.this.a = true;
                    QRCodeActivity.this.t(resultA);
                }
            } finally {
                imageProxy.close();
            }
        }
    }

    static {
        System.loadLibrary("opencv_java4");
    }

    private int l(int i, int i2) {
        double dMax = (((double) Math.max(i, i2)) * 1.0d) / ((double) Math.min(i, i2));
        return Math.abs(dMax - 1.3333333333333333d) <= Math.abs(dMax - 1.7777777777777777d) ? 0 : 1;
    }

    private void m() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = Build.VERSION.SDK_INT >= 30 ? getDisplay() : getWindowManager().getDefaultDisplay();
        display.getRealMetrics(displayMetrics);
        String str = g;
        Logger.d(str, "::: -> Screen metrics: " + displayMetrics.widthPixels + " x " + displayMetrics.heightPixels);
        int iL = l(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StringBuilder sb = new StringBuilder();
        sb.append("::: -> Preview aspect ratio: ");
        sb.append(iL);
        Logger.d(str, sb.toString());
        int rotation = display.getRotation();
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(iL).setTargetRotation(rotation).build();
        ImageCapture imageCaptureBuild = new ImageCapture.Builder().setCaptureMode(1).setTargetAspectRatio(iL).setTargetRotation(rotation).build();
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setTargetAspectRatio(iL).setTargetRotation(rotation).setBackpressureStrategy(0).build();
        imageAnalysisBuild.setAnalyzer(this.e, new b());
        this.d.unbindAll();
        try {
            this.c = this.d.bindToLifecycle(this, cameraSelectorBuild, previewBuild, imageCaptureBuild, imageAnalysisBuild);
            previewBuild.setSurfaceProvider(this.b.getSurfaceProvider());
        } catch (Exception e) {
            Logger.e(g, "Use case binding failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(ActivityResult activityResult) {
        Uri data;
        Result resultE;
        Intent data2 = activityResult.getData();
        if (data2 == null || (data = data2.getData()) == null || (resultE = QRCodeDecoder.e(this, data)) == null || TextUtils.isEmpty(resultE.getText())) {
            return;
        }
        this.a = false;
        t(resultE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        com.huami.lib.qrcode.a.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(@NonNull View view) {
        if (view.getId() == R.id.iv_close) {
            finish();
            return;
        }
        if (view.getId() == R.id.btn_gallery) {
            if (!c.c(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                showPermissionDescriptionDialog();
            } else {
                Logger.d(g, "read external storage granted");
                gotoGallery();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean p(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        view.performClick();
        r(x, y);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void q(ListenableFuture listenableFuture) {
        try {
            this.d = (ProcessCameraProvider) listenableFuture.get();
            m();
        } catch (InterruptedException | ExecutionException e) {
            Logger.e(g, "get ProcessCameraProvider error", e);
        }
    }

    private void r(float f, float f2) {
        Camera camera = this.c;
        if (camera != null) {
            CameraInfo cameraInfo = camera.getCameraInfo();
            Display display = this.b.getDisplay();
            if (display == null) {
                display = getWindowManager().getDefaultDisplay();
            }
            this.c.getCameraControl().startFocusAndMetering(new FocusMeteringAction.Builder(new DisplayOrientedMeteringPointFactory(display, cameraInfo, this.b.getWidth(), this.b.getHeight()).createPoint(f, f2)).build());
        }
    }

    private void s(String[] strArr) {
        ActivityCompat.requestPermissions(this, strArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(@NonNull Result result) {
        Intent intent = new Intent();
        intent.putExtra("SCAN_RESULT", result.getText());
        intent.putExtra("SCAN_RESULT_FORMAT", result.getBarcodeFormat().toString());
        intent.putExtra("SCAN_RESULT_BYTES", result.getRawBytes());
        intent.putExtra(SCAN_RESULT_SOURCE, this.a);
        new BeepManager(this).playBeepSound();
        if (handleResult(intent)) {
            return;
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(this);
        processCameraProvider.addListener(new Runnable() { // from class: n56
            @Override // java.lang.Runnable
            public final void run() {
                this.a.q(processCameraProvider);
            }
        }, ContextCompat.getMainExecutor(this));
    }

    @Nullable
    public String getScanTips() {
        return null;
    }

    @CallSuper
    public void gotoGallery() {
        this.f.launch(new Intent(this, (Class<?>) QRCodeGalleryActivity.class));
    }

    public boolean handleResult(Intent intent) {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        CameraXExecutors.ioExecutor().execute(new Runnable() { // from class: m56
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o();
            }
        });
        setContentView(R.layout.activity_qrcode);
        getWindow().setFlags(512, 512);
        if (!TextUtils.isEmpty(getScanTips())) {
            ((ScannerView) findViewById(R.id.maskView)).setScanTips(getScanTips());
        }
        ((ImageView) findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: i56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onClick(view);
            }
        });
        if (shouldShowGalleryEntryPoint()) {
            TextView textView = (TextView) findViewById(R.id.btn_gallery);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: i56
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.onClick(view);
                }
            });
        }
        PreviewView previewView = (PreviewView) findViewById(R.id.viewFinder);
        this.b = previewView;
        previewView.setOnTouchListener(new View.OnTouchListener() { // from class: j56
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.p(view, motionEvent);
            }
        });
        if (c.c(this, "android.permission.CAMERA")) {
            this.b.post(new l56(this));
        } else {
            s(new String[]{"android.permission.CAMERA"});
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onDestroy() {
        super.onDestroy();
        this.e.shutdown();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onPause() {
        super.onPause();
    }

    public void onPermissionsDenied(int i, @NonNull List<String> list) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10) {
            if (c.c(this, "android.permission.CAMERA")) {
                this.b.post(new l56(this));
                return;
            } else {
                finish();
                return;
            }
        }
        if (i == 4165) {
            if (c.c(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                gotoGallery();
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                if (iArr[i2] != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            onPermissionsDenied(i, arrayList);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onResume() {
        super.onResume();
    }

    public boolean shouldShowGalleryEntryPoint() {
        return false;
    }

    public void showPermissionDescriptionDialog() {
    }
}
