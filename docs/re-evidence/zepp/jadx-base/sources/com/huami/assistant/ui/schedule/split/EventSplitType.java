package com.huami.assistant.ui.schedule.split;

import com.huami.nfc.bus.NoticesEntity;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/assistant/ui/schedule/split/EventSplitType;", "", "", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(Ljava/lang/String;)V", JsonParseUtils.CURRENT, "FUTURE", NoticesEntity.LOOP_TYPE_NONE, "Lcom/huami/assistant/ui/schedule/split/EventSplitType$NONE;", "Lcom/huami/assistant/ui/schedule/split/EventSplitType$CURRENT;", "Lcom/huami/assistant/ui/schedule/split/EventSplitType$FUTURE;", "assistant_release"}, k = 1, mv = {1, 5, 1})
public abstract class EventSplitType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/schedule/split/EventSplitType$CURRENT;", "Lcom/huami/assistant/ui/schedule/split/EventSplitType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class CURRENT extends EventSplitType {

        @NotNull
        public static final CURRENT INSTANCE = new CURRENT();

        private CURRENT() {
            super(JsonParseUtils.CURRENT, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/schedule/split/EventSplitType$FUTURE;", "Lcom/huami/assistant/ui/schedule/split/EventSplitType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class FUTURE extends EventSplitType {

        @NotNull
        public static final FUTURE INSTANCE = new FUTURE();

        private FUTURE() {
            super("FUTURE", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/schedule/split/EventSplitType$NONE;", "Lcom/huami/assistant/ui/schedule/split/EventSplitType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class NONE extends EventSplitType {

        @NotNull
        public static final NONE INSTANCE = new NONE();

        private NONE() {
            super(NoticesEntity.LOOP_TYPE_NONE, null);
        }
    }

    private EventSplitType(String str) {
        this.desc = str;
    }

    public /* synthetic */ EventSplitType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
