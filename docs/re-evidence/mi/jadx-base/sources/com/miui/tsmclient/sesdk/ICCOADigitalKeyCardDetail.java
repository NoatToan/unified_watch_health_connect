package com.miui.tsmclient.sesdk;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.entity.ICommonKeyPrivilege;

/* JADX INFO: loaded from: classes6.dex */
public class ICCOADigitalKeyCardDetail extends DigitalKeyCardDetail {

    @SerializedName("keyAccessProfile")
    private ICCOACarKeyCardInfo.KeyAccessProfile mKeyAccessProfile;

    @SerializedName("sharingChannel")
    private int mSharingChannel;

    public ICCOADigitalKeyCardDetail(SeCard seCard) {
        super(seCard);
    }

    public static ICCOADigitalKeyCardDetail fromJson(String str) {
        return (ICCOADigitalKeyCardDetail) new Gson().fromJson(str, ICCOADigitalKeyCardDetail.class);
    }

    @Override // com.miui.tsmclient.sesdk.DigitalKeyCardDetail
    public ICommonKeyPrivilege getPrivilege() {
        return this.mKeyAccessProfile;
    }

    public int getSharingChannel() {
        return this.mSharingChannel;
    }

    @Override // com.miui.tsmclient.sesdk.DigitalKeyCardDetail
    public SeCardStatus getStatus(int i) {
        if (TextUtils.equals(this.mCardInfo.getPendingAction(), CarKeyCardInfo.PENDING_ACTION_TERMINATE)) {
            return SeCardStatus.DELETING;
        }
        if (i == 1) {
            return SeCardStatus.PERSONALIZING;
        }
        if (i == 2) {
            return SeCardStatus.WAIT_TO_ACTIVE;
        }
        if (i == 3) {
            return checkPeriodOfKeyValidity();
        }
        if (i != 4) {
            return i != 5 ? SeCardStatus.ACTIVE : SeCardStatus.DELETE;
        }
        return SeCardStatus.NEGATIVE;
    }

    @Override // com.miui.tsmclient.sesdk.DigitalKeyCardDetail
    public void parseKeyOtherData() {
        this.mKeyAccessProfile = ((ICCOACarKeyCardInfo) this.mCardInfo).getKeyAccessProfile();
        this.mSharingChannel = ((ICCOACarKeyCardInfo) this.mCardInfo).getSharingChannel();
    }
}
