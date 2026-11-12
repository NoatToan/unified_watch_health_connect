package androidx.recyclerview.widget;

import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1<RecyclerView.f0, a> f10535a = new k1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.z<RecyclerView.f0> f10536b = new p1.z<>();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k7.f f10537d = new k7.f(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.m.c f10539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.m.c f10540c;

        private a() {
        }

        public static a a() {
            a aVar = (a) f10537d.acquire();
            return aVar == null ? new a() : aVar;
        }
    }

    public interface b {
    }

    public final void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        k1<RecyclerView.f0, a> k1Var = this.f10535a;
        a aVarA = k1Var.get(f0Var);
        if (aVarA == null) {
            aVarA = a.a();
            k1Var.put(f0Var, aVarA);
        }
        aVarA.f10540c = cVar;
        aVarA.f10538a |= 8;
    }

    public final RecyclerView.m.c b(int i14, RecyclerView.f0 f0Var) {
        a aVarK;
        RecyclerView.m.c cVar;
        k1<RecyclerView.f0, a> k1Var = this.f10535a;
        int iD = k1Var.d(f0Var);
        if (iD >= 0 && (aVarK = k1Var.k(iD)) != null) {
            int i15 = aVarK.f10538a;
            if ((i15 & i14) != 0) {
                int i16 = i15 & (~i14);
                aVarK.f10538a = i16;
                if (i14 == 4) {
                    cVar = aVarK.f10539b;
                } else {
                    if (i14 != 8) {
                        vb.h.s("Must provide flag PRE or POST");
                        return null;
                    }
                    cVar = aVarK.f10540c;
                }
                if ((i16 & 12) == 0) {
                    k1Var.i(iD);
                    aVarK.f10538a = 0;
                    aVarK.f10539b = null;
                    aVarK.f10540c = null;
                    a.f10537d.a(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.f0 f0Var) {
        a aVar = this.f10535a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f10538a &= -2;
    }

    public final void d(RecyclerView.f0 f0Var) {
        p1.z<RecyclerView.f0> zVar = this.f10536b;
        for (int iH = zVar.h() - 1; iH >= 0; iH--) {
            if (f0Var == zVar.i(iH)) {
                Object[] objArr = zVar.f134880c;
                Object obj = objArr[iH];
                Object obj2 = p1.b0.f134674a;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                zVar.f134878a = true;
                break;
            }
        }
        a aVarRemove = this.f10535a.remove(f0Var);
        if (aVarRemove != null) {
            aVarRemove.f10538a = 0;
            aVarRemove.f10539b = null;
            aVarRemove.f10540c = null;
            a.f10537d.a(aVarRemove);
        }
    }
}
