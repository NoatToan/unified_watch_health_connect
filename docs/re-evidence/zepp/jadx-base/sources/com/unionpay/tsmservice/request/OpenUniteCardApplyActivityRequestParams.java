package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.ApplyActivityStyle;

/* JADX INFO: loaded from: classes18.dex */
public class OpenUniteCardApplyActivityRequestParams extends RequestParams {
    public static final Parcelable.Creator<OpenUniteCardApplyActivityRequestParams> CREATOR = new a();
    private String b;
    private String c;
    private String d;
    private String e;
    private ApplyActivityStyle f;

    public static class a implements Parcelable.Creator<OpenUniteCardApplyActivityRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OpenUniteCardApplyActivityRequestParams createFromParcel(Parcel parcel) {
            return new OpenUniteCardApplyActivityRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OpenUniteCardApplyActivityRequestParams[] newArray(int i) {
            return new OpenUniteCardApplyActivityRequestParams[i];
        }
    }

    public OpenUniteCardApplyActivityRequestParams() {
    }

    public String getBankName() {
        return this.d;
    }

    public String getCardType() {
        return this.e;
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

    public void setCardType(String str) {
        this.e = str;
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
    }

    public OpenUniteCardApplyActivityRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (ApplyActivityStyle) parcel.readParcelable(ApplyActivityStyle.class.getClassLoader());
    }
}
