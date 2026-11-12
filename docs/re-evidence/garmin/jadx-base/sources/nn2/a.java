package nn2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lnn2/a;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2437a f126704b = new C2437a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f126705a;

    public interface b {
        void z8(boolean z14);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, nn2.a$b] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ?? r14 = this.f126705a;
        if (r14 != 0) {
            f126704b.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            r14.z8(activeNetworkInfo != null ? activeNetworkInfo.isConnectedOrConnecting() : false);
        }
    }

    /* JADX INFO: renamed from: nn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2437a {
        public /* synthetic */ C2437a(j jVar) {
            this();
        }

        private C2437a() {
        }
    }
}
