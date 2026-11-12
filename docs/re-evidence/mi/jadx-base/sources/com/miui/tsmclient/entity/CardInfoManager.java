package com.miui.tsmclient.entity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.model.BaseModel;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.model.d;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.model.j;
import com.miui.tsmclient.model.k;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.miui.tsmclient.util.SettingKeys;
import defpackage.ies;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes6.dex */
public class CardInfoManager {
    private static final String KEY_ISSUE_STATUS = "issue_status";
    private static final Object mContent = new Object();
    private static volatile CardInfoManager sInstance;
    private d mCacheModel;
    private Context mContext;
    private BaseTransitCardModel mTransitCardModel;
    private final Object mWritingToDiskLock = new Object();
    private final WeakHashMap<OnCardChangedListener, Object> mListeners = new WeakHashMap<>();
    private int mDiskWritesInFlight = 0;
    private Executor mExecutor = Executors.newSingleThreadExecutor();
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mLoaded = false;
    private List<CardInfo> mList = null;
    private ies mBankCardOperation = new ies();

    public interface CacheLauncher {
        void startBuildingCache();
    }

    public final class Editor {
        private boolean mClear;
        private final Map<CardInfo, Object> mModified;

        private Editor() {
            this.mModified = new ModifiedMap();
            this.mClear = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void apply() {
            final MemoryCommitResult memoryCommitResultCommitToMemory = commitToMemory();
            CardInfoManager.this.enqueueDiskWrite(memoryCommitResultCommitToMemory, new Runnable() { // from class: com.miui.tsmclient.entity.CardInfoManager.Editor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        memoryCommitResultCommitToMemory.mWrittenToDiskLatch.await();
                    } catch (InterruptedException unused) {
                    }
                }
            });
            notifyListeners(memoryCommitResultCommitToMemory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean commit() {
            MemoryCommitResult memoryCommitResultCommitToMemory = commitToMemory();
            CardInfoManager.this.enqueueDiskWrite(memoryCommitResultCommitToMemory, null);
            try {
                memoryCommitResultCommitToMemory.mWrittenToDiskLatch.await();
                notifyListeners(memoryCommitResultCommitToMemory);
                return memoryCommitResultCommitToMemory.mWriteToDiskResult;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        private MemoryCommitResult commitToMemory() {
            MemoryCommitResult memoryCommitResult = new MemoryCommitResult();
            synchronized (CardInfoManager.this) {
                CardInfoManager.this.mList = new ArrayList(CardInfoManager.this.mList);
                CardInfoManager.access$1108(CardInfoManager.this);
                memoryCommitResult.mMapToWriteToDisk = new ModifiedMap();
                synchronized (this) {
                    try {
                        if (this.mClear) {
                            if (!CardInfoManager.this.mList.isEmpty()) {
                                memoryCommitResult.mChangesMade = true;
                                Iterator it = CardInfoManager.this.mList.iterator();
                                while (it.hasNext()) {
                                    memoryCommitResult.mMapToWriteToDisk.put((CardInfo) it.next(), null);
                                }
                                CardInfoManager.this.mList.clear();
                            }
                            this.mClear = false;
                        }
                        for (Map.Entry<CardInfo, Object> entry : this.mModified.entrySet()) {
                            CardInfo key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                String str = key.mCardType;
                                if (str == null || !str.startsWith(CardInfo.CARD_TYPE_DUMMY)) {
                                    memoryCommitResult.mMapToWriteToDisk.put(key, value);
                                    int iIndexOf = CardInfoManager.this.mList.indexOf(key);
                                    if (iIndexOf > -1) {
                                        CardInfoManager.this.mList.set(iIndexOf, key);
                                    } else {
                                        CardInfoManager.this.mList.add(key);
                                    }
                                    memoryCommitResult.mChangesMade = true;
                                } else if ((value instanceof String) && !CardInfoManager.this.mList.isEmpty()) {
                                    String str2 = (String) value;
                                    Iterator it2 = CardInfoManager.this.mList.iterator();
                                    while (it2.hasNext()) {
                                        CardInfo cardInfo = (CardInfo) it2.next();
                                        if (str2.equals(cardInfo.mCardType)) {
                                            memoryCommitResult.mMapToWriteToDisk.put(cardInfo, null);
                                            it2.remove();
                                        }
                                    }
                                    memoryCommitResult.mChangesMade = true;
                                }
                            } else if (CardInfoManager.this.mList.contains(key)) {
                                memoryCommitResult.mMapToWriteToDisk.put(key, null);
                                CardInfoManager.this.mList.remove(key);
                                memoryCommitResult.mChangesMade = true;
                            }
                        }
                        this.mModified.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return memoryCommitResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyListeners$0() {
            CardInfoManager.this.initSecureSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifyListeners(final MemoryCommitResult memoryCommitResult) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                CardInfoManager.this.mHandler.post(new Runnable() { // from class: com.miui.tsmclient.entity.CardInfoManager.Editor.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Editor.this.notifyListeners(memoryCommitResult);
                    }
                });
                return;
            }
            CardInfoManager.this.mExecutor.execute(new Runnable() { // from class: com.miui.tsmclient.entity.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10344a.lambda$notifyListeners$0();
                }
            });
            synchronized (CardInfoManager.this.mListeners) {
                try {
                    Set<OnCardChangedListener> setKeySet = CardInfoManager.this.mListeners.keySet();
                    if (!setKeySet.isEmpty() && !memoryCommitResult.mMapToWriteToDisk.isEmpty()) {
                        for (Map.Entry<CardInfo, Object> entry : memoryCommitResult.mMapToWriteToDisk.entrySet()) {
                            for (OnCardChangedListener onCardChangedListener : setKeySet) {
                                if (onCardChangedListener != null) {
                                    CardInfo key = entry.getKey();
                                    if (entry.getValue() == null) {
                                        onCardChangedListener.onCardUpdated(key);
                                    } else {
                                        onCardChangedListener.onCardRemoved(key);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Editor put(CardInfo cardInfo) {
            Map list;
            synchronized (this) {
                try {
                    if (CardGroupType.TRANSCARD.getId() == cardInfo.mCardGroupId) {
                        this.mModified.put(cardInfo, cardInfo);
                    } else {
                        synchronized (CardInfoManager.this) {
                            CardInfoManager cardInfoManager = CardInfoManager.this;
                            list = cardInfoManager.parseList(cardInfoManager.mList);
                        }
                        List<CardInfo> list2 = (List) list.get(CardGroupType.newInstance(cardInfo.mCardGroupId));
                        if (list2 != null) {
                            list2.remove(cardInfo);
                            list2.add(cardInfo);
                            for (CardInfo cardInfo2 : list2) {
                                this.mModified.put(cardInfo2, cardInfo2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Editor remove(CardInfo cardInfo) {
            synchronized (this) {
                this.mModified.put(cardInfo, null);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Editor put(List<? extends CardInfo> list) {
            if (ObjectUtils.isCollectionEmpty(list)) {
                return this;
            }
            synchronized (this) {
                try {
                    for (CardInfo cardInfo : list) {
                        this.mModified.put(cardInfo, cardInfo);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(new CardInfo(CardInfo.CARD_TYPE_DUMMY + str), str);
            }
            return this;
        }
    }

    public static class MemoryCommitResult {
        boolean mChangesMade;
        Map<CardInfo, Object> mMapToWriteToDisk;
        volatile boolean mWriteToDiskResult;
        final CountDownLatch mWrittenToDiskLatch;

        private MemoryCommitResult() {
            this.mWriteToDiskResult = false;
            this.mWrittenToDiskLatch = new CountDownLatch(1);
        }

        public void setDiskWriteResult(boolean z) {
            this.mWriteToDiskResult = z;
            this.mWrittenToDiskLatch.countDown();
        }
    }

    public class ModifiedMap extends LinkedHashMap<CardInfo, Object> {
        private ModifiedMap() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object put(CardInfo cardInfo, Object obj) {
            remove(cardInfo);
            return super.put(cardInfo, obj);
        }
    }

    public interface OnCardChangedListener {
        void onCardRemoved(CardInfo cardInfo);

        void onCardUpdated(CardInfo cardInfo);
    }

    private CardInfoManager(Context context) {
        this.mContext = context.getApplicationContext();
        this.mCacheModel = (d) BaseModel.create(this.mContext, d.class);
        this.mTransitCardModel = (BaseTransitCardModel) BaseModel.create(this.mContext, BaseTransitCardModel.class);
        startLoadFromDisk();
    }

    public static /* synthetic */ int access$1108(CardInfoManager cardInfoManager) {
        int i = cardInfoManager.mDiskWritesInFlight;
        cardInfoManager.mDiskWritesInFlight = i + 1;
        return i;
    }

    public static /* synthetic */ int access$1110(CardInfoManager cardInfoManager) {
        int i = cardInfoManager.mDiskWritesInFlight;
        cardInfoManager.mDiskWritesInFlight = i - 1;
        return i;
    }

    private void awaitLoadedLocked() {
        while (!this.mLoaded) {
            try {
                wait();
            } catch (InterruptedException e) {
                LogUtils.e("CardInfoManager.awaitLoadedLocked()", e);
            }
        }
    }

    private void checkNotMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("Can't call it on main thread");
        }
    }

    private void clearCache() {
        this.mCacheModel.f(false);
        this.mCacheModel.e(false);
        this.mCacheModel.a(false);
        this.mCacheModel.d(false);
        this.mCacheModel.c(false);
        this.mCacheModel.t();
    }

    private void convert(String str) {
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD)) {
            List<CardInfo> mifareCards = getMifareCards(null);
            if (ObjectUtils.isCollectionEmpty(mifareCards)) {
                return;
            }
            put((List<? extends CardInfo>) mifareCards.stream().filter(new Predicate() { // from class: hm3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return CardInfoManager.lambda$convert$2((CardInfo) obj);
                }
            }).collect(Collectors.toList()));
            return;
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_MIFARE)) {
            List<CardInfo> mifareCards2 = getMifareCards(null);
            if (ObjectUtils.isCollectionEmpty(mifareCards2)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<CardInfo> it = mifareCards2.iterator();
            while (it.hasNext()) {
                MifareCardInfo mifareCardInfo = (MifareCardInfo) it.next();
                if (mifareCardInfo.mMifareCardType == 5) {
                    arrayList.add(mifareCardInfo.transformToProprietaryCarKeyCardInfo());
                }
            }
            if (ObjectUtils.isCollectionEmpty(arrayList)) {
                return;
            }
            put(arrayList);
        }
    }

    private Editor edit() {
        synchronized (this) {
            awaitLoadedLocked();
        }
        return new Editor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueDiskWrite(final MemoryCommitResult memoryCommitResult, final Runnable runnable) {
        boolean z;
        Runnable runnable2 = new Runnable() { // from class: com.miui.tsmclient.entity.CardInfoManager.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CardInfoManager.this.mWritingToDiskLock) {
                    CardInfoManager.this.writeToFile(memoryCommitResult);
                }
                synchronized (CardInfoManager.this) {
                    CardInfoManager.access$1110(CardInfoManager.this);
                }
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        };
        if (runnable == null) {
            synchronized (this) {
                z = true;
                if (this.mDiskWritesInFlight != 1) {
                    z = false;
                }
            }
            if (z) {
                runnable2.run();
                return;
            }
        }
        this.mExecutor.execute(runnable2);
    }

    public static CardInfoManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (CardInfoManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CardInfoManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private int getIssuedCardCountIncludeDCEP() {
        Map<CardGroupType, List<CardInfo>> list = parseList(getAll(null));
        CardGroupType cardGroupType = CardGroupType.TRANSCARD;
        list.put(cardGroupType, (List) list.get(cardGroupType).stream().filter(new Predicate() { // from class: im3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((CardInfo) obj).mHasIssue;
            }
        }).collect(Collectors.toList()));
        return list.values().stream().mapToInt(new ToIntFunction() { // from class: jm3
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((List) obj).size();
            }
        }).sum();
    }

    private Map<CardGroupType, List<CardInfo>> getIssuedCardsByType(CardGroupType... cardGroupTypeArr) {
        Map<CardGroupType, List<CardInfo>> list = parseList(getAll(null));
        HashMap map = new HashMap();
        for (CardGroupType cardGroupType : cardGroupTypeArr) {
            CardGroupType cardGroupType2 = CardGroupType.TRANSCARD;
            if (cardGroupType2.getId() == cardGroupType.getId()) {
                List<CardInfo> list2 = list.get(cardGroupType2);
                ArrayList arrayList = new ArrayList();
                for (CardInfo cardInfo : list2) {
                    if (cardInfo.mHasIssue) {
                        arrayList.add(cardInfo);
                    }
                }
                list.put(CardGroupType.TRANSCARD, arrayList);
            }
            map.put(cardGroupType, list.get(cardGroupType));
        }
        return map;
    }

    private BaseResponse getResponseAndRemove(CardInfo cardInfo, BaseResponse baseResponse) {
        if (baseResponse == null) {
            baseResponse = new BaseResponse(-2, new Object[0]);
        }
        if (baseResponse.isSuccess()) {
            edit().remove(cardInfo).commit();
        }
        return baseResponse;
    }

    private BaseResponse getResponseAndUpdate(CardInfo cardInfo, BaseResponse baseResponse) {
        return getResponseAndUpdate(cardInfo, baseResponse, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initSecureSettings() {
        if (!isSanity(null)) {
            synchronized (this) {
                try {
                    if (ObjectUtils.isCollectionEmpty(this.mList)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Map<CardGroupType, List<CardInfo>> list = parseList(getAll(null));
        if (list.entrySet().stream().filter(new Predicate() { // from class: lm3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CardInfoManager.lambda$initSecureSettings$3((Map.Entry) obj);
            }
        }).mapToInt(new ToIntFunction() { // from class: mm3
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return CardInfoManager.lambda$initSecureSettings$4((Map.Entry) obj);
            }
        }).sum() == 0) {
            PrefUtils.putSecureSettings(this.mContext, PrefUtils.SETTINGS_SYSTEM_PREF_KEY_BANK_CARD, 0);
        } else {
            PrefUtils.putSecureSettings(this.mContext, PrefUtils.SETTINGS_SYSTEM_PREF_KEY_BANK_CARD, 1);
        }
        PrefUtils.putSecureSettings(this.mContext, PrefUtils.SETTINGS_SYSTEM_PREF_KEY_TRANS_CARD, !list.get(CardGroupType.TRANSCARD).stream().noneMatch(new Predicate() { // from class: nm3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((CardInfo) obj).mHasIssue;
            }
        }) ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$convert$2(CardInfo cardInfo) {
        return ((MifareCardInfo) cardInfo).mMifareCardType != 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getLocalCards$0(CardInfo cardInfo) {
        return (cardInfo.isTransCard() && !cardInfo.mHasIssue) || ((cardInfo instanceof MifareCardInfo) && ((MifareCardInfo) cardInfo).isDummy()) || (cardInfo instanceof BLECarKeyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initSecureSettings$3(Map.Entry entry) {
        return CardGroupType.TRANSCARD != entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initSecureSettings$4(Map.Entry entry) {
        return ((List) entry.getValue()).size();
    }

    private boolean lazyLoad(CacheLauncher cacheLauncher, boolean z) {
        if (cacheLauncher == null || z) {
            return false;
        }
        cacheLauncher.startBuildingCache();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFromDisk() {
        synchronized (this) {
            try {
                if (this.mLoaded) {
                    return;
                }
                List<CardInfo> listB = com.miui.tsmclient.database.a.b(this.mContext, (String) null);
                ArrayList arrayList = ObjectUtils.isCollectionEmpty(listB) ? null : new ArrayList(listB);
                synchronized (this) {
                    try {
                        this.mLoaded = true;
                        if (arrayList != null) {
                            this.mList = arrayList;
                        } else {
                            this.mList = new ArrayList();
                        }
                        notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                initSecureSettings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<CardGroupType, List<CardInfo>> parseList(List<CardInfo> list) {
        HashMap map = new HashMap();
        for (CardGroupType cardGroupType : CardGroupType.values()) {
            map.put(cardGroupType, new ArrayList());
        }
        if (list == null) {
            return map;
        }
        for (CardInfo cardInfo : list) {
            for (CardGroupType cardGroupType2 : CardGroupType.values()) {
                if (cardGroupType2.getId() == cardInfo.mCardGroupId) {
                    ((List) map.get(cardGroupType2)).add(cardInfo);
                    break;
                }
            }
        }
        return map;
    }

    private void saveKeepActivatedCards() {
        List<CardInfo> keepActivatedCards = getKeepActivatedCards();
        StringBuilder sb = new StringBuilder();
        Iterator<CardInfo> it = keepActivatedCards.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mAid);
            sb.append("|");
        }
        SettingKeys.putSecureString(this.mContext, Constants.KEY_KEEP_ACTIVATED_CARD_AIDS, sb.length() > 1 ? sb.substring(0, sb.length() - 1) : "");
    }

    private void saveTotalCount() {
        SettingKeys.putSecureInt(this.mContext, Constants.KEY_ISSUED_CARD_COUNT, getIssuedCardCountIncludeDCEP());
    }

    private void sendCardChangedBroadcast(String str, String str2, CardInfo cardInfo) {
        if (this.mContext != null) {
            Intent intent = new Intent(CardChangedConstants.ACTION_CARD_CHANGED);
            intent.setPackage(this.mContext.getPackageName());
            intent.putExtra("operation", str2);
            intent.putExtra("aid", str);
            if (cardInfo != null) {
                intent.putExtra("cardInfo", cardInfo);
            }
            this.mContext.sendBroadcast(intent, Constants.Permission.TSM_GROUP);
        }
    }

    private void sendCardUpdatedBroadcast(CardInfo cardInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cardInfo);
        sendCardUpdatedBroadcast(arrayList);
    }

    private void startLoadFromDisk() {
        LogUtils.d("startLoadFromDisk");
        synchronized (this) {
            this.mLoaded = false;
        }
        Thread thread = new Thread("CardManager startLoadFromLocal") { // from class: com.miui.tsmclient.entity.CardInfoManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                CardInfoManager.this.loadFromDisk();
            }
        };
        thread.setPriority(10);
        thread.start();
    }

    private BaseResponse updateTransCard(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        CardInfo transCard = getTransCard(null, cardInfo);
        try {
            List<CardInfo> cardsFromNetwork = this.mTransitCardModel.getCardsFromNetwork(cardInfo, bundle);
            if (!cardsFromNetwork.isEmpty()) {
                transCard = cardsFromNetwork.get(0);
            }
        } catch (AuthApiException e) {
            LogUtils.e("failed to update card info from network, code = " + e.mErrorCode + ", msg = " + e.mErrorMsg, e);
        }
        if (transCard != null) {
            transCard.updateInfo(cardInfo);
            cardInfo.parse(transCard.serialize());
        }
        BaseResponse baseResponseUpdateTransCardFormSe = updateTransCardFormSe(cardInfo, bundle);
        if (baseResponseUpdateTransCardFormSe.isSuccess() || baseResponseUpdateTransCardFormSe.isNotExist()) {
            edit().put(cardInfo).commit();
            saveTotalCount();
        }
        return baseResponseUpdateTransCardFormSe;
    }

    private BaseResponse updateTransCardFormSe(CardInfo cardInfo, Bundle bundle) {
        if (!cardInfo.mHasIssue) {
            LogUtils.d("skip updating card:" + cardInfo.mCardType);
            return new BaseResponse(2003, cardInfo);
        }
        BaseResponse baseResponseC = g.a(cardInfo.mCardType).c(this.mContext, cardInfo, bundle);
        cardInfo.mDataSource = CardInfo.DataSource.SE;
        LogUtils.d("after read ese, got card " + cardInfo.mCardName + ", aid:" + cardInfo.mAid + ", status:" + cardInfo.mStatus + ", isReadSECorrectly:" + cardInfo.mIsReadSECorrectly + ", pid:" + Thread.currentThread().getId() + ", response:" + baseResponseC.mResultCode);
        return baseResponseC;
    }

    private BaseResponse updateTransCards() {
        checkNotMainThread();
        try {
            List<CardInfo> cardsFromNetwork = this.mTransitCardModel.getCardsFromNetwork(null, null);
            if (cardsFromNetwork == null || cardsFromNetwork.isEmpty()) {
                return new BaseResponse(0, new Object[0]);
            }
            for (CardInfo cardInfo : cardsFromNetwork) {
                if (Thread.currentThread().isInterrupted()) {
                    return new BaseResponse(11, new Object[0]);
                }
                updateTransCardFormSe(cardInfo, null);
            }
            edit().put(cardsFromNetwork).commit();
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            LogUtils.e("failed to get cards from network, code = " + e.mErrorCode + ", msg = " + e.mErrorMsg, e);
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeToFile(MemoryCommitResult memoryCommitResult) {
        boolean z;
        synchronized (this) {
            z = !memoryCommitResult.mChangesMade;
        }
        if (z) {
            memoryCommitResult.setDiskWriteResult(true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<CardInfo, Object> entry : memoryCommitResult.mMapToWriteToDisk.entrySet()) {
            CardInfo key = entry.getKey();
            if (key != null) {
                if (entry.getValue() == null) {
                    com.miui.tsmclient.database.a.a(this.mContext, key);
                } else {
                    arrayList.add(key);
                }
            }
        }
        Map<CardGroupType, List<CardInfo>> list = parseList(arrayList);
        Iterator<Map.Entry<CardGroupType, List<CardInfo>>> it = list.entrySet().iterator();
        while (it.hasNext()) {
            CardGroupType key2 = it.next().getKey();
            List<CardInfo> list2 = list.get(key2);
            if (!ObjectUtils.isCollectionEmpty(list2)) {
                if (key2 == CardGroupType.TRANSCARD) {
                    Iterator<CardInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        com.miui.tsmclient.database.a.b(this.mContext, it2.next());
                    }
                } else {
                    com.miui.tsmclient.database.a.a(this.mContext, list2, list2.get(0).mCardType);
                }
            }
        }
        memoryCommitResult.setDiskWriteResult(true);
    }

    public void applyClear() {
        edit().clear().apply();
        clearCache();
        saveTotalCount();
    }

    public void clear() {
        edit().clear().commit();
        clearCache();
        saveTotalCount();
    }

    public BaseResponse deleteBankCards() {
        checkNotMainThread();
        BaseResponse baseResponseN = this.mBankCardOperation.n(this.mContext);
        if (baseResponseN == null) {
            baseResponseN = new BaseResponse(-2, new Object[0]);
        }
        if (baseResponseN.isSuccess()) {
            edit().remove(CardInfo.CARD_TYPE_BANKCARD).commit();
        }
        return baseResponseN;
    }

    public BaseResponse deleteCard(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponseB = g.a(cardInfo.mCardType).b(this.mContext, cardInfo, bundle);
        if (baseResponseB != null && baseResponseB.isSuccess()) {
            sendCardChangedBroadcast(cardInfo.getCardId(), "delete", cardInfo);
        }
        return getResponseAndRemove(cardInfo, baseResponseB);
    }

    public List<CardInfo> getAll(CacheLauncher cacheLauncher) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                awaitLoadedLocked();
                arrayList = new ArrayList();
                if (cacheLauncher == null || isSanity(cacheLauncher)) {
                    Iterator it = new ArrayList(this.mList).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CardInfo) it.next()).copy());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List<CardInfo> getBLECarKeyCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.BLECARKEY);
    }

    public List<CardInfo> getBankCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.BANKCARD);
    }

    public int getBankCardsCount() {
        return getBankCards(null).size();
    }

    public List<CardInfo> getCCCCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.CCC);
    }

    public CardInfo getCardInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<Map.Entry<CardGroupType, List<CardInfo>>> it = getIssuedCardsByType(CardGroupType.TRANSCARD, CardGroupType.MIFARECARD, CardGroupType.BANKCARD, CardGroupType.DCEP, CardGroupType.CCC, CardGroupType.PROPRIETARYCARKEY, CardGroupType.BLECARKEY, CardGroupType.ICCOACARKEY, CardGroupType.EIDCARD).entrySet().iterator();
        while (it.hasNext()) {
            for (CardInfo cardInfo : it.next().getValue()) {
                if (cardInfo.cardIdEquals(str)) {
                    return cardInfo;
                }
            }
        }
        return null;
    }

    public int getDigitalCarKeyCardsCount() {
        return getCCCCards(null).size();
    }

    public CardInfo getDigitalCurrencyCardInfo(String str) {
        for (CardInfo cardInfo : getDigitalCurrencyCards(null)) {
            if (((DCEPCardInfo) cardInfo).isSameContextId(str)) {
                return cardInfo;
            }
        }
        return null;
    }

    public List<CardInfo> getDigitalCurrencyCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.DCEP);
    }

    public List<CardInfo> getEidCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.EIDCARD);
    }

    public int getEidCardsCount() {
        return getEidCards(null).size();
    }

    public List<CardInfo> getICCOACarKeyCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.ICCOACARKEY);
    }

    public int getIssuedCardCount() {
        if (this.mCacheModel.e()) {
            return getIssuedCardCountIncludeDCEP();
        }
        try {
            return SettingKeys.getSecureInt(this.mContext, Constants.KEY_ISSUED_CARD_COUNT);
        } catch (Settings.SettingNotFoundException unused) {
            return 0;
        }
    }

    public List<CardInfo> getIssuedTransCards(CacheLauncher cacheLauncher) {
        List<CardInfo> transCards = getTransCards(cacheLauncher);
        ArrayList arrayList = new ArrayList();
        for (CardInfo cardInfo : transCards) {
            if (cardInfo.mHasIssue) {
                arrayList.add(cardInfo);
            }
        }
        return arrayList;
    }

    public int getIssuedTransCardsCount() {
        return getIssuedTransCards(null).size();
    }

    public List<CardInfo> getKeepActivatedCards() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<CardGroupType, List<CardInfo>>> it = getIssuedCardsByType(CardGroupType.MIFARECARD, CardGroupType.PROPRIETARYCARKEY, CardGroupType.CCC, CardGroupType.ICCOACARKEY).entrySet().iterator();
        while (it.hasNext()) {
            for (CardInfo cardInfo : it.next().getValue()) {
                if (cardInfo.isKeepActivated()) {
                    arrayList.add(cardInfo);
                }
            }
        }
        if (ObjectUtils.isCollectionEmpty(arrayList)) {
            String secureString = SettingKeys.getSecureString(this.mContext, Constants.KEY_KEEP_ACTIVATED_CARD_AIDS);
            if (!TextUtils.isEmpty(secureString)) {
                for (String str : secureString.split("\\|")) {
                    CardInfo cardInfo2 = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
                    cardInfo2.mAid = str;
                    cardInfo2.setKeepActivated(true);
                    arrayList.add(cardInfo2);
                }
            }
        }
        return arrayList;
    }

    public List<CardInfo> getLocalCards() {
        List<CardInfo> all = getAll(null);
        all.removeIf(new Predicate() { // from class: km3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CardInfoManager.lambda$getLocalCards$0((CardInfo) obj);
            }
        });
        return all;
    }

    public List<CardInfo> getMifareCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.MIFARECARD);
    }

    public int getMifareCardsCount() {
        return getMifareCards(null).size();
    }

    public List<CardInfo> getProprietaryCarKeyCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.PROPRIETARYCARKEY);
    }

    public int getQRBankCardsCount() {
        return getQrBankCards(null).size();
    }

    public List<CardInfo> getQrBankCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.QRBANKCARD);
    }

    public int getTraditionalCarKeyCardsCount() {
        return getProprietaryCarKeyCards(null).size();
    }

    public CardInfo getTransCard(CacheLauncher cacheLauncher, CardInfo cardInfo) {
        if (cardInfo == null) {
            return null;
        }
        for (CardInfo cardInfo2 : parseList(getAll(cacheLauncher)).get(CardGroupType.TRANSCARD)) {
            if (TextUtils.equals(cardInfo.mCardType, cardInfo2.mCardType) || TextUtils.equals(cardInfo.mAid, cardInfo2.mAid)) {
                return cardInfo2;
            }
        }
        return null;
    }

    public List<CardInfo> getTransCards(CacheLauncher cacheLauncher) {
        return parseList(getAll(cacheLauncher)).get(CardGroupType.TRANSCARD);
    }

    public boolean hasCard() {
        Iterator<Map.Entry<CardGroupType, List<CardInfo>>> it = getIssuedCardsByType(CardGroupType.TRANSCARD, CardGroupType.BANKCARD, CardGroupType.MIFARECARD, CardGroupType.QRBANKCARD, CardGroupType.EIDCARD, CardGroupType.DCEP, CardGroupType.CCC, CardGroupType.PROPRIETARYCARKEY, CardGroupType.ICCOACARKEY).entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isSanity(CacheLauncher cacheLauncher) {
        boolean zE = this.mCacheModel.e();
        lazyLoad(cacheLauncher, zE);
        return zE;
    }

    public BaseResponse issue(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponseL = g.a(cardInfo.mCardType).l(this.mContext, cardInfo, bundle);
        if (baseResponseL == null || !baseResponseL.isSuccess()) {
            return getResponseAndUpdate(cardInfo, baseResponseL, bundle);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getString("cardName") != null) {
            cardInfo.mCardName = bundle.getString("cardName");
        }
        bundle.putBoolean(KEY_ISSUE_STATUS, true);
        if (bundle.getBoolean(Constants.EXTRA_PRE_LOAD)) {
            return baseResponseL;
        }
        BaseResponse responseAndUpdate = getResponseAndUpdate(cardInfo, baseResponseL, bundle);
        sendCardChangedBroadcast(cardInfo.mAid, "add", cardInfo);
        return responseAndUpdate;
    }

    public BaseResponse processCard(CardInfo cardInfo) {
        checkNotMainThread();
        BaseResponse baseResponseB = g.a(cardInfo.mCardType).b(this.mContext, cardInfo);
        cardInfo.mDataSource = CardInfo.DataSource.SE;
        if (baseResponseB == null) {
            baseResponseB = new BaseResponse(-2, new Object[0]);
        }
        edit().put(cardInfo).commit();
        return baseResponseB;
    }

    public void put(CardInfo cardInfo) {
        edit().put(cardInfo).apply();
    }

    public BaseResponse recharge(CardInfo cardInfo) {
        return recharge(cardInfo, null);
    }

    public void registerOnCardChangedListener(OnCardChangedListener onCardChangedListener) {
        synchronized (this.mListeners) {
            this.mListeners.put(onCardChangedListener, mContent);
        }
    }

    public void remove(CardInfo cardInfo) {
        edit().remove(cardInfo).apply();
        sendCardUpdatedBroadcast(cardInfo);
    }

    public BaseResponse returnCard(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        if (cardInfo instanceof PayableCardInfo) {
            ((PayableCardInfo) cardInfo).setHasUncompletedBusiness(true);
            put(cardInfo);
        }
        BaseResponse baseResponseG = g.a(cardInfo.mCardType).g(this.mContext, cardInfo, bundle);
        if (baseResponseG != null && baseResponseG.isSuccess()) {
            sendCardChangedBroadcast(cardInfo.mAid, "delete", cardInfo);
        }
        return getResponseAndRemove(cardInfo, baseResponseG);
    }

    public BaseResponse transferIn(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponseA = g.a(cardInfo.mCardType).a(this.mContext, cardInfo, bundle);
        if (baseResponseA == null || !baseResponseA.isSuccess()) {
            return getResponseAndUpdate(cardInfo, baseResponseA, bundle);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean(KEY_ISSUE_STATUS, true);
        BaseResponse responseAndUpdate = getResponseAndUpdate(cardInfo, baseResponseA, bundle);
        if (!bundle.getBoolean(Constants.EXTRA_PRE_LOAD)) {
            sendCardChangedBroadcast(cardInfo.mAid, "add", cardInfo);
        }
        return responseAndUpdate;
    }

    public BaseResponse transferOut(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        if (cardInfo instanceof PayableCardInfo) {
            ((PayableCardInfo) cardInfo).setHasUncompletedBusiness(true);
            put(cardInfo);
        }
        BaseResponse baseResponseM = g.a(cardInfo.mCardType).m(this.mContext, cardInfo, bundle);
        if (baseResponseM != null && baseResponseM.isSuccess()) {
            sendCardChangedBroadcast(cardInfo.mAid, "delete", cardInfo);
        }
        return getResponseAndRemove(cardInfo, baseResponseM);
    }

    public void unregisterOnCardChangedListener(OnCardChangedListener onCardChangedListener) {
        synchronized (this.mListeners) {
            this.mListeners.remove(onCardChangedListener);
        }
    }

    public BaseResponse update(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        return cardInfo == null ? new BaseResponse(1, new Object[0]) : getResponseAndUpdate(cardInfo, g.a(cardInfo.mCardType).k(this.mContext, cardInfo, bundle));
    }

    public BaseResponse updateCards(CardGroupType cardGroupType) {
        checkNotMainThread();
        if (CardGroupType.TRANSCARD == cardGroupType) {
            return updateTransCards();
        }
        CardInfo bankCardInfo = new BankCardInfo();
        if (CardGroupType.QRBANKCARD == cardGroupType) {
            bankCardInfo = new QrBankCardInfo();
        }
        if (CardGroupType.MIFARECARD == cardGroupType) {
            bankCardInfo = new MifareCardInfo();
        }
        if (CardGroupType.EIDCARD == cardGroupType) {
            bankCardInfo = new EidCardInfo();
        }
        if (CardGroupType.DCEP == cardGroupType) {
            bankCardInfo = new DCEPCardInfo();
        }
        if (CardGroupType.CCC == cardGroupType) {
            bankCardInfo = new CarKeyCardInfo();
        }
        if (CardGroupType.PROPRIETARYCARKEY == cardGroupType) {
            bankCardInfo = new ProprietaryCarKeyCardInfo();
        }
        if (CardGroupType.BLECARKEY == cardGroupType) {
            bankCardInfo = new BLECarKeyInfo();
        }
        if (CardGroupType.ICCOACARKEY == cardGroupType) {
            bankCardInfo = new ICCOACarKeyCardInfo();
        }
        return updateCards(bankCardInfo);
    }

    public void updateTransCardLocal(String str) {
        CardInfo cardInfo = getCardInfo(str);
        if (cardInfo == null || !updateTransCardFormSe(cardInfo, null).isSuccess()) {
            return;
        }
        edit().put(cardInfo).commit();
    }

    private BaseResponse getResponseAndUpdate(CardInfo cardInfo, BaseResponse baseResponse, Bundle bundle) {
        if (baseResponse == null) {
            baseResponse = new BaseResponse(-2, new Object[0]);
        }
        if (baseResponse.isSuccess()) {
            updateCards(cardInfo, bundle);
        }
        return baseResponse;
    }

    private void sendCardUpdatedBroadcast(List<? extends CardInfo> list) {
        if (this.mContext != null) {
            Intent intent = new Intent(CardChangedConstants.ACTION_CARD_UPDATED);
            intent.setPackage(this.mContext.getPackageName());
            if (!ObjectUtils.isCollectionEmpty(list)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<? extends CardInfo> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().serialize().toString());
                }
                intent.putStringArrayListExtra("cardInfo", arrayList);
            }
            this.mContext.sendBroadcast(intent, Constants.Permission.TSM_GROUP);
        }
    }

    public CardInfo getTransCard(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (CardInfo cardInfo : getTransCards(null)) {
            if (TextUtils.equals(cardInfo.mCardType, str)) {
                return cardInfo;
            }
        }
        return null;
    }

    public void put(List<? extends CardInfo> list) {
        edit().put(list).apply();
    }

    public BaseResponse recharge(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        if (!(cardInfo instanceof PayableCardInfo)) {
            return new BaseResponse(1, new Object[0]);
        }
        PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
        OrderInfo rechargeOrder = payableCardInfo.getRechargeOrder();
        boolean z = bundle != null && bundle.getBoolean(Constants.EXTRA_OUT_OPERATION);
        if (rechargeOrder == null && !z) {
            return new BaseResponse(0, new Object[0]);
        }
        j jVarA = g.a(cardInfo.mCardType);
        return getResponseAndUpdate(cardInfo, jVarA instanceof k ? ((k) jVarA).a(this.mContext, payableCardInfo, rechargeOrder, null, bundle) : null);
    }

    public void remove(String str) {
        edit().remove(str).apply();
    }

    public BaseResponse updateCards(CardInfo cardInfo) {
        return updateCards(cardInfo, null);
    }

    public BaseResponse updateCards(CardInfo cardInfo, Bundle bundle) {
        checkNotMainThread();
        boolean zIsEmpty = TextUtils.isEmpty(cardInfo.getCardId());
        LogUtils.d("updateCards: " + cardInfo.mCardType + ", isUpdateAll=" + zIsEmpty);
        if (cardInfo.isTransCard()) {
            return updateTransCard(cardInfo, bundle);
        }
        BaseResponse baseResponseB = g.a(cardInfo.mCardType).b(this.mContext, cardInfo);
        if (baseResponseB == null) {
            baseResponseB = new BaseResponse(-2, new Object[0]);
        }
        if (baseResponseB.isSuccess()) {
            Editor editorEdit = edit();
            Object[] objArr = baseResponseB.mDatas;
            if (objArr == null || objArr.length <= 0) {
                editorEdit.put(cardInfo);
                sendCardUpdatedBroadcast(cardInfo);
            } else {
                List<? extends CardInfo> list = (List) objArr[0];
                if (zIsEmpty) {
                    convert(cardInfo.mCardType);
                    editorEdit.remove(cardInfo.mCardType);
                }
                if (!ObjectUtils.isCollectionEmpty(list)) {
                    editorEdit.put(list);
                    sendCardUpdatedBroadcast(list);
                }
            }
            editorEdit.commit();
            saveTotalCount();
            saveKeepActivatedCards();
        }
        return baseResponseB;
    }
}
