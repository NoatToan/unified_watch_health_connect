package ew1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f66770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66771c;

    public /* synthetic */ t2(u2 u2Var, p3.p1 p1Var, int i14) {
        this.f66769a = i14;
        this.f66770b = u2Var;
        this.f66771c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66769a;
        p3.p1 p1Var = this.f66771c;
        u2 u2Var = this.f66770b;
        switch (i14) {
            case 0:
                u2.a aVar = u2.f66789c;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachSwimTrainingDaysSelected");
                if (u2Var.y6().f13385r1) {
                    u2Var.y6().G7("FBTSwimDaysSelectionFragCompose", new t2(u2Var, p1Var, 1));
                } else {
                    u2Var.y6().Q7(tu1.a.x((List) p1Var.getF182175a()));
                    u2Var.y6().s6().j("FBTSelectSwimAbilityFragment");
                }
                break;
            default:
                u2.a aVar2 = u2.f66789c;
                u2Var.y6().Q7(tu1.a.x((List) p1Var.getF182175a()));
                break;
        }
        return Unit.INSTANCE;
    }
}
