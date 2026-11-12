package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class fn extends View {
    private Bitmap a;
    private Bitmap b;
    private Bitmap c;
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

    public fn(Context context) {
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
            this.t = context.getApplicationContext();
            InputStream inputStreamOpen2 = el.a(context).open("ap.data");
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen2);
                this.f = bitmapDecodeStream;
                this.a = er.a(bitmapDecodeStream, l.a);
                inputStreamOpen2.close();
                inputStreamOpen = el.a(context).open("ap1.data");
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpen);
                this.g = bitmapDecodeStream2;
                this.b = er.a(bitmapDecodeStream2, l.a);
                inputStreamOpen.close();
                this.k = this.b.getWidth();
                this.j = this.b.getHeight();
                this.h.setAntiAlias(true);
                this.h.setColor(-16777216);
                this.h.setStyle(Paint.Style.STROKE);
                AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = context.getFilesDir() + "/icon_web_day.data";
                AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = context.getFilesDir() + "/icon_web_night.data";
                eq.a().a(new Runnable() { // from class: com.amap.api.mapcore.util.fn.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        fn.this.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
                        fn.this.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
                        if ("".equals(eh.a(fn.this.t, "amap_web_logo", "md5_day", ""))) {
                            if (fn.this.c == null || fn.this.d == null) {
                                eh.a(fn.this.t, "amap_web_logo", "md5_day", (Object) "0b718b5f291b09d2b62be725dfb977b3");
                                eh.a(fn.this.t, "amap_web_logo", "md5_night", (Object) "4b1405462a5c910de0e0723ffd96c018");
                                return;
                            }
                            eh.a(fn.this.t, "amap_web_logo", "md5_day", (Object) gr.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME));
                            String strA = gr.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
                            if (!"".equals(strA)) {
                                eh.a(fn.this.t, "amap_web_logo", "md5_night", (Object) strA);
                            }
                            fn.this.d(true);
                        }
                    }
                });
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
                    hn.c(th, "WaterMarkerView", "create");
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

    private void e() {
        int i = this.o;
        if (i == 0) {
            g();
        } else if (i == 2) {
            f();
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

    private void f() {
        if (this.x) {
            this.p = (int) (getWidth() * this.v);
        } else {
            this.p = (int) ((getWidth() * this.v) - this.k);
        }
        this.q = (int) (getHeight() * this.w);
    }

    private void g() {
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

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        try {
            if (!this.u || getWidth() == 0 || getHeight() == 0 || this.b == null) {
                return;
            }
            if (!this.r) {
                e();
                this.r = true;
            }
            if (!this.y || (bitmap = this.e) == null) {
                if (this.i) {
                    if (!this.s || (bitmap = this.d) == null) {
                        bitmap = this.b;
                    }
                } else if (!this.s || (bitmap = this.c) == null) {
                    bitmap = this.a;
                }
            }
            canvas.drawBitmap(bitmap, this.m, this.n, this.h);
        } catch (Throwable th) {
            hn.c(th, "WaterMarkerView", "onDraw");
            th.printStackTrace();
        }
    }

    public final void a() {
        try {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                er.c(bitmap);
                this.a = null;
            }
            Bitmap bitmap2 = this.b;
            if (bitmap2 != null) {
                er.c(bitmap2);
                this.b = null;
            }
            this.a = null;
            this.b = null;
            Bitmap bitmap3 = this.f;
            if (bitmap3 != null) {
                er.c(bitmap3);
                this.f = null;
            }
            Bitmap bitmap4 = this.g;
            if (bitmap4 != null) {
                er.c(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.c;
            if (bitmap5 != null) {
                er.c(bitmap5);
            }
            this.c = null;
            Bitmap bitmap6 = this.d;
            if (bitmap6 != null) {
                er.c(bitmap6);
            }
            this.d = null;
            Bitmap bitmap7 = this.e;
            if (bitmap7 != null) {
                bitmap7.recycle();
            }
            this.h = null;
        } catch (Throwable th) {
            hn.c(th, "WaterMarkerView", "destory");
            th.printStackTrace();
        }
    }

    public final Point b() {
        return new Point(this.m, this.n - 2);
    }

    public final void c(int i) {
        this.o = 1;
        this.p = i;
        c();
    }

    public final void b(int i) {
        this.o = 1;
        this.q = i;
        c();
    }

    public final void c() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e();
        postInvalidate();
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
                Bitmap bitmap2 = this.c;
                if (bitmap2 != null) {
                    this.k = bitmap2.getWidth();
                    this.j = this.c.getHeight();
                    return;
                }
                return;
            }
            this.k = this.a.getWidth();
            this.j = this.a.getHeight();
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
            this.k = this.a.getWidth();
            this.j = this.a.getHeight();
        }
    }

    public final void c(boolean z) {
        this.u = z;
    }

    public final boolean d() {
        return this.i;
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
                hn.c(th, "WaterMarkerView", "changeBitmap");
                th.printStackTrace();
            }
        }
    }

    public final void a(int i) {
        this.o = 0;
        this.l = i;
        c();
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

    public final void a(String str, int i) {
        try {
            if (this.u && new File(str).exists()) {
                if (i == 0) {
                    Bitmap bitmap = this.c;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile;
                    this.c = er.a(bitmapDecodeFile, l.a);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    er.c(bitmap);
                    return;
                }
                if (i == 1) {
                    Bitmap bitmap2 = this.d;
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str);
                    this.f = bitmapDecodeFile2;
                    this.d = er.a(bitmapDecodeFile2, l.a);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    er.c(bitmap2);
                }
            }
        } catch (Throwable th) {
            hn.c(th, "WaterMarkerView", "create");
            th.printStackTrace();
        }
    }
}
