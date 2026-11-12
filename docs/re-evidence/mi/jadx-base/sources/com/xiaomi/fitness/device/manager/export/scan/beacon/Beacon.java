package com.xiaomi.fitness.device.manager.export.scan.beacon;

import com.xiaomi.fitness.common.utils.ByteUtil;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/beacon/Beacon;", "", "scanRecord", "", "<init>", "([B)V", "mBytes", "getMBytes", "()[B", "setMBytes", "mItems", "", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;", "getMItems", "()Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "toString", "", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Beacon {

    @Nullable
    private byte[] mBytes;

    @NotNull
    private List<BeaconItem> mItems = new LinkedList();

    public Beacon(@Nullable byte[] bArr) {
        if (ByteUtil.isEmpty(bArr)) {
            return;
        }
        Intrinsics.checkNotNull(bArr);
        byte[] bArrTrimLast = ByteUtil.trimLast(bArr);
        this.mBytes = bArrTrimLast;
        List<BeaconItem> list = this.mItems;
        BeaconParser beaconParser = BeaconParser.INSTANCE;
        Intrinsics.checkNotNull(bArrTrimLast);
        list.addAll(beaconParser.parseBeacon(bArrTrimLast));
    }

    @Nullable
    public final byte[] getMBytes() {
        return this.mBytes;
    }

    @NotNull
    public final List<BeaconItem> getMItems() {
        return this.mItems;
    }

    public final void setMBytes(@Nullable byte[] bArr) {
        this.mBytes = bArr;
    }

    public final void setMItems(@NotNull List<BeaconItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mItems = list;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = this.mBytes;
        if (bArr != null) {
            sb.append("preParse: " + ByteUtil.byteToString(bArr) + "\npostParse:\n");
        }
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.mItems.get(i).toString());
            if (i != this.mItems.size() - 1) {
                sb.append("\n");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
