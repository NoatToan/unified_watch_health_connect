package com.garmin.android.apps.connectmobile.util.simplecropimage;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.media.FaceDetector;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.simplecropimage.CropImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import k32.n;
import l0.e;
import n22.d;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public class CropImage extends n22.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f47290w = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CropImageView f47300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ContentResolver f47301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f47302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f47303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f47306q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.CompressFormat f47291b = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f47292c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47293d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f47294e = new Handler();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f47307r = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.util.simplecropimage.a.b f47308t = new com.garmin.android.apps.connectmobile.util.simplecropimage.a.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f47309v = new a();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Matrix f47311b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47313d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f47310a = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FaceDetector.Face[] f47312c = new FaceDetector.Face[3];

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmapCreateBitmap;
            CropImage cropImage = CropImage.this;
            this.f47311b = cropImage.f47300k.getImageMatrix();
            Bitmap bitmap = cropImage.f47302m;
            if (bitmap == null || bitmap.isRecycled()) {
                bitmapCreateBitmap = null;
            } else {
                if (cropImage.f47302m.getWidth() > 256) {
                    this.f47310a = 256.0f / cropImage.f47302m.getWidth();
                }
                Matrix matrix = new Matrix();
                float f14 = this.f47310a;
                matrix.setScale(f14, f14);
                Bitmap bitmap2 = cropImage.f47302m;
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), cropImage.f47302m.getHeight(), matrix, true);
            }
            this.f47310a = 1.0f / this.f47310a;
            if (bitmapCreateBitmap != null) {
                int width = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                FaceDetector.Face[] faceArr = this.f47312c;
                this.f47313d = new FaceDetector(width, height, faceArr.length).findFaces(bitmapCreateBitmap, faceArr);
            }
            if (bitmapCreateBitmap != null && bitmapCreateBitmap != cropImage.f47302m) {
                bitmapCreateBitmap.recycle();
            }
            cropImage.f47294e.post(new n(this, 22));
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    public final void ca() {
        b bVar;
        int i14;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        if (this.f47305p || (bVar = this.f47306q) == null) {
            return;
        }
        this.f47305p = true;
        RectF rectF = bVar.f47334g;
        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(iWidth, iHeight, this.f47293d ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        if (bitmapCreateBitmap3 == null) {
            return;
        }
        Matrix matrix2 = null;
        new Canvas(bitmapCreateBitmap3).drawBitmap(this.f47302m, rect, new Rect(0, 0, iWidth, iHeight), (Paint) null);
        if (this.f47293d) {
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            Path path = new Path();
            float f14 = iWidth / 2.0f;
            path.addCircle(f14, iHeight / 2.0f, f14, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int i15 = this.f47297h;
        if (i15 != 0 && (i14 = this.f47298i) != 0) {
            if (this.f47299j) {
                Matrix matrix3 = new Matrix();
                int i16 = this.f47297h;
                int i17 = this.f47298i;
                boolean z14 = this.f47307r;
                int width = bitmapCreateBitmap3.getWidth() - i16;
                int height = bitmapCreateBitmap3.getHeight() - i17;
                if (z14 || (width >= 0 && height >= 0)) {
                    float width2 = bitmapCreateBitmap3.getWidth();
                    float height2 = bitmapCreateBitmap3.getHeight();
                    float f15 = i16;
                    float f16 = i17;
                    if (width2 / height2 > f15 / f16) {
                        float f17 = f16 / height2;
                        if (f17 < 0.9f || f17 > 1.0f) {
                            matrix3.setScale(f17, f17);
                            matrix2 = matrix3;
                        }
                    } else {
                        float f18 = f15 / width2;
                        if (f18 < 0.9f || f18 > 1.0f) {
                            matrix3.setScale(f18, f18);
                            matrix = matrix3;
                        }
                        if (matrix != null) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap3, 0, 0, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight(), matrix, true);
                        } else {
                            bitmapCreateBitmap = bitmapCreateBitmap3;
                        }
                        bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, Math.max(0, bitmapCreateBitmap.getWidth() - i16) / 2, Math.max(0, bitmapCreateBitmap.getHeight() - i17) / 2, i16, i17);
                        if (bitmapCreateBitmap != bitmapCreateBitmap3) {
                            bitmapCreateBitmap.recycle();
                        }
                    }
                    matrix = matrix2;
                    if (matrix != null) {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap3, 0, 0, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight(), matrix, true);
                    } else {
                        bitmapCreateBitmap = bitmapCreateBitmap3;
                    }
                    bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, Math.max(0, bitmapCreateBitmap.getWidth() - i16) / 2, Math.max(0, bitmapCreateBitmap.getHeight() - i17) / 2, i16, i17);
                    if (bitmapCreateBitmap != bitmapCreateBitmap3) {
                        bitmapCreateBitmap.recycle();
                    }
                } else {
                    Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap4);
                    int iMax = Math.max(0, width / 2);
                    int iMax2 = Math.max(0, height / 2);
                    Rect rect2 = new Rect(iMax, iMax2, Math.min(i16, bitmapCreateBitmap3.getWidth()) + iMax, Math.min(i17, bitmapCreateBitmap3.getHeight()) + iMax2);
                    int iWidth2 = (i16 - rect2.width()) / 2;
                    int iHeight2 = (i17 - rect2.height()) / 2;
                    canvas2.drawBitmap(bitmapCreateBitmap3, rect2, new Rect(iWidth2, iHeight2, i16 - iWidth2, i17 - iHeight2), (Paint) null);
                    bitmapCreateBitmap2 = bitmapCreateBitmap4;
                }
                if (bitmapCreateBitmap3 != bitmapCreateBitmap2) {
                    bitmapCreateBitmap3.recycle();
                }
                bitmapCreateBitmap3 = bitmapCreateBitmap2;
            } else {
                Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(i15, i14, Bitmap.Config.RGB_565);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap5);
                b bVar2 = this.f47306q;
                bVar2.getClass();
                RectF rectF2 = bVar2.f47334g;
                Rect rect3 = new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                Rect rect4 = new Rect(0, 0, this.f47297h, this.f47298i);
                int iWidth3 = (rect3.width() - rect4.width()) / 2;
                int iHeight3 = (rect3.height() - rect4.height()) / 2;
                rect3.inset(Math.max(0, iWidth3), Math.max(0, iHeight3));
                rect4.inset(Math.max(0, -iWidth3), Math.max(0, -iHeight3));
                canvas3.drawBitmap(this.f47302m, rect3, rect4, (Paint) null);
                bitmapCreateBitmap3.recycle();
                bitmapCreateBitmap3 = bitmapCreateBitmap5;
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || (extras.getParcelable("data") == null && !extras.getBoolean("return-data"))) {
            String string = getString(R.string.saving_image);
            e eVar = new e(12, this, bitmapCreateBitmap3);
            showProgressOverlay(string);
            new Thread(new n22.e(this, eVar, this.f47294e)).start();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", bitmapCreateBitmap3);
        setResult(-1, new Intent().setAction("inline-data").putExtras(bundle));
        finish();
    }

    @Override // n22.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int availableBlocks;
        String string;
        super.onCreate(bundle);
        this.f47301l = getContentResolver();
        setContentView(R.layout.cropimage);
        initActionBar(true, R.string.social_zoom_and_crop);
        this.f47300k = (CropImageView) findViewById(R.id.image);
        Bitmap bitmap = null;
        try {
            StatFs statFs = new StatFs(pi1.b.a(this, null).toString());
            availableBlocks = (int) ((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 400000.0f);
        } catch (Exception unused) {
            availableBlocks = -2;
        }
        if (availableBlocks == -1) {
            string = Environment.getExternalStorageState().equals("checking") ? getString(R.string.preparing_card) : getString(R.string.no_storage_card);
        } else {
            string = availableBlocks < 1 ? getString(R.string.not_enough_space) : null;
        }
        if (string != null) {
            Toast.makeText(this, string, 1).show();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.getString("circleCrop") != null) {
                this.f47300k.setLayerType(1, null);
                this.f47293d = true;
                this.f47295f = 1;
                this.f47296g = 1;
            }
            String string2 = extras.getString("image-path");
            this.f47303n = string2;
            this.f47292c = Uri.fromFile(new File(string2));
            String str = this.f47303n;
            Uri uriFromFile = Uri.fromFile(new File(str));
            try {
                InputStream inputStreamOpenInputStream = this.f47301l.openInputStream(uriFromFile);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                int i14 = options.outHeight;
                int iPow = (i14 > 1024 || options.outWidth > 1024) ? (int) Math.pow(2.0d, (int) Math.round(Math.log(1024.0d / ((double) Math.max(i14, options.outWidth))) / Math.log(0.5d))) : 1;
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = iPow;
                InputStream inputStreamOpenInputStream2 = this.f47301l.openInputStream(uriFromFile);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
                bitmap = bitmapDecodeStream;
            } catch (IOException unused2) {
                i2.i("CropImage", "file " + str + " not found");
            }
            this.f47302m = bitmap;
            if (!extras.containsKey("aspectX") || !(extras.get("aspectX") instanceof Integer)) {
                h.s("aspect_x must be integer");
                return;
            }
            this.f47295f = extras.getInt("aspectX");
            if (!extras.containsKey("aspectY") || !(extras.get("aspectY") instanceof Integer)) {
                h.s("aspect_y must be integer");
                return;
            }
            this.f47296g = extras.getInt("aspectY");
            this.f47297h = extras.getInt("outputX");
            this.f47298i = extras.getInt("outputY");
            this.f47299j = extras.getBoolean("scale", true);
            this.f47307r = extras.getBoolean("scaleUpIfNeeded", true);
        }
        if (this.f47302m == null) {
            i2.d("CropImage", "finish!!!");
            finish();
            return;
        }
        getWindow().addFlags(1024);
        final int i15 = 0;
        findViewById(R.id.rotateLeft).setOnClickListener(new View.OnClickListener(this) { // from class: n22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CropImage f122368b;

            {
                this.f122368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        CropImage cropImage = this.f122368b;
                        Bitmap bitmap2 = cropImage.f47302m;
                        Matrix matrix = new Matrix();
                        matrix.postRotate(-90.0f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                        cropImage.f47302m = bitmapCreateBitmap;
                        cropImage.f47300k.f(new d(bitmapCreateBitmap));
                        cropImage.f47309v.run();
                        break;
                    default:
                        CropImage cropImage2 = this.f122368b;
                        Bitmap bitmap3 = cropImage2.f47302m;
                        Matrix matrix2 = new Matrix();
                        matrix2.postRotate(90.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), matrix2, true);
                        cropImage2.f47302m = bitmapCreateBitmap2;
                        cropImage2.f47300k.f(new d(bitmapCreateBitmap2));
                        cropImage2.f47309v.run();
                        break;
                }
            }
        });
        final int i16 = 1;
        findViewById(R.id.rotateRight).setOnClickListener(new View.OnClickListener(this) { // from class: n22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CropImage f122368b;

            {
                this.f122368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        CropImage cropImage = this.f122368b;
                        Bitmap bitmap2 = cropImage.f47302m;
                        Matrix matrix = new Matrix();
                        matrix.postRotate(-90.0f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                        cropImage.f47302m = bitmapCreateBitmap;
                        cropImage.f47300k.f(new d(bitmapCreateBitmap));
                        cropImage.f47309v.run();
                        break;
                    default:
                        CropImage cropImage2 = this.f122368b;
                        Bitmap bitmap3 = cropImage2.f47302m;
                        Matrix matrix2 = new Matrix();
                        matrix2.postRotate(90.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), matrix2, true);
                        cropImage2.f47302m = bitmapCreateBitmap2;
                        cropImage2.f47300k.f(new d(bitmapCreateBitmap2));
                        cropImage2.f47309v.run();
                        break;
                }
            }
        });
        if (isFinishing()) {
            return;
        }
        CropImageView cropImageView = this.f47300k;
        Bitmap bitmap2 = this.f47302m;
        cropImageView.getClass();
        cropImageView.f(new d(bitmap2));
        n nVar = new n(this, 21);
        showProgressOverlay("Please wait…");
        new Thread(new n22.e(this, nVar, this.f47294e)).start();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_image, menu);
        return true;
    }

    @Override // n22.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.f47302m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f47302m = null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_item_done) {
            try {
                ca();
            } catch (Exception unused) {
                finish();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.garmin.android.apps.connectmobile.util.simplecropimage.a aVarB = com.garmin.android.apps.connectmobile.util.simplecropimage.a.b();
        com.garmin.android.apps.connectmobile.util.simplecropimage.a.b bVar = this.f47308t;
        synchronized (aVarB) {
            Iterator<Thread> it = bVar.iterator();
            while (it.hasNext()) {
                aVarB.a(it.next());
            }
        }
    }
}
