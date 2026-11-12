package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.util.Preconditions;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.lettertiles.TileDrawable;

/* JADX INFO: loaded from: classes16.dex */
public class qlr extends TileDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f46462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f46463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f46464c;
    private static volatile int d;
    private static volatile int e;
    private static volatile int f;
    private static volatile Drawable g;
    private static volatile TypedArray h;
    private static volatile int i;
    private static volatile int j;
    private static volatile TypedArray l;
    private static volatile TypedArray m;
    private static volatile TypedArray n;
    private int o;
    private boolean q;
    private float r;
    private String t;
    private Bitmap u;
    private final Paint w;
    private byte[] x;
    private final Rect v = new Rect();
    private String k = null;
    private float y = 1.0f;
    private float s = 0.0f;
    private boolean p = true;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.huawei.ui.commonui.lettertiles.TileDrawable
    public void setIsPure(boolean z) {
    }

    static {
        Object obj = new Object();
        f46462a = obj;
        if (BaseApplication.getContext() != null) {
            synchronized (obj) {
                c(BaseApplication.getContext().getResources());
            }
        }
    }

    public qlr(Resources resources, boolean z, int i2, byte[] bArr) {
        this.o = 1;
        this.q = false;
        Paint paint = new Paint();
        this.w = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.q = z;
        this.o = i2;
        this.x = bArr != null ? (byte[]) bArr.clone() : null;
        if (z) {
            this.r = resources.getFraction(R.dimen.commonui_letter_to_tile_ratio_for_Shortcut, 1, 1);
        } else if (c()) {
            this.r = resources.getFraction(R.dimen.commonui_letter_to_tile_ratio_for_detail, 1, 1);
        } else {
            this.r = resources.getFraction(R.dimen.commonui_letter_to_tile_ratio_for_list, 1, 1);
        }
        synchronized (f46462a) {
            c(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        synchronized (f46462a) {
            if (qlo.d(n, h, m, l)) {
                return;
            }
            Rect bounds = getBounds();
            if (isVisible() && !bounds.isEmpty()) {
                byte[] bArr = this.x;
                Bitmap bitmapDecodeByteArray = bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
                if (this.p) {
                    this.u = qlo.d(bitmapDecodeByteArray, c());
                } else {
                    this.u = bitmapDecodeByteArray;
                }
                e(canvas);
            }
        }
    }

    private static void c(Resources resources) {
        n = resources.obtainTypedArray(R.array.commonui_littleavatar_list_start_colors);
        h = resources.obtainTypedArray(R.array.commonui_littleavatar_list_end_colors);
        m = resources.obtainTypedArray(R.array.commonui_letterfont_list_colors);
        l = resources.obtainTypedArray(R.array.commonui_letterpure_detail_colors);
        e = resources.getColor(R.color.commonui_default_littleavatar_list_color);
        j = resources.getColor(R.color.commonui_default_pure_detail_color);
        i = resources.getColor(R.color.commonui_default_letterfont_list_color);
        f = resources.getColor(R.color.commonui_default_letterfont_detail_color);
        f46463b = resources.getColor(R.color.commonui_default_avatar_list_color);
        d = resources.getColor(R.color.commonui_default_avatar_detail_color);
        g = resources.getDrawable(R.drawable.ic_commonui_contact_default_avater);
        f46464c = m.length();
    }

    private void b(Canvas canvas) {
        Drawable drawableC = qqf.c(g, c() ? d : f46463b);
        Bitmap bitmapA = qqf.a(drawableC);
        Rect rectCopyBounds = copyBounds();
        int iHeight = (int) ((this.y * (rectCopyBounds.width() > rectCopyBounds.height() ? rectCopyBounds.height() : rectCopyBounds.width())) / 2.0f);
        rectCopyBounds.set(rectCopyBounds.centerX() - iHeight, (int) ((rectCopyBounds.centerY() - iHeight) + (this.s * rectCopyBounds.height())), rectCopyBounds.centerX() + iHeight, (int) (rectCopyBounds.centerY() + iHeight + (this.s * rectCopyBounds.height())));
        this.v.set(0, 0, drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight());
        if (bitmapA != null) {
            canvas.drawBitmap(bitmapA, this.v, rectCopyBounds, this.w);
        }
        this.w.reset();
    }

    private void e(Canvas canvas) {
        int color;
        int color2;
        this.w.setTextAlign(Paint.Align.CENTER);
        this.w.setAntiAlias(true);
        Rect bounds = getBounds();
        int iC = c(this.k);
        if (c()) {
            color = l.getColor(iC, j);
            color2 = color;
        } else {
            color = n.getColor(iC, e);
            color2 = h.getColor(iC, e);
        }
        this.w.setShader(new LinearGradient(0.0f, 0.0f, bounds.width(), bounds.height(), color, color2, Shader.TileMode.CLAMP));
        int iHeight = bounds.width() > bounds.height() ? bounds.height() : bounds.width();
        if (this.p) {
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), iHeight / 2.0f, this.w);
        } else {
            canvas.drawRect(bounds, this.w);
        }
        this.w.setShader(null);
        if (this.p || this.q) {
            if (this.o == 3 && this.u != null) {
                d(canvas);
                this.u.recycle();
            } else if (this.t != null) {
                e(canvas, bounds, iC);
            } else {
                b(canvas);
            }
        }
    }

    private void d(Canvas canvas) {
        this.w.setStyle(Paint.Style.FILL);
        this.w.setAntiAlias(true);
        Rect rectCopyBounds = copyBounds();
        int iHeight = (int) ((this.y * (rectCopyBounds.width() > rectCopyBounds.height() ? rectCopyBounds.height() : rectCopyBounds.width())) / 2.0f);
        rectCopyBounds.set(rectCopyBounds.centerX() - iHeight, rectCopyBounds.centerY() - iHeight, rectCopyBounds.centerX() + iHeight, rectCopyBounds.centerY() + iHeight);
        this.v.set(0, 0, this.u.getWidth(), this.u.getHeight());
        if (this.u.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.u, this.v, rectCopyBounds, this.w);
    }

    private void e(Canvas canvas, Rect rect, int i2) {
        this.w.setTextSize(this.y * this.r * (rect.width() > rect.height() ? rect.height() : rect.width()));
        Paint paint = this.w;
        String str = this.t;
        paint.getTextBounds(str, 0, str.length(), this.v);
        this.w.setTypeface(Typeface.create(BaseApplication.getContext().getResources().getString(R.string.textFontFamilyMedium), 0));
        if (c()) {
            this.w.setColor(f);
        } else {
            this.w.setColor(m.getColor(i2, i));
        }
        String str2 = this.t;
        canvas.drawText(str2, 0, str2.length(), rect.centerX(), (rect.centerY() + (this.s * rect.height())) - this.v.exactCenterY(), this.w);
        this.w.reset();
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Math.abs(str.hashCode() & 4095) % f46464c;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.w.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    @Override // com.huawei.ui.commonui.lettertiles.TileDrawable
    public void setScale(float f2) {
        this.y = f2;
    }

    @Override // com.huawei.ui.commonui.lettertiles.TileDrawable
    public void setOffset(float f2) {
        Preconditions.checkArgument(f2 >= -0.5f && f2 <= 0.5f);
        this.s = f2;
    }

    @Override // com.huawei.ui.commonui.lettertiles.TileDrawable
    public void setContactDetails(String str, String str2) {
        this.k = str2;
        e(str);
    }

    @Override // com.huawei.ui.commonui.lettertiles.TileDrawable
    public void setIsCircular(boolean z) {
        this.p = z;
    }

    private void e(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (cCharAt >= 19968 && cCharAt <= 40869) {
                this.t = String.valueOf(cCharAt);
                return;
            }
        }
        char cCharAt2 = str.charAt(0);
        if (qlo.b(cCharAt2)) {
            this.t = String.valueOf(Character.toUpperCase(cCharAt2));
        }
    }

    private boolean c() {
        int i2 = this.o;
        return i2 == 2 || i2 == 3;
    }
}
