package com.huami.account.ui.simplify;

import android.app.Activity;
import android.content.Context;
import com.huami.account.ICommonDelegate;
import com.huami.account.utils.LogFileUtils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.HmProperty;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016¨\u0006!"}, d2 = {"Lcom/huami/account/ui/simplify/SimpleCommonDelegate;", "Lcom/huami/account/ICommonDelegate;", "", "key", "value", "", "setProperty", "defaultValue", "getProperty", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", "list", "setProperties", "", "isForce", "postPropertyToServer", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/io/File;", "zipFile", "archiveDir", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "getBoundDeviceId", "", "getSyncedStatusProperty", "Landroid/app/Activity;", "getTopActivity", "isForeground", "getChannelName", "initHttpConfig", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public class SimpleCommonDelegate implements ICommonDelegate {
    @Override // com.huami.account.ICommonDelegate
    public boolean archiveDir(@NotNull Context context, @NotNull File zipFile) {
        return LogFileUtils.INSTANCE.archiveLogFiles(context, zipFile);
    }

    @Nullable
    public String getBoundDeviceId(@NotNull HMDeviceType type) {
        return "MOCK_ID";
    }

    @Override // com.huami.account.ICommonDelegate
    @NotNull
    public String getChannelName() {
        return "internal";
    }

    @Override // com.huami.account.ICommonDelegate
    @Nullable
    public String getProperty(@NotNull String key, @Nullable String defaultValue) {
        return null;
    }

    @Override // com.huami.account.ICommonDelegate
    public int getSyncedStatusProperty() {
        return 0;
    }

    @Override // com.huami.account.ICommonDelegate
    @Nullable
    public Activity getTopActivity() {
        return null;
    }

    @Override // com.huami.account.ICommonDelegate
    public void initHttpConfig() {
    }

    @Override // com.huami.account.ICommonDelegate
    public boolean isForeground() {
        return true;
    }

    @Override // com.huami.account.ICommonDelegate
    public void postPropertyToServer(boolean isForce) {
    }

    @Override // com.huami.account.ICommonDelegate
    public void setProperties(@NotNull List<? extends HmProperty> list) {
    }

    @Override // com.huami.account.ICommonDelegate
    public void setProperty(@NotNull String key, @Nullable String value) {
    }
}
