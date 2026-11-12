package com.huawei.pluginsocialshare.camera;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.view.WindowCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginsocialshare.R;
import defpackage.lrp;
import defpackage.pkm;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes15.dex */
public class MyCropActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClipImageLayout f22557c = null;
    private ImageView d;
    private ImageView e;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_clip_image);
        this.d = (ImageView) findViewById(R.id.iv_back);
        ImageView imageView = (ImageView) findViewById(R.id.tv_use);
        this.e = imageView;
        imageView.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.f22557c = (ClipImageLayout) findViewById(R.id.clipImageLayout);
        b();
        a();
    }

    private void a() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("Share_MyCropActivity", "intent null");
            finish();
            return;
        }
        String strC = CommonUtil.c(intent.getStringExtra(BleConstants.KEY_PATH));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("Share_MyCropActivity", "path null");
            finish();
            return;
        }
        this.f22557c.e(intent);
        int iE = e(strC);
        ReleaseLogUtil.e("Share_MyCropActivity", "initClipLayout degree:", Integer.valueOf(iE));
        Bitmap bitmapB = b(strC);
        if (bitmapB == null) {
            finish();
        } else if (iE == 0) {
            this.f22557c.setImageBitmap(bitmapB);
        } else {
            this.f22557c.setImageBitmap(a(iE, bitmapB));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.d) {
            finish();
        }
        if (view == this.e) {
            String strE = e(this.f22557c.a());
            Intent intent = new Intent();
            intent.putExtra("bitmap", strE);
            setResult(-1, intent);
            finish();
        }
    }

    private Bitmap b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (!(getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            LogUtil.a("Share_MyCropActivity", "windowManager=null");
            return null;
        }
        if (((WindowManager) getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().isWideColorGamut()) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        BitmapFactory.decodeFile(strC, options);
        int i = options.outHeight * options.outWidth * 2;
        int iA = pkm.a();
        int iCeil = (i <= iA || iA <= 0) ? 1 : (int) Math.ceil(i / iA);
        int iCeil2 = options.outWidth > 4032 ? (int) Math.ceil(options.outWidth / 4032) : 1;
        if (iCeil <= iCeil2) {
            iCeil = iCeil2;
        }
        options.inSampleSize = iCeil;
        LogUtil.a("Share_MyCropActivity", "inSampleSize:", Integer.valueOf(options.inSampleSize));
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = false;
        try {
            FileInputStream fileInputStream = new FileInputStream(strC);
            try {
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
                fileInputStream.close();
                return bitmapDecodeFileDescriptor;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException | OutOfMemoryError unused) {
            LogUtil.a("Share_MyCropActivity", "createBitmap Exception");
            return null;
        }
    }

    private String e(Bitmap bitmap) {
        File file = new File(lrp.g);
        String canonicalPath = null;
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j("Share_MyCropActivity", "saveBitmapToFile:mkdirs error");
            return null;
        }
        if (bitmap == null) {
            return null;
        }
        File file2 = new File(file, "MyCropActivity_cropImage.jpg");
        try {
            canonicalPath = file2.getCanonicalPath();
        } catch (IOException e) {
            LogUtil.j("Share_MyCropActivity", "getCanonicalPath", LogAnonymous.b(e));
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStreamOpenOutputStream);
                file2.deleteOnExit();
                fileOutputStreamOpenOutputStream.flush();
                if (fileOutputStreamOpenOutputStream != null) {
                    fileOutputStreamOpenOutputStream.close();
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            LogUtil.j("Share_MyCropActivity", "saveBitmapToFile:IOException ", LogAnonymous.b(e2));
        } catch (IllegalArgumentException e3) {
            LogUtil.j("Share_MyCropActivity", "saveBitmapToFile:IllegalArgumentException ", LogAnonymous.b(e3));
        }
        return canonicalPath;
    }

    private int e(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            ReleaseLogUtil.e("Share_MyCropActivity", "readBitmapDegree orientationRotate:", Integer.valueOf(attributeInt));
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            ReleaseLogUtil.a("Share_MyCropActivity", "IOException e:", e.getMessage());
        }
    }

    private Bitmap a(int i, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.a("Share_MyCropActivity", "rotateBitmap fail: IllegalArgumentException");
            return bitmap;
        } catch (OutOfMemoryError unused2) {
            ReleaseLogUtil.a("Share_MyCropActivity", "rotateBitmap fail: OutOfMemoryError");
            return bitmap;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
