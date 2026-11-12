package com.xiaomi.hm.health.training.api.entity;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseForPlay {
    public String id;
    public boolean isFree;
    public boolean isParticipate;

    @Nullable
    public String skuId;
    public StartEndVideoPost videoPosts;
    public List<FeaturedCourseVideo> videos;
}
