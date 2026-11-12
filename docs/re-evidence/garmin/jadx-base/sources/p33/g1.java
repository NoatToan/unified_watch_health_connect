package p33;

import ch.qos.logback.core.pattern.parser.Parser;
import com.mapbox.common.HttpHeaders;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f135439a = new j(m.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f135440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f135441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f135442d;

    static {
        m mVar = m.NOT_NULL;
        f135440b = new j(mVar, null, false, false, 8, null);
        f135441c = new j(mVar, null, true, false, 8, null);
        q33.e0 e0Var = q33.e0.f142457a;
        e0Var.getClass();
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        o1 o1Var = new o1();
        new o1.a(o1Var, "java/util/".concat("Iterator")).a("forEachRemaining", null, new o(strConcat4));
        new o1.a(o1Var, "java/lang/".concat("Iterable")).a("spliterator", null, new z(e0Var));
        o1.a aVar = new o1.a(o1Var, "java/util/".concat("Collection"));
        aVar.a("removeIf", null, new k0(strConcat2));
        aVar.a("stream", null, new v0(strConcat8));
        aVar.a("parallelStream", null, new a1(strConcat8));
        o1.a aVar2 = new o1.a(o1Var, "java/util/".concat("List"));
        aVar2.a("replaceAll", null, new b1(strConcat7));
        aVar2.a("addFirst", "2.1", new c1(strConcat));
        aVar2.a("addLast", "2.1", new d1(strConcat));
        aVar2.a("removeFirst", "2.1", new e1(strConcat));
        aVar2.a("removeLast", "2.1", new f1(strConcat));
        o1.a aVar3 = new o1.a(o1Var, "java/util/".concat("LinkedList"));
        aVar3.a("addFirst", "2.1", new p(strConcat));
        aVar3.a("addLast", "2.1", new q(strConcat));
        aVar3.a("removeFirst", "2.1", new r(strConcat));
        aVar3.a("removeLast", "2.1", new s(strConcat));
        o1.a aVar4 = new o1.a(o1Var, "java/util/".concat("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new t(strConcat));
        aVar4.a("addLast", "2.2", new u(strConcat));
        aVar4.a("removeFirst", "2.2", new v(strConcat));
        aVar4.a("removeLast", "2.2", new w(strConcat));
        aVar4.a("getFirst", "2.2", new x(strConcat));
        aVar4.a("getLast", "2.2", new y(strConcat));
        o1.a aVar5 = new o1.a(o1Var, "java/util/".concat("Map"));
        aVar5.a("forEach", null, new a0(strConcat6));
        aVar5.a("putIfAbsent", null, new b0(strConcat));
        aVar5.a(Parser.REPLACE_CONVERTER_WORD, null, new c0(strConcat));
        aVar5.a(Parser.REPLACE_CONVERTER_WORD, null, new d0(strConcat));
        aVar5.a("replaceAll", null, new e0(strConcat5));
        aVar5.a("compute", null, new f0(strConcat, strConcat5));
        aVar5.a("computeIfAbsent", null, new g0(strConcat, strConcat3));
        aVar5.a("computeIfPresent", null, new h0(strConcat, strConcat5));
        aVar5.a("merge", null, new i0(strConcat, strConcat5));
        o1.a aVar6 = new o1.a(o1Var, "java/util/".concat("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new j0(strConcat));
        aVar6.a("putLast", "2.2", new l0(strConcat));
        o1.a aVar7 = new o1.a(o1Var, strConcat9);
        aVar7.a("empty", null, new m0(strConcat9));
        aVar7.a("of", null, new n0(strConcat, strConcat9));
        aVar7.a("ofNullable", null, new o0(strConcat, strConcat9));
        aVar7.a("get", null, new p0(strConcat));
        aVar7.a("ifPresent", null, new q0(strConcat4));
        new o1.a(o1Var, "java/lang/".concat("ref/Reference")).a("get", null, new r0(strConcat));
        new o1.a(o1Var, strConcat2).a("test", null, new s0(strConcat));
        new o1.a(o1Var, "java/util/function/".concat("BiPredicate")).a("test", null, new t0(strConcat));
        new o1.a(o1Var, strConcat4).a(HttpHeaders.ACCEPT, null, new u0(strConcat));
        new o1.a(o1Var, strConcat6).a(HttpHeaders.ACCEPT, null, new w0(strConcat));
        new o1.a(o1Var, strConcat3).a("apply", null, new x0(strConcat));
        new o1.a(o1Var, strConcat5).a("apply", null, new y0(strConcat));
        new o1.a(o1Var, "java/util/function/".concat("Supplier")).a("get", null, new z0(strConcat));
        f135442d = o1Var.f135488a;
    }
}
