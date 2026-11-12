package ty2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p005kotlin.Metadata;
import wy2.f;
import xy2.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lty2/a;", "Ljava/lang/reflect/InvocationHandler;", "Lxy2/j;", "", "Lwy2/f;", "Lcom/garmin/uisynthesizer/synthesize/invocation/InvocationHandler;", "invocationHandler", "<init>", "(Lxy2/j;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<Object, f> f167281a;

    public a(j<? extends Object, ? super f> jVar) {
        jVar.getClass();
        this.f167281a = jVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        return this.f167281a.invoke(new f(obj, method, objArr));
    }
}
