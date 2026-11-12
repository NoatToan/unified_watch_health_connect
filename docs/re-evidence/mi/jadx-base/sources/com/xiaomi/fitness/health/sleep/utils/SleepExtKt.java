package com.xiaomi.fitness.health.sleep.utils;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011\u001a\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011\u001a\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"TAG", "", "jumpUnderstandSleepPage", "", "context", "Landroid/content/Context;", "getSleepAccurateEvaluation", "score", "", "getSleepShortEvaluation", "getSleepTimeRangeStr", "bedTime", "", "wakeupTime", "getTimeStr", Source.TIME_SECOND, "filterAndSortSleepNew", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "filterAndSortSleepLong", "filterAndSortSleepShort", "getSidName", "sid", "getSidNameAndType", "Lkotlin/Pair;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n774#2:142\n865#2,2:143\n774#2:145\n865#2,2:146\n774#2:148\n865#2,2:149\n*S KotlinDebug\n*F\n+ 1 SleepExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepExtKt\n*L\n92#1:142\n92#1:143,2\n95#1:145\n95#1:146,2\n98#1:148\n98#1:149,2\n*E\n"})
public final class SleepExtKt {

    @NotNull
    public static final String TAG = "SleepExt";

    @NotNull
    public static final List<SleepSegmentReport> filterAndSortSleepLong(@NotNull List<SleepSegmentReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SleepSegmentReport) obj).getSleepDuration() >= 180) {
                arrayList.add(obj);
            }
        }
        final Function2 function2 = new Function2() { // from class: hmm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(SleepExtKt.filterAndSortSleepLong$lambda$4((SleepSegmentReport) obj2, (SleepSegmentReport) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: imm
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return SleepExtKt.filterAndSortSleepLong$lambda$5(function2, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepLong$lambda$4(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        Intrinsics.checkNotNull(sleepSegmentReport);
        return sleepSegmentReport2.compareTo(sleepSegmentReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepLong$lambda$5(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public static final List<SleepSegmentReport> filterAndSortSleepNew(@NotNull List<SleepSegmentReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SleepSegmentReport) obj).getSleepDuration() >= 180) {
                arrayList.add(obj);
            }
        }
        final Function2 function2 = new Function2() { // from class: lmm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(SleepExtKt.filterAndSortSleepNew$lambda$1((SleepSegmentReport) obj2, (SleepSegmentReport) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: mmm
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return SleepExtKt.filterAndSortSleepNew$lambda$2(function2, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepNew$lambda$1(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        Intrinsics.checkNotNull(sleepSegmentReport);
        return sleepSegmentReport2.compareTo(sleepSegmentReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepNew$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public static final List<SleepSegmentReport> filterAndSortSleepShort(@NotNull List<SleepSegmentReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SleepSegmentReport) obj).getSleepDuration() < 180) {
                arrayList.add(obj);
            }
        }
        final Function2 function2 = new Function2() { // from class: jmm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(SleepExtKt.filterAndSortSleepShort$lambda$7((SleepSegmentReport) obj2, (SleepSegmentReport) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: kmm
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return SleepExtKt.filterAndSortSleepShort$lambda$8(function2, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepShort$lambda$7(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        Intrinsics.checkNotNull(sleepSegmentReport);
        return sleepSegmentReport2.compareTo(sleepSegmentReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filterAndSortSleepShort$lambda$8(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    @Nullable
    public static final String getSidName(@Nullable String str) {
        String name;
        if (str == null || str.length() == 0) {
            name = null;
        } else if (Intrinsics.areEqual(str, "xiaomiwear_app_manually")) {
            name = ExtUtilKt.getString(c0j.D);
        } else {
            DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(str);
            if (deviceInfoInAll != null) {
                name = deviceInfoInAll.getName();
            } else {
                name = null;
            }
        }
        Logger.i(TAG, "getSidName sid " + str + ";name " + name);
        return name;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Nullable
    public static final Pair<String, String> getSidNameAndType(@Nullable String str) {
        Pair<String, String> pair;
        String smallIcon;
        if (str == null || str.length() == 0) {
            pair = null;
        } else if (Intrinsics.areEqual(str, "xiaomiwear_app_manually")) {
            pair = new Pair<>(str, ExtUtilKt.getString(c0j.D));
        } else {
            DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(str);
            if (deviceInfoInAll != null) {
                Product product = deviceInfoInAll.getProduct();
                if (product == null || (smallIcon = product.getSmallIcon()) == null) {
                    smallIcon = "";
                }
                pair = new Pair<>(smallIcon, deviceInfoInAll.getName());
            } else {
                pair = null;
            }
        }
        Logger.i(TAG, "getSidName sid " + str + ";pair " + pair);
        return pair;
    }

    @NotNull
    public static final String getSleepAccurateEvaluation(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (i < 60) {
            String string = context.getString(c0j.Rh);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (i < 80) {
            String string2 = context.getString(c0j.Ph);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i < 90) {
            String string3 = context.getString(c0j.Qh);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = context.getString(c0j.Oh);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    @NotNull
    public static final String getSleepShortEvaluation(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (i < 60) {
            String string = context.getString(c0j.Wh);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (i < 80) {
            String string2 = context.getString(c0j.Uh);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i < 90) {
            String string3 = context.getString(c0j.Vh);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = context.getString(c0j.Th);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    @NotNull
    public static final String getSleepTimeRangeStr(@NotNull Context context, long j, long j2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        long j3 = 1000;
        long j4 = j * j3;
        long j5 = j3 * j2;
        if (!TimeUtils.INSTANCE.isSameDay(j4, j5)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s - %s", Arrays.copyOf(new Object[]{getTimeStr(context, j), getTimeStr(context, j2)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (TimeDateUtil.isToday(TimeDateUtil.changZeroOfTheDay(j))) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s %s - %s", Arrays.copyOf(new Object[]{context.getString(c0j.v5), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j4)), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j5))}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format("%s %s - %s", Arrays.copyOf(new Object[]{TimeUtils.formatDate("MM/dd", Long.valueOf(j4)), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j4)), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j5))}, 3));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    private static final String getTimeStr(Context context, long j) {
        if (TimeDateUtil.isToday(TimeDateUtil.changZeroOfTheDay(j))) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(c0j.v5), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j * ((long) 1000)))}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (Intrinsics.areEqual(new LocalDate().minusDays(1), TimeDateUtil.timestampToLocalDate(j))) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(c0j.dr), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j * ((long) 1000)))}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        long j2 = j * ((long) 1000);
        String str3 = String.format("%s %s", Arrays.copyOf(new Object[]{TimeUtils.formatDate("MM/dd", Long.valueOf(j2)), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j2))}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    public static final void jumpUnderstandSleepPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), context.getString(c0j.Ck), false, false, null, false, null, false, 252, null);
    }
}
