package g22;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import ds.e0;
import gg1.v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(Activity activity, fw.c cVar) {
        activity.getClass();
        if (cVar == null || (cVar instanceof fw.h) || (cVar instanceof fw.o)) {
            return;
        }
        Toast.makeText(activity, R.string.txt_error_occurred, 0).show();
    }

    public static final void b(Activity activity, lj0.b bVar) {
        activity.getClass();
        bVar.getClass();
        if (bVar != lj0.b.f112951e) {
            Toast.makeText(activity, R.string.txt_error_occurred, 0).show();
        }
    }

    public static final void c(Activity activity, Uri uri) {
        activity.getClass();
        uri.getClass();
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strJ = am.j.j(uri, "openExternalUrl ");
            i2.f36769a.getClass();
            i2.a.g(a2Var, strJ, e4);
        }
    }

    public static final void d(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strJ = am.j.j(uri, "openExternalUrl ");
            i2.f36769a.getClass();
            i2.a.g(a2Var, strJ, e4);
        }
    }

    public static final void e(Activity activity, String str, String str2) throws UnsupportedEncodingException {
        activity.getClass();
        str.getClass();
        str2.getClass();
        try {
            v0.a aVar = v0.T;
            String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
            aVar.getClass();
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://" + v0.a.a(strName).f77335a.f204880a + "/sso/login?logintoken=" + str + "&mobile=true&service=" + URLEncoder.encode(str2, "UTF-8") + "&clientId=GarminConnect")));
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strConcat = "openExternalUrlAuthenticatedUserOauth1 ".concat(str2);
            i2.f36769a.getClass();
            i2.a.g(a2Var, strConcat, e4);
        }
    }

    public static final void f(Context context, String str, String str2) throws UnsupportedEncodingException {
        e0.p(context, str, str2);
        try {
            v0.a aVar = v0.T;
            String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
            aVar.getClass();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://" + v0.a.a(strName).f77335a.f204880a + "/sso/login?logintoken=" + str + "&mobile=true&service=" + URLEncoder.encode(str2, "UTF-8") + "&clientId=GarminConnect")));
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strConcat = "openExternalUrlAuthenticatedUserOauth1 ".concat(str2);
            i2.f36769a.getClass();
            i2.a.g(a2Var, strConcat, e4);
        }
    }
}
