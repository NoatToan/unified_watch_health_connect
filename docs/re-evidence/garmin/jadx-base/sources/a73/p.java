package a73;

import org.apache.commons.lang3.function.FailableBiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements FailableBiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1871a;

    public /* synthetic */ p(int i14) {
        this.f1871a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableBiConsumer
    public final void accept(Object obj, Object obj2) throws InterruptedException {
        switch (this.f1871a) {
            case 0:
                FailableBiConsumer.lambda$static$0(obj, obj2);
                break;
            default:
                Thread.sleep(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
        }
    }
}
