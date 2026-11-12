package a73;

import java.util.function.Supplier;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableSupplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1829b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f1828a = i14;
        this.f1829b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f1828a) {
            case 0:
                return Failable.get((FailableSupplier) this.f1829b);
            default:
                return Functions.get((Functions.FailableSupplier) this.f1829b);
        }
    }
}
