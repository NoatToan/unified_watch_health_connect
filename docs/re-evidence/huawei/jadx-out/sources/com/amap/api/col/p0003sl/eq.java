package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class eq extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f2467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f2468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f2469c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private Paint h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private Context t;
    private boolean u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;

    public final void a() {
        try {
            Bitmap bitmap = this.f2467a;
            if (bitmap != null) {
                eb.a(bitmap);
                this.f2467a = null;
            }
            Bitmap bitmap2 = this.f2468b;
            if (bitmap2 != null) {
                eb.a(bitmap2);
                this.f2468b = null;
            }
            this.f2467a = null;
            this.f2468b = null;
            Bitmap bitmap3 = this.f;
            if (bitmap3 != null) {
                eb.a(bitmap3);
                this.f = null;
            }
            Bitmap bitmap4 = this.g;
            if (bitmap4 != null) {
                eb.a(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.f2469c;
            if (bitmap5 != null) {
                eb.a(bitmap5);
            }
            this.f2469c = null;
            Bitmap bitmap6 = this.d;
            if (bitmap6 != null) {
                eb.a(bitmap6);
            }
            this.d = null;
            Bitmap bitmap7 = this.e;
            if (bitmap7 != null) {
                bitmap7.recycle();
            }
            this.h = null;
        } catch (Throwable th) {
            jv.c(th, "WaterMarkerView", "destory");
            th.printStackTrace();
        }
    }

    public eq(Context context) {
        InputStream inputStream;
        super(context);
        this.h = new Paint();
        this.i = false;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 10;
        this.n = 0;
        this.o = 0;
        this.p = 10;
        this.q = 8;
        this.r = false;
        this.s = false;
        this.u = true;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = true;
        this.y = false;
        InputStream inputStreamOpen = null;
        try {
            try {
                this.t = context.getApplicationContext();
                InputStream inputStreamOpen2 = dv.a(context).open("ap.data");
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen2);
                    this.f = bitmapDecodeStream;
                    this.f2467a = eb.a(bitmapDecodeStream, y.f3319b);
                    inputStreamOpen2.close();
                    inputStreamOpen = dv.a(context).open("ap1.data");
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpen);
                    this.g = bitmapDecodeStream2;
                    this.f2468b = eb.a(bitmapDecodeStream2, y.f3319b);
                    inputStreamOpen.close();
                    this.k = this.f2468b.getWidth();
                    this.j = this.f2468b.getHeight();
                    this.h.setAntiAlias(true);
                    this.h.setColor(-16777216);
                    this.h.setStyle(Paint.Style.STROKE);
                    AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = context.getFilesDir() + "/icon_web_day.data";
                    AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = context.getFilesDir() + "/icon_web_night.data";
                    dz.a().a(new mb() { // from class: com.amap.api.col.3sl.eq.1
                        @Override // com.amap.api.col.p0003sl.mb
                        public final void runTask() {
                            eq.this.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
                            eq.this.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
                            if ("".equals(dr.a(eq.this.t, "amap_web_logo", "md5_day", ""))) {
                                if (eq.this.f2469c == null || eq.this.d == null) {
                                    dr.a(eq.this.t, "amap_web_logo", "md5_day", (Object) "0b718b5f291b09d2b62be725dfb977b3");
                                    dr.a(eq.this.t, "amap_web_logo", "md5_night", (Object) "4b1405462a5c910de0e0723ffd96c018");
                                    return;
                                }
                                dr.a(eq.this.t, "amap_web_logo", "md5_day", (Object) it.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME));
                                String strA = it.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
                                if (!"".equals(strA)) {
                                    dr.a(eq.this.t, "amap_web_logo", "md5_night", (Object) strA);
                                }
                                eq.this.d(true);
                            }
                        }
                    });
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    inputStreamOpen = inputStreamOpen2;
                    try {
                        jv.c(th, "WaterMarkerView", "create");
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        if (inputStream == null) {
                        }
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
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    private Bitmap e() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.y && (bitmap3 = this.e) != null) {
            return bitmap3;
        }
        if (this.i) {
            return (!this.s || (bitmap2 = this.d) == null) ? this.f2468b : bitmap2;
        }
        return (!this.s || (bitmap = this.f2469c) == null) ? this.f2467a : bitmap;
    }

    public final void a(boolean z) {
        if (this.u) {
            try {
                this.i = z;
                if (z) {
                    this.h.setColor(-1);
                } else {
                    this.h.setColor(-16777216);
                }
            } catch (Throwable th) {
                jv.c(th, "WaterMarkerView", "changeBitmap");
                th.printStackTrace();
            }
        }
    }

    public final Point b() {
        return new Point(this.m, this.n - 2);
    }

    public final void a(int i) {
        this.o = 0;
        this.l = i;
        c();
    }

    public final void b(int i) {
        this.o = 1;
        this.q = i;
        c();
    }

    public final void c(int i) {
        this.o = 1;
        this.p = i;
        c();
    }

    public final float d(int i) {
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

    public final void a(int i, float f) {
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
            c();
        }
    }

    public final void c() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        f();
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (this.u && getWidth() != 0 && getHeight() != 0 && this.f2468b != null) {
                if (!this.r) {
                    f();
                    this.r = true;
                }
                canvas.drawBitmap(e(), this.m, this.n, this.h);
            }
        } catch (Throwable th) {
            jv.c(th, "WaterMarkerView", "onDraw");
            th.printStackTrace();
        }
    }

    private void f() {
        int i = this.o;
        if (i == 0) {
            h();
        } else if (i == 2) {
            g();
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

    private void g() {
        if (this.x) {
            this.p = (int) (getWidth() * this.v);
        } else {
            this.p = (int) ((getWidth() * this.v) - this.k);
        }
        this.q = (int) (getHeight() * this.w);
    }

    private void h() {
        int i = this.l;
        if (i == 1) {
            this.p = (getWidth() - this.k) / 2;
        } else if (i == 2) {
            this.p = (getWidth() - this.k) - 10;
        } else {
            this.p = 10;
        }
        this.q = 8;
    }

    public final void a(String str, int i) {
        try {
            if (this.u && new File(str).exists()) {
                if (i == 0) {
                    Bitmap bitmap = this.f2469c;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile;
                    this.f2469c = eb.a(bitmapDecodeFile, y.f3319b);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    eb.a(bitmap);
                    return;
                }
                if (i == 1) {
                    Bitmap bitmap2 = this.d;
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile2;
                    this.d = eb.a(bitmapDecodeFile2, y.f3319b);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    eb.a(bitmap2);
                }
            }
        } catch (Throwable th) {
            jv.c(th, "WaterMarkerView", "create");
            th.printStackTrace();
        }
    }

    public final void b(boolean z) {
        if (this.u) {
            this.y = z;
            if (z) {
                Bitmap bitmap = this.e;
                if (bitmap != null) {
                    this.k = bitmap.getWidth();
                    this.j = this.e.getHeight();
                    return;
                }
                return;
            }
            this.k = this.f2467a.getWidth();
            this.j = this.f2467a.getHeight();
        }
    }

    public final void c(boolean z) {
        this.u = z;
    }

    public final void d(boolean z) {
        if (this.u && this.s != z) {
            this.s = z;
            if (z) {
                if (this.i) {
                    Bitmap bitmap = this.d;
                    if (bitmap != null) {
                        this.k = bitmap.getWidth();
                        this.j = this.d.getHeight();
                        return;
                    }
                    return;
                }
                Bitmap bitmap2 = this.f2469c;
                if (bitmap2 != null) {
                    this.k = bitmap2.getWidth();
                    this.j = this.f2469c.getHeight();
                    return;
                }
                return;
            }
            this.k = this.f2467a.getWidth();
            this.j = this.f2467a.getHeight();
        }
    }

    public final boolean d() {
        return this.i;
    }
}
