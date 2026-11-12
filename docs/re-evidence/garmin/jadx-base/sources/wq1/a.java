package wq1;

import com.garmin.android.apps.connectmobile.f3;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwq1/a;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "totalSteps", "stepGoal", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f186622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f186623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f186624c;

    public /* synthetic */ a(LocalDate localDate, Integer num, Integer num2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f186622a, aVar.f186622a) && s.g(this.f186623b, aVar.f186623b) && s.g(this.f186624c, aVar.f186624c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f186622a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.f186623b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f186624c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StepsChartEntry(calendarDate=");
        sb3.append(this.f186622a);
        sb3.append(", totalSteps=");
        sb3.append(this.f186623b);
        sb3.append(", stepGoal=");
        return f3.i(sb3, this.f186624c, ")");
    }

    public a(LocalDate localDate, Integer num, Integer num2) {
        this.f186622a = localDate;
        this.f186623b = num;
        this.f186624c = num2;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
