package ohos.ace.plugin.taskmanagerplugin;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class DownloadImpl {
    private static final int ARRAY_INIT_VAL = -1;
    private static final int DOWNLOAD_COLUMN_REASON = 3;
    private static final int DOWNLOAD_RECEIVED_SIZE_ARGC = 0;
    private static final int DOWNLOAD_STATUS = 2;
    private static final int DOWNLOAD_TOTAL_SIZE_ARGC = 1;
    private static final int MAX_RETRY_TIMES = 3;
    private static final int NETWORK_INVALID = 0;
    private static final int NETWORK_MOBILE = 2;
    private static final int NETWORK_WIFI = 1;
    private static final int PAUSE_BY_USER_STATUS = 193;
    private static final int PAUSE_CONTROL_VALUE = 1;
    private static final int QUERY_PROGRESS_TIME = 1000;
    private static final int RESUME_BY_USER_STATUS = 192;
    private static final int RESUME_CONTROL_VALUE = 0;
    private final Context context;
    private DownloadManager downloadManager;
    private JavaTaskImpl mJavaTaskImpl;
    private boolean supportsBreakpoint = false;
    private boolean isIgnoreStatus = false;
    private final List<QueryRunnable> queryRunnables = new ArrayList();
    private final Handler handle = new Handler(Looper.getMainLooper());

    private boolean statusIsFinish(int i) {
        return i == 64 || i == 65 || i == 49 || i == 80;
    }

    public DownloadImpl(Context context, JavaTaskImpl javaTaskImpl) {
        this.context = context;
        this.mJavaTaskImpl = javaTaskImpl;
        javaTaskImpl.jniInit();
    }

    class QueryRunnable implements Runnable {
        private boolean isDownloading = false;
        private int retryNum = 0;
        private final TaskInfo taskInfo;

        static /* synthetic */ int access$208(QueryRunnable queryRunnable) {
            int i = queryRunnable.retryNum;
            queryRunnable.retryNum = i + 1;
            return i;
        }

        public QueryRunnable(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
        }

        public void setDownloading(boolean z) {
            this.isDownloading = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadImpl.this.queryProgress(this);
            if (this.isDownloading) {
                DownloadImpl.this.handle.postDelayed(this, 1000L);
            }
        }
    }

    public int getNetworkState() {
        NetworkInfo.State state;
        NetworkInfo.State state2;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            ALog.i(IConstant.TAG, "current network is invalid");
            return 0;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state2 = networkInfo.getState()) != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
            ALog.i(IConstant.TAG, "current network is wifi!");
            return 1;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 == null || (state = networkInfo2.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return 0;
        }
        ALog.i(IConstant.TAG, "current network is mobile net!");
        return 2;
    }

    public Response parseHttpResponse(HttpURLConnection httpURLConnection) throws IOException {
        Response response = new Response();
        response.setStatusCode(httpURLConnection.getResponseCode());
        response.setReason(httpURLConnection.getResponseMessage());
        response.setVersion(httpURLConnection.getHeaderField((String) null).split(" ")[0]);
        HashMap map = new HashMap();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        response.setHeaders(map);
        ALog.i(IConstant.TAG, "HTTP Response: Version=" + response.getVersion() + ", Status=" + response.getStatusCode() + ", Reason=" + response.getReason());
        ALog.i(IConstant.TAG, "  Headers:");
        if (map.isEmpty()) {
            ALog.i(IConstant.TAG, "    (empty)");
            return response;
        }
        for (Map.Entry<String, List<String>> entry2 : map.entrySet()) {
            String key = entry2.getKey();
            Iterator<String> it = entry2.getValue().iterator();
            while (it.hasNext()) {
                ALog.i(IConstant.TAG, " " + key + ":" + it.next());
            }
        }
        return response;
    }

    public void startDownload(final TaskInfo taskInfo) {
        Config config;
        long jEnqueue;
        try {
            config = (Config) CompletableFuture.supplyAsync(new Supplier() { // from class: ohos.ace.plugin.taskmanagerplugin.DownloadImpl$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f$0.m2058xe1265945(taskInfo);
                }
            }).get();
        } catch (Exception e) {
            ALog.e(IConstant.TAG, "startDownload: error" + e);
            config = null;
        }
        if (config == null) {
            ALog.e(IConstant.TAG, "startDownload: config is null");
            sendFailCallback(taskInfo, Reason.CONNECT_ERROR);
            return;
        }
        int networkState = getNetworkState();
        ALog.i(IConstant.TAG, "networkState :" + networkState);
        if (networkState == 0) {
            ALog.e(IConstant.TAG, "no network");
            sendFailCallback(taskInfo, Reason.NETWORK_OFFLINE);
            return;
        }
        Response responseCanMakeRequest = canMakeRequest(config.getUrl());
        if (responseCanMakeRequest == null) {
            ALog.d(IConstant.TAG, "can not make request, no response");
            sendFailCallback(taskInfo, Reason.CONNECT_ERROR);
            return;
        }
        taskInfo.setResponse(responseCanMakeRequest);
        this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), "response", JsonUtil.convertTaskInfoToJson(taskInfo));
        if (responseCanMakeRequest.getStatusCode() != 200) {
            ALog.d(IConstant.TAG, "can not make request, status code: " + responseCanMakeRequest.getStatusCode());
            sendFailCallback(taskInfo, Reason.CONNECT_ERROR);
            return;
        }
        if (this.downloadManager == null) {
            this.downloadManager = (DownloadManager) this.context.getSystemService("download");
        }
        if (this.downloadManager == null) {
            ALog.e(IConstant.TAG, "no http or https url");
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(config.getUrl()));
        request.setDescription(config.getDescription());
        request.setAllowedOverRoaming(config.isRoaming());
        if (networkState == 1) {
            if (config.getNetwork() != 1 && config.getNetwork() != 0) {
                sendFailCallback(taskInfo, Reason.UNSUPPORTED_NETWORK_TYPE);
                return;
            }
            request.setAllowedOverMetered(true);
        } else if (networkState == 2) {
            if (config.getNetwork() != 2 && config.getNetwork() != 0) {
                sendFailCallback(taskInfo, Reason.UNSUPPORTED_NETWORK_TYPE);
                return;
            }
            request.setAllowedOverMetered(config.isMetered());
        }
        request.setAllowedNetworkTypes(3);
        request.setTitle(config.getTitle());
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(config.getUrl()));
        request.setMimeType(mimeTypeFromExtension);
        if (!config.isBackground()) {
            request.setNotificationVisibility(2);
        } else {
            request.setNotificationVisibility(1);
        }
        if (config.getHeaders() != null) {
            for (String str : config.getHeaders().keySet()) {
                request.addRequestHeader(str, config.getHeaders().get(str));
            }
        }
        String saveas = config.getSaveas();
        if (saveas == null) {
            ALog.e(IConstant.TAG, "startDownload: saveas is null");
            sendFailCallback(taskInfo, Reason.USER_OPERATION);
            return;
        }
        File parentFile = new File(saveas, saveas.substring(saveas.lastIndexOf("/") + 1)).getParentFile();
        if (parentFile == null) {
            ALog.e(IConstant.TAG, "createDownload: file is null");
            sendFailCallback(taskInfo, Reason.IO_ERROR);
            return;
        }
        request.setDestinationUri(Uri.fromFile(parentFile));
        taskInfo.setMimeType(mimeTypeFromExtension);
        try {
            jEnqueue = this.downloadManager.enqueue(request);
        } catch (SecurityException unused) {
            ALog.e(IConstant.TAG, "SecurityException error");
            jEnqueue = 0;
        }
        ALog.i(IConstant.TAG, "Start to download task: " + jEnqueue);
        Progress progress = taskInfo.getProgress();
        if (progress == null) {
            progress = new Progress();
        }
        progress.setState(32);
        taskInfo.setProgress(progress);
        if (jEnqueue != 0) {
            taskInfo.setDownloadId(jEnqueue);
            startQueryProgress(taskInfo);
        }
        TaskDao.update(this.context, taskInfo, true);
    }

    /* JADX INFO: renamed from: lambda$startDownload$0$ohos-ace-plugin-taskmanagerplugin-DownloadImpl, reason: not valid java name */
    /* synthetic */ Config m2058xe1265945(TaskInfo taskInfo) {
        return TaskDao.queryConfig(this.context, taskInfo.getTid());
    }

    private String getPausedReason(int i) {
        ALog.i(IConstant.TAG, "get download paused reason");
        if (i == 1) {
            ALog.i(IConstant.TAG, "the download is Waiting to retry");
            return Reason.REQUEST_ERROR;
        }
        if (i == 2) {
            ALog.i(IConstant.TAG, "the download is Waiting for Network");
            return Reason.WAITTING_NETWORK_ONE_DAY;
        }
        if (i == 3) {
            ALog.i(IConstant.TAG, "the download is Waiting for WiFi");
            return Reason.UNSUPPORTED_NETWORK_TYPE;
        }
        if (i != 4) {
            return Reason.OTHERS_ERROR;
        }
        ALog.i(IConstant.TAG, "the download is paused for some other reason");
        return Reason.OTHERS_ERROR;
    }

    private String getFailedReason(int i) {
        ALog.i(IConstant.TAG, "get download failed reason");
        switch (i) {
            case 1000:
                ALog.e(IConstant.TAG, "the download has an error that doesn't fit under any other error code");
                return Reason.OTHERS_ERROR;
            case 1001:
                ALog.e(IConstant.TAG, "it doesn't fit under any other error code");
                return Reason.IO_ERROR;
            case 1002:
                ALog.e(IConstant.TAG, "the HTTP was received that download manager can't handle");
                return Reason.CONNECT_ERROR;
            case 1003:
            default:
                ALog.e(IConstant.TAG, "error code: SESSION_UNKNOWN");
                return Reason.OTHERS_ERROR;
            case 1004:
                ALog.e(IConstant.TAG, "the error receiving or processing data occurred at the HTTP level");
                return Reason.PROTOCOL_ERROR;
            case 1005:
                ALog.e(IConstant.TAG, "there were too many redirects");
                return Reason.REDIRECT_ERROR;
            case 1006:
                ALog.e(IConstant.TAG, "there was insufficient storage space.");
                return Reason.UNSUPPORT_RANGE_REQUEST;
            case 1007:
                ALog.e(IConstant.TAG, "no external storage device was found");
                return Reason.BUILD_CLIENT_FAILED;
            case 1008:
                ALog.e(IConstant.TAG, "can't resume the download");
                return Reason.REQUEST_ERROR;
            case 1009:
                ALog.e(IConstant.TAG, "the requested destination file already exists");
                return Reason.IO_ERROR;
        }
    }

    private int[] getDownloadBytes(long j) {
        int[] iArr = {-1, -1, 0, 0};
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.downloadManager.query(new DownloadManager.Query().setFilterById(j));
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                iArr[0] = cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far"));
                iArr[1] = cursorQuery.getInt(cursorQuery.getColumnIndex("total_size"));
            }
            return iArr;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private void queryDownloadStatus(QueryRunnable queryRunnable, int i, int[] iArr) {
        ALog.i(IConstant.TAG, "query download status, download status: " + i);
        Progress progress = queryRunnable.taskInfo.getProgress();
        if (i == 1) {
            ALog.i(IConstant.TAG, "queryDownloadStatus: STATUS_PENDING,retryNum:" + queryRunnable.retryNum);
            if (queryRunnable.retryNum < 3) {
                QueryRunnable.access$208(queryRunnable);
            } else {
                stopQueryProgress(queryRunnable);
                removeDownload(queryRunnable.taskInfo);
                sendFailCallback(queryRunnable.taskInfo, Reason.OTHERS_ERROR);
            }
        } else if (i != 2) {
            String str = EventType.FAILED;
            if (i == 4) {
                ALog.i(IConstant.TAG, "query download status, download STATUS_PAUSED: 4");
                if (progress.getState() != 48 && !statusIsFinish(progress.getState())) {
                    queryRunnable.taskInfo.setReason(getPausedReason(iArr[3]));
                    queryRunnable.taskInfo.setCode(getReasonCodeByReason(queryRunnable.taskInfo.getReason()));
                    if (queryRunnable.taskInfo.getVersion() == 1) {
                        progress.setState(65);
                    } else {
                        progress.setState(48);
                        str = "pause";
                    }
                    int[] downloadBytes = getDownloadBytes(queryRunnable.taskInfo.getDownloadId());
                    progress.setProcessed(downloadBytes[0]);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(downloadBytes[1]));
                    progress.setSizes(arrayList);
                    this.mJavaTaskImpl.jniOnRequestCallback(queryRunnable.taskInfo.getTid(), str, JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
                    TaskDao.update(this.context, queryRunnable.taskInfo, true);
                    if (progress.getState() == 65) {
                        removeDownload(queryRunnable.taskInfo);
                        stopQueryProgress(queryRunnable);
                    }
                }
            } else if (i == 8) {
                if (!statusIsFinish(progress.getState())) {
                    progress.setState(64);
                    int[] downloadBytes2 = getDownloadBytes(queryRunnable.taskInfo.getDownloadId());
                    progress.setProcessed(downloadBytes2[0]);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Long.valueOf(downloadBytes2[1]));
                    progress.setSizes(arrayList2);
                    ALog.i(IConstant.TAG, "queryDownloadStatus: success:size: " + downloadBytes2[0]);
                    this.mJavaTaskImpl.jniOnRequestCallback(queryRunnable.taskInfo.getTid(), "progress", JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
                    this.mJavaTaskImpl.jniOnRequestCallback(queryRunnable.taskInfo.getTid(), EventType.COMPLETED, JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
                    TaskDao.update(this.context, queryRunnable.taskInfo, true);
                }
                stopQueryProgress(queryRunnable);
            } else if (i == 16) {
                if (!statusIsFinish(progress.getState()) && progress.getState() != 65) {
                    progress.setState(65);
                    queryRunnable.taskInfo.setReason(getFailedReason(iArr[3]));
                    queryRunnable.taskInfo.setCode(getReasonCodeByReason(queryRunnable.taskInfo.getReason()));
                    int[] downloadBytes3 = getDownloadBytes(queryRunnable.taskInfo.getDownloadId());
                    progress.setProcessed(downloadBytes3[0]);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Long.valueOf(downloadBytes3[1]));
                    progress.setSizes(arrayList3);
                    this.mJavaTaskImpl.jniOnRequestCallback(queryRunnable.taskInfo.getTid(), EventType.FAILED, JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
                    TaskDao.update(this.context, queryRunnable.taskInfo, true);
                }
                stopQueryProgress(queryRunnable);
            }
        } else {
            if (!statusIsFinish(progress.getState()) && !this.isIgnoreStatus) {
                progress.setState(32);
                int[] downloadBytes4 = getDownloadBytes(queryRunnable.taskInfo.getDownloadId());
                progress.setProcessed(downloadBytes4[0]);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(Long.valueOf(downloadBytes4[1]));
                progress.setSizes(arrayList4);
                ALog.i(IConstant.TAG, "queryDownloadStatus: running:size: " + downloadBytes4[0]);
                this.mJavaTaskImpl.jniOnRequestCallback(queryRunnable.taskInfo.getTid(), "progress", JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
                TaskDao.update(this.context, queryRunnable.taskInfo, true);
            }
            ALog.i(IConstant.TAG, "isIgnoreStatus:" + this.isIgnoreStatus);
            this.isIgnoreStatus = false;
        }
        ALog.i(IConstant.TAG, "queryDownloadStatus taskInfo:" + JsonUtil.convertTaskInfoToJson(queryRunnable.taskInfo));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x009b A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:4:0x004f, B:6:0x0055, B:7:0x009b), top: B:20:0x004f }] */
    public void queryProgress(QueryRunnable queryRunnable) {
        ALog.i(IConstant.TAG, "queryProgress: tid:" + queryRunnable.taskInfo.getTid() + ",downloadId:" + queryRunnable.taskInfo.getDownloadId());
        int[] iArr = {-1, -1, 0, 0};
        Cursor cursorQuery = this.downloadManager.query(new DownloadManager.Query().setFilterById(queryRunnable.taskInfo.getDownloadId()));
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    iArr[2] = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    iArr[3] = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                    ALog.i(IConstant.TAG, "queryProgress status: " + iArr[2]);
                    ALog.i(IConstant.TAG, "queryProgress reason: " + iArr[3]);
                    queryDownloadStatus(queryRunnable, iArr[2], iArr);
                } else {
                    stopQueryProgress(queryRunnable);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } else {
            stopQueryProgress(queryRunnable);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    private void startQueryProgress(TaskInfo taskInfo) {
        QueryRunnable queryRunnable = new QueryRunnable(taskInfo);
        queryRunnable.setDownloading(true);
        this.queryRunnables.add(queryRunnable);
        this.handle.post(queryRunnable);
    }

    public void stopQueryProgress(QueryRunnable queryRunnable) {
        queryRunnable.setDownloading(false);
        this.handle.removeCallbacks(queryRunnable);
        this.queryRunnables.remove(queryRunnable);
    }

    public void stopQueryProgress(TaskInfo taskInfo) {
        for (QueryRunnable queryRunnable : this.queryRunnables) {
            if (queryRunnable.taskInfo.getTid() == taskInfo.getTid()) {
                stopQueryProgress(queryRunnable);
            }
        }
    }

    public void postQueryProgressByTid(long j) {
        ALog.i(IConstant.TAG, "postQueryProgressByTid: tid:" + j);
        for (QueryRunnable queryRunnable : this.queryRunnables) {
            if (queryRunnable.taskInfo.getTid() == j) {
                this.handle.removeCallbacks(queryRunnable);
                this.isIgnoreStatus = true;
                this.handle.post(queryRunnable);
                return;
            }
        }
    }

    public void postQueryProgress() {
        ALog.i(IConstant.TAG, "postQueryProgress");
        for (QueryRunnable queryRunnable : this.queryRunnables) {
            this.handle.removeCallbacks(queryRunnable);
            this.handle.post(queryRunnable);
        }
    }

    public void removeDownload(TaskInfo taskInfo) {
        ALog.i(IConstant.TAG, "removeDownload: " + taskInfo.getTid());
        DownloadManager downloadManager = this.downloadManager;
        if (downloadManager != null) {
            downloadManager.remove(taskInfo.getDownloadId());
            new DownloadManager.Query().setFilterById(taskInfo.getDownloadId());
        }
    }

    public boolean isSupportBreakpoint(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            ALog.i(IConstant.TAG, "get network response code: " + responseCode);
            if (responseCode != 200) {
                return true;
            }
            String headerField = httpURLConnection.getHeaderField("Accept-Ranges");
            if (headerField == null || !"bytes".equals(headerField)) {
                ALog.e(IConstant.TAG, "The url unsupport breakpoint continuation, download from the start location");
                return false;
            }
            ALog.i(IConstant.TAG, "The url support breakpoint continuation");
            return true;
        } catch (IOException e) {
            ALog.e(IConstant.TAG, "URL connection failed, error: " + e.getMessage());
            return false;
        }
    }

    public void pauseDownload(TaskInfo taskInfo) {
        ALog.i(IConstant.TAG, "execute pauseDownload, taskId: " + taskInfo.getTid());
        if (taskInfo.getProgress().getState() == 32) {
            taskInfo.getProgress().setState(48);
            if (taskInfo.getProgress().getLastProcessed() < taskInfo.getProgress().getProcessed()) {
                taskInfo.getProgress().setLastProcessed(taskInfo.getProgress().getProcessed());
            }
            stopQueryProgress(taskInfo);
            removeDownload(taskInfo);
            TaskDao.update(this.context, taskInfo, false);
            this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), "pause", JsonUtil.convertTaskInfoToJson(taskInfo));
        }
    }

    public void resumeDownload(TaskInfo taskInfo) {
        startDownload(taskInfo);
        sendResumeCallback(taskInfo);
    }

    public Response canMakeRequest(String str) {
        Map<String, List<String>> headers;
        ALog.i(IConstant.TAG, "Download: start download manager service, downloadUrl: " + str);
        this.supportsBreakpoint = false;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            Response httpResponse = parseHttpResponse(httpURLConnection);
            httpURLConnection.disconnect();
            int statusCode = httpResponse.getStatusCode();
            if ((statusCode == 200 || statusCode == 206) && (headers = httpResponse.getHeaders()) != null) {
                List<String> list = headers.get("Accept-Ranges");
                this.supportsBreakpoint = "bytes".equalsIgnoreCase((list == null || list.isEmpty()) ? null : list.get(0));
                ALog.i(IConstant.TAG, "Breakpoint supported: " + this.supportsBreakpoint);
            }
            return httpResponse;
        } catch (Exception e) {
            e.printStackTrace();
            ALog.i(IConstant.TAG, "canMakeRequest failed due to exception");
            return null;
        }
    }

    private void sendFailCallback(final TaskInfo taskInfo, String str) {
        Progress progress = taskInfo.getProgress();
        if (progress.getState() == 65 || statusIsFinish(progress.getState())) {
            return;
        }
        progress.setState(65);
        ArrayList arrayList = new ArrayList();
        arrayList.add(-1L);
        progress.setSizes(arrayList);
        taskInfo.setReason(str);
        taskInfo.setCode(getReasonCodeByReason(taskInfo.getReason()));
        TaskDao.update(this.context, taskInfo, true);
        if (taskInfo.getVersion() == 0) {
            Executors.newCachedThreadPool().submit(new Runnable() { // from class: ohos.ace.plugin.taskmanagerplugin.DownloadImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2057x6ce62109(taskInfo);
                }
            });
        } else {
            this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), EventType.FAILED, JsonUtil.convertTaskInfoToJson(taskInfo));
        }
    }

    /* JADX INFO: renamed from: lambda$sendFailCallback$1$ohos-ace-plugin-taskmanagerplugin-DownloadImpl, reason: not valid java name */
    /* synthetic */ void m2057x6ce62109(TaskInfo taskInfo) {
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), EventType.FAILED, JsonUtil.convertTaskInfoToJson(taskInfo));
    }

    public void sendStopCallback(TaskInfo taskInfo) {
        Progress progress = taskInfo.getProgress();
        if (progress.getState() != 49 && !statusIsFinish(progress.getState())) {
            progress.setState(49);
            taskInfo.setReason(Reason.USER_OPERATION);
            taskInfo.setCode(getReasonCodeByReason(taskInfo.getReason()));
            TaskDao.update(this.context, taskInfo, true);
        }
        stopQueryProgress(taskInfo);
    }

    private void sendResumeCallback(TaskInfo taskInfo) {
        taskInfo.getProgress().setState(32);
        this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), "resume", JsonUtil.convertTaskInfoToJson(taskInfo));
        TaskDao.update(this.context, taskInfo, true);
    }

    public void sendRemoveCallback(TaskInfo taskInfo) {
        taskInfo.getProgress().setState(80);
        TaskDao.update(this.context, taskInfo, true);
        this.mJavaTaskImpl.jniOnRequestCallback(taskInfo.getTid(), EventType.REMOVE, JsonUtil.convertTaskInfoToJson(taskInfo));
        stopQueryProgress(taskInfo);
    }

    public String getMimeType(long j) {
        return this.downloadManager.getMimeTypeForDownloadedFile(j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    public int getReasonCodeByReason(String str) {
        str.hashCode();
        switch (str) {
            case "UNSUPPORTED_NETWORK_TYPE":
                return 8;
            case "REDIRECT_ERROR":
                return 16;
            case "IO_ERROR":
                return 18;
            case "CONTINUOUS_TASK_TIMEOUT":
                return 12;
            case "CONNECT_ERROR":
                return 13;
            case "WAITTING_NETWORK_ONE_DAY":
                return 2;
            case "USER_OPERATION":
                return 5;
            case "PROTOCOL_ERROR":
                return 17;
            case "BUILD_REQUEST_FAILED":
                return 10;
            case "APP_BACKGROUND_OR_TERMINATE":
                return 6;
            case "STOPPED_NEW_FRONT_TASK":
                return 3;
            case "RUNNING_TASK_MEET_LIMITS":
                return 4;
            case "OTHERS_ERROR":
                return 20;
            case "NETWORK_OFFLINE":
                return 7;
            case "UNSUPPORT_RANGE_REQUEST":
                return 19;
            case "GET_FILESIZE_FAILED":
                return 11;
            case "BUILD_CLIENT_FAILED":
                return 9;
            case "UPLOAD_FILE_ERROR":
                return 15;
            case "REQUEST_ERROR":
                return 14;
            case "TASK_SURVIVAL_ONE_MONTH":
                return 1;
            default:
                return 0;
        }
    }
}
