package com.huami.bluetooth.profile.channel.module.sleep;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016B\u0017\b\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001c\u0010\n\u001a\u00020\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "Ljava/io/Serializable;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "type", "", "isSupport", "", "component1$bluetooth_release", "()I", "component1", "flag", "copy", "", "toString", "hashCode", "", "other", "equals", "a", LogUtil.I, "getFlag$bluetooth_release", "<init>", "(I)V", "", "types", "(Ljava/util/List;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DataFlag implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int flag;

    public DataFlag(int i) {
        this.flag = i;
    }

    public static /* synthetic */ DataFlag copy$default(DataFlag dataFlag, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dataFlag.flag;
        }
        return dataFlag.copy(i);
    }

    /* JADX INFO: renamed from: component1$bluetooth_release, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final DataFlag copy(int flag) {
        return new DataFlag(flag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataFlag) && this.flag == ((DataFlag) other).flag;
    }

    public final int getFlag$bluetooth_release() {
        return this.flag;
    }

    public int hashCode() {
        return this.flag;
    }

    public final boolean isSupport(@NotNull DataType type) {
        return (type.getValue() & this.flag) > 0;
    }

    @NotNull
    public String toString() {
        return "DataFlag(flag=" + this.flag + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataFlag(@NotNull List<? extends DataType> list) {
        Iterator<T> it2 = list.iterator();
        int value = 0;
        while (it2.hasNext()) {
            value += ((DataType) it2.next()).getValue();
        }
        this(value);
    }
}
