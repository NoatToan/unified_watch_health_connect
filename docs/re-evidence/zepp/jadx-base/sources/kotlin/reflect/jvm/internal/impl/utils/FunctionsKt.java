package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FunctionsKt {

    @NotNull
    private static final Function1<Object, Object> a = f.a;

    @NotNull
    private static final Function1<Object, Boolean> b = b.a;

    @NotNull
    private static final Function1<Object, Object> c = a.a;

    @NotNull
    private static final Function1<Object, Unit> d = c.a;

    @NotNull
    private static final Function2<Object, Object, Unit> e = d.a;

    @NotNull
    private static final Function3<Object, Object, Object, Unit> f = e.a;

    public static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@Nullable Object obj) {
            return null;
        }
    }

    public static final class b extends Lambda implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable Object obj) {
            return Boolean.TRUE;
        }
    }

    public static final class c extends Lambda implements Function1<Object, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Object obj) {
        }
    }

    public static final class d extends Lambda implements Function2<Object, Object, Unit> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        public final void a(@Nullable Object obj, @Nullable Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            a(obj, obj2);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function3<Object, Object, Object, Unit> {
        public static final e a = new e();

        public e() {
            super(3);
        }

        public final void a(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            a(obj, obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1<Object, Object> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    }

    @NotNull
    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return (Function1<T, Boolean>) b;
    }

    @NotNull
    public static final Function3<Object, Object, Object, Unit> getDO_NOTHING_3() {
        return f;
    }
}
