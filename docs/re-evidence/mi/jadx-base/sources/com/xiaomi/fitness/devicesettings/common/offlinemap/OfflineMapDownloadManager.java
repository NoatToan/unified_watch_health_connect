package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.AMapException;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapDownloadManager;
import com.xiaomi.fitness.devicesettings.utils.ZipUtil;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020%J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005J\u001e\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001cJ\u0006\u00108\u001a\u00020+J\u0006\u00109\u001a\u00020+J\u000e\u0010:\u001a\u00020;2\u0006\u00100\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0005J\u000e\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0017J\u000e\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapDownloadManager;", "", "<init>", "()V", "AMAP_API", "", "TAG", "RESULT_OK", "downloadManager", "Landroid/app/DownloadManager;", "getDownloadManager", "()Landroid/app/DownloadManager;", "setDownloadManager", "(Landroid/app/DownloadManager;)V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "setExecutor", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "downloadingIds", "", "Lkotlin/Pair;", "", "getDownloadingIds", "()Ljava/util/List;", "downloadingDistricts", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "getDownloadingDistricts", "()Ljava/util/concurrent/ConcurrentHashMap;", "deviceAvailableSize", "getDeviceAvailableSize", "()J", "setDeviceAvailableSize", "(J)V", "viewModel", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "setViewModel", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;)V", "init", "", "buildRequest", "Lokhttp3/Request;", "url", "getDownloadUrlByAdCode", "adCode", "callBack", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadUrlCallBack;", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadUrlCallBack;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDownload", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "districtData", "startQuery", "queryDownloading", "isDownloading", "", "findDownloadingId", "cancelDownloading", "id", "errorCodeLog", "code", "", "release", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOfflineMapDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineMapDownloadManager.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapDownloadManager\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,299:1\n170#2,6:300\n1#3:306\n1863#4,2:307\n*S KotlinDebug\n*F\n+ 1 OfflineMapDownloadManager.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapDownloadManager\n*L\n88#1:300,6\n283#1:307,2\n*E\n"})
public final class OfflineMapDownloadManager {

    @NotNull
    public static final String AMAP_API = "https://restapi.amap.com/v5/rtos/raster/privince_pack?key=f35f73c2fa74597876d5f54658e4e1ca&adcode=%s";

    @NotNull
    public static final String RESULT_OK = "10000";

    @NotNull
    public static final String TAG = "OfflineMapDownloadManager";
    private static long deviceAvailableSize;
    public static DownloadManager downloadManager;

    @Nullable
    private static ScheduledExecutorService executor;

    @Nullable
    private static OfflineMapManagerViewModel viewModel;

    @NotNull
    public static final OfflineMapDownloadManager INSTANCE = new OfflineMapDownloadManager();

    @NotNull
    private static final List<Pair<String, Long>> downloadingIds = new ArrayList();

    @NotNull
    private static final ConcurrentHashMap<Long, DistrictData> downloadingDistricts = new ConcurrentHashMap<>();

    private OfflineMapDownloadManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryDownloading$lambda$4(String fileName, final long j) {
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        ZipUtil.INSTANCE.unZip(fileName, j, new Function2() { // from class: k6h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OfflineMapDownloadManager.queryDownloading$lambda$4$lambda$3(j, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryDownloading$lambda$4$lambda$3(long j, int i, String message) {
        MutableLiveData<Unit> unZipErrorLiveData;
        MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData;
        MutableLiveData<DistrictData> cancelDownloadDistrictLiveData;
        MutableLiveData<DistrictData> districtInstallCompleteLiveData;
        Intrinsics.checkNotNullParameter(message, "message");
        FitnessLogUtils.i(TAG, "unzip finish handleMessage code:" + i + ",viewMode:" + viewModel);
        if (i == 0) {
            OfflineMapManagerViewModel offlineMapManagerViewModel = viewModel;
            if (offlineMapManagerViewModel != null && (districtInstallCompleteLiveData = offlineMapManagerViewModel.getDistrictInstallCompleteLiveData()) != null) {
                districtInstallCompleteLiveData.postValue(downloadingDistricts.get(Long.valueOf(j)));
            }
        } else {
            OfflineMapManagerViewModel offlineMapManagerViewModel2 = viewModel;
            if (offlineMapManagerViewModel2 != null && (unZipErrorLiveData = offlineMapManagerViewModel2.getUnZipErrorLiveData()) != null) {
                unZipErrorLiveData.postValue(Unit.INSTANCE);
            }
        }
        ConcurrentHashMap<Long, DistrictData> concurrentHashMap = downloadingDistricts;
        DistrictData districtData = concurrentHashMap.get(Long.valueOf(j));
        OfflineMapManagerViewModel offlineMapManagerViewModel3 = viewModel;
        if (offlineMapManagerViewModel3 != null && (cancelDownloadDistrictLiveData = offlineMapManagerViewModel3.getCancelDownloadDistrictLiveData()) != null) {
            cancelDownloadDistrictLiveData.postValue(districtData);
        }
        concurrentHashMap.remove(Long.valueOf(j));
        OfflineMapManagerViewModel offlineMapManagerViewModel4 = viewModel;
        if (offlineMapManagerViewModel4 != null && (downloadDistrictLiveData = offlineMapManagerViewModel4.getDownloadDistrictLiveData()) != null) {
            downloadDistrictLiveData.postValue(concurrentHashMap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startQuery$lambda$2() {
        INSTANCE.queryDownloading();
    }

    @NotNull
    public final Request buildRequest(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        FitnessLogUtils.i(TAG, "request url:" + url);
        return new Request.Builder().url(url).head().get().build();
    }

    public final void cancelDownloading(long id) {
        MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData;
        ScheduledExecutorService scheduledExecutorService;
        MutableLiveData<DistrictData> cancelDownloadDistrictLiveData;
        getDownloadManager().remove(id);
        Iterator<Pair<String, Long>> it = downloadingIds.iterator();
        while (it.hasNext()) {
            if (it.next().getSecond().longValue() == id) {
                it.remove();
                break;
            }
        }
        ConcurrentHashMap<Long, DistrictData> concurrentHashMap = downloadingDistricts;
        DistrictData districtData = concurrentHashMap.get(Long.valueOf(id));
        OfflineMapManagerViewModel offlineMapManagerViewModel = viewModel;
        if (offlineMapManagerViewModel != null && (cancelDownloadDistrictLiveData = offlineMapManagerViewModel.getCancelDownloadDistrictLiveData()) != null) {
            cancelDownloadDistrictLiveData.postValue(districtData);
        }
        concurrentHashMap.remove(Long.valueOf(id));
        List<Pair<String, Long>> list = downloadingIds;
        if (list.isEmpty() && (scheduledExecutorService = executor) != null) {
            scheduledExecutorService.shutdown();
        }
        FitnessLogUtils.i(TAG, "cancelDownloading id:" + id + ",downloadingIds:" + list);
        OfflineMapManagerViewModel offlineMapManagerViewModel2 = viewModel;
        if (offlineMapManagerViewModel2 == null || (downloadDistrictLiveData = offlineMapManagerViewModel2.getDownloadDistrictLiveData()) == null) {
            return;
        }
        downloadDistrictLiveData.postValue(concurrentHashMap);
    }

    public final void errorCodeLog(int code) {
        String str;
        if (code != 1001) {
            switch (code) {
                case 1005:
                    str = "重定向过多";
                    break;
                case 1006:
                    str = AMapException.ERROR_NOT_ENOUGH_SPACE;
                    break;
                case 1007:
                    str = "设备未找到";
                    break;
                case 1008:
                    str = "无法恢复下载";
                    break;
                case 1009:
                    str = "文件已存在";
                    break;
                default:
                    str = "unknown";
                    break;
            }
        } else {
            str = "文件错误";
        }
        Logger.i(TAG, "file download error code:" + code + ",message:" + str);
    }

    public final long findDownloadingId(@NotNull String adCode) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        for (Map.Entry<Long, DistrictData> entry : downloadingDistricts.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            if (entry.getValue().getAdcode().equals(adCode)) {
                return jLongValue;
            }
        }
        return -1L;
    }

    public final long getDeviceAvailableSize() {
        return deviceAvailableSize;
    }

    @NotNull
    public final DownloadManager getDownloadManager() {
        DownloadManager downloadManager2 = downloadManager;
        if (downloadManager2 != null) {
            return downloadManager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
        return null;
    }

    @Nullable
    public final Object getDownloadUrlByAdCode(@NotNull String str, @NotNull DownloadUrlCallBack downloadUrlCallBack, @NotNull Continuation<? super Unit> continuation) {
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().build();
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(AMAP_API, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            Response responseExecute = okHttpClientBuild.newCall(buildRequest(str2)).execute();
            try {
                if (responseExecute.isSuccessful()) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    FitnessLogUtils.i(TAG, "request success:" + strString);
                    DistrictUrlData districtUrlData = (DistrictUrlData) new Gson().fromJson(strString, DistrictUrlData.class);
                    if (TextUtils.equals(districtUrlData.getInfocode(), RESULT_OK)) {
                        Intrinsics.checkNotNull(districtUrlData);
                        downloadUrlCallBack.onSuccess(districtUrlData);
                    } else {
                        downloadUrlCallBack.onFailed("返回数据异常：" + districtUrlData);
                    }
                } else {
                    FitnessLogUtils.e(TAG, "request failed:" + responseExecute.message());
                    downloadUrlCallBack.onFailed("请求失败：" + responseExecute.message());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "request exception:" + e.getMessage());
            downloadUrlCallBack.onFailed("请求异常：" + e.getMessage());
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final ConcurrentHashMap<Long, DistrictData> getDownloadingDistricts() {
        return downloadingDistricts;
    }

    @NotNull
    public final List<Pair<String, Long>> getDownloadingIds() {
        return downloadingIds;
    }

    @Nullable
    public final ScheduledExecutorService getExecutor() {
        return executor;
    }

    @Nullable
    public final OfflineMapManagerViewModel getViewModel() {
        return viewModel;
    }

    public final void init(@NotNull OfflineMapManagerViewModel viewModel2) {
        Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
        Object systemService = ApplicationExtKt.getApplication().getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        setDownloadManager((DownloadManager) systemService);
        FitnessLogUtils.i(OfflineMapManagerActivity.TAG, "initViewModel manager init viewModel:" + viewModel2);
        viewModel = viewModel2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[ORIG_RETURN, RETURN] */
    public final boolean isDownloading(@NotNull String adCode) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        Collection<DistrictData> collectionValues = downloadingDistricts.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (Object obj : collectionValues) {
            if (((DistrictData) obj).getAdcode().equals(adCode)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    public final void queryDownloading() {
        Iterator<Pair<String, Long>> it;
        MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2;
        int i = 1;
        List<Pair<String, Long>> list = downloadingIds;
        FitnessLogUtils.i(TAG, "queryDownloading,current downloadId:" + list.size());
        if (list.isEmpty()) {
            return;
        }
        Iterator<Pair<String, Long>> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<String, Long> next = it2.next();
            final long jLongValue = next.getSecond().longValue();
            final String first = next.getFirst();
            DownloadManager downloadManager2 = getDownloadManager();
            DownloadManager.Query query = new DownloadManager.Query();
            long[] jArr = new long[i];
            jArr[0] = jLongValue;
            Cursor cursorQuery = downloadManager2.query(query.setFilterById(jArr));
            if (cursorQuery.moveToFirst()) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("status");
                int i2 = cursorQuery.getInt(columnIndexOrThrow);
                FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ",create cursor,column:" + columnIndexOrThrow + ",status:" + i2);
                if (i2 == i) {
                    it = it2;
                    FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ",下载等待");
                    DistrictData districtData = downloadingDistricts.get(Long.valueOf(jLongValue));
                    if (districtData != null) {
                        districtData.setDownloadStatus(DownloadStatus.STATUS_PENDING);
                    }
                } else if (i2 != 2) {
                    if (i2 == 4) {
                        FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ",下载暂停");
                        DistrictData districtData2 = downloadingDistricts.get(Long.valueOf(jLongValue));
                        if (districtData2 != null) {
                            districtData2.setDownloadStatus(DownloadStatus.STATUS_PAUSE);
                        }
                    } else if (i2 == 8) {
                        FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ",下载完成");
                        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: j6h
                            @Override // java.lang.Runnable
                            public final void run() {
                                OfflineMapDownloadManager.queryDownloading$lambda$4(first, jLongValue);
                            }
                        });
                        List<Pair<String, Long>> list2 = downloadingIds;
                        FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ", 下载完成 remove:" + jLongValue + "，剩余任务个数:" + list2.size());
                        DistrictData districtData3 = downloadingDistricts.get(Long.valueOf(jLongValue));
                        if (districtData3 != null) {
                            districtData3.setDownloadStatus(DownloadStatus.STATUS_INSTALLING);
                        }
                        it2.remove();
                        if (list2.isEmpty() && (scheduledExecutorService = executor) != null) {
                            scheduledExecutorService.shutdown();
                        }
                    } else if (i2 == 16) {
                        errorCodeLog(cursorQuery.getInt(cursorQuery.getColumnIndex("reason")));
                        it2.remove();
                        List<Pair<String, Long>> list3 = downloadingIds;
                        FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ", 下载失败 remove:" + jLongValue + "，剩余任务个数:" + list3.size());
                        DistrictData districtData4 = downloadingDistricts.get(Long.valueOf(jLongValue));
                        if (districtData4 != null) {
                            districtData4.setDownloadStatus(DownloadStatus.STATUS_FAILED);
                        }
                        if (list3.isEmpty() && (scheduledExecutorService2 = executor) != null) {
                            scheduledExecutorService2.shutdown();
                        }
                    }
                    it = it2;
                } else {
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bytes_so_far"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("total_size"));
                    it = it2;
                    int i3 = (int) ((((long) 100) * j) / j2);
                    FitnessLogUtils.i(TAG, "id:" + jLongValue + ",name:" + first + ",downloading status progress:" + j + ",totalSize:" + j2 + ",rate:" + i3);
                    ConcurrentHashMap<Long, DistrictData> concurrentHashMap = downloadingDistricts;
                    DistrictData districtData5 = concurrentHashMap.get(Long.valueOf(jLongValue));
                    if (districtData5 != null) {
                        districtData5.setDownloadStatus(DownloadStatus.STATUS_DOWNLOADING);
                    }
                    DistrictData districtData6 = concurrentHashMap.get(Long.valueOf(jLongValue));
                    if (districtData6 != null) {
                        districtData6.setDownloadProgress(i3);
                    }
                }
            } else {
                it = it2;
            }
            OfflineMapManagerViewModel offlineMapManagerViewModel = viewModel;
            FitnessLogUtils.i(TAG, "downloading livedata post viewModel:" + offlineMapManagerViewModel + ",livedata:" + (offlineMapManagerViewModel != null ? offlineMapManagerViewModel.getDownloadDistrictLiveData() : null));
            OfflineMapManagerViewModel offlineMapManagerViewModel2 = viewModel;
            if (offlineMapManagerViewModel2 != null && (downloadDistrictLiveData = offlineMapManagerViewModel2.getDownloadDistrictLiveData()) != null) {
                downloadDistrictLiveData.postValue(downloadingDistricts);
            }
            cursorQuery.close();
            it2 = it;
            i = 1;
        }
    }

    public final void release() {
        Iterator<T> it = downloadingIds.iterator();
        while (it.hasNext()) {
            INSTANCE.getDownloadManager().remove(((Number) ((Pair) it.next()).getSecond()).longValue());
        }
        downloadingIds.clear();
        downloadingDistricts.clear();
        ScheduledExecutorService scheduledExecutorService = executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        deviceAvailableSize = 0L;
    }

    public final void setDeviceAvailableSize(long j) {
        deviceAvailableSize = j;
    }

    public final void setDownloadManager(@NotNull DownloadManager downloadManager2) {
        Intrinsics.checkNotNullParameter(downloadManager2, "<set-?>");
        downloadManager = downloadManager2;
    }

    public final void setExecutor(@Nullable ScheduledExecutorService scheduledExecutorService) {
        executor = scheduledExecutorService;
    }

    public final void setViewModel(@Nullable OfflineMapManagerViewModel offlineMapManagerViewModel) {
        viewModel = offlineMapManagerViewModel;
    }

    public final void startDownload(@NotNull Uri uri, @NotNull DistrictData districtData) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(districtData, "districtData");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(2);
        String path = uri.getPath();
        if (path == null) {
            return;
        }
        int i = -1;
        int length = path.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (path.charAt(length) == '/') {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        String strSubstring = path.substring(i + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        request.setDestinationInExternalFilesDir(ApplicationExtKt.getApplication(), "offlineMap", strSubstring);
        request.setTitle(districtData.getName());
        long jEnqueue = getDownloadManager().enqueue(request);
        downloadingIds.add(new Pair<>(new File(ApplicationExtKt.getApplication().getExternalFilesDir("offlineMap"), strSubstring).toString(), Long.valueOf(jEnqueue)));
        downloadingDistricts.put(Long.valueOf(jEnqueue), districtData);
        Logger.i(TAG, "download start download id:" + jEnqueue);
        startQuery();
    }

    public final void startQuery() {
        List<Pair<String, Long>> list = downloadingIds;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        ScheduledExecutorService scheduledExecutorService = executor;
        Logger.i(TAG, "startQuery,downloadIds size:" + size + ",executor status:" + scheduledExecutorService + " isShutdown:" + (scheduledExecutorService != null ? Boolean.valueOf(scheduledExecutorService.isShutdown()) : null));
        ScheduledExecutorService scheduledExecutorService2 = executor;
        if (scheduledExecutorService2 == null || (scheduledExecutorService2 != null && scheduledExecutorService2.isShutdown())) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            executor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            try {
                Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l6h
                    @Override // java.lang.Runnable
                    public final void run() {
                        OfflineMapDownloadManager.startQuery$lambda$2();
                    }
                }, 0L, 1L, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
                FitnessLogUtils.i(TAG, "scheduleWithFixedDelay error:" + Unit.INSTANCE);
            }
        }
    }
}
