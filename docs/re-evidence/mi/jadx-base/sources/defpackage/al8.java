package defpackage;

import android.view.View;
import com.autonavi.amap.mapcore.tools.GlMapUtil;

/* JADX INFO: loaded from: classes3.dex */
public class al8 {
    public static boolean o = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1162b;
    public int h;
    public int[] j;
    public int[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1161a = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public boolean g = true;
    public int[] i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f1163k = null;
    public int m = 0;
    public int n = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public al8 f1164a = new al8();

        public static al8 b(int i, int i2, int i3) {
            if (i == 2 || i == 3) {
                return new a().c(i3).e(420, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 800).d(0, i2 * 2, i2 * 4, i2 * 11).f(1100).a();
            }
            return null;
        }

        public al8 a() {
            return this.f1164a;
        }

        public a c(int i) {
            this.f1164a.f1161a = i;
            return this;
        }

        public a d(int... iArr) {
            this.f1164a.j = iArr;
            return this;
        }

        public a e(int... iArr) {
            this.f1164a.i = iArr;
            return this;
        }

        public a f(int i) {
            this.f1164a.m = i;
            return this;
        }
    }

    public void e(View view) {
        int i;
        int i2;
        if (this.f1162b) {
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            int iF = (int) (f() * (view.getResources().getConfiguration().densityDpi / 160.0f));
            if (dyq.e(view)) {
                i = left - iF;
                i2 = right - iF;
            } else {
                i = left + iF;
                i2 = right + iF;
            }
            view.layout(i, top, i2, bottom);
        }
    }

    public int f() {
        return g(true);
    }

    public int g(boolean z) {
        int i;
        int[] iArr;
        int i2 = (this.g || (iArr = this.l) == null) ? this.j[this.h] : iArr[this.h];
        if (i2 == 0) {
            return i2;
        }
        if (z) {
            i = this.n;
        } else {
            i2 += this.f1161a;
            i = this.n;
        }
        return i2 + i;
    }

    public boolean h() {
        return this.f1162b;
    }

    public void i(int i, int i2, int i3, int i4, float f, boolean z) {
        if (this.e == i3 && this.c == i) {
            return;
        }
        if (o) {
            StringBuilder sb = new StringBuilder();
            sb.append("onContainerSizeChanged new Win w = ");
            sb.append(i);
            sb.append(" h = ");
            sb.append(i2);
            sb.append(" new C w = ");
            sb.append(i3);
            sb.append(" h = ");
            sb.append(i4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onContainerSizeChanged old Win w = ");
            sb2.append(this.c);
            sb2.append(" h = ");
            sb2.append(this.d);
            sb2.append(" old C w = ");
            sb2.append(this.e);
            sb2.append(" h = ");
            sb2.append(this.f);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onContainerSizeChanged density ");
            sb3.append(f);
            sb3.append(" isInFloatingWindow = ");
            sb3.append(z);
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = (((float) i3) * 1.0f) / (((float) i) * f) >= 0.95f || z;
        if (o) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onContainerSizeChanged isFullWindow ");
            sb4.append(this.g);
        }
        if (this.d <= 550) {
            this.h = 0;
            return;
        }
        if (!this.g && this.f1163k != null) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f1163k;
                if (i5 >= iArr.length) {
                    break;
                }
                int i6 = (int) (iArr[i5] * f);
                if (i5 == 0 && i3 < i6) {
                    this.h = i5;
                    break;
                } else if (i3 <= i6) {
                    this.h = i5;
                    break;
                } else {
                    if (i5 == iArr.length - 1) {
                        this.h = i5 + 1;
                    }
                    i5++;
                }
            }
        } else {
            int i7 = 0;
            while (true) {
                int[] iArr2 = this.i;
                if (i7 >= iArr2.length) {
                    break;
                }
                int i8 = (int) (iArr2[i7] * f);
                if (i7 == 0 && i3 < i8) {
                    this.h = i7;
                    break;
                } else if (i3 <= i8) {
                    this.h = i7;
                    break;
                } else {
                    if (i7 == iArr2.length - 1) {
                        this.h = i7 + 1;
                    }
                    i7++;
                }
            }
        }
        int i9 = this.m;
        if (i9 > 0) {
            float f2 = (i3 / f) + 0.5f;
            if (f2 > i9) {
                this.n = (int) ((f2 - i9) / 2.0f);
                return;
            }
        }
        this.n = 0;
    }

    public void j(boolean z) {
        this.f1162b = z;
    }
}
