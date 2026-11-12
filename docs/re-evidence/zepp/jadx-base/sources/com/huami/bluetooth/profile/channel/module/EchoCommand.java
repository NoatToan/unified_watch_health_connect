package com.huami.bluetooth.profile.channel.module;

import com.huami.bluetooth.profile.Request;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EchoCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "toString", "<init>", "()V", "Echo", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class EchoCommand extends Request.Command {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EchoCommand$Echo;", "Lcom/huami/bluetooth/profile/channel/module/EchoCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Echo extends EchoCommand {

        @NotNull
        public static final Echo INSTANCE = new Echo();

        private Echo() {
        }
    }

    public EchoCommand() {
        super(new byte[0]);
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public String toString() {
        return "EchoCommand{bytes=" + ((Object) GattUtils.bytesToHexString(getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) + '}';
    }
}
