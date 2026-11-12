package fu1;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfu1/m;", "Lfu1/o;", "", ModelSourceWrapper.POSITION, "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "activitySummary", "Lps/m;", "polyline", "", "serverError", "<init>", "(ILcom/garmin/android/apps/connectmobile/activities/newmodel/h;Lps/m;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f73536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ps.m f73537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f73538d;

    public /* synthetic */ m(int i14, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, ps.m mVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : hVar, (i15 & 4) != 0 ? null : mVar, (i15 & 8) != 0 ? false : z14);
    }

    public m(int i14, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, ps.m mVar, boolean z14) {
        super(i14);
        this.f73536b = hVar;
        this.f73537c = mVar;
        this.f73538d = z14;
    }
}
