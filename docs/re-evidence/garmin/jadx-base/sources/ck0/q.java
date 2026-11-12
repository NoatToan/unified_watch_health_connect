package ck0;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lck0/q;", "", "", "imageUrl", "detailImageUrl", "imageDarkUrl", "detailedImageDarkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27881d;

    public q(String str, String str2, String str3, String str4) {
        this.f27878a = str;
        this.f27879b = str2;
        this.f27880c = str3;
        this.f27881d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f27878a, qVar.f27878a) && p005kotlin.jvm.internal.s.g(this.f27879b, qVar.f27879b) && p005kotlin.jvm.internal.s.g(this.f27880c, qVar.f27880c) && p005kotlin.jvm.internal.s.g(this.f27881d, qVar.f27881d);
    }

    public final int hashCode() {
        String str = this.f27878a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27879b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27880c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27881d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(p6.b.i("ExclusiveOfferResources(imageUrl=", this.f27878a, ", detailImageUrl=", this.f27879b, ", imageDarkUrl="), this.f27880c, ", detailedImageDarkUrl=", this.f27881d, ")");
    }
}
