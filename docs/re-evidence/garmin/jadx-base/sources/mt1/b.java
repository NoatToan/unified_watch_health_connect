package mt1;

import androidx.lifecycle.v1;
import e23.l;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;
import pt1.t;
import qr.n;
import r53.p2;
import u53.o;
import us1.k;
import vs1.q;
import vs1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f120958b;

    public /* synthetic */ b(qt1.a aVar, int i14) {
        this.f120957a = i14;
        this.f120958b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        pt1.c cVar;
        Object value2;
        pt1.c cVar2;
        Object value3;
        pt1.c cVar3;
        Object value4;
        pt1.c cVar4;
        Object value5;
        int i14 = this.f120957a;
        qt1.a aVar = this.f120958b;
        switch (i14) {
            case 0:
                aVar.F4(((Boolean) obj).booleanValue());
                n nVar = new n(18);
                w9.a aVarA = v1.a(aVar);
                x53.c cVar5 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new qt1.h(aVar, nVar, null), 2);
                break;
            case 1:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                ot1.e eVar = ot1.e.f133785a;
                dVar.getClass();
                aVar.F.p(dVar);
                p2 p2Var = aVar.f147503p;
                do {
                    value = p2Var.getValue();
                    cVar = (pt1.c) value;
                } while (!p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, null, 0.0f, null, 0, null, null, false, false, dVar, false, 0.0f, 15359), null, null, false, false, 503)));
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ot1.e eVar2 = ot1.e.f133785a;
                aVar.F.x(zBooleanValue);
                p2 p2Var2 = aVar.f147503p;
                while (true) {
                    Object value6 = p2Var2.getValue();
                    pt1.c cVar6 = (pt1.c) value6;
                    boolean z14 = zBooleanValue;
                    if (!p2Var2.b(value6, pt1.c.a(cVar6, false, false, false, pt1.d.a(cVar6.f140819d, null, null, null, 0.0f, null, 0, null, null, false, false, null, z14, 0.0f, 14335), null, null, false, false, 503))) {
                        zBooleanValue = z14;
                    }
                    break;
                }
                break;
            case 3:
                e23.a aVar2 = (e23.a) obj;
                ot1.e eVar3 = ot1.e.f133785a;
                aVar2.getClass();
                w9.a aVarA2 = v1.a(aVar);
                x53.c cVar7 = s0.f129406a;
                ge1.b.T(aVarA2, x53.b.f189152a, null, new qt1.h(aVar, aVar2, null), 2);
                break;
            case 4:
                ot1.e eVar4 = ot1.e.f133785a;
                w9.a aVarA3 = v1.a(aVar);
                x53.c cVar8 = s0.f129406a;
                ge1.b.T(aVarA3, o.f168762a, null, new qt1.b((je2.b) obj, aVar, null), 2);
                break;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                ot1.e eVar5 = ot1.e.f133785a;
                p2 p2Var3 = aVar.f147503p;
                do {
                    value2 = p2Var3.getValue();
                    cVar2 = (pt1.c) value2;
                } while (!p2Var3.b(value2, pt1.c.a(cVar2, false, false, false, pt1.d.a(cVar2.f140819d, null, null, null, 0.0f, null, iIntValue, null, null, false, false, null, false, 0.0f, 16351), null, null, false, false, 503)));
                break;
            case 6:
                ke2.b bVar = (ke2.b) obj;
                ot1.e eVar6 = ot1.e.f133785a;
                bVar.getClass();
                w9.a aVarA4 = v1.a(aVar);
                x53.c cVar9 = s0.f129406a;
                ge1.b.T(aVarA4, x53.b.f189152a, null, new qt1.g(aVar, bVar, null), 2);
                break;
            case 7:
                pt1.i iVar = (pt1.i) obj;
                ot1.e eVar7 = ot1.e.f133785a;
                iVar.getClass();
                w9.a aVarA5 = v1.a(aVar);
                x53.c cVar10 = s0.f129406a;
                ge1.b.T(aVarA5, x53.b.f189152a, null, new qt1.f(iVar, aVar, null), 2);
                break;
            case 8:
                t tVar = (t) obj;
                ot1.e eVar8 = ot1.e.f133785a;
                tVar.getClass();
                int i15 = qt1.a.I;
                vs1.t tVar2 = aVar.f147506t;
                p90.h hVar = new p90.h(aVar, 15, null, tVar);
                tVar2.getClass();
                boolean z15 = tVar.f140980n;
                b0 b0Var = tVar2.f179893b;
                if (z15) {
                    x53.c cVar11 = s0.f129406a;
                    ge1.b.T(b0Var, x53.b.f189152a, null, new s(tVar2, tVar, true, hVar, null), 2);
                } else {
                    x53.c cVar12 = s0.f129406a;
                    ge1.b.T(b0Var, x53.b.f189152a, null, new q(tVar2, tVar, true, hVar, null), 2);
                }
                break;
            case 9:
                k kVar = (k) obj;
                ot1.e eVar9 = ot1.e.f133785a;
                kVar.getClass();
                p2 p2Var4 = aVar.f147503p;
                do {
                    value3 = p2Var4.getValue();
                    cVar3 = (pt1.c) value3;
                } while (!p2Var4.b(value3, pt1.c.a(cVar3, false, false, false, null, pt1.a.a(cVar3.f140820e, null, 0, null, null, kVar, 15), null, false, false, 495)));
                aVar.H4();
                break;
            case 10:
                float fFloatValue = ((Float) obj).floatValue();
                ot1.e eVar10 = ot1.e.f133785a;
                p2 p2Var5 = aVar.f147503p;
                do {
                    value4 = p2Var5.getValue();
                    cVar4 = (pt1.c) value4;
                } while (!p2Var5.b(value4, pt1.c.a(cVar4, false, false, false, pt1.d.a(cVar4.f140819d, null, null, null, 0.0f, null, 0, null, null, false, false, null, false, fFloatValue, 12287), null, null, false, false, 503)));
                break;
            case 11:
                t tVar3 = (t) obj;
                ot1.n nVar2 = ot1.n.f133806a;
                tVar3.getClass();
                int i16 = qt1.a.I;
                vs1.t tVar4 = aVar.f147506t;
                p90.h hVar2 = new p90.h(aVar, 15, null, tVar3);
                tVar4.getClass();
                boolean z16 = tVar3.f140980n;
                b0 b0Var2 = tVar4.f179893b;
                if (z16) {
                    x53.c cVar13 = s0.f129406a;
                    ge1.b.T(b0Var2, x53.b.f189152a, null, new s(tVar4, tVar3, true, hVar2, null), 2);
                } else {
                    x53.c cVar14 = s0.f129406a;
                    ge1.b.T(b0Var2, x53.b.f189152a, null, new q(tVar4, tVar3, true, hVar2, null), 2);
                }
                break;
            default:
                k kVar2 = (k) obj;
                ot1.n nVar3 = ot1.n.f133806a;
                kVar2.getClass();
                vs1.t tVar5 = aVar.f147506t;
                tVar5.getClass();
                p2 p2Var6 = tVar5.f179900i;
                do {
                    value5 = p2Var6.getValue();
                } while (!p2Var6.b(value5, pt1.h.a((pt1.h) value5, false, false, kVar2, null, false, null, 59)));
                tVar5.b();
                break;
        }
        return Unit.INSTANCE;
    }
}
