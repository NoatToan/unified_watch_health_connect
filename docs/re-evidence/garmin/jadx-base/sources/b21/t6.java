package b21;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/t6;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t6 extends lc.q0<m21.b> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f15257s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(n63.b bVar) {
        super(true);
        this.f15257s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, m21.b] */
    @Override // lc.q0
    public final m21.b a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f15257s;
        bVar.getClass();
        return bVar.c(m21.b.INSTANCE.serializer(), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, m21.b] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final m21.b h(String str) {
        str.getClass();
        n63.b bVar = this.f15257s;
        bVar.getClass();
        return bVar.c(m21.b.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, m21.b bVar) {
        str.getClass();
        n63.b bVar2 = this.f15257s;
        bVar2.getClass();
        bundle.putString(str, bVar2.b(j63.a.d(m21.b.INSTANCE.serializer()), bVar));
    }

    @Override // lc.q0
    public final String f(m21.b bVar) {
        n63.b bVar2 = this.f15257s;
        bVar2.getClass();
        return r1.q2.j(bVar2, j63.a.d(m21.b.INSTANCE.serializer()), bVar);
    }
}
