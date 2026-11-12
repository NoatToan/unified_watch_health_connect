package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lsq f40763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScriptIntrinsicBlur f40764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40765c;
    private RenderScript e;

    private lsq(Context context) {
        if (context == null) {
            this.f40765c = BaseApplication.getContext();
        } else {
            this.f40765c = context.getApplicationContext();
        }
        RenderScript renderScriptCreate = RenderScript.create(this.f40765c);
        this.e = renderScriptCreate;
        if (renderScriptCreate == null) {
            return;
        }
        this.f40764b = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    public static lsq d(Context context) {
        lsq lsqVar = f40763a;
        return lsqVar == null ? new lsq(context) : lsqVar;
    }

    public void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f40764b;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
        }
        RenderScript renderScript = this.e;
        if (renderScript != null) {
            renderScript.destroy();
        }
    }

    public void e(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.f40764b.setRadius(i);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.e, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation allocationCreateTyped = Allocation.createTyped(this.e, allocationCreateFromBitmap.getType());
        this.f40764b.setInput(allocationCreateFromBitmap);
        this.f40764b.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmap2);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
    }

    public Bitmap b(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        e(bitmap, bitmapCreateBitmap, i);
        return bitmapCreateBitmap;
    }

    public Bitmap e(Bitmap bitmap, int i, int i2) {
        return b(a(bitmap, i2), i);
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        int iMax;
        int i2 = 1;
        if (bitmap == null || i == 0) {
            iMax = 1;
        } else {
            int iMax2 = Math.max(1, bitmap.getWidth() / i);
            iMax = Math.max(1, bitmap.getHeight() / i);
            i2 = iMax2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, iMax, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, i2, iMax);
        Paint paint = new Paint();
        paint.setShader(d(bitmap, bitmapCreateBitmap));
        canvas.drawRect(rectF, paint);
        return bitmapCreateBitmap;
    }

    private static BitmapShader d(Bitmap bitmap, Bitmap bitmap2) {
        float width;
        float height;
        if (bitmap == null) {
            LogUtil.e("RenderScriptBlur", "getBitmapScaleShader : in is null");
            return null;
        }
        if (bitmap2 == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            width = 1.0f;
            height = 1.0f;
        } else {
            width = bitmap2.getWidth() / bitmap.getWidth();
            height = bitmap2.getHeight() / bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.postScale(width, height);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        return bitmapShader;
    }
}
