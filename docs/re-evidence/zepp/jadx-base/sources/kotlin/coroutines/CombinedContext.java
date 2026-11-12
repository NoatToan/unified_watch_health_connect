package kotlin.coroutines;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable {

    @NotNull
    private final CoroutineContext a;

    @NotNull
    private final CoroutineContext.Element b;

    public static final class Serialized implements Serializable {

        @NotNull
        public static final Companion b = new Companion(null);
        private static final long serialVersionUID = 0;

        @NotNull
        private final CoroutineContext[] a;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Serialized(@NotNull CoroutineContext[] coroutineContextArr) {
            this.a = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.a;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.INSTANCE;
            int length = coroutineContextArr.length;
            int i = 0;
            while (i < length) {
                CoroutineContext coroutineContext = coroutineContextArr[i];
                i++;
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }

        @NotNull
        public final CoroutineContext[] a() {
            return this.a;
        }
    }

    public static final class a extends Lambda implements Function2<String, CoroutineContext.Element, String> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str, @NotNull CoroutineContext.Element element) {
            if (str.length() == 0) {
                return element.toString();
            }
            return str + ", " + element;
        }
    }

    public static final class b extends Lambda implements Function2<Unit, CoroutineContext.Element, Unit> {
        public final /* synthetic */ CoroutineContext[] a;
        public final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
            super(2);
            this.a = coroutineContextArr;
            this.b = intRef;
        }

        public final void a(@NotNull Unit unit, @NotNull CoroutineContext.Element element) {
            CoroutineContext[] coroutineContextArr = this.a;
            Ref.IntRef intRef = this.b;
            int i = intRef.element;
            intRef.element = i + 1;
            coroutineContextArr[i] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element element) {
            a(unit, element);
            return Unit.INSTANCE;
        }
    }

    public CombinedContext(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
        this.a = coroutineContext;
        this.b = element;
    }

    private final boolean a(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean b(CombinedContext combinedContext) {
        while (a(combinedContext.b)) {
            CoroutineContext coroutineContext = combinedContext.a;
            if (!(coroutineContext instanceof CombinedContext)) {
                return a((CoroutineContext.Element) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final int c() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.a;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int iC = c();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iC];
        Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.INSTANCE, new b(coroutineContextArr, intRef));
        if (intRef.element == iC) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.c() != c() || !combinedContext.b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke((Object) this.a.fold(r, function2), this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.b.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.a;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        if (this.b.get(key) != null) {
            return this.a;
        }
        CoroutineContext coroutineContextMinusKey = this.a.minusKey(key);
        if (coroutineContextMinusKey == this.a) {
            return this;
        }
        return coroutineContextMinusKey == EmptyCoroutineContext.INSTANCE ? this.b : new CombinedContext(coroutineContextMinusKey, this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return JsonLexerKt.BEGIN_LIST + ((String) fold("", a.a)) + JsonLexerKt.END_LIST;
    }
}
