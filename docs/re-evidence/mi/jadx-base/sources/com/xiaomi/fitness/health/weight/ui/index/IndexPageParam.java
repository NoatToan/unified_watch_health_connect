package com.xiaomi.fitness.health.weight.ui.index;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class IndexPageParam implements Parcelable {
    public static final Parcelable.Creator<IndexPageParam> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12333b;
    public float c;
    public String d;
    public List<LevelBarView.LevelItem> e;
    public int f;
    public String g;
    public int h;

    public class a implements Parcelable.Creator<IndexPageParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexPageParam createFromParcel(Parcel parcel) {
            return new IndexPageParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IndexPageParam[] newArray(int i) {
            return new IndexPageParam[i];
        }
    }

    public IndexPageParam() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12332a);
        parcel.writeString(this.f12333b);
        parcel.writeFloat(this.c);
        parcel.writeString(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }

    public IndexPageParam(Parcel parcel) {
        this.f12332a = parcel.readString();
        this.f12333b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readString();
        this.e = parcel.createTypedArrayList(LevelBarView.LevelItem.CREATOR);
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }
}
