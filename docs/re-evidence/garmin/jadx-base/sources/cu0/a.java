package cu0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import java.util.TimerTask;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu0/a;", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveEventService f55557a;

    public a(LiveEventService liveEventService) {
        this.f55557a = liveEventService;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveEventService", "The extra hour for live event sharing is finished.");
        LiveEventService.b(this.f55557a);
    }
}
