package com.huami.phn.core.model;

import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00188&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0016\u0010&\u001a\u00020 8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006*"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData;", "", "", "a", "Ljava/lang/String;", "getLinkUrl", "()Ljava/lang/String;", "setLinkUrl", "(Ljava/lang/String;)V", "linkUrl", "", "getTimestamp", "()J", "timestamp", "Lcom/huami/phn/core/model/PHNCardData$State;", "getState", "()Lcom/huami/phn/core/model/PHNCardData$State;", "state", "Ljava/util/Calendar;", "getStart", "()Ljava/util/Calendar;", "start", "getUpdate", "update", "", "getDailyPercent", "()I", "dailyPercent", "", "getTsbValue", "()F", "tsbValue", "", "getHasPlan", "()Z", "hasPlan", "getFlag", "flag", "isRestDay", "<init>", "()V", TrainingAnalytics.ParamKey.STATE, "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class PHNCardData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String linkUrl = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State;", "", "<init>", "()V", "End", "OnGoing", "ToBeStart", "UnInit", "Lcom/huami/phn/core/model/PHNCardData$State$ToBeStart;", "Lcom/huami/phn/core/model/PHNCardData$State$OnGoing;", "Lcom/huami/phn/core/model/PHNCardData$State$End;", "Lcom/huami/phn/core/model/PHNCardData$State$UnInit;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class State {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State$End;", "Lcom/huami/phn/core/model/PHNCardData$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class End extends State {

            @NotNull
            public static final End INSTANCE = new End();

            private End() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State$OnGoing;", "Lcom/huami/phn/core/model/PHNCardData$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class OnGoing extends State {

            @NotNull
            public static final OnGoing INSTANCE = new OnGoing();

            private OnGoing() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State$ToBeStart;", "Lcom/huami/phn/core/model/PHNCardData$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class ToBeStart extends State {

            @NotNull
            public static final ToBeStart INSTANCE = new ToBeStart();

            private ToBeStart() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State$UnInit;", "Lcom/huami/phn/core/model/PHNCardData$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class UnInit extends State {

            @NotNull
            public static final UnInit INSTANCE = new UnInit();

            private UnInit() {
                super(null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract int getDailyPercent();

    public abstract int getFlag();

    public abstract boolean getHasPlan();

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public abstract Calendar getStart();

    @NotNull
    public abstract State getState();

    public abstract long getTimestamp();

    public abstract float getTsbValue();

    @Nullable
    public abstract Calendar getUpdate();

    public abstract boolean isRestDay();

    public final void setLinkUrl(@NotNull String str) {
        this.linkUrl = str;
    }
}
