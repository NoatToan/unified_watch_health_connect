package com.huami.bloodoxygen.core.remote.api.event;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bodymeasurements.common.remote.userevents.UserEventsConstants;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B+\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005H\u0016R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001d\u0010%\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$R\u001d\u0010'\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010$R\u001d\u0010)\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\u001b\u0010$R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\"\u0010,R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b \u0010,¨\u00063"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "Lcom/huami/bloodoxygen/core/remote/api/event/IEventApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/bloodoxygen/core/remote/api/event/EventEntity;", "entity", "", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "a", "", "eventType", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "subType", "from", "to", "", "limit", "", "reverse", "getEvents", "items", "flattening", "postEvents", "", "timestamps", "deleteEvents", "Ljava/lang/String;", "userId", "b", "appName", "c", "Z", "isFriend", GoogleApiAvailabilityLight.a, "isPathExtension", "e", "Lkotlin/Lazy;", "()Ljava/lang/String;", "getUrl", "f", "postUrl", "g", "deleteUrl", "Lcom/google/gson/Gson;", "h", "()Lcom/google/gson/Gson;", "gsonSkipFiles", "i", "gsonExcludeWithoutExpose", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class EventApi implements IEventApi, HttpKit {

    @NotNull
    private static final String A = "toDate";

    @NotNull
    private static final String B = "appname";
    public static final int LIMIT = 999;

    @NotNull
    private static final String j = "EventApi";

    @NotNull
    private static final String k = "events/dateString";

    @NotNull
    private static final String l = "events";

    @NotNull
    private static final String m = "users/%s/";

    @NotNull
    private static final String n = "friend/common/datas/%s/blosData";

    @NotNull
    private static final String o = "users/%s/events/blood_oxygen/batchDelete";

    @NotNull
    private static final String p = "eventType";

    @NotNull
    private static final String q = "subType";

    @NotNull
    private static final String r = "timestampStr";

    @NotNull
    private static final String s = "from";

    @NotNull
    private static final String t = "to";

    @NotNull
    private static final String u = "timeZone";

    @NotNull
    private static final String v = "limit";

    @NotNull
    private static final String w = "reverse";

    @NotNull
    private static final String x = "sub";

    @NotNull
    private static final String y = "DAYSTR";

    @NotNull
    private static final String z = "fromDate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isFriend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isPathExtension;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy getUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy postUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy gsonSkipFiles;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy gsonExcludeWithoutExpose;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            if (!EventApi.this.isPathExtension) {
                return String.format(Locale.getDefault(), EventApi.o, Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "data/%s/open/eventsBatchDelete", Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            if (EventApi.this.isPathExtension) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format(Locale.getDefault(), "data/%s/open/eventsDateString", Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
            }
            if (EventApi.this.isFriend) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return String.format(Locale.getDefault(), EventApi.n, Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "users/%s/events/dateString", Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            if (EventApi.this.isPathExtension) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format(Locale.getDefault(), "/data/%s/open/eventsUpload", Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), UserEventsConstants.Path.USER_EVENTS, Arrays.copyOf(new Object[]{EventApi.this.userId}, 1));
        }
    }

    public EventApi(@NotNull String str, @NotNull String str2, boolean z2, boolean z3) {
        this.userId = str;
        this.appName = str2;
        this.isFriend = z2;
        this.isPathExtension = z3;
        this.getUrl = LazyKt__LazyJVMKt.lazy(new b());
        this.postUrl = LazyKt__LazyJVMKt.lazy(new d());
        this.deleteUrl = LazyKt__LazyJVMKt.lazy(new a());
        this.gsonSkipFiles = LazyKt__LazyJVMKt.lazy(new Function0<Gson>() { // from class: com.huami.bloodoxygen.core.remote.api.event.EventApi$gsonSkipFiles$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Gson invoke() {
                return new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy() { // from class: com.huami.bloodoxygen.core.remote.api.event.EventApi$gsonSkipFiles$2.1
                    @Override // com.google.gson.ExclusionStrategy
                    public boolean shouldSkipClass(@Nullable Class<?> clazz) {
                        return false;
                    }

                    @Override // com.google.gson.ExclusionStrategy
                    public boolean shouldSkipField(@NotNull FieldAttributes f) {
                        return Intrinsics.areEqual("isNext", f.getName()) || Intrinsics.areEqual("extra", f.getName()) || Intrinsics.areEqual("date", f.getName());
                    }
                }).create();
            }
        });
        this.gsonExcludeWithoutExpose = LazyKt__LazyJVMKt.lazy(c.a);
    }

    private final List<EventItem> a(EventEntity entity) {
        ArrayList<EventItem> items = entity.getItems();
        if (entity.getNext() != null) {
            EventItem next = entity.getNext();
            next.setNext(true);
            Unit unit = Unit.INSTANCE;
            items.add(next);
        }
        for (EventItem eventItem : items) {
            eventItem.setDate(ExtensionKt.toYMDHMS(eventItem.getUtcTimestamp(), TimeZone.getTimeZone(eventItem.getTimeZoneId())));
        }
        return items;
    }

    private final String b() {
        return (String) this.deleteUrl.getValue();
    }

    private final String c() {
        return (String) this.getUrl.getValue();
    }

    private final Gson d() {
        return (Gson) this.gsonExcludeWithoutExpose.getValue();
    }

    private final Gson e() {
        return (Gson) this.gsonSkipFiles.getValue();
    }

    private final String f() {
        return (String) this.postUrl.getValue();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bloodoxygen.core.remote.api.event.IEventApi
    public boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps) {
        String strB = b();
        RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), new byte[0]);
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("subType", subType.getString()), TuplesKt.to(r, CollectionsKt___CollectionsKt.joinToString$default(timestamps, ",", null, null, 0, null, null, 62, null)));
        if (this.isPathExtension) {
            mapHashMapOf.put("eventType", "blood_oxygen");
        }
        Unit unit = Unit.INSTANCE;
        return HttpKitKtxKt.httpDelete$default(this, strB, requestBodyCreate, mapHashMapOf, null, 8, null).isSuccessful();
    }

    @Override // com.huami.bloodoxygen.core.remote.api.event.IEventApi
    @NotNull
    public List<EventItem> getEvents(@NotNull String eventType, @NotNull BloodOxygen.SubType subType, @NotNull String from, @NotNull String to, int limit, boolean reverse) throws HttpError {
        String strC = c();
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("reverse", String.valueOf(reverse)), TuplesKt.to("timeZone", TimeZone.getDefault().getID()));
        if (this.isFriend) {
            mapHashMapOf.put("fromDate", from);
            mapHashMapOf.put("toDate", to);
            mapHashMapOf.put("sub", y);
            mapHashMapOf.put("appname", this.appName);
        } else {
            mapHashMapOf.put("from", from);
            mapHashMapOf.put("to", to);
        }
        if (subType != BloodOxygen.SubType.ALL) {
            mapHashMapOf.put("subType", subType.getString());
        }
        Unit unit = Unit.INSTANCE;
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, strC, mapHashMapOf, null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return a((EventEntity) converter.convert(responseBodyBody, new TypeToken<EventEntity>() { // from class: com.huami.bloodoxygen.core.remote.api.event.EventApi$getEvents$$inlined$deserializeOrThrow$1
        }.getType()));
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bloodoxygen.core.remote.api.event.IEventApi
    public boolean postEvents(@NotNull List<EventItem> items, boolean flattening) {
        return HttpKitKtxKt.httpPost$default(this, f(), RequestBody.create(MediaType.parse("application/json; charset=utf-8"), flattening ? e().toJson(items) : d().toJson(items)), null, null, 12, null).isSuccessful();
    }

    public /* synthetic */ EventApi(String str, String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
