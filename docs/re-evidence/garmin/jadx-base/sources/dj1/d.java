package dj1;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.settings.notifications.repository.NotificationsRepo$setNotificationPreferencesAsync$2", f = "NotificationsRepo.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f59955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotificationPreferencesDTO f59956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, NotificationPreferencesDTO notificationPreferencesDTO, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f59955b = bVar;
        this.f59956c = notificationPreferencesDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f59955b, this.f59956c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59954a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarB = this.f59955b.f59951a.b(this.f59956c);
        this.f59954a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
