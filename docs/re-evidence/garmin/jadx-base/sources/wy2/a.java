package wy2;

import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import uy2.b1;
import xy2.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwy2/a;", "T", "Lxy2/k;", "", "Lwy2/f;", "Lcom/garmin/uisynthesizer/synthesize/invocation/InvocationInterceptor;", "actual", "<init>", "(Ljava/lang/Object;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> implements k<Object, f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f188080a;

    public a(T t7) {
        this.f188080a = t7;
    }

    @Override // xy2.k
    public final Object a(xy2.d<Object, f> dVar) {
        Method method = dVar.f192723b.f188120b;
        Annotation[] annotations = method.getAnnotations();
        annotations.getClass();
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (uy2.a.class.isInstance(annotation)) {
                arrayList.add(annotation);
            }
        }
        uy2.a aVar = (uy2.a) h0.K0(arrayList);
        if (aVar == null) {
            return dVar.a();
        }
        if (!s.g(method.getReturnType(), Void.TYPE)) {
            throw new SynthesizerException("Cannot override " + method);
        }
        Object objA = l23.f.a(s0.f105811a.b(aVar.providerClass()));
        objA.getClass();
        ((b1) objA).a(this.f188080a);
        return null;
    }
}
