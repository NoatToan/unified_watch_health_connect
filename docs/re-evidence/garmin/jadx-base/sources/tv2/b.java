package tv2;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltv2/b;", "", "Ltv2/c;", "title", "message", "neutralText", "<init>", "(Ltv2/c;Ltv2/c;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f166659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f166660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f166661c;

    public b(c cVar, c cVar2, c cVar3) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f166659a = cVar;
        this.f166660b = cVar2;
        this.f166661c = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f166659a.equals(bVar.f166659a) && this.f166660b.equals(bVar.f166660b) && this.f166661c.equals(bVar.f166661c);
    }

    public final int hashCode() {
        return this.f166661c.hashCode() + g.l(this.f166660b, this.f166659a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InformationMessageOptions(title=" + this.f166659a + ", message=" + this.f166660b + ", neutralText=" + this.f166661c + ")";
    }
}
