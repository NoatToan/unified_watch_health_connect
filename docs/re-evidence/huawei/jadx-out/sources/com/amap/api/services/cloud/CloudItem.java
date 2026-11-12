package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItem> CREATOR = new Parcelable.Creator<CloudItem>() { // from class: com.amap.api.services.cloud.CloudItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItem[] newArray(int i) {
            return a(i);
        }

        private static CloudItem a(Parcel parcel) {
            return new CloudItem(parcel);
        }

        private static CloudItem[] a(int i) {
            return new CloudItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3521c;
    private String d;
    private HashMap<String, String> e;
    private List<CloudImage> f;
    protected final LatLonPoint mPoint;
    protected final String mSnippet;
    protected final String mTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CloudItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f3520b = -1;
        this.f3519a = str;
        this.mPoint = latLonPoint;
        this.mTitle = str2;
        this.mSnippet = str3;
    }

    public String getID() {
        return this.f3519a;
    }

    public int getDistance() {
        return this.f3520b;
    }

    public void setDistance(int i) {
        this.f3520b = i;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public LatLonPoint getLatLonPoint() {
        return this.mPoint;
    }

    public String getCreatetime() {
        return this.f3521c;
    }

    public void setCreatetime(String str) {
        this.f3521c = str;
    }

    public String getUpdatetime() {
        return this.d;
    }

    public void setUpdatetime(String str) {
        this.d = str;
    }

    public HashMap<String, String> getCustomfield() {
        return this.e;
    }

    public void setCustomfield(HashMap<String, String> map) {
        this.e = map;
    }

    public List<CloudImage> getCloudImage() {
        return this.f;
    }

    public void setmCloudImage(List<CloudImage> list) {
        this.f = list;
    }

    protected CloudItem(Parcel parcel) {
        this.f3520b = -1;
        this.f3519a = parcel.readString();
        this.f3520b = parcel.readInt();
        this.mPoint = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.mTitle = parcel.readString();
        this.mSnippet = parcel.readString();
        this.f3521c = parcel.readString();
        this.d = parcel.readString();
        HashMap<String, String> map = new HashMap<>();
        this.e = map;
        parcel.readMap(map, HashMap.class.getClassLoader());
        List arrayList = new ArrayList();
        this.f = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3519a);
        parcel.writeInt(this.f3520b);
        parcel.writeValue(this.mPoint);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSnippet);
        parcel.writeString(this.f3521c);
        parcel.writeString(this.d);
        parcel.writeMap(this.e);
        parcel.writeList(this.f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudItem)) {
            return false;
        }
        CloudItem cloudItem = (CloudItem) obj;
        String str = this.f3519a;
        if (str == null) {
            if (cloudItem.f3519a != null) {
                return false;
            }
        } else if (!str.equals(cloudItem.f3519a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3519a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public String toString() {
        return this.mTitle;
    }
}
