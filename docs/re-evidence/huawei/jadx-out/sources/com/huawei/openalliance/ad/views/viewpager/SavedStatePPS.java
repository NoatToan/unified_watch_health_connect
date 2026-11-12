package com.huawei.openalliance.ad.views.viewpager;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class SavedStatePPS extends PPSAbsSavedState {
    public static final Parcelable.Creator<SavedStatePPS> CREATOR = new Parcelable.ClassLoaderCreator<SavedStatePPS>() { // from class: com.huawei.openalliance.ad.views.viewpager.SavedStatePPS.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedStatePPS[] newArray(int i) {
            return new SavedStatePPS[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedStatePPS createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SavedStatePPS(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedStatePPS createFromParcel(Parcel parcel) {
            return new SavedStatePPS(parcel, null);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f21368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Parcelable f21369c;
    ClassLoader d;

    @Override // com.huawei.openalliance.ad.views.viewpager.PPSAbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21368b);
        parcel.writeParcelable(this.f21369c, i);
    }

    public SavedStatePPS(Parcelable parcelable) {
        super(parcelable);
    }

    SavedStatePPS(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.f21368b = parcel.readInt();
        this.f21369c = parcel.readParcelable(classLoader);
        this.d = classLoader;
    }
}
