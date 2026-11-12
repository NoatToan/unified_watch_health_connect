package py1;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import fg0.e;
import fg0.l;
import j70.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n70.o;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.u;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpy1/c;", "Ln70/o;", "Lfg0/l;", "Lj70/d;", "Lo70/a;", "eventsData", "<init>", "(Lj70/d;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends o<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<o70.a> f141876a;

    public c(d<o70.a> dVar) {
        dVar.getClass();
        this.f141876a = dVar;
    }

    @Override // n70.o
    public final ArrayList c() {
        List list;
        d<o70.a> dVar = this.f141876a;
        o70.a aVar = dVar.f97521b;
        if (aVar == null || (list = aVar.f129910a) == null) {
            list = j0.f134944a;
        }
        String str = (String) h0.e0(0, list);
        List<e> listI0 = str == null ? null : u.i0((Object[]) GsonUtil.f47253b.fromJson(str, e[].class));
        if (listI0 == null) {
            listI0 = j0.f134944a;
        }
        String str2 = (String) h0.e0(1, list);
        Map map = str2 == null ? null : (Map) GsonUtil.f47253b.fromJson(str2, new b().getType());
        String str3 = (String) h0.e0(2, list);
        Map map2 = str3 == null ? null : (Map) GsonUtil.f47253b.fromJson(str3, new a().getType());
        ArrayList arrayList = new ArrayList(y.r(listI0, 10));
        for (e eVar : listI0) {
            arrayList.add(new l(eVar, map != null ? (String) map.get(eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null, map2 != null ? (h42.a) map2.get(eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null));
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d(dVar.f97520a, (l) it.next()));
        }
        return arrayList2;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.EVENT;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetActivitiesAndWorkoutsEventsDataUseCase";
    }
}
