package com.xiaomi.smarthome.framework.redpoint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.sync.SyncHandler;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ServerTimerManager {
    private static final long MAX_VALID_CACHE_INTERVAL = 60000;
    private static final String TAG = "ServerTimerManager";
    private static Pair<Long, Boolean> sCachedPair;
    private static long sCachedTime;
    private static volatile ServerTimerManager sInstance;
    private WeakReference<Context> mContextRef;
    private long mServerTime = -1;
    private long mLocalTime = -1;
    private ServerTimerManagerInternal mImpl = new ServerTimerManagerInternal();

    public static class InternationalServerTimerException extends Exception {
        public InternationalServerTimerException(String str) {
            super(str);
        }
    }

    public static class ServerTimerException extends Exception {
        public ServerTimerException(String str) {
            super(str);
        }
    }

    public class ServerTimerManagerInternal {
        private Future<?> mCurrent;
        private IntentFilter mIntentFileter;
        private BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.framework.redpoint.ServerTimerManager.ServerTimerManagerInternal.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ServerTimerManager.this.mServerTime = -1L;
                ServerTimerManager.this.mLocalTime = -1L;
                ServerTimerManagerInternal.this.getServerTime();
            }
        };

        public ServerTimerManagerInternal() {
            Context context = (Context) ServerTimerManager.this.mContextRef.get();
            IntentFilter intentFilter = new IntentFilter();
            this.mIntentFileter = intentFilter;
            intentFilter.addAction("android.intent.action.TIME_SET");
            this.mIntentFileter.addAction("android.intent.action.DATE_CHANGED");
            context.registerReceiver(this.mReceiver, this.mIntentFileter);
        }

        public void destroy() {
            Context context = (Context) ServerTimerManager.this.mContextRef.get();
            if (context != null) {
                try {
                    context.unregisterReceiver(this.mReceiver);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void getServerTime() {
            Future<?> future = this.mCurrent;
            if (future != null) {
                future.cancel(true);
            }
            this.mCurrent = ThreadPoolManager.submitTask(new Runnable() { // from class: com.xiaomi.smarthome.framework.redpoint.ServerTimerManager.ServerTimerManagerInternal.2
                @Override // java.lang.Runnable
                public void run() {
                    ServerTimerManager.this.mServerTime = ((Long) ServerTimerManager.getServerTimeSync().first).longValue();
                    if (ServerTimerManager.this.mServerTime == 0) {
                        ServerTimerManager.this.mServerTime = -1L;
                        ServerTimerManager.this.mLocalTime = System.currentTimeMillis();
                    } else {
                        ServerTimerManager.this.mLocalTime = System.currentTimeMillis();
                        ServerTimerManager serverTimerManager = ServerTimerManager.this;
                        ServerTimerManager.access$114(serverTimerManager, serverTimerManager.mLocalTime);
                    }
                }
            });
        }
    }

    private ServerTimerManager(Context context) {
        this.mContextRef = new WeakReference<>(context.getApplicationContext());
    }

    public static /* synthetic */ long access$114(ServerTimerManager serverTimerManager, long j) {
        long j2 = serverTimerManager.mServerTime + j;
        serverTimerManager.mServerTime = j2;
        return j2;
    }

    public static long getCachedTimeDiff() {
        ServerBean currentServer = ServerCompact.getCurrentServer(MiJiaEnvironment.getAppContext());
        String str = currentServer == null ? "cn" : currentServer.machineCode;
        long j = MiJiaEnvironment.getAppContext().getSharedPreferences("sh_timediff_sp", 0).getLong(str + "_timediff", 0L);
        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "get timeDiff from SP:" + j);
        return j;
    }

    public static ServerTimerManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (ServerTimerManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ServerTimerManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static Pair<Long, Boolean> getServerTimeSync() {
        String str;
        ServerBean currentServer = ServerCompact.getCurrentServer(MiJiaEnvironment.getAppContext());
        if (currentServer == null || ServerCompact.isChinaMainLand(currentServer)) {
            str = "https://api.io.mi.com/app/v2/public/get_timestamp";
        } else {
            str = "https://" + currentServer.machineCode + ".api.io.mi.com/app/v2/public/get_timestamp";
        }
        try {
            if (MiJiaEnvironment.isInGreyPublish()) {
                MiJiaLog.writeLogOnGrey(LogType.NETWORK, "ServerTimerManager", "getServerTimeSync start");
            }
            try {
                sCachedPair = (Pair) HttpApi.sendRequest(new Request.Builder().url(str).method("GET").build(), new SyncHandler<Pair<Long, Boolean>>() { // from class: com.xiaomi.smarthome.framework.redpoint.ServerTimerManager.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.xiaomi.smarthome.library.http.sync.SyncHandler
                    public Pair<Long, Boolean> processResponse(Response response) throws Exception {
                        long jOptLong = new JSONObject(response.body().string()).optJSONObject("result").optLong("timestamp");
                        MiJiaLog.writeLogOnAll(LogType.NETWORK, ServerTimerManager.TAG, "public/get_timestamp ts=" + jOptLong);
                        return new Pair<>(Long.valueOf((jOptLong * 1000) - System.currentTimeMillis()), Boolean.TRUE);
                    }
                });
                sCachedTime = System.currentTimeMillis();
                saveToSP(((Long) sCachedPair.first).longValue());
                return sCachedPair;
            } catch (Exception e) {
                LogType logType = LogType.NETWORK;
                MiJiaLog.writeLogOnAll(logType, TAG, "public/get_timestamp exception " + e.getMessage());
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                try {
                    uRLConnectionOpenConnection.connect();
                    long date = uRLConnectionOpenConnection.getDate();
                    if (Math.abs(date) < 10) {
                        return new Pair<>(Long.valueOf(getCachedTimeDiff()), Boolean.TRUE);
                    }
                    if (MiJiaEnvironment.isInGreyPublish()) {
                        MiJiaLog.writeLogOnGrey(logType, "ServerTimerManager", "getServerTimeSync success");
                    }
                    sCachedPair = new Pair<>(Long.valueOf(date - System.currentTimeMillis()), Boolean.TRUE);
                    sCachedTime = System.currentTimeMillis();
                    saveToSP(((Long) sCachedPair.first).longValue());
                    return sCachedPair;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return getServerTimeSyncViaXiaoMi();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return getServerTimeSyncViaXiaoMi();
        }
    }

    private static Pair<Long, Boolean> getServerTimeSyncViaXiaoMi() {
        try {
            if (MiJiaEnvironment.isInGreyPublish()) {
                MiJiaLog.writeLogOnGrey(LogType.NETWORK, "ServerTimerManager", "getServerTimeSync start");
            }
            URLConnection uRLConnectionOpenConnection = new URL("https://account.xiaomi.com/pass/serviceLogin").openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            try {
                uRLConnectionOpenConnection.connect();
                long date = uRLConnectionOpenConnection.getDate();
                if (MiJiaEnvironment.isInGreyPublish()) {
                    MiJiaLog.writeLogOnGrey(LogType.NETWORK, "ServerTimerManager", "getServerTimeSync success");
                }
                sCachedPair = new Pair<>(Long.valueOf(date - System.currentTimeMillis()), Boolean.TRUE);
                sCachedTime = System.currentTimeMillis();
                saveToSP(((Long) sCachedPair.first).longValue());
                return sCachedPair;
            } catch (Exception e) {
                e.printStackTrace();
                MiJiaLog.writeLogOnGrey(LogType.NETWORK, "ServerTimerManager", "getServerTimeSync fail1:" + e.getMessage() + ":https://account.xiaomi.com/pass/serviceLogin");
                return new Pair<>(Long.valueOf(getCachedTimeDiff()), Boolean.TRUE);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            MiJiaLog.writeLogOnGrey(LogType.NETWORK, "ServerTimerManager", "getServerTimeSync fail2:" + e2.getMessage() + ":https://account.xiaomi.com/pass/serviceLogin");
            return new Pair<>(Long.valueOf(getCachedTimeDiff()), Boolean.TRUE);
        }
    }

    private static void saveToSP(long j) {
        ServerBean currentServer = ServerCompact.getCurrentServer(MiJiaEnvironment.getAppContext());
        String str = currentServer == null ? "cn" : currentServer.machineCode;
        MiJiaEnvironment.getAppContext().getSharedPreferences("sh_timediff_sp", 0).edit().putLong(str + "_timediff", j).apply();
    }

    public void destroy() {
        this.mImpl.destroy();
        this.mServerTime = -1L;
        this.mLocalTime = -1L;
        this.mContextRef.clear();
        sInstance = null;
    }

    public long getServerTimeDiff() {
        MiJiaLog.writeLogOnDebug(LogType.GENERAL, "ProfileRedPointManager", "isServerTimeValid" + isServerTimeValid());
        if (isServerTimeValid()) {
            return this.mServerTime - this.mLocalTime;
        }
        return 0L;
    }

    public boolean isServerTimeValid() {
        long j = this.mServerTime;
        if (j != -1) {
            long j2 = this.mLocalTime;
            if (j2 != -1 && j != 0 && j2 != 0) {
                return true;
            }
        }
        return false;
    }

    public void postGetServerTime() {
        this.mImpl.getServerTime();
    }
}
