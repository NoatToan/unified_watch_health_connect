package wn;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import j23.t;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwn/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f186096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f186097b;

    public c(Context context) {
        context.getClass();
        this.f186096a = context;
        this.f186097b = new l22.a(context);
    }

    public final String a(sn.h hVar) {
        hVar.getClass();
        DateTime dateTimeT = hVar.t();
        String string = "";
        l22.a aVar = this.f186097b;
        if (dateTimeT != null) {
            int hourOfDay = dateTimeT.getHourOfDay();
            if (6 <= hourOfDay && hourOfDay < 12) {
                string = aVar.getString(R.string.lbl_morning);
            } else if (12 <= hourOfDay && hourOfDay < 17) {
                string = aVar.getString(R.string.lbl_afternoon);
            } else if (17 <= hourOfDay && hourOfDay < 20) {
                string = aVar.getString(R.string.lbl_evening);
            } else if (h0.R(t.l(20, 6), Integer.valueOf(hourOfDay))) {
                string = aVar.getString(R.string.lbl_night);
            }
        }
        return j.o(" - ", string, new StringBuilder(aVar.getString(R.string.lbl_health_snapshot)));
    }

    public final String b(sn.h hVar) {
        if (hVar == null) {
            return "";
        }
        String activityName = hVar.getActivityName();
        return (activityName == null || activityName.length() <= 0) ? a(hVar) : activityName;
    }
}
