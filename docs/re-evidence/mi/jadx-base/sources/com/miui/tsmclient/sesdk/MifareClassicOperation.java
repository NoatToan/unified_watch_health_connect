package com.miui.tsmclient.sesdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.Block;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CheckMifareIssuedResponse;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.SectorData;
import com.miui.tsmclient.entity.doorcardv3.CalTaskData;
import com.miui.tsmclient.entity.doorcardv3.CollectionDataConfig;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.model.j;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.net.doorcardv3.request.CheckUserCalTaskRequest;
import com.miui.tsmclient.net.doorcardv3.request.PullCollectionDataConfigRequest;
import com.miui.tsmclient.net.doorcardv3.request.PullSectorKeyRequest;
import com.miui.tsmclient.net.doorcardv3.response.CheckUserCalTaskResponse;
import com.miui.tsmclient.net.doorcardv3.response.PullCollectionDataConfigResponse;
import com.miui.tsmclient.net.doorcardv3.response.PullSectorKeyResponse;
import com.miui.tsmclient.net.request.CheckServiceAccessRequest;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MifareClassicOperation {
    private static final String TAG = "MifareCardOperation";
    private CollectionDataConfig mCollectionDataConfig;
    private final Context mContext = EnvironmentConfig.getContext();
    private MifareClassicTag mMifareClassicTag;
    private MifareTag mMifareTag;
    private final SeCard mSeCard;

    public MifareClassicOperation(SeCard seCard) {
        this.mSeCard = seCard;
    }

    private void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    private int getErrorCode(CommonResponseInfo commonResponseInfo, int i) {
        return commonResponseInfo == null ? i : commonResponseInfo.getErrorCode();
    }

    private String getErrorMsg(CommonResponseInfo commonResponseInfo, String str) {
        return commonResponseInfo == null ? str : commonResponseInfo.getErrorDesc();
    }

    private boolean isCalTaskServiceAvailable(BaseResponse baseResponse, CheckEncryptCardResponse checkEncryptCardResponse) throws IOException {
        LogUtils.d(TAG, "CheckUserCalTaskResponse");
        CheckUserCalTaskResponse checkUserCalTaskResponse = (CheckUserCalTaskResponse) HttpClient.getInstance(this.mContext).execute(new CheckUserCalTaskRequest()).getResult();
        if (checkUserCalTaskResponse == null || !checkUserCalTaskResponse.isSuccess()) {
            baseResponse.mMsg = getErrorMsg(checkUserCalTaskResponse, "");
            baseResponse.mResultCode = getErrorCode(checkUserCalTaskResponse, -1);
            return false;
        }
        CalTaskData data = checkUserCalTaskResponse.getData();
        if (data == null || !data.isOverLimit()) {
            checkEncryptCardResponse.setServiceAvailable(true);
            return true;
        }
        checkEncryptCardResponse.setErrorInfo(data.getErrorTip());
        baseResponse.setDatas(checkEncryptCardResponse);
        return false;
    }

    private boolean isCollectionDataConfigAvailable(BaseResponse baseResponse, CheckEncryptCardResponse checkEncryptCardResponse) throws IOException {
        LogUtils.d(TAG, "PullCollectionDataConfigRequest");
        PullCollectionDataConfigRequest pullCollectionDataConfigRequest = new PullCollectionDataConfigRequest();
        PullCollectionDataConfigResponse pullCollectionDataConfigResponse = (PullCollectionDataConfigResponse) HttpClient.getInstance(this.mContext).execute(pullCollectionDataConfigRequest).getResult();
        if (!pullCollectionDataConfigRequest.isSuccess()) {
            baseResponse.mMsg = getErrorMsg(pullCollectionDataConfigResponse, "");
            baseResponse.mResultCode = getErrorCode(pullCollectionDataConfigResponse, -1);
            return false;
        }
        CollectionDataConfig colletDataConfig = pullCollectionDataConfigResponse.getColletDataConfig();
        this.mCollectionDataConfig = colletDataConfig;
        if (colletDataConfig.isAvailable(this.mMifareTag)) {
            return true;
        }
        checkEncryptCardResponse.setEncryptCardSupported(false);
        baseResponse.setDatas(checkEncryptCardResponse);
        return false;
    }

    private boolean isEncryptedCardSupported(BaseResponse baseResponse, CheckEncryptCardResponse checkEncryptCardResponse) throws IOException {
        LogUtils.d(TAG, "CheckServiceAccessRequest");
        CommonResponseInfo commonResponseInfo = (CommonResponseInfo) HttpClient.getInstance(this.mContext).execute(new CheckServiceAccessRequest(TSMAuthContants.SERVICE_DOOR_CARD_PRO, null)).getResult();
        if (commonResponseInfo == null) {
            baseResponse.mResultCode = 2;
            return false;
        }
        if (commonResponseInfo.isSuccess()) {
            checkEncryptCardResponse.setEncryptCardSupported(true);
            return true;
        }
        checkEncryptCardResponse.setErrorInfo(commonResponseInfo.getErrorDesc());
        baseResponse.setDatas(checkEncryptCardResponse);
        return false;
    }

    private boolean isMifareCardExisted(BaseResponse baseResponse, CheckEncryptCardResponse checkEncryptCardResponse) throws AuthApiException {
        LogUtils.d(TAG, "CheckMifareIssuedResponse");
        CheckMifareIssuedResponse checkMifareIssuedResponseCheckMifareIssued = new TSMAuthManager().checkMifareIssued(this.mContext, this.mMifareTag);
        if (checkMifareIssuedResponseCheckMifareIssued.isExist()) {
            checkEncryptCardResponse.setExist(checkMifareIssuedResponseCheckMifareIssued.isExist());
            baseResponse.setDatas(checkEncryptCardResponse);
            return true;
        }
        if (!checkMifareIssuedResponseCheckMifareIssued.isExistCloudCard() || this.mMifareTag.getEncryptionSectorCount() != checkMifareIssuedResponseCheckMifareIssued.getDecryptSectorCount()) {
            return false;
        }
        checkEncryptCardResponse.setCloudCardCid(checkMifareIssuedResponseCheckMifareIssued.getCloudCardCid());
        checkEncryptCardResponse.setExistCloudCard(checkMifareIssuedResponseCheckMifareIssued.isExistCloudCard());
        baseResponse.setDatas(checkEncryptCardResponse);
        return true;
    }

    private void probeSectorData(int i, List<SectorData.SectorGroupData> list, IRawProbe iRawProbe) throws IOException {
        for (int i2 = 0; i2 < this.mCollectionDataConfig.getSectorGroup(); i2++) {
            SectorData.SectorGroupData sectorGroupData = new SectorData.SectorGroupData();
            sectorGroupData.setGroupId(i2);
            sectorGroupData.setSectorPieceData(SectorData.SectorPieceData.fromJson(iRawProbe.probe(this.mMifareClassicTag, i, this.mCollectionDataConfig.getDistancesNumber(), this.mCollectionDataConfig.getSectorGroupSamples())));
            list.add(sectorGroupData);
        }
    }

    private void updateMifareTag() {
        LogUtils.d(TAG, "updateMifareTag");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.mMifareClassicTag.getSectorList().size(); i++) {
            Sector sector = this.mMifareClassicTag.getSectorList().get(i);
            if (TextUtils.isEmpty(sector.getKeyA())) {
                arrayList.add(Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(sector.getKeyB())) {
                arrayList2.add(Integer.valueOf(i));
            }
            if (sector.isEncrypted()) {
                arrayList3.add(Integer.valueOf(i));
            }
            sb.append(sector.getContent());
            if (sector.getCountOfVerifiedKey() != -1) {
                ArrayList arrayList5 = new ArrayList();
                if (sector.getContent() != null && sector.getContent().length() == 128) {
                    int i2 = 0;
                    while (i2 < 4) {
                        int i3 = i2 + 1;
                        String strSubstring = sector.getContent().substring(i2 * 32, i3 * 32);
                        if (i2 == 3 && !TextUtils.isEmpty(sector.getKeyA())) {
                            strSubstring = new StringBuilder(strSubstring).replace(0, 12, sector.getKeyA()).toString();
                        }
                        arrayList5.add(new Block(i2, strSubstring));
                        i2 = i3;
                    }
                }
                com.miui.tsmclient.entity.Sector sector2 = new com.miui.tsmclient.entity.Sector(sector.getIndex(), arrayList5);
                sector2.setCountOfVerifiedKey(sector.getCountOfVerifiedKey());
                arrayList4.add(sector2);
            }
        }
        MifareTag mifareTag = new MifareTag(arrayList3, arrayList2, arrayList);
        this.mMifareTag = mifareTag;
        mifareTag.setUid(this.mMifareClassicTag.getUid());
        if (!TextUtils.isEmpty(this.mMifareClassicTag.getAtqa())) {
            this.mMifareTag.setAtqa(this.mMifareClassicTag.getAtqa());
        }
        if (!TextUtils.isEmpty(this.mMifareClassicTag.getSak())) {
            this.mMifareTag.setSak(this.mMifareClassicTag.getSak());
        }
        if (!arrayList3.isEmpty() || !this.mMifareClassicTag.getSectorList().isEmpty()) {
            this.mMifareTag.setMifareType(1);
        }
        if (!arrayList4.isEmpty()) {
            sb.replace(0, sb.toString().length(), new Gson().toJson(arrayList4));
        }
        this.mMifareTag.setBlockContent(sb.toString());
        this.mMifareTag.setSize(this.mMifareClassicTag.getSize());
        this.mMifareTag.setConsumedTime(this.mMifareClassicTag.getConsumedTime());
        this.mSeCard.addExtras(this.mMifareTag.toBundle());
    }

    public BaseResponse getAuthenticateKeys() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            MifareCardInfo mifareCardInfo = (MifareCardInfo) this.mSeCard.mCardInfo;
            PullSectorKeyRequest pullSectorKeyRequest = new PullSectorKeyRequest(mifareCardInfo.getCid(), mifareCardInfo, null);
            PullSectorKeyResponse pullSectorKeyResponse = (PullSectorKeyResponse) HttpClient.getInstance(this.mContext).execute(pullSectorKeyRequest).getResult();
            if (pullSectorKeyRequest.isSuccess()) {
                baseResponse.setDatas(pullSectorKeyResponse);
            } else {
                baseResponse.mMsg = getErrorMsg(pullSectorKeyResponse, "");
                baseResponse.mResultCode = getErrorCode(pullSectorKeyResponse, -1);
            }
        } catch (IOException e) {
            baseResponse.mMsg = e.getLocalizedMessage();
            baseResponse.mResultCode = 12;
            LogUtils.e(TAG, " getAuthenticateKeys:" + e);
        }
        return baseResponse;
    }

    public BaseResponse getCardStatus() {
        int i;
        ensureNotOnMainThread();
        if (this.mMifareClassicTag == null || this.mMifareTag == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        CheckEncryptCardResponse checkEncryptCardResponse = new CheckEncryptCardResponse();
        try {
            if (isMifareCardExisted(baseResponse, checkEncryptCardResponse) || !isEncryptedCardSupported(baseResponse, checkEncryptCardResponse) || !isCollectionDataConfigAvailable(baseResponse, checkEncryptCardResponse) || !isCalTaskServiceAvailable(baseResponse, checkEncryptCardResponse)) {
                return baseResponse;
            }
            baseResponse.setDatas(checkEncryptCardResponse);
        } catch (AuthApiException e) {
            LogUtils.e(TAG, " getMifareCardStatus with AuthApiException ", e);
            baseResponse.mMsg = e.getLocalizedMessage();
            i = e.mErrorCode;
            baseResponse.mResultCode = i;
        } catch (IOException e2) {
            LogUtils.e(TAG, " getMifareCardStatus with IOException ", e2);
            baseResponse.mMsg = e2.getLocalizedMessage();
            i = 12;
            baseResponse.mResultCode = i;
        }
        return baseResponse;
    }

    public BaseResponse openRawMode(boolean z) {
        ensureNotOnMainThread();
        Bundle bundle = new Bundle();
        bundle.putBoolean(z ? "open" : Constants.EXTRA_CLOSE_TAI, true);
        return g.a(CardInfo.CARD_TYPE_MIFARE).a(this.mContext, (IScTerminal) null, bundle);
    }

    public BaseResponse probeData(IRawProbe iRawProbe) {
        ensureNotOnMainThread();
        if (iRawProbe == null || this.mMifareClassicTag == null || this.mMifareTag == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            try {
                iRawProbe.beforeProbe();
                ArrayList arrayList = new ArrayList();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<Integer> it = this.mMifareTag.getUnknownKeyAEncryptedSectorsId().iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    LogUtils.t(TAG, "encryptSectorId:" + iIntValue + " maxSectorGroupNum: " + this.mCollectionDataConfig.getSectorGroup() + " maxSectorGroupBlockNum : " + this.mCollectionDataConfig.getSectorGroupSamples());
                    SectorData sectorData = new SectorData();
                    sectorData.setSectorId(iIntValue);
                    ArrayList arrayList2 = new ArrayList();
                    probeSectorData(iIntValue, arrayList2, iRawProbe);
                    sectorData.setSectorGroupData(arrayList2);
                    arrayList.add(sectorData);
                }
                this.mMifareTag.setConsumedTime(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis).intValue());
                this.mMifareTag.setSectorData(arrayList.isEmpty() ? "" : new Gson().toJson(arrayList));
                this.mSeCard.addExtras(this.mMifareTag.toBundle());
                LogUtils.t(TAG, "raw tag:" + this.mMifareTag.getUid() + ", consumedTime:" + this.mMifareTag.getConsumedTime() + ", sectorData:" + this.mMifareTag.getSectorData());
            } catch (IOException e) {
                LogUtils.e(TAG, " probeData with exception " + e);
                baseResponse.mResultCode = 12;
                baseResponse.mMsg = e.getLocalizedMessage();
            }
            return baseResponse;
        } finally {
            iRawProbe.afterProbe();
        }
    }

    public void setTag(MifareClassicTag mifareClassicTag) {
        this.mMifareClassicTag = mifareClassicTag;
        updateMifareTag();
    }

    public BaseResponse updateSectorData() {
        ensureNotOnMainThread();
        if (this.mSeCard.mCardInfo == null || this.mMifareClassicTag == null) {
            return new BaseResponse(1, new Object[0]);
        }
        Bundle bundle = this.mMifareTag.toBundle();
        bundle.putBoolean(Constants.EXTRA_OPERATION_UPDATE_ENCRYPTED_SECTOR, true);
        this.mSeCard.addExtras(bundle);
        j jVarA = g.a(this.mSeCard.mCardInfo.mCardType);
        Context context = this.mContext;
        SeCard seCard = this.mSeCard;
        return jVarA.k(context, seCard.mCardInfo, seCard.getExtras());
    }
}
