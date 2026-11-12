package b21;

import android.os.Bundle;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/p8;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p8 extends lc.q0<List<? extends Integer>> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f15146s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(n63.b bVar) {
        super(true);
        this.f15146s = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
    @Override // lc.q0
    public final List<? extends Integer> a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f15146s;
        bVar.getClass();
        return bVar.c(new m63.e(m63.m0.f116981a), strI);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final List<? extends Integer> h(String str) {
        str.getClass();
        n63.b bVar = this.f15146s;
        bVar.getClass();
        return bVar.c(new m63.e(m63.m0.f116981a), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, List<? extends Integer> list) {
        str.getClass();
        n63.b bVar = this.f15146s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(new m63.e(m63.m0.f116981a)), list));
    }

    @Override // lc.q0
    public final String f(List<? extends Integer> list) {
        n63.b bVar = this.f15146s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(new m63.e(m63.m0.f116981a)), list);
    }
}
