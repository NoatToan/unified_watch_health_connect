package com.xiaomi.fitness.health.sleep.utils;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DownloadExtKt;
import com.xiaomi.fitness.common.utils.UriExtKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.onetrack.b.m;
import defpackage.c0j;
import defpackage.qxi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001fH\u0007\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&\u001a0\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020&\u001a0\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001fH\u0002\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0016\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020&2\u0006\u0010#\u001a\u00020$\u001a\u0018\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0002\u001a\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100!H\u0002\u001a\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100!H\u0002\u001a\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100!H\u0002\u001a\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010060!H\u0002\u001a\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u0010062\u0006\u00108\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00100!H\u0002\u001a\b\u0010<\u001a\u00020\u0010H\u0002\u001a\u0006\u0010=\u001a\u00020>\u001a\u001c\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0D\u001a\u0010\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u0006\u0010G\u001a\u00020H\u001a\u0010\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020HH\u0003\u001a\u000e\u0010K\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&\u001a\u000e\u0010L\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&\u001a\u001e\u0010M\u001a\u00020\u00102\u0006\u0010(\u001a\u00020$2\u0006\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020\u0001\u001a \u0010P\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u0001H\u0002\u001a\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020$\u001a0\u0010T\u001a\u0004\u0018\u00010\u00102\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0006\u0010V\u001a\u00020\u00102\u0006\u0010W\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0002\u001a$\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020$2\u0006\u0010N\u001a\u000201\u001a\u000e\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020$\u001a\u000e\u0010[\u001a\u00020>2\u0006\u0010Z\u001a\u00020$\u001a\u000e\u0010\\\u001a\u00020>2\u0006\u0010Z\u001a\u00020$\u001a\u000e\u0010]\u001a\u00020>2\u0006\u0010Z\u001a\u00020$\u001a\u0016\u0010^\u001a\u00020>2\u0006\u0010Z\u001a\u00020$2\u0006\u0010N\u001a\u000201\u001a\u000e\u0010_\u001a\u00020>2\u0006\u0010Z\u001a\u00020$\u001a\n\u0010`\u001a\u00020@*\u00020a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"COUNT_INTERPRETATION_DURATION_SHORT", "", "COUNT_INTERPRETATION_DURATION_LONG", "COUNT_INTERPRETATION_LIGHT_DEEP_ABNORMAL", "COUNT_INTERPRETATION_REM_ABNORMAL", "COUNT_INTERPRETATION_BEDTIME_LATE", "COUNT_INTERPRETATION_WAKEUP_TOO_MANY_TIMES", "COUNT_INTERPRETATION_M", "COUNT_ADVICE_DURATION_SHORT", "COUNT_ADVICE_DURATION_LONG", "COUNT_ADVICE_LIGHT_DEEP_ABNORMAL", "COUNT_ADVICE_REM_ABNORMAL", "COUNT_ADVICE_BEDTIME_LATE", "COUNT_ADVICE_WAKEUP_TOO_MANY_TIMES", "COUNT_ADVICE_N", "PREFIX_INTERPR_DURATION_SHORT", "", "PREFIX_INTERPR_DURATION_LONG", "PREFIX_INTERPR_LIGHT_DEEP_ABNORMAL", "PREFIX_INTERPR_REM_ABNORMAL", "PREFIX_INTERPR_BEDTIME_LATE", "PREFIX_INTERPR_WAKEUP_TOO_MANY_TIMES", "PREFIX_INTERPR_NORMAL", "PREFIX_ADVICE_DURATION_SHORT", "PREFIX_ADVICE_DURATION_LONG", "PREFIX_ADVICE_DEEP_LIGHT_ABNORMAL", "PREFIX_ADVICE_REM_ABNORMAL", "PREFIX_ADVICE_BEDTIME_LATE", "PREFIX_ADVICE_WAKEUP_TOO_MANY_TIMES", "PREFIX_ADVICE_NORMAL", "readFileAndConstructMap", "", "getInterprStringList", "", "copyMap", "sleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "allDaySleep", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "getAdviceStringList", "segmentReport", "getContentList", "idList", "getSleepProblemHitCount", "getPreviewText", "allDaySleepReport", "getSelectedString", "score", "randomFeed", "", "getOver80OptionList", "get70To80OptionList", "getBelow70OptionList", "initSynonymList", "", "getSynonymsByIdIncludingItself", "id", "getSynonymsByIdListIncludingThemselves", "", "list", "getLocalLanguageSrcUrl", "ifCurtLocaleSleepAdviceFileExists", "", "downloadSleepAdviceIfNeedAndProceed", "", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "callback", "Lkotlin/Function0;", "getResourceFilePath", "downloadFileName", "getResourceFile", "Ljava/io/File;", "readTextFromUri", "file", "getNormalInterprIdString", "getNormalAdviceIdString", "getSleepHitProblemSummaryStr", "zeroTimestampToday", "sleepProblemHitCount", "getSummaryItem", "zeroBasedIndex", "problemSummary", "constructAbnInterprIdList", "findFirstValidId", "adviceList", "prefix", "optionCount", "getAbnAdviceIdList", "ifSleepDurationTooLong", "report", "ifSleepDurationTooShort", "ifLightDeepSleepAbnormal", "ifRemDurationAbnormal", "ifBedTimeTooLate", "ifWakeUpTooManyTimes", "clearAllItemDecorations", "Landroidx/recyclerview/widget/RecyclerView;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterpretationExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterpretationExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepInterpretationExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,678:1\n1863#2:679\n1863#2,2:680\n1864#2:682\n1863#2,2:683\n1557#2:685\n1628#2,3:686\n1557#2:689\n1628#2,3:690\n1557#2:693\n1628#2,3:694\n1863#2,2:697\n1863#2,2:699\n*S KotlinDebug\n*F\n+ 1 SleepInterpretationExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepInterpretationExtKt\n*L\n141#1:679\n147#1:680,2\n141#1:682\n198#1:683,2\n268#1:685\n268#1:686,3\n276#1:689\n276#1:690,3\n284#1:693\n284#1:694,3\n299#1:697,2\n310#1:699,2\n*E\n"})
public final class SleepInterpretationExtKt {
    private static final int COUNT_ADVICE_BEDTIME_LATE = 5;
    private static final int COUNT_ADVICE_DURATION_LONG = 3;
    private static final int COUNT_ADVICE_DURATION_SHORT = 5;
    private static final int COUNT_ADVICE_LIGHT_DEEP_ABNORMAL = 6;
    private static final int COUNT_ADVICE_N = 7;
    private static final int COUNT_ADVICE_REM_ABNORMAL = 3;
    private static final int COUNT_ADVICE_WAKEUP_TOO_MANY_TIMES = 5;
    private static final int COUNT_INTERPRETATION_BEDTIME_LATE = 4;
    private static final int COUNT_INTERPRETATION_DURATION_LONG = 1;
    private static final int COUNT_INTERPRETATION_DURATION_SHORT = 4;
    private static final int COUNT_INTERPRETATION_LIGHT_DEEP_ABNORMAL = 3;
    private static final int COUNT_INTERPRETATION_M = 8;
    private static final int COUNT_INTERPRETATION_REM_ABNORMAL = 1;
    private static final int COUNT_INTERPRETATION_WAKEUP_TOO_MANY_TIMES = 1;

    @NotNull
    private static final String PREFIX_ADVICE_BEDTIME_LATE = "E";

    @NotNull
    private static final String PREFIX_ADVICE_DEEP_LIGHT_ABNORMAL = "C";

    @NotNull
    private static final String PREFIX_ADVICE_DURATION_LONG = "B";

    @NotNull
    private static final String PREFIX_ADVICE_DURATION_SHORT = "A";

    @NotNull
    private static final String PREFIX_ADVICE_NORMAL = "N";

    @NotNull
    private static final String PREFIX_ADVICE_REM_ABNORMAL = "D";

    @NotNull
    private static final String PREFIX_ADVICE_WAKEUP_TOO_MANY_TIMES = "F";

    @NotNull
    private static final String PREFIX_INTERPR_BEDTIME_LATE = "S";

    @NotNull
    private static final String PREFIX_INTERPR_DURATION_LONG = "P";

    @NotNull
    private static final String PREFIX_INTERPR_DURATION_SHORT = "O";

    @NotNull
    private static final String PREFIX_INTERPR_LIGHT_DEEP_ABNORMAL = "Q";

    @NotNull
    private static final String PREFIX_INTERPR_NORMAL = "M";

    @NotNull
    private static final String PREFIX_INTERPR_REM_ABNORMAL = "R";

    @NotNull
    private static final String PREFIX_INTERPR_WAKEUP_TOO_MANY_TIMES = "T";

    public static final void clearAllItemDecorations(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
    }

    @NotNull
    public static final List<String> constructAbnInterprIdList(@NotNull AllDaySleepReport allDaySleep, @NotNull SleepSegmentReport segmentReport) {
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        ArrayList arrayList = new ArrayList();
        long time = allDaySleep.getTime() / TimeUnit.DAYS.toSeconds(1L);
        if (ifSleepDurationTooShort(segmentReport)) {
            arrayList.add(PREFIX_INTERPR_DURATION_SHORT + (time % ((long) 4)));
        }
        if (ifSleepDurationTooLong(segmentReport)) {
            arrayList.add(PREFIX_INTERPR_DURATION_LONG + (time % 1));
        }
        if (ifLightDeepSleepAbnormal(segmentReport)) {
            arrayList.add(PREFIX_INTERPR_LIGHT_DEEP_ABNORMAL + (time % ((long) 3)));
        }
        if (ifRemDurationAbnormal(segmentReport)) {
            arrayList.add(PREFIX_INTERPR_REM_ABNORMAL + (time % 1));
        }
        if (ifBedTimeTooLate(segmentReport, allDaySleep.getTime())) {
            arrayList.add(PREFIX_INTERPR_BEDTIME_LATE + (time % ((long) 4)));
        }
        if (ifWakeUpTooManyTimes(segmentReport)) {
            arrayList.add(PREFIX_INTERPR_WAKEUP_TOO_MANY_TIMES + (time % 1));
        }
        return arrayList;
    }

    public static final void downloadSleepAdviceIfNeedAndProceed(@NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(callback, "callback");
        File resourceFile = getResourceFile();
        String localLanguageSrcUrl = getLocalLanguageSrcUrl();
        Logger.d("downloadSleepAdviceIfNeedAndProceed destinationFile=" + resourceFile + " srcUrl=" + localLanguageSrcUrl, new Object[0]);
        DownloadExtKt.downloadFileAndPerformCallbackIfNeed$default(localLanguageSrcUrl, resourceFile, lifecycleScope, callback, null, 16, null);
    }

    private static final String findFirstValidId(List<String> list, String str, int i, long j) {
        long j2 = i;
        long j3 = j % j2;
        String str2 = str + j3;
        Set<String> synonymsByIdListIncludingThemselves = getSynonymsByIdListIncludingThemselves(list);
        Logger.d(SleepExtKt.TAG, "findFirstValidId prefix=" + str + " index=" + j3 + " id=" + str2 + " synPool=" + synonymsByIdListIncludingThemselves);
        for (int i2 = 0; synonymsByIdListIncludingThemselves.contains(str2) && i2 < i; i2++) {
            j3++;
            str2 = str + (j3 % j2);
        }
        Logger.d(SleepExtKt.TAG, "findFirstValidId index=" + j3 + " id=" + str2);
        if (synonymsByIdListIncludingThemselves.contains(str2)) {
            return null;
        }
        return str2;
    }

    private static final List<String> get70To80OptionList() {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c0j.Gh), Integer.valueOf(c0j.Mh)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(ApplicationExtKt.getApplication().getString(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> getAbnAdviceIdList(@NotNull AllDaySleepReport allDaySleep, @NotNull SleepSegmentReport segmentReport, long j) {
        String strFindFirstValidId;
        String strFindFirstValidId2;
        String strFindFirstValidId3;
        String strFindFirstValidId4;
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        ArrayList arrayList = new ArrayList();
        long time = allDaySleep.getTime() / TimeUnit.DAYS.toSeconds(1L);
        if (ifSleepDurationTooShort(segmentReport)) {
            arrayList.add(PREFIX_ADVICE_DURATION_SHORT + (time % ((long) 5)));
        }
        if (ifSleepDurationTooLong(segmentReport) && (strFindFirstValidId4 = findFirstValidId(arrayList, "B", 3, time)) != null) {
            arrayList.add(strFindFirstValidId4);
        }
        if (ifLightDeepSleepAbnormal(segmentReport) && (strFindFirstValidId3 = findFirstValidId(arrayList, PREFIX_ADVICE_DEEP_LIGHT_ABNORMAL, 6, time)) != null) {
            arrayList.add(strFindFirstValidId3);
        }
        if (ifRemDurationAbnormal(segmentReport) && (strFindFirstValidId2 = findFirstValidId(arrayList, PREFIX_ADVICE_REM_ABNORMAL, 3, time)) != null) {
            arrayList.add(strFindFirstValidId2);
        }
        if (ifBedTimeTooLate(segmentReport, j)) {
            String strFindFirstValidId5 = findFirstValidId(arrayList, PREFIX_ADVICE_BEDTIME_LATE, 5, time);
            Logger.d(SleepExtKt.TAG, "ifBedTimeTooLate firstValidId=" + strFindFirstValidId5);
            if (strFindFirstValidId5 != null) {
                arrayList.add(strFindFirstValidId5);
            }
        }
        if (ifWakeUpTooManyTimes(segmentReport) && (strFindFirstValidId = findFirstValidId(arrayList, PREFIX_ADVICE_WAKEUP_TOO_MANY_TIMES, 5, time)) != null) {
            arrayList.add(strFindFirstValidId);
        }
        Logger.d(SleepExtKt.TAG, "getAbnAdviceIdList adviceIdList=" + arrayList);
        return arrayList;
    }

    @NotNull
    public static final List<String> getAdviceStringList(@NotNull Map<String, String> copyMap, @NotNull SleepSegmentReport segmentReport, @NotNull AllDaySleepReport allDaySleep) {
        Intrinsics.checkNotNullParameter(copyMap, "copyMap");
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        return getSleepProblemHitCount(segmentReport, allDaySleep) != 0 ? getContentList(getAbnAdviceIdList(allDaySleep, segmentReport, allDaySleep.getTime()), copyMap) : getContentList(CollectionsKt__CollectionsJVMKt.listOf(getNormalAdviceIdString(allDaySleep)), copyMap);
    }

    private static final List<String> getBelow70OptionList() {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c0j.Ih), Integer.valueOf(c0j.Jh)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(ApplicationExtKt.getApplication().getString(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    private static final List<String> getContentList(List<String> list, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = map.get((String) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> getInterprStringList(@NotNull Map<String, String> copyMap, @NotNull SleepSegmentReport sleepSegmentReport, @NotNull AllDaySleepReport allDaySleep) {
        Intrinsics.checkNotNullParameter(copyMap, "copyMap");
        Intrinsics.checkNotNullParameter(sleepSegmentReport, "sleepSegmentReport");
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        int sleepProblemHitCount = getSleepProblemHitCount(sleepSegmentReport, allDaySleep);
        Logger.i(SleepExtKt.TAG, "getSleepProblemHitCount=" + sleepProblemHitCount);
        return sleepProblemHitCount != 0 ? getContentList(constructAbnInterprIdList(allDaySleep, sleepSegmentReport), copyMap) : getContentList(CollectionsKt__CollectionsJVMKt.listOf(getNormalInterprIdString(allDaySleep)), copyMap);
    }

    private static final String getLocalLanguageSrcUrl() {
        Locale locale = ApplicationExtKt.getApplication().getResources().getConfiguration().getLocales().get(0);
        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("zh_cn", SleepInterpretationConstants.URL_ZH_CH_V1), TuplesKt.to("zh_hk", SleepInterpretationConstants.URL_ZH_HK_V1), TuplesKt.to("zh_tw", SleepInterpretationConstants.URL_ZH_TW_V1), TuplesKt.to("ug_cn", SleepInterpretationConstants.URL_UG_CN), TuplesKt.to("bg_bg", SleepInterpretationConstants.URL_BG_BG), TuplesKt.to("bo_cn", SleepInterpretationConstants.URL_BO_CN), TuplesKt.to("ar", SleepInterpretationConstants.URL_AR), TuplesKt.to(Language.CS, SleepInterpretationConstants.URL_CS), TuplesKt.to("da", SleepInterpretationConstants.URL_DA), TuplesKt.to("de", SleepInterpretationConstants.URL_DE), TuplesKt.to(Language.EL, SleepInterpretationConstants.URL_EL), TuplesKt.to("en_au", SleepInterpretationConstants.URL_EN_AU), TuplesKt.to("en_gb", SleepInterpretationConstants.URL_EN_GB), TuplesKt.to("en_in", SleepInterpretationConstants.URL_EN_IN), TuplesKt.to("es", SleepInterpretationConstants.URL_ES_V1), TuplesKt.to("et_ee", SleepInterpretationConstants.URL_ET_EE), TuplesKt.to("fi", SleepInterpretationConstants.URL_FI), TuplesKt.to("fr", SleepInterpretationConstants.URL_FR), TuplesKt.to("hi_in", SleepInterpretationConstants.URL_HI), TuplesKt.to("hr", SleepInterpretationConstants.URL_HR), TuplesKt.to("hu", SleepInterpretationConstants.URL_HU), TuplesKt.to("in", SleepInterpretationConstants.URL_IN), TuplesKt.to("it", SleepInterpretationConstants.URL_IT), TuplesKt.to("iw_il", SleepInterpretationConstants.URL_IW_IL), TuplesKt.to("ja", SleepInterpretationConstants.URL_JA), TuplesKt.to("ko", SleepInterpretationConstants.URL_KO), TuplesKt.to("lt", SleepInterpretationConstants.URL_LT), TuplesKt.to("lv", SleepInterpretationConstants.URL_LV), TuplesKt.to("nb", SleepInterpretationConstants.URL_NB), TuplesKt.to("nl", SleepInterpretationConstants.URL_NL), TuplesKt.to("pl", SleepInterpretationConstants.URL_PL), TuplesKt.to("pt_br", SleepInterpretationConstants.URL_PT_BR), TuplesKt.to("pt_pt", SleepInterpretationConstants.URL_PT_PT), TuplesKt.to(Language.RO, SleepInterpretationConstants.URL_RO), TuplesKt.to("ru", SleepInterpretationConstants.URL_RU), TuplesKt.to("sk", SleepInterpretationConstants.URL_SK), TuplesKt.to("sl", SleepInterpretationConstants.URL_SL), TuplesKt.to("sr", SleepInterpretationConstants.URL_SR), TuplesKt.to(m.e, SleepInterpretationConstants.URL_SV), TuplesKt.to("th", SleepInterpretationConstants.URL_TH), TuplesKt.to("tr", SleepInterpretationConstants.URL_TR), TuplesKt.to("uk", SleepInterpretationConstants.URL_UK), TuplesKt.to("vi", SleepInterpretationConstants.URL_VI), TuplesKt.to("en", SleepInterpretationConstants.URL_DEFAULT));
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String lowerCase2 = country.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String str = lowerCase + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + lowerCase2;
        String language2 = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
        String lowerCase3 = language2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        Logger.d(SleepExtKt.TAG, "getLocalLanguageSrcUrl code=" + str);
        String str2 = (String) mapMapOf.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) mapMapOf.get(lowerCase3);
        return str3 == null ? SleepInterpretationConstants.URL_DEFAULT : str3;
    }

    @NotNull
    public static final String getNormalAdviceIdString(@NotNull AllDaySleepReport allDaySleep) {
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        return PREFIX_ADVICE_NORMAL + ((allDaySleep.getTime() / TimeUnit.DAYS.toSeconds(1L)) % ((long) 7));
    }

    @NotNull
    public static final String getNormalInterprIdString(@NotNull AllDaySleepReport allDaySleep) {
        Intrinsics.checkNotNullParameter(allDaySleep, "allDaySleep");
        return PREFIX_INTERPR_NORMAL + ((allDaySleep.getTime() / TimeUnit.DAYS.toSeconds(1L)) % ((long) 8));
    }

    private static final List<String> getOver80OptionList() {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c0j.Hh), Integer.valueOf(c0j.Fh), Integer.valueOf(c0j.Lh), Integer.valueOf(c0j.Kh), Integer.valueOf(c0j.ci)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(ApplicationExtKt.getApplication().getString(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @NotNull
    public static final String getPreviewText(@NotNull AllDaySleepReport allDaySleepReport, @NotNull SleepSegmentReport sleepSegmentReport) {
        String string;
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        Intrinsics.checkNotNullParameter(sleepSegmentReport, "sleepSegmentReport");
        int score = allDaySleepReport.getScore();
        int sleepProblemHitCount = getSleepProblemHitCount(sleepSegmentReport, allDaySleepReport);
        String selectedString = getSelectedString(score, allDaySleepReport.getTime() / TimeUnit.DAYS.toSeconds(1L));
        if (sleepProblemHitCount == 0) {
            string = "";
        } else if (sleepProblemHitCount != 1) {
            string = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.J0, sleepProblemHitCount, Integer.valueOf(sleepProblemHitCount));
        } else {
            string = ApplicationExtKt.getApplication().getString(c0j.ah);
            Intrinsics.checkNotNull(string);
        }
        return selectedString + string + getSleepHitProblemSummaryStr(sleepSegmentReport, allDaySleepReport.getTime(), sleepProblemHitCount);
    }

    @NotNull
    public static final File getResourceFile() {
        String strGuessFileName = URLUtil.guessFileName(getLocalLanguageSrcUrl(), null, null);
        Logger.d(SleepExtKt.TAG, "getResourceFile curtLocaleFileName=" + strGuessFileName);
        Intrinsics.checkNotNull(strGuessFileName);
        return new File(getResourceFilePath(strGuessFileName));
    }

    private static final String getResourceFilePath(String str) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("SleepAdvice");
        return (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + str;
    }

    private static final String getSelectedString(int i, long j) {
        List<String> below70OptionList;
        if (i >= 80) {
            below70OptionList = getOver80OptionList();
        } else {
            below70OptionList = i >= 70 ? get70To80OptionList() : getBelow70OptionList();
        }
        return below70OptionList.get((int) (j % ((long) below70OptionList.size())));
    }

    @NotNull
    public static final String getSleepHitProblemSummaryStr(@NotNull SleepSegmentReport segmentReport, long j, int i) {
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (ifSleepDurationTooShort(segmentReport)) {
            String string = ApplicationExtKt.getApplication().getString(c0j.Wg);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            sb.append(getSummaryItem(0, string, i));
            i2 = 1;
        }
        if (ifSleepDurationTooLong(segmentReport)) {
            String string2 = ApplicationExtKt.getApplication().getString(c0j.Vg);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            sb.append(getSummaryItem(i2, string2, i));
            i2++;
        }
        if (ifLightDeepSleepAbnormal(segmentReport)) {
            String string3 = ApplicationExtKt.getApplication().getString(c0j.Xg);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            sb.append(getSummaryItem(i2, string3, i));
            i2++;
        }
        if (ifRemDurationAbnormal(segmentReport)) {
            String string4 = ApplicationExtKt.getApplication().getString(c0j.Yg);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            sb.append(getSummaryItem(i2, string4, i));
            i2++;
        }
        if (ifBedTimeTooLate(segmentReport, j)) {
            String string5 = ApplicationExtKt.getApplication().getString(c0j.Ug);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            sb.append(getSummaryItem(i2, string5, i));
            i2++;
        }
        if (ifWakeUpTooManyTimes(segmentReport)) {
            String string6 = ApplicationExtKt.getApplication().getString(c0j.Zg);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            sb.append(getSummaryItem(i2, string6, i));
        }
        String string7 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
        return string7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private static final int getSleepProblemHitCount(SleepSegmentReport sleepSegmentReport, AllDaySleepReport allDaySleepReport) {
        ?? IfSleepDurationTooShort = ifSleepDurationTooShort(sleepSegmentReport);
        int i = IfSleepDurationTooShort;
        if (ifSleepDurationTooLong(sleepSegmentReport)) {
            i = IfSleepDurationTooShort + 1;
        }
        int i2 = i;
        if (ifLightDeepSleepAbnormal(sleepSegmentReport)) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (ifRemDurationAbnormal(sleepSegmentReport)) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (ifBedTimeTooLate(sleepSegmentReport, allDaySleepReport.getTime())) {
            i4 = i3 + 1;
        }
        return ifWakeUpTooManyTimes(sleepSegmentReport) ? i4 + 1 : i4;
    }

    private static final String getSummaryItem(int i, String str, int i2) {
        if (i2 == 1) {
            return str;
        }
        String string = ApplicationExtKt.getApplication().getString(c0j.l9, String.valueOf(i + 1), str);
        Intrinsics.checkNotNull(string);
        return string;
    }

    private static final Set<String> getSynonymsByIdIncludingItself(String str) {
        for (Set<String> set : initSynonymList()) {
            if (set.contains(str)) {
                Logger.d(SleepExtKt.TAG, "getSynonymsById setToReturn=" + set);
                return set;
            }
        }
        return new LinkedHashSet();
    }

    private static final Set<String> getSynonymsByIdListIncludingThemselves(List<String> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(getSynonymsByIdIncludingItself((String) it.next()));
        }
        return linkedHashSet;
    }

    public static final boolean ifBedTimeTooLate(@NotNull SleepSegmentReport report, long j) {
        Intrinsics.checkNotNullParameter(report, "report");
        long bedTime = report.getBedTime();
        return j - ((long) 3600) <= bedTime && bedTime <= j + ((long) 32400);
    }

    public static final boolean ifCurtLocaleSleepAdviceFileExists() {
        String strGuessFileName = URLUtil.guessFileName(getLocalLanguageSrcUrl(), null, null);
        Logger.d(SleepExtKt.TAG, "ifCurtLocaleSleepAdviceFileExists curtLocaleFileName=" + strGuessFileName);
        Intrinsics.checkNotNull(strGuessFileName);
        return new File(getResourceFilePath(strGuessFileName)).exists();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public static final boolean ifLightDeepSleepAbnormal(@NotNull SleepSegmentReport report) {
        boolean z;
        Intrinsics.checkNotNullParameter(report, "report");
        int sleepDuration = report.getSleepDuration();
        int lightDuration = report.getLightDuration();
        int deepDuration = report.getDeepDuration();
        Integer remDuration = report.getRemDuration();
        int iIntValue = remDuration != null ? remDuration.intValue() : 0;
        float f = deepDuration;
        float f2 = sleepDuration;
        float f3 = 0.2f * f2;
        boolean z2 = f < f3;
        float f4 = 0.6f * f2;
        boolean z3 = f > f4;
        if (iIntValue > 0) {
            float f5 = lightDuration;
            if (f5 < f3 || f5 > f4) {
                z = true;
            } else {
                z = false;
            }
        } else {
            float f6 = lightDuration;
            if (f6 < f4 || f6 > f2 * 0.8f) {
                z = true;
            } else {
                z = false;
            }
        }
        return z2 || z3 || z;
    }

    public static final boolean ifRemDurationAbnormal(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        int sleepDuration = report.getSleepDuration();
        Integer remDuration = report.getRemDuration();
        int iIntValue = remDuration != null ? remDuration.intValue() : 0;
        if (iIntValue <= 0) {
            return false;
        }
        float f = iIntValue;
        float f2 = sleepDuration;
        return f < 0.1f * f2 || f > f2 * 0.3f;
    }

    public static final boolean ifSleepDurationTooLong(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        return report.getSleepDuration() > 540;
    }

    public static final boolean ifSleepDurationTooShort(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        return report.getSleepDuration() <= 420;
    }

    public static final boolean ifWakeUpTooManyTimes(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Integer wakeCount = report.getWakeCount();
        return wakeCount != null && wakeCount.intValue() >= 3;
    }

    private static final List<Set<String>> initSynonymList() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{SetsKt__SetsKt.mutableSetOf("A0", "E0", "F0"), SetsKt__SetsKt.mutableSetOf("A1", "C1", "E1", "F2"), SetsKt__SetsKt.mutableSetOf("A2", "C4", "E2", "F3"), SetsKt__SetsKt.mutableSetOf("A3", "E3"), SetsKt__SetsKt.mutableSetOf("A4", "B0", "C2", "D0", "E4", "F4"), SetsKt__SetsKt.mutableSetOf("C3", "D2")});
    }

    @NotNull
    public static final Map<String, String> readFileAndConstructMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(readTextFromUri(getResourceFile()), "{", "", false, 4, (Object) null), "}", "", false, 4, (Object) null), "\n", "", false, 4, (Object) null), "\t", "", false, 4, (Object) null), "\b", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null), ",\"", ";\"", false, 4, (Object) null), new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            List<Set<String>> listInitSynonymList = initSynonymList();
            List listFlatten = CollectionsKt__IterablesKt.flatten(listInitSynonymList);
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) it.next()).toString(), new String[]{":"}, false, 0, 6, (Object) null);
                String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trim((CharSequence) listSplit$default2.get(0)).toString(), "\"", "", false, 4, (Object) null);
                String strReplace$default2 = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trim((CharSequence) listSplit$default2.get(1)).toString(), "\"", "", false, 4, (Object) null);
                ArrayList arrayList2 = null;
                if (listFlatten.contains(strReplace$default)) {
                    Iterator<T> it2 = listInitSynonymList.iterator();
                    while (it2.hasNext()) {
                        Set set = (Set) it2.next();
                        if (set.contains(strReplace$default)) {
                            arrayList2 = new ArrayList();
                            arrayList2.addAll(set);
                            arrayList2.remove(strReplace$default);
                        }
                    }
                }
                arrayList.add(new SleepParagraph(strReplace$default, strReplace$default2, arrayList2));
                linkedHashMap.put(strReplace$default, strReplace$default2);
            }
            Logger.d(SleepExtKt.TAG, "readAndDecode paragraphList=" + arrayList);
            Logger.i(SleepExtKt.TAG, "readFileAndConstructMap copyMap size=" + linkedHashMap.size());
        } catch (Exception e) {
            Logger.e(SleepExtKt.TAG, "readFileAndConstructMap failed. error=" + e);
        }
        return linkedHashMap;
    }

    private static final String readTextFromUri(File file) throws FileNotFoundException {
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNull(uriFromFile);
        Uri uriConvertToSafeUriAboveN = UriExtKt.convertToSafeUriAboveN(uriFromFile);
        Logger.d("readTextFromUri", "uri=" + uriFromFile + " safeUri=" + uriConvertToSafeUriAboveN);
        if (uriConvertToSafeUriAboveN == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(uriConvertToSafeUriAboveN);
        if (inputStreamOpenInputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        sb.append(line);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.i("readTextFromUri", "result=" + string);
        return string;
    }
}
