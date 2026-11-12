package fl1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import lc.u0;
import o13.q;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfl1/f;", "", "<init>", "()V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(long j8, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f72001c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f72001c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objG = eVar.f71999a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f72001c;
        if (i15 == 0) {
            r.b(objG);
            f12.l.f68084a.getClass();
            if (!f12.l.a.a().B3()) {
                int i16 = q.f128596b;
                return Boolean.FALSE;
            }
            pc0.j jVar = (pc0.j) KoinJavaComponent.get$default(pc0.j.class, null, null, 6, null);
            String strValueOf = String.valueOf(j8);
            eVar.f72001c = 1;
            objG = jVar.g(strValueOf, eVar);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objG);
        }
        v2 v2Var = (v2) objG;
        if (v2Var instanceof v2.b) {
            int i17 = q.f128596b;
            return Boolean.valueOf(s.g(((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getWheelchairCapable(), Boolean.TRUE));
        }
        if (v2Var instanceof v2.a) {
            int i18 = q.f128596b;
            return r.a(((v2.a) v2Var).f47383a);
        }
        u0.r();
        return null;
    }
}
