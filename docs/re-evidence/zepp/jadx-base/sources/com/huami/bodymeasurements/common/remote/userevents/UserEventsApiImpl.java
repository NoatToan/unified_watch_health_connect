package com.huami.bodymeasurements.common.remote.userevents;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002Jk\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR%\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R%\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006&"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApiImpl;", "Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;", "Lcom/huami/http/HttpKit;", "", "userId", "c", "", ExifInterface.GPS_DIRECTION_TRUE, "eventType", "subType", "", "from", "to", "", "limit", "", "reverse", "appName", "Ljava/lang/reflect/Type;", "type", "Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "getUserEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "", "userEvents", "postUserEvents", "a", "Ljava/lang/String;", "tag", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gsonExcludeWithoutExpose", "gson", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class UserEventsApiImpl implements UserEventsApi, HttpKit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "UserEventsApiImpl";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy gsonExcludeWithoutExpose = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getUserEvents throwable::", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Gson> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new GsonBuilder().serializeNulls().create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Gson> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("postUserEvents throwable::", this.a);
        }
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    private final Gson b() {
        return (Gson) this.gsonExcludeWithoutExpose.getValue();
    }

    private final String c(String userId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(UserEventsConstants.Path.USER_EVENTS, Arrays.copyOf(new Object[]{userId}, 1));
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bodymeasurements.common.remote.userevents.UserEventsApi
    @Nullable
    public <T> UserEventsItem<T> getUserEvents(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long from, long to, int limit, @Nullable Boolean reverse, @NotNull String appName, @NotNull Type type) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, c(userId), r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("subType", subType), TuplesKt.to("from", String.valueOf(from)), TuplesKt.to("to", String.valueOf(to)), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("reverse", String.valueOf(reverse)), TuplesKt.to("appName", appName)), null, 4, null);
            try {
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    objM3845constructorimpl2 = HttpKitContext.INSTANCE.getConverter().convert(responseHttpGet$default.body(), type);
                } else {
                    objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                        objM3845constructorimpl2 = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            objM3845constructorimpl = Result.m3845constructorimpl((UserEventsItem) objM3845constructorimpl2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(this.tag, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        return (UserEventsItem) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bodymeasurements.common.remote.userevents.UserEventsApi
    public <T> boolean postUserEvents(@NotNull String userId, @NotNull List<? extends T> userEvents) {
        Object objM3845constructorimpl;
        String json = a().toJson(userEvents);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(HttpKitKtxKt.httpPost$default(this, c(userId), RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(this.tag, null, null, new d(thM3848exceptionOrNullimpl), 6, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
