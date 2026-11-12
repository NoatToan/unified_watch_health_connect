package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class jeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22705a;

    public interface a {
        Surface a();

        String b();

        void c(String str);

        Object d();
    }

    public jeh(Surface surface) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22705a = new meh(surface);
        } else {
            this.f22705a = new leh(surface);
        }
    }

    public static jeh e(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarF = Build.VERSION.SDK_INT >= 28 ? meh.f((OutputConfiguration) obj) : leh.e((OutputConfiguration) obj);
        if (aVarF == null) {
            return null;
        }
        return new jeh(aVarF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String a() {
        return this.f22705a.b();
    }

    public Surface b() {
        return this.f22705a.a();
    }

    public void c(String str) {
        this.f22705a.c(str);
    }

    public Object d() {
        return this.f22705a.d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof jeh) {
            return this.f22705a.equals(((jeh) obj).f22705a);
        }
        return false;
    }

    public int hashCode() {
        return this.f22705a.hashCode();
    }

    public jeh(a aVar) {
        this.f22705a = aVar;
    }
}
