package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.NfcConfigsResponse;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.PrefUtils;
import defpackage.ljs;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class p extends com.miui.tsmclient.model.mitsm.g<o, ProprietaryCarKeyCardInfo> {
    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(Constants.EXTRA_DOOR_CARD_BUSINESS_ID, proprietaryCarKeyCardInfo.getBusinessId());
        BaseResponse baseResponseB = super.b(context, proprietaryCarKeyCardInfo, bundle);
        if (baseResponseB.isSuccess()) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX + proprietaryCarKeyCardInfo.mAid);
        }
        return baseResponseB;
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o b() {
        return new o();
    }

    public final void a(Context context, NfcConfigsResponse.NfcConfigs nfcConfigs, CardInfo cardInfo) {
        if (nfcConfigs == null || cardInfo == null) {
            return;
        }
        cardInfo.setKeepActivated(nfcConfigs.isKeepActivated(cardInfo.mAid));
        if (cardInfo.isKeepActivated()) {
            String str = PrefUtils.PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX + cardInfo.mAid;
            if (PrefUtils.getBoolean(context, str, false)) {
                return;
            }
            PrefUtils.putBoolean(context, str, ljs.e(context, cardInfo));
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo) {
        i.b().d();
        NfcConfigsResponse.NfcConfigs nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.createConfigFromFile(context);
        if (nfcConfigsCreateConfigFromFile == null) {
            nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        }
        if (proprietaryCarKeyCardInfo != null && !TextUtils.isEmpty(proprietaryCarKeyCardInfo.mAid)) {
            BaseResponse baseResponseA = ((o) this.f10380a).a(context, proprietaryCarKeyCardInfo);
            a(context, nfcConfigsCreateConfigFromFile, proprietaryCarKeyCardInfo);
            return baseResponseA;
        }
        BaseResponse baseResponseA2 = ((o) this.f10380a).a(context);
        if (baseResponseA2.mResultCode != 0) {
            return baseResponseA2;
        }
        Iterator it = ((List) baseResponseA2.mDatas[0]).iterator();
        while (it.hasNext()) {
            a(context, nfcConfigsCreateConfigFromFile, (CardInfo) it.next());
        }
        return baseResponseA2;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseResponse l(Context context, ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo, Bundle bundle) {
        BaseResponse baseResponseIssue = ((o) this.f10380a).issue(context, proprietaryCarKeyCardInfo, bundle);
        if (baseResponseIssue != null && baseResponseIssue.isSuccess()) {
            NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        }
        return baseResponseIssue;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    public BaseResponse c(Context context, ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo, Bundle bundle) {
        return new BaseResponse(0, proprietaryCarKeyCardInfo);
    }
}
