package kq0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService;
import com.garmin.proto.generated.GDILiveTrackProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkq0/j;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f106174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f106175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f106176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GDILiveTrackProto.EmergencyCountdownNotification f106177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GDILiveTrackProto.StartRequest f106178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GDILiveTrackProto.StopNotification f106179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f106180g;

    static {
        new a(null);
    }

    public j(Context context, Intent intent) {
        this.f106174a = context;
        this.f106175b = intent;
        this.f106176c = -1L;
        this.f106180g = "action.incident.detected";
    }

    public final Intent a() {
        Context context = this.f106174a;
        if (context == null) {
            return new Intent();
        }
        Intent intent = new Intent(context, (Class<?>) WellnessIncidentDetectionService.class);
        intent.putExtra("extra.remote.device.id", this.f106176c);
        intent.putExtra("extra.incident.detected.proto", this.f106177d);
        intent.putExtra("extra.live.track.proto", this.f106178e);
        intent.putExtra("extra.end.live.track.proto", this.f106179f);
        intent.setAction(this.f106180g);
        return intent;
    }

    public final GDILiveTrackProto.EmergencyCountdownNotification b() {
        Object serializableExtra;
        Intent intent = this.f106175b;
        if (intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("extra.incident.detected.proto", GDILiveTrackProto.EmergencyCountdownNotification.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("extra.incident.detected.proto");
            serializableExtra = (GDILiveTrackProto.EmergencyCountdownNotification) (serializableExtra2 instanceof GDILiveTrackProto.EmergencyCountdownNotification ? serializableExtra2 : null);
        }
        return (GDILiveTrackProto.EmergencyCountdownNotification) serializableExtra;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lkq0/j$a;", "", "<init>", "()V", "", "ACTION_INCIDENT_DETECTED", "Ljava/lang/String;", "ACTION_FALL_DETECTED", "ACTION_PAUSE_DETECTED", "ACTION_CANCEL_INCIDENT_FROM_GCM", "ACTION_CANCEL_INCIDENT_FROM_DEVICE", "ACTION_EXPIRED_INCIDENT_FROM_DEVICE", "ACTION_FINISH_INCIDENT_FROM_DEVICE", "ACTION_RECEIVED_LIVE_TRACK_SESSION_FROM_DEVICE", "EXTRA_INCIDENT_DETECTED_PROTO", "EXTRA_REMOTE_DEVICE_ID", "EXTRA_LIVE_TRACK_PROTO", "EXTRA_END_LIVE_TRACK_SESSION_PROTO", "EXTRA_INCIDENT_FROM_GCM_I_AM_OK", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ j(Context context, Intent intent, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : context, (i14 & 2) != 0 ? null : intent);
    }
}
