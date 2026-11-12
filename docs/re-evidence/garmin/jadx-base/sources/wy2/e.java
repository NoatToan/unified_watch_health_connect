package wy2;

import java.lang.reflect.Method;
import java.util.Arrays;
import p005kotlin.Metadata;
import xy2.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwy2/e;", "T", "Lxy2/j;", "", "Lwy2/f;", "Lcom/garmin/uisynthesizer/synthesize/invocation/InvocationHandler;", "actual", "<init>", "(Ljava/lang/Object;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements j<Object, f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f188118a;

    public e(T t7) {
        this.f188118a = t7;
    }

    @Override // xy2.j
    public final Object invoke(f fVar) {
        f fVar2 = fVar;
        fVar2.getClass();
        Method method = fVar2.f188120b;
        Object[] objArr = fVar2.f188121c;
        return method.invoke(this.f188118a, Arrays.copyOf(objArr, objArr.length));
    }
}
