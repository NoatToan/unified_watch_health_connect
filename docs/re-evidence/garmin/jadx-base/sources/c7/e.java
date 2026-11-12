package c7;

import android.graphics.Insets;
import ch.qos.logback.core.CoreConstants;
import ds.e0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f25189e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25193d;

    public static class a {
        private a() {
        }

        public static Insets a(int i14, int i15, int i16, int i17) {
            return Insets.of(i14, i15, i16, i17);
        }
    }

    private e(int i14, int i15, int i16, int i17) {
        this.f25190a = i14;
        this.f25191b = i15;
        this.f25192c = i16;
        this.f25193d = i17;
    }

    public static e a(e eVar, e eVar2) {
        return c(Math.max(eVar.f25190a, eVar2.f25190a), Math.max(eVar.f25191b, eVar2.f25191b), Math.max(eVar.f25192c, eVar2.f25192c), Math.max(eVar.f25193d, eVar2.f25193d));
    }

    public static e b(e eVar, e eVar2) {
        return c(Math.min(eVar.f25190a, eVar2.f25190a), Math.min(eVar.f25191b, eVar2.f25191b), Math.min(eVar.f25192c, eVar2.f25192c), Math.min(eVar.f25193d, eVar2.f25193d));
    }

    public static e c(int i14, int i15, int i16, int i17) {
        return (i14 == 0 && i15 == 0 && i16 == 0 && i17 == 0) ? f25189e : new e(i14, i15, i16, i17);
    }

    public static e d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.a(this.f25190a, this.f25191b, this.f25192c, this.f25193d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25193d == eVar.f25193d && this.f25190a == eVar.f25190a && this.f25192c == eVar.f25192c && this.f25191b == eVar.f25191b;
    }

    public final int hashCode() {
        return (((((this.f25190a * 31) + this.f25191b) * 31) + this.f25192c) * 31) + this.f25193d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Insets{left=");
        sb3.append(this.f25190a);
        sb3.append(", top=");
        sb3.append(this.f25191b);
        sb3.append(", right=");
        sb3.append(this.f25192c);
        sb3.append(", bottom=");
        return e0.j(sb3, this.f25193d, CoreConstants.CURLY_RIGHT);
    }
}
