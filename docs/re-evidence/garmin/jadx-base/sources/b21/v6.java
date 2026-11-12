package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v6 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f15323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x01.b f15324d;

    public /* synthetic */ v6(lc.m0 m0Var, v21.e eVar, x01.b bVar, int i14) {
        this.f15321a = i14;
        this.f15322b = m0Var;
        this.f15323c = eVar;
        this.f15324d = bVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f15321a;
        v21.e eVar = this.f15323c;
        x01.b bVar = this.f15324d;
        lc.m0 m0Var = this.f15322b;
        r1.l lVar = (r1.l) obj;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                int iB = androidx.room.a0.b((Integer) obj4, lVar, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                lc.m0 m0Var2 = this.f15322b;
                q8.a(vVar, m0Var2, z3.f.c(-138805633, new w6(vVar, m0Var2, this.f15323c, this.f15324d, 1), mVar), mVar, ((iB >> 3) & 14) | 384);
                break;
            case 1:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iB2 = androidx.room.a0.b((Integer) obj4, lVar, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                lc.m0 m0Var3 = this.f15322b;
                q8.a(vVar2, m0Var3, z3.f.c(-1370098176, new w6(vVar2, m0Var3, this.f15323c, this.f15324d, 2), mVar2), mVar2, ((iB2 >> 3) & 14) | 384);
                break;
            case 2:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iB3 = androidx.room.a0.b((Integer) obj4, lVar, vVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                q8.a(vVar3, m0Var, z3.f.c(1693576577, new w6(m0Var, vVar3, bVar, eVar), mVar3), mVar3, ((iB3 >> 3) & 14) | 384);
                break;
            case 3:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iB4 = androidx.room.a0.b((Integer) obj4, lVar, vVar4);
                p3.x1 x1Var4 = p3.n.f135158a;
                q8.a(vVar4, m0Var, z3.f.c(-1034688101, new x6(m0Var, bVar, eVar), mVar4), mVar4, ((iB4 >> 3) & 14) | 384);
                break;
            default:
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iB5 = androidx.room.a0.b((Integer) obj4, lVar, vVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                q8.a(vVar5, m0Var, z3.f.c(-864896878, new z6(0, bVar, eVar), mVar5), mVar5, ((iB5 >> 3) & 14) | 384);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v6(lc.m0 m0Var, x01.b bVar, v21.e eVar, int i14) {
        this.f15321a = i14;
        this.f15322b = m0Var;
        this.f15324d = bVar;
        this.f15323c = eVar;
    }
}
