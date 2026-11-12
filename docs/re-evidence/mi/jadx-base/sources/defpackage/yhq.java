package defpackage;

import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import dagger.hilt.android.EntryPointAccessors;

/* JADX INFO: loaded from: classes9.dex */
public class yhq {
    public static yhq c = new yhq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserInfoManager f40194a = ((b) EntryPointAccessors.fromApplication(AppUtil.getApp(), b.class)).getUserInfoManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccountManager f40195b = ((a) EntryPointAccessors.fromApplication(AppUtil.getApp(), a.class)).getAccountManager();

    public interface a {
        AccountManager getAccountManager();
    }

    public interface b {
        UserInfoManager getUserInfoManager();
    }

    public String a() {
        return this.f40194a.getUserId();
    }

    public boolean b() {
        return this.f40195b.isStaging();
    }
}
