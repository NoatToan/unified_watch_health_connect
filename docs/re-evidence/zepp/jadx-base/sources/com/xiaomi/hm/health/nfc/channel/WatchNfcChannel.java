package com.xiaomi.hm.health.nfc.channel;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.base.INfcChannel;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/WatchNfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/watch/transport/TransportDataItem;", "data", "", "b", "", "closeNfcChannel", "openNfcChannel", "apdu", "transmit", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "a", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "transportChannel", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()Ljava/util/regex/Pattern;", "pattern", "<init>", "(Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchNfcChannel implements INfcChannel {

    @NotNull
    private static final String c = "com.huami.watch.companion.transport.oma.apdu";

    @NotNull
    private static final String d = "com.huami.watch.companion.transport.oma.rpdu";

    @NotNull
    private static final String e = "com.huami.watch.companion.transport.open.channel";

    @NotNull
    private static final String f = "com.huami.watch.companion.transport.close.channel";

    @NotNull
    private static final String g = "oma_command";

    @NotNull
    private static final String h = "error_message";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TransportChannel transportChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy pattern = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "closeNfcChannel Start";
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
        public final Object invoke() {
            return "手表传输APDU指令过程中发生错误，手表端返回 error_message 为: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "openNfcChannel Start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Pattern> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            return Pattern.compile("6\\w{3}$");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Object> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "transmit --> " + Hex.bytesToHexString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Object> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "transmit <-- " + Hex.bytesToHexString(this.a);
        }
    }

    public WatchNfcChannel(@NotNull TransportChannel transportChannel) {
        this.transportChannel = transportChannel;
    }

    private final Pattern a() {
        return (Pattern) this.pattern.getValue();
    }

    private final byte[] b(TransportDataItem data) {
        String string = data.getData().getString("error_message");
        if (string == null || string.length() == 0) {
            return data.getData().getByteArray(g);
        }
        LogcatKt.error$default(Logcat.INSTANCE, null, new b(string), 1, null);
        Matcher matcher = a().matcher(string);
        return matcher.find() ? Hex.hexStringToBytes(matcher.group(0)) : new byte[]{0, 0};
    }

    @Override // com.huami.nfc.base.INfcChannel
    public void closeNfcChannel() {
        LogcatKt.info$default(Logcat.INSTANCE, null, a.a, 1, null);
        TransportChannel.DefaultImpls.sendAction$default(this.transportChannel, f, null, null, 6, null);
    }

    @Override // com.huami.nfc.base.INfcChannel
    public void openNfcChannel() {
        LogcatKt.info$default(Logcat.INSTANCE, null, c.a, 1, null);
        TransportChannel.DefaultImpls.sendAction$default(this.transportChannel, e, null, null, 6, null);
    }

    @Override // com.huami.nfc.base.INfcChannel
    @NotNull
    public byte[] transmit(@NotNull byte[] apdu) {
        Logcat logcat = Logcat.INSTANCE;
        LogcatKt.info$default(logcat, null, new e(apdu), 1, null);
        TransportChannel transportChannel = this.transportChannel;
        DataBundle dataBundle = new DataBundle();
        dataBundle.putByteArray(g, apdu);
        Unit unit = Unit.INSTANCE;
        TransportDataItem transportDataItemSendAction = transportChannel.sendAction(c, d, dataBundle);
        if (transportDataItemSendAction != null) {
            byte[] bArrB = b(transportDataItemSendAction);
            LogcatKt.info$default(logcat, null, new f(bArrB), 1, null);
            return bArrB;
        }
        throw new IllegalArgumentException(("向手表送APDU指令(" + Hex.bytesToHexString(apdu) + ")未收到返回，60秒超时，需手表端查看原因。").toString());
    }
}
