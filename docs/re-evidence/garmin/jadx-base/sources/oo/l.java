package oo;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loo/l;", "Ld80/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> f133117a;

    public l(y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> y0Var) {
        this.f133117a = y0Var;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        this.f133117a.m(g3.a.a(g3.f35298f, "Error creating manual activity.", null, null, null, 14));
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        aVar.getClass();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = obj instanceof com.garmin.android.apps.connectmobile.activities.newmodel.h ? (com.garmin.android.apps.connectmobile.activities.newmodel.h) obj : null;
        y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> y0Var = this.f133117a;
        if (hVar == null) {
            y0Var.m(g3.a.a(g3.f35298f, "Error creating manual activity.", null, null, null, 14));
        } else {
            g3.f35298f.getClass();
            y0Var.m(g3.a.d(hVar));
        }
    }
}
