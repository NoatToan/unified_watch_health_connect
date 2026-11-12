package com.xiaomi.fit.fitness.impl.internal;

import android.app.Application;
import com.mi.fitness.ecg.EcgFilterAlgo;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.impl.internal.sport.SportGpsConverter;
import com.xiaomi.fit.fitness.impl.internal.sport.SportRecordConverter;
import com.xiaomi.fit.fitness.parser.FitnessDataParser;
import com.xiaomi.fit.fitness.parser.data.EcgMeasureResult;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.persist.FitnessFDSUploader;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import defpackage.r72;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007J<\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f0\u00120\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J<\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f0\u00120\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J \u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J(\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010!J4\u0010\"\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000f\u0012\u0004\u0012\u00020%0#2\u0006\u0010&\u001a\u00020%H\u0087@¢\u0006\u0002\u0010'J,\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010*J \u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter;", "", "<init>", "()V", "getFDSStoreData", "", "sid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteFDSData", "url", "routeName", "getRouteGpsData", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "getSportGpsData", "", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportRecordData", "getSportRecoverRateData", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "getEcgRecordData", "", "ecgRecord", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "durationInSec", "sparsePoints", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemperatureFileData", "Lkotlin/Triple;", "", "", "startDateSec", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrackRawData", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrackByteData", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessFDSDataGetter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessFDSDataGetter.kt\ncom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1#2:382\n1053#3:383\n1863#3,2:384\n*S KotlinDebug\n*F\n+ 1 FitnessFDSDataGetter.kt\ncom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter\n*L\n299#1:383\n304#1:384,2\n*E\n"})
public final class FitnessFDSDataGetter {

    @NotNull
    private static final String TAG = "FitnessFDSDataGetter";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessFDSDataGetter instance = new FitnessFDSDataGetter();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter;", "getInstance", "()Lcom/xiaomi/fit/fitness/impl/internal/FitnessFDSDataGetter;", "TAG", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessFDSDataGetter getInstance() {
            return FitnessFDSDataGetter.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getEcgRecordData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0, 0, 0, 0}, l = {234}, m = "getEcgRecordData", n = {"ecgRecord", "dataId", "durationInSec", "sparsePoints"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getEcgRecordData(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getFDSStoreData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0, 0}, l = {65}, m = "getFDSStoreData", n = {"dataId", "file"}, s = {"L$0", "L$1"})
    public static final class C15911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15911(Continuation<? super C15911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getFDSStoreData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getSportGpsData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0, 0}, l = {132}, m = "getSportGpsData", n = {"report", "dataId"}, s = {"L$0", "L$1"})
    public static final class C15921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15921(Continuation<? super C15921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getSportGpsData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getSportRecordData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0, 0}, l = {179}, m = "getSportRecordData", n = {"report", "dataId"}, s = {"L$0", "L$1"})
    public static final class C15931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15931(Continuation<? super C15931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getSportRecordData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getSportRecoverRateData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0}, l = {212}, m = "getSportRecoverRateData", n = {"dataId"}, s = {"L$0"})
    public static final class C15941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C15941(Continuation<? super C15941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getSportRecoverRateData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter$getTemperatureFileData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter", f = "FitnessFDSDataGetter.kt", i = {0, 0, 0, 0, 0, 0}, l = {313}, m = "getTemperatureFileData", n = {"this", "tempBytes", "timeList", "latestTime", "it", "dataId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6"})
    public static final class C15951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C15951(Continuation<? super C15951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSDataGetter.this.getTemperatureFileData(0L, this);
        }
    }

    private FitnessFDSDataGetter() {
    }

    private final byte[] getRouteFDSData(String url, String routeName) {
        try {
            File routeFDSDataFile = FitnessFileUtils.getRouteFDSDataFile(ApplicationExtKt.getApplication(), "route", routeName);
            byte[] file = FitnessFileUtils.INSTANCE.readFile(routeFDSDataFile);
            if (file != null) {
                if (!(file.length == 0)) {
                    FitnessLogUtils.i(TAG, "getRouteFDSData: return local file data(" + routeName + ")-size(" + file.length + ")");
                    return file;
                }
            }
            FitnessFDSUploader companion = FitnessFDSUploader.INSTANCE.getInstance();
            if (url == null) {
                url = "";
            }
            byte[] bArrDownloadRoute = companion.downloadRoute(url);
            if (bArrDownloadRoute != null) {
                if (!(bArrDownloadRoute.length == 0)) {
                    FitnessLogUtils.i(TAG, "getRouteFDSData: download success(" + routeName + ")");
                    FitnessFileUtils.writeFile(routeFDSDataFile, bArrDownloadRoute);
                }
            }
            return bArrDownloadRoute;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "getRouteFDSData", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object getEcgRecordData(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, @NotNull Continuation<? super float[]> continuation) {
        AnonymousClass1 anonymousClass1;
        EcgMedicalItemReport ecgMedicalItemReport2;
        FitnessDataId fitnessDataId;
        int sampleFrequency;
        EcgMeasureResult ecgMeasureResult;
        int i3 = i;
        int i4 = i2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i5 = anonymousClass1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i5 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = anonymousClass1.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            if (ecgMedicalItemReport.getSid() == null) {
                FitnessLogUtils.i(TAG, "getEcgRecordData: no sid");
                return null;
            }
            FitnessDataId dataId = ecgMedicalItemReport.getDataId();
            FitnessLogUtils.i(TAG, "getEcgRecordData:" + i3 + "-" + i4 + "-(" + dataId + ")");
            String sid = ecgMedicalItemReport.getSid();
            Intrinsics.checkNotNull(sid);
            ecgMedicalItemReport2 = ecgMedicalItemReport;
            anonymousClass1.L$0 = ecgMedicalItemReport2;
            anonymousClass1.L$1 = dataId;
            anonymousClass1.I$0 = i3;
            anonymousClass1.I$1 = i4;
            anonymousClass1.label = 1;
            Object fDSStoreData = getFDSStoreData(sid, dataId, anonymousClass1);
            if (fDSStoreData == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessDataId = dataId;
            obj = fDSStoreData;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = anonymousClass1.I$1;
            int i8 = anonymousClass1.I$0;
            fitnessDataId = (FitnessDataId) anonymousClass1.L$1;
            EcgMedicalItemReport ecgMedicalItemReport3 = (EcgMedicalItemReport) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            ecgMedicalItemReport2 = ecgMedicalItemReport3;
            i4 = i7;
            i3 = i8;
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length == 0) {
            FitnessLogUtils.i(TAG, "getEcgRecordData: no data");
            return null;
        }
        FitnessParseResult fitnessParseResult = FitnessDataParser.INSTANCE.parse(fitnessDataId, bArr);
        if (((fitnessParseResult == null || (ecgMeasureResult = fitnessParseResult.getEcgMeasureResult()) == null) ? null : ecgMeasureResult.getSrcData()) == null) {
            FitnessLogUtils.i(TAG, "getEcgRecordData: parse error");
            return null;
        }
        EcgMeasureResult ecgMeasureResult2 = fitnessParseResult.getEcgMeasureResult();
        Intrinsics.checkNotNull(ecgMeasureResult2);
        List<Float> srcData = ecgMeasureResult2.getSrcData();
        float[] outputData = EcgFilterAlgo.INSTANCE.getInstance().filter(CollectionsKt___CollectionsKt.toFloatArray(srcData), ecgMedicalItemReport2.getSampleFrequency(), ecgMedicalItemReport2.getDataSource()).getOutputData();
        if (i3 == ecgMedicalItemReport2.getMeasureDuration()) {
            Application application = ApplicationExtKt.getApplication();
            String sid2 = ecgMedicalItemReport2.getSid();
            Intrinsics.checkNotNull(sid2);
            File cacheDataFile = FitnessFileUtils.getCacheDataFile(application, sid2, fitnessDataId);
            FileUtils fileUtils = FileUtils.INSTANCE;
            fileUtils.writeStrToFile(cacheDataFile.getPath() + "_src", srcData.toString());
            fileUtils.writeStrToFile(cacheDataFile.getPath() + "_filter", ArraysKt___ArraysKt.toList(outputData).toString());
        }
        int length = outputData.length / ecgMedicalItemReport2.getSampleFrequency();
        if (length / 30 == 1) {
            int i9 = length % 30;
            if (i9 + ((((i9 ^ 30) & ((-i9) | i9)) >> 31) & 30) >= 2) {
                sampleFrequency = (int) (((double) ecgMedicalItemReport2.getSampleFrequency()) * 1.5d);
            } else {
                sampleFrequency = 0;
            }
        } else {
            sampleFrequency = 0;
        }
        if (i3 > length) {
            FitnessLogUtils.w(TAG, "not (" + i3 + ") data,only(" + length + ")");
            return null;
        }
        if (i3 > 30) {
            i3 = (i3 / 30) * 30;
        }
        int sampleFrequency2 = (ecgMedicalItemReport2.getSampleFrequency() * i3) / i4;
        float[] fArr = new float[sampleFrequency2];
        FitnessLogUtils.i(TAG, "startIndex(" + sampleFrequency + "),return(" + i3 + "-" + sampleFrequency2 + ")");
        int i10 = sampleFrequency > 0 ? sampleFrequency - 1 : 0;
        for (int i11 = 0; i11 < sampleFrequency2; i11++) {
            fArr[i11] = outputData[(i11 * i4) + i10] / 1000.0f;
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getFDSStoreData(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull Continuation<? super byte[]> continuation) {
        C15911 c15911;
        File file;
        if (continuation instanceof C15911) {
            c15911 = (C15911) continuation;
            int i = c15911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15911.label = i - Integer.MIN_VALUE;
            } else {
                c15911 = new C15911(continuation);
            }
        } else {
            c15911 = new C15911(continuation);
        }
        Object obj = c15911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15911.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                File fDSDataFile = FitnessFileUtils.getFDSDataFile(ApplicationExtKt.getApplication(), str, fitnessDataId);
                byte[] file2 = FitnessFileUtils.INSTANCE.readFile(fDSDataFile);
                if (file2 != null) {
                    if (!(file2.length == 0)) {
                        FitnessLogUtils.i(TAG, "getFDSStoreData: return local file data(" + fitnessDataId + ")-size(" + file2.length + ")");
                        return file2;
                    }
                }
                FitnessFDSUploader companion = FitnessFDSUploader.INSTANCE.getInstance();
                c15911.L$0 = fitnessDataId;
                c15911.L$1 = fDSDataFile;
                c15911.label = 1;
                Object objDownloadFromFDS = companion.downloadFromFDS(str, fitnessDataId, c15911);
                if (objDownloadFromFDS == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objDownloadFromFDS;
                file = fDSDataFile;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) c15911.L$1;
                fitnessDataId = (FitnessDataId) c15911.L$0;
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    FitnessLogUtils.i(TAG, "getFDSStoreData: download success(" + fitnessDataId + ")");
                    FitnessFileUtils.writeFile(file, bArr);
                }
            }
            return bArr;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "getFDSStoreData", th);
            return null;
        }
    }

    @Nullable
    public final List<Location> getRouteGpsData(@Nullable String url, @NotNull String routeName) {
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        byte[] routeFDSData = getRouteFDSData(url, routeName);
        if (routeFDSData == null || routeFDSData.length == 0) {
            FitnessLogUtils.i(TAG, "getSportGpsData: no bytes(" + routeName + ")");
            return null;
        }
        FitnessParseResult sportData = FitnessDataParser.INSTANCE.parseSportData(routeFDSData, 2);
        if ((sportData != null ? sportData.getGpsRecord() : null) == null) {
            FitnessLogUtils.i(TAG, "getSportGpsData: parse failed(" + routeName + ")");
            return null;
        }
        Map<Integer, List<GpsRecord>> gpsRecord = sportData.getGpsRecord();
        Intrinsics.checkNotNull(gpsRecord);
        List<GpsRecord> list = gpsRecord.get(0);
        if (list != null) {
            return SportGpsConverter.INSTANCE.getInstance().convertGpsData(list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportGpsData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation) {
        C15921 c15921;
        FitnessDataId fitnessDataId;
        SportBasicReport outdoorRidingReport;
        if (continuation instanceof C15921) {
            c15921 = (C15921) continuation;
            int i = c15921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15921.label = i - Integer.MIN_VALUE;
            } else {
                c15921 = new C15921(continuation);
            }
        } else {
            c15921 = new C15921(continuation);
        }
        Object obj = c15921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (sportBasicReport.getVersion() <= 0) {
                FitnessLogUtils.i(TAG, "no gps file for version = " + sportBasicReport.getVersion());
                return MapsKt__MapsKt.emptyMap();
            }
            FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getProtoType()).fileType(2).build();
            c15921.L$0 = sportBasicReport;
            c15921.L$1 = fitnessDataIdBuild;
            c15921.label = 1;
            Object fDSStoreData = getFDSStoreData(str, fitnessDataIdBuild, c15921);
            if (fDSStoreData == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = fDSStoreData;
            fitnessDataId = fitnessDataIdBuild;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fitnessDataId = (FitnessDataId) c15921.L$1;
            sportBasicReport = (SportBasicReport) c15921.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length == 0) {
            FitnessLogUtils.i(TAG, "getSportGpsData: no bytes(" + fitnessDataId + ")");
            Map mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        FitnessParseResult sportData = FitnessDataParser.INSTANCE.parseSportData(bArr, 2);
        if ((sportData != null ? sportData.getGpsRecord() : null) == null) {
            FitnessLogUtils.i(TAG, "getSportGpsData: parse failed(" + fitnessDataId + ")");
            Map mapEmptyMap2 = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "emptyMap(...)");
            return mapEmptyMap2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (sportData.getGpsTgcData() != null) {
            SportRecordKey sportRecordKey = SportRecordKey.TgcGps;
            byte[] gpsTgcData = sportData.getGpsTgcData();
            Intrinsics.checkNotNull(gpsTgcData);
            linkedHashMap2.put(sportRecordKey, CollectionsKt__CollectionsJVMKt.listOf(gpsTgcData));
        }
        Map<Integer, List<GpsRecord>> gpsRecord = sportData.getGpsRecord();
        Intrinsics.checkNotNull(gpsRecord);
        for (Map.Entry<Integer, List<GpsRecord>> entry : gpsRecord.entrySet()) {
            if (sportBasicReport.getProtoType() == 17) {
                int iIntValue = entry.getKey().intValue();
                outdoorRidingReport = iIntValue != 1 ? iIntValue != 10 ? sportBasicReport.getOutdoorRidingReport() : sportBasicReport.getOpenSwimmingReport() : sportBasicReport.getOutdoorRunningReport();
            } else {
                outdoorRidingReport = null;
            }
            SportGpsConverter companion = SportGpsConverter.INSTANCE.getInstance();
            if (outdoorRidingReport == null) {
                outdoorRidingReport = sportBasicReport;
            }
            linkedHashMap.put(entry.getKey(), MapsKt__MapsKt.plus(companion.convertGpsRecord(outdoorRidingReport, entry.getValue()), linkedHashMap2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportRecordData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation) {
        C15931 c15931;
        FitnessDataId fitnessDataId;
        if (continuation instanceof C15931) {
            c15931 = (C15931) continuation;
            int i = c15931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15931.label = i - Integer.MIN_VALUE;
            } else {
                c15931 = new C15931(continuation);
            }
        } else {
            c15931 = new C15931(continuation);
        }
        Object obj = c15931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (sportBasicReport.getVersion() <= 0) {
                FitnessLogUtils.i(TAG, "no record file for version = " + sportBasicReport.getVersion());
                return MapsKt__MapsKt.emptyMap();
            }
            FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getProtoType()).fileType(0).build();
            c15931.L$0 = sportBasicReport;
            c15931.L$1 = fitnessDataIdBuild;
            c15931.label = 1;
            Object fDSStoreData = getFDSStoreData(str, fitnessDataIdBuild, c15931);
            if (fDSStoreData == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = fDSStoreData;
            fitnessDataId = fitnessDataIdBuild;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fitnessDataId = (FitnessDataId) c15931.L$1;
            sportBasicReport = (SportBasicReport) c15931.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length == 0) {
            FitnessLogUtils.i(TAG, "getSportRecordData: no bytes(" + fitnessDataId + ")");
            Map mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        FitnessParseResult sportData = FitnessDataParser.INSTANCE.parseSportData(bArr, 0);
        if ((sportData != null ? sportData.getSportRecord() : null) == null) {
            FitnessLogUtils.i(TAG, "getSportRecordData: parse failed(" + fitnessDataId + ")");
            Map mapEmptyMap2 = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "emptyMap(...)");
            return mapEmptyMap2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<Integer, List<SportRecord>> sportRecord = sportData.getSportRecord();
        Intrinsics.checkNotNull(sportRecord);
        for (Map.Entry<Integer, List<SportRecord>> entry : sportRecord.entrySet()) {
            linkedHashMap.put(entry.getKey(), SportRecordConverter.INSTANCE.getInstance().convertSportRecord(entry.getKey().intValue(), entry.getValue(), sportBasicReport, sportData.getDataIdVersion()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportRecoverRateData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super RecoverRateData> continuation) {
        C15941 c15941;
        FitnessDataId fitnessDataId;
        if (continuation instanceof C15941) {
            c15941 = (C15941) continuation;
            int i = c15941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15941.label = i - Integer.MIN_VALUE;
            } else {
                c15941 = new C15941(continuation);
            }
        } else {
            c15941 = new C15941(continuation);
        }
        Object fDSStoreData = c15941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(fDSStoreData);
            if (sportBasicReport.getVersion() <= 0) {
                FitnessLogUtils.i(TAG, "no record file for version = " + sportBasicReport.getVersion());
                return null;
            }
            FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getProtoType()).fileType(3).build();
            c15941.L$0 = fitnessDataIdBuild;
            c15941.label = 1;
            fDSStoreData = getFDSStoreData(str, fitnessDataIdBuild, c15941);
            if (fDSStoreData == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessDataId = fitnessDataIdBuild;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fitnessDataId = (FitnessDataId) c15941.L$0;
            ResultKt.throwOnFailure(fDSStoreData);
        }
        byte[] bArr = (byte[]) fDSStoreData;
        if (bArr == null || bArr.length == 0) {
            FitnessLogUtils.i(TAG, "getSportRecordData: no bytes(" + fitnessDataId + ")");
            return null;
        }
        FitnessParseResult sportData = FitnessDataParser.INSTANCE.parseSportData(bArr, 3);
        if ((sportData != null ? sportData.getRecoverRateData() : null) != null) {
            return sportData.getRecoverRateData();
        }
        FitnessLogUtils.i(TAG, "getSportRecordData: parse failed(" + fitnessDataId + ")");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:22:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x013b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0143  */
    /* JADX WARN: Code duplicated, block: B:29:0x0148  */
    /* JADX WARN: Code duplicated, block: B:31:0x014b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0132 -> B:23:0x0135). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @android.annotation.SuppressLint({"WrongConstant"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTemperatureFileData(long r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Triple<? extends java.util.List<byte[]>, ? extends java.util.List<java.lang.Long>, java.lang.Long>> r18) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter.getTemperatureFileData(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object getTrackByteData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super byte[]> continuation) {
        try {
            byte[] file = FitnessFileUtils.INSTANCE.readFile(new File(r72.o(), str2));
            if (file != null) {
                if (!(file.length == 0)) {
                    FitnessLogUtils.i(TAG, "getRouteFDSData: return local file data(" + str2 + ")-size(" + file.length + ")");
                    return file;
                }
            }
            FitnessFDSUploader companion = FitnessFDSUploader.INSTANCE.getInstance();
            if (str == null) {
                str = "";
            }
            byte[] bArrDownloadRoute = companion.downloadRoute(str);
            if (bArrDownloadRoute != null) {
                if (!(bArrDownloadRoute.length == 0)) {
                    return bArrDownloadRoute;
                }
            }
            return null;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "getRouteFDSData", th);
            return null;
        }
    }

    @Nullable
    public final Object getTrackRawData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Pair<byte[], String>> continuation) {
        try {
            File file = new File(r72.o(), str2);
            byte[] file2 = FitnessFileUtils.INSTANCE.readFile(file);
            if (file2 != null) {
                if (!(file2.length == 0)) {
                    FitnessLogUtils.i(TAG, "getRouteFDSData: return local file data(" + str2 + ")-size(" + file2.length + ")");
                    return new Pair(file2, file.getAbsolutePath());
                }
            }
            FitnessFDSUploader companion = FitnessFDSUploader.INSTANCE.getInstance();
            if (str == null) {
                str = "";
            }
            byte[] bArrDownloadRoute = companion.downloadRoute(str);
            if (bArrDownloadRoute != null) {
                if (!(bArrDownloadRoute.length == 0)) {
                    FitnessLogUtils.i(TAG, "getRouteFDSData: download success(" + str2 + ")");
                    FitnessFileUtils.writeFile(file, bArrDownloadRoute);
                    return new Pair(bArrDownloadRoute, file.getAbsolutePath());
                }
            }
            return null;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "getRouteFDSData", th);
            return null;
        }
    }
}
