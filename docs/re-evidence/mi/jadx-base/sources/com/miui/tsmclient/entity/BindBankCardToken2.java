package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BindBankCardToken2 implements Parcelable {
    public static final Parcelable.Creator<BindBankCardToken2> CREATOR = new Parcelable.Creator<BindBankCardToken2>() { // from class: com.miui.tsmclient.entity.BindBankCardToken2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BindBankCardToken2 createFromParcel(Parcel parcel) {
            return new BindBankCardToken2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BindBankCardToken2[] newArray(int i) {
            return new BindBankCardToken2[i];
        }
    };
    private boolean isDisplayedProtocol;
    private int mFreeBankCardTotal;
    private List<QrBankCardInfo> mNoneNfcQuickBankCardList;
    private List<BankCardInfo> mQuickBankCardList;
    private List<BankInfo> mRecommendedBankCardList;
    private String mWholeActivityLabel;
    private String mWholeActivityLabelExplain;

    public BindBankCardToken2() {
    }

    private List<QrBankCardInfo> getNoneNfcQuickBankCardList() {
        return this.mNoneNfcQuickBankCardList;
    }

    private List<BankCardInfo> getQuickBankCardList() {
        return this.mQuickBankCardList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFreeBankCardTotal() {
        return this.mFreeBankCardTotal;
    }

    public List<BankInfo> getRecommendedBankCardList() {
        return this.mRecommendedBankCardList;
    }

    public List<BankCardInfo> getToken2QuickBankCardList() {
        ArrayList arrayList = new ArrayList();
        if (EnvironmentConfig.isSupportNfc()) {
            arrayList.addAll(getQuickBankCardList());
        } else {
            arrayList.addAll(getNoneNfcQuickBankCardList());
        }
        return arrayList;
    }

    public String getWholeActivityLabel() {
        return this.mWholeActivityLabel;
    }

    public String getWholeActivityLabelExplain() {
        return this.mWholeActivityLabelExplain;
    }

    public boolean isDisplayedProtocol() {
        return this.isDisplayedProtocol;
    }

    public boolean isQuickBankCardListEmpty() {
        return ObjectUtils.isCollectionEmpty(getQuickBankCardList()) && ObjectUtils.isCollectionEmpty(getNoneNfcQuickBankCardList());
    }

    public void setDisplayedProtocol(boolean z) {
        this.isDisplayedProtocol = z;
    }

    public void setFreeBankCardTotal(int i) {
        this.mFreeBankCardTotal = i;
    }

    public void setNoneNfcQuickBankCardList(List<QrBankCardInfo> list) {
        this.mNoneNfcQuickBankCardList = list;
    }

    public void setQuickBankCardList(List<BankCardInfo> list) {
        this.mQuickBankCardList = list;
    }

    public void setRecommendedBankCardList(List<BankInfo> list) {
        this.mRecommendedBankCardList = list;
    }

    public void setWholeActivityLabel(String str) {
        this.mWholeActivityLabel = str;
    }

    public void setWholeActivityLabelExplain(String str) {
        this.mWholeActivityLabelExplain = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mQuickBankCardList);
        parcel.writeTypedList(this.mNoneNfcQuickBankCardList);
        parcel.writeTypedList(this.mRecommendedBankCardList);
        parcel.writeByte(this.isDisplayedProtocol ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mFreeBankCardTotal);
        parcel.writeString(this.mWholeActivityLabel);
        parcel.writeString(this.mWholeActivityLabelExplain);
    }

    public BindBankCardToken2(Parcel parcel) {
        this.mQuickBankCardList = parcel.createTypedArrayList(BankCardInfo.CREATOR);
        this.mNoneNfcQuickBankCardList = parcel.createTypedArrayList(QrBankCardInfo.CREATOR);
        this.mRecommendedBankCardList = parcel.createTypedArrayList(BankInfo.CREATOR);
        this.isDisplayedProtocol = parcel.readByte() != 0;
        this.mFreeBankCardTotal = parcel.readInt();
        this.mWholeActivityLabel = parcel.readString();
        this.mWholeActivityLabelExplain = parcel.readString();
    }
}
