package zi1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationOffActivity f204852b;

    public /* synthetic */ b(NotificationOffActivity notificationOffActivity, int i14) {
        this.f204851a = i14;
        this.f204852b = notificationOffActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f204851a;
        NotificationOffActivity notificationOffActivity = this.f204852b;
        switch (i14) {
            case 0:
                NotificationOffActivity.a aVar = NotificationOffActivity.f43557e;
                Bundle extras = notificationOffActivity.getIntent().getExtras();
                return ParametersHolderKt.parametersOf(Long.valueOf(extras != null ? extras.getLong("GCM_deviceUnitID", -1L) : -1L));
            case 1:
                NotificationOffActivity.a aVar2 = NotificationOffActivity.f43557e;
                notificationOffActivity.onBackPressed();
                return Unit.INSTANCE;
            default:
                notificationOffActivity.f43560c.a(notificationOffActivity.f43558a.K(notificationOffActivity), null);
                return Unit.INSTANCE;
        }
    }
}
