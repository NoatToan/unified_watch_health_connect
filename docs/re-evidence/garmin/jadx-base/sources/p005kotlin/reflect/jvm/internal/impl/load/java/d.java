package p005kotlin.reflect.jvm.internal.impl.load.java;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import o13.p;
import p005kotlin.jvm.internal.j;
import p13.c1;
import p13.h0;
import p13.t0;
import p13.u;
import p13.u0;
import p13.y;
import q33.e0;
import wr.g;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105904a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f105905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f105906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f105907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f105908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<f> f105909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<String> f105910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a.C2039a f105911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f105912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f105913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashSet f105914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f105915l;

    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        b(String str, boolean z14) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM0 = u.m0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(y.r(setM0, 10));
        for (String str : setM0) {
            a aVar = f105904a;
            String strC = g43.d.BOOLEAN.c();
            strC.getClass();
            arrayList.add(a.a(aVar, "java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f105905b = arrayList;
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C2039a) it.next()).f105920e);
        }
        f105906c = arrayList2;
        ArrayList arrayList3 = f105905b;
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C2039a) it3.next()).f105917b.b());
        }
        e0 e0Var = e0.f142457a;
        a aVar2 = f105904a;
        e0Var.getClass();
        String strConcat = "java/util/".concat("Collection");
        g43.d dVar = g43.d.BOOLEAN;
        String strC2 = dVar.c();
        strC2.getClass();
        a.C2039a c2039aA = a.a(aVar2, strConcat, "contains", "Ljava/lang/Object;", strC2);
        c cVar = c.f105927d;
        p pVar = new p(c2039aA, cVar);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = dVar.c();
        strC3.getClass();
        p pVar2 = new p(a.a(aVar2, strConcat2, "remove", "Ljava/lang/Object;", strC3), cVar);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = dVar.c();
        strC4.getClass();
        p pVar3 = new p(a.a(aVar2, strConcat3, "containsKey", "Ljava/lang/Object;", strC4), cVar);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = dVar.c();
        strC5.getClass();
        p pVar4 = new p(a.a(aVar2, strConcat4, "containsValue", "Ljava/lang/Object;", strC5), cVar);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = dVar.c();
        strC6.getClass();
        p pVar5 = new p(a.a(aVar2, strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), cVar);
        p pVar6 = new p(a.a(aVar2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f105928e);
        a.C2039a c2039aA2 = a.a(aVar2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f105925b;
        p pVar7 = new p(c2039aA2, cVar2);
        p pVar8 = new p(a.a(aVar2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strConcat6 = "java/util/".concat("List");
        g43.d dVar2 = g43.d.INT;
        String strC7 = dVar2.c();
        strC7.getClass();
        a.C2039a c2039aA3 = a.a(aVar2, strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        c cVar3 = c.f105926c;
        p pVar9 = new p(c2039aA3, cVar3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = dVar2.c();
        strC8.getClass();
        Map mapE = u0.e(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, new p(a.a(aVar2, strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), cVar3));
        f105907d = mapE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(mapE.size()));
        for (Map.Entry entry : mapE.entrySet()) {
            linkedHashMap.put(((a.C2039a) entry.getKey()).f105920e, entry.getValue());
        }
        f105908e = linkedHashMap;
        LinkedHashSet linkedHashSetH = c1.h(f105907d.keySet(), f105905b);
        ArrayList arrayList5 = new ArrayList(y.r(linkedHashSetH, 10));
        Iterator it4 = linkedHashSetH.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C2039a) it4.next()).f105917b);
        }
        f105909f = h0.g1(arrayList5);
        ArrayList arrayList6 = new ArrayList(y.r(linkedHashSetH, 10));
        Iterator it5 = linkedHashSetH.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C2039a) it5.next()).f105920e);
        }
        f105910g = h0.g1(arrayList6);
        a aVar3 = f105904a;
        g43.d dVar3 = g43.d.INT;
        String strC9 = dVar3.c();
        strC9.getClass();
        a.C2039a c2039aA4 = a.a(aVar3, "java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f105911h = c2039aA4;
        e0.f142457a.getClass();
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = g43.d.BYTE.c();
        strC10.getClass();
        p pVar10 = new p(a.a(aVar3, strConcat8, "toByte", "", strC10), f.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = g43.d.SHORT.c();
        strC11.getClass();
        p pVar11 = new p(a.a(aVar3, strConcat9, "toShort", "", strC11), f.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = dVar3.c();
        strC12.getClass();
        p pVar12 = new p(a.a(aVar3, strConcat10, "toInt", "", strC12), f.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = g43.d.LONG.c();
        strC13.getClass();
        p pVar13 = new p(a.a(aVar3, strConcat11, "toLong", "", strC13), f.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = g43.d.FLOAT.c();
        strC14.getClass();
        p pVar14 = new p(a.a(aVar3, strConcat12, "toFloat", "", strC14), f.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = g43.d.DOUBLE.c();
        strC15.getClass();
        p pVar15 = new p(a.a(aVar3, strConcat13, "toDouble", "", strC15), f.e("doubleValue"));
        p pVar16 = new p(c2039aA4, f.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = dVar3.c();
        strC16.getClass();
        String strC17 = g43.d.CHAR.c();
        strC17.getClass();
        Map mapE2 = u0.e(pVar10, pVar11, pVar12, pVar13, pVar14, pVar15, pVar16, new p(a.a(aVar3, strConcat14, "get", strC16, strC17), f.e("charAt")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), f.e("getAndAdd")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), f.e("addAndGet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), f.e("getAndAdd")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), f.e("addAndGet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), f.e("compareAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), f.e("getAndAdd")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), f.e("addAndGet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), f.e("compareAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), f.e("getAndAdd")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), f.e("addAndGet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), f.e("get")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), f.e("set")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), f.e("getAndSet")), new p(a.a(aVar3, "java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), f.e("compareAndSet")));
        f105912i = mapE2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(mapE2.size()));
        for (Map.Entry entry2 : mapE2.entrySet()) {
            linkedHashMap2.put(((a.C2039a) entry2.getKey()).f105920e, entry2.getValue());
        }
        f105913j = linkedHashMap2;
        ?? r14 = f105912i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r14.entrySet()) {
            a.C2039a c2039a = (a.C2039a) entry3.getKey();
            f fVar = (f) entry3.getValue();
            String str2 = c2039a.f105916a;
            String str3 = c2039a.f105918c;
            String str4 = c2039a.f105919d;
            fVar.getClass();
            linkedHashSet.add(new a.C2039a(str2, fVar, str3, str4).f105920e);
        }
        Set setKeySet = f105912i.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((a.C2039a) it6.next()).f105917b);
        }
        f105914k = hashSet;
        Set<Map.Entry> setEntrySet = f105912i.entrySet();
        ArrayList<p> arrayList7 = new ArrayList(y.r(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new p(((a.C2039a) entry4.getKey()).f105917b, entry4.getValue()));
        }
        int iA = t0.a(y.r(arrayList7, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (p pVar17 : arrayList7) {
            linkedHashMap3.put((f) pVar17.f128595b, (f) pVar17.f128594a);
        }
        f105915l = linkedHashMap3;
    }

    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.d$a$a, reason: collision with other inner class name */
        public static final class C2039a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f105917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105918c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f105919d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f105920e;

            public C2039a(String str, f fVar, String str2, String str3) {
                str.getClass();
                fVar.getClass();
                str2.getClass();
                str3.getClass();
                this.f105916a = str;
                this.f105917b = fVar;
                this.f105918c = str2;
                this.f105919d = str3;
                e0 e0Var = e0.f142457a;
                String str4 = fVar + CoreConstants.LEFT_PARENTHESIS_CHAR + str2 + CoreConstants.RIGHT_PARENTHESIS_CHAR + str3;
                e0Var.getClass();
                this.f105920e = e0.e(str, str4);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2039a)) {
                    return false;
                }
                C2039a c2039a = (C2039a) obj;
                return this.f105916a.equals(c2039a.f105916a) && this.f105917b.equals(c2039a.f105917b) && this.f105918c.equals(c2039a.f105918c) && this.f105919d.equals(c2039a.f105919d);
            }

            public final int hashCode() {
                return this.f105919d.hashCode() + g.j((this.f105917b.hashCode() + (this.f105916a.hashCode() * 31)) * 31, 31, this.f105918c);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("NameAndSignature(classInternalName=");
                sb3.append(this.f105916a);
                sb3.append(", name=");
                sb3.append(this.f105917b);
                sb3.append(", parameters=");
                sb3.append(this.f105918c);
                sb3.append(", returnType=");
                return a0.m(sb3, this.f105919d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static final C2039a a(a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            return new C2039a(str, f.e(str2), str3, str4);
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f105925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f105926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f105927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f105928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c[] f105929f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f105930a;

        public static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(String str, int i14) {
                j jVar = null;
                super(str, i14, jVar, jVar);
            }
        }

        static {
            c cVar = new c(ActionConst.NULL, 0, null);
            f105925b = cVar;
            c cVar2 = new c("INDEX", 1, -1);
            f105926c = cVar2;
            c cVar3 = new c("FALSE", 2, Boolean.FALSE);
            f105927d = cVar3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3);
            f105928e = aVar;
            f105929f = new c[]{cVar, cVar2, cVar3, aVar};
        }

        private c(String str, int i14, Object obj) {
            super(str, i14);
            this.f105930a = obj;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f105929f.clone();
        }

        public /* synthetic */ c(String str, int i14, Object obj, j jVar) {
            this(str, i14, obj);
        }
    }
}
