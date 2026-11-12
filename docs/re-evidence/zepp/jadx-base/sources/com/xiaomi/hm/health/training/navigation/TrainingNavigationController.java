package com.xiaomi.hm.health.training.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCoursePartnerInfo;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCourseDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCoursePartnerActivity;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCoursePlayActivity;
import com.xiaomi.hm.health.training.ui.activity.FeaturedCourseRecommendedListActivity;
import com.xiaomi.hm.health.training.ui.activity.FreeTrainingDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.GeneralTrainingListActivity;
import com.xiaomi.hm.health.training.ui.activity.TrainingSettingActivity;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingNavigationController implements NavigationController {
    private static final String a = "Train-TrainingNavigationController";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(String str) {
        return "跳转至精品课程详情页，id: " + str;
    }

    private void c(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void finish(Activity activity) {
        activity.finish();
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToActionOrYogaTrainingDetail(Context context, long j) {
        FreeTrainingDetailActivity.startActivity(context, j, "");
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToActionOrYogaTrainingList(Context context) {
        GeneralTrainingListActivity.browseActionTrainingList(context);
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToFeaturedCourseDetail(Context context, final String str) {
        c(context, new Intent(context, (Class<?>) FeaturedCourseDetailActivity.class).putExtra("ARG_FEATURED_COURSE_ID", str));
        Loggers.getLogger().v(a, new Supplier() { // from class: hx7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainingNavigationController.b(str);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToFeaturedCourseList(Context context) {
        GeneralTrainingListActivity.browseFeaturedCourseList(context);
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToFeaturedCoursePartner(Context context, String str, FeaturedCoursePartnerInfo featuredCoursePartnerInfo) {
        Intent intent = new Intent(context, (Class<?>) FeaturedCoursePartnerActivity.class);
        intent.putExtra("ARG_FEATURED_COURSE_ID", str);
        intent.putExtra(FeaturedCoursePartnerActivity.EXTRA_FEATURED_COURSE_PARTNER, featuredCoursePartnerInfo);
        c(context, intent);
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToFeaturedCoursePlay(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) FeaturedCoursePlayActivity.class);
        FeaturedCoursePlayActivity.Companion companion = FeaturedCoursePlayActivity.INSTANCE;
        c(context, intent.putExtra(companion.getEXTRA_FEATURED_COURSE_ID(), str).putExtra(companion.getEXTRA_INITIAL_PLAY_VIDEO_ID(), str2).putExtra(companion.getEXTRA_INITIAL_PLAY_VIDEO_URL(), str3));
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToFeaturedCourseRecommendedList(Context context, ArrayList<FeaturedCourseItem> arrayList) {
        Intent intent = new Intent(context, (Class<?>) FeaturedCourseRecommendedListActivity.class);
        intent.putParcelableArrayListExtra(FeaturedCourseRecommendedListActivity.EXTRA_RECOMMENDED_COURSES, arrayList);
        c(context, intent);
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToTrainingSettings(Context context) {
        c(context, new Intent(context, (Class<?>) TrainingSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.training.navigation.NavigationController
    public void navigateToWebPage(Context context, String str, String str2) {
        WebBrowserUtils.jump2WebBrowser(context, str, str2);
    }
}
