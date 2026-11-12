package ek1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lek1/v;", "", "Lnk1/g;", "repository", "<init>", "(Lnk1/g;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk1.g f64498a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64499a;

        static {
            int[] iArr = new int[hk1.n.values().length];
            try {
                iArr[hk1.n.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hk1.n.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64499a = iArr;
        }
    }

    static {
        nk1.g.a aVar = nk1.g.f126421b;
    }

    public v(nk1.g gVar) {
        gVar.getClass();
        this.f64498a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, hk1.d dVar, hk1.n nVar, List list, i53.d dVar2, e23.p pVar, e23.a aVar, v13.c cVar) {
        w wVar;
        hk1.o oVar;
        hk1.o oVar2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f64508i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f64508i = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objJ = wVar.f64506g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f64508i;
        if (i15 == 0) {
            o13.r.b(objJ);
            String str2 = dVar.f84140a;
            if (list == null) {
                list = j0.f134944a;
            }
            int i16 = a.f64499a[nVar.ordinal()];
            if (i16 == 1) {
                oVar = new hk1.o(h0.D0(list, str2));
            } else {
                if (i16 != 2) {
                    u0.r();
                    return null;
                }
                oVar = new hk1.o(h0.y0(list, str2));
                hk1.d.a aVar3 = hk1.d.f84132d;
                hk1.f fVar = hk1.f.EXPORT;
                aVar3.getClass();
                fVar.getClass();
                w13.c cVar2 = hk1.d.f84139k;
                ArrayList arrayList = new ArrayList();
                for (Object obj : cVar2) {
                    if (((hk1.d) obj).f84141b == fVar) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hk1.d) it.next()).f84140a);
                }
                List<String> listB = oVar.b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listB) {
                    if (arrayList2.contains((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.size() == 1) {
                    hk1.d dVar3 = hk1.d.f84137i;
                    if (arrayList3.contains(dVar3.f84140a)) {
                        oVar = new hk1.o(h0.y0(oVar.b(), dVar3.f84140a));
                    }
                }
            }
            wVar.f64500a = dVar;
            wVar.f64501b = nVar;
            wVar.f64502c = dVar2;
            wVar.f64503d = pVar;
            wVar.f64504e = aVar;
            wVar.f64505f = oVar;
            wVar.f64508i = 1;
            nk1.g gVar = this.f64498a;
            objJ = f0.J(gVar, new nk1.p(gVar, str, oVar, null), wVar);
            if (objJ == aVar2) {
                return aVar2;
            }
            oVar2 = oVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar2 = wVar.f64505f;
            aVar = wVar.f64504e;
            pVar = wVar.f64503d;
            dVar2 = wVar.f64502c;
            nVar = wVar.f64501b;
            dVar = wVar.f64500a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            LinkedHashMap linkedHashMapN = p13.u0.n(dVar2);
            Iterator it3 = dVar2.entrySet().iterator();
            while (it3.hasNext()) {
                hk1.d dVar4 = (hk1.d) ((Map.Entry) it3.next()).getKey();
                linkedHashMapN.put(dVar4, Boolean.valueOf(oVar2.b().contains(dVar4.f84140a)));
            }
            linkedHashMapN.put(dVar, Boolean.valueOf(nVar == hk1.n.ADD));
            pVar.invoke(linkedHashMapN, oVar2.b());
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            aVar.invoke();
        }
        return Unit.INSTANCE;
    }
}
