package xv2;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxv2/a;", "", "Ltv2/c;", "title", "message", "positiveText", "negativeText", "<init>", "(Ltv2/c;Ltv2/c;Ltv2/c;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f192270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f192271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f192272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv2.c f192273d;

    public a(tv2.c cVar, tv2.c cVar2, tv2.c cVar3, tv2.c cVar4) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        this.f192270a = cVar;
        this.f192271b = cVar2;
        this.f192272c = cVar3;
        this.f192273d = cVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f192270a.equals(aVar.f192270a) && this.f192271b.equals(aVar.f192271b) && this.f192272c.equals(aVar.f192272c) && this.f192273d.equals(aVar.f192273d);
    }

    public final int hashCode() {
        return this.f192273d.hashCode() + g.l(this.f192272c, g.l(this.f192271b, this.f192270a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ConfirmationMessage(title=" + this.f192270a + ", message=" + this.f192271b + ", positiveText=" + this.f192272c + ", negativeText=" + this.f192273d + ")";
    }
}
