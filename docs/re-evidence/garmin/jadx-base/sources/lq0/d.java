package lq0;

import android.os.CountDownTimer;
import com.garmin.proto.generated.GDILiveTrackProto;
import cq0.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llq0/d;", "Lkq0/b;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements kq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownTimer f114326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f114327b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kq0.h f114328c;

    static {
        new a(null);
    }

    @Override // kq0.b
    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar, kq0.g gVar, kq0.h hVar) {
        aVar.getClass();
        gVar.getClass();
        this.f114328c = hVar;
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.f) {
            b();
            GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification = ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.f) aVar).f36887d;
            int timeLeftS = emergencyCountdownNotification.getTimeLeftS();
            int millis = ((int) ((DateTime.now().getMillis() - ((long) 400)) / ((long) 1000))) - emergencyCountdownNotification.getUtcTimeS();
            if (Math.abs(millis) <= 5) {
                timeLeftS -= millis;
            }
            b();
            g gVar2 = new g(this, timeLeftS * 1000);
            this.f114326a = gVar2;
            gVar2.start();
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.p) {
            if (gVar.f106157a == l.USER_CAN_CANCEL_LIVE_TRACK) {
                return;
            }
            b();
            b();
            f fVar = new f(300000L, this);
            this.f114326a = fVar;
            fVar.start();
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.g) {
            b();
            e eVar = new e(this);
            this.f114326a = eVar;
            eVar.start();
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.l) {
            b();
            this.f114327b.set(((com.garmin.android.apps.connectmobile.incidentdetection.service.a.l) aVar).f36894c);
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.n) {
            b();
            int timeLeftS2 = ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.n) aVar).f36897d.getTimeLeftS();
            b();
            g gVar3 = new g(this, timeLeftS2 * 1000);
            this.f114326a = gVar3;
            gVar3.start();
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.b) {
            b();
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.C0659a) {
            b();
        } else if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) {
            b();
        } else if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.o) {
            b();
        }
    }

    public final void b() {
        CountDownTimer countDownTimer = this.f114326a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f114326a = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Llq0/d$a;", "", "<init>", "()V", "", "I_AM_OKAY_COUNTDOWN_TIMER_MILLIS", "J", "", "WATCH_ANIMATION_UPDATE_TIME_OFFSET", "I", "DEVICE_CONFIRMATION_TIMEOUT_MILLIS", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
