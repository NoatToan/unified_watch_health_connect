package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.ApplyActivityStyle;

/* JADX INFO: loaded from: classes18.dex */
public class OpenUniteCardApplyActivityWithRiskInfoRequestParams extends RequestParams {
    public static final Parcelable.Creator<OpenUniteCardApplyActivityWithRiskInfoRequestParams> CREATOR = new a();
    private String b;
    private String c;
    private String d;
    private String e;
    private ApplyActivityStyle f;
    private int g;
    private String h;
    private String i;

    public static class a implements Parcelable.Creator<OpenUniteCardApplyActivityWithRiskInfoRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OpenUniteCardApplyActivityWithRiskInfoRequestParams createFromParcel(Parcel parcel) {
            return new OpenUniteCardApplyActivityWithRiskInfoRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OpenUniteCardApplyActivityWithRiskInfoRequestParams[] newArray(int i) {
            return new OpenUniteCardApplyActivityWithRiskInfoRequestParams[i];
        }
    }

    public OpenUniteCardApplyActivityWithRiskInfoRequestParams() {
        this.g = 4;
        this.h = "";
        this.i = "";
    }

    public String getBankName() {
        return this.d;
    }

    public int getCaptureMethod() {
        return this.g;
    }

    public String getCardType() {
        return this.e;
    }

    public String getChntUsrId() {
        return this.h;
    }

    public String getFullDeviceNumber() {
        return this.i;
    }

    public String getSpan() {
        return this.b;
    }

    public String getTCUrl() {
        return this.c;
    }

    public ApplyActivityStyle getmApplyActivityStyle() {
        return this.f;
    }

    public void setBankName(String str) {
        this.d = str;
    }

    public void setCaptureMethod(int i) {
        this.g = i;
    }

    public void setCardType(String str) {
        this.e = str;
    }

    public void setChntUsrId(String str) {
        this.h = str;
    }

    public void setFullDeviceNumber(String str) {
        this.i = str;
    }

    public void setSpan(String str) {
        this.b = str;
    }

    public void setTCUrl(String str) {
        this.c = str;
    }

    public void setmApplyActivityStyle(ApplyActivityStyle applyActivityStyle) {
        this.f = applyActivityStyle;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public OpenUniteCardApplyActivityWithRiskInfoRequestParams(Parcel parcel) {
        this.g = 4;
        this.h = "";
        this.i = "";
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (ApplyActivityStyle) parcel.readParcelable(ApplyActivityStyle.class.getClassLoader());
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
}
