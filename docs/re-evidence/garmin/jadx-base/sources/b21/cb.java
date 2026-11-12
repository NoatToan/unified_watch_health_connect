package b21;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lb21/cb;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class cb extends lc.q0<s21.o> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f14597s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(n63.b bVar) {
        super(true);
        this.f14597s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, s21.o] */
    @Override // lc.q0
    public final s21.o a(Bundle bundle, String str) {
        String strI = r1.q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f14597s;
        bVar.getClass();
        return bVar.c(j63.a.d(s21.o.INSTANCE.serializer()), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, s21.o] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final s21.o h(String str) {
        str.getClass();
        n63.b bVar = this.f14597s;
        bVar.getClass();
        return bVar.c(j63.a.d(s21.o.INSTANCE.serializer()), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, s21.o oVar) {
        str.getClass();
        n63.b bVar = this.f14597s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(s21.o.INSTANCE.serializer()), oVar));
    }

    @Override // lc.q0
    public final String f(s21.o oVar) {
        n63.b bVar = this.f14597s;
        bVar.getClass();
        return r1.q2.j(bVar, j63.a.d(s21.o.INSTANCE.serializer()), oVar);
    }
}
