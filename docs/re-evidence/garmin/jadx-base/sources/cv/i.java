package cv;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import r22.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcv/i;", "Lcv/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "rootView", "bottomNavigationBar", "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Lbv/c;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f55808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f55809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bv.c f55810d;

    static {
        new a(null);
    }

    public i(Context context, View view2, View view3, bv.c cVar) {
        context.getClass();
        view2.getClass();
        cVar.getClass();
        this.f55807a = context;
        this.f55808b = view2;
        this.f55809c = view3;
        this.f55810d = cVar;
    }

    @Override // cv.c
    public final void a(a1 a1Var) {
        a1Var.getClass();
        if (a1Var.f28723a && !a1Var.f28730h && a1Var.f28729g) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "PedalsCalibrationSnackBarHandler", "Device Connected supporting calibration -> display calibration snack bar");
            Context context = this.f55807a;
            String string = context.getString(R.string.title_garmin);
            string.getClass();
            long j8 = a1Var.f28724b;
            String str = a1Var.f28727e;
            q0.b bVar = q0.f149800b;
            String string2 = context.getString(R.string.lbl_calibrate_pedals, string);
            string2.getClass();
            q0 q0VarC = q0.b.c(bVar, this.f55808b, string2, null, 12);
            q0VarC.b(R.string.lbl_calibrate, new zz0.c(this, j8, str, q0VarC, 2));
            View view2 = this.f55809c;
            if (view2 != null && view2.getVisibility() == 0) {
                q0VarC.setAnchorView(view2);
            }
            q0VarC.show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
