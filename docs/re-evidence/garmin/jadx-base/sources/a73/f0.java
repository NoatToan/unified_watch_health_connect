package a73;

import org.apache.commons.lang3.function.FailableFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements FailableFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1837a;

    public /* synthetic */ f0(int i14) {
        this.f1837a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableFunction
    public final Object apply(Object obj) {
        switch (this.f1837a) {
            case 0:
                return FailableFunction.lambda$static$0(obj);
            default:
                return FailableFunction.lambda$identity$1(obj);
        }
    }
}
