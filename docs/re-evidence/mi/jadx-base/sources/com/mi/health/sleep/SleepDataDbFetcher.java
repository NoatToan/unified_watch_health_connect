package com.mi.health.sleep;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import cn.miao.health.bean.MiaoHealthBaseInfo;
import cn.miao.health.bean.MiaoHealthSleepInfo;
import cn.miao.health.bean.SleepInfo;
import com.google.gson.Gson;
import com.mi.health.sleep.SleepDataDbFetcher;
import com.mi.health.sleep.bean.EvaluateItem;
import com.mi.health.sleep.bean.SleepEvaluateInfo;
import com.mi.health.sleep.bean.SleepSegmentStage;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.dataprovider.DataUtils;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import com.xiaomi.fitness.util.AddTrailHelperKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bxf;
import defpackage.ezi;
import defpackage.f8o;
import defpackage.yc5;
import defpackage.ywf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ;\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001d\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/mi/health/sleep/SleepDataDbFetcher;", "", "", "dateTime", "", "", "projection", "Landroid/database/Cursor;", "getSleepReportCursor", "(J[Ljava/lang/String;)Landroid/database/Cursor;", OneTrack.Param.PKG, "Landroid/util/Pair;", "time", "getSleepRecordCursor", "(Ljava/lang/String;Landroid/util/Pair;[Ljava/lang/String;)Landroid/database/Cursor;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "sleepData", "Lcom/mi/health/sleep/bean/SleepEvaluateInfo;", "getSleepEvaluation", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Lcom/mi/health/sleep/bean/SleepEvaluateInfo;", "Lcn/miao/health/bean/SleepInfo;", "createSleepInfo", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Lcn/miao/health/bean/SleepInfo;", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "selection", "selectionArgs", "querySleepRecords", "(Ljava/lang/String;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "querySleepReport", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/util/ArrayMap;", "mRecordMap", "Landroid/util/ArrayMap;", "", "mReportList", "Ljava/util/List;", "Lf8o;", "mSqlSelection$delegate", "Lkotlin/Lazy;", "getMSqlSelection", "()Lf8o;", "mSqlSelection", "Lcom/google/gson/Gson;", "mGson$delegate", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "<init>", "()V", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDataDbFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDataDbFetcher.kt\ncom/mi/health/sleep/SleepDataDbFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,285:1\n1#2:286\n13402#3,2:287\n13402#3,2:292\n216#4,2:289\n1863#5:291\n1864#5:294\n*S KotlinDebug\n*F\n+ 1 SleepDataDbFetcher.kt\ncom/mi/health/sleep/SleepDataDbFetcher\n*L\n146#1:287,2\n206#1:292,2\n175#1:289,2\n204#1:291\n204#1:294\n*E\n"})
public final class SleepDataDbFetcher {

    @NotNull
    private static final String COL_BEGIN_TIME = "begin_time";

    @NotNull
    private static final String COL_DATE_NUM = "date_num";

    @NotNull
    private static final String COL_DATE_TIME = "date_time";

    @NotNull
    private static final String COL_DURATION = "duration";

    @NotNull
    private static final String COL_END_TIME = "end_time";

    @NotNull
    private static final String COL_EVALUATION = "evaluation";

    @NotNull
    private static final String COL_SLEEP_TIME = "sleep_time";

    @NotNull
    private static final String COL_STAGE = "stage";

    @NotNull
    private static final String COL_STAGE_LIST = "stage_list";

    @NotNull
    private static final String COL_WAKE_TIME = "wake_time";

    @NotNull
    private static final String COL_WAKING_DURATION = "waking_duration";

    @NotNull
    private static final String COL_WAKING_TIMES = "waking_times";

    @NotNull
    private static final String TAG = "SleepDataDbFetcher";

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson;

    @NotNull
    private final ArrayMap<String, String> mRecordMap;

    @NotNull
    private final List<String> mReportList;

    /* JADX INFO: renamed from: mSqlSelection$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSqlSelection;

    public SleepDataDbFetcher() {
        ArrayMap<String, String> arrayMap = new ArrayMap<>(4);
        this.mRecordMap = arrayMap;
        ArrayList arrayList = new ArrayList();
        this.mReportList = arrayList;
        this.mSqlSelection = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDataDbFetcher.mSqlSelection_delegate$lambda$0();
            }
        });
        this.mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDataDbFetcher.mGson_delegate$lambda$1();
            }
        });
        arrayMap.put(COL_DATE_TIME, COL_DATE_NUM);
        arrayMap.put(COL_BEGIN_TIME, COL_BEGIN_TIME);
        arrayMap.put("end_time", "end_time");
        arrayMap.put("stage", "stage");
        ListExtKt.add(arrayList, COL_SLEEP_TIME);
        ListExtKt.add(arrayList, "wake_time");
        ListExtKt.add(arrayList, COL_WAKING_TIMES);
        ListExtKt.add(arrayList, COL_WAKING_DURATION);
        ListExtKt.add(arrayList, "duration");
        ListExtKt.add(arrayList, COL_STAGE_LIST);
        ListExtKt.add(arrayList, COL_EVALUATION);
    }

    private final SleepInfo createSleepInfo(AllDaySleepReport sleepData) {
        SleepInfo sleepInfo = new SleepInfo();
        sleepInfo.setAge(Integer.valueOf(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge()));
        sleepInfo.setSleepDuration(Integer.valueOf(sleepData.getTotalDuration()));
        sleepInfo.setUserId(AddTrailHelperKt.UNKNOWN_USER);
        return sleepInfo;
    }

    private final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    private final f8o getMSqlSelection() {
        return (f8o) this.mSqlSelection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SleepEvaluateInfo getSleepEvaluation(AllDaySleepReport sleepData) {
        String string = ApplicationExtKt.getApplication().getString(ezi.B);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        EvaluateItem evaluateItem = new EvaluateItem(1, string);
        String string2 = ApplicationExtKt.getApplication().getString(ezi.A);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        EvaluateItem evaluateItem2 = new EvaluateItem(2, string2);
        String string3 = ApplicationExtKt.getApplication().getString(ezi.C);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(evaluateItem, evaluateItem2, new EvaluateItem(3, string3));
        List listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(listMutableListOf.get(1));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        bxf.d().c(createSleepInfo(sleepData), new ywf() { // from class: com.mi.health.sleep.SleepDataDbFetcher.getSleepEvaluation.1
            @Override // defpackage.ywf
            public void onError(int p0, String p1) {
                Logger.i(SleepDataDbFetcher.TAG, "getSleepEvaluation onError code=" + p0 + "**mag=" + p1);
            }

            @Override // defpackage.ywf
            public void onResponse(MiaoHealthBaseInfo p0) {
                Logger.i(SleepDataDbFetcher.TAG, "getSleepEvaluation onResponse p0=" + p0);
                if (p0 != null && (p0 instanceof MiaoHealthSleepInfo)) {
                    int analyzeMapping = ((MiaoHealthSleepInfo) p0).getSatEvaluation().getAnalyzeMapping();
                    Logger.i(SleepDataDbFetcher.TAG, "getSleepEvaluation onResponse type=" + analyzeMapping);
                    switch (analyzeMapping) {
                        case 320:
                        case 321:
                            intRef.element = 0;
                            break;
                        case 322:
                            intRef.element = 1;
                            break;
                        case 323:
                            intRef.element = 2;
                            break;
                    }
                }
            }
        });
        String string4 = ApplicationExtKt.getApplication().getString(ezi.z);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return new SleepEvaluateInfo("sleep_duration", string4, intRef.element, listMutableListOf2, listMutableListOf);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    private final Cursor getSleepRecordCursor(String pkg, Pair<Long, Long> time, String[] projection) {
        List<AllDaySleepReport> listEmptyList;
        Object objValueOf;
        Long l = (Long) time.first;
        Long l2 = (Long) time.second;
        Logger.i(TAG, "getSleepRecordCursor request: " + l + "," + l2);
        long jLongValue = l2.longValue();
        Intrinsics.checkNotNull(l);
        try {
            listEmptyList = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getDailyReportListSync("", l.longValue() / ((long) 1000), 0, (int) ((jLongValue - l.longValue()) / ((long) 86400000)));
        } catch (Exception e) {
            Logger.i(TAG, "getSleepRecordCursor " + time + ";exception " + e);
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Logger.i(TAG, "getSleepRecordCursor result: " + listEmptyList);
        List<AllDaySleepReport> list = listEmptyList;
        if (list == null || list.isEmpty()) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AllDaySleepReport> it = listEmptyList.iterator();
        while (it.hasNext()) {
            List<SleepSegmentStage> stageList = SleepDataHelperKt.getStageList(it.next());
            if (stageList != null) {
                for (SleepSegmentStage sleepSegmentStage : stageList) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (projection != null) {
                        for (String str : projection) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != 109757182) {
                                if (iHashCode != 1112183971) {
                                    if (iHashCode == 1725551537 && str.equals("end_time")) {
                                        objValueOf = Long.valueOf(sleepSegmentStage.getEndTime());
                                    } else {
                                        objValueOf = null;
                                    }
                                } else if (str.equals(COL_BEGIN_TIME)) {
                                    objValueOf = Long.valueOf(sleepSegmentStage.getBeginTime());
                                } else {
                                    objValueOf = null;
                                }
                            } else if (str.equals("stage")) {
                                int stage = sleepSegmentStage.getStage();
                                if (!SleepDataHelperKt.isDeskClock(pkg)) {
                                    stage = SleepDataHelperKt.changeSleepStage(stage);
                                } else if (stage != 5) {
                                    stage = 8;
                                }
                                objValueOf = Integer.valueOf(stage);
                            } else {
                                objValueOf = null;
                            }
                            linkedHashMap.put(str, objValueOf);
                        }
                    }
                    arrayList.add(linkedHashMap);
                }
            }
        }
        Cursor cursorB = yc5.b(arrayList, projection);
        Intrinsics.checkNotNullExpressionValue(cursorB, "asMuchCursor(...)");
        return cursorB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    private final Cursor getSleepReportCursor(long dateTime, String[] projection) {
        AllDaySleepReport report;
        Object objValueOf;
        try {
            report = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport("", TimeDateUtil.changZeroOfTheDay(dateTime / ((long) 1000)));
        } catch (Exception e) {
            Logger.i(TAG, "getSleepRecordCursor " + dateTime + ";exception " + e);
            report = null;
        }
        if (report == null) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        Logger.i(TAG, "getSleepRecordCursor " + dateTime + ";result " + report);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (projection != null) {
            for (String str : projection) {
                switch (str) {
                    case "duration":
                        objValueOf = Integer.valueOf(report.getTotalDuration() * 60000);
                        break;
                    case "sleep_time":
                        objValueOf = Long.valueOf(SleepDataHelperKt.getSleepStartTime(report));
                        break;
                    case "waking_duration":
                        Integer awakeDuration = report.getAwakeDuration();
                        objValueOf = Integer.valueOf(awakeDuration != null ? awakeDuration.intValue() * 1000 : 0);
                        break;
                    case "wake_time":
                        objValueOf = Long.valueOf(SleepDataHelperKt.getWakeTime(report));
                        break;
                    case "evaluation":
                        objValueOf = getMGson().toJson(getSleepEvaluation(report));
                        Logger.i(TAG, "evaluation=" + objValueOf);
                        break;
                    case "stage_list":
                        objValueOf = getMGson().toJson(SleepDataHelperKt.getStageList(report));
                        break;
                    case "waking_times":
                        objValueOf = Integer.valueOf(SleepDataHelperKt.getWakeCount(report));
                        break;
                    default:
                        objValueOf = 0;
                        break;
                }
                linkedHashMap.put(str, objValueOf);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Logger.i(TAG, "key=" + entry.getKey() + "**value=" + entry.getValue());
        }
        Cursor cursorA = yc5.a(linkedHashMap, projection);
        Intrinsics.checkNotNullExpressionValue(cursorA, "asCursor(...)");
        return cursorA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$1() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f8o mSqlSelection_delegate$lambda$0() {
        return new f8o();
    }

    @NotNull
    public final Cursor querySleepRecords(@NotNull String pkg, @Nullable Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Objects.requireNonNull(uri, "uri can't be null");
        if (projection != null) {
            Iterator it = ArrayIteratorKt.iterator(projection);
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!(!TextUtils.isEmpty(this.mRecordMap.get(str)))) {
                    throw new IllegalArgumentException(("check your projection " + str).toString());
                }
            }
        } else {
            projection = new String[]{COL_BEGIN_TIME, "end_time", "stage"};
        }
        if (selection == null) {
            throw new IllegalArgumentException("should use date_time as selection");
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) selection, (CharSequence) COL_DATE_TIME, false, 2, (Object) null)) {
            throw new IllegalArgumentException("selection should contain date_time".toString());
        }
        if (selectionArgs == null || selectionArgs.length != 2) {
            throw new IllegalArgumentException("selectionArgs can't be null and need 2 items".toString());
        }
        Pair<Long, Long> pairC = getMSqlSelection().c(selection, selectionArgs);
        Intrinsics.checkNotNullExpressionValue(pairC, "parseSleepRecordTime(...)");
        return getSleepRecordCursor(pkg, pairC, projection);
    }

    @NotNull
    public final Cursor querySleepReport(@Nullable Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs) {
        Objects.requireNonNull(uri, "uri can't be null");
        SleepDataHelperKt.checkColumn(this.mReportList, projection);
        if (projection == null) {
            projection = new String[]{COL_SLEEP_TIME, "wake_time", "duration", COL_WAKING_TIMES, COL_STAGE_LIST, COL_WAKING_DURATION, COL_EVALUATION};
        }
        DateNumHelper dateNumHelper = DateNumHelper.INSTANCE;
        long jCalcDateNum = dateNumHelper.calcDateNum(System.currentTimeMillis());
        if (selection != null) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) selection, (CharSequence) COL_DATE_TIME, false, 2, (Object) null)) {
                throw new IllegalArgumentException("please checkout your selection".toString());
            }
            if (selectionArgs == null || selectionArgs.length != 1) {
                throw new IllegalArgumentException("please check your selectionArgs".toString());
            }
            jCalcDateNum = dateNumHelper.calcDateNum(Long.parseLong(selectionArgs[0]));
        }
        return getSleepReportCursor(jCalcDateNum, projection);
    }
}
