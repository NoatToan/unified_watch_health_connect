package hk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84094a;

    public s(Context context) {
        this.f84094a = null;
        this.f84094a = context.getApplicationContext();
    }

    public static da2.i a() {
        return ((l80.b) KoinJavaComponent.get(l80.b.class)).x();
    }

    public final String b() {
        return "TMP#".concat(getClass().getSimpleName());
    }

    public void c(String str) {
        i2.l(b(), str.concat("(): Unable to execute operation. Invalid mac address"));
    }

    public final void d(long j8, String str) {
        i2.l(b(), str + "(): Unable to execute operation. Invalid unit ID (" + j8 + ").");
    }
}
