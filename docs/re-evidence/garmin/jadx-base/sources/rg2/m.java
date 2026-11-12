package rg2;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;
import r53.p2;
import yg2.h0;
import yg2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f152743a;

    public m(h hVar) {
        this.f152743a = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0247  */
    /* JADX WARN: Code duplicated, block: B:79:0x024b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, o13.l] */
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        ah2.h.b bVar;
        ah2.h.b bVar2;
        ah2.h.a aVar;
        ah2.e eVarA;
        T next;
        lt2.a duration;
        yg2.a aVarF;
        sf2.e eVar = (sf2.e) obj;
        if (!(eVar instanceof sf2.e.d)) {
            return Unit.INSTANCE;
        }
        h hVar = this.f152743a;
        LinkedHashMap linkedHashMapN = u0.n((Map) hVar.f152712e.getValue());
        boolean zBooleanValue = ((Boolean) hVar.z4().f71478b.f131784m.getValue()).booleanValue();
        Iterator<T> it = (zBooleanValue ? (List) hVar.f152710c.getValue() : (List) hVar.f152711d.getValue()).iterator();
        while (true) {
            num = null;
            Integer num = null;
            eVar = null;
            eVar = null;
            ah2.e eVar2 = null;
            if (!it.hasNext()) {
                hVar.f152712e.k(null, u0.m(linkedHashMapN));
                Unit unit = Unit.INSTANCE;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                return unit;
            }
            ag2.c.a aVar3 = (ag2.c.a) it.next();
            if (aVar3 != ag2.c.a.BREATHWORK_PHASE) {
                if (aVar3 == ag2.c.a.MEDITATION_TIMER) {
                    if (((Boolean) hVar.z4().f71486j.getValue()).booleanValue()) {
                        eVarA = new ah2.e("--", null, false, 6, null);
                    } else {
                        Iterator<T> it3 = ((sf2.e.d) eVar).f158954a.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it3.next();
                        } while (((rf2.b) next).f152455a != rf2.a.TIME);
                        rf2.b bVar3 = next;
                        if (bVar3 != null) {
                            Float f14 = bVar3.f152460f;
                            if (f14 != null) {
                                float fFloatValue = f14.floatValue();
                                h0 h0Var = (h0) hVar.z4().f71478b.f131781j.f71431f.f150540a.getValue();
                                if (h0Var != null && (duration = h0Var.getDuration()) != null) {
                                    float f15 = ((float) duration.f114867b) - fFloatValue;
                                    eVar2 = new ah2.e(hVar.z4().h().f3292a.v(new Float(f15)), new Float(f15), false, 4, null);
                                }
                            }
                            if (eVar2 != null) {
                                eVarA = eVar2;
                            }
                        }
                        eVarA = new ah2.e("--:--", null, false, 6, null);
                    }
                } else if (aVar3 != ag2.c.a.TIMER || zBooleanValue) {
                    ah2.e eVar3 = (ah2.e) linkedHashMapN.get(aVar3);
                    String str = eVar3 != null ? eVar3.f3289a : null;
                    List<rf2.b> list = ((sf2.e.d) eVar).f158954a;
                    p2 p2Var = hVar.f152715h;
                    p2 p2Var2 = hVar.f152714g;
                    rf2.l lVar = (rf2.l) p2Var.getValue();
                    boolean z14 = hVar.z4().f71478b.f131780i.f144650e;
                    boolean zBooleanValue2 = ((Boolean) hVar.f152717j.f150540a.getValue()).booleanValue();
                    ah2.j jVar = hVar.z4().h().f3292a;
                    zf2.d dVar2 = (zf2.d) p2Var2.getValue();
                    if (dVar2 == null || (bVar = dVar2.f204637i) == null) {
                        bVar = ah2.h.b.KILO_METERS;
                    }
                    zf2.d dVar3 = (zf2.d) p2Var2.getValue();
                    if (dVar3 == null || (bVar2 = dVar3.f204638j) == null) {
                        bVar2 = ah2.h.b.MILES;
                    }
                    zf2.d dVar4 = (zf2.d) p2Var2.getValue();
                    if (dVar4 == null || (aVar = dVar4.f204639k) == null) {
                        aVar = ah2.h.a.TWO_DECIMALS;
                    }
                    eVarA = ah2.i.a(aVar3, str, list, lVar, z14, bVar, bVar2, aVar, zBooleanValue2, jVar, new j(hVar.z4()), new k(hVar.z4()), new l(hVar.z4()), fg2.h0.b((o) hVar.z4().f71478b.f131781j.f71429d.f150540a.getValue()), ((Boolean) hVar.z4().f71486j.getValue()).booleanValue(), (Context) hVar.f152709b.getValue());
                } else {
                    eVarA = new ah2.e("--:--", null, false, 2, null);
                }
                if (eVarA == null) {
                    linkedHashMapN.remove(aVar3);
                } else {
                    linkedHashMapN.put(aVar3, eVarA);
                }
                eVar = eVar;
            } else if (((Boolean) hVar.z4().f71486j.getValue()).booleanValue()) {
                eVarA = new ah2.e("--", null, false, 6, null);
            } else {
                o oVar = (o) hVar.z4().f71478b.f131781j.f71429d.f150540a.getValue();
                h0 h0Var2 = (h0) hVar.z4().f71478b.f131781j.f71431f.f150540a.getValue();
                if (h0Var2 != null && (aVarF = fg2.h0.f(h0Var2, oVar)) != null) {
                    num = new Integer(aVarF.getClusterIndex());
                }
                int size = oVar.b().size() - 1;
                eVarA = new ah2.e(androidx.core.view.j.d(size - (num != null ? num.intValue() : 0), size, "/"), null, false, 6, null);
            }
            if (eVarA == null) {
                linkedHashMapN.remove(aVar3);
            } else {
                linkedHashMapN.put(aVar3, eVarA);
            }
            eVar = eVar;
        }
    }
}
