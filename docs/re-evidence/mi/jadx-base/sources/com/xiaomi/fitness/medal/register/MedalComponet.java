package com.xiaomi.fitness.medal.register;

import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.preference.MedalPreference;
import com.xiaomi.fitness.medal.preference.PopMedalDataPreference;
import com.xiaomi.fitness.medal.schema.MedalPageSheme;
import com.xiaomi.fitness.medal.schema.WebSchemaHadler;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/medal/register/MedalComponet;", "", "<init>", "()V", "registerActivityCreate", "", "addOnUserInfoChangeListenerForNewUserMedalIfNeed", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "medal")
public final class MedalComponet {

    @NotNull
    public static final String TAG = "MedalComponet";

    private final void addOnUserInfoChangeListenerForNewUserMedalIfNeed() {
        if (MedalPreference.INSTANCE.getKEY_NEW_USER_MEDAL_UPLOADED()) {
            return;
        }
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        if (UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(companion), false, 1, null).isCompleted()) {
            return;
        }
        AccountManagerExtKt.getInstance(companion).addUserInfoChangeListener(new OnUserInfoChange() { // from class: com.xiaomi.fitness.medal.register.MedalComponet$addOnUserInfoChangeListenerForNewUserMedalIfNeed$listener$1
            @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
            public void userInfoChange(UserProfile userProfile) {
                Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                if (MedalPreference.INSTANCE.getKEY_NEW_USER_MEDAL_UPLOADED()) {
                    AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeUserInfoChangeListener(this);
                    Logger.d(MedalComponet.TAG, "addOnUserInfoChangeListenerForNewUserMedalIfNeed listener removed.");
                    return;
                }
                Logger.d(MedalComponet.TAG, "userInfoChange sex=" + userProfile.getSex() + " birth=" + userProfile.getBirth() + " height=" + userProfile.getHeight() + " weight=" + userProfile.getWeight());
                if (userProfile.isCompleted()) {
                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(7);
                }
            }
        });
    }

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void registerActivityCreate() {
        xfl.a().d(new MedalPageSheme());
        xfl.a().d(new WebSchemaHadler());
        addOnUserInfoChangeListenerForNewUserMedalIfNeed();
        PopMedalDataPreference.INSTANCE.setPOP_MEDAL_DIALOG_IS_SHOWING(false);
    }
}
