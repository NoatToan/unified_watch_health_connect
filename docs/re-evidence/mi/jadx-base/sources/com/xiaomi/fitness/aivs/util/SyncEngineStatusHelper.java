package com.xiaomi.fitness.aivs.util;

import android.content.Intent;
import com.mi.fitness.course.schecule.export.CourseScheduleConstant;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/aivs/util/SyncEngineStatusHelper;", "", "<init>", "()V", "postEngineStatus", "", "status", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncEngineStatusHelper {

    @NotNull
    public static final SyncEngineStatusHelper INSTANCE = new SyncEngineStatusHelper();

    private SyncEngineStatusHelper() {
    }

    public final void postEngineStatus(int status) {
        Intent intent = new Intent(CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_ACTION);
        intent.putExtra(CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_READY, status);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }
}
