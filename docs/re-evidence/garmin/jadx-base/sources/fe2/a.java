package fe2;

import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70585b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f70584a = i14;
        this.f70585b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        x1 x1Var;
        int i14 = this.f70584a;
        b bVar = this.f70585b;
        switch (i14) {
            case 0:
                int i15 = b.f70632t;
                return new j1(bVar.f70636d.getF104144a().f(), bVar.f70633a, bVar.f70634b);
            default:
                DateTime dateTime = bVar.f70644l;
                if (dateTime != null && (x1Var = bVar.f70642j) != null) {
                    f2.o0 o0Var = new f2.o0(bVar, 15);
                    if (DateTime.now().plusHours(1).isAfter(dateTime)) {
                        x1Var.f71005e.debug("Try expand live track session with 24 hours.");
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        x53.c cVar = o53.s0.f129406a;
                        ge1.b.T(x1Var, u53.o.f168762a, null, new y1(x1Var, dateTime, r0Var, o0Var, null), 2);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
