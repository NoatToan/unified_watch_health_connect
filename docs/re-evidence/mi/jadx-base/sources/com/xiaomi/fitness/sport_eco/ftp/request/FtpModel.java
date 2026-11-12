package com.xiaomi.fitness.sport_eco.ftp.request;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel;", "", "<init>", "()V", "ProxyResponse", "RespData", "FtpHistorysResult", "FtpData", "FtpSetHistoryResult", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtpModel {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpHistorysResult;", "Ljava/io/Serializable;", "ftpDatas", "", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpData;", "year", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getFtpDatas", "()Ljava/util/List;", "getYear", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FtpHistorysResult implements Serializable {

        @NotNull
        private final List<FtpData> ftpDatas;

        @NotNull
        private final String year;

        public FtpHistorysResult(@NotNull List<FtpData> ftpDatas, @NotNull String year) {
            Intrinsics.checkNotNullParameter(ftpDatas, "ftpDatas");
            Intrinsics.checkNotNullParameter(year, "year");
            this.ftpDatas = ftpDatas;
            this.year = year;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FtpHistorysResult copy$default(FtpHistorysResult ftpHistorysResult, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ftpHistorysResult.ftpDatas;
            }
            if ((i & 2) != 0) {
                str = ftpHistorysResult.year;
            }
            return ftpHistorysResult.copy(list, str);
        }

        @NotNull
        public final List<FtpData> component1() {
            return this.ftpDatas;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        @NotNull
        public final FtpHistorysResult copy(@NotNull List<FtpData> ftpDatas, @NotNull String year) {
            Intrinsics.checkNotNullParameter(ftpDatas, "ftpDatas");
            Intrinsics.checkNotNullParameter(year, "year");
            return new FtpHistorysResult(ftpDatas, year);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FtpHistorysResult)) {
                return false;
            }
            FtpHistorysResult ftpHistorysResult = (FtpHistorysResult) other;
            return Intrinsics.areEqual(this.ftpDatas, ftpHistorysResult.ftpDatas) && Intrinsics.areEqual(this.year, ftpHistorysResult.year);
        }

        @NotNull
        public final List<FtpData> getFtpDatas() {
            return this.ftpDatas;
        }

        @NotNull
        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (this.ftpDatas.hashCode() * 31) + this.year.hashCode();
        }

        @NotNull
        public String toString() {
            return "FtpHistorysResult(ftpDatas=" + this.ftpDatas + ", year=" + this.year + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpSetHistoryResult;", "Ljava/io/Serializable;", "code", "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FtpSetHistoryResult implements Serializable {

        @NotNull
        private final String code;

        public FtpSetHistoryResult(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
        }

        public static /* synthetic */ FtpSetHistoryResult copy$default(FtpSetHistoryResult ftpSetHistoryResult, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ftpSetHistoryResult.code;
            }
            return ftpSetHistoryResult.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final FtpSetHistoryResult copy(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new FtpSetHistoryResult(code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FtpSetHistoryResult) && Intrinsics.areEqual(this.code, ((FtpSetHistoryResult) other).code);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        @NotNull
        public String toString() {
            return "FtpSetHistoryResult(code=" + this.code + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$ProxyResponse;", "T", "Ljava/io/Serializable;", "code", "", "message", "", "result", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$ProxyResponse;", "equals", "", "other", "", "hashCode", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProxyResponse<T> implements Serializable {
        private int code;

        @NotNull
        private String message;

        @Nullable
        private T result;

        public ProxyResponse() {
            this(0, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProxyResponse copy$default(ProxyResponse proxyResponse, int i, String str, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = proxyResponse.code;
            }
            if ((i2 & 2) != 0) {
                str = proxyResponse.message;
            }
            if ((i2 & 4) != 0) {
                obj = proxyResponse.result;
            }
            return proxyResponse.copy(i, str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final T component3() {
            return this.result;
        }

        @NotNull
        public final ProxyResponse<T> copy(int code, @NotNull String message, @Nullable T result) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ProxyResponse<>(code, message, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProxyResponse)) {
                return false;
            }
            ProxyResponse proxyResponse = (ProxyResponse) other;
            return this.code == proxyResponse.code && Intrinsics.areEqual(this.message, proxyResponse.message) && Intrinsics.areEqual(this.result, proxyResponse.result);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final T getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31;
            T t = this.result;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setResult(@Nullable T t) {
            this.result = t;
        }

        @NotNull
        public String toString() {
            return "ProxyResponse(code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
        }

        public ProxyResponse(int i, @NotNull String message, @Nullable T t) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i;
            this.message = message;
            this.result = t;
        }

        public /* synthetic */ ProxyResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$RespData;", "Ljava/io/Serializable;", "resp", "", "<init>", "(Ljava/lang/String;)V", "getResp", "()Ljava/lang/String;", "setResp", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RespData implements Serializable {

        @NotNull
        private String resp;

        /* JADX WARN: Multi-variable type inference failed */
        public RespData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespData copy$default(RespData respData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respData.resp;
            }
            return respData.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResp() {
            return this.resp;
        }

        @NotNull
        public final RespData copy(@NotNull String resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            return new RespData(resp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RespData) && Intrinsics.areEqual(this.resp, ((RespData) other).resp);
        }

        @NotNull
        public final String getResp() {
            return this.resp;
        }

        public int hashCode() {
            return this.resp.hashCode();
        }

        public final void setResp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.resp = str;
        }

        @NotNull
        public String toString() {
            String json = new Gson().toJson(this.resp);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public RespData(@NotNull String resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            this.resp = resp;
        }

        public /* synthetic */ RespData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u001d¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpData;", "Ljava/io/Serializable;", "uid", "", "createTime", "", "ftp", "", "type", "year", "displayYear", "displaylevel", "displayTime", "displayScore", "<init>", "(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getCreateTime", "()J", "setCreateTime", "(J)V", "getFtp", "()I", "getType", "setType", "(I)V", "getYear", "setYear", "(Ljava/lang/String;)V", "getDisplayYear", "setDisplayYear", "getDisplaylevel", "setDisplaylevel", "getDisplayTime", "setDisplayTime", "getDisplayScore", "setDisplayScore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FtpData implements Serializable {

        @SerializedName("createTime")
        private long createTime;

        @NotNull
        private transient String displayScore;

        @NotNull
        private transient String displayTime;

        @NotNull
        private transient String displayYear;

        @NotNull
        private transient String displaylevel;

        @SerializedName("ftp")
        private final int ftp;
        private transient int type;

        @SerializedName("uid")
        @NotNull
        private final String uid;

        @NotNull
        private transient String year;

        public FtpData(@NotNull String uid, long j, int i, int i2, @NotNull String year, @NotNull String displayYear, @NotNull String displaylevel, @NotNull String displayTime, @NotNull String displayScore) {
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(year, "year");
            Intrinsics.checkNotNullParameter(displayYear, "displayYear");
            Intrinsics.checkNotNullParameter(displaylevel, "displaylevel");
            Intrinsics.checkNotNullParameter(displayTime, "displayTime");
            Intrinsics.checkNotNullParameter(displayScore, "displayScore");
            this.uid = uid;
            this.createTime = j;
            this.ftp = i;
            this.type = i2;
            this.year = year;
            this.displayYear = displayYear;
            this.displaylevel = displaylevel;
            this.displayTime = displayTime;
            this.displayScore = displayScore;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getCreateTime() {
            return this.createTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFtp() {
            return this.ftp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDisplayYear() {
            return this.displayYear;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getDisplaylevel() {
            return this.displaylevel;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getDisplayTime() {
            return this.displayTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getDisplayScore() {
            return this.displayScore;
        }

        @NotNull
        public final FtpData copy(@NotNull String uid, long createTime, int ftp, int type, @NotNull String year, @NotNull String displayYear, @NotNull String displaylevel, @NotNull String displayTime, @NotNull String displayScore) {
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(year, "year");
            Intrinsics.checkNotNullParameter(displayYear, "displayYear");
            Intrinsics.checkNotNullParameter(displaylevel, "displaylevel");
            Intrinsics.checkNotNullParameter(displayTime, "displayTime");
            Intrinsics.checkNotNullParameter(displayScore, "displayScore");
            return new FtpData(uid, createTime, ftp, type, year, displayYear, displaylevel, displayTime, displayScore);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FtpData)) {
                return false;
            }
            FtpData ftpData = (FtpData) other;
            return Intrinsics.areEqual(this.uid, ftpData.uid) && this.createTime == ftpData.createTime && this.ftp == ftpData.ftp && this.type == ftpData.type && Intrinsics.areEqual(this.year, ftpData.year) && Intrinsics.areEqual(this.displayYear, ftpData.displayYear) && Intrinsics.areEqual(this.displaylevel, ftpData.displaylevel) && Intrinsics.areEqual(this.displayTime, ftpData.displayTime) && Intrinsics.areEqual(this.displayScore, ftpData.displayScore);
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        @NotNull
        public final String getDisplayScore() {
            return this.displayScore;
        }

        @NotNull
        public final String getDisplayTime() {
            return this.displayTime;
        }

        @NotNull
        public final String getDisplayYear() {
            return this.displayYear;
        }

        @NotNull
        public final String getDisplaylevel() {
            return this.displaylevel;
        }

        public final int getFtp() {
            return this.ftp;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (((((((((((((((this.uid.hashCode() * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.ftp)) * 31) + Integer.hashCode(this.type)) * 31) + this.year.hashCode()) * 31) + this.displayYear.hashCode()) * 31) + this.displaylevel.hashCode()) * 31) + this.displayTime.hashCode()) * 31) + this.displayScore.hashCode();
        }

        public final void setCreateTime(long j) {
            this.createTime = j;
        }

        public final void setDisplayScore(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.displayScore = str;
        }

        public final void setDisplayTime(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.displayTime = str;
        }

        public final void setDisplayYear(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.displayYear = str;
        }

        public final void setDisplaylevel(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.displaylevel = str;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setYear(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.year = str;
        }

        @NotNull
        public String toString() {
            return "FtpData(uid=" + this.uid + ", createTime=" + this.createTime + ", ftp=" + this.ftp + ", type=" + this.type + ", year=" + this.year + ", displayYear=" + this.displayYear + ", displaylevel=" + this.displaylevel + ", displayTime=" + this.displayTime + ", displayScore=" + this.displayScore + ")";
        }

        public /* synthetic */ FtpData(String str, long j, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, i, (i3 & 8) != 0 ? 1 : i2, str2, str3, str4, str5, str6);
        }
    }
}
