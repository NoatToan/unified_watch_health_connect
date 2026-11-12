package a73;

import java.util.function.BiPredicate;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBiPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements BiPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1815b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f1814a = i14;
        this.f1815b = obj;
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        switch (this.f1814a) {
            case 0:
                return Failable.test((FailableBiPredicate) this.f1815b, obj, obj2);
            default:
                return Functions.test((Functions.FailableBiPredicate) this.f1815b, obj, obj2);
        }
    }
}
