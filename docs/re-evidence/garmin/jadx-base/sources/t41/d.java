package t41;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt41/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f162280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162281b;

    public d(Context context) {
        context.getClass();
        this.f162280a = context;
        this.f162281b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }

    public final boolean a(double d14) {
        boolean z14 = this.f162281b;
        return (z14 ? 1500.0d : 1609.344d) <= d14 && d14 <= (z14 ? 241500.0d : 241401.6d);
    }

    public final void b() {
        boolean z14 = this.f162281b;
        double d14 = z14 ? 1.5d : 1.0d;
        double d15 = z14 ? 241.5d : 150.0d;
        int i14 = z14 ? R.string.lbl_kilometers : R.string.lbl_miles;
        Context context = this.f162280a;
        String string = context.getString(R.string.lbl_incorrect_distance_msg, l3.f23126d.format(d14), l3.f23126d.format(d15), u0.j(context.getString(i14)));
        string.getClass();
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_incorrect_distance_title).setMessage(string).setNeutralButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show();
    }
}
