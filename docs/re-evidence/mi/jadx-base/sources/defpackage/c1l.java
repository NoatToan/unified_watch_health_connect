package defpackage;

import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c1l {
    public static int h;
    public njr c;
    public njr d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4833a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4834b = false;
    public ArrayList<njr> e = new ArrayList<>();

    public c1l(njr njrVar, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = njrVar;
        this.d = njrVar;
        this.g = i;
    }

    public void a(njr njrVar) {
        this.e.add(njrVar);
        this.d = njrVar;
    }

    public long b(d dVar, int i) {
        long j;
        int i2;
        njr njrVar = this.c;
        if (njrVar instanceof at3) {
            if (((at3) njrVar).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(njrVar instanceof sac)) {
                return 0L;
            }
        } else if (!(njrVar instanceof mpq)) {
            return 0L;
        }
        iz5 iz5Var = (i == 0 ? dVar.e : dVar.f).h;
        iz5 iz5Var2 = (i == 0 ? dVar.e : dVar.f).i;
        boolean zContains = njrVar.h.l.contains(iz5Var);
        boolean zContains2 = this.c.i.l.contains(iz5Var2);
        long j2 = this.c.j();
        if (zContains && zContains2) {
            long jD = d(this.c.h, 0L);
            long jC = c(this.c.i, 0L);
            long j3 = jD - j2;
            njr njrVar2 = this.c;
            int i3 = njrVar2.i.f;
            if (j3 >= (-i3)) {
                j3 += (long) i3;
            }
            int i4 = njrVar2.h.f;
            long j4 = ((-jC) - j2) - ((long) i4);
            if (j4 >= i4) {
                j4 -= (long) i4;
            }
            float fS = njrVar2.f27993b.s(i);
            float f = fS > 0.0f ? (long) ((j4 / fS) + (j3 / (1.0f - fS))) : 0L;
            long j5 = ((long) ((f * fS) + 0.5f)) + j2 + ((long) ((f * (1.0f - fS)) + 0.5f));
            njr njrVar3 = this.c;
            j = ((long) njrVar3.h.f) + j5;
            i2 = njrVar3.i.f;
        } else {
            if (zContains) {
                iz5 iz5Var3 = this.c.h;
                return Math.max(d(iz5Var3, iz5Var3.f), ((long) this.c.h.f) + j2);
            }
            if (zContains2) {
                iz5 iz5Var4 = this.c.i;
                return Math.max(-c(iz5Var4, iz5Var4.f), ((long) (-this.c.i.f)) + j2);
            }
            njr njrVar4 = this.c;
            j = ((long) njrVar4.h.f) + njrVar4.j();
            i2 = this.c.i.f;
        }
        return j - ((long) i2);
    }

    public final long c(iz5 iz5Var, long j) {
        njr njrVar = iz5Var.d;
        if (njrVar instanceof e7c) {
            return j;
        }
        int size = iz5Var.f22242k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            fz5 fz5Var = iz5Var.f22242k.get(i);
            if (fz5Var instanceof iz5) {
                iz5 iz5Var2 = (iz5) fz5Var;
                if (iz5Var2.d != njrVar) {
                    jMin = Math.min(jMin, c(iz5Var2, ((long) iz5Var2.f) + j));
                }
            }
        }
        if (iz5Var != njrVar.i) {
            return jMin;
        }
        long j2 = j - njrVar.j();
        return Math.min(Math.min(jMin, c(njrVar.h, j2)), j2 - ((long) njrVar.h.f));
    }

    public final long d(iz5 iz5Var, long j) {
        njr njrVar = iz5Var.d;
        if (njrVar instanceof e7c) {
            return j;
        }
        int size = iz5Var.f22242k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            fz5 fz5Var = iz5Var.f22242k.get(i);
            if (fz5Var instanceof iz5) {
                iz5 iz5Var2 = (iz5) fz5Var;
                if (iz5Var2.d != njrVar) {
                    jMax = Math.max(jMax, d(iz5Var2, ((long) iz5Var2.f) + j));
                }
            }
        }
        if (iz5Var != njrVar.h) {
            return jMax;
        }
        long j2 = j + njrVar.j();
        return Math.max(Math.max(jMax, d(njrVar.i, j2)), j2 - ((long) njrVar.i.f));
    }
}
