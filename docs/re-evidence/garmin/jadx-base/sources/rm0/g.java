package rm0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import java.util.Map;
import p005kotlin.Metadata;
import qm0.p;
import wg0.j;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrm0/g;", "Lqm0/p;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends p {
    @Override // qm0.p
    public final void C4(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.e0.b
    public final h3<String, wg0.a> x4(Context context) {
        return new e(this.f145528d, this.f145530f, this.f145526b, this.f145529e, context, this.f145527c);
    }

    @Override // qm0.p
    public final wg0.a y4(Context context, ActivityListItemDTO activityListItemDTO, Map<Integer, l> map, GroupDTO.c cVar) {
        context.getClass();
        activityListItemDTO.getClass();
        cVar.getClass();
        return j.b(activityListItemDTO, context, true, map, cVar, null, 16);
    }

    @Override // qm0.p
    public final wg0.a z4(Context context, jo1.e eVar, Map<Integer, l> map) {
        context.getClass();
        eVar.getClass();
        return null;
    }
}
