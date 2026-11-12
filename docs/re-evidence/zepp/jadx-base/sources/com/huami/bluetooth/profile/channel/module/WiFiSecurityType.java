package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.thanosfisherman.wifiutils.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WiFiSecurityType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "None", a.b, "WPA", a.d, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum WiFiSecurityType {
    None(1),
    WEP(2),
    WPA(3),
    EAP(4);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WiFiSecurityType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/WiFiSecurityType;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final WiFiSecurityType fromValue(int value) {
            for (WiFiSecurityType wiFiSecurityType : WiFiSecurityType.values()) {
                if (wiFiSecurityType.getValue() == value) {
                    if (wiFiSecurityType == null) {
                        return WiFiSecurityType.None;
                    }
                    return wiFiSecurityType;
                }
            }
            wiFiSecurityType = null;
            if (wiFiSecurityType == null) {
                return WiFiSecurityType.None;
            }
            return wiFiSecurityType;
        }
    }

    WiFiSecurityType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
