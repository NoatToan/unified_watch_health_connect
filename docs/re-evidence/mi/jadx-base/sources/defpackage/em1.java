package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class em1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16793b;
    public em1 c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public em1[] f16795b = new em1[6];

        public final void a(em1 em1Var) {
            int i = this.f16794a;
            em1[] em1VarArr = this.f16795b;
            if (i >= em1VarArr.length) {
                em1[] em1VarArr2 = new em1[em1VarArr.length + 6];
                System.arraycopy(em1VarArr, 0, em1VarArr2, 0, i);
                this.f16795b = em1VarArr2;
            }
            em1[] em1VarArr3 = this.f16795b;
            int i2 = this.f16794a;
            this.f16794a = i2 + 1;
            em1VarArr3[i2] = em1Var;
        }

        public void b(em1 em1Var) {
            while (em1Var != null) {
                if (!c(em1Var)) {
                    a(em1Var);
                }
                em1Var = em1Var.c;
            }
        }

        public final boolean c(em1 em1Var) {
            for (int i = 0; i < this.f16794a; i++) {
                if (this.f16795b[i].f16792a.equals(em1Var.f16792a)) {
                    return true;
                }
            }
            return false;
        }

        public em1[] d() {
            int i = this.f16794a;
            em1[] em1VarArr = new em1[i];
            System.arraycopy(this.f16795b, 0, em1VarArr, 0, i);
            return em1VarArr;
        }
    }

    public em1(String str) {
        this.f16792a = str;
    }

    public static int b(iso isoVar, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || isoVar.R() >= 49) {
            i3 = 0;
        } else {
            isoVar.D("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            isoVar.D("Signature");
            i3 += 8;
        }
        if ((i & 131072) == 0) {
            return i3;
        }
        isoVar.D("Deprecated");
        return i3 + 6;
    }

    public static void f(iso isoVar, int i, int i2, z73 z73Var) {
        if ((i & 4096) != 0 && isoVar.R() < 49) {
            z73Var.k(isoVar.D("Synthetic")).i(0);
        }
        if (i2 != 0) {
            z73Var.k(isoVar.D("Signature")).i(2).k(i2);
        }
        if ((i & 131072) != 0) {
            z73Var.k(isoVar.D("Deprecated")).i(0);
        }
    }

    public final int a(iso isoVar) {
        return c(isoVar, null, 0, -1, -1);
    }

    public final int c(iso isoVar, byte[] bArr, int i, int i2, int i3) {
        n04 n04Var = isoVar.f22055a;
        int i4 = 0;
        for (em1 em1Var = this; em1Var != null; em1Var = em1Var.c) {
            isoVar.D(em1Var.f16792a);
            i4 += em1Var.j(n04Var, bArr, i, i2, i3).f40971b + 6;
        }
        return i4;
    }

    public final int d() {
        int i = 0;
        for (em1 em1Var = this; em1Var != null; em1Var = em1Var.c) {
            i++;
        }
        return i;
    }

    public boolean e() {
        return false;
    }

    public final void g(iso isoVar, z73 z73Var) {
        h(isoVar, null, 0, -1, -1, z73Var);
    }

    public final void h(iso isoVar, byte[] bArr, int i, int i2, int i3, z73 z73Var) {
        n04 n04Var = isoVar.f22055a;
        for (em1 em1Var = this; em1Var != null; em1Var = em1Var.c) {
            z73 z73VarJ = em1Var.j(n04Var, bArr, i, i2, i3);
            z73Var.k(isoVar.D(em1Var.f16792a)).i(z73VarJ.f40971b);
            z73Var.h(z73VarJ.f40970a, 0, z73VarJ.f40971b);
        }
    }

    public em1 i(a04 a04Var, int i, int i2, char[] cArr, int i3, h2e[] h2eVarArr) {
        em1 em1Var = new em1(this.f16792a);
        byte[] bArr = new byte[i2];
        em1Var.f16793b = bArr;
        System.arraycopy(a04Var.c, i, bArr, 0, i2);
        return em1Var;
    }

    public z73 j(n04 n04Var, byte[] bArr, int i, int i2, int i3) {
        return new z73(this.f16793b);
    }
}
