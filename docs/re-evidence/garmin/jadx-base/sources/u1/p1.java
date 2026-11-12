package u1;

import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167657a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        u10.b bVar = null;
        Object[] objArr = 0;
        switch (this.f167657a) {
            case 0:
                return new o1(0L, null, 3, null);
            case 1:
                return new d2(0);
            case 2:
                int i14 = ConnectIQOAuthActivity.f31981g;
                return new u10.l(bVar, 1, objArr == true ? 1 : 0);
            case 3:
                FollowerRequestsPrivacyActivity.a aVar = FollowerRequestsPrivacyActivity.f47109c;
                return p3.p0.n(Boolean.FALSE);
            case 4:
                u41.a.b bVar2 = u41.a.Companion;
                return t41.a.INSTANCE.serializer();
            case 5:
                return new p3.a2(0);
            case 6:
                return Unit.INSTANCE;
            case 7:
                ub0.c cVar = ub0.c.f169719a;
                return Unit.INSTANCE;
            case 8:
                ub0.c cVar2 = ub0.c.f169719a;
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return new HashSet();
            case 11:
                return Unit.INSTANCE;
            case 12:
                uc2.a aVar2 = uc2.a.f169996a;
                return new ConcurrentHashMap(uc2.c.f170008e.getF168272d());
            case 13:
                uc2.a aVar3 = uc2.a.f169996a;
                return nd2.c.b("AuthRateLimitMgr");
            case 14:
                uc2.a aVar4 = uc2.a.f169996a;
                return new SimpleDateFormat("E MMM d, yyyy h:mm:ss z", Locale.US);
            case 15:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 16:
                int i15 = ue2.e.f170268c;
                return re2.b.f152215a.b().getSharedPreferences("GooglePlayAgeSignalsHelper", 0);
            case 17:
                return vf.b.b(new OkHttpClient());
            case 18:
                int i16 = uf2.d.f170313j;
                return (tf2.g) KoinJavaComponent.get$default(tf2.g.class, null, null, 6, null);
            case 19:
                int i17 = uf2.d.f170313j;
                return (tf2.i) KoinJavaComponent.get$default(tf2.i.class, null, null, 6, null);
            case 20:
                int i18 = uf2.d.f170313j;
                return (fg2.z) KoinJavaComponent.get$default(fg2.z.class, null, null, 6, null);
            case 21:
                int i19 = uf2.d.f170313j;
                return (fg2.c) KoinJavaComponent.get$default(fg2.c.class, null, null, 6, null);
            case 22:
                return (uf2.l0) KoinJavaComponent.get$default(uf2.l0.class, null, null, 6, null);
            case 23:
                return (uf2.u) KoinJavaComponent.get$default(uf2.u.class, null, null, 6, null);
            case 24:
                return (of2.z0) KoinJavaComponent.get$default(of2.z0.class, null, null, 6, null);
            case 25:
                int i24 = uf2.u.f170505d;
                return (vf2.q) KoinJavaComponent.get$default(vf2.q.class, null, null, 6, null);
            case 26:
                int i25 = uf2.u.f170505d;
                return (uf2.y0) KoinJavaComponent.get$default(uf2.y0.class, null, null, 6, null);
            case 27:
                int i26 = uf2.l0.f170425c;
                return (vf2.q) KoinJavaComponent.get$default(vf2.q.class, null, null, 6, null);
            case 28:
                int i27 = uf2.l0.f170425c;
                return (uf2.y0) KoinJavaComponent.get$default(uf2.y0.class, null, null, 6, null);
            default:
                int i28 = uf2.q0.f170463e;
                return (uf2.s) KoinJavaComponent.get$default(uf2.s.class, null, null, 6, null);
        }
    }
}
