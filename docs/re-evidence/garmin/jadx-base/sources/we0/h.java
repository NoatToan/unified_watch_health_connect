package we0;

import androidx.core.view.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwe0/h;", "", "", "string", "", "iconRes", "", "isSelected", "rateValue", "<init>", "(Ljava/lang/String;IZI)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f184759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f184760d;

    public h(String str, int i14, boolean z14, int i15) {
        str.getClass();
        this.f184757a = str;
        this.f184758b = i14;
        this.f184759c = z14;
        this.f184760d = i15;
    }

    public static h a(h hVar, boolean z14) {
        String str = hVar.f184757a;
        int i14 = hVar.f184758b;
        int i15 = hVar.f184760d;
        hVar.getClass();
        str.getClass();
        return new h(str, i14, z14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f184757a, hVar.f184757a) && this.f184758b == hVar.f184758b && this.f184759c == hVar.f184759c && this.f184760d == hVar.f184760d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184760d) + q6.f.g(q2.d(this.f184758b, this.f184757a.hashCode() * 31, 31), 31, this.f184759c);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f184758b, "RateData(string=", this.f184757a, ", iconRes=", ", isSelected=");
        sbK.append(this.f184759c);
        sbK.append(", rateValue=");
        sbK.append(this.f184760d);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ h(String str, int i14, boolean z14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, (i16 & 4) != 0 ? false : z14, i15);
    }
}
