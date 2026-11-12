package com.xiaomi.hm.health.training.navigation;

import android.app.Activity;
import android.content.Context;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCoursePartnerInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public interface NavigationController {
    void finish(Activity activity);

    void navigateToActionOrYogaTrainingDetail(Context context, long j);

    void navigateToActionOrYogaTrainingList(Context context);

    void navigateToFeaturedCourseDetail(Context context, String str);

    void navigateToFeaturedCourseList(Context context);

    void navigateToFeaturedCoursePartner(Context context, String str, FeaturedCoursePartnerInfo featuredCoursePartnerInfo);

    void navigateToFeaturedCoursePlay(Context context, String str, String str2, String str3);

    void navigateToFeaturedCourseRecommendedList(Context context, ArrayList<FeaturedCourseItem> arrayList);

    void navigateToTrainingSettings(Context context);

    void navigateToWebPage(Context context, String str, String str2);
}
