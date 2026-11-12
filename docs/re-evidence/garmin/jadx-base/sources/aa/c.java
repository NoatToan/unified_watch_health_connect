package aa;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public c(String str, int i14, int i15) {
        super(str, i14, i15);
        new MediaSessionManager.RemoteUserInfo(str, i14, i15);
    }
}
