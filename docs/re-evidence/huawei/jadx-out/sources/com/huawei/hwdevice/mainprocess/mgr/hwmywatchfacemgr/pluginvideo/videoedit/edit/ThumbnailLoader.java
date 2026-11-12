package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.View;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.MMEdit;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.Thumbnail;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.ThumbnailInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.param.ThumbnailData;
import com.huawei.watchface.videoedit.sysc.Optional;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbnailLoader implements Thumbnail.ThumbnailReceiver {
    private static final int CACHE_SIZE = 10485760;
    private static final LruCache<String, Bitmap> S_HARD_BITMAP_CACHE = new LruCache<String, Bitmap>(CACHE_SIZE) { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            if (bitmap == null) {
                LogUtil.b(ThumbnailLoader.TAG, "sizeOf bitmap is null.");
                return 0;
            }
            return bitmap.getByteCount();
        }
    };
    private static final String TAG = "ThumbnailLoader";
    protected ThumbnailData mThumbnailData;
    protected MMEdit mThumbnailEdit = new MMEdit();
    protected boolean mIsHasInitialized = false;
    protected Map<Integer, String> mKeyToTime = new HashMap();

    public interface ThumbnailLoadListener {
        void onImagePixelsLoaded(Bitmap bitmap, String str, int i, int i2, int i3);

        void onImagePixelsLoaded(int[] iArr, String str, int i, int i2, int i3);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.Thumbnail.ThumbnailReceiver
    public void onReceiveThumbnail(ThumbnailInfo thumbnailInfo) {
    }

    public ThumbnailLoader(Context context) {
    }

    public void init(ThumbnailData thumbnailData) {
        this.mThumbnailData = thumbnailData;
        float f = (thumbnailData.videoWidth * 1.0f) / thumbnailData.videoHeight;
        int iRound = f > 1.0f ? 480 : Math.round(f * 480.0f);
        int iRound2 = f > 1.0f ? Math.round(480.0f / f) : 480;
        if (thumbnailData.filepath.isEmpty() || iRound <= 0 || iRound2 <= 0) {
            return;
        }
        this.mThumbnailEdit.destroyThumbnail();
        LogUtil.b(TAG, "init data.filepath = ", thumbnailData.filepath, "  width = ", Integer.valueOf(iRound), " height= ", Integer.valueOf(iRound2), " data =  ", thumbnailData.toString());
        if (this.mThumbnailEdit.initThumbnail(thumbnailData.filepath, iRound, iRound2) == 0) {
            this.mIsHasInitialized = true;
        }
    }

    public boolean isThumbnailSdkInitialized() {
        return this.mIsHasInitialized;
    }

    public boolean isCurrentThumbnailDecodeBusy() {
        return this.mThumbnailEdit.getThumbnailStatus() == 1;
    }

    public void startThumbnailsWithTimeArray(List<Integer> list) {
        if (list == null || list.isEmpty() || !this.mIsHasInitialized) {
            return;
        }
        LogUtil.c(TAG, "Thumbnail started");
        this.mThumbnailEdit.startThumbnail(Utils.convertToArray(list), 1, this);
    }

    public void releaseContext() {
        LogUtil.b(TAG, "releaseContext");
        this.mIsHasInitialized = false;
        this.mThumbnailEdit.destroyThumbnail();
        clearCache();
    }

    protected String makeUrl(ThumbnailData thumbnailData, int i) {
        return thumbnailData.filepath + thumbnailData.thumbnailWidth + thumbnailData.thumbnailHeight + i;
    }

    public int[] loadFromCache(ThumbnailData thumbnailData, int i) {
        String strMakeUrl = makeUrl(thumbnailData, i);
        if (!"".equals(strMakeUrl.trim())) {
            Bitmap bitmapOrElse = getBitmapFromCache(getImageCacheKey(strMakeUrl.replaceAll(" ", ""), getLoadContext(thumbnailData.view).orElse(null) != null ? getLoadContext(thumbnailData.view).orElse(null) : "")).orElse(null);
            if (bitmapOrElse != null) {
                int[] iArr = new int[thumbnailData.thumbnailWidth * thumbnailData.thumbnailHeight];
                int width = bitmapOrElse.getWidth();
                bitmapOrElse.getPixels(iArr, 0, width, 0, 0, width, bitmapOrElse.getHeight());
                return iArr;
            }
        }
        return null;
    }

    public Optional<Bitmap> loadFromCacheBitmap(int i) {
        String strMakeUrl = makeUrl(this.mThumbnailData, i);
        if ("".equals(strMakeUrl.trim())) {
            return Optional.empty();
        }
        return getBitmapFromCache(getImageCacheKey(strMakeUrl.replaceAll(" ", ""), getLoadContext(this.mThumbnailData.view).orElse(null) != null ? getLoadContext(this.mThumbnailData.view).orElse(null) : ""));
    }

    public void addBitmapToCache(int i, String str, Bitmap bitmap) {
        if (bitmap != null) {
            LruCache<String, Bitmap> lruCache = S_HARD_BITMAP_CACHE;
            synchronized (lruCache) {
                LogUtil.b(TAG, "addBitmapToCache The bitmap is initialized?");
                lruCache.put(str, bitmap);
                this.mKeyToTime.put(Integer.valueOf(i), str);
            }
        }
    }

    protected void removeBitmapFromCache(String str) {
        if (str != null) {
            LruCache<String, Bitmap> lruCache = S_HARD_BITMAP_CACHE;
            synchronized (lruCache) {
                lruCache.remove(str);
            }
        }
    }

    protected Optional<Bitmap> getBitmapFromCache(String str) {
        LruCache<String, Bitmap> lruCache = S_HARD_BITMAP_CACHE;
        synchronized (lruCache) {
            Bitmap bitmap = lruCache.get(str);
            if (bitmap != null) {
                return Optional.of(bitmap);
            }
            return Optional.empty();
        }
    }

    protected void clearCache() {
        LruCache<String, Bitmap> lruCache = S_HARD_BITMAP_CACHE;
        synchronized (lruCache) {
            lruCache.evictAll();
            this.mKeyToTime.clear();
        }
    }

    Optional<String> getLoadContext(View view) {
        if (view == null) {
            LogUtil.b(TAG, "getLoadContext imageView is null.");
            return Optional.empty();
        }
        return Optional.ofNullable(Integer.toHexString(view.getContext().hashCode()));
    }

    protected String getImageCacheKey(String str, String str2) {
        return str2 + str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x000f, B:10:0x0020, B:11:0x0026, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:17:0x0044), top: B:22:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0030 A[SYNTHETIC] */
    public void removeAll(List<Integer> list) {
        synchronized (S_HARD_BITMAP_CACHE) {
            if (list != null) {
                for (Integer num : list) {
                    num.intValue();
                    if (this.mKeyToTime.containsKey(num)) {
                        this.mKeyToTime.remove(num);
                    }
                }
                for (String str : this.mKeyToTime.values()) {
                    if (str != null) {
                        S_HARD_BITMAP_CACHE.remove(str);
                    }
                }
            } else {
                while (r4.hasNext()) {
                    if (str != null) {
                        S_HARD_BITMAP_CACHE.remove(str);
                    }
                }
            }
            throw th;
        }
    }
}
