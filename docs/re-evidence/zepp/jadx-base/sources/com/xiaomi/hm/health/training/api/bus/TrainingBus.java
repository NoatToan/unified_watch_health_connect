package com.xiaomi.hm.health.training.api.bus;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingBus {
    public static MutableLiveData<SimpleFeaturedCourse> exitedFeaturedCourse() {
        return b.a().c(a.c, new b.C1019b());
    }

    public static MutableLiveData<Resource<TrainingRecord>> finishedCourseTraining() {
        return b.a().c(a.a, new b.C1019b());
    }

    public static MutableLiveData<Resource<SimpleFeaturedCourse>> joinedFeaturedCourse() {
        return b.a().c(a.b, new b.C1019b());
    }

    public static MutableLiveData<String> refreshFeaturedCourse() {
        return b.a().c(a.d, new b.C1019b());
    }

    public static MutableLiveData<Void> watchedFeaturedCourse() {
        return b.a().c(a.e, new b.C1019b());
    }
}
