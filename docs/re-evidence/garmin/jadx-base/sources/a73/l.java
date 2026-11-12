package a73;

import java.util.function.BiConsumer;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1857b;

    public /* synthetic */ l(Object obj, int i14) {
        this.f1856a = i14;
        this.f1857b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i14 = this.f1856a;
        Object obj3 = this.f1857b;
        switch (i14) {
            case 0:
                Failable.accept((FailableBiConsumer) obj3, obj, obj2);
                break;
            case 1:
                ((m92.c) obj3).invoke(obj, obj2);
                break;
            case 2:
                ((ml2.l) obj3).k(((Integer) obj).intValue(), (byte[]) obj2);
                break;
            case 3:
                Functions.accept((Functions.FailableBiConsumer) obj3, obj, obj2);
                break;
            default:
                int i15 = ot.l.f133614q;
                ((mw1.b) obj3).invoke(obj, obj2);
                break;
        }
    }
}
