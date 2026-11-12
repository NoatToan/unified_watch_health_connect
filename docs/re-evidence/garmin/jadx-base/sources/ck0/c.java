package ck0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lck0/c;", "", "", "couponCode", "Lb63/o;", "lastRedeemedDate", "expirationDate", "<init>", "(Ljava/lang/String;Lb63/o;Lb63/o;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f27821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f27822c;

    public c(String str, b63.o oVar, b63.o oVar2) {
        str.getClass();
        this.f27820a = str;
        this.f27821b = oVar;
        this.f27822c = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27820a.equals(cVar.f27820a) && p005kotlin.jvm.internal.s.g(this.f27821b, cVar.f27821b) && p005kotlin.jvm.internal.s.g(this.f27822c, cVar.f27822c);
    }

    public final int hashCode() {
        int iHashCode = this.f27820a.hashCode() * 31;
        b63.o oVar = this.f27821b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        b63.o oVar2 = this.f27822c;
        return iHashCode2 + (oVar2 != null ? oVar2.f16206a.hashCode() : 0);
    }

    public final String toString() {
        return "Coupon(couponCode=" + this.f27820a + ", lastRedeemedDate=" + this.f27821b + ", expirationDate=" + this.f27822c + ")";
    }
}
