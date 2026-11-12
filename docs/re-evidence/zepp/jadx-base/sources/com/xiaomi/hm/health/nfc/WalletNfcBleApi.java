package com.xiaomi.hm.health.nfc;

import com.huami.nfc.applet.BalanceException;
import com.huami.nfc.applet.BlackListException;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.applet.OverdraftException;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.ErrorCodeKt;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardCtl;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardInfoEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0 0\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0%2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletNfcBleApi;", "Lcom/huami/nfc/ble/NfcBleApi;", "", "amount", "overdraft", "", "a", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardInfoEntity;", "Lcom/huami/nfc/applet/CardInfo;", "b", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "", "aid", "Lcom/huami/nfc/applet/TransEntity;", "c", "Lcom/huami/nfc/base/PayResponse;", "", "readMasterSeFlag", "password", "setWristLockToFlash", "setWristLockToSe", "writeMasterSeFlagSync", "readDefaultCard", "Lcom/huami/nfc/ble/AppletType;", "type", "activeDefaultCard", "checkPinState", "deactivateDefaultCard", "getBalance", "getCardInfo", "getCplc", "getLingNanTongCityCode", "", "getTransRecord", "isInstalled", "isSupport", "queryCrsVersion", "", "updateNfcCardListSync", "updateWristLockToSe", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WalletNfcBleApi implements NfcBleApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ AppletType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AppletType appletType) {
            super(0);
            this.a = str;
            this.b = appletType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "-- activeDefaultCard:" + this.a + " " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse> {
        public final /* synthetic */ AppletType a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppletType appletType, String str) {
            super(0);
            this.a = appletType;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            HMNFCCardType hMNFCCardType = BleHelperKt.toHMNFCCardType(this.a);
            if (hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice) {
                byte[] bArrHexStringToBytes = Hex.hexStringToBytes(this.b);
                HMNFCCardCtl hMNFCCardCtl = HMNFCCardCtl.ACTIVATE;
                HMNFCCardStatus hMNFCCardStatusUpdateNfcCardConfigSync = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).updateNfcCardConfigSync(new HMNFCCardConfig(hMNFCCardCtl, new HMNFCCardIdent(hMNFCCardType, bArrHexStringToBytes.length, this.b)));
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getCardCtl() != hMNFCCardCtl) {
                    return new PayResponse(ErrorCodeKt.CODE_OPERATION_FAUILRE, "激活默认卡操作失败，状态码不是active", null);
                }
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getStatus() == 0) {
                    return new PayResponse("0000", "激活默认卡成功", null);
                }
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getStatus() == 1) {
                    return new PayResponse(ErrorCodeKt.CODE_OPERATION_FAUILRE, "激活默认卡失败", null);
                }
            }
            return new PayResponse(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ AppletType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, AppletType appletType) {
            super(0);
            this.a = str;
            this.b = appletType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "-- deactivateDefaultCard:" + this.a + " " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PayResponse> {
        public final /* synthetic */ AppletType a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AppletType appletType, String str) {
            super(0);
            this.a = appletType;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            HMNFCCardType hMNFCCardType = BleHelperKt.toHMNFCCardType(this.a);
            if (hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice) {
                byte[] bArrHexStringToBytes = Hex.hexStringToBytes(this.b);
                HMNFCCardCtl hMNFCCardCtl = HMNFCCardCtl.INACTIVATE;
                HMNFCCardStatus hMNFCCardStatusUpdateNfcCardConfigSync = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).updateNfcCardConfigSync(new HMNFCCardConfig(hMNFCCardCtl, new HMNFCCardIdent(hMNFCCardType, bArrHexStringToBytes.length, this.b)));
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getCardCtl() != hMNFCCardCtl) {
                    return new PayResponse(ErrorCodeKt.CODE_OPERATION_FAUILRE, "去激活默认卡操作失败，状态码不是inactive", null);
                }
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getStatus() == 0) {
                    return new PayResponse("0000", "去激活默认卡成功", null);
                }
                if (hMNFCCardStatusUpdateNfcCardConfigSync.getStatus() == 1) {
                    return new PayResponse(ErrorCodeKt.CODE_OPERATION_FAUILRE, "去激活默认卡失败", null);
                }
            }
            return new PayResponse(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---dynamic getBalance:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---dynamic getCardInfo{" + this.a + com.alipay.sdk.m.u.i.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---dynamic getCplc";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<PayResponse<? extends String>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            String cplc = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).getCplc();
            return cplc == null || cplc.length() == 0 ? new PayResponse<>(ErrorCodeKt.CODE_OPERATION_FAUILRE, "获取cplc失败，cplc不能为空", null) : PayResponse.INSTANCE.success("获取cplc成功", cplc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---dynamic getLingNanTongCityCode";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<PayResponse<? extends String>> {
        public static final j a = new j();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getLingNanTongCityCode:" + this.a;
            }
        }

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            String lNTCode = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).getLNTCode();
            HMLog.debug$default(null, new a(lNTCode), 1, null);
            return PayResponse.INSTANCE.success("获取LNT CityCode成功", lNTCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---dynamic getTransRecord:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<PayResponse<? extends Boolean>> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            return PayResponse.INSTANCE.success("获取是否安装了通卡成功", Boolean.valueOf(((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).isAlreadyPersonal(Hex.hexStringToBytes(this.a))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "isSupport{" + this.a + com.alipay.sdk.m.u.i.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<PayResponse<? extends Boolean>> {
        public final /* synthetic */ String a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z) {
                super(0);
                this.a = str;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "isSupport{" + this.a + "}:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            boolean zIsSupportCity = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).isSupportCity(Hex.hexStringToBytes(this.a));
            HMLog.debug$default(null, new a(this.a, zIsSupportCity), 1, null);
            return PayResponse.INSTANCE.success("获取是否支持当前城市成功", Boolean.valueOf(zIsSupportCity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "-- readDefaultCard";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<PayResponse<? extends String>> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            HMNFCCardCtl hMNFCCardCtl = HMNFCCardCtl.READ;
            HMNFCCardStatus hMNFCCardStatusUpdateNfcCardConfigSync = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).updateNfcCardConfigSync(new HMNFCCardConfig(hMNFCCardCtl));
            if (hMNFCCardStatusUpdateNfcCardConfigSync.getCardCtl() == hMNFCCardCtl) {
                return hMNFCCardStatusUpdateNfcCardConfigSync.getCardIdent() != null ? new PayResponse<>("0000", "读取默认卡成功", hMNFCCardStatusUpdateNfcCardConfigSync.getCardIdent().getAid().toUpperCase(Locale.getDefault())) : new PayResponse<>("0000", "读取默认卡成功,但是没有默认卡", null);
            }
            return new PayResponse<>(ErrorCodeKt.CODE_OPERATION_FAUILRE, "读取默认卡失败，状态码不是read", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<PayResponse> {
        public final /* synthetic */ AppletType a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(AppletType appletType, List<String> list) {
            super(0);
            this.a = appletType;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            ArrayList arrayList = new ArrayList();
            HMNFCCardType hMNFCCardType = BleHelperKt.toHMNFCCardType(this.a);
            if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
                return new PayResponse(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
            }
            for (String str : this.b) {
                arrayList.add(new HMNFCCardIdent(hMNFCCardType, Hex.hexStringToBytes(str).length, str));
            }
            return arrayList.isEmpty() ? ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).updateEmptyCardList(hMNFCCardType) : ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).updateNfcCardListSync(arrayList, hMNFCCardType) ? new PayResponse("0000", "同步默认卡列表成功", null) : new PayResponse(ErrorCodeKt.CODE_OPERATION_FAUILRE, "同步默认卡列表失败", null);
        }
    }

    private final void a(int amount, int overdraft) throws OverdraftException, BalanceException {
        if (Math.abs(amount) > 0 && Math.abs(overdraft) > 0) {
            throw new BalanceException(amount, overdraft);
        }
        if (overdraft < 0) {
            throw new OverdraftException(amount, overdraft);
        }
    }

    private final CardInfo b(CardInfoEntity cardInfoEntity) {
        return new CardInfo(cardInfoEntity.getNumber(), cardInfoEntity.getActivationDate(), cardInfoEntity.getExpiredDate(), cardInfoEntity.getEnable(), cardInfoEntity.getBalance());
    }

    private final TransEntity c(CardTransEntity cardTransEntity, String str) {
        return new TransEntity(cardTransEntity.getRecord(), str, cardTransEntity.getTransId(), cardTransEntity.getDate(), cardTransEntity.getAmount(), TransType.INSTANCE.from(cardTransEntity.getType()), cardTransEntity.getPosId(), cardTransEntity.getOverdraftLimit());
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Unit> activeDefaultCard(@NotNull String aid, @NotNull AppletType type) {
        HMLog.info$default(null, new a(aid, type), 1, null);
        return BleHelperKt.runPayResponse("激活默认卡发生未知错误", new b(type, aid));
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Integer> checkPinState() {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, null, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Unit> deactivateDefaultCard(@NotNull String aid, @NotNull AppletType type) {
        HMLog.info$default(null, new c(aid, type), 1, null);
        return BleHelperKt.runPayResponse("去激活默认卡发生未知错误", new d(type, aid));
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String aid) throws OverdraftException, BalanceException {
        HMLog.info$default(null, new e(aid), 1, null);
        HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
        if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
            return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
        BusBalanceResponse balance = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).getBalance(Hex.hexStringToBytes(aid));
        if (!balance.isSuccessful()) {
            return PayResponse.INSTANCE.error(String.valueOf(balance.getCode()), "获取余额失败");
        }
        long overdraft = balance.getOverdraft();
        a((int) (balance.getBalance() + overdraft), (int) overdraft);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Integer.valueOf((int) balance.getBalance()), 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String aid) throws BlackListException {
        HMLog.info$default(null, new f(aid), 1, null);
        HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
        if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
            return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
        BusCardInfoResponse cardInfo = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).getCardInfo(Hex.hexStringToBytes(aid));
        if (cardInfo.isBlackList()) {
            throw new BlackListException();
        }
        if (!cardInfo.isSuccessful()) {
            return PayResponse.INSTANCE.error(String.valueOf(cardInfo.getCode()), "获取卡信息失败");
        }
        if (cardInfo.getCardInfoEntity() == null) {
            return PayResponse.INSTANCE.error(String.valueOf(cardInfo.getCode()), "卡信息不能为null");
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        CardInfoEntity cardInfoEntity = cardInfo.getCardInfoEntity();
        return PayResponse.Companion.success$default(companion, null, cardInfoEntity == null ? null : b(cardInfoEntity), 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<String> getCplc() {
        HMLog.info$default(null, g.a, 1, null);
        return BleHelperKt.runPayResponse("获取cplc发生未知错误", h.a);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<String> getLingNanTongCityCode() {
        HMLog.info$default(null, i.a, 1, null);
        return BleHelperKt.runPayResponse("获取LNT CityCode 发生未知错误", j.a);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransRecord(@NotNull String aid) {
        HMLog.info$default(null, new k(aid), 1, null);
        HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
        if (!(hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice)) {
            return new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
        BusConsumerListResponse consumeList = ((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).getConsumeList(Hex.hexStringToBytes(aid));
        if (!consumeList.isSuccessful()) {
            return PayResponse.INSTANCE.error(String.valueOf(consumeList.getCode()), "获取消费记录失败");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = consumeList.getCardTransEntityList().iterator();
        while (it2.hasNext()) {
            arrayList.add(c((CardTransEntity) it2.next(), aid));
        }
        return PayResponse.INSTANCE.success("获取消费记录成功", arrayList);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> isInstalled(@NotNull String aid) {
        return BleHelperKt.runPayResponse("获取是否安装了通卡，发生未知错误", new l(aid));
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> isSupport(@NotNull String aid) {
        HMLog.info$default(null, new m(aid), 1, null);
        return BleHelperKt.runPayResponse("获取是否支持当前城市，发生未知错误", new n(aid));
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> queryCrsVersion() {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<String> readDefaultCard() {
        HMLog.info$default(null, o.a, 1, null);
        return BleHelperKt.runPayResponse("读取默认卡发生未知错误", p.a);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> readMasterSeFlag() {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> setWristLockToFlash(@NotNull String password) {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> setWristLockToSe() {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Unit> updateNfcCardListSync(@NotNull List<String> aid, @NotNull AppletType type) {
        return BleHelperKt.runPayResponse("同步默认卡列表发生未知错误", new q(type, aid));
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> updateWristLockToSe(@NotNull String password) {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }

    @Override // com.huami.nfc.ble.NfcBleApi
    @NotNull
    public PayResponse<Boolean> writeMasterSeFlagSync() {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
    }
}
