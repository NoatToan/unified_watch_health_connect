package com.xiaomi.hm.health.training.api;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseForPlay;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.InstrumentsAndBodyparts;
import com.xiaomi.hm.health.training.api.entity.Listing;
import com.xiaomi.hm.health.training.api.entity.PaidOrderListItem;
import com.xiaomi.hm.health.training.api.entity.PayOrderParams;
import com.xiaomi.hm.health.training.api.entity.PayOrderResult;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.function.Supplier;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface TrainingDataSource {
    LiveData<Resource<Boolean>> exitTrainings(@NonNull String str, @Nullable String str2);

    LiveData<PayOrderResult> generateOrderAndPayForFeaturedCourse(@NonNull Activity activity, @NonNull PayOrderParams payOrderParams);

    LiveData<Resource<SimpleFeaturedCourse>> joinTrainings(@NonNull String str, @Nullable String str2);

    Listing<ActionOrYogaTraining> loadActionOrYogaTrainings(@NonNull Supplier<String> supplier, @NonNull Supplier<String> supplier2, @NonNull Supplier<String> supplier3);

    LiveData<Resource<FeaturedCourseDetail>> loadFeaturedCoursesForDetail(String str);

    Listing<FeaturedCourseListItem> loadFeaturedCoursesForList();

    LiveData<Resource<List<SimpleFeaturedCourse>>> loadFeaturedCoursesForMain();

    LiveData<Resource<List<FeaturedCourseItem>>> loadFeaturedCoursesForPartner(String str);

    LiveData<Resource<FeaturedCourseForPlay>> loadFeaturedCoursesForPlay(@NonNull String str);

    LiveData<Resource<List<FeaturedCourseItem>>> loadFeaturedCoursesForStatus();

    LiveData<Resource<VideoUrl>> loadFeaturedCoursesVideoUrl(@NonNull String str, @NonNull String str2);

    LiveData<Resource<InstrumentsAndBodyparts>> loadInstrumentsAndBodyparts();

    Listing<PaidOrderListItem> loadPaidOrderForList();

    LiveData<Resource<List<FeaturedCourseItem>>> loadRecommendedCoursesForDetail(Long l);

    Listing<TrainingKnowledge> loadTrainingKnowledge();

    LiveData<User> loadUser();

    void loadVideoPosts();

    LiveData<Resource<TrainingRecord>> saveTrainingRecord(@NonNull TrainingRecord trainingRecord);
}
