package o23;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.s;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\nB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lo23/j;", "Lo23/h;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "b", "a", "Lo23/j$a;", "Lo23/j$b;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j implements h<Method> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f128723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Type> f128724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f128725c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/j$a;", "Lo23/j;", "Lo23/g;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends j implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f128726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, j0.f134944a, null);
            method.getClass();
            this.f128726d = obj;
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            return this.f128723a.invoke(this.f128726d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/j$b;", "Lo23/j;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, w.c(method.getDeclaringClass()), null);
            method.getClass();
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            Object obj = objArr[0];
            int i14 = i.f128708e;
            Object[] objArrL = objArr.length <= 1 ? new Object[0] : s.l(1, objArr.length, objArr);
            return this.f128723a.invoke(obj, Arrays.copyOf(objArrL, objArrL.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j(Method method, List<? extends Type> list) {
        this.f128723a = method;
        this.f128724b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f128725c = returnType;
    }

    @Override // o23.h
    public final /* bridge */ boolean a() {
        return false;
    }

    @Override // o23.h
    public final List<Type> b() {
        return this.f128724b;
    }

    @Override // o23.h
    public final /* bridge */ /* synthetic */ Member c() {
        return null;
    }

    public final void d(Object[] objArr) {
        objArr.getClass();
        List<Type> list = this.f128724b;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Callable expects ");
        sb3.append(list.size());
        sb3.append(" arguments, but ");
        vb.h.s(am.j.q(sb3, objArr.length, " were provided."));
    }

    @Override // o23.h
    /* JADX INFO: renamed from: getReturnType */
    public final Type getF128710b() {
        return this.f128725c;
    }

    public /* synthetic */ j(Method method, List list, p005kotlin.jvm.internal.j jVar) {
        this(method, list);
    }
}
