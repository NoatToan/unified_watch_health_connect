package gp;

import b63.u;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {
    public static final z51.h a(pb2.a.d dVar) {
        DateTime dateTime;
        DateTime dateTime2;
        String str = dVar.f136893a;
        b63.o oVarS = g22.k.s(dVar.f136894b);
        Long l14 = dVar.f136900h;
        Double d14 = dVar.f136902j;
        Double dValueOf = Double.valueOf(d14 != null ? d14.doubleValue() : Double.NaN);
        Double d15 = dVar.f136899g;
        Double d16 = dVar.f136901i;
        LocalDateTime localDateTime = dVar.f136897e;
        u uVarZ = (localDateTime == null || (dateTime2 = localDateTime.toDateTime()) == null) ? null : g22.k.z(dateTime2);
        LocalDateTime localDateTime2 = dVar.f136898f;
        u uVarZ2 = (localDateTime2 == null || (dateTime = localDateTime2.toDateTime()) == null) ? null : g22.k.z(dateTime);
        List<String> list = dVar.f136904l;
        ArrayList arrayListZ = list != null ? h0.Z(list) : null;
        Boolean bool = dVar.f136903k;
        return new z51.h(str, oVarS, l14, (z51.e) null, dValueOf, d15, d16, uVarZ, uVarZ2, (List) arrayListZ, bool != null ? bool.booleanValue() : false, false, 2056, (p005kotlin.jvm.internal.j) null);
    }
}
