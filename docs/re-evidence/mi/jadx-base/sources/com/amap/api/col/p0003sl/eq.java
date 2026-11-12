package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import defpackage.f7t;
import defpackage.m0t;
import defpackage.m2t;
import defpackage.nls;
import defpackage.pms;
import defpackage.ugt;
import defpackage.zls;
import defpackage.zns;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class eq extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f6048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6049b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public Paint h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6050k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6051r;
    public boolean s;
    public Context t;
    public boolean u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;

    public class a extends f7t {
        public a() {
        }

        @Override // defpackage.f7t
        public final void runTask() {
            eq.this.e(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
            eq.this.e(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
            if ("".equals(nls.b(eq.this.t, "amap_web_logo", "md5_day", ""))) {
                if (eq.this.c == null || eq.this.d == null) {
                    nls.c(eq.this.t, "amap_web_logo", "md5_day", "0b718b5f291b09d2b62be725dfb977b3");
                    nls.c(eq.this.t, "amap_web_logo", "md5_night", "4b1405462a5c910de0e0723ffd96c018");
                    return;
                }
                nls.c(eq.this.t, "amap_web_logo", "md5_day", m0t.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME));
                String strA = m0t.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
                if (!"".equals(strA)) {
                    nls.c(eq.this.t, "amap_web_logo", "md5_night", strA);
                }
                eq.this.p(true);
            }
        }
    }

    public eq(Context context) {
        InputStream inputStream;
        super(context);
        this.h = new Paint();
        this.i = false;
        this.j = 0;
        this.f6050k = 0;
        this.l = 0;
        this.m = 10;
        this.n = 0;
        this.o = 0;
        this.p = 10;
        this.q = 8;
        this.f6051r = false;
        this.s = false;
        this.u = true;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = true;
        this.y = false;
        InputStream inputStreamOpen = null;
        try {
            this.t = context.getApplicationContext();
            InputStream inputStreamOpen2 = zls.b(context).open("ap.data");
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen2);
                this.f = bitmapDecodeStream;
                this.f6048a = zns.m(bitmapDecodeStream, ugt.f35750b);
                inputStreamOpen2.close();
                inputStreamOpen = zls.b(context).open("ap1.data");
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpen);
                this.g = bitmapDecodeStream2;
                this.f6049b = zns.m(bitmapDecodeStream2, ugt.f35750b);
                inputStreamOpen.close();
                this.f6050k = this.f6049b.getWidth();
                this.j = this.f6049b.getHeight();
                this.h.setAntiAlias(true);
                this.h.setColor(-16777216);
                this.h.setStyle(Paint.Style.STROKE);
                AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = context.getFilesDir() + "/icon_web_day.data";
                AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = context.getFilesDir() + "/icon_web_night.data";
                pms.a().b(new a());
                try {
                    inputStreamOpen2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamOpen;
                inputStreamOpen = inputStreamOpen2;
                try {
                    m2t.r(th, "WaterMarkerView", "create");
                } finally {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }

    public final void b() {
        try {
            Bitmap bitmap = this.f6048a;
            if (bitmap != null) {
                zns.C(bitmap);
                this.f6048a = null;
            }
            Bitmap bitmap2 = this.f6049b;
            if (bitmap2 != null) {
                zns.C(bitmap2);
                this.f6049b = null;
            }
            this.f6048a = null;
            this.f6049b = null;
            Bitmap bitmap3 = this.f;
            if (bitmap3 != null) {
                zns.C(bitmap3);
                this.f = null;
            }
            Bitmap bitmap4 = this.g;
            if (bitmap4 != null) {
                zns.C(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.c;
            if (bitmap5 != null) {
                zns.C(bitmap5);
            }
            this.c = null;
            Bitmap bitmap6 = this.d;
            if (bitmap6 != null) {
                zns.C(bitmap6);
            }
            this.d = null;
            Bitmap bitmap7 = this.e;
            if (bitmap7 != null) {
                bitmap7.recycle();
            }
            this.h = null;
        } catch (Throwable th) {
            m2t.r(th, "WaterMarkerView", "destory");
            th.printStackTrace();
        }
    }

    public final void c(int i) {
        this.o = 0;
        this.l = i;
        l();
    }

    public final void d(int i, float f) {
        if (this.u) {
            this.o = 2;
            float fMax = Math.max(0.0f, Math.min(f, 1.0f));
            if (i == 0) {
                this.v = fMax;
                this.x = true;
            } else if (i == 1) {
                this.v = 1.0f - fMax;
                this.x = false;
            } else if (i == 2) {
                this.w = 1.0f - fMax;
            }
            l();
        }
    }

    public final void e(String str, int i) {
        try {
            if (this.u && new File(str).exists()) {
                if (i == 0) {
                    Bitmap bitmap = this.c;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile;
                    this.c = zns.m(bitmapDecodeFile, ugt.f35750b);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    zns.C(bitmap);
                    return;
                }
                if (i == 1) {
                    Bitmap bitmap2 = this.d;
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile2;
                    this.d = zns.m(bitmapDecodeFile2, ugt.f35750b);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    zns.C(bitmap2);
                }
            }
        } catch (Throwable th) {
            m2t.r(th, "WaterMarkerView", "create");
            th.printStackTrace();
        }
    }

    public final void f(boolean z) {
        if (this.u) {
            try {
                this.i = z;
                if (z) {
                    this.h.setColor(-1);
                } else {
                    this.h.setColor(-16777216);
                }
            } catch (Throwable th) {
                m2t.r(th, "WaterMarkerView", "changeBitmap");
                th.printStackTrace();
            }
        }
    }

    public final Point h() {
        return new Point(this.m, this.n - 2);
    }

    public final void i(int i) {
        this.o = 1;
        this.q = i;
        l();
    }

    public final void j(boolean z) {
        if (this.u) {
            this.y = z;
            if (!z) {
                this.f6050k = this.f6048a.getWidth();
                this.j = this.f6048a.getHeight();
                return;
            }
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                this.f6050k = bitmap.getWidth();
                this.j = this.e.getHeight();
            }
        }
    }

    public final void l() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        s();
        postInvalidate();
    }

    public final void m(int i) {
        this.o = 1;
        this.p = i;
        l();
    }

    public final void n(boolean z) {
        this.u = z;
    }

    public final float o(int i) {
        float f;
        if (!this.u) {
            return 0.0f;
        }
        if (i == 0) {
            return this.v;
        }
        if (i == 1) {
            f = this.v;
        } else {
            if (i != 2) {
                return 0.0f;
            }
            f = this.w;
        }
        return 1.0f - f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (!this.u || getWidth() == 0 || getHeight() == 0 || this.f6049b == null) {
                return;
            }
            if (!this.f6051r) {
                s();
                this.f6051r = true;
            }
            canvas.drawBitmap(r(), this.m, this.n, this.h);
        } catch (Throwable th) {
            m2t.r(th, "WaterMarkerView", "onDraw");
            th.printStackTrace();
        }
    }

    public final void p(boolean z) {
        if (this.u && this.s != z) {
            this.s = z;
            if (!z) {
                this.f6050k = this.f6048a.getWidth();
                this.j = this.f6048a.getHeight();
                return;
            }
            if (this.i) {
                Bitmap bitmap = this.d;
                if (bitmap != null) {
                    this.f6050k = bitmap.getWidth();
                    this.j = this.d.getHeight();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                this.f6050k = bitmap2.getWidth();
                this.j = this.c.getHeight();
            }
        }
    }

    public final boolean q() {
        return this.i;
    }

    public final Bitmap r() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.y && (bitmap3 = this.e) != null) {
            return bitmap3;
        }
        if (this.i) {
            return (!this.s || (bitmap2 = this.d) == null) ? this.f6049b : bitmap2;
        }
        return (!this.s || (bitmap = this.c) == null) ? this.f6048a : bitmap;
    }

    public final void s() {
        int i = this.o;
        if (i == 0) {
            u();
        } else if (i == 2) {
            t();
        }
        this.m = this.p;
        int height = (getHeight() - this.q) - this.j;
        this.n = height;
        if (this.m < 0) {
            this.m = 0;
        }
        if (height < 0) {
            this.n = 0;
        }
    }

    public final void t() {
        if (this.x) {
            this.p = (int) (getWidth() * this.v);
        } else {
            this.p = (int) ((getWidth() * this.v) - this.f6050k);
        }
        this.q = (int) (getHeight() * this.w);
    }

    public final void u() {
        int i = this.l;
        if (i == 1) {
            this.p = (getWidth() - this.f6050k) / 2;
        } else if (i == 2) {
            this.p = (getWidth() - this.f6050k) - 10;
        } else {
            this.p = 10;
        }
        this.q = 8;
    }
}
