package wu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwu2/b;", "", "Ltv2/c;", "title", "message", "positiveText", "negativeText", "<init>", "(Ltv2/c;Ltv2/c;Ltv2/c;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f187332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f187333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f187334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv2.c f187335d;

    public b(tv2.c cVar, tv2.c cVar2, tv2.c cVar3, tv2.c cVar4) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        this.f187332a = cVar;
        this.f187333b = cVar2;
        this.f187334c = cVar3;
        this.f187335d = cVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f187332a.equals(bVar.f187332a) && this.f187333b.equals(bVar.f187333b) && this.f187334c.equals(bVar.f187334c) && this.f187335d.equals(bVar.f187335d);
    }

    public final int hashCode() {
        return this.f187335d.hashCode() + wr.g.l(this.f187334c, wr.g.l(this.f187333b, this.f187332a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ActionConfirmationOptions(title=" + this.f187332a + ", message=" + this.f187333b + ", positiveText=" + this.f187334c + ", negativeText=" + this.f187335d + ")";
    }
}
