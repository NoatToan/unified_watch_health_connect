package com.xiaomi.hm.health.training.api.entity;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseVideo {
    public long consumption;
    public Long demoDuration;
    public Float demoPercent;
    public String id;
    public boolean isDemo;
    public String name;

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeaturedCourseVideo)) {
            return false;
        }
        FeaturedCourseVideo featuredCourseVideo = (FeaturedCourseVideo) obj;
        String str2 = this.id;
        return (str2 == null || (str = featuredCourseVideo.id) == null || !str2.equals(str)) ? false : true;
    }
}
