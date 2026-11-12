package uh2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"Luh2/b;", "Lni2/a;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements ni2.a<HashMap<String, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.androiddynamicsettings.app.presentationlayer.b f171148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f171149b;

    public b(com.garmin.androiddynamicsettings.app.presentationlayer.b bVar, a aVar) {
        this.f171148a = bVar;
        this.f171149b = aVar;
    }

    @Override // ni2.a
    public final void a() {
        this.f171148a.hideProgressOverlay();
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        this.f171148a.hideProgressOverlay();
    }

    @Override // ni2.a
    public final void onSuccess(HashMap<String, Object> map) {
        List<Map> list;
        Integer numValueOf;
        HashMap<String, Object> map2 = map;
        map2.getClass();
        this.f171148a.hideProgressOverlay();
        if (map2.isEmpty()) {
            return;
        }
        a aVar = this.f171149b;
        sh2.b bVar = aVar.f171144f;
        Object obj = map2.get("controlsMenuReset");
        Unit unit = null;
        if (obj != null) {
            if (!(obj instanceof List)) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        bVar.getClass();
        ArrayList<sh2.a> arrayList = new ArrayList<>();
        if (list != null) {
            for (Map map3 : list) {
                Object obj2 = map3.get(TtmlNode.ATTR_ID);
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Object obj3 = map3.get(FirebaseAnalytics.Param.INDEX);
                if (obj3 != null) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String string = obj3.toString();
                    c1658a.getClass();
                    numValueOf = Integer.valueOf(hi2.a.C1658a.h(string));
                } else {
                    numValueOf = null;
                }
                Object obj4 = map3.get("required");
                if (!(obj4 instanceof Boolean)) {
                    obj4 = null;
                }
                arrayList.add(new sh2.a(str2, numValueOf, (Boolean) obj4, null, null, 24, null));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            bVar.f159313b.b("resetToDefaultsAPIResponse: controls reset list empty");
        }
        ArrayList<sh2.a> arrayListY4 = aVar.y4(bVar.a(arrayList));
        aVar.f171142d.m(Boolean.FALSE);
        aVar.f171140b.m(arrayListY4);
        aVar.f171141c.m(aVar.x4());
    }
}
