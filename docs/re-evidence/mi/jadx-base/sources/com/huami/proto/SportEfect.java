package com.huami.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SportEfect {

    /* JADX INFO: renamed from: com.huami.proto.SportEfect$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class SportEffectHistoryMessage extends GeneratedMessageLite<SportEffectHistoryMessage, Builder> implements SportEffectHistoryMessageOrBuilder {
        public static final int DAY_FIELD_NUMBER = 3;
        private static final SportEffectHistoryMessage DEFAULT_INSTANCE;
        public static final int FLAG_FIELD_NUMBER = 9;
        public static final int MONTH_FIELD_NUMBER = 2;
        private static volatile vkh<SportEffectHistoryMessage> PARSER = null;
        public static final int TRAININGLOADBALANCE_ANAEROBIC_FIELD_NUMBER = 5;
        public static final int TRAININGLOADBALANCE_HIGH_INTENSITY_AEROBIC_FIELD_NUMBER = 6;
        public static final int TRAININGLOADBALANCE_LOW_INTENSITY_AEROBIC_FIELD_NUMBER = 7;
        public static final int TRAINING_LOAD_MONTHLY_HISTORY_FIELD_NUMBER = 11;
        public static final int TRAINING_LOAD_PEAK_FIELD_NUMBER = 4;
        public static final int TRAINING_LOAD_WEEKLY_HISTORY_FIELD_NUMBER = 10;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_MAX_HISTORY_FIELD_NUMBER = 13;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_MIN_HISTORY_FIELD_NUMBER = 12;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_OVERREACHING_HISTORY_FIELD_NUMBER = 14;
        public static final int UPDATETIME_HISTORY_FIELD_NUMBER = 15;
        public static final int VO2MAX_HISTORY_FIELD_NUMBER = 8;
        public static final int YEAR_FIELD_NUMBER = 1;
        private int bitField0_;
        private int flag_;
        private d0.g year_ = GeneratedMessageLite.emptyIntList();
        private d0.g month_ = GeneratedMessageLite.emptyIntList();
        private d0.g day_ = GeneratedMessageLite.emptyIntList();
        private d0.f trainingLoadPeak_ = GeneratedMessageLite.emptyFloatList();
        private d0.f trainingLoadBalanceAnaerobic_ = GeneratedMessageLite.emptyFloatList();
        private d0.f trainingLoadBalanceHighIntensityAerobic_ = GeneratedMessageLite.emptyFloatList();
        private d0.f trainingLoadBalanceLowIntensityAerobic_ = GeneratedMessageLite.emptyFloatList();
        private d0.f vO2MaxHistory_ = GeneratedMessageLite.emptyFloatList();
        private d0.f trainingLoadWeeklyHistory_ = GeneratedMessageLite.emptyFloatList();
        private d0.f trainingLoadMonthlyHistory_ = GeneratedMessageLite.emptyFloatList();
        private d0.g trainingLoadWeeklyOptimalMinHistory_ = GeneratedMessageLite.emptyIntList();
        private d0.g trainingLoadWeeklyOptimalMaxHistory_ = GeneratedMessageLite.emptyIntList();
        private d0.g trainingLoadWeeklyOptimalOverreachingHistory_ = GeneratedMessageLite.emptyIntList();
        private d0.g updateTimeHistory_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<SportEffectHistoryMessage, Builder> implements SportEffectHistoryMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllDay(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllDay(iterable);
                return this;
            }

            public Builder addAllMonth(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllMonth(iterable);
                return this;
            }

            public Builder addAllTrainingLoadBalanceAnaerobic(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadBalanceAnaerobic(iterable);
                return this;
            }

            public Builder addAllTrainingLoadBalanceHighIntensityAerobic(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadBalanceHighIntensityAerobic(iterable);
                return this;
            }

            public Builder addAllTrainingLoadBalanceLowIntensityAerobic(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadBalanceLowIntensityAerobic(iterable);
                return this;
            }

            public Builder addAllTrainingLoadMonthlyHistory(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadMonthlyHistory(iterable);
                return this;
            }

            public Builder addAllTrainingLoadPeak(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadPeak(iterable);
                return this;
            }

            public Builder addAllTrainingLoadWeeklyHistory(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadWeeklyHistory(iterable);
                return this;
            }

            public Builder addAllTrainingLoadWeeklyOptimalMaxHistory(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadWeeklyOptimalMaxHistory(iterable);
                return this;
            }

            public Builder addAllTrainingLoadWeeklyOptimalMinHistory(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadWeeklyOptimalMinHistory(iterable);
                return this;
            }

            public Builder addAllTrainingLoadWeeklyOptimalOverreachingHistory(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllTrainingLoadWeeklyOptimalOverreachingHistory(iterable);
                return this;
            }

            public Builder addAllUpdateTimeHistory(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllUpdateTimeHistory(iterable);
                return this;
            }

            public Builder addAllVO2MaxHistory(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllVO2MaxHistory(iterable);
                return this;
            }

            public Builder addAllYear(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addAllYear(iterable);
                return this;
            }

            public Builder addDay(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addDay(i);
                return this;
            }

            public Builder addMonth(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addMonth(i);
                return this;
            }

            public Builder addTrainingLoadBalanceAnaerobic(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadBalanceAnaerobic(f);
                return this;
            }

            public Builder addTrainingLoadBalanceHighIntensityAerobic(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadBalanceHighIntensityAerobic(f);
                return this;
            }

            public Builder addTrainingLoadBalanceLowIntensityAerobic(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadBalanceLowIntensityAerobic(f);
                return this;
            }

            public Builder addTrainingLoadMonthlyHistory(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadMonthlyHistory(f);
                return this;
            }

            public Builder addTrainingLoadPeak(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadPeak(f);
                return this;
            }

            public Builder addTrainingLoadWeeklyHistory(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadWeeklyHistory(f);
                return this;
            }

            public Builder addTrainingLoadWeeklyOptimalMaxHistory(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadWeeklyOptimalMaxHistory(i);
                return this;
            }

            public Builder addTrainingLoadWeeklyOptimalMinHistory(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadWeeklyOptimalMinHistory(i);
                return this;
            }

            public Builder addTrainingLoadWeeklyOptimalOverreachingHistory(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addTrainingLoadWeeklyOptimalOverreachingHistory(i);
                return this;
            }

            public Builder addUpdateTimeHistory(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addUpdateTimeHistory(i);
                return this;
            }

            public Builder addVO2MaxHistory(float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addVO2MaxHistory(f);
                return this;
            }

            public Builder addYear(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).addYear(i);
                return this;
            }

            public Builder clearDay() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearDay();
                return this;
            }

            public Builder clearFlag() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearFlag();
                return this;
            }

            public Builder clearMonth() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearMonth();
                return this;
            }

            public Builder clearTrainingLoadBalanceAnaerobic() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadBalanceAnaerobic();
                return this;
            }

            public Builder clearTrainingLoadBalanceHighIntensityAerobic() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadBalanceHighIntensityAerobic();
                return this;
            }

            public Builder clearTrainingLoadBalanceLowIntensityAerobic() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadBalanceLowIntensityAerobic();
                return this;
            }

            public Builder clearTrainingLoadMonthlyHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadMonthlyHistory();
                return this;
            }

            public Builder clearTrainingLoadPeak() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadPeak();
                return this;
            }

            public Builder clearTrainingLoadWeeklyHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadWeeklyHistory();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalMaxHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadWeeklyOptimalMaxHistory();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalMinHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadWeeklyOptimalMinHistory();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalOverreachingHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearTrainingLoadWeeklyOptimalOverreachingHistory();
                return this;
            }

            public Builder clearUpdateTimeHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearUpdateTimeHistory();
                return this;
            }

            public Builder clearVO2MaxHistory() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearVO2MaxHistory();
                return this;
            }

            public Builder clearYear() {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).clearYear();
                return this;
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getDay(int i) {
                return ((SportEffectHistoryMessage) this.instance).getDay(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getDayCount() {
                return ((SportEffectHistoryMessage) this.instance).getDayCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getDayList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getDayList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getFlag() {
                return ((SportEffectHistoryMessage) this.instance).getFlag();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getMonth(int i) {
                return ((SportEffectHistoryMessage) this.instance).getMonth(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getMonthCount() {
                return ((SportEffectHistoryMessage) this.instance).getMonthCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getMonthList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getMonthList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadBalanceAnaerobic(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceAnaerobic(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadBalanceAnaerobicCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceAnaerobicCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadBalanceAnaerobicList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceAnaerobicList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadBalanceHighIntensityAerobic(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceHighIntensityAerobic(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadBalanceHighIntensityAerobicCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceHighIntensityAerobicCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadBalanceHighIntensityAerobicList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceHighIntensityAerobicList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadBalanceLowIntensityAerobic(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceLowIntensityAerobic(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadBalanceLowIntensityAerobicCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceLowIntensityAerobicCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadBalanceLowIntensityAerobicList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadBalanceLowIntensityAerobicList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadMonthlyHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadMonthlyHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadMonthlyHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadMonthlyHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadMonthlyHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadMonthlyHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadPeak(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadPeak(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadPeakCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadPeakCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadPeakList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadPeakList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getTrainingLoadWeeklyHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getTrainingLoadWeeklyHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMaxHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMaxHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMaxHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMaxHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getTrainingLoadWeeklyOptimalMaxHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMaxHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMinHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMinHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMinHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMinHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getTrainingLoadWeeklyOptimalMinHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalMinHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalOverreachingHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalOverreachingHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalOverreachingHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalOverreachingHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getTrainingLoadWeeklyOptimalOverreachingHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getTrainingLoadWeeklyOptimalOverreachingHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getUpdateTimeHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getUpdateTimeHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getUpdateTimeHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getUpdateTimeHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getUpdateTimeHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getUpdateTimeHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public float getVO2MaxHistory(int i) {
                return ((SportEffectHistoryMessage) this.instance).getVO2MaxHistory(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getVO2MaxHistoryCount() {
                return ((SportEffectHistoryMessage) this.instance).getVO2MaxHistoryCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Float> getVO2MaxHistoryList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getVO2MaxHistoryList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getYear(int i) {
                return ((SportEffectHistoryMessage) this.instance).getYear(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public int getYearCount() {
                return ((SportEffectHistoryMessage) this.instance).getYearCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public List<Integer> getYearList() {
                return Collections.unmodifiableList(((SportEffectHistoryMessage) this.instance).getYearList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
            public boolean hasFlag() {
                return ((SportEffectHistoryMessage) this.instance).hasFlag();
            }

            public Builder setDay(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setDay(i, i2);
                return this;
            }

            public Builder setFlag(int i) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setFlag(i);
                return this;
            }

            public Builder setMonth(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setMonth(i, i2);
                return this;
            }

            public Builder setTrainingLoadBalanceAnaerobic(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadBalanceAnaerobic(i, f);
                return this;
            }

            public Builder setTrainingLoadBalanceHighIntensityAerobic(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadBalanceHighIntensityAerobic(i, f);
                return this;
            }

            public Builder setTrainingLoadBalanceLowIntensityAerobic(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadBalanceLowIntensityAerobic(i, f);
                return this;
            }

            public Builder setTrainingLoadMonthlyHistory(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadMonthlyHistory(i, f);
                return this;
            }

            public Builder setTrainingLoadPeak(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadPeak(i, f);
                return this;
            }

            public Builder setTrainingLoadWeeklyHistory(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadWeeklyHistory(i, f);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalMaxHistory(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadWeeklyOptimalMaxHistory(i, i2);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalMinHistory(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadWeeklyOptimalMinHistory(i, i2);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalOverreachingHistory(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setTrainingLoadWeeklyOptimalOverreachingHistory(i, i2);
                return this;
            }

            public Builder setUpdateTimeHistory(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setUpdateTimeHistory(i, i2);
                return this;
            }

            public Builder setVO2MaxHistory(int i, float f) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setVO2MaxHistory(i, f);
                return this;
            }

            public Builder setYear(int i, int i2) {
                copyOnWrite();
                ((SportEffectHistoryMessage) this.instance).setYear(i, i2);
                return this;
            }

            private Builder() {
                super(SportEffectHistoryMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SportEffectHistoryMessage sportEffectHistoryMessage = new SportEffectHistoryMessage();
            DEFAULT_INSTANCE = sportEffectHistoryMessage;
            GeneratedMessageLite.registerDefaultInstance(SportEffectHistoryMessage.class, sportEffectHistoryMessage);
        }

        private SportEffectHistoryMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDay(Iterable<? extends Integer> iterable) {
            ensureDayIsMutable();
            b.addAll((Iterable) iterable, (List) this.day_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMonth(Iterable<? extends Integer> iterable) {
            ensureMonthIsMutable();
            b.addAll((Iterable) iterable, (List) this.month_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadBalanceAnaerobic(Iterable<? extends Float> iterable) {
            ensureTrainingLoadBalanceAnaerobicIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadBalanceAnaerobic_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadBalanceHighIntensityAerobic(Iterable<? extends Float> iterable) {
            ensureTrainingLoadBalanceHighIntensityAerobicIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadBalanceHighIntensityAerobic_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadBalanceLowIntensityAerobic(Iterable<? extends Float> iterable) {
            ensureTrainingLoadBalanceLowIntensityAerobicIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadBalanceLowIntensityAerobic_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadMonthlyHistory(Iterable<? extends Float> iterable) {
            ensureTrainingLoadMonthlyHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadMonthlyHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadPeak(Iterable<? extends Float> iterable) {
            ensureTrainingLoadPeakIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadPeak_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadWeeklyHistory(Iterable<? extends Float> iterable) {
            ensureTrainingLoadWeeklyHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadWeeklyHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadWeeklyOptimalMaxHistory(Iterable<? extends Integer> iterable) {
            ensureTrainingLoadWeeklyOptimalMaxHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadWeeklyOptimalMaxHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadWeeklyOptimalMinHistory(Iterable<? extends Integer> iterable) {
            ensureTrainingLoadWeeklyOptimalMinHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadWeeklyOptimalMinHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrainingLoadWeeklyOptimalOverreachingHistory(Iterable<? extends Integer> iterable) {
            ensureTrainingLoadWeeklyOptimalOverreachingHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.trainingLoadWeeklyOptimalOverreachingHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdateTimeHistory(Iterable<? extends Integer> iterable) {
            ensureUpdateTimeHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.updateTimeHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVO2MaxHistory(Iterable<? extends Float> iterable) {
            ensureVO2MaxHistoryIsMutable();
            b.addAll((Iterable) iterable, (List) this.vO2MaxHistory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllYear(Iterable<? extends Integer> iterable) {
            ensureYearIsMutable();
            b.addAll((Iterable) iterable, (List) this.year_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDay(int i) {
            ensureDayIsMutable();
            this.day_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMonth(int i) {
            ensureMonthIsMutable();
            this.month_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadBalanceAnaerobic(float f) {
            ensureTrainingLoadBalanceAnaerobicIsMutable();
            this.trainingLoadBalanceAnaerobic_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadBalanceHighIntensityAerobic(float f) {
            ensureTrainingLoadBalanceHighIntensityAerobicIsMutable();
            this.trainingLoadBalanceHighIntensityAerobic_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadBalanceLowIntensityAerobic(float f) {
            ensureTrainingLoadBalanceLowIntensityAerobicIsMutable();
            this.trainingLoadBalanceLowIntensityAerobic_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadMonthlyHistory(float f) {
            ensureTrainingLoadMonthlyHistoryIsMutable();
            this.trainingLoadMonthlyHistory_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadPeak(float f) {
            ensureTrainingLoadPeakIsMutable();
            this.trainingLoadPeak_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadWeeklyHistory(float f) {
            ensureTrainingLoadWeeklyHistoryIsMutable();
            this.trainingLoadWeeklyHistory_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadWeeklyOptimalMaxHistory(int i) {
            ensureTrainingLoadWeeklyOptimalMaxHistoryIsMutable();
            this.trainingLoadWeeklyOptimalMaxHistory_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadWeeklyOptimalMinHistory(int i) {
            ensureTrainingLoadWeeklyOptimalMinHistoryIsMutable();
            this.trainingLoadWeeklyOptimalMinHistory_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrainingLoadWeeklyOptimalOverreachingHistory(int i) {
            ensureTrainingLoadWeeklyOptimalOverreachingHistoryIsMutable();
            this.trainingLoadWeeklyOptimalOverreachingHistory_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdateTimeHistory(int i) {
            ensureUpdateTimeHistoryIsMutable();
            this.updateTimeHistory_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVO2MaxHistory(float f) {
            ensureVO2MaxHistoryIsMutable();
            this.vO2MaxHistory_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addYear(int i) {
            ensureYearIsMutable();
            this.year_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDay() {
            this.day_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlag() {
            this.bitField0_ &= -2;
            this.flag_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonth() {
            this.month_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceAnaerobic() {
            this.trainingLoadBalanceAnaerobic_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceHighIntensityAerobic() {
            this.trainingLoadBalanceHighIntensityAerobic_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceLowIntensityAerobic() {
            this.trainingLoadBalanceLowIntensityAerobic_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadMonthlyHistory() {
            this.trainingLoadMonthlyHistory_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadPeak() {
            this.trainingLoadPeak_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyHistory() {
            this.trainingLoadWeeklyHistory_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalMaxHistory() {
            this.trainingLoadWeeklyOptimalMaxHistory_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalMinHistory() {
            this.trainingLoadWeeklyOptimalMinHistory_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalOverreachingHistory() {
            this.trainingLoadWeeklyOptimalOverreachingHistory_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateTimeHistory() {
            this.updateTimeHistory_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVO2MaxHistory() {
            this.vO2MaxHistory_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearYear() {
            this.year_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureDayIsMutable() {
            d0.g gVar = this.day_;
            if (gVar.c()) {
                return;
            }
            this.day_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureMonthIsMutable() {
            d0.g gVar = this.month_;
            if (gVar.c()) {
                return;
            }
            this.month_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureTrainingLoadBalanceAnaerobicIsMutable() {
            d0.f fVar = this.trainingLoadBalanceAnaerobic_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadBalanceAnaerobic_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadBalanceHighIntensityAerobicIsMutable() {
            d0.f fVar = this.trainingLoadBalanceHighIntensityAerobic_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadBalanceHighIntensityAerobic_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadBalanceLowIntensityAerobicIsMutable() {
            d0.f fVar = this.trainingLoadBalanceLowIntensityAerobic_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadBalanceLowIntensityAerobic_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadMonthlyHistoryIsMutable() {
            d0.f fVar = this.trainingLoadMonthlyHistory_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadMonthlyHistory_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadPeakIsMutable() {
            d0.f fVar = this.trainingLoadPeak_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadPeak_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadWeeklyHistoryIsMutable() {
            d0.f fVar = this.trainingLoadWeeklyHistory_;
            if (fVar.c()) {
                return;
            }
            this.trainingLoadWeeklyHistory_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureTrainingLoadWeeklyOptimalMaxHistoryIsMutable() {
            d0.g gVar = this.trainingLoadWeeklyOptimalMaxHistory_;
            if (gVar.c()) {
                return;
            }
            this.trainingLoadWeeklyOptimalMaxHistory_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureTrainingLoadWeeklyOptimalMinHistoryIsMutable() {
            d0.g gVar = this.trainingLoadWeeklyOptimalMinHistory_;
            if (gVar.c()) {
                return;
            }
            this.trainingLoadWeeklyOptimalMinHistory_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureTrainingLoadWeeklyOptimalOverreachingHistoryIsMutable() {
            d0.g gVar = this.trainingLoadWeeklyOptimalOverreachingHistory_;
            if (gVar.c()) {
                return;
            }
            this.trainingLoadWeeklyOptimalOverreachingHistory_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUpdateTimeHistoryIsMutable() {
            d0.g gVar = this.updateTimeHistory_;
            if (gVar.c()) {
                return;
            }
            this.updateTimeHistory_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureVO2MaxHistoryIsMutable() {
            d0.f fVar = this.vO2MaxHistory_;
            if (fVar.c()) {
                return;
            }
            this.vO2MaxHistory_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureYearIsMutable() {
            d0.g gVar = this.year_;
            if (gVar.c()) {
                return;
            }
            this.year_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static SportEffectHistoryMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportEffectHistoryMessage parseDelimitedFrom(InputStream inputStream) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportEffectHistoryMessage parseFrom(ByteBuffer byteBuffer) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SportEffectHistoryMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDay(int i, int i2) {
            ensureDayIsMutable();
            this.day_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlag(int i) {
            this.bitField0_ |= 1;
            this.flag_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonth(int i, int i2) {
            ensureMonthIsMutable();
            this.month_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceAnaerobic(int i, float f) {
            ensureTrainingLoadBalanceAnaerobicIsMutable();
            this.trainingLoadBalanceAnaerobic_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceHighIntensityAerobic(int i, float f) {
            ensureTrainingLoadBalanceHighIntensityAerobicIsMutable();
            this.trainingLoadBalanceHighIntensityAerobic_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceLowIntensityAerobic(int i, float f) {
            ensureTrainingLoadBalanceLowIntensityAerobicIsMutable();
            this.trainingLoadBalanceLowIntensityAerobic_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadMonthlyHistory(int i, float f) {
            ensureTrainingLoadMonthlyHistoryIsMutable();
            this.trainingLoadMonthlyHistory_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadPeak(int i, float f) {
            ensureTrainingLoadPeakIsMutable();
            this.trainingLoadPeak_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyHistory(int i, float f) {
            ensureTrainingLoadWeeklyHistoryIsMutable();
            this.trainingLoadWeeklyHistory_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalMaxHistory(int i, int i2) {
            ensureTrainingLoadWeeklyOptimalMaxHistoryIsMutable();
            this.trainingLoadWeeklyOptimalMaxHistory_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalMinHistory(int i, int i2) {
            ensureTrainingLoadWeeklyOptimalMinHistoryIsMutable();
            this.trainingLoadWeeklyOptimalMinHistory_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalOverreachingHistory(int i, int i2) {
            ensureTrainingLoadWeeklyOptimalOverreachingHistoryIsMutable();
            this.trainingLoadWeeklyOptimalOverreachingHistory_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTimeHistory(int i, int i2) {
            ensureUpdateTimeHistoryIsMutable();
            this.updateTimeHistory_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVO2MaxHistory(int i, float f) {
            ensureVO2MaxHistoryIsMutable();
            this.vO2MaxHistory_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYear(int i, int i2) {
            ensureYearIsMutable();
            this.year_.K(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SportEffectHistoryMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u000e\u0000\u0001\u001d\u0002\u001d\u0003\u001d\u0004\u0013\u0005\u0013\u0006\u0013\u0007\u0013\b\u0013\tင\u0000\n\u0013\u000b\u0013\f\u001d\r\u001d\u000e\u001d\u000f\u001d", new Object[]{"bitField0_", "year_", "month_", "day_", "trainingLoadPeak_", "trainingLoadBalanceAnaerobic_", "trainingLoadBalanceHighIntensityAerobic_", "trainingLoadBalanceLowIntensityAerobic_", "vO2MaxHistory_", "flag_", "trainingLoadWeeklyHistory_", "trainingLoadMonthlyHistory_", "trainingLoadWeeklyOptimalMinHistory_", "trainingLoadWeeklyOptimalMaxHistory_", "trainingLoadWeeklyOptimalOverreachingHistory_", "updateTimeHistory_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SportEffectHistoryMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SportEffectHistoryMessage.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getDay(int i) {
            return this.day_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getDayCount() {
            return this.day_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getDayList() {
            return this.day_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getFlag() {
            return this.flag_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getMonth(int i) {
            return this.month_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getMonthCount() {
            return this.month_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getMonthList() {
            return this.month_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadBalanceAnaerobic(int i) {
            return this.trainingLoadBalanceAnaerobic_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadBalanceAnaerobicCount() {
            return this.trainingLoadBalanceAnaerobic_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadBalanceAnaerobicList() {
            return this.trainingLoadBalanceAnaerobic_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadBalanceHighIntensityAerobic(int i) {
            return this.trainingLoadBalanceHighIntensityAerobic_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadBalanceHighIntensityAerobicCount() {
            return this.trainingLoadBalanceHighIntensityAerobic_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadBalanceHighIntensityAerobicList() {
            return this.trainingLoadBalanceHighIntensityAerobic_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadBalanceLowIntensityAerobic(int i) {
            return this.trainingLoadBalanceLowIntensityAerobic_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadBalanceLowIntensityAerobicCount() {
            return this.trainingLoadBalanceLowIntensityAerobic_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadBalanceLowIntensityAerobicList() {
            return this.trainingLoadBalanceLowIntensityAerobic_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadMonthlyHistory(int i) {
            return this.trainingLoadMonthlyHistory_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadMonthlyHistoryCount() {
            return this.trainingLoadMonthlyHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadMonthlyHistoryList() {
            return this.trainingLoadMonthlyHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadPeak(int i) {
            return this.trainingLoadPeak_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadPeakCount() {
            return this.trainingLoadPeak_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadPeakList() {
            return this.trainingLoadPeak_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getTrainingLoadWeeklyHistory(int i) {
            return this.trainingLoadWeeklyHistory_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyHistoryCount() {
            return this.trainingLoadWeeklyHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getTrainingLoadWeeklyHistoryList() {
            return this.trainingLoadWeeklyHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMaxHistory(int i) {
            return this.trainingLoadWeeklyOptimalMaxHistory_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMaxHistoryCount() {
            return this.trainingLoadWeeklyOptimalMaxHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getTrainingLoadWeeklyOptimalMaxHistoryList() {
            return this.trainingLoadWeeklyOptimalMaxHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMinHistory(int i) {
            return this.trainingLoadWeeklyOptimalMinHistory_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMinHistoryCount() {
            return this.trainingLoadWeeklyOptimalMinHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getTrainingLoadWeeklyOptimalMinHistoryList() {
            return this.trainingLoadWeeklyOptimalMinHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalOverreachingHistory(int i) {
            return this.trainingLoadWeeklyOptimalOverreachingHistory_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalOverreachingHistoryCount() {
            return this.trainingLoadWeeklyOptimalOverreachingHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getTrainingLoadWeeklyOptimalOverreachingHistoryList() {
            return this.trainingLoadWeeklyOptimalOverreachingHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getUpdateTimeHistory(int i) {
            return this.updateTimeHistory_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getUpdateTimeHistoryCount() {
            return this.updateTimeHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getUpdateTimeHistoryList() {
            return this.updateTimeHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public float getVO2MaxHistory(int i) {
            return this.vO2MaxHistory_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getVO2MaxHistoryCount() {
            return this.vO2MaxHistory_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Float> getVO2MaxHistoryList() {
            return this.vO2MaxHistory_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getYear(int i) {
            return this.year_.getInt(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public int getYearCount() {
            return this.year_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public List<Integer> getYearList() {
            return this.year_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectHistoryMessageOrBuilder
        public boolean hasFlag() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SportEffectHistoryMessage sportEffectHistoryMessage) {
            return DEFAULT_INSTANCE.createBuilder(sportEffectHistoryMessage);
        }

        public static SportEffectHistoryMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportEffectHistoryMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SportEffectHistoryMessage parseFrom(ByteString byteString) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SportEffectHistoryMessage parseFrom(ByteString byteString, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SportEffectHistoryMessage parseFrom(byte[] bArr) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SportEffectHistoryMessage parseFrom(byte[] bArr, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SportEffectHistoryMessage parseFrom(InputStream inputStream) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportEffectHistoryMessage parseFrom(InputStream inputStream, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportEffectHistoryMessage parseFrom(j jVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SportEffectHistoryMessage parseFrom(j jVar, t tVar) {
            return (SportEffectHistoryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SportEffectHistoryMessageOrBuilder extends bsf {
        int getDay(int i);

        int getDayCount();

        List<Integer> getDayList();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getFlag();

        int getMonth(int i);

        int getMonthCount();

        List<Integer> getMonthList();

        float getTrainingLoadBalanceAnaerobic(int i);

        int getTrainingLoadBalanceAnaerobicCount();

        List<Float> getTrainingLoadBalanceAnaerobicList();

        float getTrainingLoadBalanceHighIntensityAerobic(int i);

        int getTrainingLoadBalanceHighIntensityAerobicCount();

        List<Float> getTrainingLoadBalanceHighIntensityAerobicList();

        float getTrainingLoadBalanceLowIntensityAerobic(int i);

        int getTrainingLoadBalanceLowIntensityAerobicCount();

        List<Float> getTrainingLoadBalanceLowIntensityAerobicList();

        float getTrainingLoadMonthlyHistory(int i);

        int getTrainingLoadMonthlyHistoryCount();

        List<Float> getTrainingLoadMonthlyHistoryList();

        float getTrainingLoadPeak(int i);

        int getTrainingLoadPeakCount();

        List<Float> getTrainingLoadPeakList();

        float getTrainingLoadWeeklyHistory(int i);

        int getTrainingLoadWeeklyHistoryCount();

        List<Float> getTrainingLoadWeeklyHistoryList();

        int getTrainingLoadWeeklyOptimalMaxHistory(int i);

        int getTrainingLoadWeeklyOptimalMaxHistoryCount();

        List<Integer> getTrainingLoadWeeklyOptimalMaxHistoryList();

        int getTrainingLoadWeeklyOptimalMinHistory(int i);

        int getTrainingLoadWeeklyOptimalMinHistoryCount();

        List<Integer> getTrainingLoadWeeklyOptimalMinHistoryList();

        int getTrainingLoadWeeklyOptimalOverreachingHistory(int i);

        int getTrainingLoadWeeklyOptimalOverreachingHistoryCount();

        List<Integer> getTrainingLoadWeeklyOptimalOverreachingHistoryList();

        int getUpdateTimeHistory(int i);

        int getUpdateTimeHistoryCount();

        List<Integer> getUpdateTimeHistoryList();

        float getVO2MaxHistory(int i);

        int getVO2MaxHistoryCount();

        List<Float> getVO2MaxHistoryList();

        int getYear(int i);

        int getYearCount();

        List<Integer> getYearList();

        boolean hasFlag();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SportEffectMessage extends GeneratedMessageLite<SportEffectMessage, Builder> implements SportEffectMessageOrBuilder {
        public static final int ACTIVITY_CLASS_FIELD_NUMBER = 3;
        public static final int AEROBIC_HR_RATE_FIELD_NUMBER = 28;
        public static final int AEROBIC_SPEED_RATE_FIELD_NUMBER = 30;
        public static final int AEROBIC_TRAINING_EFFECT_FIELD_NUMBER = 8;
        public static final int ANAEROBIC_HR_RATE_FIELD_NUMBER = 29;
        public static final int ANAEROBIC_SPEED_RATE_FIELD_NUMBER = 31;
        public static final int ANAEROBIC_TRAINING_EFFECT_FIELD_NUMBER = 9;
        private static final SportEffectMessage DEFAULT_INSTANCE;
        public static final int EPOC_FIELD_NUMBER = 6;
        public static final int HUAMI_SPORTS_HISTORY_RESULT_T_FIELD_NUMBER = 27;
        public static final int IF_VALID_VO2MAX_RAISE_FIELD_NUMBER = 22;
        public static final int LACTATE_THRESHOLD_HR_FIELD_NUMBER = 24;
        public static final int LACTATE_THRESHOLD_SPEED_FIELD_NUMBER = 25;
        public static final int LASTVALID_VO2MAX_FIX_VALUE_FIELD_NUMBER = 21;
        public static final int LASTVALID_VO2MAX_UTC_TIME_FIELD_NUMBER = 20;
        public static final int MAXIMALHR_FIELD_NUMBER = 4;
        private static volatile vkh<SportEffectMessage> PARSER = null;
        public static final int PHYSICAL_STATE_FIELD_NUMBER = 32;
        public static final int RECOVERY_TIME_FIELD_NUMBER = 11;
        public static final int RESULT_SIZE_FIELD_NUMBER = 5;
        public static final int RESULT_VER_FIELD_NUMBER = 1;
        public static final int RUNNING_PERFORMANCE_PREDICT_FIELD_NUMBER = 10;
        public static final int SPORT_END_UTC_TIME_FIELD_NUMBER = 26;
        public static final int TRAININGLOADBALANCE_ANAEROBIC_MONTHLY_FIELD_NUMBER = 17;
        public static final int TRAININGLOADBALANCE_HIGH_INTENSITY_AEROBIC_MONTHLY_FIELD_NUMBER = 18;
        public static final int TRAININGLOADBALANCE_LOW_INTENSITY_AEROBIC_MONTHLY_FIELD_NUMBER = 19;
        public static final int TRAINING_LOAD_MONTHLY_FIELD_NUMBER = 16;
        public static final int TRAINING_LOAD_WEEKLY_FIELD_NUMBER = 15;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_MAX_FIELD_NUMBER = 13;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_MIN_FIELD_NUMBER = 12;
        public static final int TRAINING_LOAD_WEEKLY_OPTIMAL_OVERREACHING_FIELD_NUMBER = 14;
        public static final int VO2MAX_FIELD_NUMBER = 7;
        public static final int VO2_FIELD_NUMBER = 2;
        public static final int WORKOUT_LABEL_FIELD_NUMBER = 23;
        private int activityClass_;
        private float aerobicHrRate_;
        private float aerobicSpeedRate_;
        private float aerobicTrainingEffect_;
        private float anaerobicHrRate_;
        private float anaerobicSpeedRate_;
        private float anaerobicTrainingEffect_;
        private int bitField0_;
        private float ePOC_;
        private SportEffectHistoryMessage huamiSportsHistoryResultT_;
        private int ifValidVo2MaxRaise_;
        private int lactateThresholdHr_;
        private float lactateThresholdSpeed_;
        private int lastvalidVo2MaxFixValue_;
        private int lastvalidVo2MaxUtcTime_;
        private int maximalHR_;
        private int physicalState_;
        private int recoveryTime_;
        private int resultSize_;
        private int resultVer_;
        private d0.f runningPerformancePredict_ = GeneratedMessageLite.emptyFloatList();
        private int sportEndUtcTime_;
        private float trainingLoadBalanceAnaerobicMonthly_;
        private float trainingLoadBalanceHighIntensityAerobicMonthly_;
        private float trainingLoadBalanceLowIntensityAerobicMonthly_;
        private float trainingLoadMonthly_;
        private int trainingLoadWeeklyOptimalMax_;
        private int trainingLoadWeeklyOptimalMin_;
        private int trainingLoadWeeklyOptimalOverreaching_;
        private float trainingLoadWeekly_;
        private float vO2Max_;
        private int vO2_;
        private int workoutLabel_;

        public static final class Builder extends GeneratedMessageLite.a<SportEffectMessage, Builder> implements SportEffectMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllRunningPerformancePredict(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).addAllRunningPerformancePredict(iterable);
                return this;
            }

            public Builder addRunningPerformancePredict(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).addRunningPerformancePredict(f);
                return this;
            }

            public Builder clearActivityClass() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearActivityClass();
                return this;
            }

            public Builder clearAerobicHrRate() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAerobicHrRate();
                return this;
            }

            public Builder clearAerobicSpeedRate() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAerobicSpeedRate();
                return this;
            }

            public Builder clearAerobicTrainingEffect() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAerobicTrainingEffect();
                return this;
            }

            public Builder clearAnaerobicHrRate() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAnaerobicHrRate();
                return this;
            }

            public Builder clearAnaerobicSpeedRate() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAnaerobicSpeedRate();
                return this;
            }

            public Builder clearAnaerobicTrainingEffect() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearAnaerobicTrainingEffect();
                return this;
            }

            public Builder clearEPOC() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearEPOC();
                return this;
            }

            public Builder clearHuamiSportsHistoryResultT() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearHuamiSportsHistoryResultT();
                return this;
            }

            public Builder clearIfValidVo2MaxRaise() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearIfValidVo2MaxRaise();
                return this;
            }

            public Builder clearLactateThresholdHr() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearLactateThresholdHr();
                return this;
            }

            public Builder clearLactateThresholdSpeed() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearLactateThresholdSpeed();
                return this;
            }

            public Builder clearLastvalidVo2MaxFixValue() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearLastvalidVo2MaxFixValue();
                return this;
            }

            public Builder clearLastvalidVo2MaxUtcTime() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearLastvalidVo2MaxUtcTime();
                return this;
            }

            public Builder clearMaximalHR() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearMaximalHR();
                return this;
            }

            public Builder clearPhysicalState() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearPhysicalState();
                return this;
            }

            public Builder clearRecoveryTime() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearRecoveryTime();
                return this;
            }

            public Builder clearResultSize() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearResultSize();
                return this;
            }

            public Builder clearResultVer() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearResultVer();
                return this;
            }

            public Builder clearRunningPerformancePredict() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearRunningPerformancePredict();
                return this;
            }

            public Builder clearSportEndUtcTime() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearSportEndUtcTime();
                return this;
            }

            public Builder clearTrainingLoadBalanceAnaerobicMonthly() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadBalanceAnaerobicMonthly();
                return this;
            }

            public Builder clearTrainingLoadBalanceHighIntensityAerobicMonthly() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadBalanceHighIntensityAerobicMonthly();
                return this;
            }

            public Builder clearTrainingLoadBalanceLowIntensityAerobicMonthly() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadBalanceLowIntensityAerobicMonthly();
                return this;
            }

            public Builder clearTrainingLoadMonthly() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadMonthly();
                return this;
            }

            public Builder clearTrainingLoadWeekly() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadWeekly();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalMax() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadWeeklyOptimalMax();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalMin() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadWeeklyOptimalMin();
                return this;
            }

            public Builder clearTrainingLoadWeeklyOptimalOverreaching() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearTrainingLoadWeeklyOptimalOverreaching();
                return this;
            }

            public Builder clearVO2() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearVO2();
                return this;
            }

            public Builder clearVO2Max() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearVO2Max();
                return this;
            }

            public Builder clearWorkoutLabel() {
                copyOnWrite();
                ((SportEffectMessage) this.instance).clearWorkoutLabel();
                return this;
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getActivityClass() {
                return ((SportEffectMessage) this.instance).getActivityClass();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAerobicHrRate() {
                return ((SportEffectMessage) this.instance).getAerobicHrRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAerobicSpeedRate() {
                return ((SportEffectMessage) this.instance).getAerobicSpeedRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAerobicTrainingEffect() {
                return ((SportEffectMessage) this.instance).getAerobicTrainingEffect();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAnaerobicHrRate() {
                return ((SportEffectMessage) this.instance).getAnaerobicHrRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAnaerobicSpeedRate() {
                return ((SportEffectMessage) this.instance).getAnaerobicSpeedRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getAnaerobicTrainingEffect() {
                return ((SportEffectMessage) this.instance).getAnaerobicTrainingEffect();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getEPOC() {
                return ((SportEffectMessage) this.instance).getEPOC();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public SportEffectHistoryMessage getHuamiSportsHistoryResultT() {
                return ((SportEffectMessage) this.instance).getHuamiSportsHistoryResultT();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getIfValidVo2MaxRaise() {
                return ((SportEffectMessage) this.instance).getIfValidVo2MaxRaise();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getLactateThresholdHr() {
                return ((SportEffectMessage) this.instance).getLactateThresholdHr();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getLactateThresholdSpeed() {
                return ((SportEffectMessage) this.instance).getLactateThresholdSpeed();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getLastvalidVo2MaxFixValue() {
                return ((SportEffectMessage) this.instance).getLastvalidVo2MaxFixValue();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getLastvalidVo2MaxUtcTime() {
                return ((SportEffectMessage) this.instance).getLastvalidVo2MaxUtcTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getMaximalHR() {
                return ((SportEffectMessage) this.instance).getMaximalHR();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getPhysicalState() {
                return ((SportEffectMessage) this.instance).getPhysicalState();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getRecoveryTime() {
                return ((SportEffectMessage) this.instance).getRecoveryTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getResultSize() {
                return ((SportEffectMessage) this.instance).getResultSize();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getResultVer() {
                return ((SportEffectMessage) this.instance).getResultVer();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getRunningPerformancePredict(int i) {
                return ((SportEffectMessage) this.instance).getRunningPerformancePredict(i);
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getRunningPerformancePredictCount() {
                return ((SportEffectMessage) this.instance).getRunningPerformancePredictCount();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public List<Float> getRunningPerformancePredictList() {
                return Collections.unmodifiableList(((SportEffectMessage) this.instance).getRunningPerformancePredictList());
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getSportEndUtcTime() {
                return ((SportEffectMessage) this.instance).getSportEndUtcTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getTrainingLoadBalanceAnaerobicMonthly() {
                return ((SportEffectMessage) this.instance).getTrainingLoadBalanceAnaerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getTrainingLoadBalanceHighIntensityAerobicMonthly() {
                return ((SportEffectMessage) this.instance).getTrainingLoadBalanceHighIntensityAerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getTrainingLoadBalanceLowIntensityAerobicMonthly() {
                return ((SportEffectMessage) this.instance).getTrainingLoadBalanceLowIntensityAerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getTrainingLoadMonthly() {
                return ((SportEffectMessage) this.instance).getTrainingLoadMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getTrainingLoadWeekly() {
                return ((SportEffectMessage) this.instance).getTrainingLoadWeekly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMax() {
                return ((SportEffectMessage) this.instance).getTrainingLoadWeeklyOptimalMax();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalMin() {
                return ((SportEffectMessage) this.instance).getTrainingLoadWeeklyOptimalMin();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getTrainingLoadWeeklyOptimalOverreaching() {
                return ((SportEffectMessage) this.instance).getTrainingLoadWeeklyOptimalOverreaching();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getVO2() {
                return ((SportEffectMessage) this.instance).getVO2();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public float getVO2Max() {
                return ((SportEffectMessage) this.instance).getVO2Max();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public int getWorkoutLabel() {
                return ((SportEffectMessage) this.instance).getWorkoutLabel();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasActivityClass() {
                return ((SportEffectMessage) this.instance).hasActivityClass();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAerobicHrRate() {
                return ((SportEffectMessage) this.instance).hasAerobicHrRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAerobicSpeedRate() {
                return ((SportEffectMessage) this.instance).hasAerobicSpeedRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAerobicTrainingEffect() {
                return ((SportEffectMessage) this.instance).hasAerobicTrainingEffect();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAnaerobicHrRate() {
                return ((SportEffectMessage) this.instance).hasAnaerobicHrRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAnaerobicSpeedRate() {
                return ((SportEffectMessage) this.instance).hasAnaerobicSpeedRate();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasAnaerobicTrainingEffect() {
                return ((SportEffectMessage) this.instance).hasAnaerobicTrainingEffect();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasEPOC() {
                return ((SportEffectMessage) this.instance).hasEPOC();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasHuamiSportsHistoryResultT() {
                return ((SportEffectMessage) this.instance).hasHuamiSportsHistoryResultT();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasIfValidVo2MaxRaise() {
                return ((SportEffectMessage) this.instance).hasIfValidVo2MaxRaise();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasLactateThresholdHr() {
                return ((SportEffectMessage) this.instance).hasLactateThresholdHr();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasLactateThresholdSpeed() {
                return ((SportEffectMessage) this.instance).hasLactateThresholdSpeed();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasLastvalidVo2MaxFixValue() {
                return ((SportEffectMessage) this.instance).hasLastvalidVo2MaxFixValue();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasLastvalidVo2MaxUtcTime() {
                return ((SportEffectMessage) this.instance).hasLastvalidVo2MaxUtcTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasMaximalHR() {
                return ((SportEffectMessage) this.instance).hasMaximalHR();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasPhysicalState() {
                return ((SportEffectMessage) this.instance).hasPhysicalState();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasRecoveryTime() {
                return ((SportEffectMessage) this.instance).hasRecoveryTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasResultSize() {
                return ((SportEffectMessage) this.instance).hasResultSize();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasResultVer() {
                return ((SportEffectMessage) this.instance).hasResultVer();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasSportEndUtcTime() {
                return ((SportEffectMessage) this.instance).hasSportEndUtcTime();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadBalanceAnaerobicMonthly() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadBalanceAnaerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadBalanceHighIntensityAerobicMonthly() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadBalanceHighIntensityAerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadBalanceLowIntensityAerobicMonthly() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadBalanceLowIntensityAerobicMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadMonthly() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadMonthly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadWeekly() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadWeekly();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadWeeklyOptimalMax() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadWeeklyOptimalMax();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadWeeklyOptimalMin() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadWeeklyOptimalMin();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasTrainingLoadWeeklyOptimalOverreaching() {
                return ((SportEffectMessage) this.instance).hasTrainingLoadWeeklyOptimalOverreaching();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasVO2() {
                return ((SportEffectMessage) this.instance).hasVO2();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasVO2Max() {
                return ((SportEffectMessage) this.instance).hasVO2Max();
            }

            @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
            public boolean hasWorkoutLabel() {
                return ((SportEffectMessage) this.instance).hasWorkoutLabel();
            }

            public Builder mergeHuamiSportsHistoryResultT(SportEffectHistoryMessage sportEffectHistoryMessage) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).mergeHuamiSportsHistoryResultT(sportEffectHistoryMessage);
                return this;
            }

            public Builder setActivityClass(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setActivityClass(i);
                return this;
            }

            public Builder setAerobicHrRate(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAerobicHrRate(f);
                return this;
            }

            public Builder setAerobicSpeedRate(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAerobicSpeedRate(f);
                return this;
            }

            public Builder setAerobicTrainingEffect(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAerobicTrainingEffect(f);
                return this;
            }

            public Builder setAnaerobicHrRate(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAnaerobicHrRate(f);
                return this;
            }

            public Builder setAnaerobicSpeedRate(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAnaerobicSpeedRate(f);
                return this;
            }

            public Builder setAnaerobicTrainingEffect(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setAnaerobicTrainingEffect(f);
                return this;
            }

            public Builder setEPOC(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setEPOC(f);
                return this;
            }

            public Builder setHuamiSportsHistoryResultT(SportEffectHistoryMessage sportEffectHistoryMessage) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setHuamiSportsHistoryResultT(sportEffectHistoryMessage);
                return this;
            }

            public Builder setIfValidVo2MaxRaise(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setIfValidVo2MaxRaise(i);
                return this;
            }

            public Builder setLactateThresholdHr(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setLactateThresholdHr(i);
                return this;
            }

            public Builder setLactateThresholdSpeed(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setLactateThresholdSpeed(f);
                return this;
            }

            public Builder setLastvalidVo2MaxFixValue(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setLastvalidVo2MaxFixValue(i);
                return this;
            }

            public Builder setLastvalidVo2MaxUtcTime(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setLastvalidVo2MaxUtcTime(i);
                return this;
            }

            public Builder setMaximalHR(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setMaximalHR(i);
                return this;
            }

            public Builder setPhysicalState(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setPhysicalState(i);
                return this;
            }

            public Builder setRecoveryTime(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setRecoveryTime(i);
                return this;
            }

            public Builder setResultSize(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setResultSize(i);
                return this;
            }

            public Builder setResultVer(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setResultVer(i);
                return this;
            }

            public Builder setRunningPerformancePredict(int i, float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setRunningPerformancePredict(i, f);
                return this;
            }

            public Builder setSportEndUtcTime(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setSportEndUtcTime(i);
                return this;
            }

            public Builder setTrainingLoadBalanceAnaerobicMonthly(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadBalanceAnaerobicMonthly(f);
                return this;
            }

            public Builder setTrainingLoadBalanceHighIntensityAerobicMonthly(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadBalanceHighIntensityAerobicMonthly(f);
                return this;
            }

            public Builder setTrainingLoadBalanceLowIntensityAerobicMonthly(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadBalanceLowIntensityAerobicMonthly(f);
                return this;
            }

            public Builder setTrainingLoadMonthly(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadMonthly(f);
                return this;
            }

            public Builder setTrainingLoadWeekly(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadWeekly(f);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalMax(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadWeeklyOptimalMax(i);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalMin(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadWeeklyOptimalMin(i);
                return this;
            }

            public Builder setTrainingLoadWeeklyOptimalOverreaching(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setTrainingLoadWeeklyOptimalOverreaching(i);
                return this;
            }

            public Builder setVO2(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setVO2(i);
                return this;
            }

            public Builder setVO2Max(float f) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setVO2Max(f);
                return this;
            }

            public Builder setWorkoutLabel(int i) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setWorkoutLabel(i);
                return this;
            }

            private Builder() {
                super(SportEffectMessage.DEFAULT_INSTANCE);
            }

            public Builder setHuamiSportsHistoryResultT(SportEffectHistoryMessage.Builder builder) {
                copyOnWrite();
                ((SportEffectMessage) this.instance).setHuamiSportsHistoryResultT(builder.build());
                return this;
            }
        }

        static {
            SportEffectMessage sportEffectMessage = new SportEffectMessage();
            DEFAULT_INSTANCE = sportEffectMessage;
            GeneratedMessageLite.registerDefaultInstance(SportEffectMessage.class, sportEffectMessage);
        }

        private SportEffectMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRunningPerformancePredict(Iterable<? extends Float> iterable) {
            ensureRunningPerformancePredictIsMutable();
            b.addAll((Iterable) iterable, (List) this.runningPerformancePredict_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRunningPerformancePredict(float f) {
            ensureRunningPerformancePredictIsMutable();
            this.runningPerformancePredict_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivityClass() {
            this.bitField0_ &= -5;
            this.activityClass_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAerobicHrRate() {
            this.bitField0_ &= -67108865;
            this.aerobicHrRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAerobicSpeedRate() {
            this.bitField0_ &= -268435457;
            this.aerobicSpeedRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAerobicTrainingEffect() {
            this.bitField0_ &= -129;
            this.aerobicTrainingEffect_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnaerobicHrRate() {
            this.bitField0_ &= -134217729;
            this.anaerobicHrRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnaerobicSpeedRate() {
            this.bitField0_ &= -536870913;
            this.anaerobicSpeedRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnaerobicTrainingEffect() {
            this.bitField0_ &= -257;
            this.anaerobicTrainingEffect_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEPOC() {
            this.bitField0_ &= -33;
            this.ePOC_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHuamiSportsHistoryResultT() {
            this.huamiSportsHistoryResultT_ = null;
            this.bitField0_ &= -33554433;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIfValidVo2MaxRaise() {
            this.bitField0_ &= -1048577;
            this.ifValidVo2MaxRaise_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLactateThresholdHr() {
            this.bitField0_ &= -4194305;
            this.lactateThresholdHr_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLactateThresholdSpeed() {
            this.bitField0_ &= -8388609;
            this.lactateThresholdSpeed_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastvalidVo2MaxFixValue() {
            this.bitField0_ &= -524289;
            this.lastvalidVo2MaxFixValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastvalidVo2MaxUtcTime() {
            this.bitField0_ &= -262145;
            this.lastvalidVo2MaxUtcTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximalHR() {
            this.bitField0_ &= -9;
            this.maximalHR_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhysicalState() {
            this.bitField0_ &= -1073741825;
            this.physicalState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoveryTime() {
            this.bitField0_ &= -513;
            this.recoveryTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultSize() {
            this.bitField0_ &= -17;
            this.resultSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultVer() {
            this.bitField0_ &= -2;
            this.resultVer_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunningPerformancePredict() {
            this.runningPerformancePredict_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportEndUtcTime() {
            this.bitField0_ &= -16777217;
            this.sportEndUtcTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceAnaerobicMonthly() {
            this.bitField0_ &= -32769;
            this.trainingLoadBalanceAnaerobicMonthly_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceHighIntensityAerobicMonthly() {
            this.bitField0_ &= -65537;
            this.trainingLoadBalanceHighIntensityAerobicMonthly_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadBalanceLowIntensityAerobicMonthly() {
            this.bitField0_ &= -131073;
            this.trainingLoadBalanceLowIntensityAerobicMonthly_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadMonthly() {
            this.bitField0_ &= -16385;
            this.trainingLoadMonthly_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeekly() {
            this.bitField0_ &= -8193;
            this.trainingLoadWeekly_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalMax() {
            this.bitField0_ &= -2049;
            this.trainingLoadWeeklyOptimalMax_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalMin() {
            this.bitField0_ &= -1025;
            this.trainingLoadWeeklyOptimalMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadWeeklyOptimalOverreaching() {
            this.bitField0_ &= -4097;
            this.trainingLoadWeeklyOptimalOverreaching_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVO2() {
            this.bitField0_ &= -3;
            this.vO2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVO2Max() {
            this.bitField0_ &= -65;
            this.vO2Max_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorkoutLabel() {
            this.bitField0_ &= -2097153;
            this.workoutLabel_ = 0;
        }

        private void ensureRunningPerformancePredictIsMutable() {
            d0.f fVar = this.runningPerformancePredict_;
            if (fVar.c()) {
                return;
            }
            this.runningPerformancePredict_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        public static SportEffectMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHuamiSportsHistoryResultT(SportEffectHistoryMessage sportEffectHistoryMessage) {
            sportEffectHistoryMessage.getClass();
            SportEffectHistoryMessage sportEffectHistoryMessage2 = this.huamiSportsHistoryResultT_;
            if (sportEffectHistoryMessage2 == null || sportEffectHistoryMessage2 == SportEffectHistoryMessage.getDefaultInstance()) {
                this.huamiSportsHistoryResultT_ = sportEffectHistoryMessage;
            } else {
                this.huamiSportsHistoryResultT_ = SportEffectHistoryMessage.newBuilder(this.huamiSportsHistoryResultT_).mergeFrom(sportEffectHistoryMessage).buildPartial();
            }
            this.bitField0_ |= 33554432;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportEffectMessage parseDelimitedFrom(InputStream inputStream) {
            return (SportEffectMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportEffectMessage parseFrom(ByteBuffer byteBuffer) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SportEffectMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityClass(int i) {
            this.bitField0_ |= 4;
            this.activityClass_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAerobicHrRate(float f) {
            this.bitField0_ |= 67108864;
            this.aerobicHrRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAerobicSpeedRate(float f) {
            this.bitField0_ |= 268435456;
            this.aerobicSpeedRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAerobicTrainingEffect(float f) {
            this.bitField0_ |= 128;
            this.aerobicTrainingEffect_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnaerobicHrRate(float f) {
            this.bitField0_ |= 134217728;
            this.anaerobicHrRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnaerobicSpeedRate(float f) {
            this.bitField0_ |= 536870912;
            this.anaerobicSpeedRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnaerobicTrainingEffect(float f) {
            this.bitField0_ |= 256;
            this.anaerobicTrainingEffect_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEPOC(float f) {
            this.bitField0_ |= 32;
            this.ePOC_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuamiSportsHistoryResultT(SportEffectHistoryMessage sportEffectHistoryMessage) {
            sportEffectHistoryMessage.getClass();
            this.huamiSportsHistoryResultT_ = sportEffectHistoryMessage;
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIfValidVo2MaxRaise(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.ifValidVo2MaxRaise_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLactateThresholdHr(int i) {
            this.bitField0_ |= 4194304;
            this.lactateThresholdHr_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLactateThresholdSpeed(float f) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.lactateThresholdSpeed_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastvalidVo2MaxFixValue(int i) {
            this.bitField0_ |= 524288;
            this.lastvalidVo2MaxFixValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastvalidVo2MaxUtcTime(int i) {
            this.bitField0_ |= 262144;
            this.lastvalidVo2MaxUtcTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximalHR(int i) {
            this.bitField0_ |= 8;
            this.maximalHR_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhysicalState(int i) {
            this.bitField0_ |= 1073741824;
            this.physicalState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoveryTime(int i) {
            this.bitField0_ |= 512;
            this.recoveryTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultSize(int i) {
            this.bitField0_ |= 16;
            this.resultSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultVer(int i) {
            this.bitField0_ |= 1;
            this.resultVer_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunningPerformancePredict(int i, float f) {
            ensureRunningPerformancePredictIsMutable();
            this.runningPerformancePredict_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportEndUtcTime(int i) {
            this.bitField0_ |= 16777216;
            this.sportEndUtcTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceAnaerobicMonthly(float f) {
            this.bitField0_ |= 32768;
            this.trainingLoadBalanceAnaerobicMonthly_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceHighIntensityAerobicMonthly(float f) {
            this.bitField0_ |= 65536;
            this.trainingLoadBalanceHighIntensityAerobicMonthly_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadBalanceLowIntensityAerobicMonthly(float f) {
            this.bitField0_ |= 131072;
            this.trainingLoadBalanceLowIntensityAerobicMonthly_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadMonthly(float f) {
            this.bitField0_ |= 16384;
            this.trainingLoadMonthly_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeekly(float f) {
            this.bitField0_ |= 8192;
            this.trainingLoadWeekly_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalMax(int i) {
            this.bitField0_ |= 2048;
            this.trainingLoadWeeklyOptimalMax_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalMin(int i) {
            this.bitField0_ |= 1024;
            this.trainingLoadWeeklyOptimalMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadWeeklyOptimalOverreaching(int i) {
            this.bitField0_ |= 4096;
            this.trainingLoadWeeklyOptimalOverreaching_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVO2(int i) {
            this.bitField0_ |= 2;
            this.vO2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVO2Max(float f) {
            this.bitField0_ |= 64;
            this.vO2Max_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorkoutLabel(int i) {
            this.bitField0_ |= 2097152;
            this.workoutLabel_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SportEffectMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001  \u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\n\u0013\u000bဋ\t\fဋ\n\rဋ\u000b\u000eဋ\f\u000fခ\r\u0010ခ\u000e\u0011ခ\u000f\u0012ခ\u0010\u0013ခ\u0011\u0014ဋ\u0012\u0015ဋ\u0013\u0016ဋ\u0014\u0017ဋ\u0015\u0018ဋ\u0016\u0019ခ\u0017\u001aဋ\u0018\u001bဉ\u0019\u001cခ\u001a\u001dခ\u001b\u001eခ\u001c\u001fခ\u001d င\u001e", new Object[]{"bitField0_", "resultVer_", "vO2_", "activityClass_", "maximalHR_", "resultSize_", "ePOC_", "vO2Max_", "aerobicTrainingEffect_", "anaerobicTrainingEffect_", "runningPerformancePredict_", "recoveryTime_", "trainingLoadWeeklyOptimalMin_", "trainingLoadWeeklyOptimalMax_", "trainingLoadWeeklyOptimalOverreaching_", "trainingLoadWeekly_", "trainingLoadMonthly_", "trainingLoadBalanceAnaerobicMonthly_", "trainingLoadBalanceHighIntensityAerobicMonthly_", "trainingLoadBalanceLowIntensityAerobicMonthly_", "lastvalidVo2MaxUtcTime_", "lastvalidVo2MaxFixValue_", "ifValidVo2MaxRaise_", "workoutLabel_", "lactateThresholdHr_", "lactateThresholdSpeed_", "sportEndUtcTime_", "huamiSportsHistoryResultT_", "aerobicHrRate_", "anaerobicHrRate_", "aerobicSpeedRate_", "anaerobicSpeedRate_", "physicalState_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SportEffectMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SportEffectMessage.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getActivityClass() {
            return this.activityClass_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAerobicHrRate() {
            return this.aerobicHrRate_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAerobicSpeedRate() {
            return this.aerobicSpeedRate_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAerobicTrainingEffect() {
            return this.aerobicTrainingEffect_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAnaerobicHrRate() {
            return this.anaerobicHrRate_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAnaerobicSpeedRate() {
            return this.anaerobicSpeedRate_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getAnaerobicTrainingEffect() {
            return this.anaerobicTrainingEffect_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getEPOC() {
            return this.ePOC_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public SportEffectHistoryMessage getHuamiSportsHistoryResultT() {
            SportEffectHistoryMessage sportEffectHistoryMessage = this.huamiSportsHistoryResultT_;
            return sportEffectHistoryMessage == null ? SportEffectHistoryMessage.getDefaultInstance() : sportEffectHistoryMessage;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getIfValidVo2MaxRaise() {
            return this.ifValidVo2MaxRaise_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getLactateThresholdHr() {
            return this.lactateThresholdHr_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getLactateThresholdSpeed() {
            return this.lactateThresholdSpeed_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getLastvalidVo2MaxFixValue() {
            return this.lastvalidVo2MaxFixValue_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getLastvalidVo2MaxUtcTime() {
            return this.lastvalidVo2MaxUtcTime_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getMaximalHR() {
            return this.maximalHR_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getPhysicalState() {
            return this.physicalState_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getRecoveryTime() {
            return this.recoveryTime_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getResultSize() {
            return this.resultSize_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getResultVer() {
            return this.resultVer_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getRunningPerformancePredict(int i) {
            return this.runningPerformancePredict_.getFloat(i);
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getRunningPerformancePredictCount() {
            return this.runningPerformancePredict_.size();
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public List<Float> getRunningPerformancePredictList() {
            return this.runningPerformancePredict_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getSportEndUtcTime() {
            return this.sportEndUtcTime_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getTrainingLoadBalanceAnaerobicMonthly() {
            return this.trainingLoadBalanceAnaerobicMonthly_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getTrainingLoadBalanceHighIntensityAerobicMonthly() {
            return this.trainingLoadBalanceHighIntensityAerobicMonthly_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getTrainingLoadBalanceLowIntensityAerobicMonthly() {
            return this.trainingLoadBalanceLowIntensityAerobicMonthly_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getTrainingLoadMonthly() {
            return this.trainingLoadMonthly_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getTrainingLoadWeekly() {
            return this.trainingLoadWeekly_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMax() {
            return this.trainingLoadWeeklyOptimalMax_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalMin() {
            return this.trainingLoadWeeklyOptimalMin_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getTrainingLoadWeeklyOptimalOverreaching() {
            return this.trainingLoadWeeklyOptimalOverreaching_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getVO2() {
            return this.vO2_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public float getVO2Max() {
            return this.vO2Max_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public int getWorkoutLabel() {
            return this.workoutLabel_;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasActivityClass() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAerobicHrRate() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAerobicSpeedRate() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAerobicTrainingEffect() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAnaerobicHrRate() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAnaerobicSpeedRate() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasAnaerobicTrainingEffect() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasEPOC() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasHuamiSportsHistoryResultT() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasIfValidVo2MaxRaise() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasLactateThresholdHr() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasLactateThresholdSpeed() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasLastvalidVo2MaxFixValue() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasLastvalidVo2MaxUtcTime() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasMaximalHR() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasPhysicalState() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasRecoveryTime() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasResultSize() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasResultVer() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasSportEndUtcTime() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadBalanceAnaerobicMonthly() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadBalanceHighIntensityAerobicMonthly() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadBalanceLowIntensityAerobicMonthly() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadMonthly() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadWeekly() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadWeeklyOptimalMax() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadWeeklyOptimalMin() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasTrainingLoadWeeklyOptimalOverreaching() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasVO2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasVO2Max() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.huami.proto.SportEfect.SportEffectMessageOrBuilder
        public boolean hasWorkoutLabel() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public static Builder newBuilder(SportEffectMessage sportEffectMessage) {
            return DEFAULT_INSTANCE.createBuilder(sportEffectMessage);
        }

        public static SportEffectMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportEffectMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SportEffectMessage parseFrom(ByteString byteString) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SportEffectMessage parseFrom(ByteString byteString, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SportEffectMessage parseFrom(byte[] bArr) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SportEffectMessage parseFrom(byte[] bArr, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SportEffectMessage parseFrom(InputStream inputStream) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportEffectMessage parseFrom(InputStream inputStream, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportEffectMessage parseFrom(j jVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SportEffectMessage parseFrom(j jVar, t tVar) {
            return (SportEffectMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SportEffectMessageOrBuilder extends bsf {
        int getActivityClass();

        float getAerobicHrRate();

        float getAerobicSpeedRate();

        float getAerobicTrainingEffect();

        float getAnaerobicHrRate();

        float getAnaerobicSpeedRate();

        float getAnaerobicTrainingEffect();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        float getEPOC();

        SportEffectHistoryMessage getHuamiSportsHistoryResultT();

        int getIfValidVo2MaxRaise();

        int getLactateThresholdHr();

        float getLactateThresholdSpeed();

        int getLastvalidVo2MaxFixValue();

        int getLastvalidVo2MaxUtcTime();

        int getMaximalHR();

        int getPhysicalState();

        int getRecoveryTime();

        int getResultSize();

        int getResultVer();

        float getRunningPerformancePredict(int i);

        int getRunningPerformancePredictCount();

        List<Float> getRunningPerformancePredictList();

        int getSportEndUtcTime();

        float getTrainingLoadBalanceAnaerobicMonthly();

        float getTrainingLoadBalanceHighIntensityAerobicMonthly();

        float getTrainingLoadBalanceLowIntensityAerobicMonthly();

        float getTrainingLoadMonthly();

        float getTrainingLoadWeekly();

        int getTrainingLoadWeeklyOptimalMax();

        int getTrainingLoadWeeklyOptimalMin();

        int getTrainingLoadWeeklyOptimalOverreaching();

        int getVO2();

        float getVO2Max();

        int getWorkoutLabel();

        boolean hasActivityClass();

        boolean hasAerobicHrRate();

        boolean hasAerobicSpeedRate();

        boolean hasAerobicTrainingEffect();

        boolean hasAnaerobicHrRate();

        boolean hasAnaerobicSpeedRate();

        boolean hasAnaerobicTrainingEffect();

        boolean hasEPOC();

        boolean hasHuamiSportsHistoryResultT();

        boolean hasIfValidVo2MaxRaise();

        boolean hasLactateThresholdHr();

        boolean hasLactateThresholdSpeed();

        boolean hasLastvalidVo2MaxFixValue();

        boolean hasLastvalidVo2MaxUtcTime();

        boolean hasMaximalHR();

        boolean hasPhysicalState();

        boolean hasRecoveryTime();

        boolean hasResultSize();

        boolean hasResultVer();

        boolean hasSportEndUtcTime();

        boolean hasTrainingLoadBalanceAnaerobicMonthly();

        boolean hasTrainingLoadBalanceHighIntensityAerobicMonthly();

        boolean hasTrainingLoadBalanceLowIntensityAerobicMonthly();

        boolean hasTrainingLoadMonthly();

        boolean hasTrainingLoadWeekly();

        boolean hasTrainingLoadWeeklyOptimalMax();

        boolean hasTrainingLoadWeeklyOptimalMin();

        boolean hasTrainingLoadWeeklyOptimalOverreaching();

        boolean hasVO2();

        boolean hasVO2Max();

        boolean hasWorkoutLabel();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private SportEfect() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
