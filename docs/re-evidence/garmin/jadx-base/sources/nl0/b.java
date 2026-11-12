package nl0;

import android.app.Activity;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lnl0/b;", "", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "activityFinish", "", "action", "", "extraInfo", "<init>", "(Landroid/app/Activity;ZLjava/lang/String;[Ljava/lang/String;)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f126478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f126480d;

    static {
        new a(null);
    }

    public b(Activity activity, boolean z14, String str, String... strArr) {
        activity.getClass();
        str.getClass();
        strArr.getClass();
        this.f126477a = activity;
        this.f126478b = z14;
        this.f126479c = str;
        this.f126480d = strArr;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final nl0.a a() {
        Activity activity = this.f126477a;
        PackageManager packageManager = activity.getPackageManager();
        packageManager.getClass();
        c cVar = new c(packageManager);
        boolean zB = hb2.g.b(activity, hb2.g.a.GARMIN_GOLF);
        String str = this.f126479c;
        if (!zB) {
            return new k(activity, this.f126478b, b(str));
        }
        int iHashCode = str.hashCode();
        String[] strArr = this.f126480d;
        switch (iHashCode) {
            case -1496064406:
                if (str.equals("scorecard.list")) {
                    return cVar.a("com.garmin.android.apps.golf.VIEW_SCORECARD_LIST") ? new i(activity) : new n(activity);
                }
                break;
            case -978675610:
                if (str.equals("play.screen")) {
                    return cVar.a("com.garmin.android.apps.golf.PLAY_SCREEN") ? new g(activity) : new n(activity);
                }
                break;
            case -47333685:
                if (str.equals("golf.app.pairing.screen")) {
                    if (strArr.length == 3) {
                        return cVar.a("com.garmin.android.apps.golf.PLAY_SCREEN") ? new e(activity, strArr[0], strArr[2]) : new n(activity);
                    }
                    a2 a2Var = a2.GOLF;
                    i2.f36769a.getClass();
                    i2.a.p(a2Var, "DeepLinkActionFactory", "createAction : WARNING! No product number provided (mExtraInfo[0]). This is needed for Golf Pairing activity. Please resolve!");
                    return new l(activity);
                }
                break;
            case 317509900:
                if (str.equals("course.stats")) {
                    return cVar.a("com.garmin.android.apps.golf.VIEW_COURSE_STATE") ? new d(activity) : new n(activity);
                }
                break;
            case 762043745:
                if (str.equals("performance.stats")) {
                    return cVar.a("com.garmin.android.apps.golf.VIEW_PERFORMANCE_STATS") ? new f(activity) : new n(activity);
                }
                break;
            case 2129404066:
                if (str.equals("scorecard")) {
                    return cVar.a("com.garmin.android.apps.golf.VIEW_SCORECARD") ? new h(activity, strArr[0]) : new n(activity);
                }
                break;
        }
        return new l(activity);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    public final String b(String str) {
        String string;
        Activity activity = this.f126477a;
        switch (str) {
            case "scorecard.list":
                string = activity.getString(R.string.golf_message_view_statistics_in_golf_app);
                break;
            case "play.screen":
                string = activity.getString(R.string.golf_message_general_download_golf_app);
                break;
            case "golf.app.pairing.screen":
                string = activity.getString(R.string.golf_lbl_pair_device_description, this.f126480d[1]);
                break;
            case "course.stats":
            case "performance.stats":
            case "scorecard":
                string = activity.getString(R.string.golf_message_view_statistics_in_golf_app);
                break;
            default:
                string = "";
                break;
        }
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnl0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
