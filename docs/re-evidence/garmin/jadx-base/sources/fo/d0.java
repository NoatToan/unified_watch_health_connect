package fo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfo/d0;", "", "", "messageRes", "Li53/c;", "", "args", "<init>", "(ILi53/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<String> f72301b;

    public d0(int i14, i53.c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? j53.l.b() : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f72300a == d0Var.f72300a && p005kotlin.jvm.internal.s.g(this.f72301b, d0Var.f72301b);
    }

    public final int hashCode() {
        return this.f72301b.hashCode() + (Integer.hashCode(this.f72300a) * 31);
    }

    public final String toString() {
        return "ToastData(messageRes=" + this.f72300a + ", args=" + this.f72301b + ")";
    }

    public d0(int i14, i53.c<String> cVar) {
        cVar.getClass();
        this.f72300a = i14;
        this.f72301b = cVar;
    }
}
