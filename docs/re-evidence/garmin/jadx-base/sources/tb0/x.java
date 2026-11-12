package tb0;

import android.graphics.Bitmap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltb0/x;", "", "", "staticImage", "", "jsonAnimation", "Li53/d;", "Landroid/graphics/Bitmap;", "serverImages", "pairingMarker", "pairingText", "<init>", "(ILjava/lang/String;Li53/d;Ljava/lang/String;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<String, Bitmap> f163726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f163727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f163728e;

    public x(int i14, String str, i53.d<String, Bitmap> dVar, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f163724a = i14;
        this.f163725b = str;
        this.f163726c = dVar;
        this.f163727d = str2;
        this.f163728e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f163724a == xVar.f163724a && this.f163725b.equals(xVar.f163725b) && p005kotlin.jvm.internal.s.g(this.f163726c, xVar.f163726c) && p005kotlin.jvm.internal.s.g(this.f163727d, xVar.f163727d) && this.f163728e.equals(xVar.f163728e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.f163724a) * 31, 31, this.f163725b);
        i53.d<String, Bitmap> dVar = this.f163726c;
        int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f163727d;
        return this.f163728e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f163724a, "PairAnimationState(staticImage=", ", jsonAnimation=", this.f163725b, ", serverImages=");
        sbR.append(this.f163726c);
        sbR.append(", pairingMarker=");
        sbR.append(this.f163727d);
        sbR.append(", pairingText=");
        return am.j.o(this.f163728e, ")", sbR);
    }
}
