package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/p3;", "Llr0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p3 implements lr0.a {
    @Override // lr0.a
    public final Intent a(Context context, ActivityListItemDTO activityListItemDTO) {
        activityListItemDTO.getClass();
        aq.b bVar = new aq.b();
        long j8 = activityListItemDTO.f29250b;
        bVar.f11822a = activityListItemDTO;
        bVar.f11823b = j8;
        bVar.f11827f = activityListItemDTO.f29265g.f4358a;
        am.h hVar = am.h.VIEW_EDIT;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = true;
        return bVar.a(context);
    }

    @Override // lr0.a
    public final void b(Activity activity, ir0.b bVar) {
        bVar.getClass();
        gs1.f fVar = bVar.f94782a;
        if (fVar != null) {
            MoveIQEventDetailsActivity.f39211k.getClass();
            MoveIQEventDetailsActivity.a.a(activity, fVar, 0);
        }
    }

    @Override // lr0.a
    public final boolean c() {
        return bo1.a.a().c().C();
    }
}
