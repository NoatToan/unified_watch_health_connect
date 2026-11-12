package com.huami.thirdparty.webauth;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huami.account.AccountStatEvent;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J:\u0010\f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J2\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J:\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016JS\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00140\u0013\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0013\"\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J*\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001d\u0018\u00012\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/thirdparty/webauth/AuthSourceImpl;", "Lcom/huami/thirdparty/webauth/AuthSource;", "Lcom/huami/http/HttpKit;", "", "name", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "uid", "countryCode", "", HMUnbindBaseLogic.TAG, "state", "authStateChange", "refreshToken", "region", "Lcom/huami/thirdparty/webauth/TokenInfo;", "getToken", "getTokenAutoRefresh", "tokenInfo", "checkNeedRefresh", "", "Lkotlin/Pair;", "pairs", "", "refreshEachToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "thirdNames", "", "getTokenList", "([Ljava/lang/String;)Ljava/util/List;", "User", "url", "accessToken", "queryUser", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "<init>", "()V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class AuthSourceImpl implements AuthSource, HttpKit {

    @NotNull
    public static final String TAG = "AuthSourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "authStateChange-" + this.a + " 变更授权状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
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
            return "authStateChange-" + this.a + " 变更授权状态失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
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
            return "checkNeedRefresh-" + this.a + " 已授权";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkNeedRefresh-" + this.a + " 已过期";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkNeedRefresh-" + this.a + " 重置token info";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getToken-获取token：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getToken-获取token json为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getToken-获取token Json 解析：" + this.a + " 失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getToken-获取token：" + this.a + " 失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenAutoRefresh-" + this.a + " 获取token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表信息：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表 json为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-转换token实体 thirdName = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表 json为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
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
            return "getTokenList-转换token实体 (key)thirdName = " + this.a;
        }
    }

    /* JADX INFO: renamed from: com.huami.thirdparty.webauth.AuthSourceImpl$queryUser$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"User", "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "queryUser-获取用户信息";
        }
    }

    /* JADX INFO: renamed from: com.huami.thirdparty.webauth.AuthSourceImpl$queryUser$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"User", "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "queryUser-获取用户信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getTokenList-获取token列表信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refreshToken-" + this.a + " 刷新token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refreshToken-" + this.a + " 刷新token失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 401 error,refresh token 过期,需要重新绑定";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "unbind-" + this.a + " 解绑";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "unbind-" + this.a + " 解绑失败";
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    public boolean authStateChange(@NotNull String name, @NotNull String state) {
        try {
            HMLog.info(TAG, new a(name));
            return HttpKitKtxKt.httpPost$default(this, Api.BINDINFO_URL, new FormBody.Builder().add("name", name).add("status", state).build(), null, null, 12, null).isSuccessful();
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, new b(name), 2, null);
            return false;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @Nullable
    public TokenInfo checkNeedRefresh(@NotNull TokenInfo tokenInfo, @NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode, @NotNull String region) {
        if (!tokenInfo.isAuth()) {
            return tokenInfo;
        }
        HMLog.info(TAG, new c(name));
        if (!tokenInfo.isExpires()) {
            return tokenInfo;
        }
        HMLog.debug(TAG, new d(name));
        TokenInfo tokenInfoRefreshToken = refreshToken(name, uid, thirdName, countryCode, tokenInfo.getRefreshToken(), region);
        if (tokenInfoRefreshToken == null) {
            return null;
        }
        if (TextUtils.isEmpty(tokenInfo.getAccessToken()) || TextUtils.isEmpty(tokenInfo.getExpiresIn()) || TextUtils.isEmpty(tokenInfo.getRefreshToken())) {
            return tokenInfo;
        }
        HMLog.info(TAG, new e(name));
        tokenInfo.reset(tokenInfoRefreshToken.getAccessToken(), tokenInfoRefreshToken.getRefreshToken(), tokenInfoRefreshToken.getExpiresIn());
        return tokenInfo;
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @Nullable
    public TokenInfo getToken(@NotNull String thirdName) {
        try {
            HMLog.info(TAG, new f(thirdName));
            ResponseBody responseBodyBody = HttpKitKtxKt.httpGet$default(this, Api.BINDINFO_URL, null, null, 6, null).body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString != null) {
                if (!(strString.length() == 0)) {
                    try {
                        String strOptString = new JSONObject(strString).optString(thirdName);
                        if (!TextUtils.isEmpty(strOptString)) {
                            return (TokenInfo) UtilKt.getGson().fromJson(strOptString, TokenInfo.class);
                        }
                    } catch (JSONException e2) {
                        HMLog.error$default(TAG, null, e2, new h(thirdName), 2, null);
                    }
                    return null;
                }
            }
            HMLog.warn$default(TAG, null, g.a, 2, null);
            return null;
        } catch (Exception e3) {
            HMLog.error$default(TAG, null, e3, new i(thirdName), 2, null);
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @Nullable
    public TokenInfo getTokenAutoRefresh(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region) {
        HMLog.info(TAG, new j(name));
        TokenInfo token = getToken(thirdName);
        return token != null ? checkNeedRefresh(token, name, thirdName, uid, countryCode, region) : token;
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @NotNull
    public List<TokenInfo> getTokenList(@NotNull String... thirdNames) {
        TokenInfo tokenInfo;
        HMLog.info(TAG, new k(thirdNames));
        try {
            ResponseBody responseBodyBody = HttpKitKtxKt.httpGet$default(this, Api.BINDINFO_URL, null, null, 6, null).body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString != null) {
                if (!(strString.length() == 0)) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : thirdNames) {
                        HMLog.info(TAG, new m(str));
                        Object objOpt = new JSONObject(strString).opt(str);
                        if (objOpt != null) {
                            Object objFromJson = UtilKt.getGson().fromJson(objOpt.toString(), (Class<Object>) TokenInfo.class);
                            ((TokenInfo) objFromJson).setThirdName(str);
                            tokenInfo = (TokenInfo) objFromJson;
                        } else {
                            tokenInfo = null;
                        }
                        if (tokenInfo != null) {
                            arrayList.add(tokenInfo);
                        }
                    }
                    return arrayList;
                }
            }
            HMLog.warn$default(TAG, null, l.a, 2, null);
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, n.a, 2, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public final /* synthetic */ <User> User queryUser(String url, String accessToken) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(TAG, AnonymousClass1.INSTANCE);
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, url, null, kotlin.collections.q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.needClassReification();
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<User>() { // from class: com.huami.thirdparty.webauth.AuthSourceImpl$queryUser$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return (User) objM3845constructorimpl;
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, AnonymousClass2.INSTANCE, 2, null);
            return null;
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    public void refreshEachToken(@NotNull String uid, @NotNull String countryCode, @NotNull String region, @NotNull Pair<String, String>... pairs) {
        Object next;
        List<TokenInfo> tokenList = getTokenList();
        for (Pair<String, String> pair : pairs) {
            Iterator<T> it2 = tokenList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((TokenInfo) next).getThirdName(), pair.getSecond()));
            TokenInfo tokenInfo = (TokenInfo) next;
            if (tokenInfo != null) {
                checkNeedRefresh(tokenInfo, pair.getFirst(), tokenInfo.getThirdName(), uid, countryCode, region);
            }
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @Nullable
    public TokenInfo refreshToken(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String refreshToken, @NotNull String region) {
        Object objM3845constructorimpl;
        TokenInfo tokenInfoEmpty = null;
        try {
            HMLog.info(TAG, new s(name));
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, Api.REFRESH_URL, new FormBody.Builder().add("name", name).add("userId", uid).add("user_id", uid).add("third_name", thirdName).add("refresh_token", refreshToken).add("countryCode", countryCode).add("region", region).build(), null, null, 12, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
                if (responseHttpPost$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpPost$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<TokenInfo>() { // from class: com.huami.thirdparty.webauth.AuthSourceImpl$refreshToken$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return (TokenInfo) objM3845constructorimpl;
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, new t(name), 2, null);
            if ((e2 instanceof HttpError) && ((HttpError) e2).getCode() == 401) {
                HMLog.error$default(TAG, null, null, new u(name), 6, null);
            } else {
                tokenInfoEmpty = TokenInfo.INSTANCE.empty();
            }
            return tokenInfoEmpty;
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    public boolean unbind(@NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode) {
        try {
            HMLog.info(TAG, new v(name));
            return HttpKitKtxKt.httpPost$default(this, Api.REVOKE_URL, new FormBody.Builder().add("name", name).add("userId", uid).add("third_name", thirdName).add("countryCode", countryCode).build(), null, null, 12, null).isSuccessful();
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, new w(name), 2, null);
            return false;
        }
    }

    @Override // com.huami.thirdparty.webauth.AuthSource
    @NotNull
    public List<TokenInfo> getTokenList() {
        HMLog.info(TAG, o.a);
        try {
            ResponseBody responseBodyBody = HttpKitKtxKt.httpGet$default(this, Api.BINDINFO_URL, null, null, 6, null).body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString != null) {
                if (!(strString.length() == 0)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = new JSONObject(strString).keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        HMLog.info(TAG, new q(next));
                        Object objOpt = new JSONObject(strString).opt(next);
                        if (objOpt != null) {
                            Object objFromJson = UtilKt.getGson().fromJson(objOpt.toString(), (Class<Object>) TokenInfo.class);
                            ((TokenInfo) objFromJson).setThirdName(next);
                            Unit unit = Unit.INSTANCE;
                            arrayList.add(objFromJson);
                        }
                    }
                    return arrayList;
                }
            }
            HMLog.warn$default(TAG, null, p.a, 2, null);
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, r.a, 2, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
