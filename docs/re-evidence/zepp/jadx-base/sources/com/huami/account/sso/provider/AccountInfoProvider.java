package com.huami.account.sso.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.passport.AccountManager;
import com.huami.passport.Keeper;
import com.huami.passport.entity.HttpDNS;
import com.huami.passport.entity.SingInfo;
import com.huami.passport.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b(\u0010)J\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u000f*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002J\u001a\u0010\u0013\u001a\u00020\u000f*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016JQ\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u000bH\u0016J=\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0019H\u0016¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006,"}, d2 = {"Lcom/huami/account/sso/provider/AccountInfoProvider;", "Landroid/content/ContentProvider;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/account/sso/provider/AccountInfoProvider$TrustedAppInfo;", GoogleApiAvailabilityLight.a, "", "callingPackage", "Lcom/huami/passport/entity/SingInfo;", "signInfo", "", "c", "", "", "", "b", "Lcom/huami/passport/entity/HttpDNS;", "e", "a", "Landroid/net/Uri;", "uri", "Landroid/content/ContentValues;", "values", Constant.METHOD_INSERT, "", "projection", "selection", "selectionArgs", SDKConstants.PARAM_SORT_ORDER, "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "onCreate", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "<init>", "()V", "Companion", "TrustedAppInfo", "sso-provider_release"}, k = 1, mv = {1, 4, 1})
public final class AccountInfoProvider extends ContentProvider {
    private static final String a = "[hm-account-sso]";
    private static final String b = "[hm-account-sso][provider]";
    private static final String c = "trusted_apps.json";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/account/sso/provider/AccountInfoProvider$TrustedAppInfo;", "", "", "component1", "component2", "appId", "keyHashes", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "getKeyHashes", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sso-provider_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class TrustedAppInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("appId")
        @Nullable
        private final String appId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("keyHashes")
        @Nullable
        private final String keyHashes;

        public TrustedAppInfo(@Nullable String str, @Nullable String str2) {
            this.appId = str;
            this.keyHashes = str2;
        }

        public static /* synthetic */ TrustedAppInfo copy$default(TrustedAppInfo trustedAppInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trustedAppInfo.appId;
            }
            if ((i & 2) != 0) {
                str2 = trustedAppInfo.keyHashes;
            }
            return trustedAppInfo.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getKeyHashes() {
            return this.keyHashes;
        }

        @NotNull
        public final TrustedAppInfo copy(@Nullable String appId, @Nullable String keyHashes) {
            return new TrustedAppInfo(appId, keyHashes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedAppInfo)) {
                return false;
            }
            TrustedAppInfo trustedAppInfo = (TrustedAppInfo) other;
            return Intrinsics.areEqual(this.appId, trustedAppInfo.appId) && Intrinsics.areEqual(this.keyHashes, trustedAppInfo.keyHashes);
        }

        @Nullable
        public final String getAppId() {
            return this.appId;
        }

        @Nullable
        public final String getKeyHashes() {
            return this.keyHashes;
        }

        public int hashCode() {
            String str = this.appId;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.keyHashes;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TrustedAppInfo(appId=" + this.appId + ", keyHashes=" + this.keyHashes + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/account/sso/provider/AccountInfoProvider$query$1$info$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ AccountInfoProvider b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map, AccountInfoProvider accountInfoProvider) {
            super(0);
            this.a = map;
            this.b = accountInfoProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("读取来自于 ");
            Context context = this.b.getContext();
            sb.append(context != null ? context.getPackageName() : null);
            sb.append(" 的用户信息\n");
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(this.a.entrySet(), "\n", null, null, 0, null, null, 62, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取信任 App 列表失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ SingInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, SingInfo singInfo) {
            super(0);
            this.a = str;
            this.b = singInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求方：" + this.a + ", 签名信息：" + this.b.getKeyHash();
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
            return "非法查询：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "查询失败：" + this.a.getMessage();
        }
    }

    private final void a(Map<String, Object> map) {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        AccountManager accountManager = AccountManager.getDefault(getContext());
        map.put(Companion.Columns.LOGIN_STATUS, String.valueOf(accountManager.isLogin()));
        map.put("UserId", userInfo.getUserid());
        map.put("Avatar", userInfo.getAvatar());
        map.put("Nickname", userInfo.getNickname());
        map.put("Location", userInfo.getLocation());
        map.put(Companion.Columns.CREATE_TIME, Long.valueOf(userInfo.getCreatTime()));
        map.put(Companion.Columns.COUNTRY_CODE, accountManager.getProfile().getCountryCode());
        map.put(Companion.Columns.LOGIN_TYPE, accountManager.getProvider());
    }

    private final void b(Map<String, Object> map) {
        AccountManager accountManager = AccountManager.getDefault(getContext());
        map.put("Token", accountManager.getToken().getAccessToken());
        map.put("LoginToken", Keeper.getTokenCache(getContext()).getTokenInfo().getLoginToken());
        map.put(Companion.Columns.DOMAINS, e(accountManager.getHttpDNS(getContext())));
    }

    private final boolean c(String callingPackage, SingInfo signInfo) {
        List<TrustedAppInfo> listD;
        if (callingPackage == null || signInfo == null || (listD = d(getContext())) == null) {
            return false;
        }
        return listD.contains(new TrustedAppInfo(callingPackage, signInfo.getKeyHash()));
    }

    private final List<TrustedAppInfo> d(Context context) {
        try {
            Result.Companion companion = Result.Companion;
            return (List) new GsonBuilder().create().fromJson(Utils.assets2String(context, c), new TypeToken<List<? extends TrustedAppInfo>>() { // from class: com.huami.account.sso.provider.AccountInfoProvider$getTrustedAppsConfigs$1$type$1
            }.getType());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(b, new b(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (List) objM3845constructorimpl;
        }
    }

    private final String e(List<? extends HttpDNS> list) {
        return new Gson().toJson(list);
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @NotNull
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        return Uri.EMPTY;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Object objM3845constructorimpl;
        MatrixCursor matrixCursor;
        try {
            Result.Companion companion = Result.Companion;
            String callingPackage = getCallingPackage();
            SingInfo singInfo = Utils.getSingInfo(getContext(), callingPackage);
            HMLog.info(b, new c(callingPackage, singInfo));
            if (c(callingPackage, singInfo)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b(linkedHashMap);
                a(linkedHashMap);
                HMLog.verbose(b, new a(linkedHashMap, this));
                Object[] array = linkedHashMap.keySet().toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                matrixCursor = new MatrixCursor((String[]) array);
                matrixCursor.addRow(linkedHashMap.values());
            } else {
                HMLog.info(b, new d(callingPackage));
                matrixCursor = null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(matrixCursor);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(b, new e(thM3848exceptionOrNullimpl));
        }
        return (Cursor) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
