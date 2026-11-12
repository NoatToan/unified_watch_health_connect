package com.xiaomi.hm.health.nfc.channel;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.door.INfcTag;
import com.huami.nfc.door.NfcTag;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/WatchNfcTag;", "Lcom/huami/nfc/door/INfcTag;", "", "uid", "", "result", "data", "Lcom/huami/nfc/door/NfcTag;", "a", "getTag", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "transportChannel", "<init>", "(Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchNfcTag implements INfcTag {

    @NotNull
    public static final String ACTION_DOOR_CLOSE = "com.huami.watch.companion.transport.door.close";

    @NotNull
    private static final String b = "com.huami.watch.companion.transport.door.query";

    @NotNull
    private static final String c = "com.huami.watch.companion.transport.door.response";
    private static final int d = 0;
    private static final int e = -1;
    private static final int f = -2;
    private static final int g = -3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TransportChannel transportChannel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ DataBundle a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataBundle dataBundle) {
            super(0);
            this.a = dataBundle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "WATCH NFC TAG: " + this.a;
        }
    }

    public WatchNfcTag(@NotNull TransportChannel transportChannel) {
        this.transportChannel = transportChannel;
    }

    private final NfcTag a(String uid, int result, String data) {
        int i;
        if (result == -3) {
            i = 3;
        } else if (result == -2) {
            i = 9;
        } else if (result != -1) {
            i = result != 0 ? 254 : 0;
        } else {
            i = 8;
        }
        return new NfcTag(0, i, uid, uid.length(), "", "", new ArrayList(), data, null, 256, null);
    }

    @Override // com.huami.nfc.door.INfcTag
    @NotNull
    public NfcTag getTag() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(this.transportChannel, b, c, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            throw new IllegalStateException("sendAction not response");
        }
        DataBundle data = transportDataItemSendAction$default.getData();
        LogcatKt.debug$default(Logcat.INSTANCE, null, new a(data), 1, null);
        return a(Hex.bytesToHexString(transportDataItemSendAction$default.getData().getByteArray("door_uid")), data.getInt("status", -3), data.getString("data", ""));
    }
}
