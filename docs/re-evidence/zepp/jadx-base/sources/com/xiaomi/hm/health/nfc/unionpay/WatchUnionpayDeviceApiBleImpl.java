package com.xiaomi.hm.health.nfc.unionpay;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.ErrorCodeKt;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.tekartik.sqflite.Constant;
import com.unionpay.api.WatchUnionpayDeviceApi;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.entity.WatchBankCardInfo;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.nfc.BleHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/nfc/unionpay/WatchUnionpayDeviceApiBleImpl;", "Lcom/unionpay/api/WatchUnionpayDeviceApi;", "", "channelId", "Lcom/huami/nfc/base/PayResponse;", "closeLogicChannel", "", "aid", "Lcom/unionpay/entity/SimpleChannel;", "openLogicChannel", Constant.h, "transmit", "", "Lcom/unionpay/entity/WatchBankCardInfo;", "cardList", "", "syncCardListToDevice", "", "syncDeleteResultToDevice", "syncIssueResultToDevice", "info", "syncCardInfoToDevice", "", "queryPwd", "verifyPwd", "Lcom/huami/nfc/base/INfcChannel;", "a", "Lcom/huami/nfc/base/INfcChannel;", "nfcChannel", "Lcom/huami/nfc/ble/NfcBleApi;", "b", "Lcom/huami/nfc/ble/NfcBleApi;", "nfcBleApi", "Lcom/huami/nfc/ble/IDeviceApi;", "c", "Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "<init>", "(Lcom/huami/nfc/base/INfcChannel;Lcom/huami/nfc/ble/NfcBleApi;Lcom/huami/nfc/ble/IDeviceApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchUnionpayDeviceApiBleImpl implements WatchUnionpayDeviceApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel nfcChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final NfcBleApi nfcBleApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi deviceApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends Boolean>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            return hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).queryPwd()), 1, null) : new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "syncCardInfoToDevice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ List<WatchBankCardInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<WatchBankCardInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "syncCardListToDevice:" + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "syncDeleteResultToDevice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "syncIssueResultToDevice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<PayResponse<? extends Boolean>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> getA() {
            HMBaseDevice hMBaseDeviceProvideMajorDevice = BleHelperKt.provideMajorDevice();
            return hMBaseDeviceProvideMajorDevice instanceof HMMiLiProDevice ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(((HMMiLiProDevice) hMBaseDeviceProvideMajorDevice).verifyPwd()), 1, null) : new PayResponse<>(ErrorCodeKt.CODE_DEVICE_MISMATCH, "设备不匹配，不是HMMiLiProDevice", null);
        }
    }

    public WatchUnionpayDeviceApiBleImpl(@NotNull INfcChannel iNfcChannel, @NotNull NfcBleApi nfcBleApi, @NotNull IDeviceApi iDeviceApi) {
        this.nfcChannel = iNfcChannel;
        this.nfcBleApi = nfcBleApi;
        this.deviceApi = iDeviceApi;
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Integer> closeLogicChannel(int channelId) throws Exception {
        this.nfcChannel.closeNfcChannel();
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, 0, 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<SimpleChannel> openLogicChannel(@NotNull byte[] aid) throws Exception {
        this.nfcChannel.openNfcChannel();
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, new SimpleChannel(1, INfcChannelExtensionsKt.select(this.nfcChannel, Hex.bytesToHexString(aid))), 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Boolean> queryPwd() {
        return BleHelperKt.runPayResponse("查询设备上是否设置了密码", a.a);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncCardInfoToDevice(@NotNull String aid, @NotNull String info) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(aid), 1, null);
        this.deviceApi.updateAppletInfo(info, aid);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncCardListToDevice(@NotNull List<WatchBankCardInfo> cardList) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new c(cardList), 1, null);
        NfcBleApi nfcBleApi = this.nfcBleApi;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(cardList, 10));
        Iterator<T> it2 = cardList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WatchBankCardInfo) it2.next()).id);
        }
        nfcBleApi.updateNfcCardListSync(arrayList, AppletType.WATCHUNIONPAY);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncDeleteResultToDevice(@NotNull String aid) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new d(aid), 1, null);
        this.deviceApi.deleteApplet(aid, AppletType.WATCHUNIONPAY);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncIssueResultToDevice(@NotNull String aid) {
        LogcatKt.info$default(Logcat.INSTANCE, null, new e(aid), 1, null);
        this.deviceApi.issueApplet(aid, AppletType.WATCHUNIONPAY);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<byte[]> transmit(@NotNull byte[] cmd) {
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, this.nfcChannel.transmit(cmd), 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Boolean> verifyPwd() {
        return BleHelperKt.runPayResponse("设备上的密码验证是否通过", f.a);
    }
}
