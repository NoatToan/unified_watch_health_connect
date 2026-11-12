package com.amap.api.col.p0003sl;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.BaseOptions;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import defpackage.tps;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public final class et extends BaseOptions implements Parcelable {

    @JBindingExclude
    public static final Parcelable.Creator<et> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6052b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public int h;
    public double i;
    public List<tps> j;

    public static class a implements Parcelable.Creator<et> {
        public static et a(Parcel parcel) {
            return new et(parcel);
        }

        public static et[] b(int i) {
            return new et[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ et createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ et[] newArray(int i) {
            return b(i);
        }
    }

    public et() {
        this.f6052b = 3.0f;
        this.c = 20.0f;
        this.d = Float.MIN_VALUE;
        this.e = Float.MAX_VALUE;
        this.f = 200.0f;
        this.g = true;
        this.h = -3355444;
        this.i = 3.0d;
        this.j = new ArrayList();
        this.type = "ContourLineOptions";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6052b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeBooleanArray(new boolean[]{this.g});
        parcel.writeInt(this.h);
        parcel.writeDouble(this.i);
        parcel.writeList(this.j);
    }

    @JBindingExclude
    public et(Parcel parcel) {
        this.f6052b = 3.0f;
        this.c = 20.0f;
        this.d = Float.MIN_VALUE;
        this.e = Float.MAX_VALUE;
        this.f = 200.0f;
        this.g = true;
        this.h = -3355444;
        this.i = 3.0d;
        this.j = new ArrayList();
        this.f6052b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.g = zArr[0];
        this.h = parcel.readInt();
        this.i = parcel.readDouble();
        this.j = parcel.readArrayList(tps.class.getClassLoader());
    }
}
