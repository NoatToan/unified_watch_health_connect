package d33;

import c33.u;
import p005kotlin.jvm.internal.b0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f57403a = new g();

    public g() {
        super(u.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // p005kotlin.jvm.internal.b0, k23.n
    public final Object get(Object obj) {
        return Integer.valueOf(((u) obj).f24276a);
    }

    @Override // p005kotlin.jvm.internal.b0, k23.j
    public final void p(Object obj, Object obj2) {
        ((u) obj).f24276a = ((Number) obj2).intValue();
    }
}
