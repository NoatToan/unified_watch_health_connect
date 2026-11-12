package com.xiaomi.hm.health.training.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.ui.adapter.GeneralTrainingPagerAdapter;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
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
public class GeneralTrainingListActivity extends BaseTitleActivity {
    private static final String A = "EXTRA_SELECT_ACTION_TRAINING";

    @Inject
    public TrainingNavigationController x;
    private b y;
    private boolean z = false;

    public class a extends CommonNavigatorAdapter {
        public final /* synthetic */ List b;

        public a(List list) {
            this.b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            if (GeneralTrainingListActivity.this.y.b.getCurrentItem() != i) {
                if (i == 0) {
                    Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATURED_ARTICLE_C));
                } else if (i == 1) {
                    Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_COURSES_C));
                } else if (i == 2) {
                    Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.HEALTH_NEWS_C));
                }
                GeneralTrainingListActivity.this.y.b.setCurrentItem(i);
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            return this.b.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerIndicator getIndicator(Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineWidth(UIUtil.dip2px(context, 30.0d));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(context, R.color.tr_training_tab_indicator)));
            linePagerIndicator.setMode(2);
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerTitleView getTitleView(Context context, final int i) {
            SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
            simplePagerTitleView.setNormalColor(ContextCompat.getColor(context, R.color.tr_training_tab_text_normal));
            simplePagerTitleView.setSelectedColor(ContextCompat.getColor(context, R.color.tr_training_tab_text_selected));
            simplePagerTitleView.setText((CharSequence) this.b.get(i));
            simplePagerTitleView.setTextSize(15.0f);
            simplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.training.ui.activity.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
            return simplePagerTitleView;
        }
    }

    public static class b {
        public MagicIndicator a;
        public ViewPager b;

        public b(Activity activity) {
            this.a = (MagicIndicator) activity.findViewById(R.id.pager_indicator);
            this.b = (ViewPager) activity.findViewById(R.id.view_pager);
        }
    }

    public static void browseActionTrainingList(Context context) {
        context.startActivity(new Intent(context, (Class<?>) GeneralTrainingListActivity.class).putExtra(A, true));
    }

    public static void browseFeaturedCourseList(Context context) {
        context.startActivity(new Intent(context, (Class<?>) GeneralTrainingListActivity.class).putExtra(A, false));
    }

    private void initView() {
        this.y = new b(this);
        m();
        o();
    }

    private void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.tr_popular_course));
        arrayList.add(getResources().getString(R.string.motion_training));
        arrayList.add(getResources().getString(R.string.tr_health_info));
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new a(arrayList));
        this.y.a.setNavigator(commonNavigator);
        b bVar = this.y;
        ViewPagerHelper.bind(bVar.a, bVar.b);
    }

    private void n() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.white100), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.black70));
        setTitleText(R.string.tr_sport_health);
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
    private void o() {
        GeneralTrainingPagerAdapter generalTrainingPagerAdapter = new GeneralTrainingPagerAdapter(getSupportFragmentManager());
        this.y.b.setAdapter(generalTrainingPagerAdapter);
        this.y.b.setOffscreenPageLimit(generalTrainingPagerAdapter.getPagerCount());
        this.y.b.setCurrentItem(this.z ? 1 : 0);
    }

    private void p() {
        this.x = TrainingInjection.get().getNavigationController();
    }

    private void q() {
        this.z = getIntent().getBooleanExtra(A, this.z);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p();
        n();
        q();
        setContentView(R.layout.activity_general_training_list);
        initView();
    }
}
