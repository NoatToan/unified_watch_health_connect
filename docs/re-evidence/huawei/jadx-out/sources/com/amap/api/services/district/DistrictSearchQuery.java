package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.fu;

/* JADX INFO: loaded from: classes4.dex */
public class DistrictSearchQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistrictSearchQuery> CREATOR = new Parcelable.Creator<DistrictSearchQuery>() { // from class: com.amap.api.services.district.DistrictSearchQuery.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictSearchQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictSearchQuery[] newArray(int i) {
            return a(i);
        }

        private static DistrictSearchQuery a(Parcel parcel) {
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            districtSearchQuery.setShowChild(parcel.readByte() == 1);
            districtSearchQuery.setShowBoundary(parcel.readByte() == 1);
            districtSearchQuery.setShowBusinessArea(parcel.readByte() == 1);
            districtSearchQuery.setSubDistrict(parcel.readInt());
            return districtSearchQuery;
        }

        private static DistrictSearchQuery[] a(int i) {
            return new DistrictSearchQuery[i];
        }
    };
    public static final String KEYWORDS_BUSINESS = "biz_area";
    public static final String KEYWORDS_CITY = "city";
    public static final String KEYWORDS_COUNTRY = "country";
    public static final String KEYWORDS_DISTRICT = "district";
    public static final String KEYWORDS_PROVINCE = "province";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3563c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setShowBoundary(boolean z) {
        this.g = z;
    }

    public boolean isShowBoundary() {
        return this.g;
    }

    public DistrictSearchQuery() {
        this.f3561a = 1;
        this.f3562b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
    }

    public DistrictSearchQuery(String str, String str2, int i) {
        this.f3562b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
        this.f3563c = str;
        this.d = str2;
        this.f3561a = i;
    }

    public DistrictSearchQuery(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.e = z;
        this.f3562b = i2;
    }

    public int getPageNum() {
        int i = this.f3561a;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public void setPageNum(int i) {
        this.f3561a = i;
    }

    public int getPageSize() {
        return this.f3562b;
    }

    public void setPageSize(int i) {
        this.f3562b = i;
    }

    public String getKeywords() {
        return this.f3563c;
    }

    public void setKeywords(String str) {
        this.f3563c = str;
    }

    public String getKeywordsLevel() {
        return this.d;
    }

    public void setKeywordsLevel(String str) {
        this.d = str;
    }

    public boolean isShowChild() {
        return this.e;
    }

    public void setShowChild(boolean z) {
        this.e = z;
    }

    public int getSubDistrict() {
        return this.h;
    }

    public void setSubDistrict(int i) {
        this.h = i;
    }

    public boolean isShowBusinessArea() {
        return this.f;
    }

    public void setShowBusinessArea(boolean z) {
        this.f = z;
    }

    public boolean checkLevels() {
        String str = this.d;
        if (str == null) {
            return false;
        }
        return str.trim().equals("country") || this.d.trim().equals(KEYWORDS_PROVINCE) || this.d.trim().equals(KEYWORDS_CITY) || this.d.trim().equals(KEYWORDS_DISTRICT) || this.d.trim().equals(KEYWORDS_BUSINESS);
    }

    public boolean checkKeyWords() {
        String str = this.f3563c;
        return (str == null || str.trim().equalsIgnoreCase("")) ? false : true;
    }

    public int hashCode() {
        int i = this.g ? 1231 : 1237;
        String str = this.f3563c;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.f3561a;
        return ((((((((((((i + 31) * 31) + iHashCode) * 31) + iHashCode2) * 31) + i2) * 31) + this.f3562b) * 31) + (this.e ? 1231 : 1237)) * 31) + this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictSearchQuery districtSearchQuery = (DistrictSearchQuery) obj;
        if (this.g != districtSearchQuery.g) {
            return false;
        }
        String str = this.f3563c;
        if (str == null) {
            if (districtSearchQuery.f3563c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f3563c)) {
            return false;
        }
        return this.f3561a == districtSearchQuery.f3561a && this.f3562b == districtSearchQuery.f3562b && this.e == districtSearchQuery.e && this.h == districtSearchQuery.h;
    }

    public boolean weakEquals(DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        String str = this.f3563c;
        if (str == null) {
            if (districtSearchQuery.f3563c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f3563c)) {
            return false;
        }
        return this.f3562b == districtSearchQuery.f3562b && this.e == districtSearchQuery.e && this.g == districtSearchQuery.g && this.h == districtSearchQuery.h;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DistrictSearchQuery m769clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            fu.a(e, "DistrictSearchQuery", "clone");
        }
        DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.f3563c);
        districtSearchQuery.setKeywordsLevel(this.d);
        districtSearchQuery.setPageNum(this.f3561a);
        districtSearchQuery.setPageSize(this.f3562b);
        districtSearchQuery.setShowChild(this.e);
        districtSearchQuery.setSubDistrict(this.h);
        districtSearchQuery.setShowBoundary(this.g);
        districtSearchQuery.setShowBusinessArea(this.f);
        return districtSearchQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3563c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f3561a);
        parcel.writeInt(this.f3562b);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
    }
}
