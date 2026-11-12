package com.xiaomi.smarthome.library.bluetooth.connect;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattProfile implements Parcelable {
    public static final Parcelable.Creator<BleGattProfile> CREATOR = new Parcelable.Creator<BleGattProfile>() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleGattProfile createFromParcel(Parcel parcel) {
            return new BleGattProfile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleGattProfile[] newArray(int i) {
            return new BleGattProfile[i];
        }
    };
    private List<BleGattService> mServices = new ArrayList();

    public BleGattProfile(Map<UUID, Map<UUID, BluetoothGattCharacteristic>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<UUID, Map<UUID, BluetoothGattCharacteristic>> entry : map.entrySet()) {
            UUID key = entry.getKey();
            Map<UUID, BluetoothGattCharacteristic> value = entry.getValue();
            BleGattService bleGattService = new BleGattService(key);
            if (!arrayList.contains(bleGattService)) {
                arrayList.add(bleGattService);
                bleGattService.addCharacters(value.keySet());
            }
        }
        addServices(arrayList);
    }

    public void addServices(List<BleGattService> list) {
        Collections.sort(list);
        getServices().addAll(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BleGattService getService(UUID uuid) {
        for (BleGattService bleGattService : getServices()) {
            if (bleGattService.getUUID().equals(uuid)) {
                return bleGattService;
            }
        }
        return null;
    }

    public List<BleGattService> getServices() {
        if (this.mServices == null) {
            this.mServices = new ArrayList();
        }
        return this.mServices;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<BleGattService> it = getServices().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(getServices());
    }

    public BleGattProfile(Parcel parcel) {
        parcel.readTypedList(getServices(), BleGattService.CREATOR);
    }
}
