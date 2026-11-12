package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lj31/w0;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96942b;

    static {
        new a(null);
    }

    public w0(b31.f fVar) {
        fVar.getClass();
        this.f96942b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) throws Throwable {
        y0 y0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f96950d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f96950d = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object objP = y0Var.f96948b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var.f96950d;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objP);
            if (!hk0.p.k(j8)) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "MusicFeatureHandler", "Handshake not completed; aborting music apps check");
                return Unit.INSTANCE;
            }
            com.garmin.android.apps.connectmobile.connectiq.b0 b0VarE = com.garmin.android.apps.connectmobile.connectiq.b0.e();
            b0VarE.f31823a = j8;
            y0Var.f96947a = j8;
            y0Var.f96950d = 1;
            o53.k kVar = new o53.k(u13.f.b(y0Var), 1);
            kVar.q();
            b0VarE.d(GDIConnectIQInstalledApps.AppType.AUDIO_CONTENT_PROVIDER, new x0(kVar));
            objP = kVar.p();
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = y0Var.f96947a;
            o13.r.b(objP);
        }
        List list = (List) objP;
        if (list != null && !list.isEmpty()) {
            z14 = false;
        }
        a2 a2Var2 = a2.ONBOARDING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("Installed ConnectIQ Music Providers fetch success - has apps installed = ", !z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "MusicFeatureHandler", strH);
        if (!z14) {
            this.f96942b.a(j8, e31.a.HAS_INSTALLED_MUSIC_APPS);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        MusicSetupActivity.f43129f.getClass();
        context.startActivity(MusicSetupActivity.a.a(context, j8, str));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/w0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
