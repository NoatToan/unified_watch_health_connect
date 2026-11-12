package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon;

import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BleAdvertisement {
    private byte[] mBytes;
    private List<BleAdvertiseItem> mItems = new ArrayList();

    public BleAdvertisement(byte[] bArr) {
        if (ByteUtils.isEmpty(bArr)) {
            return;
        }
        this.mBytes = bArr;
        try {
            List<BleAdvertiseItem> advertisement = parseAdvertisement(bArr);
            if (ListUtils.isEmpty(advertisement)) {
                return;
            }
            this.mItems.addAll(advertisement);
        } catch (Throwable unused) {
        }
    }

    private BleAdvertiseItem parse(byte[] bArr, int i) {
        int i2;
        if (bArr.length - i >= 2 && (i2 = bArr[i]) > 0) {
            byte b2 = bArr[i + 1];
            int i3 = i + 2;
            if (i3 < bArr.length) {
                BleAdvertiseItem bleAdvertiseItem = new BleAdvertiseItem();
                int length = (i3 + i2) - 2;
                if (length >= bArr.length) {
                    length = bArr.length - 1;
                }
                bleAdvertiseItem.type = b2 & 255;
                bleAdvertiseItem.len = i2;
                bleAdvertiseItem.bytes = ByteUtils.getBytes(bArr, i3, length);
                return bleAdvertiseItem;
            }
        }
        return null;
    }

    private List<BleAdvertiseItem> parseAdvertisement(byte[] bArr) {
        BleAdvertiseItem bleAdvertiseItem;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length && (bleAdvertiseItem = parse(bArr, i)) != null) {
            arrayList.add(bleAdvertiseItem);
            i += bleAdvertiseItem.len + 1;
        }
        return arrayList;
    }

    public List<BleAdvertiseItem> getItems() {
        return this.mItems;
    }

    public String parseBeaconName() {
        if (ListUtils.isEmpty(this.mItems)) {
            return "";
        }
        for (BleAdvertiseItem bleAdvertiseItem : this.mItems) {
            if (bleAdvertiseItem.type == 9) {
                return !ByteUtils.isEmpty(bleAdvertiseItem.bytes) ? new String(bleAdvertiseItem.bytes) : "";
            }
        }
        return "";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<BleAdvertiseItem> it = this.mItems.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
