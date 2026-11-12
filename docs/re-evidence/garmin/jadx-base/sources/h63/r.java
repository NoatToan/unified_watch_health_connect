package h63;

import b63.d0;
import c63.o1;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import m63.q1;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/r;", "Li63/c;", "Lb63/d0;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements i63.c<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f82318a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82319b = k63.k.a("kotlinx.datetime.YearMonth", k63.d.i.f103232a);

    private r() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        d0.Companion companion = d0.INSTANCE;
        String strS = eVar.s();
        d0.b.f16181a.getClass();
        t tVar = o1.f25035b;
        c63.r rVar = (c63.r) tVar.getValue();
        companion.getClass();
        strS.getClass();
        rVar.getClass();
        if (rVar != ((c63.r) tVar.getValue())) {
            return (d0) rVar.a(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new d0(YearMonth.parse(dh.b.N(3, string.toString())));
        } catch (DateTimeParseException e4) {
            throw new DateTimeFormatException(e4);
        }
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f82319b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        fVar.p(d0Var.toString());
    }
}
