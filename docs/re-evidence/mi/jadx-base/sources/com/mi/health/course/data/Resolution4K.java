package com.mi.health.course.data;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.czi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mi/health/course/data/Resolution4K;", "Lcom/mi/health/course/data/Resolution;", "<init>", "()V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Resolution4K extends Resolution {

    @NotNull
    public static final Resolution4K INSTANCE = new Resolution4K();

    private Resolution4K() {
        super(ResolutionKt.RESOLUTION_RANGE_4K, ResourceExtKt.getString(czi.course_video_4k), null);
    }
}
