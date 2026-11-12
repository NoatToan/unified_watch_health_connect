package com.xiaomi.fitness.devicesettings.common.language;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.language.LanguageSettingViewModel$setLanguages$1$isSuc$1", f = "LanguageSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LanguageSettingViewModel$setLanguages$1$isSuc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ HMLanguage $hmLanguage;
    int label;
    final /* synthetic */ LanguageSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSettingViewModel$setLanguages$1$isSuc$1(LanguageSettingViewModel languageSettingViewModel, HMLanguage hMLanguage, Continuation<? super LanguageSettingViewModel$setLanguages$1$isSuc$1> continuation) {
        super(2, continuation);
        this.this$0 = languageSettingViewModel;
        this.$hmLanguage = hMLanguage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguageSettingViewModel$setLanguages$1$isSuc$1(this.this$0, this.$hmLanguage, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int language;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LanguageSetting languageSetting = this.this$0.getLanguageSetting();
        HMLanguage hMLanguage = this.$hmLanguage;
        if (hMLanguage == null || hMLanguage.getLanguage() != -1) {
            LanguageHelper languageHelper = LanguageHelper.INSTANCE;
            HMLanguage hMLanguage2 = this.$hmLanguage;
            Intrinsics.checkNotNull(hMLanguage2);
            this.$hmLanguage.setLang(languageHelper.getHuaMiLanguageStrByTag(hMLanguage2.getLanguage()));
            language = this.$hmLanguage.getLanguage();
        } else {
            language = LanguageHelper.INSTANCE.getHuaMiDefaultLanguage().getLanguage();
        }
        languageSetting.setDeviceLanguage(language);
        WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        boolean language2 = false;
        if (DeviceModelExtKt.isL66(mDeviceModel)) {
            this.this$0.getLanguageSetting().setLanguageFollowMobilePhoneSwitch(this.$hmLanguage.getLanguage() == -1);
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel mDeviceModel2 = this.this$0.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel2);
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel2));
            if (huaMiApiCaller != null) {
                language2 = huaMiApiCaller.writeSettingSync(DeviceSettingsSyncer.INSTANCE.convertToSettingsLanguageV2(this.this$0.getLanguageSetting()));
            }
        } else {
            this.this$0.getLanguageSetting().setLanguageFollowMobilePhoneSwitch(false);
            WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel mDeviceModel3 = this.this$0.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel3);
            HuamiApiCaller huaMiApiCaller2 = deviceManagerExtKt2.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel3));
            if (huaMiApiCaller2 != null) {
                language2 = huaMiApiCaller2.setLanguage(this.$hmLanguage);
            }
        }
        return Boxing.boxBoolean(language2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LanguageSettingViewModel$setLanguages$1$isSuc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
