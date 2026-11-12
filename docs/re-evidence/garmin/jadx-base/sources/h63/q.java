package h63;

import b63.a0;
import b63.c0;
import c63.d1;
import c63.f1;
import java.time.format.DateTimeFormatter;
import m63.q1;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/q;", "Li63/c;", "Lb63/a0;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements i63.c<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f82316a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82317b = k63.k.a("kotlinx.datetime.UtcOffset", k63.d.i.f103232a);

    private q() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        a0.Companion companion = a0.INSTANCE;
        String strS = eVar.s();
        a0.b.f16174a.getClass();
        t tVar = f1.f24972a;
        d1 d1Var = (d1) tVar.getValue();
        companion.getClass();
        strS.getClass();
        d1Var.getClass();
        if (d1Var == ((d1) tVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) c0.f16175a.getValue();
            dateTimeFormatter.getClass();
            return c0.a(strS, dateTimeFormatter);
        }
        if (d1Var == ((d1) f1.f24973b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) c0.f16176b.getValue();
            dateTimeFormatter2.getClass();
            return c0.a(strS, dateTimeFormatter2);
        }
        if (d1Var != ((d1) f1.f24974c.getValue())) {
            return d1Var.a(strS);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) c0.f16177c.getValue();
        dateTimeFormatter3.getClass();
        return c0.a(strS, dateTimeFormatter3);
    }

    @Override // i63.i, i63.b
    public final k63.e getDescriptor() {
        return f82317b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        fVar.p(a0Var.toString());
    }
}
