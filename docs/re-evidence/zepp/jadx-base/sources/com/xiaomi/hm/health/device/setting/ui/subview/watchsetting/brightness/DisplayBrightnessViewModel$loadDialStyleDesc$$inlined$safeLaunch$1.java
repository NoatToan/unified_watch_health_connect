package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DisplayBrightnessViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1(Continuation continuation, DisplayBrightnessViewModel displayBrightnessViewModel) {
        super(2, continuation);
        this.c = displayBrightnessViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1 displayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1 = new DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1(continuation, this.c);
        displayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1.b = obj;
        return displayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringEnum screenOffDialId;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DisplayAndBrightnessV2 displayAndBrightnessV2 = this.c.getDisplayAndBrightnessV2();
        if (displayAndBrightnessV2 == null ? false : Intrinsics.areEqual(displayAndBrightnessV2.getScreenOffFollowCurrentDialSwitch(), Boxing.boxBoolean(true))) {
            this.c.getDialStyleDescLiveData().postValue(DeviceXFunctionsKt.getString(R.string.dial_style_follow_dial));
        } else {
            DisplayAndBrightnessV2 displayAndBrightnessV3 = this.c.getDisplayAndBrightnessV2();
            String value = (displayAndBrightnessV3 == null || (screenOffDialId = displayAndBrightnessV3.getScreenOffDialId()) == null) ? null : screenOffDialId.getValue();
            if (value != null) {
                MyWatchFaceBean myWatchFaceBean = (MyWatchFaceBean) CollectionsKt.firstOrNull((List) this.c.c().getMyWatchList(String.valueOf(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI).getValue()), value));
                String name = myWatchFaceBean != null ? myWatchFaceBean.getName() : null;
                if (!(name == null || m.isBlank(name))) {
                    this.c.getDialStyleDescLiveData().postValue(name);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
