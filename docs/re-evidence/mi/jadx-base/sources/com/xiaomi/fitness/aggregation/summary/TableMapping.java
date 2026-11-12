package com.xiaomi.fitness.aggregation.summary;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0003H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/TableMapping;", "", "getTableName", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTableVersion", "", "getColumnSid", "getColumnKey", "getSupportKeys", "", "getColumnTime", "getColumnTimInZero", "getColumnDeleted", "getOtherColumns", "", "Ljava/lang/Class;", "getDraftTableName", "getColumnDefault", "column", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TableMapping {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getColumnDeleted(@NotNull TableMapping tableMapping) {
            return "isDeleted";
        }

        @NotNull
        public static String getColumnKey(@NotNull TableMapping tableMapping) {
            return "key";
        }

        @NotNull
        public static String getColumnSid(@NotNull TableMapping tableMapping) {
            return "sid";
        }

        @NotNull
        public static String getColumnTimInZero(@NotNull TableMapping tableMapping) {
            return FitnessDBConstants.COL_TIME_0_TZ;
        }

        @NotNull
        public static String getColumnTime(@NotNull TableMapping tableMapping) {
            return "time";
        }

        @NotNull
        public static Map<String, Class<?>> getOtherColumns(@NotNull TableMapping tableMapping) {
            return MapsKt__MapsKt.emptyMap();
        }

        @NotNull
        public static List<String> getSupportKeys(@NotNull TableMapping tableMapping) {
            List<String> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }

        public static int getTableVersion(@NotNull TableMapping tableMapping) {
            return 1;
        }
    }

    @Nullable
    String getColumnDefault(@NotNull String column);

    @NotNull
    String getColumnDeleted();

    @NotNull
    String getColumnKey();

    @NotNull
    String getColumnSid();

    @NotNull
    String getColumnTimInZero();

    @NotNull
    String getColumnTime();

    @NotNull
    HomeDataType getDataType();

    @NotNull
    String getDraftTableName();

    @NotNull
    Map<String, Class<?>> getOtherColumns();

    @NotNull
    List<String> getSupportKeys();

    @NotNull
    String getTableName();

    int getTableVersion();
}
