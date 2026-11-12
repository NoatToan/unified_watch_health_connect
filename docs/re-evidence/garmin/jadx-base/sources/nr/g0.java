package nr;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/g0;", "", "", "imageUrl", "", "defaultResId", "Lu4/d;", "imageVector", "<init>", "(Ljava/lang/String;ILu4/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f127181c;

    public /* synthetic */ g0(String str, int i14, u4.d dVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, i14, (i15 & 4) != 0 ? null : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127179a, g0Var.f127179a) && this.f127180b == g0Var.f127180b && p005kotlin.jvm.internal.s.g(this.f127181c, g0Var.f127181c);
    }

    public final int hashCode() {
        String str = this.f127179a;
        int iD = q2.d(this.f127180b, (str == null ? 0 : str.hashCode()) * 31, 31);
        u4.d dVar = this.f127181c;
        return iD + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = androidx.core.view.j.k(this.f127180b, "ImageData(imageUrl=", this.f127179a, ", defaultResId=", ", imageVector=");
        sbK.append(this.f127181c);
        sbK.append(")");
        return sbK.toString();
    }

    public g0(String str, int i14, u4.d dVar) {
        this.f127179a = str;
        this.f127180b = i14;
        this.f127181c = dVar;
    }
}
