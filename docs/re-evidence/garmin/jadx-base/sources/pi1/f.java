package pi1;

import am.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.DisplayMetrics;
import androidx.lifecycle.w0;
import c22.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import f12.l;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wd2.m;
import wd2.m1;
import wd2.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpi1/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f137862b;

    public f(Context context) {
        context.getClass();
        this.f137861a = context;
    }

    public final void a(String str, String str2, StringBuilder sb3) {
        this.f137862b = !this.f137862b;
        sb3.append("<tr class='");
        sn.a.t(sb3, this.f137862b ? "tbl_row_even" : "tbl_row_odd", "'>", "<td>", str);
        j.y(sb3, "</td><td>", str2, "</td></tr>");
    }

    public final void b(String str, StringBuilder sb3) {
        sn.a.t(sb3, "<table bgcolor='", "#000000", "' border='0' cellpadding='4' cellspacing='1' width='100%'>", "<tr class='tbl_header'><td colspan='2'>");
        sb3.append(str);
        sb3.append("</td></tr>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        String str;
        String str2;
        StringBuilder sb3 = new StringBuilder(5000);
        sb3.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><style type='text/css'>\n  body {font-family:arial;font-size:9px;font-weight:normal;font-style:normal;margin:10px;}\n  .tbl_header {font-weight:bold;background-color:#D8D8D8;}\n  .tbl_row_even {background-color:#FFFFFF;}\n  .tbl_row_odd {background-color:#E8E8E8;}\n</style>\n</head><body>");
        this.f137862b = true;
        b("GCM ~ System<br/>" + new Date().toGMTString(), sb3);
        a("Build Flavor", "vanilla", sb3);
        a("Build Type", "release", sb3);
        a("Build Ver. Name", "5.30.1", sb3);
        a("Build Ver. Code", "11657", sb3);
        a("Build Debug", BooleanUtils.FALSE, sb3);
        a("Environment", GCMSettingManager.k().f77335a.name(), sb3);
        a("Auth Lib. Ver.", "16.1.0", sb3);
        Context context = this.f137861a;
        PackageInfo packageInfoA = je.b.a(context);
        String str3 = "Not Available";
        if (packageInfoA == null || (str = packageInfoA.packageName) == null) {
            str = "Not Available";
        }
        a("Web View Package", str, sb3);
        if (packageInfoA != null && (str2 = packageInfoA.versionName) != null) {
            str3 = str2;
        }
        a("Web View Ver.", str3, sb3);
        sb3.append("</table><br/>");
        this.f137862b = true;
        b("GCM ~ User", sb3);
        Boolean bool = null;
        int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userProfilePk);
        a("PK", sb4.toString(), sb3);
        l.f68084a.getClass();
        a("GCS Txn Key", l.a.a().F0(), sb3);
        a("Username", l.a.a().getUserName(), sb3);
        a("Displayname", ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), sb3);
        a("Fullname", ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName(), sb3);
        a("Consent Region", b0.b("undefined"), sb3);
        Set<String> setN = l.a.a().N();
        if (!setN.isEmpty()) {
            Iterator<String> it = setN.iterator();
            while (it.hasNext()) {
                a("Connect Role", it.next(), sb3);
            }
        }
        sb3.append("</table><br/>");
        Set<z1> setA = m.a();
        Set<z1> set = setA;
        boolean zIsEmpty = set.isEmpty();
        boolean z14 = !zIsEmpty;
        if (!zIsEmpty) {
            this.f137862b = true;
            b("GCM ~ LiveTrack", sb3);
            String string = Boolean.toString(z14);
            string.getClass();
            a("In Progress", string, sb3);
            l.f68084a.getClass();
            a("Nbr. Invites", String.valueOf(l.a.a().i3()), sb3);
            m1 m1Var = (m1) ge1.b.W(t13.h.f161748a, new c(this, null));
            if (m1Var != null) {
                w0 w0VarB = m1Var.b(true);
                ge2.e eVar = w0VarB != null ? (ge2.e) w0VarB.d() : null;
                if (eVar != null) {
                    bool = eVar.f77024c;
                }
            }
            if (m1Var != null) {
                m1Var.d(context);
            }
            a("Extend Sharing", String.valueOf(s.g(bool, Boolean.TRUE)), sb3);
            if (!set.isEmpty()) {
                for (z1 z1Var : setA) {
                    a("Device Unit Id", String.valueOf(z1Var.f184693a), sb3);
                    a("Sessions count", String.valueOf(z1Var.f184698f.size()), sb3);
                    String str4 = z1Var.f184697e;
                    if (str4 == null) {
                        str4 = "";
                    }
                    a("Publisher Id", str4, sb3);
                }
            }
            sb3.append("</table><br/>");
        }
        this.f137862b = true;
        b("Android Device ~ General", sb3);
        for (String[] strArr : c22.h.b()) {
            String str5 = strArr[0];
            if (str5 == null) {
                str5 = "";
            }
            String str6 = strArr[1];
            if (str6 == null) {
                str6 = "";
            }
            a(str5, str6, sb3);
        }
        sb3.append("</table><br/>");
        this.f137862b = true;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        b("Android Device ~ Display Metrics", sb3);
        a("Scale Factor for DIPs", String.valueOf(displayMetrics.density), sb3);
        a("Scale Factor for Fonts", String.valueOf(displayMetrics.scaledDensity), sb3);
        a("Font Scale", c22.b.a(context) + "x", sb3);
        a("Display Width PX", String.valueOf(displayMetrics.widthPixels), sb3);
        a("Display Height PX", String.valueOf(displayMetrics.heightPixels), sb3);
        a("Exact Physical PX/Inch X", String.valueOf(displayMetrics.xdpi), sb3);
        a("Exact Physical PX/Inch Y", String.valueOf(displayMetrics.ydpi), sb3);
        sb3.append("</table><br/>");
        sb3.append("</body></html>");
        return sb3.toString();
    }
}
