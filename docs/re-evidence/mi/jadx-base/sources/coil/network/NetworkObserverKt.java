package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import coil.util.Contexts;
import coil.util.Logger;
import coil.util.Logs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.ni4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", NetworkObserverKt.TAG, "Lcoil/network/NetworkObserver;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/network/NetworkObserver$Listener;", "logger", "Lcoil/util/Logger;", "coil-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class NetworkObserverKt {

    @NotNull
    private static final String TAG = "NetworkObserver";

    @NotNull
    public static final NetworkObserver NetworkObserver(@NotNull Context context, @NotNull NetworkObserver.Listener listener, @Nullable Logger logger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ni4.i(context, ConnectivityManager.class);
        if (connectivityManager == null || !Contexts.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (logger != null && logger.getLevel() <= 5) {
                logger.log(TAG, 5, "Unable to register network observer.", null);
            }
            return new EmptyNetworkObserver();
        }
        try {
            return new RealNetworkObserver(connectivityManager, listener);
        } catch (Exception e) {
            if (logger != null) {
                Logs.log(logger, TAG, new RuntimeException("Failed to register network observer.", e));
            }
            return new EmptyNetworkObserver();
        }
    }
}
