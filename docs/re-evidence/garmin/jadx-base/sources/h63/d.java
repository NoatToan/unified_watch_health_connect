package h63;

import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/d;", "Li63/c;", "Lb63/f;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements i63.c<b63.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f82289a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82290b = k63.k.a("kotlinx.datetime.DateTimePeriod/ISO", k63.d.i.f103232a);

    private d() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        b63.f.Companion companion = b63.f.INSTANCE;
        String strS = eVar.s();
        companion.getClass();
        return b63.f.Companion.a(strS);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f82290b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.f fVar2 = (b63.f) obj;
        fVar2.getClass();
        fVar.p(fVar2.toString());
    }
}
