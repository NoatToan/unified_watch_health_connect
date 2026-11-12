package me;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.mapbox.common.HttpHeaders;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lme/d;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "b", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f117955a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/d$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "Lk23/d;", "clazz", "Lkotlin/Function1;", "", "consumer", "<init>", "(Lk23/d;Le23/l;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k23.d<T> f117956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<T, Unit> f117957b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k23.d<T> dVar, e23.l<? super T, Unit> lVar) {
            dVar.getClass();
            lVar.getClass();
            this.f117956a = dVar;
            this.f117957b = lVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            boolean zG = s.g(method.getName(), HttpHeaders.ACCEPT);
            e23.l<T, Unit> lVar = this.f117957b;
            if (zG && objArr != null && objArr.length == 1) {
                Object obj2 = objArr[0];
                k23.d<T> dVar = this.f117956a;
                if (dVar.q(obj2)) {
                    obj2.getClass();
                    lVar.invoke((T) obj2);
                    return Unit.INSTANCE;
                }
                throw new ClassCastException("Value cannot be cast to " + dVar.w());
            }
            if (s.g(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (s.g(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(lVar.hashCode());
            }
            if (s.g(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return lVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public interface b {
        void dispose();
    }

    public d(ClassLoader classLoader) {
        classLoader.getClass();
        this.f117955a = classLoader;
    }

    public final e a(Object obj, k23.d dVar, Activity activity, qe.c.a aVar) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        obj.getClass();
        dVar.getClass();
        activity.getClass();
        a aVar2 = new a(dVar, aVar);
        ClassLoader classLoader = this.f117955a;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, aVar2);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new e(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }
}
