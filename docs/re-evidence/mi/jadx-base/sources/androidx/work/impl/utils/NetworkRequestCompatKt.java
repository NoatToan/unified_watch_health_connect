package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"capabilitiesCompat", "", "Landroid/net/NetworkRequest;", "getCapabilitiesCompat", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "getTransportTypesCompat", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkRequestCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequestCompatKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,145:1\n3819#2:146\n4337#2,2:147\n3819#2:149\n4337#2,2:150\n*S KotlinDebug\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequestCompatKt\n*L\n53#1:146\n53#1:147,2\n94#1:149\n94#1:150,2\n*E\n"})
public final class NetworkRequestCompatKt {
    @RequiresApi(28)
    @NotNull
    public static final int[] getCapabilitiesCompat(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.capabilities(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 29; i++) {
            int i2 = iArr[i];
            if (NetworkRequest28.INSTANCE.hasCapability$work_runtime_release(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }

    @RequiresApi(28)
    @NotNull
    public static final int[] getTransportTypesCompat(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.transportTypes(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            int i2 = iArr[i];
            if (NetworkRequest28.INSTANCE.hasTransport$work_runtime_release(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }
}
