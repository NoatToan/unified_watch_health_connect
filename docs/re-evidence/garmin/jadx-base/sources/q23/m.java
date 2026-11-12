package q23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.p;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;
import p43.d2;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f142348a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<x33.f> f142349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<x33.f> f142350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<x33.b, x33.b> f142351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap<x33.b, x33.b> f142352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f142353f;

    static {
        l[] lVarArrValues = l.values();
        ArrayList arrayList = new ArrayList(lVarArrValues.length);
        for (l lVar : lVarArrValues) {
            arrayList.add(lVar.f142346b);
        }
        f142349b = h0.g1(arrayList);
        k[] kVarArrValues = k.values();
        ArrayList arrayList2 = new ArrayList(kVarArrValues.length);
        for (k kVar : kVarArrValues) {
            arrayList2.add(kVar.f142343a);
        }
        f142350c = h0.g1(arrayList2);
        f142351d = new HashMap<>();
        f142352e = new HashMap<>();
        u0.d(new p(k.UBYTEARRAY, x33.f.e("ubyteArrayOf")), new p(k.USHORTARRAY, x33.f.e("ushortArrayOf")), new p(k.UINTARRAY, x33.f.e("uintArrayOf")), new p(k.ULONGARRAY, x33.f.e("ulongArrayOf")));
        l[] lVarArrValues2 = l.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l lVar2 : lVarArrValues2) {
            linkedHashSet.add(lVar2.f142347c.f());
        }
        f142353f = linkedHashSet;
        for (l lVar3 : l.values()) {
            HashMap<x33.b, x33.b> map = f142351d;
            x33.b bVar = lVar3.f142347c;
            x33.b bVar2 = lVar3.f142345a;
            map.put(bVar, bVar2);
            f142352e.put(bVar2, lVar3.f142347c);
        }
    }

    private m() {
    }

    public static final boolean a(n0 n0Var) {
        t23.h hVarT;
        if (d2.o(n0Var) || (hVarT = n0Var.F0().t()) == null) {
            return false;
        }
        f142348a.getClass();
        t23.l lVarD = hVarT.d();
        return (lVarD instanceof t23.h0) && s.g(((t23.h0) lVarD).c(), p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l) && f142349b.contains(hVarT.getName());
    }
}
