package com.xiaomi.fitness.devicesettings.common.avs;

import androidx.lifecycle.MutableLiveData;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.example.aivs.export.PrivacyCallback;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.base.aivs.AivsPrivacySetting;
import com.xiaomi.fitness.devicesettings.base.aivs.Data;
import com.xiaomi.fitness.devicesettings.base.aivs.PrivacySet;
import com.xiaomi.fitness.devicesettings.common.avs.AivsViewModel;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nJ.\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00110\u0018H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/avs/AivsViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "optimiseOpen", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getOptimiseOpen", "()Landroidx/lifecycle/MutableLiveData;", "setOptimiseOpen", "(Landroidx/lifecycle/MutableLiveData;)V", "init", "", "switchOptimiseOpen", "isChecked", "setPrivacySettings", "did", "", "callback", "Lkotlin/Function1;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private final Gson mGson = new Gson();

    @NotNull
    private MutableLiveData<Boolean> optimiseOpen = new MutableLiveData<>(Boolean.FALSE);

    private final void setPrivacySettings(String did, final boolean isChecked, final Function1<? super Boolean, Unit> callback) {
        AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).setPrivacySettings(did, isChecked, new PrivacyCallback() { // from class: com.xiaomi.fitness.devicesettings.common.avs.AivsViewModel.setPrivacySettings.1
            @Override // com.example.aivs.export.PrivacyCallback
            public void onError(String var1) {
                Logger.e("VOICE_OPTIMISE", "setPrivacySettings error :" + var1);
                callback.invoke2(null);
            }

            @Override // com.example.aivs.export.PrivacyCallback
            public void onSuccess(String var1) {
                Data data;
                PrivacySet privacy_set;
                Boolean speechRecognition;
                Logger.d("VOICE_OPTIMISE", "setPrivacySettings onSuccess :" + var1);
                AivsPrivacySetting aivsPrivacySetting = (AivsPrivacySetting) this.getMGson().fromJson(var1, AivsPrivacySetting.class);
                if (aivsPrivacySetting == null || (data = aivsPrivacySetting.getData()) == null || (privacy_set = data.getPrivacy_set()) == null || (speechRecognition = privacy_set.getSpeechRecognition()) == null) {
                    Function1<Boolean, Unit> function1 = callback;
                    Logger.e("VOICE_OPTIMISE", "setPrivacySettings error:setPrivacySetting is empty");
                    function1.invoke2(null);
                    return;
                }
                boolean z = isChecked;
                Function1<Boolean, Unit> function2 = callback;
                Logger.i("VOICE_OPTIMISE", "setPrivacySettings " + z + " speechRecognition:" + speechRecognition.booleanValue());
                function2.invoke2(Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchOptimiseOpen$lambda$4$lambda$3(AivsViewModel this$0, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool != null) {
            this$0.optimiseOpen.postValue(bool);
        } else {
            ToastUtil.showShortToast(wzi.i2);
            this$0.optimiseOpen.postValue(Boolean.valueOf(!z));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final Gson getMGson() {
        return this.mGson;
    }

    @NotNull
    public final MutableLiveData<Boolean> getOptimiseOpen() {
        return this.optimiseOpen;
    }

    public final void init() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getPrivacySettings(wearableDeviceModel.getDid(), new PrivacyCallback() { // from class: com.xiaomi.fitness.devicesettings.common.avs.AivsViewModel$init$1$1
                @Override // com.example.aivs.export.PrivacyCallback
                public void onError(String var1) {
                    Logger.e("VOICE_OPTIMISE", "getPrivacySettings error :" + var1);
                    this.this$0.getOptimiseOpen().postValue(Boolean.FALSE);
                }

                @Override // com.example.aivs.export.PrivacyCallback
                public void onSuccess(String var1) {
                    Data data;
                    PrivacySet privacy_set;
                    Boolean speechRecognition;
                    Logger.d("VOICE_OPTIMISE", "getPrivacySettings onSuccess :" + var1);
                    AivsPrivacySetting aivsPrivacySetting = (AivsPrivacySetting) this.this$0.getMGson().fromJson(var1, AivsPrivacySetting.class);
                    if (aivsPrivacySetting == null || (data = aivsPrivacySetting.getData()) == null || (privacy_set = data.getPrivacy_set()) == null || (speechRecognition = privacy_set.getSpeechRecognition()) == null) {
                        AivsViewModel aivsViewModel = this.this$0;
                        Logger.e("VOICE_OPTIMISE", "getPrivacySettings error:setPrivacySetting is empty");
                        aivsViewModel.getOptimiseOpen().postValue(Boolean.FALSE);
                        return;
                    }
                    AivsViewModel aivsViewModel2 = this.this$0;
                    Logger.d("VOICE_OPTIMISE", "getPrivacySettings speechRecognition :" + speechRecognition.booleanValue());
                    aivsViewModel2.getOptimiseOpen().postValue(speechRecognition);
                }
            });
        }
    }

    public final void setOptimiseOpen(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.optimiseOpen = mutableLiveData;
    }

    public final void switchOptimiseOpen(final boolean isChecked) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            setPrivacySettings(wearableDeviceModel.getDid(), isChecked, new Function1() { // from class: s21
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AivsViewModel.switchOptimiseOpen$lambda$4$lambda$3(this.f33192a, isChecked, (Boolean) obj);
                }
            });
        }
    }
}
