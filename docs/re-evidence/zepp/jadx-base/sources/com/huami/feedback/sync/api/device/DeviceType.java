package com.huami.feedback.sync.api.device;

import com.google.android.gms.fitness.FitnessActivities;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/feedback/sync/api/device/DeviceType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BAND", "WATCH", "EAR_BUD", "HEAD_SET", "SCALE", "TREADMILL", "SMART_WATCH", "HEARING_AID", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public enum DeviceType {
    BAND("band_watch"),
    WATCH("band_watch"),
    EAR_BUD("earBud"),
    HEAD_SET("earBud"),
    SCALE(AnimatorViewWrapper.SCALE),
    TREADMILL(FitnessActivities.TREADMILL),
    SMART_WATCH("smart_watch"),
    HEARING_AID("hearingAid");


    @NotNull
    private final String type;

    DeviceType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
