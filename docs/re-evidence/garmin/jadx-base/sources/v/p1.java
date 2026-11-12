package v;

import androidx.camera.core.impl.t2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    private p1() {
    }

    public static ArrayList a(t2.b bVar, t2.b bVar2) {
        ArrayList arrayList = new ArrayList();
        t2.d dVar = t2.d.PRIV;
        arrayList.add(new androidx.camera.core.impl.s2(t2.a(dVar, bVar), t2.a(t2.d.JPEG, bVar2)));
        arrayList.add(new androidx.camera.core.impl.s2(t2.a(dVar, bVar), t2.a(t2.d.JPEG_R, bVar2)));
        return arrayList;
    }
}
