package com.huami.account.utils;

import android.content.Context;
import android.os.Bundle;
import com.huami.account.AccountExternalsKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0013\u0010\u000e\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/utils/AppChannel;", "getAppChannel", "a", "Lcom/huami/account/utils/AppChannel;", "getAccountSampleChannel", "()Lcom/huami/account/utils/AppChannel;", "setAccountSampleChannel", "(Lcom/huami/account/utils/AppChannel;)V", "accountSampleChannel", "", "getAppName", "()Ljava/lang/String;", "appName", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class AppChannelKt {

    @NotNull
    private static AppChannel a = AppChannel.Unknown;

    @NotNull
    public static final AppChannel getAccountSampleChannel() {
        return a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final AppChannel getAppChannel(@NotNull Context context) {
        String packageName = context.getPackageName();
        if (packageName != null) {
            switch (packageName.hashCode()) {
                case -1919583202:
                    if (packageName.equals(b.Hollywood)) {
                        return AppChannel.Hollywood;
                    }
                    break;
                case -471218654:
                    if (packageName.equals(b.Sample)) {
                        return a;
                    }
                    break;
                case 298358445:
                    if (packageName.equals("com.huami.watch.hmwatchmanager")) {
                        return AppChannel.Zepp;
                    }
                    break;
                case 435792692:
                    if (packageName.equals(b.Amazfit)) {
                        return AppChannel.Amazfit;
                    }
                    break;
                case 1966418623:
                    if (packageName.equals("com.xiaomi.hm.health")) {
                        return AppChannel.MiFit;
                    }
                    break;
            }
        }
        return AppChannel.Unknown;
    }

    @NotNull
    public static final String getAppName() {
        Context appContext = AccountExternalsKt.getAppContext();
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        String string = bundle == null ? null : bundle.getString("hm_app_id");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("在 AndroidManifest 中配置 meta-data：hm_app_id");
    }

    public static final void setAccountSampleChannel(@NotNull AppChannel appChannel) {
        a = appChannel;
    }
}
