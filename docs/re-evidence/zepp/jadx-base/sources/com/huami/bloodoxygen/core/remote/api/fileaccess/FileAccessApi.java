package com.huami.bloodoxygen.core.remote.api.fileaccess;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.snore.ui.fragment.SnoreListFragment;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileAccessApi;", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/IFileAccessApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileInfoEntity;", "fileInfoEntity", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileUrlEntity;", "getFileInfo", "", "putUrl", "filePath", "", SnoreListFragment.TYPE_UPLOAD, "a", "Ljava/lang/String;", "userId", "b", "appName", "c", "Z", "isPathExtension", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Ljava/lang/String;", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class FileAccessApi implements IFileAccessApi, HttpKit {

    @NotNull
    public static final String FILE_TYPE_OSA_EVENT = "OSA_EVENT_DATA";

    @NotNull
    public static final String FILE_TYPE_OSA_PROCESS = "OSA_PROCESS_DATA";

    @NotNull
    public static final String URL = "users/%s/apps/%s/fileAccessURIs";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isPathExtension;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy url = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            if (!FileAccessApi.this.isPathExtension) {
                return String.format(Locale.getDefault(), FileAccessApi.URL, Arrays.copyOf(new Object[]{FileAccessApi.this.userId, FileAccessApi.this.appName}, 2));
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "data/%s/open/fileAccessURIs", Arrays.copyOf(new Object[]{FileAccessApi.this.userId}, 1));
        }
    }

    public FileAccessApi(@NotNull String str, @NotNull String str2, boolean z) {
        this.userId = str;
        this.appName = str2;
        this.isPathExtension = z;
    }

    private final String a() {
        return (String) this.url.getValue();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bloodoxygen.core.remote.api.fileaccess.IFileAccessApi
    @Nullable
    public FileUrlEntity getFileInfo(@NotNull FileInfoEntity fileInfoEntity) throws HttpError {
        Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, a(), RequestBody.create(MediaType.parse("application/json; charset=utf-8"), SharedInstanceKt.getGson().toJson(fileInfoEntity)), this.isPathExtension ? q.mapOf(TuplesKt.to("appName", this.appName)) : r.emptyMap(), null, 8, null);
        ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
        if (!responseHttpPost$default.isSuccessful()) {
            throw new HttpError(responseHttpPost$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpPost$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (FileUrlEntity) converter.convert(responseBodyBody, new TypeToken<FileUrlEntity>() { // from class: com.huami.bloodoxygen.core.remote.api.fileaccess.FileAccessApi$getFileInfo$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bloodoxygen.core.remote.api.fileaccess.IFileAccessApi
    public boolean upload(@NotNull String putUrl, @NotNull String filePath) {
        return HttpKitKtxKt.httpPut$default(this, putUrl, RequestBody.create((MediaType) null, new File(filePath)), null, null, 12, null).isSuccessful();
    }
}
