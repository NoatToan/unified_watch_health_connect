package com.xiaomi.smarthome.core.server.internal.account;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.smarthome.core.entity.account.OAuthAccount;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.common.util.XMEncryptUtils;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.utils.UpdateWatcher;
import com.xiaomi.smarthome.utils.Watcher;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MiJiaAccountManager extends UpdateWatcher<MiJiaAccountManager> {
    public static final String ACCOUNT_PREFS = "com.xiaomi.smarthome.account";
    public static final String KEY_MI_ACCOUNT = "mi_account";
    public static final String KEY_MI_ACCOUNT_ENCRYPT = "mi_account_encrypt";
    private static final String KEY_OAUTH_ACCOUNT = "oauth_account";
    private static final String KEY_OAUTH_ACCOUNT_ENCRYPT = "oauth_account_encrypt";
    public static final String UNLOGGEDIN_USERID = "0";
    public static final int USER_DEGREE_DEBUG = 1;
    public static final int USER_DEGREE_GREY = 2;
    public static final int USER_DEGREE_NORMAL = 0;
    private static volatile MiJiaAccountManager sInstance;
    private static Object sLock = new Object();
    private SharedPreferences mAccountPrefs;
    private AccountType mAccountType;
    private LoginMiAccount mMiAccount;
    private OAuthAccount mOAuthAccount;
    private boolean mIsInitialized = false;
    private volatile long mUserDegree = 0;
    private Context mAppContext = MiJiaEnvironment.getAppContext();

    private MiJiaAccountManager() {
        init();
    }

    private static String getDecryptedContent(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strDecrypt = XMEncryptUtils.decrypt(str, CommonUtil.getAesKeyAndroidId32Bytes(context));
        if (TextUtils.isEmpty(strDecrypt)) {
            return null;
        }
        return strDecrypt;
    }

    private static String getEncryptedContent(Context context, String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return XMEncryptUtils.encrypt(str, CommonUtil.getAesKeyAndroidId32Bytes(context));
    }

    public static MiJiaAccountManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new MiJiaAccountManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private String migrateFromOldData(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = this.mAccountPrefs;
        if (sharedPreferences != null && TextUtils.isEmpty(str)) {
            str = new String(Base64Coder.decode(sharedPreferences.getString(str2, "")));
            if (!TextUtils.isEmpty(str)) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(str3, getEncryptedContent(this.mAppContext, str));
                    editorEdit.putString(str2, "");
                    editorEdit.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }

    public synchronized void clearAllAccount() {
        LogType logType = LogType.LOGIN;
        MiJiaLog.writeLogOnGrey(logType, "AccountManager", "clearMiAccount");
        synchronized (this) {
            SharedPreferences sharedPreferences = this.mAccountPrefs;
            if (sharedPreferences == null) {
                MiJiaLog.writeLogOnGrey(logType, "AccountManager", "clearAllAccount:mAccountPrefs is null!!");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(KEY_MI_ACCOUNT);
            editorEdit.remove(KEY_OAUTH_ACCOUNT);
            editorEdit.remove(KEY_MI_ACCOUNT_ENCRYPT);
            editorEdit.remove(KEY_OAUTH_ACCOUNT_ENCRYPT);
            editorEdit.apply();
            this.mAccountType = null;
            this.mMiAccount = null;
            this.mOAuthAccount = null;
            this.mUserDegree = 0L;
            UserDegreeManager.getInstance().setDirty();
            ArrayList arrayList = this.mUpdateListener != null ? new ArrayList(this.mUpdateListener) : null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Watcher) it.next()).accept(this);
                }
            }
        }
    }

    public synchronized void clearAllMiServiceTokenInSystem() {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return;
        }
        for (MiServiceTokenInfo miServiceTokenInfo : loginMiAccount.c()) {
            AccountManager.get(this.mAppContext).invalidateAuthToken("com.xiaomi", miServiceTokenInfo.c + "," + miServiceTokenInfo.d);
        }
    }

    public synchronized void clearMiAccount() {
        LogType logType = LogType.LOGIN;
        MiJiaLog.writeLogOnGrey(logType, "AccountManager", "clearMiAccount");
        synchronized (this) {
            SharedPreferences sharedPreferences = this.mAccountPrefs;
            if (sharedPreferences == null) {
                MiJiaLog.writeLogOnGrey(logType, "AccountManager", "clearMiAccount:mAccountPrefs is null!!");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(KEY_MI_ACCOUNT);
            editorEdit.remove(KEY_MI_ACCOUNT_ENCRYPT);
            editorEdit.apply();
            this.mMiAccount = null;
            this.mUserDegree = 0L;
            UserDegreeManager.getInstance().setDirty();
            ArrayList arrayList = this.mUpdateListener != null ? new ArrayList(this.mUpdateListener) : null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Watcher) it.next()).accept(this);
                }
            }
        }
    }

    public synchronized void clearMiServiceTokenInSystem(String str) {
        if (this.mMiAccount != null && !TextUtils.isEmpty(str)) {
            MiServiceTokenInfo miServiceTokenInfoE = this.mMiAccount.e(str);
            if (miServiceTokenInfoE != null) {
                AccountManager.get(this.mAppContext).invalidateAuthToken("com.xiaomi", miServiceTokenInfoE.c + "," + miServiceTokenInfoE.d);
            }
        }
    }

    public synchronized void clearOAuthAccount() {
        try {
            SharedPreferences sharedPreferences = this.mAccountPrefs;
            if (sharedPreferences == null) {
                MiJiaLog.writeLogOnGrey(LogType.LOGIN, "AccountManager", "clearOAuthAccount:mAccountPrefs is null!!");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(KEY_OAUTH_ACCOUNT);
            editorEdit.remove(KEY_OAUTH_ACCOUNT_ENCRYPT);
            editorEdit.commit();
            this.mOAuthAccount = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized AccountType getAccountType() {
        return this.mAccountType;
    }

    public List<MiServiceTokenInfo> getAllServiceToken() {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return null;
        }
        return loginMiAccount.c();
    }

    public synchronized String getHomeId() {
        AccountType accountType = AccountType.MI;
        TextUtils.isEmpty("0");
        return "0";
    }

    public synchronized LoginMiAccount getMiAccount() {
        return this.mMiAccount;
    }

    public synchronized String getMiId() {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return "0";
        }
        if (TextUtils.isEmpty(loginMiAccount.getUserId())) {
            return "0";
        }
        return this.mMiAccount.getUserId();
    }

    public synchronized String getMiPassToken() {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return "";
        }
        return loginMiAccount.d();
    }

    public synchronized MiServiceTokenInfo getMiServiceToken(String str) {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return null;
        }
        return loginMiAccount.e(str);
    }

    public synchronized OAuthAccount getOAuthAccount() {
        return this.mOAuthAccount;
    }

    public synchronized long getTokenTime(String str) {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return 0L;
        }
        return loginMiAccount.f(str);
    }

    public long getUserDegree() {
        return this.mUserDegree;
    }

    public void init() {
        boolean z;
        MiJiaLog.onlyLogcat("AccountManager", "AccountManager init:mIsInitialized=" + this.mIsInitialized + ",CoreService.getAppContext=" + MiJiaEnvironment.getAppContext() + ",mAppContext=" + this.mAppContext);
        synchronized (sLock) {
            try {
                z = this.mIsInitialized;
                if (!z) {
                    this.mIsInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        if (this.mAppContext == null) {
            this.mAppContext = MiJiaEnvironment.getAppContext();
        }
        Context context = this.mAppContext;
        if (context == null) {
            return;
        }
        this.mAccountPrefs = context.getSharedPreferences(ACCOUNT_PREFS, 0);
        MiJiaLog.onlyLogcat("AccountManager", "mAccountPrefs1:" + this.mAccountPrefs);
        String strMigrateFromOldData = "";
        try {
            strMigrateFromOldData = migrateFromOldData(getDecryptedContent(this.mAppContext, this.mAccountPrefs.getString(KEY_MI_ACCOUNT_ENCRYPT, "")), KEY_MI_ACCOUNT, KEY_MI_ACCOUNT_ENCRYPT);
        } catch (Exception e) {
            MiJiaLog.writeLogOnGrey(LogType.LOGIN, "AccountManager", "read from mmkv exception1:" + e.getMessage());
            clearMiAccount();
        }
        this.mMiAccount = LoginMiAccount.a(strMigrateFromOldData);
        this.mUserDegree = 0L;
        String strMigrateFromOldData2 = "";
        try {
            strMigrateFromOldData2 = migrateFromOldData(getDecryptedContent(this.mAppContext, this.mAccountPrefs.getString(KEY_OAUTH_ACCOUNT_ENCRYPT, "")), KEY_OAUTH_ACCOUNT, KEY_OAUTH_ACCOUNT_ENCRYPT);
        } catch (Exception e2) {
            MiJiaLog.writeLogOnGrey(LogType.LOGIN, "AccountManager", "read from mmkv exception12" + e2.getMessage());
            clearOAuthAccount();
        }
        OAuthAccount oAuthAccountBuildFromPref = OAuthAccount.buildFromPref(strMigrateFromOldData2);
        this.mOAuthAccount = oAuthAccountBuildFromPref;
        if (this.mMiAccount != null) {
            this.mAccountType = AccountType.MI;
            this.mOAuthAccount = null;
        } else if (oAuthAccountBuildFromPref != null) {
            this.mAccountType = AccountType.OAUTH;
            this.mMiAccount = null;
        }
    }

    public boolean isDebugUser() {
        return (this.mMiAccount == null || (this.mUserDegree & 1) == 0) ? false : true;
    }

    public boolean isGreyUser() {
        return (this.mMiAccount == null || (this.mUserDegree & 2) == 0) ? false : true;
    }

    public synchronized boolean isLoggedIn() {
        return this.mAccountType != null;
    }

    public synchronized boolean isMiLoggedIn() {
        return this.mMiAccount != null;
    }

    public synchronized boolean isMiSystemAccount() {
        LoginMiAccount loginMiAccount = this.mMiAccount;
        if (loginMiAccount == null) {
            return false;
        }
        return loginMiAccount.g();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0012, B:12:0x0016, B:13:0x001a, B:17:0x0030, B:16:0x002d, B:18:0x0033, B:20:0x0037, B:21:0x003b, B:25:0x0051, B:24:0x004e), top: B:30:0x0001, inners: #1, #2 }] */
    public synchronized void saveAccount() {
        SharedPreferences sharedPreferences = this.mAccountPrefs;
        if (sharedPreferences == null) {
            MiJiaLog.writeLogOnGrey(LogType.LOGIN, "AccountManager", "saveAccount:mAccountPrefs is null!!");
            return;
        }
        if (this.mMiAccount == null) {
            if (this.mOAuthAccount != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(KEY_OAUTH_ACCOUNT_ENCRYPT, getEncryptedContent(this.mAppContext, this.mOAuthAccount.toPrefJsonStr()));
                editorEdit.commit();
            }
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        try {
            editorEdit2.putString(KEY_MI_ACCOUNT_ENCRYPT, getEncryptedContent(this.mAppContext, this.mMiAccount.j()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        editorEdit2.commit();
        if (this.mOAuthAccount != null) {
            SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
            try {
                editorEdit3.putString(KEY_OAUTH_ACCOUNT_ENCRYPT, getEncryptedContent(this.mAppContext, this.mOAuthAccount.toPrefJsonStr()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            editorEdit3.commit();
        }
        return;
        throw th;
    }

    public void setMiAccount(LoginMiAccount loginMiAccount) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                this.mAccountType = AccountType.MI;
                this.mMiAccount = loginMiAccount;
                this.mOAuthAccount = null;
                this.mUserDegree = 0L;
                UserDegreeManager.getInstance().setDirty();
                arrayList = this.mUpdateListener != null ? new ArrayList(this.mUpdateListener) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Watcher) it.next()).accept(this);
            }
        }
    }

    public synchronized void setMiServiceToken(String str, String str2, String str3, String str4, String str5, long j) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                MiServiceTokenInfo miServiceTokenInfo = new MiServiceTokenInfo();
                miServiceTokenInfo.f14487a = str;
                miServiceTokenInfo.f14488b = str3;
                miServiceTokenInfo.c = str2;
                miServiceTokenInfo.d = str4;
                miServiceTokenInfo.f = str5;
                miServiceTokenInfo.e = j;
                LoginMiAccount loginMiAccount = this.mMiAccount;
                if (loginMiAccount != null) {
                    loginMiAccount.i(miServiceTokenInfo);
                }
                arrayList = this.mUpdateListener != null ? new ArrayList(this.mUpdateListener) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Watcher) it.next()).accept(this);
            }
        }
    }

    public synchronized void setOAuthAccount(OAuthAccount oAuthAccount) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                this.mAccountType = AccountType.OAUTH;
                this.mMiAccount = null;
                this.mOAuthAccount = oAuthAccount;
                this.mUserDegree = 0L;
                UserDegreeManager.getInstance().setDirty();
                arrayList = this.mUpdateListener != null ? new ArrayList(this.mUpdateListener) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Watcher) it.next()).accept(this);
            }
        }
    }

    public void setUserDegree(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mUserDegree = ((jSONObject.optInt("gray_users", 0) << 1) & 2) | (jSONObject.optInt("debug_users", 0) & 1);
        MiJiaLog.onlyLogcat("UserDegree", "mUserDegree:" + this.mUserDegree);
    }
}
