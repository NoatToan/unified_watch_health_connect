package com.huawei.operation.h5pro.jsmodules.mediaCenter;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.vengine.H5ProNativeView;
import com.huawei.health.h5pro.vengine.H5ProViewControls;
import com.huawei.health.health.player.MiniBottomPlayer;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.health.musicservice.mediacenter.MediaCenterCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.R;
import defpackage.eyo;
import defpackage.gdy;
import defpackage.get;
import defpackage.qjb;
import health.compact.a.LogUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediaCenterH5Api extends JsBaseModule {
    private static final String KEY_DATE = "date";
    private static final String KEY_INDEX = "index";
    private static final String KEY_IS_AUTO_STOP = "isAutoStop";
    private static final String KEY_IS_REPLAY = "isReplay";
    private static final String KEY_MEDIA_ID = "mediaId";
    private static final String KEY_PLAY_STATUS = "playStatus";
    private static final String KEY_POSITION = "position";
    private static final String TAG = "MediaCenterH5Api";
    private H5ProViewControls mH5ProViewControls;
    private get mMediaCenter;
    private MiniBottomPlayer mMiniBottomPlayerForH5 = null;
    private String mMinibarTag;
    private H5PlayStatusSubscriber mPlayStatusSubscriber;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        LogUtil.b(TAG, "onCreate");
        this.mH5ProViewControls = getH5ProViewControls();
        this.mMediaCenter = get.c();
        H5PlayStatusSubscriber h5PlayStatusSubscriber = new H5PlayStatusSubscriber();
        this.mPlayStatusSubscriber = h5PlayStatusSubscriber;
        this.mMediaCenter.e(h5PlayStatusSubscriber);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b(TAG, "onDestroy");
        removeMinibar();
        this.mMediaCenter.a(this.mPlayStatusSubscriber);
        this.mH5ProViewControls = null;
        MiniBottomPlayer miniBottomPlayer = this.mMiniBottomPlayerForH5;
        if (miniBottomPlayer != null) {
            miniBottomPlayer.a();
            this.mMiniBottomPlayerForH5 = null;
        }
    }

    @JavascriptInterface
    public void init(final long j) {
        LogUtil.b(TAG, "init");
        this.mMediaCenter.e(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1615xb9247c79(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$init$0$com-huawei-operation-h5pro-jsmodules-mediaCenter-MediaCenterH5Api, reason: not valid java name */
    /* synthetic */ void m1615xb9247c79(long j, int i, Object obj) {
        LogUtil.b(TAG, "init result:", Integer.valueOf(i));
        if (i == 0) {
            onSuccessCallback(j);
        } else {
            onFailureCallback(j, (String) obj);
        }
    }

    @JavascriptInterface
    public void play(long j) {
        this.mMediaCenter.k();
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void pause(long j) {
        this.mMediaCenter.n();
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void stop(long j) {
        this.mMediaCenter.r();
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void seekToPosition(long j, long j2) {
        LogUtil.b(TAG, "seekToPosition position:", Long.valueOf(j2));
        this.mMediaCenter.b(j2);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void setPlayList(long j, String str) {
        LogUtil.b(TAG, "setPlayList list:", str);
        List<gdy> list = (List) new Gson().fromJson(str, new TypeToken<List<gdy>>() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api.1
        }.getType());
        if (CollectionUtils.a(list)) {
            onFailureCallback(j, "playList is empty");
        } else {
            this.mMediaCenter.a(list);
            onSuccessCallback(j);
        }
    }

    @JavascriptInterface
    public void getPlayList(long j) {
        String json;
        List<gdy> listG = this.mMediaCenter.g();
        if (CollectionUtils.a(listG)) {
            json = "";
        } else {
            json = new Gson().toJson(listG);
        }
        onSuccessCallback(j, json);
    }

    @JavascriptInterface
    public void getPlayStatus(long j) {
        LogUtil.b(TAG, "getPlayStatus");
        this.mPlayStatusSubscriber.setCallbackId(j);
        sendPlayStatusToH5(j);
    }

    @JavascriptInterface
    public void autoStop(long j, long j2) {
        LogUtil.b(TAG, "autoStop time:", Long.valueOf(j2));
        this.mMediaCenter.d(j2);
        onSuccessCallback(j, Long.valueOf(this.mMediaCenter.a()));
    }

    @JavascriptInterface
    public void setPlayMode(long j, String str) {
        LogUtil.b(TAG, "setPlayMode playMode:", str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "playMode is empty");
            return;
        }
        try {
            this.mMediaCenter.a(IAudioPlayer.PlayMode.valueOf(str));
            onSuccessCallback(j);
        } catch (IllegalArgumentException unused) {
            onFailureCallback(j, "playMode is invalid");
        }
    }

    @JavascriptInterface
    public void getPlayMode(long j) {
        onSuccessCallback(j, this.mMediaCenter.h().name());
    }

    @JavascriptInterface
    public void skipTo(long j, int i) {
        LogUtil.b(TAG, "skipTo index:", Integer.valueOf(i));
        this.mMediaCenter.d(i);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void cancelAutoStop(long j) {
        this.mMediaCenter.d();
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void getAutoStopTime(long j) {
        onSuccessCallback(j, Long.valueOf(this.mMediaCenter.a()));
    }

    @JavascriptInterface
    public void initMiniPlayer(long j) {
        LogUtil.b(TAG, "initMiniPlayer");
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.e(TAG, "isBrowseMode can not initMiniPlayer");
            return;
        }
        if (!(qjb.c().b() instanceof MiniBottomPlayer) && this.mMediaCenter.i() != 0) {
            LogUtil.b(TAG, "init native miniPlayer");
            qjb.c().c(new MiniBottomPlayer(BaseApplication.b()));
            qjb.c().d(true);
            MiniBottomPlayer miniBottomPlayer = this.mMiniBottomPlayerForH5;
            if (miniBottomPlayer != null) {
                miniBottomPlayer.a();
                this.mMiniBottomPlayerForH5 = null;
            }
            this.mMiniBottomPlayerForH5 = new MiniBottomPlayer(BaseApplication.b());
        }
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void showMiniPlayer(long j, String str) {
        LogUtil.b(TAG, "showMiniPlayer parameter: ", str);
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.e(TAG, "isBrowseMode can not showMiniPlayer");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("showMiniPlayer", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("showNativeMiniPlayer", true);
            int i = jSONObject.has("minibarBottomMargin") ? jSONObject.getInt("minibarBottomMargin") : 0;
            LogUtil.b(TAG, "showMiniPlayer : ", Boolean.valueOf(zOptBoolean));
            View viewB = qjb.c().b();
            if (zOptBoolean) {
                if ((this.mMediaCenter.i() == 3 || this.mMediaCenter.i() == 6) && viewB == null) {
                    qjb.c().c(new MiniBottomPlayer(BaseApplication.b()));
                    qjb.c().d(true);
                }
                if (viewB != null) {
                    if (this.mMiniBottomPlayerForH5 == null) {
                        this.mMiniBottomPlayerForH5 = new MiniBottomPlayer(BaseApplication.b());
                    }
                    addMinibarForH5(this.mMiniBottomPlayerForH5, i);
                    onSuccessCallback(j, Integer.valueOf(this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_48dp)));
                } else {
                    onSuccessCallback(j);
                }
            } else {
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaCenterH5Api.this.mMiniBottomPlayerForH5 != null) {
                            MediaCenterH5Api.this.mMiniBottomPlayerForH5.setVisibility(8);
                        }
                    }
                });
                onSuccessCallback(j);
            }
            if (zOptBoolean2) {
                return;
            }
            get.c().b();
            if (!(viewB instanceof MiniBottomPlayer)) {
                LogUtil.e(TAG, "remove minibar is null");
                return;
            }
            LogUtil.b(TAG, "close native minibar");
            ((MiniBottomPlayer) viewB).d();
            eyo.d().c();
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    @JavascriptInterface
    public void removeMinibarFromOldLayout(long j) {
        LogUtil.b(TAG, "removeMinibarFromOldLayout");
        removeMinibar();
        onSuccessCallback(j);
    }

    private void removeMinibar() {
        if (TextUtils.isEmpty(this.mMinibarTag) || this.mH5ProViewControls == null) {
            return;
        }
        LogUtil.b(TAG, "removeMinibar removeNativeView");
        this.mH5ProViewControls.removeNativeView(this.mMinibarTag);
        this.mMinibarTag = "";
    }

    private void addMinibarForH5(final MiniBottomPlayer miniBottomPlayer, int i) {
        final RelativeLayout.LayoutParams layoutParams;
        LogUtil.b(TAG, "addMinibarForH5");
        if (miniBottomPlayer == null) {
            LogUtil.e(TAG, "miniBottomPlayer is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = miniBottomPlayer.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(layoutParams2);
        }
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = i;
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api.3
            @Override // java.lang.Runnable
            public void run() {
                MiniBottomPlayer miniBottomPlayer2 = miniBottomPlayer;
                if (miniBottomPlayer2 == null) {
                    LogUtil.e(MediaCenterH5Api.TAG, "runOnUiThread miniBottomPlayer is null");
                    return;
                }
                miniBottomPlayer2.setLayoutParams(layoutParams);
                miniBottomPlayer.setVisibility(0);
                H5ProNativeView h5ProNativeView = new H5ProNativeView(miniBottomPlayer, null);
                if (MediaCenterH5Api.this.mH5ProViewControls != null) {
                    MediaCenterH5Api mediaCenterH5Api = MediaCenterH5Api.this;
                    mediaCenterH5Api.mMinibarTag = mediaCenterH5Api.mH5ProViewControls.showNativeView(h5ProNativeView);
                }
            }
        });
    }

    @JavascriptInterface
    public void setBusinessTag(long j, String str) {
        LogUtil.b(TAG, "setBusinessTag parameter : ", str);
        eyo.d().d(str);
        onSuccessCallback(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPlayStatusToH5(long j) {
        int iJ = this.mMediaCenter.j();
        List<gdy> listG = this.mMediaCenter.g();
        if (CollectionUtils.d(listG, iJ)) {
            onFailureCallback(j, "get current audio fail");
            return;
        }
        gdy gdyVar = listG.get(iJ);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(KEY_MEDIA_ID, this.mMediaCenter.f());
        jsonObject.addProperty(KEY_PLAY_STATUS, Integer.valueOf(this.mMediaCenter.i()));
        jsonObject.addProperty("date", gdyVar.d());
        jsonObject.addProperty("position", Long.valueOf(this.mMediaCenter.e()));
        jsonObject.addProperty(KEY_INDEX, Integer.valueOf(iJ));
        jsonObject.addProperty(KEY_IS_AUTO_STOP, Boolean.valueOf(this.mMediaCenter.o()));
        jsonObject.addProperty(KEY_IS_REPLAY, Boolean.valueOf(this.mMediaCenter.m()));
        String json = new Gson().toJson((JsonElement) jsonObject);
        onSuccessCallback(j, json);
        LogUtil.b(TAG, "sendPlayStatusToH5 ", json);
        if (this.mMediaCenter.m()) {
            this.mMediaCenter.b(false);
        }
    }

    public H5ProViewControls getH5ProViewControls() {
        if (this.mH5ProInstance == null) {
            LogUtil.d(TAG, "getH5ProViewControls failed, cause mH5ProInstance is null!");
            return null;
        }
        return this.mH5ProInstance.getViewControls();
    }

    @JavascriptInterface
    public boolean isNeedShowMobileDataDialog(String str) {
        LogUtil.b(TAG, "isNeedShowWifiDialog enter.");
        return this.mMediaCenter.b(str);
    }

    @JavascriptInterface
    public void checkMobileDataDialogBeforePlay(final long j, String str) {
        this.mMediaCenter.d(new MediaCenterCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api$$ExternalSyntheticLambda0
            @Override // com.huawei.health.musicservice.mediacenter.MediaCenterCallback
            public final void onResponse(int i, String str2) {
                this.f$0.m1614xcdd9027f(j, i, str2);
            }
        }, str);
    }

    /* JADX INFO: renamed from: lambda$checkMobileDataDialogBeforePlay$1$com-huawei-operation-h5pro-jsmodules-mediaCenter-MediaCenterH5Api, reason: not valid java name */
    /* synthetic */ void m1614xcdd9027f(long j, int i, String str) {
        LogUtil.b(TAG, "checkMobileDataDialogBeforePlay when play = ", Integer.valueOf(i));
        if (i == 0) {
            onSuccessCallback(j, "success");
        } else {
            onSuccessCallback(j, ParamConstants.CallbackMethod.ON_FAIL);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    class H5PlayStatusSubscriber extends get.a {
        private long mCallbackId;

        private H5PlayStatusSubscriber() {
        }

        public void setCallbackId(long j) {
            this.mCallbackId = j;
        }

        @Override // get.a
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            MediaCenterH5Api.this.sendPlayStatusToH5(this.mCallbackId);
        }

        @Override // get.a
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            MediaCenterH5Api.this.sendPlayStatusToH5(this.mCallbackId);
        }
    }
}
