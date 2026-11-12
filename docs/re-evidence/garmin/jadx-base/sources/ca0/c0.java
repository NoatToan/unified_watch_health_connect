package ca0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c0 extends p005kotlin.jvm.internal.q implements e23.p<Integer, j90.n, Unit> {
    public c0(Object obj) {
        super(2, obj, ja0.a.class, "onActivityProfileSelected", "onActivityProfileSelected(ILcom/garmin/android/apps/connectmobile/device/setup/domain/customization/model/SportProfileType;)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Integer num, j90.n nVar) {
        Object value;
        la0.a aVar;
        ArrayList arrayListD1;
        int iIntValue = num.intValue();
        j90.n nVar2 = nVar;
        nVar2.getClass();
        ja0.a aVar2 = (ja0.a) this.receiver;
        aVar2.getClass();
        r53.p2 p2Var = aVar2.f98057h;
        do {
            value = p2Var.getValue();
            aVar = (la0.a) value;
            arrayListD1 = p13.h0.d1(aVar.f111612e);
            boolean z14 = !nVar2.f97843d;
            int i14 = nVar2.f97840a;
            int i15 = nVar2.f97841b;
            String str = nVar2.f97842c;
            str.getClass();
            arrayListD1.set(iIntValue, new j90.n(i14, i15, str, z14));
        } while (!p2Var.b(value, la0.a.a(aVar, false, false, 0L, null, arrayListD1, 15)));
        return Unit.INSTANCE;
    }
}
