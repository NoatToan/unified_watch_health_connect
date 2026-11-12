package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class MMEdit {
    public static final ThumbnailInfo EOS = new ThumbnailInfo(null, -4);
    public static final int ERROR_OK = 0;
    private static final String TAG = "MMEdit";
    public static final int THREAD_STATUS_PROCESSING = 1;
    private Thumbnail mThumbnail;

    protected static int getJavaError(int i) {
        return -((-i) & 65535);
    }

    static {
        LogUtil.a(TAG, "mmedit slow eumui version = " + EmuiUtils.VERSION.EMUI_SDK_INT);
        LogUtil.a(TAG, "mmedit slow so unite version");
    }

    public MMEdit() {
        this.mThumbnail = null;
        this.mThumbnail = new Thumbnail();
    }

    public int initThumbnail(String str, int i, int i2) {
        if (str == null || i > 480 || i2 > 480 || i <= 0 || i2 <= 0) {
            LogUtil.e(TAG, "initThumbnail param error!");
            return -3;
        }
        LogUtil.a(TAG, "initThumbnail");
        return getJavaError(this.mThumbnail.initThumbnail(str, i, i2));
    }

    public int getThumbnailStatus() {
        return this.mThumbnail.getStatus();
    }

    public int startThumbnail(int[] iArr, int i, Thumbnail.ThumbnailReceiver thumbnailReceiver) {
        if (thumbnailReceiver == null) {
            LogUtil.e(TAG, "Receiver is null!");
            return -3;
        }
        if (i != 1 && i != 2) {
            LogUtil.e(TAG, "Thumbnail read mode ", Integer.valueOf(i), " illegal!");
            return -3;
        }
        return getJavaError(this.mThumbnail.startThumbnail(iArr, i, thumbnailReceiver));
    }

    public int destroyThumbnail() {
        return getJavaError(this.mThumbnail.destroyThumbnail());
    }
}
