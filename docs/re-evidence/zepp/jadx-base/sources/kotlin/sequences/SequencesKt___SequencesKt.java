package kotlin.sequences;

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
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.BrittleContainsOptimizationKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.y;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class SequencesKt___SequencesKt extends kotlin.sequences.e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends Lambda implements Function1<T, T> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends Lambda implements Function1<Integer, T> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.a = i;
        }

        public final T invoke(int i) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + '.');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> extends Lambda implements Function1<IndexedValue<? extends T>, Boolean> {
        public final /* synthetic */ Function2<Integer, T, Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super Integer, ? super T, Boolean> function2) {
            super(1);
            this.a = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull IndexedValue<? extends T> indexedValue) {
            return this.a.invoke(Integer.valueOf(indexedValue.getIndex()), indexedValue.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> extends Lambda implements Function1<IndexedValue<? extends T>, T> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(@NotNull IndexedValue<? extends T> indexedValue) {
            return indexedValue.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> extends Lambda implements Function1<T, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable T t) {
            return Boolean.valueOf(t == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public /* synthetic */ class f<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {
        public static final f a = new f();

        public f() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public /* synthetic */ class g<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
        public static final g a = new g();

        public g() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@NotNull Sequence<? extends R> sequence) {
            return sequence.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public /* synthetic */ class h<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {
        public static final h a = new h();

        public h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public /* synthetic */ class i<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
        public static final i a = new i();

        public i() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@NotNull Sequence<? extends R> sequence) {
            return sequence.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class j<T> extends Lambda implements Function1<T, T> {
        public final /* synthetic */ Function1<T, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super T, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            this.a.invoke(t);
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class k<T> extends Lambda implements Function2<Integer, T, T> {
        public final /* synthetic */ Function2<Integer, T, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super Integer, ? super T, Unit> function2) {
            super(2);
            this.a = function2;
        }

        public final T a(int i, T t) {
            this.a.invoke(Integer.valueOf(i), t);
            return t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return a(num.intValue(), obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class l<T> extends Lambda implements Function1<T, T> {
        public final /* synthetic */ Sequence<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Sequence<? extends T> sequence) {
            super(1);
            this.a = sequence;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final T invoke(@Nullable T t) {
            if (t != null) {
                return t;
            }
            throw new IllegalArgumentException("null element found in " + this.a + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2115, 2119}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    public static final class m<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ R e;
        public final /* synthetic */ Sequence<T> f;
        public final /* synthetic */ Function2<R, T, R> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(R r, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, Continuation<? super m> continuation) {
            super(2, continuation);
            this.e = r;
            this.f = sequence;
            this.g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            m mVar = new m(this.e, this.f, this.g, continuation);
            mVar.d = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0053  */
        /* JADX WARN: Code duplicated, block: B:23:0x006b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:15:0x004d->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Object objInvoke;
            SequenceScope sequenceScope2;
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    sequenceScope = (SequenceScope) this.d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) this.b;
                    Object obj2 = this.a;
                    sequenceScope2 = (SequenceScope) this.d;
                    ResultKt.throwOnFailure(obj);
                    objInvoke = obj2;
                }
                while (it2.hasNext()) {
                    objInvoke = this.g.invoke((R) objInvoke, (T) it2.next());
                    this.d = sequenceScope2;
                    this.a = objInvoke;
                    this.b = it2;
                    this.c = 2;
                    if (sequenceScope2.yield(objInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.d;
            R r = this.e;
            this.d = sequenceScope;
            this.c = 1;
            if (sequenceScope.yield(r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objInvoke = this.e;
            sequenceScope2 = sequenceScope;
            it2 = this.f.iterator();
            while (it2.hasNext()) {
                objInvoke = this.g.invoke((R) objInvoke, (T) it2.next());
                this.d = sequenceScope2;
                this.a = objInvoke;
                this.b = it2;
                this.c = 2;
                if (sequenceScope2.yield(objInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2143, 2148}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class n<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        private /* synthetic */ Object e;
        public final /* synthetic */ R f;
        public final /* synthetic */ Sequence<T> g;
        public final /* synthetic */ Function3<Integer, R, T, R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(R r, Sequence<? extends T> sequence, Function3<? super Integer, ? super R, ? super T, ? extends R> function3, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f = r;
            this.g = sequence;
            this.h = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            n nVar = new n(this.f, this.g, this.h, continuation);
            nVar.e = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
        /* JADX WARN: Code duplicated, block: B:23:0x007e A[LOOP:0: B:15:0x0052->B:23:0x007e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:27:0x007d A[SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            int i;
            SequenceScope sequenceScope2;
            Object obj2;
            Iterator it2;
            int i2;
            R rInvoke;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i3 = this.d;
            if (i3 != 0) {
                if (i3 == 1) {
                    sequenceScope = (SequenceScope) this.e;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = this.c;
                    it2 = (Iterator) this.b;
                    Object obj3 = this.a;
                    sequenceScope2 = (SequenceScope) this.e;
                    ResultKt.throwOnFailure(obj);
                    i = i4;
                    obj2 = obj3;
                }
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Function3<Integer, R, T, R> function3 = this.h;
                    i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    rInvoke = function3.invoke(Boxing.boxInt(i), (R) obj2, (T) next);
                    this.e = sequenceScope2;
                    this.a = rInvoke;
                    this.b = it2;
                    this.c = i2;
                    this.d = 2;
                    if (sequenceScope2.yield(rInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = rInvoke;
                    i = i2;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.e;
            R r = this.f;
            this.e = sequenceScope;
            this.d = 1;
            if (sequenceScope.yield(r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = 0;
            sequenceScope2 = sequenceScope;
            obj2 = this.f;
            it2 = this.g.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Function3<Integer, R, T, R> function4 = this.h;
                i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                rInvoke = function4.invoke(Boxing.boxInt(i), (R) obj2, (T) next2);
                this.e = sequenceScope2;
                this.a = rInvoke;
                this.b = it2;
                this.c = i2;
                this.d = 2;
                if (sequenceScope2.yield(rInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = rInvoke;
                i = i2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2173, 2176}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class o<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ Sequence<T> e;
        public final /* synthetic */ Function2<S, T, S> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> function2, Continuation<? super o> continuation) {
            super(2, continuation);
            this.e = sequence;
            this.f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.e, this.f, continuation);
            oVar.d = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super S> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Object next;
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.d;
                Iterator it3 = this.e.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    this.d = sequenceScope;
                    this.a = it3;
                    this.b = next;
                    this.c = 1;
                    if (sequenceScope.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it2 = it3;
                }
                return Unit.INSTANCE;
            }
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.b;
            it2 = (Iterator) this.a;
            sequenceScope = (SequenceScope) this.d;
            ResultKt.throwOnFailure(obj);
            while (it2.hasNext()) {
                next = this.f.invoke((S) next, (T) it2.next());
                this.d = sequenceScope;
                this.a = it2;
                this.b = next;
                this.c = 2;
                if (sequenceScope.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2202, 2206}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class p<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        private /* synthetic */ Object e;
        public final /* synthetic */ Sequence<T> f;
        public final /* synthetic */ Function3<Integer, S, T, S> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> function3, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f = sequence;
            this.g = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = new p(this.f, this.g, continuation);
            pVar.e = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super S> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0066  */
        /* JADX WARN: Code duplicated, block: B:20:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x008c A[LOOP:0: B:16:0x0060->B:24:0x008c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x008b A[SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Iterator it2;
            Object next;
            int i;
            S sInvoke;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.d;
            int i3 = 1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.e;
                it2 = this.f.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.e = sequenceScope;
                    this.a = it2;
                    this.b = next;
                    this.d = 1;
                    if (sequenceScope.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 == 1) {
                next = this.b;
                it2 = (Iterator) this.a;
                sequenceScope = (SequenceScope) this.e;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.c;
                Object obj2 = this.b;
                it2 = (Iterator) this.a;
                sequenceScope = (SequenceScope) this.e;
                ResultKt.throwOnFailure(obj);
                i3 = i4;
                next = obj2;
            }
            while (it2.hasNext()) {
                Function3<Integer, S, T, S> function3 = this.g;
                i = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                sInvoke = function3.invoke(Boxing.boxInt(i3), (S) next, (T) it2.next());
                this.e = sequenceScope;
                this.a = it2;
                this.b = sInvoke;
                this.c = i;
                this.d = 2;
                if (sequenceScope.yield(sInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = sInvoke;
                i3 = i;
            }
            return Unit.INSTANCE;
            while (it2.hasNext()) {
                Function3<Integer, S, T, S> function4 = this.g;
                i = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                sInvoke = function4.invoke(Boxing.boxInt(i3), (S) next, (T) it2.next());
                this.e = sequenceScope;
                this.a = it2;
                this.b = sInvoke;
                this.c = i;
                this.d = 2;
                if (sequenceScope.yield(sInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = sInvoke;
                i3 = i;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    public static final class q<R, T> extends Lambda implements Function2<T, R, Pair<? extends T, ? extends R>> {
        public static final q a = new q();

        public q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<T, R> invoke(T t, R r) {
            return TuplesKt.to(t, r);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class r<T> extends Lambda implements Function2<T, T, Pair<? extends T, ? extends T>> {
        public static final r a = new r();

        public r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<T, T> invoke(T t, T t2) {
            return TuplesKt.to(t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2693}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    public static final class s<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ Sequence<T> e;
        public final /* synthetic */ Function2<T, T, R> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Sequence<? extends T> sequence, Function2<? super T, ? super T, ? extends R> function2, Continuation<? super s> continuation) {
            super(2, continuation);
            this.e = sequence;
            this.f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(this.e, this.f, continuation);
            sVar.d = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Object next;
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.d;
                Iterator it3 = this.e.iterator();
                if (!it3.hasNext()) {
                    return Unit.INSTANCE;
                }
                sequenceScope = sequenceScope2;
                next = it3.next();
                it2 = it3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.b;
                it2 = (Iterator) this.a;
                sequenceScope = (SequenceScope) this.d;
                ResultKt.throwOnFailure(obj);
                next = obj2;
            }
            while (it2.hasNext()) {
                Object next2 = it2.next();
                R rInvoke = this.f.invoke((T) next, (T) next2);
                this.d = sequenceScope;
                this.a = it2;
                this.b = next2;
                this.c = 1;
                if (sequenceScope.yield(rInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = next2;
            }
            return Unit.INSTANCE;
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R A(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double B(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = function1.invoke(it2.next()).doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(it2.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Float C(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float fFloatValue = function1.invoke(it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.min(fFloatValue, function1.invoke(it2.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R D(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R E(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InlineOnly
    private static final <T> Sequence<T> F(Sequence<? extends T> sequence, T t) {
        return minus(sequence, t);
    }

    @InlineOnly
    private static final <T> Sequence<T> G(Sequence<? extends T> sequence, T t) {
        return plus(sequence, t);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final <T> double H(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it2.hasNext()) {
            dDoubleValue += function1.invoke(it2.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final <T> int I(Sequence<? extends T> sequence, Function1<? super T, Integer> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += function1.invoke(it2.next()).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final <T> long J(Sequence<? extends T> sequence, Function1<? super T, Long> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += function1.invoke(it2.next()).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> int K(Sequence<? extends T> sequence, Function1<? super T, UInt> function1) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(it2.next()).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> long L(Sequence<? extends T> sequence, Function1<? super T, ULong> function1) {
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(it2.next()).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    public static final <T> boolean all(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            if (!function1.invoke(it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> sequence) {
        return sequence.iterator().hasNext();
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull Sequence<? extends T> sequence) {
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(it2.next());
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequence) {
            linkedHashMap.put(function1.invoke(t), t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Sequence<? extends T> sequence, @NotNull M m2, @NotNull Function1<? super T, ? extends K> function1) {
        for (T t : sequence) {
            m2.put(function1.invoke(t), t);
        }
        return m2;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Sequence<? extends T> sequence, @NotNull M m2, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(it2.next());
            m2.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m2;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull Sequence<? extends K> sequence, @NotNull Function1<? super K, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k2 : sequence) {
            linkedHashMap.put(k2, function1.invoke(k2));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Sequence<? extends K> sequence, @NotNull M m2, @NotNull Function1<? super K, ? extends V> function1) {
        for (K k2 : sequence) {
            m2.put(k2, function1.invoke(k2));
        }
        return m2;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Sequence<Byte> sequence) {
        Iterator<Byte> it2 = sequence.iterator();
        double dByteValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dByteValue += (double) it2.next().byteValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i2);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Sequence<Double> sequence) {
        Iterator<Double> it2 = sequence.iterator();
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dDoubleValue += it2.next().doubleValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i2);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Sequence<Float> sequence) {
        Iterator<Float> it2 = sequence.iterator();
        double dFloatValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dFloatValue += (double) it2.next().floatValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i2);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Sequence<Integer> sequence) {
        Iterator<Integer> it2 = sequence.iterator();
        double dIntValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dIntValue += (double) it2.next().intValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i2);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Sequence<Long> sequence) {
        Iterator<Long> it2 = sequence.iterator();
        double dLongValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dLongValue += it2.next().longValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i2);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Sequence<Short> sequence) {
        Iterator<Short> it2 = sequence.iterator();
        double dShortValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dShortValue += (double) it2.next().shortValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i2);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> chunked(@NotNull Sequence<? extends T> sequence, int i2) {
        return windowed(sequence, i2, i2, true);
    }

    public static final <T> boolean contains(@NotNull Sequence<? extends T> sequence, T t) {
        return indexOf(sequence, t) >= 0;
    }

    public static <T> int count(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i2;
    }

    @NotNull
    public static final <T> Sequence<T> distinct(@NotNull Sequence<? extends T> sequence) {
        return distinctBy(sequence, a.a);
    }

    @NotNull
    public static final <T, K> Sequence<T> distinctBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        return new DistinctSequence(sequence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> drop(@NotNull Sequence<? extends T> sequence, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return sequence;
            }
            return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).drop(i2) : new DropSequence(sequence, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> Sequence<T> dropWhile(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        return new DropWhileSequence(sequence, function1);
    }

    public static final <T> T elementAt(@NotNull Sequence<? extends T> sequence, int i2) {
        return (T) elementAtOrElse(sequence, i2, new b(i2));
    }

    public static final <T> T elementAtOrElse(@NotNull Sequence<? extends T> sequence, int i2, @NotNull Function1<? super Integer, ? extends T> function1) {
        if (i2 < 0) {
            return function1.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (T t : sequence) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t;
            }
            i3 = i4;
        }
        return function1.invoke(Integer.valueOf(i2));
    }

    @Nullable
    public static final <T> T elementAtOrNull(@NotNull Sequence<? extends T> sequence, int i2) {
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (T t : sequence) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t;
            }
            i3 = i4;
        }
        return null;
    }

    @NotNull
    public static <T> Sequence<T> filter(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        return new FilteringSequence(sequence, true, function1);
    }

    @NotNull
    public static final <T> Sequence<T> filterIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        return new TransformingSequence(new FilteringSequence(new IndexingSequence(sequence), true, new c(function2)), d.a);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function2.invoke(Integer.valueOf(i2), t).booleanValue()) {
                c2.add(t);
            }
            i2 = i3;
        }
        return c2;
    }

    public static final /* synthetic */ <R> Sequence<R> filterIsInstance(Sequence<?> sequence) {
        Intrinsics.needClassReification();
        return filter(sequence, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                Intrinsics.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Sequence<?> sequence, C c2) {
        for (Object obj : sequence) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @NotNull
    public static <T> Sequence<T> filterNot(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        return new FilteringSequence(sequence, false, function1);
    }

    @NotNull
    public static <T> Sequence<T> filterNotNull(@NotNull Sequence<? extends T> sequence) {
        return filterNot(sequence, e.a);
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2) {
        for (T t : sequence) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, Boolean> function1) {
        for (T t : sequence) {
            if (!function1.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, Boolean> function1) {
        for (T t : sequence) {
            if (function1.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static final <T> T first(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    @NotNull
    public static <T, R> Sequence<R> flatMap(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        return new FlatteningSequence(sequence, function1, g.a);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedIterable(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, function2, h.a);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, function2, i.a);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIterable(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        return new FlatteningSequence(sequence, function1, f.a);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterableTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(c2, function1.invoke(it2.next()));
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(c2, function1.invoke(it2.next()));
        }
        return c2;
    }

    public static final <T, R> R fold(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            r2 = function2.invoke(r2, it2.next());
        }
        return r2;
    }

    public static final <T, R> R foldIndexed(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r2 = function3.invoke(Integer.valueOf(i2), r2, t);
            i2 = i3;
        }
        return r2;
    }

    public static final <T> void forEach(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    public static final <T> void forEachIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function2.invoke(Integer.valueOf(i2), t);
            i2 = i3;
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequence) {
            K kInvoke = function1.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Sequence<? extends T> sequence, @NotNull M m2, @NotNull Function1<? super T, ? extends K> function1) {
        for (T t : sequence) {
            K kInvoke = function1.invoke(t);
            Object arrayList = m2.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m2.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m2;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final Sequence<? extends T> sequence, @NotNull final Function1<? super T, ? extends K> function1) {
        return new Grouping<T, K>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t) {
                return function1.invoke(t);
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<T> sourceIterator() {
                return sequence.iterator();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Sequence<T> i(Sequence<? extends T> sequence) {
        return sequence;
    }

    public static final <T> int indexOf(@NotNull Sequence<? extends T> sequence, T t) {
        int i2 = 0;
        for (T t2 : sequence) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, t2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        int i2 = 0;
        for (T t : sequence) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(t).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        int i2 = -1;
        int i3 = 0;
        for (T t : sequence) {
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(t).booleanValue()) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T j(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        for (T t : sequence) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull Sequence<? extends T> sequence, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : sequence) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            kotlin.text.e.appendElement(a2, t, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @NotNull
    public static final <T> String joinToString(@NotNull Sequence<? extends T> sequence, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(sequence, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sequence, charSequence, charSequence5, charSequence6, i4, charSequence7, function1);
    }

    @InlineOnly
    private static final <T> T k(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        T t = null;
        for (T t2 : sequence) {
            if (function1.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R l(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        R rInvoke;
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            rInvoke = function1.invoke(it2.next());
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    public static <T> T last(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(@NotNull Sequence<? extends T> sequence, T t) {
        int i2 = -1;
        int i3 = 0;
        for (T t2 : sequence) {
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, t2)) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R m(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            R rInvoke = function1.invoke(it2.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @NotNull
    public static <T, R> Sequence<R> map(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        return new TransformingSequence(sequence, function1);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        return new TransformingIndexedSequence(sequence, function2);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexedNotNull(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        return filterNotNull(new TransformingIndexedSequence(sequence, function2));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = function2.invoke(Integer.valueOf(i2), t);
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            c2.add(function2.invoke(Integer.valueOf(i2), t));
            i2 = i3;
        }
        return c2;
    }

    @NotNull
    public static <T, R> Sequence<R> mapNotNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        return filterNotNull(new TransformingSequence(sequence, function1));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            R rInvoke = function1.invoke(it2.next());
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Sequence<? extends T> sequence, @NotNull C c2, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            c2.add(function1.invoke(it2.next()));
        }
        return c2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (it2.hasNext()) {
            R rInvoke = function1.invoke(next);
            do {
                T next2 = it2.next();
                R rInvoke2 = function1.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it2.hasNext());
        }
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (!it2.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it2.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it2.hasNext());
        return (T) next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m4305maxOrNull(@NotNull Sequence<Double> sequence) {
        Iterator<Double> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = it2.next().doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it2.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (it2.hasNext()) {
            R rInvoke = function1.invoke(next);
            do {
                T next2 = it2.next();
                R rInvoke2 = function1.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it2.hasNext());
        }
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (!it2.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it2.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it2.hasNext());
        return (T) next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m4309minOrNull(@NotNull Sequence<Double> sequence) {
        Iterator<Double> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = it2.next().doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it2.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, final T t) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.1

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$1$a */
            public static final class a extends Lambda implements Function1<T, Boolean> {
                public final /* synthetic */ Ref.BooleanRef a;
                public final /* synthetic */ T b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Ref.BooleanRef booleanRef, T t) {
                    super(1);
                    this.a = booleanRef;
                    this.b = t;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t) {
                    boolean z = true;
                    if (!this.a.element && Intrinsics.areEqual(t, this.b)) {
                        this.a.element = true;
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return SequencesKt___SequencesKt.filter(sequence, new a(new Ref.BooleanRef(), t)).iterator();
            }
        };
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C n(Sequence<? extends T> sequence, C c2, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i2), t));
            i2 = i3;
        }
        return c2;
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> sequence) {
        return !sequence.iterator().hasNext();
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C o(Sequence<? extends T> sequence, C c2, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        int i2 = 0;
        for (T t : sequence) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i2), t));
            i2 = i3;
        }
        return c2;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> Sequence<T> onEach(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> function1) {
        return map(sequence, new j(function1));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> onEachIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        return mapIndexed(sequence, new k(function2));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double p(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(it2.next()).doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(it2.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : sequence) {
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, T t) {
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, SequencesKt__SequencesKt.sequenceOf(t)));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> float q(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, function1.invoke(it2.next()).floatValue());
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R r(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <S, T extends S> S reduce(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it2.next();
        while (it2.hasNext()) {
            next = function2.invoke(next, it2.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it2.next();
        int i2 = 1;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = function3.invoke(Integer.valueOf(i2), next, it2.next());
            i2 = i3;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        S next = it2.next();
        int i2 = 1;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = function3.invoke(Integer.valueOf(i2), next, it2.next());
            i2 = i3;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        S next = it2.next();
        while (it2.hasNext()) {
            next = function2.invoke(next, it2.next());
        }
        return next;
    }

    @NotNull
    public static final <T> Sequence<T> requireNoNulls(@NotNull Sequence<? extends T> sequence) {
        return map(sequence, new l(sequence));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFold(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        return SequencesKt__SequenceBuilderKt.sequence(new m(r2, sequence, function2, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFoldIndexed(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        return SequencesKt__SequenceBuilderKt.sequence(new n(r2, sequence, function3, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduce(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        return SequencesKt__SequenceBuilderKt.sequence(new o(sequence, function2, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduceIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        return SequencesKt__SequenceBuilderKt.sequence(new p(sequence, function3, null));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R s(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> Sequence<R> scan(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        return runningFold(sequence, r2, function2);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> Sequence<R> scanIndexed(@NotNull Sequence<? extends T> sequence, R r2, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        return runningFoldIndexed(sequence, r2, function3);
    }

    public static final <T> T single(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it2.next();
        if (it2.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (it2.hasNext()) {
            return null;
        }
        return next;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sorted(@NotNull final Sequence<? extends T> sequence) {
        return (Sequence<T>) new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sorted.1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                kotlin.collections.g.sort(mutableList);
                return mutableList.iterator();
            }
        };
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedByDescending(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sortedDescending(@NotNull Sequence<? extends T> sequence) {
        return sortedWith(sequence, ComparisonsKt__ComparisonsKt.reverseOrder());
    }

    @NotNull
    public static <T> Sequence<T> sortedWith(@NotNull final Sequence<? extends T> sequence, @NotNull final Comparator<? super T> comparator) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sortedWith.1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                kotlin.collections.g.sortWith(mutableList, comparator);
                return mutableList.iterator();
            }
        };
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Integer> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += function1.invoke(it2.next()).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it2.hasNext()) {
            dDoubleValue += function1.invoke(it2.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Sequence<Byte> sequence) {
        Iterator<Byte> it2 = sequence.iterator();
        int iByteValue = 0;
        while (it2.hasNext()) {
            iByteValue += it2.next().byteValue();
        }
        return iByteValue;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Sequence<Double> sequence) {
        Iterator<Double> it2 = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it2.hasNext()) {
            dDoubleValue += it2.next().doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Sequence<Float> sequence) {
        Iterator<Float> it2 = sequence.iterator();
        float fFloatValue = 0.0f;
        while (it2.hasNext()) {
            fFloatValue += it2.next().floatValue();
        }
        return fFloatValue;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Sequence<Integer> sequence) {
        Iterator<Integer> it2 = sequence.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += it2.next().intValue();
        }
        return iIntValue;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Sequence<Long> sequence) {
        Iterator<Long> it2 = sequence.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().longValue();
        }
        return jLongValue;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Sequence<Short> sequence) {
        Iterator<Short> it2 = sequence.iterator();
        int iShortValue = 0;
        while (it2.hasNext()) {
            iShortValue += it2.next().shortValue();
        }
        return iShortValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double t(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = function1.invoke(it2.next()).doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(it2.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    public static <T> Sequence<T> take(@NotNull Sequence<? extends T> sequence, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return SequencesKt__SequencesKt.emptySequence();
            }
            return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).take(i2) : new TakeSequence(sequence, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static <T> Sequence<T> takeWhile(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        return new TakeWhileSequence(sequence, function1);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Sequence<? extends T> sequence, @NotNull C c2) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            c2.add(it2.next());
        }
        return c2;
    }

    @NotNull
    public static <T> HashSet<T> toHashSet(@NotNull Sequence<? extends T> sequence) {
        return (HashSet) toCollection(sequence, new HashSet());
    }

    @NotNull
    public static <T> List<T> toList(@NotNull Sequence<? extends T> sequence) {
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(sequence));
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull Sequence<? extends T> sequence) {
        return (List) toCollection(sequence, new ArrayList());
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull Sequence<? extends T> sequence) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next());
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> toSet(@NotNull Sequence<? extends T> sequence) {
        return y.optimizeReadOnlySet((Set) toCollection(sequence, new LinkedHashSet()));
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Float u(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float fFloatValue = function1.invoke(it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, function1.invoke(it2.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R v(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R w(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> windowed(@NotNull Sequence<? extends T> sequence, int i2, int i3, boolean z) {
        return SlidingWindowKt.windowedSequence(sequence, i2, i3, z, false);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return windowed(sequence, i2, i3, z);
    }

    @NotNull
    public static final <T> Sequence<IndexedValue<T>> withIndex(@NotNull Sequence<? extends T> sequence) {
        return new IndexingSequence(sequence);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double x(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(it2.next()).doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(it2.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> float y(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.min(fFloatValue, function1.invoke(it2.next()).floatValue());
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R z(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it2.next());
        while (it2.hasNext()) {
            R rInvoke2 = function1.invoke(it2.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <T, R> Sequence<Pair<T, R>> zip(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> sequence2) {
        return new MergingSequence(sequence, sequence2, q.a);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<Pair<T, T>> zipWithNext(@NotNull Sequence<? extends T> sequence) {
        return zipWithNext(sequence, r.a);
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> chunked(@NotNull Sequence<? extends T> sequence, int i2, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        return windowed(sequence, i2, i2, true, function1);
    }

    public static final <T> int count(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final T[] tArr) {
        return tArr.length == 0 ? sequence : new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.2

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$2$a */
            public static final class a extends Lambda implements Function1<T, Boolean> {
                public final /* synthetic */ Collection<T> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Collection<? extends T> collection) {
                    super(1);
                    this.a = collection;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t) {
                    return Boolean.valueOf(this.a.contains(t));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return SequencesKt___SequencesKt.filterNot(sequence, new a(BrittleContainsOptimizationKt.convertToSetForSetOperation(tArr))).iterator();
            }
        };
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull T[] tArr) {
        return plus((Sequence) sequence, (Iterable) ArraysKt___ArraysJvmKt.asList(tArr));
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> windowed(@NotNull Sequence<? extends T> sequence, int i2, int i3, boolean z, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        return map(SlidingWindowKt.windowedSequence(sequence, i2, i3, z, true), function1);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i2, int i3, boolean z, Function1 function1, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return windowed(sequence, i2, i3, z, function1);
    }

    @NotNull
    public static final <T, R, V> Sequence<V> zip(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> sequence2, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        return new MergingSequence(sequence, sequence2, function2);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> zipWithNext(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        return SequencesKt__SequenceBuilderKt.sequence(new s(sequence, function2, null));
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Sequence<? extends T> sequence, @NotNull M m2, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        for (T t : sequence) {
            m2.put(function1.invoke(t), function2.invoke(t));
        }
        return m2;
    }

    @NotNull
    public static <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> iterable) {
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, CollectionsKt___CollectionsKt.asSequence(iterable)));
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequence) {
            linkedHashMap.put(function1.invoke(t), function2.invoke(t));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T firstOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        for (T t : sequence) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final Iterable<? extends T> iterable) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.3

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$3$a */
            public static final class a extends Lambda implements Function1<T, Boolean> {
                public final /* synthetic */ Collection<T> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Collection<? extends T> collection) {
                    super(1);
                    this.a = collection;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t) {
                    return Boolean.valueOf(this.a.contains(t));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                Collection collectionConvertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(iterable);
                return collectionConvertToSetForSetOperation.isEmpty() ? sequence.iterator() : SequencesKt___SequencesKt.filterNot(sequence, new a(collectionConvertToSetForSetOperation)).iterator();
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> sequence2) {
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, sequence2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final <T> T first(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        for (T t : sequence) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final Sequence<? extends T> sequence2) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.4

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$4$a */
            public static final class a extends Lambda implements Function1<T, Boolean> {
                public final /* synthetic */ Collection<T> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Collection<? extends T> collection) {
                    super(1);
                    this.a = collection;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t) {
                    return Boolean.valueOf(this.a.contains(t));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                Collection collectionConvertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(sequence2);
                return collectionConvertToSetForSetOperation.isEmpty() ? sequence.iterator() : SequencesKt___SequencesKt.filterNot(sequence, new a(collectionConvertToSetForSetOperation)).iterator();
            }
        };
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        boolean z = false;
        T t = null;
        for (T t2 : sequence) {
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        T t = null;
        for (T t2 : sequence) {
            if (function1.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T last(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        T t = null;
        boolean z = false;
        for (T t2 : sequence) {
            if (function1.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T single(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        T t = null;
        boolean z = false;
        for (T t2 : sequence) {
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Sequence<? extends T> sequence, @NotNull M m2, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        for (T t : sequence) {
            K kInvoke = function1.invoke(t);
            Object arrayList = m2.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m2.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(t));
        }
        return m2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m4306maxOrNull(@NotNull Sequence<Float> sequence) {
        Iterator<Float> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float fFloatValue = it2.next().floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it2.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m4310minOrNull(@NotNull Sequence<Float> sequence) {
        Iterator<Float> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float fFloatValue = it2.next().floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it2.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequence) {
            K kInvoke = function1.invoke(t);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(t));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }
}
