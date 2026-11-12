package as2;

import com.airbnb.lottie.LottieCompositionFactory;
import e13.o;
import java.io.InputStream;
import java.util.concurrent.Callable;
import q03.r;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12698d;

    public /* synthetic */ e(boolean z14, String str, int i14, Object obj) {
        this.f12695a = i14;
        this.f12698d = obj;
        this.f12696b = str;
        this.f12697c = z14;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f12695a;
        boolean z14 = this.f12697c;
        String str = this.f12696b;
        Object obj = this.f12698d;
        switch (i14) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.f12703d.compareAndSet(false, true)) {
                    return z03.f.f200765a;
                }
                r balance = fVar.f12701b.getBalance();
                a73.j jVar = new a73.j(new a42.i(14, fVar, str), 22);
                int i15 = w03.b.f181178a;
                return new z03.j(new e13.h(new e13.e(new o(balance, jVar), new a73.j(new ad0.f(z14, fVar, str), 18)), new a73.j(fVar, 19)));
            default:
                return LottieCompositionFactory.fromJsonInputStreamSync((InputStream) obj, str, z14);
        }
    }
}
