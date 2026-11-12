package com.xiaomi.fitness.sleep.trace.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction;", "", "<init>", "()V", "mSampleGroupModelList", "", "Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction$SampleGroupModel;", "mDataSource", "Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction$SampleDataSource;", "setSampleDataSource", "", EcgReportKey.dataSource, "hasDataSource", "", "addSampleGroupModel", "groupModel", "requireWakeTime", "", "requestTime", "def", "calcWakeTime", "sampleWakeTimeList", "", "predictionNextWakeTime", "SampleDataSource", "SampleGroupModel", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WakeTimePrediction {
    private static final int PREDICTION_SAMPLE_SIZE = 14;

    @Nullable
    private SampleDataSource mDataSource;

    @NotNull
    private final List<SampleGroupModel> mSampleGroupModelList = new LinkedList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction$SampleDataSource;", "", "querySampleWakeTime", "", "", "begin", StatConstants.PARAM_END, "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SampleDataSource {
        @NotNull
        List<Long> querySampleWakeTime(long begin, long end);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\u0002\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0018J\b\u0010!\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\u0002\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/WakeTimePrediction$SampleGroupModel;", "", "name", "", "mDataFilter", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "time", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getName", "()Ljava/lang/String;", "mDataLock", "mDataSet", "", "mDataSetChanged", "mOffsetFactor", "", "mAverageOffsetMinute", "", PrivacyAgreeModel.TYPE_ACCEPT, "input", "", "wakeTime", "offsetFactor", "getOffsetFactor", "()D", CervicalMucusRecord.Appearance.CLEAR, "wakeTimeOffsetMinute", "getWakeTimeOffsetMinute", "()I", "performCalc", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SampleGroupModel {
        private int mAverageOffsetMinute;

        @NotNull
        private final Function1<Long, Boolean> mDataFilter;

        @NotNull
        private final Object mDataLock;

        @Nullable
        private List<Long> mDataSet;
        private boolean mDataSetChanged;
        private double mOffsetFactor;

        @NotNull
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public SampleGroupModel(@NotNull String name, @NotNull Function1<? super Long, Boolean> mDataFilter) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(mDataFilter, "mDataFilter");
            this.name = name;
            this.mDataFilter = mDataFilter;
            this.mDataLock = new Object();
            this.mOffsetFactor = -1.0d;
        }

        private final void performCalc() {
            synchronized (this.mDataLock) {
                try {
                    if (this.mDataSetChanged) {
                        List<Long> list = this.mDataSet;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            if (list.size() >= 3) {
                                List<Long> list2 = this.mDataSet;
                                Intrinsics.checkNotNull(list2);
                                int size = list2.size();
                                ArrayList arrayList = new ArrayList(size);
                                Calendar calendar = Calendar.getInstance();
                                List<Long> list3 = this.mDataSet;
                                Intrinsics.checkNotNull(list3);
                                Iterator<Long> it = list3.iterator();
                                int iMax = Integer.MIN_VALUE;
                                int iMin = Integer.MAX_VALUE;
                                int i = 0;
                                while (it.hasNext()) {
                                    calendar.setTimeInMillis(it.next().longValue());
                                    int i2 = (calendar.get(11) * 60) + calendar.get(12);
                                    arrayList.add(Integer.valueOf(i2));
                                    iMax = Math.max(iMax, i2);
                                    iMin = Math.min(iMin, i2);
                                    i += i2;
                                }
                                int i3 = size - 2;
                                int i4 = ((i - iMin) - iMax) / i3;
                                arrayList.remove(Integer.valueOf(iMin));
                                arrayList.remove(Integer.valueOf(iMax));
                                Iterator it2 = arrayList.iterator();
                                double dPow = 0.0d;
                                while (it2.hasNext()) {
                                    dPow += Math.pow(i4 - ((Number) it2.next()).intValue(), 2.0d);
                                }
                                double dSqrt = Math.sqrt(dPow / ((double) i3));
                                this.mOffsetFactor = dSqrt;
                                int i5 = (int) (((double) i4) - dSqrt);
                                if (i5 < 0) {
                                    i5 += 1440;
                                }
                                this.mAverageOffsetMinute = i5;
                                this.mDataSetChanged = false;
                                Unit unit = Unit.INSTANCE;
                                return;
                            }
                        }
                        this.mOffsetFactor = -1.0d;
                        this.mAverageOffsetMinute = 0;
                        this.mDataSetChanged = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean accept(long time) {
            return this.mDataFilter.invoke(Long.valueOf(time)).booleanValue();
        }

        public final void clear() {
            synchronized (this.mDataLock) {
                try {
                    if (this.mDataSet != null) {
                        this.mDataSet = null;
                        this.mDataSetChanged = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final double getOffsetFactor() {
            double d;
            synchronized (this.mDataLock) {
                try {
                    if (this.mDataSetChanged) {
                        performCalc();
                    }
                    d = this.mOffsetFactor;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d;
        }

        public final int getWakeTimeOffsetMinute() {
            int i;
            synchronized (this.mDataLock) {
                try {
                    if (this.mDataSetChanged) {
                        performCalc();
                    }
                    i = this.mAverageOffsetMinute;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        public final void input(long wakeTime) {
            if (accept(wakeTime)) {
                synchronized (this.mDataLock) {
                    try {
                        if (this.mDataSet == null) {
                            this.mDataSet = new LinkedList();
                        }
                        List<Long> list = this.mDataSet;
                        Intrinsics.checkNotNull(list);
                        list.add(Long.valueOf(wakeTime));
                        this.mDataSetChanged = true;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private final long calcWakeTime(List<Long> sampleWakeTimeList, long predictionNextWakeTime) {
        synchronized (this.mSampleGroupModelList) {
            try {
                long timeInMillis = -1;
                if (!this.mSampleGroupModelList.isEmpty()) {
                    try {
                        Iterator<Long> it = sampleWakeTimeList.iterator();
                        while (it.hasNext()) {
                            long jLongValue = it.next().longValue();
                            Iterator<SampleGroupModel> it2 = this.mSampleGroupModelList.iterator();
                            while (it2.hasNext()) {
                                it2.next().input(jLongValue);
                            }
                        }
                        SampleGroupModel sampleGroupModel = null;
                        for (SampleGroupModel sampleGroupModel2 : this.mSampleGroupModelList) {
                            if (sampleGroupModel2.accept(predictionNextWakeTime)) {
                                double offsetFactor = sampleGroupModel2.getOffsetFactor();
                                if (offsetFactor != -1.0d && (sampleGroupModel == null || sampleGroupModel.getOffsetFactor() > offsetFactor)) {
                                    sampleGroupModel = sampleGroupModel2;
                                }
                            }
                        }
                        if (sampleGroupModel != null && sampleGroupModel.getOffsetFactor() <= 30.0d) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(predictionNextWakeTime);
                            Intrinsics.checkNotNull(calendar);
                            TimeUtils.formatTimeCalendar(calendar, 0, 0, 0, 0);
                            calendar.add(12, sampleGroupModel.getWakeTimeOffsetMinute());
                            LogExtKt.logi("Predict model " + sampleGroupModel.getName() + " " + calendar.getTimeInMillis());
                            timeInMillis = calendar.getTimeInMillis();
                            Iterator<SampleGroupModel> it3 = this.mSampleGroupModelList.iterator();
                            while (it3.hasNext()) {
                                it3.next().clear();
                            }
                        }
                        Iterator<SampleGroupModel> it4 = this.mSampleGroupModelList.iterator();
                        while (it4.hasNext()) {
                            it4.next().clear();
                        }
                        return -1L;
                    } catch (Throwable th) {
                        Iterator<SampleGroupModel> it5 = this.mSampleGroupModelList.iterator();
                        while (it5.hasNext()) {
                            it5.next().clear();
                        }
                        throw th;
                    }
                }
                return timeInMillis;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void addSampleGroupModel(@NotNull SampleGroupModel groupModel) {
        Intrinsics.checkNotNullParameter(groupModel, "groupModel");
        this.mSampleGroupModelList.add(groupModel);
    }

    public final boolean hasDataSource() {
        return this.mDataSource != null;
    }

    public final long requireWakeTime(long requestTime, long def) {
        SampleDataSource sampleDataSource = this.mDataSource;
        Intrinsics.checkNotNull(sampleDataSource);
        List<Long> listQuerySampleWakeTime = sampleDataSource.querySampleWakeTime(requestTime - TimeUnit.DAYS.toMillis(30L), requestTime);
        return listQuerySampleWakeTime.size() < 14 ? def : calcWakeTime(listQuerySampleWakeTime, requestTime + TimeUnit.HOURS.toMillis(12L));
    }

    public final void setSampleDataSource(@NotNull SampleDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Objects.requireNonNull(dataSource);
        this.mDataSource = dataSource;
    }
}
