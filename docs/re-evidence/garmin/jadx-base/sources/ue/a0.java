package ue;

import androidx.lifecycle.y0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    public static final z a(d dVar, String str, ef.a aVar, e23.a aVar2) {
        dVar.getClass();
        aVar.getClass();
        y0 y0Var = new y0(y.f170133b);
        androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
        aVar3.f6080b = dVar2;
        aVar3.f6079a = v.h.class;
        try {
            aVar.execute(new com.mapbox.maps.plugin.annotation.a(dVar, str, aVar2, y0Var, aVar3, 3));
            Unit unit = Unit.INSTANCE;
            if (unit != null) {
                aVar3.f6079a = unit;
            }
        } catch (Exception e4) {
            dVar2.a(e4);
        }
        return new z(y0Var, dVar2);
    }
}
