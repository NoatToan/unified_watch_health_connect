package defpackage;

import net.openid.appauth.Clock;

/* JADX INFO: loaded from: classes20.dex */
public class zri implements Clock {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zri f54538b = new zri();

    private zri() {
    }

    @Override // net.openid.appauth.Clock
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
