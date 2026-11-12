package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.settingitem.UserSettingRequestHelper;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.ga8;
import defpackage.vbq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ+\u0010\u0010\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00062\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/settingitem/UserSettingRequestHelper;", "Lcom/xiaomi/fitness/settingitem/BaseSettingRequestHelper;", "", "success", "doOnEnd", "(Z)Z", "", "retryUpdateUserSetting", "()V", StatConstants.PARAM_END, "uploadUserSettingsIfNeed", "", "deviceModelDid", "isHuamiDevice", "Lvbq;", "callBack", "doUpdateSettings", "(Ljava/lang/String;ZLvbq;)V", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "itemInfo", "uploadUserSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "Ljava/util/HashMap;", "maps", "uploadUserSettingItems", "(Ljava/util/HashMap;)V", "reset", "destroy", "Lcom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper;", "userSettingHelper", "Lcom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper;", "", "retryCount", "I", "<init>", "settingitem_release"}, k = 1, mv = {2, 0, 0})
public final class UserSettingRequestHelper extends BaseSettingRequestHelper {
    private volatile int retryCount = 1;

    @Nullable
    private DeviceSmallSettingHelper userSettingHelper;

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.UserSettingRequestHelper$retryUpdateUserSetting$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.UserSettingRequestHelper$retryUpdateUserSetting$1", f = "UserSettingRequestHelper.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserSettingRequestHelper.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (UserSettingRequestHelper.this.retryCount > 3) {
                    Logger.i("UserSetting", "retry more than 3 times, stop retry");
                    return Unit.INSTANCE;
                }
                UserSettingRequestHelper.this.retryCount++;
                Logger.i("UserSetting", "request user setting failed, retry in 10 second , retryCount:" + UserSettingRequestHelper.this.retryCount);
                this.label = 1;
                if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceSettingManager.INSTANCE.getInstance().tryUpdateUserSettingInfo();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean doOnEnd(boolean success) {
        if (success) {
            this.retryCount = 0;
            end();
        } else {
            reset();
            retryUpdateUserSetting();
        }
        Logger.i("UserSetting", "doOnEnd: ret = " + success);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doUpdateSettings$lambda$0(UserSettingRequestHelper this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doOnEnd(z);
    }

    private final void end() {
        setLastUpdateTime(System.currentTimeMillis());
        SettingItemPreference.INSTANCE.setLAST_UPDATE_NAME(getLastUpdateTime());
        DeviceSettingManager.INSTANCE.getInstance().getUserLastUpdateTime();
        setUpdating(false);
        uploadUserSettingsIfNeed();
    }

    private final void retryUpdateUserSetting() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    private final void uploadUserSettingsIfNeed() {
        if (NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
            List<SettingItemEntity> listQuerySettingItemsNotUpload = SettingItemDatabase.INSTANCE.getInstance().settingItemDao().querySettingItemsNotUpload();
            if (listQuerySettingItemsNotUpload.isEmpty()) {
                return;
            }
            Iterator<SettingItemEntity> it = listQuerySettingItemsNotUpload.iterator();
            while (it.hasNext()) {
                uploadUserSettingItem(it.next());
            }
        }
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void destroy() {
        super.destroy();
        DeviceSmallSettingHelper deviceSmallSettingHelper = this.userSettingHelper;
        if (deviceSmallSettingHelper != null) {
            deviceSmallSettingHelper.destroy();
        }
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void doUpdateSettings(@Nullable String deviceModelDid, boolean isHuamiDevice, @Nullable vbq callBack) {
        if (this.userSettingHelper == null) {
            this.userSettingHelper = new DeviceSmallSettingHelper(callBack);
        }
        DeviceSmallSettingHelper deviceSmallSettingHelper = this.userSettingHelper;
        Intrinsics.checkNotNull(deviceSmallSettingHelper);
        deviceSmallSettingHelper.updateSettings("xiaomiwear_app", new ga8() { // from class: oiq
            @Override // defpackage.ga8
            public final void a(boolean z) {
                UserSettingRequestHelper.doUpdateSettings$lambda$0(this.f29209a, z);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void reset() {
        super.reset();
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void uploadUserSettingItem(@NotNull SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        if (this.userSettingHelper == null) {
            this.userSettingHelper = new DeviceSmallSettingHelper(null);
        }
        DeviceSmallSettingHelper deviceSmallSettingHelper = this.userSettingHelper;
        if (deviceSmallSettingHelper != null) {
            deviceSmallSettingHelper.uploadSettingItem(itemInfo);
        }
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingRequestHelper
    public void uploadUserSettingItems(@NotNull HashMap<String, String> maps) {
        Intrinsics.checkNotNullParameter(maps, "maps");
        DeviceSmallSettingHelper deviceSmallSettingHelper = this.userSettingHelper;
        if (deviceSmallSettingHelper != null) {
            deviceSmallSettingHelper.uploadSettingItems("xiaomiwear_app", maps);
        }
    }
}
