package com.garmin.android.apps.connectmobile.util.location;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.proto.generated.GDICore;
import java.util.HashSet;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/d;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "", "deviceId", "", "protobufRequestId", "<init>", "(JI)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.util.location.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/d$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            long j8 = this.f47281a.f47276a;
            String string = GCMSettingManager.f41535a.getString(R.string.key_device_significant_location_update);
            HashSet hashSet = new HashSet();
            Set<String> stringSet = GCMSettingManager.f41536b.getStringSet(string, null);
            if (stringSet != null && stringSet.size() > 0) {
                for (String str : stringSet) {
                    if (!str.trim().startsWith(Long.toString(j8))) {
                        hashSet.add(str);
                    }
                }
            }
            GCMSettingManager.f41536b.edit().putStringSet(string, hashSet).apply();
            SignificantLocationUpdateJobService.a aVar = SignificantLocationUpdateJobService.f47270e;
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            aVar.getClass();
            SignificantLocationUpdateJobService.a.b(contextA);
            return Boolean.TRUE;
        }
    }

    public d(long j8, int i14) {
        super(j8, i14, GDICore.LocationData.DataType.SIGNIFICANT_LOCATION, false, 8, null);
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b a() {
        return new a(this);
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b b() {
        return new b(this);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/d$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.a {
        static {
            new C0923a(null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            GCMSettingManager.U(this.f47281a.f47276a, null);
            if (!((mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null)).a("ActivateSignificantLocationSubscriptionAction")) {
                return Boolean.FALSE;
            }
            SignificantLocationUpdateJobService.f47270e.getClass();
            SignificantLocationUpdateJobService.a.a(contextA);
            return Boolean.TRUE;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/d$a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0923a {
            public /* synthetic */ C0923a(j jVar) {
                this();
            }

            private C0923a() {
            }
        }
    }
}
