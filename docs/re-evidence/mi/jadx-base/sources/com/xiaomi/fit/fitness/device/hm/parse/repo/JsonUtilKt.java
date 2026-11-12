package com.xiaomi.fit.fitness.device.hm.parse.repo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000b\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0010\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013¨\u0006\u0016"}, d2 = {"obtainInt", "", "Lorg/json/JSONObject;", "key", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "obtainValidInt", "obtainIntFormStr", "obtainIntReturnNotNull", "obtainFloat", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "obtainLong", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "obtainFloatFromInt", "obtainLongReturnNotNull", "obtainDouble", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "obtainValidDouble", "obtainDoubleFromStr", "fitness-sync_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonUtilKt {
    @Nullable
    public static final Double obtainDouble(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return Double.valueOf(jSONObject.optDouble(key));
        }
        return null;
    }

    @Nullable
    public static final Double obtainDoubleFromStr(@NotNull JSONObject jSONObject, @NotNull String key) {
        String strOptString;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jSONObject.has(key) || (strOptString = jSONObject.optString(key)) == null || strOptString.length() == 0) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(strOptString));
    }

    @Nullable
    public static final Float obtainFloat(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return Float.valueOf((float) jSONObject.optDouble(key));
        }
        return null;
    }

    @Nullable
    public static final Float obtainFloatFromInt(@NotNull JSONObject jSONObject, @NotNull String key) {
        int iOptInt;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key) && (iOptInt = jSONObject.optInt(key)) > 0) {
            return Float.valueOf(iOptInt);
        }
        return null;
    }

    @Nullable
    public static final Integer obtainInt(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return Integer.valueOf(jSONObject.optInt(key));
        }
        return null;
    }

    @Nullable
    public static final Integer obtainIntFormStr(@NotNull JSONObject jSONObject, @NotNull String key) {
        String strOptString;
        int i;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key) && (strOptString = jSONObject.optString(key)) != null && strOptString.length() != 0 && (i = Integer.parseInt(strOptString)) > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public static final int obtainIntReturnNotNull(@NotNull JSONObject jSONObject, @NotNull String key) {
        String strOptString;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jSONObject.has(key) || (strOptString = jSONObject.optString(key)) == null || strOptString.length() == 0) {
            return 0;
        }
        return Integer.parseInt(strOptString);
    }

    @Nullable
    public static final Long obtainLong(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return Long.valueOf(jSONObject.optLong(key));
        }
        return null;
    }

    public static final long obtainLongReturnNotNull(@NotNull JSONObject jSONObject, @NotNull String key) {
        String strOptString;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jSONObject.has(key) || (strOptString = jSONObject.optString(key)) == null || strOptString.length() == 0) {
            return 0L;
        }
        return Long.parseLong(strOptString);
    }

    @Nullable
    public static final Double obtainValidDouble(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jSONObject.has(key)) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble(key);
        if (dOptDouble > 0.0d) {
            return Double.valueOf(dOptDouble);
        }
        return null;
    }

    @Nullable
    public static final Integer obtainValidInt(@NotNull JSONObject jSONObject, @NotNull String key) {
        int iOptInt;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key) && (iOptInt = jSONObject.optInt(key)) > 0) {
            return Integer.valueOf(iOptInt);
        }
        return null;
    }
}
