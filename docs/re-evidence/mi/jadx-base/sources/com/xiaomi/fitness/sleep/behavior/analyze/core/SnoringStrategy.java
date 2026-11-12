package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.SnoreAudioProfile;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import defpackage.bvc;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy;", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy;", "resultDirPath", "", "<init>", "(Ljava/lang/String;)V", "mSnoringStatisticInfo", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioProfile;", "mBestSnoring", "Ljava/util/concurrent/PriorityBlockingQueue;", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BehaviorSegment;", "readSnoringInfoFromFile", "", "isInvalid", "", "updateFile", "behaviorSegment", "fileName", "isCredible", "score", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "type", "", "getType", "()I", "namePrefix", "getNamePrefix", "()Ljava/lang/String;", "updateSnoreInfo", "db", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Decibel;", "updateAudioAndJson", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnoringStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoringStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1863#2,2:141\n1863#2,2:143\n*S KotlinDebug\n*F\n+ 1 SnoringStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy\n*L\n79#1:141,2\n120#1:143,2\n*E\n"})
public final class SnoringStrategy extends BaseStrategy {
    private static final int MAX_SNORING_AUDIO_FILE = 5;

    @NotNull
    private final PriorityBlockingQueue<BehaviorSegment> mBestSnoring;

    @NotNull
    private final SnoreAudioProfile mSnoringStatisticInfo;

    @NotNull
    private final String namePrefix;
    private final int type;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sleep.behavior.analyze.core.SnoringStrategy$readSnoringInfoFromFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sleep.behavior.analyze.core.SnoringStrategy$readSnoringInfoFromFile$1", f = "SnoringStrategy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSnoringStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoringStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy$readSnoringInfoFromFile$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n785#2:141\n796#2:142\n1872#2,2:143\n797#2,2:145\n1874#2:147\n799#2:148\n*S KotlinDebug\n*F\n+ 1 SnoringStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/SnoringStrategy$readSnoringInfoFromFile$1\n*L\n59#1:141\n59#1:142\n59#1:143,2\n59#1:145,2\n59#1:147\n59#1:148\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SnoringStrategy.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strLoadFromFile = FileUtils.INSTANCE.loadFromFile(SnoringStrategy.this.getResultDirPath() + "/filelist.json");
            if (strLoadFromFile != null && strLoadFromFile.length() != 0) {
                try {
                    Gson gsonCreate = new GsonBuilder().setLenient().create();
                    Intrinsics.checkNotNull(gsonCreate);
                    List list = GsonExtKt.toList(gsonCreate, strLoadFromFile, BehaviorSegment.class);
                    SnoringStrategy snoringStrategy = SnoringStrategy.this;
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        if (((BehaviorSegment) obj2).getType() == snoringStrategy.getType()) {
                            arrayList.add(obj2);
                        }
                        i = i2;
                    }
                    SnoringStrategy.this.mBestSnoring.addAll(arrayList);
                    LogExtKt.logi("readSnoringInfoFromFile: " + SnoringStrategy.this.mBestSnoring);
                } catch (Exception e) {
                    LogExtKt.loge("readSnoringInfoFromFile : " + e);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sleep.behavior.analyze.core.SnoringStrategy$updateAudioAndJson$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sleep.behavior.analyze.core.SnoringStrategy$updateAudioAndJson$1", f = "SnoringStrategy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29401(Continuation<? super C29401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SnoringStrategy.this.new C29401(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SnoringStrategy snoringStrategy = SnoringStrategy.this;
            snoringStrategy.writeObjectToFile(snoringStrategy.mSnoringStatisticInfo, SnoringStrategy.this.getResultDirPath() + "/statistic_info.json");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoringStrategy(@NotNull String resultDirPath) {
        super(resultDirPath);
        Intrinsics.checkNotNullParameter(resultDirPath, "resultDirPath");
        this.mSnoringStatisticInfo = new SnoreAudioProfile();
        this.mBestSnoring = new PriorityBlockingQueue<>(5, new Comparator() { // from class: com.xiaomi.fitness.sleep.behavior.analyze.core.SnoringStrategy$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((BehaviorSegment) t).getCredibility()), Double.valueOf(((BehaviorSegment) t2).getCredibility()));
            }
        });
        readSnoringInfoFromFile();
        this.type = 1;
        this.namePrefix = "snore";
    }

    private final void readSnoringInfoFromFile() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    private final void updateAudioAndJson(BehaviorSegment behaviorSegment, String fileName) {
        saveAudioFileAndJson(behaviorSegment, fileName);
        updateFileList(behaviorSegment);
        AnyExtKt.io$default(null, new C29401(null), 1, null);
    }

    private final void updateSnoreInfo(List<Decibel> db) throws Throwable {
        DataOutputStream dataOutputStream;
        File file = new File(getResultDirPath() + "/snore_info.dat");
        FileUtils.INSTANCE.createFileWithDirs(file);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
            try {
                dataOutputStream = new DataOutputStream(fileOutputStream2);
                try {
                    for (Decibel decibel : db) {
                        dataOutputStream.writeInt((int) decibel.getTime());
                        dataOutputStream.writeFloat((float) decibel.getValue());
                    }
                    dataOutputStream.flush();
                    bvc.a(fileOutputStream2, dataOutputStream);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Logger.e("SleepBehaviorAnalyst", "writeStringToFile fail, error message:" + e.getMessage());
                        bvc.a(fileOutputStream, dataOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bvc.a(fileOutputStream, dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    bvc.a(fileOutputStream, dataOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                dataOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            dataOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            dataOutputStream = null;
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    @NotNull
    public String getNamePrefix() {
        return this.namePrefix;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public int getType() {
        return this.type;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public boolean isCredible(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        return score.isCredible() == 1 && score.getCredibility() > 0.5d;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy
    public boolean isInvalid() {
        return getValidCount() < 3;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy
    public void updateFile(@NotNull BehaviorSegment behaviorSegment, @NotNull String fileName) throws Throwable {
        Intrinsics.checkNotNullParameter(behaviorSegment, "behaviorSegment");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Iterator<T> it = getMScores().iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(dMax, ((Score) it.next()).getDb());
        }
        SnoreAudioProfile snoreAudioProfile = this.mSnoringStatisticInfo;
        snoreAudioProfile.setSnoreNumber(snoreAudioProfile.getSnoreNumber() + behaviorSegment.getCount());
        SnoreAudioProfile snoreAudioProfile2 = this.mSnoringStatisticInfo;
        snoreAudioProfile2.setSnorePureTotalTime(snoreAudioProfile2.getSnorePureTotalTime() + behaviorSegment.getDuration());
        SnoreAudioProfile snoreAudioProfile3 = this.mSnoringStatisticInfo;
        snoreAudioProfile3.setSnoreMaxVolume(Math.max(snoreAudioProfile3.getSnoreMaxVolume(), dMax));
        this.mSnoringStatisticInfo.setBackgroundVolume(behaviorSegment.getAverageNoise());
        if (this.mBestSnoring.size() < 5) {
            this.mBestSnoring.offer(behaviorSegment);
            updateAudioAndJson(behaviorSegment, fileName);
        } else {
            BehaviorSegment behaviorSegmentPeek = this.mBestSnoring.peek();
            if (behaviorSegmentPeek != null && Double.compare(behaviorSegmentPeek.getCredibility(), behaviorSegment.getCredibility()) == -1) {
                this.mBestSnoring.poll();
                this.mBestSnoring.offer(behaviorSegment);
                FileUtils fileUtils = FileUtils.INSTANCE;
                fileUtils.deleteFile(getResultDirPath() + "/" + behaviorSegmentPeek.getFileName());
                fileUtils.deleteFile(getResultDirPath() + "/" + StringsKt__StringsKt.removeSuffix(behaviorSegmentPeek.getFileName(), (CharSequence) ".wav") + ".json");
                updateAudioAndJson(behaviorSegment, fileName);
            }
        }
        updateSnoreInfo(behaviorSegment.getDbs());
    }
}
