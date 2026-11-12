package defpackage;

import android.os.IBinder;
import com.huawei.android.appbundle.remote.RemoteTask;

/* JADX INFO: loaded from: classes22.dex */
final class azn extends RemoteTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final azk f845b;
    private final IBinder d;

    azn(azk azkVar, IBinder iBinder) {
        this.f845b = azkVar;
        this.d = iBinder;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        this.f845b.f843c.a(this.d);
    }
}
