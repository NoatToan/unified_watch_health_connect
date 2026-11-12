package a30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;
import p13.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La30/e;", "La30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk.d f913a;

    public e() {
        zk.c cVar = zk.c.f205034a;
        List listC = w.c("FIREBASE");
        cVar.getClass();
        this.f913a = new zk.d(cVar, null, listC);
    }

    @Override // a30.a
    public final void a(c cVar, b bVar) {
        String str;
        List<b.EnumC0008b> list = bVar.f901d;
        cVar.getClass();
        LinkedHashMap linkedHashMapF = u0.f(new p("courseActivityType", bVar.f898a.f4358a), new p("coursePrivacyLevel", bVar.f899b ? "Public" : "Private"), new p("courseDistanceInMeters", Double.valueOf(bVar.f900c)), new p("date", bVar.f902e));
        if (!list.isEmpty()) {
            linkedHashMapF.put("propertiesUsed", h0.k0(list, ",", null, null, null, 62));
        }
        if (cVar instanceof c.a) {
            str = ((c.a) cVar).f908b;
        } else if (cVar instanceof c.d) {
            str = ((c.d) cVar).f911b;
        } else {
            str = cVar instanceof c.C0009c ? ((c.C0009c) cVar).f910b : null;
        }
        if (str != null) {
            linkedHashMapF.put("errorMessage", str);
        }
        String str2 = cVar.f907a;
        ArrayList arrayList = new ArrayList(linkedHashMapF.size());
        for (Map.Entry entry : linkedHashMapF.entrySet()) {
            arrayList.add(new zk.e((String) entry.getKey(), entry.getValue()));
        }
        this.f913a.a(new zk.a(str2, arrayList, false, 0L, 12, null));
    }
}
