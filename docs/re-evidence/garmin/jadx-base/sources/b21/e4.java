package b21;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/e4;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e4 extends lc.q0<b11.m> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f14639s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(n63.b bVar) {
        super(true);
        this.f14639s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [b11.m, java.lang.Object] */
    @Override // lc.q0
    public final b11.m a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f14639s;
        bVar.getClass();
        return bVar.c(j63.a.d(b11.m.INSTANCE.serializer()), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [b11.m, java.lang.Object] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final b11.m h(String str) {
        str.getClass();
        n63.b bVar = this.f14639s;
        bVar.getClass();
        return bVar.c(j63.a.d(b11.m.INSTANCE.serializer()), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, b11.m mVar) {
        str.getClass();
        n63.b bVar = this.f14639s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(b11.m.INSTANCE.serializer()), mVar));
    }

    @Override // lc.q0
    public final String f(b11.m mVar) {
        n63.b bVar = this.f14639s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(b11.m.INSTANCE.serializer()), mVar);
    }
}
