package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.harmonyos.interwork.DeviceInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DeviceInfo(parcel, (a) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceInfo[i];
    }
}
