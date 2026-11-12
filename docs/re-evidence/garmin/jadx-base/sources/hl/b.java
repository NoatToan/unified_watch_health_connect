package hl;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.List;
import lc.u0;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final List<PrivacyType> a(a aVar) {
        aVar.getClass();
        if (aVar instanceof a.b) {
            PrivacyType.INSTANCE.getClass();
            return w.c(PrivacyType.ONLY_ME);
        }
        if (aVar.equals(a.c.f84256b)) {
            PrivacyType.INSTANCE.getClass();
            return PrivacyType.Companion.d();
        }
        u0.r();
        return null;
    }
}
