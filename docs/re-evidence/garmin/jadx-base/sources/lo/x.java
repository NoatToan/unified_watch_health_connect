package lo;

import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class x extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f0 f0Var) {
        super(f0Var, 0);
        this.f113983b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        Calendar calendar = this.f113983b.I1;
        t tVar = (t) dVar;
        tVar.getClass();
        r22.c0 c0Var = new r22.c0(tVar.requireContext(), new LocalDate(1990, 1, 1).toDateTimeAtStartOfDay().getMillis(), r22.c0.a(DateTime.now()).getMillis(), calendar, new hc0.c(24, tVar, calendar));
        c0Var.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        c0Var.show();
    }
}
