package com.huami.wallet.accessdoor.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.door.NfcTag;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u001e\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "", "", "phoneNum", "districtName", "", "addPhoneNumAndDistrict", "clear", "a", "Ljava/lang/String;", "getPhoneNum", "()Ljava/lang/String;", "setPhoneNum", "(Ljava/lang/String;)V", "b", "getDistrictName", "setDistrictName", "Lcom/huami/nfc/door/NfcTag;", "c", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "()Lcom/huami/nfc/door/NfcTag;", "setNfcTag", "(Lcom/huami/nfc/door/NfcTag;)V", "nfcTag", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getNfcTagType", "()I", "setNfcTagType", "(I)V", "nfcTagType", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class DoorOpenCardData {
    public static final int ENCRYPTION_CARD_DATA = 1;
    public static final int NORMAL_CARD_DATA = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String phoneNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String districtName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private NfcTag nfcTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int nfcTagType;

    public static /* synthetic */ void addPhoneNumAndDistrict$default(DoorOpenCardData doorOpenCardData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        doorOpenCardData.addPhoneNumAndDistrict(str, str2);
    }

    public final void addPhoneNumAndDistrict(@Nullable String phoneNum, @Nullable String districtName) {
        this.phoneNum = phoneNum;
        this.districtName = districtName;
    }

    public final void clear() {
        this.phoneNum = null;
        this.districtName = null;
        this.nfcTag = null;
        this.nfcTagType = 0;
    }

    @Nullable
    public final String getDistrictName() {
        return this.districtName;
    }

    @Nullable
    public final NfcTag getNfcTag() {
        return this.nfcTag;
    }

    public final int getNfcTagType() {
        return this.nfcTagType;
    }

    @Nullable
    public final String getPhoneNum() {
        return this.phoneNum;
    }

    public final void setDistrictName(@Nullable String str) {
        this.districtName = str;
    }

    public final void setNfcTag(@Nullable NfcTag nfcTag) {
        this.nfcTag = nfcTag;
    }

    public final void setNfcTagType(int i) {
        this.nfcTagType = i;
    }

    public final void setPhoneNum(@Nullable String str) {
        this.phoneNum = str;
    }
}
