package com.huami.identity.auth.alexa;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareAnalytics;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/identity/auth/alexa/AlexaAuthKeeper;", "", "<init>", "()V", "Companion", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaAuthKeeper {

    @NotNull
    public static final String KEY_ACCESS_TOKEN = "access_token_042017";

    @NotNull
    public static final String KEY_CLIENT_ID = "clientId";

    @NotNull
    public static final String KEY_DEADLINE_TIME = "token_expires_042017";

    @NotNull
    public static final String KEY_REDIRECT_URL = "redirectUrl";

    @NotNull
    public static final String KEY_REFRESH_TOKEN = "refresh_token_042017";
    private static final int b = 1000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "alexa_auth_sp";
    private static final MMKV c = MMKV.mmkvWithID(a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010(\u001a\n '*\u0004\u0018\u00010&0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/huami/identity/auth/alexa/AlexaAuthKeeper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "migrateOldAlexaAuthSp", "", "key", "getString$auth_alexa_release", "(Ljava/lang/String;)Ljava/lang/String;", "getString", "", "getLong$auth_alexa_release", "(Ljava/lang/String;)J", "getLong", "value", "save$auth_alexa_release", "(Ljava/lang/String;Ljava/lang/String;)V", ShareAnalytics.ParamValue.SAVE, "(Ljava/lang/String;J)V", "Lcom/huami/identity/auth/alexa/Token;", "token", "saveToken$auth_alexa_release", "(Lcom/huami/identity/auth/alexa/Token;)V", "saveToken", "clear$auth_alexa_release", "()V", "clear", "KEY_ACCESS_TOKEN", "Ljava/lang/String;", "KEY_CLIENT_ID", "KEY_DEADLINE_TIME", "KEY_REDIRECT_URL", "KEY_REFRESH_TOKEN", "KV_NAME", "", "MILLIS_PER_SECOND", LogUtil.I, "Lcom/tencent/mmkv/MMKV;", "kotlin.jvm.PlatformType", "kvKeeper", "Lcom/tencent/mmkv/MMKV;", "<init>", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z) {
                super(0);
                this.a = str;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "保存" + this.a + " 成功：" + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z) {
                super(0);
                this.a = str;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "保存" + this.a + " 成功：" + this.b;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear$auth_alexa_release() {
            AlexaAuthKeeper.c.clearAll();
        }

        public final long getLong$auth_alexa_release(@NotNull String key) {
            return AlexaAuthKeeper.c.decodeLong(key);
        }

        @Nullable
        public final String getString$auth_alexa_release(@NotNull String key) {
            return AlexaAuthKeeper.c.decodeString(key);
        }

        public final void migrateOldAlexaAuthSp(@NotNull Context context) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            AlexaAuthKeeper.c.importFromSharedPreferences(defaultSharedPreferences);
            defaultSharedPreferences.edit().clear().apply();
        }

        public final void save$auth_alexa_release(@NotNull String key, @NotNull String value) {
            HMLog.info("speech", new a(key, AlexaAuthKeeper.c.encode(key, value)));
        }

        public final void saveToken$auth_alexa_release(@NotNull Token token) {
            save$auth_alexa_release(AlexaAuthKeeper.KEY_ACCESS_TOKEN, token.getAccessToken());
            String refreshToken = token.getRefreshToken();
            if (refreshToken == null) {
                refreshToken = "";
            }
            save$auth_alexa_release(AlexaAuthKeeper.KEY_REFRESH_TOKEN, refreshToken);
            save$auth_alexa_release(AlexaAuthKeeper.KEY_DEADLINE_TIME, System.currentTimeMillis() + (token.getIntervalExpiryTime() * ((long) 1000)));
        }

        public final void save$auth_alexa_release(@NotNull String key, long value) {
            HMLog.info("speech", new b(key, AlexaAuthKeeper.c.encode(key, value)));
        }
    }
}
