package h63;

import b63.u;
import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/l;", "Li63/c;", "Lb63/u;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i63.c<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f82306a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82307b = k63.k.a("kotlinx.datetime.LocalDateTime", k63.d.i.f103232a);

    private l() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return u.Companion.a(u.INSTANCE, eVar.s());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f82307b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        fVar.p(uVar.toString());
    }
}
