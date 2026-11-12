package com.ximalaya.ting.android.opensdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerConfig;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerException;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes22.dex */
public class OnPlayErrorRetryUtilForPlayProcess {
    public static long lastErrorTime;
    private static NetworkType.NetWorkType lastNetType;
    private static NetworkBroadcastReceiver mNetworkBroadcastReceiver;
    private static long[] mTrackRetryConunt = {0, 0};
    public static boolean isShowPlayError = false;

    public static class NetworkBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            NetworkType.NetWorkType netWorkType = NetworkType.getNetWorkType(context);
            if (OnPlayErrorRetryUtilForPlayProcess.lastNetType == netWorkType) {
                return;
            }
            NetworkType.NetWorkType unused = OnPlayErrorRetryUtilForPlayProcess.lastNetType = netWorkType;
            if (TextUtils.equals(action, ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION) && NetworkType.isConnectTONetWork(context) && OnPlayErrorRetryUtilForPlayProcess.isShowPlayError && System.currentTimeMillis() - OnPlayErrorRetryUtilForPlayProcess.lastErrorTime < 30000 && XmPlayerConfig.monitorNetWorkChangeAndTryPlay && XmPlayerService.getPlayerSrvice() != null) {
                XmPlayerService.getPlayerSrvice().startPlay();
            }
        }
    }

    public static boolean onPlayError(XmPlayerException xmPlayerException) {
        PlayableModel currPlayModel;
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || (currPlayModel = playerSrvice.getCurrPlayModel()) == null) {
            return false;
        }
        if (currPlayModel instanceof Track) {
            Track track = (Track) currPlayModel;
            if (!track.isFree() && !track.isPaid() && track.isHasSample()) {
                return false;
            }
        }
        if (mTrackRetryConunt[0] != currPlayModel.getDataId()) {
            mTrackRetryConunt[0] = currPlayModel.getDataId();
            mTrackRetryConunt[1] = 0;
        } else {
            long[] jArr = mTrackRetryConunt;
            jArr[1] = jArr[1] + 1;
        }
        if (!NetworkType.isConnectTONetWork(playerSrvice) || mTrackRetryConunt[1] >= 3) {
            isShowPlayError = true;
            lastErrorTime = System.currentTimeMillis();
            return false;
        }
        Logger.logToSd("TingLocalMediaService retryCount " + mTrackRetryConunt[1]);
        playerSrvice.startPlay();
        return true;
    }

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        try {
            if (mNetworkBroadcastReceiver == null) {
                mNetworkBroadcastReceiver = new NetworkBroadcastReceiver();
            }
            context.registerReceiver(mNetworkBroadcastReceiver, intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void resertPlayErrorSign() {
        isShowPlayError = false;
        lastErrorTime = 0L;
        long[] jArr = mTrackRetryConunt;
        jArr[0] = 0;
        jArr[1] = 0;
    }

    public static void unregister(Context context) {
        try {
            context.unregisterReceiver(mNetworkBroadcastReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
