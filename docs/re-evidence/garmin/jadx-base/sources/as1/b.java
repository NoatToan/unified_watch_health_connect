package as1;

import bs2.ax;
import bs2.zw;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import wl0.h;

/* JADX INFO: loaded from: classes10.dex */
public class b implements ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hc2.a f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12683b = new ArrayList();

    @Override // bs2.ax
    public final void a(zw zwVar) {
        com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar;
        i2.d("GCMGolfSwingFileUploadListener", "Received swing FIT message");
        hc2.b bVar = new hc2.b();
        bVar.f83281a = zwVar.getTimestamp().a().longValue();
        boolean z14 = this.f12682a.f83280a;
        if (z14) {
            i2.d("GCMGolfSwingFileUploadListener", "Setting swing sensor filename");
            bVar.f83282b = this.f12682a.getAbsolutePath();
        } else if (z14) {
            i2.i("GCMGolfSwingFileUploadListener", "The swing file was neither a swing sensor or remote swing sensor");
            return;
        } else {
            i2.d("GCMGolfSwingFileUploadListener", "Setting remote swing sensor filename");
            bVar.f83283c = this.f12682a.getAbsolutePath();
        }
        Long lJ = zwVar.j(16, 65535);
        Long lJ2 = zwVar.j(15, 65535);
        if (lJ != null && lJ2 != null) {
            long jLongValue = lJ.longValue() | (lJ2.longValue() << 32);
            bVar.f83286f = jLongValue;
            Iterator it = h.i().h(false).iterator();
            do {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (com.garmin.android.apps.connectmobile.golf.truswing.model.a) it.next();
            } while (aVar.f35890b != jLongValue);
            if (aVar != null) {
                bVar.f83284d = aVar.a();
                bVar.f83285e = h.i().j(aVar.f35891c.f20622a);
            }
        }
        this.f12683b.add(bVar);
    }
}
