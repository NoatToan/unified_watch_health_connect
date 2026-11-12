package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
class tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tc f48961a = new tc();

    static tc d() {
        return f48961a;
    }

    private tc() {
    }

    ta e(Context context) {
        String strA = um.a("browserSwitch.request", context);
        if (strA == null) {
            return null;
        }
        try {
            return ta.c(strA);
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            return null;
        }
    }

    void c(ta taVar, Context context) {
        try {
            um.b("browserSwitch.request", taVar.d(), context);
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
        }
    }

    void a(td tdVar, Context context) {
        try {
            um.b("browserSwitch.result", tdVar.b(), context);
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
        }
    }

    td b(Context context) {
        String strA = um.a("browserSwitch.result", context);
        if (strA == null) {
            return null;
        }
        try {
            return td.a(strA);
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            return null;
        }
    }

    void c(Context context) {
        um.b("browserSwitch.request", context);
    }

    void a(Context context) {
        um.b("browserSwitch.result", context);
        um.b("browserSwitch.request", context);
    }
}
