package ps2;

import com.garmin.garminpay.wallet.PasscodeAlreadyCreatedException;
import com.garmin.garminpay.wallet.PasscodeMissingException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements q03.u, q03.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f140491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f140492b;

    public /* synthetic */ k(n nVar, String str) {
        this.f140491a = nVar;
        this.f140492b = str;
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) throws PasscodeMissingException {
        n nVar = this.f140491a;
        if (p005kotlin.jvm.internal.s.g(nVar.f140513p.f100665f, Boolean.FALSE)) {
            throw new PasscodeMissingException();
        }
        nVar.f140499b.H(this.f140492b, new m(c1312a, 0));
    }

    @Override // q03.e
    public void f(z03.c.a aVar) throws PasscodeAlreadyCreatedException {
        n nVar = this.f140491a;
        if (nVar.f140513p.f100666g) {
            throw new PasscodeAlreadyCreatedException();
        }
        nVar.f140499b.F(this.f140492b, nVar.f140500c, nVar.f140501d, new h(nVar, aVar, 1));
    }
}
