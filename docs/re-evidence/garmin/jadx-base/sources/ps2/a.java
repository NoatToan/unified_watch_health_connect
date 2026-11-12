package ps2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140460a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f140462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f140463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f140464e;

    public /* synthetic */ a(n nVar, String str, byte[] bArr, float f14) {
        this.f140461b = nVar;
        this.f140463d = str;
        this.f140462c = bArr;
        this.f140464e = f14;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f140460a;
        float f14 = this.f140464e;
        String str = this.f140463d;
        byte[] bArr = this.f140462c;
        n nVar = this.f140461b;
        switch (i14) {
            case 0:
                if (nVar.f140499b.q() != hs2.g.DISCONNECTED) {
                    e13.b bVarA = nVar.a();
                    d dVar = new d(new f(str, bArr, f14, nVar), 1);
                    int i15 = w03.b.f181178a;
                    return new e13.k(bVarA, dVar);
                }
                ExpressCardSettingException.a aVar = ExpressCardSettingException.a.DEVICE_NOT_CONNECTED;
                throw new ExpressCardSettingException(aVar, "SetExpressCard failed. " + aVar);
            default:
                e13.p pVarG = q03.r.e(nVar.f140499b.p(bArr, str, f14)).g(l13.a.f108328c);
                d dVar2 = new d(new f(nVar, bArr, str, f14), 6);
                int i16 = w03.b.f181178a;
                return new e13.k(pVarG, dVar2);
        }
    }

    public /* synthetic */ a(n nVar, byte[] bArr, String str, float f14) {
        this.f140461b = nVar;
        this.f140462c = bArr;
        this.f140463d = str;
        this.f140464e = f14;
    }
}
