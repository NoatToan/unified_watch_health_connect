package kd0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/f3;", "Lbn0/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f3 implements bn0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn0.b f104064a;

    public f3() {
        bn0.f.N.getClass();
        bn0.c.f18976a.getClass();
        this.f104064a = new bn0.b((bn0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GCS_API, bn0.c.class, new c83.h.a[0], null, null, null, 120));
    }

    @Override // bn0.d
    public final long a() {
        return GCMSettingManager.r(fd0.d.GROUP_RIDE, null);
    }

    @Override // bn0.d
    public final String b(long j8) {
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null) {
            return "";
        }
        String displayName = fVarI.getDisplayName();
        if (displayName != null) {
            return displayName;
        }
        String productDisplayName = fVarI.getProductDisplayName();
        productDisplayName.getClass();
        return productDisplayName;
    }

    @Override // bn0.d
    public final Object c(long j8, String str, bn0.n.a aVar) {
        Object objE = o53.c0.e(new e3(str, j8, null), aVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // bn0.d
    public final Object d(String str, bn0.m.a aVar) {
        bn0.b bVar = this.f104064a;
        bVar.getClass();
        return com.garmin.android.apps.connectmobile.f0.J(bVar, new bn0.a(bVar, str, null), aVar);
    }

    @Override // bn0.d
    public final Intent e(GroupRideShareActivity groupRideShareActivity) {
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(groupRideShareActivity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", fd0.d.GROUP_RIDE);
        return intent;
    }
}
