package ohos.ace.plugin.taskmanagerplugin;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class JavaTaskImpl {
    public static Context mContext;
    private DownloadImpl mDownloadImpl;

    private native void nativeInit();

    private native void onRequestCallback(long j, String str, String str2);

    public JavaTaskImpl(Context context) {
        mContext = context;
        this.mDownloadImpl = new DownloadImpl(context, this);
        reset();
    }

    public long create(String str) {
        ALog.i(IConstant.TAG, "create: configJson:" + str);
        final Config configJsonToConfig = JsonUtil.jsonToConfig(str);
        if (configJsonToConfig == null) {
            ALog.e(IConstant.TAG, "create: config is null");
            return -1L;
        }
        ALog.i(IConstant.TAG, "create: save taskInfo to database");
        try {
            long jLongValue = ((Long) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Long.valueOf(TaskDao.insert(JavaTaskImpl.mContext, configJsonToConfig));
                }
            }).get()).longValue();
            ALog.i(IConstant.TAG, "create success:" + jLongValue);
            return jLongValue;
        } catch (Exception e) {
            ALog.e(IConstant.TAG, "create: error:" + e);
            return -1L;
        }
    }

    public void start(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "start: taskId:" + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda9
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "start query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "start: task info is null");
        } else {
            if (taskInfo.getAction() == 0) {
                this.mDownloadImpl.startDownload(taskInfo);
                return;
            }
            ALog.e(IConstant.TAG, "start: action is not download:" + taskInfo.getAction());
        }
    }

    public void resume(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "resume: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda6
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "resume query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "resume: task info is null");
        } else {
            if (taskInfo.getAction() == 0) {
                this.mDownloadImpl.resumeDownload(taskInfo);
                return;
            }
            ALog.e(IConstant.TAG, "resume: action is not download:" + taskInfo.getAction());
        }
    }

    public void pause(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "pause: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda10
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "pause query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "pause: task info is null");
        } else {
            if (taskInfo.getAction() == 0) {
                this.mDownloadImpl.pauseDownload(taskInfo);
                return;
            }
            ALog.e(IConstant.TAG, "pause: action is not download:" + taskInfo.getAction());
        }
    }

    public void stop(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "stop: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda8
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "stop query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "stop: task info is null");
            return;
        }
        if (taskInfo.getAction() == 0) {
            this.mDownloadImpl.removeDownload(taskInfo);
            this.mDownloadImpl.sendStopCallback(taskInfo);
        } else {
            ALog.e(IConstant.TAG, "stop: action is not download:" + taskInfo.getAction());
        }
    }

    public long remove(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "remove: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "remove query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "remove: task info is null");
            return -1L;
        }
        if (taskInfo.getAction() == 0) {
            this.mDownloadImpl.removeDownload(taskInfo);
        } else {
            ALog.e(IConstant.TAG, "remove: action is not download:" + taskInfo.getAction());
        }
        this.mDownloadImpl.sendRemoveCallback(taskInfo);
        return 0L;
    }

    public String getMimeType(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "getMimeType: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda7
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (Exception e) {
            ALog.d(IConstant.TAG, "getMimeType query error: " + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "getMimeType: task info is null");
            return "";
        }
        return this.mDownloadImpl.getMimeType(taskInfo.getDownloadId());
    }

    public void reset() {
        Executors.newCachedThreadPool().submit(new Runnable() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2059lambda$reset$7$ohosaceplugintaskmanagerpluginJavaTaskImpl();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$reset$7$ohos-ace-plugin-taskmanagerplugin-JavaTaskImpl, reason: not valid java name */
    /* synthetic */ void m2059lambda$reset$7$ohosaceplugintaskmanagerpluginJavaTaskImpl() {
        for (TaskInfo taskInfo : TaskDao.queryAll(mContext)) {
            if (taskInfo.getProgress().getState() != 49 && taskInfo.getProgress().getState() != 64 && taskInfo.getProgress().getState() != 65 && taskInfo.getProgress().getState() != 80) {
                taskInfo.getProgress().setState(49);
                this.mDownloadImpl.sendStopCallback(taskInfo);
            }
        }
    }

    public void reportTaskInfo(String str) {
        ALog.i(IConstant.TAG, "reportTaskInfo start");
        TaskInfo taskInfoJsonToTaskInfo = JsonUtil.jsonToTaskInfo(str);
        if (taskInfoJsonToTaskInfo == null) {
            ALog.i(IConstant.TAG, "reportTaskInfo: task info is null");
        } else {
            TaskDao.update(mContext, taskInfoJsonToTaskInfo, false);
        }
    }

    public String show(final long j) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "show: " + j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.query(JavaTaskImpl.mContext, j);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "show: query error" + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "show: task is null");
            return "";
        }
        if (taskInfo.getAction() == 0) {
            this.mDownloadImpl.postQueryProgressByTid(j);
            if (!TextUtils.isEmpty(taskInfo.getToken()) && !Constants.NULL.equals(taskInfo.getToken())) {
                ALog.e(IConstant.TAG, "show: token is not null");
                return "";
            }
        } else {
            ALog.i(IConstant.TAG, "Action.UPLOAD taskId: " + j);
        }
        String strConvertTaskInfoToJson = JsonUtil.convertTaskInfoToJson(taskInfo);
        ALog.d(IConstant.TAG, "show: result:" + strConvertTaskInfoToJson);
        return strConvertTaskInfoToJson;
    }

    public String touch(final long j, final String str) {
        TaskInfo taskInfo;
        ALog.i(IConstant.TAG, "touch: " + j);
        this.mDownloadImpl.postQueryProgressByTid(j);
        try {
            taskInfo = (TaskInfo) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda2
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.queryByToken(JavaTaskImpl.mContext, j, str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "touch: query error" + e);
            taskInfo = null;
        }
        if (taskInfo == null) {
            ALog.e(IConstant.TAG, "touch: task is null");
            return "";
        }
        String strConvertTaskInfoToJson = JsonUtil.convertTaskInfoToJson(taskInfo);
        ALog.d(IConstant.TAG, "touch: result:" + strConvertTaskInfoToJson);
        return strConvertTaskInfoToJson;
    }

    public long[] search(String str) {
        ALog.i(IConstant.TAG, "search: " + str);
        this.mDownloadImpl.postQueryProgress();
        List arrayList = new ArrayList();
        final Filter filterJsonToFilter = JsonUtil.jsonToFilter(str);
        try {
            arrayList = (List) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.JavaTaskImpl$$ExternalSyntheticLambda5
                @Override // java.util.function.Supplier
                public final Object get() {
                    return TaskDao.queryByFilter(JavaTaskImpl.mContext, filterJsonToFilter);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            ALog.e(IConstant.TAG, "search: error" + e);
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        ALog.i(IConstant.TAG, "search result: " + Arrays.toString(jArr));
        return jArr;
    }

    public String getDefaultStoragePath() {
        File cacheDir = mContext.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getAbsolutePath();
        }
        return "";
    }

    public void jniInit() {
        ALog.i(IConstant.TAG, "jniInit: ");
        nativeInit();
    }

    public void jniOnRequestCallback(long j, String str, String str2) {
        ALog.i(IConstant.TAG, "jniOnRequestCallback: taskId:" + j + ",eventType:" + str + ",taskInfoJson:" + str2);
        onRequestCallback(j, str, str2);
    }
}
