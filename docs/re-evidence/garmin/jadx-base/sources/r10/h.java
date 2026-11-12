package r10;

import com.garmin.android.apps.connectmobile.connectiq.b0;
import java.util.ArrayList;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr10/h;", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$g;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements b0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<o10.c> f149354a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(t13.d<? super o10.c> dVar) {
        this.f149354a = dVar;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void a(long j8, long j14, ArrayList arrayList) {
        int i14 = q.f128596b;
        this.f149354a.resumeWith(new o10.c(j8, j14, arrayList));
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void b() {
        int i14 = q.f128596b;
        this.f149354a.resumeWith(new q.b(new Exception("getInstalledCIQItems -> onInstalledAppsRequestFailed()")));
    }
}
