package defpackage;

import android.app.Activity;
import android.app.Application;
import androidx.p004activity.ComponentActivity;

/* JADX INFO: loaded from: classes2.dex */
public class hi0 implements sxa<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f20084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20085b = new Object();
    public final Activity c;
    public final sxa<pn0> d;

    public interface a {
        gi0 a();
    }

    public hi0(Activity activity) {
        this.c = activity;
        this.d = new rn0((ComponentActivity) activity);
    }

    public Object a() {
        String str;
        if (this.c.getApplication() instanceof sxa) {
            return ((a) hc8.a(this.d, a.class)).a().a(this.c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final u9l b() {
        return ((rn0) this.d).c();
    }

    @Override // defpackage.sxa
    public Object generatedComponent() {
        if (this.f20084a == null) {
            synchronized (this.f20085b) {
                try {
                    if (this.f20084a == null) {
                        this.f20084a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20084a;
    }
}
