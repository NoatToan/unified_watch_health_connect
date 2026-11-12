package com.huami.bluetooth.profile.channel.module.call_reply;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "Ljava/io/Serializable;", "()V", "Authorized", "Companion", "Unauthorized", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Authorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Unauthorized;", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class SmsPermission implements Serializable {
    private static final long serialVersionUID = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Authorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Authorized extends SmsPermission {

        @NotNull
        public static final Authorized INSTANCE = new Authorized();

        private Authorized() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission$Unauthorized;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
