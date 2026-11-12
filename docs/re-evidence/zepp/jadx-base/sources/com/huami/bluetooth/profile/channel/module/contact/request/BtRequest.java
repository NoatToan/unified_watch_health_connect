package com.huami.bluetooth.profile.channel.module.contact.request;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.binary.BinaryEncoder;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0014B%\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u000e\u0010\u0017B'\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0004\b\u000e\u0010\u001aR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/request/BtRequest;", "", "", "a", "[B", "getByteArray", "()[B", "byteArray", "", "b", LogUtil.I, "getAcceptedResponseTag", "()I", "acceptedResponseTag", "<init>", "([BI)V", "Lcom/huami/bluetooth/profile/channel/module/contact/request/BtCmd;", Constant.h, "filterTag", "contentArray", "(Lcom/huami/bluetooth/profile/channel/module/contact/request/BtCmd;I[B)V", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "content", "(Lcom/huami/bluetooth/profile/channel/module/contact/request/BtCmd;ILcom/huami/bluetooth/profile/channel/module/binary/Layout;)V", "", "contentList", "(Lcom/huami/bluetooth/profile/channel/module/contact/request/BtCmd;ILjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BtRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] byteArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int acceptedResponseTag;

    public BtRequest(@NotNull byte[] bArr, int i) {
        this.byteArray = bArr;
        this.acceptedResponseTag = i;
    }

    public final int getAcceptedResponseTag() {
        return this.acceptedResponseTag;
    }

    @NotNull
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public BtRequest(@NotNull BtCmd btCmd, int i, @NotNull byte[] bArr) {
        this(ArraysKt___ArraysJvmKt.plus(GattUtils.numberToBytes(btCmd.getCmd(), btCmd.getLength()), bArr), i);
    }

    public /* synthetic */ BtRequest(BtCmd btCmd, int i, Layout layout, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(btCmd, i, (i2 & 4) != 0 ? null : layout);
    }

    public BtRequest(@NotNull BtCmd btCmd, int i, @Nullable Layout layout) {
        this(btCmd, i, new BinaryEncoder().encode(layout));
    }

    public BtRequest(@NotNull BtCmd btCmd, int i, @NotNull List<? extends Layout> list) {
        this(btCmd, i, new BinaryEncoder().encode(list));
    }
}
