package t6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u6.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f162585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f162586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f162587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f162588f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m6.h f162591i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f162583a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f162589g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f162590h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f162586d = eVar;
        this.f162587e = aVar;
    }

    public final void a(d dVar, int i14) {
        b(dVar, i14, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i14, int i15, boolean z14) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z14 && !i(dVar)) {
            return false;
        }
        this.f162588f = dVar;
        if (dVar.f162583a == null) {
            dVar.f162583a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f162588f.f162583a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f162589g = i14;
        this.f162590h = i15;
        return true;
    }

    public final void c(int i14, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f162583a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                u6.i.a(it.next().f162586d, i14, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f162585c) {
            return this.f162584b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f162586d.f162623k0 == 8) {
            return 0;
        }
        int i14 = this.f162590h;
        return (i14 == Integer.MIN_VALUE || (dVar = this.f162588f) == null || dVar.f162586d.f162623k0 != 8) ? this.f162589g : i14;
    }

    public final d f() {
        a aVar = this.f162587e;
        int iOrdinal = aVar.ordinal();
        e eVar = this.f162586d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.N;
            case 2:
                return eVar.O;
            case 3:
                return eVar.L;
            case 4:
                return eVar.M;
            default:
                vb.h.q(aVar.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet<d> hashSet = this.f162583a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f162588f != null;
    }

    public final boolean i(d dVar) {
        if (dVar == null) {
            return false;
        }
        e eVar = dVar.f162586d;
        a aVar = dVar.f162587e;
        a aVar2 = this.f162587e;
        if (aVar == aVar2) {
            return aVar2 != a.BASELINE || (eVar.G && this.f162586d.G);
        }
        switch (aVar2) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z14 = aVar == a.LEFT || aVar == a.RIGHT;
                if (eVar instanceof h) {
                    return z14 || aVar == a.CENTER_X;
                }
                return z14;
            case TOP:
            case BOTTOM:
                boolean z15 = aVar == a.TOP || aVar == a.BOTTOM;
                if (eVar instanceof h) {
                    return z15 || aVar == a.CENTER_Y;
                }
                return z15;
            case BASELINE:
                return (aVar == a.LEFT || aVar == a.RIGHT) ? false : true;
            case CENTER:
                return (aVar == a.BASELINE || aVar == a.CENTER_X || aVar == a.CENTER_Y) ? false : true;
            default:
                vb.h.q(aVar2.name());
                return false;
        }
    }

    public final void j() {
        HashSet<d> hashSet;
        d dVar = this.f162588f;
        if (dVar != null && (hashSet = dVar.f162583a) != null) {
            hashSet.remove(this);
            if (this.f162588f.f162583a.size() == 0) {
                this.f162588f.f162583a = null;
            }
        }
        this.f162583a = null;
        this.f162588f = null;
        this.f162589g = 0;
        this.f162590h = Integer.MIN_VALUE;
        this.f162585c = false;
        this.f162584b = 0;
    }

    public final void k() {
        m6.h hVar = this.f162591i;
        if (hVar == null) {
            this.f162591i = new m6.h(m6.h.a.UNRESTRICTED, (String) null);
        } else {
            hVar.c();
        }
    }

    public final void l(int i14) {
        this.f162584b = i14;
        this.f162585c = true;
    }

    public final String toString() {
        return this.f162586d.f162627m0 + ":" + this.f162587e.toString();
    }
}
