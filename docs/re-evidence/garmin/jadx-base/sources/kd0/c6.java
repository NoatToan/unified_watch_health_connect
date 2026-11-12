package kd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/c6;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c6 {
    public static wd2.g2 b() {
        boolean zI = z10.d1.i(q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON);
        if (GCMSettingManager.f41536b.contains(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_strava_share))) {
            f12.l.f68084a.getClass();
            if (f12.l.a.a().Y()) {
                return (GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_strava_share), false) && zI) ? wd2.g2.b.f184481a : new wd2.g2.a(zI, GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_strava_share), false));
            }
        }
        return wd2.g2.c.f184482a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r7.c(r2, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z14, v13.c cVar) {
        b6 b6Var;
        if (cVar instanceof b6) {
            b6Var = (b6) cVar;
            int i14 = b6Var.f104003d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b6Var.f104003d = i14 - Integer.MIN_VALUE;
            } else {
                b6Var = new b6(this, cVar);
            }
        } else {
            b6Var = new b6(this, cVar);
        }
        Object obj = b6Var.f104001b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b6Var.f104003d;
        if (i15 != 0) {
            if (i15 == 1) {
                z14 = b6Var.f104000a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return b();
        }
        o13.r.b(obj);
        if (z14) {
            return b();
        }
        gr1.b.f78550d.getClass();
        gr1.b bVarA = gr1.b.a.a();
        b6Var.f104000a = z14;
        b6Var.f104003d = 1;
        if (bVarA.a(b6Var) != aVar) {
        }
        return aVar;
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON;
            b6Var.f104000a = z14;
            b6Var.f104003d = 2;
        }
        return b();
    }
}
