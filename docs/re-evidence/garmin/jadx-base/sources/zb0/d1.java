package zb0;

import java.util.Calendar;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzb0/d1;", "Lgg1/b$a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 implements gg1.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f203473a;

    public d1(c1 c1Var) {
        this.f203473a = c1Var;
    }

    @Override // gg1.b.a
    public final void a(Calendar calendar) {
        Object value;
        int i14 = c1.f203441z;
        wn1.g gVarY6 = this.f203473a.y6();
        LocalDate localDateFromCalendarFields = LocalDate.fromCalendarFields(calendar);
        localDateFromCalendarFields.getClass();
        gVarY6.f186225h.B1(localDateFromCalendarFields);
        p2 p2Var = gVarY6.f186226i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, wn1.d.a((wn1.d) value, null, null, null, null, localDateFromCalendarFields, null, 47)));
    }
}
