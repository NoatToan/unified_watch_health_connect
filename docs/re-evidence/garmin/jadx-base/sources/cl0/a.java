package cl0;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.golf.truswing.k;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import wl0.h;
import wl0.t;
import wl0.y;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f27926a;

    private a() {
    }

    public static boolean a(long j8) {
        return ((b) KoinJavaComponent.get(b.class)).u(j8);
    }

    public static boolean b(long j8) {
        if (j8 > 0) {
            return ((b) KoinJavaComponent.get(b.class)).m(j8);
        }
        return false;
    }

    public static boolean c(SwingDTO swingDTO) {
        for (hc2.b bVar : h.i().l()) {
            t tVarA = y.a(bVar.f83281a, bVar.f83282b, null);
            if (tVarA.a() == swingDTO.f35880i || swingDTO.f35879h.equals(k.a.a(tVarA).f35879h)) {
                h hVarI = h.i();
                hVarI.getClass();
                File file = new File(bVar.f83282b);
                if (file.exists()) {
                    file.delete();
                }
                hVarI.f83290b.delete("swings", "club_swing_file LIKE ?", new String[]{"%" + new File(bVar.f83282b).getName() + CoreConstants.PERCENT_CHAR});
                return true;
            }
        }
        return false;
    }

    public static List d() {
        return ((b) KoinJavaComponent.get(b.class)).y();
    }

    public static synchronized a e() {
        try {
            if (f27926a == null) {
                f27926a = new a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f27926a;
    }

    public static List f() {
        return ((b) KoinJavaComponent.get(b.class)).l();
    }

    public static boolean g() {
        ArrayList arrayList = new ArrayList();
        List listD = d();
        List listF = f();
        if (listD != null) {
            arrayList.addAll(listD);
        }
        if (listF != null) {
            arrayList.addAll(listF);
        }
        return arrayList.size() == 2;
    }

    public static boolean h() {
        b bVar = (b) KoinJavaComponent.get(b.class);
        return (bVar.D() && bVar.C()) ? false : true;
    }
}
