package com.xiaomi.hm.health.ui.smartplay.btphone;

import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.UnPair;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1", f = "BtPhoneSettingGuideViewModel.kt", i = {}, l = {23, 27, 31, 33}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingGuideViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel) {
        super(2, continuation);
        this.c = btPhoneSettingGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1 btPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1 = new BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1(continuation, this.c);
        btPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PairStatus unPair;
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        unPair = (PairStatus) obj;
                        if (unPair == null) {
                            unPair = new UnPair();
                        }
                        HMLog.info("BtPhoneSettingGuideViewmodel", new BtPhoneSettingGuideViewModel.d(unPair));
                        btPhoneSettingGuideViewModel = this.c;
                        this.a = 4;
                        if (btPhoneSettingGuideViewModel.e(unPair, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CompletableDeferred completableDeferred = this.c.initDeferred;
        this.a = 1;
        if (completableDeferred.await(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        String strB = this.c.b();
        if (strB == null) {
            HMLog.info("BtPhoneSettingGuideViewmodel", BtPhoneSettingGuideViewModel.b.a);
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel2 = this.c;
            UnPair unPair2 = new UnPair();
            this.a = 2;
            if (btPhoneSettingGuideViewModel2.e(unPair2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            HMLog.info("BtPhoneSettingGuideViewmodel", BtPhoneSettingGuideViewModel.c.a);
            SettingApi settingApi = this.c.btPhoneApi;
            if (settingApi == null) {
                unPair = null;
            } else {
                this.a = 3;
                obj = settingApi.queryPairStatus(strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                unPair = (PairStatus) obj;
            }
            if (unPair == null) {
                unPair = new UnPair();
            }
            HMLog.info("BtPhoneSettingGuideViewmodel", new BtPhoneSettingGuideViewModel.d(unPair));
            btPhoneSettingGuideViewModel = this.c;
            this.a = 4;
            if (btPhoneSettingGuideViewModel.e(unPair, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
