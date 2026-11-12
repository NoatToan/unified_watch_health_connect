package com.xiaomi.ai.android.core;

import android.content.Context;
import android.os.Build;
import com.xiaomi.ai.android.capability.Capability;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.local.interfaces.LocalExecutor;
import defpackage.bf8;
import defpackage.bqe;
import defpackage.e01;
import defpackage.ues;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Engine {
    public static final int ENGINE_AUTH_ANONYMOUS = 5;
    public static final int ENGINE_AUTH_APP_ANONYMOUS = 5;
    public static final int ENGINE_AUTH_APP_OAUTH = 4;
    public static final int ENGINE_AUTH_DEVICE_ANONYMOUS = 6;
    public static final int ENGINE_AUTH_DEVICE_OAUTH = 1;
    public static final int ENGINE_AUTH_DEVICE_TOKEN = 3;
    public static final int ENGINE_AUTH_MIOT = 2;
    public static final int ENGINE_AUTH_SERVER = 7;

    static {
        System.loadLibrary("aivs_jni");
        ues.b(Build.VERSION.SDK_INT);
    }

    public static Engine create(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i) {
        return new e(context, e01Var, clientInfo, i);
    }

    public abstract void clearUserData();

    public abstract void finishTrace();

    public abstract String getAccessToken();

    public abstract String getAuthorization();

    public abstract long getExpireAt();

    public abstract int getSDKVersion();

    public abstract void interrupt();

    public abstract void interrupt(boolean z);

    public abstract boolean postData(byte[] bArr, int i, int i2, boolean z);

    public abstract boolean postData(byte[] bArr, boolean z);

    public abstract boolean postEvent(bf8 bf8Var);

    public abstract boolean postEvent(Event event);

    public abstract boolean postRawData(byte[] bArr, int i, int i2);

    public abstract boolean registerCapability(Capability capability);

    public abstract void release();

    public abstract String requestAuthorization();

    public abstract void reset();

    public abstract void restart();

    public abstract boolean setAuthorizationTokens(String str, String str2, long j);

    public abstract void setLocalExecutor(LocalExecutor localExecutor);

    public abstract void setLoggerHooker(bqe bqeVar);

    public abstract boolean start();

    public abstract void startTrace();

    public abstract void traceRequestId(String str);

    public abstract void traceResult(String str, int i);

    public abstract void traceResult(String str, String str2);

    public abstract void traceTimeStamps(String str);

    public abstract void traceTimeStamps(String str, long j);

    public abstract void updateAppData(JSONObject jSONObject);

    public abstract void updateContactData(JSONObject jSONObject);

    public abstract void updateIotData(JSONObject jSONObject);

    public abstract void updateSkillData(JSONObject jSONObject);

    public abstract void updateTopContactData(JSONObject jSONObject);

    public abstract void uploadLogError(String str, String str2);

    public abstract void uploadLogInfo(String str, String str2);

    public abstract void uploadLogWarn(String str, String str2);

    public static Engine create(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i, bqe bqeVar) {
        return new e(context, e01Var, clientInfo, i, bqeVar);
    }

    public static Engine create(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i, bqe bqeVar, Capability capability) {
        return new e(context, e01Var, clientInfo, i, bqeVar, capability);
    }
}
