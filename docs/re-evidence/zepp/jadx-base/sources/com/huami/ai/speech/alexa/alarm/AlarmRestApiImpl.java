package com.huami.ai.speech.alexa.alarm;

import com.google.gson.Gson;
import com.huami.ai.speech.alexa.entity.Alarm;
import com.huami.ai.speech.alexa.entity.AlarmParam;
import com.huami.ai.speech.alexa.entity.Alarms;
import com.huami.ai.speech.alexa.entity.Links;
import com.huami.ai.speech.alexa.entity.TriggerParam;
import com.huami.ai.speech.alexa.http.AlexaClient;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/ai/speech/alexa/alarm/AlarmRestApiImpl;", "Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "Lokhttp3/RequestBody;", "a", "", "endpointId", "status", "", "maxResults", "nextToken", "Lcom/huami/ai/speech/alexa/entity/Alarms;", "readAllAlarm", "scheduledTime", "Lcom/huami/ai/speech/alexa/entity/Alarm;", "createAlarm", "token", "", "deleteAlarm", "deleteAllAlarm", "cancelAlarm", "activeAlarm", "alarmDetail", "Lcom/huami/ai/speech/alexa/http/AlexaClient;", "Lcom/huami/ai/speech/alexa/http/AlexaClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "c", "Ljava/lang/String;", "alarmBaseUrl", "<init>", "(Lcom/huami/ai/speech/alexa/http/AlexaClient;Lcom/google/gson/Gson;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmRestApiImpl implements AlarmRestApi {
    private static final int d = 204;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String alarmBaseUrl = "/v1/alerts/alarms";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("active alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("allAlarm:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "activate alarm failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse alarm failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse alarm failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("readAllAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            return Intrinsics.stringPlus("activeAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("detail alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "alarm detail failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse alarm failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("alarmDetail接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cancel alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cancel alarm failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cancelAlarm:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse alarm failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cancelAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("create alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "create alarm failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("createAlarm:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse alarm failed : ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("createAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delete alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delete alarm ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("deleteAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delete alarms result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delete all alarm ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("deleteAllAlarm接口请求出错：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("read alarm result:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public static final z a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "read all alarm failed";
        }
    }

    public AlarmRestApiImpl(@NotNull AlexaClient alexaClient, @NotNull Gson gson) {
        this.client = alexaClient;
        this.gson = gson;
    }

    private final RequestBody a() {
        return RequestBody.create((MediaType) null, "");
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    @Nullable
    public Alarm activeAlarm(@NotNull String token) throws IOException {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPut$default(this.client, this.alarmBaseUrl + '/' + token + "/activate", a(), null, null, 12, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new d(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response == null) {
            return null;
        }
        HMLog.info("speech", new a(response));
        if (!response.isSuccessful() || response.body() == null) {
            HMLog.warn$default("speech", null, b.a, 2, null);
            return null;
        }
        String strString = response.body().string();
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl((Alarm) this.gson.fromJson(strString, Alarm.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            HMLog.warn$default("speech", null, new c(strString), 2, null);
        }
        return (Alarm) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    @Nullable
    public Alarm alarmDetail(@NotNull String token) throws IOException {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(this.client, this.alarmBaseUrl + '/' + token, null, null, 6, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new h(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response == null) {
            return null;
        }
        HMLog.info("speech", new e(response));
        if (!response.isSuccessful() || response.body() == null) {
            HMLog.warn$default("speech", null, f.a, 2, null);
            return null;
        }
        String strString = response.body().string();
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl((Alarm) this.gson.fromJson(strString, Alarm.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            HMLog.warn$default("speech", null, new g(strString), 2, null);
        }
        return (Alarm) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    @Nullable
    public Alarm cancelAlarm(@NotNull String token) throws IOException {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPut$default(this.client, this.alarmBaseUrl + '/' + token + "/cancel", a(), null, null, 12, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new m(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response == null) {
            return null;
        }
        HMLog.info("speech", new i(response));
        if (!response.isSuccessful() || response.body() == null) {
            HMLog.warn$default("speech", null, j.a, 2, null);
            return null;
        }
        String strString = response.body().string();
        try {
            Result.Companion companion3 = Result.Companion;
            HMLog.info("speech", new k(strString));
            objM3845constructorimpl2 = Result.m3845constructorimpl((Alarm) this.gson.fromJson(strString, Alarm.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            HMLog.warn$default("speech", null, new l(strString), 2, null);
        }
        return (Alarm) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    @Nullable
    public Alarm createAlarm(@NotNull String endpointId, @NotNull String scheduledTime) throws IOException {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        String json = this.gson.toJson(new AlarmParam(endpointId, new TriggerParam(scheduledTime)));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPost$default(this.client, this.alarmBaseUrl, OkHttpKtxKt.buildRequestJsonBody(json), null, null, 12, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new r(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response == null) {
            return null;
        }
        HMLog.info("speech", new n(response));
        if (!response.isSuccessful() || response.body() == null) {
            HMLog.warn$default("speech", null, o.a, 2, null);
            return null;
        }
        String strString = response.body().string();
        HMLog.info("speech", new p(strString));
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl((Alarm) this.gson.fromJson(strString, Alarm.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            HMLog.warn$default("speech", null, new q(strString), 2, null);
        }
        return (Alarm) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    public boolean deleteAlarm(@NotNull String token) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpDelete$default(this.client, this.alarmBaseUrl + '/' + token, null, null, null, 14, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new u(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        boolean z2 = false;
        if (response == null) {
            return false;
        }
        HMLog.info("speech", new s(response));
        if (response.isSuccessful() && response.code() == 204) {
            z2 = true;
        }
        HMLog.warn$default("speech", null, new t(z2), 2, null);
        return z2;
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    public boolean deleteAllAlarm(@NotNull String endpointId) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpDelete$default(this.client, this.alarmBaseUrl + "?endpointId=" + endpointId, null, null, null, 14, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new x(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        boolean z2 = false;
        if (response == null) {
            return false;
        }
        HMLog.info("speech", new v(response));
        if (response.isSuccessful() && response.code() == 204) {
            z2 = true;
        }
        HMLog.warn$default("speech", null, new w(z2), 2, null);
        return z2;
    }

    @Override // com.huami.ai.speech.alexa.alarm.AlarmRestApi
    @Nullable
    public Alarms readAllAlarm(@NotNull String endpointId, @Nullable String status, int maxResults, @Nullable String nextToken) throws IOException {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(this.client, this.alarmBaseUrl + "?endpointId=" + endpointId, null, null, 6, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new c0(thM3848exceptionOrNullimpl), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response == null) {
            return null;
        }
        HMLog.info("speech", new y(response));
        if (!response.isSuccessful() || response.body() == null) {
            HMLog.warn$default("speech", null, z.a, 2, null);
            return null;
        }
        String strString = response.body().string();
        HMLog.info("speech", new a0(strString));
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl((Alarms) this.gson.fromJson(strString, Alarms.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            HMLog.warn$default("speech", null, new b0(strString), 2, null);
        }
        Alarms alarms = new Alarms(CollectionsKt__CollectionsKt.emptyList(), new Links(""), 0);
        if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
            objM3845constructorimpl2 = alarms;
        }
        return (Alarms) objM3845constructorimpl2;
    }
}
