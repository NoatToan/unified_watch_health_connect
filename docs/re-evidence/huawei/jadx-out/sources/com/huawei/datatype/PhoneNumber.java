package com.huawei.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.cop;
import defpackage.lst;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class PhoneNumber implements Serializable {

    @SerializedName("phone_number")
    private String mPhoneNumber;

    @SerializedName("phone_tag")
    private String mPhoneTag;

    public PhoneNumber() {
        this.mPhoneTag = "Mobile";
    }

    public PhoneNumber(String str, String str2) {
        this.mPhoneTag = "Mobile";
        this.mPhoneTag = (String) lst.d(str);
        this.mPhoneNumber = (String) lst.d(str2);
    }

    public String getPhoneNumber() {
        return (String) lst.d(this.mPhoneNumber);
    }

    public void setPhoneNumber(String str) {
        this.mPhoneNumber = (String) lst.d(str);
    }

    public String getPhoneTag() {
        return (String) lst.d(this.mPhoneTag);
    }

    public void setPhoneTag(String str) {
        this.mPhoneTag = (String) lst.d(str);
    }

    public String toString() {
        return "[PhoneNumber: phone_tag = " + this.mPhoneTag + ", phone_number = " + cop.e(this.mPhoneNumber) + "]";
    }
}
