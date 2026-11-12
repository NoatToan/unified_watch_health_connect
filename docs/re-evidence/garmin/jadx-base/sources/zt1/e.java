package zt1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f206967b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f206966a = i14;
        this.f206967b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f206966a) {
            case 0:
                f fVar = this.f206967b;
                g.b bVarD = fVar.f206972e.d();
                String selectedGoal = bVarD.f206993a.getSelectedGoal();
                if (selectedGoal == null) {
                    selectedGoal = "";
                }
                fVar.f206974g.K((int) fVar.f206969b, selectedGoal, Integer.valueOf(bVarD.f206993a.getSelectedPaceGoalTime()), fVar.f206983p);
                break;
            case 1:
                this.f206967b.r();
                break;
            case 2:
                this.f206967b.r();
                break;
            default:
                this.f206967b.r();
                break;
        }
        return Unit.INSTANCE;
    }
}
