package hv;

import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lhv/b;", "", "", "jsonAnimation", "", "tutorialCaptions", "", "", "unUsedGroups", "pairingMarker", "Landroid/graphics/Bitmap;", "serverImages", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f85749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Integer> f85750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Bitmap> f85752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f85753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f85754g;

    /* JADX INFO: renamed from: hv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"hv/b$b", "Lcom/google/gson/reflect/TypeToken;", "", "Lhv/j;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1702b extends TypeToken<Collection<? extends j>> {
    }

    static {
        new a(null);
    }

    public b(String str, Map<String, String> map, List<Integer> list, String str2, Map<String, Bitmap> map2) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.f85748a = str;
        this.f85749b = map;
        this.f85750c = list;
        this.f85751d = str2;
        this.f85752e = map2;
        this.f85753f = new HashMap();
        this.f85754g = new HashMap();
        a2 a2Var = a2.BIC;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceAnimationHolder", "Generating list in extractAnimations()");
        JsonElement string = JsonParser.parseString(str);
        string.getClass();
        List list2 = (List) new Gson().fromJson(((JsonObject) string).get("markers"), new C1702b().getType());
        list2.getClass();
        ((j) h0.m0(list2)).getClass();
        List listS0 = h0.S0(list2, list2.size() - 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listS0) {
            String comment = ((j) obj).getComment();
            Integer numValueOf = Integer.valueOf(Integer.parseInt(comment != null ? new d53.k("\\D+").f(comment, "") : "-1"));
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f85753f = new LinkedHashMap(linkedHashMap);
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = (List) this.f85753f.remove(Integer.valueOf(iIntValue));
            if (list3 != null) {
                this.f85754g.put(Integer.valueOf(iIntValue), list3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f85748a, bVar.f85748a) && s.g(this.f85749b, bVar.f85749b) && s.g(this.f85750c, bVar.f85750c) && s.g(this.f85751d, bVar.f85751d) && s.g(this.f85752e, bVar.f85752e);
    }

    public final int hashCode() {
        int iB = u0.b(am.j.b(this.f85749b, this.f85748a.hashCode() * 31, 31), 31, this.f85750c);
        String str = this.f85751d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Bitmap> map = this.f85752e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceAnimationHolder(jsonAnimation=");
        sb3.append(this.f85748a);
        sb3.append(", tutorialCaptions=");
        sb3.append(this.f85749b);
        sb3.append(", unUsedGroups=");
        o2.c.n(", pairingMarker=", this.f85751d, ", serverImages=", sb3, this.f85750c);
        return am.j.s(sb3, this.f85752e, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhv/b$a;", "", "<init>", "()V", "", "MARKERS", "Ljava/lang/String;", "TAG", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, Map<String, String> map) {
        this(str, map, null, null, null, 28, null);
        str.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, Map<String, String> map, List<Integer> list) {
        this(str, map, list, null, null, 24, null);
        str.getClass();
        map.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, Map<String, String> map, List<Integer> list, String str2) {
        this(str, map, list, str2, null, 16, null);
        str.getClass();
        map.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(str, null, null, null, null, 30, null);
        str.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, Map map, List list, String str2, Map map2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(str, map, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : map2);
    }
}
