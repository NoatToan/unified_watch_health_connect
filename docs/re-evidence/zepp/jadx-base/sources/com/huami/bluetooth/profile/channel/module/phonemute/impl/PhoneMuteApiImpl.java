package com.huami.bluetooth.profile.channel.module.phonemute.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteListener;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteState;
import com.xiaomi.hm.health.bt.device.HMCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phonemute/impl/PhoneMuteApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "", "byteArray", "", "a", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerPhoneMuteListener", "unregisterPhoneMuteListener", "", "isMute", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "phoneMute", "phoneMutePermissionMiss", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;", "module", "", "b", "Ljava/util/List;", "listeners", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneMuteApiImpl implements PhoneMuteApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PhoneMuteModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<PhoneMuteListener> listeners;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneMuteState.values().length];
            iArr[PhoneMuteState.PHONE_MUTE_STATE_MUTE.ordinal()] = 1;
            iArr[PhoneMuteState.PHONE_MUTE_STATE_RING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(PhoneMuteApiImpl phoneMuteApiImpl) {
            super(1, phoneMuteApiImpl, PhoneMuteApiImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((PhoneMuteApiImpl) this.receiver).a(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public PhoneMuteApiImpl(@NotNull PhoneMuteModule phoneMuteModule) {
        this.module = phoneMuteModule;
        phoneMuteModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.phonemute.impl.PhoneMuteApiImpl.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray)) == 5 || AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray)) == 7;
            }
        }));
        this.listeners = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(byte[] byteArray) {
        int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray));
        for (PhoneMuteListener phoneMuteListener : this.listeners) {
            if (unSignInt == 5) {
                this.module.returnQueryPhoneStateResult(phoneMuteListener.onDeviceStateQuery());
            } else if (unSignInt == 7) {
                Integer numSecond = AuthModuleKt.second(byteArray);
                Boolean bool = null;
                PhoneMuteState phoneMuteStateFromValueToEnum = numSecond == null ? null : PhoneMuteState.INSTANCE.fromValueToEnum(numSecond.intValue());
                int i = phoneMuteStateFromValueToEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[phoneMuteStateFromValueToEnum.ordinal()];
                if (i == 1) {
                    bool = Boolean.TRUE;
                } else if (i == 2) {
                    bool = Boolean.FALSE;
                }
                if (bool != null) {
                    bool.booleanValue();
                    phoneMuteListener.onDeviceStateChange(bool.booleanValue());
                    this.module.returnChangePhoneMuteStateResult();
                }
            }
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void phoneMute(boolean isMute, @NotNull HMCallback<Boolean> callback) {
        callback.sendOnStartMessage();
        callback.sendFinishMessage(this.module.setPhoneMuteStatus(isMute ? PhoneMuteState.PHONE_MUTE_STATE_MUTE : PhoneMuteState.PHONE_MUTE_STATE_RING));
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void phoneMutePermissionMiss(@NotNull HMCallback<Boolean> callback) {
        callback.sendOnStartMessage();
        callback.sendFinishMessage(this.module.setPhoneMuteStatus(PhoneMuteState.PHONE_MUTE_STATE_PERMISSION));
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void registerPhoneMuteListener(@NotNull PhoneMuteListener listener) {
        this.listeners.add(listener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi
    public void unregisterPhoneMuteListener(@NotNull PhoneMuteListener listener) {
        this.listeners.remove(listener);
    }
}
