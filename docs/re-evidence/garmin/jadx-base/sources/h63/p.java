package h63;

import b63.z;
import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/p;", "Li63/c;", "Lb63/z;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements i63.c<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f82314a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82315b = k63.k.a("kotlinx.datetime.TimeZone", k63.d.i.f103232a);

    private p() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        z.Companion companion = z.INSTANCE;
        String strS = eVar.s();
        companion.getClass();
        return z.Companion.b(strS);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f82315b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        z zVar = (z) obj;
        zVar.getClass();
        String id3 = zVar.f16227a.getId();
        id3.getClass();
        fVar.p(id3);
    }
}
