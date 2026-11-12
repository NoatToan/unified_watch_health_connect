package defpackage;

import android.os.IBinder;

/* JADX INFO: loaded from: classes22.dex */
final class azl implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final azj f844a;

    azl(azj azjVar) {
        this.f844a = azjVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f844a.b();
    }
}
