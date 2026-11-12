package com.huawei.health.knit.section.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qrs;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSection extends LinearLayout implements OnClickSectionListener, ViewTreeVisibilityListener.ViewTreeListenee {
    public static final String BIKE_STYLE = "BIKE_STYLE";
    public static final String CLIMB_STYLE = "CLIMB_STYLE";
    public static final String FITNESS_STYLE = "FITNESS_STYLE";
    public static final String GOLF_STYLE = "GOLF_STYLE";
    public static final String HIKE_STYLE = "HIKE_STYLE";
    public static final String INDOOR_RUN_STYLE = "INDOOR_RUN_STYLE";
    public static final String OUTDOOR_RUN_STYLE = "OUTDOOR_RUN_STYLE";
    public static final String ROPE_SKIPPING_STYLE = "ROPE_SKIPPING_STYLE";
    private static final String R_TAG = "R_Section_BaseSection";
    private static final String TAG = "Section_BaseSection";
    public static final String WALK_STYLE = "WALK_STYLE";
    public static final String YOGA_STYLE = "YOGA_STYLE";
    private WeakReference<Context> mContextRef;
    private boolean mFirstBind;
    private boolean mHasSetBiEvent;
    private boolean mIsSupportShare;
    private KnitFragment mKnitFragment;
    private WeakReference<SectionBean> mSectionBeanRef;
    private View mView;
    private HashMap<String, Object> mViewMap;

    @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
    }

    protected abstract void bindParamsToView(HashMap<String, Object> map);

    public void clear() {
    }

    public abstract String getLogTag();

    protected boolean isSupportSafeRegion() {
        return true;
    }

    @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
    public void onClick(int i) {
    }

    @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
    public void onClick(int i, int i2) {
    }

    @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
    public void onClick(int i, String str) {
    }

    @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
    public void onClick(String str) {
    }

    public abstract View onCreateView(Context context);

    protected void overrideParamsByOnlineData(SectionBean sectionBean, HashMap<String, Object> map) {
    }

    public void setViewSHow(int i) {
    }

    public BaseSection(Context context) {
        super(context);
        this.mFirstBind = true;
        this.mViewMap = new HashMap<>();
        this.mIsSupportShare = true;
        this.mSectionBeanRef = new WeakReference<>(null);
        this.mHasSetBiEvent = false;
        init();
    }

    public BaseSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFirstBind = true;
        this.mViewMap = new HashMap<>();
        this.mIsSupportShare = true;
        this.mSectionBeanRef = new WeakReference<>(null);
        this.mHasSetBiEvent = false;
        init();
    }

    public BaseSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFirstBind = true;
        this.mViewMap = new HashMap<>();
        this.mIsSupportShare = true;
        this.mSectionBeanRef = new WeakReference<>(null);
        this.mHasSetBiEvent = false;
        init();
    }

    private void init() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        configLayoutParameters(layoutParams);
        setLayoutParams(layoutParams);
    }

    protected void configLayoutParameters(LinearLayout.LayoutParams layoutParams) {
        if (isSupportSafeRegion()) {
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            layoutParams.setMarginStart(((Integer) safeRegionWidth.first).intValue());
            layoutParams.setMarginEnd(((Integer) safeRegionWidth.second).intValue());
        }
    }

    public void setViewMap(HashMap<String, Object> map) {
        this.mViewMap = map;
    }

    public void initView(KnitFragment knitFragment, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mKnitFragment = knitFragment;
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j(TAG, "activity is finishing");
                return;
            }
        }
        try {
            this.mView = onCreateView(context);
            ReleaseLogUtil.c(R_TAG, "initView create view time cost ,", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (this.mView == this) {
                throw new IllegalStateException("do not pass true(3rd parameter) during inflating view which you implement in onCreateView()");
            }
            SectionBean sectionBean = this.mSectionBeanRef.get();
            if (sectionBean != null) {
                onBind(sectionBean);
                knitFragment.refreshRecyclerView();
            }
            ReleaseLogUtil.c(R_TAG, "initView bind time cost ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (NullPointerException e) {
            LogUtil.e(TAG, "onCreateView exception ", ExceptionUtils.c(e));
        }
    }

    public void onBind(SectionBean sectionBean) {
        LogUtil.a(TAG, "onBind");
        if (sectionBean == null) {
            LogUtil.e(TAG, "onBind failed, sectionBean is null!!");
            return;
        }
        if (this.mSectionBeanRef.get() == null) {
            this.mSectionBeanRef = new WeakReference<>(sectionBean);
        }
        sectionBean.d(this);
        View viewQ = this.mView;
        if (viewQ == null) {
            viewQ = sectionBean.q();
        }
        if (viewQ == null) {
            LogUtil.e(TAG, "onBind failed, has no view onBind just return!");
            return;
        }
        ViewParent parent = viewQ.getParent();
        if (parent != this) {
            removeAllViews();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewQ);
            }
            addView(viewQ);
        }
        if (this.mView == null) {
            LogUtil.e(TAG, "onBind failed no mView, just return!");
            return;
        }
        HashMap<String, Object> mapA = sectionBean.a();
        if (mapA != null && this.mFirstBind) {
            this.mViewMap.putAll(mapA);
        }
        KnitDataProvider knitDataProviderC = sectionBean.c();
        if (knitDataProviderC != null && sectionBean.d() != null) {
            knitDataProviderC.parseParams(getContextRef(), this.mViewMap, sectionBean.d());
        }
        overrideParamsByOnlineData(sectionBean, this.mViewMap);
        bindParamsToView(this.mViewMap);
        this.mFirstBind = false;
    }

    protected Context getContextRef() {
        if (this.mContextRef == null) {
            this.mContextRef = new WeakReference<>(getContext());
        }
        Context context = this.mContextRef.get();
        return context == null ? BaseApplication.getContext() : context;
    }

    public KnitFragment getKnitFragment() {
        return this.mKnitFragment;
    }

    public HashMap<String, Object> getViewMap() {
        return this.mViewMap;
    }

    public void setView(View view) {
        this.mView = view;
    }

    public View getView() {
        return this.mView;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.section_sub_header) {
            onClick("MORE_CLICK_EVENT");
        } else {
            LogUtil.e("view id is invalid", new Object[0]);
        }
    }

    public List<Bitmap> getShareBitmap() {
        ArrayList arrayList = new ArrayList();
        if (isSupportShare()) {
            boolean zIsShareNeedRelayout = isShareNeedRelayout();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue();
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd);
            int iIntValue = ((Integer) safeRegionWidth.second).intValue();
            if (zIsShareNeedRelayout) {
                measure(View.MeasureSpec.makeMeasureSpec((qrs.q() - dimensionPixelSize) - (dimensionPixelSize2 + iIntValue), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            int height = getHeight();
            int i = getContext().getResources().getDisplayMetrics().widthPixels;
            if (height != 0 && i != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.save();
                canvas.translate(dimensionPixelSize, 0.0f);
                draw(canvas);
                arrayList.add(bitmapCreateBitmap);
                canvas.restore();
            }
        }
        return arrayList;
    }

    public boolean isShareNeedRelayout() {
        return (getVisibility() & 12) != 0;
    }

    public boolean isSupportShare() {
        return this.mIsSupportShare;
    }

    public void setSupportShare(boolean z) {
        this.mIsSupportShare = z;
    }

    @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void checkVisibilityAndSetBiEvent() {
        if (!ViewTreeVisibilityListener.c(this) || this.mHasSetBiEvent) {
            return;
        }
        biEvent();
        this.mHasSetBiEvent = true;
    }

    @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public boolean hasSetBiEvent() {
        return this.mHasSetBiEvent;
    }
}
