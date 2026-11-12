package w10;

import android.app.NotificationManager;
import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase;

/* JADX INFO: loaded from: classes7.dex */
public class a extends com.garmin.android.library.backgroundtaskmanagement.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f181180l;

    /* JADX INFO: renamed from: w10.a$a, reason: collision with other inner class name */
    public class C3377a extends com.garmin.android.library.backgroundtaskmanagement.d {
        public C3377a(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            super(bVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            NotificationManager notificationManager = (NotificationManager) GarminConnectMobileApp.f28688j.getSystemService("notification");
            a aVar = a.this;
            notificationManager.cancel((int) (aVar.f181180l / 100));
            Context context = GarminConnectMobileApp.f28688j;
            GCMUserPersistenceDatabase.f40309a.getClass();
            GCMUserPersistenceDatabase.a.a(context).g().a(aVar.f181180l);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    public a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, long j8) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        C3377a c3377a = new C3377a(this);
        this.f181180l = j8;
        b(c3377a);
    }
}
