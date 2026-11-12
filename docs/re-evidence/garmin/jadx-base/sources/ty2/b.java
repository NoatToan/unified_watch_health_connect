package ty2;

import e23.p;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import k23.d;
import p005kotlin.Metadata;
import wy2.e;
import xy2.c;
import xy2.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lty2/b;", "", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f167282a = new b();

    private b() {
    }

    public static Object a(d dVar, Object obj, k... kVarArr) {
        Class clsU = dh.b.u(dVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(clsU.getClassLoader(), new Class[]{clsU}, new a(new c(new e(obj), (k[]) Arrays.copyOf(kVarArr, kVarArr.length))));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static Object b(Class cls, p pVar, k... kVarArr) {
        cls.getClass();
        pVar.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(new c(new wy2.d(pVar), (k[]) Arrays.copyOf(kVarArr, kVarArr.length))));
    }
}
