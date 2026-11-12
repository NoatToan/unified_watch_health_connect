package defpackage;

import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import dagger.hilt.android.EntryPointAccessors;

/* JADX INFO: loaded from: classes8.dex */
public class xhq {
    public static xhq c = new xhq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserInfoManager f39143a = ((b) EntryPointAccessors.fromApplication(AppUtil.getApp(), b.class)).getUserInfoManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccountManager f39144b = ((a) EntryPointAccessors.fromApplication(AppUtil.getApp(), a.class)).getAccountManager();

    public interface a {
        AccountManager getAccountManager();
    }

    public interface b {
        UserInfoManager getUserInfoManager();
    }

    public String a() {
        AccountCoreInfo xiaomiCoreInfo = this.f39143a.getXiaomiCoreInfo();
        if (xiaomiCoreInfo == null) {
            return null;
        }
        return xiaomiCoreInfo.getNickName();
    }
}
