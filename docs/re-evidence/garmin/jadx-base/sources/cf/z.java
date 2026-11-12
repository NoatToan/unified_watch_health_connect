package cf;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f27001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud.a f27002c;

    public /* synthetic */ z(b0 b0Var, ud.a aVar, int i14) {
        this.f27000a = i14;
        this.f27001b = b0Var;
        this.f27002c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f27000a;
        ud.a aVar = this.f27002c;
        b0 b0Var = this.f27001b;
        p1.a<String, List<androidx.work.c>> aVar2 = (p1.a) obj;
        switch (i14) {
            case 0:
                b0.c cVar = b0.f26898d;
                aVar2.getClass();
                b0Var.D(aVar, aVar2);
                break;
            default:
                b0.c cVar2 = b0.f26898d;
                aVar2.getClass();
                b0Var.E(aVar, aVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
