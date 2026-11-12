package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b<e> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f7012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f7013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7014u;

    public <K> e(K k14, c<K> cVar, float f14) {
        super(k14, cVar);
        this.f7012s = null;
        this.f7013t = Float.MAX_VALUE;
        this.f7014u = false;
        this.f7012s = new f(f14);
    }

    @Override // androidx.dynamicanimation.animation.b
    public final boolean c(long j8) {
        boolean z14 = this.f7014u;
        float f14 = this.f7013t;
        if (z14) {
            if (f14 != Float.MAX_VALUE) {
                this.f7012s.f7023i = f14;
                this.f7013t = Float.MAX_VALUE;
            }
            this.f6996b = (float) this.f7012s.f7023i;
            this.f6995a = 0.0f;
            this.f7014u = false;
            return true;
        }
        f fVar = this.f7012s;
        if (f14 != Float.MAX_VALUE) {
            double d14 = fVar.f7023i;
            long j14 = j8 / 2;
            b.p pVarB = fVar.b(this.f6996b, this.f6995a, j14);
            f fVar2 = this.f7012s;
            fVar2.f7023i = this.f7013t;
            this.f7013t = Float.MAX_VALUE;
            b.p pVarB2 = fVar2.b(pVarB.f7008a, pVarB.f7009b, j14);
            this.f6996b = pVarB2.f7008a;
            this.f6995a = pVarB2.f7009b;
        } else {
            b.p pVarB3 = fVar.b(this.f6996b, this.f6995a, j8);
            this.f6996b = pVarB3.f7008a;
            this.f6995a = pVarB3.f7009b;
        }
        float fMax = Math.max(this.f6996b, this.f7002h);
        this.f6996b = fMax;
        float fMin = Math.min(fMax, this.f7001g);
        this.f6996b = fMin;
        float f15 = this.f6995a;
        f fVar3 = this.f7012s;
        fVar3.getClass();
        if (Math.abs(f15) >= fVar3.f7019e || Math.abs(fMin - ((float) fVar3.f7023i)) >= fVar3.f7018d) {
            return false;
        }
        this.f6996b = (float) this.f7012s.f7023i;
        this.f6995a = 0.0f;
        return true;
    }

    public final void d(float f14) {
        if (this.f7000f) {
            this.f7013t = f14;
            return;
        }
        if (this.f7012s == null) {
            this.f7012s = new f(f14);
        }
        this.f7012s.f7023i = f14;
        f();
    }

    public final void e() {
        if (this.f7012s.f7016b <= 0.0d) {
            org.apache.commons.lang3.e.w("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.f7000f) {
                this.f7014u = true;
            }
        }
    }

    public final void f() {
        f fVar = this.f7012s;
        if (fVar == null) {
            org.apache.commons.lang3.e.w("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d14 = (float) fVar.f7023i;
        if (d14 > this.f7001g) {
            org.apache.commons.lang3.e.w("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d14 < this.f7002h) {
            org.apache.commons.lang3.e.w("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f7004j * 0.75f);
        fVar.f7018d = dAbs;
        fVar.f7019e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z14 = this.f7000f;
        if (z14 || z14) {
            return;
        }
        this.f7000f = true;
        if (!this.f6997c) {
            this.f6996b = this.f6999e.getValue(this.f6998d);
        }
        float f14 = this.f6996b;
        if (f14 > this.f7001g || f14 < this.f7002h) {
            h.s("Starting value need to be in between min value and max value");
            return;
        }
        ThreadLocal<a> threadLocal = a.f6978f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = threadLocal.get();
        ArrayList<a.b> arrayList = aVar.f6980b;
        if (arrayList.size() == 0) {
            if (aVar.f6982d == null) {
                aVar.f6982d = new a.d(aVar.f6981c);
            }
            aVar.f6982d.a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public <K> e(K k14, c<K> cVar) {
        super(k14, cVar);
        this.f7012s = null;
        this.f7013t = Float.MAX_VALUE;
        this.f7014u = false;
    }

    public e(d dVar) {
        super(dVar);
        this.f7012s = null;
        this.f7013t = Float.MAX_VALUE;
        this.f7014u = false;
    }
}
