package ca0;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lca0/i;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends lc.q0<g90.a> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f26249s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n63.b bVar) {
        super(true);
        this.f26249s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [g90.a, java.lang.Object] */
    @Override // lc.q0
    public final g90.a a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f26249s;
        bVar.getClass();
        return bVar.c(g90.a.INSTANCE.serializer(), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [g90.a, java.lang.Object] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final g90.a h(String str) {
        str.getClass();
        n63.b bVar = this.f26249s;
        bVar.getClass();
        return bVar.c(g90.a.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, g90.a aVar) {
        str.getClass();
        n63.b bVar = this.f26249s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(g90.a.INSTANCE.serializer()), aVar));
    }

    @Override // lc.q0
    public final String f(g90.a aVar) {
        n63.b bVar = this.f26249s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(g90.a.INSTANCE.serializer()), aVar);
    }
}
