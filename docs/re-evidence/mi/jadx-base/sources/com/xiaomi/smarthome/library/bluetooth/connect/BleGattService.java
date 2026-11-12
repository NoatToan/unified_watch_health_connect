package com.xiaomi.smarthome.library.bluetooth.connect;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattService implements Parcelable, Comparable {
    public static final Parcelable.Creator<BleGattService> CREATOR = new Parcelable.Creator<BleGattService>() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleGattService.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleGattService createFromParcel(Parcel parcel) {
            return new BleGattService(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleGattService[] newArray(int i) {
            return new BleGattService[i];
        }
    };
    private List<ParcelUuid> characters;
    private UUID uuid;

    public BleGattService(UUID uuid) {
        this.uuid = uuid;
        this.characters = new ArrayList();
    }

    public void addCharacters(Set<UUID> set) {
        Iterator<UUID> it = set.iterator();
        while (it.hasNext()) {
            getCharacters().add(new ParcelUuid(it.next()));
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return this.uuid.compareTo(((BleGattService) obj).uuid);
    }

    public boolean contains(UUID uuid) {
        Iterator<ParcelUuid> it = getCharacters().iterator();
        while (it.hasNext()) {
            if (it.next().getUuid().equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ParcelUuid> getCharacters() {
        if (this.characters == null) {
            this.characters = new ArrayList();
        }
        return this.characters;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Service: %s\n", this.uuid));
        List<ParcelUuid> characters = getCharacters();
        int size = characters.size();
        for (int i = 0; i < size; i++) {
            sb.append(String.format(">>> Character: %s", characters.get(i)));
            if (i != size - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.uuid);
        parcel.writeTypedList(getCharacters());
    }

    public BleGattService(Parcel parcel) {
        this.uuid = (UUID) parcel.readSerializable();
        parcel.readTypedList(getCharacters(), ParcelUuid.CREATOR);
    }
}
