package tr2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.userwallet.b f166143b;

    public /* synthetic */ g(com.garmin.feature.garminpay.ui.userwallet.b bVar, int i14) {
        this.f166142a = i14;
        this.f166143b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f166142a;
        com.garmin.feature.garminpay.ui.userwallet.b bVar = this.f166143b;
        switch (i14) {
            case 0:
                bVar.f52256d.a();
                return Unit.INSTANCE;
            default:
                com.garmin.feature.garminpay.ui.userwallet.b.a aVar = com.garmin.feature.garminpay.ui.userwallet.b.f52252e;
                return bVar;
        }
    }
}
