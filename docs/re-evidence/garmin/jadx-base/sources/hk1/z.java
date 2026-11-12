package hk1;

import com.garmin.android.apps.connectmobile.v2;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import lc.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class z {
    /* JADX WARN: Multi-variable type inference failed */
    public static final jk1.e a(v2<? extends y> v2Var) {
        t tVar;
        String strB;
        Object next;
        v2Var.getClass();
        if (v2Var instanceof v2.b) {
            y yVar = (y) ((v2.b) v2Var).f47386a;
            if (!(yVar instanceof y.b)) {
                if (yVar instanceof y.a) {
                    return new jk1.e(false, true, null, null, yVar, null, null, false, null, 492, null);
                }
                u0.r();
                return null;
            }
            y.b bVar = (y.b) yVar;
            s sVar = bVar.f84220a;
            r rVar = sVar.f84189a;
            i53.g gVarK = i53.a.k(sVar.f84190b);
            s92.g gVar = sVar.f84191c;
            return new jk1.e(false, false, null, rVar, bVar, gVarK, gVar != null ? new c(gVar.getHeadline(), gl1.d.y(gVar.b(), true), gl1.d.y(gVar.b(), false), gVar.getGrantButton(), gVar.getRejectButton()) : null, false, null, 390, null);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        t.a aVar = t.f84192e;
        v2.a aVar2 = (v2.a) v2Var;
        String str = aVar2.f47385c;
        aVar.getClass();
        if (str == null || d53.w.J(str)) {
            tVar = null;
        } else {
            try {
                tVar = (t) new Gson().fromJson(str, t.class);
            } catch (JsonSyntaxException unused) {
                tVar = null;
            }
        }
        if (tVar == null || (strB = tVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String()) == null) {
            strB = str;
        }
        if (p005kotlin.jvm.internal.s.g(strB, x.REGISTRATION_LIMIT_EXCEEDED.f84217a)) {
            return new jk1.e(false, true, null, null, new y.a(k.REGISTRATION_LIMIT_EXCEEDED, tVar != null ? tVar.getApplicationName() : null), null, null, false, null, 492, null);
        }
        l.f84163b.getClass();
        Iterator<T> it = l.f84171j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((l) next).f84172a, str));
        l lVar = (l) next;
        if (lVar == null) {
            Integer num = aVar2.f47384b;
            if (num != null && num.intValue() == 400) {
                lVar = l.UNAUTHORIZED_CLIENT;
            } else if (num != null && num.intValue() == 500) {
                lVar = l.SERVER_ERROR;
            } else {
                lVar = (num != null && num.intValue() == 503) ? l.TEMPORARILY_UNAVAILABLE : l.INVALID_REQUEST;
            }
        }
        return new jk1.e(false, true, lVar, null, new y.a(k.OAUTH_VERIFICATION_FAILED, tVar != null ? tVar.getApplicationName() : null), null, null, false, null, 488, null);
    }
}
