package ba;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import z6.q;
import z6.w;
import z6.y;

/* JADX INFO: loaded from: classes.dex */
public class c extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16963e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaSessionCompat.Token f16964f;

    public c(q qVar) {
        f(qVar);
    }

    @Override // z6.w
    public final void b(y yVar) {
        int i14 = Build.VERSION.SDK_INT;
        Notification.Builder builder = yVar.f202748b;
        if (i14 >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f16963e, this.f16964f));
        } else {
            a.d(builder, a.b(a.a(), this.f16963e, this.f16964f));
        }
    }

    public c() {
    }
}
