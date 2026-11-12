package ca0;

import com.garmin.proto.generated.GDISimpleSetup;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a0 extends p005kotlin.jvm.internal.q implements e23.l<GDISimpleSetup.SensorType, Unit> {
    public a0(Object obj) {
        super(1, obj, ja0.a.class, "onSensorSelected", "onSensorSelected(Lcom/garmin/proto/generated/GDISimpleSetup$SensorType;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(GDISimpleSetup.SensorType sensorType) {
        Object value;
        la0.a aVar;
        ArrayList arrayListD1;
        GDISimpleSetup.SensorType sensorType2 = sensorType;
        sensorType2.getClass();
        ja0.a aVar2 = (ja0.a) this.receiver;
        aVar2.getClass();
        r53.p2 p2Var = aVar2.f98057h;
        do {
            value = p2Var.getValue();
            aVar = (la0.a) value;
            arrayListD1 = p13.h0.d1(aVar.f111611d);
            if (arrayListD1.contains(sensorType2)) {
                arrayListD1.remove(sensorType2);
            } else {
                arrayListD1.add(sensorType2);
            }
        } while (!p2Var.b(value, la0.a.a(aVar, false, false, 0L, arrayListD1, null, 23)));
        return Unit.INSTANCE;
    }
}
