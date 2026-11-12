package r8;

import androidx.health.platform.client.proto.q;
import androidx.health.platform.client.proto.u2;
import androidx.health.platform.client.proto.z1;
import java.time.Instant;
import java.time.LocalDateTime;
import k23.d;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final z1 a(d<? extends q0> dVar, b9.a aVar) {
        dVar.getClass();
        aVar.getClass();
        z1.a aVarV = z1.v();
        q qVarA = p8.a.a(dVar);
        aVarV.g();
        z1.u((z1) aVarV.f7677b, qVarA);
        u2.a aVarX = u2.x();
        Instant instant = aVar.f16935a;
        if (instant != null) {
            long epochMilli = instant.toEpochMilli();
            aVarX.g();
            u2.t((u2) aVarX.f7677b, epochMilli);
        }
        Instant instant2 = aVar.f16936b;
        if (instant2 != null) {
            long epochMilli2 = instant2.toEpochMilli();
            aVarX.g();
            u2.u((u2) aVarX.f7677b, epochMilli2);
        }
        LocalDateTime localDateTime = aVar.f16937c;
        if (localDateTime != null) {
            String string = localDateTime.toString();
            aVarX.g();
            u2.v((u2) aVarX.f7677b, string);
        }
        LocalDateTime localDateTime2 = aVar.f16938d;
        if (localDateTime2 != null) {
            String string2 = localDateTime2.toString();
            aVarX.g();
            u2.w((u2) aVarX.f7677b, string2);
        }
        u2 u2VarE = aVarX.e();
        aVarV.g();
        z1.t((z1) aVarV.f7677b, u2VarE);
        return aVarV.e();
    }
}
