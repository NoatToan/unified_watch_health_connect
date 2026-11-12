package i60;

import java.util.ArrayList;
import java.util.List;
import o13.p;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Li60/a;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f91801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f91802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f91803c;

    static {
        new C1755a(null);
    }

    public a(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        localDate2.getClass();
        this.f91801a = localDate;
        this.f91802b = localDate2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p c(n60.b bVar) {
        p pVar;
        List<n60.a> listB;
        List listN0 = (bVar == null || (listB = bVar.b()) == null) ? null : h0.N0(listB, new b());
        if (listN0 == null || listN0.isEmpty()) {
            pVar = new p(Double.valueOf(50.0d), Double.valueOf(300.0d));
        } else {
            Double d14 = ((n60.a) h0.b0(listN0)).d();
            double dDoubleValue = d14 != null ? d14.doubleValue() : 50.0d;
            Double d15 = ((n60.a) h0.m0(listN0)).d();
            pVar = new p(Double.valueOf(dDoubleValue), Double.valueOf(d15 != null ? d15.doubleValue() : 300.0d));
        }
        double dDoubleValue2 = ((Number) pVar.f128594a).doubleValue();
        double dDoubleValue3 = ((Number) pVar.f128595b).doubleValue();
        fz.a.f73959a.getClass();
        p pVarF = fz.a.f(4, dDoubleValue2, dDoubleValue3);
        return new p(Float.valueOf(((Number) pVarF.f128594a).intValue()), Float.valueOf(((Number) pVarF.f128595b).intValue()));
    }

    public abstract int a(LocalDate localDate, LocalDate localDate2);

    public abstract String b(LocalDate localDate, LocalDate localDate2);

    /* JADX INFO: renamed from: i60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Li60/a$a;", "", "<init>", "()V", "", "MIN_CSS_IN_SECONDS", "D", "MAX_CSS_IN_SECONDS", "", "NO_OF_INTERVALS", "I", "Y_AXIS_LABELS_DIVISOR", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1755a {
        public /* synthetic */ C1755a(j jVar) {
            this();
        }

        private C1755a() {
        }
    }
}
