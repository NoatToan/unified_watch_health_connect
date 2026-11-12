package i1;

import android.util.Size;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.k;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class c implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f86980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2 f86981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f86982e = new HashMap();

    public c(e1 e1Var, i2 i2Var) {
        this.f86980c = e1Var;
        this.f86981d = i2Var;
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return c(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return this.f86980c.b(i14) && c(i14) != null;
    }

    public final f1 c(int i14) {
        Size size;
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map = this.f86982e;
        if (map.containsKey(numValueOf)) {
            return (f1) map.get(Integer.valueOf(i14));
        }
        e1 e1Var = this.f86980c;
        f1 f1VarE = null;
        if (e1Var.b(i14)) {
            f1 f1VarA = e1Var.a(i14);
            Objects.requireNonNull(f1VarA);
            Iterator it = this.f86981d.c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                        if (i14 == 4) {
                            size = new Size(640, 480);
                            break;
                        }
                        if (i14 == 5) {
                            size = new Size(960, 720);
                            break;
                        }
                        if (i14 == 6) {
                            size = new Size(DateTimeConstants.MINUTES_PER_DAY, 1080);
                            break;
                        }
                        break;
                    }
                }
                size = null;
                break;
            }
            if (size == null) {
                f1VarE = f1VarA;
            } else {
                ArrayList arrayList = new ArrayList();
                for (f1.c cVar : f1VarA.d()) {
                    arrayList.add(new k(cVar.d(), cVar.h(), cVar.b(), cVar.e(), size.getWidth(), size.getHeight(), cVar.i(), cVar.a(), cVar.c(), cVar.f()));
                }
                if (!arrayList.isEmpty()) {
                    f1VarE = f1.b.e(f1VarA.c(), f1VarA.a(), f1VarA.b(), arrayList);
                }
            }
        }
        map.put(Integer.valueOf(i14), f1VarE);
        return f1VarE;
    }
}
