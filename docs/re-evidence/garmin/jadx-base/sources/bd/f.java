package bd;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17489b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f17490c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f17491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceScreen f17494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.preference.b f17495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.preference.b f17496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.preference.b f17497j;

    public f(Context context) {
        this.f17488a = context;
        this.f17493f = b(context);
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(b(context), 0);
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor c() {
        if (!this.f17492e) {
            return d().edit();
        }
        if (this.f17491d == null) {
            this.f17491d = d().edit();
        }
        return this.f17491d;
    }

    public final SharedPreferences d() {
        if (this.f17490c == null) {
            this.f17490c = this.f17488a.getSharedPreferences(this.f17493f, 0);
        }
        return this.f17490c;
    }
}
