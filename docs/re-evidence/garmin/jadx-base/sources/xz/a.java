package xz;

import am.j;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxz/a;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "value", "data", "<init>", "(Lorg/joda/time/LocalDate;FLjava/lang/Object;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f192729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f192730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f192731c;

    public a(LocalDate localDate, float f14, Object obj) {
        localDate.getClass();
        this.f192729a = localDate;
        this.f192730b = f14;
        this.f192731c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f192729a, aVar.f192729a) && Float.compare(this.f192730b, aVar.f192730b) == 0 && s.g(this.f192731c, aVar.f192731c);
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f192730b, this.f192729a.hashCode() * 31, 31);
        Object obj = this.f192731c;
        return iD + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartDateEntry(calendarDate=");
        sb3.append(this.f192729a);
        sb3.append(", value=");
        sb3.append(this.f192730b);
        sb3.append(", data=");
        return j.k(this.f192731c, ")", sb3);
    }

    public /* synthetic */ a(LocalDate localDate, float f14, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this(localDate, f14, (i14 & 4) != 0 ? null : obj);
    }
}
