package com.xiaomi.fit.fitness.device.mi.parse.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.device.mi.parse.utils.MiParsedDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.data.AbnormalRecord;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.DaytimeSleepReport;
import com.xiaomi.fit.fitness.parser.data.DivingOutInPosition;
import com.xiaomi.fit.fitness.parser.data.DivingPosition;
import com.xiaomi.fit.fitness.parser.data.EcgMeasureResult;
import com.xiaomi.fit.fitness.parser.data.MeasureBloodPressure;
import com.xiaomi.fit.fitness.parser.data.MeasureData;
import com.xiaomi.fit.fitness.parser.data.MeasureTemperature;
import com.xiaomi.fit.fitness.parser.data.NightSleepReport;
import com.xiaomi.fit.fitness.parser.data.OneDivingIdReport;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyRecord;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyReport;
import com.xiaomi.fit.fitness.parser.data.WeightRecord;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtilKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.request.SportHttpRequest;
import defpackage.tjg;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J\u001e\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J\u001e\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020)J$\u0010*\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0 J$\u0010-\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 J$\u00100\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002010 J&\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u000204H\u0086@¢\u0006\u0002\u00105J(\u00106\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u00107\u001a\u0002082\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u000204H\u0002J(\u00109\u001a\u00020:2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u00107\u001a\u0002082\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u000204H\u0002J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u000208H\u0002J\u0018\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?2\u0006\u00103\u001a\u00020@H\u0002J\u0016\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020@J(\u0010D\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020@2\b\b\u0002\u0010E\u001a\u00020\u0016J&\u0010F\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020IJ\u001e\u0010J\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020@J\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010 2\u0006\u0010L\u001a\u00020?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013¨\u0006M"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/parse/utils/MiParsedDataRecorder;", "", "<init>", "()V", "TAG", "", "recorder", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getRecorder", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recorder$delegate", "Lkotlin/Lazy;", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getUserInfoMgr", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr$delegate", "mSleepLock", "getMSleepLock", "()Ljava/lang/Object;", "mSleepLock$delegate", "recordSportReport", "", "sid", "zoneOffsetInSec", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordDailyRecord", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dailyRecordList", "", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "recordDailyReport", "dailyReport", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "recordNightSleepReport", "sleepReport", "Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "recordDaytimeSleepReport", "Lcom/xiaomi/fit/fitness/parser/data/DaytimeSleepReport;", "recordMeasureData", "dataList", "Lcom/xiaomi/fit/fitness/parser/data/MeasureData;", "recordAbnormalRecords", "list", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "recordWeightRecords", "Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "recordSleepSegment", "sleepData", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordSleepAssistInfo", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "uploadSleepSrcData", "", "createSleepFileName", "report", "saveSleepData", "wakeUpTime", "", "", "saveTemperatureFile", "time", "data", "recordFDSData", "needUpload", "recordEcg", "srcData", "ecgResult", "Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "recordTemperatureCharacter", "getSymptomList", RealNameWebViewActivity.NUMBER, "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiParsedDataRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiParsedDataRecorder.kt\ncom/xiaomi/fit/fitness/device/mi/parse/utils/MiParsedDataRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,810:1\n1863#2,2:811\n37#3:813\n36#3,3:814\n37#3:817\n36#3,3:818\n37#3:821\n36#3,3:822\n37#3:825\n36#3,3:826\n37#3:829\n36#3,3:830\n37#3:833\n36#3,3:834\n37#3:837\n36#3,3:838\n37#3:841\n36#3,3:842\n37#3:845\n36#3,3:846\n37#3:849\n36#3,3:850\n37#3:853\n36#3,3:854\n37#3:857\n36#3,3:858\n37#3:861\n36#3,3:862\n37#3:865\n36#3,3:866\n37#3:869\n36#3,3:870\n37#3:873\n36#3,3:874\n37#3:877\n36#3,3:878\n37#3:881\n36#3,3:882\n37#3:885\n36#3,3:886\n37#3:889\n36#3,3:890\n37#3:893\n36#3,3:894\n37#3:897\n36#3,3:898\n*S KotlinDebug\n*F\n+ 1 MiParsedDataRecorder.kt\ncom/xiaomi/fit/fitness/device/mi/parse/utils/MiParsedDataRecorder\n*L\n141#1:811,2\n218#1:813\n218#1:814,3\n222#1:817\n222#1:818,3\n226#1:821\n226#1:822,3\n231#1:825\n231#1:826,3\n236#1:829\n236#1:830,3\n241#1:833\n241#1:834,3\n246#1:837\n246#1:838,3\n250#1:841\n250#1:842,3\n255#1:845\n255#1:846,3\n262#1:849\n262#1:850,3\n336#1:853\n336#1:854,3\n485#1:857\n485#1:858,3\n489#1:861\n489#1:862,3\n494#1:865\n494#1:866,3\n499#1:869\n499#1:870,3\n504#1:873\n504#1:874,3\n543#1:877\n543#1:878,3\n549#1:881\n549#1:882,3\n555#1:885\n555#1:886,3\n568#1:889\n568#1:890,3\n603#1:893\n603#1:894,3\n627#1:897\n627#1:898,3\n*E\n"})
public final class MiParsedDataRecorder {

    @NotNull
    private final String TAG = "MiParsedDataRecorder";

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lvf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiParsedDataRecorder.recorder_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: userInfoMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mvf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiParsedDataRecorder.userInfoMgr_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mSleepLock$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepLock = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nvf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiParsedDataRecorder.mSleepLock_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.parse.utils.MiParsedDataRecorder$recordSleepSegment$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.parse.utils.MiParsedDataRecorder", f = "MiParsedDataRecorder.kt", i = {0, 0, 0, 0}, l = {617}, m = "recordSleepSegment", n = {"this", "sid", "dataId", "sleepData"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return MiParsedDataRecorder.this.recordSleepSegment(null, null, null, this);
        }
    }

    private final String createSleepFileName(SleepSegmentReport report) {
        String dateStr = FitnessDateUtils.INSTANCE.getDateStr(report.getWakeupTime(), "yyyyMMddHHmm");
        StringBuilder sb = new StringBuilder();
        sb.append(dateStr);
        String str = null;
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getUserInfoMgr(), false, 1, null);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(userProfile$default.getSexOrDefault());
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(userProfile$default.getHeight());
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(userProfile$default.getWeight());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(userProfile$default.getBirthOrDefault());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            if (date != null) {
                str = simpleDateFormat.format(date);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "birth format", e);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            sb.append(str);
        }
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(report.getMinHr() != null ? report.getMinHr() : 0);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(report.getMaxHr() != null ? report.getMaxHr() : 0);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(report.getAvgHr() != null ? report.getAvgHr() : 0);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final Object getMSleepLock() {
        return this.mSleepLock.getValue();
    }

    private final FitnessDataRecorder getRecorder() {
        return (FitnessDataRecorder) this.recorder.getValue();
    }

    private final List<Integer> getSymptomList(long number) {
        ArrayList arrayList = new ArrayList();
        if (number == 0) {
            return null;
        }
        for (int i = 0; i < 16; i++) {
            if (((1 << i) & number) != 0) {
                ListExtKt.add(arrayList, Integer.valueOf(i + 1));
            }
        }
        if ((number & 2147483648L) != 0) {
            ListExtKt.add(arrayList, 17);
        }
        return arrayList;
    }

    private final UserInfoManager getUserInfoMgr() {
        return (UserInfoManager) this.userInfoMgr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mSleepLock_delegate$lambda$2() {
        return new Object();
    }

    public static /* synthetic */ boolean recordFDSData$default(MiParsedDataRecorder miParsedDataRecorder, String str, FitnessDataId fitnessDataId, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return miParsedDataRecorder.recordFDSData(str, fitnessDataId, bArr, z);
    }

    private final boolean recordSleepAssistInfo(String sid, SleepSegmentReport segmentReport, FitnessDataId dataId, AllDaySleepParseData sleepData) {
        if (sleepData.getAssistInfoBytes() == null || !segmentReport.hasStageData()) {
            FitnessLogUtils.i(this.TAG, "not need upload sleep assist info");
            return true;
        }
        FitnessDataId fitnessDataIdBuild = dataId.copy().timeStampInSec(segmentReport.getWakeupTime()).fileType(0).build();
        byte[] assistInfoBytes = sleepData.getAssistInfoBytes();
        Intrinsics.checkNotNull(assistInfoBytes);
        byte[] sleepSrcBytes = sleepData.getSleepSrcBytes();
        Integer avgBreathRate = segmentReport.getAvgBreathRate();
        boolean z = avgBreathRate != null && avgBreathRate.intValue() > 0;
        FitnessLogUtils.i(this.TAG, "recordSleepAssistInfo check srcBytes; avg is " + segmentReport.getAvgBreathRate() + ";src length " + sleepData.getSleepSrcDataLen());
        if (z && sleepData.getSleepSrcDataLen() > 0 && sleepSrcBytes != null) {
            assistInfoBytes = ArraysKt___ArraysJvmKt.plus(assistInfoBytes, sleepSrcBytes);
        }
        return recordFDSData(sid, fitnessDataIdBuild, assistInfoBytes, sleepData.getIsSleepFinish());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordSportReport$lambda$3(SportBasicReport sportReport, MiParsedDataRecorder this$0, String sid, int i, OneDivingIdReport it) {
        Intrinsics.checkNotNullParameter(sportReport, "$sportReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sid, "$sid");
        Intrinsics.checkNotNullParameter(it, "it");
        sportReport.setDivingAreaId(Integer.valueOf(it.getDiveAreaId()));
        sportReport.setDivingCountryId(Integer.valueOf(it.getDiveCountryId()));
        Logger.i("SportHttpRequest", "divingAreaId " + it.getDiveAreaId() + "  divingCountryId  " + it.getDiveCountryId());
        sportReport.setRequestDivingId(Boolean.TRUE);
        this$0.getRecorder().recordSportReport(sid, i, sportReport);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordSportReport$lambda$4(SportBasicReport sportReport, MiParsedDataRecorder this$0, String sid, int i, String it) {
        Intrinsics.checkNotNullParameter(sportReport, "$sportReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sid, "$sid");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("SportHttpRequest", "error " + it);
        sportReport.setRequestDivingId(Boolean.TRUE);
        this$0.getRecorder().recordSportReport(sid, i, sportReport);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder recorder_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    private final void saveSleepData(long wakeUpTime, byte[] sleepData) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("sleep_algo");
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        File file = new File(absolutePath, FitnessDateUtils.getDateStr(wakeUpTime) + "_mi_sleep");
        if (file.exists()) {
            file.delete();
        }
        FileUtils.INSTANCE.writeFile(file, new ByteArrayInputStream(sleepData));
    }

    private final void uploadSleepSrcData(String sid, SleepSegmentReport segmentReport, FitnessDataId dataId, AllDaySleepParseData sleepData) {
        if (!sleepData.getIsSleepFinish()) {
            FitnessLogUtils.w(this.TAG, "not complete sleep, and not upload src data");
            return;
        }
        if (sleepData.getSleepSrcBytes() == null) {
            FitnessLogUtils.w(this.TAG, "sleep src data is empty");
            return;
        }
        FitnessDataId fitnessDataIdBuild = dataId.copy().timeStampInSec(segmentReport.getWakeupTime()).fileType(2).build();
        String strCreateSleepFileName = createSleepFileName(segmentReport);
        FitnessDataRecorder recorder = getRecorder();
        byte[] sleepSrcBytes = sleepData.getSleepSrcBytes();
        Intrinsics.checkNotNull(sleepSrcBytes);
        recorder.uploadSleepSrcData(sid, fitnessDataIdBuild, strCreateSleepFileName, sleepSrcBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoManager userInfoMgr_delegate$lambda$1() {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    }

    public final boolean recordAbnormalRecords(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull List<AbnormalRecord> list) {
        boolean zRecordAbnormalSpo2;
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(list, "list");
        FitnessLogUtils.i(this.TAG, "recordAbnormalRecords: sid = " + sid + ", dataId = [" + dataId + "], list = " + list);
        if (list.isEmpty() || sid.length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (AbnormalRecord abnormalRecord : list) {
            int abnormalType = abnormalRecord.getAbnormalType();
            DailyRecordItem dailyRecordItemConvertToAbnormalItem = ParserExtKt.convertToAbnormalItem(abnormalRecord);
            if (dailyRecordItemConvertToAbnormalItem != null) {
                if (abnormalType == 1) {
                    arrayList.add((SegmentItem) dailyRecordItemConvertToAbnormalItem);
                } else if (abnormalType == 2) {
                    arrayList2.add((SegmentItem) dailyRecordItemConvertToAbnormalItem);
                } else if (abnormalType == 3) {
                    arrayList3.add((SegmentItem) dailyRecordItemConvertToAbnormalItem);
                } else if (abnormalType == 4) {
                    arrayList4.add((SegmentItem) dailyRecordItemConvertToAbnormalItem);
                } else if (abnormalType != 5) {
                    FitnessLogUtils.e(this.TAG, "unknown type:" + abnormalType);
                } else {
                    arrayList5.add((AbnormalFibItem) dailyRecordItemConvertToAbnormalItem);
                }
            }
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        if (!arrayList2.isEmpty()) {
            FitnessDataRecorder recorder = getRecorder();
            SegmentItem[] segmentItemArr = (SegmentItem[]) arrayList2.toArray(new SegmentItem[0]);
            zRecordAbnormalSpo2 = recorder.recordAbnormalHrLow(sid, tzOffsetInSec, (SegmentItem[]) Arrays.copyOf(segmentItemArr, segmentItemArr.length)) & true;
        } else {
            zRecordAbnormalSpo2 = true;
        }
        if (!arrayList.isEmpty()) {
            FitnessDataRecorder recorder2 = getRecorder();
            SegmentItem[] segmentItemArr2 = (SegmentItem[]) arrayList.toArray(new SegmentItem[0]);
            zRecordAbnormalSpo2 &= recorder2.recordAbnormalHrHigh(sid, tzOffsetInSec, (SegmentItem[]) Arrays.copyOf(segmentItemArr2, segmentItemArr2.length));
        }
        if (!arrayList3.isEmpty()) {
            FitnessDataRecorder recorder3 = getRecorder();
            SegmentItem[] segmentItemArr3 = (SegmentItem[]) arrayList3.toArray(new SegmentItem[0]);
            zRecordAbnormalSpo2 &= recorder3.recordAbnormalSpo2(sid, tzOffsetInSec, (SegmentItem[]) Arrays.copyOf(segmentItemArr3, segmentItemArr3.length));
        }
        if (!(!arrayList5.isEmpty())) {
            return zRecordAbnormalSpo2;
        }
        FitnessDataRecorder recorder4 = getRecorder();
        AbnormalFibItem[] abnormalFibItemArr = (AbnormalFibItem[]) arrayList5.toArray(new AbnormalFibItem[0]);
        return zRecordAbnormalSpo2 & recorder4.recordAbnormalFib(sid, tzOffsetInSec, (AbnormalFibItem[]) Arrays.copyOf(abnormalFibItemArr, abnormalFibItemArr.length));
    }

    public final boolean recordDailyRecord(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull List<ParsedDailyRecord> dailyRecordList) {
        String str;
        int i;
        boolean zRecordDailyLightValue;
        Iterator it;
        int i2;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        int iIntValue;
        int iIntValue2;
        float fIntValue;
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dailyRecordList, "dailyRecordList");
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(dataId.getTimeStamp(), tzOffsetInSec) + FitnessDateUtils.INSTANCE.getSECONDS_ONE_DAY();
        Iterator it2 = dailyRecordList.iterator();
        while (it2.hasNext()) {
            ParsedDailyRecord parsedDailyRecord = (ParsedDailyRecord) it2.next();
            if (parsedDailyRecord.getTime() >= jChangeZeroOfTheDay) {
                it = it2;
                String str2 = this.TAG;
                j = jChangeZeroOfTheDay;
                long time = parsedDailyRecord.getTime();
                i2 = tzOffsetInSec;
                long timeStamp = dataId.getTimeStamp();
                StringBuilder sb = new StringBuilder();
                arrayList = arrayList12;
                sb.append("recordDailyRecord: (");
                sb.append(time);
                sb.append(")over this day(");
                sb.append(timeStamp);
                sb.append(")");
                FitnessLogUtils.i(str2, sb.toString());
            } else {
                it = it2;
                i2 = tzOffsetInSec;
                arrayList = arrayList12;
                j = jChangeZeroOfTheDay;
                if (parsedDailyRecord.getSteps() != null) {
                    Integer steps = parsedDailyRecord.getSteps();
                    Intrinsics.checkNotNull(steps);
                    if (steps.intValue() > 0) {
                        long time2 = parsedDailyRecord.getTime();
                        Integer steps2 = parsedDailyRecord.getSteps();
                        Intrinsics.checkNotNull(steps2);
                        int iIntValue3 = steps2.intValue();
                        if (parsedDailyRecord.getDistance() == null) {
                            iIntValue2 = 0;
                        } else {
                            Integer distance = parsedDailyRecord.getDistance();
                            Intrinsics.checkNotNull(distance);
                            iIntValue2 = distance.intValue();
                        }
                        if (parsedDailyRecord.getCalories() == null) {
                            fIntValue = 0.0f;
                        } else {
                            Integer calories = parsedDailyRecord.getCalories();
                            Intrinsics.checkNotNull(calories);
                            fIntValue = calories.intValue();
                        }
                        arrayList3.add(new StepItem(time2, iIntValue3, iIntValue2, fIntValue));
                    }
                }
                if (parsedDailyRecord.getCalories() != null) {
                    Integer calories2 = parsedDailyRecord.getCalories();
                    Intrinsics.checkNotNull(calories2);
                    if (calories2.intValue() > 0) {
                        long time3 = parsedDailyRecord.getTime();
                        Integer calories3 = parsedDailyRecord.getCalories();
                        Intrinsics.checkNotNull(calories3);
                        arrayList4.add(new CaloriesItem(time3, calories3.intValue()));
                    }
                }
                if (parsedDailyRecord.getHr() != null) {
                    Integer hr = parsedDailyRecord.getHr();
                    Intrinsics.checkNotNull(hr);
                    if (hr.intValue() > 0) {
                        long time4 = parsedDailyRecord.getTime();
                        Integer hr2 = parsedDailyRecord.getHr();
                        Intrinsics.checkNotNull(hr2);
                        HrItem hrItem = new HrItem(time4, hr2.intValue());
                        Integer activityType = parsedDailyRecord.getActivityType();
                        if (activityType != null && activityType.intValue() == 2 && parsedDailyRecord.getActivityHILevel() != null) {
                            Integer activityHILevel = parsedDailyRecord.getActivityHILevel();
                            Intrinsics.checkNotNull(activityHILevel);
                            if (activityHILevel.intValue() >= 2) {
                                Integer activityHILevel2 = parsedDailyRecord.getActivityHILevel();
                                Intrinsics.checkNotNull(activityHILevel2);
                                if (activityHILevel2.intValue() <= 3) {
                                    hrItem.setHrType(1);
                                }
                            }
                        }
                        arrayList5.add(hrItem);
                        if (parsedDailyRecord.getIsAbnormalHr() != null) {
                            Boolean isAbnormalHr = parsedDailyRecord.getIsAbnormalHr();
                            Intrinsics.checkNotNull(isAbnormalHr);
                            if (isAbnormalHr.booleanValue()) {
                                if (parsedDailyRecord.getHrPreAbnormal() != null) {
                                    Integer hrPreAbnormal = parsedDailyRecord.getHrPreAbnormal();
                                    Intrinsics.checkNotNull(hrPreAbnormal);
                                    iIntValue = hrPreAbnormal.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                long time5 = parsedDailyRecord.getTime();
                                Integer hr3 = parsedDailyRecord.getHr();
                                Intrinsics.checkNotNull(hr3);
                                arrayList6.add(new AbnormalHrItem(time5, hr3.intValue(), Integer.valueOf(iIntValue)));
                            }
                        }
                        if (parsedDailyRecord.getEnergy() != null) {
                            Integer energy = parsedDailyRecord.getEnergy();
                            Intrinsics.checkNotNull(energy);
                            if (energy.intValue() > 0) {
                                Integer energy2 = parsedDailyRecord.getEnergy();
                                Intrinsics.checkNotNull(energy2);
                                if (energy2.intValue() <= 100) {
                                    long time6 = parsedDailyRecord.getTime();
                                    Integer energy3 = parsedDailyRecord.getEnergy();
                                    Intrinsics.checkNotNull(energy3);
                                    EnergyItem energyItem = new EnergyItem(time6, energy3.intValue());
                                    if (parsedDailyRecord.getEnergyState() != null) {
                                        Integer energyState = parsedDailyRecord.getEnergyState();
                                        Intrinsics.checkNotNull(energyState);
                                        if (energyState.intValue() > 0 && parsedDailyRecord.getEnergyStateValue() != null) {
                                            Integer energyState2 = parsedDailyRecord.getEnergyState();
                                            Intrinsics.checkNotNull(energyState2);
                                            energyItem.setState(energyState2);
                                            Integer energyStateValue = parsedDailyRecord.getEnergyStateValue();
                                            Intrinsics.checkNotNull(energyStateValue);
                                            energyItem.setStateValue(energyStateValue);
                                        }
                                    }
                                    arrayList8.add(energyItem);
                                }
                            }
                        }
                    }
                }
                if (parsedDailyRecord.getActivityHILevel() != null) {
                    Integer activityHILevel3 = parsedDailyRecord.getActivityHILevel();
                    Intrinsics.checkNotNull(activityHILevel3);
                    if (activityHILevel3.intValue() >= 3) {
                        Integer activityHILevel4 = parsedDailyRecord.getActivityHILevel();
                        Intrinsics.checkNotNull(activityHILevel4);
                        if (activityHILevel4.intValue() <= 5) {
                            arrayList7.add(new MHStrengthItem(parsedDailyRecord.getTime()));
                        }
                    }
                }
                if (parsedDailyRecord.getSpo2() != null) {
                    Integer spo2 = parsedDailyRecord.getSpo2();
                    Intrinsics.checkNotNull(spo2);
                    if (spo2.intValue() > 0) {
                        Integer spo3 = parsedDailyRecord.getSpo2();
                        Intrinsics.checkNotNull(spo3);
                        if (spo3.intValue() <= 100) {
                            long time7 = parsedDailyRecord.getTime();
                            Integer spo4 = parsedDailyRecord.getSpo2();
                            Intrinsics.checkNotNull(spo4);
                            arrayList10.add(new Spo2Item(time7, spo4.intValue()));
                        }
                    }
                }
                if (parsedDailyRecord.getStress() != null) {
                    Integer stress = parsedDailyRecord.getStress();
                    Intrinsics.checkNotNull(stress);
                    if (stress.intValue() > 0) {
                        Integer stress2 = parsedDailyRecord.getStress();
                        Intrinsics.checkNotNull(stress2);
                        if (stress2.intValue() <= 100) {
                            long time8 = parsedDailyRecord.getTime();
                            Integer stress3 = parsedDailyRecord.getStress();
                            Intrinsics.checkNotNull(stress3);
                            arrayList9.add(new StressItem(time8, stress3.intValue()));
                        }
                    }
                }
                if (parsedDailyRecord.getLightValue() != null) {
                    Integer lightValue = parsedDailyRecord.getLightValue();
                    Intrinsics.checkNotNull(lightValue);
                    if (lightValue.intValue() != 65535) {
                        long time9 = parsedDailyRecord.getTime();
                        Integer lightValue2 = parsedDailyRecord.getLightValue();
                        Intrinsics.checkNotNull(lightValue2);
                        arrayList11.add(new LightValueItem(time9, lightValue2.intValue()));
                    }
                }
                if (parsedDailyRecord.getBodyMomentum() != null) {
                    Integer bodyMomentum = parsedDailyRecord.getBodyMomentum();
                    Intrinsics.checkNotNull(bodyMomentum);
                    if (bodyMomentum.intValue() != 65535) {
                        long time10 = parsedDailyRecord.getTime();
                        Integer bodyMomentum2 = parsedDailyRecord.getBodyMomentum();
                        Intrinsics.checkNotNull(bodyMomentum2);
                        body bodyVar = new body(time10, bodyMomentum2.intValue());
                        arrayList2 = arrayList;
                        arrayList2.add(bodyVar);
                    }
                }
                arrayList12 = arrayList2;
                it2 = it;
                jChangeZeroOfTheDay = j;
                tzOffsetInSec = i2;
            }
            arrayList2 = arrayList;
            arrayList12 = arrayList2;
            it2 = it;
            jChangeZeroOfTheDay = j;
            tzOffsetInSec = i2;
        }
        int i3 = tzOffsetInSec;
        ArrayList arrayList13 = arrayList12;
        if (!arrayList3.isEmpty()) {
            FitnessDataRecorder recorder = getRecorder();
            StepItem[] stepItemArr = (StepItem[]) arrayList3.toArray(new StepItem[0]);
            str = sid;
            i = i3;
            zRecordDailyLightValue = recorder.recordStep(str, i, (StepItem[]) Arrays.copyOf(stepItemArr, stepItemArr.length)) & true;
        } else {
            str = sid;
            i = i3;
            zRecordDailyLightValue = true;
        }
        if (!arrayList4.isEmpty()) {
            FitnessDataRecorder recorder2 = getRecorder();
            CaloriesItem[] caloriesItemArr = (CaloriesItem[]) arrayList4.toArray(new CaloriesItem[0]);
            zRecordDailyLightValue &= recorder2.recordCalorie(str, i, (CaloriesItem[]) Arrays.copyOf(caloriesItemArr, caloriesItemArr.length));
        }
        if (!arrayList5.isEmpty()) {
            FitnessDataRecorder recorder3 = getRecorder();
            HrItem[] hrItemArr = (HrItem[]) arrayList5.toArray(new HrItem[0]);
            zRecordDailyLightValue &= recorder3.recordDailyHr(str, i, (HrItem[]) Arrays.copyOf(hrItemArr, hrItemArr.length));
        }
        if (!arrayList6.isEmpty()) {
            FitnessDataRecorder recorder4 = getRecorder();
            AbnormalHrItem[] abnormalHrItemArr = (AbnormalHrItem[]) arrayList6.toArray(new AbnormalHrItem[0]);
            zRecordDailyLightValue &= recorder4.recordAbnormalHr(str, i, (AbnormalHrItem[]) Arrays.copyOf(abnormalHrItemArr, abnormalHrItemArr.length));
        }
        if (!arrayList7.isEmpty()) {
            FitnessDataRecorder recorder5 = getRecorder();
            MHStrengthItem[] mHStrengthItemArr = (MHStrengthItem[]) arrayList7.toArray(new MHStrengthItem[0]);
            zRecordDailyLightValue &= recorder5.recordMHStrength(str, i, (MHStrengthItem[]) Arrays.copyOf(mHStrengthItemArr, mHStrengthItemArr.length));
        }
        if (!arrayList8.isEmpty()) {
            FitnessDataRecorder recorder6 = getRecorder();
            EnergyItem[] energyItemArr = (EnergyItem[]) arrayList8.toArray(new EnergyItem[0]);
            zRecordDailyLightValue &= recorder6.recordDailyEnergy(str, i, (EnergyItem[]) Arrays.copyOf(energyItemArr, energyItemArr.length));
        }
        if (!arrayList9.isEmpty()) {
            FitnessDataRecorder recorder7 = getRecorder();
            StressItem[] stressItemArr = (StressItem[]) arrayList9.toArray(new StressItem[0]);
            zRecordDailyLightValue &= recorder7.recordDailyStress(str, i, (StressItem[]) Arrays.copyOf(stressItemArr, stressItemArr.length));
        }
        if (!arrayList10.isEmpty()) {
            FitnessDataRecorder recorder8 = getRecorder();
            Spo2Item[] spo2ItemArr = (Spo2Item[]) arrayList10.toArray(new Spo2Item[0]);
            zRecordDailyLightValue &= recorder8.recordDailySpo2(str, i, (Spo2Item[]) Arrays.copyOf(spo2ItemArr, spo2ItemArr.length));
        }
        if (!arrayList11.isEmpty()) {
            FitnessDataRecorder recorder9 = getRecorder();
            LightValueItem[] lightValueItemArr = (LightValueItem[]) arrayList11.toArray(new LightValueItem[0]);
            zRecordDailyLightValue &= recorder9.recordDailyLightValue(str, i, (LightValueItem[]) Arrays.copyOf(lightValueItemArr, lightValueItemArr.length));
        }
        if (!(!arrayList13.isEmpty())) {
            return zRecordDailyLightValue;
        }
        FitnessDataRecorder recorder10 = getRecorder();
        body[] bodyVarArr = (body[]) arrayList13.toArray(new body[0]);
        return zRecordDailyLightValue & recorder10.recordDailyBodyMomentum(str, i, (body[]) Arrays.copyOf(bodyVarArr, bodyVarArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x005e  */
    public final boolean recordDailyReport(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull ParsedDailyReport dailyReport) {
        boolean zRecordVitalityItem;
        int i;
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dailyReport, "dailyReport");
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(dailyReport.getTime(), dailyReport.getZoneOffsetInSec());
        dataId.getTzIn15Min();
        if (dailyReport.getRestHr() != null) {
            Integer restHr = dailyReport.getRestHr();
            Intrinsics.checkNotNull(restHr);
            if (restHr.intValue() > 0) {
                long time = dailyReport.getTime();
                Integer restHr2 = dailyReport.getRestHr();
                Intrinsics.checkNotNull(restHr2);
                zRecordVitalityItem = getRecorder().recordRestHr(sid, tzOffsetInSec, new RestHrItem(time, restHr2.intValue())) & true;
            } else {
                zRecordVitalityItem = true;
            }
        } else {
            zRecordVitalityItem = true;
        }
        if (dailyReport.getValidStand() != null) {
            byte[] validStand = dailyReport.getValidStand();
            Intrinsics.checkNotNull(validStand);
            if (validStand.length == 3) {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (int i3 = 3; i2 < i3; i3 = 3) {
                    byte[] validStand2 = dailyReport.getValidStand();
                    Intrinsics.checkNotNull(validStand2);
                    byte b2 = validStand2[i2];
                    for (int i4 = 0; i4 < 8; i4++) {
                        if (ByteUtilKt.and(b2, 1 << i4) > 0) {
                            long j = ((long) (((i2 * 8) + i4) * 3600)) + jChangeZeroOfTheDay;
                            arrayList.add(new ValidStandItem(j, ((long) 3600) + j));
                        }
                    }
                    i2++;
                }
                if (true ^ arrayList.isEmpty()) {
                    FitnessDataRecorder recorder = getRecorder();
                    i = 0;
                    ValidStandItem[] validStandItemArr = (ValidStandItem[]) arrayList.toArray(new ValidStandItem[0]);
                    zRecordVitalityItem &= recorder.recordValidStand(sid, tzOffsetInSec, (ValidStandItem[]) Arrays.copyOf(validStandItemArr, validStandItemArr.length));
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (dailyReport.getWeekTrainingLoad() != null) {
            Integer weekTrainingLoad = dailyReport.getWeekTrainingLoad();
            Intrinsics.checkNotNull(weekTrainingLoad);
            if (weekTrainingLoad.intValue() > 0) {
                Integer weekTrainingLoad2 = dailyReport.getWeekTrainingLoad();
                Intrinsics.checkNotNull(weekTrainingLoad2);
                TrainingLoadItem trainingLoadItem = new TrainingLoadItem(jChangeZeroOfTheDay, weekTrainingLoad2.intValue());
                trainingLoadItem.setCurrentDayTL(dailyReport.getDayTrainingLoad());
                trainingLoadItem.setTlLevel(dailyReport.getTrainingLoadLevel());
                zRecordVitalityItem &= getRecorder().recordTrainingLoad(sid, tzOffsetInSec, trainingLoadItem);
            }
        }
        if (dailyReport.getTotal7daysVitality() != null) {
            Integer total7daysVitality = dailyReport.getTotal7daysVitality();
            Intrinsics.checkNotNull(total7daysVitality);
            if (total7daysVitality.intValue() > 0) {
                Integer dayLowIntensityVitality = dailyReport.getDayLowIntensityVitality();
                int iIntValue = dayLowIntensityVitality != null ? dayLowIntensityVitality.intValue() : i;
                Integer dayMediumIntensityVitality = dailyReport.getDayMediumIntensityVitality();
                int iIntValue2 = dayMediumIntensityVitality != null ? dayMediumIntensityVitality.intValue() : i;
                Integer dayHighIntensityVitality = dailyReport.getDayHighIntensityVitality();
                int iIntValue3 = dayHighIntensityVitality != null ? dayHighIntensityVitality.intValue() : i;
                Integer total7daysVitality2 = dailyReport.getTotal7daysVitality();
                zRecordVitalityItem &= getRecorder().recordVitalityItem(sid, tzOffsetInSec, new VitalityItem(jChangeZeroOfTheDay, iIntValue, iIntValue2, iIntValue3, total7daysVitality2 != null ? total7daysVitality2.intValue() : i, dailyReport.getSuggestActivityType(), dailyReport.getSuggestActivityDuration()));
            }
        }
        if (dailyReport.getPhysicalFitnessStatus() != null) {
            return zRecordVitalityItem & getRecorder().recordPhysicalStatus(sid, tzOffsetInSec, new PhysicalStatusItem(jChangeZeroOfTheDay, dailyReport.getPhysicalStatusStress(), dailyReport.getPhysicalFitnessLevel(), dailyReport.getFatigueLevel(), dailyReport.getPhysicalFitnessStatus()));
        }
        return zRecordVitalityItem;
    }

    public final boolean recordDaytimeSleepReport(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull DaytimeSleepReport sleepReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        List<SleepStateItem> sleepItems = sleepReport.getSleepItems();
        if (sleepItems == null || sleepItems.isEmpty()) {
            return true;
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        DayNightSleepReport dayNightSleepReport = new DayNightSleepReport(dataId.getTimeStamp(), sleepReport.getTzIn15Min());
        dayNightSleepReport.setSleepDuration(sleepReport.getSleepDuration());
        dayNightSleepReport.setSleepItems(sleepReport.getSleepItems());
        return getRecorder().recordDaytimeSleep(sid, tzOffsetInSec, dayNightSleepReport);
    }

    public final boolean recordEcg(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] srcData, @NotNull EcgMeasureResult ecgResult) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        Intrinsics.checkNotNullParameter(ecgResult, "ecgResult");
        if (ecgResult.isInvalid()) {
            FitnessLogUtils.w(this.TAG, "recordEcg： invalid(" + ecgResult + ")");
            return false;
        }
        EcgMedicalItemReport ecgMedicalItemReport = new EcgMedicalItemReport(dataId);
        ecgMedicalItemReport.setMeasureTime(ecgResult.getStartMeasureTime());
        ecgMedicalItemReport.setMeasureDuration(ecgResult.getMeasureDuration());
        ecgMedicalItemReport.setSampleFrequency(ecgResult.getSampleFrequency());
        ecgMedicalItemReport.setAvgHr(ecgResult.getAvgHr());
        Long symptomValue = ecgResult.getSymptomValue();
        ecgMedicalItemReport.setSymptomList(getSymptomList(symptomValue != null ? symptomValue.longValue() : 0L));
        ecgMedicalItemReport.setDataSource(Integer.valueOf(ecgResult.getDataSource()));
        ecgMedicalItemReport.setAnalysisResult(ecgResult.getAnalysisResult());
        getRecorder().recordEcgItemReport(sid, dataId.getTzOffsetInSec(), ecgMedicalItemReport);
        recordFDSData(sid, dataId, srcData, true);
        ecgMedicalItemReport.setSid(sid);
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).notifyNewEcgRecordToUser(ecgMedicalItemReport);
        return true;
    }

    public final boolean recordFDSData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] data, boolean needUpload) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        FitnessLogUtils.i(this.TAG, "recordFDSData:(" + dataId + ") - needUpload = " + needUpload);
        if (needUpload) {
            return getRecorder().recordFDSData(sid, dataId, data);
        }
        FitnessFileUtils.writeFile(FitnessFileUtils.getFDSDataFile(ApplicationExtKt.getApplication(), sid, dataId), data);
        return true;
    }

    public final boolean recordMeasureData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull List<MeasureData> dataList) {
        boolean zRecordTemperatureItem;
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (MeasureData measureData : dataList) {
            Object value = measureData.getValue();
            int type = measureData.getType();
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type == 5 && (value instanceof MeasureBloodPressure)) {
                                MeasureBloodPressure measureBloodPressure = (MeasureBloodPressure) value;
                                BloodPressureItem bloodPressureItem = new BloodPressureItem(measureData.getTime(), measureBloodPressure.getHighPressure(), measureBloodPressure.getLowPressure());
                                bloodPressureItem.setPulse(measureBloodPressure.getPulse() > 0 ? Integer.valueOf(measureBloodPressure.getPulse()) : null);
                                bloodPressureItem.setMeasurementStatus(Integer.valueOf(measureBloodPressure.getMeasurementStatus()));
                                arrayList5.add(bloodPressureItem);
                            }
                        } else if (value instanceof MeasureTemperature) {
                            MeasureTemperature measureTemperature = (MeasureTemperature) value;
                            if (measureTemperature.getBodyTemp() != null || measureTemperature.getSkinTemp() != null) {
                                arrayList4.add(new TemperatureItem(measureData.getTime(), measureTemperature.getSkinTemp(), measureTemperature.getBodyTemp()));
                            }
                        }
                    } else if (value instanceof Integer) {
                        Number number = (Number) value;
                        if (number.intValue() > 0) {
                            arrayList3.add(new StressItem(measureData.getTime(), number.intValue()));
                        }
                    }
                } else if (value instanceof Integer) {
                    Number number2 = (Number) value;
                    if (number2.intValue() > 0) {
                        arrayList2.add(new Spo2Item(measureData.getTime(), number2.intValue()));
                    }
                }
            } else if (value instanceof Integer) {
                Number number3 = (Number) value;
                if (number3.intValue() > 0) {
                    arrayList.add(new HrItem(measureData.getTime(), number3.intValue()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            FitnessDataRecorder recorder = getRecorder();
            HrItem[] hrItemArr = (HrItem[]) arrayList.toArray(new HrItem[0]);
            zRecordTemperatureItem = recorder.recordManualHr(sid, tzOffsetInSec, (HrItem[]) Arrays.copyOf(hrItemArr, hrItemArr.length)) & true;
        } else {
            zRecordTemperatureItem = true;
        }
        if (!arrayList2.isEmpty()) {
            FitnessDataRecorder recorder2 = getRecorder();
            Spo2Item[] spo2ItemArr = (Spo2Item[]) arrayList2.toArray(new Spo2Item[0]);
            zRecordTemperatureItem &= recorder2.recordManualSpo2(sid, tzOffsetInSec, (Spo2Item[]) Arrays.copyOf(spo2ItemArr, spo2ItemArr.length));
        }
        if (!arrayList3.isEmpty()) {
            FitnessDataRecorder recorder3 = getRecorder();
            StressItem[] stressItemArr = (StressItem[]) arrayList3.toArray(new StressItem[0]);
            zRecordTemperatureItem &= recorder3.recordManualStress(sid, tzOffsetInSec, (StressItem[]) Arrays.copyOf(stressItemArr, stressItemArr.length));
        }
        if (!arrayList4.isEmpty()) {
            FitnessDataRecorder recorder4 = getRecorder();
            TemperatureItem[] temperatureItemArr = (TemperatureItem[]) arrayList4.toArray(new TemperatureItem[0]);
            zRecordTemperatureItem &= recorder4.recordTemperatureItem(sid, tzOffsetInSec, (TemperatureItem[]) Arrays.copyOf(temperatureItemArr, temperatureItemArr.length));
        }
        if (!(!arrayList5.isEmpty())) {
            return zRecordTemperatureItem;
        }
        FitnessDataRecorder recorder5 = getRecorder();
        BloodPressureItem[] bloodPressureItemArr = (BloodPressureItem[]) arrayList5.toArray(new BloodPressureItem[0]);
        return zRecordTemperatureItem & recorder5.recordBloodPressure(sid, tzOffsetInSec, (BloodPressureItem[]) Arrays.copyOf(bloodPressureItemArr, bloodPressureItemArr.length));
    }

    public final boolean recordNightSleepReport(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull NightSleepReport sleepReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        if (sleepReport.getSleepDuration() <= 0 || sleepReport.getBedTime() <= 0 || sleepReport.getWakeUpTime() <= 0) {
            return true;
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        DayNightSleepReport dayNightSleepReport = new DayNightSleepReport(dataId.getTimeStamp(), sleepReport.getTzIn15Min());
        dayNightSleepReport.setSleepDuration(sleepReport.getSleepDuration());
        dayNightSleepReport.setBedTime(sleepReport.getBedTime());
        dayNightSleepReport.setWakeUpTime(sleepReport.getWakeUpTime());
        dayNightSleepReport.setSleepItems(sleepReport.getSleepItems());
        dayNightSleepReport.setDeepDuration(sleepReport.getDeepDuration());
        dayNightSleepReport.setLightDuration(sleepReport.getLightDuration());
        dayNightSleepReport.setRemDuration(sleepReport.getRemDuration());
        dayNightSleepReport.setAwakeDuration(sleepReport.getAwakeDuration());
        dayNightSleepReport.setAwakeCount(sleepReport.getAwakeCount());
        dayNightSleepReport.setTotalScore(sleepReport.getTotalScore());
        dayNightSleepReport.setFriendlyTotalScore(sleepReport.getFriendlyTotalScore());
        dayNightSleepReport.setQualityScore(sleepReport.getQualityScore());
        dayNightSleepReport.setDurationScore(sleepReport.getDurationScore());
        dayNightSleepReport.setSleepSummary(sleepReport.getSleepSummary());
        dayNightSleepReport.setSleepAdvice(sleepReport.getSleepAdvice());
        dayNightSleepReport.setRecoveryScore(sleepReport.getRecoveryScore());
        dayNightSleepReport.setNervousScore(sleepReport.getNervousScore());
        return getRecorder().recordNightSleep(sid, tzOffsetInSec, dayNightSleepReport);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object recordSleepSegment(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull AllDaySleepParseData allDaySleepParseData, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        MiParsedDataRecorder miParsedDataRecorder;
        long jLongValue;
        boolean zRecordSleepSegment;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objComputeSleepSegmentReport = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objComputeSleepSegmentReport);
            if (AppUtil.INSTANCE.isDevChannel() && allDaySleepParseData.getSleepSrcBytes() != null) {
                FitnessLogUtils.i(this.TAG, "save sleep src data");
                if (allDaySleepParseData.getDeviceWakeupTime() == null) {
                    jLongValue = 0;
                } else {
                    Long deviceWakeupTime = allDaySleepParseData.getDeviceWakeupTime();
                    Intrinsics.checkNotNull(deviceWakeupTime);
                    jLongValue = deviceWakeupTime.longValue();
                }
                byte[] sleepSrcBytes = allDaySleepParseData.getSleepSrcBytes();
                Intrinsics.checkNotNull(sleepSrcBytes);
                saveSleepData(jLongValue, sleepSrcBytes);
            }
            SleepSegmentUtils sleepSegmentUtils = SleepSegmentUtils.INSTANCE;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = fitnessDataId;
            anonymousClass1.L$3 = allDaySleepParseData;
            anonymousClass1.label = 1;
            objComputeSleepSegmentReport = sleepSegmentUtils.computeSleepSegmentReport(fitnessDataId, allDaySleepParseData, anonymousClass1);
            if (objComputeSleepSegmentReport == coroutine_suspended) {
                return coroutine_suspended;
            }
            miParsedDataRecorder = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            allDaySleepParseData = (AllDaySleepParseData) anonymousClass1.L$3;
            fitnessDataId = (FitnessDataId) anonymousClass1.L$2;
            str = (String) anonymousClass1.L$1;
            miParsedDataRecorder = (MiParsedDataRecorder) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objComputeSleepSegmentReport);
        }
        List list = (List) objComputeSleepSegmentReport;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(miParsedDataRecorder.TAG, "sleep segment parse failed");
            return Boxing.boxBoolean(true);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        synchronized (miParsedDataRecorder.getMSleepLock()) {
            FitnessLogUtils.i(miParsedDataRecorder.TAG, "recordSleepSegment(" + fitnessDataId + ")");
            FitnessDataRecorder recorder = miParsedDataRecorder.getRecorder();
            int tzOffsetInSec = fitnessDataId.getTzOffsetInSec();
            boolean isSleepFinish = allDaySleepParseData.getIsSleepFinish();
            SleepSegmentReport[] sleepSegmentReportArr = (SleepSegmentReport[]) list.toArray(new SleepSegmentReport[0]);
            zRecordSleepSegment = recorder.recordSleepSegment(str, tzOffsetInSec, isSleepFinish, (SleepSegmentReport[]) Arrays.copyOf(sleepSegmentReportArr, sleepSegmentReportArr.length));
            booleanRef.element = zRecordSleepSegment;
            Unit unit = Unit.INSTANCE;
        }
        if (zRecordSleepSegment) {
            miParsedDataRecorder.recordSleepAssistInfo(str, (SleepSegmentReport) list.get(0), fitnessDataId, allDaySleepParseData);
            miParsedDataRecorder.uploadSleepSrcData(str, (SleepSegmentReport) list.get(0), fitnessDataId, allDaySleepParseData);
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    public final boolean recordSportReport(@NotNull final String sid, final int zoneOffsetInSec, @NotNull final SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getVo2max() != null) {
            Integer vo2max = sportReport.getVo2max();
            Intrinsics.checkNotNull(vo2max);
            if (vo2max.intValue() > 0) {
                long startTime = sportReport.getStartTime();
                Integer vo2max2 = sportReport.getVo2max();
                Intrinsics.checkNotNull(vo2max2);
                Vo2MaxItem vo2MaxItem = new Vo2MaxItem(startTime, vo2max2.intValue());
                vo2MaxItem.setVo2MaxLevel(sportReport.getVo2maxLevel());
                getRecorder().recordV02max(sid, zoneOffsetInSec, vo2MaxItem);
            }
        }
        if (sportReport.getRunningIndicator() != null) {
            Float runningIndicator = sportReport.getRunningIndicator();
            Intrinsics.checkNotNull(runningIndicator);
            if (runningIndicator.floatValue() > 0.0f) {
                long startTime2 = sportReport.getStartTime();
                Float runningIndicator2 = sportReport.getRunningIndicator();
                Intrinsics.checkNotNull(runningIndicator2);
                RunningIndicatorItem runningIndicatorItem = new RunningIndicatorItem(startTime2, runningIndicator2.floatValue(), null, 4, null);
                runningIndicatorItem.setRunningIndicatorLevel(sportReport.getRunningIndicatorLevel());
                getRecorder().recordRunningIndicator(sid, zoneOffsetInSec, runningIndicatorItem);
            }
        }
        if (Intrinsics.areEqual(sid, "xiaomiwear_app") && sportReport.getSportType() == 810) {
            sportReport.setCloudCourseSource(2);
        }
        Integer fiveKilometreGradePrediction = sportReport.getFiveKilometreGradePrediction();
        int iIntValue = fiveKilometreGradePrediction != null ? fiveKilometreGradePrediction.intValue() : 0;
        Integer tenKilometreGradePrediction = sportReport.getTenKilometreGradePrediction();
        int iIntValue2 = iIntValue + (tenKilometreGradePrediction != null ? tenKilometreGradePrediction.intValue() : 0);
        Integer halfMarathonGradePrediction = sportReport.getHalfMarathonGradePrediction();
        int iIntValue3 = iIntValue2 + (halfMarathonGradePrediction != null ? halfMarathonGradePrediction.intValue() : 0);
        Integer fullMarathonGradePrediction = sportReport.getFullMarathonGradePrediction();
        if (iIntValue3 + (fullMarathonGradePrediction != null ? fullMarathonGradePrediction.intValue() : 0) > 0) {
            getRecorder().recordGradePrediction(sid, zoneOffsetInSec, new GradePredictionItem(sportReport.getStartTime(), sportReport.getFiveKilometreGradePrediction(), sportReport.getTenKilometreGradePrediction(), sportReport.getFullMarathonGradePrediction(), sportReport.getHalfMarathonGradePrediction()));
        }
        if (sportReport.getLactateThresholdHeartRate() != null && sportReport.getLactateThresholdPace() != null) {
            getRecorder().recordLactateThreshold(sid, zoneOffsetInSec, new LactateThresholdItem(sportReport.getStartTime(), sportReport.getTzIn15Min(), sportReport.getLactateThresholdPace(), sportReport.getLactateThresholdHeartRate()));
        }
        if (!tjg.a(ApplicationExtKt.getApplication())) {
            if (sportReport.getProtoType() == 25) {
                sportReport.setRequestDivingId(Boolean.FALSE);
            }
            Logger.i("SportHttpRequest", "no network");
        } else if (sportReport.divingInPositionValid() || sportReport.divingOutPositionValid()) {
            Float waterOutletLatitude = sportReport.getWaterOutletLatitude();
            float fFloatValue = waterOutletLatitude != null ? waterOutletLatitude.floatValue() : 10000.0f;
            Float waterOutletLongitude = sportReport.getWaterOutletLongitude();
            DivingPosition divingPosition = new DivingPosition(fFloatValue, waterOutletLongitude != null ? waterOutletLongitude.floatValue() : 10000.0f);
            Float waterInletLatitude = sportReport.getWaterInletLatitude();
            float fFloatValue2 = waterInletLatitude != null ? waterInletLatitude.floatValue() : 10000.0f;
            Float waterInletLongitude = sportReport.getWaterInletLongitude();
            new SportHttpRequest().getDivingIDData(new DivingOutInPosition(new DivingPosition(fFloatValue2, waterInletLongitude != null ? waterInletLongitude.floatValue() : 10000.0f), divingPosition), new Function1() { // from class: ovf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MiParsedDataRecorder.recordSportReport$lambda$3(sportReport, this, sid, zoneOffsetInSec, (OneDivingIdReport) obj);
                }
            }, new Function1() { // from class: pvf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MiParsedDataRecorder.recordSportReport$lambda$4(sportReport, this, sid, zoneOffsetInSec, (String) obj);
                }
            });
        }
        return getRecorder().recordSportReport(sid, zoneOffsetInSec, sportReport);
    }

    public final boolean recordTemperatureCharacter(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] srcData) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        FitnessDataRecorder recorder = getRecorder();
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        TemperatureCharacterItem temperatureCharacterItem = new TemperatureCharacterItem();
        temperatureCharacterItem.setTime(dataId.getTimeStamp());
        Unit unit = Unit.INSTANCE;
        recorder.recordTemperatureCharacteristic(sid, tzOffsetInSec, temperatureCharacterItem);
        return getRecorder().recordFDSData(sid, dataId, srcData);
    }

    public final boolean recordWeightRecords(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull List<WeightRecord> list) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(list, "list");
        FitnessLogUtils.i(this.TAG, "recordWeightRecords: sid = " + sid + ", dataId = [" + dataId + "], list = " + list);
        if (list.isEmpty() || sid.length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (WeightRecord weightRecord : list) {
            WeightItem weightItem = new WeightItem(weightRecord.getTime(), weightRecord.getWeight(), null, null, null, null, null, null, null, null, 1020, null);
            weightItem.setBmi(weightRecord.getBmi());
            weightItem.setBodyFatRate(weightRecord.getBodyFatRate());
            weightItem.setFatMass(weightRecord.getFatMass());
            weightItem.setMoistureRate(weightRecord.getMoistureRate());
            weightItem.setBoneSaltRate(weightRecord.getBoneSaltRate());
            weightItem.setBoneSaltMass(weightRecord.getBoneMass());
            weightItem.setProteinRate(weightRecord.getProteinRate());
            weightItem.setProteinMass(weightRecord.getProteinMass());
            weightItem.setMuscleMass(weightRecord.getMuscleMass());
            weightItem.setBasalMetabolism(weightRecord.getBasalMetabolism());
            arrayList.add(weightItem);
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec();
        if (!(!arrayList.isEmpty())) {
            return true;
        }
        FitnessDataRecorder recorder = getRecorder();
        WeightItem[] weightItemArr = (WeightItem[]) arrayList.toArray(new WeightItem[0]);
        return recorder.recordWeight(sid, tzOffsetInSec, (WeightItem[]) Arrays.copyOf(weightItemArr, weightItemArr.length));
    }

    public final void saveTemperatureFile(long time, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (AppUtil.INSTANCE.isDevChannel()) {
            File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("temperature_file");
            File file = new File(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null, time + "_temp_record");
            if (file.exists()) {
                file.delete();
            }
            FileUtils.INSTANCE.writeFile(file, new ByteArrayInputStream(data));
        }
    }
}
