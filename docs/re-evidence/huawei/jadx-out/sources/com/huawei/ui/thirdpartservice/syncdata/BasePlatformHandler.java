package com.huawei.ui.thirdpartservice.syncdata;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.route.TrackInfo;
import com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import defpackage.xay;
import defpackage.xcl;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BasePlatformHandler implements TaskPool.TaskPoolListener {
    private static final int MINI_TRACK_SIZE = 2;
    private static final String R_TAG = "R_HL_BasePlatformHandler";
    public static final String SYNC_FILE_TYPE_FIT = "fit";
    public static final String SYNC_FILE_TYPE_GPX = "gpx";
    private static final String TAG = "BasePlatformHandler";
    protected Context mContext;
    private OauthManager mOauthManager;
    private SyncResultListener mResultListener;
    private TaskPool mTaskPool;

    public interface GenerateSyncDataTaskFactory {
        SyncTask generateSyncDataTask(HiHealthData hiHealthData, File file);
    }

    public interface SyncResultListener {
        void syncResultCallback(String str, boolean z, String str2);
    }

    protected abstract GenerateSyncDataTaskFactory getGenerateSyncDataTaskFactory();

    public abstract String getGpxType(int i);

    protected abstract OauthManager getOauthManager();

    protected abstract String getPlatform();

    public abstract Set<Integer> getSyncDataType();

    public abstract String getSyncFileType();

    protected abstract String getSynchronizedTimeStampsKey();

    public BasePlatformHandler(Context context, SyncResultListener syncResultListener) {
        this.mResultListener = syncResultListener;
        this.mContext = context.getApplicationContext();
    }

    protected void init() {
        this.mTaskPool = new TaskPool(getSynchronizedTimeStampsKey(), this);
        this.mOauthManager = getOauthManager();
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.TaskPool.TaskPoolListener
    public void onTaskFinish() {
        ReleaseLogUtil.d(TAG, getPlatform(), " Sync finish!");
        syncComplete(getPlatform(), true, "Sync finish!");
    }

    public void checkConnectStatus(final RefreshTokenCallback refreshTokenCallback) {
        this.mOauthManager.checkConnectStatus(new RefreshTokenCallback() { // from class: com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler.4
            @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
            public void refreshResult(boolean z, boolean z2) {
                ReleaseLogUtil.d(BasePlatformHandler.R_TAG, BasePlatformHandler.this.getPlatform(), "refreshResult:", Boolean.valueOf(z), ", isSuccess: ", Boolean.valueOf(z2));
                if (!z || !z2) {
                    refreshTokenCallback.refreshResult(z, z2);
                    BasePlatformHandler basePlatformHandler = BasePlatformHandler.this;
                    basePlatformHandler.syncComplete(basePlatformHandler.getPlatform(), true, "Not Connected");
                } else if (!TextUtils.isEmpty(BasePlatformHandler.this.mOauthManager.getAccessToken())) {
                    refreshTokenCallback.refreshResult(z, z2);
                } else {
                    BasePlatformHandler.this.mOauthManager.refreshAccessToken(this);
                }
            }
        });
    }

    void runSyncTask(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData, TrackInfo trackInfo) {
        SyncTask syncTaskGenerateSyncDataTask = getGenerateSyncDataTaskFactory().generateSyncDataTask(hiHealthData, createSyncFile(hiHealthData, hiTrackMetaData, trackInfo));
        if (trackInfo.getLbsInfo().getRealSize() < 2) {
            ReleaseLogUtil.e(R_TAG, getPlatform(), " sportDataException ");
            syncTaskGenerateSyncDataTask.sportDataException();
        }
        ReleaseLogUtil.d(R_TAG, getPlatform(), " runSyncTAsk ", Integer.valueOf(hiHealthData.getSubType()));
        this.mTaskPool.d(syncTaskGenerateSyncDataTask);
    }

    private File createSyncFile(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData, TrackInfo trackInfo) {
        File fileE;
        String str;
        try {
            File syncFileFolder = getSyncFileFolder();
            if (!syncFileFolder.exists() && !syncFileFolder.mkdirs()) {
                ReleaseLogUtil.a(R_TAG, "create folder error.");
                return null;
            }
            String str2 = syncFileFolder.getCanonicalPath() + File.separator + hiHealthData.getStartTime() + "_" + getPlatform();
            if (getSyncFileType().equals(SYNC_FILE_TYPE_FIT)) {
                str = str2 + AppInfoUtils.i() + "_a_SyncData.fit";
                fileE = xay.d(hiHealthData, str);
            } else {
                if (trackInfo != null && trackInfo.getLbsInfo() != null && trackInfo.getLbsInfo().isValid()) {
                    String str3 = str2 + AppInfoUtils.i() + "_a_SyncData.gpx";
                    fileE = xcl.e(hiHealthData, hiTrackMetaData, trackInfo, getGpxType(hiHealthData.getSubType()), str3);
                    str = str3;
                }
                ReleaseLogUtil.e(R_TAG, "Lbs invalid data. ");
                return null;
            }
            LogUtil.a(TAG, "SyncFile:", str);
            if (fileE != null) {
                ReleaseLogUtil.d(TAG, "Generate gpx  file size：", Long.valueOf(fileE.length()));
                return fileE;
            }
            ReleaseLogUtil.e(R_TAG, "Generate gpx file null.");
            return null;
        } catch (IOException | NumberFormatException | XmlPullParserException e) {
            ReleaseLogUtil.e(R_TAG, "Generate gpx file error: ", ExceptionUtils.c(e));
            return null;
        }
    }

    private File getSyncFileFolder() throws IOException {
        return new File(CommonUtil.c(BaseApplication.b().getFilesDir().getCanonicalPath()), SyncDataConstant.SYNC_DATA_TRACKS_FOLDER + File.separator + SyncDataConstant.SYNC_DATA_TRACKS_EXPORT_FOLDER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncComplete(String str, boolean z, String str2) {
        this.mResultListener.syncResultCallback(str, z, str2);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.TaskPool.TaskPoolListener
    public void tokenInvalidation() {
        this.mOauthManager.refreshAccessToken(new RefreshTokenCallback() { // from class: xaj
            @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
            public final void refreshResult(boolean z, boolean z2) {
                this.f52655b.lambda$tokenInvalidation$0(z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tokenInvalidation$0(boolean z, boolean z2) {
        ReleaseLogUtil.d(R_TAG, "tokenInvalidation isRequestValid = ", Boolean.valueOf(z), ", isSuccess = ", Boolean.valueOf(z2));
        if (z && z2) {
            this.mTaskPool.a();
            return;
        }
        this.mTaskPool.e();
        xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), "", getPlatform(), "", "refresh token failed.");
        syncComplete(getPlatform(), false, "refresh token error!");
    }

    private boolean isAlreadySync(HiHealthData hiHealthData) {
        return this.mTaskPool.a(hiHealthData);
    }

    public void release() {
        this.mTaskPool.e();
    }

    void forceStopSync() {
        this.mTaskPool.d();
    }

    long getOauthTime() {
        return getOauthManager().getOauthTime();
    }

    public boolean needUpload(HiHealthData hiHealthData) {
        boolean zContains = getSyncDataType().contains(Integer.valueOf(hiHealthData.getSubType()));
        boolean zIsAlreadySync = isAlreadySync(hiHealthData);
        boolean z = hiHealthData.getStartTime() <= getOauthTime();
        ReleaseLogUtil.d(R_TAG, getClass().getSimpleName(), " hiHealthData return startTime:", Long.valueOf(hiHealthData.getStartTime()), " type:", Integer.valueOf(hiHealthData.getType()));
        ReleaseLogUtil.d(R_TAG, getClass().getSimpleName(), " typeNeedUpload:", Boolean.valueOf(zContains), " isAlreadySync:", Boolean.valueOf(zIsAlreadySync), " isBeforeOauth：", Boolean.valueOf(z));
        return (!zContains || zIsAlreadySync || z) ? false : true;
    }

    boolean isSyncFinish() {
        return this.mTaskPool.c();
    }
}
