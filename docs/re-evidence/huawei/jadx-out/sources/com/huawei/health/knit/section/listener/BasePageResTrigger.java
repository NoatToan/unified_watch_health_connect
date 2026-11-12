package com.huawei.health.knit.section.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentManager;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.configuredpage.api.ConfiguredPageApi;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubManager;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver;
import com.huawei.health.knit.bff.impl.IResourceRequestCallback;
import com.huawei.health.knit.data.IKnitLifeCycle;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.data.KnitDataProviderGroup;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ddv;
import defpackage.fog;
import defpackage.foi;
import defpackage.foj;
import defpackage.fom;
import defpackage.ftb;
import defpackage.fua;
import defpackage.njy;
import defpackage.peh;
import health.compact.a.CommonUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BasePageResTrigger implements IPageResTrigger {
    public static final Parcelable.Creator<BasePageResTrigger> CREATOR = new Parcelable.Creator<BasePageResTrigger>() { // from class: com.huawei.health.knit.section.listener.BasePageResTrigger.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BasePageResTrigger createFromParcel(Parcel parcel) {
            return new BasePageResTrigger(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BasePageResTrigger[] newArray(int i) {
            return new BasePageResTrigger[i];
        }
    };
    private static final int DELAY = 5000;
    public static final String KET_EXTRA_IS_SET_BI_ON_VISIBLE = "key_extra_is_set_bi_on_visible";
    public static final String KET_H5_OBSERVER_HASH_CODE = "ket_h5_observer_hash_code";
    public static final String KET_H5_OBSERVER_KEY = "ket_h5_observer_key";
    public static final String KEY_DELAY_TIME_MILLIS = "key_delay_time_millis";
    public static final String KEY_EXTRA_MARKETING_ONE_PAGE_TYPE = "key_extra_marketing_one_page_type";
    public static final String KEY_EXTRA_RES_POS_ID_LIST = "key_extra_res_pos_id_list";
    private static final String KEY_SECTION_LIST = "section_list";
    public static final int OFFLINE_SECTIONS_MAX_PRIORITY = 9999;
    private static final String R_TAG = "R_BasePageResTrigger";
    private static final String TAG = "BasePageResTrigger";
    private List<SectionBean> mCacheBeansList;
    private Consumer mConsumer;
    protected WeakReference<Context> mContextRef;
    private long mDelayTimeMillis;
    protected Bundle mExtra;
    protected OnFailureListener mFailureListener;
    private boolean mFirstTimeVisible;
    private int mH5ObserverHashCode;
    private String mH5ObserverKey;
    private H5ProEventHubObserver mH5ProEventHubObserver;
    protected volatile boolean mIsLoadFloatingBox;
    private boolean mIsNeedToLoadEmptyLayout;
    private MajorProvider mMajorProvider;
    protected final MarketingIdInfo mMarketingIdInfo;
    protected List<View> mMarketingViewList;
    private final List<MinorProvider> mMinorProviderList;
    private boolean mNeedRefresh;
    protected final int mResPosId;
    private Timer mTimer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public int getPageCategory() {
        return 0;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageCreated(Activity activity, View view) {
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageVisibilityChanged(Activity activity, boolean z, View view) {
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public void setOnFailureListener(OnFailureListener onFailureListener) {
    }

    public BasePageResTrigger(Context context, int i, MarketingIdInfo marketingIdInfo) {
        this.mExtra = new Bundle();
        this.mContextRef = new WeakReference<>(null);
        this.mIsLoadFloatingBox = false;
        this.mCacheBeansList = null;
        this.mMinorProviderList = new ArrayList();
        this.mFirstTimeVisible = true;
        this.mNeedRefresh = false;
        this.mContextRef = new WeakReference<>(context);
        this.mResPosId = i;
        this.mMarketingIdInfo = marketingIdInfo;
        this.mTimer = new Timer();
    }

    private BasePageResTrigger(Parcel parcel) {
        this.mExtra = new Bundle();
        this.mContextRef = new WeakReference<>(null);
        this.mIsLoadFloatingBox = false;
        this.mCacheBeansList = null;
        this.mMinorProviderList = new ArrayList();
        this.mFirstTimeVisible = true;
        this.mNeedRefresh = false;
        this.mResPosId = parcel.readInt();
        this.mMarketingIdInfo = (MarketingIdInfo) parcel.readParcelable(MarketingIdInfo.class.getClassLoader());
    }

    public void setLoadFloatingBox(boolean z) {
        this.mIsLoadFloatingBox = z;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public List<SectionBean> onPageLoadOfflineSections(String str, boolean z) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            LogUtil.e(TAG, "onPageLoadOfflineSections jsonObject exception, cause ", e.getCause());
            jSONObject = null;
        }
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_SECTION_LIST)) != null) {
            boolean z2 = z && !Utils.o();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (isActive(jSONObjectOptJSONObject, z2)) {
                        String strOptString = jSONObjectOptJSONObject.optString("dataUrl");
                        if (!TextUtils.isEmpty(strOptString)) {
                            String[] strArrSplit = strOptString.split(";");
                            if (strArrSplit.length != 0) {
                                sectionBeanGeneration(arrayList, jSONObjectOptJSONObject, strArrSplit);
                            }
                        }
                    }
                }
            }
            relateMajorAndMinorProvider(arrayList);
            Iterator<SectionBean> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().y();
            }
        }
        return arrayList;
    }

    private boolean isActive(JSONObject jSONObject, boolean z) {
        boolean zOptBoolean = jSONObject.optBoolean("isOnlyOffline");
        String strOptString = jSONObject.optString("versionControl");
        if (z && zOptBoolean) {
            LogUtil.a(TAG, " isActive() isChinaOnLine:", Boolean.valueOf(z), ", config isOnlyOffline:", Boolean.valueOf(zOptBoolean), ", config versionControl:", strOptString);
            return false;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return true;
        }
        boolean zIsVersioned = VersionControlUtil.isVersioned(strOptString);
        LogUtil.a(TAG, "jsonObjects: ", jSONObject.toString(), ", isVersioned: ", Boolean.valueOf(zIsVersioned));
        return zIsVersioned;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    private void sectionBeanGeneration(List<SectionBean> list, JSONObject jSONObject, String[] strArr) {
        KnitDataProvider knitDataProvider;
        SectionBean sectionBean;
        ftb ftbVar;
        int iOptInt = jSONObject.optInt("priority");
        int iOptInt2 = jSONObject.optInt("template");
        String strOptString = jSONObject.optString("isShare");
        if (strArr.length > 1) {
            KnitDataProvider dpGroup = getDpGroup(strArr);
            dpGroup.setGroupId(jSONObject.optInt("groupId"));
            dpGroup.setExtra(this.mExtra);
            if (iOptInt != 0) {
                ftbVar = new ftb(iOptInt2, iOptInt, getPageType(), dpGroup, this.mResPosId, strOptString);
            } else {
                ftbVar = new ftb(iOptInt2, 9999, getPageType(), dpGroup, this.mResPosId, strOptString);
            }
            list.add(ftbVar);
            return;
        }
        String strD = fom.d(strArr[0]);
        if (TextUtils.isEmpty(strD)) {
            knitDataProvider = null;
        } else {
            Object objA = ReflectionUtils.a(strD);
            if (objA instanceof KnitDataProvider) {
                knitDataProvider = (KnitDataProvider) objA;
            } else {
                knitDataProvider = null;
            }
        }
        KnitDataProvider knitDataProvider2 = knitDataProvider;
        if (knitDataProvider2 != null) {
            knitDataProvider2.setGroupId(jSONObject.optInt("groupId"));
            knitDataProvider2.setExtra(this.mExtra);
        }
        if (iOptInt != 0) {
            sectionBean = new SectionBean(iOptInt2, iOptInt, getPageType(), knitDataProvider2, this.mResPosId, strOptString);
        } else {
            sectionBean = new SectionBean(iOptInt2, 9999, getPageType(), knitDataProvider2, this.mResPosId, strOptString);
        }
        LogUtil.a(TAG, "add sectionBean. templateId = ", Integer.valueOf(iOptInt2));
        list.add(sectionBean);
    }

    private KnitDataProvider getDpGroup(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        KnitDataProviderGroup knitDataProviderGroup = null;
        boolean z = false;
        for (String str : strArr) {
            String strD = fom.d(str);
            if (!TextUtils.isEmpty(strD)) {
                Object objA = ReflectionUtils.a(strD);
                if (!z && (objA instanceof KnitDataProviderGroup)) {
                    z = true;
                    knitDataProviderGroup = (KnitDataProviderGroup) objA;
                } else if (objA instanceof KnitDataProvider) {
                    arrayList.add((KnitDataProvider) objA);
                }
            }
        }
        if (knitDataProviderGroup == null) {
            return new KnitDataProviderGroup().e(arrayList);
        }
        return knitDataProviderGroup.e(arrayList);
    }

    private void relateMajorAndMinorProvider(List<SectionBean> list) {
        HashMap map = new HashMap();
        for (SectionBean sectionBean : list) {
            KnitDataProvider knitDataProviderC = sectionBean.c();
            if (knitDataProviderC != null) {
                int groupId = knitDataProviderC.getGroupId();
                List arrayList = (List) map.get(Integer.valueOf(groupId));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(groupId), arrayList);
                }
                arrayList.add(sectionBean);
            }
        }
        this.mMinorProviderList.clear();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                KnitDataProvider knitDataProviderC2 = ((SectionBean) it2.next()).c();
                if (knitDataProviderC2 instanceof MajorProvider) {
                    this.mMajorProvider = (MajorProvider) knitDataProviderC2;
                } else if (knitDataProviderC2 instanceof MinorProvider) {
                    this.mMinorProviderList.add((MinorProvider) knitDataProviderC2);
                } else {
                    LogUtil.g(TAG, "not major or minor provider");
                }
            }
            if (this.mMajorProvider != null) {
                Iterator<MinorProvider> it3 = this.mMinorProviderList.iterator();
                while (it3.hasNext()) {
                    this.mMajorProvider.registerMinorProvider(it3.next());
                }
            }
        }
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public MajorProvider getMajorProvider() {
        return this.mMajorProvider;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public List<MinorProvider> getMinorProviderList() {
        return this.mMinorProviderList;
    }

    protected void loadMarketingTwo(Consumer<List<SectionBean>> consumer, FragmentManager fragmentManager) {
        ArrayList<Integer> integerArrayList;
        ArrayList arrayList = new ArrayList();
        int i = this.mResPosId;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
        Bundle bundle = this.mExtra;
        if (bundle != null) {
            integerArrayList = bundle.getIntegerArrayList(KEY_EXTRA_RES_POS_ID_LIST);
            this.mDelayTimeMillis = this.mExtra.getLong(KEY_DELAY_TIME_MILLIS);
            this.mH5ObserverKey = this.mExtra.getString(KET_H5_OBSERVER_KEY, "");
            this.mH5ObserverHashCode = this.mExtra.getInt(KET_H5_OBSERVER_HASH_CODE);
        } else {
            integerArrayList = null;
        }
        Bundle bundle2 = this.mExtra;
        boolean z = bundle2 != null && bundle2.getBoolean(KET_EXTRA_IS_SET_BI_ON_VISIBLE, false);
        if (!njy.e(integerArrayList)) {
            arrayList.addAll(integerArrayList);
        }
        boolean zB = foj.b(getPageCategory());
        if (fua.i() && fog.a(getPageType())) {
            requestDataByBff(consumer, arrayList, z, zB);
        } else {
            loadMarketing(consumer, fragmentManager, arrayList, z, zB);
        }
    }

    private void loadMarketing(Consumer<List<SectionBean>> consumer, FragmentManager fragmentManager, List<Integer> list, boolean z, boolean z2) {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            consumer.accept(null);
            return;
        }
        String strC = foj.c(list);
        String strA = foj.b().a(strC);
        Map<Integer, ResourceResultInfo> map = (Map) peh.d(strA, new TypeToken<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.health.knit.section.listener.BasePageResTrigger.2
        }.getType());
        boolean z3 = (!z2 || map == null || map.isEmpty() || fragmentManager == null || !VersionControlUtil.isSupportOperationAccount()) ? false : true;
        if (z3) {
            LogUtil.a(TAG, "use cache data:", Integer.valueOf(this.mResPosId), " resPosIdList: ", list);
            handleMarketingSection(map, marketingApi, list, consumer, fragmentManager, z);
        }
        a aVar = new a(this, fragmentManager, consumer, list, marketingApi, z);
        if (z3) {
            d dVar = new d(this, false);
            dVar.d(aVar, marketingApi, list, strC, strA);
            this.mTimer.schedule(dVar, 5000L);
        } else if (!TextUtils.isEmpty(this.mH5ObserverKey)) {
            requestResByObserver(list, aVar, marketingApi, map, strC);
        } else {
            if (this.mDelayTimeMillis > 0) {
                d dVar2 = new d(this, false);
                dVar2.d(aVar, marketingApi, list, strC, "");
                this.mTimer.schedule(dVar2, this.mDelayTimeMillis);
                return;
            }
            requestRes(aVar, marketingApi, list, strC, "");
        }
    }

    private void requestResByObserver(final List<Integer> list, final a aVar, final MarketingApi marketingApi, final Map<Integer, ResourceResultInfo> map, final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mH5ProEventHubObserver == null) {
            this.mH5ProEventHubObserver = new H5ProEventHubObserver() { // from class: com.huawei.health.knit.section.listener.BasePageResTrigger.3
                @Override // com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver
                public void onEventChanged(String str2) {
                    LogUtil.a(BasePageResTrigger.R_TAG, "onEventChanged cost time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    H5ProEventHubManager.removeObserver(BasePageResTrigger.this.mH5ObserverKey, this);
                    BasePageResTrigger.this.requestRes(aVar, marketingApi, (List<Integer>) list, (Map<Integer, ResourceResultInfo>) map, str);
                }

                public int hashCode() {
                    return BasePageResTrigger.this.mH5ObserverHashCode;
                }
            };
        }
        H5ProEventHubManager.addObserver(this.mH5ObserverKey, this.mH5ProEventHubObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestRes(a aVar, MarketingApi marketingApi, List<Integer> list, Map<Integer, ResourceResultInfo> map, String str) {
        if (aVar == null || marketingApi == null || list == null || map == null) {
            return;
        }
        ReleaseLogUtil.c(R_TAG, "requestRes mH5ObserverKey: ", this.mH5ObserverKey);
        requestRes(aVar, marketingApi, list, str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestRes(a aVar, MarketingApi marketingApi, List<Integer> list, String str, String str2) {
        ReleaseLogUtil.c(R_TAG, "begin to request market");
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(list);
        aVar.d(str, str2);
        resourceResultInfo.addOnSuccessListener(aVar);
        OnFailureListener onFailureListener = this.mFailureListener;
        if (onFailureListener != null) {
            resourceResultInfo.addOnFailureListener(onFailureListener);
        }
    }

    private void requestDataByBff(Consumer<List<SectionBean>> consumer, List<Integer> list, boolean z, boolean z2) {
        String strC = foj.c(list);
        String strA = foj.b().a(strC);
        if (!z2 || TextUtils.isEmpty(strA)) {
            if (this.mDelayTimeMillis > 0) {
                d dVar = new d(this, true);
                dVar.a(consumer, strC, list, z, z2);
                this.mTimer.schedule(dVar, this.mDelayTimeMillis);
                return;
            }
            requestResource(consumer, strC, list, z, z2);
            return;
        }
        ReleaseLogUtil.c(TAG, "use cache data:", Integer.valueOf(this.mResPosId), " resPosIdList: ", list);
        try {
            m1120xeadfba93(consumer, list, z, new JSONObject(strA));
        } catch (JSONException e) {
            int i = this.mResPosId;
            ReleaseLogUtil.d(TAG, "use cache handleResponse failed with exception:", Integer.valueOf(i), " resPosIdList: ", list, " exception: ", ExceptionUtils.c(e));
        }
        d dVar2 = new d(this, true);
        dVar2.a(consumer, strC, list, z, true);
        this.mTimer.schedule(dVar2, 5000L);
    }

    static class d extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7534c;
        private boolean d;
        private Consumer<List<SectionBean>> e;
        private boolean f;
        private MarketingApi g;
        private List<Integer> h;
        private a i;
        private final WeakReference<BasePageResTrigger> j;

        d(BasePageResTrigger basePageResTrigger, boolean z) {
            this.j = new WeakReference<>(basePageResTrigger);
            this.f7534c = z;
        }

        public void a(Consumer<List<SectionBean>> consumer, String str, List<Integer> list, boolean z, boolean z2) {
            this.e = consumer;
            this.f7532a = str;
            this.h = list;
            this.d = z;
            this.f = z2;
        }

        public void d(a aVar, MarketingApi marketingApi, List<Integer> list, String str, String str2) {
            this.i = aVar;
            this.g = marketingApi;
            this.h = list;
            this.f7532a = str;
            this.f7533b = str2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BasePageResTrigger basePageResTrigger = this.j.get();
            if (basePageResTrigger == null) {
                ReleaseLogUtil.c(BasePageResTrigger.R_TAG, "trigger is null");
            } else if (this.f7534c) {
                basePageResTrigger.requestResource(this.e, this.f7532a, this.h, this.d, this.f);
            } else {
                basePageResTrigger.requestRes(this.i, this.g, this.h, this.f7532a, this.f7533b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestResource(final Consumer<List<SectionBean>> consumer, final String str, final List<Integer> list, final boolean z, final boolean z2) {
        ReleaseLogUtil.c(TAG, "begin to request bff");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final String strA = foj.b().a(str);
        fog.d(this.mContextRef, list, new IResourceRequestCallback() { // from class: com.huawei.health.knit.section.listener.BasePageResTrigger.1
            @Override // com.huawei.health.knit.bff.impl.IResourceRequestCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a(BasePageResTrigger.TAG, "bff total time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                if (jSONObject == null) {
                    LogUtil.a(BasePageResTrigger.TAG, "response is null");
                    consumer.accept(null);
                    return;
                }
                LogUtil.a(BasePageResTrigger.TAG, "response: ", jSONObject.toString());
                if (z2) {
                    foj.b().b(str, jSONObject.toString());
                    if (jSONObject.toString().equals(strA)) {
                        ReleaseLogUtil.c(BasePageResTrigger.TAG, "bff response is not changed", list);
                        return;
                    } else if (!TextUtils.isEmpty(strA)) {
                        ReleaseLogUtil.c(BasePageResTrigger.TAG, "bff response has changed");
                        return;
                    }
                }
                BasePageResTrigger.this.m1120xeadfba93(consumer, list, z, jSONObject);
            }

            @Override // com.huawei.health.knit.bff.impl.IResourceRequestCallback
            public void onFailure(int i, String str2) {
                LogUtil.a(BasePageResTrigger.TAG, "errCode: ", Integer.valueOf(i), ", errInfo: ", str2);
                BasePageResTrigger basePageResTrigger = BasePageResTrigger.this;
                basePageResTrigger.m1120xeadfba93(consumer, list, z, basePageResTrigger.getEmptyResponse());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleResponse, reason: merged with bridge method [inline-methods] */
    public void m1120xeadfba93(final Consumer<List<SectionBean>> consumer, final List<Integer> list, final boolean z, final JSONObject jSONObject) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fsl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34484c.m1120xeadfba93(consumer, list, z, jSONObject);
                }
            });
            return;
        }
        final ArrayList arrayList = new ArrayList(0);
        foi.b(jSONObject, list, z, this, consumer, arrayList);
        HandlerExecutor.b(new Runnable() { // from class: fsk
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m1121xf0e385f2(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$handleResponse$1$com-huawei-health-knit-section-listener-BasePageResTrigger, reason: not valid java name */
    public /* synthetic */ void m1121xf0e385f2(List list) {
        this.mMarketingViewList = new ArrayList(list);
    }

    static class a implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<FragmentManager> f7529c;
        private final Consumer<List<SectionBean>> d;
        private boolean e;
        private final WeakReference<BasePageResTrigger> h;
        private final List<Integer> i;
        private MarketingApi j;

        public a(BasePageResTrigger basePageResTrigger, FragmentManager fragmentManager, Consumer<List<SectionBean>> consumer, List<Integer> list, MarketingApi marketingApi, boolean z) {
            this.h = new WeakReference<>(basePageResTrigger);
            this.f7529c = new WeakReference<>(fragmentManager);
            this.d = consumer;
            this.i = list;
            this.j = marketingApi;
            this.e = z;
        }

        public void d(String str, String str2) {
            this.f7527a = str;
            this.f7528b = str2;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
            final BasePageResTrigger basePageResTrigger = this.h.get();
            if (basePageResTrigger == null) {
                return;
            }
            if (map == null) {
                LogUtil.e(BasePageResTrigger.TAG, "no section map for ", this.i);
                this.d.accept(null);
                return;
            }
            if (foj.b(basePageResTrigger.getPageCategory())) {
                String strC = peh.c(map);
                foj.b().b(this.f7527a, strC);
                if (!strC.equals(this.f7528b)) {
                    if (basePageResTrigger.mFirstTimeVisible && !TextUtils.isEmpty(this.f7528b)) {
                        basePageResTrigger.mNeedRefresh = true;
                        basePageResTrigger.mConsumer = new Consumer() { // from class: com.huawei.health.knit.section.listener.BasePageResTrigger.a.5
                            @Override // androidx.core.util.Consumer
                            public void accept(Object obj) {
                                LogUtil.a(BasePageResTrigger.R_TAG, "begin consumer");
                                BasePageResTrigger basePageResTrigger2 = basePageResTrigger;
                                if (basePageResTrigger2 != null) {
                                    basePageResTrigger2.handleMarketingSection(map, a.this.j, a.this.i, a.this.d, (FragmentManager) a.this.f7529c.get(), a.this.e);
                                } else {
                                    ReleaseLogUtil.d(BasePageResTrigger.R_TAG, "consumer accept");
                                }
                            }
                        };
                        ReleaseLogUtil.c(BasePageResTrigger.R_TAG, "first request, show next visible");
                        return;
                    }
                } else {
                    ReleaseLogUtil.d(BasePageResTrigger.R_TAG, "resource not changed: ", this.i);
                    return;
                }
            }
            basePageResTrigger.handleMarketingSection(map, this.j, this.i, this.d, this.f7529c.get(), this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMarketingSection(Map<Integer, ResourceResultInfo> map, MarketingApi marketingApi, List<Integer> list, Consumer<List<SectionBean>> consumer, FragmentManager fragmentManager, boolean z) {
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
        if (mapFilterMarketingRules == null) {
            LogUtil.e(TAG, "no section map for ", list, ", after ruling");
            consumer.accept(null);
            return;
        }
        Context context = this.mContextRef.get();
        if (context == null) {
            LogUtil.e(TAG, "loadMarketingTwo failed, cause context is null!");
            return;
        }
        this.mMarketingViewList = marketingApi.getMarketingViewList(context, mapFilterMarketingRules, fragmentManager);
        StringBuilder sb = new StringBuilder("views: ");
        List<View> list2 = this.mMarketingViewList;
        sb.append(list2 != null ? list2.size() : -1);
        LogUtil.a(R_TAG, sb.toString());
        List<SectionBean> arrayList = new ArrayList<>();
        for (Integer num : list) {
            int iIntValue = num.intValue();
            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(num);
            if (resourceResultInfo != null) {
                LogUtil.a(TAG, "resourceResultInfo: ", resourceResultInfo.toString());
                List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                if (njy.e(resources)) {
                    LogUtil.e(TAG, "no briefInfoList for ", num);
                } else {
                    List<SectionBean> listA = foi.a(resources, this.mMarketingViewList, z, getPageType(), this.mResPosId);
                    LogUtil.a(TAG, "request successfully sectionBeans size = ", Integer.valueOf(listA.size()));
                    arrayList.addAll(listA);
                }
            } else {
                LogUtil.e(TAG, "no resourceResultInfo for " + iIntValue);
            }
        }
        consumer.accept(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject getEmptyResponse() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("configurationData", (Object) null);
            jSONObject2.put("data", jSONObject);
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.a(TAG, "json exception");
            return jSONObject2;
        }
    }

    private void loadMarketingOne(Consumer<List<SectionBean>> consumer) {
        ConfiguredPageApi configuredPageApi = (ConfiguredPageApi) Services.d("Main", ConfiguredPageApi.class);
        if (configuredPageApi == null) {
            return;
        }
        Context context = this.mContextRef.get();
        if (context == null) {
            LogUtil.e(TAG, "loadMarketingOne failed, cause context is null!");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i = this.mExtra.getInt(KEY_EXTRA_MARKETING_ONE_PAGE_TYPE, 0);
        configuredPageApi.initOperationConfiguredPage(i, linearLayout, null);
        ResourceBriefInfo.Builder builder = new ResourceBriefInfo.Builder();
        builder.setContentType(0).setPriority(0);
        SectionBean sectionBean = new SectionBean(new ResourceBriefInfo(builder), (View) linearLayout, i, 0, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sectionBean);
        consumer.accept(arrayList);
    }

    public void setCacheBeansList(List<SectionBean> list) {
        if (njy.e(list)) {
            return;
        }
        List<SectionBean> list2 = this.mCacheBeansList;
        if (list2 == null) {
            this.mCacheBeansList = new ArrayList();
        } else {
            list2.clear();
        }
        this.mCacheBeansList.addAll(list);
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public boolean isUsingCacheBeanList() {
        return njy.b(this.mCacheBeansList);
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageLoadOnlineSections(Consumer<List<SectionBean>> consumer, FragmentManager fragmentManager) {
        if (this.mCacheBeansList != null) {
            consumer.accept(new ArrayList(this.mCacheBeansList));
            return;
        }
        if (!CommonUtil.ab((Context) null)) {
            LogUtil.j(TAG, "onPageLoadOnlineSections Network not connected");
            SectionBean sectionBean = new SectionBean(9999, 1, 0, (KnitDataProvider) null, 0);
            HashMap<String, Object> map = new HashMap<>();
            map.put("POSITION_ID", Integer.valueOf(this.mResPosId));
            sectionBean.c(map);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(sectionBean);
            consumer.accept(arrayList);
            return;
        }
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            loadMarketingOne(consumer);
        } else {
            loadMarketingTwo(consumer, fragmentManager);
        }
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public int getResPosId() {
        return this.mResPosId;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public IPageResTrigger setExtra(Bundle bundle) {
        if (this.mExtra != null && bundle != null && !bundle.isEmpty()) {
            this.mExtra.putAll(bundle);
        }
        return this;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public Bundle getExtra() {
        return this.mExtra;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public boolean isNeedToLoadEmptyLayout() {
        return this.mIsNeedToLoadEmptyLayout;
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public IPageResTrigger setIsNeedToLoadEmptyLayout(boolean z) {
        this.mIsNeedToLoadEmptyLayout = z;
        return this;
    }

    public int getPageType() {
        int i = this.mResPosId;
        if (i == 4015) {
            return 5;
        }
        if (i == 4016) {
            return 6;
        }
        if (i == 4019) {
            return 390;
        }
        if (i == 4020) {
            return 23;
        }
        if (i == 4040) {
            return 410;
        }
        if (i == 4060) {
            return 412;
        }
        if (i == 4061) {
            return 411;
        }
        LogUtil.j(TAG, "getPageType failed unknown resPosId = ", Integer.valueOf(i));
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResPosId);
        parcel.writeParcelable(this.mMarketingIdInfo, i);
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger
    public void onDestroy(Activity activity) {
        clearMarketingViewList();
        clearCacheBeansList();
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onCreate() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onCreate with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onCreate();
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onResume with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onResume();
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onPause() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onPause with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onPause();
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onStop with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onStop();
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        clearMarketingViewList();
        clearCacheBeansList();
        H5ProEventHubObserver h5ProEventHubObserver = this.mH5ProEventHubObserver;
        if (h5ProEventHubObserver != null) {
            H5ProEventHubManager.removeObserver(this.mH5ObserverKey, h5ProEventHubObserver);
            this.mH5ProEventHubObserver = null;
        }
    }

    private void clearMarketingViewList() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "no need to clearMarketingViewList, mMarketingViewList is null!");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onDestroy();
            }
        }
        this.mMarketingViewList.clear();
        this.mMarketingViewList = null;
        this.mConsumer = null;
    }

    private void clearCacheBeansList() {
        List<SectionBean> list = this.mCacheBeansList;
        if (list == null) {
            LogUtil.a(TAG, "no need to clearCacheBeansList, mCacheBeansList is null!");
        } else {
            list.clear();
            this.mCacheBeansList = null;
        }
    }

    @Override // com.huawei.health.knit.section.listener.IPageResTrigger, com.huawei.health.knit.data.IKnitLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(R_TAG, "onActivityResult");
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onDestroy with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onActivityResult(i, i2, intent);
            }
        }
    }

    private void refreshResource(boolean z) {
        if (!z && foj.b(getPageCategory())) {
            this.mFirstTimeVisible = false;
            return;
        }
        if (this.mNeedRefresh && z && !this.mFirstTimeVisible && foj.b(getPageCategory())) {
            this.mNeedRefresh = false;
            Consumer consumer = this.mConsumer;
            if (consumer != null) {
                consumer.accept(null);
                this.mConsumer = null;
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void setUserVisibleHint(boolean z) {
        LogUtil.a(R_TAG, "setUserVisibleHint,", Boolean.valueOf(z), Integer.valueOf(getPageType()));
        refreshResource(z);
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "setUserVisibleHint with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).setUserVisibleHint(z);
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onConfigurationChanged() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onConfigurationChanged with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onConfigurationChanged();
            }
        }
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onMultiWindowModeChanged() {
        List<View> list = this.mMarketingViewList;
        if (list == null) {
            LogUtil.a(TAG, "onConfigurationChanged with activity");
            return;
        }
        for (KeyEvent.Callback callback : list) {
            if (callback instanceof IKnitLifeCycle) {
                ((IKnitLifeCycle) callback).onMultiWindowModeChanged();
            }
        }
    }
}
