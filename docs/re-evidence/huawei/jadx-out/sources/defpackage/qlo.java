package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.EnvironmentInfo;

/* JADX INFO: loaded from: classes16.dex */
public class qlo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Drawable f46455b;

    public static boolean b(char c2) {
        if ('A' > c2 || c2 > 'Z') {
            return 'a' <= c2 && c2 <= 'z';
        }
        return true;
    }

    private static boolean d(int i) {
        return i == 2 || i == 3;
    }

    public static Drawable b(Resources resources, e eVar) {
        if (resources == null) {
            return null;
        }
        return e(resources, eVar, null);
    }

    public static Drawable e(Resources resources, e eVar, byte[] bArr) {
        c(resources, eVar, bArr);
        if (EnvironmentInfo.c()) {
            e(resources, eVar);
        }
        qlr qlrVar = new qlr(resources, eVar.g(), eVar.f46456a, bArr);
        qlrVar.setContactDetails(eVar.d, eVar.e);
        qlrVar.setScale(eVar.d());
        qlrVar.setOffset(eVar.e());
        qlrVar.setIsCircular(eVar.a());
        qlrVar.setIsPure(eVar.b());
        return qlrVar;
    }

    public static Bitmap d(Bitmap bitmap, boolean z) {
        if (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
            return null;
        }
        int height = bitmap.getWidth() > bitmap.getHeight() ? bitmap.getHeight() : bitmap.getWidth();
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        boolean z2 = z && height <= 96;
        Matrix matrix = new Matrix();
        if (z2) {
            matrix.setScale(5.0f, 5.0f);
        }
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        int i = z2 ? height * 5 : height;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = i;
            float f2 = f / 2.0f;
            canvas.drawCircle(f2, f2, f2, paint);
            if (z2 || i != 0) {
                float f3 = height / f;
                canvas.scale(f3, f3, f2, f2);
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            LogUtil.e("PersonalAvatarManager", "createRoundPhotoWithScale()", ExceptionUtils.c(e2));
            return null;
        }
    }

    public static boolean d(Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static Drawable c(Resources resources, e eVar, byte[] bArr) {
        Drawable qlrVar;
        if (resources == null) {
            return null;
        }
        if (eVar == null) {
            if (f46455b == null) {
                if (EnvironmentInfo.c()) {
                    qlrVar = d(1) ? resources.getDrawable(R.drawable.commonui_honor_avatar_detail) : resources.getDrawable(R.drawable.commonui_honor_avatar);
                } else {
                    qlrVar = new qlr(resources, false, 1, bArr);
                }
                f46455b = qlrVar;
            }
            return f46455b;
        }
        return f46455b;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f46457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f46458c;
        private String d;
        private String e;
        private float h;
        private boolean i;
        private float j;

        public e() {
            this.f46456a = 1;
            this.h = 1.0f;
            this.j = 0.0f;
            this.i = false;
            this.f46458c = false;
            this.f46457b = false;
        }

        public e(String str, String str2, boolean z) {
            this(str, str2, 1, 1.0f, 0.0f, z, false, false);
        }

        public e(String str, String str2, int i, float f, float f2, boolean z, boolean z2, boolean z3) {
            this.d = str;
            this.e = str2;
            this.f46456a = i;
            this.h = f;
            this.j = f2;
            this.f46458c = z;
            this.i = z2;
            this.f46457b = z3;
        }

        public int c() {
            return this.f46456a;
        }

        public float d() {
            return this.h;
        }

        public float e() {
            return this.j;
        }

        public boolean g() {
            return this.i;
        }

        public boolean a() {
            return this.f46458c;
        }

        public boolean b() {
            return this.f46457b;
        }
    }

    private static Drawable e(Resources resources, e eVar) {
        if (d(eVar.c())) {
            return resources.getDrawable(R.drawable.commonui_honor_avatar_detail);
        }
        return resources.getDrawable(R.drawable.commonui_honor_avatar);
    }
}
