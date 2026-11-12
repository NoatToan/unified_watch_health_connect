package b21;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/ab;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ab extends lc.q0<l01.k> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f14522s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(n63.b bVar) {
        super(true);
        this.f14522s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l01.k] */
    @Override // lc.q0
    public final l01.k a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f14522s;
        bVar.getClass();
        return bVar.c(l01.k.INSTANCE.serializer(), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l01.k] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final l01.k h(String str) {
        str.getClass();
        n63.b bVar = this.f14522s;
        bVar.getClass();
        return bVar.c(l01.k.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, l01.k kVar) {
        str.getClass();
        n63.b bVar = this.f14522s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(l01.k.INSTANCE.serializer()), kVar));
    }

    @Override // lc.q0
    public final String f(l01.k kVar) {
        n63.b bVar = this.f14522s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(l01.k.INSTANCE.serializer()), kVar);
    }
}
