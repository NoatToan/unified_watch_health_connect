package r22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr22/s;", "", "", "xAxisTitle", "Li53/c;", "Lj82/f;", "legendItems", "<init>", "(Ljava/lang/String;Li53/c;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<j82.f> f149855b;

    public s(String str, i53.c<j82.f> cVar) {
        cVar.getClass();
        this.f149854a = str;
        this.f149855b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f149854a, sVar.f149854a) && this.f149855b.equals(sVar.f149855b);
    }

    public final int hashCode() {
        String str = this.f149854a;
        return this.f149855b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ChartLegendModel(xAxisTitle=" + this.f149854a + ", legendItems=" + this.f149855b + ")";
    }
}
