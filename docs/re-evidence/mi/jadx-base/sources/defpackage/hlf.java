package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class hlf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ilf f20214a;

    public hlf(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20214a = new nlf(str, i, i2);
        } else {
            this.f20214a = new olf(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hlf) {
            return this.f20214a.equals(((hlf) obj).f20214a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20214a.hashCode();
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hlf(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f20214a = new nlf(remoteUserInfo);
    }
}
