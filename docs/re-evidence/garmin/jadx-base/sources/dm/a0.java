package dm;

import java.util.List;
import p005kotlin.Metadata;
import ps.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/a0;", "Liu1/i;", "Lps/w0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements iu1.i<w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60329a;

    public a0(o oVar) {
        this.f60329a = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // iu1.i
    public final void b(List<? extends w0> list) {
        aq.d dVar = (aq.d) this.f60329a.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = dVar.f11879a;
        if (hVar != null) {
            hVar.f29463p = list;
        }
        dVar.f11885g = list;
    }
}
