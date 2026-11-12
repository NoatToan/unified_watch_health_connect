package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class oc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28989b;
    public final boolean c;
    public final boolean d;

    public oc4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28988a = z;
        this.f28989b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static oc4 a() {
        return new oc4(false, false, false, true);
    }

    public boolean b() {
        return this.f28989b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.f28988a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigRenderOptions(");
        if (this.f28988a) {
            sb.append("originComments,");
        }
        if (this.f28989b) {
            sb.append("comments,");
        }
        if (this.c) {
            sb.append("formatted,");
        }
        if (this.d) {
            sb.append("json,");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }
        sb.append(")");
        return sb.toString();
    }
}
