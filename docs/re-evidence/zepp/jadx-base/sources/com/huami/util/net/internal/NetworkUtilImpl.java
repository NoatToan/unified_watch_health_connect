package com.huami.util.net.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.HmUtilModule;
import com.huami.util.net.ConnectType;
import com.huami.util.net.NetworkUtilApi;
import com.huami.util.net.WanType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/util/net/internal/NetworkUtilImpl;", "Lcom/huami/util/net/NetworkUtilApi;", "Landroid/net/ConnectivityManager;", "a", "Lcom/huami/util/net/ConnectType;", "c", "", "isNetworkConnect", "isWifiConnected", "getNetworkType", "Lcom/huami/util/net/WanType;", "getWanType", "", "Ljava/lang/String;", "tag", "Landroid/app/Application;", "b", "Lkotlin/Lazy;", "()Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkUtilImpl implements NetworkUtilApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = NetworkUtilImpl.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy context = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Application;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Application> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            return HmUtilModule.INSTANCE.getContext();
        }
    }

    private final ConnectivityManager a() {
        Object systemService = b().getSystemService("connectivity");
        if (systemService != null && (systemService instanceof ConnectivityManager)) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final Application b() {
        return (Application) this.context.getValue();
    }

    private final ConnectType c() {
        ConnectivityManager connectivityManagerA = a();
        NetworkInfo activeNetworkInfo = connectivityManagerA == null ? null : connectivityManagerA.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return ConnectType.WIFI;
            }
            if (type == 0) {
                return ConnectType.WAN;
            }
        }
        return ConnectType.NONE;
    }

    @Override // com.huami.util.net.NetworkUtilApi
    @NotNull
    public ConnectType getNetworkType() {
        return !isNetworkConnect() ? ConnectType.NONE : c();
    }

    @Override // com.huami.util.net.NetworkUtilApi
    @NotNull
    public WanType getWanType() {
        if (getNetworkType() == ConnectType.WAN) {
            ConnectivityManager connectivityManagerA = a();
            NetworkInfo activeNetworkInfo = connectivityManagerA == null ? null : connectivityManagerA.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int subtype = activeNetworkInfo.getSubtype();
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
                    return WanType.W2G;
                }
                if (subtype == 3 || subtype == 8 || subtype == 6 || subtype == 5 || subtype == 9 || subtype == 10 || subtype == 14 || subtype == 15 || subtype == 12) {
                    return WanType.W3G;
                }
                if (subtype == 13) {
                    return WanType.W4G;
                }
                if (m.equals("TD-SCDMA", subtypeName, true) || m.equals("WCDMA", subtypeName, true) || m.equals("CDMA2000", subtypeName, true)) {
                    return WanType.W3G;
                }
                HMLog.i("TAG", Intrinsics.stringPlus("strSubTypeName:", subtypeName), new Object[0]);
            }
        }
        return WanType.OTHER;
    }

    @Override // com.huami.util.net.NetworkUtilApi
    public boolean isNetworkConnect() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManagerA = a();
        return (connectivityManagerA == null || (activeNetworkInfo = connectivityManagerA.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // com.huami.util.net.NetworkUtilApi
    public boolean isWifiConnected() {
        return getNetworkType() == ConnectType.WIFI;
    }
}
