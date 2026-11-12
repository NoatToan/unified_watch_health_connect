package h61;

import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh61/a;", "", "Lyz1/d;", "status", "", "anaerobicCapacity", "aerobicCapacity", "aerobicEndurance", "anaerobicCapacityCourseDemands", "aerobicCapacityCourseDemands", "aerobicEnduranceCourseDemands", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f82197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f82198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f82199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f82200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f82201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f82202g;

    public /* synthetic */ a(d dVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i14, j jVar) {
        this(dVar, num, num2, num3, (i14 & 16) != 0 ? null : num4, (i14 & 32) != 0 ? null : num5, (i14 & 64) != 0 ? null : num6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f82196a, aVar.f82196a) && s.g(this.f82197b, aVar.f82197b) && s.g(this.f82198c, aVar.f82198c) && s.g(this.f82199d, aVar.f82199d) && s.g(this.f82200e, aVar.f82200e) && s.g(this.f82201f, aVar.f82201f) && s.g(this.f82202g, aVar.f82202g);
    }

    public final int hashCode() {
        int iHashCode = this.f82196a.hashCode() * 31;
        Integer num = this.f82197b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f82198c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f82199d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f82200e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f82201f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f82202g;
        return iHashCode6 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CyclingAbilityCardData(status=");
        sb3.append(this.f82196a);
        sb3.append(", anaerobicCapacity=");
        sb3.append(this.f82197b);
        sb3.append(", aerobicCapacity=");
        x.m(sb3, this.f82198c, ", aerobicEndurance=", this.f82199d, ", anaerobicCapacityCourseDemands=");
        x.m(sb3, this.f82200e, ", aerobicCapacityCourseDemands=", this.f82201f, ", aerobicEnduranceCourseDemands=");
        return f3.i(sb3, this.f82202g, ")");
    }

    public a(d dVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        dVar.getClass();
        this.f82196a = dVar;
        this.f82197b = num;
        this.f82198c = num2;
        this.f82199d = num3;
        this.f82200e = num4;
        this.f82201f = num5;
        this.f82202g = num6;
    }
}
