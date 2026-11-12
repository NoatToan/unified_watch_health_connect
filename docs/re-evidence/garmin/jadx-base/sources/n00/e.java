package n00;

import am.j;
import android.os.Bundle;
import android.os.Handler;
import c22.k;
import c22.s3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.HashMap;
import mh1.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import s00.a0;
import s00.b0;
import s00.c0;
import s00.d0;
import s00.e0;
import s00.f;
import s00.f0;
import s00.g;
import s00.g0;
import s00.h;
import s00.h0;
import s00.i;
import s00.i0;
import s00.j0;
import s00.k0;
import s00.l;
import s00.m;
import s00.n;
import s00.q0;
import s00.r0;
import s00.s;
import s00.t;
import s00.u;
import s00.v;
import s00.w;
import s00.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln00/e;", "Ln00/d;", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f122100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GarminConnectMobileApp f122101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<c, d> f122102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f122103d;

    static {
        new a(null);
    }

    public e(f12.b bVar) {
        bVar.getClass();
        this.f122100a = bVar;
        this.f122103d = (k) KoinJavaComponent.get$default(k.class, null, null, 6, null);
        GarminConnectMobileApp.f28685g.getClass();
        this.f122101b = GarminConnectMobileApp.a.b();
        this.f122102c = new HashMap<>();
        c(new s00.c());
        c(new s00.d());
        c(new j0());
        c(new m());
        c(new s00.e());
        c(new v());
        c(new i());
        c(new g0());
        c(new s00.a());
        c(new l());
        c(new com.garmin.android.apps.connectmobile.promotions.a());
        c(new q0());
        c(new r0());
        c(new d0());
        c(new r());
        c(new h0());
        c(new h());
        c(new z());
        c(new i0());
        c(new s());
        c(new g());
        c(new f());
        c(new k0());
        c(new t());
        c(new e0());
        c(new c0());
        c(new u());
        c(new a0());
        c(new n());
        c(new w());
        c(new f0());
        c(new b0());
        c(this);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String str = "No business logic for this push notification: " + cVar;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "PushNotificationManager", str);
    }

    @Override // n00.d
    public final c[] b() {
        return new c[]{c.COMMENTED_ON_USER_SEGMENT, c.COMMENTED_ON_USER_DAILYSUMMARY, c.COMMENTED_ON_USER_AUTOCHALLENGE, c.ALSO_COMMENTED_ON_USER_SEGMENT, c.ALSO_COMMENTED_ON_USER_DAILYSUMMARY, c.LEADERBOARD_EARN_FIRST_PLACE, c.LEADERBOARD_LOSE_FIRST_PLACE, c.FAVORITE_SEGMENT_DELETED, c.FAVORITE_SEGMENT_EDITED, c.FAVORITE_SEGMENT_DELETED_GROUP, c.FAVORITE_SEGMENT_EDITED_GROUP, c.GROUP_CHALLENGE_CREATED, c.GROUP_CHALLENGE_START, c.GROUP_CHALLENGE_OVER, c.AUTO_CHALLENGE_WINNER, c.INACTIVE_ACTIVITY_TRACKER_USED};
    }

    public final void c(d dVar) {
        for (c cVar : dVar.b()) {
            HashMap<c, d> map = this.f122102c;
            if (map.get(cVar) != null) {
                String strM = j.m("Push notification listener for [", cVar.name(), "] was overwritten.");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "PushNotificationManager", strM);
            }
            map.put(cVar, dVar);
        }
    }

    public final void d(Bundle bundle) {
        String strConcat = "notifyMessageReceived: provider = google, payload = ".concat(GsonUtil.a(bundle));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "PushNotificationManager", strConcat);
        c cVarA = c.a(bundle.getString("notification-key"));
        if (cVarA == c.NULL) {
            i2.a.b(a2Var, "PushNotificationManager", "Unknown push notification: " + bundle.getString("notification-key"));
            return;
        }
        d dVar = this.f122102c.get(cVarA);
        GarminConnectMobileApp garminConnectMobileApp = this.f122101b;
        if (dVar != null) {
            if (dVar != this) {
                i2.a.b(a2Var, "PushNotificationManager", "Handle push notification " + cVarA + " via " + dVar.getClass().getSimpleName());
            }
            dVar.a(garminConnectMobileApp, cVarA, bundle);
        } else {
            i2.a.b(a2Var, "PushNotificationManager", "Uncovered push notification: " + cVarA);
        }
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().i() && this.f122100a.c()) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                new Handler(garminConnectMobileApp.getMainLooper()).post(new l0.e(9, this, cVarA.name()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln00/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_NOTIFICATION_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
