package k00;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk00/c;", "", "Lorg/joda/time/DateTime;", "date", "", "value", "data", "<init>", "(Lorg/joda/time/DateTime;FLjava/lang/Object;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f101961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101963c;

    public c(DateTime dateTime, float f14, Object obj) {
        dateTime.getClass();
        this.f101961a = dateTime;
        this.f101962b = f14;
        this.f101963c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f101961a, cVar.f101961a) && Float.compare(this.f101962b, cVar.f101962b) == 0 && s.g(this.f101963c, cVar.f101963c);
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f101962b, this.f101961a.hashCode() * 31, 31);
        Object obj = this.f101963c;
        return iD + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartValue(date=");
        sb3.append(this.f101961a);
        sb3.append(", value=");
        sb3.append(this.f101962b);
        sb3.append(", data=");
        return am.j.k(this.f101963c, ")", sb3);
    }

    public /* synthetic */ c(DateTime dateTime, float f14, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dateTime, f14, (i14 & 4) != 0 ? null : obj);
    }
}
