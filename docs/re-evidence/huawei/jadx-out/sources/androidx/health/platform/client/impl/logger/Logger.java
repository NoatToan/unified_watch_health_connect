package androidx.health.platform.client.impl.logger;

import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.VastAttribute;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/impl/logger/Logger;", "", "<init>", "()V", "debug", "", RemoteMessageConst.Notification.TAG, "", "message", "warning", "throwable", "", VastAttribute.ERROR, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Logger {
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    @JvmStatic
    public static final void debug(String tag, String message) {
        zcp.c(tag, "");
        zcp.c(message, "");
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, message);
        }
    }

    @JvmStatic
    public static final void warning(String tag, String message) {
        zcp.c(tag, "");
        zcp.c(message, "");
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, message);
        }
    }

    @JvmStatic
    public static final void warning(String tag, String message, Throwable throwable) {
        zcp.c(tag, "");
        zcp.c(message, "");
        zcp.c(throwable, "");
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, message, throwable);
        }
    }

    @JvmStatic
    public static final void error(String tag, String message) {
        zcp.c(tag, "");
        zcp.c(message, "");
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, message);
        }
    }

    @JvmStatic
    public static final void error(String tag, String message, Throwable throwable) {
        zcp.c(tag, "");
        zcp.c(message, "");
        zcp.c(throwable, "");
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, message, throwable);
        }
    }
}
