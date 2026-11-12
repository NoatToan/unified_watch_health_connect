package com.xiaomi.fitness.userinfo;

import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.userinfo.UserInfoComponent;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInfoComponent;", "", "<init>", "()V", "userInfoDataHandler", "Lcom/xiaomi/fitness/userinfo/UserInfoDataHandler;", "getUserInfoDataHandler", "()Lcom/xiaomi/fitness/userinfo/UserInfoDataHandler;", "userInfoDataHandler$delegate", "Lkotlin/Lazy;", "initUserInfo", "", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "user_info")
public final class UserInfoComponent {

    @NotNull
    public static final String TAG = "UserInfoComponent";

    /* JADX INFO: renamed from: userInfoDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tgq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserInfoComponent.userInfoDataHandler_delegate$lambda$0();
        }
    });

    private final UserInfoDataHandler getUserInfoDataHandler() {
        return (UserInfoDataHandler) this.userInfoDataHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoDataHandler userInfoDataHandler_delegate$lambda$0() {
        return new UserInfoDataHandler();
    }

    @ComponentTask(notEarlierThan = 11, onMainThread = false)
    public final void initUserInfo() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(8, getUserInfoDataHandler());
    }
}
