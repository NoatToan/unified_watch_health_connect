package defpackage;

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public class lgj extends i00 implements acd, flh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lgj f25047a = new lgj();

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 a(Object obj, DateTimeZone dateTimeZone) {
        bw3 chronology = ((kgj) obj).getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        if (chronology.getZone() == dateTimeZone) {
            return chronology;
        }
        bw3 bw3VarWithZone = chronology.withZone(dateTimeZone);
        return bw3VarWithZone == null ? ISOChronology.getInstance(dateTimeZone) : bw3VarWithZone;
    }

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 b(Object obj, bw3 bw3Var) {
        return bw3Var == null ? wq5.c(((kgj) obj).getChronology()) : bw3Var;
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return kgj.class;
    }

    @Override // defpackage.i00, defpackage.acd
    public long i(Object obj, bw3 bw3Var) {
        return ((kgj) obj).getMillis();
    }
}
