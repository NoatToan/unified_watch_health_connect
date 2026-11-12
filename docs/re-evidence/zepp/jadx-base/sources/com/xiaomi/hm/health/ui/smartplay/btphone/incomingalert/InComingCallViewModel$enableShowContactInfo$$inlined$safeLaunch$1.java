package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1", f = "InComingCallViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InComingCallViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1(Continuation continuation, boolean z, InComingCallViewModel inComingCallViewModel) {
        super(2, continuation);
        this.c = z;
        this.d = inComingCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1 inComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1 = new InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1(continuation, this.c, this.d);
        inComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1.b = obj;
        return inComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IncomingCallDevice incomingCallDevice = IncomingCallDevice.INSTANCE;
        boolean zShowContact = incomingCallDevice.showContact(this.c);
        HMLog.info("InComingCallViewModel", new InComingCallViewModel.d(this.c, zShowContact));
        if (zShowContact) {
            this.d.f().getMiliConfig().setIncallNameDisplayEnabled(this.c);
            this.d.f().saveInfo(2);
            incomingCallDevice.checkUpgrade(this.d.getApplication());
        }
        this.d.phoneAlertSettingData.setShowContact(zShowContact ? this.c : this.d.phoneAlertSettingData.getShowContact());
        this.d.getPhoneAlertLiveData().postValue(this.d.phoneAlertSettingData);
        return Unit.INSTANCE;
    }
}
