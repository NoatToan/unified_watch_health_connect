package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import defpackage.m1p;
import defpackage.ppe;
import defpackage.ze4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0018\u0010\r\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0013\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u0005*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "context", "Lm1p;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "NetworkStateTracker", "(Landroid/content/Context;Lm1p;)Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "TAG", "Ljava/lang/String;", "Landroid/net/ConnectivityManager;", "", "isActiveNetworkValidated", "(Landroid/net/ConnectivityManager;)Z", "getActiveNetworkState", "(Landroid/net/ConnectivityManager;)Landroidx/work/impl/constraints/NetworkState;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "Landroid/net/NetworkCapabilities;", "(Landroid/net/NetworkCapabilities;)Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class NetworkStateTrackerKt {

    @NotNull
    private static final String TAG;

    static {
        String strI = ppe.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        TAG = strI;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final ConstraintTracker<NetworkState> NetworkStateTracker(@NotNull Context context, @NotNull m1p taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new NetworkStateTracker24(context, taskExecutor);
    }

    @NotNull
    public static final NetworkState getActiveNetworkState(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zIsActiveNetworkValidated = isActiveNetworkValidated(connectivityManager);
        boolean zA = ze4.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new NetworkState(z2, zIsActiveNetworkValidated, zA, z);
    }

    public static /* synthetic */ void getActiveNetworkState$annotations(ConnectivityManager connectivityManager) {
    }

    public static final boolean isActiveNetworkValidated(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesCompat = NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager, NetworkApi23.getActiveNetworkCompat(connectivityManager));
            if (networkCapabilitiesCompat != null) {
                return NetworkApi21.hasCapabilityCompat(networkCapabilitiesCompat, 16);
            }
            return false;
        } catch (SecurityException e) {
            ppe.e().d(TAG, "Unable to validate active network", e);
            return false;
        }
    }

    @RequiresApi(28)
    @NotNull
    public static final NetworkState getActiveNetworkState(@NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return new NetworkState(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }
}
