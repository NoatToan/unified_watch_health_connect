package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2487:1\n130#1,2:2488\n221#1,5:2490\n507#1,5:2496\n507#1,5:2501\n467#1:2506\n1188#1,2:2507\n468#1,2:2509\n1190#1:2511\n470#1:2512\n467#1:2513\n1188#1,2:2514\n468#1,2:2516\n1190#1:2518\n470#1:2519\n1188#1,3:2520\n497#1,2:2523\n497#1,2:2525\n755#1,4:2527\n724#1,4:2531\n740#1,4:2535\n787#1,4:2539\n887#1,5:2543\n928#1,3:2548\n931#1,3:2558\n946#1,3:2561\n949#1,3:2571\n1046#1,3:2588\n1016#1,4:2591\n1005#1:2595\n1188#1,2:2596\n1190#1:2599\n1006#1:2600\n1188#1,3:2601\n1037#1:2604\n1179#1:2605\n1180#1:2607\n1038#1:2608\n1179#1,2:2609\n1188#1,3:2611\n1985#1,2:2614\n1987#1,6:2617\n2009#1,2:2623\n2011#1,6:2626\n2432#1,6:2632\n2462#1,7:2638\n1#2:2495\n1#2:2598\n1#2:2606\n1#2:2616\n1#2:2625\n381#3,7:2551\n381#3,7:2564\n381#3,7:2574\n381#3,7:2581\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2488,2\n66#1:2490,5\n425#1:2496,5\n434#1:2501,5\n445#1:2506\n445#1:2507,2\n445#1:2509,2\n445#1:2511\n445#1:2512\n456#1:2513\n456#1:2514,2\n456#1:2516,2\n456#1:2518\n456#1:2519\n467#1:2520,3\n479#1:2523,2\n488#1:2525,2\n682#1:2527,4\n697#1:2531,4\n711#1:2535,4\n774#1:2539,4\n847#1:2543,5\n903#1:2548,3\n903#1:2558,3\n916#1:2561,3\n916#1:2571,3\n975#1:2588,3\n985#1:2591,4\n995#1:2595\n995#1:2596,2\n995#1:2599\n995#1:2600\n1005#1:2601,3\n1029#1:2604\n1029#1:2605\n1029#1:2607\n1029#1:2608\n1037#1:2609,2\n1791#1:2611,3\n2079#1:2614,2\n2079#1:2617,6\n2096#1:2623,2\n2096#1:2626,6\n2421#1:2632,6\n2449#1:2638,7\n995#1:2598\n1029#1:2606\n2079#1:2616\n2096#1:2625\n903#1:2551,7\n916#1:2564,7\n930#1:2574,7\n948#1:2581,7\n*E\n"})
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static final boolean all(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? CollectionsKt__CollectionsKt.emptyList() : new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            Pair<? extends K, ? extends V> pairInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(pairInvoke2.getFirst(), pairInvoke2.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(keySelector.invoke2(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            destination.put(keySelector.invoke2(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            Pair<? extends K, ? extends V> pairInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            destination.put(pairInvoke2.getFirst(), pairInvoke2.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke2(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke2(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static List<String> chunked(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i, new Function1() { // from class: kotlin.text.j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StringsKt___StringsKt.chunkedSequence$lambda$22$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String chunkedSequence$lambda$22$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @InlineOnly
    private static final int count(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(RangesKt___RangesKt.coerceAtMost(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return take(charSequence, RangesKt___RangesKt.coerceAtLeast(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final char elementAtOrElse(CharSequence charSequence, int i, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= charSequence.length()) ? defaultValue.invoke2(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @InlineOnly
    private static final Character elementAtOrNull(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i);
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return null;
    }

    public static final char first(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOf(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R rInvoke2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            rInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke2 != null) {
                if (rInvoke2 != null) {
                    return rInvoke2;
                }
                throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
            }
        }
        rInvoke2 = null;
        if (rInvoke2 != null) {
            return rInvoke2;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke2 != null) {
                return rInvoke2;
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke2(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke2(Character.valueOf(charSequence.charAt(i))));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull CharSequence charSequence, R r2, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i)));
        }
        return r2;
    }

    public static final <R> R foldIndexed(@NotNull CharSequence charSequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
        return r2;
    }

    public static final <R> R foldRight(@NotNull CharSequence charSequence, R r2, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r2);
        }
        return r2;
    }

    public static final <R> R foldRightIndexed(@NotNull CharSequence charSequence, R r2, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r2);
        }
        return r2;
    }

    public static final void forEach(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            action.invoke2(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            action.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
    }

    @InlineOnly
    private static final char getOrElse(CharSequence charSequence, int i, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= charSequence.length()) ? defaultValue.invoke2(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @Nullable
    public static final Character getOrNull(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke2 = keySelector.invoke2(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke2 = keySelector.invoke2(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence charSequence, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
                return keyOf(ch.charValue());
            }

            @Override // kotlin.collections.Grouping
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }

            public K keyOf(char c) {
                return keySelector.invoke2(Character.valueOf(c));
            }
        };
    }

    public static final int indexOfFirst(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (predicate.invoke2(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return -1;
    }

    public static char last(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @NotNull
    public static final <R> List<R> map(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(transform.invoke2(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return destination;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke2 != null) {
                arrayList.add(rInvoke2);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke2 = transform.invoke2(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke2 != null) {
                destination.add(rInvoke2);
            }
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            destination.add(transform.invoke2(Character.valueOf(charSequence.charAt(i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m2209maxOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m2213minOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    public static final boolean none(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull S s, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i = 0; i < s.length(); i++) {
            action.invoke2(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S onEachIndexed(@NotNull S s, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            action.invoke(Integer.valueOf(i2), Character.valueOf(s.charAt(i)));
            i++;
            i2++;
        }
        return s;
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Character randomOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.Default);
    }

    public static final char reduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    public static final char reduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = operation.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = operation.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final CharSequence reversed(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFold(@NotNull CharSequence charSequence, R r2, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i = 0; i < charSequence.length(); i++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence charSequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chInvoke = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chInvoke = operation.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> scan(@NotNull CharSequence charSequence, R r2, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i = 0; i < charSequence.length(); i++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> scanIndexed(@NotNull CharSequence charSequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static char single(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, indices);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += selector.invoke2(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += selector.invoke2(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += selector.invoke2(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            jLongValue += selector.invoke2(Character.valueOf(charSequence.charAt(i))).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(CharSequence charSequence, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        for (int i = 0; i < charSequence.length(); i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(Character.valueOf(charSequence.charAt(i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(CharSequence charSequence, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM1060constructorimpl = ULong.m1060constructorimpl(0L);
        for (int i = 0; i < charSequence.length(); i++) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + selector.invoke2(Character.valueOf(charSequence.charAt(i))).m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(0, RangesKt___RangesKt.coerceAtMost(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - RangesKt___RangesKt.coerceAtMost(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence charSequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            destination.add(Character.valueOf(charSequence.charAt(i)));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(MapsKt__MapsJVMKt.mapCapacity(RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128))));
    }

    @NotNull
    public static final List<Character> toList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? toMutableList(charSequence) : CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @NotNull
    public static Set<Character> toSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128)))) : SetsKt__SetsJVMKt.setOf(Character.valueOf(charSequence.charAt(0)));
        }
        return SetsKt__SetsKt.emptySet();
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> windowed(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i2, z, new Function1() { // from class: kotlin.text.h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StringsKt___StringsKt.windowed$lambda$23$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String windowed$lambda$23$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i, i2, z, new Function1() { // from class: kotlin.text.i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StringsKt___StringsKt.windowedSequence$lambda$24$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String windowedSequence$lambda$24$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object windowedSequence$lambda$25$StringsKt___StringsKt(int i, CharSequence charSequence, Function1 function1, int i2) {
        int length = i + i2;
        if (length < 0 || length > charSequence.length()) {
            length = charSequence.length();
        }
        return function1.invoke2(charSequence.subSequence(i2, length));
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.text.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        });
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(other.charAt(i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i));
            i++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> chunked(@NotNull CharSequence charSequence, int i, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i, i, true, transform);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence charSequence, int i, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i, i, true, transform);
    }

    public static final int count(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (predicate.invoke2(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    public static final boolean none(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (predicate.invoke2(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    @InlineOnly
    private static final String reversed(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z = true;
            }
        }
        if (z) {
            return chValueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> windowed(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(transform.invoke2(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> windowedSequence(@NotNull final CharSequence charSequence, final int i, int i2, boolean z, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i, i2);
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(RangesKt___RangesKt.step(z ? StringsKt__StringsKt.getIndices(charSequence) : RangesKt___RangesKt.until(0, (charSequence.length() - i) + 1), i2)), new Function1() { // from class: kotlin.text.l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StringsKt___StringsKt.windowedSequence$lambda$25$StringsKt___StringsKt(i, charSequence, transform, ((Integer) obj).intValue());
            }
        });
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z, function1);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            destination.put(keySelector.invoke2(Character.valueOf(cCharAt)), valueTransform.invoke2(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @NotNull
    public static String drop(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(RangesKt___RangesKt.coerceAtMost(i, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static String dropLast(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            return take(str, RangesKt___RangesKt.coerceAtLeast(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String filterNot(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @NotNull
    public static String slice(@NotNull String str, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    @NotNull
    public static String take(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(0, RangesKt___RangesKt.coerceAtMost(i, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String filterIndexed(@NotNull String str, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb.toString();
    }

    public static final char first(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                    return cCharAt;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static String takeLast(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - RangesKt___RangesKt.coerceAtMost(i, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i)), Character.valueOf(other.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(keySelector.invoke2(Character.valueOf(cCharAt)), valueTransform.invoke2(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final String dropWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke2(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final String filter(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final char single(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                if (!z) {
                    chValueOf = Character.valueOf(cCharAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @NotNull
    public static final String takeWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke2(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            i++;
            arrayList.add(TuplesKt.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m2207maxOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            float fFloatValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).floatValue();
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m2210maxOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m2211minOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            float fFloatValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).floatValue();
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m2214minOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke2(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke2(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke2 = keySelector.invoke2(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke2(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @NotNull
    public static final Pair<String, String> partition(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (predicate.invoke2(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke2 = keySelector.invoke2(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            arrayList.add(valueTransform.invoke2(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final String slice(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return slice((CharSequence) str, indices).toString();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m2208maxOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m2212minOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }
}
