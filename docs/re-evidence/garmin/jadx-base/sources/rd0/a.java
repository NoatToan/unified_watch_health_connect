package rd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.bikesensors.c;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tv.s;
import y90.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrd0/a;", "Ly90/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Ltv/s;", "settingsManager", "<init>", "(Landroid/content/Context;JLtv/s;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f152005j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f152008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f152009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f152010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f152011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f152012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f152013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.bikesensors.b f152014i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/a$b", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b f152016b;

        public b(com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b) {
            this.f152016b = interfaceC0491b;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b = this.f152016b;
            a aVar = a.this;
            com.garmin.android.apps.connectmobile.bikesensors.b bVarB = aVar.b(interfaceC0491b);
            if (bVarB != null) {
                bVarB.b(aVar.f152011f);
            }
        }
    }

    static {
        new C2859a(null);
    }

    public a(Context context, long j8, s sVar) {
        context.getClass();
        sVar.getClass();
        this.f152006a = context;
        this.f152007b = j8;
        this.f152008c = sVar;
    }

    @Override // y90.d
    public final r53.b a() {
        return r53.s.f(new rd0.b(this, null));
    }

    public final com.garmin.android.apps.connectmobile.bikesensors.b b(com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b) {
        interfaceC0491b.getClass();
        com.garmin.android.apps.connectmobile.bikesensors.b bVar = this.f152014i;
        if (bVar == null || !bVar.isAlive()) {
            com.garmin.android.apps.connectmobile.bikesensors.b bVar2 = new com.garmin.android.apps.connectmobile.bikesensors.b(this.f152006a, interfaceC0491b);
            bVar2.start();
            this.f152014i = bVar2;
        }
        return this.f152014i;
    }

    public final c c(c.InterfaceC0492c interfaceC0492c) {
        interfaceC0492c.getClass();
        c cVar = this.f152013h;
        if (cVar == null || !cVar.isAlive()) {
            c cVar2 = new c(this.f152006a);
            cVar2.f30862b = new WeakReference<>(interfaceC0492c);
            cVar2.start();
            this.f152013h = cVar2;
        }
        return this.f152013h;
    }

    public final void d(com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b) {
        interfaceC0491b.getClass();
        this.f152009d = new Timer();
        b bVar = new b(interfaceC0491b);
        this.f152010e = bVar;
        Timer timer = this.f152009d;
        if (timer != null) {
            timer.schedule(bVar, 0L, 2000L);
        }
    }

    /* JADX INFO: renamed from: rd0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lrd0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PROGRESS_COMPLETE", "F", "PROGRESS_ALMOST_COMPLETE", "PROGRESS_HALF_COMPLETE", "PROGRESS_ALMOST_HALF_COMPLETE", "", "DOWNLOAD_PROGRESS_QUERY_PERIOD", "J", "PERCENTAGE_CONSTANT", "UNINITIALIZED_DOWNLOAD_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2859a {
        public /* synthetic */ C2859a(j jVar) {
            this();
        }

        private C2859a() {
        }
    }
}
