package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.foj;
import defpackage.fsz;
import defpackage.fya;
import defpackage.qqt;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessEntranceProvider<T> extends BaseKnitDataProvider<T> {
    private static final String TAG = "FitnessEntranceProvider";
    protected T mData;
    protected boolean mIsLoad;
    private boolean mIsLogin = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
    private WeakReference<SectionBean> mSectionBeanWeakRef = new WeakReference<>(null);
    private String mPrivacyGoodsData = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "personalized_recommend");

    protected abstract int getCourseCategory();

    protected T getDefaultData() {
        return null;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public abstract String getLogTag();

    protected abstract int getPageType();

    protected abstract String getSubViewTitle();

    protected abstract int getType();

    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public abstract void loadData(Context context, SectionBean sectionBean);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public abstract void parseParams(Context context, HashMap<String, Object> map, T t);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return isCustomActive(context) && super.isActive(context);
    }

    public boolean isNeedUpdate() {
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "personalized_recommend");
        if (strE == null) {
            strE = "";
        }
        if (this.mPrivacyGoodsData == null) {
            this.mPrivacyGoodsData = "";
        }
        LogUtil.a(getLogTag(), "isLoad:", Boolean.valueOf(this.mIsLoad), " isLogin:", Boolean.valueOf(this.mIsLogin), " current login:", Boolean.valueOf(isLogined), " privacyGoodsData:", strE);
        if (this.mIsLoad && this.mIsLogin == isLogined && strE.equals(this.mPrivacyGoodsData)) {
            return false;
        }
        this.mIsLogin = isLogined;
        this.mPrivacyGoodsData = strE;
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mSectionBeanWeakRef = new WeakReference<>(sectionBean);
        T defaultData = getDefaultData();
        this.mData = defaultData;
        if (defaultData != null) {
            sectionBean.c(defaultData);
        } else {
            sectionBean.c((Object) null);
        }
        LogUtil.a(getLogTag(), "loadDefaultData cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    protected T getCacheData(Type type) {
        LogUtil.a(getLogTag(), "start to get cache");
        String strA = foj.b().a(getCacheKey());
        if (strA == null) {
            return null;
        }
        T t = (T) qqt.c(strA, type);
        LogUtil.a(getLogTag(), "end to get cache");
        return t;
    }

    protected String getCacheKey() {
        return foj.d(getLogTag() + LanguageUtil.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: updateCache, reason: merged with bridge method [inline-methods] */
    public void m1238x8a2b48e2(final T t) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: icx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.m1238x8a2b48e2(t);
                }
            });
        }
        LogUtil.a(getLogTag(), "updateCache result:", Boolean.valueOf(foj.b().b(getCacheKey(), qqt.b(t))));
    }

    protected boolean isDataUpdate(T t) {
        return !TextUtils.equals(qqt.b(t), qqt.b(this.mData));
    }

    public void checkAndUpdateUi(T t) {
        if (isDataUpdate(t)) {
            LogUtil.a(getLogTag(), " new data arrived");
            this.mData = t;
            SectionBean sectionBean = getSectionBean();
            if (sectionBean == null) {
                ReleaseLogUtil.e(getLogTag(), "Update Ui failed with sectionBean is null");
            } else {
                sectionBean.c(t);
            }
            m1238x8a2b48e2(t);
            return;
        }
        LogUtil.a(getLogTag(), " new data is same");
    }

    public SectionBean getSectionBean() {
        return this.mSectionBeanWeakRef.get();
    }

    protected fsz getTagData(int i) {
        Context context = BaseApplication.getContext();
        if (i == 1) {
            return new fsz(context.getString(R.string.IDS_sug_series_course_pay), context.getColor(R.color.emui_toolbar_icon_translucent), fya.d((HealthTextView) null, R.color.emui_subtab_text_on, 8));
        }
        if (i == 2) {
            return new fsz(context.getString(R.string.IDS_vip), context.getColor(R.color.emui_toolbar_icon_translucent), fya.d((HealthTextView) null, R.color.color_fitness_card_member_icon, 8));
        }
        return new fsz();
    }
}
