package zy2;

import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzy2/i;", "Li63/c;", "Lzy2/h;", "<init>", "()V", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements i63.c<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f207531a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f207532b = k63.k.a("com.garmin.util.common.KMPLong", k63.d.g.f103230a);

    private i() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return new h(eVar.o());
    }

    @Override // i63.i, i63.b
    public final k63.e getDescriptor() {
        return f207532b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        fVar.s(hVar.f207530a);
    }
}
