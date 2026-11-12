package com.xiaomi.hm.health.nfc;

import androidx.exifinterface.media.ExifInterface;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.ErrorCodeKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "provideMajorDevice", "Lcom/huami/nfc/ble/AppletType;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;", "toHMNFCCardType", ExifInterface.GPS_DIRECTION_TRUE, "", "message", "Lkotlin/Function0;", "Lcom/huami/nfc/base/PayResponse;", "data", "runPayResponse", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class BleHelperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PayResponse<? extends T> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return this.a;
        }
    }

    @NotNull
    public static final HMBaseDevice provideMajorDevice() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceManager.getMajorDeviceType());
        Objects.requireNonNull(device, "device is null");
        return device;
    }

    @NotNull
    public static final <T> PayResponse<T> runPayResponse(@NotNull String str, @NotNull Function0<? extends PayResponse<? extends T>> function0) {
        try {
            PayResponse payResponseInvoke = function0.invoke();
            LogcatKt.info$default(Logcat.INSTANCE, null, new a(payResponseInvoke), 1, null);
            return payResponseInvoke;
        } catch (Exception e) {
            return new PayResponse<>(ErrorCodeKt.CODE_RESULT_UNDEFINED, str + "(" + e.getMessage() + "）", null);
        }
    }

    @NotNull
    public static final HMNFCCardType toHMNFCCardType(@NotNull AppletType appletType) {
        return HMNFCCardType.from((byte) appletType.getBleValue());
    }
}
