package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.health.suggestion.model.FitRunPlayAudio;

/* JADX INFO: loaded from: classes4.dex */
public class nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences.Editor f43246a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43248c;
    public Context d;
    public SharedPreferences e;

    public nl(Context context, String str, String str2, boolean z, boolean z2) {
        this.e = null;
        this.f43247b = z2;
        this.f43248c = str2;
        this.d = context;
        if (context != null) {
            this.e = context.getSharedPreferences(str2, 0);
        }
    }

    public void b(String str) {
        if (nf.b(str) || str.equals(FitRunPlayAudio.PLAY_TYPE_T)) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f43246a;
        if (editor != null) {
            editor.remove(str);
        }
    }

    public final void d() {
        SharedPreferences sharedPreferences;
        if (this.f43246a != null || (sharedPreferences = this.e) == null) {
            return;
        }
        this.f43246a = sharedPreferences.edit();
    }

    public void b(String str, String str2) {
        if (nf.b(str) || str.equals(FitRunPlayAudio.PLAY_TYPE_T)) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f43246a;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    public boolean b() {
        boolean z;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f43246a;
        if (editor == null) {
            z = true;
        } else {
            if (!this.f43247b && this.e != null) {
                editor.putLong(FitRunPlayAudio.PLAY_TYPE_T, jCurrentTimeMillis);
            }
            if (this.f43246a.commit()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.e != null && (context = this.d) != null) {
            this.e = context.getSharedPreferences(this.f43248c, 0);
        }
        return z;
    }

    public String c(String str) {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!nf.b(string)) {
                return string;
            }
        }
        return "";
    }
}
