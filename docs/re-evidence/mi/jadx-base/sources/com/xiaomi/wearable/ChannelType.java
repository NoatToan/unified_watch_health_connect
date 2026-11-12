package com.xiaomi.wearable;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/ChannelType;", "", "<init>", "()V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_AUTH = 100;
    public static final int TYPE_CAMERA = 111;
    public static final int TYPE_CAPTURE = 107;
    public static final int TYPE_FITNESS = 102;
    public static final int TYPE_GNSS = 110;
    public static final int TYPE_INFO = 109;
    public static final int TYPE_LYRA = 112;
    public static final int TYPE_MASS = 104;
    public static final int TYPE_NET_PROXY = 108;
    public static final int TYPE_OTA = 105;
    public static final int TYPE_PROTO = 101;
    public static final int TYPE_RESREARCH = 113;
    public static final int TYPE_UNKWOWN = -100;
    public static final int TYPE_VERSION = 106;
    public static final int TYPE_VOICE = 103;
    public static final int TYPE_WEARABLE = 199;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/ChannelType$Companion;", "", "<init>", "()V", "TYPE_WEARABLE", "", "TYPE_AUTH", "TYPE_PROTO", "TYPE_FITNESS", "TYPE_VOICE", "TYPE_MASS", "TYPE_OTA", "TYPE_VERSION", "TYPE_CAPTURE", "TYPE_NET_PROXY", "TYPE_INFO", "TYPE_GNSS", "TYPE_CAMERA", "TYPE_LYRA", "TYPE_RESREARCH", "TYPE_UNKWOWN", "isLyraChannel", "", "type", "isWearableChannel", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isLyraChannel(int type) {
            return type == 112;
        }

        @JvmStatic
        public final boolean isWearableChannel(int type) {
            return type != 112;
        }
    }

    private ChannelType() {
    }

    @JvmStatic
    public static final boolean isLyraChannel(int i) {
        return INSTANCE.isLyraChannel(i);
    }

    @JvmStatic
    public static final boolean isWearableChannel(int i) {
        return INSTANCE.isWearableChannel(i);
    }
}
