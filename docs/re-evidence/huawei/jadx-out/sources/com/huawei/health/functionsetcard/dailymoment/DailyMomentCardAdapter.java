package com.huawei.health.functionsetcard.dailymoment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback;
import com.huawei.health.marketing.datatype.ControlItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesapi.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.functionsetcard.view.RatioRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.ewm;
import defpackage.ewo;
import defpackage.ewx;
import defpackage.ewy;
import defpackage.ewz;
import defpackage.exa;
import defpackage.exe;
import defpackage.fac;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qji;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DailyMomentCardAdapter {
    public static final float d = BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_14dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<SingleDailyMomentContent> f6705c;
    private long f;
    private ResourceBriefInfo g;
    private DailyMomentViewHolder j;
    private Map<Integer, ewo> h = new HashMap();
    private boolean e = true;
    private final View.OnTouchListener i = new View.OnTouchListener() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (DailyMomentCardAdapter.this.j == null) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                DailyMomentCardAdapter.this.j.d();
            }
            if (action == 0) {
                DailyMomentCardAdapter.this.j.e();
            }
            return false;
        }
    };

    public DailyMomentCardAdapter(Context context) {
        this.f6704b = context;
    }

    public void b() {
        LogUtil.a("DailyMomentCardAdapter", "notifyDataSetChanged");
        DailyMomentViewHolder dailyMomentViewHolder = this.j;
        if (dailyMomentViewHolder == null || dailyMomentViewHolder.d == null) {
            return;
        }
        this.f6705c = ewm.d().b();
        this.j.d.notifyDataSetChanged();
        this.j.a();
    }

    public DailyMomentViewHolder c(ViewGroup viewGroup) {
        DailyMomentViewHolder dailyMomentViewHolder = new DailyMomentViewHolder(LayoutInflater.from(this.f6704b).inflate(com.huawei.health.servicesui.R.layout.daily_moment_card_layout, viewGroup, false));
        this.j = dailyMomentViewHolder;
        return dailyMomentViewHolder;
    }

    public void e(DailyMomentViewHolder dailyMomentViewHolder, final ewm ewmVar) {
        ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "onBindViewHolder, holder: ", dailyMomentViewHolder, ", dailyMomentManager: ", ewmVar);
        this.f = System.currentTimeMillis();
        this.f6705c = ewmVar.b();
        this.g = ewmVar.h();
        fac.b(this.f6704b, dailyMomentViewHolder.f6710c, null, true, true);
        dailyMomentViewHolder.c();
        dailyMomentViewHolder.f6709b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DailyMomentCardAdapter.this.d();
                ewmVar.f();
                ewz.e(DailyMomentCardAdapter.this.f6704b, AnalyticsValue.DAILY_MOMENT_11100303.value(), null, null);
                MarketingBiUtils.b(5001, DailyMomentCardAdapter.this.g, DailyMomentCardAdapter.this.f);
            }
        });
        lsy.a(new Runnable() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                if (exa.a(DailyMomentCardAdapter.this.f6704b, DailyMomentCardAdapter.this.f6705c) != 0) {
                    LogUtil.a("DailyMomentCardAdapter", "updateLatestShowTime failed");
                }
            }
        });
        List<SingleDailyMomentContent> list = this.f6705c;
        if (list != null) {
            int i = -1;
            for (SingleDailyMomentContent singleDailyMomentContent : list) {
                ewz.e(this.f6704b, AnalyticsValue.DAILY_MOMENT_11100305.value(), singleDailyMomentContent, null);
                i++;
                b(singleDailyMomentContent, 1, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SingleDailyMomentContent singleDailyMomentContent, int i, int i2) {
        if (this.g == null || singleDailyMomentContent == null) {
            LogUtil.a("DailyMomentCardAdapter", "setMarketingBiEvent briefInfo or singleDailyMomentContent is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("resourcePositionId", 5001);
        map.put("resourceId", this.g.getResourceId());
        map.put("resourceName", this.g.getResourceName());
        map.put("itemCardName", Integer.valueOf(singleDailyMomentContent.getThemeType()));
        map.put("itemId", singleDailyMomentContent.getItemId());
        map.put("smartRecommend", Boolean.valueOf(singleDailyMomentContent.isSmartRecommend()));
        map.put("algId", singleDailyMomentContent.getAlgId());
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        if (i == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.f));
            this.f = jCurrentTimeMillis;
        }
        lmf.d().e(BaseApplication.getContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, singleDailyMomentContent.getAbInfo(), 0);
    }

    public void e(int i, ewo ewoVar) {
        this.h.put(Integer.valueOf(i), ewoVar);
    }

    public void d() {
        Map<Integer, ewo> map = this.h;
        if (map == null) {
            return;
        }
        for (ewo ewoVar : map.values()) {
            if (ewoVar != null) {
                ewoVar.b();
            }
        }
    }

    public void a() {
        DailyMomentViewHolder dailyMomentViewHolder;
        List<SingleDailyMomentContent> list = this.f6705c;
        if ((list != null && list.size() <= 1) || (dailyMomentViewHolder = this.j) == null || dailyMomentViewHolder.h == null) {
            return;
        }
        this.e = true;
        this.j.h.setIsScroll(true);
        this.j.d();
    }

    public void e() {
        DailyMomentViewHolder dailyMomentViewHolder = this.j;
        if (dailyMomentViewHolder == null || dailyMomentViewHolder.h == null) {
            return;
        }
        this.e = false;
        this.j.h.setIsScroll(false);
        this.j.e();
    }

    public boolean c() {
        Map<Integer, ewo> map = this.h;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (ewo ewoVar : this.h.values()) {
            if (ewoVar != null && ewoVar.e()) {
                return true;
            }
        }
        return false;
    }

    public class DailyMomentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDotsPageIndicator f6708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f6709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RatioRelativeLayout f6710c;
        private e d;
        private HealthViewPager h;

        public DailyMomentViewHolder(View view) {
            super(view);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setLayoutParams(d(DailyMomentCardAdapter.this.f6704b));
                this.f6709b = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.close_button_layout);
                this.h = (HealthViewPager) view.findViewById(com.huawei.health.servicesui.R.id.daily_moment_view_pager);
                this.f6708a = (HealthDotsPageIndicator) view.findViewById(com.huawei.health.servicesui.R.id.daily_moment_card_dots);
                DailyMomentCardAdapter.this.f6703a = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.daily_moment_health_card);
                this.f6710c = (RatioRelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.daily_moment_root_layout);
                DailyMomentCardAdapter.this.f6703a.setForceClipRoundCorner(true);
            }
        }

        public void c() {
            e eVar = this.d;
            if (eVar != null) {
                eVar.notifyDataSetChanged();
                return;
            }
            e eVar2 = DailyMomentCardAdapter.this.new e(this.f6710c);
            this.d = eVar2;
            this.h.setAdapter(eVar2);
            ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "onBindViewHolder, mPageAdapter: ", this.d, ", mViewPager: ", this.h);
            if (!njy.e(DailyMomentCardAdapter.this.f6705c)) {
                this.h.setOffscreenPageLimit(DailyMomentCardAdapter.this.f6705c.size());
            }
            a();
            this.h.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.DailyMomentViewHolder.5
                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                }

                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    if (i != 1) {
                        return;
                    }
                    ewz.e(DailyMomentCardAdapter.this.f6704b, AnalyticsValue.DAILY_MOMENT_11100304.value(), null, null);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (DailyMomentCardAdapter.this.f6705c != null && DailyMomentCardAdapter.this.f6705c.size() > 1) {
                this.f6708a.setViewPager(this.h);
                this.f6708a.setVisibility(0);
                DailyMomentCardAdapter.this.a();
            } else {
                this.f6708a.setVisibility(4);
                DailyMomentCardAdapter.this.e();
            }
        }

        private RelativeLayout.LayoutParams d(Context context) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int iC = fac.c(context);
            layoutParams.bottomMargin = fac.c(context, fac.i(context));
            int i = iC / 2;
            layoutParams.setMarginStart(i);
            layoutParams.setMarginEnd(i);
            return layoutParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (DailyMomentCardAdapter.this.e && DailyMomentCardAdapter.this.f6705c != null && DailyMomentCardAdapter.this.j.f6708a != null && DailyMomentCardAdapter.this.j.f6708a.getVisibility() == 0) {
                if (DailyMomentCardAdapter.this.f6705c.size() > 1) {
                    DailyMomentCardAdapter.this.j.f6708a.b(3000);
                } else {
                    DailyMomentCardAdapter.this.j.f6708a.d();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            if (DailyMomentCardAdapter.this.j.f6708a == null || DailyMomentCardAdapter.this.j.f6708a.getVisibility() != 0) {
                return;
            }
            DailyMomentCardAdapter.this.j.f6708a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public class e extends HealthPagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RatioRelativeLayout f6712a;

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        e(RatioRelativeLayout ratioRelativeLayout) {
            this.f6712a = ratioRelativeLayout;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
            if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            if (DailyMomentCardAdapter.this.f6705c != null) {
                return DailyMomentCardAdapter.this.f6705c.size();
            }
            return 0;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "instantiateItem, index = " + i);
            if (njy.e(DailyMomentCardAdapter.this.f6705c, i)) {
                return new Object();
            }
            if (viewGroup instanceof HealthViewPager) {
                SingleDailyMomentContent singleDailyMomentContent = (SingleDailyMomentContent) DailyMomentCardAdapter.this.f6705c.get(i);
                if (singleDailyMomentContent == null || singleDailyMomentContent.getCoverLinkType() == null) {
                    return new Object();
                }
                View viewB = b(singleDailyMomentContent, i);
                if (viewB == null) {
                    return new Object();
                }
                ((HealthViewPager) viewGroup).addView(viewB);
                return viewB;
            }
            return new Object();
        }

        private void a(final SingleDailyMomentContent singleDailyMomentContent, View view, final int i, View.OnClickListener onClickListener) {
            HealthButton healthButton = (HealthButton) view.findViewById(com.huawei.health.servicesui.R.id.action_button_text);
            if (singleDailyMomentContent == null || singleDailyMomentContent.getControlItem() == null) {
                healthButton.setVisibility(8);
                ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "dailyMomentData == null");
                return;
            }
            ControlItem controlItem = singleDailyMomentContent.getControlItem();
            ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "initButton ControlType : ", Integer.valueOf(controlItem.getControlType()));
            if (controlItem.getControlType() == 1) {
                b(singleDailyMomentContent, view, i, onClickListener);
                return;
            }
            if (controlItem.getControlType() == 2) {
                healthButton.setVisibility(0);
                final ImageView imageView = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.background_image);
                View.OnClickListener onClickListenerB = new View.OnClickListener() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.e.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        e.this.a(imageView, singleDailyMomentContent.getCoverPicture());
                        ewx.e(DailyMomentCardAdapter.this.f6704b, singleDailyMomentContent, i, DailyMomentCardAdapter.this.g);
                        ewz.e(DailyMomentCardAdapter.this.f6704b, AnalyticsValue.DAILY_MOMENT_11100307.value(), singleDailyMomentContent, null);
                        DailyMomentCardAdapter.this.b(singleDailyMomentContent, 2, i);
                    }
                };
                Activity activity = BaseApplication.getActivity();
                if (activity instanceof BaseActivity) {
                    onClickListenerB = qji.b(onClickListenerB, (BaseActivity) activity, true, "");
                }
                b(healthButton, singleDailyMomentContent);
                healthButton.setOnClickListener(onClickListenerB);
                healthButton.setOnTouchListener(DailyMomentCardAdapter.this.i);
                return;
            }
            healthButton.setVisibility(8);
        }

        private void b(SingleDailyMomentContent singleDailyMomentContent, View view, int i, View.OnClickListener onClickListener) {
            RelativeLayout relativeLayout;
            HealthButton healthButton = (HealthButton) view.findViewById(com.huawei.health.servicesui.R.id.action_button_text);
            ControlItem controlItem = singleDailyMomentContent.getControlItem();
            ViewStub viewStub = (ViewStub) view.findViewById(com.huawei.health.servicesui.R.id.daily_moment_button_layout);
            if (viewStub == null) {
                LogUtil.j("DailyMomentCardAdapter", "initButton ViewStub is loaded fail.");
                return;
            }
            try {
                relativeLayout = (RelativeLayout) viewStub.inflate();
            } catch (Resources.NotFoundException | InflateException | IllegalArgumentException | IllegalStateException e) {
                ReleaseLogUtil.a("UIHLH_DailyMomentCardAdapter", "inflate button layout error:", ExceptionUtils.c(e));
                relativeLayout = null;
            }
            if (relativeLayout == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            ImageView imageView = (ImageView) relativeLayout.findViewById(com.huawei.health.servicesui.R.id.daily_moment_media_button);
            exe.e(controlItem, imageView, false);
            imageView.setOnTouchListener(DailyMomentCardAdapter.this.i);
            relativeLayout.setVisibility(0);
            healthButton.setVisibility(8);
            new ewo(view, singleDailyMomentContent, i, DailyMomentCardAdapter.this);
        }

        private View b(final SingleDailyMomentContent singleDailyMomentContent, final int i) {
            ReleaseLogUtil.d("UIHLH_DailyMomentCardAdapter", "enter buildDailyMomentPage, position: ", Integer.valueOf(i), ", dataBean: ", singleDailyMomentContent.toString());
            View viewA = qre.a(DailyMomentCardAdapter.this.f6704b, com.huawei.health.servicesui.R.layout.daily_moment_card_page, (ViewGroup) null);
            if (viewA == null) {
                ReleaseLogUtil.a("UIHLH_DailyMomentCardAdapter", "buildDailyMomentPage NotFoundException.");
                return null;
            }
            final ImageView imageView = (ImageView) viewA.findViewById(com.huawei.health.servicesui.R.id.background_image);
            exe.b(singleDailyMomentContent.getCoverPicture(), imageView);
            View.OnClickListener onClickListenerB = new View.OnClickListener() { // from class: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter.e.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    e.this.a(imageView, singleDailyMomentContent.getCoverPicture());
                    ewx.c(DailyMomentCardAdapter.this.f6704b, singleDailyMomentContent, i, DailyMomentCardAdapter.this.g);
                    ewz.e(DailyMomentCardAdapter.this.f6704b, AnalyticsValue.DAILY_MOMENT_11100306.value(), singleDailyMomentContent, null);
                    DailyMomentCardAdapter.this.b(singleDailyMomentContent, 2, i);
                }
            };
            Activity activity = BaseApplication.getActivity();
            if (activity instanceof BaseActivity) {
                onClickListenerB = qji.b(onClickListenerB, (BaseActivity) activity, true, "");
            }
            if (!TextUtils.equals(SingleDailyMomentContent.SLEEP_MUSIC_TYPE, singleDailyMomentContent.getCoverLinkType()) || singleDailyMomentContent.getControlItem() == null || singleDailyMomentContent.getControlItem().getControlType() != 1) {
                viewA.setOnClickListener(onClickListenerB);
            }
            HealthTextView healthTextView = (HealthTextView) viewA.findViewById(com.huawei.health.servicesui.R.id.daily_moment_title);
            HealthTextView healthTextView2 = (HealthTextView) viewA.findViewById(com.huawei.health.servicesui.R.id.daily_moment_description);
            b(healthTextView, singleDailyMomentContent);
            c(healthTextView2, singleDailyMomentContent);
            a(singleDailyMomentContent, viewA, i, onClickListenerB);
            viewA.setOnTouchListener(DailyMomentCardAdapter.this.i);
            return viewA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ImageView imageView, String str) {
            if (!((imageView.getTag() instanceof Boolean) && ((Boolean) imageView.getTag()).booleanValue()) && CommonUtil.ab((Context) null)) {
                LogUtil.a("DailyMomentCardAdapter", "has no resource, reload");
                exe.b(str, imageView);
            }
        }

        private void b(HealthTextView healthTextView, SingleDailyMomentContent singleDailyMomentContent) {
            if (singleDailyMomentContent.getThemeVisibility()) {
                if (qrs.p()) {
                    healthTextView.setTextSize(1, 23.2f);
                }
                if (singleDailyMomentContent.getThemeType() == 1) {
                    ewy.b bVarE = ewy.e(DailyMomentCardAdapter.this.f6704b, singleDailyMomentContent, new AnonymousClass4(healthTextView));
                    LogUtil.a("DailyMomentCardAdapter", "return title: " + bVarE);
                    e(healthTextView, bVarE);
                    return;
                }
                if (singleDailyMomentContent.getThemeType() == 2) {
                    healthTextView.setText(singleDailyMomentContent.getCustomTheme());
                    return;
                } else {
                    LogUtil.j("DailyMomentCardAdapter", "theme type is invalid");
                    healthTextView.setVisibility(4);
                    return;
                }
            }
            healthTextView.setVisibility(4);
        }

        /* JADX INFO: renamed from: com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter$e$4, reason: invalid class name */
        public class AnonymousClass4 implements IGetTitleCallback {
            final /* synthetic */ HealthTextView d;

            AnonymousClass4(HealthTextView healthTextView) {
                this.d = healthTextView;
            }

            @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback
            public void onFailure(int i, String str) {
                LogUtil.a("DailyMomentCardAdapter", "getResourceDetail failed, errorCode: " + i);
            }

            @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback
            public void onSuccess(Object obj) {
                if (!(obj instanceof ewy.b)) {
                    LogUtil.j("DailyMomentCardAdapter", "getResourceDetail result is error");
                    return;
                }
                final ewy.b bVar = (ewy.b) obj;
                LogUtil.a("DailyMomentCardAdapter", "title string is set, result: " + bVar.c());
                final HealthTextView healthTextView = this.d;
                HandlerExecutor.b(new Runnable() { // from class: ewl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.e(healthTextView, bVar);
                    }
                });
            }

            public /* synthetic */ void e(HealthTextView healthTextView, ewy.b bVar) {
                e.this.e(healthTextView, bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(HealthTextView healthTextView, ewy.b bVar) {
            if (bVar == null || TextUtils.isEmpty(bVar.c())) {
                healthTextView.setText(com.huawei.ui.commonui.R.string.IDS_daily_title);
            } else {
                healthTextView.setText(bVar.c());
            }
        }

        private void c(HealthTextView healthTextView, SingleDailyMomentContent singleDailyMomentContent) {
            if (TextUtils.isEmpty(singleDailyMomentContent.getSubTheme()) || (singleDailyMomentContent.getSubThemeVisibility() != null && !singleDailyMomentContent.getSubThemeVisibility().booleanValue())) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
            if (qrs.p()) {
                healthTextView.setTextSize(1, 17.4f);
            }
            healthTextView.setText(singleDailyMomentContent.getSubTheme());
        }

        private void b(HealthButton healthButton, SingleDailyMomentContent singleDailyMomentContent) {
            ControlItem controlItem = singleDailyMomentContent.getControlItem();
            if (controlItem == null) {
                LogUtil.j("DailyMomentCardAdapter", "setButtonText controlItem is null");
                return;
            }
            healthButton.setText(controlItem.getButtonName());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f = DailyMomentCardAdapter.d;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
            if (!TextUtils.isEmpty(controlItem.getButtonColor())) {
                gradientDrawable.setColor(Color.parseColor(controlItem.getButtonColor()));
            } else {
                gradientDrawable.setColor(BaseApplication.getContext().getColor(com.huawei.health.servicesui.R.color.vip_open_button));
            }
            healthButton.setBackground(gradientDrawable);
            if (!TextUtils.isEmpty(controlItem.getFontColor())) {
                healthButton.setTextColor(Color.parseColor(controlItem.getFontColor()));
            } else {
                healthButton.setTextColor(BaseApplication.getContext().getColor(com.huawei.health.servicesui.R.color.common_colorAccent));
            }
            healthButton.setVisibility(0);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void startUpdate(ViewGroup viewGroup) {
            super.startUpdate(viewGroup);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void finishUpdate(ViewGroup viewGroup) {
            super.finishUpdate(viewGroup);
        }
    }
}
