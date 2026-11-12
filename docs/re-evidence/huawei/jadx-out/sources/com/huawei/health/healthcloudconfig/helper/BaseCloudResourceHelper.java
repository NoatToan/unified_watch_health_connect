package com.huawei.health.healthcloudconfig.helper;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fcw;
import defpackage.fcz;
import defpackage.fda;
import defpackage.fdk;
import defpackage.fdo;
import defpackage.fdy;
import defpackage.fel;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public abstract class BaseCloudResourceHelper {
    private static final String RELEASE_TAG = "R_BaseCloudResourceHelper";
    private static final String TAG = "BaseCloudResourceHelper";
    private String mCloudResourceConfigName;
    private volatile boolean mIsUpdating;
    private int mUpdateDayInterval;

    protected abstract List<fdk> getLocalFileData(File[] fileArr);

    protected abstract void handleResponse(fcz fczVar, String str, List<String> list, CloudResourceCallback cloudResourceCallback);

    protected BaseCloudResourceHelper(String str) {
        this.mUpdateDayInterval = 0;
        this.mIsUpdating = false;
        this.mCloudResourceConfigName = str;
    }

    public BaseCloudResourceHelper(String str, int i) {
        this.mUpdateDayInterval = 0;
        this.mIsUpdating = false;
        this.mCloudResourceConfigName = str;
        this.mUpdateDayInterval = i;
    }

    public void checkUpdate(final String str, final Map<String, String> map, final CheckResourceUpdateCallback checkResourceUpdateCallback) {
        LogUtil.a(TAG, "isUpdating = ", Boolean.valueOf(this.mIsUpdating));
        if (this.mIsUpdating) {
            onFailureForUpdate(TAG, "is updating, return", checkResourceUpdateCallback);
            this.mIsUpdating = true;
            return;
        }
        this.mIsUpdating = true;
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            onFailureForUpdate(TAG, "checkUpdate necessary params is null", checkResourceUpdateCallback);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fds
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1117x6a74118e(str, map, checkResourceUpdateCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$checkUpdate$0$com-huawei-health-healthcloudconfig-helper-BaseCloudResourceHelper, reason: not valid java name */
    public /* synthetic */ void m1117x6a74118e(String str, Map map, CheckResourceUpdateCallback checkResourceUpdateCallback) {
        fcz fczVarA = fdy.a(TAG, new fda(str, map), this.mUpdateDayInterval, str);
        if (fczVarA != null) {
            List<fcw> listA = fczVarA.a();
            if (listA.size() == 0) {
                onFailureForUpdate(TAG, "getResponse from cloud fileList size = 0", checkResourceUpdateCallback);
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<fdk> localFile = getLocalFile(str);
            if (localFile == null || localFile.isEmpty()) {
                LogUtil.a(TAG, "download first time, skip check");
                if (checkResourceUpdateCallback != null) {
                    checkResourceUpdateCallback.onSuccess(TAG, true);
                    return;
                }
                return;
            }
            boolean zCheckUpdateStatus = checkUpdateStatus(localFile, listA, arrayList);
            if (checkResourceUpdateCallback != null) {
                checkResourceUpdateCallback.onSuccess(TAG, zCheckUpdateStatus);
                return;
            }
            return;
        }
        ReleaseLogUtil.e(RELEASE_TAG, "response is null, skip download");
        this.mIsUpdating = false;
    }

    private List<fdk> getLocalFile(String str) {
        File[] fileArrListFiles = new File(fdy.d(str, (String) null, (String) null)).listFiles();
        if (fileArrListFiles == null) {
            ReleaseLogUtil.d(RELEASE_TAG, "download first time, skip check");
            return Collections.EMPTY_LIST;
        }
        return getLocalFileData(fileArrListFiles);
    }

    private boolean checkUpdateStatus(List<fdk> list, List<fcw> list2, List<fel> list3) {
        ArrayList arrayList = new ArrayList();
        Iterator<fdk> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        LinkedList<fdo> linkedList = new LinkedList();
        boolean z = false;
        for (fcw fcwVar : list2) {
            fdo fdoVar = new fdo(fcwVar);
            String strC = fcwVar.c();
            int iJ = CommonUtils.j(fcwVar.e());
            if (!arrayList.contains(strC)) {
                fdoVar.c(true);
                linkedList.add(fdoVar);
                z = true;
            } else {
                for (fdk fdkVar : list) {
                    String strC2 = fdkVar.c();
                    int iA = fdkVar.a();
                    if (TextUtils.isEmpty(strC2) || TextUtils.isEmpty(strC)) {
                        ReleaseLogUtil.e(RELEASE_TAG, "fileName or fileIdFromCloud is empty");
                    } else {
                        if (strC2.equals(strC) && iJ > iA) {
                            fdoVar.c(true);
                            z = true;
                        }
                        linkedList.add(fdoVar);
                    }
                }
            }
        }
        this.mIsUpdating = z;
        for (fdo fdoVar2 : linkedList) {
            if (fdoVar2.b()) {
                fcw fcwVarA = fdoVar2.a();
                fel felVar = new fel();
                felVar.a(fcwVarA.c());
                felVar.b(fcwVarA.d());
                felVar.e(CommonUtils.j(fcwVarA.e()));
                felVar.a(getFileSizeFromNet(fcwVarA.d()));
                list3.add(felVar);
            }
        }
        LogUtil.a(TAG, "cloudResourceConfigList = ", list3);
        return z;
    }

    public void downloadFiles(final String str, final List<String> list, Map<String, String> map, int i, final CloudResourceCallback cloudResourceCallback) {
        if (TextUtils.isEmpty(str) || list.isEmpty() || map.isEmpty()) {
            onFailureForDownload(RELEASE_TAG, "downloadFiles necessary params is null", cloudResourceCallback);
        } else {
            fdy.b(new fda(str, map), TAG, list, i, new DownloadCallback<fcz>() { // from class: com.huawei.health.healthcloudconfig.helper.BaseCloudResourceHelper.5
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onFinish(fcz fczVar) {
                    ReleaseLogUtil.d(BaseCloudResourceHelper.RELEASE_TAG, "downloadFiles onFinish, data is: ", fczVar);
                    BaseCloudResourceHelper.this.handleResponse(fczVar, str, list, cloudResourceCallback);
                    BaseCloudResourceHelper.this.mIsUpdating = false;
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j, long j2, boolean z, String str2) {
                    cloudResourceCallback.onProgress(j, j2, z, str2);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i2, Throwable th) {
                    BaseCloudResourceHelper.this.onFailureForDownload(BaseCloudResourceHelper.RELEASE_TAG, "errCode = " + i2 + ", errInfo = " + th.toString(), cloudResourceCallback);
                }
            });
        }
    }

    public void onFailureForUpdate(String str, String str2, CheckResourceUpdateCallback checkResourceUpdateCallback) {
        ReleaseLogUtil.a(RELEASE_TAG, "tag = ", str, " errorInfo = ", str2);
        if (checkResourceUpdateCallback != null) {
            checkResourceUpdateCallback.onFailure(str, str2);
        }
        this.mIsUpdating = false;
    }

    protected void onFailureForDownload(String str, String str2, CloudResourceCallback cloudResourceCallback) {
        ReleaseLogUtil.a(RELEASE_TAG, "tag = ", str, " errorInfo = ", str2);
        if (cloudResourceCallback != null) {
            cloudResourceCallback.onFailure(str, str2);
        }
        this.mIsUpdating = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    private int getFileSizeFromNet(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                int contentLength = httpURLConnection2.getContentLength();
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return contentLength;
            } catch (IOException e) {
                httpURLConnection = httpURLConnection2;
                e = e;
                try {
                    ReleaseLogUtil.a(RELEASE_TAG, "getFileSizeFromNet IOException = ", e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    HttpURLConnection httpURLConnection3 = httpURLConnection;
                    th = th2;
                    httpURLConnection2 = httpURLConnection3;
                    Throwable th3 = th;
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                httpURLConnection = httpURLConnection2;
                th = th5;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th6) {
            th = th6;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
