package com.huami.devicex.injection;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/devicex/injection/CheckPermissionApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.PERMISSION, "", "checkPermission", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface CheckPermissionApi {
    boolean checkPermission(@NotNull Context context, @NotNull String permission);
}
