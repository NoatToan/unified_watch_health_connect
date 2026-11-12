package com.huami.bluetooth.profile.channel.module.phone;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "", "", "toString", "", "a", LogUtil.I, "getValue", "()I", "value", "<init>", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/phone/UnPair;", "Lcom/huami/bluetooth/profile/channel/module/phone/Paired;", "Lcom/huami/bluetooth/profile/channel/module/phone/Pairing;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairFail;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairDisConnected;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class PairStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int value;

    private PairStatus(int i) {
        this.value = i;
    }

    public /* synthetic */ PairStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "PairStatus(value=" + this.value + ')';
    }
}
