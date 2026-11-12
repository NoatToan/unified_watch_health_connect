package com.xiaomi.fitness.notify;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/notify/Constant;", "", "<init>", "()V", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constant {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FIND_PHONE_END = "com.xiaomi.wearable.home.devices.FIND_PHONE_END";

    @NotNull
    public static final String INCOMING_CALL_PACKAGE_NAME = "phone";
    public static final int INCOMING_CALL_UID = 0;
    public static final int MSG_NOTIFY_ADD = 0;
    public static final int MSG_NOTIFY_ADD_TIMEOUT = 2;
    public static final int MSG_NOTIFY_POSTED = 5;
    public static final int MSG_NOTIFY_REMOVE = 3;
    public static final int MSG_NOTIFY_REMOVED = 6;
    public static final int MSG_NOTIFY_REMOVE_TIMEOUT = 4;

    @NotNull
    public static final String NORMAL = "com.xiaomi.wearable.home.devices.ble.sync.NORMAL";

    @NotNull
    public static final String SILENCE_RINGER = "com.xiaomi.wearable.home.devices.ble.sync.SILENCE_RINGER";
    private static boolean isBinding = false;
    private static boolean isInOutGoingCall = false;
    private static boolean isServiceCreated = false;

    @NotNull
    public static final String sDeviceType = "sDeviceType";
    public static final int sDeviceTypeHuami = 1;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/notify/Constant$Companion;", "", "<init>", "()V", "isBinding", "", "()Z", "setBinding", "(Z)V", "isServiceCreated", "setServiceCreated", "isInOutGoingCall", "setInOutGoingCall", Constant.sDeviceType, "", "sDeviceTypeHuami", "", "INCOMING_CALL_UID", "INCOMING_CALL_PACKAGE_NAME", "MSG_NOTIFY_ADD", "MSG_NOTIFY_ADD_TIMEOUT", "MSG_NOTIFY_REMOVE", "MSG_NOTIFY_REMOVE_TIMEOUT", "MSG_NOTIFY_POSTED", "MSG_NOTIFY_REMOVED", "SILENCE_RINGER", "NORMAL", "FIND_PHONE_END", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isBinding() {
            return Constant.isBinding;
        }

        public final boolean isInOutGoingCall() {
            return Constant.isInOutGoingCall;
        }

        public final boolean isServiceCreated() {
            return Constant.isServiceCreated;
        }

        public final void setBinding(boolean z) {
            Constant.isBinding = z;
        }

        public final void setInOutGoingCall(boolean z) {
            Constant.isInOutGoingCall = z;
        }

        public final void setServiceCreated(boolean z) {
            Constant.isServiceCreated = z;
        }
    }
}
