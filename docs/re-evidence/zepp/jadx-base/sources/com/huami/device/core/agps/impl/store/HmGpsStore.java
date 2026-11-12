package com.huami.device.core.agps.impl.store;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.AgpsLogger;
import com.huami.device.core.agps.api.AgpsModuleConfig;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.api.MultiDependenceStore;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.core.agps.api.bean.FileResource;
import com.huami.device.core.agps.api.bean.ResourceItem;
import com.huami.device.core.agps.api.exceptions.ConfigException;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.serialization.json.internal.JsonLexerKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J$\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0004J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0004J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0004R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HmGpsStore;", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "", "a", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "getType", "Lkotlin/Function2;", "", "", "onProgressMessage", "", "Lcom/huami/device/core/agps/api/bean/FileResource;", WatchFaceApi.SORT_DOWNLOAD, "Lcom/huami/device/core/agps/api/bean/ResourceItem;", "resItem", "downloadItem", "fileUrl", "filterFileName", "requestDownloadResourceList", "jsonString", "explainJson", "url", "outPath", "", "downloadFile", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "httpClient", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "b", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "appInfo", "c", "Ljava/lang/String;", "saveFilePath", "<init>", "(Lcom/huami/device/core/agps/api/AgpsHttpClient;Lcom/huami/device/core/agps/api/bean/AppInfo;Ljava/lang/String;)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public class HmGpsStore implements MultiDependenceStore {
    private static final String d = "HmGpsStore";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AgpsHttpClient httpClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AppInfo appInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String saveFilePath;
    private static String e = "/apps/{appName}/fileTypes/{fileType}/files";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "[AGPS-ERROR] write file error, or disc error";
        }
    }

    public HmGpsStore(@NotNull AgpsHttpClient agpsHttpClient, @NotNull AppInfo appInfo, @NotNull String str) {
        this.httpClient = agpsHttpClient;
        this.appInfo = appInfo;
        this.saveFilePath = str;
    }

    private final String a() throws ConfigException {
        if (this.appInfo.getHost().length() == 0) {
            throw new ConfigException("Host config error.", null, 2, null);
        }
        return this.appInfo.getHost() + e;
    }

    @Override // com.huami.device.core.agps.api.MultiDependenceStore
    @NotNull
    public List<FileResource> download(@NotNull Function2<? super String, ? super Integer, Unit> onProgressMessage) {
        String strRequestDownloadResourceList = requestDownloadResourceList(onProgressMessage);
        if (strRequestDownloadResourceList == null) {
            onProgressMessage.invoke("response error", 0);
            return CollectionsKt__CollectionsKt.emptyList();
        }
        onProgressMessage.invoke("response -> " + strRequestDownloadResourceList, 0);
        List<ResourceItem> listExplainJson = explainJson(strRequestDownloadResourceList);
        if (listExplainJson.isEmpty()) {
            onProgressMessage.invoke("response data error", 0);
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listExplainJson, 10));
        Iterator<T> it2 = listExplainJson.iterator();
        while (it2.hasNext()) {
            arrayList.add(downloadItem((ResourceItem) it2.next(), onProgressMessage));
        }
        return arrayList;
    }

    public final boolean downloadFile(@NotNull String url, @NotNull String outPath) throws IOException {
        if (!(m.startsWith$default(url, "http://", false, 2, null) || m.startsWith$default(url, "https://", false, 2, null))) {
            AgpsModuleConfig.INSTANCE.getLogger().onProgress("invalid url " + url, 0);
            return false;
        }
        Response responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient.Builder().build().newCall(new Request.Builder().url(url).build()));
        if (responseExecute.code() != 200) {
            AgpsModuleConfig.INSTANCE.getLogger().onProgress("response code " + responseExecute.code(), 0);
            return false;
        }
        if (responseExecute.body() == null) {
            AgpsModuleConfig.INSTANCE.getLogger().onProgress("response body is empty", 0);
            return false;
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        InputStream inputStreamByteStream = responseBodyBody.byteStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            File file = new File(outPath);
            file.mkdirs();
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            bufferedInputStream.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(inputStreamByteStream, null);
            if (new File(outPath).exists()) {
                return true;
            }
            HMLog.error$default(null, null, null, b.a, 7, null);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamByteStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public FileResource downloadItem(@NotNull ResourceItem resItem, @NotNull Function2<? super String, ? super Integer, Unit> onProgressMessage) throws Exception {
        String str = this.saveFilePath + '/' + resItem.getFileType() + '/' + this.appInfo.getFileType().getValue() + '_' + filterFileName(resItem.getFileUrl());
        onProgressMessage.invoke("start download file -> " + str, 0);
        onProgressMessage.invoke("start download file -> " + resItem.getFileUrl(), 0);
        boolean zDownloadFile = downloadFile(resItem.getFileUrl(), str);
        if (!zDownloadFile) {
            throw new Exception("download fail " + resItem.getFileType() + " - " + resItem.getFileUrl());
        }
        onProgressMessage.invoke("download file [" + resItem.getFileType() + "] -> [" + zDownloadFile + JsonLexerKt.END_LIST, 0);
        return new FileResource(this.appInfo.getFileType(), str);
    }

    @NotNull
    public final List<ResourceItem> explainJson(@NotNull String jsonString) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray(jsonString);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("fileType");
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = jSONObject.getString("fileUrl");
                String str = string3 != null ? string3 : "";
                String str2 = null;
                if (jSONObject.has("yesterdayFileUrl") && (string = jSONObject.getString("yesterdayFileUrl")) != null) {
                    str2 = string;
                }
                arrayList.add(new ResourceItem(string2, str, str2));
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            AgpsModuleConfig.INSTANCE.getLogger().onProgress("response no resource", 0);
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (Exception e2) {
            AgpsModuleConfig agpsModuleConfig = AgpsModuleConfig.INSTANCE;
            AgpsLogger logger = agpsModuleConfig.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("json error -> ");
            e2.printStackTrace();
            sb.append(Unit.INSTANCE);
            logger.onProgress(sb.toString(), 0);
            agpsModuleConfig.getLogger().onProgress("return json error-> " + jsonString, 0);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final String filterFileName(@NotNull String fileUrl) {
        try {
            return fileUrl.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) fileUrl, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, (Object) null) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.huami.device.core.agps.api.MultiDependenceStore
    @NotNull
    public DownloadResourceType getType() {
        return this.appInfo.getFileType();
    }

    @Nullable
    public final String requestDownloadResourceList(@NotNull Function2<? super String, ? super Integer, Unit> onProgressMessage) {
        String strReplace$default = m.replace$default(m.replace$default(a(), "{appName}", this.appInfo.getAppName(), false, 4, (Object) null), "{fileType}", this.appInfo.getFileType().getValue(), false, 4, (Object) null);
        onProgressMessage.invoke("start down load with url : " + strReplace$default, 0);
        return this.httpClient.get(strReplace$default);
    }
}
