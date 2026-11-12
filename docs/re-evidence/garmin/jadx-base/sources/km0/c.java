package km0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(e eVar) {
        try {
            e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
            if (bVar != null) {
                Uri uri = bVar.f105320b;
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (new File(path).delete()) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.b(a2Var, "GroupCreationPhoto", "tryReleaseCroppedUri: Previous temp cropped photo released: " + uri);
                }
            }
        } catch (Exception e4) {
            String strN = fb1.c.n("tryReleaseCroppedUri: Failed to release previous temp cropped photo: ", e4.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "GroupCreationPhoto", strN);
        }
    }
}
