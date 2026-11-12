package rx.functions;

import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes23.dex */
public final class Actions {
    private static final m a = new m();

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T8, T9, T1, T2, T3] */
    public static class a<R, T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {
        public final /* synthetic */ Action9 a;
        public final /* synthetic */ Object b;

        public a(Action9 action9, Object obj) {
            this.a = action9;
            this.b = obj;
        }

        @Override // rx.functions.Func9
        public R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
            this.a.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class b<R> implements FuncN<R> {
        public final /* synthetic */ ActionN a;
        public final /* synthetic */ Object b;

        public b(ActionN actionN, Object obj) {
            this.a = actionN;
            this.b = obj;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            this.a.call(objArr);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class c<R> implements Func0<R> {
        public final /* synthetic */ Action0 a;
        public final /* synthetic */ Object b;

        public c(Action0 action0, Object obj) {
            this.a = action0;
            this.b = obj;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public R call() {
            this.a.call();
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1] */
    public static class d<R, T1> implements Func1<T1, R> {
        public final /* synthetic */ Action1 a;
        public final /* synthetic */ Object b;

        public d(Action1 action1, Object obj) {
            this.a = action1;
            this.b = obj;
        }

        @Override // rx.functions.Func1
        public R call(T1 t1) {
            this.a.call(t1);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2] */
    public static class e<R, T1, T2> implements Func2<T1, T2, R> {
        public final /* synthetic */ Action2 a;
        public final /* synthetic */ Object b;

        public e(Action2 action2, Object obj) {
            this.a = action2;
            this.b = obj;
        }

        @Override // rx.functions.Func2
        public R call(T1 t1, T2 t2) {
            this.a.call(t1, t2);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2, T3] */
    public static class f<R, T1, T2, T3> implements Func3<T1, T2, T3, R> {
        public final /* synthetic */ Action3 a;
        public final /* synthetic */ Object b;

        public f(Action3 action3, Object obj) {
            this.a = action3;
            this.b = obj;
        }

        @Override // rx.functions.Func3
        public R call(T1 t1, T2 t2, T3 t3) {
            this.a.call(t1, t2, t3);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, R, T1, T2, T3] */
    public static class g<R, T1, T2, T3, T4> implements Func4<T1, T2, T3, T4, R> {
        public final /* synthetic */ Action4 a;
        public final /* synthetic */ Object b;

        public g(Action4 action4, Object obj) {
            this.a = action4;
            this.b = obj;
        }

        @Override // rx.functions.Func4
        public R call(T1 t1, T2 t2, T3 t3, T4 t4) {
            this.a.call(t1, t2, t3, t4);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, R, T1, T2, T3] */
    public static class h<R, T1, T2, T3, T4, T5> implements Func5<T1, T2, T3, T4, T5, R> {
        public final /* synthetic */ Action5 a;
        public final /* synthetic */ Object b;

        public h(Action5 action5, Object obj) {
            this.a = action5;
            this.b = obj;
        }

        @Override // rx.functions.Func5
        public R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            this.a.call(t1, t2, t3, t4, t5);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T1, T2, T3] */
    public static class i<R, T1, T2, T3, T4, T5, T6> implements Func6<T1, T2, T3, T4, T5, T6, R> {
        public final /* synthetic */ Action6 a;
        public final /* synthetic */ Object b;

        public i(Action6 action6, Object obj) {
            this.a = action6;
            this.b = obj;
        }

        @Override // rx.functions.Func6
        public R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            this.a.call(t1, t2, t3, t4, t5, t6);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T1, T2, T3] */
    public static class j<R, T1, T2, T3, T4, T5, T6, T7> implements Func7<T1, T2, T3, T4, T5, T6, T7, R> {
        public final /* synthetic */ Action7 a;
        public final /* synthetic */ Object b;

        public j(Action7 action7, Object obj) {
            this.a = action7;
            this.b = obj;
        }

        @Override // rx.functions.Func7
        public R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            this.a.call(t1, t2, t3, t4, t5, t6, t7);
            return (R) this.b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T8, T1, T2, T3] */
    public static class k<R, T1, T2, T3, T4, T5, T6, T7, T8> implements Func8<T1, T2, T3, T4, T5, T6, T7, T8, R> {
        public final /* synthetic */ Action8 a;
        public final /* synthetic */ Object b;

        public k(Action8 action8, Object obj) {
            this.a = action8;
            this.b = obj;
        }

        @Override // rx.functions.Func8
        public R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            this.a.call(t1, t2, t3, t4, t5, t6, t7, t8);
            return (R) this.b;
        }
    }

    public static final class l<T> implements Action1<T> {
        public final Action0 a;

        public l(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.functions.Action1
        public void call(T t) {
            this.a.call();
        }
    }

    public static final class m<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements Action0, Action1<T0>, Action2<T0, T1>, Action3<T0, T1, T2>, Action4<T0, T1, T2, T3>, Action5<T0, T1, T2, T3, T4>, Action6<T0, T1, T2, T3, T4, T5>, Action7<T0, T1, T2, T3, T4, T5, T6>, Action8<T0, T1, T2, T3, T4, T5, T6, T7>, Action9<T0, T1, T2, T3, T4, T5, T6, T7, T8>, ActionN {
        @Override // rx.functions.Action0
        public void call() {
        }

        @Override // rx.functions.Action1
        public void call(T0 t0) {
        }

        @Override // rx.functions.Action2
        public void call(T0 t0, T1 t1) {
        }

        @Override // rx.functions.Action3
        public void call(T0 t0, T1 t1, T2 t2) {
        }

        @Override // rx.functions.Action4
        public void call(T0 t0, T1 t1, T2 t2, T3 t3) {
        }

        @Override // rx.functions.Action5
        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4) {
        }

        @Override // rx.functions.Action6
        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        }

        @Override // rx.functions.Action7
        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        }

        @Override // rx.functions.Action8
        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        }

        @Override // rx.functions.Action9
        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        }

        @Override // rx.functions.ActionN
        public void call(Object... objArr) {
        }
    }

    public enum n implements Action1<Throwable> {
        INSTANCE;

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    private Actions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> m<T0, T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return a;
    }

    public static Action1<Throwable> errorNotImplemented() {
        return n.INSTANCE;
    }

    public static <T> Action1<T> toAction1(Action0 action0) {
        return new l(action0);
    }

    public static Func0<Void> toFunc(Action0 action0) {
        return toFunc(action0, (Object) null);
    }

    public static <T1> Func1<T1, Void> toFunc(Action1<T1> action1) {
        return toFunc(action1, (Object) null);
    }

    public static <T1, T2> Func2<T1, T2, Void> toFunc(Action2<T1, T2> action2) {
        return toFunc(action2, (Object) null);
    }

    public static <T1, T2, T3> Func3<T1, T2, T3, Void> toFunc(Action3<T1, T2, T3> action3) {
        return toFunc(action3, (Object) null);
    }

    public static <T1, T2, T3, T4> Func4<T1, T2, T3, T4, Void> toFunc(Action4<T1, T2, T3, T4> action4) {
        return toFunc(action4, (Object) null);
    }

    public static <T1, T2, T3, T4, T5> Func5<T1, T2, T3, T4, T5, Void> toFunc(Action5<T1, T2, T3, T4, T5> action5) {
        return toFunc(action5, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6> Func6<T1, T2, T3, T4, T5, T6, Void> toFunc(Action6<T1, T2, T3, T4, T5, T6> action6) {
        return toFunc(action6, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Func7<T1, T2, T3, T4, T5, T6, T7, Void> toFunc(Action7<T1, T2, T3, T4, T5, T6, T7> action7) {
        return toFunc(action7, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Func8<T1, T2, T3, T4, T5, T6, T7, T8, Void> toFunc(Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8) {
        return toFunc(action8, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Void> toFunc(Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9) {
        return toFunc(action9, (Object) null);
    }

    public static FuncN<Void> toFunc(ActionN actionN) {
        return toFunc(actionN, (Object) null);
    }

    public static <R> Func0<R> toFunc(Action0 action0, R r) {
        return new c(action0, r);
    }

    public static <T1, R> Func1<T1, R> toFunc(Action1<T1> action1, R r) {
        return new d(action1, r);
    }

    public static <T1, T2, R> Func2<T1, T2, R> toFunc(Action2<T1, T2> action2, R r) {
        return new e(action2, r);
    }

    public static <T1, T2, T3, R> Func3<T1, T2, T3, R> toFunc(Action3<T1, T2, T3> action3, R r) {
        return new f(action3, r);
    }

    public static <T1, T2, T3, T4, R> Func4<T1, T2, T3, T4, R> toFunc(Action4<T1, T2, T3, T4> action4, R r) {
        return new g(action4, r);
    }

    public static <T1, T2, T3, T4, T5, R> Func5<T1, T2, T3, T4, T5, R> toFunc(Action5<T1, T2, T3, T4, T5> action5, R r) {
        return new h(action5, r);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Func6<T1, T2, T3, T4, T5, T6, R> toFunc(Action6<T1, T2, T3, T4, T5, T6> action6, R r) {
        return new i(action6, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Func7<T1, T2, T3, T4, T5, T6, T7, R> toFunc(Action7<T1, T2, T3, T4, T5, T6, T7> action7, R r) {
        return new j(action7, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Func8<T1, T2, T3, T4, T5, T6, T7, T8, R> toFunc(Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8, R r) {
        return new k(action8, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> toFunc(Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9, R r) {
        return new a(action9, r);
    }

    public static <R> FuncN<R> toFunc(ActionN actionN, R r) {
        return new b(actionN, r);
    }
}
