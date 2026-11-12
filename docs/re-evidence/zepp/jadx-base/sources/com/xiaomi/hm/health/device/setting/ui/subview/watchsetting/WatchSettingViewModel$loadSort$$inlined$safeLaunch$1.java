package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListVersion;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$loadSort$$inlined$safeLaunch$1", f = "WatchSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WatchSettingViewModel$loadSort$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ WatchSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchSettingViewModel$loadSort$$inlined$safeLaunch$1(Continuation continuation, WatchSettingViewModel watchSettingViewModel) {
        super(2, continuation);
        this.c = watchSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WatchSettingViewModel$loadSort$$inlined$safeLaunch$1 watchSettingViewModel$loadSort$$inlined$safeLaunch$1 = new WatchSettingViewModel$loadSort$$inlined$safeLaunch$1(continuation, this.c);
        watchSettingViewModel$loadSort$$inlined$safeLaunch$1.b = obj;
        return watchSettingViewModel$loadSort$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WatchSettingViewModel$loadSort$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiLiProDevice hMMiLiProDeviceB = this.c.b();
        BuiltInModule builtInModule = hMMiLiProDeviceB == null ? null : (BuiltInModule) hMMiLiProDeviceB.getChannelModule(BuiltInModule.class);
        if (builtInModule != null) {
            boolean zSupportModule = builtInModule.supportModule(38);
            if (zSupportModule) {
                HMMiLiProDevice hMMiLiProDeviceB2 = this.c.b();
                DisplayListSettingModule displayListSettingModule = hMMiLiProDeviceB2 != null ? (DisplayListSettingModule) hMMiLiProDeviceB2.getChannelModule(DisplayListSettingModule.class) : null;
                if (displayListSettingModule == null) {
                    this.c._displayListVisible.postValue(new DisplayListSupport(zSupportModule, zSupportModule, zSupportModule));
                } else {
                    DisplayListVersion displayListVersionQueryVersionAndType = displayListSettingModule.queryVersionAndType();
                    this.c._displayListVisible.postValue(displayListVersionQueryVersionAndType.getVersion() > 1 ? new DisplayListSupport(displayListSettingModule.supportAppSort(displayListVersionQueryVersionAndType.getType()), displayListSettingModule.supportSecScreen(displayListVersionQueryVersionAndType.getType()), displayListSettingModule.supportCtlCenter(displayListVersionQueryVersionAndType.getType())) : new DisplayListSupport(true, true, true));
                }
            } else {
                this.c._displayListVisible.postValue(new DisplayListSupport(false, false, false, 7, null));
            }
        }
        return Unit.INSTANCE;
    }
}
