package j31;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj31/m;", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$g;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements com.garmin.android.apps.connectmobile.connectiq.b0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<List<? extends com.garmin.android.apps.connectmobile.connectiq.e>> f96908a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(o53.j<? super List<? extends com.garmin.android.apps.connectmobile.connectiq.e>> jVar) {
        this.f96908a = jVar;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void a(long j8, long j14, ArrayList arrayList) {
        o53.j<List<? extends com.garmin.android.apps.connectmobile.connectiq.e>> jVar = this.f96908a;
        if (jVar.isActive()) {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(arrayList);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void b() {
        o53.j<List<? extends com.garmin.android.apps.connectmobile.connectiq.e>> jVar = this.f96908a;
        if (jVar.isActive()) {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(null);
        }
    }
}
