package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.database.a;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.NfcConfigsResponse;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.i;
import com.miui.tsmclient.model.mitsm.g;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class las extends g<w3s, MifareCardInfo> {
    private void a(Context context, NfcConfigsResponse.NfcConfigs nfcConfigs, CardInfo cardInfo) {
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
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BaseResponse a(Context context, MifareCardInfo mifareCardInfo) {
        return ((w3s) this.f10380a).backup(context, mifareCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, MifareCardInfo mifareCardInfo, Bundle bundle) {
        bundle.putString(Constants.EXTRA_DOOR_CARD_BUSINESS_ID, mifareCardInfo.getBusinessId());
        BaseResponse baseResponseB = super.b(context, mifareCardInfo, bundle);
        if (baseResponseB.isSuccess()) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX + mifareCardInfo.mAid);
        }
        return baseResponseB;
    }

    public final BaseResponse p(Context context, MifareCardInfo mifareCardInfo) {
        Object obj;
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        if (mifareCardInfo != null && mifareCardInfo.isWaitingToWriteDataStatus()) {
            baseResponse = ((w3s) this.f10380a).h(context, mifareCardInfo);
            if (baseResponse.isSuccess() && (obj = baseResponse.mDatas[0]) != null) {
                mifareCardInfo.setWaitingTime(((JSONObject) obj).optString(MifareCardInfo.CARD_INFO_WAITING_TIME));
            }
        }
        return baseResponse;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public BaseResponse l(Context context, MifareCardInfo mifareCardInfo, Bundle bundle) {
        BaseResponse baseResponseIssue = ((w3s) this.f10380a).issue(context, mifareCardInfo, bundle);
        if (baseResponseIssue != null && baseResponseIssue.isSuccess()) {
            NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        }
        return baseResponseIssue;
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public w3s b() {
        return new w3s();
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, MifareCardInfo mifareCardInfo) {
        i.b().d();
        NfcConfigsResponse.NfcConfigs nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.createConfigFromFile(context);
        if (nfcConfigsCreateConfigFromFile == null) {
            nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        }
        if (mifareCardInfo != null && !TextUtils.isEmpty(mifareCardInfo.mAid)) {
            BaseResponse baseResponseD = ((w3s) this.f10380a).d(context, mifareCardInfo);
            a(context, nfcConfigsCreateConfigFromFile, mifareCardInfo);
            if (baseResponseD == null || !baseResponseD.isSuccess()) {
                return baseResponseD;
            }
            BaseResponse baseResponseU = u(context, mifareCardInfo);
            if (!baseResponseU.isSuccess()) {
                LogUtils.d(mifareCardInfo.mAid + " updateCommunityCardFlowStatus failed");
            }
            if (p(context, mifareCardInfo).isSuccess()) {
                return baseResponseU;
            }
            LogUtils.t(mifareCardInfo.mAid + " getCalculateWaitingTime failed");
            return baseResponseU;
        }
        if (PrefUtils.getBoolean(context, PrefUtils.PREF_KEY_NOTIFY_SERVER_UPDATE_CARD, false)) {
            List<CardInfo> listB = a.b(context, CardInfo.CARD_TYPE_MIFARE);
            if (listB != null) {
                BaseResponse baseResponseD2 = ((w3s) this.f10380a).d(context, (MifareCardInfo[]) listB.toArray(new MifareCardInfo[listB.size()]));
                if (baseResponseD2 == null || baseResponseD2.mResultCode != 0) {
                    return baseResponseD2;
                }
            }
            PrefUtils.putBoolean(context, PrefUtils.PREF_KEY_NOTIFY_SERVER_UPDATE_CARD, false);
        }
        BaseResponse baseResponseA = ((w3s) this.f10380a).a(context);
        if (baseResponseA.mResultCode == 0) {
            List<MifareCardInfo> listE = w3s.e(context, ((TsmRpcModels.QueryDoorCardInfoResponse) baseResponseA.mDatas[0]).getCardInfoListList());
            baseResponseA.mDatas[0] = listE;
            for (MifareCardInfo mifareCardInfo2 : listE) {
                a(context, nfcConfigsCreateConfigFromFile, mifareCardInfo2);
                if (!u(context, mifareCardInfo2).isSuccess()) {
                    LogUtils.d(mifareCardInfo2.mAid + "updateCommunityCardFlowStatus failed");
                }
                if (!p(context, mifareCardInfo2).isSuccess()) {
                    LogUtils.t(mifareCardInfo2.mAid + " getCalculateWaitingTime failed");
                }
            }
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, MifareCardInfo mifareCardInfo, Bundle bundle) {
        return new BaseResponse(0, mifareCardInfo);
    }

    public final BaseResponse u(Context context, CardInfo cardInfo) {
        if (cardInfo != null && cardInfo.isMiFareCard()) {
            MifareCardInfo mifareCardInfo = (MifareCardInfo) cardInfo;
            if (mifareCardInfo.isCommunityDoorCardV3() && !mifareCardInfo.isSupportDownload()) {
                return ((w3s) this.f10380a).b(context, mifareCardInfo);
            }
        }
        return new BaseResponse(0, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public BaseResponse k(Context context, MifareCardInfo mifareCardInfo, Bundle bundle) {
        return bundle.getBoolean(Constants.EXTRA_OPERATION_UPDATE_ENCRYPTED_SECTOR) ? ((w3s) this.f10380a).c(context, mifareCardInfo, bundle) : super.k(context, mifareCardInfo, bundle);
    }
}
