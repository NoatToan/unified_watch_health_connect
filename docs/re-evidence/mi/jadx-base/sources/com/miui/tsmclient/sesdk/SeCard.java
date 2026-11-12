package com.miui.tsmclient.sesdk;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.VersionControlInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.model.j;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.model.TradeLog;
import defpackage.fns;
import defpackage.ljs;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SeCard {
    private String mAid;
    protected String mCardFace;
    protected CardInfo mCardInfo;
    protected String mCardName;
    protected j mCardOperation;
    private String mCardType;
    protected String mChannel;
    protected String mCityId;
    protected Bundle mExtras;
    protected boolean mIsIssued;
    private IOnlineProperties mOnlineProperties;
    protected String mProductId;
    protected SeData mSeData;
    protected ServiceProtocolData mServiceProtocolData;
    protected TSMAuthManager mTSMAuthManager;

    public interface IOnlineProperties {
        String getDescription();

        String getDescriptions();

        String getLabel();

        String getServiceStatus();

        String getTips();

        boolean isServiceAvailable();
    }

    public static class OnlineProperties implements IOnlineProperties {
        private IOnlineProperties mOnlinePropertiesImpl;

        private OnlineProperties(IOnlineProperties iOnlineProperties) {
            this.mOnlinePropertiesImpl = iOnlineProperties;
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public String getDescription() {
            return this.mOnlinePropertiesImpl.getDescription();
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public String getDescriptions() {
            return this.mOnlinePropertiesImpl.getDescriptions();
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public String getLabel() {
            return this.mOnlinePropertiesImpl.getLabel();
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public String getServiceStatus() {
            return this.mOnlinePropertiesImpl.getServiceStatus();
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public String getTips() {
            return this.mOnlinePropertiesImpl.getTips();
        }

        @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
        public boolean isServiceAvailable() {
            return this.mOnlinePropertiesImpl.isServiceAvailable();
        }
    }

    public static class SeData {
        public final int balance;
        public final String cardNumber;
        private final boolean isIssued;
        public final String logicalCardNumber;
        private final CardInfo.Status mStatus;
        private int mVcStatus;
        public final List<TradeLog> tradeLogs;
        public final String validEndDate;
        public final String validStartDate;

        public SeData(CardInfo cardInfo) {
            this(cardInfo, -1);
        }

        public int getBalance() {
            return this.balance;
        }

        public String getCardNumber() {
            return this.cardNumber;
        }

        public String getLogicalCardNumber() {
            return this.logicalCardNumber;
        }

        public SeCardStatus getStatus() {
            if (!this.isIssued) {
                throw new IllegalStateException("not exist");
            }
            int i = this.mVcStatus;
            if (i != -1) {
                return i > SeCardStatus.values().length - 1 ? SeCardStatus.NEGATIVE : SeCardStatus.values()[this.mVcStatus];
            }
            CardInfo.Status status = this.mStatus;
            if (status == CardInfo.Status.LOCKED) {
                return SeCardStatus.LOCKED;
            }
            if (status == CardInfo.Status.IN_BLACKLIST) {
                return SeCardStatus.IN_BLACKLIST;
            }
            if (status == CardInfo.Status.DATA_ILLEGAL) {
                return SeCardStatus.DATA_ILLEGAL;
            }
            if (status != CardInfo.Status.INVALID && status != CardInfo.Status.NEGATIVE) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
                Date date = new Date();
                if (!TextUtils.isEmpty(this.validStartDate)) {
                    try {
                        if (date.before(simpleDateFormat.parse(this.validStartDate))) {
                            return SeCardStatus.START_DATE_INVALID;
                        }
                    } catch (ParseException e) {
                        LogUtils.e("parse start date failed.", e);
                    }
                }
                if (!TextUtils.isEmpty(this.validEndDate)) {
                    try {
                        Date date2 = simpleDateFormat.parse(this.validEndDate);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date2);
                        calendar.add(5, 1);
                        if (date.after(calendar.getTime())) {
                            return SeCardStatus.END_DATE_INVALID;
                        }
                    } catch (ParseException e2) {
                        LogUtils.e("parse end date failed.", e2);
                    }
                }
                return SeCardStatus.ACTIVE;
            }
            return SeCardStatus.INVALID;
        }

        public List<TradeLog> getTradeLogs() {
            return this.tradeLogs;
        }

        public String getValidEndDate() {
            return this.validEndDate;
        }

        public String getValidStartDate() {
            return this.validStartDate;
        }

        public SeData(CardInfo cardInfo, int i) {
            this.isIssued = cardInfo != null && cardInfo.mHasIssue;
            this.cardNumber = cardInfo != null ? cardInfo.mCardNo : null;
            this.logicalCardNumber = cardInfo != null ? cardInfo.mRealCardNo : null;
            this.validStartDate = cardInfo != null ? cardInfo.mStartDate : null;
            this.validEndDate = cardInfo != null ? cardInfo.mEndDate : null;
            this.balance = cardInfo != null ? cardInfo.mCardBalance : 0;
            this.tradeLogs = cardInfo != null ? cardInfo.mTradeLogs : null;
            this.mStatus = cardInfo != null ? cardInfo.mStatus : null;
            this.mVcStatus = i;
        }
    }

    public SeCard(CardInfo cardInfo) {
        this(cardInfo, false);
    }

    public BaseResponse activate(String str) {
        throw new NotSupportedException();
    }

    public void addExtras(Bundle bundle) {
        this.mExtras.putAll(bundle);
    }

    public BaseResponse backup() {
        throw new NotSupportedException();
    }

    public Bundle buildExtras(String str) {
        JSONObject jSONObject;
        Bundle bundle = new Bundle();
        bundle.putAll(this.mExtras);
        if (!TextUtils.isEmpty(this.mProductId)) {
            bundle.putString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID, this.mProductId);
        }
        if (TextUtils.isEmpty(str)) {
            return bundle;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            LogUtils.v("param is a token");
            jSONObject = null;
        }
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else {
                        bundle.putString(next, obj.toString());
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            bundle.putString("authentication_code", str);
        }
        return bundle;
    }

    public void cloneCard(CardInfo cardInfo) {
        this.mAid = cardInfo.mAid;
        String str = cardInfo.mCardType;
        this.mCardType = str;
        if (TextUtils.isEmpty(str)) {
            throw new InvalidParameterException("card type can't be empty");
        }
        this.mCardName = cardInfo.mCardName;
        cloneExtraCardInfo();
    }

    public abstract void cloneExtraCardInfo();

    public abstract IOnlineProperties createOnlineProperties();

    public boolean deactivate() {
        return ljs.j(EnvironmentConfig.getContext(), this.mCardInfo);
    }

    public BaseResponse delete(String str) {
        throw new NotSupportedException();
    }

    public void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    public String getAid() {
        return this.mAid;
    }

    public BaseResponse getAuthenticationMethods() {
        throw new NotSupportedException();
    }

    public String getCardFace() {
        return this.mCardFace;
    }

    public List<SeCard> getCardList() throws AuthApiException {
        throw new NotSupportedException();
    }

    public abstract CardCategory getCategory();

    public SeData getContent() {
        throw new NotSupportedException();
    }

    public String getDetail() {
        throw new NotSupportedException();
    }

    public int getExtraFlag() {
        return 0;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getId() {
        return !TextUtils.isEmpty(this.mProductId) ? this.mProductId : this.mCardType;
    }

    public String getName() {
        return this.mCardName;
    }

    public OnlineProperties getOnlineProperties() {
        if (this.mOnlineProperties == null) {
            this.mOnlineProperties = createOnlineProperties();
        }
        return new OnlineProperties(this.mOnlineProperties);
    }

    public OrderData getOrderData() {
        throw new NotSupportedException();
    }

    public ServiceProtocolData getServiceProtocolData() throws IOException {
        throw new NotSupportedException();
    }

    public BaseResponse getTransactions() {
        throw new NotSupportedException();
    }

    public boolean isGroup() {
        return false;
    }

    public boolean isIssued() {
        return this.mIsIssued;
    }

    public boolean isSupportReturnCard() {
        throw new NotSupportedException();
    }

    public boolean isSupportTransferOut() {
        throw new NotSupportedException();
    }

    public BaseResponse issue(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse prepare(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse queryPan(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse recharge(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse requestAuthCode(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse returnCard(String str) {
        throw new NotSupportedException();
    }

    public void setCardFace(String str) {
        this.mCardFace = str;
    }

    public void setCardName(String str) {
        throw new NotSupportedException();
    }

    public void setCityId(String str) {
        this.mCityId = str;
    }

    public String toString() {
        return "id:" + getId() + ", name:" + getName();
    }

    public BaseResponse transferIn(String str) {
        throw new NotSupportedException();
    }

    public BaseResponse transferOut() {
        throw new NotSupportedException();
    }

    public void updateCardInfo(CardInfo cardInfo) {
        this.mCardInfo = cardInfo;
    }

    public BaseResponse updateContent() {
        throw new NotSupportedException();
    }

    public SeCard(CardInfo cardInfo, boolean z) {
        this.mTSMAuthManager = new TSMAuthManager();
        this.mExtras = new Bundle();
        this.mIsIssued = z;
        this.mChannel = EnvironmentConfig.getContext().getPackageName();
        this.mCardInfo = cardInfo;
        cloneCard(cardInfo);
        this.mCardOperation = g.a(this.mCardType);
    }

    public BaseResponse activate(String str, String str2) {
        throw new NotSupportedException();
    }

    public ServiceProtocolData getServiceProtocolData(final String str) throws IOException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            fns.c().h(EnvironmentConfig.getContext(), str, TSMAuthContants.ActionType.ISSUE, new fns.h() { // from class: com.miui.tsmclient.sesdk.SeCard.1
                @Override // fns.h
                public void onFailure(Integer num) {
                    LogUtils.d("queryAllServiceProtocol onFailure, errorCode:" + num);
                    countDownLatch.countDown();
                }

                @Override // fns.h
                public void onSuccess(VersionControlInfo versionControlInfo) {
                    LogUtils.d("queryAllServiceProtocol onSuccess");
                    SeCard.this.mServiceProtocolData = new ServiceProtocolData(versionControlInfo, str);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            return this.mServiceProtocolData;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("getServiceProtocolData fails");
        }
    }

    public boolean activate() {
        return ljs.e(EnvironmentConfig.getContext(), this.mCardInfo);
    }
}
