package v13;

import java.lang.reflect.Method;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv13/f;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f174831a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f174832b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f174833c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv13/f$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f174834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f174835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f174836c;

        public a(Method method, Method method2, Method method3) {
            this.f174834a = method;
            this.f174835b = method2;
            this.f174836c = method3;
        }
    }

    private f() {
    }

    public static String a(v13.a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        a aVar2 = f174833c;
        a aVar3 = f174832b;
        if (aVar2 == null) {
            try {
                a aVar4 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f174833c = aVar4;
                aVar2 = aVar4;
            } catch (Exception unused) {
                f174833c = aVar3;
                aVar2 = aVar3;
            }
        }
        if (aVar2 == aVar3 || (method = aVar2.f174834a) == null || (objInvoke = method.invoke(aVar.getClass(), null)) == null || (method2 = aVar2.f174835b) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = aVar2.f174836c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
