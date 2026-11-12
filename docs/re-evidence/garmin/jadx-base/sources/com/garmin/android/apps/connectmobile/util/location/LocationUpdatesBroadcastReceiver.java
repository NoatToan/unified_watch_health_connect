package com.garmin.android.apps.connectmobile.util.location;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ue.i0;
import ue.l;
import ue.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/LocationUpdatesBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationUpdatesBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47269a = new a(null);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Location location;
        if (context == null || intent == null || !s.g(intent.getAction(), "com.garmin.android.apps.connectmobile.action.ACTION_LOCATION_UPDATES")) {
            return;
        }
        SignificantLocationUpdateJobService.f47270e.getClass();
        LocationResult locationResultExtractResult = LocationResult.extractResult(intent);
        if (locationResultExtractResult == null || locationResultExtractResult.getLocations().isEmpty() || (location = locationResultExtractResult.getLocations().get(0)) == null) {
            return;
        }
        i22.d dVar = new i22.d(location, null, 2, null);
        if (!dVar.k()) {
            String str = "Ignoring location object that contains fields that are not valid: " + dVar;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "SignifLocUpdJobService", str);
            return;
        }
        androidx.work.c.a aVar2 = new androidx.work.c.a();
        aVar2.f11467a.put("extra_location_payload", GsonUtil.a(dVar));
        com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).a("SignifLocUpdJobService" + dVar.getLatitude() + dVar.getLongitude(), l.REPLACE, new x.a((Class<? extends androidx.work.d>) SignificantLocationUpdateJobService.class).f(aVar2.a()).e(0L, TimeUnit.MILLISECONDS).a()).a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/LocationUpdatesBroadcastReceiver$a;", "", "<init>", "()V", "", "ACTION_LOCATION_UPDATES", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static PendingIntent a(Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) LocationUpdatesBroadcastReceiver.class);
            intent.setAction("com.garmin.android.apps.connectmobile.action.ACTION_LOCATION_UPDATES");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            broadcast.getClass();
            return broadcast;
        }

        private a() {
        }
    }
}
