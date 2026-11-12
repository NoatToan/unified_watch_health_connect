package defpackage;

import com.huawei.android.appbundle.remote.RemoteTask;

/* JADX INFO: loaded from: classes22.dex */
final class azg extends RemoteTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RemoteTask f838b;
    private final azj e;

    azg(azj azjVar, RemoteTask remoteTask) {
        this.e = azjVar;
        this.f838b = remoteTask;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        this.e.d(this.f838b);
    }
}
