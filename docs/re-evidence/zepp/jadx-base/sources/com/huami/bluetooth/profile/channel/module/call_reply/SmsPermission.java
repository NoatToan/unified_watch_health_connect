package com.huami.bluetooth.profile.channel.module.call_reply;

import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0004\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "Ljava/io/Serializable;", "<init>", "()V", "Companion", "Authorized", StatEvent.EVENT_WEIBO_VIEW_NUM_UNAUTHORIZED, "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Authorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Unauthorized;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SmsPermission implements Serializable {
    private static final long serialVersionUID = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Authorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Authorized extends SmsPermission {

        @NotNull
        public static final Authorized INSTANCE = new Authorized();

        private Authorized() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Unauthorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Unauthorized extends SmsPermission {

        @NotNull
        public static final Unauthorized INSTANCE = new Unauthorized();

        private Unauthorized() {
            super(null);
        }
    }

    private SmsPermission() {
    }

    public /* synthetic */ SmsPermission(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
