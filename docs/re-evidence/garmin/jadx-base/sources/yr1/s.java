package yr1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final Bundle a(al2.c cVar) {
        Bundle bundle = new Bundle();
        rs2.c cVar2 = cVar.f3775a;
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", cVar2.getF172494b());
        String f172501i = cVar2.getF172501i();
        if (f172501i == null) {
            f172501i = cVar2.getF172502j();
        }
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", f172501i);
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", cVar2.getF172496d());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", (cVar.f3776b.f132729a ? wb2.j.ALWAYS_SHOW_PROGRESS : wb2.j.INVISIBLE).name());
        al2.b bVar = cVar.f3777c;
        if (bVar.f3774a) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", (bVar == al2.b.SUCCESS || bVar == al2.b.NO_ITEMS) ? 0 : 1);
        }
        return bundle;
    }
}
