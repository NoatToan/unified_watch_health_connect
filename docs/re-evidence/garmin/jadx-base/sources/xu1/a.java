package xu1;

import androidx.core.view.j;
import f12.l;
import fy1.i;
import i3.e5;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;
import vw1.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxu1/a;", "", "", "currentValue", "maxValue", "primaryValue", "secondaryValue", "<init>", "(IIII)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3587a f192246e = new C3587a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f192250d;

    public a(int i14, int i15, int i16, int i17) {
        this.f192247a = i14;
        this.f192248b = i15;
        this.f192249c = i16;
        this.f192250d = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f192247a == aVar.f192247a && this.f192248b == aVar.f192248b && this.f192249c == aVar.f192249c && this.f192250d == aVar.f192250d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f192250d) + q2.d(this.f192249c, q2.d(this.f192248b, Integer.hashCode(this.f192247a) * 31, 31), 31);
    }

    public final String toString() {
        return j.e(this.f192249c, this.f192250d, ", secondaryValue=", ")", e5.j(this.f192247a, this.f192248b, "FBTArcProgressChartData(currentValue=", ", maxValue=", ", primaryValue="));
    }

    /* JADX INFO: renamed from: xu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxu1/a$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3587a {
        public /* synthetic */ C3587a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(DateTime dateTime, DateTime dateTime2) {
            int i14 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTime3 = (DateTime) r13.b.e(dateTimeNow, dateTime2);
            i.f73924a.getClass();
            int days = Days.daysBetween(dateTime, dateTime3).getDays() + 1;
            int days2 = Days.daysBetween(dateTime, dateTime2).getDays() + 1;
            fy1.a.f73883a.getClass();
            return new a(days, days2, fy1.a.C1500a.a(i14, dateTime, dateTime3), c.h(i14, dateTime, dateTime2));
        }

        private C3587a() {
        }
    }
}
