package tn2;

import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import java.util.concurrent.Callable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f165611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f165612c;

    public /* synthetic */ o0(int i14, String str, Throwable th3) {
        this.f165610a = i14;
        this.f165611b = th3;
        this.f165612c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f165610a;
        String str = this.f165612c;
        Throwable th3 = this.f165611b;
        switch (i14) {
            case 0:
                Logger logger = r0.f165631n;
                return th3 instanceof FNServerIncorrectResponseException ? q03.b.g(th3) : q03.b.g(new FNServerIncorrectResponseException(com.nimbusds.jose.shaded.gson.internal.a.h(str, ": ", th3.getMessage(), ": "), th3));
            default:
                Logger logger2 = r0.f165631n;
                return th3 instanceof FNServerIncorrectResponseException ? q03.r.d(th3) : q03.r.d(new FNServerIncorrectResponseException(com.nimbusds.jose.shaded.gson.internal.a.h(str, ": ", th3.getMessage(), ": "), th3));
        }
    }
}
