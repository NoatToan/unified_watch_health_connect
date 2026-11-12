package androidx.health.platform.client.impl.internal;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.health.platform.client.impl.ipc.internal.ConnectionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/health/platform/client/impl/internal/ProviderConnectionManager;", "", "<init>", "()V", "instance", "Landroidx/health/platform/client/impl/ipc/internal/ConnectionManager;", "getInstance", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "startHandlerThread", "Landroid/os/Looper;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProviderConnectionManager {
    public static final ProviderConnectionManager INSTANCE = new ProviderConnectionManager();
    private static ConnectionManager instance;

    private ProviderConnectionManager() {
    }

    public final ConnectionManager getInstance(Context context) {
        ConnectionManager connectionManager;
        zcp.c(context, "");
        synchronized (this) {
            if (instance == null) {
                instance = new ConnectionManager(context.getApplicationContext(), INSTANCE.startHandlerThread());
            }
            connectionManager = instance;
            zcp.e(connectionManager);
        }
        return connectionManager;
    }

    private final Looper startHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        zcp.b((Object) looper, "");
        return looper;
    }
}
