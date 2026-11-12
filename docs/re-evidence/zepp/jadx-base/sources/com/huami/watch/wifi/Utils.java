package com.huami.watch.wifi;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/wifi/Utils;", "", "Landroid/os/Bundle;", "bundle", "", "getBundleString", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, PointCategory.PERMISSION, "", "checkPermission", "", "checkWifiRelatedPermission", "INVALID_SSID", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    @NotNull
    public static final String INVALID_SSID = "unknown ssid";

    private Utils() {
    }

    public final boolean checkPermission(@Nullable Context context, @Nullable String permission) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    @NotNull
    public final List<String> checkWifiRelatedPermission(@NotNull Context context) {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.CHANGE_WIFI_STATE"});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (!INSTANCE.checkPermission(context, (String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getBundleString(@Nullable Bundle bundle) {
        String strJoinToString$default = null;
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            for (String str : setKeySet) {
                arrayList.add(str + ": " + bundle.get(str));
            }
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "; ", null, null, 0, null, null, 62, null);
        }
        return '{' + strJoinToString$default + '}';
    }
}
