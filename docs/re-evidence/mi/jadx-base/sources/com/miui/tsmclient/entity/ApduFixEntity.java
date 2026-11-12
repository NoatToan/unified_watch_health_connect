package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.miui.tsmclient.model.mitsm.j;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.tsmclient.smartcard.Coder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApduFixEntity {
    private boolean mActionResult;
    private TsmRpcModels.SeOperationType mActionType;
    private String mAid;
    private String mBundleSessionId;
    private String mCacheSessionId;
    private transient WeakReference<Context> mContext;
    private String mNextStep;
    private j mPullDataOperationType;
    private String mScriptsId;
    private String mSeAPDUResponse;

    public ApduFixEntity(Context context) {
        setContext(context);
    }

    public static ApduFixEntity getFromApduResponse(Context context, String str, boolean z, TsmRpcModels.SeOperationType seOperationType, List<TsmRpcModels.SeAPDUResponseItem> list, String str2, String str3) {
        if (TextUtils.isEmpty(str) || seOperationType == null) {
            return null;
        }
        ApduFixEntity apduFixEntity = new ApduFixEntity(context);
        apduFixEntity.mCacheSessionId = str;
        apduFixEntity.mActionResult = z;
        apduFixEntity.mActionType = seOperationType;
        apduFixEntity.mScriptsId = str2;
        apduFixEntity.mSeAPDUResponse = Coder.encodeBase64Coder(TsmRpcModels.SeAPDUResponse.newBuilder().setSessionId(str).addAllResponse(list).build().toByteArray());
        apduFixEntity.mAid = str3;
        return apduFixEntity;
    }

    public static ApduFixEntity getFromBundle(Context context, Bundle bundle) {
        ApduFixEntity apduFixEntity = new ApduFixEntity(context);
        apduFixEntity.mNextStep = bundle.getString("nextStep");
        apduFixEntity.mBundleSessionId = bundle.getString("sessionId");
        String string = bundle.getString("actionType");
        apduFixEntity.mPullDataOperationType = j.a(string);
        apduFixEntity.mScriptsId = bundle.getString(Constants.EXTRA_PUSH_SCRIPTS_ID);
        try {
            apduFixEntity.mActionType = TextUtils.isEmpty(string) ? null : TsmRpcModels.SeOperationType.valueOf(string);
        } catch (Exception e) {
            LogUtils.e("get actionType error", e);
        }
        return apduFixEntity;
    }

    public static ApduFixEntity getFromCache(Context context) {
        String string = PrefUtils.getString(context, PrefUtils.PREF_KEY_APDU_RESPONSE, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            ApduFixEntity apduFixEntity = (ApduFixEntity) new Gson().fromJson(string, ApduFixEntity.class);
            apduFixEntity.setContext(context);
            return apduFixEntity;
        } catch (Exception e) {
            LogUtils.e("Gson parse error:" + e);
            return null;
        }
    }

    private void setContext(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    public void deleteFromCache() {
        Context context = this.mContext.get();
        if (context != null) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_APDU_RESPONSE);
        }
    }

    public boolean equalsSessionId(ApduFixEntity apduFixEntity) {
        if (TextUtils.isEmpty(apduFixEntity.getSessionId())) {
            return false;
        }
        return TextUtils.equals(this.mCacheSessionId, apduFixEntity.getSessionId());
    }

    public TsmRpcModels.SeOperationType getActionType() {
        return this.mActionType;
    }

    public String getAid() {
        return this.mAid;
    }

    public TsmRpcModels.TsmSessionInfo getBundleSessionInfo() {
        return TsmRpcModels.TsmSessionInfo.newBuilder().setResult(0).setSessionId(TextUtils.isEmpty(this.mBundleSessionId) ? "" : this.mBundleSessionId).build();
    }

    public TsmRpcModels.TsmSessionInfo getCacheSessionInfo() {
        return TsmRpcModels.TsmSessionInfo.newBuilder().setResult(0).setSessionId(TextUtils.isEmpty(this.mCacheSessionId) ? "" : this.mCacheSessionId).build();
    }

    public j getPullDataOperationType() {
        return this.mPullDataOperationType;
    }

    public String getScriptsId() {
        return this.mScriptsId;
    }

    public List<TsmRpcModels.SeAPDUResponseItem> getSeAPDUResponseItems() {
        TsmRpcModels.SeAPDUResponse from;
        try {
            byte[] bArrDecodeBase64ToByteArray = Coder.decodeBase64ToByteArray(this.mSeAPDUResponse);
            if (bArrDecodeBase64ToByteArray != null && (from = TsmRpcModels.SeAPDUResponse.parseFrom(bArrDecodeBase64ToByteArray)) != null) {
                return from.getResponseList();
            }
            return new ArrayList();
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("getSeAPDUResponseItems error:" + e);
            return new ArrayList();
        }
    }

    public String getSessionId() {
        return this.mBundleSessionId;
    }

    public boolean isActionResult() {
        return this.mActionResult;
    }

    public boolean isPull() {
        return TextUtils.equals(Constants.NEXT_STEP_TYPE_PULL, this.mNextStep);
    }

    public void saveToCache() {
        Context context = this.mContext.get();
        if (context != null) {
            PrefUtils.putString(context, PrefUtils.PREF_KEY_APDU_RESPONSE, toString());
        }
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
