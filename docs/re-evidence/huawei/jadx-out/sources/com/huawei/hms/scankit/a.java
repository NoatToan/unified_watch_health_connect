package com.huawei.hms.scankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.e5;
import com.huawei.hms.scankit.p.f5;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.u6;
import com.huawei.hms.scankit.p.v5;
import com.huawei.hms.scankit.p.v6;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class a extends Handler implements v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5 f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f15908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15909c;
    private EnumC0170a d;
    private Context e;
    private final j0 f;
    private final ViewfinderView g;
    private boolean h;
    private boolean i;
    private boolean j;
    private e5 k;
    private boolean l;

    /* JADX INFO: renamed from: com.huawei.hms.scankit.a$a, reason: collision with other inner class name */
    enum EnumC0170a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public void c(boolean z) {
        this.h = z;
    }

    public boolean d() {
        return this.j;
    }

    public void e() {
        this.d = EnumC0170a.DONE;
        this.f.q();
        Message.obtain(this.f15908b.a(), R.id.scankit_quit).sendToTarget();
        try {
            this.f15908b.b();
            this.f15908b.join(50L);
        } catch (InterruptedException unused) {
            o4.e("CaptureHandler", "quitSynchronously   wait interrupt");
        }
        this.f15908b = null;
        removeMessages(R.id.scankit_decode_succeeded);
        removeMessages(R.id.scankit_decode_failed);
    }

    public void f() {
        if (this.d == EnumC0170a.SUCCESS) {
            this.d = EnumC0170a.PREVIEW;
            this.f.o();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HmsScan hmsScan;
        int i = message.what;
        if (i == R.id.scankit_restart_preview) {
            f();
            return;
        }
        if (i != R.id.scankit_decode_succeeded) {
            if (i == R.id.scankit_decode_failed) {
                this.d = EnumC0170a.PREVIEW;
                this.f.o();
                return;
            }
            return;
        }
        this.d = EnumC0170a.SUCCESS;
        Object obj = message.obj;
        if (obj instanceof HmsScan[]) {
            HmsScan[] hmsScanArr = (HmsScan[]) obj;
            if (hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.isEmpty(hmsScan.originalValue)) {
                o4.d("CaptureHandler", "retrieve  HmsScan lenth is 0");
            } else {
                o4.d("CaptureHandler", "scan successful");
                Bitmap bitmapDecodeByteArray = null;
                float f = 0.0f;
                if (this.i) {
                    o4.d("CaptureHandler", "scan successful & return bitmap");
                    Bundle data = message.getData();
                    if (data != null) {
                        byte[] byteArray = data.getByteArray("barcode_bitmap");
                        f = data.getFloat("barcode_scaled_factor", 0.0f);
                        if (byteArray != null && byteArray.length > 0) {
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        }
                    }
                    this.f15907a.a(hmsScanArr, bitmapDecodeByteArray, f);
                } else {
                    this.f15907a.a(hmsScanArr, null, 0.0f);
                }
                if (!this.l) {
                    return;
                }
            }
            f();
        }
    }

    public boolean c() {
        return this.i;
    }

    a(Context context, ViewfinderView viewfinderView, f5 f5Var, Collection collection, Map map, String str, j0 j0Var, Rect rect, int i, boolean z, boolean z2) {
        this.g = viewfinderView;
        this.f15907a = f5Var;
        this.f15909c = i;
        this.e = context;
        d dVar = new d(context, j0Var, this, collection, map, str, this);
        this.f15908b = dVar;
        dVar.a(rect);
        this.f15908b.a(z2);
        this.f15908b.start();
        this.l = z;
        j0Var.a(new j(this.f15908b));
        this.d = EnumC0170a.SUCCESS;
        this.f = j0Var;
        j0Var.p();
        o4.a("scan-time", "start preview time:" + System.currentTimeMillis());
        f();
        v5.a(null);
    }

    @Override // com.huawei.hms.scankit.p.v6
    public void a(u6 u6Var) {
        if (this.g != null) {
            this.g.a(b(u6Var));
        }
    }

    private u6 b(u6 u6Var) {
        float fB;
        float fC;
        int iMax;
        Point pointB = i8.b(this.e);
        Point pointE = this.f.e();
        int i = pointB.x;
        int i2 = pointB.y;
        if (i < i2) {
            float f = (i * 1.0f) / pointE.y;
            float f2 = (i2 * 1.0f) / pointE.x;
            fB = (u6Var.b() * f) - (Math.max(pointB.x, pointE.y) / 2.0f);
            fC = u6Var.c() * f2;
            iMax = Math.min(pointB.y, pointE.x);
        } else {
            float f3 = (i * 1.0f) / pointE.x;
            float f4 = (i2 * 1.0f) / pointE.y;
            fB = (u6Var.b() * f3) - (Math.min(pointB.y, pointE.y) / 2.0f);
            fC = u6Var.c() * f4;
            iMax = Math.max(pointB.x, pointE.x);
        }
        return new u6(fB, fC - (iMax / 2.0f));
    }

    public int b() {
        return this.f15909c;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public void a(e5 e5Var) {
        this.k = e5Var;
    }

    public boolean a() {
        e5 e5Var = this.k;
        if (e5Var != null) {
            return e5Var.a();
        }
        return false;
    }

    public void a(boolean z) {
        this.i = z;
    }
}
