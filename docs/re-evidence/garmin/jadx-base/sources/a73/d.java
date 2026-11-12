package a73;

import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements FailableConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1824a;

    public /* synthetic */ d(int i14) {
        this.f1824a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableConsumer
    public final void accept(Object obj) {
        switch (this.f1824a) {
            case 0:
                Failable.rethrow((Throwable) obj);
                break;
            default:
                FailableConsumer.lambda$static$0(obj);
                break;
        }
    }
}
