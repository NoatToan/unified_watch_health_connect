package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.xiaomi.onetrack.OneTrack;

/* JADX INFO: loaded from: classes11.dex */
public class jcs {
    public static jcs c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22654b = 0;

    public jcs(Context context) {
        this.f22653a = context.getApplicationContext();
    }

    public static jcs c(Context context) {
        if (c == null) {
            c = new jcs(context);
        }
        return c;
    }

    @SuppressLint({"NewApi"})
    public int a() {
        int i = this.f22654b;
        if (i != 0) {
            return i;
        }
        try {
            this.f22654b = Settings.Global.getInt(this.f22653a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f22654b;
    }

    @SuppressLint({"NewApi"})
    public Uri b() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    public boolean d() {
        String str = hht.f20082a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains(OneTrack.Param.MIUI);
    }
}
