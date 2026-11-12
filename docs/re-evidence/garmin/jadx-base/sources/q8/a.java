package q8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.p;
import p13.t0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f143291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f143292b;

    static {
        Map mapE = u0.e(new p("UNKNOWN", 0), new p("CHEST_STRAP", 7), new p("FITNESS_BAND", 6), new p("HEAD_MOUNTED", 5), new p("PHONE", 2), new p("RING", 4), new p("SCALE", 3), new p("SMART_DISPLAY", 8), new p("WATCH", 1));
        f143291a = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = t0.a(y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            p pVar = new p(entry.getValue(), entry.getKey());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        f143292b = linkedHashMap;
    }
}
