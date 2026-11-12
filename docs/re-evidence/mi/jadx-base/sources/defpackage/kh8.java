package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.e;
import androidx.camera.core.m;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class kh8 {
    public boolean a() {
        j3d j3dVar = (j3d) xa6.a(j3d.class);
        if (j3dVar != null) {
            return j3dVar.c(e.h);
        }
        return true;
    }

    public boolean b(m mVar) {
        j3d j3dVar = (j3d) xa6.a(j3d.class);
        return (j3dVar == null || j3dVar.c(e.h)) && mVar.getFormat() == 256;
    }
}
