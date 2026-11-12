package com.huami.assistant.ui.v2.model;

import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "", "<init>", "()V", "ALL", JsonParseUtils.CURRENT, "FUTURE", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType$CURRENT;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType$FUTURE;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType$ALL;", "assistant_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScheduleEditType {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType$ALL;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class ALL extends ScheduleEditType {

        @NotNull
        public static final ALL INSTANCE = new ALL();

        private ALL() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType$CURRENT;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class CURRENT extends ScheduleEditType {

        @NotNull
        public static final CURRENT INSTANCE = new CURRENT();

        private CURRENT() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType$FUTURE;", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class FUTURE extends ScheduleEditType {

        @NotNull
        public static final FUTURE INSTANCE = new FUTURE();

        private FUTURE() {
            super(null);
        }
    }

    private ScheduleEditType() {
    }

    public /* synthetic */ ScheduleEditType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
