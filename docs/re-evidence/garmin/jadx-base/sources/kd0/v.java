package kd0;

import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/v;", "Lcom/garmin/android/apps/connectmobile/s0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements com.garmin.android.apps.connectmobile.s0 {
    @Override // com.garmin.android.apps.connectmobile.s0
    public final jw.c0 a(long j8, long j14) {
        return new jw.c0(j8, j14);
    }

    @Override // com.garmin.android.apps.connectmobile.s0
    public final void b(String str) {
        CacheDatabase.i().j().a(str);
    }

    @Override // com.garmin.android.apps.connectmobile.s0
    public final void c(String str) {
        str.getClass();
        bb2.p pVarJ = CacheDatabase.i().j();
        pVarJ.getClass();
        int iG = d53.w.G('?', 0, 6, str);
        if (iG >= 0) {
            str = d53.y.s0(iG, str);
        }
        pVarJ.a(d53.u.v(d53.u.v(str, "_", "\\_", false), "%", "\\%", false).concat("%"));
    }

    @Override // com.garmin.android.apps.connectmobile.s0
    public final q03.l<List<String>> d(String str) {
        str.getClass();
        return CacheDatabase.i().j().e(str);
    }
}
