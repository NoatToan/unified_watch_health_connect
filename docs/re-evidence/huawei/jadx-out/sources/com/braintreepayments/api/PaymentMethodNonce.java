package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.tencent.connect.common.Constants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/braintreepayments/api/PaymentMethodNonce;", "Landroid/os/Parcelable;", Constants.NONCE, "", "isDefault", "", "(Ljava/lang/String;Z)V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()Z", "string", "getString", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", ParamConstants.Param.FLAGS, "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PaymentMethodNonce implements Parcelable {
    private final boolean isDefault;
    private final String string;
    public static final Parcelable.Creator<PaymentMethodNonce> CREATOR = new d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/braintreepayments/api/PaymentMethodNonce$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PaymentMethodNonce;", "createFromParcel", "in", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/braintreepayments/api/PaymentMethodNonce;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements Parcelable.Creator<PaymentMethodNonce> {
        d() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PaymentMethodNonce createFromParcel(Parcel parcel) {
            zcp.c(parcel, "");
            return new PaymentMethodNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PaymentMethodNonce[] newArray(int i) {
            return new PaymentMethodNonce[i];
        }
    }

    public String getString() {
        return this.string;
    }

    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public boolean getIsDefault() {
        return this.isDefault;
    }

    public PaymentMethodNonce(String str, boolean z) {
        zcp.c(str, "");
        this.string = str;
        this.isDefault = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zcp.c(dest, "");
        dest.writeString(getString());
        dest.writeByte(getIsDefault() ? (byte) 1 : (byte) 0);
    }

    protected PaymentMethodNonce(Parcel parcel) {
        zcp.c(parcel, "");
        String string = parcel.readString();
        this.string = string != null ? string : "";
        this.isDefault = parcel.readByte() > 0;
    }
}
