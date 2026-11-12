package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi24;
import com.example.statistics.export.OneTrackConstant;
import defpackage.m1p;
import defpackage.ppe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "readSystemState", "()Landroidx/work/impl/constraints/NetworkState;", "", "startTracking", "()V", "stopTracking", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "androidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1", "networkCallback", "Landroidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1;", "Landroid/content/Context;", "context", "Lm1p;", "taskExecutor", "<init>", "(Landroid/content/Context;Lm1p;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final NetworkStateTracker24$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(@NotNull Context context, @NotNull m1p taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                ppe.e().a(NetworkStateTrackerKt.TAG, "Network capabilities changed: " + capabilities);
                NetworkStateTracker24 networkStateTracker24 = this.this$0;
                networkStateTracker24.setState(Build.VERSION.SDK_INT >= 28 ? NetworkStateTrackerKt.getActiveNetworkState(capabilities) : NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                ppe.e().a(NetworkStateTrackerKt.TAG, "Network connection lost");
                NetworkStateTracker24 networkStateTracker24 = this.this$0;
                networkStateTracker24.setState(NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager));
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        try {
            ppe.e().a(NetworkStateTrackerKt.TAG, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            ppe.e().d(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            ppe.e().d(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        try {
            ppe.e().a(NetworkStateTrackerKt.TAG, "Unregistering network callback");
            NetworkApi21.unregisterNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            ppe.e().d(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            ppe.e().d(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    @NotNull
    public NetworkState readSystemState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }
}
