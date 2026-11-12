package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\nB7\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\rB\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u000eB\u001d\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u000fB-\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/f9;", "", "<init>", "()V", "", "shouldDismissOnBackPress", "shouldDismissOnClickOutside", "(ZZ)V", "Lk6/e0;", "securePolicy", "(Lk6/e0;ZZ)V", "isAppearanceLightStatusBars", "isAppearanceLightNavigationBars", "(ZZLk6/e0;ZZ)V", "(Z)V", "(Lk6/e0;Z)V", "(ZZLk6/e0;Z)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p004k6.e0 f88092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f88095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f88096e;

    public /* synthetic */ f9(boolean z14, boolean z15, p004k6.e0 e0Var, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, (i14 & 4) != 0 ? p004k6.e0.Inherit : e0Var, (i14 & 8) != 0 ? true : z16, (i14 & 16) != 0 ? true : z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return this.f88092a == f9Var.f88092a && p005kotlin.jvm.internal.s.g(this.f88095d, f9Var.f88095d) && p005kotlin.jvm.internal.s.g(this.f88096e, f9Var.f88096e) && this.f88094c == f9Var.f88094c && this.f88093b == f9Var.f88093b;
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f88092a.hashCode() * 31, 31, this.f88093b);
        Boolean bool = this.f88095d;
        int iHashCode = (iG + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f88096e;
        return Boolean.hashCode(this.f88094c) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public f9(boolean z14, boolean z15) {
        this.f88092a = p004k6.e0.Inherit;
        this.f88093b = z14;
        this.f88094c = z15;
        this.f88096e = null;
        this.f88095d = null;
    }

    public /* synthetic */ f9(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15);
    }

    public /* synthetic */ f9(p004k6.e0 e0Var, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p004k6.e0.Inherit : e0Var, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? true : z15);
    }

    public f9(p004k6.e0 e0Var, boolean z14, boolean z15) {
        this.f88092a = e0Var;
        this.f88093b = z14;
        this.f88094c = z15;
        this.f88096e = null;
        this.f88095d = null;
    }

    public f9() {
        this.f88092a = p004k6.e0.Inherit;
        this.f88093b = true;
        this.f88094c = true;
        this.f88095d = null;
        this.f88096e = null;
    }

    public f9(boolean z14, boolean z15, p004k6.e0 e0Var, boolean z16, boolean z17) {
        this.f88093b = z16;
        this.f88094c = z17;
        this.f88092a = e0Var;
        this.f88095d = Boolean.valueOf(z14);
        this.f88096e = Boolean.valueOf(z15);
    }

    @o13.e
    public /* synthetic */ f9(boolean z14) {
        this(z14, true);
    }

    public /* synthetic */ f9(p004k6.e0 e0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p004k6.e0.Inherit : e0Var, (i14 & 2) != 0 ? true : z14);
    }

    @o13.e
    public /* synthetic */ f9(p004k6.e0 e0Var, boolean z14) {
        this(e0Var, z14, true);
    }

    public /* synthetic */ f9(boolean z14, boolean z15, p004k6.e0 e0Var, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, (i14 & 4) != 0 ? p004k6.e0.Inherit : e0Var, (i14 & 8) != 0 ? true : z16);
    }

    @o13.e
    public /* synthetic */ f9(boolean z14, boolean z15, p004k6.e0 e0Var, boolean z16) {
        this.f88093b = z16;
        this.f88094c = true;
        this.f88092a = e0Var;
        this.f88095d = Boolean.valueOf(z14);
        this.f88096e = Boolean.valueOf(z15);
    }
}
