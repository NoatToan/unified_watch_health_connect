package ot1;

import android.content.Context;
import androidx.lifecycle.v1;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.k f133802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f133803c;

    public /* synthetic */ k(qt1.k kVar, Context context, int i14) {
        this.f133801a = i14;
        this.f133802b = kVar;
        this.f133803c = context;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133801a;
        Context context = this.f133803c;
        qt1.k kVar = this.f133802b;
        switch (i14) {
            case 0:
                us1.c cVar = (us1.c) obj;
                pt1.f fVar = (pt1.f) obj2;
                l lVar = l.f133804a;
                cVar.getClass();
                fVar.getClass();
                kVar.P4(context, cVar, fVar);
                break;
            case 1:
                us1.c cVar2 = (us1.c) obj;
                pt1.f fVar2 = (pt1.f) obj2;
                u uVar = u.f133824a;
                cVar2.getClass();
                fVar2.getClass();
                kVar.P4(context, cVar2, fVar2);
                break;
            case 2:
                pt1.y yVar = (pt1.y) obj;
                int iIntValue = ((Integer) obj2).intValue();
                u uVar2 = u.f133824a;
                yVar.getClass();
                long j8 = yVar.f141026a;
                String str = yVar.f141030e;
                long j14 = yVar.f141028c;
                Long lValueOf = Long.valueOf(yVar.f141027b);
                qt1.k kVar2 = this.f133802b;
                kVar2.M4(this.f133803c, iIntValue, j8, str, j14, lValueOf);
                kVar2.E4(pt1.n.f.f140900a);
                ge1.b.T(v1.a(kVar2), null, null, new qt1.r(kVar2, null), 3);
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                u uVar3 = u.f133824a;
                Context context2 = this.f133803c;
                context2.getClass();
                vs1.w wVar = kVar.f147688y;
                wVar.getClass();
                b0 b0Var = wVar.f179918a;
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.u(jLongValue, wVar, jLongValue2, context2, null), 2);
                break;
            default:
                us1.c cVar4 = (us1.c) obj;
                pt1.f fVar3 = (pt1.f) obj2;
                w wVar2 = w.f133841a;
                cVar4.getClass();
                fVar3.getClass();
                kVar.P4(context, cVar4, fVar3);
                break;
        }
        return Unit.INSTANCE;
    }
}
