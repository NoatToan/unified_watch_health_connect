package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest;", "", "", "component1", "Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest$MetaData;", "component2", "objectName", "metadata", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getObjectName", "()Ljava/lang/String;", "Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest$MetaData;", "getMetadata", "()Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest$MetaData;", "<init>", "(Ljava/lang/String;Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest$MetaData;)V", "MetaData", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RRPeakRequest {

    @NotNull
    private final MetaData metadata;

    @NotNull
    private final String objectName;

    /* JADX WARN: Multi-variable type inference failed */
    public RRPeakRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RRPeakRequest(@NotNull String str, @NotNull MetaData metaData) {
        this.objectName = str;
        this.metadata = metaData;
    }

    public static /* synthetic */ RRPeakRequest copy$default(RRPeakRequest rRPeakRequest, String str, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rRPeakRequest.objectName;
        }
        if ((i & 2) != 0) {
            metaData = rRPeakRequest.metadata;
        }
        return rRPeakRequest.copy(str, metaData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final RRPeakRequest copy(@NotNull String objectName, @NotNull MetaData metadata) {
        return new RRPeakRequest(objectName, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RRPeakRequest)) {
            return false;
        }
        RRPeakRequest rRPeakRequest = (RRPeakRequest) other;
        return Intrinsics.areEqual(this.objectName, rRPeakRequest.objectName) && Intrinsics.areEqual(this.metadata, rRPeakRequest.metadata);
    }

    @NotNull
    public final MetaData getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getObjectName() {
        return this.objectName;
    }

    public int hashCode() {
        return (this.objectName.hashCode() * 31) + this.metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "RRPeakRequest(objectName=" + this.objectName + ", metadata=" + this.metadata + ')';
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/RRPeakRequest$MetaData;", "", "", "component1", "Lcom/huami/health/afppg/data/remote/dto/RRPeakSummary;", "component2", "", "component3", "generatedTime", "value", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getGeneratedTime", "()J", "Lcom/huami/health/afppg/data/remote/dto/RRPeakSummary;", "getValue", "()Lcom/huami/health/afppg/data/remote/dto/RRPeakSummary;", LogUtil.I, "getType", "()I", "<init>", "(JLcom/huami/health/afppg/data/remote/dto/RRPeakSummary;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class MetaData {
        private final long generatedTime;
        private final int type;

        @NotNull
        private final RRPeakSummary value;

        public MetaData() {
            this(0L, null, 0, 7, null);
        }

        public MetaData(long j, @NotNull RRPeakSummary rRPeakSummary, int i) {
            this.generatedTime = j;
            this.value = rRPeakSummary;
            this.type = i;
        }

        public static /* synthetic */ MetaData copy$default(MetaData metaData, long j, RRPeakSummary rRPeakSummary, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = metaData.generatedTime;
            }
            if ((i2 & 2) != 0) {
                rRPeakSummary = metaData.value;
            }
            if ((i2 & 4) != 0) {
                i = metaData.type;
            }
            return metaData.copy(j, rRPeakSummary, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getGeneratedTime() {
            return this.generatedTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final RRPeakSummary getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        public final MetaData copy(long generatedTime, @NotNull RRPeakSummary value, int type) {
            return new MetaData(generatedTime, value, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) other;
            return this.generatedTime == metaData.generatedTime && Intrinsics.areEqual(this.value, metaData.value) && this.type == metaData.type;
        }

        public final long getGeneratedTime() {
            return this.generatedTime;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final RRPeakSummary getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((b.a(this.generatedTime) * 31) + this.value.hashCode()) * 31) + this.type;
        }

        @NotNull
        public String toString() {
            return "MetaData(generatedTime=" + this.generatedTime + ", value=" + this.value + ", type=" + this.type + ')';
        }

        public /* synthetic */ MetaData(long j, RRPeakSummary rRPeakSummary, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? new RRPeakSummary(0, 0, null, 0L, 0L, null, 0, 0, null, null, 0, 2047, null) : rRPeakSummary, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public /* synthetic */ RRPeakRequest(String str, MetaData metaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new MetaData(0L, null, 0, 7, null) : metaData);
    }
}
