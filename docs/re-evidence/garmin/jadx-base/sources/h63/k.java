package h63;

import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/k;", "Li63/c;", "Lb63/o;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements i63.c<b63.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f82304a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82305b = k63.k.a("kotlinx.datetime.LocalDate", k63.d.i.f103232a);

    private k() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return b63.o.Companion.b(b63.o.INSTANCE, eVar.s());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f82305b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.o oVar = (b63.o) obj;
        oVar.getClass();
        fVar.p(oVar.toString());
    }
}
