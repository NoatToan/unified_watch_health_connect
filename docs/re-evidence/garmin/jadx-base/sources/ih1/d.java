package ih1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.f;
import d53.u;
import d53.w;
import d53.y;
import hg1.j;
import ig1.r1;
import java.util.Iterator;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih1/d;", "Lig1/r1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends r1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93514a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.ALERT_TYPE_RUN_WALK_INTERVALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.ALERT_TYPE_VIRTUAL_PACER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.ALERT_TYPE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.ALERT_TYPE_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.ALERT_TYPE_CALORIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93514a = iArr;
        }
    }

    public d(Context context) {
        super(context);
    }

    @Override // ig1.r1, fb2.z
    public final String t() {
        String string = this.f70343a.getString(R.string.device_alerts);
        string.getClass();
        return string;
    }

    @Override // ig1.r1, fb2.z
    /* JADX INFO: renamed from: u */
    public final String q(f fVar) {
        String strG;
        fVar.getClass();
        Iterator it = fVar.c0().iterator();
        String str = "";
        while (it.hasNext()) {
            int i14 = a.f93514a[((j) it.next()).ordinal()];
            if (i14 == 1) {
                strG = k.g(b(R.string.activity_options_running_mode_run_or_walk_title), ", ");
            } else if (i14 == 2) {
                strG = k.g(b(R.string.lbl_pace), ", ");
            } else if (i14 == 3) {
                strG = k.g(b(R.string.lbl_time), ", ");
            } else if (i14 != 4) {
                strG = i14 != 5 ? "" : k.g(b(R.string.lbl_calories), ", ");
            } else {
                strG = k.g(b(R.string.lbl_distance), ", ");
            }
            str = ((Object) str) + strG;
        }
        if (fVar.h1().equals(Boolean.TRUE)) {
            str = ((Object) str) + b(R.string.lbl_heart_rate_cap);
        }
        if (!w.J(str)) {
            return u.p(str, ", ", false) ? y.o0(2, str) : str;
        }
        String strB = b(R.string.lbl_off);
        strB.getClass();
        return strB;
    }
}
