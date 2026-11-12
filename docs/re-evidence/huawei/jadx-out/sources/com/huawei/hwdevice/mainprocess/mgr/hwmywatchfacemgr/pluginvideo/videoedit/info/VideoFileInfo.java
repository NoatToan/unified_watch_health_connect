package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.info;

import android.media.MediaMetadataRetriever;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class VideoFileInfo extends MediaFileInfo {
    private static final int DEFAULT_VALUE = -1;
    private static final String TAG = "VideoFileInfo";
    public static final int TYPE_NORMAL = 0;
    private int mClipEndMs;
    private int mClipStartMs;
    private int mDurationMs;
    private boolean mIsClipChanged;
    private int mVideoType;

    public VideoFileInfo(String str) throws Throwable {
        super(str, 2);
        this.mClipStartMs = 0;
        this.mIsClipChanged = false;
        this.mVideoType = 0;
        scan(str);
        this.mClipEndMs = this.mDurationMs;
    }

    public VideoFileInfo(String str, int i, int i2) throws Throwable {
        super(str, 2);
        this.mIsClipChanged = false;
        this.mVideoType = 0;
        this.mClipStartMs = i;
        this.mClipEndMs = i2;
        scan(str);
    }

    public void setVideoType(int i) {
        this.mVideoType = i;
    }

    public int getVideoType() {
        return this.mVideoType;
    }

    public void setClipStart(int i) {
        this.mClipStartMs = i;
        setModify();
    }

    public void setClipEnd(int i) {
        this.mClipEndMs = i;
        setModify();
    }

    public void setClipChanged() {
        this.mIsClipChanged = true;
    }

    public boolean isClipChanged() {
        return this.mIsClipChanged;
    }

    public int getClipStartMs() {
        return this.mClipStartMs;
    }

    public int getClipEndMs() {
        return this.mClipEndMs;
    }

    public int getDurationMs() {
        return this.mDurationMs;
    }

    private void scan(String str) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    DfxGuard.getPolicy().onExtractVideo();
                    mediaMetadataRetriever.setDataSource(str);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    setWidth(Utils.parseIntSafely(strExtractMetadata, -1));
                    setHeight(Utils.parseIntSafely(strExtractMetadata2, -1));
                    int intSafely = Utils.parseIntSafely(mediaMetadataRetriever.extractMetadata(9), 0);
                    this.mDurationMs = intSafely;
                    if (intSafely == 0) {
                        LogUtil.e(TAG, "parse duration failed, mDurationMs is 0");
                    }
                    setRotation(Utils.parseIntSafely(mediaMetadataRetriever.extractMetadata(24), 0));
                    if (this.mClipStartMs < 0) {
                        this.mClipStartMs = 0;
                    }
                    if (this.mClipEndMs <= 0) {
                        this.mClipEndMs = this.mDurationMs;
                    }
                    Utils.release(mediaMetadataRetriever);
                } catch (RuntimeException unused) {
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    setDelete();
                    Utils.release(mediaMetadataRetriever2);
                } catch (Exception unused2) {
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    setDelete();
                    Utils.release(mediaMetadataRetriever2);
                } catch (Throwable th) {
                    th = th;
                    Utils.release(mediaMetadataRetriever);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever = null;
            }
        } catch (RuntimeException unused3) {
        } catch (Exception unused4) {
        }
    }

    public String toString() {
        return "video:" + getFilePath() + "[" + getClipStartMs() + "," + getClipEndMs() + "]";
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.info.MediaFileInfo
    public boolean equals(Object obj) {
        if (!(obj instanceof VideoFileInfo)) {
            return false;
        }
        VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
        return videoFileInfo.mClipEndMs == this.mClipEndMs && videoFileInfo.mClipStartMs == this.mClipStartMs && videoFileInfo.mDurationMs == this.mDurationMs && super.equals(obj);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.info.MediaFileInfo
    public int hashCode() {
        int iHashCode = super.hashCode();
        return (((((iHashCode * 31) + this.mClipEndMs) * 31) + this.mClipStartMs) * 31) + this.mDurationMs;
    }
}
