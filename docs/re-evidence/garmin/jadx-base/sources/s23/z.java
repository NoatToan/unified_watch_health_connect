package s23;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p13.c1;
import p13.d0;
import q33.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f156309a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f156310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f156311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f156312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f156313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f156314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f156315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f156316h;

    static {
        e0.f142457a.getClass();
        f156310b = c1.i(e0.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        List<g43.d> listK = p13.x.k(g43.d.BOOLEAN, g43.d.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g43.d dVar : listK) {
            x33.c cVar = dVar.f75869d;
            if (cVar == null) {
                g43.d.a(15);
                throw null;
            }
            String strB = cVar.f188596a.g().b();
            strB.getClass();
            StringBuilder sb3 = new StringBuilder();
            String str = dVar.f75867b;
            if (str == null) {
                g43.d.a(13);
                throw null;
            }
            sb3.append(str);
            sb3.append("Value()");
            sb3.append(dVar.c());
            d0.v(linkedHashSet, e0.c(strB, sb3.toString()));
        }
        f156311c = c1.h(c1.h(c1.h(c1.h(c1.h(c1.h(linkedHashSet, e0.d("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), e0.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), e0.c("Double", "isInfinite()Z", "isNaN()Z")), e0.c("Float", "isInfinite()Z", "isNaN()Z")), e0.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), e0.c("CharSequence", "isEmpty()Z"));
        e0.f142457a.getClass();
        f156312d = e0.d("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f156313e = c1.h(c1.h(c1.h(c1.h(c1.h(c1.h(e0.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), e0.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), e0.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), e0.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), e0.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), e0.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), e0.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f156314f = c1.h(c1.h(e0.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), e0.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), e0.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f156309a.getClass();
        g43.d dVar2 = g43.d.BOOLEAN;
        g43.d dVar3 = g43.d.BYTE;
        List listK2 = p13.x.k(dVar2, dVar3, g43.d.DOUBLE, g43.d.FLOAT, dVar3, g43.d.INT, g43.d.LONG, g43.d.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listK2.iterator();
        while (it.hasNext()) {
            x33.c cVar2 = ((g43.d) it.next()).f75869d;
            if (cVar2 == null) {
                g43.d.a(15);
                throw null;
            }
            String strB2 = cVar2.f188596a.g().b();
            strB2.getClass();
            String[] strArrA = e0.a("Ljava/lang/String;");
            d0.v(linkedHashSet2, e0.c(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = e0.a("D");
        LinkedHashSet linkedHashSetH = c1.h(linkedHashSet2, e0.c("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = e0.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f156315g = c1.h(linkedHashSetH, e0.c("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        e0.f142457a.getClass();
        String[] strArrA4 = e0.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f156316h = e0.c("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }

    private z() {
    }
}
