package jt2;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class a extends LayerDrawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1941a f100855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable[] f100856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f100860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f100861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f100862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f100863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f100864j;

    /* JADX INFO: renamed from: jt2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1941a {
        void d(int i14);
    }

    public a(Drawable[] drawableArr, int[] iArr) {
        super(drawableArr);
        this.f100858d = 0;
        if (drawableArr.length > iArr.length) {
            drawableArr = (Drawable[]) Arrays.copyOf(drawableArr, iArr.length);
        } else if (drawableArr.length < iArr.length) {
            iArr = Arrays.copyOf(iArr, drawableArr.length);
        }
        this.f100856b = drawableArr;
        this.f100863i = iArr;
        for (Drawable drawable : drawableArr) {
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable) drawable).setGravity(17);
            }
        }
    }

    public final void a(int i14) {
        this.f100859e = 255;
        this.f100860f = i14;
        this.f100861g = SystemClock.uptimeMillis();
        this.f100864j = 1;
        this.f100857c = 0;
        InterfaceC1941a interfaceC1941a = this.f100855a;
        if (interfaceC1941a != null) {
            interfaceC1941a.d(0);
        }
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z14;
        int i14;
        int i15;
        int i16;
        Drawable drawable;
        int i17;
        InterfaceC1941a interfaceC1941a;
        float fUptimeMillis;
        boolean z15;
        int i18 = this.f100864j;
        if (i18 != 0) {
            if (i18 == 1) {
                int[] iArr = this.f100863i;
                if (SystemClock.uptimeMillis() - this.f100861g >= (iArr != null ? iArr[this.f100857c] : this.f100862h)) {
                    this.f100861g = SystemClock.uptimeMillis();
                    this.f100864j = 2;
                }
                if (this.f100861g >= 0) {
                    fUptimeMillis = (SystemClock.uptimeMillis() - this.f100861g) / this.f100860f;
                    if (fUptimeMillis >= 1.0f) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f100858d = (int) ((this.f100859e * Math.min(fUptimeMillis, 1.0f)) + 0);
                    z14 = z15;
                }
                i14 = this.f100864j;
                i15 = this.f100857c;
                if (i14 == 2) {
                    int i19 = i15 + 1;
                    i16 = i19 < this.f100856b.length ? i19 : 0;
                    Drawable drawable2 = getDrawable(i15);
                    drawable = getDrawable(i16);
                    drawable2.setAlpha(255 - this.f100858d);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                    i17 = this.f100858d;
                    if (i17 > 0) {
                        drawable.setAlpha(i17);
                        drawable.draw(canvas);
                        drawable.setAlpha(255);
                    }
                    if (z14) {
                        this.f100857c = i16;
                        interfaceC1941a = this.f100855a;
                        if (interfaceC1941a != null) {
                            interfaceC1941a.d(i16);
                        }
                        this.f100861g = SystemClock.uptimeMillis();
                        this.f100864j = 1;
                    }
                } else {
                    getDrawable(i15).draw(canvas);
                }
                invalidateSelf();
            }
            z14 = true;
            if (this.f100861g >= 0) {
                fUptimeMillis = (SystemClock.uptimeMillis() - this.f100861g) / this.f100860f;
                if (fUptimeMillis >= 1.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f100858d = (int) ((this.f100859e * Math.min(fUptimeMillis, 1.0f)) + 0);
                z14 = z15;
            }
            i14 = this.f100864j;
            i15 = this.f100857c;
            if (i14 == 2) {
                int i110 = i15 + 1;
                if (i110 < this.f100856b.length) {
                }
                Drawable drawable3 = getDrawable(i15);
                drawable = getDrawable(i16);
                drawable3.setAlpha(255 - this.f100858d);
                drawable3.draw(canvas);
                drawable3.setAlpha(255);
                i17 = this.f100858d;
                if (i17 > 0) {
                    drawable.setAlpha(i17);
                    drawable.draw(canvas);
                    drawable.setAlpha(255);
                }
                if (z14) {
                    this.f100857c = i16;
                    interfaceC1941a = this.f100855a;
                    if (interfaceC1941a != null) {
                        interfaceC1941a.d(i16);
                    }
                    this.f100861g = SystemClock.uptimeMillis();
                    this.f100864j = 1;
                }
            } else {
                getDrawable(i15).draw(canvas);
            }
            invalidateSelf();
        }
        this.f100864j = 2;
        z14 = false;
        if (this.f100861g >= 0) {
            fUptimeMillis = (SystemClock.uptimeMillis() - this.f100861g) / this.f100860f;
            if (fUptimeMillis >= 1.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f100858d = (int) ((this.f100859e * Math.min(fUptimeMillis, 1.0f)) + 0);
            z14 = z15;
        }
        i14 = this.f100864j;
        i15 = this.f100857c;
        if (i14 == 2) {
            int i111 = i15 + 1;
            if (i111 < this.f100856b.length) {
            }
            Drawable drawable4 = getDrawable(i15);
            drawable = getDrawable(i16);
            drawable4.setAlpha(255 - this.f100858d);
            drawable4.draw(canvas);
            drawable4.setAlpha(255);
            i17 = this.f100858d;
            if (i17 > 0) {
                drawable.setAlpha(i17);
                drawable.draw(canvas);
                drawable.setAlpha(255);
            }
            if (z14) {
                this.f100857c = i16;
                interfaceC1941a = this.f100855a;
                if (interfaceC1941a != null) {
                    interfaceC1941a.d(i16);
                }
                this.f100861g = SystemClock.uptimeMillis();
                this.f100864j = 1;
            }
        } else {
            getDrawable(i15).draw(canvas);
        }
        invalidateSelf();
    }

    public a(Drawable[] drawableArr, int i14) {
        super(drawableArr);
        this.f100858d = 0;
        this.f100856b = drawableArr;
        this.f100862h = i14;
        for (Drawable drawable : drawableArr) {
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable) drawable).setGravity(17);
            }
        }
    }
}
