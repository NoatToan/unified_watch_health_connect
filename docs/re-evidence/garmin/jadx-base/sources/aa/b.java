package aa;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2176a;

    public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            x.l("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(packageName)) {
            h.s("packageName should be nonempty");
            throw null;
        }
        this.f2176a = new c(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f2176a.equals(((b) obj).f2176a);
    }

    public final int hashCode() {
        return this.f2176a.hashCode();
    }

    public b(String str, int i14, int i15) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f2176a = new c(str, i14, i15);
                return;
            } else {
                h.s("packageName should be nonempty");
                throw null;
            }
        }
        x.l("package shouldn't be null");
        throw null;
    }
}
