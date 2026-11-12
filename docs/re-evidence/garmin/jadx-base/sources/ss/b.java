package ss;

import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements ToDoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160594a;

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.f160594a) {
            case 0:
                Double d14 = (Double) obj;
                d14.getClass();
                return d14.doubleValue();
            default:
                Double d15 = (Double) obj;
                d15.getClass();
                return d15.doubleValue();
        }
    }
}
