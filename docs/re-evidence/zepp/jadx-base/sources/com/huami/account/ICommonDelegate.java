package com.huami.account;

import android.app.Activity;
import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.databases.model.HmProperty;
import java.io.File;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0015H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H'J\b\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001d\u001a\u00020\u0005H&¨\u0006\u001e"}, d2 = {"Lcom/huami/account/ICommonDelegate;", "", "", "key", "value", "", "setProperty", "defaultValue", "getProperty", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", "list", "setProperties", "", "isForce", "postPropertyToServer", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/io/File;", "zipFile", "archiveDir", "", "type", "getBoundDeviceId", "getSyncedStatusProperty", "Landroid/app/Activity;", "getTopActivity", "isForeground", "getChannelName", "initHttpConfig", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface ICommonDelegate {
    boolean archiveDir(@NotNull Context context, @NotNull File zipFile);

    @Nullable
    String getBoundDeviceId(int type);

    @NotNull
    String getChannelName();

    @Nullable
    String getProperty(@NotNull String key, @Nullable String defaultValue);

    int getSyncedStatusProperty();

    @Deprecated(message = "主工程对应实现存在缺陷，获取当前 Activity 有获取不到的情况")
    @Nullable
    Activity getTopActivity();

    void initHttpConfig();

    boolean isForeground();

    void postPropertyToServer(boolean isForce);

    void setProperties(@NotNull List<? extends HmProperty> list);

    void setProperty(@NotNull String key, @Nullable String value);
}
