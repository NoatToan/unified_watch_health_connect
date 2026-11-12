package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest31;", "", "()V", "capabilities", "", "request", "Landroid/net/NetworkRequest;", "transportTypes", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class NetworkRequest31 {

    @NotNull
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    private NetworkRequest31() {
    }

    @NotNull
    public final int[] capabilities(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int[] capabilities = request.getCapabilities();
        Intrinsics.checkNotNullExpressionValue(capabilities, "request.capabilities");
        return capabilities;
    }

    @NotNull
    public final int[] transportTypes(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int[] transportTypes = request.getTransportTypes();
        Intrinsics.checkNotNullExpressionValue(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
