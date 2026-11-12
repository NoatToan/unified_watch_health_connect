package ip;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.p;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p13.t0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lip/i;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i implements f0 {
    public static q.b a(v2.a aVar) {
        String str = aVar.f47385c;
        try {
            PrivacyUpdateRequestError privacyUpdateRequestError = (PrivacyUpdateRequestError) new Gson().fromJson(str, PrivacyUpdateRequestError.class);
            if (privacyUpdateRequestError != null) {
                int i14 = q.f128596b;
                return new q.b(privacyUpdateRequestError);
            }
            int i15 = q.f128596b;
            return new q.b(new PrivacyUpdateRequestError(PrivacyUpdateRequestError.UNKNOWN, str == null ? "Unknown error" : str, null, 4, null));
        } catch (JsonSyntaxException unused) {
            int i16 = q.f128596b;
            return new q.b(new PrivacyUpdateRequestError(PrivacyUpdateRequestError.UNKNOWN, str == null ? "Unknown error" : str, null, 4, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f94655c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f94655c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f94653a;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f94655c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(obj);
                return ((q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        Map mapB = t0.b(new p(x0.f4304m.f4358a, str));
        gVar.f94655c = 1;
        Serializable serializableC = c(mapB, gVar);
        return serializableC == serializable ? serializable : serializableC;
    }

    public abstract Serializable c(Map map, v13.c cVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, v13.c cVar) {
        h hVar;
        String categoryAccessRule;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f94658c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f94658c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f94656a;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f94658c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(obj);
                return ((q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String str = aVar.f94639a.f4358a;
            PrivacyType privacyType = aVar.f94640b;
            if (privacyType == null || (categoryAccessRule = privacyType.getCategoryAccessRule()) == null) {
                categoryAccessRule = PrivacyType.ONLY_ME.getCategoryAccessRule();
            }
            arrayList.add(new p(str, categoryAccessRule));
        }
        Map mapL = u0.l(arrayList);
        hVar.f94658c = 1;
        Serializable serializableC = c(mapL, hVar);
        return serializableC == serializable ? serializable : serializableC;
    }
}
