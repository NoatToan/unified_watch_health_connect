package wu;

import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.i;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwu/a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f187234a;

    public final void a(m mVar, boolean z14) {
        i iVar = this.f187234a;
        if (mVar != null && iVar != null) {
            mVar.g(iVar.b(mVar.getBadgeKey()));
        }
        if (!z14 || mVar == null) {
            return;
        }
        List<SimpleBadgeDTO> listK0 = mVar.k0();
        i iVar2 = this.f187234a;
        if (listK0 == null || listK0.isEmpty() || iVar2 == null) {
            return;
        }
        for (int i14 = 0; i14 < listK0.size(); i14++) {
            SimpleBadgeDTO simpleBadgeDTO = listK0.get(i14);
            if (simpleBadgeDTO != null) {
                simpleBadgeDTO.g(iVar2.b(simpleBadgeDTO.getBadgeKey()));
            }
        }
    }
}
