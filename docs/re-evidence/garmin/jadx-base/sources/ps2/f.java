package ps2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.google.common.base.Optional;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140475a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f140477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f140478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f140479e;

    public /* synthetic */ f(String str, byte[] bArr, float f14, n nVar) {
        this.f140478d = str;
        this.f140477c = bArr;
        this.f140479e = f14;
        this.f140476b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f140475a;
        float f14 = this.f140479e;
        String str = this.f140478d;
        byte[] bArr = this.f140477c;
        n nVar = this.f140476b;
        switch (i14) {
            case 0:
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isPresent() && ((hs2.c) optional.get()).f85442b.equals(str) && Arrays.equals(((hs2.c) optional.get()).f85441a, bArr) && ((hs2.c) optional.get()).f85443c == f14) {
                    return z03.f.f200765a;
                }
                if (optional.isPresent()) {
                    g gVar = new g(nVar, 2);
                    int i15 = w03.b.f181178a;
                    return new z03.d(gVar).d(new z03.d(new a(nVar, bArr, str, f14)));
                }
                a aVar = new a(nVar, bArr, str, f14);
                int i16 = w03.b.f181178a;
                return new z03.d(aVar);
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    Optional<hs2.c> optionalOf = Optional.of(new hs2.c(bArr, str, f14));
                    optionalOf.getClass();
                    nVar.f140514q = optionalOf;
                    return z03.f.f200765a;
                }
                ExpressCardSettingException.a aVar2 = ExpressCardSettingException.a.DEVICE_IS_BUSY;
                throw new ExpressCardSettingException(aVar2, "SetExpressCard failed. " + aVar2);
        }
    }

    public /* synthetic */ f(n nVar, byte[] bArr, String str, float f14) {
        this.f140476b = nVar;
        this.f140477c = bArr;
        this.f140478d = str;
        this.f140479e = f14;
    }
}
