package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.commons.text.StringSubstitutor;
import p1.k1;
import s7.a;

/* JADX INFO: loaded from: classes14.dex */
public class ExtendableSavedState extends a {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public ExtendableSavedState[] newArray(int i14) {
            return new ExtendableSavedState[i14];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }
    };
    public final k1<String, Bundle> extendableStates;

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i14 = parcel.readInt();
        String[] strArr = new String[i14];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i14];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new k1<>(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            this.extendableStates.put(strArr[i15], bundleArr[i15]);
        }
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // s7.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        super.writeToParcel(parcel, i14);
        int i15 = this.extendableStates.f134761c;
        parcel.writeInt(i15);
        String[] strArr = new String[i15];
        Bundle[] bundleArr = new Bundle[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            strArr[i16] = this.extendableStates.g(i16);
            bundleArr[i16] = this.extendableStates.k(i16);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new k1<>();
    }
}
