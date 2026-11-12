package com.huawei.hms.health;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.client.Result;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes34.dex */
public abstract class aabr extends Result implements Parcelable {
    private static final String TAG = "EnhanceResult";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        StringBuilder sbAab = com.huawei.hms.health.aab.aab("writeToParcel begin of ");
        sbAab.append(getClass().getName());
        sbAab.toString();
        aabs.aab(this, parcel, i);
        getClass().getName();
    }

    public static class aab<T extends Parcelable> implements Parcelable.Creator<T> {
        private final Class<T> aab;

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("createFromParcel begin of");
            sbAab.append(this.aab.getName());
            sbAab.toString();
            Parcelable parcelableAab = aabs.aab(this.aab, parcel);
            StringBuilder sbAab2 = com.huawei.hms.health.aab.aab("createFromParcel end of");
            sbAab2.append(this.aab.getName());
            sbAab2.toString();
            return parcelableAab;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return (Parcelable[]) Array.newInstance((Class<?>) this.aab, i);
        }

        public aab(Class<T> cls) {
            this.aab = cls;
        }
    }
}
