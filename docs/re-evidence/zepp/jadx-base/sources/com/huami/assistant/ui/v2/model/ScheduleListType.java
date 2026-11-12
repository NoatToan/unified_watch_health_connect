package com.huami.assistant.ui.v2.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "", "", "a", LogUtil.I, "getType", "()I", "type", "<init>", "(I)V", "DATA", "DATE", "EMPTY", "SPLIT", "YEAR", "Lcom/huami/assistant/ui/v2/model/ScheduleListType$YEAR;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType$DATE;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType$SPLIT;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType$EMPTY;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType$DATA;", "assistant_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScheduleListType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType$DATA;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class DATA extends ScheduleListType {

        @NotNull
        public static final DATA INSTANCE = new DATA();

        private DATA() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType$DATE;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class DATE extends ScheduleListType {

        @NotNull
        public static final DATE INSTANCE = new DATE();

        private DATE() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType$EMPTY;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class EMPTY extends ScheduleListType {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType$SPLIT;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class SPLIT extends ScheduleListType {

        @NotNull
        public static final SPLIT INSTANCE = new SPLIT();

        private SPLIT() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleListType$YEAR;", "Lcom/huami/assistant/ui/v2/model/ScheduleListType;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class YEAR extends ScheduleListType {

        @NotNull
        public static final YEAR INSTANCE = new YEAR();

        private YEAR() {
            super(0, null);
        }
    }

    private ScheduleListType(int i) {
        this.type = i;
    }

    public /* synthetic */ ScheduleListType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getType() {
        return this.type;
    }
}
