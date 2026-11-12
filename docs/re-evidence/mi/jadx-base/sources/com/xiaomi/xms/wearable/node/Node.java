package com.xiaomi.xms.wearable.node;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class Node implements Parcelable {
    public static final Parcelable.Creator<Node> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14482b;

    public class a implements Parcelable.Creator<Node> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Node createFromParcel(Parcel parcel) {
            return new Node(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Node[] newArray(int i) {
            return new Node[i];
        }
    }

    public Node(String str, String str2) {
        this.f14481a = str;
        this.f14482b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14481a);
        parcel.writeString(this.f14482b);
    }

    public Node(Parcel parcel) {
        this.f14481a = parcel.readString();
        this.f14482b = parcel.readString();
    }
}
