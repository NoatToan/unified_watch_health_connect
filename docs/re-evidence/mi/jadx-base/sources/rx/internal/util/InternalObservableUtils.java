package rx.internal.util;

import defpackage.aua;
import defpackage.dmq;
import defpackage.ifl;
import defpackage.jbh;
import defpackage.p4h;
import defpackage.qe4;
import defpackage.tc0;
import defpackage.uc0;
import defpackage.yta;
import defpackage.zta;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public enum InternalObservableUtils {
    ;

    public static final h LONG_COUNTER = new aua<Long, Object, Long>() { // from class: rx.internal.util.InternalObservableUtils.h
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Long l2, Object obj) {
            return Long.valueOf(l2.longValue() + 1);
        }
    };
    public static final f OBJECT_EQUALS = new aua<Object, Object, Boolean>() { // from class: rx.internal.util.InternalObservableUtils.f
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    };
    public static final q TO_ARRAY = new zta<List<? extends p4h<?>>, p4h<?>[]>() { // from class: rx.internal.util.InternalObservableUtils.q
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h<?>[] call(List<? extends p4h<?>> list) {
            return (p4h[]) list.toArray(new p4h[list.size()]);
        }
    };
    static final o RETURNS_VOID = new o();
    public static final g COUNTER = new aua<Integer, Object, Integer>() { // from class: rx.internal.util.InternalObservableUtils.g
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    };
    static final e ERROR_EXTRACTOR = new e();
    public static final tc0<Throwable> ERROR_NOT_IMPLEMENTED = new tc0<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.c
        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final p4h.b<Boolean, Object> IS_EMPTY = new jbh(dmq.a(), true);

    public static final class a<T, R> implements aua<R, T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uc0<R, ? super T> f33007a;

        public a(uc0<R, ? super T> uc0Var) {
            this.f33007a = uc0Var;
        }

        @Override // defpackage.aua
        public R a(R r2, T t) {
            this.f33007a.a(r2, t);
            return r2;
        }
    }

    public static final class b implements zta<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f33008a;

        public b(Object obj) {
            this.f33008a = obj;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            Object obj2 = this.f33008a;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    public static final class d implements zta<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f33009a;

        public d(Class<?> cls) {
            this.f33009a = cls;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f33009a.isInstance(obj));
        }
    }

    public static final class e implements zta<Notification<?>, Throwable> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Notification<?> notification) {
            return notification.b();
        }
    }

    public static final class i implements zta<p4h<? extends Notification<?>>, p4h<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zta<? super p4h<? extends Void>, ? extends p4h<?>> f33010a;

        public i(zta<? super p4h<? extends Void>, ? extends p4h<?>> ztaVar) {
            this.f33010a = ztaVar;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h<?> call(p4h<? extends Notification<?>> p4hVar) {
            return this.f33010a.call(p4hVar.j(InternalObservableUtils.RETURNS_VOID));
        }
    }

    public static final class j<T> implements yta<qe4<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p4h<T> f33011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33012b;

        public j(p4h<T> p4hVar, int i) {
            this.f33011a = p4hVar;
            this.f33012b = i;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qe4<T> call() {
            return this.f33011a.p(this.f33012b);
        }
    }

    public static final class k<T> implements yta<qe4<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeUnit f33013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p4h<T> f33014b;
        public final long c;
        public final ifl d;

        public k(p4h<T> p4hVar, long j, TimeUnit timeUnit, ifl iflVar) {
            this.f33013a = timeUnit;
            this.f33014b = p4hVar;
            this.c = j;
            this.d = iflVar;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qe4<T> call() {
            return this.f33014b.r(this.c, this.f33013a, this.d);
        }
    }

    public static final class l<T> implements yta<qe4<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p4h<T> f33015a;

        public l(p4h<T> p4hVar) {
            this.f33015a = p4hVar;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qe4<T> call() {
            return this.f33015a.o();
        }
    }

    public static final class m<T> implements yta<qe4<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f33016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeUnit f33017b;
        public final ifl c;
        public final int d;
        public final p4h<T> e;

        public m(p4h<T> p4hVar, int i, long j, TimeUnit timeUnit, ifl iflVar) {
            this.f33016a = j;
            this.f33017b = timeUnit;
            this.c = iflVar;
            this.d = i;
            this.e = p4hVar;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qe4<T> call() {
            return this.e.q(this.d, this.f33016a, this.f33017b, this.c);
        }
    }

    public static final class n implements zta<p4h<? extends Notification<?>>, p4h<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zta<? super p4h<? extends Throwable>, ? extends p4h<?>> f33018a;

        public n(zta<? super p4h<? extends Throwable>, ? extends p4h<?>> ztaVar) {
            this.f33018a = ztaVar;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h<?> call(p4h<? extends Notification<?>> p4hVar) {
            return this.f33018a.call(p4hVar.j(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    public static final class o implements zta<Object, Void> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    }

    public static final class p<T, R> implements zta<p4h<T>, p4h<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zta<? super p4h<T>, ? extends p4h<R>> f33019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ifl f33020b;

        public p(zta<? super p4h<T>, ? extends p4h<R>> ztaVar, ifl iflVar) {
            this.f33019a = ztaVar;
            this.f33020b = iflVar;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h<R> call(p4h<T> p4hVar) {
            return this.f33019a.call(p4hVar).l(this.f33020b);
        }
    }

    public static <T, R> aua<R, T, R> createCollectorCaller(uc0<R, ? super T> uc0Var) {
        return new a(uc0Var);
    }

    public static zta<p4h<? extends Notification<?>>, p4h<?>> createRepeatDematerializer(zta<? super p4h<? extends Void>, ? extends p4h<?>> ztaVar) {
        return new i(ztaVar);
    }

    public static <T, R> zta<p4h<T>, p4h<R>> createReplaySelectorAndObserveOn(zta<? super p4h<T>, ? extends p4h<R>> ztaVar, ifl iflVar) {
        return new p(ztaVar, iflVar);
    }

    public static <T> yta<qe4<T>> createReplaySupplier(p4h<T> p4hVar) {
        return new l(p4hVar);
    }

    public static zta<p4h<? extends Notification<?>>, p4h<?>> createRetryDematerializer(zta<? super p4h<? extends Throwable>, ? extends p4h<?>> ztaVar) {
        return new n(ztaVar);
    }

    public static zta<Object, Boolean> equalsWith(Object obj) {
        return new b(obj);
    }

    public static zta<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static <T> yta<qe4<T>> createReplaySupplier(p4h<T> p4hVar, int i2) {
        return new j(p4hVar, i2);
    }

    public static <T> yta<qe4<T>> createReplaySupplier(p4h<T> p4hVar, long j2, TimeUnit timeUnit, ifl iflVar) {
        return new k(p4hVar, j2, timeUnit, iflVar);
    }

    public static <T> yta<qe4<T>> createReplaySupplier(p4h<T> p4hVar, int i2, long j2, TimeUnit timeUnit, ifl iflVar) {
        return new m(p4hVar, i2, j2, timeUnit, iflVar);
    }
}
