package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x80.e f26466b;

    public /* synthetic */ s1(x80.e eVar, int i14) {
        this.f26465a = i14;
        this.f26466b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26465a) {
            case 0:
                return Boolean.valueOf(this.f26466b.f189517t);
            case 1:
                return this.f26466b.f189518v;
            case 2:
                q90.c cVarZ4 = this.f26466b.z4();
                return cVarZ4 == null ? new q90.c(0L, (String) null, (l90.b) null, false, (z80.f) null, false, false, false, false, false, false, 2047, (p005kotlin.jvm.internal.j) null) : cVarZ4;
            case 3:
                q90.d dVar = this.f26466b.f189519w;
                if (dVar != null) {
                    return dVar;
                }
                return null;
            default:
                x80.e eVar = this.f26466b;
                eVar.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(eVar), null, null, new x80.j(eVar, null), 3);
                return Unit.INSTANCE;
        }
    }
}
