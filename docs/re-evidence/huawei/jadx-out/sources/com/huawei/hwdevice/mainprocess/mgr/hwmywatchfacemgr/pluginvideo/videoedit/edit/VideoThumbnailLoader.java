package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit;

import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.ThumbnailInfo;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class VideoThumbnailLoader extends ThumbnailLoader {
    private static final String TAG = "VideoThumbnailLoader";

    public VideoThumbnailLoader(Context context) {
        super(context);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader, com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.Thumbnail.ThumbnailReceiver
    public void onReceiveThumbnail(ThumbnailInfo thumbnailInfo) {
        if (!this.mIsHasInitialized || thumbnailInfo == null) {
            return;
        }
        LogUtil.b(TAG, "on Receive Thumbnail");
        Bitmap bitmap = thumbnailInfo.getBitmap();
        int timestamp = (int) thumbnailInfo.getTimestamp();
        if (bitmap == null || this.mThumbnailData == null) {
            return;
        }
        String strMakeUrl = makeUrl(this.mThumbnailData, timestamp);
        Bitmap bitmapResizeAndCropCenter = Utils.resizeAndCropCenter(bitmap, this.mThumbnailData.thumbnailWidth, this.mThumbnailData.thumbnailHeight, false);
        addBitmapToCache(timestamp, getImageCacheKey(strMakeUrl, getLoadContext(this.mThumbnailData.view).orElse(null)), bitmapResizeAndCropCenter);
        if (this.mThumbnailData.listener != null) {
            int[] iArr = new int[this.mThumbnailData.thumbnailWidth * this.mThumbnailData.thumbnailHeight];
            bitmapResizeAndCropCenter.getPixels(iArr, 0, this.mThumbnailData.thumbnailWidth, 0, 0, this.mThumbnailData.thumbnailWidth, this.mThumbnailData.thumbnailHeight);
            this.mThumbnailData.listener.onImagePixelsLoaded(iArr, this.mThumbnailData.filepath, this.mThumbnailData.thumbnailWidth, this.mThumbnailData.thumbnailHeight, timestamp);
        }
    }
}
