package pm0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lpm0/k;", "Lg/a;", "", "", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends g.a<Long, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.e f138625a;

    public k(com.garmin.android.apps.connectmobile.group.details.challenges.e eVar) {
        this.f138625a = eVar;
    }

    @Override // g.a
    public final Intent a(Context context, Long l14) {
        long jLongValue = l14.longValue();
        context.getClass();
        GroupInviteActivity.a aVar = GroupInviteActivity.f36358e;
        Context contextRequireContext = this.f138625a.requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        return l2.d(contextRequireContext, GroupInviteActivity.class, "GCM_extra_connection_group_id", jLongValue);
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
