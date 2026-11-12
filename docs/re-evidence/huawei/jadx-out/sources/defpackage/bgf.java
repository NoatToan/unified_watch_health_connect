package defpackage;

import android.graphics.Color;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bgf {
    public static int d(int i, float f) {
        Color colorValueOf = Color.valueOf(i);
        return Color.valueOf(colorValueOf.red(), colorValueOf.green(), colorValueOf.blue(), f).toArgb();
    }

    public static bdu b(List<bdu> list) {
        for (bdu bduVar : list) {
            if (bduVar.e() >= 0.08f) {
                return bduVar;
            }
        }
        return list.get(0);
    }
}
