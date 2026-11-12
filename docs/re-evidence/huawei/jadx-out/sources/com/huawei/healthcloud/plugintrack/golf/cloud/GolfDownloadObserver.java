package com.huawei.healthcloud.plugintrack.golf.cloud;

import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseMapInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.HandshakeInfo;
import com.huawei.healthcloud.plugintrack.golf.device.CloudHelper;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes33.dex */
public class GolfDownloadObserver implements Observer {
    private static final String TAG = "GolfDownloadObserver";
    boolean isAnon;

    public GolfDownloadObserver(boolean z) {
        this.isAnon = z;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) throws Throwable {
        int messageId;
        GolfCourseMapInfo courseMapInfo;
        if (observable instanceof GolfDownloadObservable) {
            HandshakeInfo data = ((GolfDownloadObservable) observable).getData();
            if (data != null) {
                courseMapInfo = data.getCourseMapInfo();
                messageId = data.getMessageId();
            } else {
                ReleaseLogUtil.a(TAG, "handShakeInfo is null");
                messageId = -1;
                courseMapInfo = null;
            }
        } else {
            messageId = -1;
            courseMapInfo = null;
        }
        if (courseMapInfo == null) {
            ReleaseLogUtil.a(TAG, " mapInfo is null");
        } else if (messageId < 0) {
            GolfDeviceProxy.getInstance().sendPushCourseMapHandShake(courseMapInfo, CloudHelper.getVersion(courseMapInfo.getCourseId(), this.isAnon), 0);
        } else {
            GolfDeviceProxy.getInstance().sendMap(courseMapInfo, messageId);
        }
    }
}
