package rj1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILTEProto;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lrj1/a;", "Lqi1/b;", "", "deviceId", "Lcom/garmin/proto/generated/GDILTEProto$LTEService;", "lteService", "<init>", "(JLcom/garmin/proto/generated/GDILTEProto$LTEService;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qi1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f152995d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GDILTEProto.LTEService f152997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f152998c;

    static {
        new C2891a(null);
    }

    public a(long j8, GDILTEProto.LTEService lTEService) {
        lTEService.getClass();
        this.f152996a = j8;
        this.f152997b = lTEService;
        this.f152998c = m.b(new ri1.b(7));
    }

    @Override // qi1.b
    public final void a() {
        GDILTEProto.AssistancePlusGeofencingNotification apGeofencingNotification = this.f152997b.getApGeofencingNotification();
        if (apGeofencingNotification.hasAssistancePlusCovered()) {
            a2 a2Var = a2.GENERAL;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("Processing: geoNotification.assistancePlusCovered: ", apGeofencingNotification.getAssistancePlusCovered());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "AssistancePlusGeoFencingNotificationHandler", strH);
            ((vi1.a) this.f152998c.getValue()).b(this.f152996a, apGeofencingNotification.getAssistancePlusCovered());
        }
    }

    /* JADX INFO: renamed from: rj1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2891a {
        public /* synthetic */ C2891a(j jVar) {
            this();
        }

        private C2891a() {
        }
    }
}
