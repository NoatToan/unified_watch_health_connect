package com.miui.circulate.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.circulate.api.bean.ExtraBundle;
import defpackage.gx3;
import defpackage.hyc;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CirculateServiceInfo implements Parcelable {
    public static final Parcelable.Creator<CirculateServiceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10305b;
    public int c;
    public int d;
    public Map<String, String> e;
    public ExtraBundle f;
    public hyc g;

    public class a implements Parcelable.Creator<CirculateServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CirculateServiceInfo createFromParcel(Parcel parcel) {
            return new CirculateServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CirculateServiceInfo[] newArray(int i) {
            return new CirculateServiceInfo[i];
        }
    }

    public CirculateServiceInfo(Parcel parcel) {
        this.d = 0;
        this.e = new ConcurrentHashMap();
        this.f = new ExtraBundle.b().c("available", true).a();
        this.f10304a = parcel.readString();
        this.f10305b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = (ExtraBundle) parcel.readParcelable(ExtraBundle.class.getClassLoader());
    }

    public static CirculateServiceInfo a(int i) {
        CirculateServiceInfo circulateServiceInfo = new CirculateServiceInfo();
        circulateServiceInfo.c = i;
        return circulateServiceInfo;
    }

    public int c() {
        return this.d;
    }

    public hyc d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return c() == 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CirculateServiceInfo circulateServiceInfo = (CirculateServiceInfo) obj;
        return this.c == circulateServiceInfo.c && Objects.equals(this.f10304a, circulateServiceInfo.f10304a) && Objects.equals(this.f10305b, circulateServiceInfo.f10305b);
    }

    public void f(boolean z) {
        ExtraBundle.b bVar = new ExtraBundle.b();
        bVar.b(this.f.c()).c("available", z);
        this.f = bVar.a();
    }

    public void g(String str) {
        ExtraBundle.b bVar = new ExtraBundle.b();
        bVar.b(this.f.c()).f("headset_id", str);
        this.f = bVar.a();
    }

    public void h(hyc hycVar) {
        this.g = hycVar;
    }

    public int hashCode() {
        return Objects.hash(this.f10304a, this.f10305b, Integer.valueOf(this.c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CirculateServiceInfo{");
        if (gx3.d() || this.c == 65536) {
            sb.append("deviceId=");
            sb.append(this.f10304a);
            sb.append(",");
        }
        sb.append("serviceId='");
        sb.append(this.f10305b);
        sb.append(", protocolType='");
        sb.append(this.c);
        sb.append(", connectState=");
        sb.append(this.d);
        sb.append(", serviceProperties=");
        sb.append(this.f.toString());
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10304a);
        parcel.writeString(this.f10305b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.f, i);
    }

    public CirculateServiceInfo() {
        this.d = 0;
        this.e = new ConcurrentHashMap();
        this.f = new ExtraBundle.b().c("available", true).a();
    }
}
