package org.apache.commons.lang3;

import org.apache.commons.lang3.function.FailableBiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements FailableBiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133452b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f133451a = i14;
        this.f133452b = obj;
    }

    @Override // org.apache.commons.lang3.function.FailableBiConsumer
    public final void accept(Object obj, Object obj2) throws InterruptedException {
        switch (this.f133451a) {
            case 0:
                this.f133452b.wait(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
            default:
                ((Thread) this.f133452b).join(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
        }
    }
}
