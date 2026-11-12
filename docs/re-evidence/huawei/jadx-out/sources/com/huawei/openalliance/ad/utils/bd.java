package com.huawei.openalliance.ad.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bumptech.glide.Registry;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fi;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20480a = "bd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f20481b;

    public interface a {
        void a();

        void a(Drawable drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    private static Pair<Drawable, String> c(BitmapFactory.Options options, String str, Context context) {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        String str2;
        String str3;
        String str4;
        Uri uriFromFile;
        Pair<Drawable, String> pair;
        ContentResolver contentResolver;
        com.huawei.openalliance.ad.views.gif.b bVar;
        try {
            try {
                File fileB = ai.b(context, str, "normal");
                if (fileB == null || !ai.d(fileB)) {
                    fileB = ai.b(context, str, Constants.TPLATE_CACHE);
                }
                try {
                    if (!str.startsWith(Scheme.CONTENT.toString())) {
                        if (fileB == null) {
                            pair = new Pair<>(null, "File is null");
                            df.a((Closeable) null);
                        } else {
                            uriFromFile = Uri.fromFile(fileB);
                        }
                        df.a((Closeable) null);
                        return pair;
                    }
                    uriFromFile = Uri.parse(str);
                    if (a(inputStreamOpenInputStream2) == 4) {
                        if (str.startsWith(Scheme.CONTENT.toString())) {
                            bVar = new com.huawei.openalliance.ad.views.gif.b(context, str);
                        } else {
                            bVar = fileB != null ? new com.huawei.openalliance.ad.views.gif.b(context, fileB.getCanonicalPath()) : null;
                        }
                        Pair<Drawable, String> pair2 = new Pair<>(bVar, null);
                        df.a((Closeable) inputStreamOpenInputStream2);
                        pair = pair2;
                        df.a((Closeable) null);
                        return pair;
                    }
                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            hw.b(f20480a, "Image decode fail");
                            cn.a(context).b((Integer) 0);
                        }
                        Pair<Drawable, String> pair3 = new Pair<>(new BitmapDrawable(context.getResources(), bitmapDecodeStream), null);
                        df.a((Closeable) inputStreamOpenInputStream2);
                        df.a((Closeable) inputStreamOpenInputStream);
                        return pair3;
                    } catch (FileNotFoundException e) {
                        e = e;
                        str3 = f20480a;
                        str4 = "lfP " + e.getClass().getSimpleName();
                        str2 = "loadDiskImg FileNotFoundException";
                        str = inputStreamOpenInputStream;
                        hw.c(str3, str4);
                        df.a((Closeable) inputStreamOpenInputStream2);
                        df.a((Closeable) str);
                        return new Pair<>(null, str2);
                    } catch (Throwable th) {
                        th = th;
                        str2 = "loadDiskImg " + th.getClass().getSimpleName();
                        str3 = f20480a;
                        str4 = "lfP " + th.getClass().getSimpleName();
                        str = inputStreamOpenInputStream;
                        hw.c(str3, str4);
                        df.a((Closeable) inputStreamOpenInputStream2);
                        df.a((Closeable) str);
                        return new Pair<>(null, str2);
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    inputStreamOpenInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamOpenInputStream = null;
                }
                contentResolver = context.getContentResolver();
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uriFromFile);
            } catch (Throwable th3) {
                df.a((Closeable) inputStreamOpenInputStream2);
                df.a((Closeable) str);
                throw th3;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            inputStreamOpenInputStream = null;
            inputStreamOpenInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
            inputStreamOpenInputStream2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Drawable c(String str) {
        return bc.a().a(db.a(str));
    }

    public static String b(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str) || !str.contains("__source__")) {
            str2 = f20480a;
            str3 = "do not need dealUri";
        } else {
            Integer numAc = cn.a(context).ac();
            String str4 = (Build.VERSION.SDK_INT < 28 || (numAc != null ? numAc.intValue() : 1) != 1) ? "webp" : "heif";
            f20481b = str4;
            if (!TextUtils.isEmpty(str4)) {
                hw.b(f20480a, "dealUri replaceAll by replacedImageType %s", f20481b);
                return str.replaceAll("__source__", f20481b);
            }
            str2 = f20480a;
            str3 = "replacedImageType is null, return original url";
        }
        hw.b(str2, str3);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private static Pair<Drawable, String> b(BitmapFactory.Options options, String str, Context context) throws Throwable {
        InputStream inputStreamOpenRawResource;
        String str2;
        String str3;
        String str4;
        Resources resources = context.getResources();
        ?? r2 = 0;
        try {
            try {
                int i = Integer.parseInt(str.substring(Scheme.RES.toString().length()));
                inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    if (a(inputStreamOpenRawResource) == 4) {
                        Pair<Drawable, String> pair = new Pair<>(new com.huawei.openalliance.ad.views.gif.b(context, str), null);
                        df.a((Closeable) inputStreamOpenRawResource);
                        return pair;
                    }
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
                    if (bitmapDecodeResource == null) {
                        hw.b(f20480a, "Image decode fail");
                        cn.a(context).b((Integer) 0);
                    }
                    Pair<Drawable, String> pair2 = new Pair<>(new BitmapDrawable(context.getResources(), bitmapDecodeResource), null);
                    df.a((Closeable) inputStreamOpenRawResource);
                    return pair2;
                } catch (Resources.NotFoundException unused) {
                    str2 = f20480a;
                    str3 = "loadResImg Resources.NotFoundException";
                    str4 = "loadImage Resources.NotFoundException";
                    hw.c(str2, str4);
                    df.a((Closeable) inputStreamOpenRawResource);
                    return new Pair<>(null, str3);
                } catch (NumberFormatException unused2) {
                    str2 = f20480a;
                    str3 = "loadResImg NumberFormatException";
                    str4 = "loadImage NumberFormatException";
                    hw.c(str2, str4);
                    df.a((Closeable) inputStreamOpenRawResource);
                    return new Pair<>(null, str3);
                }
            } catch (Throwable th) {
                th = th;
                r2 = resources;
                df.a((Closeable) r2);
                throw th;
            }
        } catch (Resources.NotFoundException unused3) {
            inputStreamOpenRawResource = null;
        } catch (NumberFormatException unused4) {
            inputStreamOpenRawResource = null;
        } catch (Throwable th2) {
            th = th2;
            df.a((Closeable) r2);
            throw th;
        }
    }

    public static Bitmap b(Drawable drawable) {
        Bitmap bitmapA;
        if (drawable == null || (bitmapA = a(drawable)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, false);
    }

    private static void a(Drawable drawable, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
    }

    public static void a(final Context context, final String str, final a aVar, final ContentRecord contentRecord) {
        if (context != null) {
            context = context.getApplicationContext();
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bd.2
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                boolean z;
                if (hw.a()) {
                    hw.a(bd.f20480a, "load image, filePath:%s", ds.a(str));
                }
                Drawable drawableC = bd.c(str);
                if (drawableC == null) {
                    Pair<Drawable, String> pairA = bd.a(context, str);
                    Drawable drawable = (Drawable) pairA.first;
                    str2 = (String) pairA.second;
                    drawableC = drawable;
                } else {
                    str2 = null;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    if (drawableC != null) {
                        aVar2.a(drawableC);
                        return;
                    }
                    boolean z2 = false;
                    boolean z3 = !dg.b(str) && ai.c(context, str, "normal");
                    if (z3) {
                        z = z3;
                    } else {
                        if (!dg.b(str) && ai.c(context, str, Constants.TPLATE_CACHE)) {
                            z2 = true;
                        }
                        z = z2;
                    }
                    aVar.a();
                    if (contentRecord != null) {
                        new com.huawei.openalliance.ad.analysis.c(context).a(str, -1, str2, contentRecord, z);
                    }
                }
            }
        });
    }

    public static void a(Context context, String str, a aVar) {
        a(context, str, aVar, null);
    }

    public static void a(final Context context, final sn snVar, final a aVar) {
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bd.1
            @Override // java.lang.Runnable
            public void run() {
                so soVarA = fi.a(context.getApplicationContext()).a(snVar);
                if (soVarA != null && !dg.b(soVarA.a())) {
                    bd.a(context, soVarA.a(), aVar);
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private static Pair<Drawable, String> a(BitmapFactory.Options options, String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        String strSubstring = str.substring(Scheme.ASSET.toString().length());
        ?? r2 = 0;
        try {
            try {
                inputStreamOpen = context.getAssets().open(strSubstring);
                try {
                    if (a(inputStreamOpen) == 4) {
                        Pair<Drawable, String> pair = new Pair<>(new com.huawei.openalliance.ad.views.gif.b(context, str), null);
                        df.a((Closeable) inputStreamOpen);
                        return pair;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                    if (bitmapDecodeStream == null) {
                        hw.b(f20480a, "Image decode fail");
                        cn.a(context).b((Integer) 0);
                    }
                    Pair<Drawable, String> pair2 = new Pair<>(new BitmapDrawable(context.getResources(), bitmapDecodeStream), null);
                    df.a((Closeable) inputStreamOpen);
                    return pair2;
                } catch (IOException unused) {
                    hw.c(f20480a, "loadAssetImg IOException");
                    df.a((Closeable) inputStreamOpen);
                    return new Pair<>(null, "loadAssetImg IOException");
                }
            } catch (Throwable th) {
                th = th;
                r2 = strSubstring;
                df.a((Closeable) r2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            df.a((Closeable) r2);
            throw th;
        }
    }

    public static Pair<Drawable, String> a(Context context, String str) {
        String str2;
        Drawable drawable;
        Pair<Drawable, String> pairC;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Drawable drawable2 = null;
        try {
            options.inJustDecodeBounds = false;
            if (str.startsWith(Scheme.RES.toString())) {
                pairC = b(options, str, context);
                drawable = (Drawable) pairC.first;
            } else if (str.startsWith(Scheme.ASSET.toString())) {
                pairC = a(options, str, context);
                drawable = (Drawable) pairC.first;
            } else {
                pairC = c(options, str, context);
                drawable = (Drawable) pairC.first;
            }
            try {
                str2 = (String) pairC.second;
            } catch (OutOfMemoryError unused) {
                drawable2 = drawable;
                hw.c(f20480a, "OutOfMemoryError when read image");
                str2 = "OOM read image";
                drawable = drawable2;
            } catch (Throwable th) {
                th = th;
                drawable2 = drawable;
                str2 = "loadImageFromDisk " + th.getClass().getSimpleName();
                hw.c(f20480a, "loadImage err: " + str2);
                drawable = drawable2;
            }
        } catch (OutOfMemoryError unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (drawable != null) {
            bc.a().a(db.a(str), drawable);
        }
        return new Pair<>(drawable, str2);
    }

    public static Rect a(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Rect(0, 0, options.outWidth, options.outHeight);
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            hw.b(f20480a, Registry.BUCKET_BITMAP_DRAWABLE);
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 1;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth > 0 ? intrinsicWidth : 1, intrinsicHeight, Bitmap.Config.ARGB_8888);
        a(drawable, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    private static int a(InputStream inputStream) {
        try {
            String strA = ai.a(inputStream);
            if (Constants.GIF_HEADER_HEX.equals(strA)) {
                return 4;
            }
            return strA != null ? 2 : 100;
        } catch (Resources.NotFoundException unused) {
            hw.d(f20480a, "resId is not found");
            return 100;
        }
    }
}
