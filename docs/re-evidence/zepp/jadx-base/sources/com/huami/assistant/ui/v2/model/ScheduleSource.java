package com.huami.assistant.ui.v2.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\t\u0010\u0011\u0012\u0013\u000f\u0014\u0015\u0016\u0017B\u001b\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "", "", "a", LogUtil.I, "getSource", "()I", "source", "", "b", "Z", "isUserSchedule", "()Z", "<init>", "(IZ)V", "Companion", "ANDROID_GOOGLE_SYSTEM", "ANDROID_SYSTEM", "ANDROID_XIAOAI", "ANDROID_ZEPP", "IOS_SYSTEM", "IOS_XIAOAI", "IOS_ZEPP", "LUNAR", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_ZEPP;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_XIAOAI;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_ZEPP;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_GOOGLE_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_XIAOAI;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource$LUNAR;", "assistant_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScheduleSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isUserSchedule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_GOOGLE_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class ANDROID_GOOGLE_SYSTEM extends ScheduleSource {

        @NotNull
        public static final ANDROID_GOOGLE_SYSTEM INSTANCE = new ANDROID_GOOGLE_SYSTEM();

        private ANDROID_GOOGLE_SYSTEM() {
            super(130, false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class ANDROID_SYSTEM extends ScheduleSource {

        @NotNull
        public static final ANDROID_SYSTEM INSTANCE = new ANDROID_SYSTEM();

        private ANDROID_SYSTEM() {
            super(130, false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_XIAOAI;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class ANDROID_XIAOAI extends ScheduleSource {

        @NotNull
        public static final ANDROID_XIAOAI INSTANCE = new ANDROID_XIAOAI();

        private ANDROID_XIAOAI() {
            super(132, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$ANDROID_ZEPP;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class ANDROID_ZEPP extends ScheduleSource {

        @NotNull
        public static final ANDROID_ZEPP INSTANCE = new ANDROID_ZEPP();

        private ANDROID_ZEPP() {
            super(129, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$Companion;", "", "", "sourceValue", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", FeedbackActivity.KEY_FEEDBACK_SOURCE, "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleSource fromSource(int sourceValue) {
            IOS_ZEPP ios_zepp = IOS_ZEPP.INSTANCE;
            if (sourceValue == ios_zepp.getSource()) {
                return ios_zepp;
            }
            IOS_XIAOAI ios_xiaoai = IOS_XIAOAI.INSTANCE;
            if (sourceValue == ios_xiaoai.getSource()) {
                return ios_xiaoai;
            }
            IOS_SYSTEM ios_system = IOS_SYSTEM.INSTANCE;
            if (sourceValue == ios_system.getSource()) {
                return ios_system;
            }
            ANDROID_ZEPP android_zepp = ANDROID_ZEPP.INSTANCE;
            if (sourceValue == android_zepp.getSource()) {
                return android_zepp;
            }
            ANDROID_GOOGLE_SYSTEM android_google_system = ANDROID_GOOGLE_SYSTEM.INSTANCE;
            if (sourceValue == android_google_system.getSource()) {
                return android_google_system;
            }
            ANDROID_SYSTEM android_system = ANDROID_SYSTEM.INSTANCE;
            if (sourceValue == android_system.getSource()) {
                return android_system;
            }
            LUNAR lunar = LUNAR.INSTANCE;
            return sourceValue == lunar.getSource() ? lunar : ANDROID_XIAOAI.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_SYSTEM;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class IOS_SYSTEM extends ScheduleSource {

        @NotNull
        public static final IOS_SYSTEM INSTANCE = new IOS_SYSTEM();

        private IOS_SYSTEM() {
            super(3, false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_XIAOAI;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class IOS_XIAOAI extends ScheduleSource {

        @NotNull
        public static final IOS_XIAOAI INSTANCE = new IOS_XIAOAI();

        private IOS_XIAOAI() {
            super(2, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$IOS_ZEPP;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class IOS_ZEPP extends ScheduleSource {

        @NotNull
        public static final IOS_ZEPP INSTANCE = new IOS_ZEPP();

        private IOS_ZEPP() {
            super(1, 1 == true ? 1 : 0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSource$LUNAR;", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class LUNAR extends ScheduleSource {

        @NotNull
        public static final LUNAR INSTANCE = new LUNAR();

        private LUNAR() {
            super(16, false, 2, null);
        }
    }

    private ScheduleSource(int i, boolean z) {
        this.source = i;
        this.isUserSchedule = z;
    }

    public /* synthetic */ ScheduleSource(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: isUserSchedule, reason: from getter */
    public final boolean getIsUserSchedule() {
        return this.isUserSchedule;
    }

    public /* synthetic */ ScheduleSource(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, null);
    }
}
