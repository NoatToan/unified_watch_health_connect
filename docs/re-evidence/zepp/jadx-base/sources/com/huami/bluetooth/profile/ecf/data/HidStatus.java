package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u000b\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getStatus", "()I", "status", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(I)V", "Companion", "HidConnect", "HidDisconnect", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidConnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidDisconnect;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HidStatus implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidConnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HidConnect extends HidStatus {
        public HidConnect() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidDisconnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HidDisconnect extends HidStatus {
        public HidDisconnect() {
            super(0, null);
        }
    }

    private HidStatus(int i) {
        this.status = i;
    }

    public /* synthetic */ HidStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @NotNull
    public final byte[] getBytes() {
        return GattUtils.intToBytes(this.status);
    }

    public final int getStatus() {
        return this.status;
    }
}
