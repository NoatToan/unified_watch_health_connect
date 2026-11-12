package a73;

import org.apache.commons.lang3.function.FailableFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements FailableFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableFunction f1831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableFunction f1832c;

    public /* synthetic */ e0(FailableFunction failableFunction, FailableFunction failableFunction2, int i14) {
        this.f1830a = i14;
        this.f1831b = failableFunction;
        this.f1832c = failableFunction2;
    }

    @Override // org.apache.commons.lang3.function.FailableFunction
    public final Object apply(Object obj) {
        switch (this.f1830a) {
            case 0:
                return this.f1831b.lambda$compose$3(this.f1832c, obj);
            default:
                return this.f1831b.lambda$andThen$2(this.f1832c, obj);
        }
    }
}
