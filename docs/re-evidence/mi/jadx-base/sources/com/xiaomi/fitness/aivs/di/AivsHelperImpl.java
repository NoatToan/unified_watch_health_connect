package com.xiaomi.fitness.aivs.di;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.example.aivs.export.AivsEnvEntry;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.PrivacyCallback;
import com.google.gson.Gson;
import com.xiaomi.fitness.aivs.di.AivsHelperImpl;
import com.xiaomi.fitness.aivs.init.AivsComponent;
import com.xiaomi.fitness.aivs.util.AivsPreferenceSupport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.fw4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/aivs/di/AivsHelperImpl;", "Lcom/example/aivs/export/AivsHelper;", "<init>", "()V", "mCallback", "Lcom/example/aivs/export/PrivacyCallback;", "getMCallback", "()Lcom/example/aivs/export/PrivacyCallback;", "setMCallback", "(Lcom/example/aivs/export/PrivacyCallback;)V", "aivsReceiver", "Landroid/content/BroadcastReceiver;", "getAivsReceiver", "()Landroid/content/BroadcastReceiver;", "getPrivacySettings", "", "did", "", "callback", "setPrivacySettings", "checked", "", "getAivsEnv", "Lcom/example/aivs/export/AivsEnvEntry;", "setAivsEnv", "env", "syncNlpEngine", "getDeviceId", "getAuthorization", "initEngine", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsHelperImpl implements AivsHelper {

    @NotNull
    private final BroadcastReceiver aivsReceiver;

    @Nullable
    private PrivacyCallback mCallback;

    public AivsHelperImpl() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.aivs.di.AivsHelperImpl$aivsReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, AivsComponent.ACTION_ON_PRIVACY_CALLBACK)) {
                    String stringExtra = intent.getStringExtra(AivsComponent.KEY_CALLBACK_TYPE);
                    String stringExtra2 = intent.getStringExtra(AivsComponent.KEY_CALLBACK_RESULT);
                    if (Intrinsics.areEqual(stringExtra, AivsComponent.EXTRA_CALLBACK_TYPE_SUCCESS)) {
                        Logger.i("AivsHelper", "EXTRA_CALLBACK_TYPE_SUCCESS result is " + stringExtra2);
                        PrivacyCallback mCallback = this.this$0.getMCallback();
                        if (mCallback != null) {
                            mCallback.onSuccess(stringExtra2);
                        }
                    } else if (Intrinsics.areEqual(stringExtra, AivsComponent.EXTRA_CALLBACK_TYPE_ERROR)) {
                        Logger.i("AivsHelper", "EXTRA_CALLBACK_TYPE_ERROR result is " + stringExtra2);
                        PrivacyCallback mCallback2 = this.this$0.getMCallback();
                        if (mCallback2 != null) {
                            mCallback2.onError(stringExtra2);
                        }
                    }
                    this.this$0.setMCallback(null);
                }
            }
        };
        this.aivsReceiver = broadcastReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, new IntentFilter(AivsComponent.ACTION_ON_PRIVACY_CALLBACK), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, new IntentFilter(AivsComponent.ACTION_ON_PRIVACY_CALLBACK));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEngine$lambda$0(IBinder iBinder) throws RemoteException {
        fw4.a.asInterface(iBinder).initEngine();
        return Unit.INSTANCE;
    }

    @Override // com.example.aivs.export.AivsHelper
    @NotNull
    public AivsEnvEntry getAivsEnv() {
        String aivs_env_entry = AivsPreferenceSupport.INSTANCE.getAIVS_ENV_ENTRY();
        if (TextUtils.isEmpty(aivs_env_entry)) {
            return AivsEnvEntry.INSTANCE.getENV_PRODUCTION();
        }
        Object objFromJson = new Gson().fromJson(aivs_env_entry, (Class<Object>) AivsEnvEntry.class);
        Intrinsics.checkNotNull(objFromJson);
        return (AivsEnvEntry) objFromJson;
    }

    @NotNull
    public final BroadcastReceiver getAivsReceiver() {
        return this.aivsReceiver;
    }

    @Override // com.example.aivs.export.AivsHelper
    @NotNull
    public String getAuthorization(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return AivsPreferenceSupport.INSTANCE.getAuthorization(did);
    }

    @Override // com.example.aivs.export.AivsHelper
    @NotNull
    public String getDeviceId(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return AivsPreferenceSupport.INSTANCE.getDeviceId(did);
    }

    @Nullable
    public final PrivacyCallback getMCallback() {
        return this.mCallback;
    }

    @Override // com.example.aivs.export.AivsHelper
    public void getPrivacySettings(@NotNull String did, @NotNull PrivacyCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            callback.onError("deviceModel is null");
            return;
        }
        if (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai")) {
            callback.onError("device not support xiaoai");
            return;
        }
        Intent intent = new Intent(AivsComponent.ACTION_GET_PRIVACY_SETTING);
        intent.putExtra("key_did", did);
        intent.putExtra(AivsComponent.KEY_PRIVACY_SETTING, AivsComponent.EXTRA_PARAM_GET_PRIVACY_SETTING);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
        this.mCallback = callback;
    }

    @Override // com.example.aivs.export.AivsHelper
    public void initEngine() {
        ServiceConnector.INSTANCE.getBinder(20, new Function1() { // from class: h01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AivsHelperImpl.initEngine$lambda$0((IBinder) obj);
            }
        });
    }

    @Override // com.example.aivs.export.AivsHelper
    public void setAivsEnv(@NotNull AivsEnvEntry env) {
        Intrinsics.checkNotNullParameter(env, "env");
        AivsPreferenceSupport.INSTANCE.setAIVS_ENV_ENTRY(new Gson().toJson(env));
    }

    public final void setMCallback(@Nullable PrivacyCallback privacyCallback) {
        this.mCallback = privacyCallback;
    }

    @Override // com.example.aivs.export.AivsHelper
    public void setPrivacySettings(@NotNull String did, boolean checked, @NotNull PrivacyCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
            callback.onError("deviceModel is null");
            return;
        }
        Intent intent = new Intent(AivsComponent.ACTION_GET_PRIVACY_SETTING);
        intent.putExtra("key_did", did);
        intent.putExtra(AivsComponent.KEY_PRIVACY_SETTING, AivsComponent.EXTRA_PARAM_SET_PRIVACY_SETTING);
        intent.putExtra(AivsComponent.KEY_IS_PRIVACY_CHECKED, checked);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
        this.mCallback = callback;
    }

    @Override // com.example.aivs.export.AivsHelper
    public void syncNlpEngine() {
        ApplicationExtKt.getApplication().sendBroadcast(new Intent(AivsComponent.ACTION_SYNC_NLP_ENGINE));
    }
}
