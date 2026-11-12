package jn2;

import com.garmin.garminpay.wallet.OwnerDataSetFailedException;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import zn2.s3;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99623b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f99622a = i14;
        this.f99623b = obj;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        int i14 = this.f99622a;
        Object obj2 = this.f99623b;
        switch (i14) {
            case 0:
                ps2.m mVar = (ps2.m) obj2;
                pl2.l lVar = (pl2.l) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                if (!lVar.f138589b) {
                    int i15 = lVar.f138588a;
                    if (i15 == 14 || i15 == 12) {
                        js2.f.a aVar = js2.f.f100675e;
                        int i16 = lVar.f138591d;
                        aVar.getClass();
                        mVar.accept(new js2.f(Boolean.FALSE, i15, Integer.valueOf(i16), i15 == 12, null));
                    } else {
                        js2.f.f100675e.getClass();
                        mVar.accept(new js2.f(null, i15, null, false, 12, null));
                    }
                } else {
                    js2.f.a aVar2 = js2.f.f100675e;
                    int i17 = lVar.f138588a;
                    aVar2.getClass();
                    mVar.accept(new js2.f(Boolean.TRUE, i17, null, false, 12, null));
                }
                break;
            case 1:
                ListeningScheduledExecutorService listeningScheduledExecutorService2 = m.f99646l;
                ((s3) obj2).accept((Integer) obj);
                break;
            default:
                z03.c.a aVar3 = (z03.c.a) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    aVar3.c(new OwnerDataSetFailedException());
                } else {
                    aVar3.a();
                }
                break;
        }
    }
}
