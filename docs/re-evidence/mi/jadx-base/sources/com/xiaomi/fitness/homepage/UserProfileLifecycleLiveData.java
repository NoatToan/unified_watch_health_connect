package com.xiaomi.fitness.homepage;

import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.lifecycle.LifecycleLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.homepage.UserProfileLifecycleLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/homepage/UserProfileLifecycleLiveData;", "Lcom/xiaomi/fitness/common/lifecycle/LifecycleLiveData;", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "<init>", "()V", "onActive", "", LifecycleConstantKt.ON_RESUME, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "refreshUserProfile", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileLifecycleLiveData extends LifecycleLiveData<UserProfile> {
    private final void refreshUserProfile() {
        ExecutorHelper.runInBackground(new Runnable() { // from class: niq
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileLifecycleLiveData.refreshUserProfile$lambda$0(this.f27968a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshUserProfile$lambda$0(UserProfileLifecycleLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postValue(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null));
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        Logger.d("UserProfileLifecycleLiveData", "LifecycleLiveData:onActive");
        refreshUserProfile();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        Logger.d("UserProfileLifecycleLiveData", "LifecycleLiveData:onResume");
        refreshUserProfile();
    }
}
