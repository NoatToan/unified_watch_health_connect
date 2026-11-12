package dm;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldm/n;", "Ldm/o;", "", "activityId", "", "isSocialDisabled", "cacheFetchEnabled", "<init>", "(JZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends o {
    public n(long j8, boolean z14, boolean z15) {
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new aq.d(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0.0d, null, null, 524287, null));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new em.g(j8, new l(this, j8, z15), z15));
        arrayList.add(new em.b(j8, new x(this)));
        if (!z14) {
            b(new k(this, j8));
        }
        arrayList.add(new u(j8, com.garmin.android.apps.connectmobile.activities.newmodel.j.class, new v(this)));
        cw.e.b(this, arrayList);
    }
}
