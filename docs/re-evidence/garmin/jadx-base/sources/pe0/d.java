package pe0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpe0/d;", "", "", TtmlNode.ATTR_ID, "", "nameKey", "<init>", "(JLjava/lang/String;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137417b;

    public d(long j8, String str) {
        str.getClass();
        this.f137416a = j8;
        this.f137417b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f137416a == dVar.f137416a && this.f137417b.equals(dVar.f137417b);
    }

    public final int hashCode() {
        return this.f137417b.hashCode() + (Long.hashCode(this.f137416a) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f137416a, "BreedUiModel(id=", ", nameKey=", this.f137417b);
        sbK.append(")");
        return sbK.toString();
    }
}
