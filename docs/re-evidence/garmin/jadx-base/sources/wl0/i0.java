package wl0;

import android.content.Context;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Collections;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class i0 extends d80.a<sd2.f> {
    public i0(Context context) {
        super(context);
    }

    @Override // d80.a
    public final ArrayList a() {
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListD = rd2.j.d();
        Collections.sort(arrayListD, new tl2.g(12));
        ArrayList<sd2.f> arrayList = new ArrayList();
        ArrayList<sd2.f> arrayList2 = new ArrayList();
        cl0.b bVar = (cl0.b) KoinJavaComponent.get(cl0.b.class);
        for (sd2.f fVar : arrayListD) {
            if (bVar.i(SupportedCapability.SWING_SENSOR.ordinal(), fVar.getUnitID())) {
                arrayList.add(fVar);
            }
            if (bVar.i(SupportedCapability.SWING_SENSOR_REMOTE.ordinal(), fVar.getUnitID())) {
                arrayList2.add(fVar);
            }
        }
        fVar = null;
        fVar = null;
        for (sd2.f fVar2 : arrayList) {
            if (bVar.a(fVar2.getUnitID())) {
                break;
            }
        }
        for (sd2.f fVar3 : arrayList2) {
            if (bVar.a(fVar3.getUnitID())) {
                break;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (fVar2 != null) {
            arrayList3.add(fVar2);
        }
        if (fVar3 != null) {
            arrayList3.add(fVar3);
        }
        return arrayList3;
    }
}
