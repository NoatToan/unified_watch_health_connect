package com.xiaomi.smarthome.core.server.internal.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.entity.account.RefreshServiceTokenResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.setting.NetworkDebugSetting;
import com.xiaomi.smarthome.core.server.internal.util.UserAgentUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.framework.redpoint.ServerTimerManager;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class UnAuthorRetry {
    private static final String LINE_BREAK = "\r\n";
    private static final String TAG = "UnAuthorRetry";
    private static UnAuthorRetry instance;
    private MiServiceTokenInfo mServiceTokenInfo;
    private final ArrayList<NetCallback<MiServiceTokenInfo, Error>> mRefreshingLogin = new ArrayList<>();
    private final ReentrantReadWriteLock mLock = new ReentrantReadWriteLock();
    private boolean dateHeader = true;

    /* JADX INFO: renamed from: com.xiaomi.smarthome.core.server.internal.api.UnAuthorRetry$1, reason: invalid class name */
    public class AnonymousClass1 implements NetCallback<Bundle, Error> {
        final /* synthetic */ String val$content;
        final /* synthetic */ String val$passToken;
        final /* synthetic */ String val$url;
        final /* synthetic */ String val$userId;

        public AnonymousClass1(String str, String str2, String str3, String str4) {
            this.val$passToken = str;
            this.val$url = str2;
            this.val$content = str3;
            this.val$userId = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(Bundle bundle) {
            MiJiaLog.writeLogOnAll(LogType.NETWORK, UnAuthorRetry.TAG, "refreshServiceToken onSuccess");
            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                MiJiaLog.onlyLogcat(6, "MIIO", "refreshServiceToken onSuccess");
            }
            bundle.setClassLoader(RefreshServiceTokenResult.class.getClassLoader());
            RefreshServiceTokenResult refreshServiceTokenResult = (RefreshServiceTokenResult) bundle.getParcelable("result");
            UnAuthorRetry.this.mLock.writeLock().lock();
            try {
                AccountDepApi.getInstance().setMiServiceToken(UnAuthorRetry.this.mServiceTokenInfo.f14487a, refreshServiceTokenResult.serviceToken, refreshServiceTokenResult.cUserId, refreshServiceTokenResult.ssecurity, UnAuthorRetry.this.mServiceTokenInfo.f, refreshServiceTokenResult.timeDiff);
                AccountDepApi.getInstance().saveAccount();
                SmartHomeRc4Api.getInstance().setInitialized(false);
                UnAuthorRetry.this.dispatchCallback(null);
            } finally {
                UnAuthorRetry.this.mLock.writeLock().unlock();
            }
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        public void onCache(Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        public void onFailure(Error error) {
            MiJiaLog.writeLogOnAll(LogType.NETWORK, UnAuthorRetry.TAG, "refreshServiceToken onFailure " + error + " passToken " + this.val$passToken);
            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                MiJiaLog.onlyLogcat(6, "MIIO", "refreshServiceToken onFailure");
            }
            UnAuthorRetry.this.doUnAuthorized(1, this.val$url + ":" + this.val$content, this.val$userId);
            UnAuthorRetry.this.logUnauthorized(this.val$url, this.val$userId);
            UnAuthorRetry.this.dispatchCallback(new Error(-1, error + ""));
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        public void onSuccess(final Bundle bundle) {
            GlobalHandlerManager.getInstance().getGlobalWorkerHandler().post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.api.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14274a.lambda$onSuccess$0(bundle);
                }
            });
        }
    }

    public UnAuthorRetry(MiServiceTokenInfo miServiceTokenInfo) {
        this.mServiceTokenInfo = miServiceTokenInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCallback(Error error) {
        MiServiceTokenInfo miServiceToken = AccountDepApi.getInstance().getMiServiceToken(this.mServiceTokenInfo.f14487a);
        this.mLock.readLock().lock();
        try {
            for (int size = this.mRefreshingLogin.size() - 1; size >= 0; size--) {
                NetCallback<MiServiceTokenInfo, Error> netCallback = this.mRefreshingLogin.get(size);
                if (netCallback != null) {
                    if (error == null) {
                        netCallback.onSuccess(miServiceToken);
                    } else {
                        netCallback.onFailure(error);
                    }
                }
            }
            this.mLock.readLock().unlock();
            this.mLock.writeLock().lock();
            try {
                this.mRefreshingLogin.clear();
            } finally {
                this.mLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.mLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doUnAuthorized(int i, String str, String str2) {
        String str3;
        AccountDepApi.getInstance().clearAllAccount();
        SmartHomeRc4Api.getInstance().setInitialized(false);
        NetworkDepApi.getInstance().doUnAuthorized();
        try {
            ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
            LogType logType = LogType.NETWORK;
            StringBuilder sb = new StringBuilder();
            sb.append("app_401_errorcode3 doUnAuthorized from=");
            sb.append(i);
            sb.append(",extra=");
            sb.append(str);
            sb.append(",srv=");
            String str4 = null;
            if (server == null) {
                str3 = null;
            } else {
                str3 = server.countryCode + ":" + server.machineCode;
            }
            sb.append(str3);
            MiJiaLog.writeLogOnAll(logType, TAG, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("from:" + i + LINE_BREAK);
            sb2.append("extra:" + str + LINE_BREAK);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("server:");
            if (server != null) {
                str4 = server.countryCode + ":" + server.machineCode;
            }
            sb3.append(str4);
            sb2.append(sb3.toString());
            if (!ifLogCanReport()) {
                NetworkDepApi.getInstance().log401Exp(sb2.toString());
                return;
            }
            sb2.append("uid:" + str2 + LINE_BREAK);
            String string = sb2.toString();
            NetworkDepApi.getInstance().log401Exp(string);
            NetworkDepApi.getInstance().postCatchedException(ServerCompact.isInternationalServer(server) ? new InternationalUnknownUnauthorizedException(string) : new UnauthorizedException(string));
            MiJiaLog.writeLogOnGrey(LogType.LOGIN, "rc4", string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static UnAuthorRetry getInstance(MiServiceTokenInfo miServiceTokenInfo) {
        UnAuthorRetry unAuthorRetry = instance;
        if (unAuthorRetry == null || !unAuthorRetry.mServiceTokenInfo.equals(miServiceTokenInfo)) {
            synchronized (UnAuthorRetry.class) {
                try {
                    UnAuthorRetry unAuthorRetry2 = instance;
                    if (unAuthorRetry2 == null || !TextUtils.equals(unAuthorRetry2.mServiceTokenInfo.f14487a, miServiceTokenInfo.f14487a)) {
                        instance = new UnAuthorRetry(miServiceTokenInfo);
                    } else {
                        instance.mServiceTokenInfo = miServiceTokenInfo;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private boolean ifLogCanReport() {
        ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
        boolean z = (MiJiaEnvironment.isInGreyPublish() || ServerCompact.isInternationalServer(server)) ? false : true;
        if (ServerCompact.isEurope(server)) {
            return false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logUnauthorized(String str, String str2) {
        String str3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("url:" + str + LINE_BREAK);
            if (!ifLogCanReport()) {
                NetworkDepApi.getInstance().log401AfterRefreshToken(sb.toString());
                return;
            }
            ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
            sb.append("userId:" + str2 + LINE_BREAK);
            sb.append("UA:" + UserAgentUtil.getUserAgent(MiJiaEnvironment.getAppContext()) + LINE_BREAK);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("server:");
            if (server == null) {
                str3 = null;
            } else {
                str3 = server.countryCode + ":" + server.machineCode;
            }
            sb2.append(str3);
            sb.append(sb2.toString());
            String string = sb.toString();
            NetworkDepApi.getInstance().log401AfterRefreshToken(string);
            NetworkDepApi.getInstance().postCatchedException(ServerCompact.isInternationalServer(server) ? new InternationalUnauthorizedException(string) : new UnauthorizedException(string));
            MiJiaLog.writeLogOnGrey(LogType.LOGIN, "rc4", string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    private void refreshTimeDiff(String str, String str2, String str3) {
        Pair<Long, Boolean> serverTimeSync;
        if (!this.dateHeader || TextUtils.isEmpty(str2)) {
            serverTimeSync = ServerTimerManager.getServerTimeSync();
            if (serverTimeSync != null || !((Boolean) serverTimeSync.second).booleanValue()) {
                LogType logType = LogType.NETWORK;
                StringBuilder sb = new StringBuilder();
                sb.append("refreshTimeDiff fail ");
                sb.append(serverTimeSync != null ? (Boolean) serverTimeSync.second : null);
                MiJiaLog.writeLogOnAll(logType, TAG, sb.toString());
                if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                    MiJiaLog.onlyLogcat(6, "MIIO", "refreshTimeDiff onFailure");
                }
                doUnAuthorized(3, str + ":" + str3, AccountDepApi.getInstance().getMiId());
                logUnauthorized(str, AccountDepApi.getInstance().getMiId());
                dispatchCallback(new Error(-1, "refreshTimeDiff fail with 401"));
                return;
            }
            MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "refreshTimeDiff start");
            this.mServiceTokenInfo.e = ((Long) serverTimeSync.first).longValue();
        } else {
            long j = Date.parse(str2);
            if (j == 0) {
                serverTimeSync = ServerTimerManager.getServerTimeSync();
                if (serverTimeSync != null) {
                }
                LogType logType2 = LogType.NETWORK;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refreshTimeDiff fail ");
                sb2.append(serverTimeSync != null ? (Boolean) serverTimeSync.second : null);
                MiJiaLog.writeLogOnAll(logType2, TAG, sb2.toString());
                if (MiJiaEnvironment.isDebugBuildType()) {
                    MiJiaLog.onlyLogcat(6, "MIIO", "refreshTimeDiff onFailure");
                } else {
                    MiJiaLog.onlyLogcat(6, "MIIO", "refreshTimeDiff onFailure");
                }
                doUnAuthorized(3, str + ":" + str3, AccountDepApi.getInstance().getMiId());
                logUnauthorized(str, AccountDepApi.getInstance().getMiId());
                dispatchCallback(new Error(-1, "refreshTimeDiff fail with 401"));
                return;
            }
            this.mServiceTokenInfo.e = j - System.currentTimeMillis();
            this.dateHeader = false;
            MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "refre;hTimeDiff server " + j + " " + this.mServiceTokenInfo.e);
        }
        this.mLock.writeLock().lock();
        try {
            AccountDepApi accountDepApi = AccountDepApi.getInstance();
            MiServiceTokenInfo miServiceTokenInfo = this.mServiceTokenInfo;
            accountDepApi.setMiServiceToken(miServiceTokenInfo.f14487a, miServiceTokenInfo.c, miServiceTokenInfo.f14488b, miServiceTokenInfo.d, miServiceTokenInfo.f, miServiceTokenInfo.e);
            AccountDepApi.getInstance().saveAccount();
            SmartHomeRc4Api.getInstance().setInitialized(false);
            dispatchCallback(null);
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    private void refreshToken(String str, String str2) {
        String miId = AccountDepApi.getInstance().getMiId();
        boolean zIsMiSystemAccount = AccountDepApi.getInstance().isMiSystemAccount();
        String miPassToken = AccountDepApi.getInstance().getMiPassToken();
        try {
            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isDevChannel()) {
                if (NetworkDebugSetting.sFail401WithNoRefreshToken) {
                    doUnAuthorized(10, str + ":" + str2, miId);
                    logUnauthorized(str, miId);
                    dispatchCallback(new Error(-1, "GlobalSetting.sFail401WithNoRefreshToken true"));
                    return;
                }
            }
            if (zIsMiSystemAccount) {
                AccountDepApi.getInstance().clearAllMiServiceTokenInSystem();
            }
            MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "refreshToken start");
            NetworkDepApi.getInstance().refreshServiceToken(this.mServiceTokenInfo.f14487a, miId, zIsMiSystemAccount, miPassToken, new AnonymousClass1(miPassToken, str, str2, miId));
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "refreshServiceToken Exception " + Log.getStackTraceString(e));
            if (zIsMiSystemAccount) {
                AccountDepApi.getInstance().clearAllMiServiceTokenInSystem();
            }
            doUnAuthorized(2, str + ":" + str2, miId);
            dispatchCallback(new Error(-1, Log.getStackTraceString(e)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x013a A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #1 {all -> 0x0129, blocks: (B:28:0x00ec, B:30:0x00fa, B:32:0x0102, B:37:0x012c, B:39:0x013a, B:42:0x0160), top: B:60:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0160 A[Catch: all -> 0x0129, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0129, blocks: (B:28:0x00ec, B:30:0x00fa, B:32:0x0102, B:37:0x012c, B:39:0x013a, B:42:0x0160), top: B:60:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:45:0x018e  */
    /* JADX WARN: Code duplicated, block: B:46:0x019a  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x013a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0160, please report this as an issue */
    public void processUnAuthorized(String str, Response response, @NotNull NetCallback<MiServiceTokenInfo, Error> netCallback) {
        String strString;
        int iOptInt;
        MiServiceTokenInfo miServiceToken;
        long tokenTime;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            netCallback.onFailure(new Error(-2, "responseBody is null"));
            return;
        }
        try {
            strString = responseBodyBody.string();
            try {
                iOptInt = new JSONObject(strString).optInt("code");
                if (iOptInt == 2) {
                    try {
                        HashMap map = new HashMap();
                        map.put("url", str);
                        map.put(b.I, strString);
                        map.put("uid", AccountDepApi.getInstance().getMiId());
                        MiServiceTokenInfo miServiceTokenInfo = this.mServiceTokenInfo;
                        String str2 = miServiceTokenInfo == null ? "" : miServiceTokenInfo.c;
                        map.put("serviceToken", str2);
                        List<MiServiceTokenInfo> arrayList = new ArrayList<>();
                        if (AccountDepApi.getInstance().getMiAccount() != null) {
                            arrayList = AccountDepApi.getInstance().getMiAccount().c();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(";");
                        sb.append(strString);
                        sb.append(";");
                        sb.append(AccountDepApi.getInstance().getMiId());
                        sb.append(";");
                        sb.append(str2);
                        sb.append(";");
                        for (MiServiceTokenInfo miServiceTokenInfo2 : arrayList) {
                            sb.append(miServiceTokenInfo2.f14487a);
                            sb.append(":");
                            sb.append(miServiceTokenInfo2.c);
                            sb.append(";");
                        }
                        map.put("all", sb.toString());
                        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "app_401_errorcode2 " + map);
                    } catch (Throwable unused) {
                        responseBodyBody.close();
                    }
                }
            } catch (Throwable unused2) {
                iOptInt = -1;
                responseBodyBody.close();
                this.mLock.writeLock().lock();
                miServiceToken = AccountDepApi.getInstance().getMiServiceToken(this.mServiceTokenInfo.f14487a);
                if (miServiceToken == null) {
                }
                this.mRefreshingLogin.add(netCallback);
                if (this.mRefreshingLogin.size() != 1) {
                    MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "rmRefreshingLogin.size " + this.mRefreshingLogin.size());
                    this.mLock.writeLock().unlock();
                    return;
                }
                LogType logType = LogType.NETWORK;
                MiJiaLog.writeLogOnAll(logType, TAG, "processUnAuthorized.refreshToken json:" + strString);
                this.mLock.writeLock().unlock();
                tokenTime = AccountDepApi.getInstance().getTokenTime(this.mServiceTokenInfo.f14487a);
                if (iOptInt == 4) {
                    refreshTimeDiff(str, response.header(DialWidgetType.DATE), strString);
                    return;
                } else {
                    if (tokenTime != 0) {
                    }
                    refreshToken(str, strString);
                    return;
                }
            }
        } catch (Throwable unused3) {
            strString = null;
        }
        this.mLock.writeLock().lock();
        try {
            miServiceToken = AccountDepApi.getInstance().getMiServiceToken(this.mServiceTokenInfo.f14487a);
            if (miServiceToken == null && !this.mServiceTokenInfo.equals(miServiceToken)) {
                netCallback.onSuccess(this.mServiceTokenInfo);
                MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "processUnAuthorized.onSuccess " + this.mServiceTokenInfo);
                this.mLock.writeLock().unlock();
                return;
            }
            this.mRefreshingLogin.add(netCallback);
            if (this.mRefreshingLogin.size() != 1) {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "rmRefreshingLogin.size " + this.mRefreshingLogin.size());
                this.mLock.writeLock().unlock();
                return;
            }
            LogType logType2 = LogType.NETWORK;
            MiJiaLog.writeLogOnAll(logType2, TAG, "processUnAuthorized.refreshToken json:" + strString);
            this.mLock.writeLock().unlock();
            tokenTime = AccountDepApi.getInstance().getTokenTime(this.mServiceTokenInfo.f14487a);
            if (iOptInt == 4) {
                refreshTimeDiff(str, response.header(DialWidgetType.DATE), strString);
                return;
            }
            if (tokenTime != 0 || System.currentTimeMillis() - tokenTime > 10000) {
                refreshToken(str, strString);
                return;
            }
            MiJiaLog.writeLogOnAll(logType2, TAG, "refreshToken need to doUnAuthorized, refreshTime=" + tokenTime + ",url=" + str + ",content" + strString);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(":");
            sb2.append(strString);
            doUnAuthorized(4, sb2.toString(), AccountDepApi.getInstance().getMiId());
            dispatchCallback(new Error(-1, "refreshToken once 0"));
        } catch (Throwable th) {
            this.mLock.writeLock().unlock();
            throw th;
        }
    }
}
