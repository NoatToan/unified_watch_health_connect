package ih1;

import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.e;
import hb2.i;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih1/b;", "Log1/a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends og1.a {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ih1/b$a", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements d80.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e.a f93509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.b f93510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f93511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f93512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ u0 f93513f;

        public a(e.a aVar, e.b bVar, long j8, String str, u0 u0Var) {
            this.f93509b = aVar;
            this.f93510c = bVar;
            this.f93511d = j8;
            this.f93512e = str;
            this.f93513f = u0Var;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            lj0.b bVar2 = lj0.b.f112951e;
            b bVar3 = b.this;
            if (bVar != bVar2) {
                Toast.makeText(bVar3.f131976a, R.string.txt_error_occurred, 0).show();
            }
            bVar3.f131976a.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            aVar.getClass();
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            b bVar = b.this;
            bVar.f131976a.hideProgressOverlay();
            String str = this.f93512e;
            u0 u0Var = this.f93513f;
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).G(bVar.f131976a, this.f93509b, this.f93510c, (f) obj, this.f93511d, str, u0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActivityOptionsActivity activityOptionsActivity) {
        super(activityOptionsActivity);
        activityOptionsActivity.getClass();
    }

    @Override // og1.a
    public final void a(e.a aVar, e.b bVar, String str, long j8, u0 u0Var) {
        aVar.getClass();
        bVar.getClass();
        u0Var.getClass();
        ActivityOptionsActivity activityOptionsActivity = this.f131976a;
        if (i.a(activityOptionsActivity)) {
            activityOptionsActivity.showProgressOverlay();
            e eVarN = e.N();
            a aVar2 = new a(aVar, bVar, j8, str, u0Var);
            eVarN.getClass();
            this.f131979d = e.M(j8, aVar, bVar, aVar2);
        }
    }
}
