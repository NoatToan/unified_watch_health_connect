package com.huawei.ui.main.stories.oa.goodthingsrecommended.provider;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.ui.main.R;
import defpackage.buh;
import defpackage.fxl;
import defpackage.njy;
import defpackage.qqt;
import defpackage.vyk;
import defpackage.vyp;
import defpackage.vyr;
import defpackage.vyv;
import defpackage.vyw;
import defpackage.vyz;
import defpackage.vzd;
import defpackage.vzg;
import defpackage.vzh;
import defpackage.vzi;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public abstract class GoodThingsGridProvider extends BaseKnitDataProvider<vzi> {
    private static final String NO_INTERESTING_CLICK_INFO_PRODUCT_SCENARIO = "NO_INTRSTING_CLICK_INFO_RRODUCT_SCENARIO";
    private static final int ONE_PAGE_LIMIT = 3;
    private static final String TAG = "GoodThingsGridProvider";
    private static final String USER_AGE = "GoodThingsGridProvider_user_age";
    private static final String USER_SEX = "GoodThingsGridProvider_user_sex";
    private BaseKnitDataProvider.c mClickSectionListener;
    private int mContentType;
    private HiUserInfo mHiUserInfo;
    private String mPetalOaid;
    protected int mResPosId;
    protected ResourceBriefInfo mResourceBriefInfo;
    private WeakReference<SectionBean> mSectionBeanRef;
    public long mShowStartTime;
    private vzh mTemplate;
    private String[] mUserLabel;
    private List<vzg> shoppingInfoItemList = new ArrayList();
    protected vyz mPaginationReq = new vyz(3);
    public vzd mPaginationRsp = new vzd();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (vzi) obj);
    }

    public GoodThingsGridProvider() {
        setIsActive(false);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f51744c.readCachParams();
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        super.loadData(context, sectionBean);
        if (isActive(null)) {
            return;
        }
        this.mSectionBeanRef = new WeakReference<>(sectionBean);
        if (processMarkingResource(sectionBean) && isNeedLoadData()) {
            LogUtil.a(TAG, "loadData");
            getNetData(sectionBean);
        }
    }

    private String[] getUserLabels() {
        String accountInfo = LoginInit.getInstance(null).getAccountInfo(1011);
        List<String> labels = ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getLabels(new ArrayList<String>() { // from class: com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider.1
            {
                add("health_sport_sleep_care");
                add("health_sport_sleep_quality");
                add("health_sport_weight_care");
                add("health_sport_weight_size");
                add("health_sport_heart_rate");
                add("health_sport_blood_oxygen");
            }
        }, accountInfo);
        return (String[]) labels.toArray(new String[labels.size()]);
    }

    private void generateUserInfoLabel() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new e(this));
    }

    static final class e implements HiCommonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<GoodThingsGridProvider> f28629a;

        public e(GoodThingsGridProvider goodThingsGridProvider) {
            this.f28629a = null;
            this.f28629a = new WeakReference<>(goodThingsGridProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            if (!(obj instanceof List) || i != 0) {
                LogUtil.j(GoodThingsGridProvider.TAG, "generateBmiLabel null");
                return;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                LogUtil.j(GoodThingsGridProvider.TAG, "generateBmiLabel userInfos empty");
                return;
            }
            LogUtil.a(GoodThingsGridProvider.TAG, "generateBmiLabel, userInfos.size() = ", Integer.valueOf(list.size()));
            HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
            GoodThingsGridProvider goodThingsGridProvider = this.f28629a.get();
            if (goodThingsGridProvider != null) {
                goodThingsGridProvider.mHiUserInfo = hiUserInfo;
                if (goodThingsGridProvider.mHiUserInfo == null || !goodThingsGridProvider.mHiUserInfo.isGenderValid()) {
                    return;
                }
                buh.d(GoodThingsGridProvider.USER_SEX, "" + goodThingsGridProvider.mHiUserInfo.getGender());
                buh.d(GoodThingsGridProvider.USER_AGE, "" + goodThingsGridProvider.mHiUserInfo.getAge());
                return;
            }
            LogUtil.e(GoodThingsGridProvider.TAG, "DataListener onSuccess abort, provider is null!");
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.e(GoodThingsGridProvider.TAG, "enter generateBmiLabel onFailure, errCode = ", Integer.valueOf(i), " errMsg = ", obj);
        }
    }

    protected void getNetData(final SectionBean sectionBean) {
        LogUtil.a(TAG, "getNetData");
        vyp.c().getShoppingInfoList(buildGetShoppingInfoListReq(), new UiCallback<vyw>() { // from class: com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a(GoodThingsGridProvider.TAG, "getShoppingInfoList onFailure ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(vyw vywVar) {
                List<vzg> listD = vywVar.d();
                LogUtil.a(GoodThingsGridProvider.TAG, "getShoppingInfoList success list is null ", Boolean.valueOf(njy.e(listD)));
                if (njy.e(listD)) {
                    return;
                }
                GoodThingsGridProvider.this.setIsActive(true);
                vzi vziVar = new vzi();
                vziVar.d(listD);
                GoodThingsGridProvider.this.mPaginationRsp = vywVar.a();
                sectionBean.c(vziVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readCachParams() {
        this.mPetalOaid = vyk.e().get("OAID");
        this.mUserLabel = getUserLabels();
        generateUserInfoLabel();
    }

    protected vyv buildGetShoppingInfoListReq() {
        int gender;
        int age;
        String phoneType = PhoneInfoUtils.getPhoneType();
        String deviceId = LoginInit.getInstance(BaseApplication.getContext()).getDeviceId();
        HiUserInfo hiUserInfo = this.mHiUserInfo;
        int i = 2;
        if (hiUserInfo != null && hiUserInfo.isGenderValid()) {
            gender = this.mHiUserInfo.getGender();
            age = this.mHiUserInfo.getAge();
        } else {
            String strE = buh.e(USER_SEX);
            String strE2 = buh.e(USER_AGE);
            try {
                gender = Integer.parseInt(strE);
                try {
                    age = Integer.parseInt(strE2);
                } catch (NumberFormatException unused) {
                    LogUtil.e(TAG, "USER_SEX or USER_AGE NumberFormatException");
                    age = 1;
                }
            } catch (NumberFormatException unused2) {
                gender = 2;
            }
        }
        if (gender >= 0 && gender <= 2) {
            i = gender;
        }
        int i2 = age >= 1 ? age : 1;
        if (TextUtils.isEmpty(this.mPetalOaid)) {
            this.mPetalOaid = "0";
        }
        return new vyv.d().e(phoneType).b(deviceId).d(this.mPetalOaid).a(i).c(this.mUserLabel).c(this.mTemplate.g()).a(HiDateUtil.c((String) null)).c(i2).b(this.mPaginationReq).b(this.mTemplate.d()).c();
    }

    public void parseParams(Context context, HashMap<String, Object> map, vzi vziVar) {
        super.parseParams(context, map, vziVar);
        LogUtil.a(TAG, "parseParams");
        map.put("TITLE", this.mTemplate.c());
        map.put("SUBTITLE", this.mTemplate.i());
        if (this.mContentType == 102) {
            map.put("RECYCLER_LIST_ITEM_RESID", Integer.valueOf(R.layout.section1_1list_02_item_02));
            map.put("RECYCLER_LAYOUT_MANAGER_ORITENTION", 0);
            map.put("HORIZONTAL_DATA_ITEM_SIZE", Integer.valueOf(this.shoppingInfoItemList.size()));
            this.shoppingInfoItemList.addAll(vziVar.a());
            vziVar.d(this.shoppingInfoItemList);
            LogUtil.a(TAG, "Horizontal list size: ", Integer.valueOf(vziVar.d().size()));
        } else {
            this.shoppingInfoItemList.clear();
            LogUtil.a(TAG, "Vertical list size: ", Integer.valueOf(vziVar.d().size()));
        }
        vziVar.c(this.mTemplate.f());
        map.put("HORIZONTAL_DATA_HAS_NEXT", Boolean.valueOf(TextUtils.isEmpty(this.mPaginationRsp.c())));
        map.put("RECYCLER_LIST", vziVar.d());
        ResourceBriefInfo resourceBriefInfo = this.mResourceBriefInfo;
        if (resourceBriefInfo != null) {
            map.put("RESOURCE_NAME", resourceBriefInfo.getResourceName());
            map.put("RESOURCE_ID", this.mResourceBriefInfo.getResourceId());
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(this.mResourceBriefInfo.getSmartRecommend()));
        }
        map.put("pullOrder", 1);
        map.put("POSITION_ID", Integer.valueOf(this.mResPosId));
        if (this.mTemplate.e() == 0) {
            map.put("SUBHEADER_ACTION_TEXT", null);
        }
        setClickListener(context, map, vziVar);
    }

    private void setClickListener(final Context context, HashMap<String, Object> map, final vzi vziVar) {
        BaseKnitDataProvider.c cVar = new BaseKnitDataProvider.c() { // from class: com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider.4
            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                super.onClick(str);
                if ("SUBHEADER_ACTION_CLICKED".equals(str)) {
                    GoodThingsGridProvider.this.onNoInterestButtonClicked();
                } else if ("BOTTOM_BUTTON_CLICKED".equals(str)) {
                    GoodThingsGridProvider.this.onChangeBatchButtonClicked();
                }
            }

            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                LogUtil.a(GoodThingsGridProvider.TAG, "onItem clicked");
                if (njy.e(vziVar.a(), i)) {
                    return;
                }
                GoodThingsGridProvider.this.jumpToShoppingInfoH5(context, vziVar.a().get(i), i);
            }
        };
        this.mClickSectionListener = cVar;
        map.put("CLICK_EVENT_LISTENER", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToShoppingInfoH5(Context context, vzg vzgVar, int i) {
        if (vzgVar.b() == null) {
            LogUtil.j(TAG, "jumpToShoppingInfoH5 url is null");
            return;
        }
        String strE = vzgVar.b().e();
        StringBuilder sb = new StringBuilder();
        sb.append(strE);
        sb.append(strE.contains("?") ? "&h5pro=true&isImmerse=true&isStartAtBottomOfStatusBar=true" : "?h5pro=true&isImmerse=true&isStartAtBottomOfStatusBar=true");
        PluginOperation.getInstance(context).startOperationWebPage(sb.toString());
        fxl.d(this.mResPosId, this.mResourceBriefInfo, this.mShowStartTime, this.mTemplate.c(), false, i);
        this.mShowStartTime = System.currentTimeMillis();
    }

    protected void onNoInterestButtonClicked() {
        LogUtil.a(TAG, "onNoInterstButtonClicked");
        updateButtonClickedInfo();
        WeakReference<SectionBean> weakReference = this.mSectionBeanRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        setIsActive(false);
        this.mSectionBeanRef.get().c((Object) null);
    }

    protected void updateButtonClickedInfo() {
        vyr vyrVar;
        String strE = buh.e(getSharedPreferenceKey());
        if (TextUtils.isEmpty(strE)) {
            vyrVar = new vyr(0, System.currentTimeMillis());
        } else {
            vyrVar = (vyr) qqt.e(strE, vyr.class);
        }
        vyrVar.b(vyrVar.b() + 1);
        vyrVar.b(System.currentTimeMillis());
        buh.d(getSharedPreferenceKey(), qqt.b(vyrVar));
    }

    protected void updatePaginationRsp() {
        int i;
        if (this.mPaginationRsp.c() != null) {
            String strC = this.mPaginationRsp.c();
            try {
                i = Integer.parseInt(strC);
            } catch (NumberFormatException unused) {
                LogUtil.e(TAG, "nextStr NumberFormatException ", strC);
                i = 1;
            }
        } else {
            i = 1;
        }
        int i2 = i >= 1 ? i : 1;
        this.mPaginationReq.b("" + i2);
    }

    protected void onChangeBatchButtonClicked() {
        LogUtil.a(TAG, "onChangeBatchButtonClicked");
        updatePaginationRsp();
        WeakReference<SectionBean> weakReference = this.mSectionBeanRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        getNetData(this.mSectionBeanRef.get());
    }

    protected String getSharedPreferenceKey() {
        return NO_INTERESTING_CLICK_INFO_PRODUCT_SCENARIO + this.mTemplate.g() + this.mResPosId;
    }

    private boolean isNeedLoadData() {
        if (this.mTemplate.e() == 0) {
            return true;
        }
        String strE = buh.e(getSharedPreferenceKey());
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        vyr vyrVar = (vyr) qqt.e(strE, vyr.class);
        return System.currentTimeMillis() - vyrVar.c() > (vyrVar.b() >= this.mTemplate.b() ? ((long) this.mTemplate.a()) * 2678400000L : 86400000L);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a(TAG, "loadDefaultData");
        HashMap<String, Object> map = new HashMap<>();
        map.put("RECYCLER_LIST_ITEM_RESID", Integer.valueOf(R.layout.section1_1list_02_item_01));
        map.put("BOTTOM_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_good_things_recommend_change_batch));
        map.put("IS_SUPPORT_SHARE", false);
        sectionBean.c(map);
    }

    private boolean processMarkingResource(SectionBean sectionBean) {
        ResourceContentBase content;
        vzh vzhVar;
        LogUtil.a(TAG, "processMarkingResource");
        ResourceBriefInfo resourceBriefInfoN = sectionBean.n();
        if (resourceBriefInfoN == null) {
            return false;
        }
        this.mResourceBriefInfo = resourceBriefInfoN;
        this.mContentType = resourceBriefInfoN.getContentType();
        this.mResPosId = sectionBean.o();
        int i = this.mContentType;
        if ((i != 102 && i != 103) || (content = resourceBriefInfoN.getContent()) == null || content.getContent() == null || (vzhVar = (vzh) qqt.e(content.getContent(), vzh.class)) == null) {
            return false;
        }
        this.mTemplate = vzhVar;
        this.mPaginationReq.e(vzhVar.j());
        return true;
    }
}
