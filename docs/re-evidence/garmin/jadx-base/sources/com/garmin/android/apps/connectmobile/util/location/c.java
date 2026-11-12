package com.garmin.android.apps.connectmobile.util.location;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c22.c1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.permissions.RequestPermissionsActivity;
import com.garmin.proto.generated.GDICore;
import e23.p;
import j22.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import v13.i;
import yc.l2;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "", "deviceId", "", "protobufRequestId", "<init>", "(JI)V", "b", "a", "c", "d", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.apps.connectmobile.util.location.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f47286g = new b(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0922c extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0922c(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            com.garmin.android.apps.connectmobile.util.location.b bVar = this.f47281a;
            String strE = org.apache.commons.lang3.e.e(bVar.f47276a, "Sending command to stop location tracking for device ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "RealtimeTrackingSubscription", strE);
            b.a(c.f47286g, bVar.f47276a, false);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c$d;", "Lcom/garmin/android/apps/connectmobile/permissions/RequestPermissionsActivity$b;", "", "deviceId", "", "protobufRequestId", "<init>", "(JI)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RequestPermissionsActivity.b {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47288b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.util.location.RealtimeTrackingSubscription$LocationPermissionAcceptedOperation$execute$1", f = "RealtimeTrackingSubscription.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {
            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return d.this.new b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                com.garmin.android.apps.connectmobile.util.location.a aVar2 = com.garmin.android.apps.connectmobile.util.location.a.f47272a;
                d dVar = d.this;
                long j8 = dVar.f47287a;
                int i14 = dVar.f47288b;
                aVar2.getClass();
                Set<com.garmin.android.apps.connectmobile.util.location.b> set = com.garmin.android.apps.connectmobile.util.location.a.f47274c.get(Long.valueOf(j8));
                Logger logger = com.garmin.android.apps.connectmobile.util.location.a.f47273b;
                logger.debug("activatePending: invoked for device: " + j8 + ", cached subscriptions: " + set);
                Set<com.garmin.android.apps.connectmobile.util.location.b> set2 = set;
                if (set2 == null || set2.isEmpty()) {
                    logger.error("activatePending: no subscriptions for device " + j8);
                } else {
                    for (com.garmin.android.apps.connectmobile.util.location.b bVar : set) {
                        if (s.g(bVar.f47280e, com.garmin.android.apps.connectmobile.util.location.b.c.d.f47285a)) {
                            logger.debug("activatePending: attempting to activate " + bVar);
                            bVar.a().a();
                        }
                    }
                    com.garmin.android.apps.connectmobile.util.location.a.a(i14, j8);
                }
                return Unit.INSTANCE;
            }
        }

        public d(long j8, int i14) {
            this.f47287a = j8;
            this.f47288b = i14;
        }

        @Override // com.garmin.android.apps.connectmobile.permissions.RequestPermissionsActivity.b
        public final void b() {
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(null), 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f47287a);
            parcel.writeInt(this.f47288b);
        }
    }

    public c(long j8, int i14) {
        super(j8, i14, GDICore.LocationData.DataType.REALTIME_TRACKING, false, 8, null);
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b a() {
        return new a(this);
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b b() {
        return new C0922c(this);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.a {
        static {
            new C0921a(null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!bo1.a.a().c().z()) {
                linkedHashSet.add("NO_CAPABLE_DEVICE");
            }
            j22.b bVar = j22.b.f96736a;
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            bVar.getClass();
            f fVarJ = j22.b.j(contextA);
            if (fVarJ != f.ALLOWED_ALL_TIME && fVarJ != f.DENIED) {
                linkedHashSet.add("LOCATION_PERMISSION_NOT_GRANTED");
            }
            if (!c1.a(GarminConnectMobileApp.a.a())) {
                linkedHashSet.add("GPS_TURNED_OFF");
            }
            boolean zIsEmpty = linkedHashSet.isEmpty();
            com.garmin.android.apps.connectmobile.util.location.b bVar2 = this.f47281a;
            if (zIsEmpty) {
                String strE = org.apache.commons.lang3.e.e(bVar2.f47276a, "All preconditions met, subscribing device ");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "RealtimeTrackingSubscription", strE);
                b.a(c.f47286g, bVar2.f47276a, true);
                return Boolean.TRUE;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "RealtimeTrackingSubscription", "Missing Connected GPS conditions: " + linkedHashSet);
            if (!linkedHashSet.contains("NO_CAPABLE_DEVICE") && linkedHashSet.contains("LOCATION_PERMISSION_NOT_GRANTED")) {
                i2.a.b(a2Var2, "RealtimeTrackingSubscription", "Posting notification to request user's permission.");
                Context contextA2 = GarminConnectMobileApp.a.a();
                boolean zT = j22.b.t();
                String string = zT ? contextA2.getString(R.string.activities_location_permission_request_all_time_reason) : contextA2.getString(R.string.activities_location_permission_request_reason);
                string.getClass();
                RequestPermissionsActivity.a aVar3 = RequestPermissionsActivity.f40292l;
                ArrayList arrayListD = x.d(j22.a.f96719h.f96735b, j22.a.f96718g.f96735b);
                if (zT) {
                    arrayListD.add(0, j22.a.f96720i.f96735b);
                }
                Unit unit = Unit.INSTANCE;
                Intent intentA = RequestPermissionsActivity.a.a(aVar3, contextA2, arrayListD, x.d(string), new d(bVar2.f47276a, bVar2.f47277b), zT ? contextA2.getString(R.string.activities_lbl_allow_all_the_time) : null, 64);
                intentA.setFlags(67108864);
                sz0.e eVar = sz0.e.f161367g;
                q qVar = new q(contextA2, eVar.f161386a);
                Notification notification = qVar.N;
                notification.icon = 2131232010;
                qVar.g(contextA2.getString(R.string.permission_request_notification_title_location));
                qVar.f(contextA2.getString(R.string.permission_request_notification_collapsed_location));
                qVar.f202686h = PendingIntent.getActivity(contextA2, 11, intentA, 201326592);
                qVar.f202691m = 1;
                qVar.B = "recommendation";
                notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
                Notification notificationC = qVar.c();
                notificationC.getClass();
                sz0.f.f161394a.getClass();
                sz0.f.a.f(contextA2, notificationC, 9, eVar);
                return null;
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c$a$a;", "", "<init>", "()V", "", "NO_CAPABLE_DEVICE", "Ljava/lang/String;", "LOCATION_PERMISSION_NOT_GRANTED", "GPS_TURNED_OFF", "", "NOTIFICATION_REQUEST_CODE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0921a {
            public /* synthetic */ C0921a(j jVar) {
                this();
            }

            private C0921a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static final void a(b bVar, long j8, boolean z14) {
            Object bVar2;
            bVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "RealtimeTrackingSubscription", "Sending start command = " + z14 + " to Connected GPS Service for deviceId=" + j8);
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            Intent intentD = l2.d(contextA, ConnectedGPSService.class, "DEVICE_ID_KEY", j8);
            intentD.putExtra("START_STOP_KEY", z14);
            try {
                int i14 = o13.q.f128596b;
                if (z14) {
                    a7.b.startForegroundService(contextA, intentD);
                    bVar2 = Unit.INSTANCE;
                } else {
                    bVar2 = contextA.startService(intentD);
                }
            } catch (Throwable th3) {
                int i15 = o13.q.f128596b;
                bVar2 = new o13.q.b(th3);
            }
            Throwable thB = o13.q.b(bVar2);
            if (thB != null) {
                b bVar3 = c.f47286g;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.g(a2Var2, "RealtimeTrackingSubscription", thB);
            }
        }

        private b() {
        }
    }
}
