package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Regex implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Pattern a;

    @Nullable
    private Set<? extends RegexOption> b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @NotNull
        public final String escape(@NotNull String str) {
            return Pattern.quote(str);
        }

        @NotNull
        public final String escapeReplacement(@NotNull String str) {
            return Matcher.quoteReplacement(str);
        }

        @NotNull
        public final Regex fromLiteral(@NotNull String str) {
            return new Regex(str, RegexOption.LITERAL);
        }
    }

    public static final class Serialized implements Serializable {

        @NotNull
        public static final Companion c = new Companion(null);
        private static final long serialVersionUID = 0;

        @NotNull
        private final String a;
        private final int b;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Serialized(@NotNull String str, int i) {
            this.a = str;
            this.b = i;
        }

        private final Object readResolve() {
            return new Regex(Pattern.compile(this.a, this.b));
        }

        public final int a() {
            return this.b;
        }

        @NotNull
        public final String b() {
            return this.a;
        }
    }

    public static final class a extends Lambda implements Function0<MatchResult> {
        public final /* synthetic */ CharSequence b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence, int i) {
            super(0);
            this.b = charSequence;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MatchResult invoke() {
            return Regex.this.find(this.b, this.c);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
        public static final b a = new b();

        public b() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MatchResult invoke(@NotNull MatchResult matchResult) {
            return matchResult.next();
        }
    }

    @DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {276, 284, 288}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    public static final class c extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ CharSequence f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f = charSequence;
            this.g = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = Regex.this.new c(this.f, this.g, continuation);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super String> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            c cVar;
            SequenceScope sequenceScope;
            Matcher matcher;
            int i;
            String string;
            String string2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.d;
                Matcher matcher2 = Regex.this.a.matcher(this.f);
                if (this.g != 1 && matcher2.find()) {
                    cVar = this;
                    sequenceScope = sequenceScope2;
                    matcher = matcher2;
                    int iEnd = 0;
                    i = 0;
                    string = cVar.f.subSequence(iEnd, matcher.start()).toString();
                    cVar.d = sequenceScope;
                    cVar.a = matcher;
                    cVar.b = i;
                    cVar.c = 2;
                    if (sequenceScope.yield(string, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iEnd = matcher.end();
                    i++;
                    if (i != cVar.g - 1) {
                    }
                    CharSequence charSequence = cVar.f;
                    string2 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                    cVar.d = null;
                    cVar.a = null;
                    cVar.c = 3;
                    if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                String string3 = this.f.toString();
                this.c = 1;
                if (sequenceScope2.yield(string3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.b;
                        matcher = (Matcher) this.a;
                        sequenceScope = (SequenceScope) this.d;
                        ResultKt.throwOnFailure(obj);
                        cVar = this;
                        iEnd = matcher.end();
                        i++;
                        if (i != cVar.g - 1 || !matcher.find()) {
                            CharSequence charSequence2 = cVar.f;
                            string2 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                            cVar.d = null;
                            cVar.a = null;
                            cVar.c = 3;
                            if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        string = cVar.f.subSequence(iEnd, matcher.start()).toString();
                        cVar.d = sequenceScope;
                        cVar.a = matcher;
                        cVar.b = i;
                        cVar.c = 2;
                        if (sequenceScope.yield(string, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iEnd = matcher.end();
                        i++;
                        if (i != cVar.g - 1) {
                        }
                        CharSequence charSequence3 = cVar.f;
                        string2 = charSequence3.subSequence(iEnd, charSequence3.length()).toString();
                        cVar.d = null;
                        cVar.a = null;
                        cVar.c = 3;
                        if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern) {
        this.a = pattern;
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        return new Serialized(this.a.pattern(), this.a.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence) {
        return this.a.matcher(charSequence).find();
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence charSequence, int i) {
        return RegexKt.a(this.a.matcher(charSequence), i, charSequence);
    }

    @NotNull
    public final Sequence<MatchResult> findAll(@NotNull CharSequence charSequence, int i) {
        if (i >= 0 && i <= charSequence.length()) {
            return SequencesKt__SequencesKt.generateSequence((Function0) new a(charSequence, i), (Function1) b.a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        final int iFlags = this.a.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        kotlin.collections.h.retainAll(enumSetAllOf, new Function1<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((iFlags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        this.b = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        return this.a.pattern();
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalStdlibApi
    @Nullable
    public final MatchResult matchAt(@NotNull CharSequence charSequence, int i) {
        Matcher matcherRegion = this.a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (matcherRegion.lookingAt()) {
            return new MatcherMatchResult(matcherRegion, charSequence);
        }
        return null;
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence charSequence) {
        return RegexKt.c(this.a.matcher(charSequence), charSequence);
    }

    public final boolean matches(@NotNull CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalStdlibApi
    public final boolean matchesAt(@NotNull CharSequence charSequence, int i) {
        return this.a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        return this.a.matcher(charSequence).replaceAll(str);
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence, @NotNull String str) {
        return this.a.matcher(charSequence).replaceFirst(str);
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence charSequence, int i) {
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        Matcher matcher = this.a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return kotlin.collections.e.listOf(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? kotlin.ranges.e.coerceAtMost(i, 10) : 10);
        int iEnd = 0;
        int i2 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public final Sequence<String> splitToSequence(@NotNull CharSequence charSequence, int i) {
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        return SequencesKt__SequenceBuilderKt.sequence(new c(charSequence, i, null));
    }

    @NotNull
    public final Pattern toPattern() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return this.a.toString();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull Function1<? super MatchResult, ? extends CharSequence> function1) {
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, charSequence, 0, 2, null);
        if (matchResultFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, matchResultFind$default.getRange().getStart().intValue());
            sb.append(function1.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        return sb.toString();
    }

    public Regex(@NotNull String str) {
        this(Pattern.compile(str));
    }

    public Regex(@NotNull String str, @NotNull RegexOption regexOption) {
        this(Pattern.compile(str, Companion.a(regexOption.getValue())));
    }

    public Regex(@NotNull String str, @NotNull Set<? extends RegexOption> set) {
        this(Pattern.compile(str, Companion.a(RegexKt.f(set))));
    }
}
