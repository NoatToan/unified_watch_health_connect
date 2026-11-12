package x71;

import j70.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import n61.f;
import n61.g;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.i;
import r53.j;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements i<x71.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f189424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f189425b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f189426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f189427b;

        /* JADX INFO: renamed from: x71.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.domain.dashboard.GetEnduranceScoreDataUseCase$invoke$$inlined$map$1$2", f = "GetEnduranceScoreDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C3523a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f189428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f189429b;

            public C3523a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f189428a = obj;
                this.f189429b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, d dVar) {
            this.f189426a = jVar;
            this.f189427b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:58:0x0112  */
        /* JADX WARN: Code duplicated, block: B:59:0x011b  */
        /* JADX WARN: Code duplicated, block: B:65:0x012f  */
        /* JADX WARN: Code duplicated, block: B:68:0x0139  */
        /* JADX WARN: Code duplicated, block: B:73:0x0155 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:78:0x0141 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:1: B:66:0x0133->B:79:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2 */
        /* JADX WARN: Type inference failed for: r18v3 */
        /* JADX WARN: Type inference failed for: r18v4 */
        /* JADX WARN: Type inference failed for: r18v5 */
        /* JADX WARN: Type inference failed for: r18v6 */
        /* JADX WARN: Type inference failed for: r18v7 */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v6, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3523a c3523a;
            ?? arrayList;
            ?? r18;
            x xVarB;
            ?? r19;
            Integer num;
            Iterable iterable;
            boolean z14;
            Iterator<T> it;
            x71.a aVar;
            Map<String, g> mapG;
            if (dVar instanceof C3523a) {
                c3523a = (C3523a) dVar;
                int i14 = c3523a.f189429b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3523a.f189429b = i14 - Integer.MIN_VALUE;
                } else {
                    c3523a = new C3523a(dVar);
                }
            } else {
                c3523a = new C3523a(dVar);
            }
            Object obj2 = c3523a.f189428a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3523a.f189429b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                d dVar3 = this.f189427b;
                dVar3.getClass();
                f fVar = (f) dVar3.b(str, f.INSTANCE.serializer());
                n61.c enduranceScore = fVar != null ? fVar.getEnduranceScore() : null;
                Integer num2 = enduranceScore != null ? enduranceScore.f123826d : null;
                n61.d dVarB = enduranceScore != null ? enduranceScore.b() : null;
                n61.b.a aVar3 = n61.b.f123808d;
                Integer num3 = enduranceScore != null ? enduranceScore.f123827e : null;
                aVar3.getClass();
                n61.b bVarA = n61.b.a.a(num3);
                if (fVar == null || (mapG = fVar.g()) == null) {
                    arrayList = j0.f134944a;
                } else {
                    TreeMap treeMap = new TreeMap(new b());
                    treeMap.putAll(mapG);
                    Collection collectionValues = treeMap.values();
                    if (collectionValues != null) {
                        Collection collection = collectionValues;
                        arrayList = new ArrayList(y.r(collection, 10));
                        Iterator<T> it3 = collection.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((g) it3.next()).getGroupAverage());
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                }
                Integer num4 = (Integer) h0.e0(arrayList.size() - 2, arrayList);
                Integer num5 = (Integer) h0.n0(arrayList);
                if (num2 == null && num5 != null && num4 == null) {
                    r18 = arrayList;
                } else {
                    if (num2 != null || num5 == null || num4 == null) {
                        r18 = arrayList;
                        if ((num2 == null || num5 != null) && num2 != null && num5 != null) {
                            x.a aVar4 = x.f97667d;
                            double dIntValue = num5.intValue();
                            double dIntValue2 = num2.intValue();
                            aVar4.getClass();
                            xVarB = x.a.b(dIntValue, dIntValue2);
                            r19 = r18;
                        }
                    } else {
                        x.a aVar5 = x.f97667d;
                        double dIntValue3 = num4.intValue();
                        r19 = arrayList;
                        double dIntValue4 = num5.intValue();
                        aVar5.getClass();
                        xVarB = x.a.b(dIntValue3, dIntValue4);
                    }
                    yz1.d dVar4 = dVar2.f97520a;
                    if (xVarB != null) {
                        num = new Integer(xVarB.f97672a);
                    } else {
                        num = null;
                    }
                    iterable = (Iterable) r19;
                    z14 = false;
                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((Integer) it.next()) != null) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    aVar = new x71.a(dVar4, num2, dVarB, bVarA, num, Boolean.valueOf(z14));
                    c3523a.f189429b = 1;
                    if (this.f189426a.emit(aVar, c3523a) == aVar2) {
                        return aVar2;
                    }
                }
                xVarB = null;
                r19 = r18;
                yz1.d dVar5 = dVar2.f97520a;
                if (xVarB != null) {
                    num = new Integer(xVarB.f97672a);
                } else {
                    num = null;
                }
                iterable = (Iterable) r19;
                z14 = false;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((Integer) it.next()) != null) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((Integer) it.next()) != null) {
                            z14 = true;
                            break;
                        }
                    }
                }
                aVar = new x71.a(dVar5, num2, dVarB, bVarA, num, Boolean.valueOf(z14));
                c3523a.f189429b = 1;
                if (this.f189426a.emit(aVar, c3523a) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public c(i iVar, d dVar) {
        this.f189424a = iVar;
        this.f189425b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super x71.a> jVar, t13.d dVar) {
        Object objCollect = this.f189424a.collect(new a(jVar, this.f189425b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
