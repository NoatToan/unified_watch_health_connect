package t42;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import et1.g1;
import i3.bc;
import i3.m4;
import i3.x3;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t42/b$a", "Li3/bc;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DateTime f162326a;

        public a(DateTime dateTime) {
            this.f162326a = dateTime;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            return new DateTime(j8, DateTimeZone.UTC).withTimeAtStartOfDay().getMillis() <= this.f162326a.getMillis();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    public static final void a(LocalDate localDate, e23.a<Unit> aVar, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarO = a0.o(aVar, lVar, mVar, -186529654);
        int i15 = i14 | (o0VarO.r(localDate) ? 4 : 2) | (o0VarO.r(aVar) ? 32 : 16) | (o0VarO.r(lVar) ? 256 : 128);
        if (o0VarO.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            AddWeightActivity.f48007c.getClass();
            DateTime dateTime = AddWeightActivity.f48008d;
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            long millis = dateTime.withZone(dateTimeZone).withTimeAtStartOfDay().getMillis();
            long millis2 = localDate.toDateTimeAtStartOfDay(dateTimeZone).getMillis();
            if (millis2 >= millis) {
                millis = millis2;
            }
            DateTime dateTimeAtStartOfDay = LocalDate.now().toDateTimeAtStartOfDay(dateTimeZone);
            m4 m4VarP = x3.p(Long.valueOf(millis), new j23.l(dateTime.getYear(), dateTimeAtStartOfDay.getYear()), new a(dateTimeAtStartOfDay), o0VarO, 0, 10);
            boolean z14 = ((i15 & 896) == 256) | ((i15 & 112) == 32);
            Object objQ = o0VarO.q();
            if (z14) {
                objQ = new g1(9, aVar, lVar);
                o0VarO.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g1(9, aVar, lVar);
                    o0VarO.K(objQ);
                }
            }
            vx.c.c(m4VarP, null, (e23.l) objQ, null, aVar, false, o0VarO, (i15 << 9) & 57344, 42);
            o0VarO = o0VarO;
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(localDate, aVar, lVar, i14, 22);
        }
    }
}
