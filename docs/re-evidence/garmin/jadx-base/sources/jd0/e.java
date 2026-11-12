package jd0;

import am.x0;
import android.app.Dialog;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljd0/e;", "Lvg0/a;", "Lfm/a;", "statsTextProvider", "<init>", "(Lfm/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements vg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm.a f98345a;

    static {
        new a(null);
    }

    public e(fm.a aVar) {
        aVar.getClass();
        this.f98345a = aVar;
    }

    @Override // vg0.a
    public final List<aq.c> a(Context context, ps.q qVar) {
        context.getClass();
        return this.f98345a.a(context, qVar, new fm.e(context));
    }

    @Override // vg0.a
    public final void b(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        UserProfileActivity.a.c(context, str, str2, null);
    }

    @Override // vg0.a
    public final void c(androidx.fragment.app.m mVar, com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
        dVar.getClass();
        if (dVar == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
            Dialog errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(mVar, i14, -1);
            if (errorDialog != null) {
                errorDialog.show();
                return;
            }
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "ActivityFeedDelegateImpl", "Baidu map is unavailable");
    }

    @Override // vg0.a
    public final void d(androidx.fragment.app.m mVar, long j8, String str, x0 x0Var) {
        str.getClass();
        x0Var.getClass();
        os.b bVarA4 = ge1.b.x(x0Var).f120242d.a4();
        Boolean bool = Boolean.FALSE;
        ActivityMapActivity.la(mVar, bVarA4, null, j8, true, true, null, str, bool, bool, null, null);
    }

    @Override // vg0.a
    public final void e(Context context, wg0.a aVar) {
        aVar.getClass();
        Long l14 = aVar.f185042a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            x0 x0Var = aVar.f185044c;
            am.h hVar = aVar.j() ? am.h.VIEW_EDIT : am.h.VIEW_ONLY;
            aq.b bVar = new aq.b();
            bVar.f11823b = jLongValue;
            if (hVar != null) {
                bVar.f11824c = hVar;
            }
            bVar.f11825d = aVar.j();
            bVar.f11827f = x0Var.f4358a;
            context.startActivity(bVar.a(context));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljd0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
