package com.huawei.openalliance.ad.views.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Gravity;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ap;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.ds;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes12.dex */
public class b extends Drawable implements Animatable, Drawable.Callback {
    private Paint f;
    private String i;
    private int l;
    private int m;
    private a o;
    private Context p;
    private c r;
    private boolean s;
    private ap t;
    private d v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21221a = "render_frame" + hashCode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Canvas f21222b = new Canvas();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f21223c = new Rect();
    private Rect d = new Rect();
    private Rect e = new Rect();
    private boolean g = false;
    private int h = 0;
    private Queue<c> j = new ConcurrentLinkedQueue();
    private Queue<Bitmap> k = new ConcurrentLinkedQueue();
    private boolean n = false;
    private long q = 0;
    private final WeakHashMap<Drawable.Callback, Void> u = new WeakHashMap<>();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        for (Drawable.Callback callback : this.u.keySet()) {
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        hw.b(o(), "stop");
        this.g = false;
        b();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        hw.b(o(), "start");
        this.g = true;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        hw.b(o(), "setVisible " + z);
        if (!z) {
            stop();
        } else if (!this.g) {
            start();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        for (Drawable.Callback callback : this.u.keySet()) {
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        for (Drawable.Callback callback : this.u.keySet()) {
            if (callback != null) {
                callback.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.r;
        return cVar != null ? cVar.f21235b.getWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.r;
        return cVar != null ? cVar.f21235b.getHeight() : super.getIntrinsicHeight();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.t.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        c cVar = this.r;
        if (cVar == null || cVar.f21235b == null) {
            return;
        }
        if (hw.a()) {
            hw.a(o(), "draw frame: %d", Integer.valueOf(this.r.f21234a));
        }
        if (this.s) {
            Gravity.apply(Constants.MAX_PRO_BOTTOM_MARGIN_PAD, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f21223c);
            this.s = false;
        }
        canvas.drawBitmap(this.r.f21235b, (Rect) null, this.f21223c, d());
    }

    public int c() {
        int size = (this.k.size() + this.j.size()) * getIntrinsicWidth() * getIntrinsicHeight() * 4;
        if (size > 0) {
            return size;
        }
        return 1;
    }

    public void b() {
        hw.b(o(), "stop play " + ds.a(this.i));
        dq.a(this.f21221a);
        a(true);
        this.j.clear();
        this.t.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.g();
            }
        });
    }

    public void a(d dVar) {
        this.v = dVar;
    }

    public void a() {
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        hw.b(o(), "play " + ds.a(this.i));
        b();
        f();
        a(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o() {
        return "GifDrawable_" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        hw.b(o(), "on play end");
        m();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.8
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.v != null) {
                    b.this.v.c();
                }
            }
        });
    }

    private void m() {
        this.k.clear();
    }

    private void l() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.v != null) {
                    b.this.v.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.i(b.this);
                if (b.this.h != 0 && b.this.l >= b.this.h) {
                    b.this.b();
                    b.this.n();
                } else {
                    b.this.e();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        final a aVar;
        if (h() || (aVar = this.o) == null || aVar.c()) {
            return;
        }
        this.t.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.4
            @Override // java.lang.Runnable
            public void run() {
                hw.b(b.this.o(), "fetch next");
                long jCurrentTimeMillis = System.currentTimeMillis();
                c cVarA = aVar.a();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                hw.a(b.this.o(), "frame fetch - decoding duration: %d gif: %s", Long.valueOf(jCurrentTimeMillis2), cVarA);
                b bVar = b.this;
                if (cVarA == null) {
                    c cVar = (c) bVar.j.poll();
                    if (cVar == null) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - b.this.q;
                        if (jCurrentTimeMillis3 < b.this.m) {
                            try {
                                Thread.sleep(((long) b.this.m) - jCurrentTimeMillis3);
                            } catch (InterruptedException unused) {
                                hw.a(b.this.o(), "InterruptedException");
                            }
                        }
                        b.this.k();
                        return;
                    }
                    b.this.a(cVar);
                    return;
                }
                boolean zA = bVar.a(cVarA, jCurrentTimeMillis2);
                hw.a(b.this.o(), "need reduce size: %s", Boolean.valueOf(zA));
                c cVarA2 = cVarA.a();
                cVarA2.f21235b = b.this.a(cVarA.f21235b, zA);
                if (!b.this.j.offer(cVarA2)) {
                    hw.c(b.this.o(), "fail to add frame to cache");
                }
                if (jCurrentTimeMillis2 <= cVarA2.f21236c) {
                    hw.b(b.this.o(), "send to render directly");
                    b bVar2 = b.this;
                    bVar2.a((c) bVar2.j.poll());
                    return;
                }
                int i = (int) ((jCurrentTimeMillis2 * 1.0d) / ((double) cVarA2.f21236c));
                if (i > 5) {
                    i = 5;
                }
                hw.a(b.this.o(), "preferred cached frame num: %d", Integer.valueOf(i));
                if (b.this.j.size() < i) {
                    b.this.j();
                } else {
                    b bVar3 = b.this;
                    bVar3.a((c) bVar3.j.poll());
                }
            }
        });
    }

    private void i() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.v != null) {
                    b.this.v.b();
                }
                b.this.b();
            }
        });
    }

    static /* synthetic */ int i(b bVar) {
        int i = bVar.l;
        bVar.l = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        boolean z;
        synchronized (this) {
            z = this.n;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        a aVar = this.o;
        if (aVar != null) {
            aVar.b();
            this.o = null;
        }
    }

    private void f() {
        a(false);
        this.l = 0;
        this.j.clear();
    }

    private InputStream f(String str) {
        try {
            return this.p.getAssets().open(str.substring(Scheme.ASSET.toString().length()));
        } catch (IOException e) {
            hw.c(o(), "loadFile " + e.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        hw.b(o(), "replay " + ds.a(this.i));
        a(this.i);
    }

    private InputStream e(String str) {
        String strO;
        StringBuilder sb;
        try {
            return this.p.getResources().openRawResource(Integer.parseInt(str.substring(Scheme.RES.toString().length())));
        } catch (Resources.NotFoundException e) {
            e = e;
            strO = o();
            sb = new StringBuilder("loadFile ");
            sb.append(e.getClass().getSimpleName());
            hw.c(strO, sb.toString());
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            strO = o();
            sb = new StringBuilder("loadFile ");
            sb.append(e.getClass().getSimpleName());
            hw.c(strO, sb.toString());
            return null;
        }
    }

    private InputStream d(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            hw.c(o(), "loadFile " + e.getClass().getSimpleName());
            return null;
        }
    }

    private Paint d() {
        if (this.f == null) {
            this.f = new Paint(2);
        }
        return this.f;
    }

    private void c(c cVar) {
        if (cVar == null || this.k.size() >= 2) {
            hw.b(o(), "drop frame");
        } else {
            if (this.k.contains(cVar.f21235b) || this.k.offer(cVar.f21235b)) {
                return;
            }
            hw.c(o(), "fail to release frame to pool");
        }
    }

    private InputStream c(String str) {
        try {
            return this.p.getContentResolver().openInputStream(Uri.parse(str));
        } catch (FileNotFoundException e) {
            hw.c(o(), "oPIs " + e.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        InputStream inputStreamC;
        g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith(Scheme.ASSET.toString())) {
            inputStreamC = f(str);
        } else if (str.startsWith(Scheme.RES.toString())) {
            inputStreamC = e(str);
        } else {
            inputStreamC = str.startsWith(Scheme.CONTENT.toString()) ? c(str) : d(str);
        }
        if (inputStreamC != null) {
            try {
                this.o = new a(inputStreamC, 100);
                j();
            } catch (Exception unused) {
                hw.c(o(), "exception in creating gif decoder");
                i();
            }
        }
    }

    private void b(c cVar) {
        c(this.r);
        this.r = cVar;
        this.m = cVar.f21236c;
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.7
            @Override // java.lang.Runnable
            public void run() {
                if (!b.this.h()) {
                    b.this.invalidateSelf();
                    b.this.j();
                } else {
                    b.this.r = null;
                }
            }
        }, this.f21221a, 0L);
        this.q = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(c cVar, long j) {
        int iCeil;
        int i = cVar.f21235b.getConfig() == Bitmap.Config.RGB_565 ? 2 : 4;
        long width = cVar.f21235b.getWidth();
        long height = cVar.f21235b.getHeight();
        long j2 = i;
        if (j > cVar.f21236c) {
            iCeil = (int) Math.ceil((j * 1.0d) / ((double) cVar.f21236c));
            if (iCeil > 5) {
                iCeil = 5;
            }
        } else {
            iCeil = 1;
        }
        long jMax = width * height * j2 * ((long) Math.max(iCeil, this.j.size()));
        long jB = as.b();
        if (hw.a()) {
            hw.a(o(), "max frame mem: %d unused memory: %d", Long.valueOf(jMax), Long.valueOf(jB));
        }
        return jMax >= jB;
    }

    private void a(boolean z) {
        synchronized (this) {
            this.n = z;
        }
    }

    private void a(final String str) {
        this.t.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.gif.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar) {
        if (cVar == null) {
            hw.b(o(), "invalid frame.");
            return;
        }
        hw.b(o(), "onFrameDecoded index: %d isstop: %s", Integer.valueOf(cVar.f21234a), Boolean.valueOf(h()));
        if (h()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.q;
        if (hw.a()) {
            hw.a(o(), "onFrameDecoded decodeInterval: %d currentFrameDuration: %d", Long.valueOf(jCurrentTimeMillis), Integer.valueOf(this.m));
        }
        if (cVar.f21234a == 1) {
            l();
            b(cVar);
            return;
        }
        long j = this.m;
        if (jCurrentTimeMillis < j) {
            try {
                Thread.sleep(j - jCurrentTimeMillis);
            } catch (InterruptedException unused) {
                hw.a(o(), "sleep InterruptedException");
            }
        }
        b(cVar);
    }

    private void a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            this.f21222b.setBitmap(bitmap2);
            this.f21222b.drawColor(0, PorterDuff.Mode.CLEAR);
            this.d.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.e.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            this.f21222b.drawBitmap(bitmap, this.d, this.e, (Paint) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public Bitmap a(Bitmap bitmap, boolean z) {
        int i;
        if (hw.a()) {
            hw.a(o(), "image pool size: %d", Integer.valueOf(this.k.size()));
        }
        Bitmap bitmapPoll = this.k.poll();
        if (bitmapPoll == null) {
            hw.b(o(), "cache bitmap null");
            if (!z) {
                return bitmap.copy(bitmap.getConfig(), true);
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width < height) {
                i = GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
                if (width <= 640) {
                    i = width;
                }
            } else {
                i = 960;
                if (width <= 960) {
                    i = width;
                }
            }
            int i2 = (int) (((i * height) * 1.0f) / width);
            hw.b(o(), "reduce image size to w: %d, h: %d src w: %d, h: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height));
            bitmapPoll = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        }
        a(bitmap, bitmapPoll);
        return bitmapPoll;
    }

    public b(Context context, String str) {
        this.p = context.getApplicationContext();
        this.i = str;
        ap apVar = new ap("gif-thread");
        this.t = apVar;
        apVar.a();
        setCallback(this);
    }
}
