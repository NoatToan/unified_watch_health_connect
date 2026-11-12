package ly;

import c22.l3;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import gs1.b;
import gs1.c;
import ps.u0;
import sn.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final b a(CalendarItemDTO calendarItemDTO) {
        calendarItemDTO.getClass();
        int i14 = calendarItemDTO.f31004s1;
        long j8 = calendarItemDTO.f30967a;
        String str = calendarItemDTO.f30977f;
        c cVar = new c(calendarItemDTO.C().f4358a, Integer.valueOf(calendarItemDTO.f31012x));
        double d14 = calendarItemDTO.Z;
        double d15 = calendarItemDTO.f31003r1;
        double d16 = calendarItemDTO.f30982h1;
        l3.a aVar = l3.f23124b;
        double d17 = calendarItemDTO.f30985j;
        aVar.getClass();
        double d18 = Double.isNaN(d17) ? 0.0d : d17 / ((double) 4.19002f);
        double dB = l3.a.b((float) calendarItemDTO.f30983i);
        double d19 = calendarItemDTO.f30981h / ((double) 1000);
        int i15 = (int) calendarItemDTO.B1;
        int i16 = (int) calendarItemDTO.f30980g1;
        double d24 = calendarItemDTO.f30978f1;
        u0 u0Var = calendarItemDTO.f31009v1;
        double d25 = calendarItemDTO.f31011w1;
        double d26 = calendarItemDTO.f31013x1;
        double d27 = calendarItemDTO.f31015y1;
        long j14 = calendarItemDTO.f31007u1;
        return new b(Integer.valueOf(i14), Long.valueOf(j8), str, cVar, null, Double.valueOf(d14), Double.valueOf(d15), Double.valueOf(d16), Double.valueOf(d18), Double.valueOf(dB), Double.valueOf(d19), Integer.valueOf(i15), Integer.valueOf(i16), Double.valueOf(d24), u0Var, Double.valueOf(d25), Double.valueOf(d26), null, Double.valueOf(d27), Long.valueOf(j14), calendarItemDTO.X0, Double.valueOf(calendarItemDTO.f31006t1), null, Integer.valueOf(calendarItemDTO.C1), Integer.valueOf(calendarItemDTO.D1), calendarItemDTO.f31017z1, Double.valueOf(calendarItemDTO.A1), Double.valueOf(calendarItemDTO.Q0), Integer.valueOf(calendarItemDTO.f30984i1), Double.valueOf(calendarItemDTO.F1), Double.valueOf(calendarItemDTO.G1), calendarItemDTO.K1, 4325392, null);
    }

    public static final h b(CalendarItemDTO calendarItemDTO) {
        calendarItemDTO.getClass();
        long j8 = calendarItemDTO.T0;
        String str = calendarItemDTO.E1;
        if (str == null) {
            str = "";
        }
        sn.c cVar = new sn.c(str);
        String str2 = calendarItemDTO.f30979g;
        return new h(j8, cVar, str2 != null ? str2 : "", calendarItemDTO.V0, calendarItemDTO.W0, calendarItemDTO.X0, calendarItemDTO.Y0, calendarItemDTO.f30977f, null, null, null, null, null, null, null, null, 65280, null);
    }
}
