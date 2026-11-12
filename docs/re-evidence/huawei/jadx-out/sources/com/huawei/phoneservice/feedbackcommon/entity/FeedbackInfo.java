package com.huawei.phoneservice.feedbackcommon.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackInfo implements Parcelable {
    public static final Parcelable.Creator<FeedbackInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("problemId")
    private String f21811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("parentId")
    private String f21812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("childId")
    private String f21813c;

    @SerializedName("problemDesc")
    private String d;

    @SerializedName("contact")
    private String e;

    @SerializedName("filesSize")
    private long f;

    @SerializedName("logsSize")
    private long g;

    @SerializedName("showLog")
    private boolean[] h;

    @SerializedName("flag")
    private int i;

    @SerializedName("srCode")
    private String j;

    @SerializedName("problemName")
    private String k;

    @SerializedName("zipFileName")
    private String l;

    @SerializedName("associatedId")
    private long m;

    @SerializedName("uniqueCode")
    private String n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21811a);
        parcel.writeString(this.f21812b);
        parcel.writeString(this.f21813c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeBooleanArray(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeLong(this.m);
        parcel.writeString(this.n);
    }

    public void setZipFileName(String str) {
        this.l = str;
    }

    public void setUniqueCode(String str) {
        this.n = str;
    }

    public void setSrCode(String str) {
        this.j = str;
    }

    public void setShowLog(boolean z) {
        this.h[0] = z;
    }

    public void setProblemType(String str, String str2) {
        this.f21812b = str;
        this.f21813c = str2;
    }

    public void setProblemName(String str) {
        this.k = str;
    }

    public void setProblemId(String str) {
        this.f21811a = str;
    }

    public void setProblemDesc(String str) {
        this.d = str;
    }

    public void setParentId(String str) {
        this.f21812b = str;
    }

    public void setLogsSize(long j) {
        this.g = j;
    }

    public void setFlag(int i) {
        this.i = i;
    }

    public void setFilesSize(long j) {
        this.f = j;
    }

    public void setContact(String str) {
        this.e = str;
    }

    public void setChildId(String str) {
        this.f21813c = str;
    }

    public void setAssociatedId(long j) {
        this.m = j;
    }

    public String getZipFileName() {
        return this.l;
    }

    public String getUniqueCode() {
        return this.n;
    }

    public String getSrCode() {
        return this.j;
    }

    public boolean getShowLog() {
        return this.h[0];
    }

    public String getProblemType() {
        return !TextUtils.isEmpty(this.f21813c) ? this.f21813c : this.f21812b;
    }

    public String getProblemName() {
        return this.k;
    }

    public String getProblemId() {
        return this.f21811a;
    }

    public String getProblemDesc() {
        return this.d;
    }

    public String getParentId() {
        return this.f21812b;
    }

    public long getLogsSize() {
        return this.g;
    }

    public int getFlag() {
        return this.i;
    }

    public long getFilesSize() {
        return this.f;
    }

    public String getContact() {
        return this.e;
    }

    public String getChildId() {
        return this.f21813c;
    }

    public long getAssociatedId() {
        return this.m;
    }

    public FeedbackInfo(String str, String str2, String str3, String str4, String str5) {
        this.h = new boolean[]{true};
        this.j = str;
        this.f21811a = str2;
        this.f21812b = str3;
        this.f21813c = str4;
        this.k = str5;
    }

    class a implements Parcelable.Creator<FeedbackInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FeedbackInfo[] newArray(int i) {
            return new FeedbackInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FeedbackInfo createFromParcel(Parcel parcel) {
            return new FeedbackInfo(parcel);
        }

        a() {
        }
    }

    public FeedbackInfo(String str, String str2, String str3, String str4) {
        this.h = new boolean[]{true};
        this.f21811a = str;
        this.f21812b = str2;
        this.f21813c = str3;
        this.e = str4;
    }

    protected FeedbackInfo(Parcel parcel) {
        this.h = new boolean[]{true};
        this.f21811a = parcel.readString();
        this.f21812b = parcel.readString();
        this.f21813c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.createBooleanArray();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readLong();
        this.n = parcel.readString();
    }

    public FeedbackInfo() {
        this.h = new boolean[]{true};
    }
}
