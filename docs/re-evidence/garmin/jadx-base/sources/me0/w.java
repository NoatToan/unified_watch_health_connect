package me0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme0/w;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f118065e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f118066a = o13.m.b(new ll0.b(22));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f118067b = o13.m.b(new ll0.b(23));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f118068c = o13.m.b(new ll0.b(24));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f118069d = o13.m.b(new ll0.b(25));

    public static final ke0.a a(w wVar) {
        return (ke0.a) wVar.f118067b.getValue();
    }

    public static final ke0.c b(w wVar) {
        return (ke0.c) wVar.f118066a.getValue();
    }

    public static Object d(w wVar, List list, v13.i iVar) {
        wVar.getClass();
        return f0.J(wVar, new l(wVar, null, null, list, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(je0.b bVar, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f117987c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f117987c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f117985a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f117987c;
        if (i15 == 0) {
            o13.r.b(objJ);
            b bVar2 = new b(this, bVar, null);
            aVar.f117987c = 1;
            objJ = f0.J(this, bVar2, aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return new v2.b(Boolean.TRUE, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(long j8, je0.b bVar, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f118048c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f118048c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        r rVar2 = rVar;
        Object objJ = rVar2.f118046a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f118048c;
        if (i15 == 0) {
            o13.r.b(objJ);
            s sVar = new s(this, j8, bVar, null);
            rVar2.f118048c = 1;
            objJ = f0.J(this, sVar, rVar2);
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
        if (v2Var instanceof v2.b) {
            return new v2.b(Boolean.TRUE, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }
}
