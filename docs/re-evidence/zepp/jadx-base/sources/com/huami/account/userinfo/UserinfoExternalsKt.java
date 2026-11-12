package com.huami.account.userinfo;

import android.content.Context;
import com.huami.account.userinfo.di.IUserinfoDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0016\u0010\u0003\u001a\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "getUserinfoDelegate", "()Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "userinfoDelegate", "userinfo_release"}, k = 2, mv = {1, 5, 1})
public final class UserinfoExternalsKt {
    @NotNull
    public static final Context getAppContext() {
        return UserinfoExternalContainer.INSTANCE.getAppContext();
    }

    @NotNull
    public static final IUserinfoDelegate getUserinfoDelegate() {
        return UserinfoExternalContainer.INSTANCE.getUserinfoDelegate();
    }
}
