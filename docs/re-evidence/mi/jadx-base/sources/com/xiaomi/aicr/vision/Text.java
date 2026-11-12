package com.xiaomi.aicr.vision;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class Text extends VisionObject {
    public String c;

    public Text(Parcel parcel, VisionAttribute visionAttribute) {
        super(parcel, visionAttribute);
        this.f11100a = visionAttribute;
        this.c = parcel.readString();
    }

    public String toString() {
        String str = "info: " + this.c;
        Iterator<float[]> it = this.f11101b.values().iterator();
        while (it.hasNext()) {
            str = str + "box: " + Arrays.toString(it.next());
        }
        return str;
    }

    @Override // com.xiaomi.aicr.vision.VisionObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }
}
