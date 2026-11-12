package qw;

import android.content.Intent;
import androidx.lifecycle.v1;
import b63.o;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f148191b;

    public /* synthetic */ d(g gVar, int i14) {
        this.f148190a = i14;
        this.f148191b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f148190a) {
            case 0:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == 11) {
                    Intent intent = aVar.f67586b;
                    long longExtra = intent != null ? intent.getLongExtra("extra.date.time", 0L) : 0L;
                    g gVar = this.f148191b;
                    if (longExtra > 0) {
                        DateTime dateTime = new DateTime(longExtra);
                        gVar.getClass();
                        p2 p2Var = gVar.f148248c;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, l.a((l) value, new o(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth()), null, null, null, false, 30)));
                    }
                    LocalDate localDate = new DateTime(longExtra).toLocalDate();
                    localDate.getClass();
                    o oVarT = g22.k.t(localDate);
                    LocalDate localDate2 = new DateTime(longExtra).toLocalDate();
                    localDate2.getClass();
                    gVar.f148253h.i(new o82.a(oVarT, g22.k.t(localDate2)), true);
                    gVar.f148254i.e();
                    gVar.f148255j.e();
                }
                break;
            default:
                g gVar2 = this.f148191b;
                gVar2.getClass();
                ge1.b.T(v1.a(gVar2), null, null, new k(gVar2, (pw.a) obj, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
