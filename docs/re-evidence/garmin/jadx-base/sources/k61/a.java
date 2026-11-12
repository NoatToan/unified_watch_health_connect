package k61;

import ds.e0;
import m92.h0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ww1.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk61/a;", "", "Lm92/h0$e$a;", "chartPoint", "Lorg/joda/time/DateTime;", "calendarDate", "Lww1/a0;", "trainingPlanPhase", "<init>", "(Lm92/h0$e$a;Lorg/joda/time/DateTime;Lww1/a0;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e.a f103160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f103161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f103162c;

    public a(h0.e.a aVar, DateTime dateTime, a0 a0Var) {
        aVar.getClass();
        dateTime.getClass();
        this.f103160a = aVar;
        this.f103161b = dateTime;
        this.f103162c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f103160a, aVar.f103160a) && s.g(this.f103161b, aVar.f103161b) && this.f103162c == aVar.f103162c;
    }

    public final int hashCode() {
        int iA = e0.a(this.f103160a.hashCode() * 31, this.f103161b, 31);
        a0 a0Var = this.f103162c;
        return iA + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public final String toString() {
        return "CyclingAbilityChartPoint(chartPoint=" + this.f103160a + ", calendarDate=" + this.f103161b + ", trainingPlanPhase=" + this.f103162c + ")";
    }

    public /* synthetic */ a(h0.e.a aVar, DateTime dateTime, a0 a0Var, int i14, j jVar) {
        this(aVar, dateTime, (i14 & 4) != 0 ? null : a0Var);
    }
}
