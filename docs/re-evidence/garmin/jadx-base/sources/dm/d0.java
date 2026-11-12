package dm;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/d0;", "Ljw/l;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends jw.l<com.garmin.android.apps.connectmobile.activities.newmodel.h, com.garmin.android.apps.connectmobile.activities.newmodel.h> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f60337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.activities.newmodel.h> f60338q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(o oVar, List<com.garmin.android.apps.connectmobile.activities.newmodel.h> list, String[] strArr, lj0.a aVar, Class<com.garmin.android.apps.connectmobile.activities.newmodel.h> cls, d80.g gVar) {
        super(oVar, strArr, aVar, cls, gVar);
        this.f60337p = oVar;
        this.f60338q = list;
    }

    @Override // jw.l
    public final void d(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = hVar;
        if (hVar2 != null) {
            Object obj = this.f60337p.f60400o;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.h> list = this.f60338q;
            synchronized (obj) {
                list.add(hVar2);
            }
        }
    }
}
