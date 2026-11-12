package com.xiaomi.fitness.sleep.behavior;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.phonesleepsdk.PhoneSleepSDK;
import defpackage.h4b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J*\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/BehaviorReportGenerator;", "", "mDetectionStartTime", "", "mDetectionEndTime", "mSleepTime", "mWakeUpTime", "mFileList", "", "Ljava/io/File;", "<init>", "(JJJJLjava/util/List;)V", "startGenerateSnailAccSleepReport", "", "sleepReport", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "generatorAccSleepReport", "Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport;", "startTime", "endTime", "idealWakeTime", "userAge", "readFileToFloats", "", "", "file", "Builder", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBehaviorReportGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BehaviorReportGenerator.kt\ncom/xiaomi/fitness/sleep/behavior/BehaviorReportGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class BehaviorReportGenerator {

    @NotNull
    private static final String TAG = "BehaviorReportGenerator";
    private final long mDetectionEndTime;
    private final long mDetectionStartTime;

    @NotNull
    private final List<File> mFileList;
    private final long mSleepTime;
    private final long mWakeUpTime;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/BehaviorReportGenerator$Builder;", "", "<init>", "()V", "mContext", "Landroid/content/Context;", "mDetectionStartTime", "", "mDetectionEndTime", "mSleepTime", "mWakeupTime", "mFiles", "", "Ljava/io/File;", "setContext", "context", "setDetectionStartTime", "detectionStartTime", "setDetectionEndTime", "detectionEndTime", "setSleepTime", "sleepTime", "setWakeupTime", "wakeupTime", "setFiles", "files", OneTrack.Param.BUILD, "Lcom/xiaomi/fitness/sleep/behavior/BehaviorReportGenerator;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBehaviorReportGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BehaviorReportGenerator.kt\ncom/xiaomi/fitness/sleep/behavior/BehaviorReportGenerator$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    public static final class Builder {

        @Nullable
        private Context mContext;
        private long mDetectionEndTime;
        private long mDetectionStartTime;

        @Nullable
        private List<? extends File> mFiles;
        private long mSleepTime;
        private long mWakeupTime;

        @NotNull
        public final BehaviorReportGenerator build() {
            if (this.mDetectionStartTime == 0 || this.mDetectionEndTime == 0 || this.mSleepTime == 0 || this.mWakeupTime == 0 || this.mFiles == null) {
                throw new IllegalArgumentException("SnailSleepReportGenerator args error".toString());
            }
            long j = this.mDetectionStartTime;
            long j2 = this.mDetectionEndTime;
            long j3 = this.mSleepTime;
            long j4 = this.mWakeupTime;
            List<? extends File> list = this.mFiles;
            Intrinsics.checkNotNull(list);
            return new BehaviorReportGenerator(j, j2, j3, j4, list);
        }

        @NotNull
        public final Builder setContext(@Nullable Context context) {
            this.mContext = context;
            return this;
        }

        @NotNull
        public final Builder setDetectionEndTime(long detectionEndTime) {
            this.mDetectionEndTime = detectionEndTime;
            return this;
        }

        @NotNull
        public final Builder setDetectionStartTime(long detectionStartTime) {
            this.mDetectionStartTime = detectionStartTime;
            return this;
        }

        @NotNull
        public final Builder setFiles(@Nullable List<? extends File> files) {
            this.mFiles = files;
            return this;
        }

        @NotNull
        public final Builder setSleepTime(long sleepTime) {
            this.mSleepTime = sleepTime;
            return this;
        }

        @NotNull
        public final Builder setWakeupTime(long wakeupTime) {
            this.mWakeupTime = wakeupTime;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviorReportGenerator(long j, long j2, long j3, long j4, @NotNull List<? extends File> mFileList) {
        Intrinsics.checkNotNullParameter(mFileList, "mFileList");
        this.mDetectionStartTime = j;
        this.mDetectionEndTime = j2;
        this.mSleepTime = j3;
        this.mWakeUpTime = j4;
        this.mFileList = mFileList;
    }

    private final AccSleepReport generatorAccSleepReport(int startTime, int endTime, int idealWakeTime, int userAge) throws Throwable {
        int i = endTime - startTime;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int seconds = (int) timeUnit.toSeconds(this.mDetectionStartTime);
        int seconds2 = (int) timeUnit.toSeconds(this.mDetectionEndTime);
        if (this.mFileList.size() < 3) {
            Logger.e(TAG, "generatorAccSleepReport fail because out files size: " + this.mFileList.size());
            return null;
        }
        List<Float> fileToFloats = readFileToFloats(this.mFileList.get(0));
        List<Float> fileToFloats2 = readFileToFloats(this.mFileList.get(1));
        List<Float> fileToFloats3 = readFileToFloats(this.mFileList.get(2));
        if (fileToFloats.isEmpty() || fileToFloats2.isEmpty() || fileToFloats3.isEmpty()) {
            return null;
        }
        if (i > 0 && !AccDataDeal.INSTANCE.collectSuccessful(fileToFloats.size(), i)) {
            return null;
        }
        AccDataDeal accDataDeal = AccDataDeal.INSTANCE;
        accDataDeal.cropAccData(startTime, endTime, seconds, seconds2, fileToFloats);
        accDataDeal.cropAccData(startTime, endTime, seconds, seconds2, fileToFloats2);
        accDataDeal.cropAccData(startTime, endTime, seconds, seconds2, fileToFloats3);
        int i2 = i * 2;
        accDataDeal.checkAccDataNum(fileToFloats, i2);
        accDataDeal.checkAccDataNum(fileToFloats2, i2);
        accDataDeal.checkAccDataNum(fileToFloats3, i2);
        Logger.i(TAG, StringsKt__IndentKt.trimIndent("\n     snail sleep input params :\n     xData:" + h4b.c(fileToFloats) + "\n     yData:" + h4b.c(fileToFloats2) + "\n     zData:" + h4b.c(fileToFloats3) + "\n     /xDataSize:" + fileToFloats.size() + "/startTime:" + startTime + "/endTime:" + endTime + "/type:1/userAge:" + userAge + "/ideaWakeTime:" + idealWakeTime + "\n     "));
        String strSleepReport_Result = PhoneSleepSDK.SleepReport_Result(fileToFloats, fileToFloats2, fileToFloats3, fileToFloats.size(), startTime, endTime, 1.0d, userAge, idealWakeTime);
        Intrinsics.checkNotNullExpressionValue(strSleepReport_Result, "SleepReport_Result(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("snail sleep output result:");
        sb.append(strSleepReport_Result);
        Logger.i(TAG, sb.toString());
        return (AccSleepReport) h4b.d(strSleepReport_Result, AccSleepReport.class);
    }

    private final List<Float> readFileToFloats(File file) throws Throwable {
        ArrayList arrayList;
        BufferedReader bufferedReader = null;
        try {
            try {
                arrayList = new ArrayList();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        Float fValueOf = Float.valueOf(line);
                        Intrinsics.checkNotNullExpressionValue(fValueOf, "valueOf(...)");
                        arrayList.add(fValueOf);
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        Logger.e(TAG, "readFileToFloats exception", e);
                        arrayList = new ArrayList();
                        IOExtKt.closeSilently(this, bufferedReader);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        IOExtKt.closeSilently(this, bufferedReader);
                        throw th;
                    }
                }
                IOExtKt.closeSilently(this, bufferedReader2);
            } catch (Exception e2) {
                e = e2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int startGenerateSnailAccSleepReport(@Nullable SleepReport sleepReport) throws Throwable {
        int iIntValue = TraceExtKt.getInstance(SleepTracer.INSTANCE).getUserAge().invoke().intValue();
        long scheduleGetUpTime = BehaviorConfiguration.INSTANCE.getScheduleGetUpTime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AccSleepReport accSleepReportGeneratorAccSleepReport = generatorAccSleepReport((int) timeUnit.toSeconds(Math.max(this.mDetectionStartTime, this.mSleepTime)), (int) timeUnit.toSeconds(Math.min(this.mDetectionEndTime, this.mWakeUpTime)), (int) timeUnit.toSeconds(scheduleGetUpTime), iIntValue);
        Logger.i(TAG, "detectionStart " + this.mDetectionStartTime + ", detectionEnd " + this.mDetectionEndTime + ",  sleepTime " + this.mSleepTime + ", wakUpTime " + this.mWakeUpTime);
        if (accSleepReportGeneratorAccSleepReport == null) {
            Logger.i(TAG, "too little data to generate report");
            return 0;
        }
        if (accSleepReportGeneratorAccSleepReport.getEmpty() == 1) {
            Logger.i(TAG, "can't detection fall sleep");
            return 1;
        }
        if (sleepReport == null) {
            return 2;
        }
        sleepReport.setAccReport(accSleepReportGeneratorAccSleepReport);
        return 2;
    }
}
