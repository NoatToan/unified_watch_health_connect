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
import java.util.Objects;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.q;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class StringsKt___StringsKt extends n {

    public static final class a extends Lambda implements Function1<CharSequence, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    public static final class b extends Lambda implements Function1<CharSequence, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    public static final class c extends Lambda implements Function1<CharSequence, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class d<R> extends Lambda implements Function1<Integer, R> {
        public final /* synthetic */ int a;
        public final /* synthetic */ CharSequence b;
        public final /* synthetic */ Function1<CharSequence, R> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, CharSequence charSequence, Function1<? super CharSequence, ? extends R> function1) {
            super(1);
            this.a = i;
            this.b = charSequence;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final R invoke(int i) {
            int length = this.a + i;
            if (length < 0 || length > this.b.length()) {
                length = this.b.length();
            }
            return this.c.invoke(this.b.subSequence(i, length));
        }
    }

    public static final class e extends Lambda implements Function0<Iterator<? extends Character>> {
        public final /* synthetic */ CharSequence a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence) {
            super(0);
            this.a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Character> invoke() {
            return StringsKt__StringsKt.iterator(this.a);
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R A2(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R B2(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char C2(CharSequence charSequence) {
        return random(charSequence, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character D2(CharSequence charSequence) {
        return randomOrNull(charSequence, Random.Default);
    }

    @InlineOnly
    private static final String E2(String str) {
        return reversed(str).toString();
    }

    @InlineOnly
    private static final String F2(String str, Iterable<Integer> iterable) {
        return slice(str, iterable).toString();
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double G2(CharSequence charSequence, Function1<? super Character, Double> function1) {
        double dDoubleValue = 0.0d;
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            dDoubleValue += function1.invoke(Character.valueOf(cCharAt)).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int H2(CharSequence charSequence, Function1<? super Character, Integer> function1) {
        int i = 0;
        int iIntValue = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            iIntValue += function1.invoke(Character.valueOf(cCharAt)).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long I2(CharSequence charSequence, Function1<? super Character, Long> function1) {
        long jLongValue = 0;
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            jLongValue += function1.invoke(Character.valueOf(cCharAt)).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int J2(CharSequence charSequence, Function1<? super Character, UInt> function1) {
        int i = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Character.valueOf(cCharAt)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long K2(CharSequence charSequence, Function1<? super Character, ULong> function1) {
        int i = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Character.valueOf(cCharAt)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    public static final boolean all(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (!function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence charSequence) {
        return !(charSequence.length() == 0);
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull CharSequence charSequence) {
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence charSequence) {
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return SequencesKt__SequencesKt.emptySequence();
            }
        }
        return new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(charSequence.length()), 16));
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Character.valueOf(cCharAt));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(charSequence.length()), 16));
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            linkedHashMap.put(function1.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            m.put(function1.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Character.valueOf(cCharAt));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(kotlin.ranges.e.coerceAtMost(charSequence.length(), 128)), 16));
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            linkedHashMap.put(Character.valueOf(cCharAt), function1.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends V> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            m.put(Character.valueOf(cCharAt), function1.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @InlineOnly
    private static final int c2(CharSequence charSequence) {
        return charSequence.length();
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> chunked(@NotNull CharSequence charSequence, int i) {
        return windowed(charSequence, i, i, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull CharSequence charSequence, int i) {
        return chunkedSequence(charSequence, i, a.a);
    }

    public static final int count(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InlineOnly
    private static final char d2(CharSequence charSequence, int i, Function1<? super Integer, Character> function1) {
        return (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) ? function1.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence charSequence, int i) {
        if (i >= 0) {
            return charSequence.subSequence(kotlin.ranges.e.coerceAtMost(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence charSequence, int i) {
        if (i >= 0) {
            return take(charSequence, kotlin.ranges.e.coerceAtLeast(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return "";
        }
        while (true) {
            int i = lastIndex - 1;
            if (!function1.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
            if (i < 0) {
                return "";
            }
            lastIndex = i;
        }
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
            i = i2;
        }
        return "";
    }

    @InlineOnly
    private static final Character e2(CharSequence charSequence, int i) {
        return getOrNull(charSequence, i);
    }

    @InlineOnly
    private static final Character f2(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i = i2;
        }
        return sb;
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Boolean> function2) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            int i3 = i2 + 1;
            if (function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2 = i3;
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super Character, Boolean> function2) throws IOException {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            int i3 = i2 + 1;
            if (function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                c2.append(cCharAt);
            }
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (!function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (!function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c2.append(cCharAt);
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c2.append(cCharAt);
            }
            i = i2;
        }
        return c2;
    }

    public static char first(@NotNull CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Character.valueOf(cCharAt)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            kotlin.collections.h.addAll(c2, function1.invoke(Character.valueOf(cCharAt)));
        }
        return c2;
    }

    public static final <R> R fold(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> function2) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            r = function2.invoke(r, Character.valueOf(cCharAt));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            r = function3.invoke(Integer.valueOf(i2), r, Character.valueOf(cCharAt));
            i2++;
        }
        return r;
    }

    public static final <R> R foldRight(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super Character, ? super R, ? extends R> function2) {
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> function3) {
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    public static final void forEach(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Unit> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            function1.invoke(Character.valueOf(cCharAt));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Unit> function2) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt));
            i2++;
        }
    }

    @InlineOnly
    private static final Character g2(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final Character getOrNull(@NotNull CharSequence charSequence, int i) {
        if (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            K kInvoke = function1.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            K kInvoke = function1.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return m;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence charSequence, @NotNull final Function1<? super Character, ? extends K> function1) {
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
                return keyOf(ch.charValue());
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }

            public K keyOf(char c2) {
                return function1.invoke(Character.valueOf(c2));
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R h2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        R rInvoke;
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            rInvoke = function1.invoke(Character.valueOf(cCharAt));
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R i2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            R rInvoke = function1.invoke(Character.valueOf(cCharAt));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    public static final int indexOfFirst(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (function1.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> j2(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)));
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C k2(CharSequence charSequence, C c2, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> function2) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)));
            i2++;
        }
        return c2;
    }

    @InlineOnly
    private static final char l2(CharSequence charSequence, int i, Function1<? super Integer, Character> function1) {
        return (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) ? function1.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    public static char last(@NotNull CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double m2(CharSequence charSequence, Function1<? super Character, Double> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <R> List<R> map(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            arrayList.add(function1.invoke(Character.valueOf(cCharAt)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            arrayList.add(function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            int i3 = i2 + 1;
            R rInvoke = function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            int i3 = i2 + 1;
            R rInvoke = function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt));
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            c2.add(function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)));
            i2++;
        }
        return c2;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            R rInvoke = function1.invoke(Character.valueOf(cCharAt));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function1<? super Character, ? extends R> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            R rInvoke = function1.invoke(Character.valueOf(cCharAt));
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull Function1<? super Character, ? extends R> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            c2.add(function1.invoke(Character.valueOf(cCharAt)));
        }
        return c2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence charSequence) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence charSequence) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                char cCharAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float n2(CharSequence charSequence, Function1<? super Character, Float> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    public static final boolean none(@NotNull CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R o2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull S s, @NotNull Function1<? super Character, Unit> function1) {
        int i = 0;
        while (i < s.length()) {
            char cCharAt = s.charAt(i);
            i++;
            function1.invoke(Character.valueOf(cCharAt));
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S onEachIndexed(@NotNull S s, @NotNull Function2<? super Integer, ? super Character, Unit> function2) {
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            char cCharAt = s.charAt(i);
            i++;
            function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt));
            i2++;
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R p2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double q2(CharSequence charSequence, Function1<? super Character, Double> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float r2(CharSequence charSequence, Function1<? super Character, Float> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharSequence charSequence, @NotNull Random random) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(random.nextInt(charSequence.length()));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence charSequence, @NotNull Random random) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    public static final char reduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                cCharAt = function2.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return cCharAt;
    }

    public static final char reduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                cCharAt = function3.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                cCharAt = function3.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                cCharAt = function2.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = function2.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = function3.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = function3.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            cCharAt = function2.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final CharSequence reversed(@NotNull CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFold(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> function2) {
        int i = 0;
        if (charSequence.length() == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            r = function2.invoke(r, Character.valueOf(cCharAt));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        if (charSequence.length() == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = function3.invoke(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            cCharAt = function2.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            cCharAt = function3.invoke(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R s2(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scan(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> function2) {
        int i = 0;
        if (charSequence.length() == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            r = function2.invoke(r, Character.valueOf(cCharAt));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scanIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        if (charSequence.length() == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = function3.invoke(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    public static char single(@NotNull CharSequence charSequence) {
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
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, intRange);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Integer> function1) {
        int i = 0;
        int iIntValue = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            iIntValue += function1.invoke(Character.valueOf(cCharAt)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Double> function1) {
        double dDoubleValue = 0.0d;
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            dDoubleValue += function1.invoke(Character.valueOf(cCharAt)).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R t2(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence charSequence, int i) {
        if (i >= 0) {
            return charSequence.subSequence(0, kotlin.ranges.e.coerceAtMost(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence charSequence, int i) {
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - kotlin.ranges.e.coerceAtMost(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                    return charSequence.subSequence(lastIndex + 1, charSequence.length());
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
            i = i2;
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence charSequence, @NotNull C c2) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            c2.add(Character.valueOf(cCharAt));
        }
        return c2;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull CharSequence charSequence) {
        return (HashSet) StringsKt.toCollection(charSequence, new HashSet(q.mapCapacity(kotlin.ranges.e.coerceAtMost(charSequence.length(), 128))));
    }

    @NotNull
    public static final List<Character> toList(@NotNull CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? toMutableList(charSequence) : kotlin.collections.e.listOf(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull CharSequence charSequence) {
        return (List) StringsKt.toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) StringsKt.toCollection(charSequence, new LinkedHashSet(q.mapCapacity(kotlin.ranges.e.coerceAtMost(charSequence.length(), 128)))) : x.setOf(Character.valueOf(charSequence.charAt(0)));
        }
        return y.emptySet();
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double u2(CharSequence charSequence, Function1<? super Character, Double> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float v2(CharSequence charSequence, Function1<? super Character, Float> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R w2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> windowed(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        return windowed(charSequence, i, i2, z, b.a);
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

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        return windowedSequence(charSequence, i, i2, z, c.a);
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

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull CharSequence charSequence) {
        return new IndexingIterable(new e(charSequence));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R x2(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(0)));
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(charSequence.charAt(i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double y2(CharSequence charSequence, Function1<? super Character, Double> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float z2(CharSequence charSequence, Function1<? super Character, Float> function1) {
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function2<? super Character, ? super Character, ? extends V> function2) {
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, ? extends R> function2) {
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            arrayList.add(function2.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i2))));
            i = i2;
        }
        return arrayList;
    }

    public static final boolean any(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> chunked(@NotNull CharSequence charSequence, int i, @NotNull Function1<? super CharSequence, ? extends R> function1) {
        return windowed(charSequence, i, i, true, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence charSequence, int i, @NotNull Function1<? super CharSequence, ? extends R> function1) {
        return windowedSequence(charSequence, i, i, true, function1);
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    public static final boolean none(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        Character chValueOf = null;
        boolean z = false;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
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
    public static final <R> List<R> windowed(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull Function1<? super CharSequence, ? extends R> function1) {
        SlidingWindowKt.checkWindowSizeStep(i, i2);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (true) {
            if (!(i3 >= 0 && i3 < length)) {
                break;
            }
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(function1.invoke(charSequence.subSequence(i3, i4)));
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
    public static final <R> Sequence<R> windowedSequence(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull Function1<? super CharSequence, ? extends R> function1) {
        SlidingWindowKt.checkWindowSizeStep(i, i2);
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(kotlin.ranges.e.step(z ? StringsKt__StringsKt.getIndices(charSequence) : kotlin.ranges.e.until(0, (charSequence.length() - i) + 1), i2)), new d(i, charSequence, function1));
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
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            m.put(function1.invoke(Character.valueOf(cCharAt)), function2.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @NotNull
    public static String drop(@NotNull String str, int i) {
        if (i >= 0) {
            return str.substring(kotlin.ranges.e.coerceAtMost(i, str.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static String dropLast(@NotNull String str, int i) {
        if (i >= 0) {
            return take(str, kotlin.ranges.e.coerceAtLeast(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String filterNot(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            i++;
            if (!function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @NotNull
    public static String slice(@NotNull String str, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? "" : StringsKt__StringsKt.substring(str, intRange);
    }

    @NotNull
    public static final String take(@NotNull String str, int i) {
        if (i >= 0) {
            return str.substring(0, kotlin.ranges.e.coerceAtMost(i, str.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(str);
        if (lastIndex < 0) {
            return "";
        }
        while (true) {
            int i = lastIndex - 1;
            if (!function1.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                return str.substring(0, lastIndex + 1);
            }
            if (i < 0) {
                return "";
            }
            lastIndex = i;
        }
    }

    @NotNull
    public static final String dropWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                return str.substring(i);
            }
            i = i2;
        }
        return "";
    }

    @NotNull
    public static final String filterIndexed(@NotNull String str, @NotNull Function2<? super Integer, ? super Character, Boolean> function2) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            i++;
            int i3 = i2 + 1;
            if (function2.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2 = i3;
        }
        return sb.toString();
    }

    public static final char first(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
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
        if (i >= 0) {
            int length = str.length();
            return str.substring(length - kotlin.ranges.e.coerceAtMost(i, length));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
            i = i2;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(charSequence.length()), 16));
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            linkedHashMap.put(function1.invoke(Character.valueOf(cCharAt)), function2.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String filter(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i = i2;
        }
        return sb.toString();
    }

    public static final char single(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i = 0;
        Character chValueOf = null;
        boolean z = false;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (!z) {
                    chValueOf = Character.valueOf(cCharAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(charSequence.charAt(it2.next().intValue()));
        }
        return sb;
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = StringsKt__StringsKt.getLastIndex(str);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                    return str.substring(lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return str;
    }

    @NotNull
    public static final String takeWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                return str.substring(0, i);
            }
            i = i2;
        }
        return str;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i2))));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            K kInvoke = function1.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @NotNull
    public static final Pair<String, String> partition(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            i++;
            if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            i++;
            K kInvoke = function1.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }
}
