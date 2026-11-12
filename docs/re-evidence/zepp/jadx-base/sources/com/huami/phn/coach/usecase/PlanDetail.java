package com.huami.phn.coach.usecase;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.phn.core.model.RecommendState;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0003&'(B\u0007¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail;", "", "other", "", "equals", "", "toString", "", "getId", "()J", "id", "Lcom/huami/phn/coach/usecase/PlanDetail$State;", "getState", "()Lcom/huami/phn/coach/usecase/PlanDetail$State;", "state", "Lcom/huami/phn/core/model/RecommendState;", "getRecommend", "()Lcom/huami/phn/core/model/RecommendState;", WatchFaceDetailActivity.FROM_RECOMMEND, "", "getRest", "()[I", "rest", "Lcom/huami/phn/coach/usecase/PlanDetail$DailyPlan;", "getPlan", "()Lcom/huami/phn/coach/usecase/PlanDetail$DailyPlan;", "plan", "Ljava/util/Calendar;", "getStart", "()Ljava/util/Calendar;", "start", "getUpdate", "update", "getDevice", "()Ljava/lang/String;", "device", "<init>", "()V", "DailyPlan", TrainingAnalytics.ParamKey.STATE, "TaringPlan", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class PlanDetail {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$DailyPlan;", "", "Ljava/util/Calendar;", "component1", "Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;", "component2", "component3", "component4", "date", "low", "middle", "high", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "b", "Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;", "getLow", "()Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;", "c", "getMiddle", GoogleApiAvailabilityLight.a, "getHigh", "<init>", "(Ljava/util/Calendar;Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DailyPlan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final Calendar date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final TaringPlan low;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final TaringPlan middle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final TaringPlan high;

        public DailyPlan(@NotNull Calendar calendar, @NotNull TaringPlan taringPlan, @NotNull TaringPlan taringPlan2, @NotNull TaringPlan taringPlan3) {
            this.date = calendar;
            this.low = taringPlan;
            this.middle = taringPlan2;
            this.high = taringPlan3;
        }

        public static /* synthetic */ DailyPlan copy$default(DailyPlan dailyPlan, Calendar calendar, TaringPlan taringPlan, TaringPlan taringPlan2, TaringPlan taringPlan3, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = dailyPlan.date;
            }
            if ((i & 2) != 0) {
                taringPlan = dailyPlan.low;
            }
            if ((i & 4) != 0) {
                taringPlan2 = dailyPlan.middle;
            }
            if ((i & 8) != 0) {
                taringPlan3 = dailyPlan.high;
            }
            return dailyPlan.copy(calendar, taringPlan, taringPlan2, taringPlan3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Calendar getDate() {
            return this.date;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TaringPlan getLow() {
            return this.low;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TaringPlan getMiddle() {
            return this.middle;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TaringPlan getHigh() {
            return this.high;
        }

        @NotNull
        public final DailyPlan copy(@NotNull Calendar date, @NotNull TaringPlan low, @NotNull TaringPlan middle, @NotNull TaringPlan high) {
            return new DailyPlan(date, low, middle, high);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyPlan)) {
                return false;
            }
            DailyPlan dailyPlan = (DailyPlan) other;
            return Intrinsics.areEqual(this.date, dailyPlan.date) && Intrinsics.areEqual(this.low, dailyPlan.low) && Intrinsics.areEqual(this.middle, dailyPlan.middle) && Intrinsics.areEqual(this.high, dailyPlan.high);
        }

        @NotNull
        public final Calendar getDate() {
            return this.date;
        }

        @NotNull
        public final TaringPlan getHigh() {
            return this.high;
        }

        @NotNull
        public final TaringPlan getLow() {
            return this.low;
        }

        @NotNull
        public final TaringPlan getMiddle() {
            return this.middle;
        }

        public int hashCode() {
            return (((((this.date.hashCode() * 31) + this.low.hashCode()) * 31) + this.middle.hashCode()) * 31) + this.high.hashCode();
        }

        @NotNull
        public String toString() {
            return "DailyPlan(date=" + this.date + ", low=" + this.low + ", middle=" + this.middle + ", high=" + this.high + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$State;", "", "<init>", "()V", "End", "OnGoing", "ToBeStart", "Lcom/huami/phn/coach/usecase/PlanDetail$State$ToBeStart;", "Lcom/huami/phn/coach/usecase/PlanDetail$State$OnGoing;", "Lcom/huami/phn/coach/usecase/PlanDetail$State$End;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class State {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$State$End;", "Lcom/huami/phn/coach/usecase/PlanDetail$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class End extends State {

            @NotNull
            public static final End INSTANCE = new End();

            private End() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$State$OnGoing;", "Lcom/huami/phn/coach/usecase/PlanDetail$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class OnGoing extends State {

            @NotNull
            public static final OnGoing INSTANCE = new OnGoing();

            private OnGoing() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$State$ToBeStart;", "Lcom/huami/phn/coach/usecase/PlanDetail$State;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class ToBeStart extends State {

            @NotNull
            public static final ToBeStart INSTANCE = new ToBeStart();

            private ToBeStart() {
                super(null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;", "", "", "component1", "component2", Constants.DATA_KEY_HR, "duration", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getHr", "()I", "b", "getDuration", "<init>", "(II)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class TaringPlan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int hr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int duration;

        public TaringPlan(int i, int i2) {
            this.hr = i;
            this.duration = i2;
        }

        public static /* synthetic */ TaringPlan copy$default(TaringPlan taringPlan, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = taringPlan.hr;
            }
            if ((i3 & 2) != 0) {
                i2 = taringPlan.duration;
            }
            return taringPlan.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHr() {
            return this.hr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        public final TaringPlan copy(int hr, int duration) {
            return new TaringPlan(hr, duration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaringPlan)) {
                return false;
            }
            TaringPlan taringPlan = (TaringPlan) other;
            return this.hr == taringPlan.hr && this.duration == taringPlan.duration;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final int getHr() {
            return this.hr;
        }

        public int hashCode() {
            return (this.hr * 31) + this.duration;
        }

        @NotNull
        public String toString() {
            return "TaringPlan(hr=" + this.hr + ", duration=" + this.duration + ")";
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof PlanDetail) {
            PlanDetail planDetail = (PlanDetail) other;
            if (getId() == planDetail.getId() && Intrinsics.areEqual(getState(), planDetail.getState()) && Intrinsics.areEqual(getRecommend(), planDetail.getRecommend()) && Arrays.equals(getRest(), planDetail.getRest()) && Intrinsics.areEqual(getPlan(), planDetail.getPlan()) && Intrinsics.areEqual(getStart(), planDetail.getStart()) && Intrinsics.areEqual(getUpdate(), planDetail.getUpdate()) && Intrinsics.areEqual(getDevice(), planDetail.getDevice())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public abstract String getDevice();

    public abstract long getId();

    @Nullable
    public abstract DailyPlan getPlan();

    @NotNull
    public abstract RecommendState getRecommend();

    @NotNull
    public abstract int[] getRest();

    @NotNull
    public abstract Calendar getStart();

    @NotNull
    public abstract State getState();

    @Nullable
    public abstract Calendar getUpdate();

    @NotNull
    public String toString() {
        return "PlanDetail(id=" + getId() + ", state=" + getState() + ", recommend=" + getRecommend() + ", rest=" + getRest() + ", plan=" + getPlan() + ", start=" + getStart() + ", update=" + getDevice() + ", device=" + getUpdate() + ")";
    }
}
