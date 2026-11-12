package com.huawei.health.health.utils.functionsetcard.reader;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.ICardChangedCallback;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.marketing.views.HomePageRecommendLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.functionsetcard.view.RatioRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fac;
import defpackage.fua;
import defpackage.lmn;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.qqp;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FunctionSetBeanReader implements FunctionSetSubCardData {
    private static final String AB_TEST_INFO_KEY = "ab_info";
    private static final int AUTO_TEXT_MIN_SIZE = 10;
    private static final int AUTO_TEXT_SIZE_STEP_GRANULARITY = 1;
    public static final String BI_ACTION = "action";
    public static final String BI_DATA_SOURCE = "dataSource";
    public static final String BI_ELEMENT = "element";
    public static final String BI_HAS_DATA = "hasData";
    public static final String BI_HAS_DATA_TYPE = "hasDataType";
    public static final String BI_MODULE_NAME = "moduleName";
    public static final String BI_POSITION = "position";
    public static final String BI_VALUE = "value";
    private static final String CARD_NAME = "cardName";
    private static final String CARD_POSITION = "cardPosition";
    private static final String CARD_TYPE = "cardType";
    private static final String CLICK = "click";
    public static final String CLICK_CANCEL = "5";
    public static final String CLICK_CARD = "3";
    private static final String DATA_STATUS = "dataStatus";
    private static final int DEFAULT_CHINESE_MARGIN_TOP = 2;
    public static final String EDIT_CARD = "2";
    private static final int EXPECTED_BUFFER_DATA = 1024;
    public static final int EXTRA_LANGUAGE_TEXT_SIZE_NORMAL = 12;
    public static final int EXTRA_LANGUAGE_TEXT_SIZE_SMALL = 10;
    public static final String HIDE_CARD = "1";
    private static final int HORIZONTAL_X_AXIS_THRESHOLD = 200;
    private static final int HORIZONTAL_Y_AXIS_THRESHOLD = 400;
    private static final String HW_CHINESE_MEDIUM = "HwChinese-medium";
    private static final String IS_OPEN_SMART_RECOMMEND_BY_USER = "IS_OPEN_SMART_RECOMMEND_BY_USER";
    private static final String LARGE = "large";
    public static final String LONG_CLICK_CARD = "4";
    private static final int MAX_DATA = 128;
    private static final int MAX_LINES = 1;
    public static final String NOTIFY_ITEM_CHANGED_LABEL = "function_set_card_data_changed";
    private static final int ONE = 1;
    private static final int RATIO_HEIGHT_WEIGHT = 585;
    private static final int RATIO_WIDTH_WEIGHT = 470;
    protected static final String RELEASE_TAG = "TimeEat_";
    private static final int SET_BI_LISTENER_DELAY = 1000;
    public static final String SHOW_CARD = "6";
    protected static final int SIZE_DEFAULT = -1;
    protected static final int SIZE_LARGE = 1;
    private static final String SMALL = "small";
    private static final int SMALL_CARD_HEIGHT_LIMIT = 150;
    private static final String SMART_RECOMMEND = "smartRecommend";
    private static final String TAG = "FunctionSetBeanReader";
    private static final int TWO = 2;
    private static int mIsSmartRecommend = -1;
    private static String sAbTestInfo = "";
    private HealthButton adjustButton;
    private HealthButton cancelButton;
    private CustomViewDialog customViewDialog;
    private boolean hasCardDataFromSp;
    private HealthButton hideButton;
    private String mBiDataSource;
    private String mBiHasDataType;
    private ICardChangedCallback mCardChangedCallback;
    private CardConfig mCardConfig;
    private CardConstructor mCardConstructor;
    private Observer mCardRedDotObserver;
    protected MyHolder mCardViewHolder;
    protected String mChangeKey;
    public Context mContext;
    private boolean mCurrentIsLargeCard;
    private FunctionSetBean mFunctionSetBean;
    protected boolean mIsDataChangeOnBg;
    protected boolean mIsShowDot;
    protected int mLastUniCode;
    private int mLayoutId;
    private int mPosition;
    private String mTag;
    private HealthTextView popupTittle;
    protected volatile boolean hasCardData = false;
    protected volatile boolean hasCardDataLastTime = false;
    protected int mCardRefreshType = -1;
    private String mBiHasData = Constants.NULL;
    private Set<View> mHasBiEventSet = new HashSet();
    private int mExtraWidth = 0;
    private boolean mIsExtraWidth = false;
    private final Object mIsSameBeanLock = new Object();
    private View.OnClickListener mCardClickListener = new View.OnClickListener() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.4
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FunctionSetBeanReader.this.onCardViewClickListener();
        }
    };
    private View.OnLongClickListener mCardLongClickListener = new View.OnLongClickListener() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.5
        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogUtil.a(FunctionSetBeanReader.TAG, "OnLongClickListener true");
            FunctionSetBeanReader.this.onCardViewLongClickListener();
            return true;
        }
    };
    private boolean mIsInit = true;
    protected FunctionSetBeanHelper mBeanRequestHelper = FunctionSetBeanHelper.e();

    private boolean isSameVisibility(boolean z, int i) {
        if (z && i == 0) {
            return true;
        }
        return !z && i == 8;
    }

    protected int getButtonTextId() {
        return 0;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getCardType() {
        return -1;
    }

    protected float getChartBottomMargin() {
        return 0.0f;
    }

    protected float getChartTopMargin() {
        return 2.0f;
    }

    public abstract String getChildTag();

    protected abstract int getDefaultImage(boolean z);

    protected abstract String getDefaultLargeCardImageRes();

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getExtraWidth() {
        return 0;
    }

    protected HandleCacheDataRunnable getRunnable() {
        return null;
    }

    protected boolean handleHealthModelSp(String str) {
        return false;
    }

    protected boolean isMessageDefaultLargeCard() {
        return false;
    }

    protected boolean isOverseaDefaultLargeCard() {
        return false;
    }

    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void refreshRedDotSyncNotify(boolean z) {
    }

    protected void reportCustomBiEvent() {
    }

    protected void setGifImage(ImageView imageView, boolean z) {
    }

    public FunctionSetBeanReader(Context context, String str, CardConfig cardConfig) {
        this.mContext = context;
        this.mTag = str;
        this.mCardConfig = cardConfig;
        registerCardRedDotListener();
    }

    private void registerCardRedDotListener() {
        a aVar = new a(this);
        this.mCardRedDotObserver = aVar;
        ObserverManagerUtil.d(aVar, "HOME_FRAGMENT_ACTIVITY_FOR_RESULT");
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FunctionSetBeanReader> f7094c;

        public a(FunctionSetBeanReader functionSetBeanReader) {
            this.f7094c = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            FunctionSetBeanReader functionSetBeanReader = this.f7094c.get();
            if (functionSetBeanReader == null) {
                LogUtil.j(FunctionSetBeanReader.TAG, "reader is null in RedDotListener.");
                return;
            }
            if (objArr != null) {
                Object obj = objArr[0];
                if ((obj instanceof String) && obj.equals(functionSetBeanReader.getChildTag()) && functionSetBeanReader.getIsShowDot()) {
                    LogUtil.a(FunctionSetBeanReader.TAG, "refresh red dot, TAG: ", functionSetBeanReader.getChildTag());
                    functionSetBeanReader.refreshRedDotSyncNotify(false);
                }
            }
        }
    }

    public void notifyItemChanged(FunctionSetBean functionSetBean) {
        if (functionSetBean == null) {
            LogUtil.a(this.mTag, "bean is null");
            return;
        }
        if (!isUpdateContextSuccess()) {
            ReleaseLogUtil.e("TimeEat_FunctionSetBeanReader", "notifyItemChanged updateContext failed.");
            return;
        }
        if (this.mCardViewHolder == null) {
            LogUtil.j(this.mTag, "notifyItemChanged holder is null");
        } else {
            boolean zIsSameBean = isSameBean(functionSetBean);
            boolean zIsSameData = isSameData(functionSetBean);
            LogUtil.a(this.mTag, "isSameBean: ", Boolean.valueOf(zIsSameBean), ", isSameData: ", Boolean.valueOf(zIsSameData));
            if (zIsSameBean && zIsSameData) {
                return;
            }
        }
        setFunctionSetBean(functionSetBean);
        if (this.mCardChangedCallback == null) {
            LogUtil.e(TAG, "mCardChangedCallback is null");
        } else {
            LogUtil.a(this.mTag, "notifyItemChanged");
            this.mCardChangedCallback.notifyCardChanged(this);
        }
    }

    private boolean isActivityInvalid() {
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            LogUtil.a(TAG, "mContext is not activity");
            return true;
        }
        if (!((Activity) context).isDestroyed()) {
            return false;
        }
        LogUtil.a(TAG, "Activity is isDestroyed");
        return true;
    }

    private boolean isUpdateContextSuccess() {
        if (!isActivityInvalid()) {
            return true;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity != null) {
            this.mContext = activity;
            return true;
        }
        ReleaseLogUtil.e("TimeEat_FunctionSetBeanReader", "updateContext failed, getActivity is null.");
        return false;
    }

    private boolean isSameData(FunctionSetBean functionSetBean) {
        MyHolder myHolder = this.mCardViewHolder;
        if (!(myHolder instanceof MyHolder)) {
            LogUtil.j(this.mTag, "isSameData, mCardViewHolder is null");
            return false;
        }
        if (functionSetBean.r() == FunctionSetBean.ViewType.EMPTY_VIEW || myHolder.e == null) {
            return true;
        }
        if (TextUtils.isEmpty(functionSetBean.h())) {
            if (!isEqualString(functionSetBean.l(), myHolder.e.getText())) {
                return false;
            }
        } else {
            if (!isEqualString(functionSetBean.h(), myHolder.e.getText())) {
                return false;
            }
            if (functionSetBean.f() != null && !functionSetBean.f().equals(myHolder.e.getCompoundDrawablesRelative()[0])) {
                return false;
            }
        }
        return isEqualString(functionSetBean.c(), myHolder.f7091a.getText()) && isEqualString(functionSetBean.t(), myHolder.ad.getText()) && isEqualString(functionSetBean.b(), myHolder.f7092b.getText()) && isSameVisibility(functionSetBean.g(), myHolder.k.getVisibility()) && isEqualString(functionSetBean.o(), myHolder.f7093c.getText());
    }

    private boolean isEqualString(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) {
            return true;
        }
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2)) {
            return false;
        }
        return charSequence.toString().equals(charSequence2.toString());
    }

    private boolean isSameBean(FunctionSetBean functionSetBean) {
        String strM = functionSetBean.m();
        String charSequenceStr = getCharSequenceStr(functionSetBean.l());
        String charSequenceStr2 = getCharSequenceStr(functionSetBean.c());
        String charSequenceStr3 = getCharSequenceStr(functionSetBean.t());
        String strI = functionSetBean.i();
        int iK = functionSetBean.k();
        FunctionSetType functionSetTypeQ = functionSetBean.q();
        FunctionSetBean.ViewType viewTypeR = functionSetBean.r();
        boolean zG = functionSetBean.g();
        int iHash = Objects.hash(strM, charSequenceStr, charSequenceStr2, charSequenceStr3, strI, Integer.valueOf(iK), functionSetTypeQ, viewTypeR, Boolean.valueOf(zG), functionSetBean.d(), getCharSequenceStr(functionSetBean.b()), Integer.valueOf(functionSetBean.a()), getCharSequenceStr(functionSetBean.h()), functionSetBean.f(), Integer.valueOf(functionSetBean.p()));
        synchronized (this.mIsSameBeanLock) {
            LogUtil.a(this.mTag, "uniqueCode: ", Integer.valueOf(iHash), ", mLastUniCode: ", Integer.valueOf(this.mLastUniCode));
            if (this.mLastUniCode == iHash) {
                return true;
            }
            this.mLastUniCode = iHash;
            return false;
        }
    }

    private String getCharSequenceStr(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static <T> void setHasCardData(WeakReference<T> weakReference, boolean z) {
        if (weakReference == null) {
            LogUtil.a(TAG, "weakReference is null");
            return;
        }
        T t = weakReference.get();
        if (!FunctionSetBeanReader.class.isInstance(t)) {
            LogUtil.a(TAG, "not FunctionSetBeanReader instance");
            return;
        }
        FunctionSetBeanReader functionSetBeanReader = (FunctionSetBeanReader) t;
        LogUtil.a(TAG, "cardId: ", functionSetBeanReader.getCardConfig() == null ? "" : functionSetBeanReader.getCardConfig().getCardId(), ", hasCardDataLastTime: ", Boolean.valueOf(functionSetBeanReader.hasCardData), ", hasCardData: ", Boolean.valueOf(z));
        functionSetBeanReader.hasCardDataLastTime = functionSetBeanReader.hasCardData;
        functionSetBeanReader.hasCardData = z;
        functionSetBeanReader.saveHasCardDataToSp();
    }

    public void setHasCardData(boolean z) {
        this.hasCardData = z;
        saveHasCardDataToSp();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        readCardData();
    }

    public void setRefreshReason(int i) {
        this.mCardRefreshType = i;
    }

    public static <T> void saveDataFromHealthApi(String str, WeakReference<T> weakReference, HiHealthData hiHealthData) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(str, "invalid tag");
            return;
        }
        if (weakReference == null) {
            LogUtil.a(str, "weakReference is null");
            return;
        }
        T t = weakReference.get();
        if (!FunctionSetBeanReader.class.isInstance(t)) {
            LogUtil.a(str, "not FunctionSetBeanReader instance");
            return;
        }
        FunctionSetBeanReader functionSetBeanReader = (FunctionSetBeanReader) t;
        functionSetBeanReader.handleHealthData(str, hiHealthData);
        FunctionSetBeanHelper functionSetBeanHelper = functionSetBeanReader.mBeanRequestHelper;
        if (functionSetBeanHelper != null) {
            functionSetBeanHelper.b(str, hiHealthData);
        } else {
            LogUtil.a(str, "reader.mBeanRequestHelper is null");
        }
    }

    public void saveDataFromHealthApi(String str, FunctionSetBeanReader functionSetBeanReader, HiHealthData hiHealthData) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(str, "invalid tag");
            return;
        }
        if (functionSetBeanReader == null) {
            LogUtil.a(str, "reader is null");
            return;
        }
        functionSetBeanReader.handleHealthData(str, hiHealthData);
        FunctionSetBeanHelper functionSetBeanHelper = functionSetBeanReader.mBeanRequestHelper;
        if (functionSetBeanHelper != null) {
            functionSetBeanHelper.b(str, hiHealthData);
        } else {
            LogUtil.a(str, "reader.mBeanRequestHelper is null");
        }
    }

    private void handleHealthData(String str, HiHealthData hiHealthData) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (getRunnable() != null) {
                getRunnable().handleCacheData(hiHealthData, true);
            }
        }
        LogUtil.a(str, "refresh card by healthApi data, time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    protected String getHuid() {
        FunctionSetBeanHelper functionSetBeanHelper = this.mBeanRequestHelper;
        if (functionSetBeanHelper == null) {
            return "0";
        }
        return functionSetBeanHelper.f7082c;
    }

    private void saveHasCardDataToSp() {
        if (this.hasCardDataFromSp == this.hasCardData) {
            LogUtil.a(this.mTag, "saveHasCardDataToSp same value");
        } else {
            lsy.a(new Runnable() { // from class: fak
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1114x7d2da356();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$saveHasCardDataToSp$0$com-huawei-health-health-utils-functionsetcard-reader-FunctionSetBeanReader, reason: not valid java name */
    public /* synthetic */ void m1114x7d2da356() {
        if (this.mCardConfig == null) {
            LogUtil.j(this.mTag, "saveHasCardDataToSp mCardConfig is null");
            return;
        }
        if (SharedPreferenceManager.e(this.mContext, Integer.toString(AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE), this.mCardConfig.getCardId(), Boolean.toString(this.hasCardData), new StorageParams()) != 0) {
            LogUtil.j(this.mTag, "saveHasCardDataToSp setSharedPreference failed");
            return;
        }
        LogUtil.a(this.mTag, "saveHasCardDataToSp hasCardDataFromSp ", Boolean.valueOf(this.hasCardDataFromSp), " hasCardData ", Boolean.valueOf(this.hasCardData));
        this.hasCardDataFromSp = this.hasCardData;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        this.mPosition = i;
        LogUtil.a(this.mTag, "create mCardViewHolder");
        MyHolder myHolder = new MyHolder(layoutInflater.inflate(R.layout.function_set_items, viewGroup, false), this.mContext, this);
        this.mCardViewHolder = myHolder;
        return myHolder;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        if (!(viewHolder instanceof MyHolder)) {
            LogUtil.j(this.mTag, "onBindViewHolder holder is not FunctionSetViewAdapter.MyHolder");
            return;
        }
        MyHolder myHolder = this.mCardViewHolder;
        if (myHolder == null || !myHolder.equals(viewHolder)) {
            LogUtil.j(this.mTag, "onBindViewHolder mCardViewHolder is null");
            this.mCardViewHolder = (MyHolder) viewHolder;
        }
        if (functionSetSubCardData == null) {
            LogUtil.j(this.mTag, "onBindViewHolder reader is null");
            return;
        }
        if (this.mIsInit) {
            this.mIsInit = false;
            if (requestData(functionSetSubCardData)) {
                LogUtil.a(this.mTag, "handle sp and refresh end");
                return;
            }
        }
        if (functionSetSubCardData.getFunctionSetBean() == null) {
            LogUtil.j(this.mTag, "onBindViewHolder bean is null");
            setFunctionSetBean(buildEmptyCardBean());
        }
        LogUtil.a(this.mTag, "onBindViewHolder CardId = ", functionSetSubCardData.getCardConfig().getCardId());
        final MyHolder myHolder2 = (MyHolder) viewHolder;
        LogUtil.a(this.mTag, "hasCardData: " + functionSetSubCardData.hasCardData());
        if (functionSetSubCardData.getFunctionSetBean().r() == FunctionSetBean.ViewType.EMPTY_VIEW) {
            LogUtil.a(this.mTag, "EMPTY_VIEW: " + this);
            qsp.c((View) myHolder2.i, 8);
            qsp.c((View) myHolder2.f, 8);
            qsp.c((View) myHolder2.n, 8);
            qsp.c((View) myHolder2.x, 8);
            if (fua.b(this.mContext)) {
                this.mCurrentIsLargeCard = true;
                LogUtil.a(this.mTag, "initNoDataView: oversea");
                showOverseaEmptyCard(myHolder2);
                showEmptyCard(myHolder2, functionSetSubCardData.getFunctionSetBean());
            } else {
                bindMarketingViewHolder(myHolder2);
            }
            fac.b(this.mContext, myHolder2.w, myHolder2.r, this.mCurrentIsLargeCard, false);
        } else if (functionSetSubCardData.getFunctionSetBean().r() == FunctionSetBean.ViewType.DATA_VIEW || this.hasCardData) {
            this.mCurrentIsLargeCard = true;
            fac.b(this.mContext, myHolder2.w, myHolder2.r, true, false);
            LogUtil.a(this.mTag, "DATA_VIEW: " + this);
            loadDataCardLayout(myHolder2);
            qsp.c((View) myHolder2.i, 8);
            qsp.c((View) myHolder2.n, 8);
            qsp.c((View) myHolder2.f, 0);
            showDataCard(myHolder2, functionSetSubCardData);
            onBottomLayoutClickListener(myHolder2.h);
        }
        myHolder2.j.setOnClickListener(this.mCardClickListener);
        if (fua.s()) {
            myHolder2.j.setOnLongClickListener(this.mCardLongClickListener);
        }
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.3
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetBeanReader.this.setBiEventListener(myHolder2.j);
            }
        }, 1000L);
    }

    private void showOverseaEmptyCard(MyHolder myHolder) {
        if (myHolder.i != null) {
            myHolder.i.setVisibility(0);
            myHolder.a();
            return;
        }
        myHolder.i = (LinearLayout) ((ViewStub) myHolder.itemView.findViewById(R.id.function_set_empty_layout)).inflate();
        myHolder.l = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_empty_items_title);
        myHolder.v = (HealthImageView) myHolder.itemView.findViewById(R.id.function_set_empty_red_dot);
        myHolder.g = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_empty_items_description);
        myHolder.i.setVisibility(0);
        myHolder.a();
    }

    private void loadDataCardLayout(MyHolder myHolder) {
        if (myHolder.f != null) {
            qsp.c((View) myHolder.f, 0);
            myHolder.e();
            return;
        }
        myHolder.f = (ConstraintLayout) ((ViewStub) myHolder.itemView.findViewById(R.id.function_set_data_layout)).inflate();
        myHolder.r = (ImageView) myHolder.itemView.findViewById(R.id.function_set_market_layout_large_bg);
        myHolder.z = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_items_title);
        myHolder.e = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_bottom_left);
        myHolder.f7091a = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_items_data);
        myHolder.x = (RelativeLayout) myHolder.itemView.findViewById(R.id.function_set_recognization_logo_layout);
        myHolder.u = (ImageView) myHolder.itemView.findViewById(R.id.function_set_recognization_logo);
        myHolder.ad = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_items_unit);
        myHolder.k = (ImageView) myHolder.itemView.findViewById(R.id.function_set_red_dot);
        myHolder.o = (LinearLayout) myHolder.itemView.findViewById(R.id.function_set_items_chart);
        myHolder.y = (LinearLayout) myHolder.itemView.findViewById(R.id.marketing_area);
        myHolder.h = (ConstraintLayout) myHolder.itemView.findViewById(R.id.card_des);
        myHolder.d = (LinearLayout) myHolder.itemView.findViewById(R.id.card_description);
        myHolder.f7093c = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_bottom_end);
        myHolder.f7092b = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_bottom_right);
        myHolder.e();
    }

    private void showEmptyLargeCard(MyHolder myHolder) {
        if (myHolder.n != null) {
            myHolder.n.setVisibility(0);
            myHolder.b();
            return;
        }
        myHolder.n = (RelativeLayout) ((ViewStub) myHolder.itemView.findViewById(R.id.function_set_market_layout_large)).inflate();
        myHolder.r = (ImageView) myHolder.itemView.findViewById(R.id.function_set_market_layout_large_bg);
        myHolder.t = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_market_title_large);
        myHolder.s = (HealthTextView) myHolder.itemView.findViewById(R.id.function_set_market_content_large);
        myHolder.q = (HealthButton) myHolder.itemView.findViewById(R.id.large_card_button);
        myHolder.p = (ImageView) myHolder.itemView.findViewById(R.id.function_set_market_image_large);
        myHolder.m = (ImageView) myHolder.itemView.findViewById(R.id.function_set_market_gif);
        myHolder.n.setVisibility(0);
        myHolder.b();
    }

    private boolean requestData(FunctionSetSubCardData functionSetSubCardData) {
        if (this.mBeanRequestHelper == null) {
            LogUtil.a(this.mTag, "mBeanRequestHelper is null");
            functionSetSubCardData.setFunctionSetBean(buildEmptyCardBean());
            functionSetSubCardData.initCardData();
            return false;
        }
        LogUtil.a(this.mTag, "getFunctionSetBean");
        if (this.mTag.equals("HL_HealthModelCardReader")) {
            return handleHealthModelSp(this.mBeanRequestHelper.a());
        }
        HiHealthData hiHealthDataC = this.mBeanRequestHelper.c(this.mTag);
        if (hiHealthDataC == null) {
            LogUtil.a(this.mTag, "data is null");
            functionSetSubCardData.setFunctionSetBean(buildEmptyCardBean());
            functionSetSubCardData.initCardData();
            return false;
        }
        handleResult(hiHealthDataC, false);
        functionSetSubCardData.initCardData();
        return true;
    }

    private void handleResult(HiHealthData hiHealthData, boolean z) {
        HandleCacheDataRunnable runnable = getRunnable();
        try {
            synchronized (this) {
                if (runnable != null) {
                    runnable.handleCacheData(hiHealthData, z);
                }
            }
        } catch (Exception e2) {
            LogUtil.j(this.mTag, "handleResult fail, isNewData=", Boolean.valueOf(z), ", e=", LogAnonymous.b(e2));
            FunctionSetBeanHelper functionSetBeanHelper = this.mBeanRequestHelper;
            if (functionSetBeanHelper != null) {
                functionSetBeanHelper.b(this.mTag, null);
            }
        }
    }

    public void refreshCardBySp(final FunctionSetBean functionSetBean) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.2
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetBeanReader.this.refreshCardBySp(functionSetBean);
                }
            });
            return;
        }
        LogUtil.a(this.mTag, "sync refreshCardBySp");
        if (functionSetBean == null) {
            LogUtil.a(this.mTag, "bean is null");
            setFunctionSetBean(buildEmptyCardBean());
            onBindViewHolder(this.mCardViewHolder, this);
            ReleaseLogUtil.d(RELEASE_TAG + this.mTag, "REFRESH_HOME_END refreshCardBySp, hasCardData: ", false);
            return;
        }
        if (!isUpdateContextSuccess()) {
            LogUtil.j(this.mTag, "refreshCardBySp Activity is destroyed, return");
            ReleaseLogUtil.e(RELEASE_TAG + this.mTag, "REFRESH_HOME_END refreshCardBySp, hasCardData: ", false);
            return;
        }
        if (this.mCardViewHolder == null) {
            LogUtil.a(this.mTag, "mCardViewHolder = null");
            ReleaseLogUtil.d(RELEASE_TAG + this.mTag, "REFRESH_HOME_END refreshCardBySp, hasCardData: ", false);
            return;
        }
        if (!this.hasCardData) {
            setFunctionSetBean(buildEmptyCardBean());
            LogUtil.a(this.mTag, "refreshCardBySp: show empty card");
            onBindViewHolder(this.mCardViewHolder, this);
            ReleaseLogUtil.d(RELEASE_TAG + this.mTag, "REFRESH_HOME_END refreshCardBySp, hasCardData: ", false);
            return;
        }
        isSameBean(functionSetBean);
        setFunctionSetBean(functionSetBean);
        LogUtil.a(this.mTag, "refreshCardBySp: show data card, bean: ", functionSetBean.toString());
        onBindViewHolder(this.mCardViewHolder, this);
        ReleaseLogUtil.d(RELEASE_TAG + this.mTag, "REFRESH_HOME_END refreshCardBySp, hasCardData: ", Boolean.valueOf(this.hasCardData));
    }

    private void bindMarketingViewHolder(MyHolder myHolder) {
        LogUtil.a(this.mTag, "Marketing view: " + this);
        this.mCurrentIsLargeCard = true;
        LogUtil.a(this.mTag, "bindMarketingViewHolder: LargeCard");
        showEmptyLargeCard(myHolder);
        LogUtil.a(this.mTag, "mMarketingContent invalid, mCurrentIsLargeCard: ", Boolean.valueOf(this.mCurrentIsLargeCard), ", mIsMessageLargeCard: ", Integer.valueOf(getIsMessageLargeCard()));
        bindViewHolder(myHolder, this.mCurrentIsLargeCard);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean getCurrentIsLargeCard() {
        return this.mCurrentIsLargeCard;
    }

    private void bindViewHolder(MyHolder myHolder, boolean z) {
        if (z) {
            setTheme(myHolder.t);
            setDescription(myHolder.s);
            if (!fua.b(BaseApplication.getContext())) {
                setButtonText(myHolder.q);
                setImage(myHolder.r, z);
                setGifImage(myHolder.r, z);
            } else {
                setImage(myHolder.p, z);
            }
        }
        setClickEventForButton(myHolder.q);
    }

    protected void setClickEventForButton(HealthButton healthButton) {
        if (healthButton == null) {
            return;
        }
        healthButton.setClickable(false);
    }

    private void setButtonText(HealthButton healthButton) {
        if (healthButton == null) {
            LogUtil.j(this.mTag, "setButtonText largeNoDataButton is null");
            return;
        }
        int buttonTextId = getButtonTextId();
        if (buttonTextId == 0) {
            healthButton.setVisibility(8);
            return;
        }
        healthButton.setVisibility(0);
        healthButton.setText(this.mContext.getResources().getString(buttonTextId));
        healthButton.setTextColor(this.mContext.getResources().getColor(getButtonColorId()));
    }

    private void setTheme(HealthTextView healthTextView) {
        LogUtil.a(this.mTag, "setTheme");
        qsp.b(healthTextView, getCardTitle());
    }

    private void setDescription(HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j(this.mTag, "setDescription textview is null");
            return;
        }
        LogUtil.a(this.mTag, "setDescription");
        if (fac.b(this.mContext) < 150) {
            healthTextView.setMaxLines(1);
        }
        healthTextView.setText(getEmptyCardDescription());
    }

    private void setImage(ImageView imageView, boolean z) {
        LogUtil.a(this.mTag, "setImage");
        Drawable defaultImg = getDefaultImg(z);
        if (defaultImg == null || qrs.d(defaultImg)) {
            return;
        }
        qsp.a(imageView, defaultImg);
    }

    private Drawable getDefaultImg(boolean z) {
        if (!fua.b(BaseApplication.getContext())) {
            return this.mContext.getResources().getDrawable(getDefaultImage(z));
        }
        return getDefaultMarketingImage();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean hasCardData() {
        return this.hasCardData;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean hasCardDataLastTime() {
        return this.hasCardDataLastTime;
    }

    private void showEmptyCard(MyHolder myHolder, FunctionSetBean functionSetBean) {
        if (functionSetBean.r() != FunctionSetBean.ViewType.EMPTY_VIEW) {
            LogUtil.j(this.mTag, "showEmptyCard getViewType is not equal to EMPTY_VIEW");
            return;
        }
        qsp.b(myHolder.l, getCardTitle());
        qsp.b(myHolder.g, getEmptyCardDescription());
        qsp.c(myHolder.i, getEmptyCardBackground());
    }

    private void showDataCard(final MyHolder myHolder, FunctionSetSubCardData functionSetSubCardData) {
        FunctionSetBean functionSetBean = functionSetSubCardData.getFunctionSetBean();
        if (functionSetBean.r() != FunctionSetBean.ViewType.DATA_VIEW) {
            LogUtil.j(this.mTag, "showDataCard getViewType is not equal to DATA_VIEW");
            return;
        }
        resetHasDataViewConfig(myHolder);
        myHolder.z.setText(getCardTitle());
        qsp.a(myHolder.f7091a, functionSetBean.c(), true);
        CharSequence charSequenceE = functionSetBean.e();
        if (!TextUtils.isEmpty(charSequenceE)) {
            myHolder.f7091a.setContentDescription(charSequenceE);
        }
        qsp.a(myHolder.ad, functionSetBean.t(), true);
        Drawable drawableJ = functionSetBean.j();
        if (drawableJ == null) {
            qsp.c((View) myHolder.x, 8);
        } else {
            qsp.c((View) myHolder.x, 0);
            myHolder.u.setImageDrawable(drawableJ);
            onSingleViewClickListener(myHolder.x);
        }
        if (!TextUtils.isEmpty(functionSetBean.h())) {
            LogUtil.a(TAG, "show card message, content=", functionSetBean.h());
            myHolder.e.setText(functionSetBean.h());
            myHolder.e.setContentDescription(functionSetBean.h());
            myHolder.e.setSingleLine(false);
            myHolder.e.setMaxLines(2);
            myHolder.f7092b.setText("");
            myHolder.f7092b.setVisibility(8);
            Drawable drawableF = functionSetBean.f();
            if (drawableF != null) {
                drawableF.setBounds(0, 0, qre.b(R.dimen.health_common_12dp), qre.b(R.dimen.health_common_12dp));
                myHolder.e.setCompoundDrawablesRelative(drawableF, null, null, null);
                myHolder.e.setCompoundDrawablePadding(qre.b(R.dimen.health_common_2dp));
            } else {
                myHolder.e.setCompoundDrawablesRelative(null, null, null, null);
            }
        } else {
            LogUtil.a(TAG, "no card message show time");
            myHolder.e.setText(functionSetBean.l());
            myHolder.e.setContentDescription(functionSetBean.n());
            myHolder.e.setSingleLine(true);
            myHolder.e.setMaxLines(1);
            myHolder.e.setCompoundDrawablesRelative(null, null, null, null);
            qsp.a(myHolder.f7092b, functionSetBean.b(), true);
            myHolder.f.post(new Runnable() { // from class: fag
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33768b.m1116x3b469bb9(myHolder);
                }
            });
        }
        if (!TextUtils.isEmpty(functionSetBean.o())) {
            if (myHolder.x.getVisibility() != 0) {
                myHolder.f7093c.setVisibility(0);
                myHolder.f7093c.setText(functionSetBean.o());
                Drawable drawable = ContextCompat.getDrawable(this.mContext, R.drawable.ic_arrow_diet_diary);
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    drawable = qqz.e(BaseApplication.getContext(), drawable);
                }
                drawable.setBounds(0, 0, this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_10dp), this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_10dp));
                myHolder.f7093c.setCompoundDrawablesRelative(null, null, drawable, null);
            } else {
                myHolder.f7093c.setVisibility(8);
            }
            myHolder.e.setSingleLine(false);
            myHolder.e.setMaxLines(2);
        } else {
            myHolder.f7093c.setVisibility(8);
            myHolder.e.setAutoTextInfo(10, 1, 2);
        }
        myHolder.f7092b.setTextColor(this.mContext.getResources().getColor(getDataTypeTextColor()));
        myHolder.j.setCardBackgroundColor(this.mContext.getResources().getColor(R.color.colorThreeCircleBg));
        View viewCreateCardView = functionSetSubCardData.createCardView();
        LogUtil.a(this.mTag, "createCardView: ", viewCreateCardView);
        if (!this.mIsExtraWidth) {
            this.mExtraWidth = functionSetSubCardData.getExtraWidth();
        }
        if (viewCreateCardView != null && (viewCreateCardView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) viewCreateCardView.getParent()).removeView(viewCreateCardView);
        }
        if (viewCreateCardView != null) {
            setChartView(myHolder, viewCreateCardView);
        }
        bindRecommendView(myHolder);
        boolean zG = functionSetBean.g();
        LogUtil.a(this.mTag, "ShowRedDot: ", zG ? functionSetBean.toString() : "false");
        if (zG) {
            myHolder.k.setVisibility(0);
        } else {
            myHolder.k.setVisibility(8);
        }
        myHolder.c(this.mContext, (FunctionSetBeanReader) functionSetSubCardData);
    }

    private void resetHasDataViewConfig(MyHolder myHolder) {
        myHolder.f7091a.setTypeface(qrr.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkBottomLayoutNeedWrap, reason: merged with bridge method [inline-methods] */
    public void m1116x3b469bb9(MyHolder myHolder) {
        int measuredWidth = myHolder.f.getMeasuredWidth();
        int measureWidth = (int) myHolder.e.getMeasureWidth();
        int measureWidth2 = (int) myHolder.f7092b.getMeasureWidth();
        int iD = qre.d(R.dimen.health_common_32dp);
        LogUtil.a(TAG, "containerWidth=" + measuredWidth, " leftWidth=" + measureWidth, " rightWidth=", Integer.valueOf(measureWidth2), " marginWidth=", Integer.valueOf(iD));
        if (measureWidth + measureWidth2 + iD > measuredWidth) {
            myHolder.d.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) myHolder.f7092b.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.gravity = 8388691;
            myHolder.f7092b.setLayoutParams(layoutParams);
            return;
        }
        myHolder.d.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) myHolder.f7092b.getLayoutParams();
        layoutParams2.setMarginStart(qre.d(R.dimen.health_common_8dp));
        layoutParams2.gravity = 8388693;
        myHolder.f7092b.setLayoutParams(layoutParams2);
    }

    private void bindRecommendView(MyHolder myHolder) {
        ICardChangedCallback iCardChangedCallback = this.mCardChangedCallback;
        if (iCardChangedCallback == null) {
            LogUtil.j(TAG, "mCardChangedCallback is null when bindRecommendView.");
            return;
        }
        View viewLoadMarketingView = iCardChangedCallback.loadMarketingView(this.mCardConfig.getCardId(), myHolder.getLayoutPosition());
        if (isKeepRecommendView(myHolder.y.getChildAt(0), viewLoadMarketingView)) {
            myHolder.e.setContentDescription(" ");
            LogUtil.a(TAG, "same HomePageRecommendLayout. No need to refresh. mCardConfig.getCardId() = ", this.mCardConfig.getCardId());
            return;
        }
        myHolder.y.removeAllViews();
        if (viewLoadMarketingView != null) {
            myHolder.e.setContentDescription(" ");
            ViewParent parent = viewLoadMarketingView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewLoadMarketingView);
            }
            if (viewLoadMarketingView instanceof HomePageRecommendLayout) {
                ((HomePageRecommendLayout) viewLoadMarketingView).setOnDismissListener(new d());
            }
            myHolder.y.addView(viewLoadMarketingView, -1, -1);
            myHolder.y.setVisibility(0);
            myHolder.h.setVisibility(4);
            return;
        }
        myHolder.y.setVisibility(8);
        myHolder.h.setVisibility(0);
    }

    public boolean isShowHomePageRecommendLayout() {
        MyHolder myHolder = this.mCardViewHolder;
        if (myHolder == null) {
            ReleaseLogUtil.e(TAG, "isShowHomePageRecommendLayout mCardViewHolder is null");
            return false;
        }
        LinearLayout linearLayout = myHolder.y;
        if (linearLayout == null) {
            ReleaseLogUtil.e(TAG, "isShowHomePageRecommendLayout viewGroup is null");
            return false;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0) {
            ReleaseLogUtil.e(TAG, "isShowHomePageRecommendLayout childCount ", Integer.valueOf(childCount));
            return false;
        }
        View childAt = linearLayout.getChildAt(0);
        if (childAt instanceof HomePageRecommendLayout) {
            return childAt.getVisibility() == 0;
        }
        ReleaseLogUtil.e(TAG, "isShowHomePageRecommendLayout view ", childAt);
        return false;
    }

    private boolean isKeepRecommendView(View view, View view2) {
        if (!(view instanceof HomePageRecommendLayout) || !(view2 instanceof HomePageRecommendLayout)) {
            return false;
        }
        HomePageRecommendLayout homePageRecommendLayout = (HomePageRecommendLayout) view;
        HomePageRecommendLayout homePageRecommendLayout2 = (HomePageRecommendLayout) view2;
        if (homePageRecommendLayout2.getGridContent() == null) {
            LogUtil.j(TAG, "new layout is wrong.keep");
            return true;
        }
        boolean zEquals = homePageRecommendLayout2.equals(homePageRecommendLayout);
        LogUtil.a(TAG, "presentLayout.getRecommendCard() = ", homePageRecommendLayout.getRecommendCard(), "; newLayout.getRecommendCard() = ", homePageRecommendLayout2.getRecommendCard(), "; isRefresh = ", Boolean.valueOf(zEquals));
        return zEquals;
    }

    protected int getDataTypeTextColor() {
        return R.color.textColorSecondary;
    }

    private void setChartView(MyHolder myHolder, View view) {
        if (this.mExtraWidth > 0) {
            ViewGroup.LayoutParams layoutParams = myHolder.o.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width += this.mExtraWidth;
                myHolder.o.setLayoutParams(layoutParams2);
                this.mExtraWidth = 0;
                this.mIsExtraWidth = true;
            }
        }
        myHolder.o.removeAllViews();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        view.setLayoutParams(layoutParams3);
        myHolder.o.addView(view);
    }

    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(getCardTitle()).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(getEmptyCardDescription()).b(this.mContext).a();
    }

    protected String getCardTitle() {
        int identifier;
        if (this.mCardConfig == null) {
            LogUtil.j(this.mTag, "getEmptyCardTitle mCardConfig is null");
            return "";
        }
        Resources resources = this.mContext.getResources();
        String cardNameRes = this.mCardConfig.getCardNameRes();
        LogUtil.a(this.mTag, "cardNameRes: ", cardNameRes);
        return (cardNameRes == null || (identifier = resources.getIdentifier(cardNameRes, "string", this.mContext.getPackageName())) <= 0) ? "" : this.mContext.getResources().getString(identifier);
    }

    private String getEmptyCardDescription() {
        int identifier;
        int identifier2;
        if (this.mCardConfig == null) {
            LogUtil.j(this.mTag, "getEmptyCardDescription mCardConfig is null");
            return "";
        }
        Resources resources = this.mContext.getResources();
        if (fua.b(this.mContext)) {
            String noDataDescRes = this.mCardConfig.getNoDataDescRes();
            if (noDataDescRes != null && (identifier2 = resources.getIdentifier(noDataDescRes, "string", this.mContext.getPackageName())) > 0) {
                return this.mContext.getResources().getString(identifier2);
            }
        } else {
            String defaultMarketingDescRes = this.mCardConfig.getDefaultMarketingDescRes();
            if (defaultMarketingDescRes != null && (identifier = resources.getIdentifier(defaultMarketingDescRes, "string", this.mContext.getPackageName())) > 0) {
                return getDefaultMarketingDes(identifier);
            }
        }
        return "";
    }

    protected String getDefaultMarketingDes(int i) {
        return this.mContext.getResources().getString(i);
    }

    private Drawable getEmptyCardBackground() {
        int identifier;
        if (this.mCardConfig == null) {
            LogUtil.j(this.mTag, "getEmptyCardBackground mCardConfig is null");
            return null;
        }
        Resources resources = this.mContext.getResources();
        String noDataBgRes = this.mCardConfig.getNoDataBgRes();
        if (noDataBgRes == null || (identifier = resources.getIdentifier(noDataBgRes, "drawable", this.mContext.getPackageName())) <= 0) {
            return null;
        }
        return this.mContext.getResources().getDrawable(identifier);
    }

    private Drawable getDefaultMarketingImage() {
        int identifier;
        if (this.mCardConfig == null) {
            LogUtil.j(this.mTag, "getDefaultMarketingImage mCardConfig is null");
            return null;
        }
        Resources resources = this.mContext.getResources();
        String defaultLargeCardImageRes = getDefaultLargeCardImageRes();
        if (defaultLargeCardImageRes == null) {
            defaultLargeCardImageRes = this.mCardConfig.getDefaultMarketingImageRes();
        }
        if (defaultLargeCardImageRes == null || defaultLargeCardImageRes.length() == 0 || (identifier = resources.getIdentifier(defaultLargeCardImageRes, "drawable", this.mContext.getPackageName())) <= 0) {
            return null;
        }
        return this.mContext.getResources().getDrawable(identifier);
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HealthTextView f7091a;
        private HealthTextView ad;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7093c;
        private LinearLayout d;
        private HealthTextView e;
        private ConstraintLayout f;
        private HealthTextView g;
        private ConstraintLayout h;
        private LinearLayout i;
        private HealthCardView j;
        private ImageView k;
        private HealthTextView l;
        private ImageView m;
        private RelativeLayout n;
        private LinearLayout o;
        private ImageView p;
        private HealthButton q;
        private ImageView r;
        private HealthTextView s;
        private HealthTextView t;
        private ImageView u;
        private HealthImageView v;
        private RatioRelativeLayout w;
        private RelativeLayout x;
        private LinearLayout y;
        private HealthTextView z;

        MyHolder(View view, Context context, FunctionSetBeanReader functionSetBeanReader) {
            super(view);
            ((ViewGroup) view).setLayoutParams(a(context));
            this.w = (RatioRelativeLayout) view.findViewById(R.id.recyclerview_item);
            this.j = (HealthCardView) view.findViewById(R.id.function_set_card_view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Context context, FunctionSetBeanReader functionSetBeanReader) {
            ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (functionSetBeanReader == null) {
                    marginLayoutParams.topMargin = qqp.a(context, 2.0f);
                    marginLayoutParams.bottomMargin = qqp.a(context, 0.0f);
                } else {
                    marginLayoutParams.topMargin = qqp.a(context, functionSetBeanReader.getChartTopMargin());
                    marginLayoutParams.bottomMargin = qqp.a(context, functionSetBeanReader.getChartBottomMargin());
                }
                this.o.setLayoutParams(marginLayoutParams);
            }
        }

        private RelativeLayout.LayoutParams a(Context context) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int iC = fac.c(context);
            layoutParams.bottomMargin = fac.c(context, fac.i(context));
            int i = iC / 2;
            layoutParams.setMarginStart(i);
            layoutParams.setMarginEnd(i);
            return layoutParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            if (qrs.u()) {
                this.f7091a.setAutoTextSize(1, 32.0f);
                this.ad.setAutoTextSize(1, 16.0f);
                this.z.setAutoTextSize(1, 18.0f);
                this.e.setAutoTextSize(1, 14.0f);
                this.f7092b.setAutoTextSize(1, 14.0f);
                this.f7093c.setAutoTextSize(1, 14.0f);
            } else {
                this.f7091a.setAutoTextSize(2, 26.0f);
                this.ad.setAutoTextSize(2, 12.0f);
                this.z.setAutoTextSize(2, 14.0f);
                this.e.setAutoTextSize(2, 12.0f);
                this.f7092b.setAutoTextSize(2, 12.0f);
                this.f7093c.setAutoTextSize(2, 12.0f);
            }
            if (LanguageUtil.f(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext())) {
                this.z.setSingleLine(true);
                this.z.setMaxLines(1);
                if (qrs.y()) {
                    this.f7091a.setSingleLine(false);
                    this.f7091a.setMaxLines(2);
                    return;
                } else {
                    this.f7091a.setSingleLine(true);
                    this.f7091a.setMaxLines(1);
                    return;
                }
            }
            this.z.setSingleLine(false);
            this.z.setMaxLines(2);
            this.f7091a.setSingleLine(false);
            this.f7091a.setMaxLines(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (qrs.u()) {
                this.t.setAutoTextSize(1, 18.0f);
                this.s.setAutoTextSize(1, 16.0f);
                this.q.setAutoTextSize(1, 16.0f);
            } else {
                this.t.setAutoTextSize(2, 14.0f);
                this.s.setAutoTextSize(2, 12.0f);
                this.q.setAutoTextSize(2, 12.0f);
            }
            if (LanguageUtil.f(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext())) {
                this.t.setSingleLine(true);
                this.t.setMaxLines(1);
            } else {
                this.t.setSingleLine(false);
                this.t.setMaxLines(2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (qrs.u()) {
                this.l.setAutoTextSize(1, 18.0f);
                this.g.setAutoTextSize(1, 16.0f);
            } else {
                this.l.setAutoTextSize(2, 14.0f);
                this.g.setAutoTextSize(2, 12.0f);
            }
        }
    }

    public static class e implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<FunctionSetBeanReader> f7099a;
        private String e;

        public e(String str, FunctionSetBeanReader functionSetBeanReader) {
            this.e = str;
            this.f7099a = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            FunctionSetBeanReader functionSetBeanReader;
            WeakReference<FunctionSetBeanReader> weakReference = this.f7099a;
            if (weakReference == null || (functionSetBeanReader = weakReference.get()) == null) {
                return;
            }
            functionSetBeanReader.updateSuccessList(list);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            WeakReference<FunctionSetBeanReader> weakReference = this.f7099a;
            if (weakReference == null) {
                ReleaseLogUtil.e(this.e, "onChange mReader is null");
                return;
            }
            FunctionSetBeanReader functionSetBeanReader = weakReference.get();
            if (functionSetBeanReader == null) {
                ReleaseLogUtil.e(this.e, "onChange reader is null type ", Integer.valueOf(i));
                return;
            }
            LogUtil.a(this.e, "onChange changeKey ", str, " mChangeKey ", functionSetBeanReader.mChangeKey, " type ", Integer.valueOf(i));
            functionSetBeanReader.mChangeKey = str;
            functionSetBeanReader.refreshRedDotSyncNotify(true);
            if (functionSetBeanReader.isSubscribeType(i)) {
                if (!"sync download".equals(str) || i == HiSubscribeType.f12259a || i == HiSubscribeType.f12260b) {
                    functionSetBeanReader.processDataChange();
                } else if (hiHealthData != null) {
                    LogUtil.a(this.e, "onChange newValue ", hiHealthData.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDataChange() {
        if (!BaseApplication.isRunningForeground()) {
            LogUtil.j(this.mTag, "onChange isRunningBackground");
            setDataChangeOnBg(true);
        } else {
            readCardData();
        }
    }

    public static class c implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7097b;
        private String e;

        public c(String str, String str2) {
            this.e = str;
            this.f7097b = str2;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a(this.e, this.f7097b, Boolean.valueOf(z));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public FunctionSetBean getFunctionSetBean() {
        return this.mFunctionSetBean;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void setFunctionSetBean(FunctionSetBean functionSetBean) {
        this.mFunctionSetBean = functionSetBean;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public CardConfig getCardConfig() {
        return this.mCardConfig;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void setCardConfig(CardConfig cardConfig) {
        this.mCardConfig = cardConfig;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        this.mBiHasData = Constants.NULL;
        this.mBiDataSource = "";
        this.mBiHasDataType = "";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void setCardConstructor(CardConstructor cardConstructor) {
        this.mCardConstructor = cardConstructor;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public String getCardId() {
        CardConfig cardConfig = this.mCardConfig;
        if (cardConfig != null) {
            return cardConfig.getCardId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCardViewClickListener() {
        LogUtil.a(this.mTag, "card is clicked");
        if (getFunctionSetBean() == null) {
            LogUtil.a(this.mTag, "getFunctionSetBean is null");
            return;
        }
        FunctionSetBean.ViewType viewTypeR = getFunctionSetBean().r();
        if (viewTypeR != FunctionSetBean.ViewType.DATA_VIEW && viewTypeR != FunctionSetBean.ViewType.EMPTY_VIEW) {
            LogUtil.a(this.mTag, "viewType is invalid");
            return;
        }
        LogUtil.a(this.mTag, "card is clicked, viewType: " + viewTypeR);
        ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", this, "3");
        Drawable foreground = this.mCardViewHolder.j.getForeground();
        this.mCardViewHolder.j.setForeground(null);
        onCardViewClickListener(viewTypeR);
        this.mCardViewHolder.j.setForeground(foreground);
    }

    public void onBottomLayoutClickListener(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setClickable(false);
        }
    }

    public void onSingleViewClickListener(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setClickable(false);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void setNotifyCardChangedCallback(ICardChangedCallback iCardChangedCallback) {
        this.mCardChangedCallback = iCardChangedCallback;
    }

    public void setBiDataSource(int i) {
        if (i == 0) {
            this.mBiDataSource = "";
        } else if (i == 32 || i == 30) {
            this.mBiDataSource = "telephone";
        } else if (i == 1) {
            this.mBiDataSource = "manual";
        } else if (i == 10001) {
            this.mBiDataSource = "thirdDevice";
        } else {
            this.mBiDataSource = "wearDevice";
        }
        LogUtil.a(this.mTag, "mBiDataSource : ", this.mBiDataSource);
    }

    public void setBiDataSource(String str) {
        this.mBiDataSource = str;
    }

    public void setBiHasData(long j) {
        this.mBiHasData = lsl.aa(j) ? "current_data" : "no_current_data";
    }

    public void setBiHasDataType(String str) {
        this.mBiHasDataType = str;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public lmn getShowOrClickBiInfo(int i) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put(BI_ELEMENT, "data_card");
        map.put("value", getCardConfig().getCardId());
        map.put("moduleName", "home_card");
        lmnVar.e(map);
        ArrayList arrayList = new ArrayList(1);
        HashMap map2 = new HashMap();
        map2.put("action", 0);
        map2.put("moduleName", "home_card");
        map2.put(BI_HAS_DATA, this.mBiHasData);
        map2.put(BI_HAS_DATA_TYPE, this.mBiHasDataType);
        map2.put("dataSource", this.mBiDataSource);
        map2.put("position", Integer.valueOf(this.mPosition + 1));
        arrayList.add(map2);
        lmnVar.d(arrayList);
        return lmnVar;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        if (isNeedRefreshOnResume()) {
            readCardData();
        }
        this.mIsDataChangeOnBg = false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        FunctionSetBeanHelper functionSetBeanHelper = this.mBeanRequestHelper;
        if (functionSetBeanHelper != null) {
            functionSetBeanHelper.c();
            this.mBeanRequestHelper = null;
        }
        ObserverManagerUtil.a(this.mCardRedDotObserver, "HOME_FRAGMENT_ACTIVITY_FOR_RESULT");
    }

    public boolean isNeedRefreshOnResume() {
        LogUtil.a(this.mTag, "isNeedRefreshOnResume, mIsDataChangeOnBg ：", Boolean.valueOf(this.mIsDataChangeOnBg));
        return this.mIsDataChangeOnBg;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void setDataChangeOnBg(final boolean z) {
        HandlerExecutor.c(new Runnable() { // from class: fal
            @Override // java.lang.Runnable
            public final void run() {
                this.f33774c.m1115xdd11a949(z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setDataChangeOnBg$2$com-huawei-health-health-utils-functionsetcard-reader-FunctionSetBeanReader, reason: not valid java name */
    public /* synthetic */ void m1115xdd11a949(boolean z) {
        this.mIsDataChangeOnBg = z;
    }

    private int getIsMessageLargeCard() {
        CardConstructor cardConstructor = this.mCardConstructor;
        if (cardConstructor == null) {
            return -1;
        }
        return cardConstructor.getIsMessageLargeCard();
    }

    protected int getButtonColorId() {
        return R.color.function_marketing_big_card_default;
    }

    protected int getHasCardDataFromSp() {
        LogUtil.a(TAG, "getHasCardDataFromSp");
        if (this.mCardConfig == null) {
            LogUtil.a(TAG, "mCardConfig is null");
            return -1;
        }
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE), this.mCardConfig.getCardId());
        if (strE == null || strE.length() == 0) {
            return -1;
        }
        boolean z = Boolean.parseBoolean(strE);
        this.hasCardDataFromSp = z;
        return z ? 1 : 0;
    }

    public List<HiHealthData> getList(Object obj, int i) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof SparseArray) {
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                Object obj2 = sparseArray.get(i);
                if (obj2 instanceof List) {
                    return (List) obj2;
                }
            }
        }
        return arrayList;
    }

    protected boolean getIsShowDot() {
        return this.mIsShowDot;
    }

    protected void setIsShowRedDot(boolean z) {
        this.mIsShowDot = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCardViewLongClickListener() {
        ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", this, "4");
        if (!isUpdateContextSuccess()) {
            LogUtil.j(TAG, "onCardViewLongClickListener updateContext failed, return");
            return;
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mContext);
        View viewInflate = View.inflate(this.mContext, R.layout.home_card_button, null);
        this.popupTittle = (HealthTextView) viewInflate.findViewById(R.id.popup_tittle);
        this.hideButton = (HealthButton) viewInflate.findViewById(R.id.hide_button);
        this.adjustButton = (HealthButton) viewInflate.findViewById(R.id.adjust_sequence);
        this.cancelButton = (HealthButton) viewInflate.findViewById(R.id.cancel_button);
        this.hideButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", FunctionSetBeanReader.this, "1");
                LogUtil.a(FunctionSetBeanReader.TAG, "hideButton ture");
                FunctionSetBeanReader.this.customViewDialog.dismiss();
            }
        });
        this.adjustButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", FunctionSetBeanReader.this, "2");
                LogUtil.a(FunctionSetBeanReader.TAG, "adjustButton ture");
                FunctionSetBeanReader.this.customViewDialog.dismiss();
            }
        });
        this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", FunctionSetBeanReader.this, "5");
                LogUtil.a(FunctionSetBeanReader.TAG, "cancelButton ture");
                FunctionSetBeanReader.this.customViewDialog.dismiss();
            }
        });
        builder.b(viewInflate, 0, 0);
        builder.a(qre.a(R.string.IDS_edit_card, getCardTitle()));
        this.popupTittle.setText(qre.a(R.string.IDS_check_check_card, getCardTitle()));
        CustomViewDialog customViewDialogD = builder.d();
        this.customViewDialog = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.customViewDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSetBiEvent(View view) {
        return view != null && this.mHasBiEventSet.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiEventListener(View view) {
        if (view == null || hasSetBiEvent(view)) {
            return;
        }
        qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) new b(this, view));
        qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) new b(this, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVisibilityAndSetBiEvent(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        if (isRectVisibleToUser(rect, height, width)) {
            ICardChangedCallback iCardChangedCallback = this.mCardChangedCallback;
            if (iCardChangedCallback != null) {
                iCardChangedCallback.notifyCardScrolled(this);
            }
            if (hasSetBiEvent(view)) {
                return;
            }
            if (this.mCardConfig == null) {
                LogUtil.e(TAG, "mCardConfig is null");
                return;
            }
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10100), IS_OPEN_SMART_RECOMMEND_BY_USER);
            if (strE != null && strE.equals(Boolean.toString(true))) {
                LogUtil.a(TAG, "card is smart recommend");
                mIsSmartRecommend = 1;
            }
            String cardId = this.mCardConfig.getCardId();
            this.mHasBiEventSet.add(view);
            LogUtil.a(this.mTag, "card is show, cardId: " + cardId);
            ObserverManagerUtil.e("PRESS_HODLE_DELETE_CARD", this, "6");
            reportCustomBiEvent();
        }
    }

    private boolean isRectVisibleToUser(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.right >= Math.min(i2 / 2, 200) && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min((i * 2) / 3, 400);
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f7095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<FunctionSetBeanReader> f7096b;

        public b(FunctionSetBeanReader functionSetBeanReader, View view) {
            this.f7096b = new WeakReference<>(functionSetBeanReader);
            this.f7095a = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FunctionSetBeanReader functionSetBeanReader = this.f7096b.get();
            View view = this.f7095a.get();
            if (functionSetBeanReader == null || view == null) {
                return;
            }
            if (!functionSetBeanReader.hasSetBiEvent(view)) {
                functionSetBeanReader.checkVisibilityAndSetBiEvent(view);
            } else {
                qsp.b(view, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            FunctionSetBeanReader functionSetBeanReader = this.f7096b.get();
            View view = this.f7095a.get();
            if (functionSetBeanReader == null || view == null) {
                return;
            }
            if (!functionSetBeanReader.hasSetBiEvent(view)) {
                functionSetBeanReader.checkVisibilityAndSetBiEvent(view);
            } else {
                qsp.c(view, this);
            }
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FunctionSetBeanReader> f7098a;

        private d(FunctionSetBeanReader functionSetBeanReader) {
            this.f7098a = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            FunctionSetBeanReader functionSetBeanReader = this.f7098a.get();
            if (functionSetBeanReader != null && (functionSetBeanReader.mCardViewHolder instanceof MyHolder)) {
                LogUtil.a(FunctionSetBeanReader.TAG, "HomePageRecommendLayout dismiss, position:", obj);
                MyHolder myHolder = functionSetBeanReader.mCardViewHolder;
                myHolder.y.setVisibility(8);
                myHolder.h.setVisibility(0);
            }
        }
    }
}
