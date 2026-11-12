package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class obe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, obg> f44037c = new HashMap<>();

    private obe() {
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final obe f44038c = new obe();
    }

    public static obe d() {
        return e.f44038c;
    }

    public obg e(Context context, int i) {
        String strD = oco.d(context, i);
        ocq.e("CarrierConfigController", "getCarrierConfigInfo getSimOperator=" + strD + ", slotId=" + i);
        obg obgVar = f44037c.get(strD);
        if (obgVar != null) {
            ocq.e("CarrierConfigController", "CarrierConfigInfo has the config Info of the simOperator");
            return obgVar;
        }
        obg obgVarB = obl.b(context, null, i);
        f44037c.put(strD, obgVarB);
        return obgVarB;
    }
}
