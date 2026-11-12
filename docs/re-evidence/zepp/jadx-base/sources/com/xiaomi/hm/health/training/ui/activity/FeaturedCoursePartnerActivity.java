package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.huami.lib.view.image.HMCircleImageView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCoursePartnerInfo;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePartnerViewModel;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.ui.widget.SimpleToolbar;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCoursePartnerActivity extends BaseTitleActivity {
    public static final String EXTRA_FEATURED_COURSE_ID = "ARG_FEATURED_COURSE_ID";
    public static final String EXTRA_FEATURED_COURSE_PARTNER = "ARG_FEATURED_COURSE_PARTNER";
    private static final String Q = "Train-FeaturedCoursePartnerActivity";
    private HMCircleImageView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private RecyclerView E;
    private Context F;
    private String G;
    private String H;
    private FeaturedCoursePartnerInfo I;
    private CommonRecycleAdapter<FeaturedCourseItem> J;
    private List<FeaturedCourseItem> K;

    @Inject
    public ViewModelProvider.Factory L;

    @Inject
    public NavigationController M;
    private FeaturedCoursePartnerViewModel N;
    private LoadingDialogHelper O;
    private AppBarLayout.OnOffsetChangedListener P = new a();
    private AppBarLayout x;
    private SimpleToolbar y;
    private ImageView z;

    public class a implements AppBarLayout.OnOffsetChangedListener {
        private int a;

        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int totalScrollRange = appBarLayout.getTotalScrollRange() / 2;
            FeaturedCoursePartnerActivity.this.y.setAlpha((Math.abs(iAbs - totalScrollRange) * 1.0f) / totalScrollRange);
            if (this.a != i) {
                this.a = i;
                if (iAbs > totalScrollRange) {
                    FeaturedCoursePartnerActivity.this.y.setMainTitle(FeaturedCoursePartnerActivity.this.G);
                    FeaturedCoursePartnerActivity.this.y.setLeftIconDrawable(R.drawable.arrow_back_black);
                } else if (iAbs < totalScrollRange) {
                    FeaturedCoursePartnerActivity.this.y.setMainTitle("");
                    FeaturedCoursePartnerActivity.this.y.setLeftIconDrawable(R.drawable.ic_back_white);
                }
            }
        }
    }

    public class b extends CommonRecycleAdapter<FeaturedCourseItem> {
        public b(int i, int i2, List list) {
            super(i, i2, list);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return super.getA();
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        public void bindViewHolder(CommonViewHolder commonViewHolder, FeaturedCourseItem featuredCourseItem) {
            if (!TextUtils.isEmpty(featuredCourseItem.listImgUrl)) {
                commonViewHolder.setImageByUrlWithPressedDrawable(R.id.iv_img, featuredCourseItem.listImgUrl);
            }
            if (!TextUtils.isEmpty(featuredCourseItem.name)) {
                commonViewHolder.setText(R.id.tv_name, featuredCourseItem.name);
            }
            Integer num = featuredCourseItem.participantNumber;
            if (num != null) {
                if (num.intValue() == 0) {
                    commonViewHolder.setText(R.id.tv_participantNumber, FeaturedCoursePartnerActivity.this.F.getResources().getString(R.string.tr_not_learn_yet));
                } else {
                    commonViewHolder.setQuantityString(R.id.tv_participantNumber, R.plurals.learn_times, featuredCourseItem.participantNumber.intValue(), featuredCourseItem.participantNumber);
                }
            }
            Integer num2 = featuredCourseItem.actionAmount;
            if (num2 != null) {
                commonViewHolder.setQuantityString(R.id.tv_action_amount, R.plurals.course_number, num2.intValue(), featuredCourseItem.actionAmount);
            }
            Integer num3 = featuredCourseItem.difficultyDegree;
            if (num3 != null) {
                commonViewHolder.setRating(R.id.rb_difficulty, num3.intValue());
            }
            if (TextUtils.isEmpty(featuredCourseItem.labelValue)) {
                commonViewHolder.setVisibility(R.id.badge_end, 8);
            } else {
                int i = R.id.badge_end;
                commonViewHolder.setVisibility(i, 0);
                commonViewHolder.setText(i, featuredCourseItem.labelValue);
            }
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSELIST_VN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCourseItem.id).addExtra("Position", String.valueOf(commonViewHolder.getLayoutPosition())));
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        public void onItemClick(FeaturedCourseItem featuredCourseItem, int i) {
            TrainingBus.refreshFeaturedCourse().postValue(featuredCourseItem.id);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSELIST_CN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCourseItem.id).addExtra("Position", String.valueOf(i)));
            FeaturedCoursePartnerActivity.this.finish();
        }
    }

    private void initData() {
        if (getIntent() == null) {
            return;
        }
        this.H = getIntent().getStringExtra("ARG_FEATURED_COURSE_ID");
        this.I = (FeaturedCoursePartnerInfo) getIntent().getParcelableExtra(EXTRA_FEATURED_COURSE_PARTNER);
    }

    private void initRecyclerView() {
        this.K = new ArrayList();
        this.E.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.E.setLayoutManager(linearLayoutManager);
        this.E.addItemDecoration(new LinearLayoutDecoration(this, 1, R.dimen.divider_size_dp8, R.color.s4));
        this.E.setHasFixedSize(true);
        b bVar = new b(R.layout.item_featured_course_list, R.id.iv_img, this.K);
        this.J = bVar;
        this.E.setAdapter(bVar);
    }

    private void initViews() {
        this.x = (AppBarLayout) findViewById(R.id.app_bar_layout);
        this.y = (SimpleToolbar) findViewById(R.id.toolbar);
        this.z = (ImageView) findViewById(R.id.iv_partner_bg);
        this.A = (HMCircleImageView) findViewById(R.id.iv_partner_logo);
        this.B = (TextView) findViewById(R.id.tv_partner_title);
        this.C = (TextView) findViewById(R.id.tv_partner_introduction);
        this.D = (TextView) findViewById(R.id.tv_go_mifitcircle);
        this.E = (RecyclerView) findViewById(R.id.rcv_all_courses);
        this.O = new LoadingDialogHelper(this);
        this.y.setLeftTitleClickListener(new View.OnClickListener() { // from class: h22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
        initRecyclerView();
    }

    private void q() {
        FeaturedCoursePartnerViewModel featuredCoursePartnerViewModel = (FeaturedCoursePartnerViewModel) ViewModelProviders.of(this, this.L).get(FeaturedCoursePartnerViewModel.class);
        this.N = featuredCoursePartnerViewModel;
        FeaturedCoursePartnerInfo featuredCoursePartnerInfo = this.I;
        if (featuredCoursePartnerInfo != null) {
            featuredCoursePartnerViewModel.setPartnerCourseId(featuredCoursePartnerInfo.id);
        }
        this.N.getPartnerCourses().observe(this, new Observer() { // from class: i22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.s((Resource) obj);
            }
        });
    }

    private void r() {
        this.L = TrainingInjection.get().getViewModelFactory();
        this.M = TrainingInjection.get().getNavigationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Resource resource) {
        this.O.showOrError(resource);
        if (resource == null || !resource.isComplete()) {
            return;
        }
        u(this.I, (List) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        finish();
    }

    private void u(FeaturedCoursePartnerInfo featuredCoursePartnerInfo, List<FeaturedCourseItem> list) {
        if (list == null || featuredCoursePartnerInfo == null || list.isEmpty()) {
            return;
        }
        if (!TextUtils.isEmpty(featuredCoursePartnerInfo.partnerBackgroundImg)) {
            OtherUtils.loadWithGlide(this, this.z, featuredCoursePartnerInfo.partnerBackgroundImg);
        }
        if (!TextUtils.isEmpty(featuredCoursePartnerInfo.partnerLogo)) {
            OtherUtils.loadWithGlide(this, this.A, featuredCoursePartnerInfo.partnerLogo);
        }
        if (!TextUtils.isEmpty(featuredCoursePartnerInfo.partnerTitle)) {
            String str = featuredCoursePartnerInfo.partnerTitle;
            this.G = str;
            this.B.setText(str);
        }
        if (!TextUtils.isEmpty(featuredCoursePartnerInfo.partnerIntroduction)) {
            this.C.setText(featuredCoursePartnerInfo.partnerIntroduction);
        }
        this.D.setVisibility(8);
        this.J.setData(list);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = this;
        setContentView(R.layout.activity_featured_course_partner);
        setStyle(BaseTitleActivity.STYLE.NONE);
        r();
        initViews();
        initData();
        q();
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PARTNER_PAGE_VN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.H).addExtra(TrainingAnalytics.ParamKey.PARTNER_ID, this.I.id));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.x.addOnOffsetChangedListener(this.P);
    }
}
