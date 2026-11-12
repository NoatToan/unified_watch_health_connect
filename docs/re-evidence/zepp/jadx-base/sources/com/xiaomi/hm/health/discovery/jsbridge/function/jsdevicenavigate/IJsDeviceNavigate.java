package com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/IJsDeviceNavigate;", "", "", "position", "", "match", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "data", "", Type.JUMP_MESSAGE, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IJsDeviceNavigate {
    void jump(@NotNull Context context, @NotNull String position, @Nullable String data);

    boolean match(@NotNull String position);
}
