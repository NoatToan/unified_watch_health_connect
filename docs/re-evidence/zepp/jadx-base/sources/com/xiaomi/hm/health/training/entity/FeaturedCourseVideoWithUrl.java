package com.xiaomi.hm.health.training.entity;

import com.xiaomi.hm.health.training.api.entity.FeaturedCourseVideo;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseVideoWithUrl extends FeaturedCourseVideo {
    public long duration;
    public String url;

    public static FeaturedCourseVideoWithUrl copy(FeaturedCourseVideo featuredCourseVideo) {
        FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl = new FeaturedCourseVideoWithUrl();
        featuredCourseVideoWithUrl.id = featuredCourseVideo.id;
        featuredCourseVideoWithUrl.name = featuredCourseVideo.name;
        featuredCourseVideoWithUrl.consumption = featuredCourseVideo.consumption;
        featuredCourseVideoWithUrl.isDemo = featuredCourseVideo.isDemo;
        featuredCourseVideoWithUrl.demoDuration = featuredCourseVideo.demoDuration;
        featuredCourseVideoWithUrl.demoPercent = featuredCourseVideo.demoPercent;
        return featuredCourseVideoWithUrl;
    }
}
