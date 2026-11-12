package com.garmin.android.gfdi.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class Configuration implements Parcelable {
    public static final Parcelable.Creator<Configuration> CREATOR = new Parcelable.Creator<Configuration>() { // from class: com.garmin.android.gfdi.configuration.Configuration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Configuration createFromParcel(Parcel parcel) {
            return new Configuration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Configuration[] newArray(int i14) {
            return new Configuration[i14];
        }
    };
    private static final String TAG = "Configuration";
    private final byte[] mCapabilityFlags;

    public Configuration(byte[] bArr) {
        bArr = bArr == null ? new byte[0] : bArr;
        this.mCapabilityFlags = Arrays.copyOf(bArr, bArr.length);
    }

    private static byte[] getAllCapabilitiesBytes(Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue > i14) {
                i14 = iIntValue;
            }
        }
        int i15 = i14 + 1;
        int i16 = i15 / 8;
        if (i15 % 8 != 0) {
            i16++;
        }
        byte[] bArr = new byte[i16];
        Iterator<Integer> it3 = set.iterator();
        while (it3.hasNext()) {
            int iIntValue2 = it3.next().intValue();
            int i17 = iIntValue2 / 8;
            bArr[i17] = (byte) ((1 << (iIntValue2 % 8)) | bArr[i17]);
        }
        return bArr;
    }

    public static Configuration merge(Configuration configuration, Configuration configuration2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(configuration.getCapabilityFlagsAsSet());
        hashSet.addAll(configuration2.getCapabilityFlagsAsSet());
        return new Configuration(hashSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getCapabilityFlags() {
        byte[] bArr = this.mCapabilityFlags;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public Set<Integer> getCapabilityFlagsAsSet() {
        HashSet hashSet = new HashSet();
        int i14 = 0;
        while (true) {
            byte[] bArr = this.mCapabilityFlags;
            if (i14 >= bArr.length) {
                return hashSet;
            }
            byte b14 = bArr[i14];
            for (int i15 = 0; i15 < 8; i15++) {
                int i16 = (i14 * 8) + i15;
                if (((b14 >> i15) & 1) == 1) {
                    hashSet.add(Integer.valueOf(i16));
                }
            }
            i14++;
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Configuration[");
        int i14 = 0;
        while (true) {
            byte[] bArr = this.mCapabilityFlags;
            if (i14 >= bArr.length) {
                sb3.append("]");
                return sb3.toString();
            }
            byte b14 = bArr[i14];
            for (int i15 = 0; i15 < 8; i15++) {
                int i16 = (i14 * 8) + i15;
                if (((b14 >> i15) & 1) == 1) {
                    sb3.append(i16);
                    sb3.append(",");
                }
            }
            i14++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeByteArray(this.mCapabilityFlags);
    }

    public Configuration(Parcel parcel) {
        this.mCapabilityFlags = parcel.createByteArray();
    }

    public Configuration() {
        this((Set<Integer>) Collections.EMPTY_SET);
    }

    public Configuration(Set<Integer> set) {
        this(getAllCapabilitiesBytes(set));
    }
}
