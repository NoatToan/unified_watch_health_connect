package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10455b;
    public int c;

    public class a implements Parcelable.Creator<PositionSavedState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PositionSavedState createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PositionSavedState[] newArray(int i) {
            return new PositionSavedState[i];
        }
    }

    public int a() {
        return this.c;
    }

    public int c() {
        return this.f10454a;
    }

    public int d() {
        return this.f10455b;
    }

    public void e(int i) {
        this.c = i;
    }

    public void f(int i) {
        this.f10454a = i;
    }

    public void g(int i) {
        this.f10455b = i;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10454a);
        parcel.writeInt(this.f10455b);
        parcel.writeInt(this.c);
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f10454a = parcel.readInt();
        this.f10455b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
