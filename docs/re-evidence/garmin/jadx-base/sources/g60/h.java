package g60;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg60/h;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lg60/c;", "Lg60/a;", "api", "<init>", "(Lg60/a;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements f0, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f76049a;

    public h(a aVar) {
        aVar.getClass();
        this.f76049a = aVar;
    }

    @Override // g60.c
    public final Object a(b bVar, xh1.c.b bVar2) {
        return f0.J(this, new g(this, bVar, null), bVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // g60.c
    @o13.e
    public final Object b(DateTime dateTime, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f76042c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f76042c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f76040a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f76042c;
        if (i15 == 0) {
            r.b(objJ);
            f fVar = new f(this, dateTime, null);
            eVar.f76042c = 1;
            objJ = f0.J(this, fVar, eVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (!(bVar.f47386a instanceof b)) {
                return new v2.b(new b(null, null, null, null, null), bVar.f47387b, null, null, 12, null);
            }
        }
        return v2Var;
    }
}
