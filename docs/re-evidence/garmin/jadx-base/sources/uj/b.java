package uj;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f171453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f171454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f171455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f171456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f171457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f171458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f171459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f171460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f171461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f171462j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171463a;

        static {
            int[] iArr = new int[uj.a.values().length];
            f171463a = iArr;
            try {
                iArr[uj.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f171463a[uj.a.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f171463a[uj.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f171463a[uj.a.TOP_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f171463a[uj.a.TOP_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f171463a[uj.a.RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f171463a[uj.a.RIGHT_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f171463a[uj.a.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f171463a[uj.a.BOTTOM_CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f171463a[uj.a.BOTTOM_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public b(RectF rectF, float f14, float f15, float f16, float f17, float f18, int i14, int i15, uj.a aVar) {
        Path path = new Path();
        this.f171454b = path;
        Paint paint = new Paint(1);
        this.f171455c = paint;
        this.f171453a = rectF;
        this.f171458f = f14;
        this.f171459g = f15;
        this.f171460h = f16;
        this.f171461i = f17;
        this.f171462j = f18;
        paint.setColor(i15);
        if (f18 <= 0.0f) {
            c(aVar, path, 0.0f);
            return;
        }
        Paint paint2 = new Paint(1);
        this.f171457e = paint2;
        paint2.setColor(i14);
        Path path2 = new Path();
        this.f171456d = path2;
        c(aVar, path, f18);
        c(aVar, path2, 0.0f);
    }

    public final void a(RectF rectF, Path path, float f14) {
        path.moveTo(rectF.left + f14, rectF.top + f14);
        path.lineTo(rectF.right - f14, rectF.top + f14);
        float f15 = rectF.right - f14;
        float f16 = rectF.bottom;
        float f17 = this.f171460h;
        path.lineTo(f15, (f16 - f17) - f14);
        float f18 = rectF.left;
        float f19 = this.f171458f;
        float f22 = this.f171461i;
        float f24 = f14 / 2.0f;
        path.lineTo(((f18 + f19) + f22) - f24, (rectF.bottom - f17) - f14);
        path.lineTo((f19 / 2.0f) + rectF.left + f22, (rectF.bottom - f14) - f14);
        path.lineTo(rectF.left + f22 + f24, (rectF.bottom - f17) - f14);
        path.lineTo(rectF.left + f22 + f14, (rectF.bottom - f17) - f14);
        path.lineTo(rectF.left + f14, (rectF.bottom - f17) - f14);
        path.lineTo(rectF.left + f14, rectF.top + f14);
        path.close();
    }

    public final void b(RectF rectF, Path path, float f14) {
        float f15 = rectF.left;
        float f16 = this.f171458f;
        path.moveTo(f15 + f16 + f14, rectF.top + f14);
        path.lineTo(rectF.width() - f14, rectF.top + f14);
        path.lineTo(rectF.right - f14, rectF.bottom - f14);
        path.lineTo(rectF.left + f16 + f14, rectF.bottom - f14);
        float f17 = rectF.left + f16 + f14;
        float f18 = this.f171460h;
        float f19 = this.f171461i;
        float f22 = f14 / 2.0f;
        path.lineTo(f17, (f18 + f19) - f22);
        path.lineTo(rectF.left + f14 + f14, (f18 / 2.0f) + f19);
        path.lineTo(rectF.left + f16 + f14, f19 + f22);
        path.lineTo(rectF.left + f16 + f14, rectF.top + f14);
        path.close();
    }

    public final void c(uj.a aVar, Path path, float f14) {
        int i14 = a.f171463a[aVar.ordinal()];
        float f15 = this.f171461i;
        float f16 = this.f171458f;
        float f17 = this.f171460h;
        float f18 = this.f171459g;
        RectF rectF = this.f171453a;
        switch (i14) {
            case 1:
            case 2:
                if (f18 <= 0.0f) {
                    b(rectF, path, f14);
                } else if (f14 > 0.0f && f14 > f18) {
                    b(rectF, path, f14);
                } else {
                    path.moveTo(rectF.left + f16 + f18 + f14, rectF.top + f14);
                    path.lineTo((rectF.width() - f18) - f14, rectF.top + f14);
                    float f19 = rectF.right;
                    float f22 = rectF.top;
                    path.arcTo(new RectF(f19 - f18, f22 + f14, f19 - f14, f22 + f18), 270.0f, 90.0f);
                    path.lineTo(rectF.right - f14, (rectF.bottom - f18) - f14);
                    float f24 = rectF.right;
                    float f25 = rectF.bottom;
                    path.arcTo(new RectF(f24 - f18, f25 - f18, f24 - f14, f25 - f14), 0.0f, 90.0f);
                    path.lineTo(rectF.left + f16 + f18 + f14, rectF.bottom - f14);
                    float f26 = rectF.left;
                    float f27 = rectF.bottom;
                    path.arcTo(new RectF(f26 + f16 + f14, f27 - f18, f26 + f18 + f16, f27 - f14), 90.0f, 90.0f);
                    float f28 = f14 / 2.0f;
                    path.lineTo(rectF.left + f16 + f14, (f17 + f15) - f28);
                    path.lineTo(rectF.left + f14 + f14, (f17 / 2.0f) + f15);
                    path.lineTo(rectF.left + f16 + f14, f15 + f28);
                    path.lineTo(rectF.left + f16 + f14, rectF.top + f18 + f14);
                    float f29 = rectF.left;
                    float f34 = rectF.top;
                    path.arcTo(new RectF(f29 + f16 + f14, f14 + f34, f29 + f18 + f16, f18 + f34), 180.0f, 90.0f);
                    path.close();
                }
                break;
            case 3:
            case 4:
            case 5:
                if (f18 <= 0.0f) {
                    e(rectF, path, f14);
                } else if (f14 > 0.0f && f14 > f18) {
                    e(rectF, path, f14);
                } else {
                    path.moveTo(Math.min(f15, f18) + rectF.left + f14, rectF.top + f17 + f14);
                    float f35 = f14 / 2.0f;
                    path.lineTo(rectF.left + f15 + f35, rectF.top + f17 + f14);
                    path.lineTo((f16 / 2.0f) + rectF.left + f15, rectF.top + f14 + f14);
                    path.lineTo(((rectF.left + f16) + f15) - f35, rectF.top + f17 + f14);
                    path.lineTo((rectF.right - f18) - f14, rectF.top + f17 + f14);
                    float f36 = rectF.right;
                    float f37 = rectF.top;
                    path.arcTo(new RectF(f36 - f18, f37 + f17 + f14, f36 - f14, f37 + f18 + f17), 270.0f, 90.0f);
                    path.lineTo(rectF.right - f14, (rectF.bottom - f18) - f14);
                    float f38 = rectF.right;
                    float f39 = rectF.bottom;
                    path.arcTo(new RectF(f38 - f18, f39 - f18, f38 - f14, f39 - f14), 0.0f, 90.0f);
                    path.lineTo(rectF.left + f18 + f14, rectF.bottom - f14);
                    float f44 = rectF.left;
                    float f45 = rectF.bottom;
                    path.arcTo(new RectF(f44 + f14, f45 - f18, f44 + f18, f45 - f14), 90.0f, 90.0f);
                    path.lineTo(rectF.left + f14, rectF.top + f17 + f18 + f14);
                    float f46 = rectF.left;
                    float f47 = rectF.top;
                    path.arcTo(new RectF(f46 + f14, f47 + f17 + f14, f46 + f18, f18 + f47 + f17), 180.0f, 90.0f);
                    path.close();
                }
                break;
            case 6:
            case 7:
                if (f18 <= 0.0f) {
                    d(rectF, path, f14);
                } else if (f14 > 0.0f && f14 > f18) {
                    d(rectF, path, f14);
                } else {
                    path.moveTo(rectF.left + f18 + f14, rectF.top + f14);
                    path.lineTo(((rectF.width() - f18) - f16) - f14, rectF.top + f14);
                    float f48 = rectF.right;
                    float f49 = rectF.top;
                    path.arcTo(new RectF((f48 - f18) - f16, f49 + f14, (f48 - f16) - f14, f49 + f18), 270.0f, 90.0f);
                    float f50 = f14 / 2.0f;
                    path.lineTo((rectF.right - f16) - f14, f15 + f50);
                    path.lineTo((rectF.right - f14) - f14, (f17 / 2.0f) + f15);
                    path.lineTo((rectF.right - f16) - f14, (f15 + f17) - f50);
                    path.lineTo((rectF.right - f16) - f14, (rectF.bottom - f18) - f14);
                    float f54 = rectF.right;
                    float f55 = rectF.bottom;
                    path.arcTo(new RectF((f54 - f18) - f16, f55 - f18, (f54 - f16) - f14, f55 - f14), 0.0f, 90.0f);
                    path.lineTo(rectF.left + f16 + f14, rectF.bottom - f14);
                    float f56 = rectF.left;
                    float f57 = rectF.bottom;
                    path.arcTo(new RectF(f56 + f14, f57 - f18, f56 + f18, f57 - f14), 90.0f, 90.0f);
                    float f58 = rectF.left;
                    float f59 = rectF.top;
                    path.arcTo(new RectF(f58 + f14, f14 + f59, f58 + f18, f18 + f59), 180.0f, 90.0f);
                    path.close();
                }
                break;
            case 8:
            case 9:
            case 10:
                if (f18 <= 0.0f) {
                    a(rectF, path, f14);
                } else if (f14 > 0.0f && f14 > f18) {
                    a(rectF, path, f14);
                } else {
                    path.moveTo(rectF.left + f18 + f14, rectF.top + f14);
                    path.lineTo((rectF.width() - f18) - f14, rectF.top + f14);
                    float f64 = rectF.right;
                    float f65 = rectF.top;
                    path.arcTo(new RectF(f64 - f18, f65 + f14, f64 - f14, f65 + f18), 270.0f, 90.0f);
                    path.lineTo(rectF.right - f14, ((rectF.bottom - f17) - f18) - f14);
                    float f66 = rectF.right;
                    float f67 = rectF.bottom;
                    path.arcTo(new RectF(f66 - f18, (f67 - f18) - f17, f66 - f14, (f67 - f17) - f14), 0.0f, 90.0f);
                    float f68 = f14 / 2.0f;
                    path.lineTo(((rectF.left + f16) + f15) - f68, (rectF.bottom - f17) - f14);
                    path.lineTo((f16 / 2.0f) + rectF.left + f15, (rectF.bottom - f14) - f14);
                    path.lineTo(rectF.left + f15 + f68, (rectF.bottom - f17) - f14);
                    path.lineTo(Math.min(f18, f15) + rectF.left + f14, (rectF.bottom - f17) - f14);
                    float f69 = rectF.left;
                    float f74 = rectF.bottom;
                    path.arcTo(new RectF(f69 + f14, (f74 - f18) - f17, f69 + f18, (f74 - f17) - f14), 90.0f, 90.0f);
                    path.lineTo(rectF.left + f14, rectF.top + f18 + f14);
                    float f75 = rectF.left;
                    float f76 = rectF.top;
                    path.arcTo(new RectF(f75 + f14, f14 + f76, f75 + f18, f18 + f76), 180.0f, 90.0f);
                    path.close();
                }
                break;
        }
    }

    public final void d(RectF rectF, Path path, float f14) {
        path.moveTo(rectF.left + f14, rectF.top + f14);
        float fWidth = rectF.width();
        float f15 = this.f171458f;
        path.lineTo((fWidth - f15) - f14, rectF.top + f14);
        float f16 = (rectF.right - f15) - f14;
        float f17 = f14 / 2.0f;
        float f18 = this.f171461i;
        path.lineTo(f16, f18 + f17);
        float f19 = (rectF.right - f14) - f14;
        float f22 = this.f171460h;
        path.lineTo(f19, (f22 / 2.0f) + f18);
        path.lineTo((rectF.right - f15) - f14, (f18 + f22) - f17);
        path.lineTo((rectF.right - f15) - f14, rectF.bottom - f14);
        path.lineTo(rectF.left + f14, rectF.bottom - f14);
        path.lineTo(rectF.left + f14, rectF.top + f14);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f171462j > 0.0f) {
            canvas.drawPath(this.f171456d, this.f171457e);
        }
        canvas.drawPath(this.f171454b, this.f171455c);
    }

    public final void e(RectF rectF, Path path, float f14) {
        float f15 = rectF.left;
        float f16 = this.f171461i;
        float f17 = rectF.top;
        float f18 = this.f171460h;
        path.moveTo(f15 + f16 + f14, f17 + f18 + f14);
        float f19 = f14 / 2.0f;
        path.lineTo(rectF.left + f16 + f19, rectF.top + f18 + f14);
        float f22 = rectF.left;
        float f24 = this.f171458f;
        path.lineTo((f24 / 2.0f) + f22 + f16, rectF.top + f14 + f14);
        path.lineTo(((rectF.left + f24) + f16) - f19, rectF.top + f18 + f14);
        path.lineTo(rectF.right - f14, rectF.top + f18 + f14);
        path.lineTo(rectF.right - f14, rectF.bottom - f14);
        path.lineTo(rectF.left + f14, rectF.bottom - f14);
        path.lineTo(rectF.left + f14, rectF.top + f18 + f14);
        path.lineTo(rectF.left + f16 + f14, rectF.top + f18 + f14);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f171453a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f171453a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        this.f171455c.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f171455c.setColorFilter(colorFilter);
    }
}
