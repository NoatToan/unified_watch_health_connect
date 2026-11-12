package eo;

import am.j;
import b63.o;
import com.roomorama.caldroid.CaldroidFragment;
import g22.l;
import i3.e5;
import java.time.LocalDate;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Leo/d;", "", "", "day", CaldroidFragment.MONTH, CaldroidFragment.YEAR, "<init>", "(III)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f64761d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64764c;

    public d(int i14, int i15, int i16) {
        this.f64762a = i14;
        this.f64763b = i15;
        this.f64764c = i16;
    }

    public final LocalDate a() {
        LocalDate localDateOf = LocalDate.of(this.f64764c, this.f64763b, this.f64762a);
        localDateOf.getClass();
        return localDateOf;
    }

    public final o b() {
        return new o(this.f64764c, this.f64763b, this.f64762a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f64762a == dVar.f64762a && this.f64763b == dVar.f64763b && this.f64764c == dVar.f64764c;
    }

    public final int hashCode() {
        return (((this.f64762a * 31) + this.f64763b) * 31) + this.f64764c;
    }

    public final String toString() {
        return j.q(e5.j(this.f64762a, this.f64763b, "FilteringDate(day=", ", month=", ", year="), this.f64764c, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo/d$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(long j8) {
            o.Companion companion = o.INSTANCE;
            long j14 = (int) (j8 / ((long) DateTimeConstants.MILLIS_PER_DAY));
            companion.getClass();
            o oVarA = o.Companion.a(j14);
            LocalDate localDate = oVarA.f16206a;
            return new d(localDate.getDayOfMonth(), b63.b.b(oVarA.c()), localDate.getYear());
        }

        public static d b() {
            o oVarD = l.d(o.INSTANCE);
            LocalDate localDate = oVarD.f16206a;
            return new d(localDate.getDayOfMonth(), b63.b.b(oVarD.c()), localDate.getYear());
        }

        private a() {
        }
    }
}
