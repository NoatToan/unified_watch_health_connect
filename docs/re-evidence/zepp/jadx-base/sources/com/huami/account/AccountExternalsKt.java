package com.huami.account;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u0016\u0010\u0003\u001a\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000f\u001a\u00020\f8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0016\u0010\u0013\u001a\u00020\u00108@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0013\u0010\u0019\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lcom/huami/account/IAccountDelegate;", "getAccountDelegate", "()Lcom/huami/account/IAccountDelegate;", "accountDelegate", "Lcom/huami/account/ICommonDelegate;", "getCommonDelegate", "()Lcom/huami/account/ICommonDelegate;", "commonDelegate", "Lcom/huami/account/IConfigDelegate;", "getConfigDelegate", "()Lcom/huami/account/IConfigDelegate;", "configDelegate", "Lcom/huami/account/IDeviceTokenConfig;", "getDeviceTokenConfig", "()Lcom/huami/account/IDeviceTokenConfig;", "deviceTokenConfig", "", "getUserSettingsPrefix", "()Ljava/lang/String;", "userSettingsPrefix", "getUserVersionPrefix", "userVersionPrefix", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class AccountExternalsKt {
    @NotNull
    public static final IAccountDelegate getAccountDelegate() {
        return AccountExternalContainer.INSTANCE.getAccountDelegate();
    }

    @NotNull
    public static final Context getAppContext() {
        return AccountExternalContainer.INSTANCE.getAppContext();
    }

    @NotNull
    public static final ICommonDelegate getCommonDelegate() {
        return AccountExternalContainer.INSTANCE.getCommonDelegate();
    }

    @NotNull
    public static final IConfigDelegate getConfigDelegate() {
        return AccountExternalContainer.INSTANCE.getConfigDelegate();
    }

    @NotNull
    public static final IDeviceTokenConfig getDeviceTokenConfig() {
        return AccountExternalContainer.INSTANCE.getDeviceTokenDelegate();
    }

    @NotNull
    public static final String getUserSettingsPrefix() {
        return getConfigDelegate().userPropertyPrefix() + ".settings";
    }

    @NotNull
    public static final String getUserVersionPrefix() {
        return getConfigDelegate().userPropertyPrefix() + ".version";
    }
}
