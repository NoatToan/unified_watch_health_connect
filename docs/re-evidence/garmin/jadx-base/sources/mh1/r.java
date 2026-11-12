package mh1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmh1/r;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends s00.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f118497b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f118498a = o13.m.b(new q(0));

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        f().debug("onPushNotificationReceived: type=[" + cVar.f122099a + "]");
        s sVar = new s(this, garminConnectMobileApp, cVar, bundle);
        String string = bundle.getString("device-partnumber");
        o oVar = new o(sVar);
        ge1.b.T(oVar, null, null, new p(oVar, string, null), 3);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.INVITATION_STATUS_ACCEPTED, n00.c.INVITATION_STATUS_DECLINED};
    }

    public final Logger f() {
        return (Logger) this.f118498a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lmh1/r$a;", "", "<init>", "()V", "", "DEVICE_PART_NUMBER_KEY", "Ljava/lang/String;", "PROFILE_FULL_NAME_KEY", "DEVICE_NAME_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
