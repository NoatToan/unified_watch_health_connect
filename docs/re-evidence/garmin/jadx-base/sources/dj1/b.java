package dj1;

import aj1.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldj1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ldj1/a;", "Lbj1/a;", "notificationsApi", "<init>", "(Lbj1/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, dj1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f59950b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj1.a f59951a;

    public b(bj1.a aVar) {
        aVar.getClass();
        this.f59951a = aVar;
    }

    @Override // dj1.a
    public final Object a(NotificationPreferencesDTO notificationPreferencesDTO, o.b bVar) {
        return f0.J(this, new d(this, notificationPreferencesDTO, null), bVar);
    }

    @Override // dj1.a
    public final Object b(v13.c cVar) {
        return f0.J(this, new c(this, null), cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldj1/b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
