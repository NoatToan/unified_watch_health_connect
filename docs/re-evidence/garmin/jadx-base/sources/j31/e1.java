package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.permissions.RequestPermissionsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/e1;", "Lj31/z0;", "Landroid/content/Context;", "applicationContext", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Landroid/content/Context;Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b31.f f96888c;

    public e1(Context context, b31.f fVar) {
        context.getClass();
        fVar.getClass();
        this.f96887b = context;
        this.f96888c = fVar;
    }

    @Override // j31.z0
    public final boolean a() {
        return true;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        if (a7.b.checkSelfPermission(this.f96887b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.f96888c.b(e31.a.HAS_PRECISE_LOCATION_ACCESS);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        String string = context.getString(R.string.activities_location_permission_request_all_time_reason);
        string.getClass();
        context.startActivity(RequestPermissionsActivity.a.a(RequestPermissionsActivity.f40292l, context, p13.x.d(j22.a.f96719h.f96735b), p13.x.d(string), null, null, 64));
    }
}
