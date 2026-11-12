package kd0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/n2;", "Luu0/e;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n2 implements uu0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f104242a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uu0.e
    public final Serializable a(v13.c cVar) {
        k2 k2Var;
        if (cVar instanceof k2) {
            k2Var = (k2) cVar;
            int i14 = k2Var.f104168c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k2Var.f104168c = i14 - Integer.MIN_VALUE;
            } else {
                k2Var = new k2(this, cVar);
            }
        } else {
            k2Var = new k2(this, cVar);
        }
        Object objE0 = k2Var.f104166a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k2Var.f104168c;
        if (i15 == 0) {
            o13.r.b(objE0);
            List listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            k2Var.f104168c = 1;
            objE0 = ei0.d.E0(this.f104242a, listC, k2Var, 6);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objE0;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        Iterable<hi0.a> iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        for (hi0.a aVar2 : iterable) {
            String strValueOf = String.valueOf(aVar2.getUserId());
            String fullName = aVar2.getFullName();
            if (fullName == null && (fullName = aVar2.getDisplayName()) == null) {
                fullName = "";
            }
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = aVar2.getProfileImageUrls();
            arrayList.add(new pu0.a(strValueOf, fullName, profileImageUrls != null ? profileImageUrls.f46879h : null, null, 8, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uu0.e
    public final Serializable b(v13.c cVar) {
        l2 l2Var;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i14 = l2Var.f104207c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l2Var.f104207c = i14 - Integer.MIN_VALUE;
            } else {
                l2Var = new l2(this, cVar);
            }
        } else {
            l2Var = new l2(this, cVar);
        }
        Object objL2 = l2Var.f104205a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l2Var.f104207c;
        if (i15 == 0) {
            o13.r.b(objL2);
            p13.j0 j0Var = p13.j0.f134944a;
            l2Var.f104207c = 1;
            objL2 = this.f104242a.l2(j0Var, l2Var);
            if (objL2 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL2);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objL2;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        Iterable iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((hi0.a) it.next()).getUserId()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uu0.e
    public final Object c(List list, List list2, v13.c cVar) {
        m2 m2Var;
        if (cVar instanceof m2) {
            m2Var = (m2) cVar;
            int i14 = m2Var.f104224c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m2Var.f104224c = i14 - Integer.MIN_VALUE;
            } else {
                m2Var = new m2(this, cVar);
            }
        } else {
            m2Var = new m2(this, cVar);
        }
        Object objA = m2Var.f104222a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m2Var.f104224c;
        if (i15 == 0) {
            o13.r.b(objA);
            m2Var.f104224c = 1;
            objA = this.f104242a.A(list, list2, m2Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            return (Boolean) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            return null;
        }
        lc.u0.r();
        return null;
    }
}
