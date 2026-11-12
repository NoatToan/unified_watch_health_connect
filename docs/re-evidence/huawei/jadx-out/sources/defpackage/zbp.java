package defpackage;

import com.huawei.hms.network.embedded.n1;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "<init>", "()V", "notOnJava9", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "cache", "getModuleName", "", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "buildCache", n1.f15105b, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zbp {
    private static e e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zbp f53965c = new zbp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f53964b = new e(null, null, null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f53966a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f53967c;
        public final Method d;

        public e(Method method, Method method2, Method method3) {
            this.f53966a = method;
            this.f53967c = method2;
            this.d = method3;
        }
    }

    private zbp() {
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        zcp.c(baseContinuationImpl, "");
        e eVarE = e;
        if (eVarE == null) {
            eVarE = e(baseContinuationImpl);
        }
        if (eVarE != f53964b && (method = eVarE.f53966a) != null && (objInvoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) != null && (method2 = eVarE.f53967c) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = eVarE.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }

    private final e e(BaseContinuationImpl baseContinuationImpl) {
        try {
            e eVar = new e(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            e = eVar;
            return eVar;
        } catch (Exception unused) {
            e eVar2 = f53964b;
            e = eVar2;
            return eVar2;
        }
    }
}
