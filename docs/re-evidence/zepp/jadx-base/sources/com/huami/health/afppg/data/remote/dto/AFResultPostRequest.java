package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B?\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest;", "", "", "", "", "component1", "component2", "component3", "Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;", "component4", "resultMap", "timeZone", "deviceSource", "extra", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getResultMap", "()Ljava/util/Map;", "setResultMap", "(Ljava/util/Map;)V", LogUtil.I, "getTimeZone", "()I", "setTimeZone", "(I)V", "getDeviceSource", "setDeviceSource", "Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;", "getExtra", "()Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;", "setExtra", "(Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;)V", "<init>", "(Ljava/util/Map;IILcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;)V", "ExtraData", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AFResultPostRequest {
    private int deviceSource;

    @Nullable
    private ExtraData extra;

    @Nullable
    private Map<String, Integer> resultMap;
    private int timeZone;

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/AFResultPostRequest$ExtraData;", "", "", "component1", "component2", "component3", "sn", "deviceId", "fwVer", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "setSn", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getFwVer", "setFwVer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ExtraData {

        @Nullable
        private String deviceId;

        @Nullable
        private String fwVer;

        @Nullable
        private String sn;

        public ExtraData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.sn = str;
            this.deviceId = str2;
            this.fwVer = str3;
        }

        public static /* synthetic */ ExtraData copy$default(ExtraData extraData, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = extraData.sn;
            }
            if ((i & 2) != 0) {
                str2 = extraData.deviceId;
            }
            if ((i & 4) != 0) {
                str3 = extraData.fwVer;
            }
            return extraData.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSn() {
            return this.sn;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFwVer() {
            return this.fwVer;
        }

        @NotNull
        public final ExtraData copy(@Nullable String sn, @Nullable String deviceId, @Nullable String fwVer) {
            return new ExtraData(sn, deviceId, fwVer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtraData)) {
                return false;
            }
            ExtraData extraData = (ExtraData) other;
            return Intrinsics.areEqual(this.sn, extraData.sn) && Intrinsics.areEqual(this.deviceId, extraData.deviceId) && Intrinsics.areEqual(this.fwVer, extraData.fwVer);
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final String getFwVer() {
            return this.fwVer;
        }

        @Nullable
        public final String getSn() {
            return this.sn;
        }

        public int hashCode() {
            String str = this.sn;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.deviceId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fwVer;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setDeviceId(@Nullable String str) {
            this.deviceId = str;
        }

        public final void setFwVer(@Nullable String str) {
            this.fwVer = str;
        }

        public final void setSn(@Nullable String str) {
            this.sn = str;
        }

        @NotNull
        public String toString() {
            return "ExtraData(sn=" + ((Object) this.sn) + ", deviceId=" + ((Object) this.deviceId) + ", fwVer=" + ((Object) this.fwVer) + ')';
        }
    }

    public AFResultPostRequest() {
        this(null, 0, 0, null, 15, null);
    }

    public AFResultPostRequest(@Nullable Map<String, Integer> map, int i, int i2, @Nullable ExtraData extraData) {
        this.resultMap = map;
        this.timeZone = i;
        this.deviceSource = i2;
        this.extra = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AFResultPostRequest copy$default(AFResultPostRequest aFResultPostRequest, Map map, int i, int i2, ExtraData extraData, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = aFResultPostRequest.resultMap;
        }
        if ((i3 & 2) != 0) {
            i = aFResultPostRequest.timeZone;
        }
        if ((i3 & 4) != 0) {
            i2 = aFResultPostRequest.deviceSource;
        }
        if ((i3 & 8) != 0) {
            extraData = aFResultPostRequest.extra;
        }
        return aFResultPostRequest.copy(map, i, i2, extraData);
    }

    @Nullable
    public final Map<String, Integer> component1() {
        return this.resultMap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExtraData getExtra() {
        return this.extra;
    }

    @NotNull
    public final AFResultPostRequest copy(@Nullable Map<String, Integer> resultMap, int timeZone, int deviceSource, @Nullable ExtraData extra) {
        return new AFResultPostRequest(resultMap, timeZone, deviceSource, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFResultPostRequest)) {
            return false;
        }
        AFResultPostRequest aFResultPostRequest = (AFResultPostRequest) other;
        return Intrinsics.areEqual(this.resultMap, aFResultPostRequest.resultMap) && this.timeZone == aFResultPostRequest.timeZone && this.deviceSource == aFResultPostRequest.deviceSource && Intrinsics.areEqual(this.extra, aFResultPostRequest.extra);
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final ExtraData getExtra() {
        return this.extra;
    }

    @Nullable
    public final Map<String, Integer> getResultMap() {
        return this.resultMap;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        Map<String, Integer> map = this.resultMap;
        int iHashCode = (((((map == null ? 0 : map.hashCode()) * 31) + this.timeZone) * 31) + this.deviceSource) * 31;
        ExtraData extraData = this.extra;
        return iHashCode + (extraData != null ? extraData.hashCode() : 0);
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setExtra(@Nullable ExtraData extraData) {
        this.extra = extraData;
    }

    public final void setResultMap(@Nullable Map<String, Integer> map) {
        this.resultMap = map;
    }

    public final void setTimeZone(int i) {
        this.timeZone = i;
    }

    @NotNull
    public String toString() {
        return "AFResultPostRequest(resultMap=" + this.resultMap + ", timeZone=" + this.timeZone + ", deviceSource=" + this.deviceSource + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ AFResultPostRequest(Map map, int i, int i2, ExtraData extraData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : map, (i3 & 2) != 0 ? 8 : i, (i3 & 4) != 0 ? 32 : i2, (i3 & 8) != 0 ? null : extraData);
    }
}
