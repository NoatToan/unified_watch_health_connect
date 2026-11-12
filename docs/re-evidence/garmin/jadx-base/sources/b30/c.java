package b30;

import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb30/c;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    public static n30.f a(n30.f fVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar = fVar.f123456d;
        if (aVar == null || (eVar = aVar.f181476a) == null) {
            return fVar;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
        n30.g gVarB = fVar.b();
        gl1.d.j(gVarB != null ? gVarB.f123468c : false, eVar, new b(eVar2, 0), new b(eVar2, 1));
        n30.g gVarB2 = fVar.b();
        n30.g gVarA = gVarB2 != null ? n30.g.a(gVarB2, eVar2.j(), false, null, 13) : null;
        List listD0 = fVar.f123458f;
        if (gVarA != null) {
            listD0 = h0.D0(h0.V(1, listD0), gVarA);
        }
        return n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar2, null, null, null, null, 62), listD0, null, 0, false, null, null, 2007);
    }
}
