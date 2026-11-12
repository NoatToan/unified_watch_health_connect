package com.ximalaya.ting.android.opensdk.player.statistic;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.httputil.BaseBuilder;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.model.PostResponse;
import com.ximalaya.ting.android.opensdk.model.history.XmPlayRecord;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.AsyncGson;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class OpenSdkPlayStatisticUpload implements IXmPlayStatisticUpload {
    private static final String ERROR_SHARE_PRE = "errorMsg";
    public static final String KEY_APP_ID = "appid";
    public static final String KEY_BUNDLE_ID = "bundleId";
    public static final String KEY_BUSINESS_TYPE = "business_type";
    public static final String KEY_CHANNEL_ID = "channel_id";
    public static final String KEY_CLIENT = "client";
    public static final String KEY_DEVICE_ID = "deviceId";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_NEW_RADIO_ID = "radio_id";
    public static final String KEY_NEW_TRACK_ID = "track_id";
    public static final String KEY_PLAYED_SECS = "played_secs";
    public static final String KEY_PLAY_SOURCE = "play_source";
    public static final String KEY_PLAY_TYPE = "play_type";
    public static final String KEY_PROGRAM_ID = "programId";

    @Deprecated
    public static final String KEY_RADIO_ID = "radioId";
    public static final String KEY_REC_SRC = "rec_src";
    public static final String KEY_REC_TRACK = "rec_track";
    public static final String KEY_SCHEDULE_ID = "programScheduleId";
    public static final String KEY_STARTED_AT = "started_at";

    @Deprecated
    public static final String KEY_TRACK_ID = "trackId";
    public static final String KEY_VERSION = "version";
    private static final int MAX_RETRY_COUNT = 3;
    public static final int SHARE_MODEL;
    private static OpenSdkPlayStatisticUpload sInstance;
    private LinkedList<Map<String, String>> errList = new LinkedList<>();
    private HandlerThread mWorker;
    private Handler mWorkerHandler;

    @Deprecated
    public class Task implements Runnable {
        private XmPlayRecord mListenRecord;
        private String mTrackUrl = "openapi/tracks/record";
        private String mRadioUrl = "openapi/live/record";
        private int mRetry = 0;

        public Task(XmPlayRecord xmPlayRecord) {
            this.mListenRecord = xmPlayRecord;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> map;
            String str;
            if (this.mListenRecord == null) {
                return;
            }
            this.mRetry++;
            String strString = null;
            try {
                map = CommonRequest.CommonParams(new HashMap());
            } catch (XimalayaException e) {
                e.printStackTrace();
                map = null;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            if (this.mListenRecord.isPlayTrack()) {
                str = DTransferConstants.PLAY_RECORD + this.mTrackUrl;
                map.put("trackId", "" + this.mListenRecord.getId());
                Logger.i("StatisticsManager", "uploadtrack");
            } else {
                str = DTransferConstants.PLAY_RECORD + this.mRadioUrl;
                map.put(OpenSdkPlayStatisticUpload.KEY_RADIO_ID, "" + this.mListenRecord.getId());
                Logger.i("StatisticsManager", "uploadradio");
            }
            map.put("played_secs", "" + this.mListenRecord.getPlayedSecs());
            map.put("duration", "" + this.mListenRecord.getDuration());
            map.put("started_at", "" + this.mListenRecord.getStartTime());
            try {
                strString = BaseCall.getInstanse().doSync(BaseBuilder.urlPost(str, map).build()).body().string();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            boolean z = false;
            if (!TextUtils.isEmpty(strString)) {
                try {
                    JSONObject jSONObject = new JSONObject(strString);
                    z = jSONObject.has(QQLogin.KEY_RESULT) && jSONObject.getInt(QQLogin.KEY_RESULT) == 0;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            if (z || this.mRetry >= 3) {
                return;
            }
            OpenSdkPlayStatisticUpload.this.mWorkerHandler.post(this);
        }
    }

    static {
        SHARE_MODEL = Build.VERSION.SDK_INT >= 24 ? 4 : 7;
    }

    private OpenSdkPlayStatisticUpload() {
        HandlerThread handlerThread = new HandlerThread("statistics-manager");
        this.mWorker = handlerThread;
        handlerThread.start();
        this.mWorkerHandler = new Handler(this.mWorker.getLooper());
        initRecordError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkHasLastRecordErr() {
        LinkedList<Map<String, String>> linkedList = this.errList;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        new AsyncGson().toJson(this.errList, new AsyncGson.IResult<String>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.8
            @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
            public void postException(Exception exc) {
            }

            @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
            public void postResult(String str) {
                CommonRequest.postTrackBatchsRecords(new HashMap<String, String>(str) { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.8.1
                    public final /* synthetic */ String val$result;

                    {
                        this.val$result = str;
                        put(DTransferConstants.TRACK_RECORDS, str);
                    }
                }, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.8.2
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i, String str2) {
                        Logger.log("postTrackSingleRecord onError  " + str2);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(PostResponse postResponse) {
                        if (postResponse == null || postResponse.getCode() != 0) {
                            return;
                        }
                        OpenSdkPlayStatisticUpload.this.apply(XmPlayerService.getPlayerSrvice().getSharedPreferences(OpenSdkPlayStatisticUpload.ERROR_SHARE_PRE, OpenSdkPlayStatisticUpload.SHARE_MODEL).edit().remove("errList"));
                        OpenSdkPlayStatisticUpload.this.errList.clear();
                    }
                });
            }
        });
    }

    public static OpenSdkPlayStatisticUpload getInstance() {
        if (sInstance == null) {
            synchronized (OpenSdkPlayStatisticUpload.class) {
                if (sInstance == null) {
                    sInstance = new OpenSdkPlayStatisticUpload();
                }
            }
        }
        return sInstance;
    }

    private void initRecordError() {
        if (XmPlayerService.getPlayerSrvice() != null) {
            final String string = XmPlayerService.getPlayerSrvice().getSharedPreferences(ERROR_SHARE_PRE, SHARE_MODEL).getString("errList", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            CommonRequest.postTrackBatchsRecords(new HashMap<String, String>(string) { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.4
                public final /* synthetic */ String val$errList;

                {
                    this.val$errList = string;
                    put(DTransferConstants.TRACK_RECORDS, string);
                }
            }, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.5
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    Logger.log("postTrackSingleRecord onError  " + str);
                    OpenSdkPlayStatisticUpload.this.onFirstError(string);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(PostResponse postResponse) {
                    if (postResponse == null || postResponse.getCode() != 0) {
                        OpenSdkPlayStatisticUpload.this.onFirstError(string);
                    } else {
                        OpenSdkPlayStatisticUpload.this.apply(XmPlayerService.getPlayerSrvice().getSharedPreferences(OpenSdkPlayStatisticUpload.ERROR_SHARE_PRE, OpenSdkPlayStatisticUpload.SHARE_MODEL).edit().remove("errList"));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstError(String str) {
        new AsyncGson().fromJson(str, new TypeToken<LinkedList<Map<String, String>>>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.6
        }.getType(), new AsyncGson.IResult<LinkedList<Map<String, String>>>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.7
            @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
            public void postException(Exception exc) {
                OpenSdkPlayStatisticUpload.this.apply(XmPlayerService.getPlayerSrvice().getSharedPreferences(OpenSdkPlayStatisticUpload.ERROR_SHARE_PRE, OpenSdkPlayStatisticUpload.SHARE_MODEL).edit().remove("errList"));
            }

            @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
            public void postResult(LinkedList<Map<String, String>> linkedList) {
                OpenSdkPlayStatisticUpload.this.errList = linkedList;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRecordError(Map<String, String> map) {
        this.errList.addLast(map);
        if (this.errList.size() > 200) {
            this.errList.removeFirst();
        }
        if (XmPlayerService.getPlayerSrvice() != null) {
            new AsyncGson().toJsonResultOnThread(this.errList, new AsyncGson.IResult<String>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.3
                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postException(Exception exc) {
                }

                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postResult(String str) {
                    OpenSdkPlayStatisticUpload.this.apply(XmPlayerService.getPlayerSrvice().getSharedPreferences(OpenSdkPlayStatisticUpload.ERROR_SHARE_PRE, OpenSdkPlayStatisticUpload.SHARE_MODEL).edit().putString("errList", str));
                }
            });
        }
    }

    @SuppressLint({"NewApi"})
    public void apply(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.statistic.IXmPlayStatisticUpload
    public void release() {
        synchronized (OpenSdkPlayStatisticUpload.class) {
            this.mWorkerHandler.removeCallbacksAndMessages(null);
            this.mWorker.quit();
            sInstance = null;
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.statistic.IXmPlayStatisticUpload
    public void upLoadData(final XmPlayRecord xmPlayRecord) {
        final HashMap map = new HashMap();
        if (xmPlayRecord.getId() < 0) {
            return;
        }
        if (xmPlayRecord.isPlayTrack()) {
            map.put("track_id", "" + xmPlayRecord.getId());
            Logger.i("StatisticsManager", "uploadtrack");
        } else {
            map.put("radio_id", "" + xmPlayRecord.getId());
            Logger.i("StatisticsManager", "uploadradio");
        }
        map.put("played_secs", "" + xmPlayRecord.getPlayedSecs());
        map.put("duration", "" + xmPlayRecord.getDuration());
        map.put("started_at", "" + xmPlayRecord.getStartTime());
        if (xmPlayRecord.getBusinessType() > 0) {
            map.put(KEY_BUSINESS_TYPE, xmPlayRecord.getBusinessType() + "");
        }
        if (xmPlayRecord.getBusinessType() == 2) {
            map.put(KEY_CHANNEL_ID, xmPlayRecord.getChannelId() + "");
        }
        map.put("play_type", "0");
        if (xmPlayRecord.isPlayTrack()) {
            CommonRequest.postTrackSingleRecord(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.1
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    if (xmPlayRecord.isLocalWifi()) {
                        OpenSdkPlayStatisticUpload.this.onRecordError(map);
                    }
                    Logger.log("postTrackSingleRecord onError  " + str);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(PostResponse postResponse) {
                    if (postResponse != null && postResponse.getCode() == 0) {
                        OpenSdkPlayStatisticUpload.this.checkHasLastRecordErr();
                        Logger.log("postTrackSingleRecord onSuccess");
                    } else if (xmPlayRecord.isLocalWifi()) {
                        OpenSdkPlayStatisticUpload.this.onRecordError(map);
                    }
                }
            });
        } else {
            CommonRequest.postLiveSingleRecord(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload.2
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    Logger.log("postLiveSingleRecord onError  " + str);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(PostResponse postResponse) {
                    if (postResponse == null || postResponse.getCode() != 0) {
                        return;
                    }
                    Logger.log("postLiveSingleRecord onSuccess");
                }
            });
        }
    }
}
