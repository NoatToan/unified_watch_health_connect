package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.media3.common.C;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import com.huawei.ui.commonui.utils.TagResourcePolicy;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes16.dex */
public class qqf {
    public static final int e = (int) BaseApplication.b().getResources().getDimension(R.dimen.defaultCornerRadiusS);
    public static final int d = (int) BaseApplication.b().getResources().getDimension(R.dimen.cardCornerRadius);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f46647a = (int) BaseApplication.b().getResources().getDimension(R.dimen.iconCornerRadius);

    public static int a(int i) {
        return -1;
    }

    private static boolean b(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public static Bitmap e(View view) {
        Bitmap bitmapCreateBitmap = null;
        if (view == null) {
            ReleaseLogUtil.d("CommonUI_BitmapUtils", "captureViewByCache view is null");
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            ReleaseLogUtil.d("CommonUI_BitmapUtils", "captureViewByCache drawingCache is null");
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    public static Bitmap c(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapByBytes data == null");
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static byte[] a(Bitmap bitmap, boolean z) {
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "bitmapToByteArray sourceBitmap is null or recycled");
            return null;
        }
        return a(bitmap, 100, z);
    }

    private static byte[] a(Bitmap bitmap, int i, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(i == 100 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            LogUtil.e("CommonUI_BitmapUtils", "bitmapToByteArray IOException");
            return byteArray;
        }
    }

    public static Bitmap e(Bitmap bitmap, int i, Bitmap bitmap2, int i2) {
        if (bitmap == null || bitmap2 == null) {
            LogUtil.j("CommonUI_BitmapUtils", "mergeBitmap:firstBmp/secondBmp is null!");
            return bitmap;
        }
        Bitmap bitmap3 = null;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap2.getHeight() + i2, bitmap.getConfig());
            try {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawBitmap(bitmap, 0.0f, i, (Paint) null);
                canvas.drawBitmap(bitmap2, 0.0f, i2, (Paint) null);
                return bitmapCreateBitmap;
            } catch (IllegalArgumentException | OutOfMemoryError unused) {
                bitmap3 = bitmapCreateBitmap;
                LogUtil.j("CommonUI_BitmapUtils", "mergeBitmap:IllegalArgumentException|OutOfMemoryError!");
                return bitmap3;
            }
        } catch (IllegalArgumentException | OutOfMemoryError unused2) {
        }
    }

    private static Bitmap d(Bitmap bitmap, Bitmap bitmap2, Context context, int i) {
        if (bitmap != null && !bitmap.isRecycled() && bitmap2 != null && !bitmap2.isRecycled()) {
            float f = context.getResources().getDisplayMetrics().density;
            try {
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                float f2 = i;
                new Canvas(bitmapCopy).drawBitmap(bitmap2, qrs.d(context, f2), (bitmap.getHeight() - (f2 * f)) - bitmap2.getHeight(), (Paint) null);
                return bitmapCopy;
            } catch (OutOfMemoryError unused) {
                LogUtil.e("CommonUI_BitmapUtils", "mergeBitmap OutOfMemoryError");
            }
        }
        return bitmap;
    }

    public static Bitmap e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "decodeFromFile() pathName is empty.");
            return null;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("CommonUI_BitmapUtils", "decodeFromFile() filePath is empty.");
            return null;
        }
        return b(new File(strC));
    }

    public static Bitmap b(File file) {
        try {
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException unused) {
            LogUtil.j("CommonUI_BitmapUtils", "Make the canonical path error");
            return null;
        } catch (OutOfMemoryError unused2) {
            LogUtil.j("CommonUI_BitmapUtils", "Decode bitmap OutOfMemoryError");
            return null;
        }
    }

    public static String e(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (bitmap == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "bitmap == null or fileName is empty");
            return str;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File fileB = b(str, z);
                bufferedOutputStream = new BufferedOutputStream(FileUtils.openOutputStream(fileB));
                try {
                    bitmap.compress(compressFormat, 100, bufferedOutputStream);
                    String canonicalPath = fileB.getCanonicalPath();
                    a(bufferedOutputStream);
                    return canonicalPath;
                } catch (IOException unused) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    LogUtil.j("CommonUI_BitmapUtils", "saveBitmap IOException");
                    a(bufferedOutputStream2);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    a(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (IOException unused2) {
        }
    }

    public static Bitmap a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "fileName is empty");
            return null;
        }
        try {
            return h(b(str, z).getCanonicalPath());
        } catch (IOException unused) {
            LogUtil.j("CommonUI_BitmapUtils", "readBitmap IOException");
            return null;
        }
    }

    public static boolean c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "fileName is empty");
            return false;
        }
        try {
            return b(str, z).delete();
        } catch (IOException unused) {
            LogUtil.j("CommonUI_BitmapUtils", "clearBitmap IOException");
            return false;
        }
    }

    public static Bitmap h(String str) {
        return BitmapFactory.decodeFile(str);
    }

    private static File b(String str, boolean z) throws IOException {
        Context contextB = BaseApplication.b();
        File canonicalFile = new File(z ? contextB.getCacheDir() : contextB.getFilesDir(), "save_bitmap" + File.separator + str).getCanonicalFile();
        File parentFile = canonicalFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            LogUtil.j("CommonUI_BitmapUtils", "mkdirs file error");
        }
        return canonicalFile;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                LogUtil.e("CommonUI_BitmapUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static Bitmap d(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("CommonUI_BitmapUtils", "decodeSampledBitmapFromBytes fileName is empty.");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = d(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (OutOfMemoryError e2) {
            LogUtil.e("CommonUI_BitmapUtils", "decodeSampledBitmapFromBytes", ExceptionUtils.c(e2));
            return null;
        }
    }

    private static int d(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i2 <= 0 || i <= 0) {
            return 1;
        }
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int iMin = Math.min(Math.round(i3 / i2), Math.round(i4 / i));
        while ((i4 * i3) / (iMin * iMin) > i * i2 * 2) {
            iMin++;
        }
        return iMin;
    }

    public static byte[] b(Bitmap bitmap, boolean z) {
        byte[] bArr = null;
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "getByteArrayOfThumbBitmap() sourceBitmap = null!");
            return null;
        }
        Bitmap bitmapB = b(bitmap);
        if (bitmapB == null) {
            LogUtil.j("CommonUI_BitmapUtils", "getByteArrayOfThumbBitmap() sourceBitmap == null!");
        } else {
            int i = 100;
            int i2 = 0;
            int i3 = 0;
            int i4 = 100;
            while (true) {
                i2++;
                byte[] bArrA = a(bitmapB, i, false);
                if (i2 == 1 && bArrA.length < 27648) {
                    bArr = bArrA;
                    break;
                }
                int i5 = i - i3;
                if (i5 <= 10) {
                    break;
                }
                if (bArrA.length >= 27648) {
                    i4 = i;
                    i -= i5 / 2;
                } else {
                    i3 = i;
                    i = ((i4 - i) / 2) + i;
                    bArr = bArrA;
                }
            }
            if (z) {
                bitmap.recycle();
            }
        }
        if (bArr != null) {
            LogUtil.a("CommonUI_BitmapUtils", "getByteArrayOfThumbBitmap() result size = ", Integer.valueOf(bArr.length));
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[PHI: r9
      0x0050: PHI (r9v5 double) = (r9v3 double), (r9v8 double) binds: [B:12:0x004d, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    private static Bitmap b(Bitmap bitmap) {
        double d2;
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "extractMaxThumbNail() sourceBitmap == null!");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        LogUtil.a("CommonUI_BitmapUtils", "extractMaxThumbNail() original width : ", Integer.valueOf(width), " original height : ", Integer.valueOf(height), "size = ", Integer.valueOf(bitmap.getByteCount()));
        double d3 = 1.0d;
        if (height > width) {
            d2 = (((double) height) * 1.0d) / 600.0d;
            if (4.0d * d2 > 1.0d) {
                d3 = d2;
            }
        } else {
            d2 = (((double) width) * 1.0d) / 600.0d;
            if (4.0d * d2 > 1.0d) {
                d3 = d2;
            }
        }
        int i = (int) (((double) height) / d3);
        int i2 = (int) (((double) width) / d3);
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i2, i);
        LogUtil.a("CommonUI_BitmapUtils", "extractMaxThumbNail() after width : ", Integer.valueOf(i2), " original height : ", Integer.valueOf(i), "size = ", Integer.valueOf(bitmap.getByteCount()));
        return bitmapExtractThumbnail;
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "scaleThumbBitmap sourceBitmap null");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateScaledBitmap = bitmap;
        while (true) {
            if (width > i || height > i2 || bitmapCreateScaledBitmap.getByteCount() > 32768) {
                LogUtil.a("CommonUI_BitmapUtils", "scaleThumbBitmap error bitmap too big , width = ", Integer.valueOf(width), " height = ", Integer.valueOf(height), "bytecount = ", Integer.valueOf(bitmapCreateScaledBitmap.getByteCount()));
                width = (int) ((((double) width) / Math.sqrt(2.0d)) + 0.5d);
                height = (int) ((((double) height) / Math.sqrt(2.0d)) + 0.5d);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            } else {
                LogUtil.a("CommonUI_BitmapUtils", "scaleThumbBitmap picture size = ", Integer.valueOf(bitmapCreateScaledBitmap.getByteCount()), "width = ", Integer.valueOf(width), " height = ", Integer.valueOf(height));
                return bitmapCreateScaledBitmap;
            }
        }
    }

    @Deprecated
    public static void e(String str, ImageView imageView) {
        a(str, imageView);
    }

    public static void b(String str, HealthImageView healthImageView) {
        a(str, healthImageView);
    }

    private static void a(String str, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(str).into(imageView);
    }

    @Deprecated
    public static void d(int i, ImageView imageView) {
        a(i, imageView);
    }

    private static void a(int i, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(Integer.valueOf(i)).into(imageView);
    }

    @Deprecated
    public static void a(File file, ImageView imageView) {
        e(file, imageView);
    }

    public static void d(File file, HealthImageView healthImageView) {
        e(file, healthImageView);
    }

    private static void e(File file, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(file).into(imageView);
    }

    @Deprecated
    public static void e(Drawable drawable, ImageView imageView) {
        c(drawable, imageView);
    }

    private static void c(Drawable drawable, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(drawable).into(imageView);
    }

    @Deprecated
    public static void e(String str, RequestOptions requestOptions, ImageView imageView) {
        d(str, requestOptions, imageView);
    }

    public static void a(String str, RequestOptions requestOptions, HealthImageView healthImageView) {
        d(str, requestOptions, healthImageView);
    }

    private static void d(String str, RequestOptions requestOptions, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
    }

    @Deprecated
    public static void c(File file, RequestOptions requestOptions, ImageView imageView) {
        e(file, requestOptions, imageView);
    }

    private static void e(File file, RequestOptions requestOptions, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(file).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
    }

    @Deprecated
    public static void d(int i, RequestOptions requestOptions, ImageView imageView) {
        a(i, requestOptions, imageView);
    }

    private static void a(int i, RequestOptions requestOptions, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(Integer.valueOf(i)).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
    }

    public static void b(String str, Target<Drawable> target) {
        Glide.with(d()).load(str).into(target);
    }

    public static void e(Drawable drawable, Target<Drawable> target) {
        Glide.with(d()).load(drawable).into(target);
    }

    public static void a(String str, RequestOptions requestOptions, Target<Drawable> target) {
        Glide.with(d()).load(str).apply((BaseRequestOptions<?>) requestOptions).into(target);
    }

    @Deprecated
    public static void c(String str, RequestOptions requestOptions, float f, DrawableTransitionOptions drawableTransitionOptions, ImageView imageView) {
        b(str, requestOptions, f, drawableTransitionOptions, imageView);
    }

    private static void b(String str, RequestOptions requestOptions, float f, DrawableTransitionOptions drawableTransitionOptions, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) requestOptions).thumbnail(f).transition(drawableTransitionOptions).into(imageView);
    }

    public static void a(String str, Target<Bitmap> target) {
        Glide.with(d()).asBitmap().load(str).into(target);
    }

    @Deprecated
    public static void c(String str, RequestOptions requestOptions, RequestListener<Drawable> requestListener, ImageView imageView, boolean z) {
        d(str, requestOptions, requestListener, imageView, z);
    }

    private static void d(String str, RequestOptions requestOptions, RequestListener<Drawable> requestListener, ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) requestOptions).listener(requestListener).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
        } else {
            Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) requestOptions).addListener(requestListener).into(imageView);
        }
    }

    public static void b(String str, RequestOptions requestOptions, ImageView imageView) {
        a(str, requestOptions, imageView, (Drawable) null, (RequestListener<GifDrawable>) null);
    }

    public static void a(String str, RequestOptions requestOptions, ImageView imageView, Drawable drawable, RequestListener<GifDrawable> requestListener) {
        if (imageView == null) {
            return;
        }
        Glide.with(b(imageView)).asGif().load(str).placeholder(drawable).apply((BaseRequestOptions<?>) requestOptions).listener(requestListener).set(GifOptions.DECODE_FORMAT, DecodeFormat.PREFER_ARGB_8888).into(imageView);
    }

    public static void e(int i, HealthImageView healthImageView) {
        e(i, (ImageView) healthImageView);
    }

    private static void e(int i, ImageView imageView) {
        if (imageView == null || i == 0) {
            LogUtil.a("CommonUI_BitmapUtils", "imageView is null");
        } else {
            LogUtil.a("CommonUI_BitmapUtils", "loadLocalImageAsGif");
            Glide.with(b(imageView)).asGif().load(Integer.valueOf(i)).into(imageView);
        }
    }

    public static void c(Context context, String str, RequestOptions requestOptions, RequestListener<Drawable> requestListener) {
        Glide.with(b(context)).load(str).apply((BaseRequestOptions<?>) requestOptions).listener(requestListener).preload();
    }

    public static void d(Context context, String str) {
        Glide.with(b(context)).load(str).diskCacheStrategy(DiskCacheStrategy.DATA).preload();
    }

    public static void g(String str) {
        try {
            Glide.with(BaseApplication.b()).load(str).diskCacheStrategy(DiskCacheStrategy.DATA).preload();
        } catch (IllegalStateException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "preload exception url: " + str + ", IllegalStateException " + ExceptionUtils.c(e2));
        }
    }

    public static void a(Context context, View view) {
        Glide.with(b(context)).clear(view);
    }

    @Deprecated
    public static void c(String str, ImageView imageView) {
        b(str, imageView);
    }

    private static void b(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        if (CommonUtil.ca()) {
            Glide.with(b(imageView)).load("file:///android_asset/suggestion/img/" + str).into(imageView);
            return;
        }
        Glide.with(b(imageView)).load("file:///android_asset/img/" + str).into(imageView);
    }

    @Deprecated
    public static void b(String str, int i, int i2, ImageView imageView) {
        a(str, i, i2, imageView);
    }

    private static void a(String str, int i, int i2, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        RequestOptions requestOptionsCenterCrop = new RequestOptions().override(i, i2).centerCrop();
        if (str.startsWith("http")) {
            Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) requestOptionsCenterCrop).into(imageView);
            return;
        }
        if (CommonUtil.ca()) {
            Glide.with(b(imageView)).load("file:///android_asset/suggestion/img/" + str).apply((BaseRequestOptions<?>) requestOptionsCenterCrop).into(imageView);
            return;
        }
        Glide.with(b(imageView)).load("file:///android_asset/img/" + str).apply((BaseRequestOptions<?>) requestOptionsCenterCrop).into(imageView);
    }

    @Deprecated
    public static void d(String str, ImageView imageView) {
        f(str, imageView);
    }

    private static void f(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        if (str.startsWith("http")) {
            Glide.with(b(imageView)).load(str).into(imageView);
            return;
        }
        if (CommonUtil.ca()) {
            Glide.with(b(imageView)).load("file:///android_asset/suggestion/img/" + str).into(imageView);
            return;
        }
        Glide.with(b(imageView)).load("file:///android_asset/img/" + str).into(imageView);
    }

    @Deprecated
    public static void e(Uri uri, ImageView imageView) {
        b(uri, imageView);
    }

    private static void b(Uri uri, ImageView imageView) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "setRoundImageUrl imageView is null");
            return;
        }
        if (CommonUtil.ca()) {
            Glide.with(b(imageView)).load("file:///android_asset/suggestion/img/" + uri).apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform()).into(imageView);
            return;
        }
        Glide.with(b(imageView)).load(uri).apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform()).into(imageView);
    }

    public static Bitmap a(Drawable drawable) {
        return d(drawable, 0);
    }

    public static Bitmap d(Drawable drawable, int i) {
        Bitmap bitmapCreateBitmap = null;
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicHeight = i;
        } else {
            i = intrinsicWidth;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            drawable.setBounds(0, 0, i, intrinsicHeight);
            drawable.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            LogUtil.e("CommonUI_BitmapUtils", "drawableToBitmap() ", ExceptionUtils.c(e2));
            return bitmapCreateBitmap;
        }
    }

    public static Drawable d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(bitmap);
    }

    private static int[] c(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return new int[]{-7829368, -7829368};
        }
        if (iArr.length != 1) {
            return iArr;
        }
        int i = iArr[0];
        return new int[]{i, i};
    }

    public static Drawable c(Drawable drawable, int i) {
        Drawable drawableB = b(drawable);
        DrawableCompat.setTint(drawableB, i);
        return drawableB;
    }

    private static Drawable b(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        return DrawableCompat.wrap(drawable).mutate();
    }

    public static Bitmap b(Bitmap bitmap, int[] iArr, boolean z) {
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "linearGradientBitmap source is null or is recycled");
            return bitmap;
        }
        try {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
                int width = bitmapCopy.getWidth();
                int height = bitmapCopy.getHeight();
                if (width > 0 && height > 0) {
                    Paint paint = new Paint();
                    if (z) {
                        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, c(iArr), (float[]) null, Shader.TileMode.CLAMP));
                    } else {
                        paint.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, c(iArr), (float[]) null, Shader.TileMode.CLAMP));
                    }
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    new Canvas(bitmapCopy).drawRect(0.0f, 0.0f, width, height, paint);
                    return bitmapCopy;
                }
                LogUtil.j("CommonUI_BitmapUtils", "linearGradientBitmap width or height less than or equal to zero");
                return bitmapCopy;
            }
            LogUtil.j("CommonUI_BitmapUtils", "linearGradientBitmap bitmap is null or is recycled");
            return bitmap;
        } catch (OutOfMemoryError unused) {
            LogUtil.e("CommonUI_BitmapUtils", "linearGradientBitmap outOfMemoryError");
            return bitmap;
        }
    }

    public static Bitmap c(Bitmap bitmap, float f) {
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "zoomBitmap bitmap is null or is recycled");
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmapCreateBitmap != null) {
                return bitmapCreateBitmap;
            }
            LogUtil.j("CommonUI_BitmapUtils", "zoomBitmap zoomBitmap is null");
            return bitmap;
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            LogUtil.e("CommonUI_BitmapUtils", "zoomBitmap exception happened ", ExceptionUtils.c(e2));
            return bitmap;
        }
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "zoomBitmap bitmap is null or is recycled");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            LogUtil.j("CommonUI_BitmapUtils", "zoomBitmap bitmapWidth or bitmapHeight less than or equal to zero");
            return bitmap;
        }
        if (i <= 0) {
            i = width;
        }
        if (i2 <= 0) {
            i2 = height;
        }
        return c(bitmap, Math.max(i / width, i2 / height));
    }

    @Deprecated
    public static Bitmap e(Bitmap bitmap, ImageView imageView) {
        return a(bitmap, imageView);
    }

    public static Bitmap a(Bitmap bitmap, HealthImageView healthImageView) {
        return a(bitmap, (ImageView) healthImageView);
    }

    private static Bitmap a(Bitmap bitmap, ImageView imageView) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "zoomBitmap imageView is null");
            return bitmap;
        }
        int[] iArr = {0, 0};
        return !b(imageView, iArr) ? bitmap : c(bitmap, iArr[0], iArr[1]);
    }

    @Deprecated
    public static boolean b(ImageView imageView, int[] iArr) {
        return e(imageView, iArr);
    }

    private static boolean e(ImageView imageView, int[] iArr) {
        if (imageView == null || iArr == null) {
            LogUtil.e("CommonUI_BitmapUtils", "imageview or array is invalid");
            return false;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (!b(width, height)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                return false;
            }
            width = layoutParams.width;
            height = layoutParams.height;
            if (!b(width, height)) {
                LogUtil.e("CommonUI_BitmapUtils", "get imageView width or height fail");
                return false;
            }
        }
        iArr[0] = width;
        iArr[1] = height;
        return true;
    }

    private static boolean a(Bitmap bitmap, int[] iArr) {
        if (bitmap == null || bitmap.isRecycled() || iArr == null) {
            LogUtil.e("CommonUI_BitmapUtils", "bitmap or array is invalid");
            return false;
        }
        if (!b(bitmap.getWidth(), bitmap.getHeight())) {
            LogUtil.e("CommonUI_BitmapUtils", "get bitmap width or height fail");
            return false;
        }
        iArr[0] = bitmap.getWidth();
        iArr[1] = bitmap.getHeight();
        return true;
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "cropBitmap bitmap is null or is recycled");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        switch (i3) {
            case 1:
                i4 = 0;
                i5 = 0;
                break;
            case 2:
                i6 = height - i2;
                i5 = i6;
                i4 = 0;
                break;
            case 3:
                i4 = width - i;
                i5 = 0;
                break;
            case 4:
                i4 = width - i;
                i5 = height - i2;
                break;
            case 5:
                i6 = (int) ((height - i2) / 2.0f);
                i5 = i6;
                i4 = 0;
                break;
            case 6:
                i4 = width - i;
                i5 = (int) ((height - i2) / 2.0f);
                break;
            default:
                i4 = (int) ((width - i) / 2.0f);
                i5 = (int) ((height - i2) / 2.0f);
                break;
        }
        if (i2 > height) {
            i2 = height;
            i5 = 0;
        }
        if (i > width) {
            i = width;
            i4 = 0;
        }
        if (i4 < 0 || i5 < 0) {
            LogUtil.j("CommonUI_BitmapUtils", "originHorizontal or originVertical < 0");
            return bitmap;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i4, i5, i, i2);
            if (bitmapCreateBitmap != null) {
                return bitmapCreateBitmap;
            }
            LogUtil.j("CommonUI_BitmapUtils", "cropBitmap cropBitmap is null");
            return bitmap;
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            LogUtil.e("CommonUI_BitmapUtils", "cropBitmap throwable=", ExceptionUtils.c(e2));
            return bitmap;
        }
    }

    @Deprecated
    public static Bitmap a(Bitmap bitmap, ImageView imageView, int i) {
        return c(bitmap, imageView, i);
    }

    private static Bitmap c(Bitmap bitmap, ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "cropBitmap imageView is null");
            return bitmap;
        }
        int[] iArr = {0, 0};
        return !b(imageView, iArr) ? bitmap : c(bitmap, iArr[0], iArr[1], i);
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null) {
            return null;
        }
        return Bitmap.createBitmap(bitmap.copy(bitmap.getConfig(), true), i, i2, i3, i4);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null || bitmap.isRecycled() || !b(i, i2)) {
            LogUtil.j("CommonUI_BitmapUtils", "roundRectangleBitmap fail, isBitmapNull: ", Boolean.valueOf(bitmap == null), ", isRecycled: ", bitmap == null ? Constants.NULL : Boolean.valueOf(bitmap.isRecycled()), ", isWidthHeightValid: ", Boolean.valueOf(b(i, i2)));
            return bitmap;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (bitmapCreateBitmap == null) {
                LogUtil.j("CommonUI_BitmapUtils", "roundRectangleBitmap roundRectangleBitmap is null");
                return bitmap;
            }
            Paint paint = new Paint();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            paint.setAntiAlias(true);
            paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            RectF rectF = new RectF(new Rect(0, 0, i, i2));
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setFilterBitmap(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            LogUtil.e("CommonUI_BitmapUtils", "roundRectangleBitmap outOfMemoryError");
            return bitmap;
        }
    }

    @Deprecated
    public static void d(ImageView imageView, Bitmap bitmap, int i) {
        a(imageView, bitmap, i);
    }

    private static void a(ImageView imageView, Bitmap bitmap, int i) {
        if (imageView == null || bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "imageView or bitmap is null");
            return;
        }
        int[] iArr = {0, 0};
        if (bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "roundRectangleBitmap bitmap is recycled");
            return;
        }
        if (!b(imageView, iArr) && !a(bitmap, iArr)) {
            imageView.setImageBitmap(bitmap);
            LogUtil.j("CommonUI_BitmapUtils", "get imageview height/width fail");
            return;
        }
        try {
            if (Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888) == null) {
                LogUtil.j("CommonUI_BitmapUtils", "roundRectangleBitmap roundRectangleBitmap is null");
                return;
            }
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(BaseApplication.b().getResources(), bitmap);
            roundedBitmapDrawableCreate.setCornerRadius(i);
            roundedBitmapDrawableCreate.setAntiAlias(true);
            qsp.a(imageView, roundedBitmapDrawableCreate);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("CommonUI_BitmapUtils", "roundRectangleBitmap outOfMemoryError");
        }
    }

    @Deprecated
    public static void e(ImageView imageView, Bitmap bitmap, int i, int i2) {
        b(imageView, bitmap, i, i2);
    }

    private static void b(ImageView imageView, Bitmap bitmap, int i, int i2) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "roundRectangleBitmap imageView is null");
        } else {
            d(imageView, a(e(bitmap, imageView), imageView, i2), i);
        }
    }

    @Deprecated
    public static void a(ImageView imageView, Drawable drawable, int i, int i2) {
        d(imageView, drawable, i, i2);
    }

    private static void d(ImageView imageView, Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            e(imageView, ((BitmapDrawable) drawable).getBitmap(), i, i2);
        } else {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle Drawable is not BitmapDrawable");
        }
    }

    @Deprecated
    public static void d(ImageView imageView, String str, int i, int i2, AsyncLoadDrawableCallback asyncLoadDrawableCallback) {
        a(imageView, str, i, i2, asyncLoadDrawableCallback);
    }

    private static void a(final ImageView imageView, final String str, final int i, final int i2, final AsyncLoadDrawableCallback asyncLoadDrawableCallback) {
        if (imageView == null || str == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView or url is null");
        } else {
            Glide.with(b(imageView)).load(str).into(new CustomTarget<Drawable>() { // from class: qqf.5
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams.width <= 0 || layoutParams.height <= 0) {
                        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
                            qqf.a(imageView, drawable, i, i2);
                            return;
                        }
                        qqf.a(str, imageView, i);
                    } else {
                        qqf.a(imageView, drawable, i, i2);
                    }
                    AsyncLoadDrawableCallback asyncLoadDrawableCallback2 = asyncLoadDrawableCallback;
                    if (asyncLoadDrawableCallback2 != null) {
                        asyncLoadDrawableCallback2.getDrawable(drawable);
                    }
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle onLoadFailed");
                    super.onLoadFailed(drawable);
                    AsyncLoadDrawableCallback asyncLoadDrawableCallback2 = asyncLoadDrawableCallback;
                    if (asyncLoadDrawableCallback2 != null) {
                        asyncLoadDrawableCallback2.getDrawable(null);
                    }
                }
            });
        }
    }

    @Deprecated
    public static void e(ImageView imageView, String str, int i, String str2, TagResourcePolicy tagResourcePolicy) {
        c(imageView, str, i, str2, tagResourcePolicy);
    }

    private static void c(final ImageView imageView, final String str, final int i, final String str2, final TagResourcePolicy tagResourcePolicy) {
        if (imageView == null || str == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView or url is null");
        } else {
            Glide.with(b(imageView)).load(str).into(new CustomTarget<Drawable>() { // from class: qqf.2
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    TagResourcePolicy tagResourcePolicy2 = tagResourcePolicy;
                    if (tagResourcePolicy2 == null || tagResourcePolicy2.filterTagResource(str2)) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if (layoutParams.width <= 0 || layoutParams.height <= 0) {
                            if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
                                qqf.a(imageView, drawable, i, 0);
                                return;
                            } else {
                                qqf.a(str, imageView, i);
                                return;
                            }
                        }
                        qqf.a(imageView, drawable, i, 0);
                    }
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.e("CommonUI_BitmapUtils", "loadRoundRectangleWithTag onLoadFailed");
                }
            });
        }
    }

    @Deprecated
    public static void b(ImageView imageView, String str, int i, int i2, int i3) {
        e(imageView, str, i, i2, i3);
    }

    public static void e(HealthImageView healthImageView, String str, int i, int i2, int i3) {
        e((ImageView) healthImageView, str, i, i2, i3);
    }

    private static void e(final ImageView imageView, final String str, int i, int i2, final int i3) {
        if (imageView == null || str == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView or url is null");
        } else {
            Glide.with(b(imageView)).load(str).addListener(new RequestListener<Drawable>() { // from class: qqf.1
                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    imageView.setImageResource(i3);
                    LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangleInner failed url=", str);
                    qqf.c(glideException);
                    return false;
                }
            }).apply((BaseRequestOptions<?>) new RequestOptions().dontAnimate().skipMemoryCache(false).error(i3).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqo(imageView, i2, i))).into(imageView);
        }
    }

    @Deprecated
    public static void a(ImageView imageView, int i, int i2, int i3, int i4) {
        e(imageView, i, i2, i3, i4);
    }

    public static void e(HealthImageView healthImageView, int i, int i2, int i3, int i4) {
        e((ImageView) healthImageView, i, i2, i3, i4);
    }

    private static void e(final ImageView imageView, final int i, int i2, int i3, final int i4) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView is null");
        } else {
            Glide.with(b(imageView)).load(Integer.valueOf(i)).addListener(new RequestListener<Drawable>() { // from class: qqf.4
                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    imageView.setImageResource(i4);
                    LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle url=", Integer.valueOf(i));
                    qqf.c(glideException);
                    return false;
                }
            }).apply((BaseRequestOptions<?>) new RequestOptions().dontAnimate().skipMemoryCache(false).error(i4).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqo(imageView, i3, i2))).into(imageView);
        }
    }

    @Deprecated
    public static void a(String str, ImageView imageView, int i, AsyncLoadDrawableCallback asyncLoadDrawableCallback) {
        b(str, imageView, i, asyncLoadDrawableCallback, (Drawable) null);
    }

    @Deprecated
    public static void b(String str, ImageView imageView, int i, AsyncLoadDrawableCallback asyncLoadDrawableCallback, Drawable drawable) {
        e(str, imageView, i, asyncLoadDrawableCallback, drawable);
    }

    private static void e(final String str, final ImageView imageView, final int i, final AsyncLoadDrawableCallback asyncLoadDrawableCallback, Drawable drawable) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "setRoundAngleImage, url or imageView is null");
            return;
        }
        RequestOptions requestOptionsDiskCacheStrategy = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL);
        float f = d;
        RequestOptions requestOptionsTransform = requestOptionsDiskCacheStrategy.transform(new qqr(f, f, f, f));
        b(requestOptionsTransform, i);
        if (drawable != null) {
            requestOptionsTransform.placeholder(drawable).dontAnimate();
        }
        Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) requestOptionsTransform).addListener(new RequestListener<Drawable>() { // from class: qqf.3
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                AsyncLoadDrawableCallback asyncLoadDrawableCallback2 = asyncLoadDrawableCallback;
                if (asyncLoadDrawableCallback2 != null) {
                    asyncLoadDrawableCallback2.getDrawable(null);
                }
                imageView.setImageResource(i);
                LogUtil.j("CommonUI_BitmapUtils", "loadEmuiCornerImageInner failed url=", str);
                qqf.c(glideException);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(Drawable drawable2, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                AsyncLoadDrawableCallback asyncLoadDrawableCallback2 = asyncLoadDrawableCallback;
                if (asyncLoadDrawableCallback2 == null) {
                    return false;
                }
                asyncLoadDrawableCallback2.getDrawable(drawable2);
                return false;
            }
        }).into(imageView);
    }

    @Deprecated
    public static void a(int i, ImageView imageView, int i2) {
        c(i, imageView, i2, true);
    }

    public static void a(int i, HealthImageView healthImageView, int i2) {
        e(i, healthImageView, i2, true);
    }

    @Deprecated
    public static void c(int i, ImageView imageView, int i2, boolean z) {
        b(i, imageView, i2, z);
    }

    public static void e(int i, HealthImageView healthImageView, int i2, boolean z) {
        b(i, healthImageView, i2, z);
    }

    private static void b(int i, ImageView imageView, int i2, boolean z) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView is null");
        } else {
            Glide.with(b(imageView)).load(Integer.valueOf(i)).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(z).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(imageView.getContext().getApplicationContext(), i2))).into(imageView);
        }
    }

    @Deprecated
    public static void a(String str, ImageView imageView, int i) {
        d(str, imageView, i);
    }

    public static void c(String str, HealthImageView healthImageView, int i) {
        d(str, healthImageView, i);
    }

    private static void d(final String str, ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView is null");
        } else {
            Glide.with(b(imageView)).load(str).addListener(new RequestListener<Drawable>() { // from class: qqf.10
                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangleInner load failed url=", str);
                    qqf.c(glideException);
                    return false;
                }
            }).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(imageView.getContext().getApplicationContext(), i))).into(imageView);
        }
    }

    @Deprecated
    public static void b(String str, ImageView imageView, float f, float f2, float f3, float f4) {
        a(str, imageView, f, f2, f3, f4);
    }

    public static void d(String str, HealthImageView healthImageView, float f, float f2, float f3, float f4) {
        a(str, healthImageView, f, f2, f3, f4);
    }

    private static void a(String str, final ImageView imageView, final float f, final float f2, final float f3, final float f4) {
        if (imageView == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "loadPlanRectangle imageView is null or url is empty", str);
        } else {
            Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.RESOURCE)).into(new CustomTarget<Drawable>() { // from class: qqf.8
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    int iD = qrs.d(imageView.getContext().getApplicationContext(), 18.0f);
                    int intrinsicWidth = (drawable.getIntrinsicWidth() * iD) / drawable.getIntrinsicHeight();
                    Glide.with(qqf.b(imageView)).load(drawable).override(intrinsicWidth, iD).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(f, f2, f3, f4))).into(imageView);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle onLoadFailed");
                    super.onLoadFailed(drawable);
                }
            });
        }
    }

    @Deprecated
    public static void c(String str, ImageView imageView, int i) {
        e(str, imageView, i);
    }

    public static void b(String str, HealthImageView healthImageView, int i) {
        e(str, healthImageView, i);
    }

    private static void e(final String str, ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "loadRoundRectangle imageView is null");
        } else {
            Glide.with(b(imageView)).load(str).addListener(new RequestListener<Drawable>() { // from class: qqf.9
                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    LogUtil.j("CommonUI_BitmapUtils", "fitnessLoadRoundRectangleInner url=", str);
                    qqf.c(glideException);
                    return false;
                }
            }).apply((BaseRequestOptions<?>) new RequestOptions().dontAnimate().skipMemoryCache(false).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(imageView.getContext().getApplicationContext(), i))).into(imageView);
        }
    }

    @Deprecated
    public static void e(Drawable drawable, ImageView imageView, int i) {
        c(drawable, imageView, i);
    }

    private static void c(Drawable drawable, ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j("CommonUI_BitmapUtils", "setRoundAngleImage, imageView is null");
        } else {
            Glide.with(b(imageView)).load(drawable).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(imageView.getContext().getApplicationContext(), i))).into(imageView);
        }
    }

    public static Drawable b(Context context, String str) {
        try {
            return Glide.with(b(context)).load(str).submit().get();
        } catch (InterruptedException | ExecutionException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getDrawableGlide failed, url=", str, " exception: ", ExceptionUtils.c(e2));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable e(Context context, String str) {
        try {
            return (Drawable) Glide.with(b(context)).load(str).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).submit().get();
        } catch (InterruptedException | ExecutionException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getDrawableGlide failed, url=", str, " exception: ", ExceptionUtils.c(e2));
            return null;
        }
    }

    public static Drawable d(Context context, String str, int i) {
        try {
            return Glide.with(d()).load(str).apply((BaseRequestOptions<?>) new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE).transform(new qqr(context, i))).submit().get();
        } catch (InterruptedException | ExecutionException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getDrawableGlide failed, url=", str, "  exception: ", ExceptionUtils.c(e2));
            return null;
        }
    }

    public static Bitmap c(Context context, String str) {
        try {
            return Glide.with(b(context)).asBitmap().load(str).submit().get(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("CommonUI_BitmapUtils", "load bitmap from url is interrupted");
            return null;
        } catch (ExecutionException unused2) {
            LogUtil.e("CommonUI_BitmapUtils", "load bitmap from url execute fail");
            return null;
        } catch (TimeoutException unused3) {
            LogUtil.e("CommonUI_BitmapUtils", "load bitmap from url timeout");
            return null;
        }
    }

    public static Bitmap a(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.j("CommonUI_BitmapUtils", "getImage context or localPath null");
            return null;
        }
        String strC = CommonUtil.c(str);
        if (strC == null) {
            LogUtil.j("CommonUI_BitmapUtils", "localPath is null");
            return null;
        }
        if (!new File(strC).exists()) {
            return null;
        }
        Bitmap bitmapC = c(strC, 200);
        return bitmapC == null ? bitmapC : a(bitmapC);
    }

    public static Bitmap c(String str, int i) {
        Bitmap bitmap = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "filePathString is null");
            return null;
        }
        if (new File(str).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            if (options.outWidth >= i || options.outHeight >= i) {
                options.inSampleSize = 2;
            } else {
                options.inSampleSize = 1;
            }
            if (bitmapDecodeFile == null || bitmapDecodeFile.isRecycled()) {
                bitmap = bitmapDecodeFile;
            } else {
                bitmapDecodeFile.recycle();
            }
            try {
                return BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("CommonUI_BitmapUtils", "getThumbnailImage OutOfMemoryError");
            }
        }
        return bitmap;
    }

    public static Bitmap e(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("CommonUI_BitmapUtils", "getCircleBitmap bitmap is null or is recycled");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(height, width);
        if (iMin <= 0) {
            LogUtil.j("CommonUI_BitmapUtils", "getCircleBitmap width or height is zero");
            return bitmap;
        }
        try {
            if (width > height) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) ((width - height) / 2.0f), 0, height, height, (Matrix) null, false);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (int) ((height - width) / 2.0f), width, width, (Matrix) null, false);
            }
            float f = i;
            float f2 = (2.0f * f) / iMin;
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f2);
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            bitmapShader.setLocalMatrix(matrix);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, bitmap.getConfig());
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            new Canvas(bitmapCreateBitmap2).drawCircle(f, f, f, paint);
            return bitmapCreateBitmap2;
        } catch (OutOfMemoryError unused) {
            LogUtil.e("CommonUI_BitmapUtils", "getCircleBitmap outOfMemoryError");
            return bitmap;
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "bitmap is null.");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f2 = width;
            f4 = f2 / 2.0f;
            f3 = 0.0f;
            f = f2;
        } else {
            f = height;
            float f5 = (width - height) / 2.0f;
            f2 = width - f5;
            width = height;
            f3 = f5;
            f4 = f / 2.0f;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        canvas.drawCircle(f4, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        int i = (int) f;
        canvas.drawBitmap(bitmap, new Rect((int) f3, 0, (int) f2, i), new Rect(0, 0, i, i), paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap d(Bitmap bitmap, float f, float f2) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        return Bitmap.createBitmap(bitmapCopy, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap e(Bitmap bitmap) {
        float f;
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "scaleBitmap() if (sourceBitmap == null)");
            return bitmap;
        }
        LogUtil.a("CommonUI_BitmapUtils", "scaleBitmap() btmwidth=", Integer.valueOf(bitmap.getWidth()), ", btmheight=", Integer.valueOf(bitmap.getHeight()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        options.inJustDecodeBounds = false;
        float f2 = options.outWidth;
        float f3 = options.outHeight;
        float f4 = 1.0f;
        if (f2 <= f3 || f2 <= 720.0f) {
            f = (f2 >= f3 || f3 <= 1280.0f) ? 1.0f : f3 / 1280.0f;
        } else {
            f = f2 / 720.0f;
        }
        if (f > 0.0f && f < 3.0f) {
            f4 = f;
        }
        options.inSampleSize = (int) f4;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, options);
    }

    public static Bitmap d(Bitmap bitmap, int i) {
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "scaleBitmapBySize() if (btm == null)");
            return bitmap;
        }
        LogUtil.a("CommonUI_BitmapUtils", "scaleBitmapBySize() btmwidth=", Integer.valueOf(bitmap.getWidth()), ", btmheight=", Integer.valueOf(bitmap.getHeight()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        LogUtil.a("CommonUI_BitmapUtils", "scaleBitmapBySize compressionRatio : ", Integer.valueOf(i));
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, options);
    }

    public static Bitmap e(Context context, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || context == null) {
            LogUtil.j("CommonUI_BitmapUtils", "addWaterMarkPic() if (srcBitmap == null || context == null)");
            return bitmap;
        }
        LogUtil.a("CommonUI_BitmapUtils", "addWaterMarkPic() srcBitmap width=", Integer.valueOf(bitmap.getWidth()), "bmpHeight=", Integer.valueOf(bitmap.getHeight()));
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        if (bitmap2 == null) {
            LogUtil.j("CommonUI_BitmapUtils", "addWaterMarkPic() if (waterMarkBitmap == null)");
            return bitmapCopy;
        }
        float width = (bitmapCopy.getWidth() - bitmap2.getWidth()) / 2.0f;
        float height = bitmapCopy.getHeight() - (bitmap2.getHeight() * 2.0f);
        LogUtil.a("CommonUI_BitmapUtils", "addWaterMarkPic() newbmpLeft=", Float.valueOf(width), "newbmpTop=", Float.valueOf(height));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmapCopy);
        canvas.drawBitmap(bitmap2, width, height, paint);
        canvas.save();
        canvas.restore();
        return bitmapCopy;
    }

    public static Bitmap c(Bitmap bitmap, Bitmap bitmap2, String str, Context context) {
        return d(bitmap, c(bitmap2, str, context, d(bitmap, context, 16)), context, 16);
    }

    private static int d(Bitmap bitmap, Context context, int i) {
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = i;
        return a(bitmap, new Rect(qrs.d(context, f2), bitmap.getHeight() - ((int) ((f2 * f) + 40.0f)), (int) (41.0f * f), bitmap.getHeight() - ((int) (f * 12.0f))));
    }

    public static Bitmap c(Bitmap bitmap, String str, Context context, int i) {
        if (TextUtils.isEmpty(str)) {
            return bitmap;
        }
        int i2 = str.length() <= 3 ? 15 : 10;
        try {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Paint paint = new Paint(1);
            paint.setAlpha(150);
            paint.setColor(i);
            paint.setTextSize(qrs.d(context, i2));
            Rect rect = new Rect();
            paint.getTextBounds(str, 0, str.length(), rect);
            float f = context.getResources().getDisplayMetrics().density;
            Bitmap bitmapCopy = bitmap.copy(config, true);
            if (f <= 0.0f) {
                return bitmapCopy;
            }
            int i3 = (int) (2.0f * f);
            new Canvas(bitmapCopy).drawText(str, ((bitmapCopy.getWidth() - rect.width()) / i3) * f, ((bitmapCopy.getHeight() + rect.height()) / i3) * f, paint);
            return bitmapCopy;
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("CommonUI_BitmapUtils", "drawTextToBitmap NotFoundException");
            return bitmap;
        }
    }

    @Deprecated
    public static Bitmap e(int i, Context context) {
        try {
            return BitmapFactory.decodeResource(context.getResources(), i);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapByResID NotFoundException");
            return null;
        }
    }

    public static int a(Bitmap bitmap, Rect rect) {
        if (bitmap == null) {
            return Color.argb(125, 0, 0, 0);
        }
        return e(bitmap, rect);
    }

    private static boolean a(HwColorPicker.PickedColor pickedColor) {
        int state = pickedColor.getState();
        if (state == -1) {
            LogUtil.a("CommonUI_BitmapUtils", "check exception return ");
            return false;
        }
        if (state != 1) {
            return true;
        }
        LogUtil.a("CommonUI_BitmapUtils", "algorithm error return ");
        return false;
    }

    public static int e(Bitmap bitmap, Rect rect) {
        if (bitmap == null || rect == null) {
            LogUtil.j("CommonUI_BitmapUtils", "obtainWidgetColor:bitmap/rect is null!");
            return -1;
        }
        HwColorPicker.PickedColor pickedColorProcessBitmap = HwColorPicker.processBitmap(bitmap, rect);
        if (!a(pickedColorProcessBitmap)) {
            return -1;
        }
        int i = pickedColorProcessBitmap.get(HwColorPicker.ResultType.Widget);
        LogUtil.a("CommonUI_BitmapUtils", "widget ", Integer.valueOf(i));
        return i;
    }

    public static int b(Bitmap bitmap, Rect rect) {
        if (bitmap == null || rect == null) {
            LogUtil.j("CommonUI_BitmapUtils", "obtainWidgetColor:bitmap/rect is null!");
            return -1;
        }
        HwColorPicker.PickedColor pickedColorProcessBitmap = HwColorPicker.processBitmap(bitmap, rect);
        if (!a(pickedColorProcessBitmap)) {
            return -1;
        }
        int i = pickedColorProcessBitmap.get(HwColorPicker.ResultType.Domain);
        LogUtil.a("CommonUI_BitmapUtils", "Domain ", Integer.valueOf(i));
        return i;
    }

    public static int b(int i) {
        return qqn.c(i) == 1 ? -1 : -16777216;
    }

    public static Bitmap c(View view) {
        Bitmap bitmapCreateBitmap = null;
        if (view == null) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapByView error: view is null");
            return null;
        }
        view.setDrawingCacheEnabled(true);
        if (view.getMeasuredHeight() == 0) {
            LogUtil.a("CommonUI_BitmapUtils", "getBitmapByView 2 view.height == 0");
            return null;
        }
        for (int i = 0; bitmapCreateBitmap == null && i < 2; i++) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError e2) {
                LogUtil.j("CommonUI_BitmapUtils", e2.getMessage());
            }
        }
        if (bitmapCreateBitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "getBitmapByView view No enough memory");
            return bitmapCreateBitmap;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        long jCurrentTimeMillis = System.currentTimeMillis();
        view.draw(canvas);
        LogUtil.a("CommonUI_BitmapUtils", "getViewBitmap_time2 ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return bitmapCreateBitmap;
    }

    public static float b(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }

    public static ArrayList<Bitmap> e(Bitmap bitmap, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (bitmap == null || i4 <= 0 || i5 <= 0 || i3 <= 0) {
            LogUtil.j("CommonUI_BitmapUtils", "parseSprite bitmap ", bitmap, " frame ", Integer.valueOf(i), " column ", Integer.valueOf(i2), " row ", Integer.valueOf(i3));
            return new ArrayList<>(16);
        }
        ArrayList<Bitmap> arrayList = new ArrayList<>(i4);
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, 1.0f);
        double d2 = i5;
        int iD = (int) UnitUtil.d(((double) bitmap.getWidth()) / d2, 0);
        int iD2 = (int) UnitUtil.d(((double) bitmap.getHeight()) / ((double) i3), 0);
        int i6 = 0;
        while (i6 < i4) {
            try {
                int i7 = i6;
                int i8 = iD;
                arrayList.add(Bitmap.createBitmap(bitmap, (int) UnitUtil.d((i6 % i5) * iD, 0), (int) UnitUtil.d((((double) i6) / d2) * ((double) iD2), 0), iD, iD2, matrix, true));
                i6 = i7 + 1;
                i4 = i;
                i5 = i2;
                iD = i8;
            } catch (IllegalArgumentException | OutOfMemoryError e2) {
                LogUtil.e("CommonUI_BitmapUtils", "parseSprite exception ", ExceptionUtils.c(e2));
            }
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return arrayList;
    }

    public static Bitmap c(int i) {
        Context contextB = BaseApplication.b();
        try {
            try {
                return BitmapFactory.decodeResource(contextB.getResources(), i);
            } catch (IllegalArgumentException e2) {
                LogUtil.e("CommonUI_BitmapUtils", "getBitmapForResourceId exception ", ExceptionUtils.c(e2));
                Drawable drawable = ContextCompat.getDrawable(contextB, i);
                if (drawable instanceof BitmapDrawable) {
                    return ((BitmapDrawable) drawable).getBitmap();
                }
                return null;
            }
        } catch (Resources.NotFoundException e3) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapForResourceId exception ", ExceptionUtils.c(e3));
            return null;
        }
    }

    public static Bitmap f(String str) {
        String strC = CommonUtil.c(str);
        Bitmap bitmapDecodeFile = null;
        if (j(strC)) {
            LogUtil.j("CommonUI_BitmapUtils", "getBitmapForPath path is invalid file");
            return null;
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapForPath exception ", ExceptionUtils.c(e2));
        }
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        LogUtil.j("CommonUI_BitmapUtils", "getBitmapForPath bitmap is null");
        return new BitmapDrawable(BaseApplication.b().getResources(), strC).getBitmap();
    }

    public static BitmapDrawable b(String str) {
        String strC = CommonUtil.c(str);
        Bitmap bitmapDecodeFile = null;
        if (j(strC)) {
            LogUtil.j("CommonUI_BitmapUtils", "getBitmapDrawableForPath path is invalid file");
            return null;
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapDrawableForPath exception ", ExceptionUtils.c(e2));
        }
        Resources resources = BaseApplication.b().getResources();
        if (bitmapDecodeFile == null) {
            LogUtil.j("CommonUI_BitmapUtils", "getBitmapDrawableForPath bitmap is null");
            return new BitmapDrawable(resources, strC);
        }
        return new BitmapDrawable(resources, bitmapDecodeFile);
    }

    private static boolean j(String str) {
        File file;
        if (TextUtils.isEmpty(str) || (file = FileUtils.getFile(str)) == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.length() <= 0;
        }
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles == null || fileArrListFiles.length <= 0;
    }

    public static boolean b(Bitmap bitmap, String str) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            LogUtil.a("CommonUI_BitmapUtils", "saveBmpToFile: bitmap is null or path is empty");
            return false;
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(str));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamOpenOutputStream);
                fileOutputStreamOpenOutputStream.flush();
                if (fileOutputStreamOpenOutputStream != null) {
                    fileOutputStreamOpenOutputStream.close();
                }
                return true;
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
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile:IOException exception: ", e2.getMessage());
            return false;
        } catch (IllegalArgumentException e3) {
            e = e3;
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            return false;
        } catch (IllegalStateException e4) {
            e = e4;
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            return false;
        }
    }

    public static String d(Bitmap bitmap, String str) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            LogUtil.a("CommonUI_BitmapUtils", "saveBmpToFile: bitmap is null or path is empty");
            return "";
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(str));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                fileOutputStreamOpenOutputStream.flush();
                if (fileOutputStreamOpenOutputStream != null) {
                    fileOutputStreamOpenOutputStream.close();
                }
                return str;
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
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile:IOException exception: ", e2.getMessage());
            return "";
        } catch (IllegalArgumentException e3) {
            e = e3;
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            return "";
        } catch (IllegalStateException e4) {
            e = e4;
            LogUtil.j("CommonUI_BitmapUtils", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            return "";
        }
    }

    public static Bitmap c(String str, BitmapFactory.Options options) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            LogUtil.j("CommonUI_BitmapUtils", "decodeImageFromFile OOM");
            return null;
        }
    }

    public static Bitmap c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (OutOfMemoryError unused) {
            LogUtil.j("CommonUI_BitmapUtils", "decodeImageFromFile OOM");
            return null;
        }
    }

    @Deprecated
    public static void b(String str, ImageView imageView, int i) {
        h(str, imageView, i);
    }

    private static void h(String str, final ImageView imageView, final int i) {
        if (imageView == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CommonUI_BitmapUtils", "loadUrlBackGround imageView is null or url is empty", str);
        } else {
            Glide.with(b(imageView)).load(str).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(imageView.getContext().getApplicationContext(), i))).into(new CustomTarget<Drawable>() { // from class: qqf.7
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    if (LanguageUtil.ba(imageView.getContext().getApplicationContext())) {
                        drawable = qqz.e(imageView.getContext().getApplicationContext(), drawable);
                    }
                    qqf.e(drawable, imageView, i);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j("CommonUI_BitmapUtils", "loadUrlBackGround onLoadFailed");
                    super.onLoadFailed(drawable);
                }
            });
        }
    }

    public static byte[] c(Bitmap bitmap, int i) {
        if (bitmap == null) {
            LogUtil.j("CommonUI_BitmapUtils", "compressBitmapBySize bitmap is null");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        do {
            try {
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                i2 -= 10;
                LogUtil.a("CommonUI_BitmapUtils", "compressBitmapBySize options = ", Integer.valueOf(i2), ",size = ", Integer.valueOf(byteArrayOutputStream.toByteArray().length));
                if (byteArrayOutputStream.toByteArray().length / 1024 <= i) {
                    break;
                }
            } finally {
                a(byteArrayOutputStream);
            }
        } while (i2 > 10);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap d(Uri uri) {
        if (uri.toString().startsWith("http")) {
            return c(d(), uri.toString());
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(BaseApplication.b().getContentResolver(), uri));
            }
            return MediaStore.Images.Media.getBitmap(BaseApplication.b().getContentResolver(), uri);
        } catch (IOException e2) {
            LogUtil.e("CommonUI_BitmapUtils", "getBitmapForUri fail", ExceptionUtils.c(e2));
            return null;
        }
    }

    public static void b(RequestOptions requestOptions, int i) {
        if (requestOptions == null) {
            LogUtil.e("CommonUI_BitmapUtils", "RequestOptions is null in setRequestOptionWithError");
        } else if (BaseApplication.b().getResources().getResourceName(i) == null) {
            LogUtil.e("CommonUI_BitmapUtils", "setRequestOptionWithError ResId: ", Integer.valueOf(i), " is null");
        } else {
            requestOptions.error(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context b(ImageView imageView) {
        if (imageView == null || imageView.getContext() == null) {
            LogUtil.a("CommonUI_BitmapUtils", "get imageview context fail");
            return d();
        }
        Context context = imageView.getContext();
        boolean z = context instanceof Activity;
        boolean z2 = context instanceof ContextWrapper;
        LogUtil.a("CommonUI_BitmapUtils", "isActivity: ", Boolean.valueOf(z), ", topActivity == null ", Boolean.valueOf(BaseApplication.j() == null), ", isContextWrapper = ", Boolean.valueOf(z2), ", context == null ", Boolean.valueOf(context == null));
        if ((z || z2) && !(z && ((Activity) context).isDestroyed())) {
            return e((ContextWrapper) context) ? BaseApplication.b() : context;
        }
        return d();
    }

    private static boolean e(ContextWrapper contextWrapper) {
        Context baseContext = contextWrapper.getBaseContext();
        if (baseContext == null || baseContext.getApplicationContext() == null) {
            return true;
        }
        if (baseContext instanceof Activity) {
            boolean zIsDestroyed = ((Activity) baseContext).isDestroyed();
            LogUtil.a("CommonUI_BitmapUtils", "checkContextWrapperActivityDestroyed baseContext = ", baseContext, ", isDestroyed = ", Boolean.valueOf(zIsDestroyed));
            return zIsDestroyed;
        }
        if (baseContext instanceof ContextWrapper) {
            return e((ContextWrapper) baseContext);
        }
        return true;
    }

    private static Context b(Context context) {
        return (!(context instanceof Activity) || ((Activity) context).isDestroyed()) ? d() : context;
    }

    private static Context d() {
        Activity activityJ = BaseApplication.j();
        return (activityJ == null || activityJ.isDestroyed()) ? BaseApplication.b() : activityJ;
    }

    @Deprecated
    public static void b(ImageView imageView, String str, Target<Drawable> target) {
        Glide.with(b(imageView)).load(str).into(target);
    }

    public static Bitmap e() {
        Drawable drawableLoadIcon = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getApplicationInfo().loadIcon(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageManager());
        if (drawableLoadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableLoadIcon).getBitmap();
        }
        return null;
    }

    public static String c(Bitmap bitmap) {
        if (bitmap == null) {
            ReleaseLogUtil.d("CommonUI_BitmapUtils", "bitmapToBase64String bitmap is null");
            return "";
        }
        return Base64.b(a(bitmap, false));
    }

    public static Bitmap d(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("CommonUI_BitmapUtils", "base64StringToBitmap base64String ", str);
            return null;
        }
        return c(Base64.b(str));
    }

    public static Bitmap a(String str) {
        byte[] bArrDecode = android.util.Base64.decode(str.replace("data:image/png;base64,", "").replace("data:image/jpeg;base64,", "").getBytes(Charset.defaultCharset()), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(GlideException glideException) {
        if (glideException == null) {
            LogUtil.e("CommonUI_BitmapUtils", "logRootCauses exception is null");
            return;
        }
        List<Throwable> rootCauses = glideException.getRootCauses();
        int size = rootCauses.size();
        for (int i = 0; i < size; i++) {
            if (rootCauses.get(i) != null) {
                if (rootCauses.get(i).getCause() != null) {
                    LogUtil.e("CommonUI_BitmapUtils", "Inner Root cause (" + (i + 1) + " of " + size + Constants.RIGHT_BRACKET_ONLY, rootCauses.get(i), "\n", rootCauses.get(i).getCause().toString(), c(rootCauses.get(i).getCause().getStackTrace()));
                } else {
                    LogUtil.e("CommonUI_BitmapUtils", "Root cause (" + (i + 1) + " of " + size + Constants.RIGHT_BRACKET_ONLY, rootCauses.get(i), c(rootCauses.get(i).getStackTrace()));
                }
            }
        }
    }

    private static String c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("\n");
            sb.append(stackTraceElement.toString());
        }
        return sb.toString();
    }
}
