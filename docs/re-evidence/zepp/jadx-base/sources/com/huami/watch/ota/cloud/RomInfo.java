package com.huami.watch.ota.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.SafeParcelable;
import java.util.ArrayList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class RomInfo implements SafeParcelable {
    public static final Parcelable.Creator<RomInfo> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public class a implements Parcelable.Creator<RomInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RomInfo createFromParcel(Parcel parcel) {
            return new RomInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RomInfo[] newArray(int i) {
            return new RomInfo[i];
        }
    }

    public /* synthetic */ RomInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static RomInfo parseArrayList(ArrayList<String> arrayList) {
        if (arrayList.size() != 8) {
            return null;
        }
        RomInfo romInfo = new RomInfo();
        romInfo.setFirmwareVersion(arrayList.get(0));
        romInfo.setProductVersion(arrayList.get(1));
        romInfo.setSensorVersion(arrayList.get(2));
        romInfo.setMd5Content(arrayList.get(3));
        romInfo.setFileSize(arrayList.get(4));
        romInfo.setFileUrl(arrayList.get(5));
        romInfo.setChangeLog(arrayList.get(6));
        romInfo.setUpgradeType(arrayList.get(7));
        return romInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChangeLog() {
        return this.g;
    }

    public String getFileSize() {
        return this.e;
    }

    public String getFileUrl() {
        return this.f;
    }

    public String getFirmwareVersion() {
        return this.a;
    }

    public String getMd5Content() {
        return this.d;
    }

    public String getProductVersion() {
        return this.b;
    }

    public String getSensorVersion() {
        return this.c;
    }

    public String getUpgradeType() {
        return this.h;
    }

    public void setChangeLog(String str) {
        this.g = str;
    }

    public void setFileSize(String str) {
        this.e = str;
    }

    public void setFileUrl(String str) {
        this.f = str;
    }

    public void setFirmwareVersion(String str) {
        this.a = str;
    }

    public void setMd5Content(String str) {
        this.d = str;
    }

    public void setProductVersion(String str) {
        this.b = str;
    }

    public void setSensorVersion(String str) {
        this.c = str;
    }

    public void setUpgradeType(String str) {
        this.h = str;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.a);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        arrayList.add(this.f);
        arrayList.add(this.g);
        arrayList.add(this.h);
        return arrayList;
    }

    public String toString() {
        return SearchCriteria.LT + "rom version:" + this.a + "rom product version:" + this.b + "rom url: " + this.f + " size : " + this.e + " md5 : " + this.d + SearchCriteria.GT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public RomInfo() {
    }

    private RomInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
