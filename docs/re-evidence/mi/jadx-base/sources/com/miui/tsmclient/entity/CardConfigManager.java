package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.net.request.ConfigListRequest;
import com.miui.tsmclient.net.request.ConfigRulesRequest;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.tsmclient.smartcard.handler.ISmartCardHandler;
import com.tsmclient.smartcard.model.ConfigRules;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class CardConfigManager {
    public static final boolean STAGING = EnvironmentConfig.isStaging();
    private static volatile CardConfigManager sInstance;
    private Context mContext;
    private int mFetchConfigCount;
    private ReentrantLock mLock = new ReentrantLock();
    private Map<String, CardConfig> mSupportedTransCardMap = loadCacheCardConfig(null);

    public static class CardConfig {

        @SerializedName("cardAid")
        private String mCardAid;

        @SerializedName("cardAppPackageName")
        private String mCardAppPackageName;

        @SerializedName("cardAppUri")
        private String mCardAppUri;

        @SerializedName("cardDescription")
        private String mCardDescription;

        @SerializedName("cardIconUrl")
        private String mCardIconUrl;

        @SerializedName("cardName")
        private String mCardName;

        @SerializedName("cardRulesUrl")
        private String mCardRulesUrl;

        @SerializedName("cardStatusDescription")
        private String mCardStatusDescription;

        @SerializedName("cardType")
        private String mCardType;

        @SerializedName("hciRule")
        private HCIRule mHCIRule;

        @SerializedName("hciTLVRule")
        private HciTLVRule mHciTLVRule;

        @SerializedName("judgeOverdrawIllegal")
        private boolean mJudgeOverdrawIllegal;

        @SerializedName("memberAids")
        private List<String> mMemberAidList;

        @SerializedName("memberHciList")
        private List<MemberHci> mMemberHciList;

        @SerializedName("needExtraInfo")
        private boolean mNeedExtraInfo;

        @SerializedName("operationType")
        private OperationType mOperationType = OperationType.SYNC;

        @SerializedName("supportCityUHci")
        private boolean mSupportCityUHci;

        @SerializedName("supportRechargeOnInvalidDate")
        private boolean mSupportRechargeOnInvalidDate;

        @SerializedName("tips")
        private String mTips;

        public enum OperationType {
            SYNC(0),
            ASYNC(1);

            private int mValue;

            OperationType(int i) {
                this.mValue = i;
            }

            public static OperationType getOperationType(int i) {
                for (OperationType operationType : values()) {
                    if (operationType.mValue == i) {
                        return operationType;
                    }
                }
                return SYNC;
            }
        }

        public static class OperationTypeDeserializer implements JsonDeserializer<OperationType> {
            private OperationTypeDeserializer() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public OperationType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return OperationType.getOperationType(jsonElement.getAsInt());
            }
        }

        private MemberHci getMemberHci(String str) {
            List<MemberHci> list = this.mMemberHciList;
            if (list == null) {
                return null;
            }
            for (MemberHci memberHci : list) {
                if (TextUtils.equals(memberHci.mAid, str)) {
                    return memberHci;
                }
            }
            return null;
        }

        public String getCardAid() {
            return this.mCardAid;
        }

        public String getCardAppPackageName() {
            return this.mCardAppPackageName;
        }

        public String getCardAppUri() {
            return this.mCardAppUri;
        }

        public String getCardDescription() {
            return this.mCardDescription;
        }

        public String getCardIconUrl() {
            return this.mCardIconUrl;
        }

        public String getCardName() {
            return this.mCardName;
        }

        public String getCardRulesUrl() {
            return this.mCardRulesUrl;
        }

        public String getCardStatusDescription() {
            return this.mCardStatusDescription;
        }

        public String getCardType() {
            return this.mCardType;
        }

        public HCIRule getHCIRule(String str) {
            if (TextUtils.equals(this.mCardAid, str)) {
                return this.mHCIRule;
            }
            MemberHci memberHci = getMemberHci(str);
            if (memberHci == null) {
                return null;
            }
            return memberHci.mHCIRule;
        }

        public HciTLVRule getHciTLVRule(String str) {
            if (TextUtils.equals(this.mCardAid, str)) {
                return this.mHciTLVRule;
            }
            MemberHci memberHci = getMemberHci(str);
            if (memberHci == null) {
                return null;
            }
            return memberHci.mHciTLVRule;
        }

        public List<String> getMemberAidList() {
            return this.mMemberAidList;
        }

        public OperationType getOperationType() {
            return this.mOperationType;
        }

        public String getTips() {
            return this.mTips;
        }

        public boolean isJudgeOverdrawIllegal() {
            return this.mJudgeOverdrawIllegal;
        }

        public boolean isMemberAid(String str) {
            List<String> list = this.mMemberAidList;
            return list != null && list.contains(str);
        }

        public boolean isNeedExtraInfo() {
            return this.mNeedExtraInfo;
        }

        public boolean isSupportCityUHci(String str) {
            if (TextUtils.equals(this.mCardAid, str)) {
                return this.mSupportCityUHci;
            }
            MemberHci memberHci = getMemberHci(str);
            return memberHci != null && memberHci.mSupportCityUHci;
        }

        public boolean isSupportRechargeOnInvalidDate() {
            return this.mSupportRechargeOnInvalidDate;
        }
    }

    public static class HCIRule {

        @SerializedName("balancetOffset")
        private int mBalanceOffset;

        @SerializedName("cnDesc")
        private String mCnDesc;

        @SerializedName("dataLength")
        private int mDataLength;

        @SerializedName("dateFormat")
        private String mDateFormat;

        @SerializedName("defaultDesc")
        private String mDefaultDesc;

        @SerializedName("terminalNo")
        private int mTerminalNo;

        @SerializedName("timeFormat")
        private String mTimeFormat;

        @SerializedName("tradeAmountOffset")
        private int mTradeAmountOffset;

        @SerializedName("dateOffset")
        private int mDateOffset = -1;

        @SerializedName("timeOffset")
        private int mTimeOffset = -1;

        public int getBalanceOffset() {
            return this.mBalanceOffset;
        }

        public int getDataLength() {
            return this.mDataLength;
        }

        public String getDateFormat() {
            return this.mDateFormat;
        }

        public int getDateOffset() {
            return this.mDateOffset;
        }

        public String getDesc() {
            return ("zh".equalsIgnoreCase(Locale.getDefault().getLanguage()) || "cn".equalsIgnoreCase(Locale.getDefault().getCountry())) ? this.mCnDesc : this.mDefaultDesc;
        }

        public int getTerminalNo() {
            return this.mTerminalNo;
        }

        public String getTimeFormat() {
            return this.mTimeFormat;
        }

        public int getTimeOffset() {
            return this.mTimeOffset;
        }

        public int getTradeAmountOffset() {
            return this.mTradeAmountOffset;
        }
    }

    public static class HciTLVRule {

        @SerializedName("balanceTags")
        private String[] mBalanceTags;

        @SerializedName("cnDesc")
        private String mCnDesc;

        @SerializedName("dateFormat")
        private String mDateFormat;

        @SerializedName("dateTags")
        private String[] mDateTags;

        @SerializedName("defaultDesc")
        private String mDefaultDesc;

        @SerializedName("hciPrefix")
        private String mHciPrefix;

        @SerializedName("tlvDataOffset")
        private int mTLVDataOffset;

        @SerializedName("terminalNoTags")
        private String[] mTerminalNoTags;

        @SerializedName("timeFormat")
        private String mTimeFormat;

        @SerializedName("timeTags")
        private String[] mTimeTags;

        @SerializedName("tradeAmountTags")
        private String[] mTradeAmountTags;

        @SerializedName("transactionTypeFormat")
        private String mTransactionTypeFormat;

        @SerializedName("transactionTypeTags")
        private String[] mTransactionTypeTags;

        @SerializedName("tradeAmountOffset")
        private int mTradeAmountOffset = -1;

        @SerializedName("balanceOffset")
        private int mBalanceOffset = -1;

        @SerializedName("terminalNoOffset")
        private int mTerminalNoOffset = -1;

        @SerializedName("dateOffset")
        private int mDateOffset = -1;

        @SerializedName("timeOffset")
        private int mTimeOffset = -1;

        public int getBalanceOffset() {
            return this.mBalanceOffset;
        }

        public String[] getBalanceTags() {
            return this.mBalanceTags;
        }

        public String getDateFormat() {
            return this.mDateFormat;
        }

        public int getDateOffset() {
            return this.mDateOffset;
        }

        public String[] getDateTags() {
            return this.mDateTags;
        }

        public String getDesc() {
            return ("zh".equalsIgnoreCase(Locale.getDefault().getLanguage()) || "cn".equalsIgnoreCase(Locale.getDefault().getCountry())) ? this.mCnDesc : this.mDefaultDesc;
        }

        public String getHciPrefix() {
            return this.mHciPrefix;
        }

        public int getTLVDataOffset() {
            return this.mTLVDataOffset;
        }

        public int getTerminalNoOffset() {
            return this.mTerminalNoOffset;
        }

        public String[] getTerminalNoTags() {
            return this.mTerminalNoTags;
        }

        public String getTimeFormat() {
            return this.mTimeFormat;
        }

        public int getTimeOffset() {
            return this.mTimeOffset;
        }

        public String[] getTimeTags() {
            return this.mTimeTags;
        }

        public int getTradeAmountOffset() {
            return this.mTradeAmountOffset;
        }

        public String[] getTradeAmountTags() {
            return this.mTradeAmountTags;
        }

        public String getTransactionTypeFormat() {
            return this.mTransactionTypeFormat;
        }

        public String[] getTransactionTypeTags() {
            return this.mTransactionTypeTags;
        }
    }

    public static class MemberHci {

        @SerializedName("aid")
        private String mAid;

        @SerializedName("hciRule")
        private HCIRule mHCIRule;

        @SerializedName("hciTLVRule")
        private HciTLVRule mHciTLVRule;

        @SerializedName("supportCityUHci")
        private boolean mSupportCityUHci;

        private MemberHci() {
        }
    }

    private CardConfigManager(Context context) {
        this.mContext = context;
    }

    private Map<String, CardConfig> fetchCardConfig() {
        boolean zIsMainThread = isMainThread();
        StringBuilder sb = new StringBuilder();
        sb.append("fetchCardConfig count:");
        int i = this.mFetchConfigCount + 1;
        this.mFetchConfigCount = i;
        sb.append(i);
        sb.append(zIsMainThread ? " on main thread" : "");
        LogUtils.i(sb.toString());
        GroupConfigInfo groupConfigInfo = null;
        if (!zIsMainThread) {
            ConfigListRequest configListRequest = new ConfigListRequest(null, GroupConfigInfo.CARD_CONFIG_LIST, null);
            try {
                GroupConfigInfo groupConfigInfo2 = (GroupConfigInfo) HttpClient.getInstance(this.mContext).execute(configListRequest).getResult();
                try {
                    if (configListRequest.isSuccess()) {
                        PrefUtils.putString(this.mContext, PrefUtils.PREF_KEY_CARD_CONFIG, new Gson().toJson(groupConfigInfo2));
                    }
                    groupConfigInfo = groupConfigInfo2;
                } catch (IOException e) {
                    e = e;
                    groupConfigInfo = groupConfigInfo2;
                    LogUtils.e("ConfigListSyncRequest Exception occurred", e);
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        return loadCacheCardConfig(groupConfigInfo);
    }

    public static CardConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (CardConfigManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CardConfigManager(EnvironmentConfig.getContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @RequiresApi(api = 24)
    private ConfigRules getLocalConfigRules(String str) {
        File[] fileArrListFiles;
        FileReader fileReader;
        File file = new File(this.mContext.getDataDir(), str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.miui.tsmclient.entity.CardConfigManager.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.endsWith("json");
            }
        })) != null && fileArrListFiles.length > 0) {
            Gson gson = new Gson();
            try {
                fileReader = new FileReader(fileArrListFiles[0]);
                try {
                    return (ConfigRules) gson.fromJson((Reader) fileReader, ConfigRules.class);
                } catch (Exception e) {
                    e = e;
                    LogUtils.e("getLocalConfigRules failed", e);
                    IOUtils.closeQuietly((Reader) fileReader);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                fileReader = null;
            }
        }
        return null;
    }

    private boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<String, CardConfig> loadCacheCardConfig(GroupConfigInfo groupConfigInfo) {
        HashMap map = null;
        Object[] objArr = 0;
        if (groupConfigInfo == null) {
            String string = PrefUtils.getString(this.mContext, PrefUtils.PREF_KEY_CARD_CONFIG, null);
            if (!TextUtils.isEmpty(string)) {
                groupConfigInfo = (GroupConfigInfo) new Gson().fromJson(string, GroupConfigInfo.class);
            }
        }
        if (groupConfigInfo != null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(CardConfig.OperationType.class, new CardConfig.OperationTypeDeserializer());
            List<CardConfig> infoList = groupConfigInfo.getInfoList(GroupConfigInfo.CARD_CONFIG_LIST, CardConfig.class, gsonBuilder.create());
            map = new HashMap();
            for (CardConfig cardConfig : infoList) {
                map.put(cardConfig.mCardAid, cardConfig);
            }
        }
        return map;
    }

    public CardConfig getCardConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, CardConfig> supportedTransCardMap = getSupportedTransCardMap();
        CardConfig cardConfig = supportedTransCardMap.get(str);
        if (cardConfig != null) {
            return cardConfig;
        }
        Iterator<Map.Entry<String, CardConfig>> it = supportedTransCardMap.entrySet().iterator();
        while (it.hasNext()) {
            CardConfig value = it.next().getValue();
            if (value.isMemberAid(str)) {
                return value;
            }
        }
        return cardConfig;
    }

    public CardConfig getCardConfigByType(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (Map.Entry<String, CardConfig> entry : getSupportedTransCardMap().entrySet()) {
                if (str.equals(entry.getValue().mCardType)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public String getCardType(String str) {
        CardConfig cardConfig = getCardConfig(str);
        if (cardConfig == null) {
            return null;
        }
        return cardConfig.getCardType();
    }

    public CardConfig.OperationType getOperationType(String str) {
        CardConfig cardConfigByType = getCardConfigByType(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getOperationType cardType:");
        sb.append(str);
        sb.append(", operationType:");
        sb.append(cardConfigByType == null ? null : cardConfigByType.mOperationType);
        LogUtils.i(sb.toString());
        if (cardConfigByType == null) {
            return null;
        }
        return cardConfigByType.mOperationType;
    }

    public List<String> getSupportedTransCardAids() {
        ArrayList arrayList = new ArrayList(getSupportedTransCardMap().keySet());
        LogUtils.d("getSupportedTransCardAids:" + Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    public Map<String, CardConfig> getSupportedTransCardMap() {
        return getSupportedTransCardMap(false);
    }

    public List<String> getSupportedTransCardTypes() {
        Map<String, CardConfig> supportedTransCardMap = getSupportedTransCardMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, CardConfig>> it = supportedTransCardMap.entrySet().iterator();
        while (it.hasNext()) {
            String str = it.next().getValue().mCardType;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        LogUtils.d("getSupportedTransCardTypes:" + Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    public void parseCardRulesToBundle(String str, Bundle bundle) {
        ConfigRules localConfigRules;
        if (bundle == null) {
            throw new IllegalArgumentException("readCardOption can't be null");
        }
        if (STAGING && (localConfigRules = getLocalConfigRules(str)) != null) {
            bundle.putParcelable(ISmartCardHandler.KEY_READ_CARD_OPTION_RULES, localConfigRules);
            LogUtils.w("cardType:" + str + " using local configRules version:" + localConfigRules.mVersion);
            return;
        }
        CardConfig cardConfigByType = getCardConfigByType(str);
        if (cardConfigByType == null || TextUtils.isEmpty(cardConfigByType.mCardRulesUrl)) {
            return;
        }
        try {
            ConfigRules configRules = (ConfigRules) HttpClient.getInstance(this.mContext).execute(new ConfigRulesRequest(cardConfigByType.mCardRulesUrl)).getResult();
            if (configRules != null) {
                bundle.putParcelable(ISmartCardHandler.KEY_READ_CARD_OPTION_RULES, configRules);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("cardType:");
            sb.append(str);
            sb.append(", configRules version:");
            sb.append(configRules == null ? "Unknown" : configRules.mVersion);
            LogUtils.i(sb.toString());
        } catch (IOException e) {
            LogUtils.e("parseCardRulesToBundle:" + str + " Exception occurred.", e);
        }
    }

    public Map<String, CardConfig> getSupportedTransCardMap(boolean z) {
        boolean zIsMainThread = isMainThread();
        if (!zIsMainThread) {
            this.mLock.lock();
        }
        try {
            Map<String, CardConfig> mapFetchCardConfig = this.mSupportedTransCardMap;
            if (z || ObjectUtils.isCollectionEmpty(mapFetchCardConfig)) {
                mapFetchCardConfig = fetchCardConfig();
            }
            if (mapFetchCardConfig == null) {
                return Collections.emptyMap();
            }
            if (!zIsMainThread) {
                this.mSupportedTransCardMap = mapFetchCardConfig;
            }
            return mapFetchCardConfig;
        } finally {
            if (!zIsMainThread) {
                this.mLock.unlock();
            }
        }
    }
}
