package com.xiaomi.hm.health.device.setting.viewmodel;

import com.huami.devicex.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1(Continuation continuation, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1 featureViewModel$loadAppItemFeature$$inlined$safeLaunch$1 = new FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1(continuation, this.c);
        featureViewModel$loadAppItemFeature$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$loadAppItemFeature$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (GlobalConfig.get().isBuildMidong()) {
            this.c.m();
        } else {
            this.c.k();
        }
        FeatureTree featureTree = this.c.featureTree;
        SoftFeature softFeature = SoftFeature.MEMBER_CARD;
        if (featureTree.isSupport(softFeature) && GlobalConfig.get().isBuildMidong()) {
            FeatureTree.setAppItem$default(this.c.featureTree, softFeature, R.drawable.layer_member_card, -101, R.string.membership_title, false, FeatureViewModel.d.a, 16, null);
        }
        if (this.c.featureTree.isSupport(SoftFeature.JS_APP_STORE)) {
            SoftFeatureCache softFeatureCacheH = this.c.h();
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            SoftFeature softFeature2 = SoftFeature.JS_APP_SETTING;
            if (Intrinsics.areEqual(SoftFeatureCacheKt.get(softFeatureCacheH, device, softFeature2), Boxing.boxBoolean(true))) {
                FeatureTree.setAppItem$default(this.c.featureTree, softFeature2, R.drawable.icon_app_more_setting, 101, R.string.more, false, null, 48, null);
            }
        }
        this.c.getAppItemFeatureLiveData().postValue(this.c.featureTree.loadApplicationSetting());
        return Unit.INSTANCE;
    }
}
