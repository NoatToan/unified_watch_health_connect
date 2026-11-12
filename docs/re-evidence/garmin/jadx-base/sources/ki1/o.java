package ki1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Unit;
import s1.q1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f104896b;

    public /* synthetic */ o(b0 b0Var, int i14) {
        this.f104895a = i14;
        this.f104896b = b0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f104895a) {
            case 0:
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "FindMyDeviceViewModel", "[sendCancelFindMyBand] onCancelFindMyBandMessageSent");
                return Unit.INSTANCE;
            case 1:
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "FindMyDeviceViewModel", "[sendCancelFindMyBand] onFailedToSendCancelFindMyBandMessage");
                return Unit.INSTANCE;
            default:
                return Float.valueOf(q1.h(this.f104896b.getF183565a()));
        }
    }
}
