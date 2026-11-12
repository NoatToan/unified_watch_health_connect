package q8;

import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.p;
import androidx.health.platform.client.proto.q;
import androidx.health.platform.client.proto.r;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.jvm.internal.s;
import y8.b0;
import y8.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final p.a a(b0 b0Var) {
        b0Var.getClass();
        p.a aVarL = p.L();
        aVarL.getClass();
        d(aVarL, b0Var.getF195082f());
        long epochMilli = b0Var.getF194970a().toEpochMilli();
        aVarL.g();
        p.D((p) aVarL.f7677b, epochMilli);
        ZoneOffset f194971b = b0Var.getF194971b();
        if (f194971b != null) {
            int totalSeconds = f194971b.getTotalSeconds();
            aVarL.g();
            p.B((p) aVarL.f7677b, totalSeconds);
        }
        return aVarL;
    }

    public static final p.a b(d0 d0Var) {
        d0Var.getClass();
        p.a aVarL = p.L();
        aVarL.getClass();
        d(aVarL, d0Var.getF195082f());
        long epochMilli = d0Var.getF195077a().toEpochMilli();
        aVarL.g();
        p.E((p) aVarL.f7677b, epochMilli);
        long epochMilli2 = d0Var.getF195079c().toEpochMilli();
        aVarL.g();
        p.F((p) aVarL.f7677b, epochMilli2);
        ZoneOffset f195078b = d0Var.getF195078b();
        if (f195078b != null) {
            int totalSeconds = f195078b.getTotalSeconds();
            aVarL.g();
            p.s((p) aVarL.f7677b, totalSeconds);
        }
        ZoneOffset f195080d = d0Var.getF195080d();
        if (f195080d != null) {
            int totalSeconds2 = f195080d.getTotalSeconds();
            aVarL.g();
            p.t((p) aVarL.f7677b, totalSeconds2);
        }
        return aVarL;
    }

    public static final q c(String str) {
        q.a aVarU = q.u();
        aVarU.g();
        q.t((q) aVarU.f7677b, str);
        return aVarU.e();
    }

    public static final void d(p.a aVar, z8.c cVar) {
        String str = cVar.f202968b;
        Instant instant = cVar.f202970d;
        z8.a aVar2 = cVar.f202969c;
        if (!s.g(str, "")) {
            String str2 = cVar.f202968b;
            aVar.g();
            p.z(str2, (p) aVar.f7677b);
        }
        if (aVar2.f202962a.length() > 0) {
            o.a aVarU = o.u();
            String str3 = aVar2.f202962a;
            aVarU.g();
            o.t((o) aVarU.f7677b, str3);
            o oVarE = aVarU.e();
            aVar.g();
            p.A((p) aVar.f7677b, oVarE);
        }
        if (instant.isAfter(Instant.EPOCH)) {
            long epochMilli = instant.toEpochMilli();
            aVar.g();
            p.C((p) aVar.f7677b, epochMilli);
        }
        String str4 = cVar.f202971e;
        if (str4 != null) {
            aVar.g();
            p.G(str4, (p) aVar.f7677b);
        }
        long j8 = cVar.f202972f;
        if (j8 > 0) {
            aVar.g();
            p.H((p) aVar.f7677b, j8);
        }
        z8.b bVar = cVar.f202973g;
        if (bVar != null) {
            r.a aVarW = r.w();
            String str5 = bVar.f202964b;
            if (str5 != null) {
                aVarW.g();
                r.t((r) aVarW.f7677b, str5);
            }
            String str6 = bVar.f202965c;
            if (str6 != null) {
                aVarW.g();
                r.u((r) aVarW.f7677b, str6);
            }
            String str7 = (String) a.f143292b.getOrDefault(Integer.valueOf(bVar.f202963a), "UNKNOWN");
            aVarW.g();
            r.v((r) aVarW.f7677b, str7);
            r rVarE = aVarW.e();
            aVar.g();
            p.I((p) aVar.f7677b, rVarE);
        }
        int i14 = cVar.f202967a;
        if (i14 > 0) {
            aVar.g();
            p.v((p) aVar.f7677b, i14);
        }
    }
}
