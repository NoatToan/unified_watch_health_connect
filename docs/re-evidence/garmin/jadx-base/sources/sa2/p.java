package sa2;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsa2/p;", "", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa2.b f158386b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f158387a = new c();

    static {
        new a(null);
        f158386b = new wa2.b("ReportsViewCoordinator", null, 2, null);
    }

    public final void a(Activity activity, String str, String str2, String str3) {
        Uri uriD;
        String string;
        String string2;
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        f158386b.getClass();
        pg2.d dVar = new pg2.d(activity, 1);
        this.f158387a.getClass();
        wa2.b bVar = c.f158325a;
        bVar.getClass();
        try {
            uriD = FileProvider.d(activity, "com.garmin.android.exportablereports.provider", new File(new ContextWrapper(activity).getDir("Garmin_Reports", 0), str3));
        } catch (IllegalArgumentException unused) {
            bVar.a("Could not file report ID in the directory");
            uriD = null;
        }
        if (uriD == null) {
            if (((ya2.a) activity).O9()) {
                wa2.c.a.a(wa2.c.f183804a, activity, activity.getString(R.string.technical_challenge_title), activity.getString(R.string.technical_challenge_message), new o13.p(activity.getString(R.string.lbl_ok), new s5.a(dVar, 7)), null, SyslogConstants.LOG_LOCAL6).show();
                return;
            }
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setDataAndType(uriD, "application/pdf");
        if (packageManager.queryIntentActivities(intent, 65536).size() <= 0) {
            PackageManager packageManager2 = activity.getPackageManager();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriD, "application/pdf");
            if (packageManager2.queryIntentActivities(intent2, 65536).size() <= 0) {
                if (((ya2.a) activity).O9()) {
                    new androidx.appcompat.app.e.a(activity).setTitle(R.string.no_share_view_options_title).setMessage(R.string.no_share_view_options_message).setNeutralButton(R.string.lbl_ok, new b(dVar, 0)).show();
                    return;
                }
                return;
            }
        }
        if (str.equals(str2)) {
            pa2.b.f136781a.getClass();
            string = activity.getString(R.string.report_email_subject_one_day, pa2.b.a.a().f136769a, str);
            string.getClass();
        } else {
            pa2.b.f136781a.getClass();
            string = activity.getString(R.string.report_email_subject_date_range, pa2.b.a.a().f136769a, str, str2);
            string.getClass();
        }
        if (str.equals(str2)) {
            pa2.b.f136781a.getClass();
            string2 = activity.getString(R.string.report_email_body_one_day, pa2.b.a.a().f136769a, str);
            string2.getClass();
        } else {
            pa2.b.f136781a.getClass();
            string2 = activity.getString(R.string.report_email_body_date_range, pa2.b.a.a().f136769a, str, str2);
            string2.getClass();
        }
        Intent intent3 = new Intent("android.intent.action.SEND");
        intent3.addFlags(1);
        intent3.setType("application/pdf");
        intent3.putExtra("android.intent.extra.SUBJECT", string);
        intent3.putExtra("android.intent.extra.TEXT", string2);
        intent3.putExtra("android.intent.extra.STREAM", uriD);
        Intent intent4 = new Intent("android.intent.action.VIEW");
        intent4.setDataAndType(uriD, "application/pdf");
        intent4.addFlags(1);
        Intent intentCreateChooser = Intent.createChooser(intent3, activity.getString(R.string.sharing_title));
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent4});
        activity.startActivity(intentCreateChooser);
        dVar.invoke(Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsa2/p$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
