package h33;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p13.t0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f81462a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f81463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f81464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<x33.c> f81465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<x33.f> f81466e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    static {
        x33.d dVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105885k;
        o13.p pVar = new o13.p(dVar.a(x33.f.e("name")).i(), p005kotlin.reflect.jvm.internal.impl.builtins.f.f105852d);
        o13.p pVar2 = new o13.p(dVar.a(x33.f.e("ordinal")).i(), x33.f.e("ordinal"));
        o13.p pVar3 = new o13.p(gl1.y.h("size", kotlin.reflect.jvm.internal.impl.builtins.f.a.D), x33.f.e("size"));
        x33.c cVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.H;
        Map mapE = u0.e(pVar, pVar2, pVar3, new o13.p(gl1.y.h("size", cVar), x33.f.e("size")), new o13.p(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105877f.a(x33.f.e("length")).i(), x33.f.e("length")), new o13.p(gl1.y.h(UserMetadata.KEYDATA_FILENAME, cVar), x33.f.e("keySet")), new o13.p(gl1.y.h("values", cVar), x33.f.e("values")), new o13.p(gl1.y.h(RemoteConfigConstants.ResponseFieldKey.ENTRIES, cVar), x33.f.e("entrySet")), new o13.p(gl1.y.h("size", kotlin.reflect.jvm.internal.impl.builtins.f.a.f105870b0), x33.f.e("length")), new o13.p(gl1.y.h("size", kotlin.reflect.jvm.internal.impl.builtins.f.a.f105872c0), x33.f.e("length")), new o13.p(gl1.y.h("size", kotlin.reflect.jvm.internal.impl.builtins.f.a.f105874d0), x33.f.e("length")));
        f81463b = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        ArrayList<o13.p> arrayList = new ArrayList(p13.y.r(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new o13.p(((x33.c) entry.getKey()).f188596a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (o13.p pVar4 : arrayList) {
            x33.f fVar = (x33.f) pVar4.f128595b;
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((x33.f) pVar4.f128594a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), p13.h0.T((Iterable) entry2.getValue()));
        }
        f81464c = linkedHashMap2;
        ?? r14 = f81463b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r14.entrySet()) {
            s23.c cVar2 = s23.c.f156232a;
            x33.d dVar2 = ((x33.c) entry3.getKey()).b().f188596a;
            cVar2.getClass();
            x33.b bVarF = s23.c.f(dVar2);
            bVarF.getClass();
            linkedHashSet.add(bVarF.a().a((x33.f) entry3.getValue()));
        }
        Set<x33.c> setKeySet = f81463b.keySet();
        f81465d = setKeySet;
        Set<x33.c> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(p13.y.r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((x33.c) it.next()).f188596a.g());
        }
        f81466e = p13.h0.g1(arrayList3);
    }

    private h() {
    }
}
