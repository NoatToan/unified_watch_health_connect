package com.xiaomi.fitness.device.manager.export.scan.beacon;

import com.xiaomi.fitness.common.utils.ByteUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconParser;", "", "<init>", "()V", "parseBeacon", "", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;", "bytes", "", "parse", "startIndex", "", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeaconParser {

    @NotNull
    public static final BeaconParser INSTANCE = new BeaconParser();

    private BeaconParser() {
    }

    private final BeaconItem parse(byte[] bytes, int startIndex) {
        int i;
        if (bytes.length - startIndex >= 2 && (i = bytes[startIndex]) > 0) {
            byte b2 = bytes[startIndex + 1];
            int i2 = startIndex + 2;
            if (i2 < bytes.length) {
                BeaconItem beaconItem = new BeaconItem();
                int length = (i2 + i) - 2;
                if (length >= bytes.length) {
                    length = bytes.length - 1;
                }
                beaconItem.setLen(i);
                beaconItem.setType(b2 & 255);
                byte[] bytes2 = ByteUtil.getBytes(bytes, i2, length);
                if (bytes2 == null) {
                    bytes2 = new byte[0];
                }
                beaconItem.setBytes(bytes2);
                return beaconItem;
            }
        }
        return null;
    }

    @NotNull
    public final List<BeaconItem> parseBeacon(@NotNull byte[] bytes) {
        BeaconItem beaconItem;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ArrayList arrayList = new ArrayList();
        int len = 0;
        while (len < bytes.length && (beaconItem = parse(bytes, len)) != null) {
            arrayList.add(beaconItem);
            len += beaconItem.getLen() + 1;
        }
        return arrayList;
    }
}
