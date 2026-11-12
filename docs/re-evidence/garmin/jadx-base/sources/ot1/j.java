package ot1;

import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Unit;
import qt1.c0;
import qt1.e0;
import qt1.f0;
import qt1.i0;
import qt1.l0;
import qt1.m0;
import qt1.x0;
import qt1.y0;
import vs1.h0;
import vs1.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.k f133800b;

    public /* synthetic */ j(qt1.k kVar, int i14) {
        this.f133799a = i14;
        this.f133800b = kVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133799a;
        qt1.k kVar = this.f133800b;
        switch (i14) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                l lVar = l.f133804a;
                kVar.S4(jLongValue);
                break;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                l lVar2 = l.f133804a;
                kVar.L4(jLongValue2);
                break;
            case 2:
                pt1.n nVar = (pt1.n) obj;
                l lVar3 = l.f133804a;
                nVar.getClass();
                ge1.b.T(v1.a(kVar), null, null, new qt1.l(kVar, nVar, null), 3);
                break;
            case 3:
                pt1.u uVar = (pt1.u) obj;
                u uVar2 = u.f133824a;
                uVar.getClass();
                ge1.b.T(v1.a(kVar), null, null, new qt1.s(kVar, uVar, null), 3);
                break;
            case 4:
                pt1.n nVar2 = (pt1.n) obj;
                u uVar3 = u.f133824a;
                nVar2.getClass();
                kVar.E4(nVar2);
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u uVar4 = u.f133824a;
                ge1.b.T(v1.a(kVar), null, null, new y0(kVar, zBooleanValue, null), 3);
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                u uVar5 = u.f133824a;
                ge1.b.T(v1.a(kVar), null, null, new m0(kVar, iIntValue, null), 3);
                break;
            case 7:
                long jLongValue3 = ((Long) obj).longValue();
                u uVar6 = u.f133824a;
                w9.a aVarA = v1.a(kVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new l0(jLongValue3, kVar, null), 2);
                ge1.b.T(v1.a(kVar), null, null, new f0(kVar, null), 3);
                break;
            case 8:
                u uVar7 = u.f133824a;
                ge1.b.T(v1.a(kVar), null, null, new i0(kVar, null), 3);
                break;
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                u uVar8 = u.f133824a;
                ge1.b.T(v1.a(kVar), null, null, new x0(kVar, zBooleanValue2, null), 3);
                break;
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                w wVar = w.f133841a;
                ge1.b.T(v1.a(kVar), null, null, new m0(kVar, iIntValue2, null), 3);
                break;
            case 11:
                long jLongValue4 = ((Long) obj).longValue();
                w wVar2 = w.f133841a;
                kVar.S4(jLongValue4);
                break;
            case 12:
                long jLongValue5 = ((Long) obj).longValue();
                w wVar3 = w.f133841a;
                kVar.L4(jLongValue5);
                break;
            case 13:
                pt1.n nVar3 = (pt1.n) obj;
                w wVar4 = w.f133841a;
                nVar3.getClass();
                kVar.E4(nVar3);
                break;
            case 14:
                y yVar = y.f133845a;
                ((Unit) obj).getClass();
                ge1.b.T(v1.a(kVar), null, null, new qt1.o(kVar, null), 3);
                break;
            case 15:
                us1.o oVar = (us1.o) obj;
                y yVar2 = y.f133845a;
                oVar.getClass();
                h0 h0Var = kVar.f147686w;
                h0Var.getClass();
                ge1.b.T(h0Var.f179811a, null, null, new q0(h0Var, oVar, null), 3);
                break;
            case 16:
                pt1.n nVar4 = (pt1.n) obj;
                y yVar3 = y.f133845a;
                nVar4.getClass();
                kVar.E4(nVar4);
                break;
            case 17:
                pt1.u uVar9 = (pt1.u) obj;
                y yVar4 = y.f133845a;
                uVar9.getClass();
                ge1.b.T(v1.a(kVar), null, null, new qt1.s(kVar, uVar9, null), 3);
                break;
            case 18:
                ge1.b.T(v1.a(kVar), null, null, new c0.a(kVar, ((Integer) obj).intValue(), null), 3);
                break;
            default:
                ge1.b.T(v1.a(kVar), null, null, new e0.a(kVar, ((Integer) obj).intValue(), null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
