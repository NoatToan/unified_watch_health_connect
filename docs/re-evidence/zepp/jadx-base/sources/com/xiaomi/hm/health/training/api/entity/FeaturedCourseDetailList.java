package com.xiaomi.hm.health.training.api.entity;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailList {
    public List<FeaturedCourseDetailItem> data;
    public boolean free;
    public boolean participate;
    public boolean purchase;

    public FeaturedCourseDetailList(boolean z, boolean z2, boolean z3, List<FeaturedCourseDetailItem> list) {
        this.purchase = z;
        this.participate = z2;
        this.free = z3;
        this.data = list;
    }
}
