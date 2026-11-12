package com.garmin.android.apps.connectmobile.livetracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.library.livetrack.i;
import f12.l;
import nu0.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wd2.e0;
import wd2.n1;
import wd2.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetracking/LiveTrackAutoStartReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveTrackAutoStartReceiver extends BroadcastReceiver {
    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != -1308455012 || !action.equals("com.garmin.android.library.livetrack.ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED")) {
            com.airbnb.lottie.animation.keyframe.a.w("onReceive: fix me developer, not handling action ", intent != null ? intent.getAction() : null, c.a("LiveTrackAutoStartReceiver"));
            return;
        }
        c.a("LiveTrackAutoStartReceiver").debug("onReceive ON_START_LIVE_TRACK_REQUEST_RECEIVED from livetrack library");
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        long longExtra = intent.getLongExtra("extra_device_unit_id", -1L);
        i.b bVar = i.b.f50229a;
        l.f68084a.getClass();
        e0 e0Var = new e0(longExtra, bVar, l.a.a().getUserName(), false, null, new n1.b(), null, null, null, 472, null);
        wd2.l lVar = (wd2.l) KoinJavaComponent.get$default(wd2.l.class, null, null, 6, null);
        lVar.getClass();
        q.f184563f.c().f(e0Var, lVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetracking/LiveTrackAutoStartReceiver$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
