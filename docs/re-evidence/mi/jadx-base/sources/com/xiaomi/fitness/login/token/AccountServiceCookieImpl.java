package com.xiaomi.fitness.login.token;

import android.webkit.CookieManager;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.SIDs;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.AccessTokenObserver;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.AccountCookieManager;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/login/token/AccountServiceCookieImpl;", "Lcom/xiaomi/fitness/login/export/AccountCookieManager;", "mTokenManager", "Lcom/xiaomi/fitness/login/token/TokenManagerInternal;", "mAccessManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "<init>", "(Lcom/xiaomi/fitness/login/token/TokenManagerInternal;Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "mUserName", "", "notifyAccountCookie", "", "plantPrivateCookie", "sid", OAuthAccountManager.MiOAuthConstant.TOKEN, "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "plantMiHomeLoginCookie", "plantHealthCookie", "saveWebViewCookie", "url", "cookies", "", "getThrowableString", PluginDeviceInfo.FICONOFFLINE, "", CervicalMucusRecord.Appearance.CLEAR, "clearCookie", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountServiceCookieImpl implements AccountCookieManager {

    @NotNull
    private final AccountManager mAccessManager;

    @NotNull
    private final TokenManagerInternal mTokenManager;

    @Nullable
    private String mUserName;

    public AccountServiceCookieImpl(@NotNull TokenManagerInternal mTokenManager, @NotNull AccountManager mAccessManager) {
        Intrinsics.checkNotNullParameter(mTokenManager, "mTokenManager");
        Intrinsics.checkNotNullParameter(mAccessManager, "mAccessManager");
        this.mTokenManager = mTokenManager;
        this.mAccessManager = mAccessManager;
        mTokenManager.registerObserver("miothealth", new AccessTokenObserver() { // from class: com.xiaomi.fitness.login.token.AccountServiceCookieImpl.1
            @Override // com.xiaomi.fitness.account.token.AccessTokenObserver
            public void onChange(MiAccessToken accessToken) {
                AccountServiceCookieImpl.this.plantHealthCookie("miothealth", accessToken);
                AccountServiceCookieImpl.this.plantPrivateCookie("miothealth", accessToken);
            }
        });
        mTokenManager.registerObserver(SIDs.MIOT_HEALTH_STAGING, new AccessTokenObserver() { // from class: com.xiaomi.fitness.login.token.AccountServiceCookieImpl.2
            @Override // com.xiaomi.fitness.account.token.AccessTokenObserver
            public void onChange(MiAccessToken accessToken) {
                AccountServiceCookieImpl.this.plantHealthCookie(SIDs.MIOT_HEALTH_STAGING, accessToken);
                AccountServiceCookieImpl.this.plantPrivateCookie(SIDs.MIOT_HEALTH_STAGING, accessToken);
            }
        });
        mTokenManager.registerObserver(SIDs.MIOT_HEALTH_AT, new AccessTokenObserver() { // from class: com.xiaomi.fitness.login.token.AccountServiceCookieImpl.3
            @Override // com.xiaomi.fitness.account.token.AccessTokenObserver
            public void onChange(MiAccessToken accessToken) {
                AccountServiceCookieImpl.this.plantHealthCookie(SIDs.MIOT_HEALTH_AT, accessToken);
                AccountServiceCookieImpl.this.plantPrivateCookie(SIDs.MIOT_HEALTH_AT, accessToken);
            }
        });
        mTokenManager.registerObserver(LoginSetting.SID_XIAOMI_HOME, new AccessTokenObserver() { // from class: com.xiaomi.fitness.login.token.AccountServiceCookieImpl.4
            @Override // com.xiaomi.fitness.account.token.AccessTokenObserver
            public void onChange(MiAccessToken accessToken) {
                AccountServiceCookieImpl.this.plantMiHomeLoginCookie(LoginSetting.SID_XIAOMI_HOME, accessToken);
            }
        });
    }

    private final void clearCookie() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            Logger.i("|COOKIE|clearCookie", new Object[0]);
        } catch (Exception e) {
            Logger.e("|COOKIE|clearCookie exception", e);
        }
    }

    private final String getThrowableString(Throwable e) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void plantHealthCookie(String sid, MiAccessToken accessToken) {
        String str;
        if (accessToken != null) {
            StringBuilder sb = new StringBuilder();
            String serviceToken = accessToken.getServiceToken();
            String cUserId = accessToken.getCUserId();
            String userId = this.mAccessManager.getUserId();
            if (userId != null) {
                this.mUserName = userId;
            }
            sb.append("S_TOKEN:");
            sb.append(accessToken.getServiceToken());
            sb.append("\r\n");
            sb.append("\r\n");
            if (serviceToken == null || cUserId == null) {
                Logger.d("|COOKIE|" + ((Object) sb), new Object[0]);
                return;
            }
            String[] strArr = {".watch.iot.mi.com", ".st-watch.iot.mi.com", ".dev.fe.home.mi.com", ".st.iot.home.mi.com", ".account.xiaomi.com"};
            int i = 0;
            while (true) {
                str = "cUserId=%s";
                if (i >= 5) {
                    break;
                }
                String str2 = strArr[i];
                String[] strArr2 = strArr;
                ArrayList arrayList = new ArrayList();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format("%s_serviceToken=%s", Arrays.copyOf(new Object[]{sid, serviceToken}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                String str4 = cUserId;
                String str5 = String.format("cUserId=%s", Arrays.copyOf(new Object[]{cUserId}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                String str6 = serviceToken;
                int i2 = i;
                String str7 = String.format("locale=%s", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                arrayList.add(str3);
                arrayList.add(str5);
                arrayList.add(str7);
                sb.append(str2);
                sb.append(":");
                sb.append(str3);
                sb.append(",");
                sb.append(str5);
                sb.append(",");
                try {
                    saveWebViewCookie(str2, arrayList);
                } catch (Exception e) {
                    sb.append("exception:");
                    sb.append(getThrowableString(e));
                    Logger.d("|COOKIE|" + ((Object) sb), new Object[0]);
                }
                i = i2 + 1;
                strArr = strArr2;
                cUserId = str4;
                serviceToken = str6;
            }
            String str8 = serviceToken;
            String str9 = cUserId;
            String[] strArr3 = {".hlth.io.mi.com", ".staging-hlth.io.mi.com"};
            int i3 = 2;
            int i4 = 0;
            while (i4 < i3) {
                String str10 = strArr3[i4];
                ArrayList arrayList2 = new ArrayList();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String[] strArr4 = strArr3;
                String str11 = str8;
                String str12 = String.format("serviceToken=%s", Arrays.copyOf(new Object[]{sid, str11}, i3));
                Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                String str13 = String.format(str, Arrays.copyOf(new Object[]{str9}, 1));
                Intrinsics.checkNotNullExpressionValue(str13, "format(...)");
                int i5 = i4;
                String str14 = str;
                String str15 = String.format("locale=%s", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(str15, "format(...)");
                arrayList2.add(str12);
                arrayList2.add(str13);
                arrayList2.add(str15);
                sb.append(str10);
                sb.append(":");
                sb.append(str12);
                sb.append(",");
                sb.append(str13);
                sb.append(",");
                try {
                    saveWebViewCookie(str10, arrayList2);
                } catch (Exception e2) {
                    sb.append("exception:");
                    sb.append(getThrowableString(e2));
                    Logger.d("|COOKIE|" + ((Object) sb), new Object[0]);
                }
                i4 = i5 + 1;
                strArr3 = strArr4;
                str = str14;
                i3 = 2;
                str8 = str11;
            }
            accessToken.setUserId(this.mUserName);
            sb.append("plant cookie success\n");
            Logger.d("|COOKIE|" + ((Object) sb), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void plantMiHomeLoginCookie(String sid, MiAccessToken accessToken) {
        Logger.d("|Cookie|", "plantMiHomeLoginCookie(" + sid + "): serviceToken(" + accessToken + ")");
        if (accessToken != null && accessToken.isLogin()) {
            ArrayList arrayList = new ArrayList();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("serviceToken=%s", Arrays.copyOf(new Object[]{accessToken.getServiceToken()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format("cUserId=%s", Arrays.copyOf(new Object[]{accessToken.getCUserId()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            arrayList.add(str);
            arrayList.add(str2);
            try {
                saveWebViewCookie(LoginSetting.COOKIE_DOMAIN_XIAOMI_HOME, arrayList);
            } catch (Exception unused) {
                Logger.d("|Cookie|", "plantMiHomeLoginCookie|COOKIE|" + accessToken + "-" + str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void plantPrivateCookie(String sid, MiAccessToken accessToken) {
        Logger.d("|Cookie|", "plantPrivateCookie(" + sid + "): serviceToken(" + accessToken + ")");
        if (accessToken != null && accessToken.isLogin()) {
            ArrayList arrayList = new ArrayList();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("serviceToken=%s", Arrays.copyOf(new Object[]{accessToken.getServiceToken()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format("cUserId=%s", Arrays.copyOf(new Object[]{accessToken.getCUserId()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String str3 = String.format("ssecurity=%s", Arrays.copyOf(new Object[]{accessToken.getSecurity()}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            String str4 = "updateTime=" + System.currentTimeMillis();
            arrayList.add(str);
            arrayList.add(str2);
            arrayList.add(str3);
            arrayList.add(str4);
            try {
                saveWebViewCookie(".wear.mi.com.internal.yrn.net", arrayList);
                if (accessToken.getServiceToken() == null || accessToken.getCUserId() == null || accessToken.getSecurity() == null) {
                    return;
                }
                String serviceToken = accessToken.getServiceToken();
                Intrinsics.checkNotNull(serviceToken);
                String cUserId = accessToken.getCUserId();
                Intrinsics.checkNotNull(cUserId);
                String security = accessToken.getSecurity();
                Intrinsics.checkNotNull(security);
                YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent("USER_ACCOUNT_SERVER_INFO_UPDATE", MapsKt__MapsKt.mapOf(TuplesKt.to("serviceToken", serviceToken), TuplesKt.to("cUserId", cUserId), TuplesKt.to("ssecurity", security)));
                Logger.i("|Cookie|", "plantPrivateCookie send token message to rn");
            } catch (Exception unused) {
                Logger.d("|Cookie|", "plantPrivateCookie|COOKIE|" + accessToken + "-" + str2);
            }
        }
    }

    private final void saveWebViewCookie(String url, List<String> cookies) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (cookies != null) {
            Iterator<String> it = cookies.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(url, it.next());
            }
        }
        cookieManager.flush();
    }

    @Override // com.xiaomi.fitness.login.export.AccountCookieManager
    public void clear() {
        clearCookie();
    }

    @Override // com.xiaomi.fitness.login.export.AccountCookieManager
    public void notifyAccountCookie() {
        MiAccessToken serviceToken$default = TokenManager.DefaultImpls.getServiceToken$default(this.mTokenManager, "miothealth", false, 3, 2, null);
        if (serviceToken$default == null) {
            Logger.i("|Cookie|", "notifyAccountCookie: no value");
            return;
        }
        plantHealthCookie("miothealth", serviceToken$default);
        plantPrivateCookie("miothealth", serviceToken$default);
        Logger.i("|Cookie|", "notifyAccountCookie: have value");
    }
}
