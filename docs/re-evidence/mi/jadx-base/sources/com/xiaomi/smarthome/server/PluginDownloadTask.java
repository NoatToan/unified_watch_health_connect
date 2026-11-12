package com.xiaomi.smarthome.server;

import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.library.http.async.HttpAsyncHandle;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class PluginDownloadTask {
    private static Random random = new Random();
    private DownloadTaskCallbackInternal mCallback;
    private String mChangeLog;
    private int mDevMode;
    private long mDownloadStartTime;
    private HttpAsyncHandle mHandle;
    private boolean mIsForce;
    private final String mModel;
    private long mPackageId;
    private long mPackageLength;
    private String mPackageSafeUrl;
    private String mPackageType;
    private String mPackageUrl;
    private long mPluginId;
    private int mVersion;
    private Map<String, Object> relativeData = new HashMap();
    private int mTaskId = random.nextInt(Integer.MAX_VALUE);

    public static abstract class DownloadTaskCallbackInternal {
        public abstract void onCancel(PluginDownloadTask pluginDownloadTask);

        public abstract void onFailure(PluginDownloadTask pluginDownloadTask, int i);

        public abstract void onProgress(PluginDownloadTask pluginDownloadTask, float f);

        public abstract void onStart(PluginDownloadTask pluginDownloadTask);

        public abstract void onSuccess(PluginDownloadTask pluginDownloadTask, PluginPackageInfo pluginPackageInfo);
    }

    public PluginDownloadTask(String str) {
        this.mModel = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDownloadTask pluginDownloadTask = (PluginDownloadTask) obj;
        if (this.mPluginId != pluginDownloadTask.mPluginId || this.mPackageId != pluginDownloadTask.mPackageId) {
            return false;
        }
        String str = this.mPackageType;
        String str2 = pluginDownloadTask.mPackageType;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public synchronized DownloadTaskCallbackInternal getCallback() {
        return this.mCallback;
    }

    public String getChangeLog() {
        return this.mChangeLog;
    }

    public synchronized int getDevMode() {
        return this.mDevMode;
    }

    public long getDownloadStartTime() {
        return this.mDownloadStartTime;
    }

    public synchronized HttpAsyncHandle getHandle() {
        return this.mHandle;
    }

    public String getModel() {
        return this.mModel;
    }

    public synchronized long getPackageId() {
        return this.mPackageId;
    }

    public synchronized long getPackageLength() {
        return this.mPackageLength;
    }

    public synchronized String getPackageSafeUrl() {
        return this.mPackageSafeUrl;
    }

    public synchronized String getPackageType() {
        return this.mPackageType;
    }

    public synchronized String getPackageUrl() {
        return this.mPackageUrl;
    }

    public synchronized long getPluginId() {
        return this.mPluginId;
    }

    public synchronized <T> T getRelativeData(String str) {
        return (T) this.relativeData.get(str);
    }

    public synchronized int getTaskId() {
        return this.mTaskId;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        long j = this.mPluginId;
        long j2 = this.mPackageId;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.mPackageType;
        return i + (str != null ? str.hashCode() : 0);
    }

    public synchronized boolean isForce() {
        return this.mIsForce;
    }

    public synchronized void setCallback(DownloadTaskCallbackInternal downloadTaskCallbackInternal) {
        this.mCallback = downloadTaskCallbackInternal;
    }

    public void setChangeLog(String str) {
        this.mChangeLog = str;
    }

    public synchronized void setDevMode(int i) {
        this.mDevMode = i;
    }

    public void setDownloadStartTime(long j) {
        this.mDownloadStartTime = j;
    }

    public synchronized void setHandle(HttpAsyncHandle httpAsyncHandle) {
        this.mHandle = httpAsyncHandle;
    }

    public synchronized void setIsForce(boolean z) {
        this.mIsForce = z;
    }

    public synchronized void setPackageId(long j) {
        this.mPackageId = j;
    }

    public synchronized void setPackageLength(long j) {
        this.mPackageLength = j;
    }

    public synchronized void setPackageSafeUrl(String str) {
        this.mPackageSafeUrl = str;
    }

    public synchronized void setPackageType(String str) {
        this.mPackageType = str;
    }

    public synchronized void setPackageUrl(String str) {
        this.mPackageUrl = str;
    }

    public synchronized void setPluginId(long j) {
        this.mPluginId = j;
    }

    public synchronized void setRelativeData(String str, Object obj) {
        this.relativeData.put(str, obj);
    }

    public void setRnSdkLevel(long j) {
        setRelativeData("rnSdkApiLevel", Long.valueOf(j));
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public synchronized com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask toOutTask() {
        com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask pluginDownloadTask;
        pluginDownloadTask = new com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask();
        pluginDownloadTask.mPackageId = this.mPackageId;
        pluginDownloadTask.mTaskId = this.mTaskId;
        pluginDownloadTask.mPackageType = this.mPackageType;
        pluginDownloadTask.mModel = this.mModel;
        pluginDownloadTask.mVersion = this.mVersion;
        pluginDownloadTask.mChangeLog = this.mChangeLog;
        pluginDownloadTask.mPluginId = this.mPluginId;
        pluginDownloadTask.mDevMode = this.mDevMode;
        return pluginDownloadTask;
    }

    public String toString() {
        return "PluginDownloadTask{mTaskId=" + this.mTaskId + ", mPluginId=" + this.mPluginId + ", mPackageId=" + this.mPackageId + ", mPackageUrl='" + this.mPackageUrl + "', mPackageSafeUrl='" + this.mPackageSafeUrl + "', mModel='" + this.mModel + "', mModel='" + this.mDevMode + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public synchronized <T> T getRelativeData(String str, T t) {
        T t2 = (T) this.relativeData.get(str);
        return t2 == null ? t : t2;
    }
}
