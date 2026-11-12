package com.xiaomi.fitness.aivs.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.ai.android.helper.PrivacySettingsHelper;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.init.AivsComponent$aivsReceiver$1;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/fitness/aivs/init/AivsComponent$aivsReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsComponent$aivsReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ AivsComponent this$0;

    public AivsComponent$aivsReceiver$1(AivsComponent aivsComponent) {
        this.this$0 = aivsComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReceive$lambda$0(BaseAivsService baseAivs, final AivsComponent this$0, boolean z) {
        Intrinsics.checkNotNullParameter(baseAivs, "$baseAivs");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            baseAivs.getPrivacySettings(new PrivacySettingsHelper.PrivacySettingsCallback() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent$aivsReceiver$1$onReceive$1$1
                @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                public void onError(String error) {
                    this$0.sendBackErrorReceiver(error);
                }

                @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                public void onSuccess(String result) {
                    this$0.sendBackSuccessReceiver(result);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReceive$lambda$1(BaseAivsService baseAivs, boolean z, final AivsComponent this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(baseAivs, "$baseAivs");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z2) {
            baseAivs.setPrivacySettings(z, new PrivacySettingsHelper.PrivacySettingsCallback() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent$aivsReceiver$1$onReceive$3$1
                @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                public void onError(String error) {
                    this$0.sendBackErrorReceiver(error);
                }

                @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                public void onSuccess(String result) {
                    this$0.sendBackSuccessReceiver(result);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WearableDeviceModel wearableDeviceModel;
        WearableDeviceModel wearableDeviceModel2;
        int i = 101;
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, AivsComponent.ACTION_GET_PRIVACY_SETTING)) {
            if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, AivsComponent.ACTION_SYNC_NLP_ENGINE) || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
                return;
            }
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                i = 100;
            } else if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BaseAivsService.INSTANCE.getAivsService(wearableDeviceModel.getDid(), i).initNlpEdge();
            return;
        }
        String stringExtra = intent.getStringExtra(AivsComponent.KEY_PRIVACY_SETTING);
        String stringExtra2 = intent.getStringExtra("key_did");
        if (stringExtra2 == null || (wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(stringExtra2)) == null) {
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            i = 100;
        } else if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel2)) {
            return;
        }
        final BaseAivsService aivsService = BaseAivsService.INSTANCE.getAivsService(stringExtra2, i);
        if (Intrinsics.areEqual(stringExtra, AivsComponent.EXTRA_PARAM_GET_PRIVACY_SETTING)) {
            Logger.i(AivsComponent.TAG, "EXTRA_PARAM_GET_PRIVACY_SETTING");
            if (aivsService.isEngineIdle()) {
                final AivsComponent aivsComponent = this.this$0;
                aivsService.startAivsService(new Function1() { // from class: c01
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AivsComponent$aivsReceiver$1.onReceive$lambda$0(aivsService, aivsComponent, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            } else {
                final AivsComponent aivsComponent2 = this.this$0;
                aivsService.getPrivacySettings(new PrivacySettingsHelper.PrivacySettingsCallback() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent$aivsReceiver$1$onReceive$2
                    @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                    public void onError(String error) {
                        aivsComponent2.sendBackErrorReceiver(error);
                    }

                    @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                    public void onSuccess(String result) {
                        aivsComponent2.sendBackSuccessReceiver(result);
                    }
                });
                return;
            }
        }
        if (Intrinsics.areEqual(stringExtra, AivsComponent.EXTRA_PARAM_SET_PRIVACY_SETTING)) {
            final boolean booleanExtra = intent.getBooleanExtra(AivsComponent.KEY_IS_PRIVACY_CHECKED, false);
            if (aivsService.isEngineIdle()) {
                final AivsComponent aivsComponent3 = this.this$0;
                aivsService.startAivsService(new Function1() { // from class: d01
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AivsComponent$aivsReceiver$1.onReceive$lambda$1(aivsService, booleanExtra, aivsComponent3, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                final AivsComponent aivsComponent4 = this.this$0;
                aivsService.setPrivacySettings(booleanExtra, new PrivacySettingsHelper.PrivacySettingsCallback() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent$aivsReceiver$1$onReceive$4
                    @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                    public void onError(String error) {
                        aivsComponent4.sendBackErrorReceiver(error);
                    }

                    @Override // com.xiaomi.ai.android.helper.PrivacySettingsHelper.PrivacySettingsCallback
                    public void onSuccess(String result) {
                        aivsComponent4.sendBackSuccessReceiver(result);
                    }
                });
            }
        }
    }
}
