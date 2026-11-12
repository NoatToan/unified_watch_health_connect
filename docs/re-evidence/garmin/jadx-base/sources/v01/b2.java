package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv01/b2;", "", "Lm01/g;", "repository", "Ld01/c;", "store", "Ls01/f;", "nutritionSettingsConfigProvider", "Le01/a;", "nutritionPreferences", "<init>", "(Lm01/g;Ld01/c;Ls01/f;Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d01.c f174238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.f f174239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e01.a f174240d;

    public b2(m01.g gVar, d01.c cVar, s01.f fVar, e01.a aVar) {
        gVar.getClass();
        cVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this.f174237a = gVar;
        this.f174238b = cVar;
        this.f174239c = fVar;
        this.f174240d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(b63.o oVar, g01.z zVar, ArrayList arrayList, v13.c cVar) {
        a2 a2Var;
        ArrayList arrayList2;
        Object next;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i14 = a2Var.f174215c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a2Var.f174215c = i14 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, cVar);
            }
        } else {
            a2Var = new a2(this, cVar);
        }
        Object objO = a2Var.f174213a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a2Var.f174215c;
        if (i15 == 0) {
            o13.r.b(objO);
            if (zVar == null) {
                return q01.k.b.f142038a;
            }
            List<g01.x> list = zVar.f74294a;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                for (g01.x xVarA : list) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        int i16 = ((q01.d) next).f141988a;
                        Integer num = xVarA.f74275b;
                        if (num != null && i16 == num.intValue()) {
                            break;
                        }
                    }
                    q01.d dVar = (q01.d) next;
                    if (dVar != null) {
                        k01.d dVar2 = xVarA.f74280g;
                        xVarA = g01.x.a(xVarA, null, null, dVar2 != null ? k01.d.a(dVar2, dVar.f141989b, dVar.f141991d, dVar.f141990c, dVar.f141992e) : null, 4031);
                    }
                    arrayList3.add(xVarA);
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            g01.z zVarA = g01.z.a(zVar, arrayList2, null, null, null, 30);
            int iB = this.f174239c.b();
            a2Var.f174215c = 1;
            objO = this.f174237a.o(iB, oVar, zVarA, a2Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO);
        }
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            d01.c cVar2 = this.f174238b;
            cVar2.d();
            cVar2.a();
            return q01.k.c.f142039a;
        }
        if (v2Var instanceof v2.a) {
            Integer num2 = ((v2.a) v2Var).f47384b;
            return (num2 != null && num2.intValue() == 409) ? q01.k.a.f142037a : q01.k.b.f142038a;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(b63.o oVar, ArrayList arrayList, l01.e eVar, b63.v vVar, b63.v vVar2, Boolean bool, v13.c cVar) {
        z1 z1Var;
        ArrayList arrayList2;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f174633d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f174633d = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        Object objO = z1Var.f174631b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var.f174633d;
        if (i15 == 0) {
            o13.r.b(objO);
            g01.z zVar = new g01.z(arrayList, bool, vVar, vVar2, eVar);
            int iB = this.f174239c.b();
            z1Var.f174630a = arrayList;
            z1Var.f174633d = 1;
            objO = this.f174237a.o(iB, oVar, zVar, z1Var);
            if (objO == aVar) {
                return aVar;
            }
            arrayList2 = arrayList;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = z1Var.f174630a;
            o13.r.b(objO);
        }
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            d01.c cVar2 = this.f174238b;
            cVar2.d();
            cVar2.a();
            this.f174240d.o(og2.k.R(arrayList2));
            return q01.k.c.f142039a;
        }
        if (v2Var instanceof v2.a) {
            Integer num = ((v2.a) v2Var).f47384b;
            return (num != null && num.intValue() == 409) ? q01.k.a.f142037a : q01.k.b.f142038a;
        }
        lc.u0.r();
        return null;
    }
}
