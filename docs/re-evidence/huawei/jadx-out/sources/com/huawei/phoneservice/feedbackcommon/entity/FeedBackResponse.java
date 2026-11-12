package com.huawei.phoneservice.feedbackcommon.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.jsoperation.JsUtil;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBackResponse implements Serializable, Parcelable {
    public static final Parcelable.Creator<FeedBackResponse> CREATOR = new d();
    private static final long serialVersionUID = -5533984095408646461L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    private List<ProblemEnity> f21804a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public static class ProblemEnity implements Serializable, Parcelable {
        public static final Parcelable.Creator<ProblemEnity> CREATOR = new e();
        private static final long serialVersionUID = 6410105318113796076L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("problemId")
        private String f21805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("problemDesc")
        private String f21806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("answer")
        private String f21807c;

        @SerializedName("attaches")
        private List<FeedMedia> d;

        @SerializedName("pic")
        private FeedMedia e;

        @SerializedName("createTime")
        private String f;

        @SerializedName(JsUtil.SCORE)
        private String g;

        @SerializedName("read")
        private boolean h;

        @SerializedName("srcno")
        private String i;

        @SerializedName("answerTime")
        private String j;

        @SerializedName("updateTime")
        private String k;

        @SerializedName("problemCatalogCode")
        private String l;

        @SerializedName("contact")
        private String m;

        @SerializedName("isSelectMode")
        private boolean n;

        @SerializedName("isChecked")
        private boolean o;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f21805a);
            parcel.writeString(this.f21806b);
            parcel.writeString(this.f21807c);
            parcel.writeTypedList(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        }

        public void setSelectMode(boolean z) {
            this.n = z;
        }

        public void setScore(String str) {
            this.g = str;
        }

        public void setIsRead(boolean z) {
            this.h = z;
        }

        public void setChecked(boolean z) {
            this.o = z;
        }

        public boolean isSelectMode() {
            return this.n;
        }

        public boolean isChecked() {
            return this.o;
        }

        public String getUpdateTime() {
            return this.k;
        }

        public String getSrno() {
            return this.i;
        }

        public String getScore() {
            return this.g;
        }

        public String getProblemId() {
            return this.f21805a;
        }

        public String getProblemDesc() {
            return this.f21806b;
        }

        public String getProblemCatalogCode() {
            return this.l;
        }

        public FeedMedia getPicURL() {
            return this.e;
        }

        public List<FeedMedia> getMediaItemList() {
            return this.d;
        }

        public boolean getIsRead() {
            return this.h;
        }

        public String getCreateTime() {
            return this.f;
        }

        public String getContact() {
            return this.m;
        }

        public String getAnswerTime() {
            return this.j;
        }

        class e implements Parcelable.Creator<ProblemEnity> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ProblemEnity[] newArray(int i) {
                return new ProblemEnity[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ProblemEnity createFromParcel(Parcel parcel) {
                return new ProblemEnity(parcel);
            }

            e() {
            }
        }

        public String getAnswer() {
            return this.f21807c;
        }

        protected ProblemEnity(Parcel parcel) {
            this.f21805a = parcel.readString();
            this.f21806b = parcel.readString();
            this.f21807c = parcel.readString();
            this.d = parcel.createTypedArrayList(FeedMedia.CREATOR);
            this.e = (FeedMedia) parcel.readParcelable(FeedMedia.class.getClassLoader());
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readByte() != 0;
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readByte() != 0;
            this.o = parcel.readByte() != 0;
        }
    }

    class d implements Parcelable.Creator<FeedBackResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FeedBackResponse[] newArray(int i) {
            return new FeedBackResponse[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeedBackResponse createFromParcel(Parcel parcel) {
            return new FeedBackResponse(parcel);
        }

        d() {
        }
    }

    public List<ProblemEnity> getDataList() {
        return this.f21804a;
    }

    protected FeedBackResponse(Parcel parcel) {
        this.f21804a = parcel.createTypedArrayList(ProblemEnity.CREATOR);
    }
}
