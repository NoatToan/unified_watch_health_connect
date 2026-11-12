package ohos.ace.plugin.avmetadatahelperplugin;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class AVMetadataHelperPlugin {
    public static final int HELPER_CALL_DONE = 3;
    public static final int HELPER_IDLE = 1;
    public static final int HELPER_PREPARED = 2;
    public static final int HELPER_RELEASED = 4;
    public static final int HELPER_STATE_ERROR = 0;
    private static final String LOG_TAG = "AVMetadataHelperPlugin";
    private Map<Long, MediaMetadataRetriever> metadataRetrieverMap = new HashMap();
    private Map<Long, MediaDataSourceImpl> dataSourceMap = new HashMap();

    protected native void nativeInit();

    protected native void nativeOnStateChanged(long j, int i);

    protected native int nativeReadAt(long j, long j2, byte[] bArr, int i, int i2);

    public AVMetadataHelperPlugin(Context context) {
        if (context == null) {
            Log.e(LOG_TAG, "context is null");
        } else {
            nativeInit();
        }
    }

    public class MediaDataSourceImpl extends MediaDataSource {
        private long key;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        public MediaDataSourceImpl(long j) {
            this.key = j;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            return AVMetadataHelperPlugin.this.nativeReadAt(this.key, j, bArr, i, i2);
        }
    }

    class CallbackThread extends Thread {
        private long id;
        private int state;

        private CallbackThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AVMetadataHelperPlugin.this.nativeOnStateChanged(this.id, this.state);
        }

        public void setParams(long j, int i) {
            this.id = j;
            this.state = i;
        }
    }

    public void createMetadataRetriever(long j) {
        if (this.metadataRetrieverMap.get(Long.valueOf(j)) != null) {
            Log.e(LOG_TAG, "createMetadataRetriever metadataRetriever exist.");
            return;
        }
        this.metadataRetrieverMap.put(Long.valueOf(j), new MediaMetadataRetriever());
        notifyInfo(j, 1);
    }

    private void notifyInfo(long j, int i) {
        CallbackThread callbackThread = new CallbackThread();
        callbackThread.setParams(j, i);
        callbackThread.start();
    }

    public void releaseMetadataRetriever(long j) {
        this.metadataRetrieverMap.remove(Long.valueOf(j));
    }

    public void setDataSource(long j, String str, long j2, long j3) {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, setDataSource(fd).");
            return;
        }
        if (j3 <= 0) {
            try {
                j3 = new File(str).length();
            } catch (IOException e) {
                Log.e(LOG_TAG, "setDataSource IOException:" + e.getMessage());
                return;
            }
        }
        mediaMetadataRetriever.setDataSource(new FileInputStream(str).getFD(), j2, j3);
        notifyInfo(j, 2);
    }

    public void setDataSource(long j) {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, setDataSource(dataSource).");
            return;
        }
        MediaDataSourceImpl mediaDataSourceImpl = new MediaDataSourceImpl(j);
        this.dataSourceMap.put(Long.valueOf(j), mediaDataSourceImpl);
        mediaMetadataRetriever.setDataSource(mediaDataSourceImpl);
        notifyInfo(j, 2);
    }

    public String extractMetadata(long j, int i) {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, extractMetadata.");
            return "";
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i);
        return strExtractMetadata == null ? "" : strExtractMetadata;
    }

    public void extractMetadataDone(long j) {
        notifyInfo(j, 3);
    }

    public int getEmbeddedPictureSize(long j) {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, getEmbeddedPicture.");
            return -1;
        }
        byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
        if (embeddedPicture == null) {
            notifyInfo(j, 3);
            return -1;
        }
        return embeddedPicture.length;
    }

    public byte[] getEmbeddedPicture(long j) {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, getEmbeddedPicture.");
            return null;
        }
        notifyInfo(j, 3);
        return mediaMetadataRetriever.getEmbeddedPicture();
    }

    public void release(long j) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetrieverMap.get(Long.valueOf(j));
        if (mediaMetadataRetriever == null) {
            Log.e("LOG_TAG", "MediaMetadataRetriever is not created, release.");
        } else {
            mediaMetadataRetriever.release();
            notifyInfo(j, 4);
        }
    }
}
