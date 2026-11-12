package com.ximalaya.ting.android.opensdk.player.advertis;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.httputil.HttpUrlUtil;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import com.ximalaya.ting.android.opensdk.util.DigestUtils;
import com.ximalaya.ting.android.opensdk.util.FileUtilBase;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.MyAsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class XmAdsManager {
    public static final int AD_ADVANCE_TIME = 20000;
    private static final int MAX_ADS_CACHE = 20;
    private static final int MAX_DOWNLOAD_TIME = 5000;
    public static boolean isPlayFragmentShowing = false;
    private static volatile XmAdsManager sInstance;
    private static byte[] sLock = new byte[0];
    private IXmAdsDataHandle dataHandler;
    private long lastRequestTime;
    private MiniPlayer mAdsPlayer;
    private Context mAppCtx;
    private AdvertisList mLastRequestAdList;
    private String mLastRequestTag;
    private TaskWrapper mLastTask;
    private IXmAdsStatusListener mListener;
    private List<String> mAdsFileCache = new CopyOnWriteArrayList();
    private boolean mAdsActive = false;
    private boolean mLastIsDuringPlay = false;
    private long lastRequestTrackId = -1;
    private Map<String, List<IDataCallBack<String>>> requestMap = new ConcurrentHashMap();

    public interface IPlayStartCallBack {
        boolean onPlayStart();
    }

    public interface PlayAdsCallback {
        void onFinish(boolean z);
    }

    public class TaskWrapper {
        public AdvertisList ads;
        public PlayAdsCallback callback;
        public boolean cancel;
        public IPlayStartCallBack mPlayStartCallBack;
        public int playIndex = 0;
        public PlayAdsCallback tempCallBack;
        public Track track;

        public TaskWrapper() {
        }
    }

    private XmAdsManager(Context context) {
        this.mAppCtx = context.getApplicationContext();
        loadCachedAdsFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dataReceiver(AdvertisList advertisList, TaskWrapper taskWrapper) {
        boolean zExitPlayAds = exitPlayAds(taskWrapper.cancel, taskWrapper, false);
        Logger.logToSd("dataReceiver 1:" + System.currentTimeMillis());
        if (zExitPlayAds) {
            Logger.logToSd("dataReceiver 2:" + System.currentTimeMillis());
            return;
        }
        Logger.logToSd("dataReceiver 3:" + System.currentTimeMillis());
        IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
        if (iXmAdsStatusListener != null) {
            iXmAdsStatusListener.onGetAdsInfo(advertisList);
        }
        if (advertisList == null || advertisList.getRet() != 0 || advertisList.getAdvertisList() == null || advertisList.getAdvertisList().size() == 0 || advertisList.getAdvertisList().get(0) == null) {
            this.mAdsActive = false;
            exitPlayAds(true, taskWrapper, true);
            Logger.logToSd("dataReceiver 4:" + System.currentTimeMillis());
            return;
        }
        if (advertisList.getAdvertisList().get(0).getAdid() == -1) {
            this.mAdsActive = true;
        }
        taskWrapper.ads = advertisList;
        if (advertisList.getAdvertisList().get(0).isDuringPlay()) {
            IXmAdsStatusListener iXmAdsStatusListener2 = this.mListener;
            if (iXmAdsStatusListener2 != null) {
                iXmAdsStatusListener2.onCompletePlayAds();
            }
            this.mAdsActive = false;
        } else {
            downloadAndPlayAds(taskWrapper);
            if (!isPlayFragmentShowing && advertisList.getAdvertisList().get(0).getSoundType() == 11) {
                onVideoAdCompleted();
            }
        }
        Logger.logToSd("dataReceiver 5:" + System.currentTimeMillis());
        this.dataHandler.upLoadAdsLog(taskWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean deleteAdsCacheFile(String str) {
        File file = new File(FileUtilBase.getAdsCacheDir(this.mAppCtx, str));
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    private void downloadAdsFile(final TaskWrapper taskWrapper, final int i) {
        if (exitPlayAds(taskWrapper.cancel, taskWrapper, false)) {
            Logger.logToSd("downloadAdsFile 0:" + System.currentTimeMillis());
            return;
        }
        IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
        if (iXmAdsStatusListener != null) {
            iXmAdsStatusListener.onAdsStartBuffering();
        }
        MyAsyncTask.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.6
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Logger.logToSd("downloadAdsFile doInBackground 1:" + System.currentTimeMillis());
                TaskWrapper taskWrapper2 = taskWrapper;
                if (taskWrapper2.cancel) {
                    return;
                }
                String soundUrl = taskWrapper2.ads.getAdvertisList().get(0).getSoundUrl();
                String filePath = XmAdsManager.this.getFilePath(soundUrl);
                if (new File(filePath).exists()) {
                    XmAdsManager.this.onDownloadCallBack(taskWrapper, filePath, false, i);
                } else {
                    XmAdsManager.this.downloadUrlHaveCallBack(soundUrl, new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.6.1
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onError(int i2, String str) {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            XmAdsManager.this.onDownloadCallBack(taskWrapper, null, false, i);
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onSuccess(@Nullable String str) {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            XmAdsManager.this.onDownloadCallBack(taskWrapper, str, false, i);
                        }
                    });
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    private void downloadAndPlayAds(final TaskWrapper taskWrapper) {
        boolean z;
        boolean z2;
        Advertis advertis;
        boolean z3;
        Advertis advertis2;
        final String soundUrl;
        final String filePath;
        Logger.logToSd("downloadAndPlayAds 0:" + System.currentTimeMillis());
        if (exitPlayAds(taskWrapper.cancel, taskWrapper, false)) {
            Logger.logToSd("downloadAndPlayAds 1:" + System.currentTimeMillis());
            return;
        }
        final int iWordOfMouthIndex = wordOfMouthIndex(taskWrapper);
        boolean z4 = !TextUtils.isEmpty(taskWrapper.ads.getAdvertisList().get(0).getSoundUrl());
        if (iWordOfMouthIndex <= 0) {
            if (iWordOfMouthIndex == 0) {
                z = false;
                z2 = false;
            }
            if (iWordOfMouthIndex >= 0 && (advertis2 = taskWrapper.ads.getAdvertisList().get(iWordOfMouthIndex)) != null) {
                soundUrl = advertis2.getSoundUrl();
                filePath = getFilePath(soundUrl);
                taskWrapper.mPlayStartCallBack = new IPlayStartCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.2
                    @Override // com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.IPlayStartCallBack
                    public boolean onPlayStart() {
                        Logger.logToSd("口播冠名广告 回调  ==  onPlayStart" + taskWrapper.cancel + "   " + new File(filePath).exists());
                        if (!new File(filePath).exists() || taskWrapper.cancel) {
                            return false;
                        }
                        if (XmPlayerService.getPlayerSrvice() != null) {
                            XmPlayerService.getPlayerSrvice().playPauseNoNotif();
                            XmPlayerService.getPlayerSrvice().setPlayStartCallback(null);
                        }
                        XmAdsManager.this.mAdsActive = true;
                        XmAdsManager.this.onDownloadCallBack(taskWrapper, filePath, true, iWordOfMouthIndex);
                        if (XmAdsManager.this.dataHandler != null) {
                            taskWrapper.playIndex = iWordOfMouthIndex;
                            XmAdsManager.this.dataHandler.upLoadAdsLog(taskWrapper);
                        }
                        return true;
                    }
                };
                if (!new File(filePath).exists()) {
                    final boolean z5 = z2;
                    final boolean z6 = z;
                    final IDataCallBack<String> iDataCallBack = new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.3
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onError(int i, String str) {
                            if (iWordOfMouthIndex == 0 || (z5 && !z6)) {
                                XmAdsManager.this.mAdsActive = false;
                                XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
                            }
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onSuccess(@Nullable String str) {
                            if (XmAdsManager.this.mAdsFileCache.size() > 20) {
                                XmAdsManager xmAdsManager = XmAdsManager.this;
                                xmAdsManager.deleteAdsCacheFile((String) xmAdsManager.mAdsFileCache.remove(0));
                            }
                            XmAdsManager.this.mAdsFileCache.add(str);
                            if ((iWordOfMouthIndex == 0 || (z5 && !z6)) && !taskWrapper.cancel) {
                                if (XmPlayerService.getPlayerSrvice() != null) {
                                    XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                                }
                                XmAdsManager.this.mAdsActive = false;
                                XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
                            }
                        }
                    };
                    MyAsyncTask.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.4
                        @Override // java.lang.Runnable
                        public void run() throws Throwable {
                            XmAdsManager.this.downloadUrlHaveCallBack(soundUrl, iDataCallBack);
                        }
                    });
                    if (iWordOfMouthIndex != 0) {
                        return;
                    }
                    if (z2 && !z) {
                        return;
                    }
                } else if (iWordOfMouthIndex != 0 || (z2 && !z)) {
                    if (XmPlayerService.getPlayerSrvice() != null) {
                        XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                    }
                    this.mAdsActive = false;
                    exitPlayAds(true, taskWrapper, true);
                    return;
                }
            }
            if (z2) {
                advertis = taskWrapper.ads.getAdvertisList().get(0);
                if (advertis.getSoundType() == 11 || TextUtils.isEmpty(advertis.getDynamicImage())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    taskWrapper.tempCallBack = taskWrapper.callback;
                    taskWrapper.callback = null;
                }
                if (!z || z3) {
                    if (z && !z3) {
                        downloadAdsFile(taskWrapper, iWordOfMouthIndex);
                    }
                    if (z3 || iWordOfMouthIndex < 0 || XmPlayerService.getPlayerSrvice() == null) {
                        return;
                    }
                    XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                    return;
                }
                this.mAdsActive = false;
                if (iWordOfMouthIndex >= 0 && XmPlayerService.getPlayerSrvice() != null) {
                    XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                }
                exitPlayAds(true, taskWrapper, true);
                Logger.logToSd("downloadAndPlayAds 2:" + System.currentTimeMillis());
                return;
            }
        }
        z4 = !TextUtils.isEmpty(taskWrapper.ads.getAdvertisList().get(0).getSoundUrl());
        z = z4;
        z2 = true;
        if (iWordOfMouthIndex >= 0) {
            soundUrl = advertis2.getSoundUrl();
            filePath = getFilePath(soundUrl);
            taskWrapper.mPlayStartCallBack = new IPlayStartCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.2
                @Override // com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.IPlayStartCallBack
                public boolean onPlayStart() {
                    Logger.logToSd("口播冠名广告 回调  ==  onPlayStart" + taskWrapper.cancel + "   " + new File(filePath).exists());
                    if (!new File(filePath).exists() || taskWrapper.cancel) {
                        return false;
                    }
                    if (XmPlayerService.getPlayerSrvice() != null) {
                        XmPlayerService.getPlayerSrvice().playPauseNoNotif();
                        XmPlayerService.getPlayerSrvice().setPlayStartCallback(null);
                    }
                    XmAdsManager.this.mAdsActive = true;
                    XmAdsManager.this.onDownloadCallBack(taskWrapper, filePath, true, iWordOfMouthIndex);
                    if (XmAdsManager.this.dataHandler != null) {
                        taskWrapper.playIndex = iWordOfMouthIndex;
                        XmAdsManager.this.dataHandler.upLoadAdsLog(taskWrapper);
                    }
                    return true;
                }
            };
            if (!new File(filePath).exists()) {
                if (iWordOfMouthIndex != 0) {
                }
                if (XmPlayerService.getPlayerSrvice() != null) {
                    XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                }
                this.mAdsActive = false;
                exitPlayAds(true, taskWrapper, true);
                return;
            }
            final boolean z7 = z2;
            final boolean z8 = z;
            final IDataCallBack iDataCallBack2 = new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.3
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    if (iWordOfMouthIndex == 0 || (z7 && !z8)) {
                        XmAdsManager.this.mAdsActive = false;
                        XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
                    }
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(@Nullable String str) {
                    if (XmAdsManager.this.mAdsFileCache.size() > 20) {
                        XmAdsManager xmAdsManager = XmAdsManager.this;
                        xmAdsManager.deleteAdsCacheFile((String) xmAdsManager.mAdsFileCache.remove(0));
                    }
                    XmAdsManager.this.mAdsFileCache.add(str);
                    if ((iWordOfMouthIndex == 0 || (z7 && !z8)) && !taskWrapper.cancel) {
                        if (XmPlayerService.getPlayerSrvice() != null) {
                            XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                        }
                        XmAdsManager.this.mAdsActive = false;
                        XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
                    }
                }
            };
            MyAsyncTask.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.4
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    XmAdsManager.this.downloadUrlHaveCallBack(soundUrl, iDataCallBack2);
                }
            });
            if (iWordOfMouthIndex != 0) {
                return;
            }
            if (z2) {
                return;
            }
        }
        if (z2) {
            advertis = taskWrapper.ads.getAdvertisList().get(0);
            if (advertis.getSoundType() == 11) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z3) {
                taskWrapper.tempCallBack = taskWrapper.callback;
                taskWrapper.callback = null;
            }
            if (z) {
            }
            if (z) {
                downloadAdsFile(taskWrapper, iWordOfMouthIndex);
            }
            if (z3) {
            }
        }
    }

    private void downloadFile(String str, String str2, @Nullable TaskWrapper taskWrapper) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection = HttpUrlUtil.getHttpURLConnection(FileUtilBase.reduceHttpsToHttp(this.mAppCtx, str), HttpUrlUtil.mConfig, "GET", new FreeFlowServiceUtil.ISetHttpUrlConnectAttribute() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.8
                        @Override // com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil.ISetHttpUrlConnectAttribute
                        public void setHttpUrlConnectAttributes(@NonNull HttpURLConnection httpURLConnection2) {
                            httpURLConnection2.setConnectTimeout(2000);
                            httpURLConnection2.setReadTimeout(1000);
                        }
                    });
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        List<IDataCallBack<String>> list = this.requestMap.get(str);
                        if (list != null && list.size() > 0) {
                            Iterator<IDataCallBack<String>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onError(0, "resCode == " + responseCode);
                            }
                        }
                        this.requestMap.remove(str);
                        return;
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[8192];
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2), false);
                    while (true) {
                        try {
                            int i = inputStream.read(bArr);
                            if (i <= 0) {
                                fileOutputStream2.flush();
                                List<IDataCallBack<String>> list2 = this.requestMap.get(str);
                                if (list2 != null && list2.size() > 0) {
                                    Iterator<IDataCallBack<String>> it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onSuccess(str2);
                                    }
                                }
                                this.requestMap.remove(str);
                                fileOutputStream2.close();
                                break;
                            }
                            if (taskWrapper != null && taskWrapper.cancel) {
                                List<IDataCallBack<String>> list3 = this.requestMap.get(str);
                                if (list3 != null && list3.size() > 0) {
                                    Iterator<IDataCallBack<String>> it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        it4.next().onError(0, "已取消");
                                    }
                                }
                                this.requestMap.remove(str);
                                try {
                                    fileOutputStream2.close();
                                    return;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            List<IDataCallBack<String>> list4 = this.requestMap.get(str);
                            if (list4 != null && list4.size() > 0) {
                                Iterator<IDataCallBack<String>> it5 = list4.iterator();
                                while (it5.hasNext()) {
                                    it5.next().onError(0, "错误了==" + e.getMessage());
                                }
                            }
                            this.requestMap.remove(str);
                            if (fileOutputStream == null) {
                                return;
                            } else {
                                fileOutputStream.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadUrlHaveCallBack(String str, IDataCallBack<String> iDataCallBack) throws Throwable {
        List<IDataCallBack<String>> list = this.requestMap.get(str);
        if (list != null && list.size() > 0) {
            list.add(iDataCallBack);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(iDataCallBack);
        this.requestMap.put(str, copyOnWriteArrayList);
        downloadFile(str, getFilePath(str), null);
    }

    private synchronized void getAdsInfoAndPlay(final TaskWrapper taskWrapper, int i, boolean z) {
        IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
        if (iXmAdsStatusListener != null && !z) {
            iXmAdsStatusListener.onStartGetAdsInfo();
        }
        Logger.logToSd("getAdsInfoAndPlay 0:" + System.currentTimeMillis());
        if (this.dataHandler == null) {
            this.mAdsActive = false;
            exitPlayAds(true, taskWrapper, true);
            Logger.logToSd("getAdsInfoAndPlay 1:" + System.currentTimeMillis());
            return;
        }
        Logger.logToSd("getAdsInfoAndPlay 2:" + System.currentTimeMillis());
        if (taskWrapper.track.getDataId() == this.lastRequestTrackId && this.mLastRequestAdList != null && System.currentTimeMillis() - this.lastRequestTime < 40000) {
            dataReceiver(this.mLastRequestAdList, taskWrapper);
            this.mLastRequestAdList = null;
            this.lastRequestTrackId = -1L;
            Logger.logToSd("getAdsInfoAndPlay 3:" + System.currentTimeMillis());
            return;
        }
        HashMap map = new HashMap();
        if (PlayableModel.isTrackKind(taskWrapper.track.getKind())) {
            map.put("trackId", "" + taskWrapper.track.getDataId());
        } else {
            map.put(OpenSdkPlayStatisticUpload.KEY_RADIO_ID, "" + taskWrapper.track.getRadioId());
            map.put("scheduleId", "" + taskWrapper.track.getDataId());
        }
        if (XmPlayerService.getPlayerSrvice() != null) {
            map.put("mode", XmPlayerService.getPlayerSrvice().isOnlineResource() ? "0" : "1");
        } else {
            map.put("mode", "0");
        }
        map.put("playMethod", String.valueOf(i));
        map.put(Advertis.FIELD_DURING_PLAY, z + "");
        this.dataHandler.cancleRequestTag(this.mLastRequestTag);
        Logger.logToSd("getAdsInfoAndPlay 4:" + System.currentTimeMillis());
        this.mLastRequestTag = this.dataHandler.getAdsData(taskWrapper.track, map, new IDataCallBack<AdvertisList>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.1
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i2, String str) {
                Logger.logToSd("getAdsInfoAndPlay 6:   " + i2 + "   " + str + "    " + System.currentTimeMillis());
                if (taskWrapper == XmAdsManager.this.mLastTask) {
                    XmAdsManager.this.mAdsActive = false;
                }
                XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(AdvertisList advertisList) {
                Logger.logToSd("getAdsInfoAndPlay 5:" + System.currentTimeMillis());
                XmAdsManager.this.dataReceiver(advertisList, taskWrapper);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFilePath(String str) {
        return FileUtilBase.getAdsCacheDir(this.mAppCtx, DigestUtils.md5Hex(str) + getSuffixFromUrl(str));
    }

    public static XmAdsManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new XmAdsManager(context);
                    removeOldAdFile(context);
                }
            }
        }
        return sInstance;
    }

    private static String getSuffixFromUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".")) {
            return null;
        }
        return str.substring(str.lastIndexOf("."), str.length());
    }

    private boolean isWordOfMouth(Advertis advertis) {
        return (advertis == null || !advertis.isWordOfMouth() || TextUtils.isEmpty(advertis.getSoundUrl())) ? false : true;
    }

    private void loadCachedAdsFile() {
        File file = new File(FileUtilBase.getAdsCacheDir(this.mAppCtx, ""));
        if (!file.exists()) {
            file.mkdirs();
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return;
        }
        this.mAdsFileCache.clear();
        this.mAdsFileCache.addAll(Arrays.asList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDownloadCallBack(final TaskWrapper taskWrapper, final String str, final boolean z, final int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onDownloadCallBackReal(taskWrapper, str, z, i);
        } else {
            if (new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.7
                @Override // java.lang.Runnable
                public void run() {
                    XmAdsManager.this.onDownloadCallBackReal(taskWrapper, str, z, i);
                }
            })) {
                return;
            }
            onDownloadCallBackReal(taskWrapper, str, z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDownloadCallBackReal(TaskWrapper taskWrapper, String str, boolean z, int i) {
        Logger.logToSd("downloadAdsFile onPostExecute 0:" + System.currentTimeMillis());
        if (exitPlayAds(taskWrapper.cancel, taskWrapper, false)) {
            Logger.logToSd("downloadAdsFile onPostExecute 1:" + System.currentTimeMillis());
            IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
            if (iXmAdsStatusListener != null) {
                iXmAdsStatusListener.onAdsStopBuffering();
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.mAdsFileCache.size() > 20) {
                deleteAdsCacheFile(this.mAdsFileCache.remove(0));
            }
            this.mAdsFileCache.add(str);
            Logger.logToSd("downloadAdsFile onPostExecute 3:" + System.currentTimeMillis());
            playAdsInternal(taskWrapper, z, i);
            return;
        }
        this.mAdsActive = false;
        Logger.logToSd("downloadAdsFile onPostExecute 2:" + System.currentTimeMillis());
        exitPlayAds(true, taskWrapper, true);
        IXmAdsStatusListener iXmAdsStatusListener2 = this.mListener;
        if (iXmAdsStatusListener2 != null) {
            iXmAdsStatusListener2.onAdsStopBuffering();
        }
    }

    private void playAdsInternal(final TaskWrapper taskWrapper, final boolean z, final int i) {
        Logger.logToSd("playAdsInternal 0:" + System.currentTimeMillis());
        if (exitPlayAds(taskWrapper.cancel, taskWrapper, false)) {
            IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
            if (iXmAdsStatusListener != null) {
                iXmAdsStatusListener.onAdsStopBuffering();
            }
            Logger.logToSd("playAdsInternal 1:" + System.currentTimeMillis());
            return;
        }
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            miniPlayer.stopPlay();
        } else {
            this.mAdsPlayer = new MiniPlayer();
        }
        this.mAdsPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                Logger.logToSd("playAd CompletionListener:" + System.currentTimeMillis());
                if (taskWrapper == XmAdsManager.this.mLastTask) {
                    XmAdsManager.this.mAdsPlayer.setOnCompletionListener(null);
                }
                if (!z && i >= 0 && XmPlayerService.getPlayerSrvice() != null) {
                    XmPlayerService.getPlayerSrvice().setPlayStartCallback(taskWrapper.mPlayStartCallBack);
                }
                XmAdsManager.this.mAdsActive = false;
                XmAdsManager.this.exitPlayAds(true, taskWrapper, true);
            }
        });
        Advertis advertis = taskWrapper.ads.getAdvertisList().get(0);
        if (z && taskWrapper.ads.getAdvertisList().size() > i) {
            advertis.setSoundUrl(taskWrapper.ads.getAdvertisList().get(i).getSoundUrl());
            advertis.setWordOfMouth(true);
        }
        String adsCacheDir = FileUtilBase.getAdsCacheDir(this.mAppCtx, DigestUtils.md5Hex(advertis.getSoundUrl()) + getSuffixFromUrl(advertis.getSoundUrl()));
        if (!new File(adsCacheDir).exists()) {
            this.mAdsActive = false;
            exitPlayAds(true, taskWrapper, true);
            Logger.logToSd("playAdsInternal 5:" + System.currentTimeMillis());
            return;
        }
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice != null && playerSrvice.isLossAudioFocus()) {
            playerSrvice.setLossAudioFocus(false);
            this.mAdsActive = false;
            exitPlayAds(true, taskWrapper, true);
            Logger.logToSd("playAdsInternal 2:" + System.currentTimeMillis());
            return;
        }
        try {
            this.mAdsPlayer.init(adsCacheDir, advertis);
            Logger.logToSd("playAdsInternal 3:" + System.currentTimeMillis());
            playAd();
        } catch (Exception e) {
            Logger.logToSd("playAdsInternal 4:" + System.currentTimeMillis());
            e.printStackTrace();
            IXmAdsStatusListener iXmAdsStatusListener2 = this.mListener;
            if (iXmAdsStatusListener2 != null) {
                iXmAdsStatusListener2.onError(0, 0);
            }
            this.mAdsActive = false;
            exitPlayAds(true, taskWrapper, true);
        }
    }

    private static void removeOldAdFile(Context context) {
        String str;
        if (context == null) {
            return;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/files/ads";
        } else {
            str = context.getFilesDir().getPath() + "/ads";
        }
        try {
            FileUtilBase.deleFileNoCheckDownloadFile(new File(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int wordOfMouthIndex(TaskWrapper taskWrapper) {
        AdvertisList advertisList;
        if (taskWrapper != null && (advertisList = taskWrapper.ads) != null && advertisList.getAdvertisList() != null && taskWrapper.ads.getAdvertisList().size() != 0) {
            List<Advertis> advertisList2 = taskWrapper.ads.getAdvertisList();
            for (int i = 0; i < advertisList2.size(); i++) {
                Advertis advertis = advertisList2.get(i);
                if (advertis != null && advertis.isWordOfMouth() && !TextUtils.isEmpty(advertis.getSoundUrl())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void exitPlayAds(boolean z) {
        TaskWrapper taskWrapper = this.mLastTask;
        if (taskWrapper != null) {
            PlayAdsCallback playAdsCallback = taskWrapper.callback;
            if (playAdsCallback != null) {
                playAdsCallback.onFinish(z);
            }
            stopCurrentAdPlay();
            IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
            if (iXmAdsStatusListener != null) {
                iXmAdsStatusListener.onCompletePlayAds();
            }
        }
    }

    public MiniPlayer getAdsPlayer() {
        return this.mAdsPlayer;
    }

    public TaskWrapper getLastTask() {
        return this.mLastTask;
    }

    public int getPlayerStatue() {
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            return miniPlayer.getStatus();
        }
        return 0;
    }

    public boolean isAdsActive() {
        return this.mAdsActive;
    }

    public boolean isAdsBuffering() {
        return this.mAdsActive && !isAdsPlaying();
    }

    public boolean isAdsPlaying() {
        MiniPlayer miniPlayer = this.mAdsPlayer;
        return miniPlayer != null && miniPlayer.isPlaying();
    }

    public boolean isLastIsDuringPlay() {
        return this.mLastIsDuringPlay;
    }

    public boolean isVideoAdType() {
        AdvertisList advertisList;
        TaskWrapper taskWrapper = this.mLastTask;
        return (taskWrapper == null || (advertisList = taskWrapper.ads) == null || advertisList.getAdvertisList() == null || this.mLastTask.ads.getAdvertisList().size() <= 0 || this.mLastTask.ads.getAdvertisList().get(0) == null || 11 != this.mLastTask.ads.getAdvertisList().get(0).getSoundType()) ? false : true;
    }

    public void onPlayProgress(int i, int i2) {
        IXmAdsDataHandle iXmAdsDataHandle = this.dataHandler;
        if (iXmAdsDataHandle != null) {
            iXmAdsDataHandle.onPlayProgress(i, i2);
        }
    }

    public void onVideoAdCompleted() {
        TaskWrapper taskWrapper = this.mLastTask;
        if (taskWrapper != null) {
            PlayAdsCallback playAdsCallback = taskWrapper.tempCallBack;
            if (playAdsCallback != null) {
                playAdsCallback.onFinish(true);
            }
            this.mAdsActive = false;
            if (wordOfMouthIndex(this.mLastTask) < 0) {
                stopCurrentAdPlay();
            } else {
                TaskWrapper taskWrapper2 = this.mLastTask;
                taskWrapper2.callback = taskWrapper2.tempCallBack;
                taskWrapper2.tempCallBack = null;
            }
            IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
            if (iXmAdsStatusListener != null) {
                iXmAdsStatusListener.onCompletePlayAds();
            }
        }
    }

    public synchronized void onlyStopPlayer() {
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            miniPlayer.stopPlay();
        }
        this.mAdsActive = false;
    }

    public void pauseAd() {
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            miniPlayer.pausePlay();
        }
    }

    public void playAd() {
        if (this.mAdsPlayer != null) {
            Logger.logToSd("playAd 0:" + System.currentTimeMillis());
            this.mAdsPlayer.startPlay();
            Advertis advertis = this.mAdsPlayer.getAdvertis();
            if (advertis != null) {
                advertis.setAdSoundTime(this.mAdsPlayer.getDuration());
                IXmAdsStatusListener iXmAdsStatusListener = this.mListener;
                if (iXmAdsStatusListener != null) {
                    iXmAdsStatusListener.onStartPlayAds(advertis, 0);
                }
            }
        }
    }

    public void playAds(Track track, int i, PlayAdsCallback playAdsCallback, boolean z) {
        if (!z) {
            stopCurrentAdPlay();
            this.mAdsActive = true;
        }
        TaskWrapper taskWrapper = new TaskWrapper();
        taskWrapper.track = track;
        taskWrapper.callback = playAdsCallback;
        this.mLastTask = taskWrapper;
        this.mLastIsDuringPlay = z;
        getAdsInfoAndPlay(taskWrapper, i, z);
    }

    public void release() {
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            miniPlayer.stopPlay();
        }
        TaskWrapper taskWrapper = this.mLastTask;
        if (taskWrapper != null) {
            taskWrapper.cancel = true;
        }
        this.mAdsActive = false;
        this.mAdsPlayer = null;
        this.mLastTask = null;
        this.mListener = null;
        IXmAdsDataHandle iXmAdsDataHandle = this.dataHandler;
        if (iXmAdsDataHandle != null) {
            iXmAdsDataHandle.release();
        }
    }

    public void setAdsDataHandlerClassName(String str) {
        Logger.logToSd("XmAdsManager ==  2 " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.dataHandler = (IXmAdsDataHandle) Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Logger.logToSd("XmAdsManager ==  3 " + this.dataHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAdsStatusListener(IXmAdsStatusListener iXmAdsStatusListener) {
        this.mListener = iXmAdsStatusListener;
    }

    public synchronized void stopCurrentAdPlay() {
        Logger.logToSd("stopCurrentAdPlay  " + this.mLastTask + "   " + Log.getStackTraceString(new Throwable()) + "  " + System.currentTimeMillis());
        TaskWrapper taskWrapper = this.mLastTask;
        if (taskWrapper != null) {
            taskWrapper.cancel = true;
            taskWrapper.callback = null;
            taskWrapper.tempCallBack = null;
            taskWrapper.mPlayStartCallBack = null;
            taskWrapper.playIndex = 0;
            if (XmPlayerService.getPlayerSrvice() != null) {
                XmPlayerService.getPlayerSrvice().setPlayStartCallback(null);
            }
        }
        MiniPlayer miniPlayer = this.mAdsPlayer;
        if (miniPlayer != null) {
            miniPlayer.stopPlay();
        }
        this.mAdsActive = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean exitPlayAds(boolean z, TaskWrapper taskWrapper, boolean z2) {
        Logger.logToSd("exitPlayAds cancel:" + z + " task:" + taskWrapper.track.toString() + " result:" + z2 + "  time:" + System.currentTimeMillis());
        if (!z) {
            return false;
        }
        if (taskWrapper == this.mLastTask) {
            if (this.mListener != null) {
                Logger.logToSd("exitPlayAds 0");
                this.mListener.onCompletePlayAds();
            }
            if (taskWrapper.callback != null) {
                Logger.logToSd("exitPlayAds 1");
                taskWrapper.callback.onFinish(z2);
            }
        }
        return true;
    }
}
