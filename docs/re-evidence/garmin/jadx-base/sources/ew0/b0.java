package ew0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class b0 extends p005kotlin.jvm.internal.q implements e23.q<String, pv0.k, pv0.p, Unit> {
    public b0(Object obj) {
        super(3, obj, m.class, "addCustomBehaviour", "addCustomBehaviour(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/logging/data/model/BehaviourMeasurementType;Lcom/garmin/android/apps/connectmobile/logging/data/model/BehaviourTimingType;)V", 0);
    }

    @Override // e23.q
    public final Unit invoke(String str, pv0.k kVar, pv0.p pVar) {
        Object value;
        String str2 = str;
        pv0.k kVar2 = kVar;
        pv0.p pVar2 = pVar;
        str2.getClass();
        kVar2.getClass();
        pVar2.getClass();
        m mVar = (m) this.receiver;
        mVar.getClass();
        p2 p2Var = mVar.f66243j;
        do {
            value = p2Var.getValue();
            mVar.f66234a.getClass();
        } while (!p2Var.b(value, tv0.a.a(str2, kVar2, pVar2, (List) value)));
        return Unit.INSTANCE;
    }
}
