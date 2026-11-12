package y63;

import java.util.function.Function;
import org.apache.commons.io.function.IOFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements IOFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOFunction f194623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f194624c;

    public /* synthetic */ b(IOFunction iOFunction, Function function, int i14) {
        this.f194622a = i14;
        this.f194623b = iOFunction;
        this.f194624c = function;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        switch (this.f194622a) {
            case 0:
                return this.f194623b.lambda$compose$1(this.f194624c, obj);
            default:
                return this.f194623b.lambda$andThen$5(this.f194624c, obj);
        }
    }
}
