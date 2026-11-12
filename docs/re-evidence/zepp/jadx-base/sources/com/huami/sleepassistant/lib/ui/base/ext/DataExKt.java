package com.huami.sleepassistant.lib.ui.base.ext;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\f\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000\u001a\u0013\u0010\u0001\u001a\u00020\u0002*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0001\u0010\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0001\u0010\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0006*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0001\u0010\u0007\u001a%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0002\"\u0016\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012\"\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012\"\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012\"\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012\"\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012\"\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0012¨\u0006\""}, d2 = {"", "toNoNull", "", "(Ljava/lang/Integer;)I", "", "(Ljava/lang/Long;)J", "", "(Ljava/lang/Boolean;)Z", "value", "Lkotlin/Pair;", "smartNumber", "(Ljava/lang/Long;)Lkotlin/Pair;", "len", "(Ljava/lang/Long;I)Lkotlin/Pair;", "number", "smartNumberV2", "a", "formatBase", LogUtil.I, "FORMAT_BASE_T", "b", "ONE", "c", "TWO", GoogleApiAvailabilityLight.a, "THREE", "e", "FOUR", "f", "FIVE", "g", "SIX", "h", "SEVEN", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class DataExKt {
    private static final int a = 10000;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    public static final int formatBase = 10000;
    private static final int g = 6;
    private static final int h = 7;

    private static final String a(long j) {
        float f2 = (j * 1.0f) / 10000;
        if (f2 - (j / ((long) 10000)) > 0.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.CHINESE, "%.1fw", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format(Locale.CHINESE, "%.0fw", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
    }

    @NotNull
    public static final Pair<Boolean, String> smartNumber(@Nullable Long l) {
        return smartNumber(l, 2);
    }

    @NotNull
    public static final String smartNumberV2(long j) {
        switch (String.valueOf(j).length()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return String.valueOf(j);
            case 5:
                return a(j);
            case 6:
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(j / ((long) 10000));
                sb.append('w');
                return sb.toString();
            default:
                return "999w+";
        }
    }

    public static final int toNoNull(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @NotNull
    public static final String toNoNull(@Nullable String str) {
        return str == null ? "" : str;
    }

    @NotNull
    public static final Pair<Boolean, String> smartNumber(@Nullable Long l, int i) {
        if (l == null) {
            return new Pair<>(Boolean.FALSE, "");
        }
        if (l.longValue() <= 10000) {
            return new Pair<>(Boolean.FALSE, String.valueOf(l));
        }
        Boolean bool = Boolean.TRUE;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Pair<>(bool, String.format(Locale.CHINESE, "%." + i + 'f', Arrays.copyOf(new Object[]{Float.valueOf((l.longValue() * 1.0f) / 10000)}, 1)));
    }

    public static final long toNoNull(@Nullable Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final boolean toNoNull(@Nullable Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
