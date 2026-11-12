package ohos.ace.plugin.recorderplugin;

import android.content.Context;
import android.media.MediaRecorder;
import android.util.Log;
import android.view.Surface;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class RecorderPlugin implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private static final String LOG_TAG = "RecorderPlugin";
    private Map<Long, MediaRecorder> mediaRecorderMap = new HashMap();

    protected native void nativeInit();

    protected native void nativeOnError(long j, int i, int i2);

    protected native void nativeOnInfo(long j, int i, int i2);

    public RecorderPlugin(Context context) {
        if (context == null) {
            Log.e(LOG_TAG, "context is null");
        } else {
            nativeInit();
        }
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        long mediaRecorderKey = getMediaRecorderKey(mediaRecorder);
        if (mediaRecorderKey != 0) {
            nativeOnError(mediaRecorderKey, i, i2);
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        long mediaRecorderKey = getMediaRecorderKey(mediaRecorder);
        if (mediaRecorderKey != 0) {
            nativeOnInfo(mediaRecorderKey, i, i2);
        }
    }

    public void createMediaRecorder(long j) {
        if (this.mediaRecorderMap.get(Long.valueOf(j)) != null) {
            Log.e(LOG_TAG, "createMediaRecorder mediaRecorder exist.");
            return;
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mediaRecorderMap.put(Long.valueOf(j), mediaRecorder);
        mediaRecorder.setOnErrorListener(this);
        mediaRecorder.setOnInfoListener(this);
    }

    public void releaseMediaRecorder(long j) {
        this.mediaRecorderMap.remove(Long.valueOf(j));
    }

    public void prepare(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            try {
                mediaRecorder.prepare();
            } catch (IOException e) {
                System.out.println("IOException exceptions: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void start(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.start();
        }
    }

    public void pause(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    public void resume(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    public void stop(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.stop();
        }
    }

    public void reset(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.reset();
        }
    }

    public void release(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
    }

    public void setVideoSize(long j, int i, int i2) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setVideoSize(i, i2);
        }
    }

    public void setVideoEncoder(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setVideoEncoder(i);
        }
    }

    public void setVideoEncodingBitRate(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setVideoEncodingBitRate(i);
        }
    }

    public void setVideoFrameRate(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setVideoFrameRate(i);
        }
    }

    public void setVideoSource(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setVideoSource(i);
        }
    }

    public Surface getSurface(long j) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            return mediaRecorder.getSurface();
        }
        return null;
    }

    public void setAudioSource(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setAudioSource(i);
        }
    }

    public void setAudioSamplingRate(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setAudioSamplingRate(i);
        }
    }

    public void setAudioEncodingBitRate(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setAudioEncodingBitRate(i);
        }
    }

    public void setAudioEncoder(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setAudioEncoder(i);
        }
    }

    public void setAudioChannels(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setAudioChannels(i);
        }
    }

    public void setOutputFormat(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setOutputFormat(i);
        }
    }

    public void setOutputFile(long j, String str) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            try {
                mediaRecorder.setOutputFile(new FileOutputStream(str).getFD());
            } catch (IOException e) {
                Log.e(LOG_TAG, "setOutputFile IOException:" + e.getMessage());
            }
        }
    }

    public void setLocation(long j, float f, float f2) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setLocation(f, f2);
        }
    }

    public void setOrientationHint(long j, int i) {
        MediaRecorder mediaRecorder = this.mediaRecorderMap.get(Long.valueOf(j));
        if (mediaRecorder != null) {
            mediaRecorder.setOrientationHint(i);
        }
    }

    private long getMediaRecorderKey(MediaRecorder mediaRecorder) {
        for (Long l : this.mediaRecorderMap.keySet()) {
            long jLongValue = l.longValue();
            if (this.mediaRecorderMap.get(l) == mediaRecorder) {
                return jLongValue;
            }
        }
        return 0L;
    }
}
