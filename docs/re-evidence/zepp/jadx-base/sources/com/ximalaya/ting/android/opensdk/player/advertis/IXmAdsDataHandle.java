package com.ximalaya.ting.android.opensdk.player.advertis;

import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmAdsDataHandle {
    void cancleRequestTag(String str);

    String getAdsData(Track track, Map<String, String> map, IDataCallBack<AdvertisList> iDataCallBack);

    void onPlayProgress(int i, int i2);

    void release();

    void upLoadAdsLog(XmAdsManager.TaskWrapper taskWrapper);
}
