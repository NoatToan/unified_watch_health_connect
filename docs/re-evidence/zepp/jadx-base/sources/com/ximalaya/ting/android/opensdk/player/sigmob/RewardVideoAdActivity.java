package com.ximalaya.ting.android.opensdk.player.sigmob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.ximalaya.ting.android.opensdk.R;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.PostResponse;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.xmlywind.windad.WindAdError;
import com.xmlywind.windad.WindAdOptions;
import com.xmlywind.windad.WindAds;
import com.xmlywind.windad.rewardedVideo.WindRewardAdRequest;
import com.xmlywind.windad.rewardedVideo.WindRewardInfo;
import com.xmlywind.windad.rewardedVideo.WindRewardedVideoAd;
import com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class RewardVideoAdActivity extends Activity {
    public static final String KEY_UNLOCK_TRACK_NUM = "key_unlock_track_num";
    private static final String TAG = "TranslucentActivity";
    private AlertDialog dialog;
    private Context mContext;
    private long unlockTrackNum = 3;
    private WindRewardedVideoAd windRewardedVideoAd;

    private void handlePopAdDialog() {
        if (this.dialog == null) {
            AlertDialog alertDialog = new AlertDialog(this);
            this.dialog = alertDialog;
            alertDialog.setMessageNoTitle("收听精彩内容前先看段小视频吧，完成观看可解锁" + this.unlockTrackNum + "条声音");
            this.dialog.setCancelable(false);
            this.dialog.setOnCommitClickListener(new View.OnClickListener() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new Handler().postDelayed(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HashMap<String, String> map = new HashMap<>();
                            map.put("ad_scene", "menu_1");
                            if (RewardVideoAdActivity.this.windRewardedVideoAd != null && RewardVideoAdActivity.this.windRewardedVideoAd.isReady()) {
                                RewardVideoAdActivity.this.windRewardedVideoAd.show(RewardVideoAdActivity.this, map);
                                return;
                            }
                            XmPlayerManager.getInstance(RewardVideoAdActivity.this.mContext).playRewardVideoSuccess();
                            if (ConstantsOpenSdk.isDebug) {
                                Log.i(RewardVideoAdActivity.TAG, "Ad is not Ready");
                            }
                            RewardVideoAdActivity.this.finish();
                        }
                    }, 500L);
                    HashMap map = new HashMap();
                    map.put("behavior_type", "3");
                    CommonRequest.postRewardVideoSdkTrace(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.2.2
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onError(int i, String str) {
                            Logger.log("点击确认广告提示弹窗 onError  " + str);
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onSuccess(PostResponse postResponse) {
                            if (postResponse == null || postResponse.getCode() != 0) {
                                return;
                            }
                            Logger.log("点击确认广告提示弹窗");
                        }
                    });
                    RewardVideoAdActivity.this.dialog.dismiss();
                }
            });
            this.dialog.setOnCancelClickListener(new View.OnClickListener() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RewardVideoAdActivity.this.dialog.dismiss();
                    HashMap map = new HashMap();
                    map.put("behavior_type", "2");
                    CommonRequest.postRewardVideoSdkTrace(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.3.1
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onError(int i, String str) {
                            Logger.log("点击取消广告提示弹窗 onError  " + str);
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onSuccess(PostResponse postResponse) {
                            if (postResponse == null || postResponse.getCode() != 0) {
                                return;
                            }
                            Logger.log("点击取消广告提示弹窗");
                        }
                    });
                    RewardVideoAdActivity.this.finish();
                }
            });
        }
        this.dialog.show();
        HashMap map = new HashMap();
        map.put("behavior_type", "1");
        CommonRequest.postRewardVideoSdkTrace(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.4
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
                Logger.log("展示广告提示弹窗 onError  " + str);
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(PostResponse postResponse) {
                if (postResponse == null || postResponse.getCode() != 0) {
                    return;
                }
                Logger.log("展示广告提示弹窗");
            }
        });
    }

    private void initSigmobAdSdk() {
        initSigmobSDK();
        try {
            this.windRewardedVideoAd = new WindRewardedVideoAd(this, new WindRewardAdRequest(CommonRequest.getInstanse().getSigmobRewardPlacementId(), "", null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.windRewardedVideoAd.setWindRewardedVideoAdListener(new WindRewardedVideoAdListener() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1
            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdClicked(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdClicked [ " + str + " ]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdClosed(final WindRewardInfo windRewardInfo, final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (windRewardInfo.isComplete()) {
                            Toast.makeText(RewardVideoAdActivity.this.mContext, "激励视频广告播放完毕，成功解锁" + RewardVideoAdActivity.this.unlockTrackNum + "条声音", 0).show();
                            XmPlayerManager.getInstance(RewardVideoAdActivity.this.mContext).playRewardVideoSuccess();
                            HashMap map = new HashMap();
                            map.put("behavior_type", "5");
                            CommonRequest.postRewardVideoSdkTrace(map, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.7.1
                                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                public void onError(int i, String str2) {
                                    Logger.log("广告完整播放窗 onError  " + str2);
                                }

                                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                public void onSuccess(PostResponse postResponse) {
                                    if (postResponse == null || postResponse.getCode() != 0) {
                                        return;
                                    }
                                    Logger.log("广告完整播放");
                                }
                            });
                            RewardVideoAdActivity.this.finish();
                        } else {
                            Toast.makeText(RewardVideoAdActivity.this.mContext, "激励视频广告关闭", 0).show();
                            HashMap map2 = new HashMap();
                            map2.put("behavior_type", "4");
                            CommonRequest.postRewardVideoSdkTrace(map2, new IDataCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.7.2
                                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                public void onError(int i, String str2) {
                                    Logger.log("广告展示 onError  " + str2);
                                }

                                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                public void onSuccess(PostResponse postResponse) {
                                    if (postResponse == null || postResponse.getCode() != 0) {
                                        return;
                                    }
                                    Logger.log("广告展示");
                                }
                            });
                            RewardVideoAdActivity.this.finish();
                        }
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdClosed() called with: info = [" + windRewardInfo + "], placementId = [" + str + "]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdLoadError(final WindAdError windAdError, final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdLoadError() called with: error = [" + windAdError + "], placementId = [" + str + "]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdLoadSuccess(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdLoadSuccess [ " + str + " ]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdPlayEnd(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdPlayEnd [ " + str + " ]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdPlayError(final WindAdError windAdError, final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdPlayError() called with: error = [" + windAdError + "], placementId = [" + str + "]");
                        }
                        RewardVideoAdActivity.this.finish();
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdPlayStart(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdPlayStart [ " + str + " ]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdPreLoadFail(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdPreLoadFail [ " + str + " ]");
                        }
                    }
                });
            }

            @Override // com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener
            public void onVideoAdPreLoadSuccess(final String str) {
                RewardVideoAdActivity.this.runOnUiThread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ConstantsOpenSdk.isDebug) {
                            Log.i(RewardVideoAdActivity.TAG, "onVideoAdPreLoadSuccess [ " + str + " ]");
                        }
                    }
                });
            }
        });
        WindRewardedVideoAd windRewardedVideoAd = this.windRewardedVideoAd;
        if (windRewardedVideoAd != null) {
            windRewardedVideoAd.loadAd();
        }
    }

    private void initSigmobSDK() {
        WindAds windAdsSharedAds = WindAds.sharedAds();
        windAdsSharedAds.setDebugEnable(false);
        try {
            windAdsSharedAds.startWithOptions(this, new WindAdOptions(CommonRequest.getInstanse().getSigmobAppId(), CommonRequest.getInstanse().getSigmobAppKey(), false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reward_video_ad);
        this.unlockTrackNum = getIntent().getLongExtra(KEY_UNLOCK_TRACK_NUM, 3L);
        this.mContext = this;
        initSigmobAdSdk();
        handlePopAdDialog();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WindRewardedVideoAd windRewardedVideoAd = this.windRewardedVideoAd;
        if (windRewardedVideoAd != null) {
            windRewardedVideoAd.destroy();
            this.windRewardedVideoAd = null;
        }
        AlertDialog alertDialog = this.dialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.dialog.cancel();
    }
}
