package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.param;

import android.view.View;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader;
import com.huawei.watchface.videoedit.param.ThumbnailViewConfig;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbnailData {
    public String filepath;
    public ThumbnailLoader.ThumbnailLoadListener listener;
    public int thumbnailHeight;
    public int thumbnailWidth;
    public int videoHeight;
    public int videoWidth;
    public View view;

    public ThumbnailData(ThumbnailLoader.ThumbnailLoadListener thumbnailLoadListener, View view, ThumbnailViewConfig thumbnailViewConfig, int i, int i2) {
        if (thumbnailLoadListener == null || view == null || thumbnailViewConfig == null) {
            return;
        }
        this.listener = thumbnailLoadListener;
        this.view = view;
        this.filepath = thumbnailViewConfig.getFilePath();
        this.videoWidth = thumbnailViewConfig.getVideoWidth();
        this.videoHeight = thumbnailViewConfig.getVideoHeight();
        this.thumbnailWidth = i;
        this.thumbnailHeight = i2;
    }

    public String toString() {
        return "ThumbnailData{view=" + this.view + ", listener=" + this.listener + ", filepath='" + this.filepath + "', videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", thumbnailWidth=" + this.thumbnailWidth + ", thumbnailHeight=" + this.thumbnailHeight + '}';
    }
}
