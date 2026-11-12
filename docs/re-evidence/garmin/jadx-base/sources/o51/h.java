package o51;

import c22.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo51/h;", "", "", "data", "dataContentDescription", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f129267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f129268c;

    public h(String str, String str2, double d14) {
        str.getClass();
        str2.getClass();
        this.f129266a = str;
        this.f129267b = str2;
        this.f129268c = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f129266a, hVar.f129266a) && s.g(this.f129267b, hVar.f129267b) && Double.compare(this.f129268c, hVar.f129268c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f129268c) + wr.g.j(this.f129266a.hashCode() * 31, 31, this.f129267b);
    }

    public final String toString() {
        return t.d(this.f129268c, ")", p6.b.i("PaceProSplitCellData(data=", this.f129266a, ", dataContentDescription=", this.f129267b, ", value="));
    }

    public /* synthetic */ h(String str, String str2, double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? str : str2, (i14 & 4) != 0 ? 0.0d : d14);
    }
}
