package com.huami.passport;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.passport.ErrorCode;
import com.huami.passport.PartnerAuthHandler;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class PartnerAuthHandler {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onError$1(String str) {
        return str;
    }

    public static void miSSO(Activity activity, IAccount.Callback<String, String> callback) {
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 == null) {
            return;
        }
        try {
            Map map = (Map) new GsonBuilder().create().fromJson(Utils.assets2String(activity2.getApplicationContext(), "tpac.json"), new TypeToken<Map<String, TpaConfig>>() { // from class: com.huami.passport.PartnerAuthHandler.1
            }.getType());
            if (map == null) {
                HMLog.debug(new Function0() { // from class: xr5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                    }
                });
                onError(callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                return;
            }
            TpaConfig tpaConfig = (TpaConfig) map.get("xiaomi");
            if (tpaConfig == null) {
                onError(callback, ErrorCode.TPA_CONFIG_ERROR);
                return;
            }
            List<String> scope = tpaConfig.getScope();
            int size = scope.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = Integer.parseInt(scope.get(i));
            }
            waitAndShowFutureResult(activity, new XiaomiOAuthorize().setAppId(Long.parseLong(tpaConfig.getAppId())).setRedirectUrl(tpaConfig.getRedirectUrl()).setScope(iArr).setKeepCookies(false).setNoMiui(false).setSkipConfirm(tpaConfig.isSkipConfirm()).setPlatform(tpaConfig.getPlatform()).startGetAccessToken(activity), callback);
        } catch (IOException unused) {
            onError(callback, ErrorCode.NO_TPA_FOUND_ERROR);
        }
    }

    public static void onError(final IAccount.Callback<String, String> callback, final String str) {
        HMLog.debug(new Function0() { // from class: wr5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PartnerAuthHandler.lambda$onError$1(str);
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.PartnerAuthHandler.2
            @Override // java.lang.Runnable
            public void run() {
                IAccount.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onError(str);
                }
            }
        });
    }

    private static <V> void waitAndShowFutureResult(Activity activity, final XiaomiOAuthFuture<V> xiaomiOAuthFuture, final IAccount.Callback<String, String> callback) {
        new AsyncTask<Void, Void, V>() { // from class: com.huami.passport.PartnerAuthHandler.3
            public Exception e;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.AsyncTask
            public void onPostExecute(V v) {
                if (v != 0 && (v instanceof XiaomiOAuthResults)) {
                    XiaomiOAuthResults xiaomiOAuthResults = (XiaomiOAuthResults) v;
                    IAccount.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.onSuccess(xiaomiOAuthResults.getAccessToken());
                        return;
                    }
                    return;
                }
                Exception exc = this.e;
                if (exc == null) {
                    PartnerAuthHandler.onError(callback, ErrorCode.TPA_DONE_NO_RESULT);
                    return;
                }
                if (exc instanceof OperationCanceledException) {
                    PartnerAuthHandler.onError(callback, ErrorCode.USER_CANCEL_ERROR);
                }
                if (this.e instanceof XMAuthericationException) {
                    PartnerAuthHandler.onError(callback, ErrorCode.TPA_DENIED_ERROR);
                }
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }

            @Override // android.os.AsyncTask
            public V doInBackground(Void... voidArr) {
                try {
                    return (V) xiaomiOAuthFuture.getResult();
                } catch (OperationCanceledException e) {
                    this.e = e;
                    return null;
                } catch (XMAuthericationException e2) {
                    this.e = e2;
                    return null;
                } catch (IOException e3) {
                    this.e = e3;
                    return null;
                }
            }
        }.execute(new Void[0]);
    }
}
