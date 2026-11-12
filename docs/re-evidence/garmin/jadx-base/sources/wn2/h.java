package wn2;

import androidx.lifecycle.y0;
import androidx.room.a0;
import o13.u;
import p005kotlin.Unit;
import p13.h0;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186368b;

    public /* synthetic */ h(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, int i14) {
        this.f186367a = i14;
        this.f186368b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f186367a) {
            case 0:
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar = this.f186368b;
                aVar.f51029c = null;
                y0<u<Long, String, rn2.i>> y0Var = aVar.f51038l;
                Long lValueOf = Long.valueOf(aVar.f51027a);
                String str = aVar.f51028b;
                if (str != null) {
                    y0Var.j(new u<>(lValueOf, str, aVar.f51029c));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceName");
                throw null;
            case 1:
                rn2.i iVar = (rn2.i) h0.I0(((rn2.j) obj).b());
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar2 = this.f186368b;
                aVar2.f51029c = iVar;
                y0<u<Long, String, rn2.i>> y0Var2 = aVar2.f51038l;
                Long lValueOf2 = Long.valueOf(aVar2.f51027a);
                String str2 = aVar2.f51028b;
                if (str2 != null) {
                    y0Var2.j(new u<>(lValueOf2, str2, aVar2.f51029c));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceName");
                throw null;
            case 2:
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar3 = this.f186368b;
                aVar3.f51029c = null;
                y0<u<Long, String, rn2.i>> y0Var3 = aVar3.f51038l;
                Long lValueOf3 = Long.valueOf(aVar3.f51027a);
                String str3 = aVar3.f51028b;
                if (str3 != null) {
                    y0Var3.j(new u<>(lValueOf3, str3, aVar3.f51029c));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceName");
                throw null;
            case 3:
                this.f186368b.f51037k.j(new o13.p<>(Boolean.TRUE, a0.f(((Long) obj).longValue(), "Felica Provision Need ", " milliseconds")));
                return Unit.INSTANCE;
            case 4:
                this.f186368b.f51037k.j(new o13.p<>(Boolean.TRUE, e0.f(((Integer) obj).intValue(), "Felica Provision ", "%")));
                return Unit.INSTANCE;
            case 5:
                this.f186368b.f51037k.j(new o13.p<>(Boolean.TRUE, a0.f(((Long) obj).longValue(), "Felica Provision Need ", " milliseconds")));
                return Unit.INSTANCE;
            case 6:
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar4 = this.f186368b;
                aVar4.f51029c = (rn2.i) obj;
                y0<u<Long, String, rn2.i>> y0Var4 = aVar4.f51038l;
                Long lValueOf4 = Long.valueOf(aVar4.f51027a);
                String str4 = aVar4.f51028b;
                if (str4 != null) {
                    y0Var4.j(new u<>(lValueOf4, str4, aVar4.f51029c));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceName");
                throw null;
            case 7:
                this.f186368b.f51037k.j(new o13.p<>(Boolean.TRUE, a0.f(((Long) obj).longValue(), "Felica Provision Need ", " milliseconds")));
                return Unit.INSTANCE;
            default:
                this.f186368b.f51037k.j(new o13.p<>(Boolean.TRUE, a0.f(((Long) obj).longValue(), "Felica Provision Need ", " milliseconds")));
                return Unit.INSTANCE;
        }
    }
}
