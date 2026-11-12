package bu0;

import au0.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbu0/j;", "", "Lau0/z;", "liveActivityRepositoryWrapper", "Lbu0/i;", "isLiveActivitySessionInProgress", "Lbh2/d;", "isLockedInSession", "<init>", "(Lau0/z;Lbu0/i;Lbh2/d;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21211b;

    static {
        new a(null);
    }

    public j(z zVar, i iVar, bh2.d dVar) {
        zVar.getClass();
        iVar.getClass();
        dVar.getClass();
        this.f21210a = zVar;
        this.f21211b = iVar;
    }

    public final boolean a(boolean z14) {
        a2 a2Var = a2.ACTIVITY_RECORDING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("Has active session: ", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "IsLockedInLiveActivitySessionInProgressUseCase", strH);
        jg2.a aVar = (jg2.a) this.f21210a.f13014m.f150540a.getValue();
        i2.a.b(a2Var, "IsLockedInLiveActivitySessionInProgressUseCase", "Session type: " + aVar);
        boolean zA = bh2.d.a(aVar, z14);
        i2.a.b(a2Var, "IsLockedInLiveActivitySessionInProgressUseCase", "Locked in activity recording session: " + zA);
        return zA;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbu0/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
