package b21;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/n8;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n8 extends lc.q0<l4> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f15070s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(n63.b bVar) {
        super(true);
        this.f15070s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [b21.l4, java.lang.Object] */
    @Override // lc.q0
    public final l4 a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f15070s;
        bVar.getClass();
        return bVar.c(l4.INSTANCE.serializer(), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [b21.l4, java.lang.Object] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final l4 h(String str) {
        str.getClass();
        n63.b bVar = this.f15070s;
        bVar.getClass();
        return bVar.c(l4.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, l4 l4Var) {
        str.getClass();
        n63.b bVar = this.f15070s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(l4.INSTANCE.serializer()), l4Var));
    }

    @Override // lc.q0
    public final String f(l4 l4Var) {
        n63.b bVar = this.f15070s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(l4.INSTANCE.serializer()), l4Var);
    }
}
