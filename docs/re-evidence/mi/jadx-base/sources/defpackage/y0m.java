package defpackage;

import com.xiaomi.fitness.about.setting.SettingActivity;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.push.export.PushManager;

/* JADX INFO: loaded from: classes7.dex */
public final class y0m {
    public static void a(SettingActivity settingActivity, AccountManager accountManager) {
        settingActivity.mAccountManager = accountManager;
    }

    public static void b(SettingActivity settingActivity, PushManager pushManager) {
        settingActivity.pushManager = pushManager;
    }
}
