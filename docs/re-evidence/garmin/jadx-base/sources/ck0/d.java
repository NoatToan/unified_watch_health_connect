package ck0;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lck0/d;", "", "", "numCodesRemaining", "Lb63/o;", "nextGenerationDate", "timePeriodInDays", "<init>", "(ILb63/o;Ljava/lang/Integer;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f27824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f27825c;

    public d(int i14, b63.o oVar, Integer num) {
        this.f27823a = i14;
        this.f27824b = oVar;
        this.f27825c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27823a == dVar.f27823a && p005kotlin.jvm.internal.s.g(this.f27824b, dVar.f27824b) && p005kotlin.jvm.internal.s.g(this.f27825c, dVar.f27825c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27823a) * 31;
        b63.o oVar = this.f27824b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Integer num = this.f27825c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CouponRevealLimit(numCodesRemaining=");
        sb3.append(this.f27823a);
        sb3.append(", nextGenerationDate=");
        sb3.append(this.f27824b);
        sb3.append(", timePeriodInDays=");
        return f3.i(sb3, this.f27825c, ")");
    }
}
