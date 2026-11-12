package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26097b;
    public final gkb c;
    public final Object[] d;

    public mf4(String str, String str2, gkb gkbVar, Object... objArr) {
        this.f26096a = str;
        this.f26097b = str2;
        this.c = gkbVar;
        this.d = objArr;
    }

    public gkb a() {
        return this.c;
    }

    public Object[] b() {
        return this.d;
    }

    public String c() {
        return this.f26097b;
    }

    public String d() {
        return this.f26096a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mf4)) {
            return false;
        }
        mf4 mf4Var = (mf4) obj;
        return this.f26096a.equals(mf4Var.f26096a) && this.f26097b.equals(mf4Var.f26097b) && this.c.equals(mf4Var.c) && Arrays.equals(this.d, mf4Var.d);
    }

    public int hashCode() {
        return ((this.f26096a.hashCode() ^ Integer.rotateLeft(this.f26097b.hashCode(), 8)) ^ Integer.rotateLeft(this.c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.d), 24);
    }

    public String toString() {
        return this.f26096a + " : " + this.f26097b + ' ' + this.c + ' ' + Arrays.toString(this.d);
    }
}
