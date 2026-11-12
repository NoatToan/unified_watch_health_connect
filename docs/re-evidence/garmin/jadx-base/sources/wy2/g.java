package wy2;

import java.lang.reflect.Method;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xy2.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwy2/g;", "Lxy2/k;", "", "Lwy2/f;", "Lcom/garmin/uisynthesizer/synthesize/invocation/InvocationInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements k<Object, f> {
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    @Override // xy2.k
    public final Object a(xy2.d<Object, f> dVar) {
        Method method = dVar.f192723b.f188120b;
        if (s.g(method.getDeclaringClass(), sy2.d.class)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0) {
                if (s.g(method.getReturnType(), Void.TYPE)) {
                    oi0.c.W(-1, new vy2.a(dVar, 6));
                    return null;
                }
            }
        } else if (s.g(method.getReturnType(), Void.TYPE)) {
            oi0.c.W(-1, new vy2.a(dVar, 6));
            return null;
        }
        return dVar.a();
    }
}
