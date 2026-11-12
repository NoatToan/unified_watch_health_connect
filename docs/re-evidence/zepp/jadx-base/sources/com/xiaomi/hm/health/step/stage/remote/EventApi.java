package com.xiaomi.hm.health.step.stage.remote;

import com.google.gson.Gson;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.step.stage.model.StageEventItem;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/remote/EventApi;", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "Lcom/huami/http/HttpKit;", "", "Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "items", "", "postEvents", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "", "b", "()Ljava/lang/String;", "postUrl", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventApi implements IEventApi, HttpKit {

    @NotNull
    private static final String c = "EventApi";

    @NotNull
    private static final String d = "date/events";

    @NotNull
    private static final String e = "users/%s/";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy postUrl;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Post events : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.getDefault(), "users/%s/date/events", Arrays.copyOf(new Object[]{this.a}, 1));
        }
    }

    public EventApi(@NotNull String str) {
        this.postUrl = LazyKt__LazyJVMKt.lazy(new c(str));
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    private final String b() {
        return (String) this.postUrl.getValue();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.xiaomi.hm.health.step.stage.remote.IEventApi
    public boolean postEvents(@NotNull List<StageEventItem> items) {
        String string = a().toJson(items).toString();
        HMLog.info(c, new b(string));
        return HttpKitKtxKt.httpPost$default(this, b(), RequestBody.create(MediaType.parse("application/json; charset=utf-8"), string), null, null, 12, null).isSuccessful();
    }
}
