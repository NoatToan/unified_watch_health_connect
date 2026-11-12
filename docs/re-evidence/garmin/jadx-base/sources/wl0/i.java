package wl0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class i implements t13.d<v2<? extends List<com.garmin.android.apps.connectmobile.golf.truswing.model.k>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f185938a;

    public i(h hVar) {
        this.f185938a = hVar;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF157466b() {
        return t13.h.f161748a;
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        boolean z14 = obj instanceof v2.b;
        h hVar = this.f185938a;
        if (z14) {
            hVar.f185929g = (List) ((v2.b) obj).f47386a;
        } else {
            hVar.f185929g = null;
        }
    }
}
