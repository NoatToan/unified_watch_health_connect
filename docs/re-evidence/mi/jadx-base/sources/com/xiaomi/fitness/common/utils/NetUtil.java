package com.xiaomi.fitness.common.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.phonenum.data.AccountCertification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NetUtil;", "", "<init>", "()V", "isWifiCon", "", "context", "Landroid/content/Context;", "isMobileAva", "getNetWorkAvailable", "acceptableSchemes", "", "", "[Ljava/lang/String;", "NETWORK_NONE", "", "NETWORK_MOBILE", "NETWORK_WIFI", "NETWORN_2G", "NETWORN_3G", "NETWORN_4G", "getNetWorkState", "getNetWorkTypeName", "getNetworkType", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetUtil {
    public static final int NETWORK_MOBILE = 0;
    public static final int NETWORK_NONE = -1;
    public static final int NETWORK_WIFI = 1;
    public static final int NETWORN_2G = 2;
    public static final int NETWORN_3G = 3;
    public static final int NETWORN_4G = 4;

    @NotNull
    public static final NetUtil INSTANCE = new NetUtil();

    @NotNull
    private static final String[] acceptableSchemes = {"http:", "https:", "file:"};

    private NetUtil() {
    }

    public final boolean getNetWorkAvailable(@NotNull Context context) {
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final int getNetWorkState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                return 0;
            }
        }
        return -1;
    }

    @NotNull
    public final String getNetWorkTypeName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int networkType = getNetworkType(context);
        if (networkType == 1) {
            return "wifi";
        }
        if (networkType == 2) {
            return com.xiaomi.hm.health.baseutil.NetUtil.VALUE_NETWORK_TYPE_2G;
        }
        if (networkType != 3) {
            return networkType != 4 ? "" : com.xiaomi.hm.health.baseutil.NetUtil.VALUE_NETWORK_TYPE_4G;
        }
        return com.xiaomi.hm.health.baseutil.NetUtil.VALUE_NETWORK_TYPE_3G;
    }

    @TargetApi(3)
    public final int getNetworkType(@NotNull Context context) {
        NetworkInfo.State state;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return 1;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null) {
                NetworkInfo.State state2 = networkInfo2.getState();
                String subtypeName = networkInfo2.getSubtypeName();
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 4;
                        default:
                            return (StringsKt__StringsJVMKt.equals(subtypeName, "TD-SCDMA", true) || StringsKt__StringsJVMKt.equals(subtypeName, "WCDMA", true) || StringsKt__StringsJVMKt.equals(subtypeName, "CDMA2000", true)) ? 3 : 0;
                    }
                }
            }
        }
        return -1;
    }

    public final boolean isMobileAva(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
        Intrinsics.checkNotNullExpressionValue(allNetworkInfo, "getAllNetworkInfo(...)");
        boolean z = false;
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (StringsKt__StringsJVMKt.equals(networkInfo.getTypeName(), AccountCertification.Source.SOURCE_TYPE_OPERATOR_MOBILE, true) && networkInfo.isConnected()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean isWifiCon(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
        Intrinsics.checkNotNullExpressionValue(allNetworkInfo, "getAllNetworkInfo(...)");
        boolean z = false;
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (StringsKt__StringsJVMKt.equals(networkInfo.getTypeName(), NetworkUtils.NETWORK_TYPE_WIFI, true) && networkInfo.isConnected()) {
                z = true;
            }
        }
        return z;
    }
}
