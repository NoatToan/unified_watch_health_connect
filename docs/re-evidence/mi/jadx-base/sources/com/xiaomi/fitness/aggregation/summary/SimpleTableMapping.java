package com.xiaomi.fitness.aggregation.summary;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SimpleTableMapping;", "Lcom/xiaomi/fitness/aggregation/summary/TableMapping;", "tableName", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "version", "", "supportKeys", "", "otherColumns", "", "Ljava/lang/Class;", "draftTableName", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getTableName", "getDataType", "getTableVersion", "getOtherColumns", "getColumnDefault", "column", "getDraftTableName", "getSupportKeys", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleTableMapping implements TableMapping {

    @NotNull
    private final HomeDataType dataType;

    @Nullable
    private final String draftTableName;

    @NotNull
    private final Map<String, Class<?>> otherColumns;

    @NotNull
    private final List<String> supportKeys;

    @NotNull
    private final String tableName;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTableMapping(@NotNull String tableName, @NotNull HomeDataType dataType, int i, @NotNull List<String> supportKeys, @NotNull Map<String, ? extends Class<?>> otherColumns, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(supportKeys, "supportKeys");
        Intrinsics.checkNotNullParameter(otherColumns, "otherColumns");
        this.tableName = tableName;
        this.dataType = dataType;
        this.version = i;
        this.supportKeys = supportKeys;
        this.otherColumns = otherColumns;
        this.draftTableName = str;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @Nullable
    public String getColumnDefault(@NotNull String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        if (TextUtils.equals(column, FitnessDBConstants.COL_TIME_0_TZ)) {
            return String.valueOf((System.currentTimeMillis() / ((long) 1000)) + ((long) FitnessDateUtils.getCurrentTZOffsetInSec()));
        }
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getColumnDeleted() {
        return TableMapping.DefaultImpls.getColumnDeleted(this);
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getColumnKey() {
        return TableMapping.DefaultImpls.getColumnKey(this);
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getColumnSid() {
        return TableMapping.DefaultImpls.getColumnSid(this);
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getColumnTimInZero() {
        return TableMapping.DefaultImpls.getColumnTimInZero(this);
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getColumnTime() {
        return TableMapping.DefaultImpls.getColumnTime(this);
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public HomeDataType getDataType() {
        return this.dataType;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getDraftTableName() {
        String str = this.draftTableName;
        if (str == null) {
            str = this.tableName;
        }
        return "_draft_" + str;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public Map<String, Class<?>> getOtherColumns() {
        return this.otherColumns;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public List<String> getSupportKeys() {
        return this.supportKeys;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    @NotNull
    public String getTableName() {
        return this.tableName;
    }

    @Override // com.xiaomi.fitness.aggregation.summary.TableMapping
    /* JADX INFO: renamed from: getTableVersion, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    public /* synthetic */ SimpleTableMapping(String str, HomeDataType homeDataType, int i, List list, Map map, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, homeDataType, i, list, map, (i2 & 32) != 0 ? null : str2);
    }
}
