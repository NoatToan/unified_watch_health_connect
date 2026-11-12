package com.xiaomi.fitness.sport.course;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"getAudioList", "", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseGridAudioDataKt {
    @NotNull
    public static final List<CourseGridAudioData> getAudioList() {
        return CollectionsKt__CollectionsKt.mutableListOf(CourseGridAudioData.BriskWalk.INSTANCE, CourseGridAudioData.BurningRun.INSTANCE, CourseGridAudioData.Endurance.INSTANCE, CourseGridAudioData.HrRun.INSTANCE);
    }
}
