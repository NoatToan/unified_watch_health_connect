package com.huami.assistant.ocr.camera;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huami.assistant.R;
import com.huami.assistant.ocr.crop.CropView;
import com.huami.assistant.ocr.crop.FrameOverlayView;
import com.huami.assistant.ocr.idcardquality.IDcardQualityProcess;
import com.huami.devicerecorder.UriGetter;
import com.huami.watch.ui.BaseActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CameraActivity extends BaseActivity {
    private static final int C = 100;
    public static final String CONTENT_TYPE_BANK_CARD = "bankCard";
    public static final String CONTENT_TYPE_GENERAL = "general";
    public static final String CONTENT_TYPE_ID_CARD_BACK = "IDCardBack";
    public static final String CONTENT_TYPE_ID_CARD_FRONT = "IDCardFront";
    public static final String CONTENT_TYPE_PASSPORT = "passport";
    private static final int D = 800;
    private static final int E = 801;
    public static final String KEY_CONTENT_TYPE = "contentType";
    public static final String KEY_NATIVE_ENABLE = "nativeEnable";
    public static final String KEY_NATIVE_MANUAL = "nativeEnableManual";
    public static final String KEY_NATIVE_TOKEN = "nativeToken";
    public static final String KEY_OUTPUT_FILE_PATH = "outputFilePath";
    public static final String KEY_SELECT_IMG_PATH = "selectImgPath";
    private File b;
    private String c;
    private Uri e;
    private boolean f;
    private boolean g;
    private View h;
    private View i;
    private OCRCameraLayout j;
    private CameraView k;
    private ImageView l;
    private CropView m;
    private FrameOverlayView n;
    private MaskView o;
    private View p;
    private View q;
    private View r;
    private ImageView s;
    private Handler d = new Handler();
    private PermissionCallback t = new PermissionCallback() { // from class: hj0
        @Override // com.huami.assistant.ocr.camera.PermissionCallback
        public final boolean onRequestPermission() {
            return this.a.E();
        }
    };
    private View.OnClickListener u = new View.OnClickListener() { // from class: fj0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.F(view);
        }
    };
    private CameraView.b v = new a();
    private CameraView.b w = new b();
    private View.OnClickListener x = new c();
    private View.OnClickListener y = new d();
    private View.OnClickListener z = new e();
    private View.OnClickListener A = new View.OnClickListener() { // from class: ej0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.G(view);
        }
    };
    private View.OnClickListener B = new f();

    public class a implements CameraView.b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bitmap bitmap) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(CameraActivity.this.b);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                bitmap.recycle();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent();
            intent.putExtra(CameraActivity.KEY_CONTENT_TYPE, CameraActivity.this.c);
            CameraActivity.this.setResult(-1, intent);
            CameraActivity.this.finish();
        }

        @Override // com.huami.assistant.ocr.camera.CameraView.b
        public void a(final Bitmap bitmap) {
            CameraThreadPool.execute(new Runnable() { // from class: com.huami.assistant.ocr.camera.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(bitmap);
                }
            });
        }
    }

    public class b implements CameraView.b {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bitmap bitmap) {
            CameraActivity.this.h.setVisibility(4);
            if (CameraActivity.this.o.getMaskType() == 0) {
                CameraActivity.this.m.setFilePath(CameraActivity.this.b.getAbsolutePath());
                CameraActivity.this.I();
            } else {
                if (CameraActivity.this.o.getMaskType() != 11) {
                    CameraActivity.this.l.setImageBitmap(bitmap);
                    CameraActivity.this.J();
                    return;
                }
                CameraActivity.this.m.setFilePath(CameraActivity.this.b.getAbsolutePath());
                CameraActivity.this.o.setVisibility(4);
                CameraActivity.this.n.setVisibility(0);
                CameraActivity.this.n.setTypeWide();
                CameraActivity.this.I();
            }
        }

        @Override // com.huami.assistant.ocr.camera.CameraView.b
        public void a(final Bitmap bitmap) {
            CameraActivity.this.d.post(new Runnable() { // from class: com.huami.assistant.ocr.camera.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(bitmap);
                }
            });
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            CameraActivity.this.k.takePicture(CameraActivity.this.b, CameraActivity.this.w);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (CameraActivity.this.e != null) {
                CameraActivity.this.finish();
            } else {
                CameraActivity.this.m.setFilePath(null);
                CameraActivity.this.K();
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            int maskType = CameraActivity.this.o.getMaskType();
            CameraActivity.this.l.setImageBitmap(CameraActivity.this.m.crop((maskType == 1 || maskType == 2 || maskType == 11) ? CameraActivity.this.o.getFrameRect() : CameraActivity.this.n.getFrameRect()));
            CameraActivity.this.w();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (CameraActivity.this.e != null) {
                CameraActivity.this.finish();
            } else {
                CameraActivity.this.l.setImageBitmap(null);
                CameraActivity.this.K();
            }
        }
    }

    private void A(final String token) {
        CameraNativeHelper.init(this, token, new CameraNativeHelper.CameraNativeInitCallback() { // from class: gj0
            @Override // com.huami.assistant.ocr.camera.CameraNativeHelper.CameraNativeInitCallback
            public final void onError(int i, Throwable th) {
                this.a.D(i, th);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void B() {
        int i;
        String stringExtra = getIntent().getStringExtra(KEY_OUTPUT_FILE_PATH);
        String stringExtra2 = getIntent().getStringExtra(KEY_NATIVE_TOKEN);
        this.f = getIntent().getBooleanExtra(KEY_NATIVE_ENABLE, true);
        boolean booleanExtra = getIntent().getBooleanExtra(KEY_NATIVE_MANUAL, false);
        this.g = booleanExtra;
        if (stringExtra2 == null && !booleanExtra) {
            this.f = false;
        }
        if (stringExtra != null) {
            this.b = new File(stringExtra);
        }
        String stringExtra3 = getIntent().getStringExtra(KEY_CONTENT_TYPE);
        this.c = stringExtra3;
        if (stringExtra3 == null) {
            this.c = CONTENT_TYPE_GENERAL;
        }
        String str = this.c;
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1859618964:
                if (str.equals(CONTENT_TYPE_BANK_CARD)) {
                    b2 = 2;
                }
                break;
            case -1070661090:
                if (str.equals(CONTENT_TYPE_ID_CARD_FRONT)) {
                    b2 = 0;
                }
                break;
            case -80148248:
                if (str.equals(CONTENT_TYPE_GENERAL)) {
                    b2 = 4;
                }
                break;
            case 242421330:
                if (str.equals(CONTENT_TYPE_ID_CARD_BACK)) {
                    b2 = 1;
                }
                break;
            case 1216777234:
                if (str.equals(CONTENT_TYPE_PASSPORT)) {
                    b2 = 3;
                }
                break;
        }
        if (b2 == 0) {
            this.n.setVisibility(4);
            if (this.f) {
                this.s.setVisibility(4);
            }
            i = 1;
        } else if (b2 == 1) {
            this.n.setVisibility(4);
            if (this.f) {
                this.s.setVisibility(4);
            }
            i = 2;
        } else if (b2 == 2) {
            i = 11;
            this.n.setVisibility(4);
        } else if (b2 != 3) {
            this.o.setVisibility(4);
            i = 0;
        } else {
            i = 21;
            this.n.setVisibility(4);
        }
        if ((i == 1 || i == 2) && this.f && !this.g) {
            A(stringExtra2);
        }
        this.k.setEnableScan(this.f);
        this.k.setMaskType(i, this);
        this.o.setMaskType(i);
        Uri uri = (Uri) getIntent().getParcelableExtra(KEY_SELECT_IMG_PATH);
        this.e = uri;
        if (uri == null) {
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            this.r.setVisibility(0);
        } else {
            this.m.setFilePath(z(uri));
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.b);
            ((BitmapDrawable) this.l.getDrawable()).getBitmap().compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        Intent intent = new Intent();
        intent.putExtra(KEY_CONTENT_TYPE, this.c);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(int i, Throwable th) {
        this.k.setInitNativeStatus(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 800);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 801);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType(UriGetter.ShareContentType.IMAGE);
        startActivityForResult(intent, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        y();
    }

    private void H(Configuration newConfig) {
        int i;
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        int i2 = newConfig.orientation;
        int i3 = 0;
        if (i2 == 1) {
            i = OCRCameraLayout.ORIENTATION_PORTRAIT;
        } else if (i2 != 2) {
            i = OCRCameraLayout.ORIENTATION_PORTRAIT;
            this.k.setOrientation(0);
        } else {
            i = OCRCameraLayout.ORIENTATION_HORIZONTAL;
            i3 = (rotation == 0 || rotation == 1) ? 90 : 270;
        }
        this.k.setOrientation(i3);
        this.j.setOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        this.k.getCameraControl().pause();
        this.h.setVisibility(4);
        this.j.setVisibility(4);
        this.i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        this.k.getCameraControl().pause();
        this.h.setVisibility(4);
        this.j.setVisibility(0);
        this.i.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.k.getCameraControl().resume();
        this.h.setVisibility(0);
        this.j.setVisibility(4);
        this.i.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.k.getCameraControl().pause();
        y();
    }

    private void x() {
        CameraThreadPool.cancelAutoFocusTimer();
        if (!this.f || this.g) {
            return;
        }
        IDcardQualityProcess.getInstance().releaseModel();
    }

    private void y() {
        CameraThreadPool.execute(new Runnable() { // from class: ij0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C();
            }
        });
    }

    private String z(Uri contentUri) {
        Cursor cursorQuery;
        try {
            cursorQuery = getContentResolver().query(contentUri, null, null, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            return contentUri.getPath();
        }
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
        cursorQuery.close();
        return string;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            if (resultCode != -1) {
                this.k.getCameraControl().resume();
                return;
            }
            this.m.setFilePath(z(data.getData()));
            I();
        }
    }

    public void onBackClick(View view) {
        onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        H(newConfig);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getParcelableExtra(KEY_SELECT_IMG_PATH) != null) {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.bd_ocr_activity_camera);
        this.h = findViewById(R.id.take_picture_container);
        this.j = (OCRCameraLayout) findViewById(R.id.confirm_result_container);
        CameraView cameraView = (CameraView) findViewById(R.id.camera_view);
        this.k = cameraView;
        cameraView.getCameraControl().setPermissionCallback(this.t);
        this.s = (ImageView) findViewById(R.id.take_photo_button);
        findViewById(R.id.album_button).setOnClickListener(this.u);
        this.s.setOnClickListener(this.x);
        this.l = (ImageView) findViewById(R.id.display_image_view);
        OCRCameraLayout oCRCameraLayout = this.j;
        int i = R.id.confirm_button;
        oCRCameraLayout.findViewById(i).setOnClickListener(this.A);
        OCRCameraLayout oCRCameraLayout2 = this.j;
        int i2 = R.id.cancel_button;
        oCRCameraLayout2.findViewById(i2).setOnClickListener(this.B);
        this.m = (CropView) findViewById(R.id.crop_view);
        this.i = findViewById(R.id.crop_container);
        this.n = (FrameOverlayView) findViewById(R.id.overlay_view);
        this.i.findViewById(i).setOnClickListener(this.z);
        this.o = (MaskView) this.i.findViewById(R.id.crop_mask_view);
        this.i.findViewById(i2).setOnClickListener(this.y);
        this.p = findViewById(R.id.action_bar_white);
        this.q = findViewById(R.id.action_bar_black);
        this.r = findViewById(R.id.crop_control_view);
        findViewById(R.id.title_crop_confirm).setOnClickListener(this.z);
        H(getResources().getConfiguration());
        B();
        this.k.setAutoPictureCallback(this.v);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.k.stop();
    }

    @Override // com.huami.watch.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 800) {
            return;
        }
        if (grantResults.length <= 0 || grantResults[0] != 0) {
            Toast.makeText(getApplicationContext(), R.string.camera_permission_required, 1).show();
        } else {
            this.k.getCameraControl().refreshPermission();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.k.start();
    }
}
