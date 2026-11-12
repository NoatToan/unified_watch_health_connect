package oi1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loi1/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Loi1/f;", "api", "<init>", "(Loi1/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f132269a;

    public e(f fVar) {
        fVar.getClass();
        this.f132269a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f132259c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f132259c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f132257a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f132259c;
        if (i15 == 0) {
            r.b(objJ);
            b bVar = new b(this, str, null);
            aVar.f132259c = 1;
            objJ = f0.J(this, bVar, aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            int i16 = q.f128596b;
            return Unit.INSTANCE;
        }
        if (v2Var instanceof v2.a) {
            int i17 = q.f128596b;
            return new q.b(new Exception(((v2.a) v2Var).f47385c));
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f132265c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f132265c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f132263a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f132265c;
        if (i15 == 0) {
            r.b(objJ);
            d dVar = new d(this, str, null);
            cVar2.f132265c = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            int i16 = q.f128596b;
            return Unit.INSTANCE;
        }
        if (v2Var instanceof v2.a) {
            int i17 = q.f128596b;
            return new q.b(new Exception(((v2.a) v2Var).f47385c));
        }
        u0.r();
        return null;
    }
}
