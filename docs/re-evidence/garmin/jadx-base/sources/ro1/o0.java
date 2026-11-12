package ro1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.HttpUrl;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro1/o0;", "Lkr/j;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements kr.j {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kr.j
    public final Object a(Context context, ps.q qVar, v13.c cVar) {
        m0 m0Var;
        fs.b bVar;
        fs.b bVar2;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f153992c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f153992c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objJ = m0Var.f153990a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f153992c;
        int i16 = 1;
        so1.a aVar2 = null;
        Object[] objArr = 0;
        if (i15 == 0) {
            o13.r.b(objJ);
            so1.b bVarV = og2.k.v(context, qVar);
            f0 f0Var = new f0(aVar2, i16, objArr == true ? 1 : 0);
            m0Var.f153992c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(f0Var, new e0(f0Var, bVarV, null), m0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        if (!(v2Var instanceof v2.b)) {
            lc.u0.r();
            return null;
        }
        v2.b bVar3 = (v2.b) v2Var;
        int i17 = bVar3.f47387b;
        HttpUrl httpUrl = bVar3.f47388c;
        try {
            List listN0 = p13.h0.N0((List) ((v2.b) v2Var).f47386a, new n0());
            ArrayList arrayList = new ArrayList();
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                so1.d dVar = (so1.d) it.next();
                List<so1.c> listA = dVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listA) {
                    Integer groupPriority = ((so1.c) obj).getGroupPriority();
                    Object arrayList2 = linkedHashMap.get(groupPriority);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(groupPriority, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList<List> arrayList3 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    List listK = p13.x.k("slogan_social_distancing", "slogan_stay_home", "slogan_stay_healthy", "slogan_training_home", "slogan_home_workout");
                    so1.c cVar2 = (so1.c) p13.h0.d0((List) obj2);
                    if (!p13.h0.R(listK, cVar2 != null ? cVar2.getStickerKey() : null)) {
                        arrayList3.add(obj2);
                    }
                }
                int i18 = 10;
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                for (List list : arrayList3) {
                    so1.e stickerType = dVar.getStickerType();
                    if (stickerType != null) {
                        int i19 = p0.f153997a[stickerType.ordinal()];
                        if (i19 == i16) {
                            bVar2 = fs.b.BADGE;
                        } else if (i19 == 2) {
                            bVar2 = fs.b.DEVICE;
                        } else if (i19 == 3) {
                            bVar2 = fs.b.SLOGAN;
                        } else if (i19 == 4) {
                            bVar2 = fs.b.EVENT;
                        } else {
                            if (i19 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2 = fs.b.GENERAL;
                        }
                        bVar = bVar2;
                    } else {
                        bVar = null;
                    }
                    ArrayList<so1.c> arrayList5 = new ArrayList();
                    for (Object obj3 : list) {
                        String stickerUrl = ((so1.c) obj3).getStickerUrl();
                        if (stickerUrl != null && !d53.w.J(stickerUrl)) {
                            arrayList5.add(obj3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, i18));
                    for (so1.c cVar3 : arrayList5) {
                        arrayList6.add(new fs.g(cVar3.getStickerKey(), ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL) + "/" + cVar3.getStickerUrl()));
                        it = it;
                    }
                    arrayList4.add(new fs.e(bVar, 0, arrayList6, 0L, 0.0f, 0.0f, 56, null));
                    it = it;
                    i16 = 1;
                    i18 = 10;
                }
                p13.d0.v(arrayList, arrayList4);
                i16 = 1;
                it = it;
            }
            return new v2.b(arrayList, i17, httpUrl, null, 8, null);
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }
}
