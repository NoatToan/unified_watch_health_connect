package com.huami.ecg.core.web;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.model.BioIdFeedback;
import com.huami.ecg.core.model.EcgCloudData;
import com.huami.ecg.core.model.EcgWebUrlKey;
import com.huami.ecg.core.model.SeniorInterpretOrg;
import com.huami.ecg.core.model.SeniorInterpretResult;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.http.ConverterKt;
import com.huami.http.GsonConverter;
import com.huami.http.HttpError;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.interceptor.CurlInterceptor;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u00020\u0001:\u0006DCEFGHB\u0007¢\u0006\u0004\bA\u0010BJ\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\tH\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u0004H\u0082\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016JJ\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\u001e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0002J\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020%J\u0010\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020)J\u0018\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-J\u0018\u00102\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004J\u0018\u00102\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)J \u00102\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-J,\u00105\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004J$\u00107\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u0004J\u001a\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u0002082\b\b\u0002\u00104\u001a\u00020\u0004J \u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010\u0016¨\u0006I"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi;", "Lcom/huami/ecg/core/web/BaseEcgWebApi;", "Lcom/huami/ecg/core/db/entity/EcgData;", "", "", "", "c", "a", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/Response;", "b", "(Lokhttp3/Response;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "startTime", "endTime", "", "limit", "userId", "", "apps", "", "forward", "Lcom/huami/ecg/core/model/EcgCloudData;", "getEcgList", "timestamp", "measureContentType", EcgData.GROUP_ID, "deleteEcg", EcgAnalyticsManagerKt.ECG, "rawFile", "uploadEcg", "updateEcg", "updateBioIdFeedback", "Lcom/huami/ecg/core/db/entity/EcgTag;", "getEcgTagList", "ecgTag", "saveEcgTag", "Ljava/io/File;", "file", "uploadVoiceTag", "fileName", "", "fileData", "type", "filePath", "Lcom/huami/ecg/core/web/EcgWebApi$UploadUri;", "uploadFile", "fileType", "appName", "getFileUri", "timeStamp", "getEcgRawUrl", "Lcom/huami/ecg/core/model/EcgWebUrlKey;", "key", "Lcom/huami/ecg/core/web/EcgWebApi$EcgAnalysisUrlData;", "getEcgWebUrl", "orgId", "Lcom/huami/ecg/core/model/SeniorInterpretResult;", "getEcgSeniorAnalysisResult", "Lcom/huami/ecg/core/model/SeniorInterpretOrg;", "getEcgSeniorAnalysisOrgList", "<init>", "()V", "Companion", "BaseListResultModel", "EcgAnalysisUrlData", "EcgRawUrlData", "StateTags", "UploadUri", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgWebApi implements BaseEcgWebApi {
    private static final String a = "EcgWebApi";
    private static final String b = "ECG_TAG";
    private static final String c = "ECG_HEALTH_DATA";
    private static final String d = "VOICE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy e = LazyKt__LazyJVMKt.lazy(b.a);
    private static final Lazy f = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$BaseListResultModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "", "b", LogUtil.I, "getNext", "()I", "setNext", "(I)V", "next", "<init>", "(Lcom/huami/ecg/core/web/EcgWebApi;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public final class BaseListResultModel<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("items")
        @Nullable
        private List<? extends T> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("next")
        private int next;

        public BaseListResultModel() {
        }

        @Nullable
        public final List<T> getItems() {
            return this.items;
        }

        public final int getNext() {
            return this.next;
        }

        public final void setItems(@Nullable List<? extends T> list) {
            this.items = list;
        }

        public final void setNext(int i) {
            this.next = i;
        }

        @NotNull
        public String toString() {
            return "BaseListResultModel(items=" + this.items + ", next=" + this.next + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$Companion;", "", "Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "b", "()Lokhttp3/OkHttpClient;", "httpClient", "Lcom/huami/http/GsonConverter;", "converter$delegate", "a", "()Lcom/huami/http/GsonConverter;", "converter", "", "FILE_TYPE_ECG", "Ljava/lang/String;", "FILE_TYPE_VOICE", "TAG", "TAG_TYPE", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GsonConverter a() {
            Lazy lazy = EcgWebApi.f;
            Companion companion = EcgWebApi.INSTANCE;
            return (GsonConverter) lazy.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkHttpClient b() {
            Lazy lazy = EcgWebApi.e;
            Companion companion = EcgWebApi.INSTANCE;
            return (OkHttpClient) lazy.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$EcgAnalysisUrlData;", "", "", "component1", "component2", "url", "id", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "getId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class EcgAnalysisUrlData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("url")
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("id")
        @NotNull
        private final String id;

        public EcgAnalysisUrlData(@NotNull String str, @NotNull String str2) {
            this.url = str;
            this.id = str2;
        }

        public static /* synthetic */ EcgAnalysisUrlData copy$default(EcgAnalysisUrlData ecgAnalysisUrlData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecgAnalysisUrlData.url;
            }
            if ((i & 2) != 0) {
                str2 = ecgAnalysisUrlData.id;
            }
            return ecgAnalysisUrlData.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final EcgAnalysisUrlData copy(@NotNull String url, @NotNull String id) {
            return new EcgAnalysisUrlData(url, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EcgAnalysisUrlData)) {
                return false;
            }
            EcgAnalysisUrlData ecgAnalysisUrlData = (EcgAnalysisUrlData) other;
            return Intrinsics.areEqual(this.url, ecgAnalysisUrlData.url) && Intrinsics.areEqual(this.id, ecgAnalysisUrlData.id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.id;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "EcgAnalysisUrlData(url=" + this.url + ", id=" + this.id + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0012\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$EcgRawUrlData;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "", "b", "J", "getGeneratedTime", "()J", "setGeneratedTime", "(J)V", "generatedTime", "c", "getRawDataUri", "setRawDataUri", "rawDataUri", GoogleApiAvailabilityLight.a, "getUpdateTime", "setUpdateTime", EcgData.TIMESTAMP_SERVER_UPDATED, "<init>", "(Lcom/huami/ecg/core/web/EcgWebApi;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public final class EcgRawUrlData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("type")
        @Nullable
        private String type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("generatedTime")
        private long generatedTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName(EcgData.SERVER_RAW_FILE_PATH)
        @Nullable
        private String rawDataUri;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
        private long updateTime;

        public EcgRawUrlData() {
        }

        public final long getGeneratedTime() {
            return this.generatedTime;
        }

        @Nullable
        public final String getRawDataUri() {
            return this.rawDataUri;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final long getUpdateTime() {
            return this.updateTime;
        }

        public final void setGeneratedTime(long j) {
            this.generatedTime = j;
        }

        public final void setRawDataUri(@Nullable String str) {
            this.rawDataUri = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUpdateTime(long j) {
            this.updateTime = j;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$StateTags;", "", "Lcom/huami/ecg/core/db/entity/EcgTag;", "toEcgTag", "", "a", "J", "getGeneratedTime", "()J", "setGeneratedTime", "(J)V", "generatedTime", "", "b", "Ljava/lang/String;", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "summary", "c", "getType", "setType", "type", GoogleApiAvailabilityLight.a, "getUserId", "setUserId", "userId", "<init>", "(Lcom/huami/ecg/core/web/EcgWebApi;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public final class StateTags {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("generatedTime")
        private long generatedTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("summary")
        @Nullable
        private String summary;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("type")
        @Nullable
        private String type;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("userId")
        @Nullable
        private String userId;

        public StateTags() {
        }

        public final long getGeneratedTime() {
            return this.generatedTime;
        }

        @Nullable
        public final String getSummary() {
            return this.summary;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public final void setGeneratedTime(long j) {
            this.generatedTime = j;
        }

        public final void setSummary(@Nullable String str) {
            this.summary = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUserId(@Nullable String str) {
            this.userId = str;
        }

        @NotNull
        public final EcgTag toEcgTag() {
            EcgTag ecgTag = new EcgTag();
            ecgTag.setEcgId(this.generatedTime);
            ecgTag.setSynced(1);
            String str = this.summary;
            if (str != null) {
                try {
                    ecgTag.setValue((EcgTagValue) new Gson().fromJson(str, EcgTagValue.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ecgTag;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi$UploadUri;", "", "", "a", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "fileName", "b", "getFileType", "setFileType", "fileType", "c", "getGetUri", "setGetUri", "getUri", GoogleApiAvailabilityLight.a, "getObjectName", "setObjectName", "objectName", "e", "getPutUri", "setPutUri", "putUri", "", "f", LogUtil.I, "getUpdateTime", "()I", "setUpdateTime", "(I)V", EcgData.TIMESTAMP_SERVER_UPDATED, "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class UploadUri {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("fileName")
        @NotNull
        private String fileName = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("fileType")
        @NotNull
        private String fileType = "";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("getURI")
        @NotNull
        private String getUri = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("objectName")
        @NotNull
        private String objectName = "";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("putURI")
        @NotNull
        private String putUri = "";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
        private int updateTime;

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        public final String getFileType() {
            return this.fileType;
        }

        @NotNull
        public final String getGetUri() {
            return this.getUri;
        }

        @NotNull
        public final String getObjectName() {
            return this.objectName;
        }

        @NotNull
        public final String getPutUri() {
            return this.putUri;
        }

        public final int getUpdateTime() {
            return this.updateTime;
        }

        public final void setFileName(@NotNull String str) {
            this.fileName = str;
        }

        public final void setFileType(@NotNull String str) {
            this.fileType = str;
        }

        public final void setGetUri(@NotNull String str) {
            this.getUri = str;
        }

        public final void setObjectName(@NotNull String str) {
            this.objectName = str;
        }

        public final void setPutUri(@NotNull String str) {
            this.putUri = str;
        }

        public final void setUpdateTime(int i) {
            this.updateTime = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/http/GsonConverter;", "a", "()Lcom/huami/http/GsonConverter;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<GsonConverter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GsonConverter invoke() {
            return GsonConverter.Companion.create$default(GsonConverter.INSTANCE, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "a", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<OkHttpClient> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).addInterceptor(new CurlInterceptor(null, 1, null)).addInterceptor(new ResponseLogInterceptor()).build();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "删除Ecg失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BaseListResultModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BaseListResultModel baseListResultModel) {
            super(0);
            this.a = baseListResultModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "读取Ecg 列表，result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "读取ecg列表失败，responseCode:" + this.a.code();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "读取ecg列表失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取ECG RAW URL失败, timestamp:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取Ecg 高级诊断机构列表：" + TextUtils.join(",", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("读取Ecg 高级诊断结果失败，code:");
            sb.append(this.a.code());
            sb.append(", message:");
            ResponseBody responseBodyBody = this.a.body();
            sb.append(responseBodyBody != null ? responseBodyBody.string() : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取Ecg 高级诊断机构列表失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ SeniorInterpretResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(SeniorInterpretResult seniorInterpretResult) {
            super(0);
            this.a = seniorInterpretResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取Ecg 高级诊断结果:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("读取Ecg 高级诊断结果失败，code:");
            sb.append(this.a.code());
            sb.append(", message:");
            ResponseBody responseBodyBody = this.a.body();
            sb.append(responseBodyBody != null ? responseBodyBody.string() : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取Ecg 高级诊断数据失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取ecg tag 列表失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgWebUrlKey a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EcgWebUrlKey ecgWebUrlKey) {
            super(0);
            this.a = ecgWebUrlKey;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取ECG WEB URL失败, key:" + this.a.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "获取文件uri失败, fileType:" + this.a + ", fileName:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "保存ecg tag失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "上传ecg数据失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "上传ecg数据失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/ecg/core/web/EcgWebApi$uploadEcg$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ UploadUri b;
        public final /* synthetic */ EcgWebApi c;
        public final /* synthetic */ EcgData d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z, UploadUri uploadUri, EcgWebApi ecgWebApi, EcgData ecgData) {
            super(0);
            this.a = z;
            this.b = uploadUri;
            this.c = ecgWebApi;
            this.d = ecgData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "upload ecg info result:" + this.a + ", objectName:" + this.b.getObjectName() + ", ecgId:" + this.d.getTimestamp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "上传ecg数据失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/ecg/core/web/EcgWebApi$uploadFile$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(byte[] bArr, String str) {
            super(0);
            this.b = bArr;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "upload file:" + this.c + " success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "上传文件失败, fileName:" + this.a;
        }
    }

    private final Map<String, Object> a(@NotNull EcgData ecgData) {
        HashMap map = new HashMap();
        map.put("generatedTime", Long.valueOf(ecgData.getTimestamp()));
        map.put("type", ecgData.getMeasureContentType());
        BioIdFeedback bioIdFeedback = ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String();
        if (bioIdFeedback != null) {
            map.put(EcgData.BIOID_FEEDBACK, bioIdFeedback);
        }
        return map;
    }

    private final /* synthetic */ <T> T b(@NotNull Response response) throws HttpError {
        if (!response.isSuccessful()) {
            throw new HttpError(response);
        }
        ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
        GsonConverter gsonConverterA = INSTANCE.a();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.needClassReification();
        return (T) gsonConverterA.convert(responseBodyBody, new TypeToken<T>() { // from class: com.huami.ecg.core.web.EcgWebApi$deserializeOrThrow$$inlined$genericType$8
        }.getType());
    }

    private final Map<String, Object> c(@NotNull EcgData ecgData) {
        HashMap map = new HashMap(23);
        map.put("deviceSource", Integer.valueOf(ecgData.getDeviceSource()));
        map.put("generatedTime", Long.valueOf(ecgData.getTimestamp()));
        map.put("timeZone", ecgData.getTimeZone());
        map.put("type", ecgData.getMeasureContentType());
        map.put(EcgData.GROUP_ID, Long.valueOf(ecgData.getCom.huami.ecg.core.db.entity.EcgData.GROUP_ID java.lang.String()));
        map.put(EcgData.BIOID_MATCHED_TYPE, ecgData.getBioIdMatchedType());
        BioIdFeedback bioIdFeedback = ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String();
        if (bioIdFeedback != null) {
            map.put(EcgData.BIOID_FEEDBACK, bioIdFeedback);
        }
        map.put(EcgData.MEASURE_STATE, ecgData.getCom.huami.ecg.core.db.entity.EcgData.MEASURE_STATE java.lang.String());
        map.put("online", Integer.valueOf(ecgData.getMeasureMethodType()));
        map.put(EcgData.USER_ATTENTION, Integer.valueOf(ecgData.getUserAttention()));
        map.put(EcgData.IS_CONTAIN_PPG, Integer.valueOf(ecgData.getMIsContainPPG()));
        map.put(EcgData.MEASURE_POSTURE, ecgData.getMeasurePosture());
        map.put(EcgData.WEAR_POSITION, ecgData.getWearPosition());
        map.put(EcgData.SAMPLE_RATE, Integer.valueOf(ecgData.getSampleRate()));
        map.put(EcgData.MEASURE_SECOND, Long.valueOf(ecgData.getMeasureSecond()));
        map.put(EcgData.RESULT_DATA, ecgData.getEcgResultData());
        map.put(EcgData.ERROR_CODE, Integer.valueOf(ecgData.getMErrorCode()));
        map.put(EcgData.APP_NAME, ecgData.getMSourceAppName());
        map.put(EcgData.TIMESTAMP_SERVER_UPDATED, Long.valueOf(ecgData.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_LOCAL_UPDATED java.lang.String()));
        map.put("deviceId", ecgData.getDeviceId());
        map.put("sn", ecgData.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.deviceSn java.lang.String());
        return map;
    }

    private final /* synthetic */ <T> T d(@NotNull String str) {
        Gson gson = new Gson();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.ecg.core.web.EcgWebApi$fromJsonOrThrow$$inlined$genericType$2
        }.getType());
    }

    public static /* synthetic */ String getEcgRawUrl$default(EcgWebApi ecgWebApi, long j2, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        if ((i2 & 4) != 0) {
            str2 = MeasureContentType.HEART;
        }
        return ecgWebApi.getEcgRawUrl(j2, str, str2);
    }

    public static /* synthetic */ EcgAnalysisUrlData getEcgWebUrl$default(EcgWebApi ecgWebApi, EcgWebUrlKey ecgWebUrlKey, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().appName();
        }
        return ecgWebApi.getEcgWebUrl(ecgWebUrlKey, str);
    }

    public static /* synthetic */ UploadUri getFileUri$default(EcgWebApi ecgWebApi, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = EcgCore.INSTANCE.getAppName();
        }
        if ((i2 & 8) != 0) {
            str4 = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return ecgWebApi.getFileUri(str, str2, str3, str4);
    }

    @Override // com.huami.ecg.core.web.BaseEcgWebApi, com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return BaseEcgWebApi.DefaultImpls.baseUrl(this);
    }

    public final boolean deleteEcg(long timestamp, @NotNull String measureContentType, long groupId) {
        Map<String, String> mapParam = param();
        mapParam.put("type", measureContentType);
        mapParam.put("generatedTime", String.valueOf(timestamp));
        if (groupId >= 0) {
            mapParam.put(EcgData.GROUP_ID, String.valueOf(groupId));
        }
        try {
            return HttpKitKtxKt.httpDelete(this, EcgWebUtil.INSTANCE.urlEcg(EcgCore.INSTANCE.getWebSetting().userId()), RequestBody.create(MediaType.parse("application/json"), ""), mapParam, headerJson()).isSuccessful();
        } catch (Exception e2) {
            HMLog.warn(a, e2, c.a);
            return false;
        }
    }

    @Nullable
    public final List<EcgCloudData> getEcgList(long startTime, long endTime, int limit, @NotNull String userId, @NotNull List<String> apps, boolean forward) {
        Map<String, String> mapParam = param();
        mapParam.put("queryType", "DETAIL");
        mapParam.put("additions", "TAG");
        mapParam.put("limit", String.valueOf(limit));
        mapParam.put("startTime", String.valueOf(startTime));
        mapParam.put("endTime", String.valueOf(endTime));
        mapParam.put("isForward", String.valueOf(forward));
        mapParam.put("generateAppNames", TextUtils.join(",", apps));
        try {
            EcgCore ecgCore = EcgCore.INSTANCE;
            Response responseHttpGet = HttpKitKtxKt.httpGet(this, Intrinsics.areEqual(userId, ecgCore.getWebSetting().userId()) ? EcgWebUtil.INSTANCE.urlEcg(userId) : EcgWebUtil.INSTANCE.urlEcgFollowee(ecgCore.getWebSetting().userId(), userId), mapParam, header());
            if (!responseHttpGet.isSuccessful()) {
                HMLog.info(a, new e(responseHttpGet));
                return null;
            }
            if (!responseHttpGet.isSuccessful()) {
                throw new HttpError(responseHttpGet);
            }
            ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            BaseListResultModel baseListResultModel = (BaseListResultModel) gsonConverterA.convert(responseBodyBody, new TypeToken<BaseListResultModel<EcgCloudData>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgList$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info(a, new d(baseListResultModel));
            List<EcgCloudData> items = baseListResultModel.getItems();
            if (items == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            for (EcgCloudData ecgCloudData : items) {
                ecgCloudData.setUserId(userId);
                arrayList.add(ecgCloudData);
            }
            return arrayList;
        } catch (Exception e2) {
            HMLog.warn(a, e2, f.a);
        }
    }

    @Nullable
    public final String getEcgRawUrl(long timeStamp, @NotNull String userId, @NotNull String type) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("generatedTime", Long.valueOf(timeStamp));
        linkedHashMap.put("type", type);
        try {
            EcgCore ecgCore = EcgCore.INSTANCE;
            Response responseHttpPost = HttpKitKtxKt.httpPost(this, Intrinsics.areEqual(ecgCore.getWebSetting().userId(), userId) ? EcgWebUtil.INSTANCE.urlEcg(userId) : EcgWebUtil.INSTANCE.urlEcgFollowee(ecgCore.getWebSetting().userId(), userId), BaseEcgWebApiKt.buildRequestJsonBody(new Gson().toJson(kotlin.collections.e.listOf(linkedHashMap))), null, headerJson());
            if (!responseHttpPost.isSuccessful()) {
                throw new HttpError(responseHttpPost);
            }
            ConverterKt.checkToken(responseHttpPost, ConverterKt.responseToJsonStr(responseHttpPost));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpPost.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            List items = ((BaseListResultModel) gsonConverterA.convert(responseBodyBody, new TypeToken<BaseListResultModel<EcgRawUrlData>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgRawUrl$$inlined$deserializeOrThrow$1
            }.getType())).getItems();
            if (items != null && (!items.isEmpty())) {
                return ((EcgRawUrlData) items.get(0)).getRawDataUri();
            }
            return null;
        } catch (Exception e2) {
            HMLog.warn(a, e2, new g(timeStamp));
        }
    }

    @Nullable
    public final List<SeniorInterpretOrg> getEcgSeniorAnalysisOrgList() {
        try {
            Response responseHttpGet = HttpKitKtxKt.httpGet(this, EcgWebUtil.INSTANCE.urlEcgAnalysisOrg(), null, headerJson());
            if (!responseHttpGet.isSuccessful()) {
                HMLog.info(a, new i(responseHttpGet));
                return null;
            }
            if (!responseHttpGet.isSuccessful()) {
                throw new HttpError(responseHttpGet);
            }
            ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            List<SeniorInterpretOrg> list = (List) gsonConverterA.convert(responseBodyBody, new TypeToken<List<? extends SeniorInterpretOrg>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgSeniorAnalysisOrgList$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info(a, new h(list));
            return list;
        } catch (Exception e2) {
            HMLog.warn(a, e2, j.a);
        }
    }

    @Nullable
    public final SeniorInterpretResult getEcgSeniorAnalysisResult(@NotNull String userId, @NotNull String orgId, @NotNull EcgData ecg) {
        String strUrlEcgAnalysisResult = EcgWebUtil.INSTANCE.urlEcgAnalysisResult(userId, orgId);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appName", ecg.getMSourceAppName());
            linkedHashMap.put("dataTime", String.valueOf(ecg.getTimestamp()));
            linkedHashMap.put("modeType", ecg.getMeasureContentType());
            Response responseHttpGet = HttpKitKtxKt.httpGet(this, strUrlEcgAnalysisResult, linkedHashMap, headerJson());
            if (!responseHttpGet.isSuccessful()) {
                HMLog.info(a, new l(responseHttpGet));
                return null;
            }
            if (!responseHttpGet.isSuccessful()) {
                throw new HttpError(responseHttpGet);
            }
            ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            SeniorInterpretResult seniorInterpretResult = (SeniorInterpretResult) gsonConverterA.convert(responseBodyBody, new TypeToken<SeniorInterpretResult>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgSeniorAnalysisResult$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info(a, new k(seniorInterpretResult));
            return seniorInterpretResult;
        } catch (Exception e2) {
            HMLog.warn(a, e2, m.a);
            return null;
        }
    }

    @Nullable
    public final List<EcgTag> getEcgTagList(long startTime, long endTime) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EcgCore ecgCore = EcgCore.INSTANCE;
        linkedHashMap.put("userId", ecgCore.getWebSetting().userId());
        linkedHashMap.put("tagType", b);
        linkedHashMap.put("startTime", String.valueOf(startTime));
        linkedHashMap.put("endTime", String.valueOf(endTime));
        linkedHashMap.put("limit", "10000");
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, EcgWebUtil.INSTANCE.urlEcgTag(ecgCore.getWebSetting().userId()), linkedHashMap, null, 4, null);
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            List items = ((BaseListResultModel) gsonConverterA.convert(responseBodyBody, new TypeToken<BaseListResultModel<StateTags>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgTagList$$inlined$deserializeOrThrow$1
            }.getType())).getItems();
            if (items == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StateTags) it2.next()).toEcgTag());
            }
            return arrayList;
        } catch (Exception e2) {
            HMLog.warn(a, e2, n.a);
            return null;
        }
    }

    @Nullable
    public final EcgAnalysisUrlData getEcgWebUrl(@NotNull EcgWebUrlKey key, @NotNull String appName) {
        String strUrlEcgAnalysis = EcgWebUtil.INSTANCE.urlEcgAnalysis(appName);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("settingName", key.getKey());
            linkedHashMap.put("mode", "SINGLE");
            Response responseHttpGet = HttpKitKtxKt.httpGet(this, strUrlEcgAnalysis, linkedHashMap, headerJson());
            if (!responseHttpGet.isSuccessful()) {
                throw new HttpError(responseHttpGet);
            }
            ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            String str = (String) ((Map) gsonConverterA.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgWebUrl$$inlined$deserializeOrThrow$1
            }.getType())).get(key.getKey());
            List list = str != null ? (List) new Gson().fromJson(str, new TypeToken<List<? extends EcgAnalysisUrlData>>() { // from class: com.huami.ecg.core.web.EcgWebApi$getEcgWebUrl$$inlined$fromJsonOrThrow$1
            }.getType()) : null;
            if (list != null) {
                return (EcgAnalysisUrlData) CollectionsKt.firstOrNull(list);
            }
            return null;
        } catch (Exception e2) {
            HMLog.warn(a, e2, new o(key));
            return null;
        }
    }

    @Nullable
    public final UploadUri getFileUri(@NotNull String fileType, @NotNull String fileName, @NotNull String appName, @NotNull String userId) {
        Map<String, String> systemParam = EcgCore.INSTANCE.getWebSetting().getSystemParam();
        systemParam.put("fileType", fileType);
        systemParam.put("fileName", fileName);
        try {
            Response responseHttpGet = HttpKitKtxKt.httpGet(this, EcgWebUtil.INSTANCE.ecgFileUri(userId, appName), systemParam, header());
            if (!responseHttpGet.isSuccessful()) {
                throw new HttpError(responseHttpGet);
            }
            ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
            GsonConverter gsonConverterA = INSTANCE.a();
            ResponseBody responseBodyBody = responseHttpGet.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            return (UploadUri) gsonConverterA.convert(responseBodyBody, new TypeToken<UploadUri>() { // from class: com.huami.ecg.core.web.EcgWebApi$getFileUri$$inlined$deserializeOrThrow$1
            }.getType());
        } catch (Exception e2) {
            HMLog.warn(a, e2, new p(fileType, fileName));
            return null;
        }
    }

    @Override // com.huami.ecg.core.web.BaseEcgWebApi
    @NotNull
    public Map<String, String> header() {
        return BaseEcgWebApi.DefaultImpls.header(this);
    }

    @Override // com.huami.ecg.core.web.BaseEcgWebApi
    @NotNull
    public Map<String, String> headerJson() {
        return BaseEcgWebApi.DefaultImpls.headerJson(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return INSTANCE.b();
    }

    @Override // com.huami.ecg.core.web.BaseEcgWebApi
    @NotNull
    public Map<String, String> param() {
        return BaseEcgWebApi.DefaultImpls.param(this);
    }

    public final boolean saveEcgTag(@NotNull EcgTag ecgTag) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("generatedTime", String.valueOf(ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String()));
        linkedHashMap.put("summary", ecgTag.getValue() == null ? "" : new Gson().toJson(ecgTag.getValue()));
        linkedHashMap.put("type", b);
        EcgCore ecgCore = EcgCore.INSTANCE;
        linkedHashMap.put("userId", ecgCore.getWebSetting().userId());
        try {
            return HttpKitKtxKt.httpPost(this, EcgWebUtil.INSTANCE.urlEcgTag(ecgCore.getWebSetting().userId()), BaseEcgWebApiKt.buildRequestJsonBody(linkedHashMap), null, headerJson()).isSuccessful();
        } catch (Exception e2) {
            HMLog.warn(a, e2, q.a);
            return false;
        }
    }

    public final boolean updateBioIdFeedback(@NotNull EcgData ecg) {
        try {
            new LinkedHashMap();
            return HttpKitKtxKt.httpPut(this, EcgWebUtil.INSTANCE.urlEcg(EcgCore.INSTANCE.getWebSetting().userId()), BaseEcgWebApiKt.buildRequestJsonBody(new Gson().toJson(a(ecg))), null, headerJson()).isSuccessful();
        } catch (Exception e2) {
            HMLog.warn(a, e2, r.a);
            return false;
        }
    }

    public final boolean updateEcg(@NotNull EcgData ecg) {
        try {
            new LinkedHashMap();
            return HttpKitKtxKt.httpPut(this, EcgWebUtil.INSTANCE.urlEcg(EcgCore.INSTANCE.getWebSetting().userId()), BaseEcgWebApiKt.buildRequestJsonBody(new Gson().toJson(c(ecg))), null, headerJson()).isSuccessful();
        } catch (Exception e2) {
            HMLog.warn(a, e2, s.a);
            return false;
        }
    }

    public final boolean uploadEcg(@NotNull EcgData ecg, @NotNull String rawFile) {
        try {
            UploadUri uploadUriUploadFile = uploadFile(c, rawFile);
            if (uploadUriUploadFile == null) {
                return false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("objectName", uploadUriUploadFile.getObjectName());
            linkedHashMap.put("metadata", c(ecg));
            boolean zIsSuccessful = HttpKitKtxKt.httpPost(this, EcgWebUtil.INSTANCE.urlEcgUpload(EcgCore.INSTANCE.getWebSetting().userId()), BaseEcgWebApiKt.buildRequestJsonBody(new Gson().toJson(linkedHashMap)), param(), headerJson()).isSuccessful();
            HMLog.info$default(null, new t(zIsSuccessful, uploadUriUploadFile, this, ecg), 1, null);
            return zIsSuccessful;
        } catch (Exception e2) {
            HMLog.warn(a, e2, u.a);
            return false;
        }
    }

    @Nullable
    public final UploadUri uploadFile(@NotNull String type, @NotNull String filePath) {
        return uploadFile(type, new File(filePath));
    }

    @Nullable
    public final String uploadVoiceTag(@NotNull File file) {
        return uploadVoiceTag(file.getName(), kotlin.io.c.readBytes(file));
    }

    @Nullable
    public final UploadUri uploadFile(@NotNull String type, @NotNull File file) {
        return uploadFile(type, file.getName(), kotlin.io.c.readBytes(file));
    }

    @Nullable
    public final String uploadVoiceTag(@NotNull String fileName, @NotNull byte[] fileData) {
        UploadUri uploadUriUploadFile = uploadFile(d, fileName, fileData);
        if (uploadUriUploadFile != null) {
            return uploadUriUploadFile.getGetUri();
        }
        return null;
    }

    @Nullable
    public final UploadUri uploadFile(@NotNull String type, @NotNull String fileName, @NotNull byte[] fileData) {
        try {
            UploadUri fileUri$default = getFileUri$default(this, type, fileName, null, null, 12, null);
            if (fileUri$default != null && HttpKitKtxKt.httpPut$default(this, fileUri$default.getPutUri(), RequestBody.create((MediaType) null, fileData), null, null, 12, null).isSuccessful()) {
                HMLog.info(a, new v(fileData, fileName));
                return fileUri$default;
            }
        } catch (Exception e2) {
            HMLog.warn(a, e2, new w(fileName));
        }
        return null;
    }
}
