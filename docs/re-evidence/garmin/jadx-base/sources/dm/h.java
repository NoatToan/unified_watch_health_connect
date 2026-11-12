package dm;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/h;", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f60349a;

    public h(i iVar) {
        this.f60349a = iVar;
    }

    @Override // iu1.k
    public final void onSuccess(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        this.f60349a.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, hVar);
    }
}
