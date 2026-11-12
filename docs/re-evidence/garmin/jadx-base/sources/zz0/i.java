package zz0;

import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import p005kotlin.Metadata;
import uz0.m;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzz0/i;", "Lz10/d1$a;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotificationItem.Request f207617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f207618b;

    public i(NotificationItem.Request request, j jVar) {
        this.f207617a = request;
        this.f207618b = jVar;
    }

    @Override // z10.d1.a
    public final void a() {
        m requestNotificationDTO = this.f207617a.getRequestNotificationDTO();
        if (requestNotificationDTO != null) {
            this.f207618b.f207620a.p1(requestNotificationDTO);
        }
    }
}
