package v2;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f175071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f175072c;

    public /* synthetic */ k(IntConsumer intConsumer, int i14, int i15) {
        this.f175070a = i15;
        this.f175071b = intConsumer;
        this.f175072c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f175070a;
        int i15 = this.f175072c;
        IntConsumer intConsumer = this.f175071b;
        switch (i14) {
            case 0:
                l lVar = l.f175077a;
                intConsumer.accept(i15);
                break;
            default:
                m mVar = m.f175085a;
                intConsumer.accept(i15);
                break;
        }
    }
}
