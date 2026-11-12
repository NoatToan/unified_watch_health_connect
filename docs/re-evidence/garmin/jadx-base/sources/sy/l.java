package sy;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsy/l;", "", "Lorg/joda/time/DateTime;", "initialDate", "Lo82/g;", "initialIntervalType", "", "isNutritionEnabled", "<init>", "(Lorg/joda/time/DateTime;Lo82/g;Z)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f161196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f161197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161198c;

    public /* synthetic */ l(DateTime dateTime, o82.g gVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new DateTime() : dateTime, (i14 & 2) != 0 ? o82.g.f130850c : gVar, (i14 & 4) != 0 ? false : z14);
    }

    public static l a(l lVar, DateTime dateTime, o82.g gVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            dateTime = lVar.f161196a;
        }
        if ((i14 & 2) != 0) {
            gVar = lVar.f161197b;
        }
        if ((i14 & 4) != 0) {
            z14 = lVar.f161198c;
        }
        lVar.getClass();
        dateTime.getClass();
        gVar.getClass();
        return new l(dateTime, gVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f161196a, lVar.f161196a) && this.f161197b == lVar.f161197b && this.f161198c == lVar.f161198c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161198c) + q6.f.i(this.f161197b, this.f161196a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CaloriesUiState(initialDate=");
        sb3.append(this.f161196a);
        sb3.append(", initialIntervalType=");
        sb3.append(this.f161197b);
        sb3.append(", isNutritionEnabled=");
        return hb.a.k(sb3, this.f161198c, ")");
    }

    public l(DateTime dateTime, o82.g gVar, boolean z14) {
        dateTime.getClass();
        gVar.getClass();
        this.f161196a = dateTime;
        this.f161197b = gVar;
        this.f161198c = z14;
    }

    public l() {
        this(null, null, false, 7, null);
    }
}
