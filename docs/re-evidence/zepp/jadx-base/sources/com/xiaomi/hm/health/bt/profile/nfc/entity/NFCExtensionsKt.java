package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000\u001a\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002\u001a\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002\u001a\u0012\u0010\u000b\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000¨\u0006\f"}, d2 = {"", "data", "", "getRecordDate", "toTimestamp", "toYMDTimestamp", TrainingWebConst.QueryParam.VIDEO_FORMAT, "toNoYearTimestamp", "dd", "toTestTimestamp", "toTest1Timestamp", "toDateString", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class NFCExtensionsKt {
    public static final long getRecordDate(@NotNull String str) {
        return m.startsWith$default(str, "0000", false, 2, null) ? toNoYearTimestamp(str.substring(4)) : toTimestamp(str);
    }

    @NotNull
    public static final String toDateString(long j, @NotNull String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j));
    }

    public static final long toNoYearTimestamp(@NotNull String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
            if (Intrinsics.areEqual(toDateString(simpleDateFormat.parse(str).getTime(), str), str)) {
                return simpleDateFormat.parse(str).getTime();
            }
            return -1L;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @NotNull
    public static final String toTest1Timestamp(long j) {
        return new SimpleDateFormat("MMddHHmmss", Locale.getDefault()).format(Long.valueOf(j));
    }

    @NotNull
    public static final String toTestTimestamp(long j) {
        return new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Long.valueOf(j));
    }

    public static final long toTimestamp(@NotNull String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
            if (Intrinsics.areEqual(toDateString(simpleDateFormat.parse(str).getTime(), str), str)) {
                return simpleDateFormat.parse(str).getTime();
            }
            return -1L;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static final long toYMDTimestamp(@NotNull String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            if (Intrinsics.areEqual(toDateString(simpleDateFormat.parse(str).getTime(), str), str)) {
                return simpleDateFormat.parse(str).getTime();
            }
            return -1L;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }
}
