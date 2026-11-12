package com.xiaomi.fitness.notify.focus;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/FocusScene;", "", "scene", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getScene", "()Ljava/lang/String;", "FOOD_DELIVERY", "CAR_HAILING", "SMART_HOME_ALERT", "VERIFY_CODE", "EVENT", "TEMPLATE_BASE", "TEMPLATE_BASE_REVERT", "TEMPLATE_BASE_PROGRESS", "TEMPLATE_BASE_REVERT_PROGRESS", "MISSED_CALLS", "RECORDER", "TIMER", "ALARM", "SOS", "ANNIVERSARY", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FocusScene {
    FOOD_DELIVERY("foodDelivery"),
    CAR_HAILING("carHailing"),
    SMART_HOME_ALERT("smartHomeAlert"),
    VERIFY_CODE("verifyCode"),
    EVENT("events"),
    TEMPLATE_BASE("templateBaseScene"),
    TEMPLATE_BASE_REVERT("templateRevertScene"),
    TEMPLATE_BASE_PROGRESS("templateBaseProgressScene"),
    TEMPLATE_BASE_REVERT_PROGRESS("templateRevertProgressScene"),
    MISSED_CALLS("missedCalls"),
    RECORDER("recorder"),
    TIMER("timer"),
    ALARM(DialWidgetType.ALARM),
    SOS("sos"),
    ANNIVERSARY("anniversary");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String scene;

    FocusScene(String str) {
        this.scene = str;
    }

    @NotNull
    public static EnumEntries<FocusScene> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }
}
