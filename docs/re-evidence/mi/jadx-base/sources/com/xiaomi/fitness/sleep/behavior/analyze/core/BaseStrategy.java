package com.xiaomi.fitness.sleep.behavior.analyze.core;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sleep.behavior.utils.WavUtil;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.r72;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH&J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0003H\u0004J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0004J\u001e\u0010)\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\u0006\u0010#\u001a\u00020\u0003H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy;", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Strategy;", "resultDirPath", "", "<init>", "(Ljava/lang/String;)V", "getResultDirPath", "()Ljava/lang/String;", "mScores", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "getMScores", "()Ljava/util/List;", "setMScores", "(Ljava/util/List;)V", "validCount", "", "getValidCount", "()I", "setValidCount", "(I)V", "mGson", "Lcom/google/gson/Gson;", "collect", "", "score", "flush", "invalidDuration", "curAverageNoise", "", "isInvalid", "", "updateFile", "behaviorSegment", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BehaviorSegment;", "fileName", CervicalMucusRecord.Appearance.CLEAR, MediaStoreUtil.MediaInfo.SIZE, "saveAudioFileAndJson", "jsonName", "updateFileList", "createDbFile", "dbs", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Decibel;", "writeObjectToFile", "obj", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1863#2,2:156\n*S KotlinDebug\n*F\n+ 1 BaseStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy\n*L\n62#1:156,2\n*E\n"})
public abstract class BaseStrategy implements Strategy {
    private static final int MAX_ENDING_BLANK_TIME = 5;

    @NotNull
    private final Gson mGson;

    @NotNull
    private List<Score> mScores;

    @NotNull
    private final String resultDirPath;
    private int validCount;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy$saveAudioFileAndJson$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy$saveAudioFileAndJson$1", f = "BaseStrategy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBaseStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy$saveAudioFileAndJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1863#2,2:156\n*S KotlinDebug\n*F\n+ 1 BaseStrategy.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy$saveAudioFileAndJson$1\n*L\n101#1:156,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BehaviorSegment $behaviorSegment;
        final /* synthetic */ String $jsonName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BehaviorSegment behaviorSegment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$behaviorSegment = behaviorSegment;
            this.$jsonName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BaseStrategy.this.new AnonymousClass1(this.$behaviorSegment, this.$jsonName, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String str = BaseStrategy.this.getResultDirPath() + "/" + this.$behaviorSegment.getFileName();
            File file = new File(str);
            FileUtils.INSTANCE.createFileWithDirs(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    Iterator<T> it = this.$behaviorSegment.getDatas().iterator();
                    while (it.hasNext()) {
                        fileOutputStream.write((byte[]) it.next());
                    }
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    IOExtKt.closeSilently(coroutineScope, fileOutputStream);
                } catch (Exception e) {
                    LogExtKt.loge("saveAudioFileAndJson exception:" + e);
                    fileOutputStream.getFD().sync();
                    IOExtKt.closeSilently(coroutineScope, fileOutputStream);
                }
                WavUtil.INSTANCE.convertToWav(str, 16000, 1, 16);
                BaseStrategy.this.createDbFile(this.$behaviorSegment.getDbs(), this.$jsonName);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                fileOutputStream.getFD().sync();
                IOExtKt.closeSilently(coroutineScope, fileOutputStream);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy$updateFileList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy$updateFileList$1", f = "BaseStrategy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BehaviorSegment $behaviorSegment;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29391(BehaviorSegment behaviorSegment, Continuation<? super C29391> continuation) {
            super(2, continuation);
            this.$behaviorSegment = behaviorSegment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29391 c29391 = BaseStrategy.this.new C29391(this.$behaviorSegment, continuation);
            c29391.L$0 = obj;
            return c29391;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            long length;
            int i = 1;
            i = 1;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = (CoroutineScope) this.L$0;
            String json = BaseStrategy.this.mGson.toJson(this.$behaviorSegment);
            Logger.i("BaseStrategy", "updateFileList: " + json);
            File file = new File(BaseStrategy.this.getResultDirPath() + "/filelist.json");
            Object obj3 = null;
            try {
                try {
                    FileUtils.INSTANCE.createFileWithDirs(file);
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        long j = 0;
                        String str2 = "]";
                        if (randomAccessFile.length() == 0) {
                            str = "[" + json + "]";
                            length = 0;
                        } else {
                            str = "," + json + "]";
                            length = randomAccessFile.length() - 1;
                        }
                        if (length >= 0) {
                            j = length;
                        }
                        randomAccessFile.seek(j);
                        randomAccessFile.writeBytes(str);
                        Closeable[] closeableArr = {randomAccessFile};
                        IOExtKt.closeSilently(obj2, closeableArr);
                        i = closeableArr;
                        obj3 = str2;
                    } catch (Exception e) {
                        e = e;
                        obj3 = randomAccessFile;
                        Logger.e("BaseStrategy", "fail to update filelist, because " + e.getMessage());
                        Closeable[] closeableArr2 = {obj3};
                        IOExtKt.closeSilently(obj2, closeableArr2);
                        i = closeableArr2;
                        obj3 = obj3;
                    } catch (Throwable th) {
                        th = th;
                        obj3 = randomAccessFile;
                        Closeable[] closeableArr3 = new Closeable[i];
                        closeableArr3[0] = obj3;
                        IOExtKt.closeSilently(obj2, closeableArr3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            obj2 = Unit.INSTANCE;
            return obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BaseStrategy(@NotNull String resultDirPath) {
        Intrinsics.checkNotNullParameter(resultDirPath, "resultDirPath");
        this.resultDirPath = resultDirPath;
        this.mScores = new CopyOnWriteArrayList();
        Gson gsonCreate = new GsonBuilder().serializeSpecialFloatingPointValues().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        this.mGson = gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDbFile(List<Decibel> dbs, String fileName) throws Throwable {
        writeObjectToFile(dbs, this.resultDirPath + "/" + fileName + ".json");
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public void clear() {
        this.mScores.clear();
        setValidCount(0);
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public void collect(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        if (isCredible(score)) {
            setValidCount(getValidCount() + 1);
        }
        this.mScores.add(score);
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public void flush(int invalidDuration, double curAverageNoise) {
        int size;
        int size2;
        if (isInvalid()) {
            Logger.e("BaseStrategy", "BehaviorSegment has no valid data");
            return;
        }
        if (invalidDuration > 5 && (size2 = (size = this.mScores.size() - 1) - (invalidDuration - 5)) <= size) {
            while (true) {
                this.mScores.remove(size);
                if (size == size2) {
                    break;
                } else {
                    size--;
                }
            }
        }
        BehaviorSegment behaviorSegment = new BehaviorSegment();
        for (Score score : this.mScores) {
            List<byte[]> datas = behaviorSegment.getDatas();
            byte[] data = score.getData();
            Intrinsics.checkNotNull(data);
            datas.add(data);
            behaviorSegment.setCredibility(behaviorSegment.getCredibility() + score.getCredibility());
            behaviorSegment.getDbs().add(new Decibel(score.getTime(), score.getDb()));
        }
        behaviorSegment.setType(getType());
        behaviorSegment.setBeginTime(((Score) CollectionsKt___CollectionsKt.first((List) this.mScores)).getTime());
        behaviorSegment.setDuration((int) (((Score) CollectionsKt___CollectionsKt.last((List) this.mScores)).getTime() - ((Score) CollectionsKt___CollectionsKt.first((List) this.mScores)).getTime()));
        String str = getNamePrefix() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + TimeUtils.formatDate("yyyyMMddHHmmss", Long.valueOf(System.currentTimeMillis()));
        behaviorSegment.setFileName(str + ".wav");
        behaviorSegment.setCount(getValidCount());
        behaviorSegment.setAverageNoise(curAverageNoise);
        Logger.i("BaseStrategy", "Update file of " + str);
        updateFile(behaviorSegment, str);
        clear();
    }

    @NotNull
    public final List<Score> getMScores() {
        return this.mScores;
    }

    @NotNull
    public final String getResultDirPath() {
        return this.resultDirPath;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public int getValidCount() {
        return this.validCount;
    }

    public abstract boolean isInvalid();

    public final void saveAudioFileAndJson(@NotNull BehaviorSegment behaviorSegment, @NotNull String jsonName) {
        Intrinsics.checkNotNullParameter(behaviorSegment, "behaviorSegment");
        Intrinsics.checkNotNullParameter(jsonName, "jsonName");
        AnyExtKt.io$default(null, new AnonymousClass1(behaviorSegment, jsonName, null), 1, null);
    }

    public final void setMScores(@NotNull List<Score> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mScores = list;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public void setValidCount(int i) {
        this.validCount = i;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public int size() {
        return this.mScores.size();
    }

    public abstract void updateFile(@NotNull BehaviorSegment behaviorSegment, @NotNull String fileName);

    public final void updateFileList(@NotNull BehaviorSegment behaviorSegment) {
        Intrinsics.checkNotNullParameter(behaviorSegment, "behaviorSegment");
        AnyExtKt.io$default(null, new C29391(behaviorSegment, null), 1, null);
    }

    public final void writeObjectToFile(@NotNull Object obj, @NotNull String fileName) throws Throwable {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(fileName);
        String json = this.mGson.toJson(obj);
        LogExtKt.logi("writeObjectToFile: obj=" + json);
        FileUtils.INSTANCE.createFileWithDirs(file);
        r72.s(fileName, json, false);
    }
}
