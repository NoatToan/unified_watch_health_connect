package com.xiaomi.hm.health.nfc.unionpay;

import com.google.gson.Gson;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.tekartik.sqflite.Constant;
import com.unionpay.api.WatchUnionpayDeviceApi;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.entity.WatchBankCardInfo;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.nfc.channel.TransportChannel;
import com.xiaomi.hm.health.nfc.channel.TransportChannelImpl;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/nfc/unionpay/WatchUnionpayDeviceApiBtImpl;", "Lcom/unionpay/api/WatchUnionpayDeviceApi;", "Lcom/huami/nfc/base/PayResponse;", "", "queryPwd", "", "aid", "info", "", "syncCardInfoToDevice", "syncIssueResultToDevice", "verifyPwd", "", "Lcom/unionpay/entity/SimpleChannel;", "openLogicChannel", "", "channelId", "closeLogicChannel", Constant.h, "transmit", "", "Lcom/unionpay/entity/WatchBankCardInfo;", "cardList", "syncCardListToDevice", "syncDeleteResultToDevice", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "transporter", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchUnionpayDeviceApiBtImpl implements WatchUnionpayDeviceApi {

    @NotNull
    private static final String b = "com.huami.watch.companion.transport.SyncBusCard";

    @NotNull
    private static final String c = "com.huami.watch.companion.transport.DeleteCard";

    @NotNull
    private static final String d = "com.huami.watch.companion.transport.unionpay";

    @NotNull
    private static final String e = "com.huami.watch.companion.bankcard.EXISTENCELOCK";

    @NotNull
    private static final String f = "com.huami.watch.companion.bankcard.EXISTENCELOCK.RESPONSE";

    @NotNull
    private static final String g = "com.huami.watch.companion.bankcard.CONFIRMLOCK";

    @NotNull
    private static final String h = "com.huami.watch.companion.bankcard.CONFIRMLOCK.RESPONSE";

    @NotNull
    private static final String i = "com.huami.watch.companion.transport.unionpay.open";

    @NotNull
    private static final String j = "com.huami.watch.companion.transport.unionpay.open.response";

    @NotNull
    private static final String k = "com.huami.watch.companion.transport.unionpay.transmit";

    @NotNull
    private static final String l = "com.huami.watch.companion.transport.unionpay.transmit.response";

    @NotNull
    private static final String m = "com.huami.watch.companion.transport.unionpay.close";

    @NotNull
    private static final String n = "unionpay_action";

    @NotNull
    private static final String o = "oma_command";

    @NotNull
    private static final String p = "channel_id";

    @NotNull
    private static final String q = "ChannelId";

    @NotNull
    private static final String r = "channel_resp";

    @NotNull
    private static final String s = "transmit_resp";

    @NotNull
    private static final String t = "error_message";

    @NotNull
    private static final String u = "lockscreen_existence";

    @NotNull
    private static final String v = "lockscreen_confirm";

    @NotNull
    private static final String w = "type";

    @NotNull
    private static final String x = "aid";

    @NotNull
    private static final String y = "buscard_info";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy transporter = LazyKt__LazyJVMKt.lazy(g.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "watch unionpay openLogicChannel errorMsg: " + this.a;
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
            return "watch unionpay openLogicChannel channelResponse: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "watch unionpay checkPwdStatus result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ List<WatchBankCardInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<WatchBankCardInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "syncCardListToDevice: " + this.a.size();
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
            return "syncDeleteResultToDevice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "watch unionpay transmit errorMsg: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/TransportChannelImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<TransportChannelImpl> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransportChannelImpl getA() {
            return new TransportChannelImpl(BraceletApp.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Object> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "watch unionpay unlock result: " + this.a;
        }
    }

    private final TransportChannel a() {
        return (TransportChannel) this.transporter.getValue();
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Integer> closeLogicChannel(int channelId) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(n, m);
        if (channelId >= 0) {
            dataBundle.putInt(q, channelId);
        }
        a().sendAction(d, null, dataBundle);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, 0, 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<SimpleChannel> openLogicChannel(@NotNull byte[] aid) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(n, i);
        dataBundle.putByteArray(o, aid);
        TransportDataItem transportDataItemSendAction = a().sendAction(d, j, dataBundle);
        if (transportDataItemSendAction == null) {
            return PayResponse.INSTANCE.error("1", "openLogicChannel 超时");
        }
        String string = transportDataItemSendAction.getData().getString("error_message");
        if (!(string == null || string.length() == 0)) {
            LogcatKt.info$default(Logcat.INSTANCE, null, new a(string), 1, null);
        }
        int i2 = transportDataItemSendAction.getData().getInt("channel_id", 1);
        String strBytesToHexString = Hex.bytesToHexString(transportDataItemSendAction.getData().getByteArray(r));
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(strBytesToHexString), 1, null);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, new SimpleChannel(i2, strBytesToHexString), 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Boolean> queryPwd() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), e, f, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error("1", "检测是否设置锁屏密码超时(ROM)");
        }
        boolean z = transportDataItemSendAction$default.getData().getBoolean(u);
        LogcatKt.info$default(Logcat.INSTANCE, null, new c(z), 1, null);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(z), 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncCardInfoToDevice(@NotNull String aid, @NotNull String info) {
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncCardListToDevice(@NotNull List<WatchBankCardInfo> cardList) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(y, new Gson().toJson(cardList));
        LogcatKt.info$default(Logcat.INSTANCE, null, new d(cardList), 1, null);
        a().sendAction(b, null, dataBundle);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncDeleteResultToDevice(@NotNull String aid) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("aid", aid);
        dataBundle.putInt("type", AppletType.WATCHUNIONPAY.getBtValue());
        LogcatKt.info$default(Logcat.INSTANCE, null, new e(aid), 1, null);
        a().sendAction(c, null, dataBundle);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    public void syncIssueResultToDevice(@NotNull String aid) {
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<byte[]> transmit(@NotNull byte[] cmd) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(n, k);
        dataBundle.putByteArray(o, cmd);
        TransportDataItem transportDataItemSendAction = a().sendAction(d, l, dataBundle);
        if (transportDataItemSendAction == null) {
            return PayResponse.INSTANCE.error("2", "transmit 超时");
        }
        String string = transportDataItemSendAction.getData().getString("error_message");
        if (!(string == null || string.length() == 0)) {
            LogcatKt.info$default(Logcat.INSTANCE, null, new f(string), 1, null);
        }
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, transportDataItemSendAction.getData().getByteArray(s), 1, null);
    }

    @Override // com.unionpay.api.WatchUnionpayDeviceApi
    @NotNull
    public PayResponse<Boolean> verifyPwd() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), g, h, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error("2", "解锁密码超时");
        }
        boolean z = transportDataItemSendAction$default.getData().getBoolean(v);
        LogcatKt.info$default(Logcat.INSTANCE, null, new h(z), 1, null);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(z), 1, null);
    }
}
