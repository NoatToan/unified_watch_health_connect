package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.bluetooth.profile.channel.module.HeadPhoneModule;
import com.xiaomi.hm.health.device.headset.vo.SmartPlayVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1", f = "HeadSettingViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HeadSettingViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1(Continuation continuation, HeadSettingViewModel headSettingViewModel, boolean z) {
        super(2, continuation);
        this.c = headSettingViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1 headSettingViewModel$setSmartPlay$$inlined$safeLaunch$1 = new HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1(continuation, this.c, this.d);
        headSettingViewModel$setSmartPlay$$inlined$safeLaunch$1.b = obj;
        return headSettingViewModel$setSmartPlay$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0058, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zBooleanValue;
        SmartPlayVo smartPlayVo;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HeadPhoneModule headPhoneModuleC = this.c.c();
            if (headPhoneModuleC == null) {
                zBooleanValue = false;
            } else {
                boolean z = this.d;
                this.a = 1;
                obj = headPhoneModuleC.setSmartPlay(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                smartPlayVo = (SmartPlayVo) this.c._smartPlay.getValue();
                if (smartPlayVo != null) {
                    smartPlayVo.setSmartPlay(Boxing.boxBoolean(this.d));
                }
            } else {
                MutableLiveData mutableLiveData = this.c._smartPlay;
                SmartPlayVo smartPlayVo2 = (SmartPlayVo) mutableLiveData.getValue();
                mutableLiveData.postValue(smartPlayVo2 != null ? SmartPlayVo.copy$default(smartPlayVo2, null, false, 3, null) : null);
            }
            this.c.a(zBooleanValue);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (zBooleanValue) {
            smartPlayVo = (SmartPlayVo) this.c._smartPlay.getValue();
            if (smartPlayVo != null) {
                smartPlayVo.setSmartPlay(Boxing.boxBoolean(this.d));
            }
        } else {
            MutableLiveData mutableLiveData2 = this.c._smartPlay;
            SmartPlayVo smartPlayVo3 = (SmartPlayVo) mutableLiveData2.getValue();
            mutableLiveData2.postValue(smartPlayVo3 != null ? SmartPlayVo.copy$default(smartPlayVo3, null, false, 3, null) : null);
        }
        this.c.a(zBooleanValue);
        return Unit.INSTANCE;
    }
}
