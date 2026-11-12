package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020(H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000b¨\u0006/"}, d2 = {"Lcom/braintreepayments/api/PostalAddress;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "countryCodeAlpha2", "", "getCountryCodeAlpha2", "()Ljava/lang/String;", "setCountryCodeAlpha2", "(Ljava/lang/String;)V", "extendedAddress", "getExtendedAddress", "setExtendedAddress", "isEmpty", "", "()Z", "locality", "getLocality", "setLocality", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "postalCode", "getPostalCode", "setPostalCode", "recipientName", "getRecipientName", "setRecipientName", "region", "getRegion", "setRegion", "sortingCode", "getSortingCode", "setSortingCode", "streetAddress", "getStreetAddress", "setStreetAddress", "describeContents", "", "toString", "writeToParcel", "", "dest", ParamConstants.Param.FLAGS, "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PostalAddress implements Parcelable {
    private String countryCodeAlpha2;
    private String extendedAddress;
    private String locality;
    private String phoneNumber;
    private String postalCode;
    private String recipientName;
    private String region;
    private String sortingCode;
    private String streetAddress;
    public static final Parcelable.Creator<PostalAddress> CREATOR = new a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String str) {
        this.streetAddress = str;
    }

    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    public void setExtendedAddress(String str) {
        this.extendedAddress = str;
    }

    public String getLocality() {
        return this.locality;
    }

    public void setLocality(String str) {
        this.locality = str;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public String getSortingCode() {
        return this.sortingCode;
    }

    public void setSortingCode(String str) {
        this.sortingCode = str;
    }

    public String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    public void setCountryCodeAlpha2(String str) {
        this.countryCodeAlpha2 = str;
    }

    public PostalAddress() {
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getCountryCodeAlpha2());
    }

    public String toString() {
        return getRecipientName() + '\n' + getStreetAddress() + '\n' + getExtendedAddress() + '\n' + getLocality() + ", " + getRegion() + '\n' + getPostalCode() + ' ' + getCountryCodeAlpha2();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zcp.c(dest, "");
        dest.writeString(getStreetAddress());
        dest.writeString(getExtendedAddress());
        dest.writeString(getLocality());
        dest.writeString(getRegion());
        dest.writeString(getPostalCode());
        dest.writeString(getCountryCodeAlpha2());
        dest.writeString(getRecipientName());
        dest.writeString(getPhoneNumber());
        dest.writeString(getSortingCode());
    }

    private PostalAddress(Parcel parcel) {
        setStreetAddress(parcel.readString());
        setExtendedAddress(parcel.readString());
        setLocality(parcel.readString());
        setRegion(parcel.readString());
        setPostalCode(parcel.readString());
        setCountryCodeAlpha2(parcel.readString());
        setRecipientName(parcel.readString());
        setPhoneNumber(parcel.readString());
        setSortingCode(parcel.readString());
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/braintreepayments/api/PostalAddress$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PostalAddress;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/braintreepayments/api/PostalAddress;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<PostalAddress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PostalAddress createFromParcel(Parcel parcel) {
            zcp.c(parcel, "");
            return new PostalAddress(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PostalAddress[] newArray(int i) {
            return new PostalAddress[i];
        }
    }

    public /* synthetic */ PostalAddress(Parcel parcel, zcm zcmVar) {
        this(parcel);
    }
}
