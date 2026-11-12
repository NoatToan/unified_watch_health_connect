package v52;

import java.util.ArrayList;
import l52.i;
import l52.o;
import o13.p;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv52/b;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    public static p a(i iVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        iVar.getClass();
        if (cVar == null) {
            j0 j0Var = j0.f134944a;
            return new p(j0Var, j0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o.a(iVar, l52.h.PRE_ORDER, new p62.e(cVar, 13, arrayList, arrayList2));
        return new p(arrayList, arrayList2);
    }
}
