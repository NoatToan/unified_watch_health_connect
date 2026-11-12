package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class aop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final znp[] f3307b;
    public int c;

    public aop(znp... znpVarArr) {
        this.f3307b = znpVarArr;
        this.f3306a = znpVarArr.length;
    }

    public znp a(int i) {
        return this.f3307b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aop.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3307b, ((aop) obj).f3307b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f3307b);
        }
        return this.c;
    }
}
