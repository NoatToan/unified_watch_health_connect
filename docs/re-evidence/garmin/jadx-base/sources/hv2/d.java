package hv2;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhv2/d;", "", "Ltv2/c;", "formattedValue", "", "heightValue", "", "measurementUnit", "<init>", "(Ltv2/c;Ljava/lang/Integer;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f85905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f85906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85907c;

    public d(tv2.c cVar, Integer num, String str) {
        cVar.getClass();
        this.f85905a = cVar;
        this.f85906b = num;
        this.f85907c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f85905a.equals(dVar.f85905a) && s.g(this.f85906b, dVar.f85906b) && s.g(this.f85907c, dVar.f85907c);
    }

    public final int hashCode() {
        int iHashCode = this.f85905a.hashCode() * 31;
        Integer num = this.f85906b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f85907c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeightPickerOptions(formattedValue=");
        sb3.append(this.f85905a);
        sb3.append(", heightValue=");
        sb3.append(this.f85906b);
        sb3.append(", measurementUnit=");
        return j.o(this.f85907c, ")", sb3);
    }
}
