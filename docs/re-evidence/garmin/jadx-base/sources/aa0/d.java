package aa0;

import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import d53.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Laa0/d;", "", "", "jsonAnimation", "", "Lba0/a;", "markerData", "", "", "unusedGroups", "pairingMarker", "Landroid/graphics/Bitmap;", "serverImages", "", "revisitTutorialsAvailable", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Z)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2192h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, ba0.a> f2194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Bitmap> f2196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aa0.a f2198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f2199g;

    static {
        new a(null);
    }

    public d(String str, Map<String, ba0.a> map, List<Integer> list, String str2, Map<String, Bitmap> map2, boolean z14) {
        Integer numI;
        str.getClass();
        map.getClass();
        list.getClass();
        this.f2193a = str;
        this.f2194b = map;
        this.f2195c = str2;
        this.f2196d = map2;
        this.f2197e = z14;
        a2 a2Var = a2.BIC;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceAnimationHolder", "Generating list in extractAnimations()");
        i.f2211a.getClass();
        JsonElement string = JsonParser.parseString(str);
        string.getClass();
        List list2 = (List) i.f2213c.fromJson(((JsonObject) string).get("markers"), new h().getType());
        list2.getClass();
        int iD = ((hv.j) h0.m0(list2)).d();
        List listS0 = h0.S0(list2, list2.size() - 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listS0) {
            String comment = ((hv.j) obj).getComment();
            Integer numValueOf = Integer.valueOf((comment == null || (numI = t.i(i.f2212b.f(comment, ""))) == null) ? -1 : numI.intValue());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        aa0.a aVar = new aa0.a(new j(linkedHashMap, iD), list);
        this.f2198f = aVar;
        this.f2199g = new c(aVar);
    }

    public final ba0.a a(String str) {
        ba0.a aVar = this.f2194b.get(str);
        return aVar == null ? new ba0.a("", null) : aVar;
    }

    public final List<hv.j> b(int i14) {
        List<hv.j> listA = this.f2199g.f2190a.a(i14);
        if (listA != null) {
            return listA;
        }
        a2 a2Var = a2.BIC;
        String strH = am.j.h(i14, "invalid group index ");
        i2.f36769a.getClass();
        i2.a.f(a2Var, "AnimationNavigator", strH);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laa0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, Map map, List list, String str2, Map map2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(str, map, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : map2, (i14 & 32) != 0 ? false : z14);
    }
}
