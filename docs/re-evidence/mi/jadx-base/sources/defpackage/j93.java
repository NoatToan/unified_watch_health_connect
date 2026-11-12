package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class j93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22546b;
    public final TreeSet<jcm> c;
    public final ArrayList<a> d;
    public eu5 e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22548b;

        public a(long j, long j2) {
            this.f22547a = j;
            this.f22548b = j2;
        }

        public boolean a(long j, long j2) {
            long j3 = this.f22548b;
            if (j3 == -1) {
                return j >= this.f22547a;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.f22547a;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean b(long j, long j2) {
            long j3 = this.f22547a;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.f22548b;
            return j4 == -1 || j3 + j4 > j;
        }
    }

    public j93(int i, String str) {
        this(i, str, eu5.c);
    }

    public void a(jcm jcmVar) {
        this.c.add(jcmVar);
    }

    public boolean b(ei4 ei4Var) {
        eu5 eu5Var = this.e;
        eu5 eu5VarG = eu5Var.g(ei4Var);
        this.e = eu5VarG;
        return !eu5VarG.equals(eu5Var);
    }

    public eu5 c() {
        return this.e;
    }

    public jcm d(long j, long j2) {
        jcm jcmVarK = jcm.k(this.f22546b, j);
        jcm jcmVarFloor = this.c.floor(jcmVarK);
        if (jcmVarFloor != null && jcmVarFloor.f20898b + jcmVarFloor.c > j) {
            return jcmVarFloor;
        }
        jcm jcmVarCeiling = this.c.ceiling(jcmVarK);
        if (jcmVarCeiling != null) {
            long j3 = jcmVarCeiling.f20898b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return jcm.i(this.f22546b, j, j2);
    }

    public TreeSet<jcm> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j93.class != obj.getClass()) {
            return false;
        }
        j93 j93Var = (j93) obj;
        return this.f22545a == j93Var.f22545a && this.f22546b.equals(j93Var.f22546b) && this.c.equals(j93Var.c) && this.e.equals(j93Var.e);
    }

    public boolean f() {
        return this.c.isEmpty();
    }

    public boolean g(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).a(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.d.isEmpty();
    }

    public int hashCode() {
        return (((this.f22545a * 31) + this.f22546b.hashCode()) * 31) + this.e.hashCode();
    }

    public boolean i(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).b(j, j2)) {
                return false;
            }
        }
        this.d.add(new a(j, j2));
        return true;
    }

    public boolean j(i93 i93Var) {
        if (!this.c.remove(i93Var)) {
            return false;
        }
        File file = i93Var.e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public jcm k(jcm jcmVar, long j, boolean z) {
        rk1.g(this.c.remove(jcmVar));
        File file = (File) rk1.e(jcmVar.e);
        if (z) {
            File fileL = jcm.l((File) rk1.e(file.getParentFile()), this.f22545a, jcmVar.f20898b, j);
            if (file.renameTo(fileL)) {
                file = fileL;
            } else {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(fileL);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
                sb.append("Failed to rename ");
                sb.append(strValueOf);
                sb.append(" to ");
                sb.append(strValueOf2);
                toe.h("CachedContent", sb.toString());
            }
        }
        jcm jcmVarD = jcmVar.d(file, j);
        this.c.add(jcmVarD);
        return jcmVarD;
    }

    public void l(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).f22547a == j) {
                this.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public j93(int i, String str, eu5 eu5Var) {
        this.f22545a = i;
        this.f22546b = str;
        this.e = eu5Var;
        this.c = new TreeSet<>();
        this.d = new ArrayList<>();
    }
}
