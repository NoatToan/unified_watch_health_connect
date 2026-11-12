package defpackage;

import android.content.Context;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;

/* JADX INFO: loaded from: classes11.dex */
public class o3s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f28714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkStatusReceiver f28715b;

    public o3s(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f28715b = networkStatusReceiver;
        this.f28714a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28715b.a(this.f28714a);
    }
}
