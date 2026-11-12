package com.huawei.phoneservice.faq.base.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FaqSdkServiceUrlResponse implements Parcelable, Serializable {
    public static final Parcelable.Creator<FaqSdkServiceUrlResponse> CREATOR = new d();
    private static final long serialVersionUID = 1726106361091289151L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("itemList")
    private List<ServiceUrl> f21540a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class ServiceUrl implements Parcelable, Serializable {
        public static final Parcelable.Creator<ServiceUrl> CREATOR = new e();
        private static final long serialVersionUID = -117340691941684418L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(FaqConstants.SDK_URL_HA)
        private String f21541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName(FaqConstants.SDK_URL_MD)
        private String f21542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sdkGwRouteAddressV2")
        private String f21543c;

        @SerializedName(FaqConstants.SDK_URL_YUN)
        private String d;

        @SerializedName("countryCode")
        private String e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f21541a);
            parcel.writeString(this.f21542b);
            parcel.writeString(this.f21543c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        public String e() {
            return this.d;
        }

        public String d() {
            return this.f21543c;
        }

        public String c() {
            return this.f21542b;
        }

        class e implements Parcelable.Creator<ServiceUrl> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ServiceUrl[] newArray(int i) {
                return new ServiceUrl[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ServiceUrl createFromParcel(Parcel parcel) {
                return new ServiceUrl(parcel);
            }

            e() {
            }
        }

        public String b() {
            return this.f21541a;
        }

        public String a() {
            return this.e;
        }

        protected ServiceUrl(Parcel parcel) {
            this.f21541a = parcel.readString();
            this.f21542b = parcel.readString();
            this.f21543c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f21540a);
    }

    class d implements Parcelable.Creator<FaqSdkServiceUrlResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FaqSdkServiceUrlResponse[] newArray(int i) {
            return new FaqSdkServiceUrlResponse[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FaqSdkServiceUrlResponse createFromParcel(Parcel parcel) {
            return new FaqSdkServiceUrlResponse(parcel);
        }

        d() {
        }
    }

    public List<ServiceUrl> a() {
        return this.f21540a;
    }

    protected FaqSdkServiceUrlResponse(Parcel parcel) {
        this.f21540a = parcel.createTypedArrayList(ServiceUrl.CREATOR);
    }
}
