package com.huami.third.xiaomi;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.UserInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/third/xiaomi/MiTokenUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/passport/entity/ThirdPartyToken;", "token", "", "a", "checkNeedMiAuth", "", "saveMiToken", "clearMiToken", "checkMiTokenExists", "", "Ljava/lang/String;", "TAG", "b", "()Lcom/huami/passport/entity/ThirdPartyToken;", "savedMiToken", "c", "()Z", "isMiAuthSuccess", "<init>", "()V", "xiaomi_release"}, k = 1, mv = {1, 4, 1})
public final class MiTokenUtil {

    @NotNull
    public static final MiTokenUtil INSTANCE = new MiTokenUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "Account-MiToken";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No MiToken exists, need to Auth!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Clear MiToken!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ThirdPartyToken a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ThirdPartyToken thirdPartyToken) {
            super(0);
            this.a = thirdPartyToken;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Save MiToken: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ThirdPartyToken a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ThirdPartyToken thirdPartyToken) {
            super(0);
            this.a = thirdPartyToken;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Read MiToken: " + this.a;
        }
    }

    private MiTokenUtil() {
    }

    private final boolean a(Context context, ThirdPartyToken token) {
        UserInfo userInfo;
        if (!checkMiTokenExists(token) && c() && (userInfo = AccountManager.getDefault(context).getUserInfo()) != null) {
            token.setAccessToken(userInfo.getAccessToken());
            token.setRefreshToken(userInfo.getRefreshToken());
            token.setExpiresIn(userInfo.getExpiresIn());
            saveMiToken(token);
        }
        String refreshToken = token.getRefreshToken();
        boolean z = refreshToken == null || refreshToken.length() == 0;
        if (z) {
            HMLog.error$default(TAG, null, null, a.a, 6, null);
        }
        return z;
    }

    private final ThirdPartyToken b() {
        ThirdPartyToken thirdPartyToken = new ThirdPartyToken();
        thirdPartyToken.setAccessToken(MiCache.getAccessToken());
        thirdPartyToken.setRefreshToken(MiCache.getRefreshToken());
        long expires = MiCache.getExpires();
        if (expires > -1) {
            thirdPartyToken.setExpiresIn(expires);
        }
        HMLog.debug(TAG, new d(thirdPartyToken));
        return thirdPartyToken;
    }

    private final boolean c() {
        return MiCache.getAuthSuccess();
    }

    public final boolean checkMiTokenExists(@NotNull ThirdPartyToken token) {
        return (TextUtils.isEmpty(token.getAccessToken()) || TextUtils.isEmpty(token.getRefreshToken())) ? false : true;
    }

    public final boolean checkNeedMiAuth(@NotNull Context context) {
        return a(context, b());
    }

    public final void clearMiToken() {
        MiCache.removeAccessToken();
        MiCache.removeRefreshToken();
        MiCache.removeExpires();
        HMLog.debug(TAG, b.a);
    }

    public final void saveMiToken(@NotNull ThirdPartyToken token) {
        MiCache.saveAccessToken(token.getAccessToken());
        MiCache.saveRefreshToken(token.getRefreshToken());
        MiCache.saveExpires(token.getExpiresIn());
        HMLog.debug(TAG, new c(token));
    }
}
