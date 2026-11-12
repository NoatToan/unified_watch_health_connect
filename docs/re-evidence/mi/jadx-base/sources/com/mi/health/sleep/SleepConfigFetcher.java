package com.mi.health.sleep;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.util.ArrayMap;
import com.mi.health.router.business.IntentHelper;
import com.mi.health.sleep.SleepConfigFetcher;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.yc5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fJ\u001b\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006#"}, d2 = {"Lcom/mi/health/sleep/SleepConfigFetcher;", "", "<init>", "()V", "mTraceEnableTable", "", "", "mScheduleTable", "mSleepTracer", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "getMSleepTracer", "()Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer$delegate", "Lkotlin/Lazy;", "callSleepTracing", "Landroid/os/Bundle;", "isSleeping", "scheduleBegin", "", "arg", "extras", "scheduleEnd", "querySleepSchedule", "Landroid/database/Cursor;", "projection", "", "([Ljava/lang/String;)Landroid/database/Cursor;", "querySleepTraceEnable", "querySleepHomePageIntent", "updateSleepTraceEnable", "", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "updateSleepSchedule", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepConfigFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepConfigFetcher.kt\ncom/mi/health/sleep/SleepConfigFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,161:1\n1#2:162\n37#3:163\n36#3,3:164\n*S KotlinDebug\n*F\n+ 1 SleepConfigFetcher.kt\ncom/mi/health/sleep/SleepConfigFetcher\n*L\n144#1:163\n144#1:164,3\n*E\n"})
public final class SleepConfigFetcher {

    @NotNull
    private static final String COL_REPEAT = "repeat";

    @NotNull
    private static final String COL_SLEEP_HOUR = "sleep_hour";

    @NotNull
    private static final String COL_SLEEP_MIN = "sleep_min";

    @NotNull
    private static final String COL_TRACE_ENABLE = "trace_enable";

    @NotNull
    private static final String COL_WAKE_HOUR = "wake_hour";

    @NotNull
    private static final String COL_WAKE_MIN = "wake_min";

    @NotNull
    public static final String EXTRA_MAYBE_SLEEPING = "extra_maybe_sleeping";

    @NotNull
    private static final String TAG = "SleepConfigFetcher";

    @NotNull
    private final List<String> mScheduleTable;

    /* JADX INFO: renamed from: mSleepTracer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTracer;

    @NotNull
    private final List<String> mTraceEnableTable;

    public SleepConfigFetcher() {
        ArrayList arrayList = new ArrayList();
        this.mTraceEnableTable = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.mScheduleTable = arrayList2;
        this.mSleepTracer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepConfigFetcher.mSleepTracer_delegate$lambda$0();
            }
        });
        ListExtKt.add(arrayList, COL_TRACE_ENABLE);
        ListExtKt.add(arrayList2, COL_SLEEP_HOUR);
        ListExtKt.add(arrayList2, COL_SLEEP_MIN);
        ListExtKt.add(arrayList2, COL_WAKE_HOUR);
        ListExtKt.add(arrayList2, COL_WAKE_MIN);
        ListExtKt.add(arrayList2, COL_REPEAT);
    }

    private final SleepTracer getMSleepTracer() {
        return (SleepTracer) this.mSleepTracer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracer mSleepTracer_delegate$lambda$0() {
        return TraceExtKt.getInstance(SleepTracer.INSTANCE);
    }

    @NotNull
    public final Bundle callSleepTracing() {
        boolean zIsSleepTracing = getMSleepTracer().isSleepTracing();
        Bundle bundle = new Bundle();
        bundle.putBoolean(EXTRA_MAYBE_SLEEPING, zIsSleepTracing);
        return bundle;
    }

    @NotNull
    public final Bundle isSleeping() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(EXTRA_MAYBE_SLEEPING, getMSleepTracer().isMaybeSleeping());
        return bundle;
    }

    @NotNull
    public final Cursor querySleepHomePageIntent() {
        String uri = IntentHelper.INSTANCE.getRouterIntentByAction(IntentHelper.ACTION_SLEEP).toUri(0);
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put(SportRecordBundleKey.BUNDLE_PARAM_URI, uri);
        Cursor cursorA = yc5.a(arrayMap, new String[]{SportRecordBundleKey.BUNDLE_PARAM_URI});
        Intrinsics.checkNotNullExpressionValue(cursorA, "asCursor(...)");
        return cursorA;
    }

    @NotNull
    public final Cursor querySleepSchedule(@Nullable String[] projection) {
        SleepDataHelperKt.checkColumn(this.mScheduleTable, projection);
        ArrayMap arrayMap = new ArrayMap();
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        int earliestSleepHourOfDay = companion.getEarliestSleepHourOfDay();
        int earliestSleepMin = companion.getEarliestSleepMin();
        int earliestWakeHourOfDay = companion.getEarliestWakeHourOfDay();
        int earliestWakeMin = companion.getEarliestWakeMin();
        int key_repeat = SleepConfigPreference.INSTANCE.getKEY_REPEAT();
        arrayMap.put(COL_WAKE_MIN, Integer.valueOf(earliestWakeMin));
        arrayMap.put(COL_WAKE_HOUR, Integer.valueOf(earliestWakeHourOfDay));
        arrayMap.put(COL_SLEEP_MIN, Integer.valueOf(earliestSleepMin));
        arrayMap.put(COL_SLEEP_HOUR, Integer.valueOf(earliestSleepHourOfDay));
        arrayMap.put(COL_REPEAT, Integer.valueOf(key_repeat));
        Logger.i(TAG, "querySleepSchedule sleepHour=" + earliestSleepHourOfDay + "**sleepMin=" + earliestSleepMin + "**wakeHour=" + earliestWakeHourOfDay + "**wakeMin=" + earliestWakeMin + "**repeat=" + key_repeat);
        Cursor cursorA = yc5.a(arrayMap, projection);
        Intrinsics.checkNotNullExpressionValue(cursorA, "asCursor(...)");
        return cursorA;
    }

    @NotNull
    public final Cursor querySleepTraceEnable(@Nullable String[] projection) {
        if (projection != null && projection.length != 1) {
            throw new IllegalArgumentException("projection just need only 1 item".toString());
        }
        String[] strArr = projection == null ? new String[]{COL_TRACE_ENABLE} : projection;
        if (!Intrinsics.areEqual(COL_TRACE_ENABLE, strArr[0])) {
            throw new IllegalArgumentException("projection has invalidate column name");
        }
        SleepDataHelperKt.checkColumn(this.mTraceEnableTable, strArr);
        boolean zIsEnable = SleepTraceConfiguration.INSTANCE.isEnable(ApplicationExtKt.getApplication());
        Logger.i(TAG, "querySleepTraceEnable enable=" + zIsEnable);
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put(COL_TRACE_ENABLE, Integer.valueOf(zIsEnable ? 1 : 0));
        Cursor cursorA = yc5.a(arrayMap, projection);
        Intrinsics.checkNotNull(cursorA);
        return cursorA;
    }

    public final void scheduleBegin(@NotNull String arg, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(extras, "extras");
        getMSleepTracer().scheduleBegin(arg, extras);
    }

    public final void scheduleEnd(@NotNull String arg, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(extras, "extras");
        getMSleepTracer().scheduleEnd(arg, extras);
    }

    public final int updateSleepSchedule(@Nullable ContentValues values) {
        if (values == null || values.keySet().size() <= 0) {
            throw new IllegalArgumentException("values can not be null or empty".toString());
        }
        Set<String> setKeySet = values.keySet();
        int size = this.mScheduleTable.size();
        if (setKeySet.size() != size) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "values must has %d keys", Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            throw new IllegalArgumentException(str);
        }
        Intrinsics.checkNotNull(setKeySet);
        SleepDataHelperKt.checkColumn(this.mScheduleTable, setKeySet.toArray(new Object[0]));
        Integer asInteger = values.getAsInteger(COL_SLEEP_HOUR);
        Integer asInteger2 = values.getAsInteger(COL_SLEEP_MIN);
        Integer asInteger3 = values.getAsInteger(COL_WAKE_HOUR);
        Integer asInteger4 = values.getAsInteger(COL_WAKE_MIN);
        Integer asInteger5 = values.getAsInteger(COL_REPEAT);
        Logger.i(TAG, "updateSleepSchedule sleepHour=" + asInteger + "**sleepMin=" + asInteger2 + "**wakeHour=" + asInteger3 + "**wakeMin=" + asInteger4 + "**repeat=" + asInteger5);
        SleepTraceConfiguration sleepTraceConfigurationEdit = SleepTraceConfiguration.INSTANCE.edit(ApplicationExtKt.getApplication());
        Intrinsics.checkNotNull(asInteger);
        int iIntValue = asInteger.intValue();
        Intrinsics.checkNotNull(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        Intrinsics.checkNotNull(asInteger3);
        int iIntValue3 = asInteger3.intValue();
        Intrinsics.checkNotNull(asInteger4);
        sleepTraceConfigurationEdit.setSleepSchedule(iIntValue, iIntValue2, iIntValue3, asInteger4.intValue()).apply();
        int iIntValue4 = asInteger.intValue();
        int iIntValue5 = asInteger2.intValue();
        int iIntValue6 = asInteger3.intValue();
        int iIntValue7 = asInteger4.intValue();
        Intrinsics.checkNotNull(asInteger5);
        SleepDataHelperKt.updateSleepScheduleSP(iIntValue4, iIntValue5, iIntValue6, iIntValue7, asInteger5.intValue());
        return 1;
    }

    public final int updateSleepTraceEnable(@Nullable ContentValues values) {
        if (values == null || values.keySet().size() <= 0) {
            throw new IllegalArgumentException("values is null or empty".toString());
        }
        if (values.keySet().size() > 1) {
            throw new IllegalArgumentException("values has more than one key".toString());
        }
        if (!values.containsKey(COL_TRACE_ENABLE)) {
            throw new IllegalArgumentException("values has invalidate key");
        }
        Object obj = values.get(COL_TRACE_ENABLE);
        if (obj == null) {
            throw new IllegalArgumentException("the value in ContentValues cannot be null");
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        boolean z = num != null && num.intValue() == 1;
        Logger.i(TAG, "updateSleepTraceEnable enable=" + z);
        SleepTraceConfiguration.INSTANCE.edit(ApplicationExtKt.getApplication()).setEnable(z).apply();
        return 1;
    }
}
