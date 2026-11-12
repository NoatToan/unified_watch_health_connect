package l51;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class o extends p005kotlin.jvm.internal.q implements e23.p<Double, n02.g, Unit> {
    public o(Object obj) {
        super(2, obj, p51.e.class, "setCustomDistance", "setCustomDistance(DLcom/garmin/android/apps/connectmobile/ui/composable/picker/DistancePickerUnit;)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Double d14, n02.g gVar) {
        Object value;
        double dDoubleValue = d14.doubleValue();
        n02.g gVar2 = gVar;
        gVar2.getClass();
        p51.e eVar = (p51.e) this.receiver;
        eVar.getClass();
        p2 p2Var = eVar.f136172a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, o51.j.a((o51.j) value, t41.f.OTHER, Double.valueOf(dDoubleValue), gVar2, 0, 0, 24)));
        eVar.y4();
        return Unit.INSTANCE;
    }
}
