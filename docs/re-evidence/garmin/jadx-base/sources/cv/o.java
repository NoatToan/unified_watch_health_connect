package cv;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcv/o;", "Lcv/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f55830c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.e f55832b;

    static {
        new a(null);
    }

    public o(Context context) {
        context.getClass();
        this.f55831a = context;
    }

    @Override // cv.c
    public final void a(a1 a1Var) {
        a1Var.getClass();
        if (!a1Var.f28723a) {
            androidx.appcompat.app.e eVar = this.f55832b;
            if (eVar != null) {
                eVar.dismiss();
                return;
            }
            return;
        }
        if (a1Var.f28728f) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TruSwingConnectedDialogHandler", "Device Connected Golf Swing sensor capable -> display TruSwing connected dialog");
            androidx.appcompat.app.e eVar2 = this.f55832b;
            if (eVar2 == null || !eVar2.isShowing()) {
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this.f55831a).setTitle(R.string.golf_lbl_truswing_connected).setMessage(R.string.golf_lbl_truswing_connected_instructions).setPositiveButton(R.string.lbl_ok, new ai1.a(this, 22)).setNegativeButton(R.string.lbl_no, new com.garmin.android.apps.connectmobile.connectiq.i(8)).create();
                this.f55832b = eVarCreate;
                if (eVarCreate != null) {
                    eVarCreate.show();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
