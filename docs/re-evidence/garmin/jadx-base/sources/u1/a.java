package u1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f167345b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f167344a = i14;
        this.f167345b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        h5.j jVar;
        int i14 = this.f167344a;
        b bVar = this.f167345b;
        switch (i14) {
            case 0:
                b.C3147b c3147b = b.f167347z;
                z0 z0Var = (z0) h5.i.a(bVar, b1.f167410a);
                if (!(z0Var instanceof f1)) {
                    b2.e.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + z0Var);
                }
                f1 f1Var = bVar.f167356k;
                f1 f1Var2 = (f1) z0Var;
                bVar.f167356k = f1Var2;
                if (f1Var != null && !p005kotlin.jvm.internal.s.g(f1Var2, f1Var) && ((jVar = bVar.f167358m) != null || !bVar.f167365v)) {
                    if (jVar != null) {
                        bVar.V1(jVar);
                    }
                    bVar.f167358m = null;
                    bVar.e2();
                }
                return Unit.INSTANCE;
            default:
                bVar.f167354i.invoke();
                return Boolean.TRUE;
        }
    }
}
