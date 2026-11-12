package com.xiaomi.fitness.sleep.behavior.analyze.core;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.asrengine.SleepDetSdk;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AssetUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.core.SleepingBehaviorDetector;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aJ \u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u001a\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0002J0\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020 H\u0002J(\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010)\u001a\u00020 H\u0002J\u0006\u0010.\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector;", "", "<init>", "()V", "mSleepDetSdk", "Lcom/xiaomi/asrengine/SleepDetSdk;", "mInvalidDuration", "", "mTotalVolume", "", "mCount", "", "mGson", "Lcom/google/gson/Gson;", "mStartTime", "mDreamTalkStrategy", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/DreamTalkStrategy;", "mSnoringStrategy", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy;", "init", "", "context", "Landroid/content/Context;", "resultDirPath", "", "callback", "Lkotlin/Function0;", "soundIdentify", "startTime", "data", "", "isEnd", "", "analysis", "sleepBehavior", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepBehavior;", "collectAndFlush", "score", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "snoringScore", "db", StatConstants.PARAM_END, "collect", "strategy", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Strategy;", "flush", "release", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepingBehaviorDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepingBehaviorDetector.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1872#2,3:157\n*S KotlinDebug\n*F\n+ 1 SleepingBehaviorDetector.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector\n*L\n91#1:157,3\n*E\n"})
public final class SleepingBehaviorDetector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SleepingBehaviorDetector> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: x1n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepingBehaviorDetector.INSTANCE_delegate$lambda$2();
        }
    });

    @NotNull
    private static final String MODEL_FILE_PATH = "/sleep/";

    @NotNull
    public static final String TAG = "SleepingBehaviorDetector";
    private volatile long mCount;
    private volatile DreamTalkStrategy mDreamTalkStrategy;

    @NotNull
    private final Gson mGson = new Gson();
    private volatile int mInvalidDuration;
    private SleepDetSdk mSleepDetSdk;
    private volatile SnoringStrategy mSnoringStrategy;
    private long mStartTime;
    private volatile double mTotalVolume;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector$Companion;", "", "<init>", "()V", "TAG", "", "INSTANCE", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector;", "getINSTANCE", "()Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepingBehaviorDetector;", "INSTANCE$delegate", "Lkotlin/Lazy;", "MODEL_FILE_PATH", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepingBehaviorDetector getINSTANCE() {
            return (SleepingBehaviorDetector) SleepingBehaviorDetector.INSTANCE$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepingBehaviorDetector INSTANCE_delegate$lambda$2() {
        return new SleepingBehaviorDetector();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    private final void analysis(SleepBehavior sleepBehavior, boolean isEnd) {
        if (sleepBehavior == null) {
            return;
        }
        List<Score> snoring = sleepBehavior.getEvents().getSnoring();
        List<Double> db = sleepBehavior.getDb();
        int i = 0;
        for (Object obj : sleepBehavior.getEvents().getDreamTalk()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Score score = (Score) obj;
            DreamTalkStrategy dreamTalkStrategy = this.mDreamTalkStrategy;
            SnoringStrategy snoringStrategy = null;
            if (dreamTalkStrategy == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                dreamTalkStrategy = null;
            }
            if (dreamTalkStrategy.isCredible(score)) {
                collectAndFlush(score, sleepBehavior, snoring.get(i), db.get(i).doubleValue(), isEnd);
                this.mInvalidDuration = 0;
            } else {
                SnoringStrategy snoringStrategy2 = this.mSnoringStrategy;
                if (snoringStrategy2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                    snoringStrategy2 = null;
                }
                if (snoringStrategy2.isCredible(snoring.get(i))) {
                    collectAndFlush(score, sleepBehavior, snoring.get(i), db.get(i).doubleValue(), isEnd);
                    this.mInvalidDuration = 0;
                } else {
                    this.mTotalVolume += db.get(i).doubleValue();
                    this.mCount++;
                    DreamTalkStrategy dreamTalkStrategy2 = this.mDreamTalkStrategy;
                    if (dreamTalkStrategy2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                        dreamTalkStrategy2 = null;
                    }
                    if (dreamTalkStrategy2.getValidCount() == 0) {
                        SnoringStrategy snoringStrategy3 = this.mSnoringStrategy;
                        if (snoringStrategy3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                        } else {
                            snoringStrategy = snoringStrategy3;
                        }
                        if (snoringStrategy.getValidCount() == 0) {
                            return;
                        }
                    }
                    if (this.mInvalidDuration < 10) {
                        this.mInvalidDuration++;
                        Logger.i(TAG, "Accumulated invalid data duration is " + this.mInvalidDuration + "s");
                        collectAndFlush(score, sleepBehavior, snoring.get(i), db.get(i).doubleValue(), isEnd);
                    } else {
                        flush(true);
                    }
                }
            }
            i = i2;
        }
    }

    private final void collect(Strategy strategy, Score score, SleepBehavior sleepBehavior, double db) {
        score.setTime(sleepBehavior.getTime());
        score.setDb(db);
        score.setData(sleepBehavior.getData());
        strategy.collect(score);
    }

    private final void collectAndFlush(Score score, SleepBehavior sleepBehavior, Score snoringScore, double db, boolean end) {
        DreamTalkStrategy dreamTalkStrategy;
        SnoringStrategy snoringStrategy;
        DreamTalkStrategy dreamTalkStrategy2 = this.mDreamTalkStrategy;
        if (dreamTalkStrategy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
            dreamTalkStrategy = null;
        } else {
            dreamTalkStrategy = dreamTalkStrategy2;
        }
        collect(dreamTalkStrategy, score, sleepBehavior, db);
        SnoringStrategy snoringStrategy2 = this.mSnoringStrategy;
        if (snoringStrategy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
            snoringStrategy = null;
        } else {
            snoringStrategy = snoringStrategy2;
        }
        collect(snoringStrategy, snoringScore, sleepBehavior, db);
        flush(end);
    }

    private final void flush(boolean end) {
        DreamTalkStrategy dreamTalkStrategy = this.mDreamTalkStrategy;
        Strategy strategy = null;
        if (dreamTalkStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
            dreamTalkStrategy = null;
        }
        if (dreamTalkStrategy.size() >= 60 || end) {
            Logger.i(TAG, "update audio and json file. isEnd = " + end);
            DreamTalkStrategy dreamTalkStrategy2 = this.mDreamTalkStrategy;
            if (dreamTalkStrategy2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                dreamTalkStrategy2 = null;
            }
            if (dreamTalkStrategy2.isInvalid()) {
                SnoringStrategy snoringStrategy = this.mSnoringStrategy;
                if (snoringStrategy == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                    snoringStrategy = null;
                }
                if (snoringStrategy.isInvalid()) {
                    Logger.e(TAG, "No valid snoring or dream talk data");
                    DreamTalkStrategy dreamTalkStrategy3 = this.mDreamTalkStrategy;
                    if (dreamTalkStrategy3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                        dreamTalkStrategy3 = null;
                    }
                    dreamTalkStrategy3.clear();
                    SnoringStrategy snoringStrategy2 = this.mSnoringStrategy;
                    if (snoringStrategy2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                    } else {
                        strategy = snoringStrategy2;
                    }
                    strategy.clear();
                    this.mInvalidDuration = 0;
                    return;
                }
            }
            DreamTalkStrategy dreamTalkStrategy4 = this.mDreamTalkStrategy;
            if (dreamTalkStrategy4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                dreamTalkStrategy4 = null;
            }
            int validCount = dreamTalkStrategy4.getValidCount();
            SnoringStrategy snoringStrategy3 = this.mSnoringStrategy;
            if (snoringStrategy3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                snoringStrategy3 = null;
            }
            if (validCount > snoringStrategy3.getValidCount()) {
                DreamTalkStrategy dreamTalkStrategy5 = this.mDreamTalkStrategy;
                if (dreamTalkStrategy5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                    dreamTalkStrategy5 = null;
                }
                dreamTalkStrategy5.flush(this.mInvalidDuration, this.mTotalVolume / this.mCount);
                SnoringStrategy snoringStrategy4 = this.mSnoringStrategy;
                if (snoringStrategy4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                } else {
                    strategy = snoringStrategy4;
                }
                strategy.clear();
            } else {
                SnoringStrategy snoringStrategy5 = this.mSnoringStrategy;
                if (snoringStrategy5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSnoringStrategy");
                    snoringStrategy5 = null;
                }
                snoringStrategy5.flush(this.mInvalidDuration, this.mTotalVolume / this.mCount);
                DreamTalkStrategy dreamTalkStrategy6 = this.mDreamTalkStrategy;
                if (dreamTalkStrategy6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDreamTalkStrategy");
                } else {
                    strategy = dreamTalkStrategy6;
                }
                strategy.clear();
            }
            this.mInvalidDuration = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(Context context, SleepingBehaviorDetector this$0, Function0 callback) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        String path = FileUtils.INSTANCE.createDirInFiles(context, MODEL_FILE_PATH).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        AssetUtil.INSTANCE.copyAssetsDirToSDCard(context, "model", path);
        SleepDetSdk sleepDetSdk = new SleepDetSdk();
        this$0.mSleepDetSdk = sleepDetSdk;
        if (sleepDetSdk.init(path + "/model")) {
            callback.invoke();
        } else {
            LogExtKt.loge("fail to init SleepDetSdk");
            throw new RuntimeException("fail to init SleepDetSdk");
        }
    }

    public final void init(@NotNull final Context context, @NotNull String resultDirPath, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultDirPath, "resultDirPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mDreamTalkStrategy = new DreamTalkStrategy(resultDirPath);
        this.mSnoringStrategy = new SnoringStrategy(resultDirPath);
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: y1n
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                SleepingBehaviorDetector.init$lambda$0(context, this, callback);
            }
        });
    }

    public final void release() {
        SleepDetSdk sleepDetSdk = this.mSleepDetSdk;
        if (sleepDetSdk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSleepDetSdk");
            sleepDetSdk = null;
        }
        sleepDetSdk.release();
    }

    public final int soundIdentify(long startTime, @NotNull byte[] data, boolean isEnd) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (startTime > 0) {
            this.mStartTime = startTime;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        SleepDetSdk sleepDetSdk = this.mSleepDetSdk;
        if (sleepDetSdk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSleepDetSdk");
            sleepDetSdk = null;
        }
        String strFeedData = sleepDetSdk.feedData(data, data.length);
        if (TextUtils.isEmpty(strFeedData)) {
            return 0;
        }
        Object objFromJson = this.mGson.fromJson(strFeedData, (Class<Object>) SleepBehavior.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        SleepBehavior sleepBehavior = (SleepBehavior) objFromJson;
        sleepBehavior.setData((byte[]) data.clone());
        sleepBehavior.setTime(jCurrentTimeMillis);
        analysis(sleepBehavior, isEnd);
        return 0;
    }
}
