package kd0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/d2;", "Lep1/f;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d2 implements ep1.f {
    @Override // ep1.f
    public final Intent a(EdgeSolarChargeActivity edgeSolarChargeActivity, long j8) {
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        am.h hVar = am.h.VIEW_EDIT;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = true;
        return bVar.a(edgeSolarChargeActivity);
    }
}
