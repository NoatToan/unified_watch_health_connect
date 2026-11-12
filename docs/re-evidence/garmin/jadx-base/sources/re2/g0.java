package re2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {
    public static final boolean a(Context context) {
        context.getClass();
        return je.b.a(context) != null;
    }

    public static final void b(URL url, Context context) {
        String string = url.toString();
        string.getClass();
        Uri uri = Uri.parse(string);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(524288);
        intent.setData(uri);
        a7.b.startActivity(context, intent, null);
    }

    public static final void c(e23.a aVar, Fragment fragment) {
        fragment.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new fh2.a(activity, 26, fragment, aVar));
        }
    }
}
