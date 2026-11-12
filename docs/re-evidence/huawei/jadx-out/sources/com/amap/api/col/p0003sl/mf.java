package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mf extends me {
    public mf() {
        super(2048);
    }

    public final byte[] a(no noVar, mi.a aVar, long j, List<np> list) {
        super.a();
        try {
            int iA = a(noVar);
            int iA2 = -1;
            int iA3 = (aVar == null || aVar.f == null || aVar.f.size() <= 0) ? -1 : a(aVar);
            if (list != null && list.size() > 0) {
                iA2 = a(j, list);
            }
            mn.a(this.f3189a);
            mn.a(this.f3189a, iA);
            if (iA3 > 0) {
                mn.c(this.f3189a, iA3);
            }
            if (iA2 > 0) {
                mn.b(this.f3189a, iA2);
            }
            this.f3189a.c(mn.b(this.f3189a));
            return this.f3189a.c();
        } catch (Throwable th) {
            ns.a(th);
            return null;
        }
    }

    private int a(no noVar) {
        return mu.a(this.f3189a, noVar.f3230c, noVar.k, (int) (noVar.e * 1000000.0d), (int) (noVar.d * 1000000.0d), (int) noVar.f, (int) noVar.i, (int) noVar.g, (short) noVar.h, noVar.l);
    }

    private int a(mi.a aVar) {
        int iA;
        int i;
        int i2;
        byte b2;
        int i3;
        int iA2;
        int iA3;
        a(aVar.f);
        int size = aVar.f.size();
        int[] iArr = new int[size];
        int i4 = 0;
        while (true) {
            byte b3 = 2;
            if (i4 < size) {
                ni niVar = aVar.f.get(i4);
                if (niVar instanceof nk) {
                    nk nkVar = (nk) niVar;
                    if (!nkVar.i) {
                        iA3 = mv.a(this.f3189a, nkVar.j, nkVar.k, nkVar.f3227c, nkVar.l);
                    } else {
                        iA3 = mv.a(this.f3189a, nkVar.b(), nkVar.c(), nkVar.j, nkVar.k, nkVar.f3227c, nkVar.m, nkVar.n, nkVar.d, nkVar.l);
                    }
                    i3 = iA3;
                    i2 = -1;
                    b2 = 1;
                } else {
                    if (niVar instanceof nl) {
                        nl nlVar = (nl) niVar;
                        iA2 = mw.a(this.f3189a, nlVar.b(), nlVar.c(), nlVar.j, nlVar.k, nlVar.l, nlVar.f3227c, nlVar.m, nlVar.d);
                        b3 = 3;
                    } else if (niVar instanceof nj) {
                        nj njVar = (nj) niVar;
                        if (!njVar.i) {
                            iA2 = mp.a(this.f3189a, njVar.j, njVar.k, njVar.l, njVar.m, njVar.n, njVar.f3227c);
                        } else {
                            iA2 = mp.a(this.f3189a, njVar.j, njVar.k, njVar.l, njVar.m, njVar.n, njVar.f3227c, njVar.d);
                        }
                    } else if (niVar instanceof nm) {
                        nm nmVar = (nm) niVar;
                        iA2 = mz.a(this.f3189a, nmVar.b(), nmVar.c(), nmVar.j, nmVar.k, nmVar.l, nmVar.f3227c, nmVar.m, nmVar.d);
                        b3 = 4;
                    } else {
                        i2 = -1;
                        b2 = 0;
                        i3 = -1;
                    }
                    i3 = iA2;
                    b2 = b3;
                    i2 = -1;
                }
                if (i3 == i2) {
                    return i2;
                }
                iArr[i4] = ms.a(this.f3189a, niVar.h ? (byte) 1 : (byte) 0, niVar.i ? (byte) 1 : (byte) 0, (short) niVar.g, b2, i3);
                i4++;
            } else {
                int iA4 = this.f3189a.a(aVar.f3196b);
                int iA5 = mq.a(this.f3189a, iArr);
                int size2 = aVar.g.size();
                int[] iArr2 = new int[size2];
                for (int i5 = 0; i5 < size2; i5++) {
                    ni niVar2 = aVar.g.get(i5);
                    long jElapsedRealtime = (SystemClock.elapsedRealtime() - niVar2.e) / 1000;
                    if (jElapsedRealtime > 32767 || jElapsedRealtime < 0) {
                        jElapsedRealtime = 32767;
                    }
                    if (niVar2 instanceof nk) {
                        nk nkVar2 = (nk) niVar2;
                        iA = my.a(this.f3189a, nkVar2.j, nkVar2.k, (short) jElapsedRealtime);
                    } else if (niVar2 instanceof nl) {
                        nl nlVar2 = (nl) niVar2;
                        iA = my.a(this.f3189a, nlVar2.j, nlVar2.k, (short) jElapsedRealtime);
                    } else {
                        if (niVar2 instanceof nj) {
                            nj njVar2 = (nj) niVar2;
                            iA = mx.a(this.f3189a, njVar2.j, njVar2.k, njVar2.l, (short) jElapsedRealtime);
                            i = 2;
                        } else if (niVar2 instanceof nm) {
                            nm nmVar2 = (nm) niVar2;
                            iA = my.a(this.f3189a, nmVar2.j, nmVar2.k, (short) jElapsedRealtime);
                        } else {
                            iA = 0;
                            i = 0;
                        }
                        iArr2[i5] = mr.a(this.f3189a, (byte) i, iA);
                    }
                    i = 1;
                    iArr2[i5] = mr.a(this.f3189a, (byte) i, iA);
                }
                return mq.a(this.f3189a, iA4, aVar.f3195a, iA5, mq.b(this.f3189a, iArr2));
            }
        }
    }

    private int a(long j, List<np> list) {
        b(list);
        int size = list.size();
        if (size <= 0) {
            return -1;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            np npVar = list.get(i);
            iArr[i] = nb.a(this.f3189a, npVar.f3231a == j && npVar.f3231a != -1, npVar.f3231a, (short) npVar.f3233c, this.f3189a.a(npVar.f3232b), npVar.g, (short) npVar.d);
        }
        return na.a(this.f3189a, na.a(this.f3189a, iArr));
    }

    private static void a(List<ni> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (ni niVar : list) {
            if (niVar instanceof nk) {
                nk nkVar = (nk) niVar;
                niVar.g = ne.a(ne.a(nkVar.j, nkVar.k));
            } else if (niVar instanceof nl) {
                nl nlVar = (nl) niVar;
                niVar.g = ne.a(ne.a(nlVar.j, nlVar.k));
            } else if (niVar instanceof nm) {
                nm nmVar = (nm) niVar;
                niVar.g = ne.a(ne.a(nmVar.j, nmVar.k));
            } else if (niVar instanceof nj) {
                nj njVar = (nj) niVar;
                niVar.g = ne.a(ne.a(njVar.k, njVar.l));
            }
        }
    }

    private static void b(List<np> list) {
        for (np npVar : list) {
            npVar.g = ne.b(npVar.f3231a);
        }
    }
}
