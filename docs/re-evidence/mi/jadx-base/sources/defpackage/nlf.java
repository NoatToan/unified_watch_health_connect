package defpackage;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class nlf extends olf {
    public final MediaSessionManager.RemoteUserInfo d;

    public nlf(String str, int i, int i2) {
        super(str, i, i2);
        this.d = jlf.a(str, i, i2);
    }

    public nlf(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.d = remoteUserInfo;
    }
}
