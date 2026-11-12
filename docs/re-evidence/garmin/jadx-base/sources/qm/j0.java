package qm;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqm/j0;", "Lqm/l0;", "", "isUsingMetric", "<init>", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145394a;

    public j0(boolean z14) {
        this.f145394a = z14;
    }

    @Override // qm.l0
    public final List<Integer> a() {
        w13.c cVar = zp1.a.f206594h;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            arrayList.add(Integer.valueOf(((zp1.a) bVar.next()).f206597c));
        }
        return arrayList;
    }

    @Override // qm.l0
    public final int b() {
        return this.f145394a ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi;
    }
}
