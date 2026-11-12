package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import com.google.android.material.appbar.AppBarLayout;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.image.HMCircleImageView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.apprate.AppRateDialog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCoursePartnerInfo;
import com.xiaomi.hm.health.training.api.entity.PayOrderParams;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.SkusItem;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.eventbus.EventWebViewLoadFinish;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCourseDetailActivity;
import com.xiaomi.hm.health.training.ui.adapter.FeaturedCourseDetailPagerAdapter;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseIntroductionFragment;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseMoreActionFragment;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePayFragment;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.ui.helper.NetworkConfirmHelper;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import com.xiaomi.hm.health.training.ui.widget.SimpleToolbar;
import com.xiaomi.hm.health.training.ui.widget.WrapContentHeightViewPager;
import com.xiaomi.hm.health.training.utils.ExpiryUtils;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.TrainingCourseUtils;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final String EXTRA_FEATURED_COURSE_ID = "ARG_FEATURED_COURSE_ID";
    private static final String u0 = "Train-FeaturedCourseDetailActivity";
    private MagicIndicator A;
    private ImageView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private ImageView J;
    private LinearLayout K;
    private RelativeLayout L;
    private LinearLayout M;
    private TextView N;
    private LinearLayout O;
    private HMCircleImageView P;
    private TextView Q;
    private TextView R;
    private FeaturedCoursePartnerInfo S;
    private Context T;
    private FeaturedCourseDetailPagerAdapter U;
    private String V;
    private String W;
    private Float X;
    private SkusItem Y;
    private boolean Z;

    @Inject
    public ViewModelProvider.Factory m0;

    @Inject
    public NavigationController n0;
    private FeaturedCourseDetailViewModel o0;
    private LoadingDialogHelper p0;
    private AppBarLayout.OnOffsetChangedListener q0 = new a();
    private FragmentContainerHelper r0 = new FragmentContainerHelper();
    private FeaturedCourseMoreActionFragment s0;
    private FeaturedCoursePayFragment t0;
    private AppBarLayout x;
    private SimpleToolbar y;
    private WrapContentHeightViewPager z;

    public class a implements AppBarLayout.OnOffsetChangedListener {
        private int a;

        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int totalScrollRange = appBarLayout.getTotalScrollRange() / 2;
            FeaturedCourseDetailActivity.this.y.setAlpha((Math.abs(iAbs - totalScrollRange) * 1.0f) / totalScrollRange);
            if (this.a != i) {
                this.a = i;
                if (iAbs > totalScrollRange) {
                    FeaturedCourseDetailActivity.this.Z = true;
                    FeaturedCourseDetailActivity.this.y.setMainTitle(FeaturedCourseDetailActivity.this.W);
                    FeaturedCourseDetailActivity.this.y.setLeftIconDrawable(R.drawable.arrow_back_black);
                    if (FeaturedCourseDetailActivity.this.o0.getParticipateStatus()) {
                        FeaturedCourseDetailActivity.this.y.setRightIconDrawable(R.drawable.ic_more_black);
                        return;
                    }
                    return;
                }
                if (iAbs < totalScrollRange) {
                    FeaturedCourseDetailActivity.this.Z = false;
                    FeaturedCourseDetailActivity.this.y.setMainTitle("");
                    FeaturedCourseDetailActivity.this.y.setLeftIconDrawable(R.drawable.ic_back_white);
                    if (FeaturedCourseDetailActivity.this.o0.getParticipateStatus()) {
                        FeaturedCourseDetailActivity.this.y.setRightIconDrawable(R.drawable.ic_more_white);
                    }
                }
            }
        }
    }

    public class b extends CommonNavigatorAdapter {
        public final /* synthetic */ List b;

        public b(List list) {
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            FeaturedCourseDetailActivity.this.z.setCurrentItem(i);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            return this.b.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerIndicator getIndicator(Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineWidth(UIUtil.dip2px(context, 27.0d));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(FeaturedCourseDetailActivity.this.T, R.color.color_ff8810)));
            linePagerIndicator.setMode(2);
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerTitleView getTitleView(Context context, final int i) {
            SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
            simplePagerTitleView.setNormalColor(ContextCompat.getColor(FeaturedCourseDetailActivity.this.T, R.color.s1));
            simplePagerTitleView.setSelectedColor(ContextCompat.getColor(FeaturedCourseDetailActivity.this.T, R.color.color_ff8810));
            simplePagerTitleView.setText((CharSequence) this.b.get(i));
            simplePagerTitleView.setTextSize(13.0f);
            simplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.training.ui.activity.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
            return simplePagerTitleView;
        }
    }

    private void A0() {
        Loggers.getLogger().v(u0, new Supplier() { // from class: h02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.r0();
            }
        });
        new AlertDialogFragment.Builder(this).setNegativeButton(R.string.tr_purchase_course, new DialogInterface.OnClickListener() { // from class: n02
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.s0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.tr_exit_course, new DialogInterface.OnClickListener() { // from class: f02
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.t0(dialogInterface, i);
            }
        }).setMessage(R.string.tr_expired_course_tips).setCancelable(false).create().show(getSupportFragmentManager());
    }

    private void B0() {
        Loggers.getLogger().v(u0, new Supplier() { // from class: i02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.u0();
            }
        });
        new AlertDialogFragment.Builder(this).setNegativeButton(R.string.tr_learn_course, new DialogInterface.OnClickListener() { // from class: uz1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: o02
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setMessage(R.string.tr_join_course_failed_tips).setCancelable(false).create().show(getSupportFragmentManager());
    }

    private void C0() {
        if (this.o0.getParticipateStatus()) {
            this.y.setRightIconDrawable(this.Z ? R.drawable.ic_more_black : R.drawable.ic_more_white);
        } else {
            this.y.setRightIconDrawable(-1);
        }
    }

    private void D0(boolean z) {
        int visibility = this.L.getVisibility();
        this.L.setVisibility(z ? 0 : 8);
        int visibility2 = this.L.getVisibility();
        if (visibility == visibility2 || visibility2 != 0) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_VIEW_NUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())).addExtra("Source", TrainingAnalytics.ParamValue.PurchaseSource.DETAIL_BUTTON));
    }

    private void E0() {
        if (this.o0.getFreeStatus()) {
            if (this.o0.getParticipateStatus()) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
                this.M.setVisibility(0);
                D0(false);
            }
        } else if (!this.o0.getPurchaseStatus()) {
            this.K.setVisibility(0);
            this.M.setVisibility(8);
            D0(true);
        } else if (this.o0.getParticipateStatus()) {
            this.K.setVisibility(8);
        } else {
            this.K.setVisibility(0);
            this.M.setVisibility(0);
            D0(false);
        }
        G0();
    }

    private void F0(@Nullable FeaturedCourseDetail featuredCourseDetail) {
        if (featuredCourseDetail != null && featuredCourseDetail.isComplete) {
            Loggers.getLogger().i(u0, new Supplier() { // from class: c02
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return this.a.x0();
                }
            });
            if (!TextUtils.isEmpty(featuredCourseDetail.detailImgUrl)) {
                OtherUtils.loadWithGlide(this, this.B, featuredCourseDetail.detailImgUrl);
            }
            if (!TextUtils.isEmpty(featuredCourseDetail.name)) {
                String str = featuredCourseDetail.name;
                this.W = str;
                this.C.setText(str);
                if (this.Z) {
                    this.y.setMainTitle(this.W);
                }
            }
            if (featuredCourseDetail.actionAmount != null) {
                this.D.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getQuantityString(R.plurals.action_amout, featuredCourseDetail.actionAmount.intValue(), featuredCourseDetail.actionAmount), this.T, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this.T, 13.0f)), Integer.valueOf(ContextCompat.getColor(this.T, R.color.s1))));
            }
            if (featuredCourseDetail.consumption != null) {
                this.E.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getQuantityString(R.plurals.with_kcal, featuredCourseDetail.consumption.intValue(), featuredCourseDetail.consumption), this.T, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this.T, 13.0f)), Integer.valueOf(ContextCompat.getColor(this.T, R.color.s1))));
            }
            Integer num = featuredCourseDetail.difficultyDegree;
            if (num != null) {
                this.F.setText(TrainingCourseUtils.getDifficulityDegree(this.T, num.intValue()));
            }
            Integer num2 = featuredCourseDetail.participantNumber;
            if (num2 != null) {
                if (num2.intValue() == 0) {
                    this.G.setText(getResources().getString(R.string.tr_not_learn_yet));
                } else {
                    this.G.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getQuantityString(R.plurals.learn_times, featuredCourseDetail.participantNumber.intValue(), featuredCourseDetail.participantNumber), this.T, Font.KM, null, Integer.valueOf(ContextCompat.getColor(this.T, R.color.s1))));
                }
            }
            if (this.o0.getSkusItem() != null) {
                SkusItem skusItem = this.o0.getSkusItem();
                this.Y = skusItem;
                this.X = skusItem.salePrice;
            }
            ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
            if (featuredCourseDetail.partnerInfo == null) {
                layoutParams.height = (int) ViewUtils.dp2px(this.T, 313.0f);
                this.O.setVisibility(8);
            } else {
                layoutParams.height = (int) ViewUtils.dp2px(this.T, 380.0f);
                this.x.setLayoutParams(layoutParams);
                this.O.setVisibility(0);
                FeaturedCoursePartnerInfo featuredCoursePartnerInfo = featuredCourseDetail.partnerInfo;
                this.S = featuredCoursePartnerInfo;
                OtherUtils.loadWithGlide(this, this.P, featuredCoursePartnerInfo.partnerLogo);
                this.Q.setText(this.S.partnerTitle);
                this.R.setText(this.S.partnerRecommendation);
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_PARTNER_VN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.V).addExtra(TrainingAnalytics.ParamKey.PARTNER_ID, this.S.id));
            }
            H0();
            C0();
        }
    }

    private void G0() {
        SkusItem skusItem;
        if (this.K.getVisibility() == 0 && this.L.getVisibility() == 0 && (skusItem = this.Y) != null) {
            Float f = skusItem.originalPrice;
            if (f == null || f.floatValue() <= 0.0f) {
                this.I.setVisibility(8);
            } else {
                SpannableString spannableString = new SpannableString("¥" + this.Y.originalPrice);
                StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(10, true);
                spannableString.setSpan(strikethroughSpan, 0, spannableString.length(), 17);
                spannableString.setSpan(absoluteSizeSpan, 0, 1, 17);
                this.I.setVisibility(0);
                this.I.setText(spannableString);
            }
            Float f2 = this.Y.salePrice;
            if (f2 == null || f2.floatValue() <= 0.0f) {
                this.H.setVisibility(8);
            } else {
                SpannableString spannableString2 = new SpannableString("¥" + this.Y.salePrice);
                SuperscriptSpan superscriptSpan = new SuperscriptSpan();
                AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(14, true);
                spannableString2.setSpan(superscriptSpan, 0, 1, 17);
                spannableString2.setSpan(absoluteSizeSpan2, 0, 1, 17);
                this.H.setVisibility(0);
                this.H.setText(spannableString2);
            }
            try {
                int expiry = ExpiryUtils.newInstance().parseExpiry(this.Y.expiry, 5);
                this.N.setText(expiry > 0 ? getResources().getQuantityString(R.plurals.tr_expiry, expiry, Integer.valueOf(expiry)) : "");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Loggers.getLogger().e(u0, new Supplier() { // from class: d02
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return FeaturedCourseDetailActivity.y0(e);
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H0() {
        E0();
        this.z.setCurrentItem(this.o0.getPurchaseStatus() ? 1 : 0, false);
        this.J.setVisibility((this.o0.getFreeStatus() || this.o0.getPurchaseStatus()) ? 8 : 0);
        if (Y()) {
            A0();
        }
    }

    private void R() {
        this.o0.joinTraining();
    }

    private void S(boolean z) {
        if (this.s0 == null) {
            FeaturedCourseMoreActionFragment featuredCourseMoreActionFragment = new FeaturedCourseMoreActionFragment();
            this.s0 = featuredCourseMoreActionFragment;
            featuredCourseMoreActionFragment.setOnViewClickListener(new FeaturedCourseMoreActionFragment.OnViewClickListener() { // from class: j02
                @Override // com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseMoreActionFragment.OnViewClickListener
                public final void onViewClick(int i) {
                    this.a.a0(i);
                }
            });
        }
        this.s0.setHideSettings(z);
        this.s0.show(getSupportFragmentManager(), (String) null);
    }

    private void T() {
        if (this.t0 == null) {
            FeaturedCoursePayFragment featuredCoursePayFragment = new FeaturedCoursePayFragment();
            this.t0 = featuredCoursePayFragment;
            featuredCoursePayFragment.setOnResultListener(new FeaturedCoursePayFragment.OnPayResultListener() { // from class: l02
                @Override // com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePayFragment.OnPayResultListener
                public final void onPayResult(boolean z, String str) {
                    this.a.c0(z, str);
                }
            }, new FeaturedCoursePayFragment.OnJoinResultListener() { // from class: k02
                @Override // com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePayFragment.OnJoinResultListener
                public final void onJoinedResult(boolean z) {
                    this.a.e0(z);
                }
            });
        }
        PayOrderParams payOrderParams = new PayOrderParams();
        payOrderParams.courseId = this.V;
        payOrderParams.description = this.W;
        if (!TextUtils.isEmpty(this.o0.getSkusId())) {
            payOrderParams.skuId = this.o0.getSkusId();
        }
        this.t0.setPayOrder(payOrderParams, this.X, this.o0.getCourseId());
        this.t0.show(getSupportFragmentManager(), (String) null);
    }

    private void U() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.tr_course_introduction));
        arrayList.add(getResources().getString(R.string.tr_course_list));
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new b(arrayList));
        this.A.setNavigator(commonNavigator);
        this.r0.attachMagicIndicator(this.A);
    }

    private void V() {
        this.y.setLeftTitleClickListener(new View.OnClickListener() { // from class: q02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f0(view);
            }
        });
        this.y.setRightTitleClickListener(new View.OnClickListener() { // from class: p02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g0(view);
            }
        });
    }

    private void W() {
        FeaturedCourseDetailViewModel featuredCourseDetailViewModel = (FeaturedCourseDetailViewModel) ViewModelProviders.of(this, this.m0).get(FeaturedCourseDetailViewModel.class);
        this.o0 = featuredCourseDetailViewModel;
        featuredCourseDetailViewModel.setCourseId(this.V);
        this.o0.getDetailLiveData().observe(this, new Observer() { // from class: u02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.i0((Resource) obj);
            }
        });
        TrainingBus.joinedFeaturedCourse().observe(this, new Observer() { // from class: t02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k0((Resource) obj);
            }
        });
        LiveData<Resource<SimpleFeaturedCourse>> joinTrainingResultLiveData = this.o0.getJoinTrainingResultLiveData();
        final LoadingDialogHelper loadingDialogHelper = this.p0;
        Objects.requireNonNull(loadingDialogHelper);
        joinTrainingResultLiveData.observe(this, new Observer() { // from class: yz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                loadingDialogHelper.showOrError((Resource) obj);
            }
        });
        this.o0.getExitTrainingResultLiveData().observe(this, new Observer() { // from class: s02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.m0((Resource) obj);
            }
        });
        this.o0.getVideoUrlLoadResultLiveData().observe(this, new Observer() { // from class: vz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n0((Resource) obj);
            }
        });
        TrainingBus.refreshFeaturedCourse().observe(this, new Observer() { // from class: wz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.o0((String) obj);
            }
        });
        TrainingBus.watchedFeaturedCourse().observe(this, new Observer() { // from class: xz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.h0((Void) obj);
            }
        });
    }

    private void X() {
        this.m0 = TrainingInjection.get().getViewModelFactory();
        this.n0 = TrainingInjection.get().getNavigationController();
    }

    private boolean Y() {
        return (this.o0.getFreeStatus() || this.o0.getPurchaseStatus() || !this.o0.getParticipateStatus()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(View view) {
        this.n0.navigateToFeaturedCoursePartner(this.T, this.V, this.S);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_PARTNER_CN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.V).addExtra(TrainingAnalytics.ParamKey.PARTNER_ID, this.S.id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(int i) {
        if (i == R.id.item_exit) {
            this.o0.exitTrainings();
        } else if (i == R.id.item_setting) {
            this.n0.navigateToTrainingSettings(this.T);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b0(boolean z) {
        return "精品课程详情页监听到支付结果：" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(final boolean z, String str) {
        Loggers.getLogger().v(u0, new Supplier() { // from class: g02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.b0(z);
            }
        });
        this.o0.updatePurchaseStatus(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d0(boolean z) {
        return "精品课程详情页监听到付费课程自动参加结果：" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(final boolean z) {
        Loggers.getLogger().v(u0, new Supplier() { // from class: e02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.d0(z);
            }
        });
        this.o0.updateParticipateStatus(z);
        this.o0.refresh();
        if (z) {
            return;
        }
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(View view) {
        this.x.removeOnOffsetChangedListener(this.q0);
        finish();
    }

    private void findViews() {
        this.x = (AppBarLayout) findViewById(R.id.app_bar_layout);
        this.y = (SimpleToolbar) findViewById(R.id.toolbar);
        this.z = (WrapContentHeightViewPager) findViewById(R.id.viewpager);
        this.A = (MagicIndicator) findViewById(R.id.magicindicator);
        this.B = (ImageView) findViewById(R.id.iv_bg);
        this.C = (TextView) findViewById(R.id.tv_name);
        this.D = (TextView) findViewById(R.id.tv_action_amount);
        this.E = (TextView) findViewById(R.id.tv_consumption);
        this.F = (TextView) findViewById(R.id.tv_dificulityDegree);
        this.G = (TextView) findViewById(R.id.tv_participantNumber);
        this.I = (TextView) findViewById(R.id.tv_oriPrice);
        this.H = (TextView) findViewById(R.id.tv_salePrice);
        this.L = (RelativeLayout) findViewById(R.id.purchase_layout);
        this.M = (LinearLayout) findViewById(R.id.join_layout);
        this.K = (LinearLayout) findViewById(R.id.bottom_layout);
        this.N = (TextView) findViewById(R.id.tv_expiry);
        this.J = (ImageView) findViewById(R.id.iv_preview);
        this.O = (LinearLayout) findViewById(R.id.partner_layout);
        this.P = (HMCircleImageView) findViewById(R.id.iv_partner_logo);
        this.Q = (TextView) findViewById(R.id.tv_partner_title);
        this.R = (TextView) findViewById(R.id.tv_partner_recommend);
        this.O.setOnClickListener(new View.OnClickListener() { // from class: r02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Z(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(View view) {
        S(false);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.QUIT_COURSE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(Void r1) {
        AppRateDialog.show(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(Resource resource) {
        FeaturedCourseDetail featuredCourseDetail;
        this.p0.showOrError(resource);
        if (resource == null || !resource.isComplete() || (featuredCourseDetail = (FeaturedCourseDetail) resource.getData()) == null) {
            return;
        }
        F0(featuredCourseDetail);
        z0((featuredCourseDetail.isPurchase || featuredCourseDetail.isParticipate) ? 1 : 0);
    }

    private void initViews() {
        V();
        U();
        FeaturedCourseDetailPagerAdapter featuredCourseDetailPagerAdapter = new FeaturedCourseDetailPagerAdapter(getSupportFragmentManager());
        this.U = featuredCourseDetailPagerAdapter;
        this.z.setAdapter(featuredCourseDetailPagerAdapter);
        ViewPagerHelper.bind(this.A, this.z);
        this.W = "";
        this.p0 = new LoadingDialogHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j0(SimpleFeaturedCourse simpleFeaturedCourse, Resource resource) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = simpleFeaturedCourse != null ? simpleFeaturedCourse.id : "null";
        objArr[1] = simpleFeaturedCourse != null ? simpleFeaturedCourse.name : "null";
        objArr[2] = resource.getStatus() == Status.SUCCESS ? "成功" : "失败";
        return String.format(locale, "监听到参加了课程, id: %s,name:%s,加入:%s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(final Resource resource) {
        if (resource == null || !resource.isComplete()) {
            return;
        }
        final SimpleFeaturedCourse simpleFeaturedCourse = (SimpleFeaturedCourse) resource.getData();
        Loggers.getLogger().v(u0, new Supplier() { // from class: a02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.j0(simpleFeaturedCourse, resource);
            }
        });
        if (resource.getStatus() == Status.SUCCESS) {
            this.o0.updateParticipateStatus(true);
            if (this.o0.getFreeStatus()) {
                this.o0.updatePurchaseStatus(true);
            }
            this.o0.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object l0(Resource resource) {
        return "退出训练-->" + resource.getStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(final Resource resource) {
        this.p0.showOrError(resource);
        if (resource == null || resource.getStatus() == Status.LOADING) {
            return;
        }
        Loggers.getLogger().i(u0, new Supplier() { // from class: zz1
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.l0(resource);
            }
        });
        boolean z = resource.getStatus() != Status.SUCCESS;
        this.o0.updateParticipateStatus(z);
        if (this.o0.getFreeStatus() && !z) {
            this.o0.updatePurchaseStatus(false);
        }
        this.o0.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(Resource resource) {
        String str;
        this.p0.showOrError(resource);
        String courseId = this.o0.getCourseId();
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null || courseId == null) {
            return;
        }
        VideoUrl videoUrl = (VideoUrl) resource.getData();
        this.n0.navigateToFeaturedCoursePlay(this, courseId, videoUrl.videoId, videoUrl.playUrl);
        if (NetUtil.isNetworkConnected(getApplicationContext())) {
            str = NetUtil.isWifiConnected(getApplicationContext()) ? "wifi" : TrainingAnalytics.ParamValue.Network.NOT_WIFI;
        } else {
            str = TrainingAnalytics.ParamValue.Network.NO_NETWORK;
        }
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())).addExtra(TrainingAnalytics.ParamKey.VIDEO_ID, String.valueOf(videoUrl.videoId)).addExtra(TrainingAnalytics.ParamKey.PRICE, this.o0.getFreeStatus() ? TrainingAnalytics.ParamValue.Price.FREE : TrainingAnalytics.ParamValue.Price.PAID).addExtra("Network", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str) {
        if (str != null) {
            this.o0.setCourseId(str);
            TrainingBus.refreshFeaturedCourse().setValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        this.o0.findDemoVideoThenLoadUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q0(EventWebViewLoadFinish eventWebViewLoadFinish) {
        return "收到webview页面渲染更新事件,extraHeight=" + eventWebViewLoadFinish.extraHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r0() {
        return "免费课程过期";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(DialogInterface dialogInterface, int i) {
        T();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(DialogInterface dialogInterface, int i) {
        S(true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u0() {
        return "付费课程自动加入失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(DialogInterface dialogInterface, int i) {
        R();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x0() {
        return "courseid->" + this.o0.getCourseId() + ",购买->" + this.o0.getPurchaseStatus() + ",参加->" + this.o0.getParticipateStatus() + ",免费->" + this.o0.getFreeStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y0(IllegalArgumentException illegalArgumentException) {
        return "parseExpiry->" + illegalArgumentException.getMessage();
    }

    private void z0(int i) {
        this.r0.handlePageSelected(i);
        this.z.setCurrentItem(i, false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_preview) {
            NetworkConfirmHelper.checkNetworkAvailableThenDo(this, new Runnable() { // from class: m02
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p0();
                }
            });
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PREVIEW_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())).addExtra("Source", TrainingAnalytics.ParamValue.WatchDemoSource.HEADER));
            return;
        }
        if (id == R.id.tv_purchase) {
            T();
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())).addExtra("Source", TrainingAnalytics.ParamValue.PurchaseSource.DETAIL_BUTTON));
        } else if (id == R.id.join_layout) {
            if (PolicyTipUtil.isNeedIntercept()) {
                this.K.setVisibility(8);
                this.z.setCurrentItem(1, false);
            } else {
                R();
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.ADD_COURSE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.o0.getCourseId())));
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GlobalTitleStyleKt.setUnifyTitleStyle(this, "", "");
        EventBus.getDefault().register(this);
        this.T = this;
        setContentView(R.layout.activity_featured_course_detail);
        this.V = getIntent().getStringExtra("ARG_FEATURED_COURSE_ID");
        findViews();
        initViews();
        X();
        W();
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_PAGE_VIEWNUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.V));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(final EventWebViewLoadFinish eventWebViewLoadFinish) {
        Loggers.getLogger().v(u0, new Supplier() { // from class: b02
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailActivity.q0(eventWebViewLoadFinish);
            }
        });
        FeaturedCourseIntroductionFragment featuredCourseIntroductionFragment = (FeaturedCourseIntroductionFragment) this.U.getItem(FeaturedCourseIntroductionFragment.class);
        if (featuredCourseIntroductionFragment == null) {
            return;
        }
        if (featuredCourseIntroductionFragment == this.U.getItem(this.z.getCurrentItem())) {
            this.z.setCurrentView(featuredCourseIntroductionFragment.getWebView(), eventWebViewLoadFinish.extraHeight);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.x.removeOnOffsetChangedListener(this.q0);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.x.addOnOffsetChangedListener(this.q0);
    }
}
