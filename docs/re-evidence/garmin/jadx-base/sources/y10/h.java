package y10;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/h;", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$i;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements com.garmin.android.apps.connectmobile.connectiq.b0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f193871a;

    public h(f fVar) {
        this.f193871a = fVar;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.i
    public final void a() {
        f fVar = this.f193871a;
        fVar.f193825d.m(g3.a.a(g3.f35298f, null, null, null, null, 15));
        p92.y.f136664a.getClass();
        p92.y.a.a("ConnectIQAppSettingsViewModel", "Request device app settings: onAppSettingsRequestFailed ");
        fVar.f193823b = true;
        fVar.f193837p.cancel();
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.i
    public final void b(byte[] bArr) {
        bArr.getClass();
        p92.y.f136664a.getClass();
        p92.y.a.a("ConnectIQAppSettingsViewModel", "Request device app settings: onAppSettingRequestSent ");
        this.f193871a.f193824c = bArr;
    }
}
