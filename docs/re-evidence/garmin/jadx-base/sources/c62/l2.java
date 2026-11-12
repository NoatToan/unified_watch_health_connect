package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc62/l2;", "", "", "loading", "", "title", "message", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24804c;

    public /* synthetic */ l2(boolean z14, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f24802a == l2Var.f24802a && p005kotlin.jvm.internal.s.g(this.f24803b, l2Var.f24803b) && p005kotlin.jvm.internal.s.g(this.f24804c, l2Var.f24804c);
    }

    public final int hashCode() {
        return this.f24804c.hashCode() + wr.g.j(Boolean.hashCode(this.f24802a) * 31, 31, this.f24803b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutLoadingDialogState(loading=");
        sb3.append(this.f24802a);
        sb3.append(", title=");
        sb3.append(this.f24803b);
        sb3.append(", message=");
        return am.j.o(this.f24804c, ")", sb3);
    }

    public l2(boolean z14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24802a = z14;
        this.f24803b = str;
        this.f24804c = str2;
    }

    public l2() {
        this(false, null, null, 7, null);
    }
}
