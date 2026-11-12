package a73;

import java.util.function.BiFunction;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBiFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements BiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1839b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f1838a = i14;
        this.f1839b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f1838a) {
            case 0:
                return Failable.apply((FailableBiFunction) this.f1839b, obj, obj2);
            default:
                return Functions.apply((Functions.FailableBiFunction) this.f1839b, obj, obj2);
        }
    }
}
