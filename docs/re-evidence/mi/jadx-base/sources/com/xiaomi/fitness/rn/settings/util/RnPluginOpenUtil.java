package com.xiaomi.fitness.rn.settings.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.settings.cloud.RnApiRequest;
import defpackage.aje;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil;", "", "<init>", "()V", "hasRegisteredBroadcast", "", "onPluginOpen", "", "deviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "mReceiver", "com/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil$mReceiver$1", "Lcom/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil$mReceiver$1;", "listenRnPrivacyConfirmBroadcast", "notifyCloudAfterAgreePluginPrivacy", "did", "", "notifyCloudAccessPlugin", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnPluginOpenUtil {

    @NotNull
    private static final String ACTION_RN_PRIVACY_CONFIRM = "com.xiaomi.wear.native.privacy.confirm.action";

    @NotNull
    private static final String TAG = "RnPluginOpenUtil";
    private boolean hasRegisteredBroadcast;

    @NotNull
    private final RnPluginOpenUtil$mReceiver$1 mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.rn.settings.util.RnPluginOpenUtil$mReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            Logger.i("RnPluginOpenUtil", "listenRnPrivacyConfirmBroadcast: onReceive(" + intent + ")");
            if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.xiaomi.wear.native.privacy.confirm.action") || (stringExtra = intent.getStringExtra("did")) == null) {
                return;
            }
            this.this$0.notifyCloudAfterAgreePluginPrivacy(stringExtra);
        }
    };

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RnPluginOpenUtil instance = new RnPluginOpenUtil();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil$Companion;", "", "<init>", "()V", "TAG", "", "ACTION_RN_PRIVACY_CONFIRM", "instance", "Lcom/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil;", "getInstance", "()Lcom/xiaomi/fitness/rn/settings/util/RnPluginOpenUtil;", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RnPluginOpenUtil getInstance() {
            return RnPluginOpenUtil.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.util.RnPluginOpenUtil$notifyCloudAccessPlugin$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.util.RnPluginOpenUtil$notifyCloudAccessPlugin$1", f = "RnPluginOpenUtil.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RNDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RNDeviceModel rNDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = rNDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RnApiRequest companion = RnApiRequest.INSTANCE.getInstance();
                    String did = this.$deviceModel.getDid();
                    String model = DeviceModelExtKt.getModel(this.$deviceModel);
                    this.label = 1;
                    obj = companion.accessPlugin(did, model, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Logger.i(RnPluginOpenUtil.TAG, "notifyCloudAfterAgreePluginPrivacy: success(" + zBooleanValue + ")");
                if (zBooleanValue) {
                    RnSettingPreference.INSTANCE.setDEVICE_NEED_ACCESS_PLUGIN("");
                }
            } catch (Exception e) {
                Logger.w(RnPluginOpenUtil.TAG, "notifyCloudAfterAgreePluginPrivacy", e);
                RnSettingPreference.INSTANCE.setDEVICE_NEED_ACCESS_PLUGIN(this.$deviceModel.getDid());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.fitness.rn.settings.util.RnPluginOpenUtil$mReceiver$1] */
    private RnPluginOpenUtil() {
    }

    private final void listenRnPrivacyConfirmBroadcast() {
        Logger.i(TAG, "listenRnPrivacyConfirmBroadcast, hasRegisteredBroadcast=" + this.hasRegisteredBroadcast);
        if (this.hasRegisteredBroadcast) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_RN_PRIVACY_CONFIRM);
        aje.b(ApplicationExtKt.getApplication()).c(this.mReceiver, intentFilter);
        this.hasRegisteredBroadcast = true;
    }

    private final void notifyCloudAccessPlugin(RNDeviceModel deviceModel) {
        AnyExtKt.io$default(null, new AnonymousClass1(deviceModel, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyCloudAfterAgreePluginPrivacy(String did) {
        RNDeviceModel rNDeviceModel = (RNDeviceModel) RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModel(did);
        if (rNDeviceModel != null) {
            notifyCloudAccessPlugin(rNDeviceModel);
            return;
        }
        Logger.i(TAG, "notifyCloudAfterAgreePluginPrivacy: no device(" + did + ")");
    }

    public final void onPluginOpen(@NotNull RNDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        listenRnPrivacyConfirmBroadcast();
        if (Intrinsics.areEqual(RnSettingPreference.INSTANCE.getDEVICE_NEED_ACCESS_PLUGIN(), deviceModel.getDid())) {
            notifyCloudAccessPlugin(deviceModel);
        }
    }
}
