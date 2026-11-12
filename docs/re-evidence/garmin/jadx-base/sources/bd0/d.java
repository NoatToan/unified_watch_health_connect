package bd0;

import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.DeviceSetupProgressListViewFragment;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.MapboxHttpClient;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17552d;

    public /* synthetic */ d(Object obj, long j8, Serializable serializable, int i14) {
        this.f17549a = i14;
        this.f17551c = obj;
        this.f17550b = j8;
        this.f17552d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        int i14 = this.f17549a;
        long j8 = this.f17550b;
        Object obj = this.f17552d;
        Object obj2 = this.f17551c;
        switch (i14) {
            case 0:
                y yVar = (y) obj;
                int i15 = BLEDeviceSetupActivity.f34387q;
                DeviceSetupProgressListViewFragment deviceSetupProgressListViewFragmentJa = ((BLEDeviceSetupActivity) obj2).ja();
                if (deviceSetupProgressListViewFragmentJa == null || (a0Var = deviceSetupProgressListViewFragmentJa.f34439j) == null) {
                    return;
                }
                for (int i16 = 0; i16 < a0Var.getCount(); i16++) {
                    z zVar = (z) a0Var.getItem(i16);
                    if (yVar == zVar.f17662b) {
                        zVar.f17665e = j8;
                        a0Var.notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 1:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$renderedFirstFrame$6(obj, j8);
                return;
            case 2:
                MapboxHttpClient.request$lambda$5((RequestObserver) obj2, j8, (HttpRequestError) obj);
                return;
            case 3:
                MapboxHttpClient.request$lambda$6((RequestObserver) obj2, j8, (Exception) obj);
                return;
            case 4:
                zb0.a aVar = (zb0.a) obj;
                AudioPromptsService.e eVar = ((com.garmin.android.apps.connectmobile.audioprompts.b) obj2).f30224b;
                if (eVar != null) {
                    AudioPromptsService audioPromptsService = AudioPromptsService.this;
                    nu.h hVar = audioPromptsService.f30197d;
                    if (hVar == null) {
                        p005kotlin.jvm.internal.s.m("tts");
                        throw null;
                    }
                    hVar.b(j8, aVar);
                    iu.a.f94990a.getClass();
                    if (iu.a.f94991b.size() == 0) {
                        audioPromptsService.stopSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                androidx.media3.exoplayer.video.f fVar = ((androidx.media3.exoplayer.video.f.a) obj2).f9870b;
                int i17 = fa.z.f70071a;
                fVar.onRenderedFirstFrame(obj, j8);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, long j8, int i14) {
        this.f17549a = i14;
        this.f17551c = obj;
        this.f17552d = obj2;
        this.f17550b = j8;
    }
}
