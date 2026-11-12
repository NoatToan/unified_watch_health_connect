package com.huami.snore.core.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/snore/core/util/NetUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/ConnectivityManager;", "a", "", "isNetworkConnect", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class NetUtil {

    @NotNull
    public static final NetUtil INSTANCE = new NetUtil();

    private NetUtil() {
    }

    private final ConnectivityManager a(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null && (systemService instanceof ConnectivityManager)) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    public final boolean isNetworkConnect(@NotNull Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManagerA = a(context);
        return (connectivityManagerA == null || (activeNetworkInfo = connectivityManagerA.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }
}
