package com.huami.bloodoxygen.bluetooth.synctime.remote.api.property;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/IPropertyApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "getBloodOxygenSyncTime", "syncTime", "", "postBloodOxygenSyncTime", "", "a", "Ljava/lang/String;", "userId", "b", "mainUserId", "Lcom/google/gson/Gson;", "c", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PropertyApi implements IPropertyApi, HttpKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Class<PropertyApi> d = PropertyApi.class;

    @NotNull
    private static final String e = "users/%s/properties";

    @NotNull
    private static final String f = "users/%s/properties?propertyName=%s&mode=%s";

    @NotNull
    private static final String g = "users/%s/followee/%s/properties?propertyName=%s&mode=%s";

    @NotNull
    private static final String h = "SINGLE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mainUserId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi$Companion;", "", "Ljava/lang/Class;", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;", "TAG", "Ljava/lang/Class;", "getTAG", "()Ljava/lang/Class;", "", "MODE_SINGLE", "Ljava/lang/String;", "PATH", DTransferConstants.URL, "URL_FOLLOWEE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Class<PropertyApi> getTAG() {
            return PropertyApi.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    public PropertyApi(@NotNull String str, @NotNull String str2) {
        this.userId = str;
        this.mainUserId = str2;
        this.gson = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.IPropertyApi
    @Nullable
    public BloodOxygenSyncTime getBloodOxygenSyncTime() throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, Intrinsics.areEqual(this.userId, this.mainUserId) ? String.format(Locale.getDefault(), f, Arrays.copyOf(new Object[]{this.userId, Properties.BLOOD_OXYGEN, "SINGLE"}, 3)) : String.format(Locale.getDefault(), g, Arrays.copyOf(new Object[]{this.mainUserId, this.userId, Properties.BLOOD_OXYGEN, "SINGLE"}, 4)), null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (BloodOxygenSyncTime) a().fromJson(((Properties) converter.convert(responseBodyBody, new TypeToken<Properties>() { // from class: com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.PropertyApi$getBloodOxygenSyncTime$$inlined$deserializeOrThrow$1
        }.getType())).getBloodOxygenSyncTime(), BloodOxygenSyncTime.class);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.IPropertyApi
    public boolean postBloodOxygenSyncTime(@NotNull BloodOxygenSyncTime syncTime) {
        return HttpKitKtxKt.httpPost$default(this, String.format(Locale.getDefault(), e, Arrays.copyOf(new Object[]{this.userId}, 1)), RequestBody.create(MediaType.parse("application/json; charset=utf-8"), a().toJson(new PropertyEntity(new Properties(a().toJson(syncTime))))), null, null, 12, null).isSuccessful();
    }

    public /* synthetic */ PropertyApi(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? str : str2);
    }
}
