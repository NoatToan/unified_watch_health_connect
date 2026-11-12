package com.huawei.appgallery.coreservice.internal.support.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bhi;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AutoParcelable implements Parcelable {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class AutoCreator<T extends AutoParcelable> implements Parcelable.Creator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f5220a;

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return (T[]) ((AutoParcelable[]) Array.newInstance((Class<?>) this.f5220a, i));
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return (T) bhi.c(this.f5220a, parcel);
        }

        public AutoCreator(Class<T> cls) {
            this.f5220a = cls;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bhi.e(this, parcel, i);
    }
}
