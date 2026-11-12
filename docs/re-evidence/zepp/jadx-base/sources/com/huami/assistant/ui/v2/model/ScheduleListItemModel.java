package com.huami.assistant.ui.v2.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "a", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "getType", "()Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "type", "<init>", "(Lcom/huami/assistant/ui/v2/model/ScheduleListType;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public class ScheduleListItemModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ScheduleListType type;

    public ScheduleListItemModel(@NotNull ScheduleListType scheduleListType) {
        this.type = scheduleListType;
    }

    @NotNull
    public final ScheduleListType getType() {
        return this.type;
    }
}
