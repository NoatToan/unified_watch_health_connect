package sn1;

import bv.d;
import g22.k;
import j23.i;
import j23.s;
import km1.v;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn1/a;", "", "<init>", "()V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f160413a = new a();

    private a() {
    }

    public static i a(v vVar) {
        return s.a(k.y(c(vVar), vVar != null ? ql1.c.c(vVar) : null), k.y(b(vVar), vVar != null ? ql1.c.c(vVar) : null));
    }

    public static DateTime b(v vVar) {
        Long lValueOf = vVar != null ? Long.valueOf(vVar.getSleepEndTimestampGMT()) : null;
        if (lValueOf == null || lValueOf.longValue() != 0) {
            return new DateTime(lValueOf, vVar != null ? ql1.c.b(vVar) : null);
        }
        int iD = (int) ((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).d();
        DateTime dateTimeR = v.r(vVar);
        return new DateTime(dateTimeR != null ? dateTimeR.plusSeconds(iD) : null);
    }

    public static DateTime c(v vVar) {
        Long lValueOf = vVar != null ? Long.valueOf(vVar.getSleepStartTimestampGMT()) : null;
        if (lValueOf == null || lValueOf.longValue() != 0) {
            return new DateTime(lValueOf, vVar != null ? ql1.c.b(vVar) : null);
        }
        int iH = (int) ((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).h();
        DateTime dateTimeR = v.r(vVar);
        return new DateTime(dateTimeR != null ? dateTimeR.plusSeconds(iH) : null);
    }
}
