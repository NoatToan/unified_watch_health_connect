package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import defpackage.jz6;
import defpackage.vbq;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b$\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0004X\u0084D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0006R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010\u0006¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/settingitem/BaseSettingHelper;", "", "Ljz6;", "disposable", "", "releaseDisposable", "(Ljz6;)V", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "itemInfo", "uploadSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "saveDeviceSetItem", "saveDeviceSetItemSync", "destroy", "()V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lvbq;", "updateFinishCallBack", "Lvbq;", "getUpdateFinishCallBack", "()Lvbq;", "setUpdateFinishCallBack", "(Lvbq;)V", "sendDisposable", "Ljz6;", "getSendDisposable", "()Ljz6;", "setSendDisposable", "getDisposable", "getGetDisposable", "setGetDisposable", "callBack", "<init>", "settingitem_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSettingHelper {

    @NotNull
    private final String TAG = BaseSettingRequestHelper.TAG;

    @Nullable
    private jz6 getDisposable;

    @Nullable
    private jz6 sendDisposable;

    @Nullable
    private vbq updateFinishCallBack;

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.BaseSettingHelper$saveDeviceSetItem$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.BaseSettingHelper$saveDeviceSetItem$1", f = "BaseSettingHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SettingItemEntity $itemInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingItemEntity settingItemEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$itemInfo = settingItemEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSettingHelper.this.new AnonymousClass1(this.$itemInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseSettingHelper.this.saveDeviceSetItemSync(this.$itemInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BaseSettingHelper(@Nullable vbq vbqVar) {
        this.updateFinishCallBack = vbqVar;
    }

    private final void releaseDisposable(jz6 disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public final void destroy() {
        releaseDisposable(this.sendDisposable);
        releaseDisposable(this.getDisposable);
    }

    @Nullable
    public final jz6 getGetDisposable() {
        return this.getDisposable;
    }

    @Nullable
    public final jz6 getSendDisposable() {
        return this.sendDisposable;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Nullable
    public final vbq getUpdateFinishCallBack() {
        return this.updateFinishCallBack;
    }

    public final synchronized void saveDeviceSetItem(@Nullable SettingItemEntity itemInfo) {
        AnyExtKt.io$default(null, new AnonymousClass1(itemInfo, null), 1, null);
    }

    public final synchronized void saveDeviceSetItemSync(@Nullable SettingItemEntity itemInfo) {
        if (itemInfo != null) {
            long jInsertOrUpdateSettingItem = SettingItemDatabase.INSTANCE.getInstance().settingItemDao().insertOrUpdateSettingItem(itemInfo);
            Logger.i(this.TAG + "saveDeviceSetItemSync result:" + jInsertOrUpdateSettingItem + ", itemInfo = " + itemInfo, new Object[0]);
        }
    }

    public final void setGetDisposable(@Nullable jz6 jz6Var) {
        this.getDisposable = jz6Var;
    }

    public final void setSendDisposable(@Nullable jz6 jz6Var) {
        this.sendDisposable = jz6Var;
    }

    public final void setUpdateFinishCallBack(@Nullable vbq vbqVar) {
        this.updateFinishCallBack = vbqVar;
    }

    public abstract void uploadSettingItem(@NotNull SettingItemEntity itemInfo);
}
