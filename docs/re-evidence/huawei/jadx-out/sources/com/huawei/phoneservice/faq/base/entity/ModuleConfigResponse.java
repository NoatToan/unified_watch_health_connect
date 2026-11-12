package com.huawei.phoneservice.faq.base.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ModuleConfigResponse implements Serializable, Parcelable {
    public static final Parcelable.Creator<ModuleConfigResponse> CREATOR = new a();
    private static final long serialVersionUID = 5523493960862839428L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("moduleList")
    private List<ModuleListBean> f21544a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class ModuleListBean implements Serializable, Parcelable {
        public static final Parcelable.Creator<ModuleListBean> CREATOR = new e();
        private static final long serialVersionUID = -6366144895402746183L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("moduleCode")
        private String f21545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("moduleName")
        private String f21546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("moduleLinkAddress")
        private String f21547c;

        @SerializedName("openLinkType")
        private String d;

        @SerializedName("isLink")
        private String e;

        @SerializedName("subModuleList")
        private List<SubModuleListBean> f;

        @SerializedName("appName")
        private String g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f21545a);
            parcel.writeString(this.f21546b);
            parcel.writeString(this.f21547c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeTypedList(this.f);
            parcel.writeString(this.g);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String getOpenType() {
            return this.d;
        }

        public String getModuleCode() {
            return this.f21545a;
        }

        public String getLinkAddress() {
            return this.f21547c;
        }

        public boolean equals(Object obj) {
            if (obj != null && getClass() == obj.getClass()) {
                return this.f21545a.equals(((ModuleListBean) obj).getModuleCode());
            }
            return false;
        }

        public List<SubModuleListBean> b() {
            return this.f;
        }

        class e implements Parcelable.Creator<ModuleListBean> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ModuleListBean[] newArray(int i) {
                return new ModuleListBean[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ModuleListBean createFromParcel(Parcel parcel) {
                return new ModuleListBean(parcel);
            }

            e() {
            }
        }

        public String a() {
            return this.g;
        }

        protected ModuleListBean(Parcel parcel) {
            this.f21545a = parcel.readString();
            this.f21546b = parcel.readString();
            this.f21547c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.createTypedArrayList(SubModuleListBean.CREATOR);
            this.g = parcel.readString();
            parcel.readParcelable(getClass().getClassLoader());
        }

        public ModuleListBean() {
        }
    }

    public static class SubModuleListBean implements Serializable, Parcelable {
        public static final Parcelable.Creator<SubModuleListBean> CREATOR = new d();
        private static final long serialVersionUID = 773325441128424814L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("subModuleCode")
        private String f21548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("subModuleName")
        private String f21549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("subModuleLinkAddress")
        private String f21550c;

        @SerializedName("openLinkType")
        private String d;

        @SerializedName("isLink")
        private String e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f21548a);
            parcel.writeString(this.f21549b);
            parcel.writeString(this.f21550c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        class d implements Parcelable.Creator<SubModuleListBean> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SubModuleListBean[] newArray(int i) {
                return new SubModuleListBean[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SubModuleListBean createFromParcel(Parcel parcel) {
                return new SubModuleListBean(parcel);
            }

            d() {
            }
        }

        public String a() {
            return this.f21548a;
        }

        protected SubModuleListBean(Parcel parcel) {
            this.f21548a = parcel.readString();
            this.f21549b = parcel.readString();
            this.f21550c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f21544a);
    }

    public List<ModuleListBean> getModuleList() {
        return this.f21544a;
    }

    class a implements Parcelable.Creator<ModuleConfigResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ModuleConfigResponse[] newArray(int i) {
            return new ModuleConfigResponse[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleConfigResponse createFromParcel(Parcel parcel) {
            return new ModuleConfigResponse(parcel);
        }

        a() {
        }
    }

    protected ModuleConfigResponse(Parcel parcel) {
        this.f21544a = parcel.createTypedArrayList(ModuleListBean.CREATOR);
    }

    public ModuleConfigResponse() {
    }
}
