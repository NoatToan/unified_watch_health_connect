package cx0;

import com.garmin.android.apps.connectmobile.menstrualcycle.network.ServerResponseException;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import oauth.signpost.exception.OAuthException;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final com.garmin.android.library.backgroundtaskmanagement.b.c a(Throwable th3) {
        if (th3 == null || (th3 instanceof CancellationException)) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if ((th3 instanceof ConnectException) || (th3 instanceof UnknownHostException)) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
        }
        if (th3 instanceof OAuthException) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNAUTHORIZED;
        }
        if (th3 instanceof NoNetworkException) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK;
        }
        if ((th3 instanceof SSLException) || (th3 instanceof IOException)) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
        }
        return th3 instanceof ServerResponseException ? ((ServerResponseException) th3).getStatus() : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
    }
}
