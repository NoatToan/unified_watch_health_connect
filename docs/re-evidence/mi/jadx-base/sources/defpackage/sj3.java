package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.xiaomi.fitness.widget.view.ViewfinderView;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class sj3 extends Handler implements btk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7h f33696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es5 f33697b;
    public a c;
    public final eh3 d;
    public final ViewfinderView e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public enum a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public sj3(Activity activity, ViewfinderView viewfinderView, s7h s7hVar, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, eh3 eh3Var) {
        this.e = viewfinderView;
        this.f33696a = s7hVar;
        es5 es5Var = new es5(activity, eh3Var, this, collection, map, str, this);
        this.f33697b = es5Var;
        es5Var.start();
        this.c = a.SUCCESS;
        this.d = eh3Var;
        eh3Var.r();
        g();
    }

    @Override // defpackage.btk
    public void a(atk atkVar) {
        if (this.e != null) {
            this.e.a(l(atkVar));
        }
    }

    public boolean b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.i;
    }

    public boolean e() {
        return this.f;
    }

    public void f() {
        this.c = a.DONE;
        this.d.s();
        Message.obtain(this.f33697b.a(), sqi.g).sendToTarget();
        try {
            this.f33697b.join(100L);
        } catch (InterruptedException unused) {
        }
        removeMessages(sqi.d);
        removeMessages(sqi.c);
    }

    public void g() {
        if (this.c == a.SUCCESS) {
            this.c = a.PREVIEW;
            this.d.j(this.f33697b.a(), sqi.f33889b);
            ViewfinderView viewfinderView = this.e;
            if (viewfinderView != null) {
                viewfinderView.j();
            }
        }
    }

    public void h(boolean z) {
        this.g = z;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        float f;
        int i = message.what;
        if (i == sqi.h) {
            g();
            return;
        }
        if (i != sqi.d) {
            if (i == sqi.c) {
                this.c = a.PREVIEW;
                this.d.j(this.f33697b.a(), sqi.f33889b);
                return;
            }
            return;
        }
        this.c = a.SUCCESS;
        Bundle data = message.getData();
        Bitmap bitmapCopy = null;
        if (data != null) {
            byte[] byteArray = data.getByteArray("barcode_bitmap");
            bitmapCopy = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
            f = data.getFloat("barcode_scaled_factor");
        } else {
            f = 1.0f;
        }
        this.f33696a.a((wsk) message.obj, bitmapCopy, f);
    }

    public void i(boolean z) {
        this.h = z;
    }

    public void j(boolean z) {
        this.i = z;
    }

    public void k(boolean z) {
        this.f = z;
    }

    public final atk l(atk atkVar) {
        float fC;
        float fD;
        int iMax;
        Point pointG = this.d.g();
        Point pointC = this.d.c();
        int i = pointG.x;
        int i2 = pointG.y;
        if (i < i2) {
            float f = (i * 1.0f) / pointC.y;
            float f2 = (i2 * 1.0f) / pointC.x;
            fC = (atkVar.c() * f) - (Math.max(pointG.x, pointC.y) / 2);
            fD = atkVar.d() * f2;
            iMax = Math.min(pointG.y, pointC.x) / 2;
        } else {
            float f3 = (i * 1.0f) / pointC.x;
            float f4 = (i2 * 1.0f) / pointC.y;
            fC = (atkVar.c() * f3) - (Math.min(pointG.y, pointC.y) / 2);
            fD = atkVar.d() * f4;
            iMax = Math.max(pointG.x, pointC.x) / 2;
        }
        return new atk(fC, fD - iMax);
    }
}
