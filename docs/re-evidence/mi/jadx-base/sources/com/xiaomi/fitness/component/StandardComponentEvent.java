package com.xiaomi.fitness.component;

import android.os.Bundle;
import com.xiaomi.onetrack.c.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/component/StandardComponentEvent;", "Lcom/xiaomi/fitness/component/ComponentEvent;", "", "<init>", "(Ljava/lang/String;I)V", "APP_ATTACH_CONTEXT", "BEFORE_APP_CREATED", "APP_CREATE", "AFTER_APP_CREATED", "BEFORE_FIRST_ACT_CREATED", "FIRST_ACT_CREATED", "AFTER_FIRST_ACT_CREATED", "BEFORE_MAIN_ACTIVITY_CREATED", "MAIN_ACTIVITY_CREATED", "AFTER_MAIN_ACTIVITY_CREATED", "MAIN_HANDLER_IDLE", "ON_REMOVE", "CONFIG_CHANGE", "LOW_MEMORY", "TRIM_MEMORY", "mData", "Landroid/os/Bundle;", i.d, "", "getEventName", "()Ljava/lang/String;", "getData", "setData", "data", "Companion", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum StandardComponentEvent implements ComponentEvent {
    APP_ATTACH_CONTEXT,
    BEFORE_APP_CREATED,
    APP_CREATE,
    AFTER_APP_CREATED,
    BEFORE_FIRST_ACT_CREATED,
    FIRST_ACT_CREATED,
    AFTER_FIRST_ACT_CREATED,
    BEFORE_MAIN_ACTIVITY_CREATED,
    MAIN_ACTIVITY_CREATED,
    AFTER_MAIN_ACTIVITY_CREATED,
    MAIN_HANDLER_IDLE,
    ON_REMOVE,
    CONFIG_CHANGE,
    LOW_MEMORY,
    TRIM_MEMORY;


    @NotNull
    public static final String KEY_LEVEL = "level";

    @NotNull
    public static final String KEY_NEW_CONFIG = "newConfig";

    @Nullable
    private Bundle mData;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<StandardComponentEvent> getEntries() {
        return $ENTRIES;
    }

    @Nullable
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final Bundle getMData() {
        return this.mData;
    }

    @Override // com.xiaomi.fitness.component.ComponentEvent
    @NotNull
    public String getEventName() {
        return name();
    }

    @NotNull
    public final StandardComponentEvent setData(@Nullable Bundle data) {
        this.mData = data;
        return this;
    }
}
